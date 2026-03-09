package p285z2;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: z2.t */
/* JADX INFO: loaded from: classes.dex */
public class C4376t extends AbstractC3932h<C4302r> implements oO0000o0 {
    public C4376t(C4302r c4302r) {
        super(c4302r);
    }

    @Override // p285z2.AbstractC3932h, p285z2.oO0000o0
    public void OooO00o() {
        ((C4302r) this.OoooOoO).OooO0o0().prepareToDraw();
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    public Class<C4302r> OooO0O0() {
        return C4302r.class;
    }

    @Override // p285z2.oO0Ooooo
    public int getSize() {
        return ((C4302r) this.OoooOoO).OooOO0();
    }

    @Override // p285z2.oO0Ooooo
    public void recycle() {
        ((C4302r) this.OoooOoO).stop();
        ((C4302r) this.OoooOoO).OooOOO0();
    }
}
