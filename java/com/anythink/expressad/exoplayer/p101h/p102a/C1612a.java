package com.anythink.expressad.exoplayer.p101h.p102a;

import android.net.Uri;
import androidx.annotation.CheckResult;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1612a {

    /* JADX INFO: renamed from: a */
    public static final int f8638a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f8639b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f8640c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f8641d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f8642e = 4;

    /* JADX INFO: renamed from: f */
    public static final C1612a f8643f = new C1612a(new long[0]);

    /* JADX INFO: renamed from: g */
    public final int f8644g;

    /* JADX INFO: renamed from: h */
    public final long[] f8645h;

    /* JADX INFO: renamed from: i */
    public final a[] f8646i;

    /* JADX INFO: renamed from: j */
    public final long f8647j;

    /* JADX INFO: renamed from: k */
    public final long f8648k;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f8649a;

        /* JADX INFO: renamed from: b */
        public final Uri[] f8650b;

        /* JADX INFO: renamed from: c */
        public final int[] f8651c;

        /* JADX INFO: renamed from: d */
        public final long[] f8652d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C1711a.m8010a(iArr.length == uriArr.length);
            this.f8649a = i;
            this.f8651c = iArr;
            this.f8650b = uriArr;
            this.f8652d = jArr;
        }

        @CheckResult
        /* JADX INFO: renamed from: a */
        private static int[] m7194a(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        @CheckResult
        /* JADX INFO: renamed from: a */
        private static long[] m7195a(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C1500b.f7455b);
            return jArrCopyOf;
        }

        /* JADX INFO: renamed from: c */
        private int m7196c() {
            return m7197a(-1);
        }

        /* JADX INFO: renamed from: a */
        public final int m7197a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f8651c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        @CheckResult
        /* JADX INFO: renamed from: a */
        public final a m7198a(int i, int i2) {
            int i3 = this.f8649a;
            C1711a.m8010a(i3 == -1 || i2 < i3);
            int[] iArrM7194a = m7194a(this.f8651c, i2 + 1);
            C1711a.m8010a(iArrM7194a[i2] == 0 || iArrM7194a[i2] == 1 || iArrM7194a[i2] == i);
            long[] jArrM7195a = this.f8652d;
            if (jArrM7195a.length != iArrM7194a.length) {
                jArrM7195a = m7195a(jArrM7195a, iArrM7194a.length);
            }
            Uri[] uriArr = this.f8650b;
            if (uriArr.length != iArrM7194a.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrM7194a.length);
            }
            iArrM7194a[i2] = i;
            return new a(this.f8649a, iArrM7194a, uriArr, jArrM7195a);
        }

        @CheckResult
        /* JADX INFO: renamed from: a */
        public final a m7199a(Uri uri, int i) {
            int i2 = this.f8649a;
            C1711a.m8010a(i2 == -1 || i < i2);
            int[] iArrM7194a = m7194a(this.f8651c, i + 1);
            C1711a.m8010a(iArrM7194a[i] == 0);
            long[] jArrM7195a = this.f8652d;
            if (jArrM7195a.length != iArrM7194a.length) {
                jArrM7195a = m7195a(jArrM7195a, iArrM7194a.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f8650b, iArrM7194a.length);
            uriArr[i] = uri;
            iArrM7194a[i] = 1;
            return new a(this.f8649a, iArrM7194a, uriArr, jArrM7195a);
        }

        @CheckResult
        /* JADX INFO: renamed from: a */
        public final a m7200a(long[] jArr) {
            C1711a.m8010a(this.f8649a == -1 || jArr.length <= this.f8650b.length);
            int length = jArr.length;
            Uri[] uriArr = this.f8650b;
            if (length < uriArr.length) {
                jArr = m7195a(jArr, uriArr.length);
            }
            return new a(this.f8649a, this.f8651c, this.f8650b, jArr);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m7201a() {
            return this.f8649a == -1 || m7197a(-1) < this.f8649a;
        }

        @CheckResult
        /* JADX INFO: renamed from: b */
        public final a m7202b() {
            if (this.f8649a == -1) {
                return new a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.f8651c;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                if (iArrCopyOf[i] == 1 || iArrCopyOf[i] == 0) {
                    iArrCopyOf[i] = 2;
                }
            }
            return new a(length, iArrCopyOf, this.f8650b, this.f8652d);
        }

        @CheckResult
        /* JADX INFO: renamed from: b */
        public final a m7203b(int i) {
            C1711a.m8010a(this.f8649a == -1 && this.f8651c.length <= i);
            return new a(i, m7194a(this.f8651c, i), (Uri[]) Arrays.copyOf(this.f8650b, i), m7195a(this.f8652d, i));
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a.a$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private C1612a(long... jArr) {
        this.f8644g = 0;
        this.f8645h = Arrays.copyOf(jArr, 0);
        this.f8646i = new a[0];
        this.f8647j = 0L;
        this.f8648k = C1500b.f7455b;
    }

    private C1612a(long[] jArr, a[] aVarArr, long j, long j2) {
        this.f8644g = aVarArr.length;
        this.f8645h = jArr;
        this.f8646i = aVarArr;
        this.f8647j = j;
        this.f8648k = j2;
    }

    /* JADX INFO: renamed from: a */
    private int m7183a(long j) {
        int length = this.f8645h.length - 1;
        while (length >= 0) {
            long[] jArr = this.f8645h;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.f8646i[length].m7201a()) {
            return -1;
        }
        return length;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    private C1612a m7184a(int i) {
        a[] aVarArr = this.f8646i;
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i] = aVarArr2[i].m7202b();
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    private C1612a m7185a(int i, int i2) {
        C1711a.m8010a(i2 > 0);
        a[] aVarArr = this.f8646i;
        if (aVarArr[i].f8649a == i2) {
            return this;
        }
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i] = this.f8646i[i].m7203b(i2);
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    private C1612a m7186a(int i, int i2, Uri uri) {
        a[] aVarArr = this.f8646i;
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i] = aVarArr2[i].m7199a(uri, i2);
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }

    /* JADX INFO: renamed from: b */
    private int m7187b(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.f8645h;
            if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && this.f8646i[i].m7201a())) {
                break;
            }
            i++;
        }
        if (i < this.f8645h.length) {
            return i;
        }
        return -1;
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    private C1612a m7188b(int i, int i2) {
        a[] aVarArr = this.f8646i;
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i] = aVarArr2[i].m7198a(3, i2);
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    private C1612a m7189c(int i, int i2) {
        a[] aVarArr = this.f8646i;
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i] = aVarArr2[i].m7198a(2, i2);
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    private C1612a m7190c(long j) {
        return this.f8647j == j ? this : new C1612a(this.f8645h, this.f8646i, j, this.f8648k);
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    private C1612a m7191d(int i, int i2) {
        a[] aVarArr = this.f8646i;
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        aVarArr2[i] = aVarArr2[i].m7198a(4, i2);
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    private C1612a m7192d(long j) {
        return this.f8648k == j ? this : new C1612a(this.f8645h, this.f8646i, this.f8647j, j);
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final C1612a m7193a(long[][] jArr) {
        a[] aVarArr = this.f8646i;
        a[] aVarArr2 = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        for (int i = 0; i < this.f8644g; i++) {
            aVarArr2[i] = aVarArr2[i].m7200a(jArr[i]);
        }
        return new C1612a(this.f8645h, aVarArr2, this.f8647j, this.f8648k);
    }
}
