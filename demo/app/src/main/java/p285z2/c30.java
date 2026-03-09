package p285z2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c30<T> extends t20<Iterable<? super T>> {
    private final p20<? super T> Ooooo00;

    public c30(p20<? super T> p20Var) {
        this.Ooooo00 = p20Var;
    }

    @n20
    public static <T> p20<Iterable<? super T>> OooO0o(p20<? super T> p20Var) {
        return new c30(p20Var);
    }

    @n20
    public static <T> p20<Iterable<? super T>> OooO0o0(T t) {
        return new c30(d30.OooO0oo(t));
    }

    @n20
    public static <T> p20<Iterable<T>> OooO0oO(T... tArr) {
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(OooO0o0(t));
        }
        return v20.OooO0o0(arrayList);
    }

    @n20
    public static <T> p20<Iterable<T>> OooO0oo(p20<? super T>... p20VarArr) {
        ArrayList arrayList = new ArrayList(p20VarArr.length);
        for (p20<? super T> p20Var : p20VarArr) {
            arrayList.add(new c30(p20Var));
        }
        return v20.OooO0o0(arrayList);
    }

    @Override // p285z2.t20
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public boolean OooO0Oo(Iterable<? super T> iterable, l20 l20Var) {
        boolean z = false;
        for (T t : iterable) {
            if (this.Ooooo00.OooO0O0(t)) {
                return true;
            }
            if (z) {
                l20Var.OooO0Oo(", ");
            }
            this.Ooooo00.OooO00o(t, l20Var);
            z = true;
        }
        return false;
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("a collection containing ").OooO0O0(this.Ooooo00);
    }
}
