package p285z2;

/* JADX INFO: renamed from: z2.fp */
/* JADX INFO: loaded from: classes2.dex */
public final class C3884fp implements InterfaceC3921gp {
    private static void OooO0OO(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C4032jp.OooO0o(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String OooO0Oo(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    private static void OooO0o0(C3958hp c3958hp, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c3958hp.OooOOo0();
                int iOooO0O0 = c3958hp.OooO0oo().OooO0O0() - c3958hp.OooO00o();
                int iOooO0oO = c3958hp.OooO0oO();
                if (iOooO0oO > iOooO0O0) {
                    c3958hp.OooOOo(c3958hp.OooO00o() + 1);
                    iOooO0O0 = c3958hp.OooO0oo().OooO0O0() - c3958hp.OooO00o();
                }
                if (iOooO0oO <= iOooO0O0 && iOooO0O0 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String strOooO0Oo = OooO0Oo(charSequence, 0);
            if (!(!c3958hp.OooOO0()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                c3958hp.OooOOo(c3958hp.OooO00o() + i);
                if (c3958hp.OooO0oo().OooO0O0() - c3958hp.OooO00o() >= 3) {
                    c3958hp.OooOOo(c3958hp.OooO00o() + strOooO0Oo.length());
                    z = false;
                }
            }
            if (z) {
                c3958hp.OooOO0o();
                c3958hp.OooO0o -= i;
            } else {
                c3958hp.OooOo00(strOooO0Oo);
            }
        } finally {
            c3958hp.OooOOOo(0);
        }
    }

    @Override // p285z2.InterfaceC3921gp
    public final int OooO00o() {
        return 4;
    }

    @Override // p285z2.InterfaceC3921gp
    public final void OooO0O0(C3958hp c3958hp) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3958hp.OooOO0()) {
                break;
            }
            OooO0OO(c3958hp.OooO0Oo(), sb);
            c3958hp.OooO0o++;
            if (sb.length() >= 4) {
                c3958hp.OooOo00(OooO0Oo(sb, 0));
                sb.delete(0, 4);
                if (C4032jp.OooOOOO(c3958hp.OooO0o0(), c3958hp.OooO0o, OooO00o()) != OooO00o()) {
                    c3958hp.OooOOOo(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        OooO0o0(c3958hp, sb);
    }
}
