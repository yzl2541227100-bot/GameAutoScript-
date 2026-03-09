package p285z2;

/* JADX INFO: renamed from: z2.wv */
/* JADX INFO: loaded from: classes2.dex */
public class C4519wv extends C4556xv {
    private int OooO0O0;

    public C4519wv(InterfaceC3854ew interfaceC3854ew, int i) {
        super(interfaceC3854ew);
        if (i < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.OooO0O0 = i;
    }

    @Override // p285z2.C4556xv, p285z2.InterfaceC3854ew
    public int OooO00o() {
        return super.OooO00o() * this.OooO0O0;
    }

    @Override // p285z2.C4556xv, p285z2.InterfaceC3854ew
    public void OooO0O0(C4002iw c4002iw) {
        for (int i = 0; i < this.OooO0O0 && !c4002iw.OooOOO(); i++) {
            super.OooO0O0(c4002iw);
        }
    }

    @Override // p285z2.C4556xv
    public String toString() {
        return super.toString() + "(repeated)";
    }
}
