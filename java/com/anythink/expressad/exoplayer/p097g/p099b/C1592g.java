package com.anythink.expressad.exoplayer.p097g.p099b;

import android.util.Log;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p097g.InterfaceC1585b;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import javax.mail.UIDFolder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1592g implements InterfaceC1585b {

    /* JADX INFO: renamed from: a */
    public static final a f8535a = new a() { // from class: com.anythink.expressad.exoplayer.g.b.g.1
        @Override // com.anythink.expressad.exoplayer.p097g.p099b.C1592g.a
        /* JADX INFO: renamed from: a */
        public final boolean mo6992a(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    };

    /* JADX INFO: renamed from: b */
    public static final int f8536b = C1717af.m8116f("ID3");

    /* JADX INFO: renamed from: c */
    public static final int f8537c = 10;

    /* JADX INFO: renamed from: d */
    private static final String f8538d = "Id3Decoder";

    /* JADX INFO: renamed from: e */
    private static final int f8539e = 128;

    /* JADX INFO: renamed from: f */
    private static final int f8540f = 64;

    /* JADX INFO: renamed from: g */
    private static final int f8541g = 32;

    /* JADX INFO: renamed from: h */
    private static final int f8542h = 8;

    /* JADX INFO: renamed from: i */
    private static final int f8543i = 4;

    /* JADX INFO: renamed from: j */
    private static final int f8544j = 64;

    /* JADX INFO: renamed from: k */
    private static final int f8545k = 2;

    /* JADX INFO: renamed from: l */
    private static final int f8546l = 1;

    /* JADX INFO: renamed from: m */
    private static final int f8547m = 0;

    /* JADX INFO: renamed from: n */
    private static final int f8548n = 1;

    /* JADX INFO: renamed from: o */
    private static final int f8549o = 2;

    /* JADX INFO: renamed from: p */
    private static final int f8550p = 3;

    /* JADX INFO: renamed from: q */
    private final a f8551q;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo6992a(int i, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.g.b.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final int f8552a;

        /* JADX INFO: renamed from: b */
        private final boolean f8553b;

        /* JADX INFO: renamed from: c */
        private final int f8554c;

        public b(int i, boolean z, int i2) {
            this.f8552a = i;
            this.f8553b = z;
            this.f8554c = i2;
        }
    }

    public C1592g() {
        this(null);
    }

    private C1592g(a aVar) {
        this.f8551q = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static int m7108a(byte[] bArr, int i, int i2) {
        int iM7121b = m7121b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iM7121b;
        }
        while (iM7121b < bArr.length - 1) {
            if (iM7121b % 2 == 0 && bArr[iM7121b + 1] == 0) {
                return iM7121b;
            }
            iM7121b = m7121b(bArr, iM7121b + 1);
        }
        return bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.anythink.expressad.exoplayer.p097g.C1582a m7109a(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p097g.p099b.C1592g.m7109a(byte[], int):com.anythink.expressad.exoplayer.g.a");
    }

    /* JADX INFO: renamed from: a */
    private static C1586a m7110a(C1736s c1736s, int i, int i2) {
        int iM7121b;
        String strConcat;
        int iM8273d = c1736s.m8273d();
        String strM7116a = m7116a(iM8273d);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c1736s.m8268a(bArr, 0, i3);
        if (i2 == 2) {
            strConcat = "image/" + C1717af.m8110d(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iM7121b = 2;
        } else {
            iM7121b = m7121b(bArr, 0);
            String strM8110d = C1717af.m8110d(new String(bArr, 0, iM7121b, "ISO-8859-1"));
            strConcat = strM8110d.indexOf(47) == -1 ? "image/".concat(String.valueOf(strM8110d)) : strM8110d;
        }
        int i4 = bArr[iM7121b + 1] & 255;
        int i5 = iM7121b + 2;
        int iM7108a = m7108a(bArr, i5, iM8273d);
        return new C1586a(strConcat, new String(bArr, i5, iM7108a - i5, strM7116a), i4, m7125b(bArr, iM7108a + m7120b(iM8273d), i3));
    }

    /* JADX INFO: renamed from: a */
    private static C1588c m7111a(C1736s c1736s, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int iM8271c = c1736s.m8271c();
        int iM7121b = m7121b(c1736s.f9792a, iM8271c);
        String str = new String(c1736s.f9792a, iM8271c, iM7121b - iM8271c, "ISO-8859-1");
        c1736s.m8272c(iM7121b + 1);
        int iM8280i = c1736s.m8280i();
        int iM8280i2 = c1736s.m8280i();
        long jM8279h = c1736s.m8279h();
        long j = jM8279h == UIDFolder.MAXUID ? -1L : jM8279h;
        long jM8279h2 = c1736s.m8279h();
        long j2 = jM8279h2 == UIDFolder.MAXUID ? -1L : jM8279h2;
        ArrayList arrayList = new ArrayList();
        int i4 = iM8271c + i;
        while (c1736s.m8271c() < i4) {
            AbstractC1593h abstractC1593hM7113a = m7113a(i2, c1736s, z, i3, aVar);
            if (abstractC1593hM7113a != null) {
                arrayList.add(abstractC1593hM7113a);
            }
        }
        AbstractC1593h[] abstractC1593hArr = new AbstractC1593h[arrayList.size()];
        arrayList.toArray(abstractC1593hArr);
        return new C1588c(str, iM8280i, iM8280i2, j, j2, abstractC1593hArr);
    }

    /* JADX INFO: renamed from: a */
    private static b m7112a(C1736s c1736s) {
        String strValueOf;
        String str;
        String strConcat;
        if (c1736s.m8265a() < 10) {
            strConcat = "Data too short to be an ID3 tag";
        } else {
            int iM8278g = c1736s.m8278g();
            if (iM8278g == f8536b) {
                int iM8273d = c1736s.m8273d();
                c1736s.m8274d(1);
                int iM8273d2 = c1736s.m8273d();
                int iM8283l = c1736s.m8283l();
                if (iM8273d == 2) {
                    if ((iM8273d2 & 64) != 0) {
                        strConcat = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (iM8273d == 3) {
                    if ((iM8273d2 & 64) != 0) {
                        int iM8280i = c1736s.m8280i();
                        c1736s.m8274d(iM8280i);
                        iM8283l -= iM8280i + 4;
                    }
                } else if (iM8273d == 4) {
                    if ((iM8273d2 & 64) != 0) {
                        int iM8283l2 = c1736s.m8283l();
                        c1736s.m8274d(iM8283l2 - 4);
                        iM8283l -= iM8283l2;
                    }
                    if ((iM8273d2 & 16) != 0) {
                        iM8283l -= 10;
                    }
                } else {
                    strValueOf = String.valueOf(iM8273d);
                    str = "Skipped ID3 tag with unsupported majorVersion=";
                }
                return new b(iM8273d, iM8273d < 4 && (iM8273d2 & 128) != 0, iM8283l);
            }
            strValueOf = String.valueOf(iM8278g);
            str = "Unexpected first three bytes of ID3 tag header: ";
            strConcat = str.concat(strValueOf);
        }
        Log.w(f8538d, strConcat);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x038a A[Catch: all -> 0x03aa, UnsupportedEncodingException -> 0x03ae, TRY_LEAVE, TryCatch #5 {all -> 0x03aa, blocks: (B:192:0x038a, B:194:0x03a6, B:146:0x0281, B:154:0x02b4, B:173:0x030e, B:183:0x034f, B:189:0x0369, B:190:0x0379), top: B:215:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.anythink.expressad.exoplayer.g.b.h] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.anythink.expressad.exoplayer.g.b.h] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.anythink.expressad.exoplayer.p097g.p099b.AbstractC1593h m7113a(int r19, com.anythink.expressad.exoplayer.p107k.C1736s r20, boolean r21, int r22, com.anythink.expressad.exoplayer.p097g.p099b.C1592g.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p097g.p099b.C1592g.m7113a(int, com.anythink.expressad.exoplayer.k.s, boolean, int, com.anythink.expressad.exoplayer.g.b.g$a):com.anythink.expressad.exoplayer.g.b.h");
    }

    /* JADX INFO: renamed from: a */
    private static C1596k m7114a(C1736s c1736s, int i) {
        if (i <= 0) {
            return null;
        }
        int iM8273d = c1736s.m8273d();
        String strM7116a = m7116a(iM8273d);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1736s.m8268a(bArr, 0, i2);
        int iM7108a = m7108a(bArr, 0, iM8273d);
        String str = new String(bArr, 0, iM7108a, strM7116a);
        int iM7120b = iM7108a + m7120b(iM8273d);
        return new C1596k("TXXX", str, m7118a(bArr, iM7120b, m7108a(bArr, iM7120b, iM8273d), strM7116a));
    }

    /* JADX INFO: renamed from: a */
    private static C1596k m7115a(C1736s c1736s, int i, String str) {
        if (i <= 0) {
            return null;
        }
        int iM8273d = c1736s.m8273d();
        String strM7116a = m7116a(iM8273d);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1736s.m8268a(bArr, 0, i2);
        return new C1596k(str, null, new String(bArr, 0, m7108a(bArr, 0, iM8273d), strM7116a));
    }

    /* JADX INFO: renamed from: a */
    private static String m7116a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : C1500b.f7495k;
    }

    /* JADX INFO: renamed from: a */
    private static String m7117a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX INFO: renamed from: a */
    private static String m7118a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7119a(C1736s c1736s, int i, int i2, boolean z) {
        int iM8278g;
        long jM8278g;
        int iM8275e;
        int i3;
        int iM8271c = c1736s.m8271c();
        while (true) {
            try {
                boolean z3 = true;
                if (c1736s.m8265a() < i2) {
                    return true;
                }
                if (i >= 3) {
                    iM8278g = c1736s.m8280i();
                    jM8278g = c1736s.m8279h();
                    iM8275e = c1736s.m8275e();
                } else {
                    iM8278g = c1736s.m8278g();
                    jM8278g = c1736s.m8278g();
                    iM8275e = 0;
                }
                if (iM8278g == 0 && jM8278g == 0 && iM8275e == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jM8278g) != 0) {
                        return false;
                    }
                    jM8278g = (((jM8278g >> 24) & 255) << 21) | (jM8278g & 255) | (((jM8278g >> 8) & 255) << 7) | (((jM8278g >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iM8275e & 64) != 0 ? 1 : 0;
                    if ((iM8275e & 1) == 0) {
                        z3 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iM8275e & 32) != 0 ? 1 : 0;
                        if ((iM8275e & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z3 = false;
                }
                if (z3) {
                    i3 += 4;
                }
                if (jM8278g < i3) {
                    return false;
                }
                if (c1736s.m8265a() < jM8278g) {
                    return false;
                }
                c1736s.m8274d((int) jM8278g);
            } finally {
                c1736s.m8272c(iM8271c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m7120b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* JADX INFO: renamed from: b */
    private static int m7121b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: b */
    private static C1589d m7122b(C1736s c1736s, int i, int i2, boolean z, int i3, a aVar) throws Throwable {
        int iM8271c = c1736s.m8271c();
        int iM7121b = m7121b(c1736s.f9792a, iM8271c);
        String str = new String(c1736s.f9792a, iM8271c, iM7121b - iM8271c, "ISO-8859-1");
        c1736s.m8272c(iM7121b + 1);
        int iM8273d = c1736s.m8273d();
        boolean z3 = (iM8273d & 2) != 0;
        boolean z4 = (iM8273d & 1) != 0;
        int iM8273d2 = c1736s.m8273d();
        String[] strArr = new String[iM8273d2];
        for (int i4 = 0; i4 < iM8273d2; i4++) {
            int iM8271c2 = c1736s.m8271c();
            int iM7121b2 = m7121b(c1736s.f9792a, iM8271c2);
            strArr[i4] = new String(c1736s.f9792a, iM8271c2, iM7121b2 - iM8271c2, "ISO-8859-1");
            c1736s.m8272c(iM7121b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iM8271c + i;
        while (c1736s.m8271c() < i5) {
            AbstractC1593h abstractC1593hM7113a = m7113a(i2, c1736s, z, i3, aVar);
            if (abstractC1593hM7113a != null) {
                arrayList.add(abstractC1593hM7113a);
            }
        }
        AbstractC1593h[] abstractC1593hArr = new AbstractC1593h[arrayList.size()];
        arrayList.toArray(abstractC1593hArr);
        return new C1589d(str, z3, z4, strArr, abstractC1593hArr);
    }

    /* JADX INFO: renamed from: b */
    private static C1597l m7123b(C1736s c1736s, int i) {
        if (i <= 0) {
            return null;
        }
        int iM8273d = c1736s.m8273d();
        String strM7116a = m7116a(iM8273d);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1736s.m8268a(bArr, 0, i2);
        int iM7108a = m7108a(bArr, 0, iM8273d);
        String str = new String(bArr, 0, iM7108a, strM7116a);
        int iM7120b = iM7108a + m7120b(iM8273d);
        return new C1597l("WXXX", str, m7118a(bArr, iM7120b, m7121b(bArr, iM7120b), "ISO-8859-1"));
    }

    /* JADX INFO: renamed from: b */
    private static C1597l m7124b(C1736s c1736s, int i, String str) {
        byte[] bArr = new byte[i];
        c1736s.m8268a(bArr, 0, i);
        return new C1597l(str, null, new String(bArr, 0, m7121b(bArr, 0), "ISO-8859-1"));
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m7125b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    private static C1587b m7126c(C1736s c1736s, int i, String str) {
        byte[] bArr = new byte[i];
        c1736s.m8268a(bArr, 0, i);
        return new C1587b(str, bArr);
    }

    /* JADX INFO: renamed from: c */
    private static C1595j m7127c(C1736s c1736s, int i) {
        byte[] bArr = new byte[i];
        c1736s.m8268a(bArr, 0, i);
        int iM7121b = m7121b(bArr, 0);
        return new C1595j(new String(bArr, 0, iM7121b, "ISO-8859-1"), m7125b(bArr, iM7121b + 1, i));
    }

    /* JADX INFO: renamed from: d */
    private static C1591f m7128d(C1736s c1736s, int i) {
        int iM8273d = c1736s.m8273d();
        String strM7116a = m7116a(iM8273d);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c1736s.m8268a(bArr, 0, i2);
        int iM7121b = m7121b(bArr, 0);
        String str = new String(bArr, 0, iM7121b, "ISO-8859-1");
        int i3 = iM7121b + 1;
        int iM7108a = m7108a(bArr, i3, iM8273d);
        String strM7118a = m7118a(bArr, i3, iM7108a, strM7116a);
        int iM7120b = iM7108a + m7120b(iM8273d);
        int iM7108a2 = m7108a(bArr, iM7120b, iM8273d);
        return new C1591f(str, strM7118a, m7118a(bArr, iM7120b, iM7108a2, strM7116a), m7125b(bArr, iM7108a2 + m7120b(iM8273d), i2));
    }

    /* JADX INFO: renamed from: e */
    private static C1590e m7129e(C1736s c1736s, int i) {
        if (i < 4) {
            return null;
        }
        int iM8273d = c1736s.m8273d();
        String strM7116a = m7116a(iM8273d);
        byte[] bArr = new byte[3];
        c1736s.m8268a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c1736s.m8268a(bArr2, 0, i2);
        int iM7108a = m7108a(bArr2, 0, iM8273d);
        String str2 = new String(bArr2, 0, iM7108a, strM7116a);
        int iM7120b = iM7108a + m7120b(iM8273d);
        return new C1590e(str, str2, m7118a(bArr2, iM7120b, m7108a(bArr2, iM7120b, iM8273d), strM7116a));
    }

    /* JADX INFO: renamed from: f */
    private static int m7130f(C1736s c1736s, int i) {
        byte[] bArr = c1736s.f9792a;
        int iM8271c = c1736s.m8271c();
        while (true) {
            int i2 = iM8271c + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[iM8271c] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, iM8271c + 2, bArr, i2, (i - iM8271c) - 2);
                i--;
            }
            iM8271c = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1585b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.expressad.exoplayer.p097g.C1582a mo7091a(com.anythink.expressad.exoplayer.p097g.C1607e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p097g.p099b.C1592g.mo7091a(com.anythink.expressad.exoplayer.g.e):com.anythink.expressad.exoplayer.g.a");
    }
}
