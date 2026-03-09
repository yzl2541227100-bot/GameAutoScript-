package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import cn.haorui.sdk.adsail_ad.view.scaleImage.SubsamplingScaleImageView;
import com.anythink.expressad.foundation.p118f.C1800b;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class ATBaseActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private static final String f6419a = "ATBaseActivity";

    /* JADX INFO: renamed from: b */
    private OrientationEventListener f6420b;

    /* JADX INFO: renamed from: c */
    private Display f6421c;

    /* JADX INFO: renamed from: d */
    private int f6422d = -1;

    /* JADX INFO: renamed from: com.anythink.expressad.activity.ATBaseActivity$2 */
    public class C14182 extends OrientationEventListener {
        public C14182(Context context) {
            super(context, 1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[PHI: r0
  0x0014: PHI (r0v3 int) = (r0v1 int), (r0v0 int) binds: [B:15:0x0029, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.OrientationEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onOrientationChanged(int r4) {
            /*
                r3 = this;
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                int r4 = com.anythink.expressad.activity.ATBaseActivity.m5382a(r4)
                if (r4 >= 0) goto L9
                r4 = 0
            L9:
                r0 = 1
                if (r4 != r0) goto L1f
                com.anythink.expressad.activity.ATBaseActivity r1 = com.anythink.expressad.activity.ATBaseActivity.this
                int r1 = com.anythink.expressad.activity.ATBaseActivity.m5384b(r1)
                if (r1 == r0) goto L1f
            L14:
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                com.anythink.expressad.activity.ATBaseActivity.m5383a(r4, r0)
            L19:
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                r4.m5391a()
                return
            L1f:
                r0 = 2
                r1 = 3
                if (r4 != r1) goto L2c
                com.anythink.expressad.activity.ATBaseActivity r2 = com.anythink.expressad.activity.ATBaseActivity.this
                int r2 = com.anythink.expressad.activity.ATBaseActivity.m5384b(r2)
                if (r2 == r0) goto L2c
                goto L14
            L2c:
                if (r4 != 0) goto L3c
                com.anythink.expressad.activity.ATBaseActivity r2 = com.anythink.expressad.activity.ATBaseActivity.this
                int r2 = com.anythink.expressad.activity.ATBaseActivity.m5384b(r2)
                if (r2 == r1) goto L3c
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                com.anythink.expressad.activity.ATBaseActivity.m5383a(r4, r1)
                goto L19
            L3c:
                if (r4 != r0) goto L51
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                int r4 = com.anythink.expressad.activity.ATBaseActivity.m5384b(r4)
                r0 = 4
                if (r4 == r0) goto L51
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                com.anythink.expressad.activity.ATBaseActivity.m5383a(r4, r0)
                com.anythink.expressad.activity.ATBaseActivity r4 = com.anythink.expressad.activity.ATBaseActivity.this
                r4.m5391a()
            L51:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.activity.ATBaseActivity.C14182.onOrientationChanged(int):void");
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5385b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, true);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5387c() {
        C14182 c14182 = new C14182(this);
        this.f6420b = c14182;
        if (c14182.canDetectOrientation()) {
            this.f6420b.enable();
        } else {
            this.f6420b.disable();
            this.f6420b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public int m5388d() {
        if (this.f6421c == null) {
            this.f6421c = Build.VERSION.SDK_INT >= 30 ? getDisplay() : ((WindowManager) getSystemService("window")).getDefaultDisplay();
        }
        Display display = this.f6421c;
        if (display == null) {
            return -1;
        }
        try {
            return display.getRotation();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5389d(ATBaseActivity aTBaseActivity) {
        C14182 c14182 = aTBaseActivity.new C14182(aTBaseActivity);
        aTBaseActivity.f6420b = c14182;
        if (c14182.canDetectOrientation()) {
            aTBaseActivity.f6420b.enable();
        } else {
            aTBaseActivity.f6420b.disable();
            aTBaseActivity.f6420b = null;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m5390e() {
        try {
            if (Build.VERSION.SDK_INT < 19) {
                getWindow().getDecorView().setSystemUiVisibility(2);
            } else {
                getWindow().addFlags(67108864);
                getWindow().getDecorView().setSystemUiVisibility(4098);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5391a() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.anythink.expressad.activity.ATBaseActivity.1
            @Override // java.lang.Runnable
            public final void run() {
                int safeInsetRight;
                int safeInsetTop;
                int i;
                DisplayCutout displayCutout;
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23) {
                        WindowInsets rootWindowInsets = ATBaseActivity.this.getWindow().getDecorView().getRootWindowInsets();
                        int i3 = -1;
                        int i4 = 0;
                        if (rootWindowInsets == null || i2 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                            safeInsetRight = 0;
                            safeInsetTop = 0;
                            i = 0;
                        } else {
                            int safeInsetLeft = displayCutout.getSafeInsetLeft();
                            safeInsetRight = displayCutout.getSafeInsetRight();
                            safeInsetTop = displayCutout.getSafeInsetTop();
                            int safeInsetBottom = displayCutout.getSafeInsetBottom();
                            StringBuilder sb = new StringBuilder("NOTCH Left:");
                            sb.append(safeInsetLeft);
                            sb.append(" Right:");
                            sb.append(safeInsetRight);
                            sb.append(" Top:");
                            sb.append(safeInsetTop);
                            sb.append(" Bottom:");
                            sb.append(safeInsetBottom);
                            int iM5388d = ATBaseActivity.this.m5388d();
                            if (ATBaseActivity.this.f6422d == -1) {
                                ATBaseActivity.this.f6422d = iM5388d == 0 ? 3 : iM5388d == 1 ? 1 : iM5388d == 2 ? 4 : iM5388d == 3 ? 2 : -1;
                                new StringBuilder().append(ATBaseActivity.this.f6422d);
                            }
                            if (iM5388d != 0) {
                                if (iM5388d == 1) {
                                    i3 = 90;
                                } else if (iM5388d == 2) {
                                    i3 = 180;
                                } else if (iM5388d == 3) {
                                    i3 = SubsamplingScaleImageView.ORIENTATION_270;
                                }
                                i = safeInsetBottom;
                                i4 = safeInsetLeft;
                            } else {
                                i = safeInsetBottom;
                                i4 = safeInsetLeft;
                                i3 = 0;
                            }
                        }
                        ATBaseActivity.this.mo5392a(i3, i4, safeInsetRight, safeInsetTop, i);
                        if (ATBaseActivity.this.f6420b == null) {
                            ATBaseActivity.m5389d(ATBaseActivity.this);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5392a(int i, int i2, int i3, int i4, int i5);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            m5390e();
            m5388d();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f6420b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f6420b = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                try {
                    super.onResume();
                } catch (Throwable unused) {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(this, true);
                }
            } catch (Throwable unused2) {
                finish();
            }
        } else {
            super.onResume();
        }
        if (C1800b.f10958c) {
            return;
        }
        m5391a();
        m5390e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m5390e();
    }
}
