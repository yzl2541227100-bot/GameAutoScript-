package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.tl */
/* JADX INFO: loaded from: classes2.dex */
public final class C4398tl {
    private final AbstractC4361sl OooO00o;
    private C3772co OooO0O0;

    public C4398tl(AbstractC4361sl abstractC4361sl) {
        if (abstractC4361sl == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.OooO00o = abstractC4361sl;
    }

    public final C4398tl OooO() {
        return new C4398tl(this.OooO00o.OooO00o(this.OooO00o.OooO0o0().OooOO0()));
    }

    public final C4398tl OooO00o(int i, int i2, int i3, int i4) {
        return new C4398tl(this.OooO00o.OooO00o(this.OooO00o.OooO0o0().OooO00o(i, i2, i3, i4)));
    }

    public final C3772co OooO0O0() throws NotFoundException {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = this.OooO00o.OooO0O0();
        }
        return this.OooO0O0;
    }

    public final C3735bo OooO0OO(int i, C3735bo c3735bo) throws NotFoundException {
        return this.OooO00o.OooO0OO(i, c3735bo);
    }

    public final int OooO0Oo() {
        return this.OooO00o.OooO0Oo();
    }

    public final boolean OooO0o() {
        return this.OooO00o.OooO0o0().OooO0oO();
    }

    public final int OooO0o0() {
        return this.OooO00o.OooO0o();
    }

    public final boolean OooO0oO() {
        return this.OooO00o.OooO0o0().OooO0oo();
    }

    public final C4398tl OooO0oo() {
        return new C4398tl(this.OooO00o.OooO00o(this.OooO00o.OooO0o0().OooO()));
    }

    public final String toString() {
        try {
            return OooO0O0().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
