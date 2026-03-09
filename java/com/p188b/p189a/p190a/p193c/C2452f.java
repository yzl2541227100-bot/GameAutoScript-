package com.p188b.p189a.p190a.p193c;

import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2526ac;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.C2564r;
import com.p188b.p189a.InterfaceC2565s;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.b.a.a.c.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2452f {

    /* JADX INFO: renamed from: a */
    private static final Pattern f15196a = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");

    /* JADX INFO: renamed from: a */
    public static int m12602a(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static int m12603a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static long m12604a(C2524aa c2524aa) {
        return m12606a(c2524aa.m12789a("Content-Length"));
    }

    /* JADX INFO: renamed from: a */
    public static long m12605a(C2542as c2542as) {
        return m12604a(c2542as.m12888d());
    }

    /* JADX INFO: renamed from: a */
    private static long m12606a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12607a(InterfaceC2565s interfaceC2565s, C2526ac c2526ac, C2524aa c2524aa) {
        if (interfaceC2565s == InterfaceC2565s.f15787a || C2564r.m12953a(c2526ac, c2524aa).isEmpty()) {
            return;
        }
        interfaceC2565s.mo12956a();
    }

    /* JADX INFO: renamed from: b */
    public static int m12608b(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12609b(C2542as c2542as) {
        if (c2542as.m12884a().m12866b().equals("HEAD")) {
            return false;
        }
        int iM12886b = c2542as.m12886b();
        return (((iM12886b >= 100 && iM12886b < 200) || iM12886b == 204 || iM12886b == 304) && m12604a(c2542as.m12888d()) == -1 && !"chunked".equalsIgnoreCase(c2542as.m12885a("Transfer-Encoding"))) ? false : true;
    }
}
