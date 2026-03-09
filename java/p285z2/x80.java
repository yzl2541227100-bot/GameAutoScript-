package p285z2;

import java.util.Comparator;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x80 {

    public static class OooO00o extends x80 {
        public final /* synthetic */ z80 OooO00o;

        public OooO00o(z80 z80Var) {
            this.OooO00o = z80Var;
        }

        @Override // p285z2.x80
        public z80 OooO0oo() {
            return this.OooO00o;
        }
    }

    public static x80 OooO(Class<?> cls, String str) {
        return OooO00o(cls).OooO0o(Description.createTestDescription(cls, str));
    }

    public static x80 OooO00o(Class<?> cls) {
        return new h70(cls);
    }

    public static x80 OooO0O0(Class<?> cls) {
        return new h70(cls, false);
    }

    public static x80 OooO0OO(t80 t80Var, Class<?>... clsArr) {
        try {
            return OooOO0(t80Var.OooO0O0(new v60(true), clsArr));
        } catch (InitializationError unused) {
            throw new RuntimeException("Bug in saff's brain: Suite constructor, called as above, should always complete");
        }
    }

    public static x80 OooO0Oo(Class<?>... clsArr) {
        return OooO0OO(JUnitCore.OooO0O0(), clsArr);
    }

    public static x80 OooO0o0(Class<?> cls, Throwable th) {
        return OooOO0(new l70(cls, th));
    }

    public static x80 OooOO0(z80 z80Var) {
        return new OooO00o(z80Var);
    }

    public x80 OooO0o(Description description) {
        return OooO0oO(a90.OooO0Oo(description));
    }

    public x80 OooO0oO(a90 a90Var) {
        return new i70(this, a90Var);
    }

    public abstract z80 OooO0oo();

    public x80 OooOO0O(Comparator<Description> comparator) {
        return new j70(this, comparator);
    }
}
