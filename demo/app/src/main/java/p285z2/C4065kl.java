package p285z2;

/* JADX INFO: renamed from: z2.kl */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4249pk("The shapes API is currently experimental and subject to change")
public class C4065kl extends C3880fl {
    private final float OooO00o;

    public C4065kl(float f) {
        this.OooO00o = f;
    }

    @Override // p285z2.C3880fl
    public void OooO00o(float f, float f2, C4102ll c4102ll) {
        c4102ll.OooO0o0(0.0f, this.OooO00o * f2);
        float f3 = this.OooO00o;
        c4102ll.OooO00o(0.0f, 0.0f, f3 * 2.0f * f2, f3 * 2.0f * f2, f + 180.0f, 90.0f);
    }
}
