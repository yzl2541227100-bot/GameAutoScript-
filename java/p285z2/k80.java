package p285z2;

import java.util.Iterator;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes2.dex */
public class k80 extends u90 {
    private final u90 OooO00o;

    public k80(u90 u90Var, Iterable<o80> iterable, Description description) {
        this.OooO00o = OooO0O0(u90Var, iterable, description);
    }

    private static u90 OooO0O0(u90 u90Var, Iterable<o80> iterable, Description description) {
        Iterator<o80> it = iterable.iterator();
        while (it.hasNext()) {
            u90Var = it.next().OooO00o(u90Var, description);
        }
        return u90Var;
    }

    @Override // p285z2.u90
    public void OooO00o() throws Throwable {
        this.OooO00o.OooO00o();
    }
}
