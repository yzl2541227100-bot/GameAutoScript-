package p285z2;

import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: z2.nm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4177nm {
    private static final int[][] OooO;
    public static final int OooO0OO = 0;
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 3;
    public static final int OooO0o0 = 2;
    public static final int OooO0oO = 4;
    public static final int[][] OooOO0;
    private final byte[] OooO00o;
    public static final String[] OooO0O0 = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] OooO0oo = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: z2.nm$OooO00o */
    public class OooO00o implements Comparator<C4251pm> {
        public OooO00o() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: OooO00o */
        public int compare(C4251pm c4251pm, C4251pm c4251pm2) {
            return c4251pm.OooO0Oo() - c4251pm2.OooO0Oo();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 5, 256);
        OooO = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            OooO[0][i] = (i - 65) + 2;
        }
        OooO[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            OooO[1][i2] = (i2 - 97) + 2;
        }
        OooO[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            OooO[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = OooO;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, InterfaceC2174a.f13811O, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            OooO[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, InterfaceC2174a.f13810N, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                OooO[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) int.class, 6, 6);
        OooOO0 = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = OooOO0;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public C4177nm(byte[] bArr) {
        this.OooO00o = bArr;
    }

    private static Collection<C4251pm> OooO0O0(Iterable<C4251pm> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C4251pm c4251pm : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4251pm c4251pm2 = (C4251pm) it.next();
                if (c4251pm2.OooO0oO(c4251pm)) {
                    z = false;
                    break;
                }
                if (c4251pm.OooO0oO(c4251pm2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(c4251pm);
            }
        }
        return linkedList;
    }

    private void OooO0OO(C4251pm c4251pm, int i, Collection<C4251pm> collection) {
        char c = (char) (this.OooO00o[i] & 255);
        boolean z = OooO[c4251pm.OooO0o0()][c] > 0;
        C4251pm c4251pmOooO0O0 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = OooO[i2][c];
            if (i3 > 0) {
                if (c4251pmOooO0O0 == null) {
                    c4251pmOooO0O0 = c4251pm.OooO0O0(i);
                }
                if (!z || i2 == c4251pm.OooO0o0() || i2 == 2) {
                    collection.add(c4251pmOooO0O0.OooO0oo(i2, i3));
                }
                if (!z && OooOO0[c4251pm.OooO0o0()][i2] >= 0) {
                    collection.add(c4251pmOooO0O0.OooO(i2, i3));
                }
            }
        }
        if (c4251pm.OooO0OO() > 0 || OooO[c4251pm.OooO0o0()][c] == 0) {
            collection.add(c4251pm.OooO00o(i));
        }
    }

    private static void OooO0Oo(C4251pm c4251pm, int i, int i2, Collection<C4251pm> collection) {
        C4251pm c4251pmOooO0O0 = c4251pm.OooO0O0(i);
        collection.add(c4251pmOooO0O0.OooO0oo(4, i2));
        if (c4251pm.OooO0o0() != 4) {
            collection.add(c4251pmOooO0O0.OooO(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(c4251pmOooO0O0.OooO0oo(2, 16 - i2).OooO0oo(2, 1));
        }
        if (c4251pm.OooO0OO() > 0) {
            collection.add(c4251pm.OooO00o(i).OooO00o(i + 1));
        }
    }

    private static Collection<C4251pm> OooO0o(Iterable<C4251pm> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<C4251pm> it = iterable.iterator();
        while (it.hasNext()) {
            OooO0Oo(it.next(), i, i2, linkedList);
        }
        return OooO0O0(linkedList);
    }

    private Collection<C4251pm> OooO0o0(Iterable<C4251pm> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator<C4251pm> it = iterable.iterator();
        while (it.hasNext()) {
            OooO0OO(it.next(), i, linkedList);
        }
        return OooO0O0(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p285z2.C3735bo OooO00o() {
        /*
            r8 = this;
            z2.pm r0 = p285z2.C4251pm.OooO0o0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L8:
            byte[] r3 = r8.OooO00o
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = 0
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = 0
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = OooO0o(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.OooO0o0(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            z2.nm$OooO00o r1 = new z2.nm$OooO00o
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            z2.pm r0 = (p285z2.C4251pm) r0
            byte[] r1 = r8.OooO00o
            z2.bo r0 = r0.OooOO0(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4177nm.OooO00o():z2.bo");
    }
}
