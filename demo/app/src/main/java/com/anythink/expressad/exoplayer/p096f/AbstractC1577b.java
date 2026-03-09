package com.anythink.expressad.exoplayer.p096f;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1492a;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.C1754n;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p093d.C1542k;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1537f;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p096f.C1579d;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1715ad;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.b */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public abstract class AbstractC1577b extends AbstractC1492a {

    /* JADX INFO: renamed from: A */
    private static final int f8413A = 1;

    /* JADX INFO: renamed from: B */
    private static final int f8414B = 2;

    /* JADX INFO: renamed from: C */
    private static final byte[] f8415C = C1717af.m8118g("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* JADX INFO: renamed from: D */
    private static final int f8416D = 32;

    /* JADX INFO: renamed from: n */
    public static final int f8417n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f8418o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f8419p = 3;

    /* JADX INFO: renamed from: r */
    private static final String f8420r = "MediaCodecRenderer";

    /* JADX INFO: renamed from: s */
    private static final long f8421s = 1000;

    /* JADX INFO: renamed from: t */
    private static final int f8422t = 0;

    /* JADX INFO: renamed from: u */
    private static final int f8423u = 1;

    /* JADX INFO: renamed from: v */
    private static final int f8424v = 2;

    /* JADX INFO: renamed from: w */
    private static final int f8425w = 0;

    /* JADX INFO: renamed from: x */
    private static final int f8426x = 1;

    /* JADX INFO: renamed from: y */
    private static final int f8427y = 2;

    /* JADX INFO: renamed from: z */
    private static final int f8428z = 0;

    /* JADX INFO: renamed from: E */
    private final InterfaceC1578c f8429E;

    /* JADX INFO: renamed from: F */
    @Nullable
    private final InterfaceC1538g<C1542k> f8430F;

    /* JADX INFO: renamed from: G */
    private final boolean f8431G;

    /* JADX INFO: renamed from: H */
    private final C1527e f8432H;

    /* JADX INFO: renamed from: I */
    private final C1527e f8433I;

    /* JADX INFO: renamed from: J */
    private final C1754n f8434J;

    /* JADX INFO: renamed from: K */
    private final List<Long> f8435K;

    /* JADX INFO: renamed from: L */
    private final MediaCodec.BufferInfo f8436L;

    /* JADX INFO: renamed from: M */
    private C1753m f8437M;

    /* JADX INFO: renamed from: N */
    private InterfaceC1537f<C1542k> f8438N;

    /* JADX INFO: renamed from: O */
    private InterfaceC1537f<C1542k> f8439O;

    /* JADX INFO: renamed from: P */
    private MediaCodec f8440P;

    /* JADX INFO: renamed from: Q */
    private C1576a f8441Q;

    /* JADX INFO: renamed from: R */
    private int f8442R;

    /* JADX INFO: renamed from: S */
    private boolean f8443S;

    /* JADX INFO: renamed from: T */
    private boolean f8444T;

    /* JADX INFO: renamed from: U */
    private boolean f8445U;

    /* JADX INFO: renamed from: V */
    private boolean f8446V;

    /* JADX INFO: renamed from: W */
    private boolean f8447W;

    /* JADX INFO: renamed from: X */
    private boolean f8448X;

    /* JADX INFO: renamed from: Y */
    private boolean f8449Y;

    /* JADX INFO: renamed from: Z */
    private boolean f8450Z;

    /* JADX INFO: renamed from: aa */
    private ByteBuffer[] f8451aa;

    /* JADX INFO: renamed from: ab */
    private ByteBuffer[] f8452ab;

    /* JADX INFO: renamed from: ac */
    private long f8453ac;

    /* JADX INFO: renamed from: ad */
    private int f8454ad;

    /* JADX INFO: renamed from: ae */
    private int f8455ae;

    /* JADX INFO: renamed from: af */
    private ByteBuffer f8456af;

    /* JADX INFO: renamed from: ag */
    private boolean f8457ag;

    /* JADX INFO: renamed from: ah */
    private boolean f8458ah;

    /* JADX INFO: renamed from: ai */
    private int f8459ai;

    /* JADX INFO: renamed from: aj */
    private int f8460aj;

    /* JADX INFO: renamed from: ak */
    private boolean f8461ak;

    /* JADX INFO: renamed from: al */
    private boolean f8462al;

    /* JADX INFO: renamed from: am */
    private boolean f8463am;

    /* JADX INFO: renamed from: an */
    private boolean f8464an;

    /* JADX INFO: renamed from: ao */
    private boolean f8465ao;

    /* JADX INFO: renamed from: ap */
    private boolean f8466ap;

    /* JADX INFO: renamed from: q */
    public C1526d f8467q;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.b$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.b$b */
    public static class b extends Exception {

        /* JADX INFO: renamed from: e */
        private static final int f8468e = -50000;

        /* JADX INFO: renamed from: f */
        private static final int f8469f = -49999;

        /* JADX INFO: renamed from: g */
        private static final int f8470g = -49998;

        /* JADX INFO: renamed from: a */
        public final String f8471a;

        /* JADX INFO: renamed from: b */
        public final boolean f8472b;

        /* JADX INFO: renamed from: c */
        public final String f8473c;

        /* JADX INFO: renamed from: d */
        public final String f8474d;

        public b(C1753m c1753m, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + c1753m, th);
            this.f8471a = c1753m.f9971h;
            this.f8472b = z;
            this.f8473c = null;
            this.f8474d = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        public b(C1753m c1753m, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + c1753m, th);
            this.f8471a = c1753m.f9971h;
            this.f8472b = z;
            this.f8473c = str;
            String diagnosticInfo = null;
            if (C1717af.f9627a >= 21 && (th instanceof MediaCodec.CodecException)) {
                diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            this.f8474d = diagnosticInfo;
        }

        /* JADX INFO: renamed from: a */
        private static String m7051a(int i) {
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        @TargetApi(21)
        /* JADX INFO: renamed from: a */
        private static String m7052a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.b$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.b$d */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.f.b$e */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public AbstractC1577b(int i, InterfaceC1578c interfaceC1578c, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, boolean z) {
        super(i);
        C1711a.m8012b(C1717af.f9627a >= 16);
        this.f8429E = (InterfaceC1578c) C1711a.m8005a(interfaceC1578c);
        this.f8430F = interfaceC1538g;
        this.f8431G = false;
        this.f8432H = new C1527e(0);
        this.f8433I = C1527e.m6658e();
        this.f8434J = new C1754n();
        this.f8435K = new ArrayList();
        this.f8436L = new MediaCodec.BufferInfo();
        this.f8459ai = 0;
        this.f8460aj = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m7019C() throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.AbstractC1577b.m7019C():boolean");
    }

    /* JADX INFO: renamed from: D */
    private void m7020D() {
        if (C1717af.f9627a < 21) {
            this.f8451aa = this.f8440P.getInputBuffers();
            this.f8452ab = this.f8440P.getOutputBuffers();
        }
    }

    /* JADX INFO: renamed from: E */
    private void m7021E() {
        if (C1717af.f9627a < 21) {
            this.f8451aa = null;
            this.f8452ab = null;
        }
    }

    /* JADX INFO: renamed from: F */
    private boolean m7022F() {
        return this.f8455ae >= 0;
    }

    /* JADX INFO: renamed from: G */
    private void m7023G() {
        this.f8454ad = -1;
        this.f8432H.f7879e = null;
    }

    /* JADX INFO: renamed from: H */
    private void m7024H() {
        this.f8455ae = -1;
        this.f8456af = null;
    }

    /* JADX INFO: renamed from: I */
    private static long m7025I() {
        return 0L;
    }

    /* JADX INFO: renamed from: J */
    private void m7026J() {
        MediaFormat outputFormat = this.f8440P.getOutputFormat();
        if (this.f8442R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f8450Z = true;
            return;
        }
        if (this.f8448X) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo6560a(this.f8440P, outputFormat);
    }

    /* JADX INFO: renamed from: K */
    private void m7027K() {
        if (C1717af.f9627a < 21) {
            this.f8452ab = this.f8440P.getOutputBuffers();
        }
    }

    /* JADX INFO: renamed from: L */
    private void m7028L() throws C1581g {
        if (this.f8460aj == 2) {
            mo7044A();
            m7048x();
        } else {
            this.f8464an = true;
            mo6570w();
        }
    }

    /* JADX INFO: renamed from: M */
    private static boolean m7029M() {
        if (!"Amazon".equals(C1717af.f9629c)) {
            return false;
        }
        String str = C1717af.f9630d;
        return "AFTM".equals(str) || "AFTB".equals(str);
    }

    /* JADX INFO: renamed from: a */
    private static MediaCodec.CryptoInfo m7030a(C1527e c1527e, int i) {
        MediaCodec.CryptoInfo cryptoInfoM6646a = c1527e.f7878d.m6646a();
        if (i == 0) {
            return cryptoInfoM6646a;
        }
        if (cryptoInfoM6646a.numBytesOfClearData == null) {
            cryptoInfoM6646a.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoM6646a.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return cryptoInfoM6646a;
    }

    /* JADX INFO: renamed from: a */
    private void m7031a(b bVar) throws C1581g {
        throw C1581g.m7080a(bVar, m6150s());
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7032a(String str) {
        int i = C1717af.f9627a;
        if (i < 18) {
            return true;
        }
        if (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i == 19 && C1717af.f9630d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7033a(String str, C1753m c1753m) {
        return C1717af.f9627a < 21 && c1753m.f9973j.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* JADX INFO: renamed from: b */
    private static int m7034b(String str) {
        int i = C1717af.f9627a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C1717af.f9630d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = C1717af.f9628b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    private ByteBuffer m7035b(int i) {
        return C1717af.f9627a >= 21 ? this.f8440P.getInputBuffer(i) : this.f8451aa[i];
    }

    /* JADX INFO: renamed from: b */
    private boolean m7036b(long j, long j2) throws C1581g {
        boolean zMo6564a;
        int iDequeueOutputBuffer;
        boolean z;
        if (!m7022F()) {
            if (this.f8447W && this.f8462al) {
                try {
                    iDequeueOutputBuffer = this.f8440P.dequeueOutputBuffer(this.f8436L, 0L);
                } catch (IllegalStateException unused) {
                    m7028L();
                    if (this.f8464an) {
                        mo7044A();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.f8440P.dequeueOutputBuffer(this.f8436L, 0L);
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.f8440P.getOutputFormat();
                    if (this.f8442R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f8450Z = true;
                    } else {
                        if (this.f8448X) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        mo6560a(this.f8440P, outputFormat);
                    }
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    if (C1717af.f9627a < 21) {
                        this.f8452ab = this.f8440P.getOutputBuffers();
                    }
                    return true;
                }
                if (this.f8445U && (this.f8463am || this.f8460aj == 2)) {
                    m7028L();
                }
                return false;
            }
            if (this.f8450Z) {
                this.f8450Z = false;
                this.f8440P.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f8436L;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m7028L();
                return false;
            }
            this.f8455ae = iDequeueOutputBuffer;
            ByteBuffer outputBuffer = C1717af.f9627a >= 21 ? this.f8440P.getOutputBuffer(iDequeueOutputBuffer) : this.f8452ab[iDequeueOutputBuffer];
            this.f8456af = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f8436L.offset);
                ByteBuffer byteBuffer = this.f8456af;
                MediaCodec.BufferInfo bufferInfo2 = this.f8436L;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j3 = this.f8436L.presentationTimeUs;
            int size = this.f8435K.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                if (this.f8435K.get(i).longValue() == j3) {
                    this.f8435K.remove(i);
                    z = true;
                    break;
                }
                i++;
            }
            this.f8457ag = z;
        }
        if (this.f8447W && this.f8462al) {
            try {
                MediaCodec mediaCodec = this.f8440P;
                ByteBuffer byteBuffer2 = this.f8456af;
                int i2 = this.f8455ae;
                MediaCodec.BufferInfo bufferInfo3 = this.f8436L;
                zMo6564a = mo6564a(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f8457ag);
            } catch (IllegalStateException unused2) {
                m7028L();
                if (this.f8464an) {
                    mo7044A();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec2 = this.f8440P;
            ByteBuffer byteBuffer3 = this.f8456af;
            int i3 = this.f8455ae;
            MediaCodec.BufferInfo bufferInfo4 = this.f8436L;
            zMo6564a = mo6564a(j, j2, mediaCodec2, byteBuffer3, i3, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f8457ag);
        }
        if (zMo6564a) {
            mo7047c(this.f8436L.presentationTimeUs);
            boolean z3 = (this.f8436L.flags & 4) != 0;
            m7024H();
            if (!z3) {
                return true;
            }
            m7028L();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7037b(C1576a c1576a) {
        String str = c1576a.f8406c;
        if (C1717af.f9627a > 17 || !("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str))) {
            return "Amazon".equals(C1717af.f9629c) && "AFTS".equals(C1717af.f9630d) && c1576a.f8411h;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m7038b(String str, C1753m c1753m) {
        return C1717af.f9627a <= 18 && c1753m.f9984u == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* JADX INFO: renamed from: b */
    private boolean m7039b(boolean z) throws C1581g {
        InterfaceC1537f<C1542k> interfaceC1537f = this.f8438N;
        if (interfaceC1537f == null || (!z && this.f8431G)) {
            return false;
        }
        int iMo6727e = interfaceC1537f.mo6727e();
        if (iMo6727e != 1) {
            return iMo6727e != 4;
        }
        throw C1581g.m7080a(this.f8438N.mo6728f(), m6150s());
    }

    /* JADX INFO: renamed from: c */
    private ByteBuffer m7040c(int i) {
        return C1717af.f9627a >= 21 ? this.f8440P.getOutputBuffer(i) : this.f8452ab[i];
    }

    /* JADX INFO: renamed from: c */
    private static boolean m7041c(String str) {
        int i = C1717af.f9627a;
        if (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i > 19 || !"hb2000".equals(C1717af.f9628b)) {
            return false;
        }
        return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
    }

    /* JADX INFO: renamed from: d */
    private boolean m7042d(long j) {
        int size = this.f8435K.size();
        for (int i = 0; i < size; i++) {
            if (this.f8435K.get(i).longValue() == j) {
                this.f8435K.remove(i);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m7043d(String str) {
        return C1717af.f9627a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* JADX INFO: renamed from: A */
    public void mo7044A() {
        this.f8453ac = C1500b.f7455b;
        m7023G();
        m7024H();
        this.f8465ao = false;
        this.f8457ag = false;
        this.f8435K.clear();
        if (C1717af.f9627a < 21) {
            this.f8451aa = null;
            this.f8452ab = null;
        }
        this.f8441Q = null;
        this.f8458ah = false;
        this.f8461ak = false;
        this.f8443S = false;
        this.f8444T = false;
        this.f8442R = 0;
        this.f8445U = false;
        this.f8446V = false;
        this.f8448X = false;
        this.f8449Y = false;
        this.f8450Z = false;
        this.f8462al = false;
        this.f8459ai = 0;
        this.f8460aj = 0;
        MediaCodec mediaCodec = this.f8440P;
        if (mediaCodec != null) {
            this.f8467q.f7867b++;
            try {
                mediaCodec.stop();
                try {
                    this.f8440P.release();
                    this.f8440P = null;
                    InterfaceC1537f<C1542k> interfaceC1537f = this.f8438N;
                    if (interfaceC1537f == null || this.f8439O == interfaceC1537f) {
                        return;
                    }
                    try {
                        this.f8430F.mo6761a(interfaceC1537f);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f8440P = null;
                    InterfaceC1537f<C1542k> interfaceC1537f2 = this.f8438N;
                    if (interfaceC1537f2 != null && this.f8439O != interfaceC1537f2) {
                        try {
                            this.f8430F.mo6761a(interfaceC1537f2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.f8440P.release();
                    this.f8440P = null;
                    InterfaceC1537f<C1542k> interfaceC1537f3 = this.f8438N;
                    if (interfaceC1537f3 != null && this.f8439O != interfaceC1537f3) {
                        try {
                            this.f8430F.mo6761a(interfaceC1537f3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.f8440P = null;
                    InterfaceC1537f<C1542k> interfaceC1537f4 = this.f8438N;
                    if (interfaceC1537f4 != null && this.f8439O != interfaceC1537f4) {
                        try {
                            this.f8430F.mo6761a(interfaceC1537f4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo7045B() throws C1581g {
        this.f8453ac = C1500b.f7455b;
        m7023G();
        m7024H();
        this.f8466ap = true;
        this.f8465ao = false;
        this.f8457ag = false;
        this.f8435K.clear();
        this.f8449Y = false;
        this.f8450Z = false;
        if (this.f8444T || ((this.f8446V && this.f8462al) || this.f8460aj != 0)) {
            mo7044A();
            m7048x();
        } else {
            this.f8440P.flush();
            this.f8461ak = false;
        }
        if (!this.f8458ah || this.f8437M == null) {
            return;
        }
        this.f8459ai = 1;
    }

    /* JADX INFO: renamed from: a */
    public int mo6556a(C1576a c1576a, C1753m c1753m, C1753m c1753m2) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6557a(InterfaceC1578c interfaceC1578c, InterfaceC1538g<C1542k> interfaceC1538g, C1753m c1753m);

    @Override // com.anythink.expressad.exoplayer.InterfaceC1769z
    /* JADX INFO: renamed from: a */
    public final int mo6600a(C1753m c1753m) throws C1581g {
        try {
            return mo6557a(this.f8429E, this.f8430F, c1753m);
        } catch (C1579d.b e2) {
            throw C1581g.m7080a(e2, m6150s());
        }
    }

    /* JADX INFO: renamed from: a */
    public C1576a mo6558a(InterfaceC1578c interfaceC1578c, C1753m c1753m, boolean z) {
        return interfaceC1578c.mo7054a(c1753m.f9971h, z);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: a */
    public final void mo6601a(long j, long j2) throws C1581g {
        if (this.f8464an) {
            mo6570w();
            return;
        }
        if (this.f8437M == null) {
            this.f8433I.mo6637a();
            int iM6123a = m6123a(this.f8434J, this.f8433I, true);
            if (iM6123a != -5) {
                if (iM6123a == -4) {
                    C1711a.m8012b(this.f8433I.m6641c());
                    this.f8463am = true;
                    m7028L();
                    return;
                }
                return;
            }
            mo6565b(this.f8434J.f9990a);
        }
        m7048x();
        if (this.f8440P != null) {
            C1715ad.m8040a("drainAndFeed");
            while (m7036b(j, j2)) {
            }
            while (m7019C()) {
            }
            C1715ad.m8039a();
            return;
        }
        this.f8467q.f7869d += m6133b(j);
        this.f8433I.mo6637a();
        int iM6123a2 = m6123a(this.f8434J, this.f8433I, false);
        if (iM6123a2 == -5) {
            mo6565b(this.f8434J.f9990a);
        } else if (iM6123a2 == -4) {
            C1711a.m8012b(this.f8433I.m6641c());
            this.f8463am = true;
            m7028L();
        }
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public void mo6127a(long j, boolean z) throws C1581g {
        this.f8463am = false;
        this.f8464an = false;
        if (this.f8440P != null) {
            mo7045B();
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo6560a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* JADX INFO: renamed from: a */
    public void mo6561a(C1527e c1527e) {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo6562a(C1576a c1576a, MediaCodec mediaCodec, C1753m c1753m, MediaCrypto mediaCrypto);

    /* JADX INFO: renamed from: a */
    public void mo6563a(String str, long j, long j2) {
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public void mo6129a(boolean z) {
        this.f8467q = new C1526d();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo6564a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* JADX INFO: renamed from: a */
    public boolean mo7046a(C1576a c1576a) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6565b(com.anythink.expressad.exoplayer.C1753m r6) throws com.anythink.expressad.exoplayer.C1581g {
        /*
            r5 = this;
            com.anythink.expressad.exoplayer.m r0 = r5.f8437M
            r5.f8437M = r6
            com.anythink.expressad.exoplayer.d.e r6 = r6.f9974k
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.anythink.expressad.exoplayer.d.e r2 = r0.f9974k
        Ld:
            boolean r6 = com.anythink.expressad.exoplayer.p107k.C1717af.m8085a(r6, r2)
            r2 = 1
            r6 = r6 ^ r2
            if (r6 == 0) goto L49
            com.anythink.expressad.exoplayer.m r6 = r5.f8437M
            com.anythink.expressad.exoplayer.d.e r6 = r6.f9974k
            if (r6 == 0) goto L47
            com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> r6 = r5.f8430F
            if (r6 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.anythink.expressad.exoplayer.m r3 = r5.f8437M
            com.anythink.expressad.exoplayer.d.e r3 = r3.f9974k
            com.anythink.expressad.exoplayer.d.f r6 = r6.mo6759a(r1, r3)
            r5.f8439O = r6
            com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.k> r1 = r5.f8438N
            if (r6 != r1) goto L49
            com.anythink.expressad.exoplayer.d.g<com.anythink.expressad.exoplayer.d.k> r1 = r5.f8430F
            r1.mo6761a(r6)
            goto L49
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.m6150s()
            com.anythink.expressad.exoplayer.g r6 = com.anythink.expressad.exoplayer.C1581g.m7080a(r6, r0)
            throw r6
        L47:
            r5.f8439O = r1
        L49:
            com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.k> r6 = r5.f8439O
            com.anythink.expressad.exoplayer.d.f<com.anythink.expressad.exoplayer.d.k> r1 = r5.f8438N
            r3 = 0
            if (r6 != r1) goto L87
            android.media.MediaCodec r6 = r5.f8440P
            if (r6 == 0) goto L87
            com.anythink.expressad.exoplayer.f.a r6 = r5.f8441Q
            com.anythink.expressad.exoplayer.m r1 = r5.f8437M
            int r6 = r5.mo6556a(r6, r0, r1)
            if (r6 == 0) goto L87
            if (r6 == r2) goto L86
            r1 = 3
            if (r6 != r1) goto L80
            r5.f8458ah = r2
            r5.f8459ai = r2
            int r6 = r5.f8442R
            r1 = 2
            if (r6 == r1) goto L7c
            if (r6 != r2) goto L7d
            com.anythink.expressad.exoplayer.m r6 = r5.f8437M
            int r1 = r6.f9976m
            int r4 = r0.f9976m
            if (r1 != r4) goto L7d
            int r6 = r6.f9977n
            int r0 = r0.f9977n
            if (r6 != r0) goto L7d
        L7c:
            r3 = 1
        L7d:
            r5.f8449Y = r3
            goto L86
        L80:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L86:
            r3 = 1
        L87:
            if (r3 != 0) goto L96
            boolean r6 = r5.f8461ak
            if (r6 == 0) goto L90
            r5.f8460aj = r2
            return
        L90:
            r5.mo7044A()
            r5.m7048x()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.AbstractC1577b.mo6565b(com.anythink.expressad.exoplayer.m):void");
    }

    /* JADX INFO: renamed from: c */
    public void mo7047c(long j) {
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a, com.anythink.expressad.exoplayer.InterfaceC1769z
    /* JADX INFO: renamed from: m */
    public final int mo6144m() {
        return 8;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: n */
    public void mo6145n() {
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: o */
    public void mo6146o() {
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: p */
    public void mo6147p() {
        this.f8437M = null;
        try {
            mo7044A();
            try {
                InterfaceC1537f<C1542k> interfaceC1537f = this.f8438N;
                if (interfaceC1537f != null) {
                    this.f8430F.mo6761a(interfaceC1537f);
                }
                try {
                    InterfaceC1537f<C1542k> interfaceC1537f2 = this.f8439O;
                    if (interfaceC1537f2 != null && interfaceC1537f2 != this.f8438N) {
                        this.f8430F.mo6761a(interfaceC1537f2);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    InterfaceC1537f<C1542k> interfaceC1537f3 = this.f8439O;
                    if (interfaceC1537f3 != null && interfaceC1537f3 != this.f8438N) {
                        this.f8430F.mo6761a(interfaceC1537f3);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f8438N != null) {
                    this.f8430F.mo6761a(this.f8438N);
                }
                try {
                    InterfaceC1537f<C1542k> interfaceC1537f4 = this.f8439O;
                    if (interfaceC1537f4 != null && interfaceC1537f4 != this.f8438N) {
                        this.f8430F.mo6761a(interfaceC1537f4);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    InterfaceC1537f<C1542k> interfaceC1537f5 = this.f8439O;
                    if (interfaceC1537f5 != null && interfaceC1537f5 != this.f8438N) {
                        this.f8430F.mo6761a(interfaceC1537f5);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: u */
    public boolean mo6568u() {
        if (this.f8437M == null || this.f8465ao) {
            return false;
        }
        if (m6151t() || m7022F()) {
            return true;
        }
        return this.f8453ac != C1500b.f7455b && SystemClock.elapsedRealtime() < this.f8453ac;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: v */
    public boolean mo6569v() {
        return this.f8464an;
    }

    /* JADX INFO: renamed from: w */
    public void mo6570w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7048x() throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p096f.AbstractC1577b.m7048x():void");
    }

    /* JADX INFO: renamed from: y */
    public final MediaCodec m7049y() {
        return this.f8440P;
    }

    /* JADX INFO: renamed from: z */
    public final C1576a m7050z() {
        return this.f8441Q;
    }
}
