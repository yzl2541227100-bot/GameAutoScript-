package com.anythink.expressad.video.p154bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p117e.C1797a;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1873g;
import com.anythink.expressad.foundation.p138h.C1874h;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.out.C1935j;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.reward.player.InterfaceC1973c;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2079a;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.module.p172a.p173a.C2176b;
import com.anythink.expressad.video.module.p172a.p173a.C2177c;
import com.anythink.expressad.video.module.p172a.p173a.C2180f;
import com.anythink.expressad.video.module.p172a.p173a.C2182h;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.anythink.expressad.video.module.p172a.p173a.C2188n;
import com.anythink.expressad.video.module.p174b.C2190a;
import com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b;
import com.anythink.expressad.video.p154bt.module.p157b.C2063d;
import com.anythink.expressad.video.p154bt.module.p157b.C2064e;
import com.anythink.expressad.video.p154bt.module.p157b.C2065f;
import com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.video.signal.p176a.C2195c;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p181e.C2337a;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ATTempContainer extends AbstractJSContainer {

    /* JADX INFO: renamed from: B */
    private static final String f12886B = ATTempContainer.class.getSimpleName();

    /* JADX INFO: renamed from: ab */
    private static final long f12887ab = 5000;

    /* JADX INFO: renamed from: ac */
    private static final long f12888ac = 2000;

    /* JADX INFO: renamed from: ad */
    private static final long f12889ad = 100;

    /* JADX INFO: renamed from: ae */
    private static final int f12890ae = -1;

    /* JADX INFO: renamed from: af */
    private static final int f12891af = -2;

    /* JADX INFO: renamed from: ag */
    private static final int f12892ag = -3;

    /* JADX INFO: renamed from: ah */
    private static final int f12893ah = -3;

    /* JADX INFO: renamed from: ai */
    private static final int f12894ai = -4;

    /* JADX INFO: renamed from: am */
    private static final int f12895am = 250;

    /* JADX INFO: renamed from: b */
    public static final int f12896b = 0;

    /* JADX INFO: renamed from: C */
    private View f12897C;

    /* JADX INFO: renamed from: D */
    private C1781c f12898D;

    /* JADX INFO: renamed from: E */
    private C2318c f12899E;

    /* JADX INFO: renamed from: F */
    private InterfaceC2067h f12900F;

    /* JADX INFO: renamed from: G */
    private InterfaceC2059b f12901G;

    /* JADX INFO: renamed from: H */
    private InterfaceC2079a f12902H;

    /* JADX INFO: renamed from: I */
    private int f12903I;

    /* JADX INFO: renamed from: J */
    private String f12904J;

    /* JADX INFO: renamed from: K */
    private C2309b f12905K;

    /* JADX INFO: renamed from: L */
    private int f12906L;

    /* JADX INFO: renamed from: M */
    private int f12907M;

    /* JADX INFO: renamed from: N */
    private boolean f12908N;

    /* JADX INFO: renamed from: O */
    private int f12909O;

    /* JADX INFO: renamed from: P */
    private int f12910P;

    /* JADX INFO: renamed from: Q */
    private int f12911Q;

    /* JADX INFO: renamed from: R */
    private int f12912R;

    /* JADX INFO: renamed from: S */
    private int f12913S;

    /* JADX INFO: renamed from: T */
    private String f12914T;

    /* JADX INFO: renamed from: U */
    private String f12915U;

    /* JADX INFO: renamed from: V */
    private List<C1781c> f12916V;

    /* JADX INFO: renamed from: W */
    private int f12917W;

    /* JADX INFO: renamed from: a */
    public boolean f12918a;

    /* JADX INFO: renamed from: aa */
    private LayoutInflater f12919aa;

    /* JADX INFO: renamed from: aj */
    private int f12920aj;

    /* JADX INFO: renamed from: ak */
    private int f12921ak;

    /* JADX INFO: renamed from: al */
    private int f12922al;

    /* JADX INFO: renamed from: an */
    private View f12923an;

    /* JADX INFO: renamed from: ao */
    private boolean f12924ao;

    /* JADX INFO: renamed from: ap */
    private boolean f12925ap;

    /* JADX INFO: renamed from: aq */
    private boolean f12926aq;

    /* JADX INFO: renamed from: ar */
    private boolean f12927ar;

    /* JADX INFO: renamed from: as */
    private boolean f12928as;

    /* JADX INFO: renamed from: at */
    private boolean f12929at;

    /* JADX INFO: renamed from: au */
    private boolean f12930au;

    /* JADX INFO: renamed from: av */
    private boolean f12931av;

    /* JADX INFO: renamed from: aw */
    private boolean f12932aw;

    /* JADX INFO: renamed from: ax */
    private boolean f12933ax;

    /* JADX INFO: renamed from: ay */
    private MraidVolumeChangeReceiver f12934ay;

    /* JADX INFO: renamed from: az */
    private Runnable f12935az;

    /* JADX INFO: renamed from: c */
    public boolean f12936c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2033a f12937d;

    /* JADX INFO: renamed from: e */
    public WindVaneWebView f12938e;

    /* JADX INFO: renamed from: f */
    public AnythinkVideoView f12939f;

    /* JADX INFO: renamed from: g */
    public AnythinkContainerView f12940g;

    /* JADX INFO: renamed from: h */
    public Handler f12941h;

    /* JADX INFO: renamed from: i */
    public Runnable f12942i;

    /* JADX INFO: renamed from: j */
    public Runnable f12943j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1973c f12944k;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$5 */
    public class C20295 implements InterfaceC1798a {
        public C20295() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            String string;
            ATTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.f12886B;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) ATTempContainer.this.f12938e, AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            String string;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.f12886B;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) ATTempContainer.this.f12938e, AbsFeedBackForH5.f6738a, strEncodeToString);
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            String string;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C1175n.m2059a().m2148f() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.f12886B;
                th.getMessage();
                string = "";
            }
            String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
            C1469j.m5701a();
            C1469j.m5703a((WebView) ATTempContainer.this.f12938e, AbsFeedBackForH5.f6738a, strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$6 */
    public class C20306 implements MraidVolumeChangeReceiver.VolumeChangeListener {
        public C20306() {
        }

        @Override // com.anythink.expressad.atsignalcommon.mraid.MraidVolumeChangeReceiver.VolumeChangeListener
        public final void onVolumeChanged(double d) {
            AnythinkContainerView anythinkContainerView;
            String unused = ATTempContainer.f12886B;
            try {
                if (!ATTempContainer.this.f12898D.m8800H() || (anythinkContainerView = ATTempContainer.this.f12940g) == null || anythinkContainerView.getH5EndCardView() == null) {
                    return;
                }
                ATTempContainer.this.f12940g.getH5EndCardView().volumeChange(d);
            } catch (Exception e) {
                String unused2 = ATTempContainer.f12886B;
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$7 */
    public class RunnableC20317 implements Runnable {
        public RunnableC20317() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.f12923an.setBackgroundColor(0);
            ATTempContainer.this.f12923an.setVisibility(0);
            ATTempContainer.this.f12923an.bringToFront();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$8 */
    public class RunnableC20328 implements Runnable {
        public RunnableC20328() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.f12923an.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$a */
    public interface InterfaceC2033a {

        /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$a$a */
        public static class a implements InterfaceC2033a {

            /* JADX INFO: renamed from: b */
            private static final String f12953b = "ActivityErrorListener";

            /* JADX INFO: renamed from: a */
            private boolean f12954a = false;

            @Override // com.anythink.expressad.video.p154bt.module.ATTempContainer.InterfaceC2033a
            /* JADX INFO: renamed from: a */
            public void mo10947a(String str) {
                this.f12954a = true;
            }

            @Override // com.anythink.expressad.video.p154bt.module.ATTempContainer.InterfaceC2033a
            /* JADX INFO: renamed from: a */
            public final boolean mo10948a() {
                return this.f12954a;
            }

            @Override // com.anythink.expressad.video.p154bt.module.ATTempContainer.InterfaceC2033a
            /* JADX INFO: renamed from: b */
            public final void mo10949b() {
                this.f12954a = true;
            }
        }

        /* JADX INFO: renamed from: a */
        void mo10947a(String str);

        /* JADX INFO: renamed from: a */
        boolean mo10948a();

        /* JADX INFO: renamed from: b */
        void mo10949b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$b */
    public final class C2034b extends C2180f {

        /* JADX INFO: renamed from: V */
        private Activity f12955V;

        /* JADX INFO: renamed from: W */
        private C1781c f12956W;

        public C2034b(Activity activity, C1781c c1781c) {
            this.f12955V = activity;
            this.f12956W = c1781c;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[PHI: r0
  0x008c: PHI (r0v10 com.anythink.expressad.video.signal.c) = (r0v8 com.anythink.expressad.video.signal.c), (r0v28 com.anythink.expressad.video.signal.c) binds: [B:44:0x00f1, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo10950a(int r9, java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.p154bt.module.ATTempContainer.C2034b.mo10950a(int, java.lang.Object):void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$c */
    public final class C2035c extends C2180f {
        private C2035c() {
        }

        public /* synthetic */ C2035c(ATTempContainer aTTempContainer, byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
        /* JADX INFO: renamed from: a */
        public final void mo10950a(int i, Object obj) {
            ATTempContainer aTTempContainer;
            int i2;
            super.mo10950a(i, obj);
            try {
                String string = obj instanceof JSONObject ? obj.toString() : (String) obj;
                if (ATTempContainer.this.f14285u && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt(C1781c.f10283bX);
                    if (iOptInt == 2) {
                        aTTempContainer = ATTempContainer.this;
                        i2 = C1801a.f11135cx;
                    } else if (iOptInt != 3) {
                        aTTempContainer = ATTempContainer.this;
                        i2 = C1801a.f11133cv;
                    } else {
                        aTTempContainer = ATTempContainer.this;
                        i2 = C1801a.f11134cw;
                    }
                    aTTempContainer.f12906L = i2;
                    ATTempContainer.this.f12907M = iOptInt2;
                }
            } catch (Exception unused) {
            }
            if (i == 120) {
                ATTempContainer.this.f12900F.mo10421c();
                if (ATTempContainer.this.f12944k != null) {
                }
                return;
            }
            if (i == 126) {
                ATTempContainer.this.f12900F.mo10416a(ATTempContainer.this.f12898D);
                if (ATTempContainer.this.f12944k != null) {
                    return;
                } else {
                    return;
                }
            }
            if (i == 127) {
                ATTempContainer.m10914h(ATTempContainer.this);
                ATTempContainer.this.f12900F.mo10415a();
                ATTempContainer.this.f12900F.mo10421c();
                ATTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i) {
                case 100:
                    ATTempContainer.m10932q(ATTempContainer.this);
                    ATTempContainer aTTempContainer2 = ATTempContainer.this;
                    aTTempContainer2.f12941h.postDelayed(aTTempContainer2.f12935az, 250L);
                    ATTempContainer.this.f12900F.mo10415a();
                    break;
                case 101:
                case 102:
                    ATTempContainer.this.getJSCommon().mo11576j();
                    break;
                case 103:
                    ATTempContainer.m10914h(ATTempContainer.this);
                    if (!ATTempContainer.this.f12898D.m8800H()) {
                        ATTempContainer.this.getJSCommon().mo11576j();
                    } else {
                        ATTempContainer.m10920k(ATTempContainer.this);
                    }
                    break;
                case 104:
                    ATTempContainer.m10920k(ATTempContainer.this);
                    break;
                case 105:
                    ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$d */
    public class C2036d extends C2195c.a {
        private C2036d() {
        }

        public /* synthetic */ C2036d(ATTempContainer aTTempContainer, byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public final void mo10951a(int i, String str) {
            super.mo10951a(i, str);
            ATTempContainer.this.defaultLoad(i, str);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10050a(C1781c c1781c, String str) {
            super.mo10050a(c1781c, str);
            ATTempContainer.m10936s(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public final void mo10952a(C1781c c1781c, boolean z) {
            super.mo10952a(c1781c, z);
            ATTempContainer.this.f12900F.mo10416a(c1781c);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10052a(C1935j c1935j, String str) {
            super.mo10052a(c1935j, str);
            ATTempContainer.m10938t(ATTempContainer.this);
            ATTempContainer.m10940u(ATTempContainer.this);
            if (c1935j == null || !(c1935j instanceof C1781c)) {
                return;
            }
            try {
                C1781c c1781c = (C1781c) c1935j;
                String strOptString = new JSONObject(ATTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                if (c1781c.m8809Q() == 3 && c1781c.m8795C() == 2 && strOptString.equals("1.0") && ATTempContainer.this.f14277m != null) {
                    if (ATTempContainer.this.f14290z) {
                        ATTempContainer.m10920k(ATTempContainer.this);
                    } else {
                        ATTempContainer.this.f14277m.finish();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: b */
        public final void mo10056b(C1935j c1935j, String str) {
            super.mo10056b(c1935j, str);
            ATTempContainer.m10940u(ATTempContainer.this);
            ATTempContainer.m10938t(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: c */
        public final void mo10953c() {
            super.mo10953c();
            ATTempContainer.this.receiveSuccess();
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: d */
        public final void mo10954d() {
            super.mo10954d();
            ATTempContainer aTTempContainer = ATTempContainer.this;
            Handler handler = aTTempContainer.f12941h;
            if (handler != null) {
                handler.removeCallbacks(aTTempContainer.f12942i);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$e */
    public final class C2037e extends C2180f {
        private C2037e() {
        }

        public /* synthetic */ C2037e(ATTempContainer aTTempContainer, byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
        /* JADX INFO: renamed from: a */
        public final void mo10950a(int i, Object obj) {
            super.mo10950a(i, obj);
            if (ATTempContainer.this.f14285u) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            ATTempContainer.this.f12906L = jSONObject.getInt("Alert_window_status");
                            ATTempContainer.this.f12907M = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            if (i != 2) {
                if (i == 121) {
                    ATTempContainer.m10914h(ATTempContainer.this);
                    ATTempContainer.this.f12900F.mo10420b();
                    ATTempContainer.this.f12930au = false;
                    return;
                }
                if (i == 16) {
                    ATTempContainer.m10920k(ATTempContainer.this);
                    return;
                }
                if (i == 17) {
                    ATTempContainer.m10914h(ATTempContainer.this);
                    AnythinkContainerView anythinkContainerView = ATTempContainer.this.f12940g;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 10:
                        ATTempContainer.this.f12930au = true;
                        if (ATTempContainer.this.f12898D != null) {
                            if (!ATTempContainer.this.f12898D.m8886j()) {
                                ATTempContainer.this.f12900F.mo10415a();
                            } else if (!ATTempContainer.this.f14290z) {
                                ATTempContainer.this.f12900F.mo10415a();
                            } else if (ATTempContainer.this.f12898D.m8892l()) {
                                ATTempContainer.this.f12900F.mo10415a();
                            }
                        }
                        break;
                }
                return;
            }
            if (i == 12 && !ATTempContainer.this.f12930au) {
                if (ATTempContainer.this.f14280p.m12076U() == 0) {
                    ATTempContainer.this.f12900F.mo10417a("play error");
                    ATTempContainer.this.f12930au = false;
                    ATTempContainer.m10920k(ATTempContainer.this);
                    return;
                } else if (ATTempContainer.this.f12898D == null || !ATTempContainer.this.f12898D.m8886j() || !ATTempContainer.this.f14290z || ATTempContainer.this.f12898D.m8892l()) {
                    ATTempContainer.this.f12900F.mo10415a();
                }
            }
            ATTempContainer.this.getJSVideoModule().videoOperate(3);
            ATTempContainer.this.f12930au = false;
        }
    }

    public ATTempContainer(Context context) {
        super(context);
        this.f12903I = 1;
        this.f12904J = "";
        this.f12906L = C1801a.f11133cv;
        this.f12908N = false;
        this.f12914T = "";
        this.f12916V = new ArrayList();
        this.f12917W = 0;
        this.f12918a = false;
        this.f12936c = false;
        this.f12937d = new InterfaceC2033a.a();
        this.f12941h = new Handler();
        this.f12920aj = 0;
        this.f12921ak = 0;
        this.f12922al = 0;
        this.f12942i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().mo11548h() != 0) {
                    ATTempContainer.this.f12920aj = -3;
                } else {
                    Log.d(ATTempContainer.f12886B, "run: WebView load timeout");
                    ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f12943j = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().mo11548h() == 0) {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                } else {
                    ATTempContainer.this.f12920aj = -4;
                }
            }
        };
        this.f12924ao = false;
        this.f12925ap = false;
        this.f12926aq = false;
        this.f12928as = false;
        this.f12929at = false;
        this.f12930au = false;
        this.f12931av = false;
        this.f12932aw = false;
        this.f12933ax = false;
        this.f12935az = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.f12923an != null) {
                    ATTempContainer.this.f12923an.setVisibility(8);
                }
            }
        };
        init(context);
    }

    public ATTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12903I = 1;
        this.f12904J = "";
        this.f12906L = C1801a.f11133cv;
        this.f12908N = false;
        this.f12914T = "";
        this.f12916V = new ArrayList();
        this.f12917W = 0;
        this.f12918a = false;
        this.f12936c = false;
        this.f12937d = new InterfaceC2033a.a();
        this.f12941h = new Handler();
        this.f12920aj = 0;
        this.f12921ak = 0;
        this.f12922al = 0;
        this.f12942i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().mo11548h() != 0) {
                    ATTempContainer.this.f12920aj = -3;
                } else {
                    Log.d(ATTempContainer.f12886B, "run: WebView load timeout");
                    ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.f12943j = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().mo11548h() == 0) {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                } else {
                    ATTempContainer.this.f12920aj = -4;
                }
            }
        };
        this.f12924ao = false;
        this.f12925ap = false;
        this.f12926aq = false;
        this.f12928as = false;
        this.f12929at = false;
        this.f12930au = false;
        this.f12931av = false;
        this.f12932aw = false;
        this.f12933ax = false;
        this.f12935az = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.f12923an != null) {
                    ATTempContainer.this.f12923an.setVisibility(8);
                }
            }
        };
        init(context);
    }

    /* JADX INFO: renamed from: a */
    private int m10894a(int i, int i2) {
        List<C1781c> list;
        if (i < 0 || (list = this.f12916V) == null || list.size() == 0 || i2 <= 1) {
            return i;
        }
        int iM10155bi = 0;
        for (int i3 = 0; i3 < i2 - 1; i3++) {
            if (this.f12916V.get(i3) != null) {
                iM10155bi += this.f12916V.get(i3).m10155bi();
            }
        }
        if (i > iM10155bi) {
            return i - iM10155bi;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m10898a(int i, String str) {
        try {
            C1796r c1796r = new C1796r();
            c1796r.m9326h(C1796r.f10870i);
            c1796r.m9320c("code=" + i + ",desc=" + str);
            C1781c c1781c = this.f12898D;
            c1796r.m9318b((c1781c == null || c1781c.m8805M() == null) ? "" : this.f12898D.m8805M().m8957e());
            c1796r.m9324f(this.f14278n);
            C1781c c1781c2 = this.f12898D;
            c1796r.m9325g(c1781c2 != null ? c1781c2.m10146aZ() : "");
            C1781c c1781c3 = this.f12898D;
            if (c1781c3 != null && !TextUtils.isEmpty(c1781c3.m8818Z())) {
                c1796r.m9322d(this.f12898D.m8818Z());
            }
            C1781c c1781c4 = this.f12898D;
            if (c1781c4 != null && !TextUtils.isEmpty(c1781c4.m8832aa())) {
                c1796r.m9323e(this.f12898D.m8832aa());
            }
            getContext();
            int iM9690a = C1877k.m9690a();
            c1796r.m9319c(iM9690a);
            c1796r.m9328j(C1877k.m9692a(getContext(), iM9690a));
            C1796r.m9259a(c1796r);
            C2190a.m11521a();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: c */
    private static RelativeLayout.LayoutParams m10904c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: d */
    private void m10906d() {
        if (this.f12918a) {
            setMatchParent();
        }
    }

    /* JADX INFO: renamed from: e */
    private int m10907e() {
        C2202j c2202jM11734b = m11734b(this.f12898D);
        if (c2202jM11734b != null) {
            return c2202jM11734b.mo11562c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    private int m10909f() {
        if (getJSCommon() != null) {
            return getJSCommon().mo11580n();
        }
        return 1;
    }

    /* JADX INFO: renamed from: g */
    private int m10911g() {
        C2202j c2202jM11734b = m11734b(this.f12898D);
        if (c2202jM11734b != null) {
            return c2202jM11734b.mo11559b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private boolean m10913h() {
        C2202j c2202jM11734b = m11734b(this.f12898D);
        if (c2202jM11734b != null) {
            return c2202jM11734b.mo11558a();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m10914h(ATTempContainer aTTempContainer) {
        aTTempContainer.f12925ap = true;
        return true;
    }

    /* JADX INFO: renamed from: i */
    private boolean m10915i() {
        AnythinkVideoView anythinkVideoView = this.f12939f;
        if (anythinkVideoView != null) {
            return anythinkVideoView.isShowingAlertView() || this.f12939f.isInstallDialogShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    private void m10918j() {
        int iM9847f;
        int iM9845e;
        try {
            if (this.f12938e != null) {
                int i = getResources().getConfiguration().orientation;
                if (m10913h()) {
                    iM9847f = C1886t.m9849g(getContext());
                    iM9845e = C1886t.m9851h(getContext());
                    if (C1873g.m9680a(getContext())) {
                        int iM9853i = C1886t.m9853i(getContext());
                        if (i == 2) {
                            iM9847f += iM9853i;
                        } else {
                            iM9845e += iM9853i;
                        }
                    }
                } else {
                    iM9847f = C1886t.m9847f(getContext());
                    iM9845e = C1886t.m9845e(getContext());
                }
                int iM8955c = this.f12898D.m8805M().m8955c();
                if (m11736c(this.f12898D) == 1) {
                    iM8955c = i;
                }
                getJSNotifyProxy().mo11584a(i, iM8955c, iM9847f, iM9845e);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C1801a.f11119ch, C1886t.m9841c(getContext()));
                try {
                    if (this.f14282r != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f14282r.m11969a());
                        jSONObject2.put("amount", this.f14282r.m11972b());
                        jSONObject2.put("id", this.f14283s);
                        jSONObject.put("userId", this.f14281q);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.f14284t);
                        jSONObject.put(C1186g.a.f3498h, this.f12915U);
                    }
                } catch (JSONException e) {
                    e.getMessage();
                } catch (Exception e2) {
                    e2.getMessage();
                }
                getJSNotifyProxy().mo11587a(jSONObject.toString());
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f12938e, "oncutoutfetched", Base64.encodeToString(this.f12914T.getBytes(), 0));
                getJSCommon().mo11573h();
                loadModuleDatas();
                this.f12941h.postDelayed(this.f12942i, 2000L);
            }
        } catch (Exception e3) {
            if (C1404a.f6209a) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m10919k() {
        int i = this.f12920aj;
        Runnable runnable = i == -3 ? this.f12942i : i == -4 ? this.f12943j : null;
        if (runnable != null) {
            runnable.run();
            this.f12920aj = 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m10920k(ATTempContainer aTTempContainer) {
        int i;
        try {
            InterfaceC2059b interfaceC2059b = aTTempContainer.f12901G;
            if (interfaceC2059b == null) {
                Activity activity = aTTempContainer.f14277m;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (aTTempContainer.f14285u && ((i = aTTempContainer.f14287w) == C1801a.f11129cr || i == C1801a.f11130cs)) {
                boolean z = true;
                if (aTTempContainer.f12907M != 1) {
                    z = false;
                }
                interfaceC2059b.mo10996a(z, aTTempContainer.f12906L);
            }
            aTTempContainer.f12901G.mo10995a(aTTempContainer.f12904J, aTTempContainer.f12925ap, aTTempContainer.f14282r);
        } catch (Exception unused) {
            Activity activity2 = aTTempContainer.f14277m;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m10921l() {
        this.f12938e = findWindVaneWebView();
        AnythinkVideoView anythinkVideoViewFindAnythinkVideoView = findAnythinkVideoView();
        this.f12939f = anythinkVideoViewFindAnythinkVideoView;
        anythinkVideoViewFindAnythinkVideoView.setVideoLayout(this.f12898D);
        this.f12939f.setIsIV(this.f14285u);
        this.f12939f.setUnitId(this.f14278n);
        this.f12939f.setCamPlayOrderCallback(this.f12902H, this.f12916V, this.f12903I, this.f12917W);
        this.f12939f.setTempEventListener(this.f12944k);
        if (this.f14290z) {
            this.f12939f.setNotchPadding(this.f12910P, this.f12911Q, this.f12912R, this.f12913S);
        }
        AnythinkContainerView anythinkContainerViewFindAnythinkContainerView = findAnythinkContainerView();
        this.f12940g = anythinkContainerViewFindAnythinkContainerView;
        if (this.f14290z) {
            anythinkContainerViewFindAnythinkContainerView.setNotchPadding(this.f12909O, this.f12910P, this.f12911Q, this.f12912R, this.f12913S);
        }
        return (this.f12939f == null || this.f12940g == null || !initViews()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    private void m10923m() {
        if (this.f14280p == null) {
            this.f14280p = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f14278n, this.f14285u);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ boolean m10924m(ATTempContainer aTTempContainer) {
        aTTempContainer.f12931av = true;
        return true;
    }

    /* JADX INFO: renamed from: n */
    private static void m10926n() {
    }

    /* JADX INFO: renamed from: o */
    private void m10928o() {
        int i;
        try {
            InterfaceC2059b interfaceC2059b = this.f12901G;
            if (interfaceC2059b == null) {
                Activity activity = this.f14277m;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f14285u && ((i = this.f14287w) == C1801a.f11129cr || i == C1801a.f11130cs)) {
                boolean z = true;
                if (this.f12907M != 1) {
                    z = false;
                }
                interfaceC2059b.mo10996a(z, this.f12906L);
            }
            this.f12901G.mo10995a(this.f12904J, this.f12925ap, this.f14282r);
        } catch (Exception unused) {
            Activity activity2 = this.f14277m;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m10929p() {
    }

    /* JADX INFO: renamed from: q */
    private void m10931q() {
        ViewGroup viewGroup;
        List<C1781c> list;
        WindVaneWebView windVaneWebView = this.f12938e;
        byte b = 0;
        this.f12905K = new C2309b(this.f14277m, windVaneWebView, this.f12939f, this.f12940g, this.f12898D, new C2036d(this, b));
        C1781c c1781c = this.f12898D;
        if (c1781c != null && c1781c.m8887k() == 5 && (list = this.f12916V) != null) {
            this.f12905K.m11738a(list);
        }
        registerJsFactory(this.f12905K);
        C1800b.m9367a().m9380a(this.f14278n + "_1", new C20295());
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f12897C.findViewById(C1875i.m9684a(getContext(), "anythink_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.f12905K);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof C2202j) {
            this.f12905K.m11737a((C2202j) windVaneWebView.getObject());
            getJSCommon().mo11550a(this.f14284t);
            getJSCommon().mo11556a(this.f14278n);
            getJSCommon().mo11555a(this.f14280p);
            getJSCommon().mo11554a(new C2036d(this, b));
            C1781c c1781c2 = this.f12898D;
            if (c1781c2 != null && (c1781c2.m8800H() || this.f12898D.m8856ay())) {
                MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                this.f12934ay = mraidVolumeChangeReceiver;
                mraidVolumeChangeReceiver.registerReceiver();
                this.f12934ay.getCurrentVolume();
                this.f12934ay.setVolumeChangeListener(new C20306());
            }
            getJSContainerModule().readyStatus(((C2202j) windVaneWebView.getObject()).m11619r());
            m10918j();
            ((C2202j) windVaneWebView.getObject()).f13918r.mo10953c();
            if (this.f14290z) {
                getJSCommon().mo11569f(this.f12921ak);
                getJSCommon().mo11567e(this.f12922al);
            }
        }
        if (getJSCommon().mo11568f() == 1 && (viewGroup = (ViewGroup) this.f12897C.findViewById(C1875i.m9684a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f12897C).removeView(viewGroup);
            ((ViewGroup) this.f12897C).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m10932q(ATTempContainer aTTempContainer) {
        aTTempContainer.f12932aw = true;
        return true;
    }

    /* JADX INFO: renamed from: r */
    private void m10934r() {
        getJSCommon().mo11550a(this.f14284t);
        getJSCommon().mo11556a(this.f14278n);
        getJSCommon().mo11555a(this.f14280p);
        getJSCommon().mo11554a(new C2036d(this, (byte) 0));
        C1781c c1781c = this.f12898D;
        if (c1781c != null) {
            if (c1781c.m8800H() || this.f12898D.m8856ay()) {
                MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                this.f12934ay = mraidVolumeChangeReceiver;
                mraidVolumeChangeReceiver.registerReceiver();
                this.f12934ay.getCurrentVolume();
                this.f12934ay.setVolumeChangeListener(new C20306());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m10935s() {
        if (this.f12925ap) {
            C2190a.m11525a(this.f12898D, this.f14282r, this.f14278n, this.f14281q, this.f12915U);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m10936s(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f14277m.runOnUiThread(aTTempContainer.new RunnableC20317());
        }
    }

    /* JADX INFO: renamed from: t */
    private void m10937t() {
        C1781c c1781c;
        int i;
        C1781c c1781c2;
        int i2;
        boolean z = true;
        try {
            this.f12924ao = true;
            C1781c c1781c3 = this.f12898D;
            if (c1781c3 != null && c1781c3.m8802J() == 2) {
                this.f12925ap = true;
            }
            InterfaceC2067h interfaceC2067h = this.f12900F;
            if (interfaceC2067h != null) {
                if (this.f14285u && ((i2 = this.f14287w) == C1801a.f11129cr || i2 == C1801a.f11130cs)) {
                    if (this.f12907M != 1) {
                        z = false;
                    }
                    interfaceC2067h.mo10418a(z, this.f12906L);
                }
                if (!this.f12925ap) {
                    this.f14282r.m11970a(0);
                }
                this.f12900F.mo10419a(this.f12925ap, this.f14282r);
            }
            this.f12941h.removeCallbacks(this.f12935az);
            if (((!this.f14285u && !this.f14290z) || ((c1781c = this.f12898D) != null && c1781c.m8886j())) && this.f12925ap) {
                C2190a.m11525a(this.f12898D, this.f14282r, this.f14278n, this.f14281q, this.f12915U);
            }
            if (!this.f14290z) {
                if (this.f14285u) {
                    i = C1801a.f11010aU;
                    c1781c2 = this.f12898D;
                } else {
                    i = 94;
                    c1781c2 = this.f12898D;
                }
                C2314a.m11749b(i, c1781c2);
            }
            AnythinkContainerView anythinkContainerView = this.f12940g;
            if (anythinkContainerView != null) {
                anythinkContainerView.release();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m10938t(ATTempContainer aTTempContainer) {
        aTTempContainer.f12929at = true;
        return true;
    }

    /* JADX INFO: renamed from: u */
    private static int m10939u() {
        try {
            C2337a c2337aM12002b = C2339c.m11994a().m12002b();
            if (c2337aM12002b == null) {
                C2339c.m11994a();
                C2339c.m11998c();
            }
            if (c2337aM12002b != null) {
                return (int) c2337aM12002b.m11989g();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m10940u(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f14277m.runOnUiThread(aTTempContainer.new RunnableC20328());
        }
    }

    /* JADX INFO: renamed from: v */
    private void m10942v() {
        if (isLoadSuccess()) {
            this.f14277m.runOnUiThread(new RunnableC20317());
        }
    }

    /* JADX INFO: renamed from: w */
    private void m10943w() {
        if (isLoadSuccess()) {
            this.f14277m.runOnUiThread(new RunnableC20328());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    /* JADX INFO: renamed from: a */
    public final void mo10946a(String str) {
        InterfaceC2067h interfaceC2067h = this.f12900F;
        if (interfaceC2067h != null) {
            interfaceC2067h.mo10417a(str);
        }
        super.mo10946a(str);
    }

    public boolean canBackPress() {
        AnythinkContainerView anythinkContainerView = this.f12940g;
        return anythinkContainerView == null || anythinkContainerView.canBackPress();
    }

    public void defaultLoad(int i, String str) {
        int i2;
        superDefaultLoad(i, str);
        if (!isLoadSuccess()) {
            m10898a(i, str);
            Activity activity = this.f14277m;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        byte b = 0;
        if (this.f12898D.m8802J() == 2) {
            this.f12940g.setCampaign(this.f12898D);
            this.f12940g.addOrderViewData(this.f12916V);
            this.f12940g.setUnitID(this.f14278n);
            this.f12940g.setCloseDelayTime(this.f12898D.m8875g() > -2 ? this.f12898D.m8875g() : this.f14280p.m12098p());
            this.f12940g.setPlayCloseBtnTm(this.f14280p.m12092j());
            this.f12940g.setNotifyListener(new C2182h(this.f12898D, this.f12899E, this.f14282r, m11735b(), this.f14278n, new C2035c(this, b), this.f14280p.m12068M(), this.f14290z));
            this.f12940g.preLoadData(this.f12905K);
            this.f12940g.showPlayableView();
            return;
        }
        m10898a(i, str);
        this.f12923an.setVisibility(8);
        loadModuleDatas();
        int iM12088f = this.f14280p.m12088f();
        int iM10907e = m10907e();
        int i3 = iM10907e != 0 ? iM10907e : iM12088f;
        C1781c c1781c = this.f12898D;
        if (c1781c != null && c1781c.m8886j()) {
            this.f12939f.setContainerViewOnNotifyListener(new C2034b(this.f14277m, this.f12898D));
        }
        C1781c c1781c2 = this.f12898D;
        int iM12087e = (c1781c2 == null || c1781c2.m8878h() <= -2) ? this.f14280p.m12087e() : this.f12898D.m8878h();
        if (this.f12898D.m8887k() == 5 && (i2 = this.f12903I) > 1) {
            iM12087e = m10894a(iM12087e, i2);
            this.f12898D.m8820a(iM12087e);
        }
        int i4 = iM12087e;
        this.f12939f.setVideoSkipTime(i4);
        AnythinkVideoView anythinkVideoView = this.f12939f;
        anythinkVideoView.setNotifyListener(new C2187m(anythinkVideoView, this.f12940g, this.f12898D, this.f14282r, this.f12899E, m11735b(), this.f14278n, i3, i4, new C2037e(this, b), this.f14280p.m12068M(), this.f14290z, this.f14280p.m12076U()));
        this.f12939f.defaultShow();
        AnythinkContainerView anythinkContainerView = this.f12940g;
        anythinkContainerView.setNotifyListener(new C2176b(this.f12939f, anythinkContainerView, this.f12898D, this.f14282r, this.f12899E, m11735b(), this.f14278n, new C2034b(this.f14277m, this.f12898D), this.f14280p.m12068M(), this.f14290z));
        this.f12940g.defaultShow();
    }

    public AnythinkContainerView findAnythinkContainerView() {
        return (AnythinkContainerView) findViewById(findID("anythink_video_templete_container"));
    }

    public AnythinkVideoView findAnythinkVideoView() {
        return (AnythinkVideoView) findViewById(findID("anythink_video_templete_videoview"));
    }

    public int findID(String str) {
        return C1875i.m9684a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C1875i.m9684a(getContext(), str, "layout");
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.f14290z) {
                C2314a.a aVarM11739a = this.f14285u ? C2314a.m11739a(C1801a.f11010aU, this.f12898D) : C2314a.m11739a(94, this.f12898D);
                if (aVarM11739a == null || !aVarM11739a.m11763c()) {
                    return null;
                }
                if (this.f14285u) {
                    C2314a.m11749b(C1801a.f11010aU, this.f12898D);
                } else {
                    C2314a.m11749b(94, this.f12898D);
                }
                WindVaneWebView windVaneWebViewM11758a = aVarM11739a.m11758a();
                if (this.f12928as) {
                    windVaneWebViewM11758a.setWebViewTransparent();
                }
                return windVaneWebViewM11758a;
            }
            C1781c c1781c = this.f12898D;
            if (c1781c == null || c1781c.m8805M() == null) {
                return null;
            }
            C2314a.a aVarM11740a = C2314a.m11740a(this.f14278n + "_" + this.f12898D.m10146aZ() + "_" + this.f12898D.m8818Z() + "_" + this.f12898D.m8805M().m8957e());
            if (aVarM11740a != null) {
                return aVarM11740a.m11758a();
            }
            return null;
        } catch (Exception e) {
            if (!C1404a.f6209a) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    public C1781c getCampaign() {
        return this.f12898D;
    }

    public String getInstanceId() {
        return this.f12904J;
    }

    public int getLayoutID() {
        return findLayout(this.f12928as ? "anythink_reward_activity_video_templete_transparent" : "anythink_reward_activity_video_templete");
    }

    public void init(Context context) {
        this.f12919aa = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("anythink_video_templete_progressbar"));
        this.f12923an = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean isLoadSuccess() {
        return this.f12936c;
    }

    public void loadModuleDatas() {
        int i;
        int i2;
        C2202j c2202jM11734b = m11734b(this.f12898D);
        byte b = 0;
        int iMo11559b = c2202jM11734b != null ? c2202jM11734b.mo11559b() : 0;
        if (iMo11559b != 0) {
            this.f14284t = iMo11559b;
        }
        int iM12088f = this.f14280p.m12088f();
        int iM10907e = m10907e();
        int i3 = iM10907e != 0 ? iM10907e : iM12088f;
        this.f12939f.setSoundState(this.f14284t);
        this.f12939f.setCampaign(this.f12898D);
        this.f12939f.setPlayURL(this.f12899E.m11837r());
        C1781c c1781c = this.f12898D;
        int iM12087e = (c1781c == null || c1781c.m8878h() <= -2) ? this.f14280p.m12087e() : this.f12898D.m8878h();
        if (this.f12898D.m8887k() == 5 && (i2 = this.f12903I) > 1) {
            iM12087e = m10894a(iM12087e, i2);
            this.f12898D.m8820a(iM12087e);
        }
        this.f12939f.setVideoSkipTime(iM12087e);
        this.f12939f.setCloseAlert(this.f14280p.m12093k());
        this.f12939f.setBufferTimeout(m10939u());
        this.f12939f.setNotifyListener(new C2188n(this.f12905K, this.f12898D, this.f14282r, this.f12899E, m11735b(), this.f14278n, i3, iM12087e, new C2037e(this, b), this.f14280p.m12068M(), this.f14290z, this.f14280p.m12076U()));
        this.f12939f.setShowingTransparent(this.f12928as);
        if (this.f14285u && ((i = this.f14287w) == C1801a.f11129cr || i == C1801a.f11130cs)) {
            this.f12939f.setIVRewardEnable(i, this.f14288x, this.f14289y);
            this.f12939f.setDialogRole(getJSCommon() != null ? getJSCommon().mo11580n() : 1);
        }
        this.f12940g.setCampaign(this.f12898D);
        this.f12940g.addOrderViewData(this.f12916V);
        this.f12940g.setUnitID(this.f14278n);
        this.f12940g.setCloseDelayTime(this.f12898D.m8875g() > -2 ? this.f12898D.m8875g() : this.f14280p.m12098p());
        this.f12940g.setPlayCloseBtnTm(this.f14280p.m12092j());
        this.f12940g.setVideoInteractiveType(this.f14280p.m12090h());
        this.f12940g.setEndscreenType(this.f14280p.m12100r());
        this.f12940g.setVideoSkipTime(iM12087e);
        this.f12940g.setShowingTransparent(this.f12928as);
        this.f12940g.setJSFactory(this.f12905K);
        if (this.f12898D.m8802J() == 2) {
            this.f12940g.setNotifyListener(new C2182h(this.f12898D, this.f12899E, this.f14282r, m11735b(), this.f14278n, new C2035c(this, (byte) 0), this.f14280p.m12068M(), this.f14290z));
            this.f12940g.preLoadData(this.f12905K);
            this.f12940g.showPlayableView();
        } else {
            this.f12940g.setNotifyListener(new C2177c(this.f12905K, this.f12898D, this.f14282r, this.f12899E, m11735b(), this.f14278n, new C2034b(this.f14277m, this.f12898D), this.f14280p.m12068M(), this.f14290z));
            this.f12940g.preLoadData(this.f12905K);
            this.f12939f.preLoadData(this.f12905K);
        }
        if (this.f12928as) {
            this.f12940g.setAnythinkClickMiniCardViewTransparent();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f12938e;
        if (windVaneWebView != null) {
            String str2 = this.f12904J;
            C1469j.m5701a();
            C1469j.m5703a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    public void onBackPressed() {
        Activity activity;
        AnythinkContainerView anythinkContainerView;
        AnythinkContainerView anythinkContainerView2;
        AnythinkVideoView anythinkVideoView;
        AnythinkVideoView anythinkVideoView2;
        if (this.f12928as && (anythinkVideoView2 = this.f12939f) != null) {
            anythinkVideoView2.notifyVideoClose();
            return;
        }
        if (this.f12930au && (anythinkVideoView = this.f12939f) != null) {
            if (!anythinkVideoView.isMiniCardShowing()) {
                this.f12939f.onBackPress();
                return;
            }
            AnythinkContainerView anythinkContainerView3 = this.f12940g;
            if (anythinkContainerView3 != null) {
                anythinkContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.f12932aw && (anythinkContainerView2 = this.f12940g) != null) {
            anythinkContainerView2.onPlayableBackPress();
            return;
        }
        if (this.f12931av && (anythinkContainerView = this.f12940g) != null) {
            anythinkContainerView.onEndcardBackPress();
        }
        if (getJSCommon().mo11571g()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo11547g();
                return;
            }
            return;
        }
        if (!canBackPress() || (activity = this.f14277m) == null || this.f14290z || this.f12933ax) {
            return;
        }
        this.f12933ax = true;
        activity.onBackPressed();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        ViewGroup viewGroup;
        List<C1781c> list;
        new StringBuilder("onCreate isBigOffer: ").append(this.f14290z);
        if (this.f14280p == null) {
            this.f14280p = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f14278n, this.f14285u);
        }
        byte b = 0;
        this.f12933ax = false;
        try {
            if (this.f14290z) {
                C1781c c1781c = this.f12898D;
                this.f12900F = (c1781c == null || !c1781c.m8886j()) ? new C2063d(this.f12901G, this.f12904J) : new C2064e(getContext(), this.f14285u, this.f14280p, this.f12898D, this.f12900F, m11735b(), this.f14278n);
            } else {
                this.f12900F = new C2064e(getContext(), this.f14285u, this.f14280p, this.f12898D, this.f12900F, m11735b(), this.f14278n);
            }
            registerErrorListener(new C2065f(this.f12900F));
            m11732a(this.f14280p, this.f12898D);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                mo10946a("layoutID not found");
                return;
            }
            View viewInflate = this.f12919aa.inflate(layoutID, (ViewGroup) null);
            this.f12897C = viewInflate;
            addView(viewInflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f12918a) {
                setMatchParent();
            }
            this.f12938e = findWindVaneWebView();
            AnythinkVideoView anythinkVideoViewFindAnythinkVideoView = findAnythinkVideoView();
            this.f12939f = anythinkVideoViewFindAnythinkVideoView;
            anythinkVideoViewFindAnythinkVideoView.setVideoLayout(this.f12898D);
            this.f12939f.setIsIV(this.f14285u);
            this.f12939f.setUnitId(this.f14278n);
            this.f12939f.setCamPlayOrderCallback(this.f12902H, this.f12916V, this.f12903I, this.f12917W);
            this.f12939f.setTempEventListener(this.f12944k);
            if (this.f14290z) {
                this.f12939f.setNotchPadding(this.f12910P, this.f12911Q, this.f12912R, this.f12913S);
            }
            AnythinkContainerView anythinkContainerViewFindAnythinkContainerView = findAnythinkContainerView();
            this.f12940g = anythinkContainerViewFindAnythinkContainerView;
            if (this.f14290z) {
                anythinkContainerViewFindAnythinkContainerView.setNotchPadding(this.f12909O, this.f12910P, this.f12911Q, this.f12912R, this.f12913S);
            }
            if (!((this.f12939f == null || this.f12940g == null || !initViews()) ? false : true)) {
                this.f12937d.mo10947a(C1797a.f10925b);
                Activity activity = this.f14277m;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f12936c = true;
            WindVaneWebView windVaneWebView = this.f12938e;
            this.f12905K = new C2309b(this.f14277m, windVaneWebView, this.f12939f, this.f12940g, this.f12898D, new C2036d(this, b));
            C1781c c1781c2 = this.f12898D;
            if (c1781c2 != null && c1781c2.m8887k() == 5 && (list = this.f12916V) != null) {
                this.f12905K.m11738a(list);
            }
            registerJsFactory(this.f12905K);
            C1800b.m9367a().m9380a(this.f14278n + "_1", new C20295());
            if (windVaneWebView == null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f12897C.findViewById(C1875i.m9684a(getContext(), "anythink_video_templete_webview_parent", "id"));
            windVaneWebView.setApiManagerJSFactory(this.f12905K);
            if (windVaneWebView.getParent() != null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            if (windVaneWebView.getObject() instanceof C2202j) {
                this.f12905K.m11737a((C2202j) windVaneWebView.getObject());
                getJSCommon().mo11550a(this.f14284t);
                getJSCommon().mo11556a(this.f14278n);
                getJSCommon().mo11555a(this.f14280p);
                getJSCommon().mo11554a(new C2036d(this, b));
                C1781c c1781c3 = this.f12898D;
                if (c1781c3 != null && (c1781c3.m8800H() || this.f12898D.m8856ay())) {
                    MraidVolumeChangeReceiver mraidVolumeChangeReceiver = new MraidVolumeChangeReceiver(getContext());
                    this.f12934ay = mraidVolumeChangeReceiver;
                    mraidVolumeChangeReceiver.registerReceiver();
                    this.f12934ay.getCurrentVolume();
                    this.f12934ay.setVolumeChangeListener(new C20306());
                }
                getJSContainerModule().readyStatus(((C2202j) windVaneWebView.getObject()).m11619r());
                m10918j();
                ((C2202j) windVaneWebView.getObject()).f13918r.mo10953c();
                if (this.f14290z) {
                    getJSCommon().mo11569f(this.f12921ak);
                    getJSCommon().mo11567e(this.f12922al);
                }
            }
            if (getJSCommon().mo11568f() == 1 && (viewGroup = (ViewGroup) this.f12897C.findViewById(C1875i.m9684a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                ((ViewGroup) this.f12897C).removeView(viewGroup);
                ((ViewGroup) this.f12897C).addView(viewGroup, 1);
            }
            viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
        } catch (Throwable th) {
            mo10946a("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        C1781c c1781c;
        int i;
        C1781c c1781c2;
        int i2;
        if (this.f12908N) {
            return;
        }
        boolean z = true;
        this.f12908N = true;
        super.onDestroy();
        try {
            AnythinkVideoView anythinkVideoView = this.f12939f;
            if (anythinkVideoView != null) {
                anythinkVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f12938e;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f12938e.clearWebView();
                this.f12938e.release();
            }
            if (this.f12901G != null) {
                this.f12901G = null;
            }
            this.f12941h.removeCallbacks(this.f12942i);
            this.f12941h.removeCallbacks(this.f12943j);
            getJSCommon().mo11577k();
            if (this.f14285u) {
                C1486b.m6002a();
                C1486b.m6012c(this.f14278n);
            }
            if (!this.f12924ao) {
                try {
                    this.f12924ao = true;
                    C1781c c1781c3 = this.f12898D;
                    if (c1781c3 != null && c1781c3.m8802J() == 2) {
                        this.f12925ap = true;
                    }
                    InterfaceC2067h interfaceC2067h = this.f12900F;
                    if (interfaceC2067h != null) {
                        if (this.f14285u && ((i2 = this.f14287w) == C1801a.f11129cr || i2 == C1801a.f11130cs)) {
                            if (this.f12907M != 1) {
                                z = false;
                            }
                            interfaceC2067h.mo10418a(z, this.f12906L);
                        }
                        if (!this.f12925ap) {
                            this.f14282r.m11970a(0);
                        }
                        this.f12900F.mo10419a(this.f12925ap, this.f14282r);
                    }
                    this.f12941h.removeCallbacks(this.f12935az);
                    if (((!this.f14285u && !this.f14290z) || ((c1781c = this.f12898D) != null && c1781c.m8886j())) && this.f12925ap) {
                        C2190a.m11525a(this.f12898D, this.f14282r, this.f14278n, this.f14281q, this.f12915U);
                    }
                    if (!this.f14290z) {
                        if (this.f14285u) {
                            i = C1801a.f11010aU;
                            c1781c2 = this.f12898D;
                        } else {
                            i = 94;
                            c1781c2 = this.f12898D;
                        }
                        C2314a.m11749b(i, c1781c2);
                    }
                    AnythinkContainerView anythinkContainerView = this.f12940g;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.release();
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            MraidVolumeChangeReceiver mraidVolumeChangeReceiver = this.f12934ay;
            if (mraidVolumeChangeReceiver != null) {
                mraidVolumeChangeReceiver.unregisterReceiver();
            }
            if (!this.f14290z) {
                if (isLoadSuccess()) {
                    this.f12941h.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ATTempContainer.this.f14277m != null) {
                                ATTempContainer.this.f14277m.finish();
                            }
                        }
                    }, 100L);
                } else {
                    Activity activity = this.f14277m;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            C2024c.m10829a();
            C2024c.m10850f(this.f12904J);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.f12926aq = true;
        try {
            getJSVideoModule().videoOperate(2);
            AnythinkContainerView anythinkContainerView = this.f12940g;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnPause();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        int i = this.f12920aj;
        Runnable runnable = i == -3 ? this.f12942i : i == -4 ? this.f12943j : null;
        if (runnable != null) {
            runnable.run();
            this.f12920aj = 0;
        }
        try {
            if (this.f12939f != null && !m10915i() && !this.f12939f.isMiniCardShowing() && !C1800b.f10958c) {
                this.f12939f.setCover(false);
            }
            AnythinkContainerView anythinkContainerView = this.f12940g;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnResume();
            }
            if (this.f12926aq && !m10915i() && !C1800b.f10958c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f14277m;
            if (activity2 != null) {
                C1886t.m9826a(activity2.getWindow().getDecorView());
            }
            if (this.f12928as && this.f12929at && (activity = this.f14277m) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        AnythinkVideoView anythinkVideoView = this.f12939f;
        if (anythinkVideoView != null) {
            anythinkVideoView.setCover(true);
        }
    }

    public void preload() {
    }

    public void receiveSuccess() {
        this.f12941h.removeCallbacks(this.f12943j);
        this.f12941h.postDelayed(this.f12935az, 250L);
    }

    public void registerErrorListener(InterfaceC2033a interfaceC2033a) {
        this.f12937d = interfaceC2033a;
    }

    public void setAnythinkTempCallback(InterfaceC2059b interfaceC2059b) {
        this.f12901G = interfaceC2059b;
    }

    public void setCamPlayOrderCallback(InterfaceC2079a interfaceC2079a, int i) {
        this.f12902H = interfaceC2079a;
        this.f12903I = i;
    }

    public void setCampOrderViewData(List<C1781c> list, int i) {
        if (list != null) {
            this.f12916V = list;
        }
        this.f12917W = i;
    }

    public void setCampaign(C1781c c1781c) {
        this.f12898D = c1781c;
        if (c1781c != null) {
            if (TextUtils.isEmpty(c1781c.m8803K()) && !TextUtils.isEmpty(this.f14278n)) {
                c1781c.m8891l(this.f14278n);
            }
            C1800b.m9367a().m9379a(c1781c.m8803K() + "_1", c1781c);
        }
    }

    public void setCampaignDownLoadTask(C2318c c2318c) {
        this.f12899E = c2318c;
    }

    public void setCampaignExpired(boolean z) {
        try {
            C1781c c1781c = this.f12898D;
            if (c1781c != null) {
                if (!z) {
                    c1781c.m8870e(0);
                    if (this.f12898D.m8793A()) {
                        this.f12898D.m8894m(0);
                        return;
                    }
                    C2340d c2340d = this.f14280p;
                    if (c2340d != null) {
                        this.f12898D.m8894m(c2340d.m12078a());
                        return;
                    }
                    return;
                }
                c1781c.m8870e(1);
                if (this.f14286v) {
                    this.f12898D.m8894m(0);
                    return;
                }
                C2340d c2340d2 = this.f14280p;
                if (c2340d2 != null) {
                    if (c2340d2.m12068M() == 1) {
                        this.f12898D.m8894m(1);
                    } else {
                        this.f12898D.m8894m(0);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f12915U = str;
    }

    public void setH5Cbp(int i) {
        this.f12922al = i;
    }

    public void setInstanceId(String str) {
        this.f12904J = str;
    }

    public void setJSFactory(C2309b c2309b) {
        this.f12905K = c2309b;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        this.f12909O = i;
        this.f12910P = i2;
        this.f12911Q = i3;
        this.f12912R = i4;
        this.f12913S = i5;
        this.f12914T = C1874h.m9682a(i, i2, i3, i4, i5);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f12914T)) {
            getJSCommon().mo11561b(this.f12914T);
            if (this.f12938e != null && !TextUtils.isEmpty(this.f12914T)) {
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f12938e, "oncutoutfetched", Base64.encodeToString(this.f12914T.getBytes(), 0));
            }
        }
        AnythinkVideoView anythinkVideoView = this.f12939f;
        if (anythinkVideoView != null) {
            anythinkVideoView.setNotchPadding(i2, i3, i4, i5);
        }
        AnythinkContainerView anythinkContainerView = this.f12940g;
        if (anythinkContainerView != null) {
            anythinkContainerView.setNotchPadding(i, i2, i3, i4, i5);
        }
    }

    public void setShowRewardListener(InterfaceC2067h interfaceC2067h) {
        this.f12900F = interfaceC2067h;
    }

    public void setShowingTransparent() {
        int iM9684a;
        Activity activity;
        boolean zM10913h = m10913h();
        this.f12928as = zM10913h;
        if (zM10913h || (iM9684a = C1875i.m9684a(getContext(), "anythink_reward_theme", C1875i.f11530e)) <= 1 || (activity = this.f14277m) == null) {
            return;
        }
        activity.setTheme(iM9684a);
    }

    public void setTempEventListener(InterfaceC1973c interfaceC1973c) {
        this.f12944k = interfaceC1973c;
    }

    public void setWebViewFront(int i) {
        this.f12921ak = i;
    }

    public void superDefaultLoad(int i, String str) {
        StringBuilder sb = new StringBuilder("receiveError:");
        sb.append(i);
        sb.append(",descroption:");
        sb.append(str);
        this.f12941h.removeCallbacks(this.f12942i);
        this.f12941h.removeCallbacks(this.f12943j);
        this.f12937d.mo10949b();
        WindVaneWebView windVaneWebView = this.f12938e;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }
}
