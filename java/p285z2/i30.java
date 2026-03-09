package p285z2;

import java.util.Iterator;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i30<T> extends g20<T> {
    private final Iterable<p20<? super T>> OoooOoO;

    public i30(Iterable<p20<? super T>> iterable) {
        this.OoooOoO = iterable;
    }

    @Override // p285z2.p20
    public abstract boolean OooO0O0(Object obj);

    public void OooO0Oo(l20 l20Var, String str) {
        l20Var.OooO00o("(", C4196o4.OooO00o.OooO0Oo + str + C4196o4.OooO00o.OooO0Oo, ")", this.OoooOoO);
    }

    public boolean OooO0o0(Object obj, boolean z) {
        Iterator<p20<? super T>> it = this.OoooOoO.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0O0(obj) == z) {
                return z;
            }
        }
        return !z;
    }

    @Override // p285z2.r20
    public abstract void describeTo(l20 l20Var);
}
