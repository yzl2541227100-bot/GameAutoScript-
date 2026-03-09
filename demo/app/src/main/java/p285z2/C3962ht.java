package p285z2;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.util.Map;

/* JADX INFO: renamed from: z2.ht */
/* JADX INFO: loaded from: classes2.dex */
public class C3962ht {
    private final C3772co OooO00o;
    private InterfaceC3844em OooO0O0;

    public C3962ht(C3772co c3772co) {
        this.OooO00o = c3772co;
    }

    private float OooO0O0(C3807dm c3807dm, C3807dm c3807dm2) {
        float fOooOOO0 = OooOOO0((int) c3807dm.OooO0OO(), (int) c3807dm.OooO0Oo(), (int) c3807dm2.OooO0OO(), (int) c3807dm2.OooO0Oo());
        float fOooOOO02 = OooOOO0((int) c3807dm2.OooO0OO(), (int) c3807dm2.OooO0Oo(), (int) c3807dm.OooO0OO(), (int) c3807dm.OooO0Oo());
        return Float.isNaN(fOooOOO0) ? fOooOOO02 / 7.0f : Float.isNaN(fOooOOO02) ? fOooOOO0 / 7.0f : (fOooOOO0 + fOooOOO02) / 14.0f;
    }

    private static int OooO0OO(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, float f) throws NotFoundException {
        int iOooO0OO = ((C4142mo.OooO0OO(C3807dm.OooO0O0(c3807dm, c3807dm2) / f) + C4142mo.OooO0OO(C3807dm.OooO0O0(c3807dm, c3807dm3) / f)) / 2) + 7;
        int i = iOooO0OO & 3;
        if (i == 0) {
            return iOooO0OO + 1;
        }
        if (i == 2) {
            return iOooO0OO - 1;
        }
        if (i != 3) {
            return iOooO0OO;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static C4068ko OooO0Oo(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3, C3807dm c3807dm4, int i) {
        float fOooO0OO;
        float fOooO0Oo;
        float f;
        float f2 = i - 3.5f;
        if (c3807dm4 != null) {
            fOooO0OO = c3807dm4.OooO0OO();
            fOooO0Oo = c3807dm4.OooO0Oo();
            f = f2 - 3.0f;
        } else {
            fOooO0OO = (c3807dm2.OooO0OO() - c3807dm.OooO0OO()) + c3807dm3.OooO0OO();
            fOooO0Oo = (c3807dm2.OooO0Oo() - c3807dm.OooO0Oo()) + c3807dm3.OooO0Oo();
            f = f2;
        }
        return C4068ko.OooO0O0(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, c3807dm.OooO0OO(), c3807dm.OooO0Oo(), c3807dm2.OooO0OO(), c3807dm2.OooO0Oo(), fOooO0OO, fOooO0Oo, c3807dm3.OooO0OO(), c3807dm3.OooO0Oo());
    }

    private static C3772co OooOO0O(C3772co c3772co, C4068ko c4068ko, int i) throws NotFoundException {
        return AbstractC3994io.OooO0O0().OooO0Oo(c3772co, i, i, c4068ko);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r15 != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        return p285z2.C4142mo.OooO0O0(r19, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float OooOO0o(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = 1
            goto L3a
        L39:
            r12 = -1
        L3a:
            if (r4 >= r6) goto L3d
            r11 = 1
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L7f
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            if (r15 != r3) goto L57
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 1
            goto L5e
        L57:
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 0
        L5e:
            z2.co r5 = r3.OooO00o
            boolean r2 = r5.OooO0o0(r2, r10)
            if (r0 != r2) goto L70
            r0 = 2
            if (r15 != r0) goto L6e
            float r0 = p285z2.C4142mo.OooO0O0(r13, r14, r1, r4)
            return r0
        L6e:
            int r15 = r15 + 1
        L70:
            int r9 = r9 + r8
            if (r9 <= 0) goto L77
            if (r14 == r6) goto L83
            int r14 = r14 + r11
            int r9 = r9 - r7
        L77:
            int r13 = r13 + r12
            r5 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L7f:
            r3 = r17
            r19 = r5
        L83:
            r0 = 2
            if (r15 != r0) goto L8d
            r5 = r19
            float r0 = p285z2.C4142mo.OooO0O0(r5, r6, r1, r4)
            return r0
        L8d:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3962ht.OooOO0o(int, int, int, int):float");
    }

    private float OooOOO0(int i, int i2, int i3, int i4) {
        float fOooOOO0;
        float fOooO0oo;
        float fOooOO0o = OooOO0o(i, i2, i3, i4);
        int iOooOOO0 = i - (i3 - i);
        int iOooO0oo = 0;
        if (iOooOOO0 < 0) {
            fOooOOO0 = i / (i - iOooOOO0);
            iOooOOO0 = 0;
        } else if (iOooOOO0 >= this.OooO00o.OooOOO0()) {
            fOooOOO0 = ((this.OooO00o.OooOOO0() - 1) - i) / (iOooOOO0 - i);
            iOooOOO0 = this.OooO00o.OooOOO0() - 1;
        } else {
            fOooOOO0 = 1.0f;
        }
        float f = i2;
        int i5 = (int) (f - ((i4 - i2) * fOooOOO0));
        if (i5 < 0) {
            fOooO0oo = f / (i2 - i5);
        } else if (i5 >= this.OooO00o.OooO0oo()) {
            fOooO0oo = ((this.OooO00o.OooO0oo() - 1) - i2) / (i5 - i2);
            iOooO0oo = this.OooO00o.OooO0oo() - 1;
        } else {
            iOooO0oo = i5;
            fOooO0oo = 1.0f;
        }
        return (fOooOO0o + OooOO0o(i, i2, (int) (i + ((iOooOOO0 - i) * fOooO0oo)), iOooO0oo)) - 1.0f;
    }

    public final InterfaceC3844em OooO() {
        return this.OooO0O0;
    }

    public final float OooO00o(C3807dm c3807dm, C3807dm c3807dm2, C3807dm c3807dm3) {
        return (OooO0O0(c3807dm, c3807dm2) + OooO0O0(c3807dm, c3807dm3)) / 2.0f;
    }

    public final C3920go OooO0o(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        InterfaceC3844em interfaceC3844em = map == null ? null : (InterfaceC3844em) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.OooO0O0 = interfaceC3844em;
        return OooOO0(new FinderPatternFinder(this.OooO00o, interfaceC3844em).OooO0o(map));
    }

    public C3920go OooO0o0() throws NotFoundException, FormatException {
        return OooO0o(null);
    }

    public final C3888ft OooO0oO(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(this.OooO00o.OooOOO0() - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(this.OooO00o.OooO0oo() - 1, i2 + i3) - iMax2;
        if (iMin2 >= f3) {
            return new C3925gt(this.OooO00o, iMax, iMax2, iMin, iMin2, f, this.OooO0O0).OooO0OO();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final C3772co OooO0oo() {
        return this.OooO00o;
    }

    public final C3920go OooOO0(C4036jt c4036jt) throws NotFoundException, FormatException {
        C3999it c3999itOooO0O0 = c4036jt.OooO0O0();
        C3999it c3999itOooO0OO = c4036jt.OooO0OO();
        C3999it c3999itOooO00o = c4036jt.OooO00o();
        float fOooO00o = OooO00o(c3999itOooO0O0, c3999itOooO0OO, c3999itOooO00o);
        if (fOooO00o < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iOooO0OO = OooO0OO(c3999itOooO0O0, c3999itOooO0OO, c3999itOooO00o, fOooO00o);
        C3851et c3851etOooO0oO = C3851et.OooO0oO(iOooO0OO);
        int iOooO0o0 = c3851etOooO0oO.OooO0o0() - 7;
        C3888ft c3888ftOooO0oO = null;
        if (c3851etOooO0oO.OooO0Oo().length > 0) {
            float fOooO0OO = (c3999itOooO0OO.OooO0OO() - c3999itOooO0O0.OooO0OO()) + c3999itOooO00o.OooO0OO();
            float fOooO0Oo = (c3999itOooO0OO.OooO0Oo() - c3999itOooO0O0.OooO0Oo()) + c3999itOooO00o.OooO0Oo();
            float f = 1.0f - (3.0f / iOooO0o0);
            int iOooO0OO2 = (int) (c3999itOooO0O0.OooO0OO() + ((fOooO0OO - c3999itOooO0O0.OooO0OO()) * f));
            int iOooO0Oo = (int) (c3999itOooO0O0.OooO0Oo() + (f * (fOooO0Oo - c3999itOooO0O0.OooO0Oo())));
            for (int i = 4; i <= 16; i <<= 1) {
                try {
                    c3888ftOooO0oO = OooO0oO(fOooO00o, iOooO0OO2, iOooO0Oo, i);
                    break;
                } catch (NotFoundException unused) {
                }
            }
        }
        return new C3920go(OooOO0O(this.OooO00o, OooO0Oo(c3999itOooO0O0, c3999itOooO0OO, c3999itOooO00o, c3888ftOooO0oO, iOooO0OO), iOooO0OO), c3888ftOooO0oO == null ? new C3807dm[]{c3999itOooO00o, c3999itOooO0O0, c3999itOooO0OO} : new C3807dm[]{c3999itOooO00o, c3999itOooO0O0, c3999itOooO0OO, c3888ftOooO0oO});
    }
}
