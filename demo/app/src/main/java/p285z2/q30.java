package p285z2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class q30<T> implements Iterator<r20> {
    private Iterator<T> OoooOoO;

    public q30(Iterator<T> it) {
        this.OoooOoO = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public r20 next() {
        return new p30(this.OoooOoO.next());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.OoooOoO.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.OoooOoO.remove();
    }
}
