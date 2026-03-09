package p285z2;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class w20<T> extends i30<T> {
    public w20(Iterable<p20<? super T>> iterable) {
        super(iterable);
    }

    @n20
    public static <T> w20<T> OooO(p20<T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3, p20<? super T> p20Var4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        arrayList.add(p20Var4);
        return OooO0o(arrayList);
    }

    @n20
    public static <T> w20<T> OooO0o(Iterable<p20<? super T>> iterable) {
        return new w20<>(iterable);
    }

    @n20
    public static <T> w20<T> OooO0oO(p20<T> p20Var, p20<? super T> p20Var2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        return OooO0o(arrayList);
    }

    @n20
    public static <T> w20<T> OooO0oo(p20<T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        return OooO0o(arrayList);
    }

    @n20
    public static <T> w20<T> OooOO0(p20<T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3, p20<? super T> p20Var4, p20<? super T> p20Var5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        arrayList.add(p20Var4);
        arrayList.add(p20Var5);
        return OooO0o(arrayList);
    }

    @n20
    public static <T> w20<T> OooOO0O(p20<T> p20Var, p20<? super T> p20Var2, p20<? super T> p20Var3, p20<? super T> p20Var4, p20<? super T> p20Var5, p20<? super T> p20Var6) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p20Var);
        arrayList.add(p20Var2);
        arrayList.add(p20Var3);
        arrayList.add(p20Var4);
        arrayList.add(p20Var5);
        arrayList.add(p20Var6);
        return OooO0o(arrayList);
    }

    @n20
    public static <T> w20<T> OooOO0o(p20<? super T>... p20VarArr) {
        return OooO0o(Arrays.asList(p20VarArr));
    }

    @Override // p285z2.i30, p285z2.p20
    public boolean OooO0O0(Object obj) {
        return OooO0o0(obj, true);
    }

    @Override // p285z2.i30
    public /* bridge */ /* synthetic */ void OooO0Oo(l20 l20Var, String str) {
        super.OooO0Oo(l20Var, str);
    }

    @Override // p285z2.i30, p285z2.r20
    public void describeTo(l20 l20Var) {
        OooO0Oo(l20Var, "or");
    }
}
