package p285z2;

import org.junit.runner.Description;

/* JADX INFO: renamed from: z2.cw */
/* JADX INFO: loaded from: classes2.dex */
public class C3780cw implements InterfaceC3854ew, u80 {
    private final Description OooO00o;

    public C3780cw(Description description) {
        this.OooO00o = description;
    }

    @Override // p285z2.InterfaceC3854ew
    public int OooO00o() {
        return 1;
    }

    @Override // p285z2.InterfaceC3854ew
    public void OooO0O0(C4002iw c4002iw) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    @Override // p285z2.u80
    public Description getDescription() {
        return this.OooO00o;
    }

    public String toString() {
        return getDescription().toString();
    }
}
