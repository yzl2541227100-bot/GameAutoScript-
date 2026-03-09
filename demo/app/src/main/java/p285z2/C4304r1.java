package p285z2;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: z2.r1 */
/* JADX INFO: loaded from: classes.dex */
public class C4304r1 implements InterfaceC4119m1, InterfaceC4082l1 {

    @Nullable
    private final InterfaceC4119m1 OoooOoO;
    private InterfaceC4082l1 OoooOoo;
    private InterfaceC4082l1 Ooooo00;
    private boolean Ooooo0o;

    @VisibleForTesting
    public C4304r1() {
        this(null);
    }

    public C4304r1(@Nullable InterfaceC4119m1 interfaceC4119m1) {
        this.OoooOoO = interfaceC4119m1;
    }

    private boolean OooOOO() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 == null || interfaceC4119m1.OooO0oO(this);
    }

    private boolean OooOOO0() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 == null || interfaceC4119m1.OooOO0o(this);
    }

    private boolean OooOOOO() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 == null || interfaceC4119m1.OooO0oo(this);
    }

    private boolean OooOOOo() {
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        return interfaceC4119m1 != null && interfaceC4119m1.OooO0O0();
    }

    @Override // p285z2.InterfaceC4082l1
    public void OooO() {
        this.Ooooo0o = true;
        if (!this.OoooOoo.OooOO0O() && !this.Ooooo00.isRunning()) {
            this.Ooooo00.OooO();
        }
        if (!this.Ooooo0o || this.OoooOoo.isRunning()) {
            return;
        }
        this.OoooOoo.OooO();
    }

    @Override // p285z2.InterfaceC4119m1
    public void OooO00o(InterfaceC4082l1 interfaceC4082l1) {
        InterfaceC4119m1 interfaceC4119m1;
        if (interfaceC4082l1.equals(this.OoooOoo) && (interfaceC4119m1 = this.OoooOoO) != null) {
            interfaceC4119m1.OooO00o(this);
        }
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooO0O0() {
        return OooOOOo() || OooO0Oo();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0OO(InterfaceC4082l1 interfaceC4082l1) {
        if (!(interfaceC4082l1 instanceof C4304r1)) {
            return false;
        }
        C4304r1 c4304r1 = (C4304r1) interfaceC4082l1;
        InterfaceC4082l1 interfaceC4082l12 = this.OoooOoo;
        if (interfaceC4082l12 == null) {
            if (c4304r1.OoooOoo != null) {
                return false;
            }
        } else if (!interfaceC4082l12.OooO0OO(c4304r1.OoooOoo)) {
            return false;
        }
        InterfaceC4082l1 interfaceC4082l13 = this.Ooooo00;
        InterfaceC4082l1 interfaceC4082l14 = c4304r1.Ooooo00;
        if (interfaceC4082l13 == null) {
            if (interfaceC4082l14 != null) {
                return false;
            }
        } else if (!interfaceC4082l13.OooO0OO(interfaceC4082l14)) {
            return false;
        }
        return true;
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0Oo() {
        return this.OoooOoo.OooO0Oo() || this.Ooooo00.OooO0Oo();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0o() {
        return this.OoooOoo.OooO0o();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooO0o0() {
        return this.OoooOoo.OooO0o0();
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooO0oO(InterfaceC4082l1 interfaceC4082l1) {
        return OooOOO() && interfaceC4082l1.equals(this.OoooOoo) && !OooO0O0();
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooO0oo(InterfaceC4082l1 interfaceC4082l1) {
        return OooOOOO() && (interfaceC4082l1.equals(this.OoooOoo) || !this.OoooOoo.OooO0Oo());
    }

    @Override // p285z2.InterfaceC4119m1
    public void OooOO0(InterfaceC4082l1 interfaceC4082l1) {
        if (interfaceC4082l1.equals(this.Ooooo00)) {
            return;
        }
        InterfaceC4119m1 interfaceC4119m1 = this.OoooOoO;
        if (interfaceC4119m1 != null) {
            interfaceC4119m1.OooOO0(this);
        }
        if (this.Ooooo00.OooOO0O()) {
            return;
        }
        this.Ooooo00.clear();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean OooOO0O() {
        return this.OoooOoo.OooOO0O() || this.Ooooo00.OooOO0O();
    }

    @Override // p285z2.InterfaceC4119m1
    public boolean OooOO0o(InterfaceC4082l1 interfaceC4082l1) {
        return OooOOO0() && interfaceC4082l1.equals(this.OoooOoo);
    }

    public void OooOOo0(InterfaceC4082l1 interfaceC4082l1, InterfaceC4082l1 interfaceC4082l12) {
        this.OoooOoo = interfaceC4082l1;
        this.Ooooo00 = interfaceC4082l12;
    }

    @Override // p285z2.InterfaceC4082l1
    public void clear() {
        this.Ooooo0o = false;
        this.Ooooo00.clear();
        this.OoooOoo.clear();
    }

    @Override // p285z2.InterfaceC4082l1
    public boolean isRunning() {
        return this.OoooOoo.isRunning();
    }

    @Override // p285z2.InterfaceC4082l1
    public void recycle() {
        this.OoooOoo.recycle();
        this.Ooooo00.recycle();
    }
}
