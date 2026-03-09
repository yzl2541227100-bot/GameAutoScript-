package com.anythink.expressad.foundation.p116d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1796r {

    /* JADX INFO: renamed from: A */
    public static final int f10791A = 22;

    /* JADX INFO: renamed from: B */
    public static final int f10792B = 21;

    /* JADX INFO: renamed from: C */
    public static final int f10793C = 10;

    /* JADX INFO: renamed from: D */
    public static final int f10794D = 11;

    /* JADX INFO: renamed from: E */
    public static final int f10795E = 12;

    /* JADX INFO: renamed from: F */
    public static final String f10796F = "1";

    /* JADX INFO: renamed from: G */
    public static final String f10797G = "2";

    /* JADX INFO: renamed from: H */
    public static final int f10798H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f10799I = 2;

    /* JADX INFO: renamed from: J */
    public static final int f10800J = 3;

    /* JADX INFO: renamed from: K */
    public static final int f10801K = 0;

    /* JADX INFO: renamed from: L */
    public static final int f10802L = 1;

    /* JADX INFO: renamed from: M */
    public static final int f10803M = 2;

    /* JADX INFO: renamed from: N */
    public static final int f10804N = 3;

    /* JADX INFO: renamed from: O */
    public static final int f10805O = 4;

    /* JADX INFO: renamed from: P */
    public static final int f10806P = 5;

    /* JADX INFO: renamed from: Q */
    public static final int f10807Q = 6;

    /* JADX INFO: renamed from: R */
    public static final int f10808R = 1;

    /* JADX INFO: renamed from: S */
    public static final int f10809S = 2;

    /* JADX INFO: renamed from: T */
    public static final int f10810T = 3;

    /* JADX INFO: renamed from: U */
    public static final int f10811U = 4;

    /* JADX INFO: renamed from: V */
    public static final String f10812V = "key";

    /* JADX INFO: renamed from: W */
    public static final String f10813W = "network_type";

    /* JADX INFO: renamed from: X */
    public static final String f10814X = "network_str";

    /* JADX INFO: renamed from: Y */
    public static final String f10815Y = "is_complete_view";

    /* JADX INFO: renamed from: Z */
    public static final String f10816Z = "watched_millis";

    /* JADX INFO: renamed from: a */
    public static final String f10817a = "2000020";

    /* JADX INFO: renamed from: aA */
    public static final String f10818aA = "ad_type";

    /* JADX INFO: renamed from: aB */
    public static final String f10819aB = "resource_type";

    /* JADX INFO: renamed from: aC */
    public static final String f10820aC = "devid";

    /* JADX INFO: renamed from: aD */
    public static final String f10821aD = "creative";

    /* JADX INFO: renamed from: aE */
    public static final String f10822aE = "mraid_type";

    /* JADX INFO: renamed from: aF */
    public static final String f10823aF = "adspace_t";

    /* JADX INFO: renamed from: aG */
    public static final String f10824aG = "1";

    /* JADX INFO: renamed from: aH */
    public static final String f10825aH = "2";

    /* JADX INFO: renamed from: aI */
    public static final String f10826aI = "1";

    /* JADX INFO: renamed from: aJ */
    public static final String f10827aJ = "2";

    /* JADX INFO: renamed from: aK */
    public static final String f10828aK = "3";

    /* JADX INFO: renamed from: aL */
    public static final String f10829aL = "4";

    /* JADX INFO: renamed from: aM */
    public static final String f10830aM = "5";

    /* JADX INFO: renamed from: aN */
    public static final String f10831aN = "6";

    /* JADX INFO: renamed from: aO */
    public static final String f10832aO = "7";

    /* JADX INFO: renamed from: aP */
    public static final String f10833aP = "8";

    /* JADX INFO: renamed from: aQ */
    public static int f10834aQ = 1;

    /* JADX INFO: renamed from: aR */
    public static int f10835aR = 0;

    /* JADX INFO: renamed from: aS */
    private static final String f10836aS = "VideoReportData";

    /* JADX INFO: renamed from: aa */
    public static final String f10837aa = "video_length";

    /* JADX INFO: renamed from: ab */
    public static final String f10838ab = "offer_url";

    /* JADX INFO: renamed from: ac */
    public static final String f10839ac = "reason";

    /* JADX INFO: renamed from: ad */
    public static final String f10840ad = "case";

    /* JADX INFO: renamed from: ae */
    public static final String f10841ae = "time";

    /* JADX INFO: renamed from: af */
    public static final String f10842af = "platform";

    /* JADX INFO: renamed from: ag */
    public static final String f10843ag = "duration";

    /* JADX INFO: renamed from: ah */
    public static final String f10844ah = "result";

    /* JADX INFO: renamed from: ai */
    public static final String f10845ai = "video_size";

    /* JADX INFO: renamed from: aj */
    public static final String f10846aj = "ctype";

    /* JADX INFO: renamed from: ak */
    public static final String f10847ak = "unit_id";

    /* JADX INFO: renamed from: al */
    public static final String f10848al = "cid";

    /* JADX INFO: renamed from: am */
    public static final String f10849am = "endscreen_type";

    /* JADX INFO: renamed from: an */
    public static final String f10850an = "error";

    /* JADX INFO: renamed from: ao */
    public static final String f10851ao = "template_url";

    /* JADX INFO: renamed from: ap */
    public static final String f10852ap = "template";

    /* JADX INFO: renamed from: aq */
    public static final String f10853aq = "aback";

    /* JADX INFO: renamed from: ar */
    public static final String f10854ar = "event";

    /* JADX INFO: renamed from: as */
    public static final String f10855as = "layout";

    /* JADX INFO: renamed from: at */
    public static final String f10856at = "type";

    /* JADX INFO: renamed from: au */
    public static final String f10857au = "endcard_url";

    /* JADX INFO: renamed from: av */
    public static final String f10858av = "video_url";

    /* JADX INFO: renamed from: aw */
    public static final String f10859aw = "template_url";

    /* JADX INFO: renamed from: ax */
    public static final String f10860ax = "rid";

    /* JADX INFO: renamed from: ay */
    public static final String f10861ay = "rid_n";

    /* JADX INFO: renamed from: az */
    public static final String f10862az = "image_url";

    /* JADX INFO: renamed from: b */
    public static final String f10863b = "2000021";

    /* JADX INFO: renamed from: c */
    public static final String f10864c = "2000054";

    /* JADX INFO: renamed from: d */
    public static final String f10865d = "2000022";

    /* JADX INFO: renamed from: e */
    public static final String f10866e = "2000023";

    /* JADX INFO: renamed from: f */
    public static final String f10867f = "2000024";

    /* JADX INFO: renamed from: g */
    public static final String f10868g = "2000025";

    /* JADX INFO: renamed from: h */
    public static final String f10869h = "2000030";

    /* JADX INFO: renamed from: i */
    public static final String f10870i = "2000037";

    /* JADX INFO: renamed from: j */
    public static final String f10871j = "2000039";

    /* JADX INFO: renamed from: k */
    public static final String f10872k = "2000043";

    /* JADX INFO: renamed from: l */
    public static final String f10873l = "2000044";

    /* JADX INFO: renamed from: m */
    public static final String f10874m = "2000045";

    /* JADX INFO: renamed from: n */
    public static final String f10875n = "2000060";

    /* JADX INFO: renamed from: o */
    public static final String f10876o = "2000059";

    /* JADX INFO: renamed from: p */
    public static final String f10877p = "2000063";

    /* JADX INFO: renamed from: q */
    public static final String f10878q = "2000061";

    /* JADX INFO: renamed from: r */
    public static final String f10879r = "2000062";

    /* JADX INFO: renamed from: s */
    public static final String f10880s = "2000073";

    /* JADX INFO: renamed from: t */
    public static final String f10881t = "2000074";

    /* JADX INFO: renamed from: u */
    public static final String f10882u = "2000075";

    /* JADX INFO: renamed from: v */
    public static final String f10883v = "2000076";

    /* JADX INFO: renamed from: w */
    public static final int f10884w = 14;

    /* JADX INFO: renamed from: x */
    public static final int f10885x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f10886y = 3;

    /* JADX INFO: renamed from: z */
    public static final int f10887z = 20;

    /* JADX INFO: renamed from: aT */
    private String f10888aT;

    /* JADX INFO: renamed from: aU */
    private String f10889aU;

    /* JADX INFO: renamed from: aV */
    private String f10890aV;

    /* JADX INFO: renamed from: aW */
    private String f10891aW;

    /* JADX INFO: renamed from: aX */
    private int f10892aX;

    /* JADX INFO: renamed from: aY */
    private String f10893aY;

    /* JADX INFO: renamed from: aZ */
    private int f10894aZ;

    /* JADX INFO: renamed from: bA */
    private String f10895bA;

    /* JADX INFO: renamed from: bB */
    private int f10896bB;

    /* JADX INFO: renamed from: bC */
    private int f10897bC;

    /* JADX INFO: renamed from: ba */
    private int f10898ba;

    /* JADX INFO: renamed from: bb */
    private int f10899bb;

    /* JADX INFO: renamed from: bc */
    private String f10900bc;

    /* JADX INFO: renamed from: bd */
    private String f10901bd;

    /* JADX INFO: renamed from: be */
    private int f10902be;

    /* JADX INFO: renamed from: bf */
    private int f10903bf;

    /* JADX INFO: renamed from: bg */
    private String f10904bg;

    /* JADX INFO: renamed from: bh */
    private long f10905bh;

    /* JADX INFO: renamed from: bi */
    private int f10906bi;

    /* JADX INFO: renamed from: bj */
    private int f10907bj;

    /* JADX INFO: renamed from: bk */
    private String f10908bk;

    /* JADX INFO: renamed from: bl */
    private String f10909bl;

    /* JADX INFO: renamed from: bm */
    private String f10910bm;

    /* JADX INFO: renamed from: bn */
    private String f10911bn;

    /* JADX INFO: renamed from: bo */
    private int f10912bo;

    /* JADX INFO: renamed from: bp */
    private String f10913bp;

    /* JADX INFO: renamed from: bq */
    private String f10914bq;

    /* JADX INFO: renamed from: br */
    private String f10915br;

    /* JADX INFO: renamed from: bs */
    private String f10916bs;

    /* JADX INFO: renamed from: bt */
    private String f10917bt;

    /* JADX INFO: renamed from: bu */
    private String f10918bu;

    /* JADX INFO: renamed from: bv */
    private String f10919bv;

    /* JADX INFO: renamed from: bw */
    private String f10920bw;

    /* JADX INFO: renamed from: bx */
    private String f10921bx;

    /* JADX INFO: renamed from: by */
    private String f10922by;

    /* JADX INFO: renamed from: bz */
    private String f10923bz;

    public C1796r() {
        this.f10907bj = 0;
        this.f10896bB = 0;
    }

    private C1796r(Context context, C1781c c1781c, int i, String str, long j, int i2) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        if (i2 == 1 || i2 == 287 || i2 == 94) {
            this.f10891aW = f10865d;
        } else if (i2 == 95) {
            this.f10891aW = f10868g;
        }
        int iM9690a = C1877k.m9690a();
        this.f10892aX = iM9690a;
        this.f10893aY = C1877k.m9692a(context, iM9690a);
        this.f10899bb = c1781c.m10155bi();
        this.f10908bk = c1781c.m8818Z();
        this.f10909bl = c1781c.m8832aa();
        if (!TextUtils.isEmpty(this.f10900bc)) {
            try {
                this.f10900bc = URLEncoder.encode(c1781c.m8839ah() == null ? c1781c.m8835ad() : c1781c.m8839ah(), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f10903bf = i;
        this.f10904bg = str;
        this.f10905bh = j == 0 ? c1781c.m8812T() : j;
    }

    private C1796r(String str) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10919bv = str;
    }

    private C1796r(String str, int i, int i2, int i3, int i4, String str2, int i5, String str3) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10893aY = str3;
        this.f10892aX = i;
        this.f10894aZ = i2;
        this.f10898ba = i3;
        this.f10899bb = i4;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f10900bc = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f10907bj = i5;
    }

    private C1796r(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10892aX = i;
        this.f10893aY = str5;
        this.f10894aZ = i2;
        this.f10898ba = i3;
        this.f10899bb = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f10900bc = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f10901bd = str3;
        this.f10903bf = i5;
        this.f10904bg = str4;
        this.f10905bh = i6;
    }

    private C1796r(String str, int i, int i2, String str2, int i3, int i4, String str3) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10892aX = i;
        this.f10893aY = str3;
        this.f10899bb = i2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f10900bc = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f10906bi = i3;
        this.f10907bj = i4;
    }

    private C1796r(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10892aX = i;
        this.f10893aY = str4;
        this.f10899bb = i2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f10900bc = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f10903bf = i3;
        this.f10904bg = str3;
        this.f10905bh = i4;
    }

    private C1796r(String str, int i, String str2, String str3, String str4) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10893aY = str4;
        this.f10892aX = i;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f10900bc = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f10901bd = str3;
    }

    public C1796r(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10903bf = i;
        this.f10904bg = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f10921bx = URLEncoder.encode(str3, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f10911bn = str4;
        this.f10910bm = str5;
        this.f10901bd = str6;
        this.f10920bw = str7;
        if (Integer.valueOf(str2).intValue() > C1801a.f11128cq) {
            this.f10903bf = 2;
        }
    }

    private C1796r(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10908bk = str2;
        this.f10909bl = str3;
        this.f10910bm = str4;
        this.f10892aX = i;
        this.f10893aY = str6;
        this.f10911bn = str5;
        this.f10912bo = i2;
    }

    public C1796r(String str, String str2, String str3, String str4, String str5, int i) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10911bn = str2;
        this.f10908bk = str3;
        this.f10909bl = str4;
        this.f10910bm = str5;
        this.f10892aX = i;
    }

    public C1796r(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10911bn = str2;
        this.f10908bk = str3;
        this.f10909bl = str4;
        this.f10910bm = str5;
        this.f10892aX = i;
        this.f10901bd = str6;
        this.f10902be = i2;
    }

    public C1796r(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f10907bj = 0;
        this.f10896bB = 0;
        this.f10891aW = str;
        this.f10917bt = str2;
        this.f10914bq = str3;
        this.f10918bu = str4;
        this.f10910bm = str5;
        this.f10911bn = str6;
        this.f10892aX = i;
        this.f10893aY = str7;
    }

    /* JADX INFO: renamed from: A */
    private int m9248A() {
        return this.f10898ba;
    }

    /* JADX INFO: renamed from: B */
    private int m9249B() {
        return this.f10899bb;
    }

    /* JADX INFO: renamed from: C */
    private String m9250C() {
        return this.f10900bc;
    }

    /* JADX INFO: renamed from: D */
    private String m9251D() {
        return TextUtils.isEmpty(this.f10901bd) ? "" : this.f10901bd;
    }

    /* JADX INFO: renamed from: E */
    private String m9252E() {
        return this.f10904bg;
    }

    /* JADX INFO: renamed from: F */
    private long m9253F() {
        return this.f10905bh;
    }

    /* JADX INFO: renamed from: G */
    private int m9254G() {
        return this.f10892aX;
    }

    /* JADX INFO: renamed from: H */
    private String m9255H() {
        return this.f10893aY;
    }

    /* JADX INFO: renamed from: I */
    private int m9256I() {
        return this.f10894aZ;
    }

    /* JADX INFO: renamed from: J */
    private int m9257J() {
        return this.f10903bf;
    }

    /* JADX INFO: renamed from: a */
    private int m9258a() {
        return this.f10902be;
    }

    /* JADX INFO: renamed from: a */
    public static String m9259a(C1796r c1796r) {
        String str;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + c1796r.f10891aW + "&");
            stringBuffer.append("error=" + C1886t.m9842c(c1796r.f10915br) + "&");
            stringBuffer.append("template_url=" + C1886t.m9842c(c1796r.f10913bp) + "&");
            stringBuffer.append("unit_id=" + C1886t.m9842c(c1796r.f10910bm) + "&");
            stringBuffer.append("cid=" + C1886t.m9842c(c1796r.f10911bn) + "&");
            String str2 = "";
            if (TextUtils.isEmpty(c1796r.f10893aY)) {
                str = "";
            } else {
                str = "network_str=" + c1796r.f10893aY + "&";
            }
            stringBuffer.append(str);
            if (!TextUtils.isEmpty(c1796r.f10893aY)) {
                str2 = "network_type=" + c1796r.f10892aX;
            }
            stringBuffer.append(str2);
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m9260a(List<C1796r> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C1796r c1796r : list) {
            stringBuffer.append("key=" + c1796r.f10891aW + "&");
            stringBuffer.append("result=" + c1796r.f10903bf + "&");
            stringBuffer.append("duration=" + c1796r.f10904bg + "&");
            stringBuffer.append("endcard_url=" + c1796r.f10921bx + "&");
            stringBuffer.append("cid=" + c1796r.f10911bn + "&");
            stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
            stringBuffer.append("reason=" + c1796r.m9251D() + "&");
            stringBuffer.append("ad_type=" + c1796r.f10895bA + "&");
            stringBuffer.append("rid=" + c1796r.f10908bk + "&");
            stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
            stringBuffer.append("type=" + c1796r.f10920bw + "&");
            StringBuilder sb = new StringBuilder("adspace_t=");
            sb.append(c1796r.f10897bC);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    private String m9261b() {
        return this.f10888aT;
    }

    /* JADX INFO: renamed from: b */
    private static String m9262b(C1796r c1796r) {
        if (c1796r == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + c1796r.f10891aW + "&");
        stringBuffer.append("cid=" + c1796r.f10911bn + "&");
        stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
        stringBuffer.append("network_type=" + c1796r.f10892aX + "&");
        stringBuffer.append("rid=" + c1796r.f10908bk + "&");
        stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
        StringBuilder sb = new StringBuilder("reason=");
        sb.append(c1796r.m9251D());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m9263b(List<C1796r> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C1796r> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().f10919bv);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private String m9264c() {
        return this.f10889aU;
    }

    /* JADX INFO: renamed from: c */
    private static String m9265c(C1796r c1796r) {
        if (c1796r == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + c1796r.f10891aW + "&");
        stringBuffer.append("cid=" + c1796r.f10911bn + "&");
        stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
        stringBuffer.append("network_type=" + c1796r.f10892aX + "&");
        stringBuffer.append("mraid_type=" + c1796r.f10896bB + "&");
        stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
        StringBuilder sb = new StringBuilder("rid=");
        sb.append(c1796r.f10908bk);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: d */
    private String m9266d() {
        return this.f10890aV;
    }

    /* JADX INFO: renamed from: d */
    private static String m9267d(C1796r c1796r) {
        if (c1796r == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + c1796r.f10891aW + "&");
        stringBuffer.append("result=" + c1796r.f10903bf + "&");
        stringBuffer.append("duration=" + c1796r.f10904bg + "&");
        stringBuffer.append("cid=" + c1796r.f10911bn + "&");
        stringBuffer.append("reason=" + c1796r.m9251D() + "&");
        stringBuffer.append("ad_type=" + c1796r.f10895bA + "&");
        stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
        stringBuffer.append("devid=" + c1796r.f10889aU + "&");
        stringBuffer.append("mraid_type=" + c1796r.f10896bB + "&");
        stringBuffer.append("network_type=" + c1796r.f10892aX + "&");
        if (!TextUtils.isEmpty(c1796r.f10921bx)) {
            stringBuffer.append("endcard_url=" + c1796r.f10921bx + "&");
        }
        if (!TextUtils.isEmpty(c1796r.f10920bw)) {
            stringBuffer.append("type=" + c1796r.f10920bw + "&");
        }
        if (c1796r.f10888aT != null) {
            stringBuffer.append("resource_type=" + c1796r.f10888aT + "&");
        }
        stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
        StringBuilder sb = new StringBuilder("rid=");
        sb.append(c1796r.f10908bk);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: e */
    private String m9268e() {
        return this.f10923bz;
    }

    /* JADX INFO: renamed from: e */
    private static String m9269e(C1796r c1796r) {
        if (c1796r == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + c1796r.f10891aW + "&");
        stringBuffer.append("result=" + c1796r.f10903bf + "&");
        stringBuffer.append("duration=" + c1796r.f10904bg + "&");
        stringBuffer.append("cid=" + c1796r.f10911bn + "&");
        stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
        stringBuffer.append("reason=" + c1796r.m9251D() + "&");
        stringBuffer.append("ad_type=" + c1796r.f10895bA + "&");
        stringBuffer.append("rid=" + c1796r.f10908bk + "&");
        stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
        stringBuffer.append("network_type=" + c1796r.f10892aX + "&");
        stringBuffer.append("mraid_type=" + c1796r.f10896bB + "&");
        stringBuffer.append("devid=" + c1796r.f10889aU + "&");
        if (c1796r.f10888aT != null) {
            stringBuffer.append("resource_type=" + c1796r.f10888aT + "&");
        }
        if (!TextUtils.isEmpty(c1796r.f10921bx)) {
            stringBuffer.append("endcard_url=" + c1796r.f10921bx + "&");
        }
        stringBuffer.append("type=" + c1796r.f10920bw);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: e */
    private void m9270e(int i) {
        this.f10902be = i;
    }

    /* JADX INFO: renamed from: f */
    private String m9271f() {
        return this.f10922by;
    }

    /* JADX INFO: renamed from: f */
    private static String m9272f(C1796r c1796r) {
        if (c1796r == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + c1796r.f10891aW + "&");
        stringBuffer.append("cid=" + c1796r.f10911bn + "&");
        stringBuffer.append("rid=" + c1796r.f10908bk + "&");
        stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
        stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
        stringBuffer.append("network_type=" + c1796r.f10892aX + "&");
        stringBuffer.append("mraid_type=" + c1796r.f10896bB + "&");
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: f */
    private void m9273f(int i) {
        this.f10907bj = i;
    }

    /* JADX INFO: renamed from: g */
    private String m9274g() {
        return this.f10921bx;
    }

    /* JADX INFO: renamed from: g */
    private static String m9275g(C1796r c1796r) {
        if (c1796r == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + c1796r.f10891aW + "&");
        stringBuffer.append("cid=" + c1796r.f10911bn + "&");
        stringBuffer.append("rid=" + c1796r.f10908bk + "&");
        stringBuffer.append("rid_n=" + c1796r.f10909bl + "&");
        stringBuffer.append("unit_id=" + c1796r.f10910bm + "&");
        stringBuffer.append("reason=" + c1796r.m9251D() + "&");
        stringBuffer.append("case=" + c1796r.f10902be + "&");
        StringBuilder sb = new StringBuilder("network_type=");
        sb.append(c1796r.f10892aX);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: g */
    private void m9276g(int i) {
        this.f10906bi = i;
    }

    /* JADX INFO: renamed from: h */
    private String m9277h() {
        return this.f10920bw;
    }

    /* JADX INFO: renamed from: h */
    private void m9278h(int i) {
        this.f10912bo = i;
    }

    /* JADX INFO: renamed from: i */
    private String m9279i() {
        return this.f10895bA;
    }

    /* JADX INFO: renamed from: i */
    private void m9280i(int i) {
        this.f10898ba = i;
    }

    /* JADX INFO: renamed from: j */
    private int m9281j() {
        return this.f10907bj;
    }

    /* JADX INFO: renamed from: j */
    private void m9282j(int i) {
        this.f10899bb = i;
    }

    /* JADX INFO: renamed from: k */
    private int m9283k() {
        return this.f10906bi;
    }

    /* JADX INFO: renamed from: k */
    private void m9284k(int i) {
        this.f10905bh = i;
    }

    /* JADX INFO: renamed from: k */
    private void m9285k(String str) {
        this.f10888aT = str;
    }

    /* JADX INFO: renamed from: l */
    private String m9286l() {
        return this.f10913bp;
    }

    /* JADX INFO: renamed from: l */
    private void m9287l(int i) {
        this.f10894aZ = i;
    }

    /* JADX INFO: renamed from: l */
    private void m9288l(String str) {
        this.f10889aU = str;
    }

    /* JADX INFO: renamed from: m */
    private String m9289m() {
        return this.f10915br;
    }

    /* JADX INFO: renamed from: m */
    private void m9290m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10890aV = URLEncoder.encode(str);
    }

    /* JADX INFO: renamed from: n */
    private String m9291n() {
        return this.f10916bs;
    }

    /* JADX INFO: renamed from: n */
    private void m9292n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f10923bz = URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o */
    private String m9293o() {
        return this.f10914bq;
    }

    /* JADX INFO: renamed from: o */
    private void m9294o(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f10922by = URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p */
    private String m9295p() {
        return this.f10917bt;
    }

    /* JADX INFO: renamed from: p */
    private void m9296p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f10921bx = URLEncoder.encode(str, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    private String m9297q() {
        return this.f10918bu;
    }

    /* JADX INFO: renamed from: q */
    private void m9298q(String str) {
        this.f10920bw = str;
    }

    /* JADX INFO: renamed from: r */
    private String m9299r() {
        return this.f10919bv;
    }

    /* JADX INFO: renamed from: r */
    private void m9300r(String str) {
        this.f10916bs = str;
    }

    /* JADX INFO: renamed from: s */
    private int m9301s() {
        return this.f10896bB;
    }

    /* JADX INFO: renamed from: s */
    private void m9302s(String str) {
        this.f10914bq = str;
    }

    /* JADX INFO: renamed from: t */
    private int m9303t() {
        return this.f10897bC;
    }

    /* JADX INFO: renamed from: t */
    private void m9304t(String str) {
        this.f10917bt = str;
    }

    /* JADX INFO: renamed from: u */
    private String m9305u() {
        return this.f10908bk;
    }

    /* JADX INFO: renamed from: u */
    private void m9306u(String str) {
        this.f10918bu = str;
    }

    /* JADX INFO: renamed from: v */
    private String m9307v() {
        return this.f10909bl;
    }

    /* JADX INFO: renamed from: v */
    private void m9308v(String str) {
        this.f10919bv = str;
    }

    /* JADX INFO: renamed from: w */
    private String m9309w() {
        return this.f10910bm;
    }

    /* JADX INFO: renamed from: w */
    private void m9310w(String str) {
        this.f10900bc = str;
    }

    /* JADX INFO: renamed from: x */
    private String m9311x() {
        return this.f10911bn;
    }

    /* JADX INFO: renamed from: x */
    private void m9312x(String str) {
        this.f10904bg = str;
    }

    /* JADX INFO: renamed from: y */
    private int m9313y() {
        return this.f10912bo;
    }

    /* JADX INFO: renamed from: z */
    private String m9314z() {
        return this.f10891aW;
    }

    /* JADX INFO: renamed from: a */
    public final void m9315a(int i) {
        this.f10896bB = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m9316a(String str) {
        this.f10895bA = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m9317b(int i) {
        this.f10897bC = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m9318b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f10913bp = URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9319c(int i) {
        this.f10892aX = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m9320c(String str) {
        this.f10915br = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m9321d(int i) {
        this.f10903bf = i;
    }

    /* JADX INFO: renamed from: d */
    public final void m9322d(String str) {
        this.f10908bk = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m9323e(String str) {
        this.f10909bl = str;
    }

    /* JADX INFO: renamed from: f */
    public final void m9324f(String str) {
        this.f10910bm = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m9325g(String str) {
        this.f10911bn = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m9326h(String str) {
        this.f10891aW = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m9327i(String str) {
        this.f10901bd = str;
    }

    /* JADX INFO: renamed from: j */
    public final void m9328j(String str) {
        this.f10893aY = str;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f10891aW + ", networkType=" + this.f10892aX + ", isCompleteView=" + this.f10894aZ + ", watchedMillis=" + this.f10898ba + ", videoLength=" + this.f10899bb + ", offerUrl=" + this.f10900bc + ", reason=" + this.f10901bd + ", result=" + this.f10903bf + ", duration=" + this.f10904bg + ", videoSize=" + this.f10905bh + "]";
    }
}
