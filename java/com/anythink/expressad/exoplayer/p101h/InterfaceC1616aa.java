package com.anythink.expressad.exoplayer.p101h;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.aa */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1616aa {

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.aa$a */
    public static class a implements InterfaceC1616aa {

        /* JADX INFO: renamed from: a */
        private final Random f8694a;

        /* JADX INFO: renamed from: b */
        private final int[] f8695b;

        /* JADX INFO: renamed from: c */
        private final int[] f8696c;

        public a() {
            this(0, new Random());
        }

        private a(int i, long j) {
            this(i, new Random(j));
        }

        private a(int i, Random random) {
            this(m7255a(i, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f8695b = iArr;
            this.f8694a = random;
            this.f8696c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f8696c[iArr[i]] = i;
            }
        }

        /* JADX INFO: renamed from: a */
        private static int[] m7255a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: a */
        public final int mo7247a() {
            return this.f8695b.length;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: a */
        public final int mo7248a(int i) {
            int i2 = this.f8696c[i] + 1;
            int[] iArr = this.f8695b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: a */
        public final InterfaceC1616aa mo7249a(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f8694a.nextInt(this.f8695b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f8694a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f8695b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f8695b;
                if (i3 >= iArr4.length + i2) {
                    return new a(iArr3, new Random(this.f8694a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    iArr3[i3] = iArr4[i7];
                    if (iArr3[i3] >= i) {
                        iArr3[i3] = iArr3[i3] + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: b */
        public final int mo7250b() {
            int[] iArr = this.f8695b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: b */
        public final int mo7251b(int i) {
            int i2 = this.f8696c[i] - 1;
            if (i2 >= 0) {
                return this.f8695b[i2];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: c */
        public final int mo7252c() {
            int[] iArr = this.f8695b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: c */
        public final InterfaceC1616aa mo7253c(int i) {
            int[] iArr = new int[this.f8695b.length - 1];
            int i2 = 0;
            boolean z = false;
            while (true) {
                int[] iArr2 = this.f8695b;
                if (i2 >= iArr2.length) {
                    return new a(iArr, new Random(this.f8694a.nextLong()));
                }
                if (iArr2[i2] == i) {
                    z = true;
                } else {
                    iArr[z ? i2 - 1 : i2] = iArr2[i2] > i ? iArr2[i2] - 1 : iArr2[i2];
                }
                i2++;
            }
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: d */
        public final InterfaceC1616aa mo7254d() {
            return new a(0, new Random(this.f8694a.nextLong()));
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.aa$b */
    public static final class b implements InterfaceC1616aa {

        /* JADX INFO: renamed from: a */
        private final int f8697a;

        public b(int i) {
            this.f8697a = i;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: a */
        public final int mo7247a() {
            return this.f8697a;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: a */
        public final int mo7248a(int i) {
            int i2 = i + 1;
            if (i2 < this.f8697a) {
                return i2;
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: a */
        public final InterfaceC1616aa mo7249a(int i, int i2) {
            return new b(this.f8697a + i2);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: b */
        public final int mo7250b() {
            int i = this.f8697a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: b */
        public final int mo7251b(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: c */
        public final int mo7252c() {
            return this.f8697a > 0 ? 0 : -1;
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: c */
        public final InterfaceC1616aa mo7253c(int i) {
            return new b(this.f8697a - 1);
        }

        @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1616aa
        /* JADX INFO: renamed from: d */
        public final InterfaceC1616aa mo7254d() {
            return new b(0);
        }
    }

    /* JADX INFO: renamed from: a */
    int mo7247a();

    /* JADX INFO: renamed from: a */
    int mo7248a(int i);

    /* JADX INFO: renamed from: a */
    InterfaceC1616aa mo7249a(int i, int i2);

    /* JADX INFO: renamed from: b */
    int mo7250b();

    /* JADX INFO: renamed from: b */
    int mo7251b(int i);

    /* JADX INFO: renamed from: c */
    int mo7252c();

    /* JADX INFO: renamed from: c */
    InterfaceC1616aa mo7253c(int i);

    /* JADX INFO: renamed from: d */
    InterfaceC1616aa mo7254d();
}
