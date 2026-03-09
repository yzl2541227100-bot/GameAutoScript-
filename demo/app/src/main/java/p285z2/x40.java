package p285z2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class x40 implements Iterable<a50> {
    private final List<a50> OoooOoO;

    public x40(int i) {
        this.OoooOoO = new CopyOnWriteArrayList(new a50[i]);
    }

    public a50 OooO00o(int i) {
        return this.OoooOoO.get(i);
    }

    public void OooO0O0(int i, a50 a50Var) {
        this.OoooOoO.set(i, a50Var);
    }

    @Override // java.lang.Iterable
    public Iterator<a50> iterator() {
        return this.OoooOoO.iterator();
    }

    public int size() {
        return this.OoooOoO.size();
    }

    public String toString() {
        return "MultipleResults [results=" + this.OoooOoO + "]";
    }
}
