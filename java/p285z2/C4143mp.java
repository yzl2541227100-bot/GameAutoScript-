package p285z2;

/* JADX INFO: renamed from: z2.mp */
/* JADX INFO: loaded from: classes2.dex */
public final class C4143mp extends C3773cp {
    @Override // p285z2.C3773cp, p285z2.InterfaceC3921gp
    public final int OooO00o() {
        return 3;
    }

    @Override // p285z2.C3773cp, p285z2.InterfaceC3921gp
    public final void OooO0O0(C3958hp c3958hp) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3958hp.OooOO0()) {
                break;
            }
            char cOooO0Oo = c3958hp.OooO0Oo();
            c3958hp.OooO0o++;
            OooO0Oo(cOooO0Oo, sb);
            if (sb.length() % 3 == 0) {
                C3773cp.OooO0oO(c3958hp, sb);
                if (C4032jp.OooOOOO(c3958hp.OooO0o0(), c3958hp.OooO0o, OooO00o()) != OooO00o()) {
                    c3958hp.OooOOOo(0);
                    break;
                }
            }
        }
        OooO0o(c3958hp, sb);
    }

    @Override // p285z2.C3773cp
    public final int OooO0Oo(char c, StringBuilder sb) {
        char c2;
        int i;
        if (c == '\r') {
            c2 = 0;
        } else {
            if (c != ' ') {
                if (c == '*') {
                    sb.append((char) 1);
                } else if (c != '>') {
                    if (c >= '0' && c <= '9') {
                        i = (c - '0') + 4;
                    } else if (c < 'A' || c > 'Z') {
                        C4032jp.OooO0o(c);
                    } else {
                        i = (c - 'A') + 14;
                    }
                    c2 = (char) i;
                } else {
                    c2 = 2;
                }
                return 1;
            }
            c2 = 3;
        }
        sb.append(c2);
        return 1;
    }

    @Override // p285z2.C3773cp
    public final void OooO0o(C3958hp c3958hp, StringBuilder sb) {
        c3958hp.OooOOo0();
        int iOooO0O0 = c3958hp.OooO0oo().OooO0O0() - c3958hp.OooO00o();
        c3958hp.OooO0o -= sb.length();
        if (c3958hp.OooO0oO() > 1 || iOooO0O0 > 1 || c3958hp.OooO0oO() != iOooO0O0) {
            c3958hp.OooOOoo((char) 254);
        }
        if (c3958hp.OooO0o() < 0) {
            c3958hp.OooOOOo(0);
        }
    }
}
