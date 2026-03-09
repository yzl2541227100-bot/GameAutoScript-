package com.googlecode.leptonica.android;

/* JADX INFO: loaded from: classes2.dex */
public class Scale {

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[EnumC2869a.m13227a().length];
            OooO00o = iArr;
            try {
                iArr[EnumC2869a.f16107a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[EnumC2869a.f16108b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[EnumC2869a.f16109c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.googlecode.leptonica.android.Scale$a */
    public static final class EnumC2869a {

        /* JADX INFO: renamed from: a */
        public static final int f16107a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f16108b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f16109c = 3;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ int[] f16110d = {1, 2, 3};

        private EnumC2869a(String str, int i) {
        }

        /* JADX INFO: renamed from: a */
        public static int[] m13227a() {
            return (int[]) f16110d.clone();
        }
    }

    static {
        System.loadLibrary("jpgt");
        System.loadLibrary("pngt");
        System.loadLibrary("lept");
    }

    private static Pix OooO00o(Pix pix, float f) {
        return OooO0O0(pix, f, f);
    }

    private static Pix OooO0O0(Pix pix, float f, float f2) {
        if (pix == null) {
            throw new IllegalArgumentException("Source pix must be non-null");
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException("X scaling factor must be positive");
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Y scaling factor must be positive");
        }
        long jNativeScale = nativeScale(pix.OooO0O0(), f, f2);
        if (jNativeScale != 0) {
            return new Pix(jNativeScale);
        }
        throw new RuntimeException("Failed to natively scale pix");
    }

    private static Pix OooO0OO(Pix pix, int i, int i2, int i3) {
        if (pix == null) {
            throw new IllegalArgumentException("Source pix must be non-null");
        }
        float fOooO0oO = i / pix.OooO0oO();
        float fOooO0oo = i2 / pix.OooO0oo();
        int i4 = OooO00o.OooO00o[i3 - 1];
        if (i4 != 2) {
            if (i4 == 3) {
                fOooO0oO = Math.min(1.0f, Math.min(fOooO0oO, fOooO0oo));
            }
            return OooO0O0(pix, fOooO0oO, fOooO0oo);
        }
        fOooO0oO = Math.min(fOooO0oO, fOooO0oo);
        fOooO0oo = fOooO0oO;
        return OooO0O0(pix, fOooO0oO, fOooO0oo);
    }

    private static Pix OooO0Oo(Pix pix, float f) {
        if (pix == null) {
            throw new IllegalArgumentException("Source pix must be non-null");
        }
        if (f > 0.0f) {
            return new Pix(nativeScaleGeneral(pix.OooO0O0(), f, f, 0.0f, 0));
        }
        throw new IllegalArgumentException("Scaling factor must be positive");
    }

    private static native long nativeScale(long j, float f, float f2);

    private static native long nativeScaleGeneral(long j, float f, float f2, float f3, int i);
}
