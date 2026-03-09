package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k20<T> extends u20<T> {
    private final String Ooooo00;

    public k20(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description must be non null!");
        }
        this.Ooooo00 = str;
    }

    @Override // p285z2.r20
    public final void describeTo(l20 l20Var) {
        l20Var.OooO0Oo(this.Ooooo00);
    }
}
