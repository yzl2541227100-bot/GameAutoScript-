package com.anythink.expressad.foundation.p116d;

import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1784f {

    /* JADX INFO: renamed from: a */
    public static final String f10607a = "cid";

    /* JADX INFO: renamed from: b */
    public static final String f10608b = "click_type";

    /* JADX INFO: renamed from: c */
    public static final String f10609c = "network_type";

    /* JADX INFO: renamed from: d */
    public static final String f10610d = "network_str";

    /* JADX INFO: renamed from: e */
    public static final String f10611e = "click_duration";

    /* JADX INFO: renamed from: f */
    public static final String f10612f = "last_url";

    /* JADX INFO: renamed from: g */
    public static final String f10613g = "type";

    /* JADX INFO: renamed from: h */
    public static final String f10614h = "code";

    /* JADX INFO: renamed from: i */
    public static final String f10615i = "exception";

    /* JADX INFO: renamed from: j */
    public static final String f10616j = "header";

    /* JADX INFO: renamed from: k */
    public static final String f10617k = "content";

    /* JADX INFO: renamed from: l */
    public static final String f10618l = "network_type";

    /* JADX INFO: renamed from: m */
    public static final String f10619m = "rid";

    /* JADX INFO: renamed from: n */
    public static final String f10620n = "key";

    /* JADX INFO: renamed from: o */
    public static final String f10621o = "rid_n";

    /* JADX INFO: renamed from: p */
    public static final String f10622p = "unit_id";

    /* JADX INFO: renamed from: q */
    public static final String f10623q = "landing_type";

    /* JADX INFO: renamed from: r */
    public static final String f10624r = "link_type";

    /* JADX INFO: renamed from: s */
    public static final String f10625s = "click_time";

    /* JADX INFO: renamed from: t */
    public static final String f10626t = "market_result";

    /* JADX INFO: renamed from: u */
    public static final String f10627u = "2000013";

    /* JADX INFO: renamed from: v */
    public static final String f10628v = "2000012";

    /* JADX INFO: renamed from: A */
    private String f10629A;

    /* JADX INFO: renamed from: B */
    private int f10630B;

    /* JADX INFO: renamed from: C */
    private String f10631C;

    /* JADX INFO: renamed from: D */
    private String f10632D;

    /* JADX INFO: renamed from: E */
    private String f10633E;

    /* JADX INFO: renamed from: F */
    private int f10634F;

    /* JADX INFO: renamed from: G */
    private int f10635G;

    /* JADX INFO: renamed from: H */
    private String f10636H;

    /* JADX INFO: renamed from: I */
    private int f10637I;

    /* JADX INFO: renamed from: J */
    private int f10638J;

    /* JADX INFO: renamed from: K */
    private String f10639K;

    /* JADX INFO: renamed from: L */
    private int f10640L;

    /* JADX INFO: renamed from: M */
    private String f10641M;

    /* JADX INFO: renamed from: N */
    private int f10642N;

    /* JADX INFO: renamed from: w */
    private int f10643w;

    /* JADX INFO: renamed from: x */
    private String f10644x;

    /* JADX INFO: renamed from: y */
    private String f10645y;

    /* JADX INFO: renamed from: z */
    private String f10646z;

    public C1784f() {
    }

    private C1784f(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2, int i3, String str8, int i4, int i5, String str9, int i6, int i7, String str10) {
        this.f10644x = str;
        this.f10645y = str2;
        this.f10646z = str3;
        this.f10629A = str4;
        this.f10630B = i;
        this.f10631C = str5;
        this.f10632D = str6;
        this.f10633E = str7;
        this.f10634F = i2;
        this.f10635G = i3;
        this.f10636H = str8;
        this.f10637I = i4;
        this.f10638J = i5;
        this.f10639K = str9;
        this.f10640L = i6;
        this.f10641M = str10;
        this.f10642N = i7;
    }

    /* JADX INFO: renamed from: a */
    private static String m9033a(C1784f c1784f) {
        if (c1784f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = c1784f.f10629A;
        sb.append("rid_n=" + c1784f.f10644x);
        sb.append("&click_type=" + c1784f.f10635G);
        sb.append("&type=" + c1784f.f10634F);
        sb.append("&cid=" + c1784f.f10645y);
        sb.append("&click_duration=" + c1784f.f10646z);
        sb.append("&key=2000012");
        sb.append("&unit_id=" + c1784f.f10636H);
        sb.append("&last_url=".concat(String.valueOf(str)));
        sb.append("&code=" + c1784f.f10630B);
        sb.append("&exception=" + c1784f.f10631C);
        sb.append("&landing_type=" + c1784f.f10637I);
        sb.append("&link_type=" + c1784f.f10638J);
        sb.append("&click_time=" + c1784f.f10639K + "\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m9034a(List<C1784f> list) {
        if (list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C1784f c1784f : list) {
            sb.append("rid_n=" + c1784f.f10644x);
            sb.append("&cid=" + c1784f.f10645y);
            sb.append("&click_type=" + c1784f.f10635G);
            sb.append("&type=" + c1784f.f10634F);
            sb.append("&click_duration=" + c1784f.f10646z);
            sb.append("&key=2000013");
            sb.append("&unit_id=" + c1784f.f10636H);
            sb.append("&last_url=" + c1784f.f10629A);
            sb.append("&content=" + c1784f.f10633E);
            sb.append("&code=" + c1784f.f10630B);
            sb.append("&exception=" + c1784f.f10631C);
            sb.append("&header=" + c1784f.f10632D);
            sb.append("&landing_type=" + c1784f.f10637I);
            sb.append("&link_type=" + c1784f.f10638J);
            sb.append("&click_time=" + c1784f.f10639K + "\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private int m9035b() {
        return this.f10642N;
    }

    /* JADX INFO: renamed from: c */
    private int m9036c() {
        return this.f10640L;
    }

    /* JADX INFO: renamed from: d */
    private String m9037d() {
        return this.f10641M;
    }

    /* JADX INFO: renamed from: e */
    private String m9038e() {
        return this.f10636H;
    }

    /* JADX INFO: renamed from: e */
    private void m9039e(int i) {
        this.f10642N = i;
    }

    /* JADX INFO: renamed from: f */
    private int m9040f() {
        return this.f10637I;
    }

    /* JADX INFO: renamed from: f */
    private void m9041f(int i) {
        this.f10640L = i;
    }

    /* JADX INFO: renamed from: g */
    private int m9042g() {
        return this.f10638J;
    }

    /* JADX INFO: renamed from: g */
    private void m9043g(int i) {
        this.f10643w = i;
    }

    /* JADX INFO: renamed from: h */
    private String m9044h() {
        return this.f10639K;
    }

    /* JADX INFO: renamed from: i */
    private int m9045i() {
        return this.f10635G;
    }

    /* JADX INFO: renamed from: j */
    private String m9046j() {
        return this.f10631C;
    }

    /* JADX INFO: renamed from: j */
    private void m9047j(String str) {
        this.f10641M = str;
    }

    /* JADX INFO: renamed from: k */
    private int m9048k() {
        return this.f10630B;
    }

    /* JADX INFO: renamed from: l */
    private String m9049l() {
        return this.f10632D;
    }

    /* JADX INFO: renamed from: m */
    private String m9050m() {
        return this.f10633E;
    }

    /* JADX INFO: renamed from: n */
    private int m9051n() {
        return this.f10634F;
    }

    /* JADX INFO: renamed from: o */
    private String m9052o() {
        return this.f10629A;
    }

    /* JADX INFO: renamed from: p */
    private String m9053p() {
        return this.f10645y;
    }

    /* JADX INFO: renamed from: q */
    private String m9054q() {
        return this.f10646z;
    }

    /* JADX INFO: renamed from: r */
    private int m9055r() {
        return this.f10643w;
    }

    /* JADX INFO: renamed from: s */
    private String m9056s() {
        return this.f10644x;
    }

    /* JADX INFO: renamed from: a */
    public final void m9057a() {
        this.f10635G = 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m9058a(int i) {
        this.f10637I = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m9059a(String str) {
        this.f10636H = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m9060b(int i) {
        this.f10638J = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m9061b(String str) {
        this.f10639K = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m9062c(int i) {
        this.f10630B = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m9063c(String str) {
        this.f10631C = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m9064d(int i) {
        this.f10634F = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m9065d(String str) {
        this.f10632D = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m9066e(String str) {
        this.f10633E = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m9067f(String str) {
        this.f10629A = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m9068g(String str) {
        this.f10645y = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m9069h(String str) {
        this.f10646z = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m9070i(String str) {
        this.f10644x = str;
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f10645y + ", click_duration=" + this.f10646z + ", lastUrl=" + this.f10629A + ", code=" + this.f10630B + ", excepiton=" + this.f10631C + ", header=" + this.f10632D + ", content=" + this.f10633E + ", type=" + this.f10634F + ", click_type=" + this.f10635G + "]";
    }
}
