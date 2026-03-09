package com.anythink.expressad.exoplayer.p091b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1492a;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1765v;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1507g;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1508h;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p093d.C1542k;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p096f.AbstractC1577b;
import com.anythink.expressad.exoplayer.p096f.C1576a;
import com.anythink.expressad.exoplayer.p096f.C1580e;
import com.anythink.expressad.exoplayer.p096f.InterfaceC1578c;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1731n;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.o */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class C1515o extends AbstractC1577b implements InterfaceC1731n {

    /* JADX INFO: renamed from: A */
    private int f7727A;

    /* JADX INFO: renamed from: B */
    private int f7728B;

    /* JADX INFO: renamed from: C */
    private long f7729C;

    /* JADX INFO: renamed from: D */
    private boolean f7730D;

    /* JADX INFO: renamed from: E */
    private boolean f7731E;

    /* JADX INFO: renamed from: r */
    private final Context f7732r;

    /* JADX INFO: renamed from: s */
    private final InterfaceC1507g.a f7733s;

    /* JADX INFO: renamed from: t */
    private final InterfaceC1508h f7734t;

    /* JADX INFO: renamed from: u */
    private int f7735u;

    /* JADX INFO: renamed from: v */
    private boolean f7736v;

    /* JADX INFO: renamed from: w */
    private boolean f7737w;

    /* JADX INFO: renamed from: x */
    private MediaFormat f7738x;

    /* JADX INFO: renamed from: y */
    private int f7739y;

    /* JADX INFO: renamed from: z */
    private int f7740z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.o$a */
    public final class a implements InterfaceC1508h.c {
        private a() {
        }

        public /* synthetic */ a(C1515o c1515o, byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.c
        /* JADX INFO: renamed from: a */
        public final void mo6459a() {
            C1515o.m6554b(C1515o.this);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.c
        /* JADX INFO: renamed from: a */
        public final void mo6460a(int i) {
            C1515o.this.f7733s.m6433a(i);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.c
        /* JADX INFO: renamed from: a */
        public final void mo6461a(int i, long j, long j2) {
            C1515o.this.f7733s.m6434a(i, j, j2);
        }
    }

    private C1515o(Context context, InterfaceC1578c interfaceC1578c) {
        this(context, interfaceC1578c, null);
    }

    private C1515o(Context context, InterfaceC1578c interfaceC1578c, @Nullable Handler handler, @Nullable InterfaceC1507g interfaceC1507g) {
        this(context, interfaceC1578c, null, handler, interfaceC1507g);
    }

    private C1515o(Context context, InterfaceC1578c interfaceC1578c, @Nullable InterfaceC1538g<C1542k> interfaceC1538g) {
        this(context, interfaceC1578c, interfaceC1538g, null, null);
    }

    private C1515o(Context context, InterfaceC1578c interfaceC1578c, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, @Nullable Handler handler, @Nullable InterfaceC1507g interfaceC1507g) {
        this(context, interfaceC1578c, interfaceC1538g, handler, interfaceC1507g, null, new InterfaceC1506f[0]);
    }

    public C1515o(Context context, InterfaceC1578c interfaceC1578c, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, @Nullable Handler handler, @Nullable InterfaceC1507g interfaceC1507g, @Nullable C1503c c1503c, InterfaceC1506f... interfaceC1506fArr) {
        this(context, interfaceC1578c, interfaceC1538g, handler, interfaceC1507g, new C1512l(c1503c, interfaceC1506fArr));
    }

    private C1515o(Context context, InterfaceC1578c interfaceC1578c, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, @Nullable Handler handler, @Nullable InterfaceC1507g interfaceC1507g, InterfaceC1508h interfaceC1508h) {
        super(1, interfaceC1578c, interfaceC1538g, false);
        this.f7732r = context.getApplicationContext();
        this.f7734t = interfaceC1508h;
        this.f7733s = new InterfaceC1507g.a(handler, interfaceC1507g);
        interfaceC1508h.mo6445a(new a(this, (byte) 0));
    }

    /* JADX INFO: renamed from: C */
    private static void m6544C() {
    }

    /* JADX INFO: renamed from: D */
    private static void m6545D() {
    }

    /* JADX INFO: renamed from: E */
    private static void m6546E() {
    }

    /* JADX INFO: renamed from: F */
    private void m6547F() {
        long jMo6439a = this.f7734t.mo6439a(mo6569v());
        if (jMo6439a != Long.MIN_VALUE) {
            if (!this.f7731E) {
                jMo6439a = Math.max(this.f7729C, jMo6439a);
            }
            this.f7729C = jMo6439a;
            this.f7731E = false;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m6548a(C1576a c1576a, C1753m c1753m) {
        PackageManager packageManager;
        int i = C1717af.f9627a;
        if (i < 24 && "OMX.google.raw.decoder".equals(c1576a.f8406c)) {
            boolean z = true;
            if (i == 23 && (packageManager = this.f7732r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return c1753m.f9972i;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    private static MediaFormat m6549a(C1753m c1753m, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c1753m.f9984u);
        mediaFormat.setInteger("sample-rate", c1753m.f9985v);
        C1580e.m7078a(mediaFormat, c1753m.f9973j);
        C1580e.m7075a(mediaFormat, "max-input-size", i);
        if (C1717af.f9627a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6551a(C1753m c1753m, C1753m c1753m2) {
        return c1753m.f9971h.equals(c1753m2.f9971h) && c1753m.f9984u == c1753m2.f9984u && c1753m.f9985v == c1753m2.f9985v && c1753m.f9987x == 0 && c1753m.f9988y == 0 && c1753m2.f9987x == 0 && c1753m2.f9988y == 0 && c1753m.m8416b(c1753m2);
    }

    /* JADX INFO: renamed from: a */
    private boolean m6552a(String str) {
        int iM8206e = C1732o.m8206e(str);
        return iM8206e != 0 && this.f7734t.mo6446a(iM8206e);
    }

    /* JADX INFO: renamed from: b */
    private int m6553b(C1576a c1576a, C1753m c1753m) {
        PackageManager packageManager;
        int i = C1717af.f9627a;
        if (i < 24 && "OMX.google.raw.decoder".equals(c1576a.f8406c)) {
            boolean z = true;
            if (i == 23 && (packageManager = this.f7732r.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback")) {
                z = false;
            }
            if (z) {
                return -1;
            }
        }
        return c1753m.f9972i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m6554b(C1515o c1515o) {
        c1515o.f7731E = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m6555b(String str) {
        if (C1717af.f9627a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(C1717af.f9629c)) {
            return false;
        }
        String str2 = C1717af.f9628b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final int mo6556a(C1576a c1576a, C1753m c1753m, C1753m c1753m2) {
        return 0;
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final int mo6557a(InterfaceC1578c interfaceC1578c, InterfaceC1538g<C1542k> interfaceC1538g, C1753m c1753m) {
        boolean z;
        int i;
        int i2;
        String str = c1753m.f9971h;
        boolean z3 = false;
        if (!C1732o.m8202a(str)) {
            return 0;
        }
        int i3 = C1717af.f9627a >= 21 ? 32 : 0;
        boolean zM6121a = AbstractC1492a.m6121a(interfaceC1538g, c1753m.f9974k);
        if (zM6121a && m6552a(str) && interfaceC1578c.mo7053a() != null) {
            return i3 | 8 | 4;
        }
        if ((C1732o.f9753w.equals(str) && !this.f7734t.mo6446a(c1753m.f9986w)) || !this.f7734t.mo6446a(2)) {
            return 1;
        }
        C1536e c1536e = c1753m.f9974k;
        if (c1536e != null) {
            z = false;
            for (int i4 = 0; i4 < c1536e.f7986b; i4++) {
                z |= c1536e.m6768a(i4).f7992d;
            }
        } else {
            z = false;
        }
        C1576a c1576aMo7054a = interfaceC1578c.mo7054a(str, z);
        if (c1576aMo7054a == null) {
            return (!z || interfaceC1578c.mo7054a(str, false) == null) ? 1 : 2;
        }
        if (!zM6121a) {
            return 2;
        }
        if (C1717af.f9627a < 21 || (((i = c1753m.f9985v) == -1 || c1576aMo7054a.m7014a(i)) && ((i2 = c1753m.f9984u) == -1 || c1576aMo7054a.m7017b(i2)))) {
            z3 = true;
        }
        return i3 | 8 | (z3 ? 4 : 3);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final C1576a mo6558a(InterfaceC1578c interfaceC1578c, C1753m c1753m, boolean z) {
        C1576a c1576aMo7053a;
        return (!m6552a(c1753m.f9971h) || (c1576aMo7053a = interfaceC1578c.mo7053a()) == null) ? super.mo6558a(interfaceC1578c, c1753m, z) : c1576aMo7053a;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: a */
    public final C1765v mo6559a(C1765v c1765v) {
        return this.f7734t.mo6440a(c1765v);
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a, com.anythink.expressad.exoplayer.C1767x.b
    /* JADX INFO: renamed from: a */
    public final void mo6125a(int i, Object obj) {
        if (i == 2) {
            this.f7734t.mo6442a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.mo6125a(i, obj);
        } else {
            this.f7734t.mo6444a((C1502b) obj);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6127a(long j, boolean z) throws C1581g {
        super.mo6127a(j, z);
        this.f7734t.mo6457i();
        this.f7729C = j;
        this.f7730D = true;
        this.f7731E = true;
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final void mo6560a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C1581g {
        int iM8206e;
        int[] iArr;
        int i;
        MediaFormat mediaFormat2 = this.f7738x;
        if (mediaFormat2 != null) {
            iM8206e = C1732o.m8206e(mediaFormat2.getString("mime"));
            mediaFormat = this.f7738x;
        } else {
            iM8206e = this.f7739y;
        }
        int i2 = iM8206e;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f7737w && integer == 6 && (i = this.f7740z) < 6) {
            iArr = new int[i];
            for (int i3 = 0; i3 < this.f7740z; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.f7734t.mo6443a(i2, integer, integer2, iArr, this.f7727A, this.f7728B);
        } catch (InterfaceC1508h.a e) {
            throw C1581g.m7080a(e, m6150s());
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final void mo6561a(C1527e c1527e) {
        if (!this.f7730D || c1527e.m6640b()) {
            return;
        }
        if (Math.abs(c1527e.f7880f - this.f7729C) > 500000) {
            this.f7729C = c1527e.f7880f;
        }
        this.f7730D = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6562a(com.anythink.expressad.exoplayer.p096f.C1576a r8, android.media.MediaCodec r9, com.anythink.expressad.exoplayer.C1753m r10, android.media.MediaCrypto r11) {
        /*
            r7 = this;
            r7.m6148q()
            int r0 = com.anythink.expressad.exoplayer.p107k.C1717af.f9627a
            r1 = 23
            r2 = 1
            r3 = 24
            r4 = 0
            if (r0 >= r3) goto L30
            java.lang.String r5 = r8.f8406c
            java.lang.String r6 = "OMX.google.raw.decoder"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L30
            if (r0 != r1) goto L2b
            android.content.Context r5 = r7.f7732r
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 == 0) goto L2b
            java.lang.String r6 = "android.software.leanback"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L2b
            r5 = 0
            goto L2c
        L2b:
            r5 = 1
        L2c:
            if (r5 == 0) goto L30
            r5 = -1
            goto L32
        L30:
            int r5 = r10.f9972i
        L32:
            r7.f7735u = r5
            java.lang.String r5 = r8.f8406c
            if (r0 >= r3) goto L65
            java.lang.String r3 = "OMX.SEC.aac.dec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L65
            java.lang.String r3 = com.anythink.expressad.exoplayer.p107k.C1717af.f9629c
            java.lang.String r5 = "samsung"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L65
            java.lang.String r3 = com.anythink.expressad.exoplayer.p107k.C1717af.f9628b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r3.startsWith(r5)
            if (r5 != 0) goto L66
            java.lang.String r5 = "herolte"
            boolean r5 = r3.startsWith(r5)
            if (r5 != 0) goto L66
            java.lang.String r5 = "heroqlte"
            boolean r3 = r3.startsWith(r5)
            if (r3 == 0) goto L65
            goto L66
        L65:
            r2 = 0
        L66:
            r7.f7737w = r2
            boolean r2 = r8.f8412i
            r7.f7736v = r2
            java.lang.String r8 = r8.f8407d
            if (r8 != 0) goto L72
            java.lang.String r8 = "audio/raw"
        L72:
            int r2 = r7.f7735u
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r5 = "mime"
            r3.setString(r5, r8)
            int r8 = r10.f9984u
            java.lang.String r6 = "channel-count"
            r3.setInteger(r6, r8)
            int r8 = r10.f9985v
            java.lang.String r6 = "sample-rate"
            r3.setInteger(r6, r8)
            java.util.List<byte[]> r8 = r10.f9973j
            com.anythink.expressad.exoplayer.p096f.C1580e.m7078a(r3, r8)
            java.lang.String r8 = "max-input-size"
            com.anythink.expressad.exoplayer.p096f.C1580e.m7075a(r3, r8, r2)
            if (r0 < r1) goto L9d
            java.lang.String r8 = "priority"
            r3.setInteger(r8, r4)
        L9d:
            r8 = 0
            r9.configure(r3, r8, r11, r4)
            boolean r9 = r7.f7736v
            if (r9 == 0) goto Lad
            r7.f7738x = r3
            java.lang.String r8 = r10.f9971h
            r3.setString(r5, r8)
            return
        Lad:
            r7.f7738x = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.C1515o.mo6562a(com.anythink.expressad.exoplayer.f.a, android.media.MediaCodec, com.anythink.expressad.exoplayer.m, android.media.MediaCrypto):void");
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final void mo6563a(String str, long j, long j2) {
        this.f7733s.m6437a(str, j, j2);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6129a(boolean z) {
        super.mo6129a(z);
        this.f7733s.m6435a(((AbstractC1577b) this).f8467q);
        int i = m6149r().f7327b;
        if (i != 0) {
            this.f7734t.mo6451c(i);
        } else {
            this.f7734t.mo6455g();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final boolean mo6564a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C1581g {
        if (this.f7736v && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            ((AbstractC1577b) this).f8467q.f7871f++;
            this.f7734t.mo6448b();
            return true;
        }
        try {
            if (!this.f7734t.mo6447a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            ((AbstractC1577b) this).f8467q.f7870e++;
            return true;
        } catch (InterfaceC1508h.b | InterfaceC1508h.d e) {
            throw C1581g.m7080a(e, m6150s());
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: b */
    public final void mo6565b(C1753m c1753m) throws C1581g {
        super.mo6565b(c1753m);
        this.f7733s.m6436a(c1753m);
        this.f7739y = C1732o.f9753w.equals(c1753m.f9971h) ? c1753m.f9986w : 2;
        this.f7740z = c1753m.f9984u;
        this.f7727A = c1753m.f9987x;
        this.f7728B = c1753m.f9988y;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a, com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: c */
    public final InterfaceC1731n mo6136c() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: d */
    public final long mo6566d() {
        if (mo6132a_() == 2) {
            m6547F();
        }
        return this.f7729C;
    }

    @Override // com.anythink.expressad.exoplayer.p107k.InterfaceC1731n
    /* JADX INFO: renamed from: e */
    public final C1765v mo6567e() {
        return this.f7734t.mo6454f();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: n */
    public final void mo6145n() {
        super.mo6145n();
        this.f7734t.mo6441a();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: o */
    public final void mo6146o() {
        m6547F();
        this.f7734t.mo6456h();
        super.mo6146o();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: p */
    public final void mo6147p() {
        try {
            this.f7734t.mo6458j();
            try {
                super.mo6147p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo6147p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: u */
    public final boolean mo6568u() {
        return this.f7734t.mo6453e() || super.mo6568u();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: v */
    public final boolean mo6569v() {
        return super.mo6569v() && this.f7734t.mo6452d();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: w */
    public final void mo6570w() throws C1581g {
        try {
            this.f7734t.mo6450c();
        } catch (InterfaceC1508h.d e) {
            throw C1581g.m7080a(e, m6150s());
        }
    }
}
