package p285z2;

/* JADX INFO: renamed from: z2.ap */
/* JADX INFO: loaded from: classes2.dex */
public final class C3699ap implements InterfaceC3921gp {
    private static char OooO0OO(char c, char c2) {
        if (C4032jp.OooO0oO(c) && C4032jp.OooO0oO(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p285z2.InterfaceC3921gp
    public final int OooO00o() {
        return 0;
    }

    @Override // p285z2.InterfaceC3921gp
    public final void OooO0O0(C3958hp c3958hp) {
        if (C4032jp.OooO00o(c3958hp.OooO0o0(), c3958hp.OooO0o) >= 2) {
            c3958hp.OooOOoo(OooO0OO(c3958hp.OooO0o0().charAt(c3958hp.OooO0o), c3958hp.OooO0o0().charAt(c3958hp.OooO0o + 1)));
            c3958hp.OooO0o += 2;
            return;
        }
        char cOooO0Oo = c3958hp.OooO0Oo();
        int iOooOOOO = C4032jp.OooOOOO(c3958hp.OooO0o0(), c3958hp.OooO0o, OooO00o());
        if (iOooOOOO == OooO00o()) {
            if (!C4032jp.OooO0oo(cOooO0Oo)) {
                c3958hp.OooOOoo((char) (cOooO0Oo + 1));
                c3958hp.OooO0o++;
                return;
            } else {
                c3958hp.OooOOoo(C4032jp.OooO0Oo);
                c3958hp.OooOOoo((char) ((cOooO0Oo - 128) + 1));
                c3958hp.OooO0o++;
                return;
            }
        }
        if (iOooOOOO == 1) {
            c3958hp.OooOOoo(C4032jp.OooO0O0);
            c3958hp.OooOOOo(1);
            return;
        }
        if (iOooOOOO == 2) {
            c3958hp.OooOOoo(C4032jp.OooO0oo);
            c3958hp.OooOOOo(2);
            return;
        }
        if (iOooOOOO == 3) {
            c3958hp.OooOOoo(C4032jp.OooO0oO);
            c3958hp.OooOOOo(3);
        } else if (iOooOOOO == 4) {
            c3958hp.OooOOoo(C4032jp.OooO);
            c3958hp.OooOOOo(4);
        } else {
            if (iOooOOOO != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iOooOOOO)));
            }
            c3958hp.OooOOoo(C4032jp.OooO0OO);
            c3958hp.OooOOOo(5);
        }
    }
}
