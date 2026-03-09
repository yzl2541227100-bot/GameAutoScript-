package p285z2;

/* JADX INFO: renamed from: z2.cp */
/* JADX INFO: loaded from: classes2.dex */
public class C3773cp implements InterfaceC3921gp {
    private int OooO0OO(C3958hp c3958hp, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        c3958hp.OooO0o--;
        int iOooO0Oo = OooO0Oo(c3958hp.OooO0Oo(), sb2);
        c3958hp.OooOO0o();
        return iOooO0Oo;
    }

    private static String OooO0o0(CharSequence charSequence, int i) {
        int iCharAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    public static void OooO0oO(C3958hp c3958hp, StringBuilder sb) {
        c3958hp.OooOo00(OooO0o0(sb, 0));
        sb.delete(0, 3);
    }

    @Override // p285z2.InterfaceC3921gp
    public int OooO00o() {
        return 1;
    }

    @Override // p285z2.InterfaceC3921gp
    public void OooO0O0(C3958hp c3958hp) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3958hp.OooOO0()) {
                break;
            }
            char cOooO0Oo = c3958hp.OooO0Oo();
            c3958hp.OooO0o++;
            int iOooO0Oo = OooO0Oo(cOooO0Oo, sb);
            int iOooO00o = c3958hp.OooO00o() + ((sb.length() / 3) << 1);
            c3958hp.OooOOo(iOooO00o);
            int iOooO0O0 = c3958hp.OooO0oo().OooO0O0() - iOooO00o;
            if (!c3958hp.OooOO0()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iOooO0O0 < 2 || iOooO0O0 > 2)) {
                    iOooO0Oo = OooO0OO(c3958hp, sb, sb2, iOooO0Oo);
                }
                while (sb.length() % 3 == 1) {
                    if (iOooO0Oo <= 3 && iOooO0O0 != 1) {
                        iOooO0Oo = OooO0OO(c3958hp, sb, sb2, iOooO0Oo);
                    } else if (iOooO0Oo <= 3) {
                        break;
                    } else {
                        iOooO0Oo = OooO0OO(c3958hp, sb, sb2, iOooO0Oo);
                    }
                }
            } else if (sb.length() % 3 == 0 && C4032jp.OooOOOO(c3958hp.OooO0o0(), c3958hp.OooO0o, OooO00o()) != OooO00o()) {
                c3958hp.OooOOOo(0);
                break;
            }
        }
        OooO0o(c3958hp, sb);
    }

    public int OooO0Oo(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else {
                if (c < 'A' || c > 'Z') {
                    if (c < ' ') {
                        sb.append((char) 0);
                    } else {
                        char c3 = '!';
                        if (c < '!' || c > '/') {
                            if (c >= ':' && c <= '@') {
                                sb.append((char) 1);
                                i = (c - ':') + 15;
                            } else if (c < '[' || c > '_') {
                                c3 = '`';
                                if (c < '`' || c > 127) {
                                    sb.append("\u0001\u001e");
                                    return OooO0Oo((char) (c - 128), sb) + 2;
                                }
                                sb.append((char) 2);
                            } else {
                                sb.append((char) 1);
                                i = (c - '[') + 22;
                            }
                            c = (char) i;
                        } else {
                            sb.append((char) 1);
                        }
                        i = c - c3;
                        c = (char) i;
                    }
                    sb.append(c);
                    return 2;
                }
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0o(p285z2.C3958hp r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.OooO00o()
            int r4 = r4 + r0
            r8.OooOOo(r4)
            z2.kp r0 = r8.OooO0oo()
            int r0 = r0.OooO0O0()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 2
            if (r3 != r6) goto L3b
            r9.append(r4)
        L27:
            int r0 = r9.length()
            if (r0 < r1) goto L31
            OooO0oO(r8, r9)
            goto L27
        L31:
            boolean r9 = r8.OooOO0()
            if (r9 == 0) goto L6d
        L37:
            r8.OooOOoo(r5)
            goto L6d
        L3b:
            if (r0 != r2) goto L58
            if (r3 != r2) goto L58
        L3f:
            int r0 = r9.length()
            if (r0 < r1) goto L49
            OooO0oO(r8, r9)
            goto L3f
        L49:
            boolean r9 = r8.OooOO0()
            if (r9 == 0) goto L52
            r8.OooOOoo(r5)
        L52:
            int r9 = r8.OooO0o
            int r9 = r9 - r2
            r8.OooO0o = r9
            goto L6d
        L58:
            if (r3 != 0) goto L71
        L5a:
            int r2 = r9.length()
            if (r2 < r1) goto L64
            OooO0oO(r8, r9)
            goto L5a
        L64:
            if (r0 > 0) goto L37
            boolean r9 = r8.OooOO0()
            if (r9 == 0) goto L6d
            goto L37
        L6d:
            r8.OooOOOo(r4)
            return
        L71:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3773cp.OooO0o(z2.hp, java.lang.StringBuilder):void");
    }
}
