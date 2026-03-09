package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.fo */
/* JADX INFO: loaded from: classes2.dex */
public final class C3883fo extends AbstractC3994io {
    @Override // p285z2.AbstractC3994io
    public final C3772co OooO0OO(C3772co c3772co, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws NotFoundException {
        return OooO0Oo(c3772co, i, i2, C4068ko.OooO0O0(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    @Override // p285z2.AbstractC3994io
    public final C3772co OooO0Oo(C3772co c3772co, int i, int i2, C4068ko c4068ko) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        C3772co c3772co2 = new C3772co(i, i2);
        int i3 = i * 2;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i2; i4++) {
            float f = i4 + 0.5f;
            for (int i5 = 0; i5 < i3; i5 += 2) {
                fArr[i5] = (i5 / 2) + 0.5f;
                fArr[i5 + 1] = f;
            }
            c4068ko.OooO0o(fArr);
            AbstractC3994io.OooO00o(c3772co, fArr);
            for (int i6 = 0; i6 < i3; i6 += 2) {
                try {
                    if (c3772co.OooO0o0((int) fArr[i6], (int) fArr[i6 + 1])) {
                        c3772co2.OooOOo0(i6 / 2, i4);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        return c3772co2;
    }
}
