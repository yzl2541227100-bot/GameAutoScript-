package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j20<T> extends g20<T> {
    private final String OoooOoO;

    public j20(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description should be non null!");
        }
        this.OoooOoO = str;
    }

    @Override // p285z2.r20
    public final void describeTo(l20 l20Var) {
        l20Var.OooO0Oo(this.OoooOoO);
    }
}
