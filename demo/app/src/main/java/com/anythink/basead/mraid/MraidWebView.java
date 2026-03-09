package com.anythink.basead.mraid;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.anythink.expressad.atsignalcommon.base.C1450b;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.mbbanner.p139a.p140a.C1900a;
import com.anythink.expressad.mbbanner.view.ATBannerWebView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class MraidWebView extends ATBannerWebView {
    public static String TAG = MraidWebView.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public AbstractC0799b f1071a;

    /* JADX INFO: renamed from: b */
    public boolean f1072b;

    /* JADX INFO: renamed from: c */
    public MraidVolumeChangeReceiver f1073c;

    /* JADX INFO: renamed from: d */
    public boolean f1074d;

    /* JADX INFO: renamed from: com.anythink.basead.mraid.MraidWebView$1 */
    public class ViewTreeObserverOnPreDrawListenerC07961 implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC07961() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            try {
                MraidWebView mraidWebView = MraidWebView.this;
                if (!mraidWebView.f1072b) {
                    mraidWebView.getViewTreeObserver().removeOnPreDrawListener(this);
                    MraidWebView mraidWebView2 = MraidWebView.this;
                    mraidWebView2.f1072b = true;
                    int[] iArr = new int[2];
                    mraidWebView2.getLocationInWindow(iArr);
                    C1900a.m9894a(MraidWebView.this, iArr[0], iArr[1]);
                    MraidWebView mraidWebView3 = MraidWebView.this;
                    C1900a.m9896a(mraidWebView3, iArr[0], iArr[1], mraidWebView3.getWidth(), MraidWebView.this.getHeight());
                    MraidWebView.m644a(MraidWebView.this);
                    MraidWebView mraidWebView4 = MraidWebView.this;
                    if (mraidWebView4.f1074d) {
                        MraidWebView.m646b(mraidWebView4);
                    }
                    AbstractC0799b abstractC0799b = MraidWebView.this.f1071a;
                    if (abstractC0799b != null) {
                        abstractC0799b.mo651a();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.mraid.MraidWebView$2 */
    public class C07972 implements MraidVolumeChangeReceiver.VolumeChangeListener {
        public C07972() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver.VolumeChangeListener
        public final void onVolumeChanged(double d) {
            String str = MraidWebView.TAG;
            try {
                CallMraidJS.getInstance().fireAudioVolumeChange(MraidWebView.this, d);
            } catch (Exception e) {
                String str2 = MraidWebView.TAG;
                e.getMessage();
            }
        }
    }

    public MraidWebView(Context context) {
        super(context);
        this.f1072b = false;
    }

    public MraidWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1072b = false;
    }

    public MraidWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1072b = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m644a(MraidWebView mraidWebView) {
        Object object = mraidWebView.getObject();
        C1450b baseWebViewClient = mraidWebView.getBaseWebViewClient();
        if (object instanceof C0798a) {
            Context context = mraidWebView.getContext();
            if (context instanceof Activity) {
                ((C0798a) object).f1078b = new WeakReference<>((Activity) context);
            }
            ((C0798a) object).m650a(mraidWebView.f1071a);
        }
        if (baseWebViewClient instanceof C0802e) {
            ((C0802e) baseWebViewClient).f1105c = mraidWebView.f1071a;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m645b() {
        Object object = getObject();
        C1450b baseWebViewClient = getBaseWebViewClient();
        if (object instanceof C0798a) {
            Context context = getContext();
            if (context instanceof Activity) {
                ((C0798a) object).f1078b = new WeakReference<>((Activity) context);
            }
            ((C0798a) object).m650a(this.f1071a);
        }
        if (baseWebViewClient instanceof C0802e) {
            ((C0802e) baseWebViewClient).f1105c = this.f1071a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m646b(MraidWebView mraidWebView) {
        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(mraidWebView.getContext());
        mraidWebView.f1073c = mraidVolumeChangeReceiver;
        mraidVolumeChangeReceiver.registerReceiver();
        mraidWebView.f1073c.getCurrentVolume();
        mraidWebView.f1073c.setVolumeChangeListener(mraidWebView.new C07972());
    }

    /* JADX INFO: renamed from: c */
    private void m647c() {
        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
        this.f1073c = mraidVolumeChangeReceiver;
        mraidVolumeChangeReceiver.registerReceiver();
        this.f1073c.getCurrentVolume();
        this.f1073c.setVolumeChangeListener(new C07972());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0010  */
    @Override // com.anythink.expressad.atsignalcommon.base.BaseWebView
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String mo648a(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L3f
            java.lang.String r0 = "../"
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == 0) goto L12
        L10:
            r1 = 1
            goto L3f
        L12:
            java.lang.String r0 = "file"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L3f
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.lang.String r0 = r0.getPath()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L10
            com.anythink.core.common.b.n r3 = com.anythink.core.common.p051b.C1175n.m2059a()
            android.content.Context r3 = r3.m2148f()
            com.anythink.core.common.res.d r3 = com.anythink.core.common.res.C1380d.m4520a(r3)
            java.lang.String r3 = r3.m4523a()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L3f
            goto L10
        L3f:
            if (r1 == 0) goto L52
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "illegal URL: "
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "anythink_express"
            android.util.Log.e(r0, r5)
            java.lang.String r5 = "about:blank"
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.mraid.MraidWebView.mo648a(java.lang.String):java.lang.String");
    }

    public void prepare(Context context, AbstractC0799b abstractC0799b) {
        this.f1071a = abstractC0799b;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.basead.mraid.MraidWebView.1
            public ViewTreeObserverOnPreDrawListenerC07961() {
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                try {
                    MraidWebView mraidWebView = MraidWebView.this;
                    if (!mraidWebView.f1072b) {
                        mraidWebView.getViewTreeObserver().removeOnPreDrawListener(this);
                        MraidWebView mraidWebView2 = MraidWebView.this;
                        mraidWebView2.f1072b = true;
                        int[] iArr = new int[2];
                        mraidWebView2.getLocationInWindow(iArr);
                        C1900a.m9894a(MraidWebView.this, iArr[0], iArr[1]);
                        MraidWebView mraidWebView3 = MraidWebView.this;
                        C1900a.m9896a(mraidWebView3, iArr[0], iArr[1], mraidWebView3.getWidth(), MraidWebView.this.getHeight());
                        MraidWebView.m644a(MraidWebView.this);
                        MraidWebView mraidWebView4 = MraidWebView.this;
                        if (mraidWebView4.f1074d) {
                            MraidWebView.m646b(mraidWebView4);
                        }
                        AbstractC0799b abstractC0799b2 = MraidWebView.this.f1071a;
                        if (abstractC0799b2 != null) {
                            abstractC0799b2.mo651a();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return false;
            }
        });
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView
    public void release() {
        super.release();
        setWebViewListener(null);
        MraidVolumeChangeReceiver mraidVolumeChangeReceiver = this.f1073c;
        if (mraidVolumeChangeReceiver != null) {
            mraidVolumeChangeReceiver.unregisterReceiver();
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z) {
        this.f1074d = z;
    }
}
