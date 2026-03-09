package p285z2;

import org.jdeferred.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class y40 extends w40 {
    private final int OooO0Oo;
    private final Object OooO0o;
    private final Promise OooO0o0;

    public y40(int i, int i2, int i3, int i4, Promise promise, Object obj) {
        super(i, i2, i3);
        this.OooO0Oo = i4;
        this.OooO0o0 = promise;
        this.OooO0o = obj;
    }

    public int OooO0Oo() {
        return this.OooO0Oo;
    }

    public Promise OooO0o() {
        return this.OooO0o0;
    }

    public Object OooO0o0() {
        return this.OooO0o;
    }

    @Override // p285z2.w40
    public String toString() {
        return "OneProgress [index=" + this.OooO0Oo + ", promise=" + this.OooO0o0 + ", progress=" + this.OooO0o + ", getDone()=" + OooO00o() + ", getFail()=" + OooO0O0() + ", getTotal()=" + OooO0OO() + "]";
    }
}
