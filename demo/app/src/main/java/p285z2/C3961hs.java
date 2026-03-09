package p285z2;

import java.util.Formatter;

/* JADX INFO: renamed from: z2.hs */
/* JADX INFO: loaded from: classes2.dex */
public class C3961hs {
    private static final int OooO0OO = 5;
    private final C3850es OooO00o;
    private final C3887fs[] OooO0O0;

    public C3961hs(C3850es c3850es) {
        this.OooO00o = new C3850es(c3850es);
        this.OooO0O0 = new C3887fs[(c3850es.OooO0o0() - c3850es.OooO0oO()) + 1];
    }

    public final C3850es OooO00o() {
        return this.OooO00o;
    }

    public final C3887fs OooO0O0(int i) {
        return this.OooO0O0[OooO0o0(i)];
    }

    public final C3887fs OooO0OO(int i) {
        C3887fs c3887fs;
        C3887fs c3887fs2;
        C3887fs c3887fsOooO0O0 = OooO0O0(i);
        if (c3887fsOooO0O0 != null) {
            return c3887fsOooO0O0;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iOooO0o0 = OooO0o0(i) - i2;
            if (iOooO0o0 >= 0 && (c3887fs2 = this.OooO0O0[iOooO0o0]) != null) {
                return c3887fs2;
            }
            int iOooO0o02 = OooO0o0(i) + i2;
            C3887fs[] c3887fsArr = this.OooO0O0;
            if (iOooO0o02 < c3887fsArr.length && (c3887fs = c3887fsArr[iOooO0o02]) != null) {
                return c3887fs;
            }
        }
        return null;
    }

    public final C3887fs[] OooO0Oo() {
        return this.OooO0O0;
    }

    public final void OooO0o(int i, C3887fs c3887fs) {
        this.OooO0O0[OooO0o0(i)] = c3887fs;
    }

    public final int OooO0o0(int i) {
        return i - this.OooO00o.OooO0oO();
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (C3887fs c3887fs : this.OooO0O0) {
                if (c3887fs == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(c3887fs.OooO0OO()), Integer.valueOf(c3887fs.OooO0o0()));
                    i++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
