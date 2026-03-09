package p285z2;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: z2.xz */
/* JADX INFO: loaded from: classes2.dex */
public final class C4560xz {
    private final String OooO00o;
    private final int OooO0O0;
    private int OooO0OO;
    private int OooO0Oo;
    private int OooO0o;
    private int OooO0o0;
    private char[] OooO0oO;

    public C4560xz(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.OooO00o = name;
        this.OooO0O0 = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r1 = r8.OooO0oO;
        r2 = r8.OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.OooO0o0 - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String OooO00o() {
        /*
            r8 = this;
            int r0 = r8.OooO0OO
            r8.OooO0Oo = r0
            r8.OooO0o0 = r0
        L6:
            int r0 = r8.OooO0OO
            int r1 = r8.OooO0O0
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.OooO0oO
            int r2 = r8.OooO0Oo
            int r3 = r8.OooO0o0
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.OooO0oO
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L4f
            r5 = 92
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L4f
            if (r2 == r3) goto L4f
            int r2 = r8.OooO0o0
            int r3 = r2 + 1
            r8.OooO0o0 = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L4a
        L3c:
            int r0 = r8.OooO0o0
            int r2 = r0 + 1
            r8.OooO0o0 = r2
            char r2 = r8.OooO0Oo()
            r1[r0] = r2
            int r0 = r8.OooO0OO
        L4a:
            int r0 = r0 + 1
            r8.OooO0OO = r0
            goto L6
        L4f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.OooO0oO
            int r2 = r8.OooO0Oo
            int r3 = r8.OooO0o0
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.OooO0o0
            r8.OooO0o = r2
            int r0 = r0 + 1
            r8.OooO0OO = r0
            int r0 = r2 + 1
            r8.OooO0o0 = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.OooO0OO
            int r1 = r8.OooO0O0
            if (r0 >= r1) goto L83
            char[] r2 = r8.OooO0oO
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.OooO0o0
            int r7 = r1 + 1
            r8.OooO0o0 = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.OooO0OO = r0
            goto L6a
        L83:
            if (r0 == r1) goto L93
            char[] r1 = r8.OooO0oO
            char r2 = r1[r0]
            if (r2 == r3) goto L93
            char r2 = r1[r0]
            if (r2 == r4) goto L93
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L93:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.OooO0oO
            int r2 = r8.OooO0Oo
            int r3 = r8.OooO0o
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4560xz.OooO00o():java.lang.String");
    }

    private int OooO0OO(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.OooO0O0) {
            throw new IllegalStateException("Malformed DN: " + this.OooO00o);
        }
        char[] cArr = this.OooO0oO;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.OooO00o);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.OooO00o);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    private char OooO0Oo() {
        int i = this.OooO0OO + 1;
        this.OooO0OO = i;
        if (i == this.OooO0O0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.OooO00o);
        }
        char[] cArr = this.OooO0oO;
        char c = cArr[i];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            return OooO0o0();
                    }
                    break;
            }
        }
        return cArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r6.OooO0o0 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String OooO0o() {
        /*
            r6 = this;
            int r0 = r6.OooO0OO
            int r1 = r0 + 4
            int r2 = r6.OooO0O0
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L9b
            r6.OooO0Oo = r0
        Lc:
            int r0 = r0 + 1
            r6.OooO0OO = r0
            int r0 = r6.OooO0OO
            int r1 = r6.OooO0O0
            if (r0 == r1) goto L57
            char[] r1 = r6.OooO0oO
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L57
            char r2 = r1[r0]
            r4 = 44
            if (r2 == r4) goto L57
            char r2 = r1[r0]
            r4 = 59
            if (r2 != r4) goto L2b
            goto L57
        L2b:
            char r2 = r1[r0]
            r4 = 32
            if (r2 != r4) goto L44
            r6.OooO0o0 = r0
        L33:
            int r0 = r0 + 1
            r6.OooO0OO = r0
            int r0 = r6.OooO0OO
            int r1 = r6.OooO0O0
            if (r0 >= r1) goto L59
            char[] r1 = r6.OooO0oO
            char r1 = r1[r0]
            if (r1 != r4) goto L59
            goto L33
        L44:
            char r2 = r1[r0]
            r5 = 65
            if (r2 < r5) goto Lc
            char r2 = r1[r0]
            r5 = 70
            if (r2 > r5) goto Lc
            char r2 = r1[r0]
            int r2 = r2 + r4
            char r2 = (char) r2
            r1[r0] = r2
            goto Lc
        L57:
            r6.OooO0o0 = r0
        L59:
            int r0 = r6.OooO0o0
            int r1 = r6.OooO0Oo
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L84
            r2 = r0 & 1
            if (r2 == 0) goto L84
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            r4 = 0
            int r1 = r1 + 1
        L6c:
            if (r4 >= r2) goto L7a
            int r5 = r6.OooO0OO(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L6c
        L7a:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.OooO0oO
            int r3 = r6.OooO0Oo
            r1.<init>(r2, r3, r0)
            return r1
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.OooO00o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.OooO00o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4560xz.OooO0o():java.lang.String");
    }

    private char OooO0o0() {
        int i;
        int i2;
        int iOooO0OO = OooO0OO(this.OooO0OO);
        this.OooO0OO++;
        if (iOooO0OO < 128) {
            return (char) iOooO0OO;
        }
        if (iOooO0OO < 192 || iOooO0OO > 247) {
            return '?';
        }
        if (iOooO0OO <= 223) {
            i2 = iOooO0OO & 31;
            i = 1;
        } else if (iOooO0OO <= 239) {
            i = 2;
            i2 = iOooO0OO & 15;
        } else {
            i = 3;
            i2 = iOooO0OO & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.OooO0OO + 1;
            this.OooO0OO = i4;
            if (i4 == this.OooO0O0 || this.OooO0oO[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.OooO0OO = i5;
            int iOooO0OO2 = OooO0OO(i5);
            this.OooO0OO++;
            if ((iOooO0OO2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (iOooO0OO2 & 63);
        }
        return (char) i2;
    }

    private String OooO0oO() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr;
        while (true) {
            i = this.OooO0OO;
            i2 = this.OooO0O0;
            if (i >= i2 || this.OooO0oO[i] != ' ') {
                break;
            }
            this.OooO0OO = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.OooO0Oo = i;
        do {
            this.OooO0OO = i + 1;
            i = this.OooO0OO;
            i3 = this.OooO0O0;
            if (i >= i3) {
                break;
            }
            cArr = this.OooO0oO;
            if (cArr[i] == '=') {
                break;
            }
        } while (cArr[i] != ' ');
        if (i >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.OooO00o);
        }
        this.OooO0o0 = i;
        if (this.OooO0oO[i] == ' ') {
            while (true) {
                i4 = this.OooO0OO;
                i5 = this.OooO0O0;
                if (i4 >= i5) {
                    break;
                }
                char[] cArr2 = this.OooO0oO;
                if (cArr2[i4] == '=' || cArr2[i4] != ' ') {
                    break;
                }
                this.OooO0OO = i4 + 1;
            }
            if (this.OooO0oO[i4] != '=' || i4 == i5) {
                throw new IllegalStateException("Unexpected end of DN: " + this.OooO00o);
            }
        }
        int i6 = this.OooO0OO;
        do {
            this.OooO0OO = i6 + 1;
            i6 = this.OooO0OO;
            if (i6 >= this.OooO0O0) {
                break;
            }
        } while (this.OooO0oO[i6] == ' ');
        int i7 = this.OooO0o0;
        int i8 = this.OooO0Oo;
        if (i7 - i8 > 4) {
            char[] cArr3 = this.OooO0oO;
            if (cArr3[i8 + 3] == '.' && ((cArr3[i8] == 'O' || cArr3[i8] == 'o') && ((cArr3[i8 + 1] == 'I' || cArr3[i8 + 1] == 'i') && (cArr3[i8 + 2] == 'D' || cArr3[i8 + 2] == 'd')))) {
                this.OooO0Oo = i8 + 4;
            }
        }
        char[] cArr4 = this.OooO0oO;
        int i9 = this.OooO0Oo;
        return new String(cArr4, i9, this.OooO0o0 - i9);
    }

    private String OooO0oo() {
        int i = this.OooO0OO + 1;
        this.OooO0OO = i;
        this.OooO0Oo = i;
        while (true) {
            this.OooO0o0 = i;
            int i2 = this.OooO0OO;
            if (i2 == this.OooO0O0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.OooO00o);
            }
            char[] cArr = this.OooO0oO;
            if (cArr[i2] == '\"') {
                do {
                    this.OooO0OO = i2 + 1;
                    i2 = this.OooO0OO;
                    if (i2 >= this.OooO0O0) {
                        break;
                    }
                } while (this.OooO0oO[i2] == ' ');
                char[] cArr2 = this.OooO0oO;
                int i3 = this.OooO0Oo;
                return new String(cArr2, i3, this.OooO0o0 - i3);
            }
            if (cArr[i2] == '\\') {
                cArr[this.OooO0o0] = OooO0Oo();
            } else {
                cArr[this.OooO0o0] = cArr[i2];
            }
            this.OooO0OO++;
            i = this.OooO0o0 + 1;
        }
    }

    public String OooO0O0(String str) {
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = 0;
        this.OooO0oO = this.OooO00o.toCharArray();
        String strOooO0oO = OooO0oO();
        if (strOooO0oO == null) {
            return null;
        }
        do {
            int i = this.OooO0OO;
            if (i == this.OooO0O0) {
                return null;
            }
            char c = this.OooO0oO[i];
            String strOooO00o = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : OooO00o() : OooO0o() : OooO0oo();
            if (str.equalsIgnoreCase(strOooO0oO)) {
                return strOooO00o;
            }
            int i2 = this.OooO0OO;
            if (i2 >= this.OooO0O0) {
                return null;
            }
            char[] cArr = this.OooO0oO;
            if (cArr[i2] != ',' && cArr[i2] != ';' && cArr[i2] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.OooO00o);
            }
            this.OooO0OO = i2 + 1;
            strOooO0oO = OooO0oO();
        } while (strOooO0oO != null);
        throw new IllegalStateException("Malformed DN: " + this.OooO00o);
    }
}
