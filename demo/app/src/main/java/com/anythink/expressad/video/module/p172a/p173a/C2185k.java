package com.anythink.expressad.video.module.p172a.p173a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.p073a.p074a.C1406a;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p174b.C2190a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p179c.C2333c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.k */
/* JADX INFO: loaded from: classes.dex */
public class C2185k extends C2180f {

    /* JADX INFO: renamed from: V */
    public static final int f13855V = 2;

    /* JADX INFO: renamed from: a */
    public static final int f13856a = 1;

    /* JADX INFO: renamed from: ag */
    private static final String f13857ag = "camp_position";

    /* JADX INFO: renamed from: W */
    public boolean f13858W;

    /* JADX INFO: renamed from: X */
    public C1781c f13859X;

    /* JADX INFO: renamed from: Y */
    public List<C1781c> f13860Y;

    /* JADX INFO: renamed from: Z */
    public boolean f13861Z;

    /* JADX INFO: renamed from: aa */
    public C2318c f13862aa;

    /* JADX INFO: renamed from: ab */
    public C2333c f13863ab;

    /* JADX INFO: renamed from: ac */
    public String f13864ac;

    /* JADX INFO: renamed from: ad */
    public String f13865ad;

    /* JADX INFO: renamed from: ae */
    public InterfaceC2174a f13866ae;

    /* JADX INFO: renamed from: af */
    public int f13867af;

    /* JADX INFO: renamed from: ah */
    private boolean f13868ah = false;

    /* JADX INFO: renamed from: ai */
    private boolean f13869ai = false;

    /* JADX INFO: renamed from: aj */
    private boolean f13870aj = false;

    public C2185k(C1781c c1781c, C2318c c2318c, C2333c c2333c, String str, String str2, InterfaceC2174a interfaceC2174a, int i, boolean z) {
        this.f13861Z = false;
        this.f13866ae = new C2180f();
        this.f13867af = 1;
        if (!z && c1781c != null && C1889w.m9868b(str2) && c2318c != null && interfaceC2174a != null) {
            this.f13859X = c1781c;
            this.f13865ad = str;
            this.f13864ac = str2;
            this.f13862aa = c2318c;
            this.f13863ab = c2333c;
            this.f13866ae = interfaceC2174a;
            this.f13858W = true;
            this.f13867af = i;
            this.f13861Z = false;
            return;
        }
        if (!z || c1781c == null || !C1889w.m9868b(str2) || interfaceC2174a == null) {
            return;
        }
        this.f13859X = c1781c;
        this.f13865ad = str;
        this.f13864ac = str2;
        this.f13862aa = c2318c;
        this.f13863ab = c2333c;
        this.f13866ae = interfaceC2174a;
        this.f13858W = true;
        this.f13867af = i;
        this.f13861Z = true;
    }

    /* JADX INFO: renamed from: g */
    private static void m11494g() {
    }

    /* JADX INFO: renamed from: h */
    private static void m11495h() {
    }

    /* JADX INFO: renamed from: i */
    private static void m11496i() {
        C2320e.m11843a().m11854a(false);
    }

    /* JADX INFO: renamed from: j */
    private static void m11497j() {
    }

    /* JADX INFO: renamed from: k */
    private void m11498k() {
        if (!this.f13858W || C1807f.f11187k == null || TextUtils.isEmpty(this.f13859X.m10146aZ())) {
            return;
        }
        C1807f.m9397a(this.f13864ac, this.f13859X, "reward");
    }

    /* JADX INFO: renamed from: l */
    private static void m11499l() {
    }

    /* JADX INFO: renamed from: m */
    private static void m11500m() {
    }

    /* JADX INFO: renamed from: n */
    private static void m11501n() {
    }

    /* JADX INFO: renamed from: a */
    public final void m11502a() {
        if (!this.f13858W || this.f13859X == null) {
            return;
        }
        C1175n.m2059a().m2148f();
        new C1796r(C1796r.f10878q, this.f13859X.m10146aZ(), this.f13859X.m8818Z(), this.f13859X.m8832aa(), this.f13864ac, C1877k.m9690a()).m9315a(this.f13859X.m8800H() ? C1796r.f10834aQ : C1796r.f10835aR);
    }

    /* JADX INFO: renamed from: a */
    public final void m11503a(int i) {
        if (this.f13859X != null) {
            if (i == 1 || i == 2) {
                C2190a.m11523a(C1175n.m2059a().m2148f(), this.f13859X, i, this.f13867af);
            }
        }
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    public void mo10950a(int i, Object obj) {
        super.mo10950a(i, obj);
        this.f13866ae.mo10950a(i, obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m11504a(int i, String str) {
        if (this.f13859X != null) {
            C1175n.m2059a().m2148f();
            new C1796r(C1796r.f10879r, this.f13859X.m10146aZ(), this.f13859X.m8818Z(), this.f13859X.m8832aa(), this.f13864ac, C1877k.m9690a(), i, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11505a(C1781c c1781c) {
        this.f13859X = c1781c;
    }

    /* JADX INFO: renamed from: a */
    public final void m11506a(String str) {
        List<C1781c> list;
        if (this.f13859X == null || (list = this.f13860Y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(f13857ag)) {
                this.f13859X = this.f13860Y.get(jSONObject.getInt(f13857ag));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11507a(List<C1781c> list) {
        this.f13860Y = list;
    }

    /* JADX INFO: renamed from: b */
    public final void m11508b() {
        C2318c c2318c = this.f13862aa;
        if (c2318c != null) {
            c2318c.m11817b(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11509b(int i) {
        C1781c c1781c = this.f13859X;
        if (c1781c != null) {
            String strM8839ah = c1781c.m8839ah();
            if (TextUtils.isEmpty(strM8839ah)) {
                return;
            }
            if (i == 1 || i == 2) {
                if (!strM8839ah.contains("endscreen_type")) {
                    StringBuilder sb = new StringBuilder(strM8839ah);
                    sb.append(strM8839ah.contains("?") ? "&endscreen_type=" : "?endscreen_type=");
                    sb.append(i);
                    strM8839ah = sb.toString();
                } else if (i == 2) {
                    if (strM8839ah.contains("endscreen_type=1")) {
                        strM8839ah = strM8839ah.replace("endscreen_type=1", "endscreen_type=2");
                    }
                } else if (strM8839ah.contains("endscreen_type=2")) {
                    strM8839ah = strM8839ah.replace("endscreen_type=2", "endscreen_type=1");
                }
                this.f13859X.m8904q(strM8839ah);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11510c() {
        Map<String, Long> map;
        StringBuilder sb;
        try {
            C1781c c1781c = this.f13859X;
            if (c1781c != null && c1781c.m8886j() && this.f13861Z && !this.f13859X.m8892l()) {
                this.f13869ai = true;
                return;
            }
            if (!this.f13858W || TextUtils.isEmpty(this.f13859X.m8840ai()) || (map = C1807f.f11184h) == null || map.containsKey(this.f13859X.m8840ai()) || this.f13869ai) {
                return;
            }
            C1807f.f11184h.put(this.f13859X.m8840ai(), Long.valueOf(System.currentTimeMillis()));
            String strM8840ai = this.f13859X.m8840ai();
            if (this.f13859X.m8896n() == 1) {
                sb = new StringBuilder();
                sb.append(strM8840ai);
                sb.append("&to=1&cbt=");
                sb.append(this.f13859X.m8857az());
                sb.append("&tmorl=");
                sb.append(this.f13867af);
            } else {
                sb = new StringBuilder();
                sb.append(strM8840ai);
                sb.append("&to=0&cbt=");
                sb.append(this.f13859X.m8857az());
                sb.append("&tmorl=");
                sb.append(this.f13867af);
            }
            String string = sb.toString();
            if (!this.f13861Z) {
                C1405a.m5185a(C1175n.m2059a().m2148f(), this.f13859X, this.f13864ac, string, true);
            } else if (this.f13859X.m8892l()) {
                C1405a.m5186a(C1175n.m2059a().m2148f(), this.f13859X, this.f13864ac, string, false, true, C1406a.f6270j);
            }
            this.f13869ai = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11511d() {
        StringBuilder sb;
        try {
            if (!this.f13858W || this.f13868ah || TextUtils.isEmpty(this.f13859X.m8838ag())) {
                return;
            }
            this.f13868ah = true;
            this.f13859X.m8793A();
            String strM8838ag = this.f13859X.m8838ag();
            if (this.f13859X.m8896n() == 1) {
                sb = new StringBuilder();
                sb.append(strM8838ag);
                sb.append("&to=1&cbt=");
                sb.append(this.f13859X.m8857az());
                sb.append("&tmorl=");
                sb.append(this.f13867af);
            } else {
                sb = new StringBuilder();
                sb.append(strM8838ag);
                sb.append("&to=0&cbt=");
                sb.append(this.f13859X.m8857az());
                sb.append("&tmorl=");
                sb.append(this.f13867af);
            }
            C1405a.m5186a(C1175n.m2059a().m2148f(), this.f13859X, this.f13864ac, sb.toString(), false, true, C1406a.f6269i);
            C2190a.m11522a(C1175n.m2059a().m2148f(), this.f13859X);
            if (!this.f13858W || C1807f.f11187k == null || TextUtils.isEmpty(this.f13859X.m10146aZ())) {
                return;
            }
            C1807f.m9397a(this.f13864ac, this.f13859X, "reward");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11512e() {
        C1781c c1781c;
        List<String> listM8869e;
        try {
            if (!this.f13858W || this.f13870aj || (c1781c = this.f13859X) == null) {
                return;
            }
            this.f13870aj = true;
            if ((c1781c.m8886j() && this.f13861Z && !this.f13859X.m8892l()) || this.f13861Z || (listM8869e = this.f13859X.m8869e()) == null || listM8869e.size() <= 0) {
                return;
            }
            Iterator<String> it = listM8869e.iterator();
            while (it.hasNext()) {
                C1405a.m5185a(C1175n.m2059a().m2148f(), this.f13859X, this.f13864ac, it.next(), true);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11513f() {
        C1781c c1781c = this.f13859X;
        if (c1781c == null || TextUtils.isEmpty(c1781c.m8803K()) || this.f13859X.m8804L() == null || this.f13859X.m8804L().m9203n() == null) {
            return;
        }
        Context contextM2148f = C1175n.m2059a().m2148f();
        C1781c c1781c2 = this.f13859X;
        C1405a.m5187a(contextM2148f, c1781c2, c1781c2.m8803K(), this.f13859X.m8804L().m9203n(), false);
    }
}
