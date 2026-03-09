package com.anythink.basead.p025ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p016d.C0770i;
import com.anythink.basead.p016d.p020c.C0762b;
import com.anythink.basead.p021e.AbstractC0778h;
import com.anythink.basead.p021e.C0772b;
import com.anythink.basead.p021e.C0779i;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.C1115a;
import com.anythink.core.common.C1161b;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1213af;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1318a;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.foundation.p138h.C1875i;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class BaseATActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static final String f1129a = BaseATActivity.class.getSimpleName();

    /* JADX INFO: renamed from: A */
    private BaseAd f1130A;

    /* JADX INFO: renamed from: b */
    public boolean f1131b;

    /* JADX INFO: renamed from: c */
    public AbstractC1213af f1132c;

    /* JADX INFO: renamed from: d */
    public long f1133d = 0;

    /* JADX INFO: renamed from: e */
    public long f1134e = 0;

    /* JADX INFO: renamed from: f */
    public float f1135f = 0.0f;

    /* JADX INFO: renamed from: g */
    public boolean f1136g = false;

    /* JADX INFO: renamed from: h */
    public boolean f1137h = false;

    /* JADX INFO: renamed from: i */
    public C1161b.a f1138i = new C1161b.a() { // from class: com.anythink.basead.ui.BaseATActivity.1
        public C08071() {
        }

        @Override // com.anythink.core.common.C1161b.a
        /* JADX INFO: renamed from: a */
        public final void mo690a(Object obj) {
            if (!(obj instanceof AbstractC1213af) || BaseATActivity.this.f1145p == null) {
                return;
            }
            AbstractC1213af abstractC1213af = (AbstractC1213af) obj;
            if (abstractC1213af.m2444a().m3167F().equals(BaseATActivity.this.f1145p.m3167F())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.f1131b) {
                    abstractC1213af.mo315a(baseATActivity);
                } else {
                    baseATActivity.f1132c = abstractC1213af;
                }
            }
        }
    };

    /* JADX INFO: renamed from: j */
    public AbstractC0778h f1139j;

    /* JADX INFO: renamed from: k */
    public long f1140k;

    /* JADX INFO: renamed from: l */
    public long f1141l;

    /* JADX INFO: renamed from: m */
    public long f1142m;

    /* JADX INFO: renamed from: n */
    private BaseScreenATView f1143n;

    /* JADX INFO: renamed from: o */
    private C1248m f1144o;

    /* JADX INFO: renamed from: p */
    private AbstractC1247l f1145p;

    /* JADX INFO: renamed from: q */
    private String f1146q;

    /* JADX INFO: renamed from: r */
    private C0772b.b f1147r;

    /* JADX INFO: renamed from: s */
    private String f1148s;

    /* JADX INFO: renamed from: t */
    private int f1149t;

    /* JADX INFO: renamed from: u */
    private int f1150u;

    /* JADX INFO: renamed from: v */
    private boolean f1151v;

    /* JADX INFO: renamed from: w */
    private boolean f1152w;

    /* JADX INFO: renamed from: x */
    private boolean f1153x;

    /* JADX INFO: renamed from: y */
    private boolean f1154y;

    /* JADX INFO: renamed from: z */
    private boolean f1155z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseATActivity$1 */
    public class C08071 implements C1161b.a {
        public C08071() {
        }

        @Override // com.anythink.core.common.C1161b.a
        /* JADX INFO: renamed from: a */
        public final void mo690a(Object obj) {
            if (!(obj instanceof AbstractC1213af) || BaseATActivity.this.f1145p == null) {
                return;
            }
            AbstractC1213af abstractC1213af = (AbstractC1213af) obj;
            if (abstractC1213af.m2444a().m3167F().equals(BaseATActivity.this.f1145p.m3167F())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.f1131b) {
                    abstractC1213af.mo315a(baseATActivity);
                } else {
                    baseATActivity.f1132c = abstractC1213af;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseATActivity$2 */
    public class C08082 extends AbstractC0778h {

        /* JADX INFO: renamed from: a */
        public String f1157a = "1";

        public C08082() {
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo458a() {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo458a();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo459a(C0747e c0747e) {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo459a(c0747e);
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo460a(C0779i c0779i) {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo460a(c0779i);
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo461a(boolean z) {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo461a(z);
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: b */
        public final void mo462b() {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo462b();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: b */
        public final void mo463b(C0779i c0779i) {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo463b(c0779i);
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: c */
        public final void mo464c() {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.mo464c();
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: d */
        public final void mo465d() {
            if (BaseATActivity.this.f1147r != null) {
                BaseATActivity.this.f1147r.m548a(m549e());
                BaseATActivity.this.f1147r.mo465d();
            }
            BaseATActivity.this.finish();
            if (BaseATActivity.this.f1155z) {
                BaseATActivity.this.overridePendingTransition(0, 0);
            }
        }

        @Override // com.anythink.basead.p021e.AbstractC0778h
        /* JADX INFO: renamed from: f */
        public final void mo553f() {
            this.f1157a = "1";
            BaseATActivity.this.m683a("4", 0L);
        }

        @Override // com.anythink.basead.p021e.AbstractC0778h
        /* JADX INFO: renamed from: g */
        public final void mo554g() {
            if (TextUtils.equals(this.f1157a, "1")) {
                this.f1157a = "2";
            }
            BaseATActivity baseATActivity = BaseATActivity.this;
            StringBuilder sb = new StringBuilder("5-");
            BaseATActivity baseATActivity2 = BaseATActivity.this;
            sb.append(baseATActivity2.f1141l - baseATActivity2.f1142m <= 0 ? "2" : "1");
            baseATActivity.m683a(sb.toString(), 0L);
        }

        @Override // com.anythink.basead.p021e.AbstractC0778h
        /* JADX INFO: renamed from: h */
        public final void mo555h() {
            if (TextUtils.equals(this.f1157a, "1")) {
                this.f1157a = "3";
                BaseATActivity baseATActivity = BaseATActivity.this;
                StringBuilder sb = new StringBuilder("6-");
                BaseATActivity baseATActivity2 = BaseATActivity.this;
                sb.append(baseATActivity2.f1141l - baseATActivity2.f1142m <= 0 ? "2" : "1");
                baseATActivity.m683a(sb.toString(), 0L);
            }
        }

        @Override // com.anythink.basead.p021e.AbstractC0778h
        /* JADX INFO: renamed from: i */
        public final String mo556i() {
            return this.f1157a;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m679a() {
        Intent intent = getIntent();
        try {
            if (intent == null) {
                Log.e("anythink", f1129a + " Intent is null.");
                return;
            }
            this.f1148s = intent.getStringExtra("extra_scenario");
            this.f1149t = intent.getIntExtra(C1115a.a.f2709b, 1);
            this.f1145p = (AbstractC1247l) intent.getSerializableExtra(C1115a.a.f2710c);
            this.f1144o = (C1248m) intent.getSerializableExtra(C1115a.a.f2712e);
            this.f1146q = intent.getStringExtra(C1115a.a.f2711d);
            this.f1155z = m684a(this.f1149t, this.f1144o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0016  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m680a(android.app.Activity r4, com.anythink.core.basead.p044b.C1121c r5) {
        /*
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.anythink.core.common.b.n r1 = com.anythink.core.common.p051b.C1175n.m2059a()
            android.content.Context r1 = r1.m2148f()
            if (r4 == 0) goto L16
            boolean r2 = r4.isFinishing()
            if (r2 != 0) goto L16
            goto L1e
        L16:
            java.lang.String r4 = "anythink_BaseATActivity"
            java.lang.String r2 = "Activity is null"
            android.util.Log.i(r4, r2)
            r4 = r1
        L1e:
            int r1 = r5.f2749a
            com.anythink.core.common.f.m r2 = r5.f2756h
            boolean r1 = m684a(r1, r2)
            int r2 = r5.f2753e
            r3 = 2
            if (r2 != r3) goto L33
            if (r1 == 0) goto L30
            java.lang.Class<com.anythink.basead.ui.ATLandscapeTranslucentActivity> r1 = com.anythink.basead.p025ui.ATLandscapeTranslucentActivity.class
            goto L3a
        L30:
            java.lang.Class<com.anythink.basead.ui.ATLandscapeActivity> r1 = com.anythink.basead.p025ui.ATLandscapeActivity.class
            goto L3a
        L33:
            if (r1 == 0) goto L38
            java.lang.Class<com.anythink.basead.ui.ATPortraitTranslucentActivity> r1 = com.anythink.basead.p025ui.ATPortraitTranslucentActivity.class
            goto L3a
        L38:
            java.lang.Class<com.anythink.basead.ui.ATPortraitActivity> r1 = com.anythink.basead.p025ui.ATPortraitActivity.class
        L3a:
            r0.setClass(r4, r1)
            java.lang.String r1 = r5.f2750b
            java.lang.String r2 = "extra_scenario"
            r0.putExtra(r2, r1)
            int r1 = r5.f2749a
            java.lang.String r2 = "extra_ad_format"
            r0.putExtra(r2, r1)
            com.anythink.core.common.f.l r1 = r5.f2751c
            java.lang.String r2 = "extra_offer_ad"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r5.f2752d
            java.lang.String r2 = "extra_event_id"
            r0.putExtra(r2, r1)
            com.anythink.core.common.f.m r1 = r5.f2756h
            java.lang.String r2 = "extra_request_info"
            r0.putExtra(r2, r1)
            boolean r1 = r4 instanceof android.app.Activity
            if (r1 != 0) goto L69
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
        L69:
            r4.startActivity(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L6d:
            r4 = move-exception
            com.anythink.basead.e.b r0 = com.anythink.basead.p021e.C0772b.m542a()
            java.lang.String r5 = r5.f2752d
            com.anythink.basead.e.b$b r5 = r0.m543a(r5)
            if (r5 == 0) goto L87
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "10000"
            com.anythink.basead.c.e r4 = com.anythink.basead.p015c.C0748f.m310a(r0, r4)
            r5.mo459a(r4)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p025ui.BaseATActivity.m680a(android.app.Activity, com.anythink.core.basead.b.c):void");
    }

    /* JADX INFO: renamed from: a */
    private void m681a(Bundle bundle) {
        if (bundle != null) {
            this.f1151v = bundle.getBoolean(C1115a.a.f2713f);
            this.f1152w = bundle.getBoolean(C1115a.a.f2714g);
            this.f1153x = bundle.getBoolean(C1115a.a.f2715h);
            this.f1154y = bundle.getBoolean(C1115a.a.f2718k);
            this.f1133d = bundle.getLong(C1115a.a.f2720m);
            this.f1134e = bundle.getLong(C1115a.a.f2721n);
            this.f1135f = bundle.getFloat(C1115a.a.f2722o);
            this.f1136g = bundle.getBoolean(C1115a.a.f2716i, false);
            this.f1137h = bundle.getBoolean(C1115a.a.f2723p, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m683a(String str, long j) {
        String string;
        String string2;
        AbstractC1247l abstractC1247l = this.f1145p;
        if (abstractC1247l == null || abstractC1247l.mo2426d() == 10) {
            return;
        }
        try {
            C1248m c1248m = this.f1144o;
            String str2 = c1248m != null ? c1248m.f4323d : "";
            String str3 = c1248m != null ? c1248m.f4321b : "";
            String str4 = c1248m != null ? c1248m.f4322c : "";
            if (c1248m != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1144o.f4329j);
                string = sb.toString();
            } else {
                string = "";
            }
            if (this.f1144o != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f1144o.f4325f);
                string2 = sb2.toString();
            } else {
                string2 = "";
            }
            AbstractC1247l abstractC1247l2 = this.f1145p;
            int iMo2426d = abstractC1247l2 != null ? abstractC1247l2.mo2426d() : -1;
            AbstractC1247l abstractC1247l3 = this.f1145p;
            String strM3229t = abstractC1247l3 != null ? abstractC1247l3.m3229t() : "";
            AbstractC1247l abstractC1247l4 = this.f1145p;
            C1322e.m3921a(str, str2, str3, str4, string, string2, iMo2426d, 0, strM3229t, abstractC1247l4 instanceof C1245j ? ((C1245j) abstractC1247l4).m2485ad() : "", C0762b.m451a(this.f1144o, this.f1145p), j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m684a(int i, C1248m c1248m) {
        AbstractC1249n abstractC1249n;
        if (c1248m == null || (abstractC1249n = c1248m.f4333n) == null || i != 3) {
            return false;
        }
        return TextUtils.equals("2", abstractC1249n.m3265K());
    }

    /* JADX INFO: renamed from: b */
    private BaseScreenATView m686b() {
        return this.f1149t != 3 ? new FullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : this.f1130A != null ? new ThirdPartyFullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u, this.f1130A) : this.f1155z ? (this.f1144o.f4333n.m3313an() == 1 && this.f1150u == 1) ? new LetterHalfScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : new HalfScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : (this.f1144o.f4333n.m3313an() == 1 && this.f1150u == 1) ? new LetterFullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : new FullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u);
    }

    /* JADX INFO: renamed from: b */
    private void m687b(Bundle bundle) {
        C08082 c08082 = new C08082();
        this.f1139j = c08082;
        this.f1143n.setListener(c08082);
        if (bundle != null) {
            this.f1151v = bundle.getBoolean(C1115a.a.f2713f);
            this.f1152w = bundle.getBoolean(C1115a.a.f2714g);
            this.f1153x = bundle.getBoolean(C1115a.a.f2715h);
            this.f1154y = bundle.getBoolean(C1115a.a.f2718k);
            this.f1133d = bundle.getLong(C1115a.a.f2720m);
            this.f1134e = bundle.getLong(C1115a.a.f2721n);
            this.f1135f = bundle.getFloat(C1115a.a.f2722o);
            this.f1136g = bundle.getBoolean(C1115a.a.f2716i, false);
            this.f1137h = bundle.getBoolean(C1115a.a.f2723p, false);
        }
        this.f1143n.setIsShowEndCard(this.f1151v);
        this.f1143n.setHideFeedbackButton(this.f1152w);
        this.f1143n.setHasReward(this.f1154y);
        if (bundle != null) {
            this.f1143n.setVideoMute(this.f1153x);
            this.f1143n.setShowBannerTime(this.f1133d);
            this.f1143n.setHideBannerTime(this.f1134e);
            this.f1143n.setCloseButtonScaleFactor(this.f1135f);
            this.f1143n.setHasPerformClick(this.f1136g);
            this.f1143n.setShowingEndCardAfterVideoPlay(this.f1137h);
        }
        try {
            this.f1143n.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                C0772b.b bVar = this.f1147r;
                if (bVar != null) {
                    bVar.mo459a(C0748f.m310a(C0748f.f729k, C1345i.m4155a(th.getStackTrace())));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            finish();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m688c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, true);
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        BaseScreenATView baseScreenATView = this.f1143n;
        if (baseScreenATView != null) {
            baseScreenATView.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C1175n.m2059a().m2148f() == null) {
            C1175n.m2059a().m2111a(getApplicationContext());
        }
        if (this instanceof ATLandscapeActivity) {
            this.f1150u = 2;
        } else {
            this.f1150u = 1;
        }
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f1148s = intent.getStringExtra("extra_scenario");
                this.f1149t = intent.getIntExtra(C1115a.a.f2709b, 1);
                this.f1145p = (AbstractC1247l) intent.getSerializableExtra(C1115a.a.f2710c);
                this.f1144o = (C1248m) intent.getSerializableExtra(C1115a.a.f2712e);
                this.f1146q = intent.getStringExtra(C1115a.a.f2711d);
                this.f1155z = m684a(this.f1149t, this.f1144o);
            } else {
                Log.e("anythink", f1129a + " Intent is null.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f1147r = C0772b.m542a().m543a(this.f1146q);
        this.f1130A = C0770i.m538a().m539a(this.f1146q);
        m683a("1", 0L);
        C1248m c1248m = this.f1144o;
        if (c1248m == null || c1248m.f4333n == null) {
            StringBuilder sb = new StringBuilder();
            String str = f1129a;
            sb.append(str);
            sb.append("Start Screen Ad Error.");
            Log.e("anythink", sb.toString());
            try {
                C0772b.b bVar = this.f1147r;
                if (bVar != null) {
                    bVar.mo459a(C0748f.m310a(C0748f.f729k, str + "Start FullScreen Ad Error."));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            finish();
            return;
        }
        if (this.f1145p == null) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = f1129a;
            sb2.append(str2);
            sb2.append(" onCreate: OfferAd = null");
            Log.e("anythink", sb2.toString());
            try {
                C0772b.b bVar2 = this.f1147r;
                if (bVar2 != null) {
                    bVar2.mo459a(C0748f.m310a(C0748f.f729k, str2 + " onCreate: OfferAd = null"));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            finish();
            return;
        }
        C1161b.m2009a().m2010a("1", this.f1138i);
        this.f1143n = this.f1149t != 3 ? new FullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : this.f1130A != null ? new ThirdPartyFullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u, this.f1130A) : this.f1155z ? (this.f1144o.f4333n.m3313an() == 1 && this.f1150u == 1) ? new LetterHalfScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : new HalfScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : (this.f1144o.f4333n.m3313an() == 1 && this.f1150u == 1) ? new LetterFullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u) : new FullScreenATView(this, this.f1144o, this.f1145p, this.f1148s, this.f1149t, this.f1150u);
        BaseAd baseAd = this.f1130A;
        ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
        if (customAdContainer != null) {
            customAdContainer.addView(this.f1143n);
            C1360x.m4265a(customAdContainer);
        } else {
            customAdContainer = this.f1143n;
        }
        setContentView(customAdContainer);
        C08082 c08082 = new C08082();
        this.f1139j = c08082;
        this.f1143n.setListener(c08082);
        if (bundle != null) {
            this.f1151v = bundle.getBoolean(C1115a.a.f2713f);
            this.f1152w = bundle.getBoolean(C1115a.a.f2714g);
            this.f1153x = bundle.getBoolean(C1115a.a.f2715h);
            this.f1154y = bundle.getBoolean(C1115a.a.f2718k);
            this.f1133d = bundle.getLong(C1115a.a.f2720m);
            this.f1134e = bundle.getLong(C1115a.a.f2721n);
            this.f1135f = bundle.getFloat(C1115a.a.f2722o);
            this.f1136g = bundle.getBoolean(C1115a.a.f2716i, false);
            this.f1137h = bundle.getBoolean(C1115a.a.f2723p, false);
        }
        this.f1143n.setIsShowEndCard(this.f1151v);
        this.f1143n.setHideFeedbackButton(this.f1152w);
        this.f1143n.setHasReward(this.f1154y);
        if (bundle != null) {
            this.f1143n.setVideoMute(this.f1153x);
            this.f1143n.setShowBannerTime(this.f1133d);
            this.f1143n.setHideBannerTime(this.f1134e);
            this.f1143n.setCloseButtonScaleFactor(this.f1135f);
            this.f1143n.setHasPerformClick(this.f1136g);
            this.f1143n.setShowingEndCardAfterVideoPlay(this.f1137h);
        }
        try {
            this.f1143n.init();
        } catch (Throwable th3) {
            th3.printStackTrace();
            try {
                C0772b.b bVar3 = this.f1147r;
                if (bVar3 != null) {
                    bVar3.mo459a(C0748f.m310a(C0748f.f729k, C1345i.m4155a(th3.getStackTrace())));
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f1132c = null;
        this.f1139j = null;
        C1161b.m2009a().m2012b("1", this.f1138i);
        BaseScreenATView baseScreenATView = this.f1143n;
        if (baseScreenATView != null) {
            baseScreenATView.mo790u();
        }
        AbstractC1247l abstractC1247l = this.f1145p;
        if (abstractC1247l != null && abstractC1247l.m3170I() && !this.f1145p.mo2424P()) {
            C1160l.m1996a().m2006b();
        }
        if (this.f1144o != null) {
            C1318a.m3818a().m3819a(this.f1144o.f4323d + this.f1144o.f4322c);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        long j = this.f1142m + 1;
        this.f1142m = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            AbstractC0778h abstractC0778h = this.f1139j;
            sb.append(abstractC0778h != null ? abstractC0778h.mo556i() : "0");
            m683a(sb.toString(), SystemClock.elapsedRealtime() - this.f1140k);
        }
        this.f1131b = false;
        BaseScreenATView baseScreenATView = this.f1143n;
        if (baseScreenATView != null) {
            baseScreenATView.m789t();
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
        this.f1140k = SystemClock.elapsedRealtime();
        long j = this.f1141l + 1;
        this.f1141l = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            AbstractC0778h abstractC0778h = this.f1139j;
            sb.append(abstractC0778h != null ? abstractC0778h.mo556i() : "0");
            m683a(sb.toString(), 0L);
        }
        this.f1131b = true;
        BaseScreenATView baseScreenATView = this.f1143n;
        if (baseScreenATView != null) {
            baseScreenATView.m788s();
        }
        AbstractC1213af abstractC1213af = this.f1132c;
        if (abstractC1213af != null) {
            abstractC1213af.mo315a(this);
            this.f1132c = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenATView baseScreenATView = this.f1143n;
        if (baseScreenATView != null) {
            if (baseScreenATView.isShowEndCard()) {
                bundle.putBoolean(C1115a.a.f2713f, true);
            }
            bundle.putBoolean(C1115a.a.f2714g, this.f1143n.needHideFeedbackButton());
            bundle.putBoolean(C1115a.a.f2715h, this.f1143n.isVideoMute());
            bundle.putBoolean(C1115a.a.f2718k, this.f1143n.hasReward());
            bundle.putLong(C1115a.a.f2720m, this.f1143n.getShowBannerTime());
            bundle.putLong(C1115a.a.f2721n, this.f1143n.getHideBannerTime());
            bundle.putFloat(C1115a.a.f2722o, this.f1143n.getCloseButtonScaleFactor());
            bundle.putBoolean(C1115a.a.f2716i, this.f1143n.getHasPerformClick());
            bundle.putBoolean(C1115a.a.f2723p, this.f1143n.isShowingEndCardAfterVideoPlay());
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(C1345i.m4154a(this, "myoffer_half_screen_fit_by_o", C1875i.f11530e));
        } else {
            super.setTheme(i);
        }
    }
}
