package p285z2;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.zxing.FormatException;

/* JADX INFO: renamed from: z2.zo */
/* JADX INFO: loaded from: classes2.dex */
public final class C4623zo {
    private static final C4623zo[] OooO0oo = OooO00o();
    private final int OooO00o;
    private final int OooO0O0;
    private final int OooO0OO;
    private final int OooO0Oo;
    private final OooO0OO OooO0o;
    private final int OooO0o0;
    private final int OooO0oO;

    /* JADX INFO: renamed from: z2.zo$OooO0O0 */
    public static final class OooO0O0 {
        private final int OooO00o;
        private final int OooO0O0;

        private OooO0O0(int i, int i2) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
        }

        public final int OooO00o() {
            return this.OooO00o;
        }

        public final int OooO0O0() {
            return this.OooO0O0;
        }
    }

    /* JADX INFO: renamed from: z2.zo$OooO0OO */
    public static final class OooO0OO {
        private final int OooO00o;
        private final OooO0O0[] OooO0O0;

        private OooO0OO(int i, OooO0O0 oooO0O0) {
            this.OooO00o = i;
            this.OooO0O0 = new OooO0O0[]{oooO0O0};
        }

        private OooO0OO(int i, OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
            this.OooO00o = i;
            this.OooO0O0 = new OooO0O0[]{oooO0O0, oooO0O02};
        }

        public final OooO0O0[] OooO00o() {
            return this.OooO0O0;
        }

        public final int OooO0O0() {
            return this.OooO00o;
        }
    }

    private C4623zo(int i, int i2, int i3, int i4, int i5, OooO0OO oooO0OO) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
        this.OooO0o0 = i5;
        this.OooO0o = oooO0OO;
        int iOooO0O0 = oooO0OO.OooO0O0();
        int iOooO00o = 0;
        for (OooO0O0 oooO0O0 : oooO0OO.OooO00o()) {
            iOooO00o += oooO0O0.OooO00o() * (oooO0O0.OooO0O0() + iOooO0O0);
        }
        this.OooO0oO = iOooO00o;
    }

    private static C4623zo[] OooO00o() {
        int i = 1;
        int i2 = 5;
        int i3 = 8;
        C4623zo c4623zo = new C4623zo(3, 14, 14, 12, 12, new OooO0OO(10, new OooO0O0(i, i3)));
        int i4 = 2;
        int i5 = 12;
        int i6 = 18;
        C4623zo c4623zo2 = new C4623zo(7, 22, 22, 20, 20, new OooO0OO(20, new OooO0O0(i, 30)));
        int i7 = 6;
        int i8 = 36;
        int i9 = 62;
        int i10 = 56;
        int i11 = 68;
        OooO0O0 oooO0O0 = new OooO0O0(i, 5);
        OooO0O0 oooO0O02 = new OooO0O0(i, 10);
        OooO0O0 oooO0O03 = new OooO0O0(i, 16);
        return new C4623zo[]{new C4623zo(1, 10, 10, 8, 8, new OooO0OO(i2, new OooO0O0(i, 3))), new C4623zo(2, 12, 12, 10, 10, new OooO0OO(7, new OooO0O0(i, i2))), c4623zo, new C4623zo(4, 16, 16, 14, 14, new OooO0OO(i5, new OooO0O0(i, i5))), new C4623zo(5, 18, 18, 16, 16, new OooO0OO(14, new OooO0O0(i, i6))), new C4623zo(6, 20, 20, 18, 18, new OooO0OO(i6, new OooO0O0(i, 22))), c4623zo2, new C4623zo(8, 24, 24, 22, 22, new OooO0OO(24, new OooO0O0(i, i8))), new C4623zo(9, 26, 26, 24, 24, new OooO0OO(28, new OooO0O0(i, 44))), new C4623zo(10, 32, 32, 14, 14, new OooO0OO(i8, new OooO0O0(i, i9))), new C4623zo(11, 36, 36, 16, 16, new OooO0OO(42, new OooO0O0(i, 86))), new C4623zo(12, 40, 40, 18, 18, new OooO0OO(48, new OooO0O0(i, 114))), new C4623zo(13, 44, 44, 20, 20, new OooO0OO(i10, new OooO0O0(i, 144))), new C4623zo(14, 48, 48, 22, 22, new OooO0OO(i11, new OooO0O0(i, 174))), new C4623zo(15, 52, 52, 24, 24, new OooO0OO(42, new OooO0O0(i4, 102))), new C4623zo(16, 64, 64, 14, 14, new OooO0OO(i10, new OooO0O0(i4, 140))), new C4623zo(17, 72, 72, 16, 16, new OooO0OO(i8, new OooO0O0(4, 92))), new C4623zo(18, 80, 80, 18, 18, new OooO0OO(48, new OooO0O0(4, 114))), new C4623zo(19, 88, 88, 20, 20, new OooO0OO(i10, new OooO0O0(4, 144))), new C4623zo(20, 96, 96, 22, 22, new OooO0OO(i11, new OooO0O0(4, 174))), new C4623zo(21, 104, 104, 24, 24, new OooO0OO(i10, new OooO0O0(i7, 136))), new C4623zo(22, 120, 120, 18, 18, new OooO0OO(i11, new OooO0O0(i7, HideBottomViewOnScrollBehavior.OooO0o0))), new C4623zo(23, 132, 132, 20, 20, new OooO0OO(i9, new OooO0O0(i3, 163))), new C4623zo(24, 144, 144, 22, 22, new OooO0OO(i9, new OooO0O0(i3, 156), new OooO0O0(i4, 155))), new C4623zo(25, 8, 18, 6, 16, new OooO0OO(7, oooO0O0)), new C4623zo(26, 8, 32, 6, 14, new OooO0OO(11, oooO0O02)), new C4623zo(27, 12, 26, 10, 24, new OooO0OO(14, oooO0O03)), new C4623zo(28, 12, 36, 10, 16, new OooO0OO(i6, new OooO0O0(i, 22))), new C4623zo(29, 16, 36, 14, 16, new OooO0OO(24, new OooO0O0(i, 32))), new C4623zo(30, 16, 48, 14, 22, new OooO0OO(28, new OooO0O0(i, 49)))};
    }

    public static C4623zo OooO0oo(int i, int i2) throws FormatException {
        if ((i & 1) != 0 || (i2 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        for (C4623zo c4623zo : OooO0oo) {
            if (c4623zo.OooO0O0 == i && c4623zo.OooO0OO == i2) {
                return c4623zo;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public final int OooO() {
        return this.OooO00o;
    }

    public final int OooO0O0() {
        return this.OooO0o0;
    }

    public final int OooO0OO() {
        return this.OooO0Oo;
    }

    public final OooO0OO OooO0Oo() {
        return this.OooO0o;
    }

    public final int OooO0o() {
        return this.OooO0O0;
    }

    public final int OooO0o0() {
        return this.OooO0OO;
    }

    public final int OooO0oO() {
        return this.OooO0oO;
    }

    public final String toString() {
        return String.valueOf(this.OooO00o);
    }
}
