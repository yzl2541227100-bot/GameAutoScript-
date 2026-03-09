package com.anythink.expressad.foundation.p116d;

import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.d.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1790l {

    /* JADX INFO: renamed from: a */
    public static final String f10722a = "key";

    /* JADX INFO: renamed from: b */
    public static final String f10723b = "time";

    /* JADX INFO: renamed from: c */
    public static final String f10724c = "ad_source_id";

    /* JADX INFO: renamed from: d */
    public static final String f10725d = "num";

    /* JADX INFO: renamed from: e */
    public static final String f10726e = "unit_id";

    /* JADX INFO: renamed from: f */
    public static final String f10727f = "fb";

    /* JADX INFO: renamed from: g */
    public static final String f10728g = "timeout";

    /* JADX INFO: renamed from: h */
    public static final String f10729h = "network_type";

    /* JADX INFO: renamed from: i */
    public static final String f10730i = "network_str";

    /* JADX INFO: renamed from: j */
    public static final String f10731j = "2000006";

    /* JADX INFO: renamed from: k */
    public static final String f10732k = "hb";

    /* JADX INFO: renamed from: l */
    private int f10733l;

    /* JADX INFO: renamed from: m */
    private String f10734m;

    /* JADX INFO: renamed from: n */
    private int f10735n;

    /* JADX INFO: renamed from: o */
    private String f10736o;

    /* JADX INFO: renamed from: p */
    private int f10737p;

    /* JADX INFO: renamed from: q */
    private int f10738q;

    /* JADX INFO: renamed from: r */
    private int f10739r;

    /* JADX INFO: renamed from: s */
    private String f10740s;

    /* JADX INFO: renamed from: t */
    private int f10741t;

    /* JADX INFO: renamed from: u */
    private String f10742u;

    public C1790l() {
    }

    private C1790l(int i, String str, int i2, String str2, int i3, int i4, int i5) {
        this.f10733l = i;
        this.f10734m = str;
        this.f10735n = i2;
        this.f10736o = str2;
        this.f10737p = i3;
        this.f10738q = i4;
        this.f10739r = i5;
    }

    /* JADX INFO: renamed from: a */
    private int m9144a() {
        return this.f10741t;
    }

    /* JADX INFO: renamed from: a */
    private static String m9145a(List<C1790l> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C1790l c1790l : list) {
            stringBuffer.append("ad_source_id=" + c1790l.f10733l);
            stringBuffer.append("&time=" + c1790l.f10734m);
            stringBuffer.append("&num=" + c1790l.f10735n);
            stringBuffer.append("&unit_id=" + c1790l.f10736o);
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + c1790l.f10737p);
            if (c1790l.f10741t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + c1790l.f10738q + "\n");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m9146a(int i) {
        this.f10741t = i;
    }

    /* JADX INFO: renamed from: a */
    private void m9147a(String str) {
        this.f10734m = str;
    }

    /* JADX INFO: renamed from: b */
    private int m9148b() {
        return this.f10733l;
    }

    /* JADX INFO: renamed from: b */
    private void m9149b(int i) {
        this.f10733l = i;
    }

    /* JADX INFO: renamed from: b */
    private void m9150b(String str) {
        this.f10742u = str;
    }

    /* JADX INFO: renamed from: c */
    private String m9151c() {
        return this.f10734m;
    }

    /* JADX INFO: renamed from: c */
    private void m9152c(int i) {
        this.f10735n = i;
    }

    /* JADX INFO: renamed from: c */
    private void m9153c(String str) {
        this.f10736o = str;
    }

    /* JADX INFO: renamed from: d */
    private String m9154d() {
        return this.f10742u;
    }

    /* JADX INFO: renamed from: d */
    private void m9155d(int i) {
        this.f10737p = i;
    }

    /* JADX INFO: renamed from: d */
    private void m9156d(String str) {
        this.f10740s = str;
    }

    /* JADX INFO: renamed from: e */
    private int m9157e() {
        return this.f10735n;
    }

    /* JADX INFO: renamed from: e */
    private void m9158e(int i) {
        this.f10738q = i;
    }

    /* JADX INFO: renamed from: f */
    private String m9159f() {
        return this.f10736o;
    }

    /* JADX INFO: renamed from: f */
    private void m9160f(int i) {
        this.f10739r = i;
    }

    /* JADX INFO: renamed from: g */
    private int m9161g() {
        return this.f10737p;
    }

    /* JADX INFO: renamed from: h */
    private int m9162h() {
        return this.f10738q;
    }

    /* JADX INFO: renamed from: i */
    private int m9163i() {
        return this.f10739r;
    }

    /* JADX INFO: renamed from: j */
    private String m9164j() {
        return this.f10740s;
    }
}
