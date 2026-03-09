package p285z2;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: z2.qw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4298qw {
    public static final C4298qw OooOOO = new OooO00o().OooO0o().OooO00o();
    public static final C4298qw OooOOOO = new OooO00o().OooO().OooO0Oo(Integer.MAX_VALUE, TimeUnit.SECONDS).OooO00o();
    private final int OooO;
    private final boolean OooO00o;
    private final boolean OooO0O0;
    private final int OooO0OO;
    private final int OooO0Oo;
    private final boolean OooO0o;
    private final boolean OooO0o0;
    private final boolean OooO0oO;
    private final int OooO0oo;
    private final boolean OooOO0;
    private final boolean OooOO0O;
    private final boolean OooOO0o;

    @Nullable
    public String OooOOO0;

    /* JADX INFO: renamed from: z2.qw$OooO00o */
    public static final class OooO00o {
        public boolean OooO00o;
        public boolean OooO0O0;
        public boolean OooO0o;
        public boolean OooO0oO;
        public boolean OooO0oo;
        public int OooO0OO = -1;
        public int OooO0Oo = -1;
        public int OooO0o0 = -1;

        public OooO00o OooO() {
            this.OooO0o = true;
            return this;
        }

        public C4298qw OooO00o() {
            return new C4298qw(this);
        }

        public OooO00o OooO0O0() {
            this.OooO0oo = true;
            return this;
        }

        public OooO00o OooO0OO(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.OooO0OO = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxAge < 0: " + i);
        }

        public OooO00o OooO0Oo(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.OooO0Oo = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        public OooO00o OooO0o() {
            this.OooO00o = true;
            return this;
        }

        public OooO00o OooO0o0(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.OooO0o0 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("minFresh < 0: " + i);
        }

        public OooO00o OooO0oO() {
            this.OooO0O0 = true;
            return this;
        }

        public OooO00o OooO0oo() {
            this.OooO0oO = true;
            return this;
        }
    }

    public C4298qw(OooO00o oooO00o) {
        this.OooO00o = oooO00o.OooO00o;
        this.OooO0O0 = oooO00o.OooO0O0;
        this.OooO0OO = oooO00o.OooO0OO;
        this.OooO0Oo = -1;
        this.OooO0o0 = false;
        this.OooO0o = false;
        this.OooO0oO = false;
        this.OooO0oo = oooO00o.OooO0Oo;
        this.OooO = oooO00o.OooO0o0;
        this.OooOO0 = oooO00o.OooO0o;
        this.OooOO0O = oooO00o.OooO0oO;
        this.OooOO0o = oooO00o.OooO0oo;
    }

    private C4298qw(boolean z, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, @Nullable String str) {
        this.OooO00o = z;
        this.OooO0O0 = z3;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        this.OooO0o0 = z4;
        this.OooO0o = z5;
        this.OooO0oO = z6;
        this.OooO0oo = i3;
        this.OooO = i4;
        this.OooOO0 = z7;
        this.OooOO0O = z8;
        this.OooOO0o = z9;
        this.OooOOO0 = str;
    }

    private String OooO00o() {
        StringBuilder sb = new StringBuilder();
        if (this.OooO00o) {
            sb.append("no-cache, ");
        }
        if (this.OooO0O0) {
            sb.append("no-store, ");
        }
        if (this.OooO0OO != -1) {
            sb.append("max-age=");
            sb.append(this.OooO0OO);
            sb.append(", ");
        }
        if (this.OooO0Oo != -1) {
            sb.append("s-maxage=");
            sb.append(this.OooO0Oo);
            sb.append(", ");
        }
        if (this.OooO0o0) {
            sb.append("private, ");
        }
        if (this.OooO0o) {
            sb.append("public, ");
        }
        if (this.OooO0oO) {
            sb.append("must-revalidate, ");
        }
        if (this.OooO0oo != -1) {
            sb.append("max-stale=");
            sb.append(this.OooO0oo);
            sb.append(", ");
        }
        if (this.OooO != -1) {
            sb.append("min-fresh=");
            sb.append(this.OooO);
            sb.append(", ");
        }
        if (this.OooOO0) {
            sb.append("only-if-cached, ");
        }
        if (this.OooOO0O) {
            sb.append("no-transform, ");
        }
        if (this.OooOO0o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p285z2.C4298qw OooOOO0(p285z2.C3966hx r22) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4298qw.OooOOO0(z2.hx):z2.qw");
    }

    public boolean OooO() {
        return this.OooO00o;
    }

    public boolean OooO0O0() {
        return this.OooOO0o;
    }

    public boolean OooO0OO() {
        return this.OooO0o0;
    }

    public boolean OooO0Oo() {
        return this.OooO0o;
    }

    public int OooO0o() {
        return this.OooO0oo;
    }

    public int OooO0o0() {
        return this.OooO0OO;
    }

    public int OooO0oO() {
        return this.OooO;
    }

    public boolean OooO0oo() {
        return this.OooO0oO;
    }

    public boolean OooOO0() {
        return this.OooO0O0;
    }

    public boolean OooOO0O() {
        return this.OooOO0O;
    }

    public boolean OooOO0o() {
        return this.OooOO0;
    }

    public int OooOOO() {
        return this.OooO0Oo;
    }

    public String toString() {
        String str = this.OooOOO0;
        if (str != null) {
            return str;
        }
        String strOooO00o = OooO00o();
        this.OooOOO0 = strOooO00o;
        return strOooO00o;
    }
}
