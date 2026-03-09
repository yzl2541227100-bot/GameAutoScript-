package p285z2;

import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class t80 {

    public class OooO00o extends s90 {
        public final /* synthetic */ s90 OooO0O0;

        public OooO00o(s90 s90Var) throws Throwable {
            this.OooO0O0 = s90Var;
        }

        @Override // p285z2.s90
        public z80 OooO0OO(Class<?> cls) throws Throwable {
            return t80.this.OooO00o(this.OooO0O0, cls);
        }
    }

    public static t80 OooO0OO() {
        return new t80();
    }

    public z80 OooO00o(s90 s90Var, Class<?> cls) throws Throwable {
        return s90Var.OooO0OO(cls);
    }

    public z80 OooO0O0(s90 s90Var, Class<?>[] clsArr) throws InitializationError {
        return new m90(new OooO00o(s90Var), clsArr);
    }
}
