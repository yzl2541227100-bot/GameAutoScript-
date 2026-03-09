package p285z2;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class s20 extends f20 {
    private final Appendable OooO0O0;

    public s20() {
        this(new StringBuilder());
    }

    public s20(Appendable appendable) {
        this.OooO0O0 = appendable;
    }

    public static String OooOOO(r20 r20Var) {
        return OooOOOO(r20Var);
    }

    public static String OooOOOO(r20 r20Var) {
        return new s20().OooO0O0(r20Var).toString();
    }

    @Override // p285z2.f20
    public void OooO0oO(char c) {
        try {
            this.OooO0O0.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    @Override // p285z2.f20
    public void OooO0oo(String str) {
        try {
            this.OooO0O0.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public String toString() {
        return this.OooO0O0.toString();
    }
}
