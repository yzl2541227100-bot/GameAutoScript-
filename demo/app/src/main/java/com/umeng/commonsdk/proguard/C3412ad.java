package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.C3428at;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ad */
/* JADX INFO: loaded from: classes2.dex */
public class C3412ad {

    /* JADX INFO: renamed from: a */
    private final AbstractC3434az f18666a;

    /* JADX INFO: renamed from: b */
    private final C3448bm f18667b;

    public C3412ad() {
        this(new C3428at.a());
    }

    public C3412ad(InterfaceC3437bb interfaceC3437bb) {
        C3448bm c3448bm = new C3448bm();
        this.f18667b = c3448bm;
        this.f18666a = interfaceC3437bb.mo15825a(c3448bm);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x009e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object m15722a(byte r1, byte[] r2, com.umeng.commonsdk.proguard.InterfaceC3416ah r3, com.umeng.commonsdk.proguard.InterfaceC3416ah... r4) throws com.umeng.commonsdk.proguard.C3415ag {
        /*
            r0 = this;
            com.umeng.commonsdk.proguard.au r2 = r0.m15723j(r2, r3, r4)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r2 == 0) goto L9e
            r3 = 2
            if (r1 == r3) goto L8f
            r3 = 3
            if (r1 == r3) goto L80
            r3 = 4
            if (r1 == r3) goto L71
            r3 = 6
            if (r1 == r3) goto L62
            r3 = 8
            if (r1 == r3) goto L53
            r3 = 100
            r4 = 11
            if (r1 == r3) goto L48
            r3 = 10
            if (r1 == r3) goto L39
            if (r1 == r4) goto L24
            goto L9e
        L24:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r4) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.String r1 = r1.mo15824z()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
        L2e:
            com.umeng.commonsdk.proguard.bm r2 = r0.f18667b
            r2.m15871e()
            com.umeng.commonsdk.proguard.az r2 = r0.f18666a
            r2.mo15845B()
            return r1
        L39:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            long r1 = r1.mo15822x()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L48:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r4) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.nio.ByteBuffer r1 = r1.mo15781A()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L53:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            int r1 = r1.mo15821w()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L62:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            short r1 = r1.mo15820v()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Short r1 = java.lang.Short.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L71:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            double r1 = r1.mo15823y()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L80:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            byte r1 = r1.mo15819u()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L8f:
            byte r1 = r2.f18741b     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            if (r1 != r3) goto L9e
            com.umeng.commonsdk.proguard.az r1 = r0.f18666a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            boolean r1 = r1.mo15818t()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La2
            goto L2e
        L9e:
            r1 = 0
            goto L2e
        La0:
            r1 = move-exception
            goto La9
        La2:
            r1 = move-exception
            com.umeng.commonsdk.proguard.ag r2 = new com.umeng.commonsdk.proguard.ag     // Catch: java.lang.Throwable -> La0
            r2.<init>(r1)     // Catch: java.lang.Throwable -> La0
            throw r2     // Catch: java.lang.Throwable -> La0
        La9:
            com.umeng.commonsdk.proguard.bm r2 = r0.f18667b
            r2.m15871e()
            com.umeng.commonsdk.proguard.az r2 = r0.f18666a
            r2.mo15845B()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.C3412ad.m15722a(byte, byte[], com.umeng.commonsdk.proguard.ah, com.umeng.commonsdk.proguard.ah[]):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    private C3429au m15723j(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        this.f18667b.m15869a(bArr);
        int length = interfaceC3416ahArr.length + 1;
        InterfaceC3416ah[] interfaceC3416ahArr2 = new InterfaceC3416ah[length];
        int i = 0;
        interfaceC3416ahArr2[0] = interfaceC3416ah;
        int i2 = 0;
        while (i2 < interfaceC3416ahArr.length) {
            int i3 = i2 + 1;
            interfaceC3416ahArr2[i3] = interfaceC3416ahArr[i2];
            i2 = i3;
        }
        this.f18666a.mo15808j();
        C3429au c3429auMo15810l = null;
        while (i < length) {
            c3429auMo15810l = this.f18666a.mo15810l();
            if (c3429auMo15810l.f18741b == 0 || c3429auMo15810l.f18742c > interfaceC3416ahArr2[i].mo15738a()) {
                return null;
            }
            if (c3429auMo15810l.f18742c != interfaceC3416ahArr2[i].mo15738a()) {
                C3438bc.m15856a(this.f18666a, c3429auMo15810l.f18741b);
                this.f18666a.mo15811m();
            } else {
                i++;
                if (i < length) {
                    this.f18666a.mo15808j();
                }
            }
        }
        return c3429auMo15810l;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m15724a(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (Boolean) m15722a((byte) 2, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: a */
    public void m15725a(InterfaceC3409aa interfaceC3409aa, String str) throws C3415ag {
        m15727a(interfaceC3409aa, str.getBytes());
    }

    /* JADX INFO: renamed from: a */
    public void m15726a(InterfaceC3409aa interfaceC3409aa, String str, String str2) throws C3415ag {
        try {
            try {
                m15727a(interfaceC3409aa, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new C3415ag("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f18666a.mo15845B();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15727a(InterfaceC3409aa interfaceC3409aa, byte[] bArr) throws C3415ag {
        try {
            this.f18667b.m15869a(bArr);
            interfaceC3409aa.read(this.f18666a);
        } finally {
            this.f18667b.m15871e();
            this.f18666a.mo15845B();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15728a(InterfaceC3409aa interfaceC3409aa, byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        try {
            try {
                if (m15723j(bArr, interfaceC3416ah, interfaceC3416ahArr) != null) {
                    interfaceC3409aa.read(this.f18666a);
                }
            } catch (Exception e) {
                throw new C3415ag(e);
            }
        } finally {
            this.f18667b.m15871e();
            this.f18666a.mo15845B();
        }
    }

    /* JADX INFO: renamed from: b */
    public Byte m15729b(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (Byte) m15722a((byte) 3, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: c */
    public Double m15730c(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (Double) m15722a((byte) 4, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: d */
    public Short m15731d(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (Short) m15722a((byte) 6, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: e */
    public Integer m15732e(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (Integer) m15722a((byte) 8, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: f */
    public Long m15733f(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (Long) m15722a((byte) 10, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: g */
    public String m15734g(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (String) m15722a((byte) 11, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: h */
    public ByteBuffer m15735h(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        return (ByteBuffer) m15722a((byte) 100, bArr, interfaceC3416ah, interfaceC3416ahArr);
    }

    /* JADX INFO: renamed from: i */
    public Short m15736i(byte[] bArr, InterfaceC3416ah interfaceC3416ah, InterfaceC3416ah... interfaceC3416ahArr) throws C3415ag {
        Short shValueOf;
        try {
            try {
                if (m15723j(bArr, interfaceC3416ah, interfaceC3416ahArr) != null) {
                    this.f18666a.mo15808j();
                    shValueOf = Short.valueOf(this.f18666a.mo15810l().f18742c);
                } else {
                    shValueOf = null;
                }
                return shValueOf;
            } catch (Exception e) {
                throw new C3415ag(e);
            }
        } finally {
            this.f18667b.m15871e();
            this.f18666a.mo15845B();
        }
    }
}
