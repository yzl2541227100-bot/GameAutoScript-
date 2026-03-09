package com.anythink.basead.mraid;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.basead.mraid.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0798a implements IBannerJSBridge {

    /* JADX INFO: renamed from: a */
    public DialogC0800c f1077a;

    /* JADX INFO: renamed from: b */
    public WeakReference<Activity> f1078b;

    /* JADX INFO: renamed from: c */
    private AbstractC0799b f1079c;

    /* JADX INFO: renamed from: a */
    private void m649a(Activity activity) {
        this.f1078b = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m650a(AbstractC0799b abstractC0799b) {
        if (abstractC0799b != null) {
            this.f1079c = abstractC0799b;
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void cai(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void click(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void close() {
        AbstractC0799b abstractC0799b = this.f1079c;
        if (abstractC0799b != null) {
            abstractC0799b.close();
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void expand(String str, boolean z) {
        Activity activity;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(C1781c.f10246am, str);
            bundle.putBoolean("shouldUseCustomClose", z);
            WeakReference<Activity> weakReference = this.f1078b;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return;
            }
            DialogC0800c dialogC0800c = this.f1077a;
            if (dialogC0800c == null || !dialogC0800c.isShowing()) {
                DialogC0800c dialogC0800c2 = new DialogC0800c(activity, bundle, this.f1079c);
                this.f1077a = dialogC0800c2;
                dialogC0800c2.show();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getFileInfo(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final C1781c getMraidCampaign() {
        return null;
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void getNetstat(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void gial(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void handlerH5Exception(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void increaseOfferFrequence(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void init(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void install(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void onJSBridgeConnect(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void open(String str) {
        AbstractC0799b abstractC0799b = this.f1079c;
        if (abstractC0799b != null) {
            abstractC0799b.open(str);
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void openURL(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void readyStatus(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void reportUrls(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void resetCountdown(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void sendImpressions(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void toggleCloseBtn(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.bridge.IBannerJSBridge
    public final void triggerCloseBtn(Object obj, String str) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void useCustomClose(boolean z) {
        try {
            AbstractC0799b abstractC0799b = this.f1079c;
            if (abstractC0799b != null) {
                abstractC0799b.useCustomClose(z);
            }
        } catch (Throwable unused) {
        }
    }
}
