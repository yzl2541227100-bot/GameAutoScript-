package p285z2;

/* JADX INFO: renamed from: z2.dt */
/* JADX INFO: loaded from: classes2.dex */
public final class C3814dt {
    private final boolean OooO00o;

    public C3814dt(boolean z) {
        this.OooO00o = z;
    }

    public final void OooO00o(C3807dm[] c3807dmArr) {
        if (!this.OooO00o || c3807dmArr == null || c3807dmArr.length < 3) {
            return;
        }
        C3807dm c3807dm = c3807dmArr[0];
        c3807dmArr[0] = c3807dmArr[2];
        c3807dmArr[2] = c3807dm;
    }

    public final boolean OooO0O0() {
        return this.OooO00o;
    }
}
