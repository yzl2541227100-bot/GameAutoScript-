package p285z2;

import java.util.ArrayList;
import java.util.Arrays;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes2.dex */
public class v20<T> extends m20<T> {
    private final Iterable<p20<? super T>> OoooOoO;

    public v20(Iterable<p20<? super T>> iterable) {
        this.OoooOoO = iterable;
    }

    @n20
    public static <T> p20<T> OooO(p20<? super T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3, p20<? super T> p20Var4, p20<? super T> p20Var5) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        arrayList.add(p20Var4);
        arrayList.add(p20Var5);
        return OooO0o0(arrayList);
    }

    @n20
    public static <T> p20<T> OooO0o(p20<? super T> p20Var, p20<? super T> p20Var2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        return OooO0o0(arrayList);
    }

    @n20
    public static <T> p20<T> OooO0o0(Iterable<p20<? super T>> iterable) {
        return new v20(iterable);
    }

    @n20
    public static <T> p20<T> OooO0oO(p20<? super T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        return OooO0o0(arrayList);
    }

    @n20
    public static <T> p20<T> OooO0oo(p20<? super T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3, p20<? super T> p20Var4) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        arrayList.add(p20Var4);
        return OooO0o0(arrayList);
    }

    @n20
    public static <T> p20<T> OooOO0(p20<? super T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3, p20<? super T> p20Var4, p20<? super T> p20Var5, p20<? super T> p20Var6) {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        arrayList.add(p20Var4);
        arrayList.add(p20Var5);
        arrayList.add(p20Var6);
        return OooO0o0(arrayList);
    }

    @n20
    public static <T> p20<T> OooOO0O(p20<? super T>... p20VarArr) {
        return OooO0o0(Arrays.asList(p20VarArr));
    }

    @Override // p285z2.m20
    public boolean OooO0Oo(Object obj, l20 l20Var) {
        for (p20<? super T> p20Var : this.OoooOoO) {
            if (!p20Var.OooO0O0(obj)) {
                l20Var.OooO0O0(p20Var).OooO0Oo(C4196o4.OooO00o.OooO0Oo);
                p20Var.OooO00o(obj, l20Var);
                return false;
            }
        }
        return true;
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO00o("(", " and ", ")", this.OoooOoO);
    }
}
