package p285z2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.junit.runners.model.MultipleFailureException;

/* JADX INFO: loaded from: classes2.dex */
public class e80 extends s80 {
    private List<Throwable> OooO00o = new ArrayList();

    public class OooO00o implements Callable<Object> {
        public final /* synthetic */ String OoooOoO;
        public final /* synthetic */ Object OoooOoo;
        public final /* synthetic */ p20 Ooooo00;

        public OooO00o(String str, Object obj, p20 p20Var) {
            this.OoooOoO = str;
            this.OoooOoo = obj;
            this.Ooooo00 = p20Var;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            d50.OoooOOo(this.OoooOoO, this.OoooOoo, this.Ooooo00);
            return this.OoooOoo;
        }
    }

    @Override // p285z2.s80
    public void OooO0O0() throws Exception {
        MultipleFailureException.assertEmpty(this.OooO00o);
    }

    public void OooO0OO(Throwable th) {
        this.OooO00o.add(th);
    }

    public <T> T OooO0Oo(Callable<T> callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            OooO0OO(th);
            return null;
        }
    }

    public <T> void OooO0o(String str, T t, p20<T> p20Var) {
        OooO0Oo(new OooO00o(str, t, p20Var));
    }

    public <T> void OooO0o0(T t, p20<T> p20Var) {
        OooO0o("", t, p20Var);
    }
}
