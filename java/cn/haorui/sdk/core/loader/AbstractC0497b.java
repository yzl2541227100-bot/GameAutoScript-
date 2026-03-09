package cn.haorui.sdk.core.loader;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.exception.C0493a;
import cn.haorui.sdk.core.exception.C0495c;
import cn.haorui.sdk.core.loader.IAdLoadListener;
import cn.haorui.sdk.core.loader.concurrent.ConCurrentManager;
import cn.haorui.sdk.core.p002ad.AdType;
import cn.haorui.sdk.core.p002ad.banner.BannerAdLoader;
import cn.haorui.sdk.core.p002ad.draw.DrawAdLoader;
import cn.haorui.sdk.core.p002ad.fullscreenvideo.FullScreenVideoAdLoader;
import cn.haorui.sdk.core.p002ad.interstitial.InterstitialAdLoader;
import cn.haorui.sdk.core.p002ad.paster.PasterAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerMixAdLoader;
import cn.haorui.sdk.core.p002ad.reward.RewardVideoLoader;
import cn.haorui.sdk.core.p002ad.splash.SplashAdLoader;
import cn.haorui.sdk.core.utils.CacheUtil;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.GsonUtils;
import cn.haorui.sdk.core.utils.HRConstants;
import cn.haorui.sdk.core.utils.HRDebug;
import cn.haorui.sdk.core.utils.HttpGetJsonCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import cn.haorui.sdk.core.utils.OriginalResponse;
import cn.haorui.sdk.core.utils.RecordUtil;
import cn.haorui.sdk.core.utils.RequestUtil;
import cn.haorui.sdk.core.utils.SdkHandler;
import cn.haorui.sdk.core.utils.StringUtils;
import cn.haorui.sdk.platform.ADPlatformHelper;
import cn.haorui.sdk.platform.p003hr.HRPlatformError;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.umeng.commonsdk.proguard.C3471v;
import java.io.IOException;
import java.lang.Thread;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0497b<T extends IAdLoadListener> implements IAdLoader {
    private static final String TAG = "AdLoader";
    private static AtomicLong adCounter;
    private static Map<AdType, AtomicLong> adTypeCounter;
    private static String checkSupport;
    private static Map<String, String> hashParams;
    private static String[] queryParams;
    private Integer accept_ad_height;
    private Integer accept_ad_width;
    public Context context;
    private InterfaceC0508d current;
    private String eCPM = null;
    public T loaderListener;
    private ConCurrentManager loaderManager;
    public String posId;
    public long startLoadTime;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.b$a */
    public class a implements HttpGetJsonCallback<OriginalResponse> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map f96a;

        public a(Map map) {
            this.f96a = map;
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onFailure(@NotNull IOException iOException) {
            LogUtil.m87e(AbstractC0497b.TAG, "onFailure: " + iOException);
            AbstractC0497b.this.handleNoAd(iOException.toString());
        }

        @Override // cn.haorui.sdk.core.utils.HttpGetJsonCallback
        public void onResponse(OriginalResponse originalResponse) {
            OriginalResponse originalResponse2 = originalResponse;
            if (HRDebug.PRINT_LOAD_INFO) {
                LogUtil.m86d(AbstractC0497b.TAG, "first response, code:" + originalResponse2.getCode() + ", body: " + originalResponse2.getBody());
            }
            if (originalResponse2.getCode() == 200) {
                AbstractC0497b.this.onLoadSuccess(originalResponse2, this.f96a);
                return;
            }
            String strHeader = originalResponse2.header("Err_msg");
            String strDecode = !TextUtils.isEmpty(strHeader) ? URLDecoder.decode(strHeader, "UTF-8") : "";
            LogUtil.m86d(AbstractC0497b.TAG, "http code: " + originalResponse2.getCode() + ",errMsg=" + strDecode);
            AbstractC0497b.this.handleNoAd("错误码为：" + originalResponse2.getCode() + ",msg=" + strDecode);
            Integer num = C0493a.f86a;
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.b$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HRAdInfo f98a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f99b;

        public b(HRAdInfo hRAdInfo, Map map) {
            this.f98a = hRAdInfo;
            this.f99b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecordUtil.saveAction(AbstractC0497b.this.posId, 2);
            String[] rstUrl = this.f98a.getRstUrl();
            boolean z = false;
            if (rstUrl != null && rstUrl.length > 0) {
                for (String str : rstUrl) {
                    HttpUtil.asyncGetWithWebViewUA(AbstractC0497b.this.getContext(), MacroUtil.replaceExposureMacros(str), new DefaultHttpGetWithNoHandlerCallback());
                }
            }
            AbstractC0497b.this.handleDynamicClick(this.f98a);
            if (this.f98a.getMonitorUrl() != null && this.f98a.getMonitorUrl().length > 0 && ADPlatformHelper.checkTypeSupport(AbstractC0497b.this, HRConstants.PLATFORM_HR)) {
                this.f98a.setHasAdSailAd(true);
                AbstractC0497b.this.eCPM = String.valueOf(this.f98a.getEcpm());
                z = true;
            }
            AbstractC0497b abstractC0497b = AbstractC0497b.this;
            abstractC0497b.loaderManager = new ConCurrentManager(abstractC0497b.getContext(), AbstractC0497b.this, this.f98a, this.f99b);
            if (z) {
                if (this.f98a.getLayout() != null) {
                    CacheUtil.getInstance().putTemplateCache(AbstractC0497b.this.context, this.f98a.getLayout());
                }
                AbstractC0497b abstractC0497b2 = AbstractC0497b.this;
                AbstractC0497b.this.loaderManager.setAdDelegate(abstractC0497b2.createAdDelegate(abstractC0497b2.context, this.f98a));
            }
            AbstractC0497b abstractC0497b3 = AbstractC0497b.this;
            if (z) {
                abstractC0497b3.loaderManager.loadMeshuAd();
            } else {
                abstractC0497b3.handleNoAd("加载平台为空");
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.b$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f101a;

        public c(String str) {
            this.f101a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new HRPlatformError(this.f101a, C0493a.f89d).post(AbstractC0497b.this.loaderListener);
        }
    }

    static {
        HashMap map = new HashMap();
        hashParams = map;
        map.put("device_imei", "");
        adCounter = new AtomicLong();
        adTypeCounter = new HashMap();
        AdType[] adTypeArrValues = AdType.values();
        for (int i = 0; i < 10; i++) {
            adTypeCounter.put(adTypeArrValues[i], new AtomicLong());
        }
        queryParams = new String[]{"app_id", C1485b.f6981aB, "accept_ad_type", "sdk_version", "sdk_version_code", "device_os"};
    }

    public AbstractC0497b(Context context, String str, T t) {
        this.context = context;
        this.posId = str;
        this.loaderListener = t;
    }

    private Map<String, String> generateParams(Map<String, String> map) {
        Integer num = this.accept_ad_width;
        if (num != null && num.intValue() >= 0) {
            map.put("accept_ad_width", this.accept_ad_width + "");
        }
        Integer num2 = this.accept_ad_height;
        if (num2 != null && num2.intValue() >= 0) {
            map.put("accept_ad_height", this.accept_ad_height + "");
        }
        return map;
    }

    public void handleDynamicClick(HRAdInfo hRAdInfo) {
        if ((hRAdInfo.getAct_type() & 8) == 8 && "false".equals(isSupportTurn())) {
            hRAdInfo.setAct_type(2);
        }
        HRAdInfo.DClickData dclk = hRAdInfo.getDclk();
        if (dclk != null) {
            int power = dclk.getPower();
            if (dclk.getPtime() <= 0 || power >= hRAdInfo.getPower_index()) {
                return;
            }
            RecordUtil.isCanDynamicClick = true;
            RecordUtil.dynamicPower = power;
            RecordUtil.saveAction(hRAdInfo.getPid(), 6);
        }
    }

    public static String isSupportTurn() {
        if (TextUtils.isEmpty(checkSupport) && AdSdk.getContext() != null) {
            checkSupport = ((SensorManager) AdSdk.getContext().getSystemService(C3471v.f18942W)).getDefaultSensor(4) != null ? "true" : "false";
        }
        return checkSupport;
    }

    private void loadAd(HRAdInfo hRAdInfo, Map<String, Object> map) {
        SdkHandler.getInstance().runOnUiThread(new b(hRAdInfo, map));
    }

    public void onLoadSuccess(OriginalResponse originalResponse, Map<String, Object> map) {
        try {
            HRAdInfo hRAdInfo = (HRAdInfo) GsonUtils.gson.fromJson(originalResponse.getBody(), HRAdInfo.class);
            hRAdInfo.setLoadedTime(SystemClock.uptimeMillis());
            loadAd(hRAdInfo, map);
        } catch (Exception e) {
            e.printStackTrace();
            handleNoAd(e.toString());
        }
    }

    private Map<String, String> wrapParams(Map<String, String> map) {
        try {
            String hexString = Long.toHexString(((System.currentTimeMillis() / 3) * 3) + 1);
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (hashParams.containsKey(entry.getKey())) {
                    try {
                        value = StringUtils.byte2hex(MessageDigest.getInstance("MD5").digest(value.getBytes())).toLowerCase();
                    } catch (Exception unused) {
                    }
                }
                if (!C1485b.f6981aB.equals(entry.getKey())) {
                    jSONObject.put(entry.getKey(), value);
                    arrayList.add(entry.getKey() + "=" + value);
                }
            }
            arrayList.add("5317f4377245bfb8efdc42c45d71bd43");
            arrayList.add(hexString);
            Collections.sort(arrayList);
            HashMap map2 = new HashMap();
            map2.put("message", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            map2.put("nonce", hexString);
            map2.put("signature", Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(TextUtils.join("&", arrayList).getBytes()), 2));
            try {
                for (Map.Entry<String, String> entry2 : C0498c.m36a(map).entrySet()) {
                    map2.put(entry2.getKey(), entry2.getValue());
                }
            } catch (Exception unused2) {
            }
            return map2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract InterfaceC0508d createAdDelegate(Context context, HRAdInfo hRAdInfo);

    public abstract InterfaceC0508d createDelegate(SdkAdInfo sdkAdInfo, HRAdInfo hRAdInfo);

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public void destroy() {
        ConCurrentManager conCurrentManager = this.loaderManager;
        if (conCurrentManager != null) {
            conCurrentManager.destroy();
        }
    }

    public void destroyCurrent() {
        InterfaceC0508d interfaceC0508d = this.current;
        if (interfaceC0508d != null) {
            interfaceC0508d.destroy();
        }
    }

    public final String eCPM() {
        return this.eCPM;
    }

    public Integer getAccept_ad_height() {
        return this.accept_ad_height;
    }

    public Integer getAccept_ad_width() {
        return this.accept_ad_width;
    }

    public AdType getAdType() {
        boolean z = this instanceof RecyclerAdLoader;
        if (z && ((RecyclerAdLoader) this).getAdPatternType() == 1) {
            return AdType.FEED;
        }
        if (z && ((RecyclerAdLoader) this).getAdPatternType() == 100000) {
            return AdType.FEED_PRE_RENDER;
        }
        if ((this instanceof RecyclerMixAdLoader) && ((RecyclerMixAdLoader) this).getAdPatternType() == 200000) {
            return AdType.FEED_MIX;
        }
        if (this instanceof BannerAdLoader) {
            return AdType.BANNER;
        }
        if (this instanceof SplashAdLoader) {
            return AdType.SPLASH;
        }
        if (this instanceof InterstitialAdLoader) {
            return AdType.INTERSTITIAL;
        }
        if (this instanceof PasterAdLoader) {
            return AdType.PASTER;
        }
        if (this instanceof RewardVideoLoader) {
            return AdType.REWARD;
        }
        if (this instanceof DrawAdLoader) {
            return AdType.DRAW;
        }
        if (this instanceof FullScreenVideoAdLoader) {
            return AdType.FULL_SCREEN_VIDEO;
        }
        return null;
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public Context getContext() {
        return this.context;
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public T getLoaderListener() {
        return this.loaderListener;
    }

    public String getPosId() {
        return this.posId;
    }

    public void handleNoAd(String str) {
        try {
            if (this.loaderListener != null) {
                SdkHandler.getInstance().runOnUiThread(new c(str));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public void loadAd() {
        loadAd(new HashMap());
    }

    public void loadAd(Map<String, Object> map) {
        try {
            this.startLoadTime = System.currentTimeMillis();
            this.eCPM = null;
            if (TextUtils.isEmpty(this.posId)) {
                LogUtil.m87e(TAG, "pid不能为空！");
                handleNoAd("pid不能为空！");
                return;
            }
            AdType adType = getAdType();
            if (adType == null) {
                LogUtil.m87e(TAG, "AdType is null！");
                handleNoAd("AdType is null！");
                return;
            }
            Map<String, String> mapGenerateParams = generateParams(RequestUtil.wrapParams(this.context, this.posId, adType, adCounter.incrementAndGet(), adTypeCounter.get(adType).incrementAndGet()));
            HashMap map2 = new HashMap();
            map2.put("Content-Type", "application/x-www-form-urlencoded");
            Map<String, String> mapWrapParams = wrapParams(mapGenerateParams);
            HashMap map3 = new HashMap();
            for (String str : queryParams) {
                String str2 = mapGenerateParams.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    map3.put(str, str2);
                }
            }
            RecordUtil.saveAction(this.posId, 1);
            HttpUtil.asyncRequestJson(AdSdk.adConfig().isTest() ? HRConstants.HR_URL_TEST : HRConstants.HR_URL_PROD, map3, mapWrapParams, map2, new a(map));
            Context context = AdSdk.getContext();
            boolean zIsTest = AdSdk.adConfig().isTest();
            if (C0495c.f92b) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler instanceof C0495c.a) {
                    return;
                }
                Thread.setDefaultUncaughtExceptionHandler(new C0495c.a(context, zIsTest, defaultUncaughtExceptionHandler));
            }
        } catch (Exception e) {
            e.printStackTrace();
            handleNoAd(e.toString());
        }
    }

    public void setAdSize(Integer num, Integer num2) {
        this.accept_ad_width = num;
        this.accept_ad_height = num2;
    }

    public void setCurrent(InterfaceC0508d interfaceC0508d) {
        this.current = interfaceC0508d;
    }
}
