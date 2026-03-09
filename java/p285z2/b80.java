package p285z2;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b80 extends u90 {
    private final u90 OooO00o;
    private final Object OooO0O0;
    private final List<q90> OooO0OO;

    public b80(u90 u90Var, List<q90> list, Object obj) {
        this.OooO00o = u90Var;
        this.OooO0OO = list;
        this.OooO0O0 = obj;
    }

    @Override // p285z2.u90
    public void OooO00o() throws Throwable {
        Iterator<q90> it = this.OooO0OO.iterator();
        while (it.hasNext()) {
            it.next().OooOOOO(this.OooO0O0, new Object[0]);
        }
        this.OooO00o.OooO00o();
    }
}
