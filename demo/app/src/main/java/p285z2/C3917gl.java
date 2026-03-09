package p285z2;

/* JADX INFO: renamed from: z2.gl */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4249pk("The shapes API is currently experimental and subject to change")
public class C3917gl extends C3880fl {
    private final float OooO00o;

    public C3917gl(float f) {
        this.OooO00o = f;
    }

    @Override // p285z2.C3880fl
    public void OooO00o(float f, float f2, C4102ll c4102ll) {
        c4102ll.OooO0o0(0.0f, this.OooO00o * f2);
        double d = f;
        double d2 = f2;
        c4102ll.OooO0OO((float) (Math.sin(d) * ((double) this.OooO00o) * d2), (float) (Math.cos(d) * ((double) this.OooO00o) * d2));
    }
}
