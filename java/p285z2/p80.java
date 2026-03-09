package p285z2;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p80 implements o80 {

    public class OooO00o extends u90 {
        public final /* synthetic */ Description OooO00o;
        public final /* synthetic */ u90 OooO0O0;

        public OooO00o(Description description, u90 u90Var) throws Exception {
            this.OooO00o = description;
            this.OooO0O0 = u90Var;
        }

        @Override // p285z2.u90
        public void OooO00o() throws Exception {
            ArrayList arrayList = new ArrayList();
            p80.this.OooOOOO(this.OooO00o, arrayList);
            try {
                try {
                    this.OooO0O0.OooO00o();
                    p80.this.OooOOo0(this.OooO00o, arrayList);
                } catch (AssumptionViolatedException e) {
                    arrayList.add(e);
                    p80.this.OooOOO0(e, this.OooO00o, arrayList);
                } catch (Throwable th) {
                    arrayList.add(th);
                    p80.this.OooO0oo(th, this.OooO00o, arrayList);
                }
                MultipleFailureException.assertEmpty(arrayList);
            } finally {
                p80.this.OooOO0(this.OooO00o, arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooO0oo(Throwable th, Description description, List<Throwable> list) {
        try {
            OooO0oO(th, description);
        } catch (Throwable th2) {
            list.add(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOO0(Description description, List<Throwable> list) {
        try {
            OooO(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOO0(AssumptionViolatedException assumptionViolatedException, Description description, List<Throwable> list) {
        try {
            if (assumptionViolatedException instanceof org.junit.AssumptionViolatedException) {
                OooOO0O((org.junit.AssumptionViolatedException) assumptionViolatedException, description);
            } else {
                OooOO0o(assumptionViolatedException, description);
            }
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOOO(Description description, List<Throwable> list) {
        try {
            OooOOO(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOo0(Description description, List<Throwable> list) {
        try {
            OooOOOo(description);
        } catch (Throwable th) {
            list.add(th);
        }
    }

    public void OooO(Description description) {
    }

    @Override // p285z2.o80
    public u90 OooO00o(u90 u90Var, Description description) {
        return new OooO00o(description, u90Var);
    }

    public void OooO0oO(Throwable th, Description description) {
    }

    public void OooOO0O(org.junit.AssumptionViolatedException assumptionViolatedException, Description description) {
        OooOO0o(assumptionViolatedException, description);
    }

    @Deprecated
    public void OooOO0o(AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    public void OooOOO(Description description) {
    }

    public void OooOOOo(Description description) {
    }
}
