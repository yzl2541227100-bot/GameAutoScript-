package p285z2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class x20<T> extends t20<T> {
    private final p20<? super T> Ooooo00;

    public static final class OooO00o<X> {
        private final p20<? super X> OooO00o;

        public OooO00o(p20<? super X> p20Var) {
            this.OooO00o = p20Var;
        }

        public x20<X> OooO00o(p20<? super X> p20Var) {
            return new x20(this.OooO00o).OooO0o0(p20Var);
        }
    }

    public static final class OooO0O0<X> {
        private final p20<? super X> OooO00o;

        public OooO0O0(p20<? super X> p20Var) {
            this.OooO00o = p20Var;
        }

        public x20<X> OooO00o(p20<? super X> p20Var) {
            return new x20(this.OooO00o).OooO0oo(p20Var);
        }
    }

    public x20(p20<? super T> p20Var) {
        this.Ooooo00 = p20Var;
    }

    private ArrayList<p20<? super T>> OooO(p20<? super T> p20Var) {
        ArrayList<p20<? super T>> arrayList = new ArrayList<>();
        arrayList.add(this.Ooooo00);
        arrayList.add(p20Var);
        return arrayList;
    }

    @n20
    public static <LHS> OooO00o<LHS> OooO0o(p20<? super LHS> p20Var) {
        return new OooO00o<>(p20Var);
    }

    @n20
    public static <LHS> OooO0O0<LHS> OooO0oO(p20<? super LHS> p20Var) {
        return new OooO0O0<>(p20Var);
    }

    @Override // p285z2.t20
    public boolean OooO0Oo(T t, l20 l20Var) {
        if (this.Ooooo00.OooO0O0(t)) {
            return true;
        }
        this.Ooooo00.OooO00o(t, l20Var);
        return false;
    }

    public x20<T> OooO0o0(p20<? super T> p20Var) {
        return new x20<>(new v20(OooO(p20Var)));
    }

    public x20<T> OooO0oo(p20<? super T> p20Var) {
        return new x20<>(new w20(OooO(p20Var)));
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0O0(this.Ooooo00);
    }
}
