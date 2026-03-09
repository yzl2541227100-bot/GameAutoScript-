package com.p188b.p189a.p190a.p193c;

import com.p188b.p189a.EnumC2535al;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.b.a.a.c.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2458l {

    /* JADX INFO: renamed from: a */
    public final EnumC2535al f15211a;

    /* JADX INFO: renamed from: b */
    public final int f15212b;

    /* JADX INFO: renamed from: c */
    public final String f15213c;

    private C2458l(EnumC2535al enumC2535al, int i, String str) {
        this.f15211a = enumC2535al;
        this.f15212b = i;
        this.f15213c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C2458l m12626a(String str) throws ProtocolException {
        EnumC2535al enumC2535al;
        String strSubstring;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC2535al = EnumC2535al.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                enumC2535al = EnumC2535al.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            enumC2535al = EnumC2535al.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C2458l(enumC2535al, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15211a == EnumC2535al.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f15212b);
        if (this.f15213c != null) {
            sb.append(' ');
            sb.append(this.f15213c);
        }
        return sb.toString();
    }
}
