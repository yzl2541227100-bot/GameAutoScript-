package p285z2;

import java.util.Iterator;
import org.junit.runner.Description;
import org.junit.runner.manipulation.NoTestsRemainException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a90 {
    public static final a90 OooO00o = new OooO00o();

    public static class OooO00o extends a90 {
        @Override // p285z2.a90
        public void OooO00o(Object obj) throws NoTestsRemainException {
        }

        @Override // p285z2.a90
        public String OooO0O0() {
            return "all tests";
        }

        @Override // p285z2.a90
        public a90 OooO0OO(a90 a90Var) {
            return a90Var;
        }

        @Override // p285z2.a90
        public boolean OooO0o0(Description description) {
            return true;
        }
    }

    public static class OooO0O0 extends a90 {
        public final /* synthetic */ Description OooO0O0;

        public OooO0O0(Description description) {
            this.OooO0O0 = description;
        }

        @Override // p285z2.a90
        public String OooO0O0() {
            return String.format("Method %s", this.OooO0O0.getDisplayName());
        }

        @Override // p285z2.a90
        public boolean OooO0o0(Description description) {
            if (description.isTest()) {
                return this.OooO0O0.equals(description);
            }
            Iterator<Description> it = description.getChildren().iterator();
            while (it.hasNext()) {
                if (OooO0o0(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public class OooO0OO extends a90 {
        public final /* synthetic */ a90 OooO0O0;
        public final /* synthetic */ a90 OooO0OO;

        public OooO0OO(a90 a90Var, a90 a90Var2) {
            this.OooO0O0 = a90Var;
            this.OooO0OO = a90Var2;
        }

        @Override // p285z2.a90
        public String OooO0O0() {
            return this.OooO0O0.OooO0O0() + " and " + this.OooO0OO.OooO0O0();
        }

        @Override // p285z2.a90
        public boolean OooO0o0(Description description) {
            return this.OooO0O0.OooO0o0(description) && this.OooO0OO.OooO0o0(description);
        }
    }

    public static a90 OooO0Oo(Description description) {
        return new OooO0O0(description);
    }

    public void OooO00o(Object obj) throws NoTestsRemainException {
        if (obj instanceof b90) {
            ((b90) obj).OooO0OO(this);
        }
    }

    public abstract String OooO0O0();

    public a90 OooO0OO(a90 a90Var) {
        return (a90Var == this || a90Var == OooO00o) ? this : new OooO0OO(this, a90Var);
    }

    public abstract boolean OooO0o0(Description description);
}
