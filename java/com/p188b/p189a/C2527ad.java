package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p285z2.C4003ix;

/* JADX INFO: renamed from: com.b.a.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C2527ad {

    /* JADX INFO: renamed from: a */
    public String f15467a;

    /* JADX INFO: renamed from: d */
    public String f15470d;

    /* JADX INFO: renamed from: f */
    public final List<String> f15472f;

    /* JADX INFO: renamed from: g */
    public List<String> f15473g;

    /* JADX INFO: renamed from: h */
    public String f15474h;

    /* JADX INFO: renamed from: b */
    public String f15468b = "";

    /* JADX INFO: renamed from: c */
    public String f15469c = "";

    /* JADX INFO: renamed from: e */
    public int f15471e = -1;

    public C2527ad() {
        ArrayList arrayList = new ArrayList();
        this.f15472f = arrayList;
        arrayList.add("");
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x00a4  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12823a(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.C2527ad.m12823a(java.lang.String, int, int):void");
    }

    /* JADX INFO: renamed from: b */
    private static int m12824b(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ':') {
                return i;
            }
            if (cCharAt == '[') {
                do {
                    i++;
                    if (i < i2) {
                    }
                } while (str.charAt(i) != ']');
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    private static String m12825c(String str, int i, int i2) {
        int i3 = 0;
        String strM12801a = C2526ac.m12801a(str, i, i2, false);
        if (!strM12801a.contains(":")) {
            return C2446c.m12575a(strM12801a);
        }
        InetAddress inetAddressM12826d = (strM12801a.startsWith("[") && strM12801a.endsWith("]")) ? m12826d(strM12801a, 1, strM12801a.length() - 1) : m12826d(strM12801a, 0, strM12801a.length());
        if (inetAddressM12826d == null) {
            return null;
        }
        byte[] address = inetAddressM12826d.getAddress();
        if (address.length != 16) {
            throw new AssertionError();
        }
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6) {
                i4 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        C2579f c2579f = new C2579f();
        while (i3 < address.length) {
            if (i3 == i4) {
                c2579f.mo13028h(58);
                i3 += i6;
                if (i3 == 16) {
                    c2579f.mo13028h(58);
                }
            } else {
                if (i3 > 0) {
                    c2579f.mo13028h(58);
                }
                c2579f.mo13031i(((address[i3] & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return c2579f.m13035l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x00d2, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0086 A[LOOP:2: B:123:0x004c->B:147:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0096 A[EDGE_INSN: B:192:0x0096->B:150:0x0096 BREAK  A[LOOP:2: B:123:0x004c->B:147:0x0086], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress m12826d(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.C2527ad.m12826d(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX INFO: renamed from: e */
    private static int m12827e(String str, int i, int i2) {
        int i3;
        try {
            i3 = Integer.parseInt(C2526ac.m12800a(str, i, i2, "", false, false, false, true));
        } catch (NumberFormatException unused) {
        }
        if (i3 <= 0 || i3 > 65535) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m12828a() {
        int i = this.f15471e;
        return i != -1 ? i : C2526ac.m12799a(this.f15467a);
    }

    /* JADX INFO: renamed from: a */
    public final int m12829a(C2526ac c2526ac, String str) {
        int i;
        byte b;
        byte b2;
        int iM12572a;
        int i2;
        char cCharAt;
        char cCharAt2;
        int iM12570a = C2446c.m12570a(str, 0, str.length());
        int iM12591b = C2446c.m12591b(str, iM12570a, str.length());
        char c = ':';
        byte b3 = -1;
        if (iM12591b - iM12570a < 2 || (((cCharAt2 = str.charAt(iM12570a)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i = -1;
        } else {
            i = iM12570a + 1;
            while (true) {
                if (i >= iM12591b) {
                    break;
                }
                char cCharAt3 = str.charAt(i);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i++;
                } else if (cCharAt3 != ':') {
                    break;
                }
            }
            i = -1;
        }
        if (i != -1) {
            if (str.regionMatches(true, iM12570a, "https:", 0, 6)) {
                this.f15467a = "https";
                iM12570a += 6;
            } else {
                if (!str.regionMatches(true, iM12570a, "http:", 0, 5)) {
                    return C2528ae.f15477c;
                }
                this.f15467a = "http";
                iM12570a += 5;
            }
        } else {
            if (c2526ac == null) {
                return C2528ae.f15476b;
            }
            this.f15467a = c2526ac.f15458a;
        }
        int i3 = iM12570a;
        int i4 = 0;
        while (true) {
            b = 47;
            b2 = 92;
            if (i3 >= iM12591b || !((cCharAt = str.charAt(i3)) == '\\' || cCharAt == '/')) {
                break;
            }
            i4++;
            i3++;
        }
        byte b4 = 63;
        byte b5 = 35;
        if (i4 >= 2 || c2526ac == null || !c2526ac.f15458a.equals(this.f15467a)) {
            int i5 = iM12570a + i4;
            boolean z = false;
            boolean z3 = false;
            while (true) {
                iM12572a = C2446c.m12572a(str, i5, iM12591b, "@/\\?#");
                byte bCharAt = iM12572a != iM12591b ? str.charAt(iM12572a) : (byte) -1;
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        i2 = iM12572a;
                        this.f15469c += "%40" + C2526ac.m12800a(str, i5, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    } else {
                        int iM12571a = C2446c.m12571a(str, i5, iM12572a, c);
                        i2 = iM12572a;
                        String strM12800a = C2526ac.m12800a(str, i5, iM12571a, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z3) {
                            strM12800a = this.f15468b + "%40" + strM12800a;
                        }
                        this.f15468b = strM12800a;
                        if (iM12571a != i2) {
                            this.f15469c = C2526ac.m12800a(str, iM12571a + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z = true;
                        }
                        z3 = true;
                    }
                    i5 = i2 + 1;
                    b5 = 35;
                    b4 = 63;
                    b2 = 92;
                    c = ':';
                    b3 = -1;
                    b = 47;
                }
            }
            int iM12824b = m12824b(str, i5, iM12572a);
            int i6 = iM12824b + 1;
            this.f15470d = m12825c(str, i5, iM12824b);
            if (i6 < iM12572a) {
                int iM12827e = m12827e(str, i6, iM12572a);
                this.f15471e = iM12827e;
                if (iM12827e == -1) {
                    return C2528ae.f15478d;
                }
            } else {
                this.f15471e = C2526ac.m12799a(this.f15467a);
            }
            if (this.f15470d == null) {
                return C2528ae.f15479e;
            }
            iM12570a = iM12572a;
        } else {
            this.f15468b = c2526ac.m12815d();
            this.f15469c = c2526ac.m12816e();
            this.f15470d = c2526ac.f15459b;
            this.f15471e = c2526ac.f15460c;
            this.f15472f.clear();
            this.f15472f.addAll(c2526ac.m12820i());
            if (iM12570a == iM12591b || str.charAt(iM12570a) == '#') {
                m12832b(c2526ac.m12821j());
            }
        }
        int iM12572a2 = C2446c.m12572a(str, iM12570a, iM12591b, "?#");
        m12823a(str, iM12570a, iM12572a2);
        if (iM12572a2 < iM12591b && str.charAt(iM12572a2) == '?') {
            int iM12571a2 = C2446c.m12571a(str, iM12572a2, iM12591b, '#');
            this.f15473g = C2526ac.m12807b(C2526ac.m12800a(str, iM12572a2 + 1, iM12571a2, C4003ix.OooOOOO, true, false, true, true));
            iM12572a2 = iM12571a2;
        }
        if (iM12572a2 < iM12591b && str.charAt(iM12572a2) == '#') {
            this.f15474h = C2526ac.m12800a(str, iM12572a2 + 1, iM12591b, "", true, false, false, false);
        }
        return C2528ae.f15475a;
    }

    /* JADX INFO: renamed from: a */
    public final C2527ad m12830a(String str) {
        Objects.requireNonNull(str, "host == null");
        String strM12825c = m12825c(str, 0, str.length());
        if (strM12825c == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        this.f15470d = strM12825c;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2526ac m12831b() {
        if (this.f15467a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f15470d != null) {
            return new C2526ac(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX INFO: renamed from: b */
    public final C2527ad m12832b(String str) {
        this.f15473g = str != null ? C2526ac.m12807b(C2526ac.m12802a(str, C4003ix.OooOOOO, true, false, true, true)) : null;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15467a);
        sb.append("://");
        if (!this.f15468b.isEmpty() || !this.f15469c.isEmpty()) {
            sb.append(this.f15468b);
            if (!this.f15469c.isEmpty()) {
                sb.append(':');
                sb.append(this.f15469c);
            }
            sb.append('@');
        }
        if (this.f15470d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f15470d);
            sb.append(']');
        } else {
            sb.append(this.f15470d);
        }
        int iM12828a = m12828a();
        if (iM12828a != C2526ac.m12799a(this.f15467a)) {
            sb.append(':');
            sb.append(iM12828a);
        }
        C2526ac.m12805a(sb, this.f15472f);
        if (this.f15473g != null) {
            sb.append('?');
            C2526ac.m12808b(sb, this.f15473g);
        }
        if (this.f15474h != null) {
            sb.append('#');
            sb.append(this.f15474h);
        }
        return sb.toString();
    }
}
