package com.umeng.commonsdk.proguard;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.z */
/* JADX INFO: loaded from: classes2.dex */
public class C3475z extends C3415ag {

    /* JADX INFO: renamed from: a */
    public static final int f19040a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f19041b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f19042c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f19043d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f19044e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f19045f = 5;

    /* JADX INFO: renamed from: g */
    public static final int f19046g = 6;

    /* JADX INFO: renamed from: h */
    public static final int f19047h = 7;

    /* JADX INFO: renamed from: j */
    private static final C3440be f19048j = new C3440be("TApplicationException");

    /* JADX INFO: renamed from: k */
    private static final C3429au f19049k = new C3429au("message", (byte) 11, 1);

    /* JADX INFO: renamed from: l */
    private static final C3429au f19050l = new C3429au("type", (byte) 8, 2);

    /* JADX INFO: renamed from: m */
    private static final long f19051m = 1;

    /* JADX INFO: renamed from: i */
    public int f19052i;

    public C3475z() {
        this.f19052i = 0;
    }

    public C3475z(int i) {
        this.f19052i = 0;
        this.f19052i = i;
    }

    public C3475z(int i, String str) {
        super(str);
        this.f19052i = 0;
        this.f19052i = i;
    }

    public C3475z(String str) {
        super(str);
        this.f19052i = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.umeng.commonsdk.proguard.C3475z m16140a(com.umeng.commonsdk.proguard.AbstractC3434az r5) throws com.umeng.commonsdk.proguard.C3415ag {
        /*
            r5.mo15808j()
            r0 = 0
            r1 = 0
        L5:
            com.umeng.commonsdk.proguard.au r2 = r5.mo15810l()
            byte r3 = r2.f18741b
            if (r3 != 0) goto L16
            r5.mo15809k()
            com.umeng.commonsdk.proguard.z r5 = new com.umeng.commonsdk.proguard.z
            r5.<init>(r1, r0)
            return r5
        L16:
            short r2 = r2.f18742c
            r4 = 1
            if (r2 == r4) goto L2b
            r4 = 2
            if (r2 == r4) goto L22
        L1e:
            com.umeng.commonsdk.proguard.C3438bc.m15856a(r5, r3)
            goto L33
        L22:
            r2 = 8
            if (r3 != r2) goto L1e
            int r1 = r5.mo15821w()
            goto L33
        L2b:
            r2 = 11
            if (r3 != r2) goto L1e
            java.lang.String r0 = r5.mo15824z()
        L33:
            r5.mo15811m()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.C3475z.m16140a(com.umeng.commonsdk.proguard.az):com.umeng.commonsdk.proguard.z");
    }

    /* JADX INFO: renamed from: a */
    public int m16141a() {
        return this.f19052i;
    }

    /* JADX INFO: renamed from: b */
    public void m16142b(AbstractC3434az abstractC3434az) throws C3415ag {
        abstractC3434az.mo15792a(f19048j);
        if (getMessage() != null) {
            abstractC3434az.mo15787a(f19049k);
            abstractC3434az.mo15793a(getMessage());
            abstractC3434az.mo15799c();
        }
        abstractC3434az.mo15787a(f19050l);
        abstractC3434az.mo15785a(this.f19052i);
        abstractC3434az.mo15799c();
        abstractC3434az.mo15801d();
        abstractC3434az.mo15798b();
    }
}
