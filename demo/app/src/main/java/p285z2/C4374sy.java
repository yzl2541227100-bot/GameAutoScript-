package p285z2;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okio.ByteString;
import org.slf4j.Marker;
import p285z2.C3966hx;

/* JADX INFO: renamed from: z2.sy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4374sy {
    private static final ByteString OooO00o = ByteString.encodeUtf8("\"\\");
    private static final ByteString OooO0O0 = ByteString.encodeUtf8("\t ,=");

    private C4374sy() {
    }

    private static String OooO(h00 h00Var) {
        if (h00Var.readByte() != 34) {
            throw new IllegalArgumentException();
        }
        h00 h00Var2 = new h00();
        while (true) {
            long jOooOOoo = h00Var.OooOOoo(OooO00o);
            if (jOooOOoo == -1) {
                return null;
            }
            if (h00Var.o00Oo0(jOooOOoo) == 34) {
                h00Var2.OooOooO(h00Var, jOooOOoo);
                h00Var.readByte();
                return h00Var2.Oooo0oo();
            }
            if (h00Var.o00000O0() == jOooOOoo + 1) {
                return null;
            }
            h00Var2.OooOooO(h00Var, jOooOOoo);
            h00Var.readByte();
            h00Var2.OooOooO(h00Var, 1L);
        }
    }

    public static long OooO00o(C3966hx c3966hx) {
        return OooOOo0(c3966hx.OooO0Oo("Content-Length"));
    }

    public static long OooO0O0(C4299qx c4299qx) {
        return OooO00o(c4299qx.o00Oo0());
    }

    public static boolean OooO0OO(C4299qx c4299qx) {
        if (c4299qx.o0OOO0o().OooO0oO().equals("HEAD")) {
            return false;
        }
        int iOoooooO = c4299qx.OoooooO();
        return (((iOoooooO >= 100 && iOoooooO < 200) || iOoooooO == 204 || iOoooooO == 304) && OooO0O0(c4299qx) == -1 && !"chunked".equalsIgnoreCase(c4299qx.o0OoOo0("Transfer-Encoding"))) ? false : true;
    }

    public static boolean OooO0Oo(C3966hx c3966hx) {
        return OooOOo(c3966hx).contains(Marker.ANY_MARKER);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x007d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void OooO0o(java.util.List<p285z2.C4446uw> r8, p285z2.h00 r9) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            OooOOOo(r9)
            java.lang.String r1 = OooOO0(r9)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = OooOOOo(r9)
            java.lang.String r3 = OooOO0(r9)
            if (r3 != 0) goto L2c
            boolean r9 = r9.OooOOO()
            if (r9 != 0) goto L1f
            return
        L1f:
            z2.uw r9 = new z2.uw
            java.util.Map r0 = java.util.Collections.emptyMap()
            r9.<init>(r1, r0)
            r8.add(r9)
            return
        L2c:
            r4 = 61
            int r5 = OooOOO0(r9, r4)
            boolean r6 = OooOOOo(r9)
            if (r2 != 0) goto L60
            if (r6 != 0) goto L40
            boolean r2 = r9.OooOOO()
            if (r2 == 0) goto L60
        L40:
            z2.uw r2 = new z2.uw
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = OooOO0o(r4, r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L60:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = OooOOO0(r9, r4)
            int r5 = r5 + r6
        L6a:
            if (r3 != 0) goto L7b
            java.lang.String r3 = OooOO0(r9)
            boolean r5 = OooOOOo(r9)
            if (r5 == 0) goto L77
            goto L7d
        L77:
            int r5 = OooOOO0(r9, r4)
        L7b:
            if (r5 != 0) goto L88
        L7d:
            z2.uw r4 = new z2.uw
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L88:
            r6 = 1
            if (r5 <= r6) goto L8c
            return
        L8c:
            boolean r6 = OooOOOo(r9)
            if (r6 == 0) goto L93
            return
        L93:
            boolean r6 = r9.OooOOO()
            if (r6 != 0) goto La8
            r6 = 0
            byte r6 = r9.o00Oo0(r6)
            r7 = 34
            if (r6 != r7) goto La8
            java.lang.String r6 = OooO(r9)
            goto Lac
        La8:
            java.lang.String r6 = OooOO0(r9)
        Lac:
            if (r6 != 0) goto Laf
            return
        Laf:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = OooOOOo(r9)
            if (r3 != 0) goto Lc5
            boolean r3 = r9.OooOOO()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4374sy.OooO0o(java.util.List, z2.h00):void");
    }

    public static boolean OooO0o0(C4299qx c4299qx) {
        return OooO0Oo(c4299qx.o00Oo0());
    }

    public static List<C4446uw> OooO0oO(C3966hx c3966hx, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c3966hx.OooOO0o(); i++) {
            if (str.equalsIgnoreCase(c3966hx.OooO0oO(i))) {
                OooO0o(arrayList, new h00().OooOoO0(c3966hx.OooOOO(i)));
            }
        }
        return arrayList;
    }

    public static int OooO0oo(String str, int i) {
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

    private static String OooOO0(h00 h00Var) {
        try {
            long jOooOOoo = h00Var.OooOOoo(OooO0O0);
            if (jOooOOoo == -1) {
                jOooOOoo = h00Var.o00000O0();
            }
            if (jOooOOoo != 0) {
                return h00Var.OooO0O0(jOooOOoo);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void OooOO0O(InterfaceC3707ax interfaceC3707ax, C4003ix c4003ix, C3966hx c3966hx) {
        if (interfaceC3707ax == InterfaceC3707ax.OooO00o) {
            return;
        }
        List<C4631zw> listOooOO0O = C4631zw.OooOO0O(c4003ix, c3966hx);
        if (listOooOO0O.isEmpty()) {
            return;
        }
        interfaceC3707ax.OooO00o(c4003ix, listOooOO0O);
    }

    private static String OooOO0o(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    public static int OooOOO(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    private static int OooOOO0(h00 h00Var, byte b) {
        int i = 0;
        while (!h00Var.OooOOO() && h00Var.o00Oo0(0L) == b) {
            i++;
            h00Var.readByte();
        }
        return i;
    }

    public static int OooOOOO(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    private static boolean OooOOOo(h00 h00Var) {
        boolean z = false;
        while (!h00Var.OooOOO()) {
            byte bO00Oo0 = h00Var.o00Oo0(0L);
            if (bO00Oo0 != 44) {
                if (bO00Oo0 != 32 && bO00Oo0 != 9) {
                    break;
                }
                h00Var.readByte();
            } else {
                h00Var.readByte();
                z = true;
            }
        }
        return z;
    }

    public static Set<String> OooOOo(C3966hx c3966hx) {
        Set<String> setEmptySet = Collections.emptySet();
        int iOooOO0o = c3966hx.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            if ("Vary".equalsIgnoreCase(c3966hx.OooO0oO(i))) {
                String strOooOOO = c3966hx.OooOOO(i);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strOooOOO.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }

    private static long OooOOo0(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static Set<String> OooOOoo(C4299qx c4299qx) {
        return OooOOo(c4299qx.o00Oo0());
    }

    public static C3966hx OooOo0(C4299qx c4299qx) {
        return OooOo00(c4299qx.oo000o().o0OOO0o().OooO0o0(), c4299qx.o00Oo0());
    }

    public static C3966hx OooOo00(C3966hx c3966hx, C3966hx c3966hx2) {
        Set<String> setOooOOo = OooOOo(c3966hx2);
        if (setOooOOo.isEmpty()) {
            return new C3966hx.OooO00o().OooO0oo();
        }
        C3966hx.OooO00o oooO00o = new C3966hx.OooO00o();
        int iOooOO0o = c3966hx.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            String strOooO0oO = c3966hx.OooO0oO(i);
            if (setOooOOo.contains(strOooO0oO)) {
                oooO00o.OooO0O0(strOooO0oO, c3966hx.OooOOO(i));
            }
        }
        return oooO00o.OooO0oo();
    }

    public static boolean OooOo0O(C4299qx c4299qx, C3966hx c3966hx, C4225ox c4225ox) {
        for (String str : OooOOoo(c4299qx)) {
            if (!C4558xx.OooOOo(c3966hx.OooOOOO(str), c4225ox.OooO0Oo(str))) {
                return false;
            }
        }
        return true;
    }
}
