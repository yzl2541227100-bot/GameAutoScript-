package p285z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: z2.zw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4631zw {
    private static final Pattern OooOO0 = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern OooOO0O = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern OooOO0o = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern OooOOO0 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final boolean OooO;
    private final String OooO00o;
    private final String OooO0O0;
    private final long OooO0OO;
    private final String OooO0Oo;
    private final boolean OooO0o;
    private final String OooO0o0;
    private final boolean OooO0oO;
    private final boolean OooO0oo;

    /* JADX INFO: renamed from: z2.zw$OooO00o */
    public static final class OooO00o {
        public boolean OooO;

        @Nullable
        public String OooO00o;

        @Nullable
        public String OooO0O0;

        @Nullable
        public String OooO0Oo;
        public boolean OooO0o;
        public boolean OooO0oO;
        public boolean OooO0oo;
        public long OooO0OO = C4337ry.OooO00o;
        public String OooO0o0 = "/";

        private OooO00o OooO0OO(String str, boolean z) {
            Objects.requireNonNull(str, "domain == null");
            String strOooO0Oo = C4558xx.OooO0Oo(str);
            if (strOooO0Oo != null) {
                this.OooO0Oo = strOooO0Oo;
                this.OooO = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public OooO00o OooO() {
            this.OooO0o = true;
            return this;
        }

        public C4631zw OooO00o() {
            return new C4631zw(this);
        }

        public OooO00o OooO0O0(String str) {
            return OooO0OO(str, false);
        }

        public OooO00o OooO0Oo(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > C4337ry.OooO00o) {
                j = 253402300799999L;
            }
            this.OooO0OO = j;
            this.OooO0oo = true;
            return this;
        }

        public OooO00o OooO0o() {
            this.OooO0oO = true;
            return this;
        }

        public OooO00o OooO0o0(String str) {
            return OooO0OO(str, true);
        }

        public OooO00o OooO0oO(String str) {
            Objects.requireNonNull(str, "name == null");
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.OooO00o = str;
            return this;
        }

        public OooO00o OooO0oo(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.OooO0o0 = str;
            return this;
        }

        public OooO00o OooOO0(String str) {
            Objects.requireNonNull(str, "value == null");
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.OooO0O0 = str;
            return this;
        }
    }

    private C4631zw(String str, String str2, long j, String str3, String str4, boolean z, boolean z3, boolean z4, boolean z5) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = j;
        this.OooO0Oo = str3;
        this.OooO0o0 = str4;
        this.OooO0o = z;
        this.OooO0oO = z3;
        this.OooO = z4;
        this.OooO0oo = z5;
    }

    public C4631zw(OooO00o oooO00o) {
        String str = oooO00o.OooO00o;
        Objects.requireNonNull(str, "builder.name == null");
        String str2 = oooO00o.OooO0O0;
        Objects.requireNonNull(str2, "builder.value == null");
        String str3 = oooO00o.OooO0Oo;
        Objects.requireNonNull(str3, "builder.domain == null");
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = oooO00o.OooO0OO;
        this.OooO0Oo = str3;
        this.OooO0o0 = oooO00o.OooO0o0;
        this.OooO0o = oooO00o.OooO0o;
        this.OooO0oO = oooO00o.OooO0oO;
        this.OooO0oo = oooO00o.OooO0oo;
        this.OooO = oooO00o.OooO;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0 A[PHI: r0
  0x00c0: PHI (r0v15 long) = (r0v2 long), (r0v5 long) binds: [B:42:0x00be, B:53:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p285z2.C4631zw OooO(long r23, p285z2.C4003ix r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4631zw.OooO(long, z2.ix, java.lang.String):z2.zw");
    }

    private static int OooO00o(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static boolean OooO0OO(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C4558xx.Oooo0OO(str);
    }

    @Nullable
    public static C4631zw OooOO0(C4003ix c4003ix, String str) {
        return OooO(System.currentTimeMillis(), c4003ix, str);
    }

    public static List<C4631zw> OooOO0O(C4003ix c4003ix, C3966hx c3966hx) {
        List<String> listOooOOOO = c3966hx.OooOOOO("Set-Cookie");
        int size = listOooOOOO.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C4631zw c4631zwOooOO0 = OooOO0(c4003ix, listOooOOOO.get(i));
            if (c4631zwOooOO0 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c4631zwOooOO0);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    private static String OooOO0o(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strOooO0Oo = C4558xx.OooO0Oo(str);
        if (strOooO0Oo != null) {
            return strOooO0Oo;
        }
        throw new IllegalArgumentException();
    }

    private static long OooOOO(String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long OooOOO0(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4631zw.OooOOO0(java.lang.String, int, int):long");
    }

    private static boolean OooOOOo(C4003ix c4003ix, String str) {
        String strOooO0oo = c4003ix.OooO0oo();
        if (strOooO0oo.equals(str)) {
            return true;
        }
        if (strOooO0oo.startsWith(str)) {
            return str.endsWith("/") || strOooO0oo.charAt(str.length()) == '/';
        }
        return false;
    }

    public String OooO0O0() {
        return this.OooO0Oo;
    }

    public long OooO0Oo() {
        return this.OooO0OO;
    }

    public boolean OooO0o() {
        return this.OooO0oO;
    }

    public boolean OooO0o0() {
        return this.OooO;
    }

    public boolean OooO0oO(C4003ix c4003ix) {
        if ((this.OooO ? c4003ix.OooOOOo().equals(this.OooO0Oo) : OooO0OO(c4003ix.OooOOOo(), this.OooO0Oo)) && OooOOOo(c4003ix, this.OooO0o0)) {
            return !this.OooO0o || c4003ix.OooOOo0();
        }
        return false;
    }

    public String OooO0oo() {
        return this.OooO00o;
    }

    public String OooOOOO() {
        return this.OooO0o0;
    }

    public boolean OooOOo() {
        return this.OooO0o;
    }

    public boolean OooOOo0() {
        return this.OooO0oo;
    }

    public String OooOOoo(boolean z) {
        String strOooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append(this.OooO00o);
        sb.append('=');
        sb.append(this.OooO0O0);
        if (this.OooO0oo) {
            if (this.OooO0OO == Long.MIN_VALUE) {
                strOooO00o = "; max-age=0";
            } else {
                sb.append("; expires=");
                strOooO00o = C4337ry.OooO00o(new Date(this.OooO0OO));
            }
            sb.append(strOooO00o);
        }
        if (!this.OooO) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.OooO0Oo);
        }
        sb.append("; path=");
        sb.append(this.OooO0o0);
        if (this.OooO0o) {
            sb.append("; secure");
        }
        if (this.OooO0oO) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String OooOo00() {
        return this.OooO0O0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C4631zw)) {
            return false;
        }
        C4631zw c4631zw = (C4631zw) obj;
        return c4631zw.OooO00o.equals(this.OooO00o) && c4631zw.OooO0O0.equals(this.OooO0O0) && c4631zw.OooO0Oo.equals(this.OooO0Oo) && c4631zw.OooO0o0.equals(this.OooO0o0) && c4631zw.OooO0OO == this.OooO0OO && c4631zw.OooO0o == this.OooO0o && c4631zw.OooO0oO == this.OooO0oO && c4631zw.OooO0oo == this.OooO0oo && c4631zw.OooO == this.OooO;
    }

    public int hashCode() {
        int iHashCode = (((((((527 + this.OooO00o.hashCode()) * 31) + this.OooO0O0.hashCode()) * 31) + this.OooO0Oo.hashCode()) * 31) + this.OooO0o0.hashCode()) * 31;
        long j = this.OooO0OO;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.OooO0o ? 1 : 0)) * 31) + (!this.OooO0oO ? 1 : 0)) * 31) + (!this.OooO0oo ? 1 : 0)) * 31) + (!this.OooO ? 1 : 0);
    }

    public String toString() {
        return OooOOoo(false);
    }
}
