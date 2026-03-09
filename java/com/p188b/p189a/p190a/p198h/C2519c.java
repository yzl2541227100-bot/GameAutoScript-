package com.p188b.p189a.p190a.p198h;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.b.a.a.h.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2519c {

    /* JADX INFO: renamed from: a */
    private final String f15444a;

    /* JADX INFO: renamed from: b */
    private final int f15445b;

    /* JADX INFO: renamed from: c */
    private int f15446c;

    /* JADX INFO: renamed from: d */
    private int f15447d;

    /* JADX INFO: renamed from: e */
    private int f15448e;

    /* JADX INFO: renamed from: f */
    private int f15449f;

    /* JADX INFO: renamed from: g */
    private char[] f15450g;

    public C2519c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f15444a = name;
        this.f15445b = name.length();
    }

    /* JADX INFO: renamed from: a */
    private int m12775a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.f15445b) {
            throw new IllegalStateException("Malformed DN: " + this.f15444a);
        }
        char[] cArr = this.f15450g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f15444a);
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
                throw new IllegalStateException("Malformed DN: " + this.f15444a);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    /* JADX INFO: renamed from: a */
    private String m12776a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char[] cArr;
        while (true) {
            i = this.f15446c;
            i2 = this.f15445b;
            if (i >= i2 || this.f15450g[i] != ' ') {
                break;
            }
            this.f15446c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f15447d = i;
        do {
            this.f15446c = i + 1;
            i = this.f15446c;
            i3 = this.f15445b;
            if (i >= i3) {
                break;
            }
            cArr = this.f15450g;
            if (cArr[i] == '=') {
                break;
            }
        } while (cArr[i] != ' ');
        if (i >= i3) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15444a);
        }
        this.f15448e = i;
        if (this.f15450g[i] == ' ') {
            while (true) {
                i5 = this.f15446c;
                i6 = this.f15445b;
                if (i5 >= i6) {
                    break;
                }
                char[] cArr2 = this.f15450g;
                if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                    break;
                }
                this.f15446c = i5 + 1;
            }
            if (this.f15450g[i5] != '=' || i5 == i6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f15444a);
            }
        }
        do {
            i4 = this.f15446c + 1;
            this.f15446c = i4;
            if (i4 >= this.f15445b) {
                break;
            }
        } while (this.f15450g[i4] == ' ');
        int i7 = this.f15448e;
        int i8 = this.f15447d;
        if (i7 - i8 > 4) {
            char[] cArr3 = this.f15450g;
            if (cArr3[i8 + 3] == '.' && ((cArr3[i8] == 'O' || cArr3[i8] == 'o') && ((cArr3[i8 + 1] == 'I' || cArr3[i8 + 1] == 'i') && (cArr3[i8 + 2] == 'D' || cArr3[i8 + 2] == 'd')))) {
                this.f15447d = i8 + 4;
            }
        }
        char[] cArr4 = this.f15450g;
        int i9 = this.f15447d;
        return new String(cArr4, i9, this.f15448e - i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r6.f15448e = r0;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m12777b() {
        /*
            r6 = this;
            int r0 = r6.f15446c
            int r1 = r0 + 4
            int r2 = r6.f15445b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L98
            r6.f15447d = r0
        Lc:
            int r0 = r0 + 1
            r6.f15446c = r0
            int r0 = r6.f15446c
            int r1 = r6.f15445b
            if (r0 == r1) goto L57
            char[] r1 = r6.f15450g
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
            r6.f15448e = r0
        L33:
            int r0 = r0 + 1
            r6.f15446c = r0
            int r0 = r6.f15446c
            int r1 = r6.f15445b
            if (r0 >= r1) goto L59
            char[] r1 = r6.f15450g
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
            r6.f15448e = r0
        L59:
            int r0 = r6.f15448e
            int r1 = r6.f15447d
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
            int r5 = r6.m12775a(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L6c
        L7a:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f15450g
            int r3 = r6.f15447d
            r1.<init>(r2, r3, r0)
            return r1
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r6.f15444a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r6.f15444a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p198h.C2519c.m12777b():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r1 = r8.f15450g;
        r2 = r8.f15447d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.f15448e - r2);
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m12778c() {
        /*
            r8 = this;
            int r0 = r8.f15446c
            r8.f15447d = r0
            r8.f15448e = r0
        L6:
            int r0 = r8.f15446c
            int r1 = r8.f15445b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f15450g
            int r2 = r8.f15447d
            int r3 = r8.f15448e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f15450g
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
            int r2 = r8.f15448e
            int r3 = r2 + 1
            r8.f15448e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            goto L4a
        L3c:
            int r0 = r8.f15448e
            int r2 = r0 + 1
            r8.f15448e = r2
            char r2 = r8.m12779d()
            r1[r0] = r2
            int r0 = r8.f15446c
        L4a:
            int r0 = r0 + 1
            r8.f15446c = r0
            goto L6
        L4f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f15450g
            int r2 = r8.f15447d
            int r3 = r8.f15448e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f15448e
            r8.f15449f = r2
            int r0 = r0 + 1
            r8.f15446c = r0
            int r0 = r2 + 1
            r8.f15448e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f15446c
            int r1 = r8.f15445b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f15450g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f15448e
            int r7 = r1 + 1
            r8.f15448e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f15446c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L93
            char[] r1 = r8.f15450g
            char r2 = r1[r0]
            if (r2 == r3) goto L93
            char r2 = r1[r0]
            if (r2 == r4) goto L93
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L93:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f15450g
            int r2 = r8.f15447d
            int r3 = r8.f15449f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p198h.C2519c.m12778c():java.lang.String");
    }

    /* JADX INFO: renamed from: d */
    private char m12779d() {
        int i = this.f15446c + 1;
        this.f15446c = i;
        if (i == this.f15445b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f15444a);
        }
        char[] cArr = this.f15450g;
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
                            return m12780e();
                    }
                    break;
            }
        }
        return cArr[i];
    }

    /* JADX INFO: renamed from: e */
    private char m12780e() {
        int i;
        int i2;
        int iM12775a = m12775a(this.f15446c);
        this.f15446c++;
        if (iM12775a < 128) {
            return (char) iM12775a;
        }
        if (iM12775a < 192 || iM12775a > 247) {
            return '?';
        }
        if (iM12775a <= 223) {
            i2 = iM12775a & 31;
            i = 1;
        } else if (iM12775a <= 239) {
            i = 2;
            i2 = iM12775a & 15;
        } else {
            i = 3;
            i2 = iM12775a & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f15446c + 1;
            this.f15446c = i4;
            if (i4 == this.f15445b || this.f15450g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f15446c = i5;
            int iM12775a2 = m12775a(i5);
            this.f15446c++;
            if ((iM12775a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (iM12775a2 & 63);
        }
        return (char) i2;
    }

    /* JADX INFO: renamed from: a */
    public final String m12781a(String str) {
        String str2;
        this.f15446c = 0;
        this.f15447d = 0;
        this.f15448e = 0;
        this.f15449f = 0;
        this.f15450g = this.f15444a.toCharArray();
        String strM12776a = m12776a();
        if (strM12776a == null) {
            return null;
        }
        do {
            int i = this.f15446c;
            if (i == this.f15445b) {
                return null;
            }
            char c = this.f15450g[i];
            if (c != '\"') {
                str2 = c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : m12778c() : m12777b();
            } else {
                int i2 = i + 1;
                this.f15446c = i2;
                this.f15447d = i2;
                while (true) {
                    this.f15448e = i2;
                    int i3 = this.f15446c;
                    if (i3 == this.f15445b) {
                        throw new IllegalStateException("Unexpected end of DN: " + this.f15444a);
                    }
                    char[] cArr = this.f15450g;
                    if (cArr[i3] == '\"') {
                        do {
                            this.f15446c = i3 + 1;
                            i3 = this.f15446c;
                            if (i3 >= this.f15445b) {
                                break;
                            }
                        } while (this.f15450g[i3] == ' ');
                        char[] cArr2 = this.f15450g;
                        int i4 = this.f15447d;
                        str2 = new String(cArr2, i4, this.f15448e - i4);
                    } else {
                        if (cArr[i3] == '\\') {
                            cArr[this.f15448e] = m12779d();
                        } else {
                            cArr[this.f15448e] = cArr[i3];
                        }
                        this.f15446c++;
                        i2 = this.f15448e + 1;
                    }
                }
            }
            if (str.equalsIgnoreCase(strM12776a)) {
                return str2;
            }
            int i5 = this.f15446c;
            if (i5 >= this.f15445b) {
                return null;
            }
            char[] cArr3 = this.f15450g;
            if (cArr3[i5] != ',' && cArr3[i5] != ';' && cArr3[i5] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f15444a);
            }
            this.f15446c = i5 + 1;
            strM12776a = m12776a();
        } while (strM12776a != null);
        throw new IllegalStateException("Malformed DN: " + this.f15444a);
    }
}
