package com.anythink.expressad.exoplayer.p091b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1765v;
import com.anythink.expressad.exoplayer.p091b.C1510j;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1508h;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p285z2.InterfaceC4236p7;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1512l implements InterfaceC1508h {

    /* JADX INFO: renamed from: b */
    public static boolean f7631b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f7632c = false;

    /* JADX INFO: renamed from: d */
    private static final long f7633d = 250000;

    /* JADX INFO: renamed from: e */
    private static final long f7634e = 750000;

    /* JADX INFO: renamed from: f */
    private static final long f7635f = 250000;

    /* JADX INFO: renamed from: g */
    private static final int f7636g = 4;

    /* JADX INFO: renamed from: h */
    private static final int f7637h = -2;

    /* JADX INFO: renamed from: i */
    private static final int f7638i = 0;

    /* JADX INFO: renamed from: j */
    private static final int f7639j = 1;

    /* JADX INFO: renamed from: k */
    private static final int f7640k = 1;

    /* JADX INFO: renamed from: l */
    @SuppressLint({"InlinedApi"})
    private static final int f7641l = 1;

    /* JADX INFO: renamed from: m */
    private static final String f7642m = "AudioTrack";

    /* JADX INFO: renamed from: n */
    private static final int f7643n = 0;

    /* JADX INFO: renamed from: o */
    private static final int f7644o = 1;

    /* JADX INFO: renamed from: p */
    private static final int f7645p = 2;

    /* JADX INFO: renamed from: A */
    @Nullable
    private InterfaceC1508h.c f7646A;

    /* JADX INFO: renamed from: B */
    @Nullable
    private AudioTrack f7647B;

    /* JADX INFO: renamed from: C */
    private AudioTrack f7648C;

    /* JADX INFO: renamed from: D */
    private boolean f7649D;

    /* JADX INFO: renamed from: E */
    private boolean f7650E;

    /* JADX INFO: renamed from: F */
    private int f7651F;

    /* JADX INFO: renamed from: G */
    private int f7652G;

    /* JADX INFO: renamed from: H */
    private int f7653H;

    /* JADX INFO: renamed from: I */
    private int f7654I;

    /* JADX INFO: renamed from: J */
    private C1502b f7655J;

    /* JADX INFO: renamed from: K */
    private boolean f7656K;

    /* JADX INFO: renamed from: L */
    private boolean f7657L;

    /* JADX INFO: renamed from: M */
    private int f7658M;

    /* JADX INFO: renamed from: N */
    @Nullable
    private C1765v f7659N;

    /* JADX INFO: renamed from: O */
    private C1765v f7660O;

    /* JADX INFO: renamed from: P */
    private long f7661P;

    /* JADX INFO: renamed from: Q */
    private long f7662Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    private ByteBuffer f7663R;

    /* JADX INFO: renamed from: S */
    private int f7664S;

    /* JADX INFO: renamed from: T */
    private int f7665T;

    /* JADX INFO: renamed from: U */
    private long f7666U;

    /* JADX INFO: renamed from: V */
    private long f7667V;

    /* JADX INFO: renamed from: W */
    private int f7668W;

    /* JADX INFO: renamed from: X */
    private long f7669X;

    /* JADX INFO: renamed from: Y */
    private long f7670Y;

    /* JADX INFO: renamed from: Z */
    private int f7671Z;

    /* JADX INFO: renamed from: aa */
    private int f7672aa;

    /* JADX INFO: renamed from: ab */
    private long f7673ab;

    /* JADX INFO: renamed from: ac */
    private float f7674ac;

    /* JADX INFO: renamed from: ad */
    private InterfaceC1506f[] f7675ad;

    /* JADX INFO: renamed from: ae */
    private ByteBuffer[] f7676ae;

    /* JADX INFO: renamed from: af */
    @Nullable
    private ByteBuffer f7677af;

    /* JADX INFO: renamed from: ag */
    @Nullable
    private ByteBuffer f7678ag;

    /* JADX INFO: renamed from: ah */
    private byte[] f7679ah;

    /* JADX INFO: renamed from: ai */
    private int f7680ai;

    /* JADX INFO: renamed from: aj */
    private int f7681aj;

    /* JADX INFO: renamed from: ak */
    private boolean f7682ak;

    /* JADX INFO: renamed from: al */
    private boolean f7683al;

    /* JADX INFO: renamed from: am */
    private int f7684am;

    /* JADX INFO: renamed from: an */
    private boolean f7685an;

    /* JADX INFO: renamed from: ao */
    private long f7686ao;

    /* JADX INFO: renamed from: q */
    @Nullable
    private final C1503c f7687q;

    /* JADX INFO: renamed from: r */
    private final a f7688r;

    /* JADX INFO: renamed from: s */
    private final boolean f7689s;

    /* JADX INFO: renamed from: t */
    private final C1511k f7690t;

    /* JADX INFO: renamed from: u */
    private final C1521u f7691u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC1506f[] f7692v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC1506f[] f7693w;

    /* JADX INFO: renamed from: x */
    private final ConditionVariable f7694x;

    /* JADX INFO: renamed from: y */
    private final C1510j f7695y;

    /* JADX INFO: renamed from: z */
    private final ArrayDeque<d> f7696z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        long mo6529a(long j);

        /* JADX INFO: renamed from: a */
        C1765v mo6530a(C1765v c1765v);

        /* JADX INFO: renamed from: a */
        InterfaceC1506f[] mo6531a();

        /* JADX INFO: renamed from: b */
        long mo6532b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l$b */
    public static class b implements a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC1506f[] f7701a;

        /* JADX INFO: renamed from: b */
        private final C1517q f7702b;

        /* JADX INFO: renamed from: c */
        private final C1520t f7703c;

        public b(InterfaceC1506f... interfaceC1506fArr) {
            InterfaceC1506f[] interfaceC1506fArr2 = (InterfaceC1506f[]) Arrays.copyOf(interfaceC1506fArr, interfaceC1506fArr.length + 2);
            this.f7701a = interfaceC1506fArr2;
            C1517q c1517q = new C1517q();
            this.f7702b = c1517q;
            C1520t c1520t = new C1520t();
            this.f7703c = c1520t;
            interfaceC1506fArr2[interfaceC1506fArr.length] = c1517q;
            interfaceC1506fArr2[interfaceC1506fArr.length + 1] = c1520t;
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1512l.a
        /* JADX INFO: renamed from: a */
        public final long mo6529a(long j) {
            return this.f7703c.m6628a(j);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1512l.a
        /* JADX INFO: renamed from: a */
        public final C1765v mo6530a(C1765v c1765v) {
            this.f7702b.m6581a(c1765v.f10072d);
            return new C1765v(this.f7703c.m6627a(c1765v.f10070b), this.f7703c.m6629b(c1765v.f10071c), c1765v.f10072d);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1512l.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1506f[] mo6531a() {
            return this.f7701a;
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1512l.a
        /* JADX INFO: renamed from: b */
        public final long mo6532b() {
            return this.f7702b.m6582j();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l$c */
    public static final class c extends RuntimeException {
        private c(String str) {
            super(str);
        }

        public /* synthetic */ c(String str, byte b) {
            this(str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final C1765v f7704a;

        /* JADX INFO: renamed from: b */
        private final long f7705b;

        /* JADX INFO: renamed from: c */
        private final long f7706c;

        private d(C1765v c1765v, long j, long j2) {
            this.f7704a = c1765v;
            this.f7705b = j;
            this.f7706c = j2;
        }

        public /* synthetic */ d(C1765v c1765v, long j, long j2, byte b) {
            this(c1765v, j, j2);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l$e */
    public final class e implements C1510j.a {
        private e() {
        }

        public /* synthetic */ e(C1512l c1512l, byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1510j.a
        /* JADX INFO: renamed from: a */
        public final void mo6494a(int i, long j) {
            if (C1512l.this.f7646A != null) {
                C1512l.this.f7646A.mo6461a(i, j, SystemClock.elapsedRealtime() - C1512l.this.f7686ao);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1510j.a
        /* JADX INFO: renamed from: a */
        public final void mo6495a(long j) {
            Log.w(C1512l.f7642m, "Ignoring impossibly large audio latency: ".concat(String.valueOf(j)));
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1510j.a
        /* JADX INFO: renamed from: a */
        public final void mo6496a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1512l.this.m6524r() + ", " + C1512l.this.m6525s();
            if (C1512l.f7632c) {
                throw new c(str, (byte) 0);
            }
            Log.w(C1512l.f7642m, str);
        }

        @Override // com.anythink.expressad.exoplayer.p091b.C1510j.a
        /* JADX INFO: renamed from: b */
        public final void mo6497b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1512l.this.m6524r() + ", " + C1512l.this.m6525s();
            if (C1512l.f7632c) {
                throw new c(str, (byte) 0);
            }
            Log.w(C1512l.f7642m, str);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.l$f */
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    private C1512l(@Nullable C1503c c1503c, a aVar) {
        this.f7687q = c1503c;
        this.f7688r = (a) C1711a.m8005a(aVar);
        this.f7689s = false;
        this.f7694x = new ConditionVariable(true);
        this.f7695y = new C1510j(new e(this, (byte) 0));
        C1511k c1511k = new C1511k();
        this.f7690t = c1511k;
        C1521u c1521u = new C1521u();
        this.f7691u = c1521u;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C1516p(), c1511k, c1521u);
        Collections.addAll(arrayList, aVar.mo6531a());
        this.f7692v = (InterfaceC1506f[]) arrayList.toArray(new InterfaceC1506f[arrayList.size()]);
        this.f7693w = new InterfaceC1506f[]{new C1514n()};
        this.f7674ac = 1.0f;
        this.f7672aa = 0;
        this.f7655J = C1502b.f7531a;
        this.f7684am = 0;
        this.f7660O = C1765v.f10069a;
        this.f7681aj = -1;
        this.f7675ad = new InterfaceC1506f[0];
        this.f7676ae = new ByteBuffer[0];
        this.f7696z = new ArrayDeque<>();
    }

    public C1512l(@Nullable C1503c c1503c, InterfaceC1506f[] interfaceC1506fArr) {
        this(c1503c, interfaceC1506fArr, (byte) 0);
    }

    private C1512l(@Nullable C1503c c1503c, InterfaceC1506f[] interfaceC1506fArr, byte b2) {
        this(c1503c, new b(interfaceC1506fArr));
    }

    /* JADX INFO: renamed from: a */
    private static int m6499a(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C1513m.m6536a(byteBuffer);
        }
        if (i == 5) {
            return C1501a.m6398a();
        }
        if (i == 6) {
            return C1501a.m6400a(byteBuffer);
        }
        if (i != 14) {
            throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i)));
        }
        int iM6405b = C1501a.m6405b(byteBuffer);
        if (iM6405b == -1) {
            return 0;
        }
        return C1501a.m6401a(byteBuffer, iM6405b) * 16;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private static int m6500a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private int m6501a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f7663R == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f7663R = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f7663R.putInt(1431633921);
        }
        if (this.f7664S == 0) {
            this.f7663R.putInt(4, i);
            this.f7663R.putLong(8, j * 1000);
            this.f7663R.position(0);
            this.f7664S = i;
        }
        int iRemaining = this.f7663R.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f7663R, iRemaining, 1);
            if (iWrite < 0) {
                this.f7664S = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWrite2 = audioTrack.write(byteBuffer, i, 1);
        if (iWrite2 < 0) {
            this.f7664S = 0;
            return iWrite2;
        }
        this.f7664S -= iWrite2;
        return iWrite2;
    }

    /* JADX INFO: renamed from: a */
    private void m6503a(long j) throws InterfaceC1508h.d {
        ByteBuffer byteBuffer;
        int length = this.f7675ad.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7676ae[i - 1];
            } else {
                byteBuffer = this.f7677af;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC1506f.f7547a;
                }
            }
            if (i == length) {
                m6508b(byteBuffer, j);
            } else {
                InterfaceC1506f interfaceC1506f = this.f7675ad[i];
                interfaceC1506f.mo6421a(byteBuffer);
                ByteBuffer byteBufferMo6428f = interfaceC1506f.mo6428f();
                this.f7676ae[i] = byteBufferMo6428f;
                if (byteBufferMo6428f.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: a */
    private static void m6504a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    /* JADX INFO: renamed from: b */
    private long m6505b(long j) {
        long j2;
        long jM8057a;
        d dVarRemove = null;
        while (!this.f7696z.isEmpty() && j >= this.f7696z.getFirst().f7706c) {
            dVarRemove = this.f7696z.remove();
        }
        if (dVarRemove != null) {
            this.f7660O = dVarRemove.f7704a;
            this.f7662Q = dVarRemove.f7706c;
            this.f7661P = dVarRemove.f7705b - this.f7673ab;
        }
        if (this.f7660O.f10070b == 1.0f) {
            return (j + this.f7661P) - this.f7662Q;
        }
        if (this.f7696z.isEmpty()) {
            j2 = this.f7661P;
            jM8057a = this.f7688r.mo6529a(j - this.f7662Q);
        } else {
            j2 = this.f7661P;
            jM8057a = C1717af.m8057a(j - this.f7662Q, this.f7660O.f10070b);
        }
        return j2 + jM8057a;
    }

    /* JADX INFO: renamed from: b */
    private static void m6507b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    /* JADX INFO: renamed from: b */
    private void m6508b(ByteBuffer byteBuffer, long j) throws InterfaceC1508h.d {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7678ag;
            int iWrite = 0;
            if (byteBuffer2 != null) {
                C1711a.m8010a(byteBuffer2 == byteBuffer);
            } else {
                this.f7678ag = byteBuffer;
                if (C1717af.f9627a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f7679ah;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f7679ah = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f7679ah, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f7680ai = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (C1717af.f9627a < 21) {
                int iM6487b = this.f7695y.m6487b(this.f7669X);
                if (iM6487b > 0) {
                    iWrite = this.f7648C.write(this.f7679ah, this.f7680ai, Math.min(iRemaining2, iM6487b));
                    if (iWrite > 0) {
                        this.f7680ai += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                }
            } else if (this.f7685an) {
                C1711a.m8012b(j != C1500b.f7455b);
                iWrite = m6501a(this.f7648C, byteBuffer, iRemaining2, j);
            } else {
                iWrite = this.f7648C.write(byteBuffer, iRemaining2, 1);
            }
            this.f7686ao = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                throw new InterfaceC1508h.d(iWrite);
            }
            boolean z = this.f7649D;
            if (z) {
                this.f7669X += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (!z) {
                    this.f7670Y += (long) this.f7671Z;
                }
                this.f7678ag = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private long m6509c(long j) {
        return j + m6514e(this.f7688r.mo6532b());
    }

    /* JADX INFO: renamed from: d */
    private long m6511d(long j) {
        return (j * 1000000) / ((long) this.f7651F);
    }

    /* JADX INFO: renamed from: d */
    private static AudioTrack m6512d(int i) {
        return new AudioTrack(3, InterfaceC4236p7.OooO0OO, 4, 2, 2, 0, i);
    }

    /* JADX INFO: renamed from: e */
    private long m6514e(long j) {
        return (j * 1000000) / ((long) this.f7652G);
    }

    /* JADX INFO: renamed from: f */
    private long m6516f(long j) {
        return (j * ((long) this.f7652G)) / 1000000;
    }

    /* JADX INFO: renamed from: k */
    private void m6517k() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1506f interfaceC1506f : m6528v()) {
            if (interfaceC1506f.mo6422a()) {
                arrayList.add(interfaceC1506f);
            } else {
                interfaceC1506f.mo6430h();
            }
        }
        int size = arrayList.size();
        this.f7675ad = (InterfaceC1506f[]) arrayList.toArray(new InterfaceC1506f[size]);
        this.f7676ae = new ByteBuffer[size];
        m6518l();
    }

    /* JADX INFO: renamed from: l */
    private void m6518l() {
        int i = 0;
        while (true) {
            InterfaceC1506f[] interfaceC1506fArr = this.f7675ad;
            if (i >= interfaceC1506fArr.length) {
                return;
            }
            InterfaceC1506f interfaceC1506f = interfaceC1506fArr[i];
            interfaceC1506f.mo6430h();
            this.f7676ae[i] = interfaceC1506f.mo6428f();
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m6519m() throws InterfaceC1508h.b {
        this.f7694x.block();
        AudioTrack audioTrackM6526t = m6526t();
        this.f7648C = audioTrackM6526t;
        int audioSessionId = audioTrackM6526t.getAudioSessionId();
        if (f7631b && C1717af.f9627a < 21) {
            AudioTrack audioTrack = this.f7647B;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                m6522p();
            }
            if (this.f7647B == null) {
                this.f7647B = new AudioTrack(3, InterfaceC4236p7.OooO0OO, 4, 2, 2, 0, audioSessionId);
            }
        }
        if (this.f7684am != audioSessionId) {
            this.f7684am = audioSessionId;
            InterfaceC1508h.c cVar = this.f7646A;
            if (cVar != null) {
                cVar.mo6460a(audioSessionId);
            }
        }
        this.f7660O = this.f7657L ? this.f7688r.mo6530a(this.f7660O) : C1765v.f10069a;
        m6517k();
        this.f7695y.m6485a(this.f7648C, this.f7654I, this.f7668W, this.f7658M);
        m6521o();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:8:0x0010). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m6520n() throws com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.d {
        /*
            r9 = this;
            int r0 = r9.f7681aj
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.f7656K
            if (r0 == 0) goto Ld
            r0 = 0
            goto L10
        Ld:
            com.anythink.expressad.exoplayer.b.f[] r0 = r9.f7675ad
            int r0 = r0.length
        L10:
            r9.f7681aj = r0
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.f7681aj
            com.anythink.expressad.exoplayer.b.f[] r5 = r9.f7675ad
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L36
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.mo6427e()
        L28:
            r9.m6503a(r7)
            boolean r0 = r4.mo6429g()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.f7681aj
            int r0 = r0 + r2
            goto L10
        L36:
            java.nio.ByteBuffer r0 = r9.f7678ag
            if (r0 == 0) goto L42
            r9.m6508b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7678ag
            if (r0 == 0) goto L42
            return r3
        L42:
            r9.f7681aj = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.C1512l.m6520n():boolean");
    }

    /* JADX INFO: renamed from: o */
    private void m6521o() {
        if (m6523q()) {
            if (C1717af.f9627a >= 21) {
                this.f7648C.setVolume(this.f7674ac);
                return;
            }
            AudioTrack audioTrack = this.f7648C;
            float f2 = this.f7674ac;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m6522p() {
        final AudioTrack audioTrack = this.f7647B;
        if (audioTrack == null) {
            return;
        }
        this.f7647B = null;
        new Thread() { // from class: com.anythink.expressad.exoplayer.b.l.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                audioTrack.release();
            }
        }.start();
    }

    /* JADX INFO: renamed from: q */
    private boolean m6523q() {
        return this.f7648C != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public long m6524r() {
        return this.f7649D ? this.f7666U / ((long) this.f7665T) : this.f7667V;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public long m6525s() {
        return this.f7649D ? this.f7669X / ((long) this.f7668W) : this.f7670Y;
    }

    /* JADX INFO: renamed from: t */
    private AudioTrack m6526t() throws InterfaceC1508h.b {
        AudioTrack audioTrack;
        if (C1717af.f9627a >= 21) {
            AudioAttributes audioAttributesBuild = this.f7685an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.f7655J.m6408a();
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.f7653H).setEncoding(this.f7654I).setSampleRate(this.f7652G).build();
            int i = this.f7684am;
            audioTrack = new AudioTrack(audioAttributesBuild, audioFormatBuild, this.f7658M, 1, i != 0 ? i : 0);
        } else {
            int iM8115f = C1717af.m8115f(this.f7655J.f7534d);
            audioTrack = this.f7684am == 0 ? new AudioTrack(iM8115f, this.f7652G, this.f7653H, this.f7654I, this.f7658M, 1) : new AudioTrack(iM8115f, this.f7652G, this.f7653H, this.f7654I, this.f7658M, 1, this.f7684am);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new InterfaceC1508h.b(state, this.f7652G, this.f7653H, this.f7658M);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: u */
    private AudioTrack m6527u() {
        AudioAttributes audioAttributesBuild = this.f7685an ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.f7655J.m6408a();
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.f7653H).setEncoding(this.f7654I).setSampleRate(this.f7652G).build();
        int i = this.f7684am;
        return new AudioTrack(audioAttributesBuild, audioFormatBuild, this.f7658M, 1, i != 0 ? i : 0);
    }

    /* JADX INFO: renamed from: v */
    private InterfaceC1506f[] m6528v() {
        return this.f7650E ? this.f7693w : this.f7692v;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final long mo6439a(boolean z) {
        long jMo6529a;
        if (!m6523q() || this.f7672aa == 0) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f7695y.m6483a(z), m6514e(m6525s()));
        long j = this.f7673ab;
        d dVarRemove = null;
        while (!this.f7696z.isEmpty() && jMin >= this.f7696z.getFirst().f7706c) {
            dVarRemove = this.f7696z.remove();
        }
        if (dVarRemove != null) {
            this.f7660O = dVarRemove.f7704a;
            this.f7662Q = dVarRemove.f7706c;
            this.f7661P = dVarRemove.f7705b - this.f7673ab;
        }
        if (this.f7660O.f10070b == 1.0f) {
            jMo6529a = (jMin + this.f7661P) - this.f7662Q;
        } else {
            boolean zIsEmpty = this.f7696z.isEmpty();
            jMo6529a = (zIsEmpty ? this.f7688r.mo6529a(jMin - this.f7662Q) : C1717af.m8057a(jMin - this.f7662Q, this.f7660O.f10070b)) + this.f7661P;
        }
        return j + jMo6529a + m6514e(this.f7688r.mo6532b());
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final C1765v mo6440a(C1765v c1765v) {
        if (m6523q() && !this.f7657L) {
            C1765v c1765v2 = C1765v.f10069a;
            this.f7660O = c1765v2;
            return c1765v2;
        }
        C1765v c1765v3 = this.f7659N;
        if (c1765v3 == null) {
            c1765v3 = !this.f7696z.isEmpty() ? this.f7696z.getLast().f7704a : this.f7660O;
        }
        if (!c1765v.equals(c1765v3)) {
            if (m6523q()) {
                this.f7659N = c1765v;
            } else {
                this.f7660O = this.f7688r.mo6530a(c1765v);
            }
        }
        return this.f7660O;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final void mo6441a() {
        this.f7683al = true;
        if (m6523q()) {
            this.f7695y.m6484a();
            this.f7648C.play();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final void mo6442a(float f2) {
        if (this.f7674ac != f2) {
            this.f7674ac = f2;
            m6521o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6443a(int r18, int r19, int r20, @androidx.annotation.Nullable int[] r21, int r22, int r23) throws com.anythink.expressad.exoplayer.p091b.InterfaceC1508h.a {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p091b.C1512l.mo6443a(int, int, int, int[], int, int):void");
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final void mo6444a(C1502b c1502b) {
        if (this.f7655J.equals(c1502b)) {
            return;
        }
        this.f7655J = c1502b;
        if (this.f7685an) {
            return;
        }
        mo6457i();
        this.f7684am = 0;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final void mo6445a(InterfaceC1508h.c cVar) {
        this.f7646A = cVar;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final boolean mo6446a(int i) {
        if (C1717af.m8101b(i)) {
            return i != 4 || C1717af.f9627a >= 21;
        }
        C1503c c1503c = this.f7687q;
        return c1503c != null && c1503c.m6416a(i);
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: a */
    public final boolean mo6447a(ByteBuffer byteBuffer, long j) throws InterfaceC1508h.b, InterfaceC1508h.d {
        int iM6536a;
        ByteBuffer byteBuffer2 = this.f7677af;
        C1711a.m8010a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!m6523q()) {
            this.f7694x.block();
            AudioTrack audioTrackM6526t = m6526t();
            this.f7648C = audioTrackM6526t;
            int audioSessionId = audioTrackM6526t.getAudioSessionId();
            if (f7631b && C1717af.f9627a < 21) {
                AudioTrack audioTrack = this.f7647B;
                if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                    m6522p();
                }
                if (this.f7647B == null) {
                    this.f7647B = new AudioTrack(3, InterfaceC4236p7.OooO0OO, 4, 2, 2, 0, audioSessionId);
                }
            }
            if (this.f7684am != audioSessionId) {
                this.f7684am = audioSessionId;
                InterfaceC1508h.c cVar = this.f7646A;
                if (cVar != null) {
                    cVar.mo6460a(audioSessionId);
                }
            }
            this.f7660O = this.f7657L ? this.f7688r.mo6530a(this.f7660O) : C1765v.f10069a;
            m6517k();
            this.f7695y.m6485a(this.f7648C, this.f7654I, this.f7668W, this.f7658M);
            m6521o();
            if (this.f7683al) {
                mo6441a();
            }
        }
        if (!this.f7695y.m6486a(m6525s())) {
            return false;
        }
        if (this.f7677af == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f7649D && this.f7671Z == 0) {
                int i = this.f7654I;
                if (i == 7 || i == 8) {
                    iM6536a = C1513m.m6536a(byteBuffer);
                } else if (i == 5) {
                    iM6536a = C1501a.m6398a();
                } else if (i == 6) {
                    iM6536a = C1501a.m6400a(byteBuffer);
                } else {
                    if (i != 14) {
                        throw new IllegalStateException("Unexpected audio encoding: ".concat(String.valueOf(i)));
                    }
                    int iM6405b = C1501a.m6405b(byteBuffer);
                    iM6536a = iM6405b == -1 ? 0 : C1501a.m6401a(byteBuffer, iM6405b) * 16;
                }
                this.f7671Z = iM6536a;
                if (iM6536a == 0) {
                    return true;
                }
            }
            if (this.f7659N != null) {
                if (!m6520n()) {
                    return false;
                }
                C1765v c1765v = this.f7659N;
                this.f7659N = null;
                this.f7696z.add(new d(this.f7688r.mo6530a(c1765v), Math.max(0L, j), m6514e(m6525s()), (byte) 0));
                m6517k();
            }
            if (this.f7672aa == 0) {
                this.f7673ab = Math.max(0L, j);
                this.f7672aa = 1;
            } else {
                long jM6524r = this.f7673ab + ((m6524r() * 1000000) / ((long) this.f7651F));
                if (this.f7672aa == 1 && Math.abs(jM6524r - j) > 200000) {
                    Log.e(f7642m, "Discontinuity detected [expected " + jM6524r + ", got " + j + "]");
                    this.f7672aa = 2;
                }
                if (this.f7672aa == 2) {
                    this.f7673ab += j - jM6524r;
                    this.f7672aa = 1;
                    InterfaceC1508h.c cVar2 = this.f7646A;
                    if (cVar2 != null) {
                        cVar2.mo6459a();
                    }
                }
            }
            if (this.f7649D) {
                this.f7666U += (long) byteBuffer.remaining();
            } else {
                this.f7667V += (long) this.f7671Z;
            }
            this.f7677af = byteBuffer;
        }
        if (this.f7656K) {
            m6503a(j);
        } else {
            m6508b(this.f7677af, j);
        }
        if (!this.f7677af.hasRemaining()) {
            this.f7677af = null;
            return true;
        }
        if (!this.f7695y.m6490c(m6525s())) {
            return false;
        }
        Log.w(f7642m, "Resetting stalled audio track");
        mo6457i();
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: b */
    public final void mo6448b() {
        if (this.f7672aa == 1) {
            this.f7672aa = 2;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: b */
    public final void mo6449b(int i) {
        if (this.f7684am != i) {
            this.f7684am = i;
            mo6457i();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: c */
    public final void mo6450c() {
        if (!this.f7682ak && m6523q() && m6520n()) {
            this.f7695y.m6492d(m6525s());
            this.f7648C.stop();
            this.f7664S = 0;
            this.f7682ak = true;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: c */
    public final void mo6451c(int i) {
        C1711a.m8012b(C1717af.f9627a >= 21);
        if (this.f7685an && this.f7684am == i) {
            return;
        }
        this.f7685an = true;
        this.f7684am = i;
        mo6457i();
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: d */
    public final boolean mo6452d() {
        if (m6523q()) {
            return this.f7682ak && !mo6453e();
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: e */
    public final boolean mo6453e() {
        return m6523q() && this.f7695y.m6493e(m6525s());
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: f */
    public final C1765v mo6454f() {
        return this.f7660O;
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: g */
    public final void mo6455g() {
        if (this.f7685an) {
            this.f7685an = false;
            this.f7684am = 0;
            mo6457i();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: h */
    public final void mo6456h() {
        this.f7683al = false;
        if (m6523q() && this.f7695y.m6489c()) {
            this.f7648C.pause();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: i */
    public final void mo6457i() {
        if (m6523q()) {
            this.f7666U = 0L;
            this.f7667V = 0L;
            this.f7669X = 0L;
            this.f7670Y = 0L;
            this.f7671Z = 0;
            C1765v c1765v = this.f7659N;
            if (c1765v != null) {
                this.f7660O = c1765v;
                this.f7659N = null;
            } else if (!this.f7696z.isEmpty()) {
                this.f7660O = this.f7696z.getLast().f7704a;
            }
            this.f7696z.clear();
            this.f7661P = 0L;
            this.f7662Q = 0L;
            this.f7677af = null;
            this.f7678ag = null;
            m6518l();
            this.f7682ak = false;
            this.f7681aj = -1;
            this.f7663R = null;
            this.f7664S = 0;
            this.f7672aa = 0;
            if (this.f7695y.m6488b()) {
                this.f7648C.pause();
            }
            final AudioTrack audioTrack = this.f7648C;
            this.f7648C = null;
            this.f7695y.m6491d();
            this.f7694x.close();
            new Thread() { // from class: com.anythink.expressad.exoplayer.b.l.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        C1512l.this.f7694x.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1508h
    /* JADX INFO: renamed from: j */
    public final void mo6458j() {
        mo6457i();
        m6522p();
        for (InterfaceC1506f interfaceC1506f : this.f7692v) {
            interfaceC1506f.mo6431i();
        }
        for (InterfaceC1506f interfaceC1506f2 : this.f7693w) {
            interfaceC1506f2.mo6431i();
        }
        this.f7684am = 0;
        this.f7683al = false;
    }
}
