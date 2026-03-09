package p285z2;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
public class e70<T extends Throwable> extends u20<T> {
    private final p20<? extends Throwable> Ooooo00;

    public e70(p20<? extends Throwable> p20Var) {
        this.Ooooo00 = p20Var;
    }

    @n20
    public static <T extends Throwable> p20<T> OooO0oO(p20<? extends Throwable> p20Var) {
        return new e70(p20Var);
    }

    @Override // p285z2.u20
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public void OooO0Oo(T t, l20 l20Var) {
        l20Var.OooO0Oo("cause ");
        this.Ooooo00.OooO00o(t.getCause(), l20Var);
    }

    @Override // p285z2.u20
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public boolean OooO0o0(T t) {
        return this.Ooooo00.OooO0O0(t.getCause());
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("exception with cause ");
        l20Var.OooO0O0(this.Ooooo00);
    }
}
