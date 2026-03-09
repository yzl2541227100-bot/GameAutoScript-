package p285z2;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z2.ar */
/* JADX INFO: loaded from: classes2.dex */
public final class C3701ar extends AbstractC4514wq {
    private final List<C4625zq> OooOO0O = new ArrayList();
    private final List<C4625zq> OooOO0o = new ArrayList();
    private static final int[] OooOOO0 = {1, 10, 34, 70, 126};
    private static final int[] OooOOO = {4, 20, 48, 81};
    private static final int[] OooOOOO = {0, 161, 961, 2015, 2715};
    private static final int[] OooOOOo = {0, 336, 1036, 1516};
    private static final int[] OooOOo0 = {8, 6, 4, 3, 1};
    private static final int[] OooOOo = {2, 4, 6, 8};
    private static final int[][] OooOOoo = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    private static void OooOOoo(Collection<C4625zq> collection, C4625zq c4625zq) {
        if (c4625zq == null) {
            return;
        }
        boolean z = false;
        Iterator<C4625zq> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4625zq next = it.next();
            if (next.OooO0O0() == c4625zq.OooO0O0()) {
                next.OooO0o0();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        collection.add(c4625zq);
    }

    private C4625zq OooOo(C3735bo c3735bo, boolean z, int i, Map<DecodeHintType, ?> map) {
        try {
            C4588yq c4588yqOooOoO = OooOoO(c3735bo, i, z, OooOoO0(c3735bo, z));
            InterfaceC3844em interfaceC3844em = map == null ? null : (InterfaceC3844em) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (interfaceC3844em != null) {
                float fOooOOO0 = (r1[0] + r1[1]) / 2.0f;
                if (z) {
                    fOooOOO0 = (c3735bo.OooOOO0() - 1) - fOooOOO0;
                }
                interfaceC3844em.OooO00o(new C3807dm(fOooOOO0, i));
            }
            C4551xq c4551xqOooOo0o = OooOo0o(c3735bo, c4588yqOooOoO, true);
            C4551xq c4551xqOooOo0o2 = OooOo0o(c3735bo, c4588yqOooOoO, false);
            return new C4625zq((c4551xqOooOo0o.OooO0O0() * 1597) + c4551xqOooOo0o2.OooO0O0(), c4551xqOooOo0o.OooO00o() + (c4551xqOooOo0o2.OooO00o() * 4), c4588yqOooOoO);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static boolean OooOo0(C4625zq c4625zq, C4625zq c4625zq2) {
        int iOooO00o = (c4625zq.OooO00o() + (c4625zq2.OooO00o() * 16)) % 79;
        int iOooO0OO = (c4625zq.OooO0Oo().OooO0OO() * 9) + c4625zq2.OooO0Oo().OooO0OO();
        if (iOooO0OO > 72) {
            iOooO0OO--;
        }
        if (iOooO0OO > 8) {
            iOooO0OO--;
        }
        return iOooO00o == iOooO0OO;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003f A[PHI: r6 r7
  0x003f: PHI (r6v6 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r7v4 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041 A[PHI: r6 r7
  0x0041: PHI (r6v9 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r7v9 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:26:0x003d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void OooOo00(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3701ar.OooOo00(boolean, int):void");
    }

    private static C3770cm OooOo0O(C4625zq c4625zq, C4625zq c4625zq2) {
        String strValueOf = String.valueOf((((long) c4625zq.OooO0O0()) * 4537077) + ((long) c4625zq2.OooO0O0()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(strValueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int iCharAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                iCharAt *= 3;
            }
            i += iCharAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C3807dm[] c3807dmArrOooO00o = c4625zq.OooO0Oo().OooO00o();
        C3807dm[] c3807dmArrOooO00o2 = c4625zq2.OooO0Oo().OooO00o();
        return new C3770cm(sb.toString(), null, new C3807dm[]{c3807dmArrOooO00o[0], c3807dmArrOooO00o[1], c3807dmArrOooO00o2[0], c3807dmArrOooO00o2[1]}, BarcodeFormat.RSS_14);
    }

    private C4551xq OooOo0o(C3735bo c3735bo, C4588yq c4588yq, boolean z) throws NotFoundException {
        int[] iArrOooOO0 = OooOO0();
        for (int i = 0; i < iArrOooOO0.length; i++) {
            iArrOooOO0[i] = 0;
        }
        int[] iArrOooO0O0 = c4588yq.OooO0O0();
        if (z) {
            AbstractC4107lq.OooO0oO(c3735bo, iArrOooO0O0[0], iArrOooOO0);
        } else {
            AbstractC4107lq.OooO0o(c3735bo, iArrOooO0O0[1] + 1, iArrOooOO0);
            int i2 = 0;
            for (int length = iArrOooOO0.length - 1; i2 < length; length--) {
                int i3 = iArrOooOO0[i2];
                iArrOooOO0[i2] = iArrOooOO0[length];
                iArrOooOO0[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float fOooO0Oo = C4142mo.OooO0Oo(iArrOooOO0) / i4;
        int[] iArrOooOOO = OooOOO();
        int[] iArrOooOO0o = OooOO0o();
        float[] fArrOooOOOO = OooOOOO();
        float[] fArrOooOOO0 = OooOOO0();
        for (int i5 = 0; i5 < iArrOooOO0.length; i5++) {
            float f = iArrOooOO0[i5] / fOooO0Oo;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArrOooOOO[i7] = i6;
                fArrOooOOOO[i7] = f - i6;
            } else {
                iArrOooOO0o[i7] = i6;
                fArrOooOOO0[i7] = f - i6;
            }
        }
        OooOo00(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = iArrOooOOO.length - 1; length2 >= 0; length2--) {
            i8 = (i8 * 9) + iArrOooOOO[length2];
            i9 += iArrOooOOO[length2];
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = iArrOooOO0o.length - 1; length3 >= 0; length3--) {
            i10 = (i10 * 9) + iArrOooOO0o[length3];
            i11 += iArrOooOO0o[length3];
        }
        int i12 = i8 + (i10 * 3);
        if (!z) {
            if ((i11 & 1) != 0 || i11 > 10 || i11 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i13 = (10 - i11) / 2;
            int i14 = OooOOo[i13];
            return new C4551xq((C3738br.OooO0O0(iArrOooOO0o, 9 - i14, false) * OooOOO[i13]) + C3738br.OooO0O0(iArrOooOOO, i14, true) + OooOOOo[i13], i12);
        }
        if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i15 = (12 - i9) / 2;
        int i16 = OooOOo0[i15];
        return new C4551xq((C3738br.OooO0O0(iArrOooOOO, i16, false) * OooOOO0[i15]) + C3738br.OooO0O0(iArrOooOO0o, 9 - i16, true) + OooOOOO[i15], i12);
    }

    private C4588yq OooOoO(C3735bo c3735bo, int i, boolean z, int[] iArr) throws NotFoundException {
        int iOooOOO0;
        int i2;
        boolean zOooO0oo = c3735bo.OooO0oo(iArr[0]);
        int i3 = iArr[0] - 1;
        while (i3 >= 0 && zOooO0oo != c3735bo.OooO0oo(i3)) {
            i3--;
        }
        int i4 = i3 + 1;
        int i5 = iArr[0] - i4;
        int[] iArrOooOO0O = OooOO0O();
        System.arraycopy(iArrOooOO0O, 0, iArrOooOO0O, 1, iArrOooOO0O.length - 1);
        iArrOooOO0O[0] = i5;
        int iOooOOo = AbstractC4514wq.OooOOo(iArrOooOO0O, OooOOoo);
        int i6 = iArr[1];
        if (z) {
            int iOooOOO02 = (c3735bo.OooOOO0() - 1) - i4;
            iOooOOO0 = (c3735bo.OooOOO0() - 1) - i6;
            i2 = iOooOOO02;
        } else {
            iOooOOO0 = i6;
            i2 = i4;
        }
        return new C4588yq(iOooOOo, new int[]{i4, iArr[1]}, i2, iOooOOO0, i);
    }

    private int[] OooOoO0(C3735bo c3735bo, boolean z) throws NotFoundException {
        int[] iArrOooOO0O = OooOO0O();
        iArrOooOO0O[0] = 0;
        iArrOooOO0O[1] = 0;
        iArrOooOO0O[2] = 0;
        iArrOooOO0O[3] = 0;
        int iOooOOO0 = c3735bo.OooOOO0();
        int i = 0;
        boolean z3 = false;
        while (i < iOooOOO0) {
            z3 = !c3735bo.OooO0oo(i);
            if (z == z3) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < iOooOOO0) {
            if (c3735bo.OooO0oo(i) != z3) {
                iArrOooOO0O[i3] = iArrOooOO0O[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else {
                    if (AbstractC4514wq.OooOOo0(iArrOooOO0O)) {
                        return new int[]{i2, i};
                    }
                    i2 += iArrOooOO0O[0] + iArrOooOO0O[1];
                    iArrOooOO0O[0] = iArrOooOO0O[2];
                    iArrOooOO0O[1] = iArrOooOO0O[3];
                    iArrOooOO0O[2] = 0;
                    iArrOooOO0O[3] = 0;
                    i3--;
                }
                iArrOooOO0O[i3] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p285z2.AbstractC4107lq
    public final C3770cm OooO0OO(int i, C3735bo c3735bo, Map<DecodeHintType, ?> map) throws NotFoundException {
        OooOOoo(this.OooOO0O, OooOo(c3735bo, false, i, map));
        c3735bo.OooOOo0();
        OooOOoo(this.OooOO0o, OooOo(c3735bo, true, i, map));
        c3735bo.OooOOo0();
        for (C4625zq c4625zq : this.OooOO0O) {
            if (c4625zq.OooO0OO() > 1) {
                for (C4625zq c4625zq2 : this.OooOO0o) {
                    if (c4625zq2.OooO0OO() > 1 && OooOo0(c4625zq, c4625zq2)) {
                        return OooOo0O(c4625zq, c4625zq2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p285z2.AbstractC4107lq, p285z2.InterfaceC3733bm
    public final void reset() {
        this.OooOO0O.clear();
        this.OooOO0o.clear();
    }
}
