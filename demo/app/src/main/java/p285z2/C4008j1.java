package p285z2;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: z2.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4008j1 implements InterfaceC4119m1, InterfaceC4082l1 {

    @Nullable
    private final InterfaceC4119m1 OoooOoO;
    private InterfaceC4082l1 OoooOoo;
    private InterfaceC4082l1 Ooooo00;

    public C4008j1(@Nullable InterfaceC4119m1 interfaceC4119m1) {
        this.OoooOoO = interfaceC4119m1;
    }

    private boolean OooOOO() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 == null || interfaceC4119m1.OooOO0o(this);
    }

    private boolean OooOOO0(InterfaceC4082l1 interfaceC4082l1) {
        return interfaceC4082l1.equals(this.OoooOoo) || (this.OoooOoo.OooO0o0() && interfaceC4082l1.equals(this.Ooooo00));
    }

    private boolean OooOOOO() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 == null || interfaceC4119m1.OooO0oO(this);
    }

    private boolean OooOOOo() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 == null || interfaceC4119m1.OooO0oo(this);
    }

    private boolean OooOOo0() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 != null && interfaceC4119m1.OooO0O0();
    }

    @Override // p285z2.InterfaceC4082l1
    public void OooO() {
        if (this.OoooOoo.isRunning()) {
            return;
        }
        this.OoooOoo.OooO();
    }

    @Override // p285z2.InterfaceC4119m1
    public void OooO00o(InterfaceC4082l1 interfaceC4082l1) {
        if (!interfaceC4082l1.equals(this.Ooooo00)) {
            if (this.Ooooo00.isRunning()) {
                return;
            }
            this.Ooooo00.OooO();
        } else {
            InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
            if (interfaceC4119m1 != null) {
                interfaceC4119m1.OooO00o(this);
            }
        }
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooO0O0() {
        return OooOOo0() || OooO0Oo();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0OO(InterfaceC4082l1 interfaceC4082l1) {
        if (!(interfaceC4082l1 instanceof C4008j1)) {
            return false;
        }
        C4008j1 c4008j1 = (C4008j1) interfaceC4082l1;
        return this.OoooOoo.OooO0OO(c4008j1.OoooOoo) && this.Ooooo00.OooO0OO(c4008j1.Ooooo00);
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0Oo() {
        return (this.OoooOoo.OooO0o0() ? this.Ooooo00 : this.OoooOoo).OooO0Oo();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0o() {
        return (this.OoooOoo.OooO0o0() ? this.Ooooo00 : this.OoooOoo).OooO0o();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0o0() {
        return this.OoooOoo.OooO0o0() && this.Ooooo00.OooO0o0();
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooO0oO(InterfaceC4082l1 interfaceC4082l1) {
        return OooOOOO() && OooOOO0(interfaceC4082l1);
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooO0oo(InterfaceC4082l1 interfaceC4082l1) {
        return OooOOOo() && OooOOO0(interfaceC4082l1);
    }

    @Override // p285z2.InterfaceC4119m1
    public void OooOO0(InterfaceC4082l1 interfaceC4082l1) {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        if (interfaceC4119m1 != null) {
            interfaceC4119m1.OooOO0(this);
        }
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooOO0O() {
        return (this.OoooOoo.OooO0o0() ? this.Ooooo00 : this.OoooOoo).OooOO0O();
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooOO0o(InterfaceC4082l1 interfaceC4082l1) {
        return OooOOO() && OooOOO0(interfaceC4082l1);
    }

    public void OooOOo(InterfaceC4082l1 interfaceC4082l1, InterfaceC4082l1 interfaceC4082l12) {
        this.OoooOoo = interfaceC4082l1;
        this.Ooooo00 = interfaceC4082l12;
    }

    @Override // p285z2.InterfaceC4082l1
    public void clear() {
        this.OoooOoo.clear();
        if (this.Ooooo00.isRunning()) {
            this.Ooooo00.clear();
        }
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean isRunning() {
        return (this.OoooOoo.OooO0o0() ? this.Ooooo00 : this.OoooOoo).isRunning();
    }

    @Override // p285z2.InterfaceC4082l1
    public void recycle() {
        this.OoooOoo.recycle();
        this.Ooooo00.recycle();
    }
}
