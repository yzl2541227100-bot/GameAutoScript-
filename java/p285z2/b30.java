package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class b30<T> extends g20<T> {
    private final String OoooOoO;

    public b30() {
        this("ANYTHING");
    }

    public b30(String str) {
        this.OoooOoO = str;
    }

    @n20
    public static p20<Object> OooO0Oo() {
        return new b30();
    }

    @n20
    public static p20<Object> OooO0o0(String str) {
        return new b30(str);
    }

    @Override // p285z2.p20
    public boolean OooO0O0(Object obj) {
        return true;
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo(this.OoooOoO);
    }
}
