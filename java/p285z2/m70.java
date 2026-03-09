package p285z2;

import java.lang.annotation.Annotation;
import junit.framework.AssertionFailedError;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.notification.Failure;

/* JADX INFO: loaded from: classes2.dex */
public class m70 extends z80 implements b90, c90 {
    private volatile InterfaceC3854ew OooO00o;

    public static final class OooO0O0 implements InterfaceC3965hw {
        private final f90 OooO00o;

        private OooO0O0(f90 f90Var) {
            this.OooO00o = f90Var;
        }

        public /* synthetic */ OooO0O0(f90 f90Var, OooO00o oooO00o) {
            this(f90Var);
        }

        private Class<? extends InterfaceC3854ew> OooO0o(InterfaceC3854ew interfaceC3854ew) {
            return interfaceC3854ew.getClass();
        }

        private Description OooO0o0(InterfaceC3854ew interfaceC3854ew) {
            return interfaceC3854ew instanceof u80 ? ((u80) interfaceC3854ew).getDescription() : Description.createTestDescription(OooO0o(interfaceC3854ew), OooO0oO(interfaceC3854ew));
        }

        private String OooO0oO(InterfaceC3854ew interfaceC3854ew) {
            return interfaceC3854ew instanceof AbstractC3891fw ? ((AbstractC3891fw) interfaceC3854ew).Oooo() : interfaceC3854ew.toString();
        }

        @Override // p285z2.InterfaceC3965hw
        public void OooO00o(InterfaceC3854ew interfaceC3854ew, Throwable th) {
            this.OooO00o.OooO0o(new Failure(OooO0o0(interfaceC3854ew), th));
        }

        @Override // p285z2.InterfaceC3965hw
        public void OooO0O0(InterfaceC3854ew interfaceC3854ew, AssertionFailedError assertionFailedError) {
            OooO00o(interfaceC3854ew, assertionFailedError);
        }

        @Override // p285z2.InterfaceC3965hw
        public void OooO0OO(InterfaceC3854ew interfaceC3854ew) {
            this.OooO00o.OooO0oo(OooO0o0(interfaceC3854ew));
        }

        @Override // p285z2.InterfaceC3965hw
        public void OooO0Oo(InterfaceC3854ew interfaceC3854ew) {
            this.OooO00o.OooOO0o(OooO0o0(interfaceC3854ew));
        }
    }

    public m70(Class<?> cls) {
        this(new C4039jw(cls.asSubclass(AbstractC3891fw.class)));
    }

    public m70(InterfaceC3854ew interfaceC3854ew) {
        OooOO0(interfaceC3854ew);
    }

    private static Description OooO(InterfaceC3854ew interfaceC3854ew) {
        if (interfaceC3854ew instanceof AbstractC3891fw) {
            AbstractC3891fw abstractC3891fw = (AbstractC3891fw) interfaceC3854ew;
            return Description.createTestDescription(abstractC3891fw.getClass(), abstractC3891fw.Oooo(), OooO0oO(abstractC3891fw));
        }
        if (!(interfaceC3854ew instanceof C4039jw)) {
            return interfaceC3854ew instanceof u80 ? ((u80) interfaceC3854ew).getDescription() : interfaceC3854ew instanceof C4556xv ? OooO(((C4556xv) interfaceC3854ew).Oooo()) : Description.createSuiteDescription(interfaceC3854ew.getClass());
        }
        C4039jw c4039jw = (C4039jw) interfaceC3854ew;
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(c4039jw.OooO() == null ? OooO0o(c4039jw) : c4039jw.OooO(), new Annotation[0]);
        int iOooOOo0 = c4039jw.OooOOo0();
        for (int i = 0; i < iOooOOo0; i++) {
            descriptionCreateSuiteDescription.addChild(OooO(c4039jw.OooOOOO(i)));
        }
        return descriptionCreateSuiteDescription;
    }

    private static String OooO0o(C4039jw c4039jw) {
        int iOooO00o = c4039jw.OooO00o();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(iOooO00o), iOooO00o == 0 ? "" : String.format(" [example: %s]", c4039jw.OooOOOO(0)));
    }

    private static Annotation[] OooO0oO(AbstractC3891fw abstractC3891fw) {
        try {
            return abstractC3891fw.getClass().getMethod(abstractC3891fw.Oooo(), new Class[0]).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private InterfaceC3854ew OooO0oo() {
        return this.OooO00o;
    }

    private void OooOO0(InterfaceC3854ew interfaceC3854ew) {
        this.OooO00o = interfaceC3854ew;
    }

    @Override // p285z2.z80
    public void OooO00o(f90 f90Var) {
        C4002iw c4002iw = new C4002iw();
        c4002iw.OooO0OO(OooO0o0(f90Var));
        OooO0oo().OooO0O0(c4002iw);
    }

    @Override // p285z2.b90
    public void OooO0OO(a90 a90Var) throws NoTestsRemainException {
        if (OooO0oo() instanceof b90) {
            ((b90) OooO0oo()).OooO0OO(a90Var);
            return;
        }
        if (OooO0oo() instanceof C4039jw) {
            C4039jw c4039jw = (C4039jw) OooO0oo();
            C4039jw c4039jw2 = new C4039jw(c4039jw.OooO());
            int iOooOOo0 = c4039jw.OooOOo0();
            for (int i = 0; i < iOooOOo0; i++) {
                InterfaceC3854ew interfaceC3854ewOooOOOO = c4039jw.OooOOOO(i);
                if (a90Var.OooO0o0(OooO(interfaceC3854ewOooOOOO))) {
                    c4039jw2.OooO0OO(interfaceC3854ewOooOOOO);
                }
            }
            OooOO0(c4039jw2);
            if (c4039jw2.OooOOo0() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // p285z2.c90
    public void OooO0Oo(d90 d90Var) {
        if (OooO0oo() instanceof c90) {
            ((c90) OooO0oo()).OooO0Oo(d90Var);
        }
    }

    public InterfaceC3965hw OooO0o0(f90 f90Var) {
        return new OooO0O0(f90Var);
    }

    @Override // p285z2.z80, p285z2.u80
    public Description getDescription() {
        return OooO(OooO0oo());
    }
}
