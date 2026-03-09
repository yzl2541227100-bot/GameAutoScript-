package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1779a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1880n;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.shake.AbstractC1975b;
import com.anythink.expressad.shake.C1974a;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.splash.p148a.C1978b;
import com.anythink.expressad.splash.p148a.p149a.C1977a;
import com.anythink.expressad.widget.FeedBackButton;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes.dex */
public class ATSplashNativeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private static final String f12702a = "MBSplashNativeView";

    /* JADX INFO: renamed from: A */
    private int f12703A;

    /* JADX INFO: renamed from: B */
    private int f12704B;

    /* JADX INFO: renamed from: C */
    private float f12705C;

    /* JADX INFO: renamed from: D */
    private float f12706D;

    /* JADX INFO: renamed from: E */
    private boolean f12707E;

    /* JADX INFO: renamed from: F */
    private boolean f12708F;

    /* JADX INFO: renamed from: G */
    private boolean f12709G;

    /* JADX INFO: renamed from: H */
    private boolean f12710H;

    /* JADX INFO: renamed from: I */
    private boolean f12711I;

    /* JADX INFO: renamed from: J */
    private String f12712J;

    /* JADX INFO: renamed from: K */
    private String f12713K;

    /* JADX INFO: renamed from: L */
    private ATSplashView f12714L;

    /* JADX INFO: renamed from: M */
    private C1781c f12715M;

    /* JADX INFO: renamed from: N */
    private MBShakeView f12716N;

    /* JADX INFO: renamed from: O */
    private String f12717O;

    /* JADX INFO: renamed from: P */
    private String f12718P;

    /* JADX INFO: renamed from: Q */
    private String f12719Q;

    /* JADX INFO: renamed from: R */
    private AbstractC1975b f12720R;

    /* JADX INFO: renamed from: b */
    private MBNoRecycledCrashImageView f12721b;

    /* JADX INFO: renamed from: c */
    private MBNoRecycledCrashImageView f12722c;

    /* JADX INFO: renamed from: d */
    private RelativeLayout f12723d;

    /* JADX INFO: renamed from: e */
    private ImageView f12724e;

    /* JADX INFO: renamed from: f */
    private FeedBackButton f12725f;

    /* JADX INFO: renamed from: g */
    private TextView f12726g;

    /* JADX INFO: renamed from: h */
    private RelativeLayout f12727h;

    /* JADX INFO: renamed from: i */
    private MBNoRecycledCrashImageView f12728i;

    /* JADX INFO: renamed from: j */
    private TextView f12729j;

    /* JADX INFO: renamed from: k */
    private MBNoRecycledCrashImageView f12730k;

    /* JADX INFO: renamed from: l */
    private TextView f12731l;

    /* JADX INFO: renamed from: m */
    private TextView f12732m;

    /* JADX INFO: renamed from: n */
    private RelativeLayout f12733n;

    /* JADX INFO: renamed from: o */
    private TextView f12734o;

    /* JADX INFO: renamed from: p */
    private TextView f12735p;

    /* JADX INFO: renamed from: q */
    private TextView f12736q;

    /* JADX INFO: renamed from: r */
    private MBSplashClickView f12737r;

    /* JADX INFO: renamed from: s */
    private int f12738s;

    /* JADX INFO: renamed from: t */
    private int f12739t;

    /* JADX INFO: renamed from: u */
    private int f12740u;

    /* JADX INFO: renamed from: v */
    private int f12741v;

    /* JADX INFO: renamed from: w */
    private int f12742w;

    /* JADX INFO: renamed from: x */
    private int f12743x;

    /* JADX INFO: renamed from: y */
    private int f12744y;

    /* JADX INFO: renamed from: z */
    private int f12745z;

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$1 */
    public class C19971 implements InterfaceC1819c {
        public C19971() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            MBNoRecycledCrashImageView mBNoRecycledCrashImageView;
            if (bitmap == null) {
                return;
            }
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                try {
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        ATSplashNativeView.m10740a(ATSplashNativeView.this);
                        ATSplashNativeView.this.f12727h.setVisibility(4);
                        ATSplashNativeView.this.f12722c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        mBNoRecycledCrashImageView = ATSplashNativeView.this.f12722c;
                    } else {
                        if (ATSplashNativeView.this.f12703A == 1) {
                            ATSplashNativeView.this.f12727h.setVisibility(0);
                            try {
                                Bitmap bitmapM9756a = C1880n.m9756a(bitmap, C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f));
                                if (bitmapM9756a != null && !bitmapM9756a.isRecycled()) {
                                    ATSplashNativeView.this.f12730k.setScaleType(ImageView.ScaleType.FIT_XY);
                                    ATSplashNativeView.this.f12730k.setImageBitmap(bitmapM9756a);
                                }
                            } catch (Throwable th) {
                                try {
                                    th.getMessage();
                                    ATSplashNativeView.this.f12730k.setImageBitmap(bitmap);
                                } catch (Throwable th2) {
                                    th2.getMessage();
                                }
                            }
                            ATSplashNativeView.this.f12729j.setText(ATSplashNativeView.this.f12715M.m10148bb());
                            ATSplashNativeView.m10756h(ATSplashNativeView.this);
                            C1339c.m4025a(C1175n.m2059a().m2148f(), bitmap, new C1339c.a() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.1.1
                                @Override // com.anythink.core.common.p066o.C1339c.a
                                /* JADX INFO: renamed from: a */
                                public final void mo673a() {
                                }

                                @Override // com.anythink.core.common.p066o.C1339c.a
                                /* JADX INFO: renamed from: a */
                                public final void mo674a(Bitmap bitmap2) {
                                    if (bitmap2 == null || bitmap2.isRecycled()) {
                                        return;
                                    }
                                    ATSplashNativeView.this.f12721b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ATSplashNativeView.this.f12721b.setImageBitmap(bitmap2);
                                }
                            });
                            return;
                        }
                        ATSplashNativeView.this.f12727h.setVisibility(4);
                        ATSplashNativeView.this.f12722c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        mBNoRecycledCrashImageView = ATSplashNativeView.this.f12722c;
                    }
                    C1339c.m4025a(C1175n.m2059a().m2148f(), bitmap, new C1339c.a() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.1.1
                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo673a() {
                        }

                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo674a(Bitmap bitmap2) {
                            if (bitmap2 == null || bitmap2.isRecycled()) {
                                return;
                            }
                            ATSplashNativeView.this.f12721b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            ATSplashNativeView.this.f12721b.setImageBitmap(bitmap2);
                        }
                    });
                    return;
                } catch (Throwable unused) {
                    ATSplashNativeView.this.f12722c.setImageBitmap(bitmap);
                    return;
                }
                mBNoRecycledCrashImageView.setImageBitmap(bitmap);
            } catch (Throwable th3) {
                th3.getMessage();
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$10 */
    public class ViewOnClickListenerC199810 implements View.OnClickListener {
        public ViewOnClickListenerC199810() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashNativeView.this.f12709G) {
                if (ATSplashNativeView.this.f12714L.getSplashJSBridgeImpl() != null && ATSplashNativeView.this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    ATSplashNativeView.this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10662c();
                }
                ATSplashNativeView.this.f12726g.setVisibility(4);
                ATSplashNativeView.this.f12726g.setEnabled(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$11 */
    public class C199911 implements InterfaceC1798a {
        public C199911() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            ATSplashNativeView.this.f12711I = true;
            ATSplashNativeView.m10744b(ATSplashNativeView.this, false);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            ATSplashNativeView.this.f12711I = false;
            ATSplashNativeView.m10744b(ATSplashNativeView.this, true);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            ATSplashNativeView.this.f12711I = false;
            ATSplashNativeView.m10744b(ATSplashNativeView.this, true);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$2 */
    public class ViewOnClickListenerC20002 implements View.OnClickListener {
        public ViewOnClickListenerC20002() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.m10738a(ATSplashNativeView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$3 */
    public class C20013 extends AbstractC1975b {
        public C20013(int i, int i2) {
            super(i, i2);
        }

        @Override // com.anythink.expressad.shake.AbstractC1975b
        /* JADX INFO: renamed from: a */
        public final void mo10481a() {
            if (ATSplashNativeView.this.f12711I || ATSplashNativeView.this.f12710H || !ATSplashNativeView.this.isShown()) {
                return;
            }
            ATSplashNativeView.m10738a(ATSplashNativeView.this, 4);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$4 */
    public class C20024 implements InterfaceC1819c {
        public C20024() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            Bitmap bitmapM9756a;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (ATSplashNativeView.this.f12728i == null || (bitmapM9756a = C1880n.m9756a(bitmap, C1886t.m9834b(C1175n.m2059a().m2148f(), 40.0f))) == null || bitmapM9756a.isRecycled()) {
                            return;
                        }
                        ATSplashNativeView.this.f12728i.setImageBitmap(bitmapM9756a);
                    } catch (Throwable th) {
                        th.getMessage();
                        ATSplashNativeView.this.f12728i.setImageBitmap(bitmap);
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            ATSplashNativeView.this.f12728i.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$6 */
    public class ViewOnClickListenerC20046 implements View.OnClickListener {
        public ViewOnClickListenerC20046() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.m10738a(ATSplashNativeView.this, 1);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$7 */
    public class ViewOnClickListenerC20057 implements View.OnClickListener {
        public ViewOnClickListenerC20057() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.m10738a(ATSplashNativeView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$8 */
    public class ViewOnClickListenerC20068 implements View.OnClickListener {
        public ViewOnClickListenerC20068() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashNativeView.this.f12715M.m9105aG() != null) {
                String strM8608c = ATSplashNativeView.this.f12715M.m9105aG().m8608c();
                if (TextUtils.isEmpty(strM8608c)) {
                    return;
                }
                C1350n.m4203a(ATSplashNativeView.this.getContext(), strM8608c);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$9 */
    public class ViewOnClickListenerC20079 implements View.OnClickListener {
        public ViewOnClickListenerC20079() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1779a c1779aM9105aG = ATSplashNativeView.this.f12715M.m9105aG();
            if (c1779aM9105aG != null) {
                C1350n.m4203a(C1175n.m2059a().m2148f(), c1779aM9105aG.m8606a());
            }
        }
    }

    public ATSplashNativeView(Context context) {
        super(context);
        this.f12710H = false;
        this.f12711I = false;
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12710H = false;
        this.f12711I = false;
    }

    public ATSplashNativeView(Context context, ATSplashView aTSplashView, C1978b c1978b) {
        Context applicationContext;
        String str;
        super(context);
        this.f12710H = false;
        this.f12711I = false;
        if (c1978b == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f12712J = c1978b.m10494b();
        this.f12713K = c1978b.m10493a();
        this.f12715M = c1978b.m10495c();
        this.f12714L = aTSplashView;
        this.f12738s = c1978b.m10497e();
        this.f12741v = c1978b.m10498f();
        this.f12740u = c1978b.m10499g();
        this.f12742w = c1978b.m10500h();
        this.f12743x = c1978b.m10501i();
        this.f12744y = c1978b.m10502j();
        this.f12745z = c1978b.m10503k();
        this.f12703A = c1978b.m10504l();
        this.f12709G = c1978b.m10496d();
        this.f12704B = c1978b.m10505m();
        try {
            if (this.f12703A == 1) {
                applicationContext = getContext().getApplicationContext();
                str = "anythink_splash_portrait";
            } else {
                applicationContext = getContext().getApplicationContext();
                str = "anythink_splash_landscape";
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(C1875i.m9684a(applicationContext, str, "layout"), (ViewGroup) null);
            addView(viewInflate);
            this.f12721b = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
            this.f12722c = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
            this.f12723d = (RelativeLayout) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
            this.f12724e = (ImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
            this.f12725f = (FeedBackButton) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
            this.f12726g = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
            this.f12727h = (RelativeLayout) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
            this.f12728i = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
            this.f12729j = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
            this.f12730k = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
            this.f12731l = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
            this.f12733n = (RelativeLayout) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
            this.f12734o = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
            this.f12735p = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
            this.f12736q = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
            this.f12737r = (MBSplashClickView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
            this.f12732m = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
            int iM9684a = C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", C1875i.f11532g);
            int iM9684a2 = C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", C1875i.f11532g);
            int iM9684a3 = C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", C1875i.f11532g);
            this.f12718P = getContext().getResources().getString(iM9684a);
            this.f12719Q = getContext().getResources().getString(iM9684a2);
            this.f12717O = getContext().getResources().getString(iM9684a3);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (C1800b.m9367a().m9384b()) {
            this.f12715M.m8891l(this.f12712J);
            C1800b.m9367a().m9380a(this.f12712J, new C199911());
            C1800b.m9367a().m9381a(this.f12712J, this.f12725f);
            C1800b.m9367a().m9379a(this.f12712J, this.f12715M);
        } else {
            FeedBackButton feedBackButton = this.f12725f;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(this.f12715M.m10151be())) {
            this.f12722c.setVisibility(4);
        } else {
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f12715M.m10151be(), new C19971());
        }
        m10750e();
        if (this.f12715M.m9105aG() == null || this.f12742w != 0) {
            this.f12733n.setVisibility(8);
        } else {
            C1779a c1779aM9105aG = this.f12715M.m9105aG();
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_app_name", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8607b());
            sb.append("\n");
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_version", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8610e());
            sb.append("\n");
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_publish", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8611f());
            sb.append("\n");
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_update_time", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8609d());
            this.f12734o.setText(sb);
        }
        if (this.f12741v == 1 || this.f12743x == 1) {
            this.f12737r.setVisibility(8);
        } else {
            this.f12737r.initView(this.f12715M.f11928cU);
        }
        if (this.f12740u == 1) {
            setOnClickListener(new ViewOnClickListenerC20046());
        } else {
            this.f12737r.setOnClickListener(new ViewOnClickListenerC20057());
        }
        this.f12735p.setOnClickListener(new ViewOnClickListenerC20068());
        this.f12736q.setOnClickListener(new ViewOnClickListenerC20079());
        this.f12726g.setOnClickListener(new ViewOnClickListenerC199810());
        if (this.f12743x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f12716N = mBShakeView;
            mBShakeView.initView(this.f12715M.f11928cU);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f12716N.setLayoutParams(layoutParams);
            addView(this.f12716N);
            this.f12737r.setVisibility(4);
            this.f12737r.setEnabled(false);
            this.f12716N.setOnClickListener(new ViewOnClickListenerC20002());
            this.f12720R = new C20013(this.f12744y, this.f12745z * 1000);
        }
        updateCountDown(this.f12738s);
    }

    /* JADX INFO: renamed from: a */
    private void m10736a() {
        Context applicationContext;
        String str;
        try {
            if (this.f12703A == 1) {
                applicationContext = getContext().getApplicationContext();
                str = "anythink_splash_portrait";
            } else {
                applicationContext = getContext().getApplicationContext();
                str = "anythink_splash_landscape";
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(C1875i.m9684a(applicationContext, str, "layout"), (ViewGroup) null);
            addView(viewInflate);
            this.f12721b = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
            this.f12722c = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
            this.f12723d = (RelativeLayout) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
            this.f12724e = (ImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
            this.f12725f = (FeedBackButton) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
            this.f12726g = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
            this.f12727h = (RelativeLayout) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
            this.f12728i = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
            this.f12729j = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
            this.f12730k = (MBNoRecycledCrashImageView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
            this.f12731l = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
            this.f12733n = (RelativeLayout) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
            this.f12734o = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
            this.f12735p = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
            this.f12736q = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
            this.f12737r = (MBSplashClickView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
            this.f12732m = (TextView) viewInflate.findViewById(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
            int iM9684a = C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", C1875i.f11532g);
            int iM9684a2 = C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", C1875i.f11532g);
            int iM9684a3 = C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", C1875i.f11532g);
            this.f12718P = getContext().getResources().getString(iM9684a);
            this.f12719Q = getContext().getResources().getString(iM9684a2);
            this.f12717O = getContext().getResources().getString(iM9684a3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10737a(int i) {
        if (this.f12714L.getSplashJSBridgeImpl() == null || this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10656a(C1977a.m10483a(C1977a.m10486a(i, this.f12705C, this.f12706D), this.f12715M));
        } catch (Throwable th) {
            th.getMessage();
            this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10656a(this.f12715M);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10738a(ATSplashNativeView aTSplashNativeView, int i) {
        if (aTSplashNativeView.f12714L.getSplashJSBridgeImpl() == null || aTSplashNativeView.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            aTSplashNativeView.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10656a(C1977a.m10483a(C1977a.m10486a(i, aTSplashNativeView.f12705C, aTSplashNativeView.f12706D), aTSplashNativeView.f12715M));
        } catch (Throwable th) {
            th.getMessage();
            aTSplashNativeView.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10656a(aTSplashNativeView.f12715M);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10739a(boolean z) {
        if (this.f12714L.getSplashJSBridgeImpl() == null || this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        this.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10655a(z ? 2 : 1, this.f12739t);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10740a(ATSplashNativeView aTSplashNativeView) {
        aTSplashNativeView.f12708F = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m10743b() {
        if (C1800b.m9367a().m9384b()) {
            this.f12715M.m8891l(this.f12712J);
            C1800b.m9367a().m9380a(this.f12712J, new C199911());
            C1800b.m9367a().m9381a(this.f12712J, this.f12725f);
            C1800b.m9367a().m9379a(this.f12712J, this.f12715M);
        } else {
            FeedBackButton feedBackButton = this.f12725f;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(this.f12715M.m10151be())) {
            this.f12722c.setVisibility(4);
        } else {
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f12715M.m10151be(), new C19971());
        }
        m10750e();
        if (this.f12715M.m9105aG() == null || this.f12742w != 0) {
            this.f12733n.setVisibility(8);
        } else {
            C1779a c1779aM9105aG = this.f12715M.m9105aG();
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_app_name", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8607b());
            sb.append("\n");
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_version", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8610e());
            sb.append("\n");
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_publish", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8611f());
            sb.append("\n");
            sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_update_time", C1875i.f11532g)));
            sb.append(c1779aM9105aG.m8609d());
            this.f12734o.setText(sb);
        }
        if (this.f12741v == 1 || this.f12743x == 1) {
            this.f12737r.setVisibility(8);
        } else {
            this.f12737r.initView(this.f12715M.f11928cU);
        }
        if (this.f12740u == 1) {
            setOnClickListener(new ViewOnClickListenerC20046());
        } else {
            this.f12737r.setOnClickListener(new ViewOnClickListenerC20057());
        }
        this.f12735p.setOnClickListener(new ViewOnClickListenerC20068());
        this.f12736q.setOnClickListener(new ViewOnClickListenerC20079());
        this.f12726g.setOnClickListener(new ViewOnClickListenerC199810());
        if (this.f12743x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f12716N = mBShakeView;
            mBShakeView.initView(this.f12715M.f11928cU);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f12716N.setLayoutParams(layoutParams);
            addView(this.f12716N);
            this.f12737r.setVisibility(4);
            this.f12737r.setEnabled(false);
            this.f12716N.setOnClickListener(new ViewOnClickListenerC20002());
            this.f12720R = new C20013(this.f12744y, this.f12745z * 1000);
        }
        updateCountDown(this.f12738s);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10744b(ATSplashNativeView aTSplashNativeView, boolean z) {
        if (aTSplashNativeView.f12714L.getSplashJSBridgeImpl() == null || aTSplashNativeView.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        aTSplashNativeView.f12714L.getSplashJSBridgeImpl().getSplashBridgeListener().mo10655a(z ? 2 : 1, aTSplashNativeView.f12739t);
    }

    /* JADX INFO: renamed from: c */
    private void m10746c() {
        if (TextUtils.isEmpty(this.f12715M.m10151be())) {
            this.f12722c.setVisibility(4);
        } else {
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f12715M.m10151be(), new C19971());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m10748d() {
        if (TextUtils.isEmpty(this.f12715M.m10150bd())) {
            this.f12728i.setVisibility(4);
        } else {
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(this.f12715M.m10150bd(), new C20024());
        }
    }

    /* JADX INFO: renamed from: e */
    private void m10750e() {
        Drawable drawable;
        TextView textView;
        C1773a.m8548c().m8558f();
        C1486b.m6002a();
        C1483a c1483aM6007b = C1486b.m6007b();
        if (c1483aM6007b != null) {
            final String strM5936J = c1483aM6007b.m5936J();
            if (TextUtils.isEmpty(strM5936J)) {
                this.f12724e.setVisibility(8);
            }
            this.f12724e.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1350n.m4203a(ATSplashNativeView.this.getContext(), strM5936J);
                }
            });
        } else {
            this.f12724e.setVisibility(8);
        }
        try {
            drawable = getResources().getDrawable(C1875i.m9684a(getContext().getApplicationContext(), "anythink_splash_m_circle", C1875i.f11528c));
        } catch (Throwable th) {
            th = th;
            drawable = null;
        }
        try {
            drawable.setBounds(0, 0, C1886t.m9834b(getContext(), 10.0f), C1886t.m9834b(getContext(), 10.0f));
        } catch (Throwable th2) {
            th = th2;
            th.getMessage();
        }
        if (this.f12703A == 1 && this.f12708F) {
            if (this.f12704B != 0 && drawable != null) {
                this.f12732m.setCompoundDrawables(drawable, null, null, null);
            }
            this.f12732m.setText(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_app_label", C1875i.f11532g)));
            textView = this.f12731l;
        } else {
            if (this.f12704B != 0 && drawable != null) {
                this.f12731l.setCompoundDrawables(drawable, null, null, null);
            }
            this.f12731l.setText(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_app_label", C1875i.f11532g)));
            textView = this.f12732m;
        }
        textView.setVisibility(4);
    }

    /* JADX INFO: renamed from: f */
    private void m10752f() {
        if (this.f12715M.m9105aG() == null || this.f12742w != 0) {
            this.f12733n.setVisibility(8);
            return;
        }
        C1779a c1779aM9105aG = this.f12715M.m9105aG();
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_app_name", C1875i.f11532g)));
        sb.append(c1779aM9105aG.m8607b());
        sb.append("\n");
        sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_version", C1875i.f11532g)));
        sb.append(c1779aM9105aG.m8610e());
        sb.append("\n");
        sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_publish", C1875i.f11532g)));
        sb.append(c1779aM9105aG.m8611f());
        sb.append("\n");
        sb.append(getContext().getString(C1875i.m9684a(getContext(), "anythink_cm_app_info_update_time", C1875i.f11532g)));
        sb.append(c1779aM9105aG.m8609d());
        this.f12734o.setText(sb);
    }

    /* JADX INFO: renamed from: g */
    private void m10754g() {
        if (this.f12741v == 1) {
            this.f12737r.setVisibility(8);
        } else if (this.f12743x == 1) {
            this.f12737r.setVisibility(8);
        } else {
            this.f12737r.initView(this.f12715M.f11928cU);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m10755h() {
        if (this.f12740u == 1) {
            setOnClickListener(new ViewOnClickListenerC20046());
        } else {
            this.f12737r.setOnClickListener(new ViewOnClickListenerC20057());
        }
        this.f12735p.setOnClickListener(new ViewOnClickListenerC20068());
        this.f12736q.setOnClickListener(new ViewOnClickListenerC20079());
        this.f12726g.setOnClickListener(new ViewOnClickListenerC199810());
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m10756h(ATSplashNativeView aTSplashNativeView) {
        if (TextUtils.isEmpty(aTSplashNativeView.f12715M.m10150bd())) {
            aTSplashNativeView.f12728i.setVisibility(4);
        } else {
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(aTSplashNativeView.f12715M.m10150bd(), aTSplashNativeView.new C20024());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m10758i() {
        if (C1800b.m9367a().m9384b()) {
            this.f12715M.m8891l(this.f12712J);
            C1800b.m9367a().m9380a(this.f12712J, new C199911());
            C1800b.m9367a().m9381a(this.f12712J, this.f12725f);
            C1800b.m9367a().m9379a(this.f12712J, this.f12715M);
            return;
        }
        FeedBackButton feedBackButton = this.f12725f;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m10760j() {
        if (this.f12743x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f12716N = mBShakeView;
            mBShakeView.initView(this.f12715M.f11928cU);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f12716N.setLayoutParams(layoutParams);
            addView(this.f12716N);
            this.f12737r.setVisibility(4);
            this.f12737r.setEnabled(false);
            this.f12716N.setOnClickListener(new ViewOnClickListenerC20002());
            this.f12720R = new C20013(this.f12744y, this.f12745z * 1000);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f12743x != 1 || this.f12716N == null || this.f12720R == null) {
                return;
            }
            C1974a.m10477a().m10478a(this.f12720R);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f12705C = motionEvent.getRawX();
        this.f12706D = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.f12726g;
        if (textView == null || textView.getParent() == null || !(this.f12726g.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) this.f12726g.getParent()).getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int iM4165b = ((RelativeLayout.LayoutParams) layoutParams).topMargin + C1345i.m4165b(getContext());
            int[] iArr = new int[2];
            this.f12726g.getLocationOnScreen(iArr);
            if (iArr[1] < iM4165b) {
                int i5 = iM4165b - iArr[1];
                ViewParent parent = this.f12726g.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + i5, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom() + i5);
                }
            }
        }
    }

    public void release() {
        try {
            if (this.f12720R != null) {
                C1974a.m10477a().m10479b(this.f12720R);
                this.f12720R = null;
            }
            C1800b.m9367a().m9385c(this.f12712J);
            detachAllViewsFromParent();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setIsPause(boolean z) {
        this.f12710H = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        this.f12723d.setPadding(i, i3, i2, i4);
    }

    public void updateCountDown(int i) {
        StringBuilder sb;
        String str;
        if (this.f12726g != null) {
            this.f12739t = i;
            if (this.f12709G) {
                sb = new StringBuilder();
                sb.append(this.f12718P);
                sb.append(C4196o4.OooO00o.OooO0Oo);
                sb.append(i);
                str = this.f12717O;
            } else {
                sb = new StringBuilder();
                sb.append(i);
                sb.append(this.f12717O);
                sb.append(C4196o4.OooO00o.OooO0Oo);
                str = this.f12719Q;
            }
            sb.append(str);
            this.f12726g.setText(sb.toString());
        }
    }
}
