package p285z2;

/* JADX INFO: renamed from: z2.a7 */
/* JADX INFO: loaded from: classes.dex */
public class C3681a7 {
    private static C3681a7 OooO0OO;
    private boolean OooO00o = false;
    public OooO00o OooO0O0;

    /* JADX INFO: renamed from: z2.a7$OooO00o */
    public interface OooO00o {
        void OooO00o();

        void OooO0O0();
    }

    public static C3681a7 OooO00o() {
        if (OooO0OO == null) {
            synchronized (C3681a7.class) {
                if (OooO0OO == null) {
                    OooO0OO = new C3681a7();
                }
            }
        }
        return OooO0OO;
    }

    public boolean OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0OO(int i) {
        if (i == 2) {
            this.OooO00o = true;
            OooO00o oooO00o = this.OooO0O0;
            if (oooO00o != null) {
                oooO00o.OooO00o();
                return;
            }
            return;
        }
        if (i == 1) {
            this.OooO00o = false;
            OooO00o oooO00o2 = this.OooO0O0;
            if (oooO00o2 != null) {
                oooO00o2.OooO0O0();
            }
        }
    }

    public void OooO0Oo() {
        this.OooO0O0 = null;
    }

    public void OooO0o0(OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
    }
}
