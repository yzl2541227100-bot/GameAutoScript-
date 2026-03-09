package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class v50 {

    public static class OooO00o extends u20<u50> {
        public final /* synthetic */ int Ooooo00;

        public OooO00o(int i) {
            this.Ooooo00 = i;
        }

        @Override // p285z2.u20
        /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
        public boolean OooO0o0(u50 u50Var) {
            return u50Var.OooO00o() == this.Ooooo00;
        }

        @Override // p285z2.r20
        public void describeTo(l20 l20Var) {
            l20Var.OooO0Oo("has " + this.Ooooo00 + " failures");
        }
    }

    public static class OooO0O0 extends g20<Object> {
        public final /* synthetic */ String OoooOoO;

        public OooO0O0(String str) {
            this.OoooOoO = str;
        }

        @Override // p285z2.p20
        public boolean OooO0O0(Object obj) {
            return obj.toString().contains(this.OoooOoO) && v50.OooO00o(1).OooO0O0(obj);
        }

        @Override // p285z2.r20
        public void describeTo(l20 l20Var) {
            l20Var.OooO0Oo("has single failure containing " + this.OoooOoO);
        }
    }

    public static class OooO0OO extends g20<u50> {
        public final /* synthetic */ String OoooOoO;

        public OooO0OO(String str) {
            this.OoooOoO = str;
        }

        @Override // p285z2.p20
        public boolean OooO0O0(Object obj) {
            return obj.toString().contains(this.OoooOoO);
        }

        @Override // p285z2.r20
        public void describeTo(l20 l20Var) {
            l20Var.OooO0Oo("has failure containing " + this.OoooOoO);
        }
    }

    public static p20<u50> OooO00o(int i) {
        return new OooO00o(i);
    }

    public static p20<u50> OooO0O0(String str) {
        return new OooO0OO(str);
    }

    public static p20<Object> OooO0OO(String str) {
        return new OooO0O0(str);
    }

    public static p20<u50> OooO0Oo() {
        return OooO00o(0);
    }
}
