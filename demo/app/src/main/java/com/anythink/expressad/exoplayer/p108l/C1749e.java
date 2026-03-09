package com.anythink.expressad.exoplayer.p108l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1492a;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1581g;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p092c.C1527e;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p093d.C1542k;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p096f.AbstractC1577b;
import com.anythink.expressad.exoplayer.p096f.C1576a;
import com.anythink.expressad.exoplayer.p096f.C1579d;
import com.anythink.expressad.exoplayer.p096f.C1580e;
import com.anythink.expressad.exoplayer.p096f.InterfaceC1578c;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1715ad;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1752h;
import java.nio.ByteBuffer;
import p285z2.C3937h4;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.e */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public class C1749e extends AbstractC1577b {

    /* JADX INFO: renamed from: A */
    private static boolean f9862A = false;

    /* JADX INFO: renamed from: s */
    private static final String f9863s = "MediaCodecVideoRenderer";

    /* JADX INFO: renamed from: t */
    private static final String f9864t = "crop-left";

    /* JADX INFO: renamed from: u */
    private static final String f9865u = "crop-right";

    /* JADX INFO: renamed from: v */
    private static final String f9866v = "crop-bottom";

    /* JADX INFO: renamed from: w */
    private static final String f9867w = "crop-top";

    /* JADX INFO: renamed from: x */
    private static final int[] f9868x = {1920, 1600, C3937h4.OooO00o, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: y */
    private static final int f9869y = 10;

    /* JADX INFO: renamed from: z */
    private static boolean f9870z;

    /* JADX INFO: renamed from: B */
    private final Context f9871B;

    /* JADX INFO: renamed from: C */
    private final C1750f f9872C;

    /* JADX INFO: renamed from: D */
    private final InterfaceC1752h.a f9873D;

    /* JADX INFO: renamed from: E */
    private final long f9874E;

    /* JADX INFO: renamed from: F */
    private final int f9875F;

    /* JADX INFO: renamed from: G */
    private final boolean f9876G;

    /* JADX INFO: renamed from: H */
    private final long[] f9877H;

    /* JADX INFO: renamed from: I */
    private final long[] f9878I;

    /* JADX INFO: renamed from: J */
    private a f9879J;

    /* JADX INFO: renamed from: K */
    private boolean f9880K;

    /* JADX INFO: renamed from: L */
    private Surface f9881L;

    /* JADX INFO: renamed from: M */
    private Surface f9882M;

    /* JADX INFO: renamed from: N */
    private int f9883N;

    /* JADX INFO: renamed from: O */
    private boolean f9884O;

    /* JADX INFO: renamed from: P */
    private long f9885P;

    /* JADX INFO: renamed from: Q */
    private long f9886Q;

    /* JADX INFO: renamed from: R */
    private long f9887R;

    /* JADX INFO: renamed from: S */
    private int f9888S;

    /* JADX INFO: renamed from: T */
    private int f9889T;

    /* JADX INFO: renamed from: U */
    private int f9890U;

    /* JADX INFO: renamed from: V */
    private long f9891V;

    /* JADX INFO: renamed from: W */
    private int f9892W;

    /* JADX INFO: renamed from: X */
    private float f9893X;

    /* JADX INFO: renamed from: Y */
    private int f9894Y;

    /* JADX INFO: renamed from: Z */
    private int f9895Z;

    /* JADX INFO: renamed from: aa */
    private int f9896aa;

    /* JADX INFO: renamed from: ab */
    private float f9897ab;

    /* JADX INFO: renamed from: ac */
    private int f9898ac;

    /* JADX INFO: renamed from: ad */
    private int f9899ad;

    /* JADX INFO: renamed from: ae */
    private int f9900ae;

    /* JADX INFO: renamed from: af */
    private float f9901af;

    /* JADX INFO: renamed from: ag */
    private boolean f9902ag;

    /* JADX INFO: renamed from: ah */
    private int f9903ah;

    /* JADX INFO: renamed from: ai */
    private long f9904ai;

    /* JADX INFO: renamed from: aj */
    private long f9905aj;

    /* JADX INFO: renamed from: ak */
    private int f9906ak;

    /* JADX INFO: renamed from: r */
    public b f9907r;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f9908a;

        /* JADX INFO: renamed from: b */
        public final int f9909b;

        /* JADX INFO: renamed from: c */
        public final int f9910c;

        public a(int i, int i2, int i3) {
            this.f9908a = i;
            this.f9909b = i2;
            this.f9910c = i3;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.l.e$b */
    @TargetApi(23)
    public final class b implements MediaCodec.OnFrameRenderedListener {
        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public /* synthetic */ b(C1749e c1749e, MediaCodec mediaCodec, byte b) {
            this(mediaCodec);
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j, long j2) {
            C1749e c1749e = C1749e.this;
            if (this != c1749e.f9907r) {
                return;
            }
            c1749e.m8362C();
        }
    }

    private C1749e(Context context, InterfaceC1578c interfaceC1578c) {
        this(context, interfaceC1578c, (byte) 0);
    }

    private C1749e(Context context, InterfaceC1578c interfaceC1578c, byte b2) {
        this(context, interfaceC1578c, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749e(Context context, InterfaceC1578c interfaceC1578c, long j, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, @Nullable Handler handler, @Nullable InterfaceC1752h interfaceC1752h, int i) {
        super(2, interfaceC1578c, interfaceC1538g, false);
        boolean z = false;
        this.f9874E = j;
        this.f9875F = i;
        Context applicationContext = context.getApplicationContext();
        this.f9871B = applicationContext;
        this.f9872C = new C1750f(applicationContext);
        this.f9873D = new InterfaceC1752h.a(handler, interfaceC1752h);
        if (C1717af.f9627a <= 22 && "foster".equals(C1717af.f9628b) && "NVIDIA".equals(C1717af.f9629c)) {
            z = true;
        }
        this.f9876G = z;
        this.f9877H = new long[10];
        this.f9878I = new long[10];
        this.f9905aj = C1500b.f7455b;
        this.f9904ai = C1500b.f7455b;
        this.f9886Q = C1500b.f7455b;
        this.f9894Y = -1;
        this.f9895Z = -1;
        this.f9897ab = -1.0f;
        this.f9893X = -1.0f;
        this.f9883N = 1;
        m8335G();
    }

    private C1749e(Context context, InterfaceC1578c interfaceC1578c, @Nullable Handler handler, @Nullable InterfaceC1752h interfaceC1752h) {
        this(context, interfaceC1578c, 0L, null, handler, interfaceC1752h, -1);
    }

    /* JADX INFO: renamed from: D */
    private void m8332D() {
        this.f9886Q = this.f9874E > 0 ? SystemClock.elapsedRealtime() + this.f9874E : C1500b.f7455b;
    }

    /* JADX INFO: renamed from: E */
    private void m8333E() {
        MediaCodec mediaCodecM7049y;
        byte b2 = 0;
        this.f9884O = false;
        if (C1717af.f9627a < 23 || !this.f9902ag || (mediaCodecM7049y = m7049y()) == null) {
            return;
        }
        this.f9907r = new b(this, mediaCodecM7049y, b2);
    }

    /* JADX INFO: renamed from: F */
    private void m8334F() {
        if (this.f9884O) {
            this.f9873D.m8382a(this.f9881L);
        }
    }

    /* JADX INFO: renamed from: G */
    private void m8335G() {
        this.f9898ac = -1;
        this.f9899ad = -1;
        this.f9901af = -1.0f;
        this.f9900ae = -1;
    }

    /* JADX INFO: renamed from: H */
    private void m8336H() {
        int i = this.f9894Y;
        if (i == -1 && this.f9895Z == -1) {
            return;
        }
        if (this.f9898ac == i && this.f9899ad == this.f9895Z && this.f9900ae == this.f9896aa && this.f9901af == this.f9897ab) {
            return;
        }
        this.f9873D.m8380a(i, this.f9895Z, this.f9896aa, this.f9897ab);
        this.f9898ac = this.f9894Y;
        this.f9899ad = this.f9895Z;
        this.f9900ae = this.f9896aa;
        this.f9901af = this.f9897ab;
    }

    /* JADX INFO: renamed from: I */
    private void m8337I() {
        int i = this.f9898ac;
        if (i == -1 && this.f9899ad == -1) {
            return;
        }
        this.f9873D.m8380a(i, this.f9899ad, this.f9900ae, this.f9901af);
    }

    /* JADX INFO: renamed from: J */
    private void m8338J() {
        if (this.f9888S > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f9873D.m8381a(this.f9888S, jElapsedRealtime - this.f9887R);
            this.f9888S = 0;
            this.f9887R = jElapsedRealtime;
        }
    }

    /* JADX INFO: renamed from: K */
    private static boolean m8339K() {
        return C1717af.f9627a <= 22 && "foster".equals(C1717af.f9628b) && "NVIDIA".equals(C1717af.f9629c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m8340a(com.anythink.expressad.exoplayer.p096f.C1576a r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p108l.C1749e.m8340a(com.anythink.expressad.exoplayer.f.a, java.lang.String, int, int):int");
    }

    /* JADX INFO: renamed from: a */
    private static Point m8341a(C1576a c1576a, C1753m c1753m) {
        int i = c1753m.f9977n;
        int i2 = c1753m.f9976m;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f9868x) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (C1717af.f9627a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointM7013a = c1576a.m7013a(i6, i4);
                if (c1576a.m7015a(pointM7013a.x, pointM7013a.y, c1753m.f9978o)) {
                    return pointM7013a;
                }
            } else {
                int iM8049a = C1717af.m8049a(i4, 16) * 16;
                int iM8049a2 = C1717af.m8049a(i5, 16) * 16;
                if (iM8049a * iM8049a2 <= C1579d.m7063b()) {
                    int i7 = z ? iM8049a2 : iM8049a;
                    if (!z) {
                        iM8049a = iM8049a2;
                    }
                    return new Point(i7, iM8049a);
                }
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    private static MediaFormat m8342a(C1753m c1753m, a aVar, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c1753m.f9971h);
        mediaFormat.setInteger("width", c1753m.f9976m);
        mediaFormat.setInteger("height", c1753m.f9977n);
        C1580e.m7078a(mediaFormat, c1753m.f9973j);
        float f = c1753m.f9978o;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        C1580e.m7075a(mediaFormat, "rotation-degrees", c1753m.f9979p);
        C1746b c1746b = c1753m.f9983t;
        if (c1746b != null) {
            C1580e.m7075a(mediaFormat, "color-transfer", c1746b.f9842c);
            C1580e.m7075a(mediaFormat, "color-standard", c1746b.f9840a);
            C1580e.m7075a(mediaFormat, "color-range", c1746b.f9841b);
            byte[] bArr = c1746b.f9843d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar.f9908a);
        mediaFormat.setInteger("max-height", aVar.f9909b);
        C1580e.m7075a(mediaFormat, "max-input-size", aVar.f9910c);
        if (C1717af.f9627a >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: a */
    private static a m8343a(C1576a c1576a, C1753m c1753m, C1753m[] c1753mArr) {
        int iMax = c1753m.f9976m;
        int iMax2 = c1753m.f9977n;
        int iM8351b = m8351b(c1576a, c1753m);
        if (c1753mArr.length == 1) {
            return new a(iMax, iMax2, iM8351b);
        }
        boolean z = false;
        for (C1753m c1753m2 : c1753mArr) {
            if (m8350a(c1576a.f8409f, c1753m, c1753m2)) {
                int i = c1753m2.f9976m;
                z |= i == -1 || c1753m2.f9977n == -1;
                iMax = Math.max(iMax, i);
                iMax2 = Math.max(iMax2, c1753m2.f9977n);
                iM8351b = Math.max(iM8351b, m8351b(c1576a, c1753m2));
            }
        }
        if (z) {
            Log.w(f9863s, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointM8341a = m8341a(c1576a, c1753m);
            if (pointM8341a != null) {
                iMax = Math.max(iMax, pointM8341a.x);
                iMax2 = Math.max(iMax2, pointM8341a.y);
                iM8351b = Math.max(iM8351b, m8340a(c1576a, c1753m.f9971h, iMax, iMax2));
                Log.w(f9863s, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new a(iMax, iMax2, iM8351b);
    }

    /* JADX INFO: renamed from: a */
    private void m8344a(MediaCodec mediaCodec, int i) {
        C1715ad.m8040a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C1715ad.m8039a();
        ((AbstractC1577b) this).f8467q.f7871f++;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private void m8345a(MediaCodec mediaCodec, int i, long j) {
        m8336H();
        C1715ad.m8040a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C1715ad.m8039a();
        this.f9891V = SystemClock.elapsedRealtime() * 1000;
        ((AbstractC1577b) this).f8467q.f7870e++;
        this.f9889T = 0;
        m8362C();
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: a */
    private static void m8346a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private static void m8347a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* JADX INFO: renamed from: a */
    private void m8348a(Surface surface) throws C1581g {
        if (surface == null) {
            Surface surface2 = this.f9882M;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C1576a c1576aM7050z = m7050z();
                if (c1576aM7050z != null && m8355b(c1576aM7050z)) {
                    surface = C1747c.m8323a(this.f9871B, c1576aM7050z.f8411h);
                    this.f9882M = surface;
                }
            }
        }
        if (this.f9881L == surface) {
            if (surface == null || surface == this.f9882M) {
                return;
            }
            m8337I();
            if (this.f9884O) {
                this.f9873D.m8382a(this.f9881L);
                return;
            }
            return;
        }
        this.f9881L = surface;
        int iMo6132a_ = mo6132a_();
        if (iMo6132a_ == 1 || iMo6132a_ == 2) {
            MediaCodec mediaCodecM7049y = m7049y();
            if (C1717af.f9627a < 23 || mediaCodecM7049y == null || surface == null || this.f9880K) {
                mo7044A();
                m7048x();
            } else {
                mediaCodecM7049y.setOutputSurface(surface);
            }
        }
        if (surface == null || surface == this.f9882M) {
            m8335G();
            m8333E();
            return;
        }
        m8337I();
        m8333E();
        if (iMo6132a_ == 2) {
            m8332D();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:368:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05cb A[Catch: all -> 0x05d3, TryCatch #0 {, blocks: (B:9:0x0014, B:11:0x0018, B:12:0x0020, B:369:0x059b, B:372:0x05a1, B:388:0x05cd, B:387:0x05cb, B:377:0x05b2, B:380:0x05bc, B:371:0x059f, B:14:0x0025, B:17:0x0031, B:20:0x003d, B:23:0x0049, B:26:0x0055, B:29:0x0061, B:32:0x006d, B:35:0x0079, B:38:0x0085, B:41:0x0091, B:44:0x009d, B:47:0x00a9, B:50:0x00b5, B:53:0x00bf, B:56:0x00cb, B:59:0x00d7, B:62:0x00e3, B:65:0x00ef, B:68:0x00fb, B:71:0x0106, B:74:0x0112, B:77:0x011e, B:80:0x012a, B:83:0x0136, B:86:0x0142, B:89:0x014e, B:92:0x015a, B:95:0x0166, B:98:0x0172, B:101:0x017e, B:104:0x018a, B:107:0x0196, B:110:0x01a2, B:113:0x01ae, B:116:0x01ba, B:119:0x01c5, B:122:0x01d1, B:125:0x01dd, B:128:0x01e9, B:131:0x01f5, B:134:0x0201, B:137:0x020d, B:140:0x0219, B:143:0x0225, B:146:0x0231, B:149:0x023d, B:152:0x0249, B:155:0x0255, B:158:0x0261, B:161:0x026d, B:164:0x0278, B:167:0x0284, B:170:0x0290, B:173:0x029c, B:176:0x02a8, B:179:0x02b4, B:182:0x02c0, B:185:0x02cc, B:188:0x02d8, B:191:0x02e3, B:194:0x02ee, B:197:0x02f9, B:200:0x0305, B:203:0x0311, B:206:0x031d, B:209:0x0329, B:212:0x0335, B:215:0x0341, B:218:0x034d, B:221:0x0359, B:224:0x0365, B:227:0x0371, B:230:0x037d, B:233:0x0389, B:236:0x0395, B:239:0x03a1, B:242:0x03ad, B:245:0x03b9, B:248:0x03c5, B:251:0x03d1, B:254:0x03dd, B:257:0x03e9, B:260:0x03f5, B:263:0x0401, B:266:0x040d, B:269:0x0419, B:272:0x0425, B:275:0x0431, B:278:0x043d, B:281:0x0449, B:284:0x0454, B:287:0x0460, B:290:0x046c, B:293:0x0478, B:296:0x0484, B:299:0x048f, B:302:0x049b, B:305:0x04a7, B:308:0x04b3, B:311:0x04bf, B:314:0x04cb, B:317:0x04d7, B:320:0x04e3, B:323:0x04ef, B:326:0x04fb, B:329:0x0507, B:332:0x0513, B:335:0x051f, B:338:0x052b, B:341:0x0537, B:344:0x0542, B:347:0x054d, B:350:0x0558, B:353:0x0563, B:356:0x056e, B:359:0x0579, B:362:0x0584, B:365:0x058f, B:389:0x05cf), top: B:396:0x0014 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m8349a(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 2210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p108l.C1749e.m8349a(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: a */
    private static boolean m8350a(boolean z, C1753m c1753m, C1753m c1753m2) {
        if (c1753m.f9971h.equals(c1753m2.f9971h) && c1753m.f9979p == c1753m2.f9979p) {
            return (z || (c1753m.f9976m == c1753m2.f9976m && c1753m.f9977n == c1753m2.f9977n)) && C1717af.m8085a(c1753m.f9983t, c1753m2.f9983t);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static int m8351b(C1576a c1576a, C1753m c1753m) {
        if (c1753m.f9972i == -1) {
            return m8340a(c1576a, c1753m.f9971h, c1753m.f9976m, c1753m.f9977n);
        }
        int size = c1753m.f9973j.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += c1753m.f9973j.get(i).length;
        }
        return c1753m.f9972i + length;
    }

    /* JADX INFO: renamed from: b */
    private void m8352b(int i) {
        C1526d c1526d = ((AbstractC1577b) this).f8467q;
        c1526d.f7872g += i;
        this.f9888S += i;
        int i2 = this.f9889T + i;
        this.f9889T = i2;
        c1526d.f7873h = Math.max(i2, c1526d.f7873h);
        if (this.f9888S >= this.f9875F) {
            m8338J();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m8353b(MediaCodec mediaCodec, int i) {
        C1715ad.m8040a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C1715ad.m8039a();
        m8352b(1);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m8354b(long j, long j2) {
        return m8360g(j) && j2 > 100000;
    }

    /* JADX INFO: renamed from: b */
    private boolean m8355b(C1576a c1576a) {
        if (C1717af.f9627a < 23 || this.f9902ag || m8349a(c1576a.f8406c)) {
            return false;
        }
        return !c1576a.f8411h || C1747c.m8325a(this.f9871B);
    }

    /* JADX INFO: renamed from: c */
    private void m8356c(MediaCodec mediaCodec, int i) {
        m8336H();
        C1715ad.m8040a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C1715ad.m8039a();
        this.f9891V = SystemClock.elapsedRealtime() * 1000;
        ((AbstractC1577b) this).f8467q.f7870e++;
        this.f9889T = 0;
        m8362C();
    }

    /* JADX INFO: renamed from: d */
    private static boolean m8357d(long j) {
        return m8360g(j);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m8358e(long j) {
        return j < -500000;
    }

    /* JADX INFO: renamed from: f */
    private boolean m8359f(long j) throws C1581g {
        int iM6133b = m6133b(j);
        if (iM6133b == 0) {
            return false;
        }
        ((AbstractC1577b) this).f8467q.f7874i++;
        m8352b(this.f9890U + iM6133b);
        mo7045B();
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m8360g(long j) {
        return j < -30000;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m8361h(long j) {
        return j < -500000;
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    @CallSuper
    /* JADX INFO: renamed from: A */
    public final void mo7044A() {
        try {
            super.mo7044A();
            this.f9890U = 0;
            Surface surface = this.f9882M;
            if (surface != null) {
                if (this.f9881L == surface) {
                    this.f9881L = null;
                }
                surface.release();
                this.f9882M = null;
            }
        } catch (Throwable th) {
            this.f9890U = 0;
            if (this.f9882M != null) {
                Surface surface2 = this.f9881L;
                Surface surface3 = this.f9882M;
                if (surface2 == surface3) {
                    this.f9881L = null;
                }
                surface3.release();
                this.f9882M = null;
            }
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    @CallSuper
    /* JADX INFO: renamed from: B */
    public final void mo7045B() throws C1581g {
        super.mo7045B();
        this.f9890U = 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m8362C() {
        if (this.f9884O) {
            return;
        }
        this.f9884O = true;
        this.f9873D.m8382a(this.f9881L);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final int mo6556a(C1576a c1576a, C1753m c1753m, C1753m c1753m2) {
        if (!m8350a(c1576a.f8409f, c1753m, c1753m2)) {
            return 0;
        }
        int i = c1753m2.f9976m;
        a aVar = this.f9879J;
        if (i > aVar.f9908a || c1753m2.f9977n > aVar.f9909b || m8351b(c1576a, c1753m2) > this.f9879J.f9910c) {
            return 0;
        }
        return c1753m.m8416b(c1753m2) ? 1 : 3;
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final int mo6557a(InterfaceC1578c interfaceC1578c, InterfaceC1538g<C1542k> interfaceC1538g, C1753m c1753m) {
        boolean z;
        int i;
        int i2;
        String str = c1753m.f9971h;
        if (!C1732o.m8203b(str)) {
            return 0;
        }
        C1536e c1536e = c1753m.f9974k;
        if (c1536e != null) {
            z = false;
            for (int i3 = 0; i3 < c1536e.f7986b; i3++) {
                z |= c1536e.m6768a(i3).f7992d;
            }
        } else {
            z = false;
        }
        C1576a c1576aMo7054a = interfaceC1578c.mo7054a(str, z);
        if (c1576aMo7054a == null) {
            return (!z || interfaceC1578c.mo7054a(str, false) == null) ? 1 : 2;
        }
        if (!AbstractC1492a.m6121a(interfaceC1538g, c1536e)) {
            return 2;
        }
        boolean zM7018b = c1576aMo7054a.m7018b(c1753m.f9968e);
        if (zM7018b && (i = c1753m.f9976m) > 0 && (i2 = c1753m.f9977n) > 0) {
            if (C1717af.f9627a >= 21) {
                zM7018b = c1576aMo7054a.m7015a(i, i2, c1753m.f9978o);
            } else {
                boolean z3 = i * i2 <= C1579d.m7063b();
                if (!z3) {
                    Log.d(f9863s, "FalseCheck [legacyFrameSize, " + c1753m.f9976m + "x" + c1753m.f9977n + "] [" + C1717af.f9631e + "]");
                }
                zM7018b = z3;
            }
        }
        return (zM7018b ? 4 : 3) | (c1576aMo7054a.f8409f ? 16 : 8) | (c1576aMo7054a.f8410g ? 32 : 0);
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a, com.anythink.expressad.exoplayer.C1767x.b
    /* JADX INFO: renamed from: a */
    public final void mo6125a(int i, Object obj) throws C1581g {
        if (i != 1) {
            if (i != 4) {
                super.mo6125a(i, obj);
                return;
            }
            this.f9883N = ((Integer) obj).intValue();
            MediaCodec mediaCodecM7049y = m7049y();
            if (mediaCodecM7049y != null) {
                mediaCodecM7049y.setVideoScalingMode(this.f9883N);
                return;
            }
            return;
        }
        Surface surfaceM8323a = (Surface) obj;
        if (surfaceM8323a == null) {
            Surface surface = this.f9882M;
            if (surface != null) {
                surfaceM8323a = surface;
            } else {
                C1576a c1576aM7050z = m7050z();
                if (c1576aM7050z != null && m8355b(c1576aM7050z)) {
                    surfaceM8323a = C1747c.m8323a(this.f9871B, c1576aM7050z.f8411h);
                    this.f9882M = surfaceM8323a;
                }
            }
        }
        if (this.f9881L == surfaceM8323a) {
            if (surfaceM8323a == null || surfaceM8323a == this.f9882M) {
                return;
            }
            m8337I();
            if (this.f9884O) {
                this.f9873D.m8382a(this.f9881L);
                return;
            }
            return;
        }
        this.f9881L = surfaceM8323a;
        int iMo6132a_ = mo6132a_();
        if (iMo6132a_ == 1 || iMo6132a_ == 2) {
            MediaCodec mediaCodecM7049y2 = m7049y();
            if (C1717af.f9627a < 23 || mediaCodecM7049y2 == null || surfaceM8323a == null || this.f9880K) {
                mo7044A();
                m7048x();
            } else {
                mediaCodecM7049y2.setOutputSurface(surfaceM8323a);
            }
        }
        if (surfaceM8323a == null || surfaceM8323a == this.f9882M) {
            m8335G();
            m8333E();
            return;
        }
        m8337I();
        m8333E();
        if (iMo6132a_ == 2) {
            m8332D();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6127a(long j, boolean z) throws C1581g {
        super.mo6127a(j, z);
        m8333E();
        this.f9885P = C1500b.f7455b;
        this.f9889T = 0;
        this.f9904ai = C1500b.f7455b;
        int i = this.f9906ak;
        if (i != 0) {
            this.f9905aj = this.f9877H[i - 1];
            this.f9906ak = 0;
        }
        if (z) {
            m8332D();
        } else {
            this.f9886Q = C1500b.f7455b;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final void mo6560a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey(f9865u) && mediaFormat.containsKey(f9864t) && mediaFormat.containsKey(f9866v) && mediaFormat.containsKey(f9867w);
        this.f9894Y = z ? (mediaFormat.getInteger(f9865u) - mediaFormat.getInteger(f9864t)) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger(f9866v) - mediaFormat.getInteger(f9867w)) + 1 : mediaFormat.getInteger("height");
        this.f9895Z = integer;
        float f = this.f9893X;
        this.f9897ab = f;
        if (C1717af.f9627a >= 21) {
            int i = this.f9892W;
            if (i == 90 || i == 270) {
                int i2 = this.f9894Y;
                this.f9894Y = integer;
                this.f9895Z = i2;
                this.f9897ab = 1.0f / f;
            }
        } else {
            this.f9896aa = this.f9892W;
        }
        mediaCodec.setVideoScalingMode(this.f9883N);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    @CallSuper
    /* JADX INFO: renamed from: a */
    public final void mo6561a(C1527e c1527e) {
        this.f9890U++;
        this.f9904ai = Math.max(c1527e.f7880f, this.f9904ai);
        if (C1717af.f9627a >= 23 || !this.f9902ag) {
            return;
        }
        m8362C();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final void mo6562a(C1576a c1576a, MediaCodec mediaCodec, C1753m c1753m, MediaCrypto mediaCrypto) {
        a aVar;
        C1753m[] c1753mArrM6148q = m6148q();
        int iMax = c1753m.f9976m;
        int iMax2 = c1753m.f9977n;
        int iM8351b = m8351b(c1576a, c1753m);
        byte b2 = 0;
        if (c1753mArrM6148q.length == 1) {
            aVar = new a(iMax, iMax2, iM8351b);
        } else {
            boolean z = false;
            for (C1753m c1753m2 : c1753mArrM6148q) {
                if (m8350a(c1576a.f8409f, c1753m, c1753m2)) {
                    int i = c1753m2.f9976m;
                    z |= i == -1 || c1753m2.f9977n == -1;
                    iMax = Math.max(iMax, i);
                    iMax2 = Math.max(iMax2, c1753m2.f9977n);
                    iM8351b = Math.max(iM8351b, m8351b(c1576a, c1753m2));
                }
            }
            if (z) {
                Log.w(f9863s, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                Point pointM8341a = m8341a(c1576a, c1753m);
                if (pointM8341a != null) {
                    iMax = Math.max(iMax, pointM8341a.x);
                    iMax2 = Math.max(iMax2, pointM8341a.y);
                    iM8351b = Math.max(iM8351b, m8340a(c1576a, c1753m.f9971h, iMax, iMax2));
                    Log.w(f9863s, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            aVar = new a(iMax, iMax2, iM8351b);
        }
        this.f9879J = aVar;
        boolean z3 = this.f9876G;
        int i2 = this.f9903ah;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c1753m.f9971h);
        mediaFormat.setInteger("width", c1753m.f9976m);
        mediaFormat.setInteger("height", c1753m.f9977n);
        C1580e.m7078a(mediaFormat, c1753m.f9973j);
        float f = c1753m.f9978o;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        C1580e.m7075a(mediaFormat, "rotation-degrees", c1753m.f9979p);
        C1746b c1746b = c1753m.f9983t;
        if (c1746b != null) {
            C1580e.m7075a(mediaFormat, "color-transfer", c1746b.f9842c);
            C1580e.m7075a(mediaFormat, "color-standard", c1746b.f9840a);
            C1580e.m7075a(mediaFormat, "color-range", c1746b.f9841b);
            byte[] bArr = c1746b.f9843d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        mediaFormat.setInteger("max-width", aVar.f9908a);
        mediaFormat.setInteger("max-height", aVar.f9909b);
        C1580e.m7075a(mediaFormat, "max-input-size", aVar.f9910c);
        int i3 = C1717af.f9627a;
        if (i3 >= 23) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z3) {
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i2);
        }
        if (this.f9881L == null) {
            C1711a.m8012b(m8355b(c1576a));
            if (this.f9882M == null) {
                this.f9882M = C1747c.m8323a(this.f9871B, c1576a.f8411h);
            }
            this.f9881L = this.f9882M;
        }
        mediaCodec.configure(mediaFormat, this.f9881L, mediaCrypto, 0);
        if (i3 < 23 || !this.f9902ag) {
            return;
        }
        this.f9907r = new b(this, mediaCodec, b2);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final void mo6563a(String str, long j, long j2) {
        this.f9873D.m8385a(str, j, j2);
        this.f9880K = m8349a(str);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6129a(boolean z) {
        super.mo6129a(z);
        int i = m6149r().f7327b;
        this.f9903ah = i;
        this.f9902ag = i != 0;
        this.f9873D.m8383a(((AbstractC1577b) this).f8467q);
        this.f9872C.m8369a();
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: a */
    public final void mo6130a(C1753m[] c1753mArr, long j) {
        if (this.f9905aj == C1500b.f7455b) {
            this.f9905aj = j;
        } else {
            int i = this.f9906ak;
            if (i == this.f9877H.length) {
                Log.w(f9863s, "Too many stream changes, so dropping offset: " + this.f9877H[this.f9906ak - 1]);
            } else {
                this.f9906ak = i + 1;
            }
            long[] jArr = this.f9877H;
            int i2 = this.f9906ak;
            jArr[i2 - 1] = j;
            this.f9878I[i2 - 1] = this.f9904ai;
        }
        super.mo6130a(c1753mArr, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if ((m8360g(r8) && r10 - r19.f9891V > 100000) != false) goto L72;
     */
    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo6564a(long r20, long r22, android.media.MediaCodec r24, java.nio.ByteBuffer r25, int r26, int r27, long r28, boolean r30) throws com.anythink.expressad.exoplayer.C1581g {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p108l.C1749e.mo6564a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: a */
    public final boolean mo7046a(C1576a c1576a) {
        return this.f9881L != null || m8355b(c1576a);
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    /* JADX INFO: renamed from: b */
    public final void mo6565b(C1753m c1753m) throws C1581g {
        super.mo6565b(c1753m);
        this.f9873D.m8384a(c1753m);
        this.f9893X = c1753m.f9980q;
        this.f9892W = c1753m.f9979p;
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b
    @CallSuper
    /* JADX INFO: renamed from: c */
    public final void mo7047c(long j) {
        this.f9890U--;
        while (true) {
            int i = this.f9906ak;
            if (i == 0 || j < this.f9878I[0]) {
                return;
            }
            long[] jArr = this.f9877H;
            this.f9905aj = jArr[0];
            int i2 = i - 1;
            this.f9906ak = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.f9878I;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f9906ak);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: n */
    public final void mo6145n() {
        super.mo6145n();
        this.f9888S = 0;
        this.f9887R = SystemClock.elapsedRealtime();
        this.f9891V = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: o */
    public final void mo6146o() {
        this.f9886Q = C1500b.f7455b;
        m8338J();
        super.mo6146o();
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.AbstractC1492a
    /* JADX INFO: renamed from: p */
    public final void mo6147p() {
        this.f9894Y = -1;
        this.f9895Z = -1;
        this.f9897ab = -1.0f;
        this.f9893X = -1.0f;
        this.f9905aj = C1500b.f7455b;
        this.f9904ai = C1500b.f7455b;
        this.f9906ak = 0;
        m8335G();
        m8333E();
        this.f9872C.m8370b();
        this.f9907r = null;
        this.f9902ag = false;
        try {
            super.mo6147p();
        } finally {
            this.f9873D.m8386b(((AbstractC1577b) this).f8467q);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p096f.AbstractC1577b, com.anythink.expressad.exoplayer.InterfaceC1768y
    /* JADX INFO: renamed from: u */
    public final boolean mo6568u() {
        Surface surface;
        if (super.mo6568u() && (this.f9884O || (((surface = this.f9882M) != null && this.f9881L == surface) || m7049y() == null || this.f9902ag))) {
            this.f9886Q = C1500b.f7455b;
            return true;
        }
        if (this.f9886Q == C1500b.f7455b) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f9886Q) {
            return true;
        }
        this.f9886Q = C1500b.f7455b;
        return false;
    }
}
