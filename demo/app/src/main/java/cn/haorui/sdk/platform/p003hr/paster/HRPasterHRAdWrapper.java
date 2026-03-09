package cn.haorui.sdk.platform.p003hr.paster;

import android.text.TextUtils;
import android.view.ViewGroup;
import cn.haorui.sdk.adsail_ad.AdNative;
import cn.haorui.sdk.adsail_ad.nativ.INativeAdListener;
import cn.haorui.sdk.adsail_ad.nativ.NativeAdSlot;
import cn.haorui.sdk.core.p002ad.paster.PasterAdListener;
import cn.haorui.sdk.core.p002ad.paster.PasterAdLoader;
import cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import cn.haorui.sdk.core.utils.RecordUtil;
import cn.haorui.sdk.platform.p003hr.HRAdLoader;
import cn.haorui.sdk.platform.p003hr.HRPlatformError;

/* JADX INFO: loaded from: classes.dex */
public class HRPasterHRAdWrapper extends HRAdLoader<NativeAdSlot, PasterAdLoader, PasterAdListener> {
    private static final String TAG = "AdSailPasterAdWrapper";
    private AdNative adNative;
    private ViewGroup containerView;
    private boolean hasExposed;
    private boolean hasloaded;

    public HRPasterHRAdWrapper(PasterAdLoader pasterAdLoader, NativeAdSlot nativeAdSlot, ViewGroup viewGroup) {
        super(pasterAdLoader, nativeAdSlot);
        this.hasExposed = false;
        this.hasloaded = false;
        this.adNative = new AdNative(pasterAdLoader.getContext());
        this.containerView = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
    }

    @Override // cn.haorui.sdk.platform.p003hr.HRAdLoader, cn.haorui.sdk.platform.BasePlatformLoader, cn.haorui.sdk.core.loader.IAdLoader
    public void destroy() {
        super.destroy();
        clear();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.containerView = null;
        }
    }

    @Override // cn.haorui.sdk.core.loader.IAdLoader
    public void loadAd() {
        this.adNative.loadPasterAd((NativeAdSlot) this.adSlot, new INativeAdListener() { // from class: cn.haorui.sdk.platform.hr.paster.HRPasterHRAdWrapper.1
            private RecyclerAdMediaListener recyclerAdMediaListener = new RecyclerAdMediaListener() { // from class: cn.haorui.sdk.platform.hr.paster.HRPasterHRAdWrapper.1.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoCompleted() {
                    HRPasterHRAdWrapper.this.clear();
                    if (((PasterAdLoader) HRPasterHRAdWrapper.this.getAdLoader()).getLoaderListener() != null) {
                        ((PasterAdLoader) HRPasterHRAdWrapper.this.getAdLoader()).getLoaderListener().onVideoComplete();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoError() {
                    HRPasterHRAdWrapper.this.clear();
                    if (((PasterAdLoader) HRPasterHRAdWrapper.this.getAdLoader()).getLoaderListener() != null) {
                        ((PasterAdLoader) HRPasterHRAdWrapper.this.getAdLoader()).getLoaderListener().onVideoError();
                    }
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoLoaded() {
                    if (HRPasterHRAdWrapper.this.hasloaded) {
                        return;
                    }
                    HRPasterHRAdWrapper.this.hasloaded = true;
                    if (HRPasterHRAdWrapper.this.getLoaderListener() != 0) {
                        ((PasterAdListener) HRPasterHRAdWrapper.this.getLoaderListener()).onVideoLoaded();
                    }
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoPause() {
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoResume() {
                }

                @Override // cn.haorui.sdk.core.p002ad.recycler.RecyclerAdMediaListener
                public void onVideoStart() {
                }
            };

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADError(String str, Integer num) {
                if (((NativeAdSlot) HRPasterHRAdWrapper.this.adSlot).getErrorUrl() != null) {
                    HttpUtil.asyncGetErrorReport(((NativeAdSlot) HRPasterHRAdWrapper.this.adSlot).getErrorUrl()[0], num, str);
                }
                new HRPlatformError(str, num).post(((PasterAdLoader) HRPasterHRAdWrapper.this.getAdLoader()).getLoaderListener());
            }

            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onADExposure() {
                if (HRPasterHRAdWrapper.this.hasExposed) {
                    return;
                }
                RecordUtil.saveAction(HRPasterHRAdWrapper.this.getAdSlot().getPosId(), 3);
                String[] monitorUrl = HRPasterHRAdWrapper.this.getAdSlot().getMonitorUrl();
                if (monitorUrl != null) {
                    LogUtil.m86d(HRPasterHRAdWrapper.TAG, "send onADExposure");
                    for (String str : monitorUrl) {
                        if (!TextUtils.isEmpty(str)) {
                            HttpUtil.asyncGetWithWebViewUA(HRPasterHRAdWrapper.this.getContext(), MacroUtil.replaceExposureMacros(str), new DefaultHttpGetWithNoHandlerCallback());
                        }
                    }
                }
                if (HRPasterHRAdWrapper.this.getLoaderListener() != 0) {
                    ((PasterAdListener) HRPasterHRAdWrapper.this.getLoaderListener()).onAdExposure();
                }
                HRPasterHRAdWrapper.this.hasExposed = true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:5:0x0008 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:3:0x0002, B:8:0x0027, B:10:0x0036, B:12:0x0044, B:13:0x0055, B:16:0x005e, B:18:0x00d2, B:5:0x0008, B:7:0x0016), top: B:23:0x0002 }] */
            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onADLoaded(java.util.List<cn.haorui.sdk.adsail_ad.nativ.NativeAdData> r8) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.platform.p003hr.paster.HRPasterHRAdWrapper.C06231.onADLoaded(java.util.List):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cn.haorui.sdk.adsail_ad.IAdListener
            public void onAdRenderFail(String str, int i) {
                if (((NativeAdSlot) HRPasterHRAdWrapper.this.adSlot).getErrorUrl() != null) {
                    HttpUtil.asyncGetErrorReport(((NativeAdSlot) HRPasterHRAdWrapper.this.adSlot).getErrorUrl()[0], Integer.valueOf(i), str);
                }
                if (((PasterAdLoader) HRPasterHRAdWrapper.this.getAdLoader()).getLoaderListener() != null) {
                    ((PasterAdListener) HRPasterHRAdWrapper.this.getLoaderListener()).onAdPlatformError(new HRPlatformError(str, Integer.valueOf(i)));
                    ((PasterAdListener) HRPasterHRAdWrapper.this.getLoaderListener()).onAdRenderFail(str, i);
                }
            }
        });
    }
}
