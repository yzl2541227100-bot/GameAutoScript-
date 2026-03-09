package com.anythink.expressad.exoplayer.p104i;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1495aa;
import com.anythink.expressad.exoplayer.InterfaceC1769z;
import com.anythink.expressad.exoplayer.p101h.C1620ae;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1663e extends AbstractC1666h {

    /* JADX INFO: renamed from: a */
    @Nullable
    private a f9216a;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final int f9217a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f9218b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f9219c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f9220d = 3;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public final int f9221e;

        /* JADX INFO: renamed from: f */
        private final int f9222f;

        /* JADX INFO: renamed from: g */
        private final int[] f9223g;

        /* JADX INFO: renamed from: h */
        private final C1621af[] f9224h;

        /* JADX INFO: renamed from: i */
        private final int[] f9225i;

        /* JADX INFO: renamed from: j */
        private final int[][][] f9226j;

        /* JADX INFO: renamed from: k */
        private final C1621af f9227k;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.e$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC4678a {
        }

        public a(int[] iArr, C1621af[] c1621afArr, int[] iArr2, int[][][] iArr3, C1621af c1621af) {
            this.f9223g = iArr;
            this.f9224h = c1621afArr;
            this.f9226j = iArr3;
            this.f9225i = iArr2;
            this.f9227k = c1621af;
            int length = iArr.length;
            this.f9222f = length;
            this.f9221e = length;
        }

        /* JADX INFO: renamed from: a */
        private int m7675a(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int iMin = 16;
            while (i3 < iArr.length) {
                String str2 = this.f9224h[i].m7299a(i2).m7294a(iArr[i3]).f9971h;
                int i5 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !C1717af.m8085a((Object) str, (Object) str2);
                }
                iMin = Math.min(iMin, this.f9226j[i][i2][i3] & 24);
                i3++;
                i4 = i5;
            }
            return z ? Math.min(iMin, this.f9225i[i]) : iMin;
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        private int m7676b(int i, int i2, int i3) {
            return m7684a(i, i2, i3);
        }

        /* JADX INFO: renamed from: c */
        private int m7677c(int i) {
            int i2;
            int[][] iArr = this.f9226j[i];
            int iMax = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                for (int i4 = 0; i4 < iArr[i3].length; i4++) {
                    int i5 = iArr[i3][i4] & 7;
                    if (i5 == 3) {
                        i2 = 2;
                    } else {
                        if (i5 == 4) {
                            return 3;
                        }
                        i2 = 1;
                    }
                    iMax = Math.max(iMax, i2);
                }
            }
            return iMax;
        }

        @Deprecated
        /* JADX INFO: renamed from: c */
        private C1621af m7678c() {
            return this.f9227k;
        }

        @Deprecated
        /* JADX INFO: renamed from: d */
        private int m7679d(int i) {
            int i2;
            int iMax = 0;
            for (int i3 = 0; i3 < this.f9222f; i3++) {
                if (this.f9223g[i3] == i) {
                    int[][] iArr = this.f9226j[i3];
                    int i4 = 0;
                    int iMax2 = 0;
                    while (true) {
                        if (i4 >= iArr.length) {
                            break;
                        }
                        for (int i5 = 0; i5 < iArr[i4].length; i5++) {
                            int i6 = iArr[i4][i5] & 7;
                            if (i6 == 3) {
                                i2 = 2;
                            } else {
                                if (i6 == 4) {
                                    iMax2 = 3;
                                    break;
                                }
                                i2 = 1;
                            }
                            iMax2 = Math.max(iMax2, i2);
                        }
                        i4++;
                    }
                    iMax = Math.max(iMax, iMax2);
                }
            }
            return iMax;
        }

        /* JADX INFO: renamed from: e */
        private int m7680e(int i) {
            int i2;
            int iMax = 0;
            for (int i3 = 0; i3 < this.f9222f; i3++) {
                if (this.f9223g[i3] == i) {
                    int[][] iArr = this.f9226j[i3];
                    int i4 = 0;
                    int iMax2 = 0;
                    while (true) {
                        if (i4 >= iArr.length) {
                            break;
                        }
                        for (int i5 = 0; i5 < iArr[i4].length; i5++) {
                            int i6 = iArr[i4][i5] & 7;
                            if (i6 == 3) {
                                i2 = 2;
                            } else {
                                if (i6 == 4) {
                                    iMax2 = 3;
                                    break;
                                }
                                i2 = 1;
                            }
                            iMax2 = Math.max(iMax2, i2);
                        }
                        i4++;
                    }
                    iMax = Math.max(iMax, iMax2);
                }
            }
            return iMax;
        }

        /* JADX INFO: renamed from: a */
        public final int m7681a() {
            return this.f9222f;
        }

        /* JADX INFO: renamed from: a */
        public final int m7682a(int i) {
            return this.f9223g[i];
        }

        /* JADX INFO: renamed from: a */
        public final int m7683a(int i, int i2) {
            int i3 = this.f9224h[i].m7299a(i2).f8750a;
            int[] iArr = new int[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (m7684a(i, i2, i6) == 4) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            int iMin = 16;
            String str = null;
            boolean z = false;
            int i7 = 0;
            while (i4 < iArrCopyOf.length) {
                String str2 = this.f9224h[i].m7299a(i2).m7294a(iArrCopyOf[i4]).f9971h;
                int i8 = i7 + 1;
                if (i7 == 0) {
                    str = str2;
                } else {
                    z |= !C1717af.m8085a((Object) str, (Object) str2);
                }
                iMin = Math.min(iMin, this.f9226j[i][i2][i4] & 24);
                i4++;
                i7 = i8;
            }
            return z ? Math.min(iMin, this.f9225i[i]) : iMin;
        }

        /* JADX INFO: renamed from: a */
        public final int m7684a(int i, int i2, int i3) {
            return this.f9226j[i][i2][i3] & 7;
        }

        /* JADX INFO: renamed from: b */
        public final C1621af m7685b() {
            return this.f9227k;
        }

        /* JADX INFO: renamed from: b */
        public final C1621af m7686b(int i) {
            return this.f9224h[i];
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m7669a(InterfaceC1769z[] interfaceC1769zArr, C1620ae c1620ae) {
        int length = interfaceC1769zArr.length;
        int i = 0;
        for (int i2 = 0; i2 < interfaceC1769zArr.length; i2++) {
            InterfaceC1769z interfaceC1769z = interfaceC1769zArr[i2];
            for (int i3 = 0; i3 < c1620ae.f8750a; i3++) {
                int iMo6600a = interfaceC1769z.mo6600a(c1620ae.m7294a(i3)) & 7;
                if (iMo6600a > i) {
                    if (iMo6600a == 4) {
                        return i2;
                    }
                    length = i2;
                    i = iMo6600a;
                }
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: a */
    private static int[] m7670a(InterfaceC1769z interfaceC1769z, C1620ae c1620ae) {
        int[] iArr = new int[c1620ae.f8750a];
        for (int i = 0; i < c1620ae.f8750a; i++) {
            iArr[i] = interfaceC1769z.mo6600a(c1620ae.m7294a(i));
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    private static int[] m7671a(InterfaceC1769z[] interfaceC1769zArr) {
        int length = interfaceC1769zArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = interfaceC1769zArr[i].mo6144m();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public abstract Pair<C1495aa[], InterfaceC1664f[]> mo7626a(a aVar, int[][][] iArr, int[] iArr2);

    @Nullable
    /* JADX INFO: renamed from: a */
    public final a m7672a() {
        return this.f9216a;
    }

    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1666h
    /* JADX INFO: renamed from: a */
    public final C1667i mo7673a(InterfaceC1769z[] interfaceC1769zArr, C1621af c1621af) {
        int[] iArr;
        int[] iArr2 = new int[interfaceC1769zArr.length + 1];
        int length = interfaceC1769zArr.length + 1;
        C1620ae[][] c1620aeArr = new C1620ae[length][];
        int[][][] iArr3 = new int[interfaceC1769zArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c1621af.f8754b;
            c1620aeArr[i] = new C1620ae[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = interfaceC1769zArr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = interfaceC1769zArr[i3].mo6144m();
        }
        for (int i4 = 0; i4 < c1621af.f8754b; i4++) {
            C1620ae c1620aeM7299a = c1621af.m7299a(i4);
            int length3 = interfaceC1769zArr.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= interfaceC1769zArr.length) {
                    break;
                }
                InterfaceC1769z interfaceC1769z = interfaceC1769zArr[i5];
                for (int i7 = 0; i7 < c1620aeM7299a.f8750a; i7++) {
                    int iMo6600a = interfaceC1769z.mo6600a(c1620aeM7299a.m7294a(i7)) & 7;
                    if (iMo6600a > i6) {
                        if (iMo6600a == 4) {
                            length3 = i5;
                            break;
                        }
                        length3 = i5;
                        i6 = iMo6600a;
                    }
                }
                i5++;
            }
            if (length3 == interfaceC1769zArr.length) {
                iArr = new int[c1620aeM7299a.f8750a];
            } else {
                InterfaceC1769z interfaceC1769z2 = interfaceC1769zArr[length3];
                int[] iArr5 = new int[c1620aeM7299a.f8750a];
                for (int i8 = 0; i8 < c1620aeM7299a.f8750a; i8++) {
                    iArr5[i8] = interfaceC1769z2.mo6600a(c1620aeM7299a.m7294a(i8));
                }
                iArr = iArr5;
            }
            int i9 = iArr2[length3];
            c1620aeArr[length3][i9] = c1620aeM7299a;
            iArr3[length3][i9] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        C1621af[] c1621afArr = new C1621af[interfaceC1769zArr.length];
        int[] iArr6 = new int[interfaceC1769zArr.length];
        for (int i10 = 0; i10 < interfaceC1769zArr.length; i10++) {
            int i11 = iArr2[i10];
            c1621afArr[i10] = new C1621af((C1620ae[]) C1717af.m8090a(c1620aeArr[i10], i11));
            iArr3[i10] = (int[][]) C1717af.m8090a(iArr3[i10], i11);
            iArr6[i10] = interfaceC1769zArr[i10].mo6122a();
        }
        a aVar = new a(iArr6, c1621afArr, iArr4, iArr3, new C1621af((C1620ae[]) C1717af.m8090a(c1620aeArr[interfaceC1769zArr.length], iArr2[interfaceC1769zArr.length])));
        Pair<C1495aa[], InterfaceC1664f[]> pairMo7626a = mo7626a(aVar, iArr3, iArr4);
        return new C1667i((C1495aa[]) pairMo7626a.first, (InterfaceC1664f[]) pairMo7626a.second, aVar);
    }

    @Override // com.anythink.expressad.exoplayer.p104i.AbstractC1666h
    /* JADX INFO: renamed from: a */
    public final void mo7674a(Object obj) {
        this.f9216a = (a) obj;
    }
}
