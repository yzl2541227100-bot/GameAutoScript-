package p285z2;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class l70 extends z80 {
    private final List<Throwable> OooO00o;
    private final Class<?> OooO0O0;

    public l70(Class<?> cls, Throwable th) {
        Objects.requireNonNull(cls, "Test class cannot be null");
        this.OooO0O0 = cls;
        this.OooO00o = OooO0o(th);
    }

    private List<Throwable> OooO0o(Throwable th) {
        return th instanceof InvocationTargetException ? OooO0o(th.getCause()) : th instanceof InitializationError ? ((InitializationError) th).getCauses() : th instanceof org.junit.internal.runners.InitializationError ? ((org.junit.internal.runners.InitializationError) th).getCauses() : Arrays.asList(th);
    }

    private Description OooO0o0(Throwable th) {
        return Description.createTestDescription(this.OooO0O0, "initializationError");
    }

    private void OooO0oO(Throwable th, f90 f90Var) {
        Description descriptionOooO0o0 = OooO0o0(th);
        f90Var.OooOO0o(descriptionOooO0o0);
        f90Var.OooO0o(new Failure(descriptionOooO0o0, th));
        f90Var.OooO0oo(descriptionOooO0o0);
    }

    @Override // p285z2.z80
    public void OooO00o(f90 f90Var) {
        Iterator<Throwable> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            OooO0oO(it.next(), f90Var);
        }
    }

    @Override // p285z2.z80, p285z2.u80
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(this.OooO0O0);
        Iterator<Throwable> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(OooO0o0(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }
}
