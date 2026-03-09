package p285z2;

/* JADX INFO: renamed from: z2.nl */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4249pk("The shapes API is currently experimental and subject to change")
public class C4176nl extends C3954hl {
    private final float OooO00o;
    private final boolean OooO0O0;

    public C4176nl(float f, boolean z) {
        this.OooO00o = f;
        this.OooO0O0 = z;
    }

    @Override // p285z2.C3954hl
    public void OooO00o(float f, float f2, C4102ll c4102ll) {
        float f3 = f / 2.0f;
        c4102ll.OooO0OO(f3 - (this.OooO00o * f2), 0.0f);
        c4102ll.OooO0OO(f3, (this.OooO0O0 ? this.OooO00o : -this.OooO00o) * f2);
        c4102ll.OooO0OO(f3 + (this.OooO00o * f2), 0.0f);
        c4102ll.OooO0OO(f, 0.0f);
    }
}
