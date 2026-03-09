package com.anythink.core.common.p055f.p056a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATCustomVideo;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATAdvertiserInfoOperate;
import com.anythink.core.basead.p044b.C1120b;
import com.anythink.core.common.p051b.InterfaceC1173l;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.p072d.C1396f;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.f.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1207e extends BaseAd implements InterfaceC1203a, Serializable {

    /* JADX INFO: renamed from: a */
    private int f3704a;

    /* JADX INFO: renamed from: b */
    private int f3705b;

    /* JADX INFO: renamed from: c */
    private int f3706c;

    /* JADX INFO: renamed from: d */
    private int f3707d;

    /* JADX INFO: renamed from: e */
    private int f3708e;

    /* JADX INFO: renamed from: f */
    private BaseAd f3709f;

    /* JADX INFO: renamed from: g */
    private Map<String, Object> f3710g;

    public C1207e(BaseAd baseAd, Map<String, Object> map) {
        this.f3704a = 1;
        this.f3705b = 5;
        this.f3706c = 1;
        this.f3708e = 5;
        this.f3709f = baseAd;
        this.f3710g = map;
        Object obj = map.get("orientation");
        if (obj != null) {
            this.f3704a = Integer.parseInt(obj.toString());
        }
        Object obj2 = map.get(C1485b.f7175dk);
        if (obj2 != null) {
            this.f3705b = Integer.parseInt(obj2.toString());
        }
        Object obj3 = map.get("allows_skip");
        if (obj3 != null) {
            this.f3706c = Integer.parseInt(obj3.toString());
        }
        Object obj4 = map.get("button_type");
        if (obj4 != null) {
            this.f3707d = Integer.parseInt(obj4.toString());
        }
        Object obj5 = map.get("s_c_t");
        if (obj5 != null) {
            this.f3708e = Integer.parseInt(obj5.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2428a(Map<String, Object> map) {
        Object obj = map.get("orientation");
        if (obj != null) {
            this.f3704a = Integer.parseInt(obj.toString());
        }
        Object obj2 = map.get(C1485b.f7175dk);
        if (obj2 != null) {
            this.f3705b = Integer.parseInt(obj2.toString());
        }
        Object obj3 = map.get("allows_skip");
        if (obj3 != null) {
            this.f3706c = Integer.parseInt(obj3.toString());
        }
        Object obj4 = map.get("button_type");
        if (obj4 != null) {
            this.f3707d = Integer.parseInt(obj4.toString());
        }
        Object obj5 = map.get("s_c_t");
        if (obj5 != null) {
            this.f3708e = Integer.parseInt(obj5.toString());
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m2429j() {
        return mo2423i() == 0;
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: a */
    public final int mo2415a() {
        return this.f3704a;
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: b */
    public final long mo2416b() {
        return this.f3705b;
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: c */
    public final int mo2417c() {
        int i = this.f3706c;
        return (i != 1 && i == 0) ? 1 : 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void clear(View view) {
        BaseAd baseAd = this.f3709f;
        if (baseAd != null) {
            baseAd.clear(view);
        }
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: d */
    public final int mo2418d() {
        int i = this.f3707d;
        if (i != 1) {
            return i != 2 ? 2 : 1;
        }
        return 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void destroy() {
        this.f3709f.destroy();
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: e */
    public final int mo2419e() {
        return this.f3708e;
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: f */
    public final int mo2420f() {
        Object obj;
        if (this.f3709f.getDetail() == null || this.f3709f.getDetail().m3039P() != 8 || (obj = this.f3710g.get("video_muted")) == null) {
            return 0;
        }
        return TextUtils.equals(obj.toString(), "0") ? 1 : 0;
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: g */
    public final int mo2421g() {
        Map<String, Object> map = this.f3710g;
        if (map != null && map.containsKey(C1396f.a.f6081aq)) {
            Object obj = this.f3710g.get(C1396f.a.f6081aq);
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
        }
        return 1;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATAdAppInfo getAdAppInfo() {
        return this.f3709f.getAdAppInfo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.f3709f.getAdChoiceIconUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdFrom() {
        return this.f3709f.getAdFrom();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdIconView() {
        return this.f3709f.getAdIconView();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Bitmap getAdLogo() {
        return this.f3709f.getAdLogo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdLogoView() {
        return this.f3709f.getAdLogoView();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        return this.f3709f.getAdMediaView(objArr);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        return this.f3709f.getAdType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final IATAdvertiserInfoOperate getAdvertiserInfoOperate() {
        BaseAd baseAd = this.f3709f;
        if (baseAd != null) {
            return baseAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdvertiserName() {
        return this.f3709f.getAdvertiserName();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getAppCommentNum() {
        return this.f3709f.getAppCommentNum();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getAppDownloadButton() {
        return this.f3709f.getAppDownloadButton();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getAppPrice() {
        return this.f3709f.getAppPrice();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getCallToActionText() {
        return this.f3709f.getCallToActionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final ViewGroup getCustomAdContainer() {
        return this.f3709f.getCustomAdContainer();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDescriptionText() {
        return this.f3709f.getDescriptionText();
    }

    @Override // com.anythink.core.api.BaseAd
    public final C1243h getDetail() {
        return this.f3709f.getDetail();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.f3709f;
        return baseAd != null ? baseAd.getDomain() : "";
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadProgress() {
        return this.f3709f.getDownloadProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getDownloadStatus() {
        return this.f3709f.getDownloadStatus();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getIconImageUrl() {
        return this.f3709f.getIconImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.f3709f.getImageUrlList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageHeight() {
        return this.f3709f.getMainImageHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getMainImageUrl() {
        return this.f3709f.getMainImageUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getMainImageWidth() {
        return this.f3709f.getMainImageWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        return this.f3709f.getNativeAdInteractionType();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final ATCustomVideo getNativeCustomVideo() {
        return this.f3709f.getNativeCustomVideo();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressHeight() {
        return this.f3709f.getNativeExpressHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeExpressWidth() {
        return this.f3709f.getNativeExpressWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getNativeType() {
        return this.f3709f.getNativeType();
    }

    @Override // com.anythink.core.api.BaseAd, com.anythink.core.api.IATThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.f3709f.getNetworkInfoMap();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getShakeView(int i, int i2, ATShakeViewListener aTShakeViewListener) {
        BaseAd baseAd = this.f3709f;
        if (baseAd != null) {
            return baseAd.getShakeView(i, i2, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final View getSlideView(int i, int i2, int i3, ATShakeViewListener aTShakeViewListener) {
        BaseAd baseAd = this.f3709f;
        if (baseAd != null) {
            return baseAd.getSlideView(i, i2, i3, aTShakeViewListener);
        }
        return null;
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final Double getStarRating() {
        return this.f3709f.getStarRating();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getTitle() {
        return this.f3709f.getTitle();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoDuration() {
        return this.f3709f.getVideoDuration();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoHeight() {
        return this.f3709f.getVideoHeight();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final double getVideoProgress() {
        return this.f3709f.getVideoProgress();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getVideoUrl() {
        return this.f3709f.getVideoUrl();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final int getVideoWidth() {
        return this.f3709f.getVideoWidth();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.f3709f;
        return baseAd != null ? baseAd.getWarning() : "";
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: h */
    public final int[] mo2422h() {
        int[] iArr = {1, 2, 3, 4, 5};
        Map<String, Object> map = this.f3710g;
        if (map == null || !map.containsKey(C1396f.a.f6082ar)) {
            return iArr;
        }
        Object obj = this.f3710g.get(C1396f.a.f6082ar);
        return obj instanceof int[] ? (int[]) obj : iArr;
    }

    @Override // com.anythink.core.common.p055f.p056a.InterfaceC1203a
    /* JADX INFO: renamed from: i */
    public final int mo2423i() {
        Object obj;
        Map<String, Object> map = this.f3710g;
        if (map != null && (obj = map.get("close_button")) != null) {
            try {
                return Integer.parseInt(obj.toString());
            } catch (Exception e) {
                new StringBuilder("getCloseButtonVisibility() failed: ").append(e.getMessage());
            }
        }
        return 0;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        this.f3709f.registerListener(view, list, layoutParams);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, C1120b c1120b) {
        this.f3709f.registerListener(view, list, layoutParams, c1120b);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNativeEventListener(InterfaceC1173l interfaceC1173l) {
        this.f3709f.setNativeEventListener(interfaceC1173l);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.f3709f.setNetworkInfoMap(map);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setTrackingInfo(C1243h c1243h) {
        this.f3709f.setTrackingInfo(c1243h);
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setVideoMute(boolean z) {
        this.f3709f.setVideoMute(z);
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        BaseAd baseAd = this.f3709f;
        return baseAd != null && baseAd.supportSetPermissionClickViewList();
    }

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        BaseAd baseAd = this.f3709f;
        return baseAd != null && baseAd.supportSetPrivacyClickViewList();
    }
}
