package com.octopus.p222ad.internal.video;

import android.graphics.Matrix;

/* JADX INFO: renamed from: com.octopus.ad.internal.video.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3148a {

    /* JADX INFO: renamed from: a */
    private c f17455a;

    /* JADX INFO: renamed from: b */
    private c f17456b;

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17457a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f17458b;

        static {
            int[] iArr = new int[a.values().length];
            f17458b = iArr;
            try {
                iArr[a.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17458b[a.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17458b[a.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17458b[a.CENTER_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17458b[a.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17458b[a.CENTER_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17458b[a.RIGHT_TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17458b[a.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17458b[a.RIGHT_BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[b.values().length];
            f17457a = iArr2;
            try {
                iArr2[b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17457a[b.FIT_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17457a[b.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17457a[b.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17457a[b.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17457a[b.LEFT_TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17457a[b.LEFT_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17457a[b.LEFT_BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17457a[b.CENTER_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f17457a[b.CENTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17457a[b.CENTER_BOTTOM.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f17457a[b.RIGHT_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f17457a[b.RIGHT_CENTER.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f17457a[b.RIGHT_BOTTOM.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f17457a[b.LEFT_TOP_CROP.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f17457a[b.LEFT_CENTER_CROP.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f17457a[b.LEFT_BOTTOM_CROP.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f17457a[b.CENTER_TOP_CROP.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f17457a[b.CENTER_CROP.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f17457a[b.CENTER_BOTTOM_CROP.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f17457a[b.RIGHT_TOP_CROP.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f17457a[b.RIGHT_CENTER_CROP.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f17457a[b.RIGHT_BOTTOM_CROP.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f17457a[b.START_INSIDE.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f17457a[b.CENTER_INSIDE.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f17457a[b.END_INSIDE.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.a$a */
    public enum a {
        LEFT_TOP,
        LEFT_CENTER,
        LEFT_BOTTOM,
        CENTER_TOP,
        CENTER,
        CENTER_BOTTOM,
        RIGHT_TOP,
        RIGHT_CENTER,
        RIGHT_BOTTOM
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.a$b */
    public enum b {
        NONE,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        LEFT_TOP,
        LEFT_CENTER,
        LEFT_BOTTOM,
        CENTER_TOP,
        CENTER,
        CENTER_BOTTOM,
        RIGHT_TOP,
        RIGHT_CENTER,
        RIGHT_BOTTOM,
        LEFT_TOP_CROP,
        LEFT_CENTER_CROP,
        LEFT_BOTTOM_CROP,
        CENTER_TOP_CROP,
        CENTER_CROP,
        CENTER_BOTTOM_CROP,
        RIGHT_TOP_CROP,
        RIGHT_CENTER_CROP,
        RIGHT_BOTTOM_CROP,
        START_INSIDE,
        CENTER_INSIDE,
        END_INSIDE
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.video.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private int f17496a;

        /* JADX INFO: renamed from: b */
        private int f17497b;

        public c(int i, int i2) {
            this.f17496a = i;
            this.f17497b = i2;
        }

        /* JADX INFO: renamed from: a */
        public int m14645a() {
            return this.f17496a;
        }

        /* JADX INFO: renamed from: b */
        public int m14646b() {
            return this.f17497b;
        }
    }

    public C3148a(c cVar, c cVar2) {
        this.f17455a = cVar;
        this.f17456b = cVar2;
    }

    /* JADX INFO: renamed from: a */
    private Matrix m14631a() {
        return m14633a(this.f17456b.m14645a() / this.f17455a.m14645a(), this.f17456b.m14646b() / this.f17455a.m14646b(), a.LEFT_TOP);
    }

    /* JADX INFO: renamed from: a */
    private Matrix m14632a(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2, f3, f4);
        return matrix;
    }

    /* JADX INFO: renamed from: a */
    private Matrix m14633a(float f, float f2, a aVar) {
        switch (AnonymousClass1.f17458b[aVar.ordinal()]) {
            case 1:
                return m14632a(f, f2, 0.0f, 0.0f);
            case 2:
                return m14632a(f, f2, 0.0f, this.f17455a.m14646b() / 2.0f);
            case 3:
                return m14632a(f, f2, 0.0f, this.f17455a.m14646b());
            case 4:
                return m14632a(f, f2, this.f17455a.m14645a() / 2.0f, 0.0f);
            case 5:
                return m14632a(f, f2, this.f17455a.m14645a() / 2.0f, this.f17455a.m14646b() / 2.0f);
            case 6:
                return m14632a(f, f2, this.f17455a.m14645a() / 2.0f, this.f17455a.m14646b());
            case 7:
                return m14632a(f, f2, this.f17455a.m14645a(), 0.0f);
            case 8:
                return m14632a(f, f2, this.f17455a.m14645a(), this.f17455a.m14646b() / 2.0f);
            case 9:
                return m14632a(f, f2, this.f17455a.m14645a(), this.f17455a.m14646b());
            default:
                throw new IllegalArgumentException("Illegal PivotPoint");
        }
    }

    /* JADX INFO: renamed from: a */
    private Matrix m14634a(a aVar) {
        float fM14645a = this.f17455a.m14645a() / this.f17456b.m14645a();
        float fM14646b = this.f17455a.m14646b() / this.f17456b.m14646b();
        float fMin = Math.min(fM14645a, fM14646b);
        return m14633a(fMin / fM14645a, fMin / fM14646b, aVar);
    }

    /* JADX INFO: renamed from: b */
    private Matrix m14635b() {
        return m14633a(1.0f, 1.0f, a.LEFT_TOP);
    }

    /* JADX INFO: renamed from: b */
    private Matrix m14636b(a aVar) {
        return m14633a(this.f17456b.m14645a() / this.f17455a.m14645a(), this.f17456b.m14646b() / this.f17455a.m14646b(), aVar);
    }

    /* JADX INFO: renamed from: c */
    private Matrix m14637c() {
        return m14634a(a.LEFT_TOP);
    }

    /* JADX INFO: renamed from: c */
    private Matrix m14638c(a aVar) {
        float fM14645a = this.f17455a.m14645a() / this.f17456b.m14645a();
        float fM14646b = this.f17455a.m14646b() / this.f17456b.m14646b();
        float fMax = Math.max(fM14645a, fM14646b);
        return m14633a(fMax / fM14645a, fMax / fM14646b, aVar);
    }

    /* JADX INFO: renamed from: d */
    private Matrix m14639d() {
        return m14634a(a.CENTER);
    }

    /* JADX INFO: renamed from: e */
    private Matrix m14640e() {
        return m14634a(a.RIGHT_BOTTOM);
    }

    /* JADX INFO: renamed from: f */
    private Matrix m14641f() {
        return (this.f17456b.m14646b() > this.f17455a.m14645a() || this.f17456b.m14646b() > this.f17455a.m14646b()) ? m14637c() : m14636b(a.LEFT_TOP);
    }

    /* JADX INFO: renamed from: g */
    private Matrix m14642g() {
        return (this.f17456b.m14646b() > this.f17455a.m14645a() || this.f17456b.m14646b() > this.f17455a.m14646b()) ? m14639d() : m14636b(a.CENTER);
    }

    /* JADX INFO: renamed from: h */
    private Matrix m14643h() {
        return (this.f17456b.m14646b() > this.f17455a.m14645a() || this.f17456b.m14646b() > this.f17455a.m14646b()) ? m14640e() : m14636b(a.RIGHT_BOTTOM);
    }

    /* JADX INFO: renamed from: a */
    public Matrix m14644a(b bVar) {
        switch (AnonymousClass1.f17457a[bVar.ordinal()]) {
            case 1:
                return m14631a();
            case 2:
                return m14635b();
            case 3:
                return m14639d();
            case 4:
                return m14637c();
            case 5:
                return m14640e();
            case 6:
                return m14636b(a.LEFT_TOP);
            case 7:
                return m14636b(a.LEFT_CENTER);
            case 8:
                return m14636b(a.LEFT_BOTTOM);
            case 9:
                return m14636b(a.CENTER_TOP);
            case 10:
                return m14636b(a.CENTER);
            case 11:
                return m14636b(a.CENTER_BOTTOM);
            case 12:
                return m14636b(a.RIGHT_TOP);
            case 13:
                return m14636b(a.RIGHT_CENTER);
            case 14:
                return m14636b(a.RIGHT_BOTTOM);
            case 15:
                return m14638c(a.LEFT_TOP);
            case 16:
                return m14638c(a.LEFT_CENTER);
            case 17:
                return m14638c(a.LEFT_BOTTOM);
            case 18:
                return m14638c(a.CENTER_TOP);
            case 19:
                return m14638c(a.CENTER);
            case 20:
                return m14638c(a.CENTER_BOTTOM);
            case 21:
                return m14638c(a.RIGHT_TOP);
            case 22:
                return m14638c(a.RIGHT_CENTER);
            case 23:
                return m14638c(a.RIGHT_BOTTOM);
            case 24:
                return m14641f();
            case 25:
                return m14642g();
            case 26:
                return m14643h();
            default:
                return null;
        }
    }
}
