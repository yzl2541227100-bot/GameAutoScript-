package com.p188b.p189a;

import com.p188b.p189a.p190a.p193c.C2450d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.b.a.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2564r {

    /* JADX INFO: renamed from: a */
    private static final Pattern f15774a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: b */
    private static final Pattern f15775b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: c */
    private static final Pattern f15776c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: d */
    private static final Pattern f15777d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: e */
    private final String f15778e;

    /* JADX INFO: renamed from: f */
    private final String f15779f;

    /* JADX INFO: renamed from: g */
    private final long f15780g;

    /* JADX INFO: renamed from: h */
    private final String f15781h;

    /* JADX INFO: renamed from: i */
    private final String f15782i;

    /* JADX INFO: renamed from: j */
    private final boolean f15783j;

    /* JADX INFO: renamed from: k */
    private final boolean f15784k;

    /* JADX INFO: renamed from: l */
    private final boolean f15785l;

    /* JADX INFO: renamed from: m */
    private final boolean f15786m;

    private C2564r(String str, String str2, long j, String str3, String str4, boolean z, boolean z3, boolean z4, boolean z5) {
        this.f15778e = str;
        this.f15779f = str2;
        this.f15780g = j;
        this.f15781h = str3;
        this.f15782i = str4;
        this.f15783j = z;
        this.f15784k = z3;
        this.f15786m = z4;
        this.f15785l = z5;
    }

    /* JADX INFO: renamed from: a */
    private static int m12950a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private static long m12951a(String str) {
        try {
            long j = Long.parseLong(str);
            if (j <= 0) {
                return Long.MIN_VALUE;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0250 A[PHI: r1
  0x0250: PHI (r1v13 long) = (r1v2 long), (r1v5 long) binds: [B:310:0x024e, B:321:0x0278] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.p188b.p189a.C2564r m12952a(long r30, com.p188b.p189a.C2526ac r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.C2564r.m12952a(long, com.b.a.ac, java.lang.String):com.b.a.r");
    }

    /* JADX INFO: renamed from: a */
    public static List<C2564r> m12953a(C2526ac c2526ac, C2524aa c2524aa) {
        int iM12787a = c2524aa.m12787a();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < iM12787a; i++) {
            if ("Set-Cookie".equalsIgnoreCase(c2524aa.m12788a(i))) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(c2524aa.m12791b(i));
            }
        }
        List listUnmodifiableList = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.emptyList();
        int size = listUnmodifiableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2564r c2564rM12952a = m12952a(System.currentTimeMillis(), c2526ac, (String) listUnmodifiableList.get(i2));
            if (c2564rM12952a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c2564rM12952a);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    /* JADX INFO: renamed from: a */
    public final String m12954a() {
        return this.f15778e;
    }

    /* JADX INFO: renamed from: b */
    public final String m12955b() {
        return this.f15779f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2564r)) {
            return false;
        }
        C2564r c2564r = (C2564r) obj;
        return c2564r.f15778e.equals(this.f15778e) && c2564r.f15779f.equals(this.f15779f) && c2564r.f15781h.equals(this.f15781h) && c2564r.f15782i.equals(this.f15782i) && c2564r.f15780g == this.f15780g && c2564r.f15783j == this.f15783j && c2564r.f15784k == this.f15784k && c2564r.f15785l == this.f15785l && c2564r.f15786m == this.f15786m;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f15778e.hashCode() + 527) * 31) + this.f15779f.hashCode()) * 31) + this.f15781h.hashCode()) * 31) + this.f15782i.hashCode()) * 31;
        long j = this.f15780g;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f15783j ? 1 : 0)) * 31) + (!this.f15784k ? 1 : 0)) * 31) + (!this.f15785l ? 1 : 0)) * 31) + (!this.f15786m ? 1 : 0);
    }

    public final String toString() {
        String strM12600a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15778e);
        sb.append('=');
        sb.append(this.f15779f);
        if (this.f15785l) {
            if (this.f15780g == Long.MIN_VALUE) {
                strM12600a = "; max-age=0";
            } else {
                sb.append("; expires=");
                strM12600a = C2450d.m12600a(new Date(this.f15780g));
            }
            sb.append(strM12600a);
        }
        if (!this.f15786m) {
            sb.append("; domain=");
            sb.append(this.f15781h);
        }
        sb.append("; path=");
        sb.append(this.f15782i);
        if (this.f15783j) {
            sb.append("; secure");
        }
        if (this.f15784k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
