package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class e20 implements d20 {
    public final Throwable OooO00o;
    public final boolean OooO0O0;
    private Object OooO0OO;

    public e20(Throwable th) {
        this.OooO00o = th;
        this.OooO0O0 = false;
    }

    public e20(Throwable th, boolean z) {
        this.OooO00o = th;
        this.OooO0O0 = z;
    }

    @Override // p285z2.d20
    public Object OooO00o() {
        return this.OooO0OO;
    }

    @Override // p285z2.d20
    public void OooO0O0(Object obj) {
        this.OooO0OO = obj;
    }

    public Throwable OooO0OO() {
        return this.OooO00o;
    }

    public boolean OooO0Oo() {
        return this.OooO0O0;
    }
}
