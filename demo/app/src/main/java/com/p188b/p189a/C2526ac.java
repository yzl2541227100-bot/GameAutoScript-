package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p284io.IOUtils;
import org.slf4j.Marker;
import p285z2.C4003ix;

/* JADX INFO: renamed from: com.b.a.ac */
/* JADX INFO: loaded from: classes.dex */
public final class C2526ac {

    /* JADX INFO: renamed from: d */
    private static final char[] f15457d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public final String f15458a;

    /* JADX INFO: renamed from: b */
    public final String f15459b;

    /* JADX INFO: renamed from: c */
    public final int f15460c;

    /* JADX INFO: renamed from: e */
    private final String f15461e;

    /* JADX INFO: renamed from: f */
    private final String f15462f;

    /* JADX INFO: renamed from: g */
    private final List<String> f15463g;

    /* JADX INFO: renamed from: h */
    private final List<String> f15464h;

    /* JADX INFO: renamed from: i */
    private final String f15465i;

    /* JADX INFO: renamed from: j */
    private final String f15466j;

    public C2526ac(C2527ad c2527ad) {
        this.f15458a = c2527ad.f15467a;
        this.f15461e = m12803a(c2527ad.f15468b, false);
        this.f15462f = m12803a(c2527ad.f15469c, false);
        this.f15459b = c2527ad.f15470d;
        this.f15460c = c2527ad.m12828a();
        this.f15463g = m12804a(c2527ad.f15472f, false);
        List<String> list = c2527ad.f15473g;
        this.f15464h = list != null ? m12804a(list, true) : null;
        String str = c2527ad.f15474h;
        this.f15465i = str != null ? m12803a(str, false) : null;
        this.f15466j = c2527ad.toString();
    }

    /* JADX INFO: renamed from: a */
    public static int m12798a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* JADX INFO: renamed from: a */
    public static int m12799a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: a */
    public static String m12800a(String str, int i, int i2, String str2, boolean z, boolean z3, boolean z4, boolean z5) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z5) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z || (z3 && !m12806a(str, iCharCount, i2)))) || (iCodePointAt == 43 && z4)))) {
                C2579f c2579f = new C2579f();
                c2579f.m13000a(str, i, iCharCount);
                C2579f c2579f2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z4) {
                            c2579f.mo13008b(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z5) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z3 && !m12806a(str, iCharCount, i2)))))) {
                            if (c2579f2 == null) {
                                c2579f2 = new C2579f();
                            }
                            c2579f2.m12996a(iCodePointAt2);
                            while (!c2579f2.mo13017d()) {
                                int iMo13018e = c2579f2.mo13018e() & 255;
                                c2579f.mo13028h(37);
                                char[] cArr = f15457d;
                                c2579f.mo13028h((int) cArr[(iMo13018e >> 4) & 15]);
                                c2579f.mo13028h((int) cArr[iMo13018e & 15]);
                            }
                        } else {
                            c2579f.m12996a(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c2579f.m13035l();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m12801a(java.lang.String r8, int r9, int r10, boolean r11) {
        /*
            r0 = r9
        L1:
            if (r0 >= r10) goto L60
            char r1 = r8.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r11 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            com.b.b.f r1 = new com.b.b.f
            r1.<init>()
            r1.m13000a(r8, r9, r0)
        L1d:
            if (r0 >= r10) goto L5b
            int r9 = r8.codePointAt(r0)
            if (r9 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r10) goto L48
            int r5 = r0 + 1
            char r5 = r8.charAt(r5)
            int r5 = m12798a(r5)
            char r6 = r8.charAt(r4)
            int r6 = m12798a(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.mo13028h(r0)
            r0 = r4
            goto L55
        L48:
            if (r9 != r2) goto L52
            if (r11 == 0) goto L52
            r4 = 32
            r1.mo13028h(r4)
            goto L55
        L52:
            r1.m12996a(r9)
        L55:
            int r9 = java.lang.Character.charCount(r9)
            int r0 = r0 + r9
            goto L1d
        L5b:
            java.lang.String r8 = r1.m13035l()
            return r8
        L60:
            java.lang.String r8 = r8.substring(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.C2526ac.m12801a(java.lang.String, int, int, boolean):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    public static String m12802a(String str, String str2, boolean z, boolean z3, boolean z4, boolean z5) {
        return m12800a(str, 0, str.length(), str2, z, z3, z4, z5);
    }

    /* JADX INFO: renamed from: a */
    private static String m12803a(String str, boolean z) {
        return m12801a(str, 0, str.length(), z);
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m12804a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m12803a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m12805a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(list.get(i));
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12806a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && m12798a(str.charAt(i + 1)) != -1 && m12798a(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m12807b(String str) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                strSubstring = null;
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            }
            arrayList.add(strSubstring);
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m12808b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static C2526ac m12809e(String str) {
        C2527ad c2527ad = new C2527ad();
        if (c2527ad.m12829a(null, str) == C2528ae.f15475a) {
            return c2527ad.m12831b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final URI m12810a() {
        C2527ad c2527ad = new C2527ad();
        c2527ad.f15467a = this.f15458a;
        c2527ad.f15468b = m12815d();
        c2527ad.f15469c = m12816e();
        c2527ad.f15470d = this.f15459b;
        c2527ad.f15471e = this.f15460c != m12799a(this.f15458a) ? this.f15460c : -1;
        c2527ad.f15472f.clear();
        c2527ad.f15472f.addAll(m12820i());
        c2527ad.m12832b(m12821j());
        c2527ad.f15474h = this.f15465i == null ? null : this.f15466j.substring(this.f15466j.indexOf(35) + 1);
        int size = c2527ad.f15472f.size();
        for (int i = 0; i < size; i++) {
            c2527ad.f15472f.set(i, m12802a(c2527ad.f15472f.get(i), C4003ix.OooOOO, true, true, false, true));
        }
        List<String> list = c2527ad.f15473g;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = c2527ad.f15473g.get(i2);
                if (str != null) {
                    c2527ad.f15473g.set(i2, m12802a(str, C4003ix.OooOOo, true, true, true, true));
                }
            }
        }
        String str2 = c2527ad.f15474h;
        if (str2 != null) {
            c2527ad.f15474h = m12802a(str2, C4003ix.OooOo0, true, true, false, false);
        }
        String string = c2527ad.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m12811b() {
        return this.f15458a;
    }

    /* JADX INFO: renamed from: c */
    public final C2526ac m12812c(String str) {
        C2527ad c2527adM12814d = m12814d(str);
        if (c2527adM12814d != null) {
            return c2527adM12814d.m12831b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12813c() {
        return this.f15458a.equals("https");
    }

    /* JADX INFO: renamed from: d */
    public final C2527ad m12814d(String str) {
        C2527ad c2527ad = new C2527ad();
        if (c2527ad.m12829a(this, str) == C2528ae.f15475a) {
            return c2527ad;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final String m12815d() {
        if (this.f15461e.isEmpty()) {
            return "";
        }
        int length = this.f15458a.length() + 3;
        String str = this.f15466j;
        return this.f15466j.substring(length, C2446c.m12572a(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: e */
    public final String m12816e() {
        if (this.f15462f.isEmpty()) {
            return "";
        }
        return this.f15466j.substring(this.f15466j.indexOf(58, this.f15458a.length() + 3) + 1, this.f15466j.indexOf(64));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2526ac) && ((C2526ac) obj).f15466j.equals(this.f15466j);
    }

    /* JADX INFO: renamed from: f */
    public final String m12817f() {
        return this.f15459b;
    }

    /* JADX INFO: renamed from: g */
    public final int m12818g() {
        return this.f15460c;
    }

    /* JADX INFO: renamed from: h */
    public final String m12819h() {
        int iIndexOf = this.f15466j.indexOf(47, this.f15458a.length() + 3);
        String str = this.f15466j;
        return this.f15466j.substring(iIndexOf, C2446c.m12572a(str, iIndexOf, str.length(), "?#"));
    }

    public final int hashCode() {
        return this.f15466j.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m12820i() {
        int iIndexOf = this.f15466j.indexOf(47, this.f15458a.length() + 3);
        String str = this.f15466j;
        int iM12572a = C2446c.m12572a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM12572a) {
            int i = iIndexOf + 1;
            int iM12571a = C2446c.m12571a(this.f15466j, i, iM12572a, IOUtils.DIR_SEPARATOR_UNIX);
            arrayList.add(this.f15466j.substring(i, iM12571a));
            iIndexOf = iM12571a;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final String m12821j() {
        if (this.f15464h == null) {
            return null;
        }
        int iIndexOf = this.f15466j.indexOf(63) + 1;
        String str = this.f15466j;
        return this.f15466j.substring(iIndexOf, C2446c.m12571a(str, iIndexOf + 1, str.length(), '#'));
    }

    /* JADX INFO: renamed from: k */
    public final String m12822k() {
        if (this.f15464h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m12808b(sb, this.f15464h);
        return sb.toString();
    }

    public final String toString() {
        return this.f15466j;
    }
}
