package p285z2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Throwable;

/* JADX INFO: loaded from: classes2.dex */
public class d70<T extends Throwable> extends u20<T> {
    private final p20<T> Ooooo00;

    public d70(p20<T> p20Var) {
        this.Ooooo00 = p20Var;
    }

    @n20
    public static <T extends Exception> p20<T> OooO0oO(p20<T> p20Var) {
        return new d70(p20Var);
    }

    @n20
    public static <T extends Throwable> p20<T> OooO0oo(p20<T> p20Var) {
        return new d70(p20Var);
    }

    private String OooOO0(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // p285z2.u20
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public boolean OooO0o0(T t) {
        return this.Ooooo00.OooO0O0(t);
    }

    @Override // p285z2.u20
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public void OooO0Oo(T t, l20 l20Var) {
        this.Ooooo00.OooO00o(t, l20Var);
        l20Var.OooO0Oo("\nStacktrace was: ");
        l20Var.OooO0Oo(OooOO0(t));
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        this.Ooooo00.describeTo(l20Var);
    }
}
