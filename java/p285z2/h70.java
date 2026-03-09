package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class h70 extends x80 {
    private final Object OooO00o;
    private final Class<?> OooO0O0;
    private final boolean OooO0OO;
    private volatile z80 OooO0Oo;

    public h70(Class<?> cls) {
        this(cls, true);
    }

    public h70(Class<?> cls, boolean z) {
        this.OooO00o = new Object();
        this.OooO0O0 = cls;
        this.OooO0OO = z;
    }

    @Override // p285z2.x80
    public z80 OooO0oo() {
        if (this.OooO0Oo == null) {
            synchronized (this.OooO00o) {
                if (this.OooO0Oo == null) {
                    this.OooO0Oo = new v60(this.OooO0OO).OooO0oO(this.OooO0O0);
                }
            }
        }
        return this.OooO0Oo;
    }
}
