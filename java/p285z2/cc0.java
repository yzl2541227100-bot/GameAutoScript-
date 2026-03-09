package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class cc0 {
    private String OooO00o;
    private String OooO0O0;
    private String OooO0OO;
    private int OooO0Oo;

    public String OooO00o() {
        return this.OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO0Oo;
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }

    public String OooO0Oo() {
        return this.OooO00o;
    }

    public void OooO0o(int i) {
        this.OooO0Oo = i;
    }

    public void OooO0o0(String str) {
        this.OooO0O0 = str;
    }

    public void OooO0oO(String str) {
        this.OooO0OO = str;
    }

    public void OooO0oo(String str) {
        this.OooO00o = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cc0)) {
            return false;
        }
        cc0 cc0Var = (cc0) obj;
        if (cc0Var.OooO0Oo() == null || cc0Var.OooO00o() == null || cc0Var.OooO0O0() != this.OooO0Oo || !cc0Var.OooO0OO().equals(this.OooO0OO)) {
            return false;
        }
        if (cc0Var.OooO0Oo().equals(this.OooO00o) && cc0Var.OooO00o().equals(this.OooO0O0) && cc0Var.OooO0OO().equals(this.OooO0OO)) {
            return true;
        }
        return cc0Var.OooO0Oo().equals(this.OooO0O0) && cc0Var.OooO00o().equals(this.OooO00o) && cc0Var.OooO0OO().equals(this.OooO0OO);
    }
}
