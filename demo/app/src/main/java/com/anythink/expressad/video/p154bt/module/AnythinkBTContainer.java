package com.anythink.expressad.video.p154bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.AbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1874h;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.out.C1935j;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.video.dynview.C2068a;
import com.anythink.expressad.video.dynview.C2071b;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.video.dynview.p159b.C2072a;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p162e.InterfaceC2078a;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2082d;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.module.p174b.C2190a;
import com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a;
import com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b;
import com.anythink.expressad.video.p154bt.module.p157b.C2063d;
import com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.InterfaceC2208b;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.video.signal.p176a.C2195c;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p179c.C2333c;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import com.anythink.expressad.widget.FeedBackButton;
import com.octopus.p222ad.widget.ScrollClickView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements InterfaceC2208b {

    /* JADX INFO: renamed from: d */
    private static final String f12962d = AnythinkBTContainer.class.getSimpleName();

    /* JADX INFO: renamed from: B */
    private TextView f12963B;

    /* JADX INFO: renamed from: C */
    private boolean f12964C;

    /* JADX INFO: renamed from: D */
    private boolean f12965D;

    /* JADX INFO: renamed from: E */
    private String f12966E;

    /* JADX INFO: renamed from: F */
    private boolean f12967F;

    /* JADX INFO: renamed from: G */
    private List<C1781c> f12968G;

    /* JADX INFO: renamed from: H */
    private List<C2318c> f12969H;

    /* JADX INFO: renamed from: I */
    private InterfaceC2058a f12970I;

    /* JADX INFO: renamed from: J */
    private InterfaceC2067h f12971J;

    /* JADX INFO: renamed from: K */
    private InterfaceC2067h f12972K;

    /* JADX INFO: renamed from: L */
    private InterfaceC2059b f12973L;

    /* JADX INFO: renamed from: M */
    private String f12974M;

    /* JADX INFO: renamed from: N */
    private String f12975N;

    /* JADX INFO: renamed from: O */
    private boolean f12976O;

    /* JADX INFO: renamed from: P */
    private int f12977P;

    /* JADX INFO: renamed from: Q */
    private boolean f12978Q;

    /* JADX INFO: renamed from: R */
    private int f12979R;

    /* JADX INFO: renamed from: S */
    private String f12980S;

    /* JADX INFO: renamed from: T */
    private InterfaceC2082d f12981T;

    /* JADX INFO: renamed from: a */
    public C1781c f12982a;

    /* JADX INFO: renamed from: e */
    private int f12983e;

    /* JADX INFO: renamed from: f */
    private int f12984f;

    /* JADX INFO: renamed from: g */
    private FrameLayout f12985g;

    /* JADX INFO: renamed from: h */
    private AnythinkBTLayout f12986h;

    /* JADX INFO: renamed from: i */
    private WindVaneWebView f12987i;

    /* JADX INFO: renamed from: j */
    private LayoutInflater f12988j;

    /* JADX INFO: renamed from: k */
    private Context f12989k;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTContainer$2 */
    public class C20392 implements InterfaceC2086h {
        public C20392() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10989a(C2068a c2068a) {
            C1781c c1781c;
            StringBuilder sb;
            String str;
            if (AnythinkBTContainer.this.f12985g == null || c2068a.m11055a() == null) {
                AnythinkBTContainer.this.mo10946a("nativeview is null");
                return;
            }
            AnythinkBTContainer.this.f12985g.removeAllViews();
            AnythinkBTContainer.this.f12985g.addView(c2068a.m11055a());
            AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
            anythinkBTContainer.f12963B = (TextView) anythinkBTContainer.findViewById(anythinkBTContainer.findID("anythink_choice_one_countdown_tv"));
            if (AnythinkBTContainer.this.f12970I != null) {
                AnythinkBTContainer.this.f12970I.mo10467a();
            }
            if (AnythinkBTContainer.this.f12968G == null || AnythinkBTContainer.this.f12968G.size() <= 0 || (c1781c = (C1781c) AnythinkBTContainer.this.f12968G.get(0)) == null) {
                return;
            }
            String strM8840ai = c1781c.m8840ai();
            C2340d c2340dM11999a = C2339c.m11994a().m11999a(C1773a.m8548c().m8558f(), AnythinkBTContainer.this.f14278n);
            int iM12068M = c2340dM11999a != null ? c2340dM11999a.m12068M() : 1;
            if (c1781c.m8896n() == 1) {
                sb = new StringBuilder();
                sb.append(strM8840ai);
                str = "&to=1&cbt=";
            } else {
                sb = new StringBuilder();
                sb.append(strM8840ai);
                str = "&to=0&cbt=";
            }
            sb.append(str);
            sb.append(c1781c.m8857az());
            sb.append("&tmorl=");
            sb.append(iM12068M);
            C1405a.m5186a(C1175n.m2059a().m2148f(), c1781c, AnythinkBTContainer.this.f14278n, sb.toString(), false, true, C1406a.f6270j);
            C1807f.f11184h.put(c1781c.m8840ai(), Long.valueOf(System.currentTimeMillis()));
            AnythinkBTContainer.this.m10988a(c1781c);
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10990a(EnumC2076b enumC2076b) {
            String str;
            if (enumC2076b != null) {
                str = "errorCode:" + enumC2076b.m11123a() + "Msg:" + enumC2076b.m11124b();
            } else {
                str = "";
            }
            AnythinkBTContainer.this.mo10946a("nativeview is null".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTContainer$a */
    public class C2041a extends C2195c.a {
        private C2041a() {
        }

        public /* synthetic */ C2041a(AnythinkBTContainer anythinkBTContainer, byte b) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public final void mo10951a(int i, String str) {
            super.mo10951a(i, str);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10050a(C1781c c1781c, String str) {
            super.mo10050a(c1781c, str);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: a */
        public final void mo10952a(C1781c c1781c, boolean z) {
            super.mo10952a(c1781c, z);
            AnythinkBTContainer.this.f12972K.mo10416a(c1781c);
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.out.C1941p.c
        /* JADX INFO: renamed from: a */
        public final void mo10052a(C1935j c1935j, String str) {
            super.mo10052a(c1935j, str);
            if (c1935j == null || !(c1935j instanceof C1781c)) {
                return;
            }
            try {
                C1781c c1781c = (C1781c) c1935j;
                String strOptString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                if (c1781c.m8809Q() == 3 && c1781c.m8795C() == 2 && strOptString.equals("1.0") && AnythinkBTContainer.this.f14277m != null) {
                    if (AnythinkBTContainer.this.f12965D) {
                        AnythinkBTContainer.this.onAdClose();
                    } else {
                        AnythinkBTContainer.this.f14277m.finish();
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
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: c */
        public final void mo10953c() {
            super.mo10953c();
        }

        @Override // com.anythink.expressad.video.signal.p176a.C2195c.a, com.anythink.expressad.video.signal.InterfaceC2209c.a
        /* JADX INFO: renamed from: d */
        public final void mo10954d() {
            super.mo10954d();
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.f12983e = 0;
        this.f12984f = 1;
        this.f12964C = false;
        this.f12965D = true;
        this.f12967F = false;
        this.f12977P = 1;
        init(context);
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12983e = 0;
        this.f12984f = 1;
        this.f12964C = false;
        this.f12965D = true;
        this.f12967F = false;
        this.f12977P = 1;
        init(context);
    }

    /* JADX INFO: renamed from: a */
    private void m10959a(Context context) {
        if (this.f12981T == null) {
            mo10946a("ChoiceOneCallback is null");
            return;
        }
        HashMap map = new HashMap();
        map.put(C2069a.f13126D, this.f12981T);
        C2071b.m11062a();
        C2071b.m11063a(context, this.f12968G, new C20392(), map);
    }

    /* JADX INFO: renamed from: a */
    private boolean m10961a(boolean z) {
        C2340d c2340d;
        try {
            c2340d = this.f14280p;
        } catch (Throwable unused) {
        }
        if (c2340d == null) {
            return false;
        }
        int iM12066K = c2340d.m12066K();
        if (iM12066K == 1) {
            return z;
        }
        if (iM12066K == 2) {
            return z && m10974g();
        }
        if (iM12066K != 3) {
            return false;
        }
        return m10974g();
    }

    /* JADX INFO: renamed from: b */
    private WindVaneWebView m10963b(String str) {
        C2314a.a aVarM11740a = C2314a.m11740a(str);
        if (aVarM11740a == null) {
            return null;
        }
        this.f12966E = aVarM11740a.m11762b();
        new StringBuilder("get BT wraper.getTag = ").append(this.f12966E);
        aVarM11740a.m11760a("");
        return aVarM11740a.m11758a();
    }

    /* JADX INFO: renamed from: c */
    private InterfaceC2059b m10965c() {
        if (this.f12973L == null) {
            this.f12973L = new InterfaceC2059b() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.3
                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: a */
                public final void mo10991a() {
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: a */
                public final void mo10992a(String str) {
                    if (AnythinkBTContainer.this.f12987i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(C1404a.f6238y, AnythinkBTContainer.this.f14279o);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.f14278n);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f12962d;
                            new StringBuilder(" BT Call H5 onAdShow ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            String unused2 = AnythinkBTContainer.f12962d;
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: a */
                public final void mo10993a(String str, C1781c c1781c) {
                    AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                    anythinkBTContainer.f12982a = c1781c;
                    if (anythinkBTContainer.f12987i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(C1404a.f6238y, AnythinkBTContainer.this.f14279o);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.f14278n);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f12962d;
                            new StringBuilder(" BT Call H5 onVideoAdClicked ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            String unused2 = AnythinkBTContainer.f12962d;
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: a */
                public final void mo10994a(String str, String str2) {
                    if (AnythinkBTContainer.this.f12987i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(C1404a.f6238y, AnythinkBTContainer.this.f14279o);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.f14278n);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f12962d;
                            new StringBuilder(" BT Call H5 onShowFail ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            String unused2 = AnythinkBTContainer.f12962d;
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: a */
                public final void mo10995a(String str, boolean z, C2333c c2333c) {
                    if (AnythinkBTContainer.this.f12987i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (c2333c != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", c2333c.m11969a());
                                jSONObject3.put("amount", c2333c.m11972b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z);
                            jSONObject2.put("convert", z ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f12962d;
                            new StringBuilder(" BT Call H5 onAdClose ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            String unused2 = AnythinkBTContainer.f12962d;
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: a */
                public final void mo10996a(boolean z, int i) {
                    AnythinkBTContainer.this.f12978Q = z;
                    AnythinkBTContainer.this.f12979R = i;
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: b */
                public final void mo10997b(String str) {
                    if (AnythinkBTContainer.this.f12987i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(C1404a.f6238y, AnythinkBTContainer.this.f14279o);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.f14278n);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f12962d;
                            new StringBuilder(" BT Call H5 onVideoComplete ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            String unused2 = AnythinkBTContainer.f12962d;
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2059b
                /* JADX INFO: renamed from: c */
                public final void mo10998c(String str) {
                    if (AnythinkBTContainer.this.f12987i != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(C1404a.f6238y, AnythinkBTContainer.this.f14279o);
                            jSONObject2.put("unitId", AnythinkBTContainer.this.f14278n);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f12962d;
                            new StringBuilder(" BT Call H5 onEndcardShow ").append(jSONObject.toString());
                        } catch (JSONException e) {
                            String unused2 = AnythinkBTContainer.f12962d;
                            e.getMessage();
                        }
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            };
        }
        return this.f12973L;
    }

    /* JADX INFO: renamed from: d */
    private C2318c m10966d(C1781c c1781c) {
        List<C2318c> list = this.f12969H;
        if (list == null || c1781c == null) {
            return null;
        }
        for (C2318c c2318c : list) {
            if (c2318c.m11833n().m10146aZ().equals(c1781c.m10146aZ())) {
                return c2318c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static void m10968d() {
    }

    /* JADX INFO: renamed from: e */
    private static boolean m10970e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    private static int m10971f() {
        return 1;
    }

    /* JADX INFO: renamed from: g */
    private boolean m10974g() {
        try {
            C2340d c2340d = this.f14280p;
            if (c2340d == null) {
                return false;
            }
            double dM12067L = c2340d.m12067L();
            if (dM12067L == 1.0d) {
                return false;
            }
            return new Random().nextDouble() > dM12067L;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10988a(C1781c c1781c) {
        if (c1781c != null) {
            try {
                List<String> listM8869e = c1781c.m8869e();
                if (listM8869e == null || listM8869e.size() <= 0) {
                    return;
                }
                Iterator<String> it = listM8869e.iterator();
                while (it.hasNext()) {
                    C1405a.m5185a(C1175n.m2059a().m2148f(), c1781c, this.f14278n, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    /* JADX INFO: renamed from: a */
    public final void mo10946a(String str) {
        InterfaceC2067h interfaceC2067h = this.f12971J;
        if (interfaceC2067h != null) {
            interfaceC2067h.mo10417a(str);
        }
        super.mo10946a(str);
    }

    public void appendSubView(AnythinkBTContainer anythinkBTContainer, ATTempContainer aTTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context contextM2148f = C1175n.m2059a().m2148f();
                int iOptInt = jSONObject.optInt(ScrollClickView.DIR_LEFT, C2024c.f12852a);
                int iOptInt2 = jSONObject.optInt("top", C2024c.f12852a);
                int iOptInt3 = jSONObject.optInt(ScrollClickView.DIR_RIGHT, C2024c.f12852a);
                int iOptInt4 = jSONObject.optInt("bottom", C2024c.f12852a);
                if (iOptInt != -999 && contextM2148f != null) {
                    layoutParams.leftMargin = C1886t.m9834b(contextM2148f, iOptInt);
                }
                if (iOptInt2 != -999 && contextM2148f != null) {
                    layoutParams.topMargin = C1886t.m9834b(contextM2148f, iOptInt2);
                }
                if (iOptInt3 != -999 && contextM2148f != null) {
                    layoutParams.rightMargin = C1886t.m9834b(contextM2148f, iOptInt3);
                }
                if (iOptInt4 != -999 && contextM2148f != null) {
                    layoutParams.bottomMargin = C1886t.m9834b(contextM2148f, iOptInt4);
                }
                int iOptInt5 = jSONObject.optInt("width");
                int iOptInt6 = jSONObject.optInt("height");
                if (iOptInt5 > 0) {
                    layoutParams.width = iOptInt5;
                }
                if (iOptInt6 > 0) {
                    layoutParams.height = iOptInt6;
                }
            }
            anythinkBTContainer.addView(aTTempContainer, layoutParams);
            aTTempContainer.setActivity(this.f14277m);
            aTTempContainer.setMute(this.f14284t);
            aTTempContainer.setBidCampaign(this.f12964C);
            aTTempContainer.setIV(this.f14285u);
            aTTempContainer.setBigOffer(this.f12965D);
            aTTempContainer.setIVRewardEnable(this.f14287w, this.f14288x, this.f14289y);
            aTTempContainer.setShowRewardListener(this.f12972K);
            aTTempContainer.setCampaignDownLoadTask(m10966d(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(m10965c());
            aTTempContainer.setH5Cbp(getJSCommon().mo11566e());
            aTTempContainer.setWebViewFront(getJSCommon().mo11568f());
            aTTempContainer.init(this.f12989k);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f12987i != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f12983e);
                jSONObject2.put("id", this.f12966E);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f12987i, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C2024c.m10829a();
                C2024c.m10832a((WebView) this.f12987i, "broadcast", this.f12966E);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2305d
    public void click(int i, String str) {
    }

    public int findID(String str) {
        return C1875i.m9684a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C1875i.m9684a(getContext(), str, "layout");
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2305d
    public void handlerH5Exception(int i, String str) {
    }

    public void init(Context context) {
        this.f12989k = context;
        this.f12988j = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(C1781c c1781c) {
        if (getJSCommon().mo11566e() != 1 && c1781c != null) {
            if (c1781c.m8896n() == 1) {
                C2340d c2340d = this.f14280p;
                if (c2340d != null) {
                    if (c2340d.m12068M() == 1) {
                        c1781c.m8894m(1);
                        return true;
                    }
                    c1781c.m8894m(0);
                    return false;
                }
            } else {
                if (c1781c.m8793A()) {
                    c1781c.m8894m(0);
                    return false;
                }
                int iM12078a = this.f14280p.m12078a();
                c1781c.m8894m(iM12078a);
                if (iM12078a == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.f14277m;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onBackPressed();
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onBackPressed();
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void onCreate() {
        String strM8849ar;
        WindVaneWebView windVaneWebViewM11758a;
        C1781c c1781c;
        try {
            int iFindLayout = findLayout("anythink_bt_container");
            if (iFindLayout < 0) {
                mo10946a("anythink_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f12988j.inflate(iFindLayout, this);
            this.f12985g = frameLayout;
            if (frameLayout == null) {
                mo10946a("ViewIds null");
                return;
            }
            this.f12975N = "";
            List<C1781c> list = this.f12968G;
            byte b = 0;
            if (list == null || list.size() <= 0) {
                strM8849ar = "";
            } else {
                C1781c c1781c2 = this.f12968G.get(0);
                strM8849ar = c1781c2.m8849ar();
                this.f12975N = c1781c2.m8818Z();
            }
            C2314a.a aVarM11740a = C2314a.m11740a(this.f14278n + "_" + this.f12975N + "_" + strM8849ar);
            RelativeLayout.LayoutParams layoutParams = null;
            if (aVarM11740a != null) {
                this.f12966E = aVarM11740a.m11762b();
                new StringBuilder("get BT wraper.getTag = ").append(this.f12966E);
                aVarM11740a.m11760a("");
                windVaneWebViewM11758a = aVarM11740a.m11758a();
            } else {
                windVaneWebViewM11758a = null;
            }
            this.f12987i = windVaneWebViewM11758a;
            C2314a.m11751b(this.f14278n + "_" + this.f12975N + "_" + strM8849ar);
            WindVaneWebView windVaneWebView = this.f12987i;
            if (windVaneWebView == null) {
                List<C1781c> list2 = this.f12968G;
                if (list2 == null || list2.size() <= 0 || (c1781c = this.f12968G.get(0)) == null || !c1781c.m8886j()) {
                    mo10946a("big template webview is null");
                    return;
                }
                Context context = this.f12989k;
                if (this.f12981T == null) {
                    mo10946a("ChoiceOneCallback is null");
                    return;
                }
                HashMap map = new HashMap();
                map.put(C2069a.f13126D, this.f12981T);
                C2071b.m11062a();
                C2071b.m11063a(context, this.f12968G, new C20392(), map);
                return;
            }
            C2309b c2309b = new C2309b(this.f14277m, this, windVaneWebView);
            registerJsFactory(c2309b);
            this.f12987i.setApiManagerJSFactory(c2309b);
            if (this.f12987i.getParent() != null) {
                mo10946a("preload template webview is null or load error");
                return;
            }
            if (this.f12987i.getObject() instanceof C2202j) {
                c2309b.m11737a((C2202j) this.f12987i.getObject());
                if (this.f12987i != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C1801a.f11119ch, C1886t.m9841c(getContext()));
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f14282r.m11969a());
                        jSONObject2.put("amount", this.f14282r.m11972b());
                        jSONObject2.put("id", this.f14283s);
                        jSONObject.put("userId", this.f14281q);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.f14284t);
                        jSONObject.put(C1186g.a.f3498h, this.f12980S);
                    } catch (JSONException e) {
                        e.getMessage();
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    this.f12972K = new C2063d(m10965c(), "");
                    getJSNotifyProxy().mo11587a(jSONObject.toString());
                    getJSCommon().mo11573h();
                    getJSCommon().mo11554a(new C2041a(this, b));
                }
                ((C2195c) getJSCommon()).f13918r.mo10953c();
            }
            this.f12987i.setBackgroundColor(0);
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || !linkedHashMapM10868b.containsKey(this.f12966E)) {
                mo10946a("big template webviewLayout is null");
                return;
            }
            View view = linkedHashMapM10868b.get(this.f12966E);
            if (view instanceof AnythinkBTLayout) {
                AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                this.f12986h = anythinkBTLayout;
                anythinkBTLayout.addView(this.f12987i, 0, new FrameLayout.LayoutParams(-1, -1));
                C1800b.m9367a().m9380a(this.f14278n + "_1", new InterfaceC1798a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.1
                    @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
                    /* JADX INFO: renamed from: a */
                    public final void mo5503a() {
                        String string;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (C1175n.m2059a().m2148f() != null) {
                                jSONObject3.put("status", 1);
                            }
                            string = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f12962d;
                            th.getMessage();
                            string = "";
                        }
                        String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, AbsFeedBackForH5.f6738a, strEncodeToString);
                    }

                    @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
                    /* JADX INFO: renamed from: b */
                    public final void mo5504b() {
                        String string;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (C1175n.m2059a().m2148f() != null) {
                                jSONObject3.put("status", 2);
                            }
                            string = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f12962d;
                            th.getMessage();
                            string = "";
                        }
                        String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, AbsFeedBackForH5.f6738a, strEncodeToString);
                    }

                    @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
                    /* JADX INFO: renamed from: c */
                    public final void mo5505c() {
                        String string;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (C1175n.m2059a().m2148f() != null) {
                                jSONObject3.put("status", 2);
                            }
                            string = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f12962d;
                            th.getMessage();
                            string = "";
                        }
                        String strEncodeToString = Base64.encodeToString(string.getBytes(), 2);
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) AnythinkBTContainer.this.f12987i, AbsFeedBackForH5.f6738a, strEncodeToString);
                    }
                });
                C1800b.m9367a().m9385c(this.f14278n + "_2");
                FeedBackButton feedBackButtonM9382b = C1800b.m9367a().m9382b(this.f14278n + "_1");
                if (C1800b.m9367a().m9384b() && feedBackButtonM9382b != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) feedBackButtonM9382b.getLayoutParams();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(C1800b.f10956a, C1800b.f10957b);
                    }
                    layoutParams.topMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
                    layoutParams.leftMargin = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
                    feedBackButtonM9382b.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) feedBackButtonM9382b.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(feedBackButtonM9382b);
                    }
                    this.f12986h.addView(feedBackButtonM9382b);
                }
                this.f12986h.setTag(this.f12966E);
                linkedHashMapM10868b.put(this.f12966E, this.f12986h);
                Iterator<View> it = linkedHashMapM10868b.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View next = it.next();
                    if (next instanceof AnythinkBTRootLayout) {
                        AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) next;
                        this.f12974M = anythinkBTRootLayout.getInstanceId();
                        this.f12985g.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                linkedHashMapM10868b.remove(this.f12974M);
                linkedHashMapM10868b.put(this.f12974M, this);
            }
            C2024c.m10829a();
            C2024c.m10836a(this.f14278n, this.f14284t);
            C2024c.m10829a();
            C2024c.m10839a(this.f12966E, this.f12975N);
            C2024c.m10829a();
            C2024c.m10839a(this.f12974M, this.f12975N);
            C2024c.m10829a();
            C2024c.m10837a(this.f14278n + "_" + this.f12975N, this.f14277m);
            List<C1781c> list3 = this.f12968G;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            m11732a(this.f14280p, this.f12968G.get(0));
        } catch (Throwable th) {
            mo10946a("onCreate exception ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f12967F) {
            return;
        }
        this.f12967F = true;
        super.onDestroy();
        C2024c.m10829a();
        C2024c.m10847d(this.f14278n + "_" + this.f12975N);
        try {
            WindVaneWebView windVaneWebView = this.f12987i;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f12987i.clearWebView();
                this.f12987i.release();
            }
            if (this.f12973L != null) {
                this.f12973L = null;
            }
            if (this.f12970I != null) {
                this.f12970I = null;
            }
            if (this.f12989k != null) {
                this.f12989k = null;
            }
            List<C1781c> list = this.f12968G;
            if (list != null && list.size() > 0) {
                for (C1781c c1781c : this.f12968G) {
                    if (c1781c != null && c1781c.m8805M() != null) {
                        C2314a.m11751b(this.f14278n + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e());
                    }
                }
            }
            C2024c.m10829a();
            C2024c.m10850f(this.f12966E);
            C2024c.m10829a();
            C2024c.m10851g(this.f14278n);
            C2024c.m10829a().m10868b(this.f14278n, this.f12975N).remove(this.f12966E);
            C2024c.m10829a().m10868b(this.f14278n, this.f12975N).remove(this.f12974M);
            C2024c.m10829a().m10868b(this.f14278n, this.f12975N).clear();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        C1781c c1781c;
        super.onPause();
        List<C1781c> list = this.f12968G;
        if (list != null && list.size() > 0 && (c1781c = this.f12968G.get(0)) != null && c1781c.m8886j()) {
            C2072a.m11068a();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        C1781c c1781c;
        InterfaceC2078a interfaceC2078a;
        super.onResume();
        List<C1781c> list = this.f12968G;
        if (list != null && list.size() > 0 && (c1781c = this.f12968G.get(0)) != null && c1781c.m8886j() && (interfaceC2078a = C2072a.m11068a().f13183a) != null) {
            interfaceC2078a.mo11126a();
        }
        if (C1800b.f10958c) {
            return;
        }
        try {
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onResume();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        C1781c c1781c;
        InterfaceC2078a interfaceC2078a;
        super.onStop();
        List<C1781c> list = this.f12968G;
        if (list != null && list.size() > 0 && (c1781c = this.f12968G.get(0)) != null && c1781c.m8886j() && (interfaceC2078a = C2072a.m11068a().f13183a) != null) {
            interfaceC2078a.mo11128c();
        }
        try {
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2208b
    public void reactDeveloper(Object obj, String str) {
        int i;
        if (this.f12970I == null || TextUtils.isEmpty(str)) {
            AbstractJSContainer.m11728a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt("hit");
            String strOptString = jSONObject.optString("unitId", getUnitId());
            jSONObject.optString(C1404a.f6238y, getPlacementId());
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            C1781c c1781c = this.f12968G.get(0);
            boolean z = true;
            if (iOptInt == 1) {
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
                if (c1781c != null) {
                    if (zOptBoolean) {
                        c1781c.m8870e(1);
                    } else {
                        c1781c.m8870e(0);
                    }
                }
                this.f12976O = isNativeKilledCallback(c1781c);
            }
            switch (iOptInt) {
                case 1:
                    this.f12970I.mo10467a();
                    break;
                case 2:
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("error");
                    String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("msg") : "";
                    if (TextUtils.isEmpty(strOptString2)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("error");
                    }
                    if (!this.f12976O && iOptInt2 != this.f12977P) {
                        this.f12970I.mo10469a(strOptString2);
                    }
                    break;
                case 3:
                    this.f12970I.mo10472b();
                    break;
                case 4:
                    this.f12970I.mo10473c();
                    break;
                case 5:
                    InterfaceC2058a interfaceC2058a = this.f12970I;
                    C1781c c1781c2 = this.f12982a;
                    if (c1781c2 != null) {
                        c1781c = c1781c2;
                    }
                    interfaceC2058a.mo10468a(c1781c);
                    break;
                case 6:
                    if (jSONObjectOptJSONObject.optInt("convert") != 1) {
                        z = false;
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("reward");
                    C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject.optJSONObject("campaign"));
                    C2333c c2333cM11965a = C2333c.m11965a(jSONObjectOptJSONObject3);
                    if (c2333cM11965a == null) {
                        c2333cM11965a = this.f14282r;
                    }
                    String strOptString3 = jSONObjectOptJSONObject.optString(C1186g.a.f3498h);
                    if (!TextUtils.isEmpty(strOptString3)) {
                        this.f12980S = strOptString3;
                    }
                    if (!this.f12976O && iOptInt2 != this.f12977P) {
                        if (this.f14285u && ((i = this.f14287w) == C1801a.f11129cr || i == C1801a.f11130cs)) {
                            this.f12970I.mo10470a(this.f12978Q, this.f12979R);
                        }
                        if (!z) {
                            c2333cM11965a.m11970a(0);
                        }
                        this.f12970I.mo10471a(z, c2333cM11965a);
                        if (!this.f14285u && z) {
                            if (c1781cM8703b == null) {
                                C2190a.m11525a(c1781c, c2333cM11965a, strOptString, this.f14281q, this.f12980S);
                            } else {
                                C2190a.m11525a(c1781cM8703b, c2333cM11965a, strOptString, this.f14281q, this.f12980S);
                            }
                        }
                    }
                    break;
            }
            m11733a(obj);
        } catch (JSONException e) {
            AbstractJSContainer.m11728a(obj, e.getMessage());
            e.getMessage();
        }
    }

    public void setBTContainerCallback(InterfaceC2058a interfaceC2058a) {
        this.f12970I = interfaceC2058a;
    }

    public void setCampaignDownLoadTasks(List<C2318c> list) {
        this.f12969H = list;
    }

    public void setCampaigns(List<C1781c> list) {
        this.f12968G = list;
    }

    public void setChoiceOneCallback(InterfaceC2082d interfaceC2082d) {
        this.f12981T = interfaceC2082d;
    }

    public void setDeveloperExtraData(String str) {
        this.f12980S = str;
    }

    public void setJSFactory(C2309b c2309b) {
        this.f14274A = c2309b;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        TextView textView;
        try {
            String strM9682a = C1874h.m9682a(i, i2, i3, i4, i5);
            WindVaneWebView windVaneWebView = this.f12987i;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof C2202j) && !TextUtils.isEmpty(strM9682a)) {
                ((C2202j) this.f12987i.getObject()).mo11561b(strM9682a);
                C1469j.m5701a();
                C1469j.m5703a((WebView) this.f12987i, "oncutoutfetched", Base64.encodeToString(strM9682a.getBytes(), 0));
            }
            List<C1781c> list = this.f12968G;
            if (list != null && list.size() > 0) {
                try {
                    if (this.f12968G.get(0).m8886j() && (textView = this.f12963B) != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams.setMargins(i2, i4, i3, i5);
                        this.f12963B.setLayoutParams(layoutParams);
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            C2024c.m10829a();
            C2024c.m10830a(i, i2, i3, i4, i5);
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.m10829a().m10868b(this.f14278n, this.f12975N);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setNotchPadding(i2, i3, i4, i5);
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).setNotchPadding(i, i2, i3, i4, i5);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(strM9682a)) {
                    C1469j.m5701a().mo5674a(view, "oncutoutfetched", Base64.encodeToString(strM9682a.getBytes(), 0));
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setShowRewardVideoListener(InterfaceC2067h interfaceC2067h) {
        this.f12971J = interfaceC2067h;
    }
}
