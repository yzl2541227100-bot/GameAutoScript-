package cn.haorui.sdk.core.loader.concurrent;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.domain.SdkMonitor;
import cn.haorui.sdk.core.loader.AbstractC0497b;
import cn.haorui.sdk.core.loader.AdPlatformError;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.loader.cache.C0499a;
import cn.haorui.sdk.core.loader.cache.C0500b;
import cn.haorui.sdk.core.loader.cache.CacheManager;
import cn.haorui.sdk.core.loader.cache.InterfaceC0501c;
import cn.haorui.sdk.core.loader.loadbean.C0512a;
import cn.haorui.sdk.core.loader.strategy.C0515c;
import cn.haorui.sdk.core.loader.strategy.InterfaceC0513a;
import cn.haorui.sdk.core.p002ad.BaseAd;
import cn.haorui.sdk.core.p002ad.splash.SplashAd;
import cn.haorui.sdk.core.p002ad.splash.SplashAdLoader;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HRConstants;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ConCurrentManager implements InterfaceC0507a {
    private static final String TAG = "ConCurrentManager";
    private HRAdInfo HRAdInfo;
    private InterfaceC0508d adDelegate;
    private AbstractC0497b adLoader;
    private Context context;
    private List<List<C0512a>> groupList;
    private boolean isAdError;
    private boolean isAdFinished;
    private boolean loadCacheSuccess;
    private InterfaceC0513a loadStrategy;
    private Map<String, Object> localParams;
    private long startTime;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private List<C0499a> cacheList = new LinkedList();
    private List<C0512a> allList = new ArrayList();

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.concurrent.ConCurrentManager$a */
    public class C0502a implements InterfaceC0501c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0499a f113a;

        public C0502a(C0499a c0499a) {
            this.f113a = c0499a;
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.concurrent.ConCurrentManager$b */
    public class RunnableC0503b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f115a;

        public RunnableC0503b(Object obj) {
            this.f115a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConCurrentManager.this.handleSplashAd(this.f115a);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.concurrent.ConCurrentManager$c */
    public class RunnableC0504c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f117a;

        public RunnableC0504c(Object obj) {
            this.f117a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConCurrentManager.this.handleSplashAd(this.f117a);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.concurrent.ConCurrentManager$d */
    public class RunnableC0505d implements Runnable {
        public RunnableC0505d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConCurrentManager.this.handleLoadMeshu(true);
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.concurrent.ConCurrentManager$e */
    public class C0506e implements IConCurrentLoadListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f120a;

        public C0506e(boolean z) {
            this.f120a = z;
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onAdError(AdPlatformError adPlatformError, int i) {
            if (this.f120a || ConCurrentManager.this.adLoader.getLoaderListener() == null) {
                return;
            }
            LogUtil.m87e(ConCurrentManager.TAG, "AdSail___onAdError");
            ConCurrentManager.this.adLoader.getLoaderListener().onAdError();
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onAdLoaded(Object obj, int i) {
            if (this.f120a || ConCurrentManager.this.adLoader.getLoaderListener() == null) {
                return;
            }
            ConCurrentManager.this.adLoader.getLoaderListener().onAdLoaded(obj);
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onRenderFail(String str, int i, int i2) {
            if (this.f120a || ConCurrentManager.this.adLoader.getLoaderListener() == null) {
                return;
            }
            ConCurrentManager.this.adLoader.getLoaderListener().onAdRenderFail(str, i);
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onRenderSuccess(Object obj, int i) {
            if (!this.f120a) {
                if (ConCurrentManager.this.loadCacheSuccess) {
                    return;
                }
                ConCurrentManager.this.loadCacheSuccess = true;
                if (ConCurrentManager.this.loadStrategy != null) {
                    ((C0515c) ConCurrentManager.this.loadStrategy).f175o = true;
                }
                if (ConCurrentManager.this.adLoader.getLoaderListener() != null) {
                    ConCurrentManager.this.adLoader.getLoaderListener().onAdReady(obj);
                }
                ConCurrentManager.this.handleSplashAd(obj);
                return;
            }
            String cacheKey = ConCurrentManager.this.HRAdInfo.getCacheKey();
            ConCurrentManager.this.cacheList.clear();
            C0499a c0499a = new C0499a();
            c0499a.f112h = ConCurrentManager.this.HRAdInfo;
            c0499a.f108d = obj;
            c0499a.f105a = cacheKey;
            c0499a.f109e = true;
            c0499a.f110f = ConCurrentManager.this.HRAdInfo.getLoadedTime();
            c0499a.f111g = ConCurrentManager.this.HRAdInfo.getExpire_timestamp();
            SdkAdInfo sdkAdInfo = new SdkAdInfo();
            sdkAdInfo.setSdk(HRConstants.PLATFORM_HR);
            c0499a.f106b = sdkAdInfo;
            c0499a.f107c = ConCurrentManager.this.HRAdInfo.getCacheScore();
            ConCurrentManager.this.cacheList.add(c0499a);
            CacheManager.INSTANCE.handleCurrentList(cacheKey, ConCurrentManager.this.cacheList, ConCurrentManager.this.HRAdInfo.getCache());
        }
    }

    public ConCurrentManager(Context context, AbstractC0497b abstractC0497b, HRAdInfo hRAdInfo, Map<String, Object> map) {
        this.context = context;
        this.HRAdInfo = hRAdInfo;
        this.localParams = map;
        this.adLoader = abstractC0497b;
    }

    private int generateRandom8Num() {
        return (int) (((Math.random() * 9.0d) + 1.0d) * 1.0E7d);
    }

    private List<C0512a> getCacheList() {
        List<WeakReference<C0499a>> cacheListByKey;
        ArrayList arrayList = new ArrayList();
        try {
            String cacheKey = this.HRAdInfo.getCacheKey();
            if (this.HRAdInfo.getCache() > 0 && (cacheListByKey = CacheManager.INSTANCE.getCacheListByKey(cacheKey)) != null && cacheListByKey.size() > 0) {
                Iterator<WeakReference<C0499a>> it = cacheListByKey.iterator();
                while (it.hasNext()) {
                    C0499a c0499a = it.next().get();
                    if (c0499a.m38a()) {
                        C0512a c0512a = new C0512a();
                        c0512a.f152a = c0499a.f106b;
                        c0512a.f153b = c0499a.f108d;
                        c0512a.f157f = c0499a.f107c;
                        synchronized (c0512a) {
                            c0512a.f154c = 2;
                        }
                        c0512a.f158g = c0499a.f109e;
                        c0512a.f159h = true;
                        arrayList.add(c0512a);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    private List<List<C0512a>> getGroupList(SdkAdInfo[] sdkAdInfoArr, HRAdInfo hRAdInfo) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listAsList = Arrays.asList(sdkAdInfoArr);
        SdkMonitor sdk_monitor = hRAdInfo.getSdk_monitor();
        for (int i = 0; i < listAsList.size(); i++) {
            SdkAdInfo sdkAdInfo = (SdkAdInfo) listAsList.get(i);
            sdkAdInfo.setReq_uid(generateRandom8Num());
            if (sdk_monitor != null) {
                restoreMonitor(sdkAdInfo, sdk_monitor);
            }
            sdkAdInfo.setCache_req(sdkAdInfo.getReq());
            sdkAdInfo.setCache_clk(sdkAdInfo.getClk());
            sdkAdInfo.setCache_err(sdkAdInfo.getErr());
            sdkAdInfo.setCache_imp(sdkAdInfo.getImp());
            sdkAdInfo.setCache_rsp(sdkAdInfo.getRsp());
            replaceUUid(sdkAdInfo);
            sdkAdInfo.setFinalRsp(sdkAdInfo.getRsp());
            C0512a c0512a = new C0512a();
            c0512a.f152a = sdkAdInfo;
            c0512a.f156e = (1000 - sdkAdInfo.getPriority()) * 1000000;
            this.allList.add(c0512a);
            String group = sdkAdInfo.getGroup();
            if (TextUtils.isEmpty(group)) {
                group = "null_" + i;
            }
            if (linkedHashMap.containsKey(group)) {
                ((List) linkedHashMap.get(group)).add(c0512a);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c0512a);
                linkedHashMap.put(group, arrayList2);
            }
        }
        if (linkedHashMap.size() > 0) {
            arrayList.addAll(linkedHashMap.values());
        }
        return arrayList;
    }

    private boolean handleCache(SdkAdInfo[] sdkAdInfoArr, HRAdInfo hRAdInfo) {
        String cacheKey = hRAdInfo.getCacheKey();
        if (hRAdInfo.getCache() > 0) {
            CacheManager cacheManager = CacheManager.INSTANCE;
            if (cacheManager.getFirstEntity(cacheKey) != null) {
                cacheManager.getFirstEntity(cacheKey);
            }
            while (true) {
                CacheManager cacheManager2 = CacheManager.INSTANCE;
                if (cacheManager2.getCacheListByKey(cacheKey) == null || cacheManager2.getCacheListByKey(cacheKey).size() <= 0) {
                    break;
                }
                C0499a firstEntity = cacheManager2.getFirstEntity(cacheKey);
                if (firstEntity != null && firstEntity.m38a()) {
                    if (this.adDelegate != null && firstEntity.f107c <= hRAdInfo.getCacheScore()) {
                        this.isAdFinished = true;
                        hRAdInfo.setUsed(true);
                        handleLoadMeshu(false);
                        return true;
                    }
                    cacheManager2.removeFirstEntity(cacheKey);
                    loadCacheSuccess(firstEntity);
                    if (sdkAdInfoArr == null) {
                        handleLoadMeshu(true);
                        return true;
                    }
                }
            }
        } else {
            CacheManager.INSTANCE.remove(cacheKey);
        }
        return false;
    }

    public void handleLoadMeshu(boolean z) {
        if (this.adDelegate == null) {
            if (this.adLoader.getLoaderListener() == null || z || this.isAdError) {
                return;
            }
            this.isAdError = true;
            LogUtil.m87e(TAG, "no HR ad,load error");
            this.adLoader.getLoaderListener().onAdError();
            return;
        }
        String[] responUrl = this.HRAdInfo.getResponUrl();
        if (!z && responUrl != null && responUrl.length > 0) {
            LogUtil.m86d(TAG, "send onAdLoaded");
            for (String str : responUrl) {
                if (!TextUtils.isEmpty(str)) {
                    HttpUtil.asyncGetWithWebViewUA(this.context, MacroUtil.replaceExposureMacros(MacroUtil.replaceFinalLoadedMacros(str, System.currentTimeMillis() - this.adLoader.startLoadTime)), new DefaultHttpGetWithNoHandlerCallback());
                }
            }
        }
        this.adDelegate.setLocalParams(this.localParams);
        this.adDelegate.setConCurrentLoadListener(new C0506e(z));
        this.adDelegate.loadAd();
    }

    public void handleSplashAd(Object obj) {
        if ((obj instanceof SplashAd) && ((Boolean) this.localParams.get(SplashAdLoader.KEY_AUTO_SHOW)).booleanValue()) {
            AbstractC0497b abstractC0497b = this.adLoader;
            if (abstractC0497b instanceof SplashAdLoader) {
                ((SplashAd) obj).showAd(((SplashAdLoader) abstractC0497b).getAdContainer());
            }
        }
    }

    private void handleTimeout() {
        int fetchDelay;
        long all_timeout = this.HRAdInfo.getAll_timeout();
        AbstractC0497b abstractC0497b = this.adLoader;
        if (!(abstractC0497b instanceof SplashAdLoader) || (fetchDelay = ((SplashAdLoader) abstractC0497b).getFetchDelay()) < 0) {
            return;
        }
        long j = fetchDelay;
        if (j < all_timeout) {
            this.HRAdInfo.setAll_timeout(j);
        }
    }

    private synchronized void loadBigGroup() {
        List<List<C0512a>> list = this.groupList;
        if (list != null && list.size() != 0) {
            C0515c c0515c = new C0515c(this.adLoader, this.HRAdInfo);
            this.loadStrategy = c0515c;
            if (this.loadCacheSuccess) {
                c0515c.f175o = true;
            }
            c0515c.f169i = this;
            List<List<C0512a>> list2 = this.groupList;
            List<C0512a> list3 = this.allList;
            Map<String, Object> map = this.localParams;
            long j = this.startTime;
            c0515c.f166f = list3;
            c0515c.f167g = map;
            c0515c.f165e = list2;
            c0515c.f163c.clear();
            c0515c.f164d = 0;
            if (list2 != null && list2.size() != 0) {
                if (c0515c.f162b.isHasAdSailAd() && !c0515c.f162b.isUsed()) {
                    C0512a c0512a = new C0512a();
                    c0512a.f156e = (1000 - c0515c.f162b.getPriority()) * 1000000;
                    c0512a.f157f = c0515c.f162b.getCacheScore();
                    synchronized (c0512a) {
                        c0512a.f154c = 2;
                    }
                    c0512a.f158g = true;
                    c0515c.f166f.add(c0512a);
                }
                List<C0512a> list4 = list2.get(c0515c.f164d);
                c0515c.f171k = j;
                HRAdInfo hRAdInfo = c0515c.f162b;
                if (hRAdInfo != null) {
                    c0515c.f176p = hRAdInfo.getAll_timeout() <= 0 ? UMAmapConfig.AMAP_CACHE_WRITE_TIME : c0515c.f162b.getAll_timeout();
                }
                c0515c.m57a(list4);
            }
        }
    }

    private void loadCacheSuccess(C0499a c0499a) {
        String strReplaceExposureMacros;
        DefaultHttpGetWithNoHandlerCallback defaultHttpGetWithNoHandlerCallback;
        String strReplaceExposureMacros2;
        DefaultHttpGetWithNoHandlerCallback defaultHttpGetWithNoHandlerCallback2;
        String cache_imp;
        HRAdInfo hRAdInfo;
        String cache_clk;
        HRAdInfo hRAdInfo2;
        String cache_err;
        HRAdInfo hRAdInfo3;
        this.isAdFinished = true;
        this.loadCacheSuccess = true;
        Object obj = c0499a.f108d;
        C0500b c0500b = new C0500b();
        Context context = this.context;
        String req_id = this.HRAdInfo.getReq_id();
        long j = this.adLoader.startLoadTime;
        SdkMonitor sdk_monitor = this.HRAdInfo.getSdk_monitor();
        try {
            if (c0499a.f109e) {
                String[] responUrl = c0499a.f112h.getResponUrl();
                if (responUrl != null && responUrl.length > 0) {
                    for (String str : responUrl) {
                        if (!TextUtils.isEmpty(str)) {
                            HttpUtil.asyncGetWithWebViewUA(context, MacroUtil.replaceExposureMacros(MacroUtil.replaceFinalLoadedMacros(MacroUtil.replaceUUIDMacros(str, req_id, c0499a.f112h.getReq_id()), System.currentTimeMillis() - j)), new DefaultHttpGetWithNoHandlerCallback());
                        }
                    }
                }
                c0500b.m40a(c0499a.f112h.getMonitorUrl(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getClickUrl(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDn_active(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDn_inst_start(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDn_inst_succ(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDn_start(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDn_succ(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getErrorUrl(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_complete(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_mute(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_one_half(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_one_quarter(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_pause(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_replay(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_resume(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_start(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_three_quarter(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getVideo_unmute(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDp_fail(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDp_start(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getDp_succ(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getWx_fail(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getWx_start(), req_id, c0499a.f112h);
                c0500b.m40a(c0499a.f112h.getWx_succ(), req_id, c0499a.f112h);
            } else {
                if (sdk_monitor == null || TextUtils.isEmpty(sdk_monitor.getReq())) {
                    strReplaceExposureMacros = MacroUtil.replaceExposureMacros(MacroUtil.replaceUUIDMacros(c0499a.f106b.getCache_req(), req_id, c0499a.f112h.getReq_id()));
                    defaultHttpGetWithNoHandlerCallback = new DefaultHttpGetWithNoHandlerCallback();
                } else {
                    strReplaceExposureMacros = MacroUtil.replaceExposureMacros(MacroUtil.replaceUUIDMacros(c0500b.m39a(c0499a.f106b, sdk_monitor.getReq()), req_id, c0499a.f112h.getReq_id()));
                    defaultHttpGetWithNoHandlerCallback = new DefaultHttpGetWithNoHandlerCallback();
                }
                HttpUtil.asyncGetWithWebViewUA(context, strReplaceExposureMacros, defaultHttpGetWithNoHandlerCallback);
                if (sdk_monitor == null || TextUtils.isEmpty(sdk_monitor.getRsp())) {
                    HttpUtil.asyncGetWithWebViewUA(context, MacroUtil.replaceExposureMacros(MacroUtil.replaceUUIDMacros(c0499a.f106b.getCache_rsp(), req_id, c0499a.f112h.getReq_id())), new DefaultHttpGetWithNoHandlerCallback());
                    strReplaceExposureMacros2 = MacroUtil.replaceExposureMacros(MacroUtil.replaceFinalLoadedMacros(MacroUtil.replaceUUIDMacros(c0499a.f106b.getFinalRsp(), req_id, c0499a.f112h.getReq_id()), System.currentTimeMillis() - j));
                    defaultHttpGetWithNoHandlerCallback2 = new DefaultHttpGetWithNoHandlerCallback();
                } else {
                    String strM39a = c0500b.m39a(c0499a.f106b, sdk_monitor.getRsp().replace("__PRICE__", c0499a.f106b.get_price()).replace("__S__", c0499a.f106b.get_s()));
                    String strReplaceUUIDMacros = MacroUtil.replaceUUIDMacros(strM39a.replace("__PST__", c0499a.f106b.get_pst()), req_id, c0499a.f112h.getReq_id());
                    String strReplaceUUIDMacros2 = MacroUtil.replaceUUIDMacros(strM39a, req_id, c0499a.f112h.getReq_id());
                    HttpUtil.asyncGetWithWebViewUA(context, MacroUtil.replaceExposureMacros(strReplaceUUIDMacros), new DefaultHttpGetWithNoHandlerCallback());
                    strReplaceExposureMacros2 = MacroUtil.replaceExposureMacros(MacroUtil.replaceFinalLoadedMacros(strReplaceUUIDMacros2, System.currentTimeMillis() - j));
                    defaultHttpGetWithNoHandlerCallback2 = new DefaultHttpGetWithNoHandlerCallback();
                }
                HttpUtil.asyncGetWithWebViewUA(context, strReplaceExposureMacros2, defaultHttpGetWithNoHandlerCallback2);
                if (sdk_monitor == null || TextUtils.isEmpty(sdk_monitor.getImp())) {
                    cache_imp = c0499a.f106b.getCache_imp();
                    hRAdInfo = c0499a.f112h;
                } else {
                    cache_imp = c0500b.m39a(c0499a.f106b, sdk_monitor.getImp()).replace("__PRICE__", "ssp" + Base64.encodeToString(String.valueOf(c0499a.f106b.getEcpm() * 10).getBytes(), 2)).replace("__PRE__", "ssp" + Base64.encodeToString(String.valueOf(c0499a.f106b.getPre() * 10).getBytes(), 2));
                    hRAdInfo = c0499a.f112h;
                }
                c0499a.f106b.setImp(MacroUtil.replaceUUIDMacros(cache_imp, req_id, hRAdInfo.getReq_id()));
                if (sdk_monitor == null || TextUtils.isEmpty(sdk_monitor.getClk())) {
                    cache_clk = c0499a.f106b.getCache_clk();
                    hRAdInfo2 = c0499a.f112h;
                } else {
                    cache_clk = c0500b.m39a(c0499a.f106b, MacroUtil.replaceUUIDMacros(sdk_monitor.getClk().replace("__PRICE__", c0499a.f106b.get_price()).replace("__S__", c0499a.f106b.get_s()).replace("__PST__", c0499a.f106b.get_pst()).replace("__PRICE__", "ssp" + Base64.encodeToString(String.valueOf(c0499a.f106b.getPrice() * 10).getBytes(), 2)).replace("__PRE__", "ssp" + Base64.encodeToString(String.valueOf(c0499a.f106b.getPre() * 10).getBytes(), 2)), req_id, c0499a.f112h.getReq_id()));
                    hRAdInfo2 = c0499a.f112h;
                }
                c0499a.f106b.setClk(MacroUtil.replaceUUIDMacros(cache_clk, req_id, hRAdInfo2.getReq_id()));
                if (sdk_monitor == null || TextUtils.isEmpty(sdk_monitor.getErr())) {
                    cache_err = c0499a.f106b.getCache_err();
                    hRAdInfo3 = c0499a.f112h;
                } else {
                    String strReplace = sdk_monitor.getErr().replace("__PRICE__", c0499a.f106b.get_price()).replace("__S__", c0499a.f106b.get_s());
                    if (TextUtils.isEmpty(c0499a.f106b.get_err_pst())) {
                        strReplace = strReplace.replace("__PST__", c0499a.f106b.get_err_pst());
                    }
                    cache_err = c0500b.m39a(c0499a.f106b, strReplace);
                    hRAdInfo3 = c0499a.f112h;
                }
                c0499a.f106b.setErr(MacroUtil.replaceUUIDMacros(cache_err, req_id, hRAdInfo3.getReq_id()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.adLoader.getLoaderListener() != null) {
            this.adLoader.getLoaderListener().onAdLoaded(obj);
            this.adLoader.getLoaderListener().onAdReady(obj);
            if (obj instanceof BaseAd) {
                ((BaseAd) obj).setCacheAdListener(new C0502a(c0499a));
            }
            this.mHandler.post(new RunnableC0503b(obj));
        }
    }

    private String replaceMonitor(SdkAdInfo sdkAdInfo, String str) {
        String[] strArr = {"__ACCEPT_ID__", "__STRATEGY_DEALID__", "__ACCEPT_APPID__", "__ACCEPT_PID__", "__SDK__", "__GROUP_ID__", "__P__"};
        String[] strArr2 = new String[7];
        strArr2[0] = sdkAdInfo.getAccept_id() == null ? "" : sdkAdInfo.getAccept_id();
        strArr2[1] = sdkAdInfo.getStrategy_dealid() == null ? "" : sdkAdInfo.getStrategy_dealid();
        strArr2[2] = sdkAdInfo.getApp_id() == null ? "" : sdkAdInfo.getApp_id();
        strArr2[3] = sdkAdInfo.getPid() == null ? "" : sdkAdInfo.getPid();
        strArr2[4] = sdkAdInfo.getSdk() == null ? "" : sdkAdInfo.getSdk();
        strArr2[5] = sdkAdInfo.getGroup_id() != null ? sdkAdInfo.getGroup_id() : "";
        strArr2[6] = String.valueOf(sdkAdInfo.getPrice());
        return TextUtils.replace(str, strArr, strArr2).toString();
    }

    private void replaceUUid(SdkAdInfo sdkAdInfo) {
        sdkAdInfo.setReq(sdkAdInfo.getReq().replace("__UUID__", this.HRAdInfo.getReq_id()));
        sdkAdInfo.setRsp(sdkAdInfo.getRsp().replace("__UUID__", this.HRAdInfo.getReq_id()));
        sdkAdInfo.setClk(sdkAdInfo.getClk().replace("__UUID__", this.HRAdInfo.getReq_id()));
        sdkAdInfo.setErr(sdkAdInfo.getErr().replace("__UUID__", this.HRAdInfo.getReq_id()));
        sdkAdInfo.setImp(sdkAdInfo.getImp().replace("__UUID__", this.HRAdInfo.getReq_id()));
    }

    private void restoreMonitor(SdkAdInfo sdkAdInfo, SdkMonitor sdkMonitor) {
        if (sdkAdInfo == null || sdkMonitor == null) {
            return;
        }
        try {
            sdkAdInfo.getAccept_id();
            sdkAdInfo.getStrategy_dealid();
            String clk = sdkMonitor.getClk();
            String err = sdkMonitor.getErr();
            String imp = sdkMonitor.getImp();
            String req = sdkMonitor.getReq();
            String rsp = sdkMonitor.getRsp();
            if (imp.contains("__PRE__")) {
                imp = imp.replace("__PRE__", "ssp" + Base64.encodeToString(String.valueOf(sdkAdInfo.getPre() * 10).getBytes(), 2));
            }
            if (imp.contains("__PRICE__")) {
                imp = imp.replace("__PRICE__", "ssp" + Base64.encodeToString(String.valueOf(sdkAdInfo.getPrice() * 10).getBytes(), 2));
            }
            sdkAdInfo.setClk(replaceMonitor(sdkAdInfo, clk));
            sdkAdInfo.setErr(replaceMonitor(sdkAdInfo, err));
            sdkAdInfo.setImp(replaceMonitor(sdkAdInfo, imp));
            sdkAdInfo.setReq(replaceMonitor(sdkAdInfo, req));
            sdkAdInfo.setRsp(replaceMonitor(sdkAdInfo, rsp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // cn.haorui.sdk.core.loader.concurrent.InterfaceC0507a
    public void cacheApi() {
        this.mHandler.post(new RunnableC0505d());
    }

    public void destroy() {
        InterfaceC0513a interfaceC0513a = this.loadStrategy;
        if (interfaceC0513a != null) {
            C0515c c0515c = (C0515c) interfaceC0513a;
            Handler handler = c0515c.f170j;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ArrayList<InterfaceC0508d> arrayList = c0515c.f177q;
            if (arrayList != null && arrayList.size() > 0) {
                for (InterfaceC0508d interfaceC0508d : c0515c.f177q) {
                    if (interfaceC0508d != null) {
                        interfaceC0508d.destroy();
                    }
                }
                c0515c.f177q.clear();
            }
        }
        InterfaceC0508d interfaceC0508d2 = this.adDelegate;
        if (interfaceC0508d2 != null) {
            interfaceC0508d2.destroy();
        }
    }

    public synchronized void filterAd(SdkAdInfo[] sdkAdInfoArr, HRAdInfo hRAdInfo) {
        this.startTime = SystemClock.uptimeMillis();
        handleTimeout();
        this.groupList = getGroupList(sdkAdInfoArr, hRAdInfo);
        handleCache(sdkAdInfoArr, hRAdInfo);
        loadBigGroup();
    }

    public void loadMeshuAd() {
        if (handleCache(null, this.HRAdInfo)) {
            return;
        }
        handleLoadMeshu(false);
    }

    @Override // cn.haorui.sdk.core.loader.concurrent.InterfaceC0507a
    public void onAllError() {
        if (this.isAdFinished) {
            return;
        }
        this.isAdFinished = true;
        handleLoadMeshu(false);
    }

    @Override // cn.haorui.sdk.core.loader.concurrent.InterfaceC0507a
    public void onFinalAdLoaded(Object obj, SdkAdInfo sdkAdInfo) {
        if (this.isAdFinished) {
            return;
        }
        this.isAdFinished = true;
        HttpUtil.asyncGetWithWebViewUA(this.adLoader.getContext(), MacroUtil.replaceExposureMacros(MacroUtil.replaceFinalLoadedMacros(sdkAdInfo.getFinalRsp().replace("__TIMEOUT__", String.valueOf(0)), System.currentTimeMillis() - this.adLoader.startLoadTime)), new DefaultHttpGetWithNoHandlerCallback());
        if (this.adLoader.getLoaderListener() != null) {
            this.adLoader.getLoaderListener().onAdLoaded(obj);
        }
        if (this.loadCacheSuccess) {
            return;
        }
        this.mHandler.post(new RunnableC0504c(obj));
    }

    @Override // cn.haorui.sdk.core.loader.concurrent.InterfaceC0507a
    public void onRenderFail(String str) {
        if (this.adLoader.getLoaderListener() == null || this.loadCacheSuccess) {
            return;
        }
        LogUtil.m86d(TAG, "onRenderFail");
        this.adLoader.getLoaderListener().onAdRenderFail(str, -1);
    }

    @Override // cn.haorui.sdk.core.loader.concurrent.InterfaceC0507a
    public void onRenderSuccess(Object obj) {
        if (this.adLoader.getLoaderListener() == null || this.loadCacheSuccess) {
            return;
        }
        LogUtil.m86d(TAG, "onAdReady");
        this.adLoader.getLoaderListener().onAdReady(obj);
    }

    public void setAdDelegate(InterfaceC0508d interfaceC0508d) {
        this.adDelegate = interfaceC0508d;
    }
}
