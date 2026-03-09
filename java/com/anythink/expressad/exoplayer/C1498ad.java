package com.anythink.expressad.exoplayer;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1767x;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.InterfaceC1766w;
import com.anythink.expressad.exoplayer.p090a.C1493a;
import com.anythink.expressad.exoplayer.p090a.InterfaceC1494b;
import com.anythink.expressad.exoplayer.p091b.C1502b;
import com.anythink.expressad.exoplayer.p091b.InterfaceC1507g;
import com.anythink.expressad.exoplayer.p092c.C1526d;
import com.anythink.expressad.exoplayer.p093d.C1535d;
import com.anythink.expressad.exoplayer.p093d.C1542k;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1538g;
import com.anythink.expressad.exoplayer.p097g.C1582a;
import com.anythink.expressad.exoplayer.p097g.InterfaceC1608f;
import com.anythink.expressad.exoplayer.p101h.C1621af;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p104i.AbstractC1666h;
import com.anythink.expressad.exoplayer.p104i.C1665g;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1751g;
import com.anythink.expressad.exoplayer.p108l.InterfaceC1752h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ad */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public class C1498ad implements InterfaceC1610h, InterfaceC1766w.e, InterfaceC1766w.g {

    /* JADX INFO: renamed from: x */
    private static final String f7335x = "SimpleExoPlayer";

    /* JADX INFO: renamed from: A */
    private final a f7336A;

    /* JADX INFO: renamed from: B */
    private final CopyOnWriteArraySet<InterfaceC1751g> f7337B;

    /* JADX INFO: renamed from: C */
    private final CopyOnWriteArraySet<InterfaceC1608f> f7338C;

    /* JADX INFO: renamed from: D */
    private final CopyOnWriteArraySet<InterfaceC1752h> f7339D;

    /* JADX INFO: renamed from: E */
    private final CopyOnWriteArraySet<InterfaceC1507g> f7340E;

    /* JADX INFO: renamed from: F */
    private final C1493a f7341F;

    /* JADX INFO: renamed from: G */
    private C1753m f7342G;

    /* JADX INFO: renamed from: H */
    private C1753m f7343H;

    /* JADX INFO: renamed from: I */
    private Surface f7344I;

    /* JADX INFO: renamed from: J */
    private boolean f7345J;

    /* JADX INFO: renamed from: K */
    private int f7346K;

    /* JADX INFO: renamed from: L */
    private SurfaceHolder f7347L;

    /* JADX INFO: renamed from: M */
    private TextureView f7348M;

    /* JADX INFO: renamed from: N */
    private C1526d f7349N;

    /* JADX INFO: renamed from: O */
    private C1526d f7350O;

    /* JADX INFO: renamed from: P */
    private int f7351P;

    /* JADX INFO: renamed from: Q */
    private C1502b f7352Q;

    /* JADX INFO: renamed from: R */
    private float f7353R;

    /* JADX INFO: renamed from: S */
    private InterfaceC1650s f7354S;

    /* JADX INFO: renamed from: w */
    public final InterfaceC1768y[] f7355w;

    /* JADX INFO: renamed from: y */
    private final InterfaceC1610h f7356y;

    /* JADX INFO: renamed from: z */
    private final Handler f7357z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ad$a */
    public final class a implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC1507g, InterfaceC1608f, InterfaceC1752h {
        private a() {
        }

        public /* synthetic */ a(C1498ad c1498ad, byte b) {
            this();
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
        /* JADX INFO: renamed from: a */
        public final void mo6163a(int i) {
            C1498ad.this.f7351P = i;
            Iterator it = C1498ad.this.f7340E.iterator();
            while (it.hasNext()) {
                ((InterfaceC1507g) it.next()).mo6163a(i);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: a */
        public final void mo6164a(int i, int i2, int i3, float f) {
            Iterator it = C1498ad.this.f7337B.iterator();
            while (it.hasNext()) {
                ((InterfaceC1751g) it.next()).mo1008a(i, i2);
            }
            Iterator it2 = C1498ad.this.f7339D.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1752h) it2.next()).mo6164a(i, i2, i3, f);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: a */
        public final void mo6165a(int i, long j) {
            Iterator it = C1498ad.this.f7339D.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752h) it.next()).mo6165a(i, j);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
        /* JADX INFO: renamed from: a */
        public final void mo6166a(int i, long j, long j2) {
            Iterator it = C1498ad.this.f7340E.iterator();
            while (it.hasNext()) {
                ((InterfaceC1507g) it.next()).mo6166a(i, j, j2);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: a */
        public final void mo6171a(Surface surface) {
            if (C1498ad.this.f7344I == surface) {
                Iterator it = C1498ad.this.f7337B.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            Iterator it2 = C1498ad.this.f7339D.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1752h) it2.next()).mo6171a(surface);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: a */
        public final void mo6173a(C1526d c1526d) {
            C1498ad.this.f7349N = c1526d;
            Iterator it = C1498ad.this.f7339D.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752h) it.next()).mo6173a(c1526d);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p097g.InterfaceC1608f
        /* JADX INFO: renamed from: a */
        public final void mo6174a(C1582a c1582a) {
            Iterator it = C1498ad.this.f7338C.iterator();
            while (it.hasNext()) {
                ((InterfaceC1608f) it.next()).mo6174a(c1582a);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: a */
        public final void mo6175a(C1753m c1753m) {
            C1498ad.this.f7342G = c1753m;
            Iterator it = C1498ad.this.f7339D.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752h) it.next()).mo6175a(c1753m);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: a */
        public final void mo6177a(String str, long j, long j2) {
            Iterator it = C1498ad.this.f7339D.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752h) it.next()).mo6177a(str, j, j2);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p108l.InterfaceC1752h
        /* JADX INFO: renamed from: b */
        public final void mo6183b(C1526d c1526d) {
            Iterator it = C1498ad.this.f7339D.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752h) it.next()).mo6183b(c1526d);
            }
            C1498ad.this.f7342G = null;
            C1498ad.this.f7349N = null;
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
        /* JADX INFO: renamed from: b */
        public final void mo6184b(C1753m c1753m) {
            C1498ad.this.f7343H = c1753m;
            Iterator it = C1498ad.this.f7340E.iterator();
            while (it.hasNext()) {
                ((InterfaceC1507g) it.next()).mo6184b(c1753m);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
        /* JADX INFO: renamed from: b */
        public final void mo6185b(String str, long j, long j2) {
            Iterator it = C1498ad.this.f7340E.iterator();
            while (it.hasNext()) {
                ((InterfaceC1507g) it.next()).mo6185b(str, j, j2);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
        /* JADX INFO: renamed from: c */
        public final void mo6189c(C1526d c1526d) {
            C1498ad.this.f7350O = c1526d;
            Iterator it = C1498ad.this.f7340E.iterator();
            while (it.hasNext()) {
                ((InterfaceC1507g) it.next()).mo6189c(c1526d);
            }
        }

        @Override // com.anythink.expressad.exoplayer.p091b.InterfaceC1507g
        /* JADX INFO: renamed from: d */
        public final void mo6191d(C1526d c1526d) {
            Iterator it = C1498ad.this.f7340E.iterator();
            while (it.hasNext()) {
                ((InterfaceC1507g) it.next()).mo6191d(c1526d);
            }
            C1498ad.this.f7343H = null;
            C1498ad.this.f7350O = null;
            C1498ad.this.f7351P = 0;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C1498ad.this.m6265a(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1498ad.this.m6265a((Surface) null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C1498ad.this.m6265a(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C1498ad.this.m6265a((Surface) null, false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.ad$b */
    @Deprecated
    public interface b extends InterfaceC1751g {
    }

    public C1498ad(InterfaceC1496ab interfaceC1496ab, AbstractC1666h abstractC1666h, InterfaceC1756p interfaceC1756p, @Nullable InterfaceC1538g<C1542k> interfaceC1538g) {
        new C1493a.a();
        this(interfaceC1496ab, abstractC1666h, interfaceC1756p, interfaceC1538g, (byte) 0);
    }

    public C1498ad(InterfaceC1496ab interfaceC1496ab, AbstractC1666h abstractC1666h, InterfaceC1756p interfaceC1756p, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, byte b2) {
        this(interfaceC1496ab, abstractC1666h, interfaceC1756p, interfaceC1538g, InterfaceC1720c.f9643a);
    }

    private C1498ad(InterfaceC1496ab interfaceC1496ab, AbstractC1666h abstractC1666h, InterfaceC1756p interfaceC1756p, @Nullable InterfaceC1538g<C1542k> interfaceC1538g, InterfaceC1720c interfaceC1720c) {
        a aVar = new a(this, (byte) 0);
        this.f7336A = aVar;
        this.f7337B = new CopyOnWriteArraySet<>();
        this.f7338C = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<InterfaceC1752h> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f7339D = copyOnWriteArraySet;
        CopyOnWriteArraySet<InterfaceC1507g> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f7340E = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f7357z = handler;
        InterfaceC1768y[] interfaceC1768yArrMo6248a = interfaceC1496ab.mo6248a(handler, aVar, aVar, aVar, interfaceC1538g);
        this.f7355w = interfaceC1768yArrMo6248a;
        this.f7353R = 1.0f;
        this.f7351P = 0;
        this.f7352Q = C1502b.f7531a;
        this.f7346K = 1;
        C1668j c1668j = new C1668j(interfaceC1768yArrMo6248a, abstractC1666h, interfaceC1756p, interfaceC1720c);
        this.f7356y = c1668j;
        C1493a c1493aM6194a = C1493a.a.m6194a(c1668j, interfaceC1720c);
        this.f7341F = c1493aM6194a;
        mo6314a((InterfaceC1766w.c) c1493aM6194a);
        copyOnWriteArraySet.add(c1493aM6194a);
        copyOnWriteArraySet2.add(c1493aM6194a);
        m6271a((InterfaceC1608f) c1493aM6194a);
        if (interfaceC1538g instanceof C1535d) {
            ((C1535d) interfaceC1538g).m6760a(handler, c1493aM6194a);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: K */
    private int m6249K() {
        return C1717af.m8115f(this.f7352Q.f7534d);
    }

    /* JADX INFO: renamed from: L */
    private C1493a m6250L() {
        return this.f7341F;
    }

    /* JADX INFO: renamed from: M */
    private C1502b m6251M() {
        return this.f7352Q;
    }

    /* JADX INFO: renamed from: N */
    private float m6252N() {
        return this.f7353R;
    }

    /* JADX INFO: renamed from: O */
    private C1753m m6253O() {
        return this.f7342G;
    }

    /* JADX INFO: renamed from: P */
    private C1753m m6254P() {
        return this.f7343H;
    }

    /* JADX INFO: renamed from: Q */
    private int m6255Q() {
        return this.f7351P;
    }

    /* JADX INFO: renamed from: R */
    private C1526d m6256R() {
        return this.f7349N;
    }

    /* JADX INFO: renamed from: S */
    private C1526d m6257S() {
        return this.f7350O;
    }

    /* JADX INFO: renamed from: T */
    private void m6258T() {
        TextureView textureView = this.f7348M;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f7336A) {
                Log.w(f7335x, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f7348M.setSurfaceTextureListener(null);
            }
            this.f7348M = null;
        }
        SurfaceHolder surfaceHolder = this.f7347L;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f7336A);
            this.f7347L = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC1610h m6261a(InterfaceC1768y[] interfaceC1768yArr, AbstractC1666h abstractC1666h, InterfaceC1756p interfaceC1756p, InterfaceC1720c interfaceC1720c) {
        return new C1668j(interfaceC1768yArr, abstractC1666h, interfaceC1756p, interfaceC1720c);
    }

    @TargetApi(23)
    @Deprecated
    /* JADX INFO: renamed from: a */
    private void m6264a(@Nullable PlaybackParams playbackParams) {
        C1765v c1765v;
        if (playbackParams != null) {
            playbackParams.allowDefaults();
            c1765v = new C1765v(playbackParams.getSpeed(), playbackParams.getPitch());
        } else {
            c1765v = null;
        }
        mo6313a(c1765v);
    }

    /* JADX INFO: renamed from: a */
    public void m6265a(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1768y interfaceC1768y : this.f7355w) {
            if (interfaceC1768y.mo6122a() == 2) {
                arrayList.add(this.f7356y.mo6300a(interfaceC1768y).m8514a(1).m8515a(surface).m8524i());
            }
        }
        Surface surface2 = this.f7344I;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C1767x) it.next()).m8526k();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f7356y.mo6329c(false);
            }
            if (this.f7345J) {
                this.f7344I.release();
            }
        }
        this.f7344I = surface;
        this.f7345J = z;
    }

    /* JADX INFO: renamed from: a */
    private void m6266a(InterfaceC1494b interfaceC1494b) {
        this.f7341F.m6172a(interfaceC1494b);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private void m6267a(b bVar) {
        this.f7337B.clear();
        if (bVar != null) {
            mo6312a((InterfaceC1751g) bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6269a(C1502b c1502b) {
        this.f7352Q = c1502b;
        for (InterfaceC1768y interfaceC1768y : this.f7355w) {
            if (interfaceC1768y.mo6122a() == 1) {
                this.f7356y.mo6300a(interfaceC1768y).m8514a(3).m8515a(c1502b).m8524i();
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private void m6270a(InterfaceC1507g interfaceC1507g) {
        this.f7340E.retainAll(Collections.singleton(this.f7341F));
        if (interfaceC1507g != null) {
            this.f7340E.add(interfaceC1507g);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6271a(InterfaceC1608f interfaceC1608f) {
        this.f7338C.add(interfaceC1608f);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    private void m6272a(InterfaceC1752h interfaceC1752h) {
        this.f7339D.retainAll(Collections.singleton(this.f7341F));
        if (interfaceC1752h != null) {
            this.f7339D.add(interfaceC1752h);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6276b(InterfaceC1494b interfaceC1494b) {
        this.f7341F.m6182b(interfaceC1494b);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    private void m6277b(b bVar) {
        mo6323b((InterfaceC1751g) bVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    private void m6278b(InterfaceC1507g interfaceC1507g) {
        this.f7340E.add(interfaceC1507g);
    }

    /* JADX INFO: renamed from: b */
    private void m6279b(InterfaceC1608f interfaceC1608f) {
        this.f7338C.remove(interfaceC1608f);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    private void m6280b(InterfaceC1752h interfaceC1752h) {
        this.f7339D.add(interfaceC1752h);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m6282c(InterfaceC1507g interfaceC1507g) {
        this.f7340E.remove(interfaceC1507g);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m6283c(InterfaceC1608f interfaceC1608f) {
        this.f7338C.retainAll(Collections.singleton(this.f7341F));
        if (interfaceC1608f != null) {
            m6271a(interfaceC1608f);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m6284c(InterfaceC1752h interfaceC1752h) {
        this.f7339D.remove(interfaceC1752h);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    private void m6286d(InterfaceC1608f interfaceC1608f) {
        this.f7338C.remove(interfaceC1608f);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    private void m6288e(int i) {
        C1502b c1502bM6411a = new C1502b.a().m6412b(C1717af.m8108d(i)).m6410a(C1717af.m8112e(i)).m6411a();
        this.f7352Q = c1502bM6411a;
        for (InterfaceC1768y interfaceC1768y : this.f7355w) {
            if (interfaceC1768y.mo6122a() == 1) {
                this.f7356y.mo6300a(interfaceC1768y).m8514a(3).m8515a(c1502bM6411a).m8524i();
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: A */
    public final int mo6289A() {
        return this.f7356y.mo6289A();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: B */
    public final long mo6290B() {
        return this.f7356y.mo6290B();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: C */
    public final int mo6291C() {
        return this.f7356y.mo6291C();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: D */
    public final C1621af mo6292D() {
        return this.f7356y.mo6292D();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: E */
    public final C1665g mo6293E() {
        return this.f7356y.mo6293E();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: F */
    public final AbstractC1499ae mo6294F() {
        return this.f7356y.mo6294F();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: G */
    public final Object mo6295G() {
        return this.f7356y.mo6295G();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: H */
    public final int mo6296H() {
        return this.f7346K;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: I */
    public final void mo6297I() {
        mo6305a((Surface) null);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m6298J() {
        return mo6330d() == 3 && mo6333f();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final Looper mo6299a() {
        return this.f7356y.mo6299a();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final C1767x mo6300a(C1767x.b bVar) {
        return this.f7356y.mo6300a(bVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m6301a(float f) {
        this.f7353R = f;
        for (InterfaceC1768y interfaceC1768y : this.f7355w) {
            if (interfaceC1768y.mo6122a() == 1) {
                this.f7356y.mo6300a(interfaceC1768y).m8514a(2).m8515a(Float.valueOf(f)).m8524i();
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6302a(int i) {
        this.f7356y.mo6302a(i);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6303a(int i, long j) {
        this.f7341F.m6162a();
        this.f7356y.mo6303a(i, j);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6304a(long j) {
        this.f7341F.m6162a();
        this.f7356y.mo6304a(j);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: a */
    public final void mo6305a(Surface surface) {
        m6258T();
        m6265a(surface, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x001a  */
    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6306a(android.view.SurfaceHolder r2) {
        /*
            r1 = this;
            r1.m6258T()
            r1.f7347L = r2
            if (r2 != 0) goto L8
            goto L1a
        L8:
            com.anythink.expressad.exoplayer.ad$a r0 = r1.f7336A
            r2.addCallback(r0)
            android.view.Surface r2 = r2.getSurface()
            if (r2 == 0) goto L1a
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r0 = 0
            r1.m6265a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.C1498ad.mo6306a(android.view.SurfaceHolder):void");
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: a */
    public final void mo6307a(SurfaceView surfaceView) {
        mo6306a(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: a */
    public final void mo6308a(TextureView textureView) {
        m6258T();
        this.f7348M = textureView;
        Surface surface = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w(f7335x, "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f7336A);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                surface = new Surface(surfaceTexture);
            }
        }
        m6265a(surface, true);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6309a(@Nullable C1497ac c1497ac) {
        this.f7356y.mo6309a(c1497ac);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6310a(InterfaceC1650s interfaceC1650s) {
        mo6311a(interfaceC1650s, true, true);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6311a(InterfaceC1650s interfaceC1650s, boolean z, boolean z3) {
        InterfaceC1650s interfaceC1650s2 = this.f7354S;
        if (interfaceC1650s2 != interfaceC1650s) {
            if (interfaceC1650s2 != null) {
                interfaceC1650s2.mo7357a(this.f7341F);
                this.f7341F.m6178b();
            }
            interfaceC1650s.mo7354a(this.f7357z, this.f7341F);
            this.f7354S = interfaceC1650s;
        }
        this.f7356y.mo6311a(interfaceC1650s, z, z3);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: a */
    public final void mo6312a(InterfaceC1751g interfaceC1751g) {
        this.f7337B.add(interfaceC1751g);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6313a(@Nullable C1765v c1765v) {
        this.f7356y.mo6313a(c1765v);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6314a(InterfaceC1766w.c cVar) {
        this.f7356y.mo6314a(cVar);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: a */
    public final void mo6315a(boolean z) {
        this.f7356y.mo6315a(z);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: a */
    public final void mo6316a(InterfaceC1610h.c... cVarArr) {
        this.f7356y.mo6316a(cVarArr);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final InterfaceC1766w.g mo6317b() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final void mo6318b(int i) {
        this.f7341F.m6162a();
        this.f7356y.mo6318b(i);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: b */
    public final void mo6319b(Surface surface) {
        if (surface == null || surface != this.f7344I) {
            return;
        }
        mo6305a((Surface) null);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: b */
    public final void mo6320b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null || surfaceHolder != this.f7347L) {
            return;
        }
        mo6306a((SurfaceHolder) null);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: b */
    public final void mo6321b(SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        if (holder == null || holder != this.f7347L) {
            return;
        }
        mo6306a((SurfaceHolder) null);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: b */
    public final void mo6322b(TextureView textureView) {
        if (textureView == null || textureView != this.f7348M) {
            return;
        }
        mo6308a((TextureView) null);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: b */
    public final void mo6323b(InterfaceC1751g interfaceC1751g) {
        this.f7337B.remove(interfaceC1751g);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final void mo6324b(InterfaceC1766w.c cVar) {
        this.f7356y.mo6324b(cVar);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: b */
    public final void mo6325b(boolean z) {
        this.f7356y.mo6325b(z);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1610h
    /* JADX INFO: renamed from: b */
    public final void mo6326b(InterfaceC1610h.c... cVarArr) {
        this.f7356y.mo6326b(cVarArr);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: c */
    public final int mo6327c(int i) {
        return this.f7356y.mo6327c(i);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: c */
    public final InterfaceC1766w.e mo6328c() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: c */
    public final void mo6329c(boolean z) {
        this.f7356y.mo6329c(z);
        InterfaceC1650s interfaceC1650s = this.f7354S;
        if (interfaceC1650s != null) {
            interfaceC1650s.mo7357a(this.f7341F);
            this.f7354S = null;
            this.f7341F.m6178b();
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: d */
    public final int mo6330d() {
        return this.f7356y.mo6330d();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w.g
    /* JADX INFO: renamed from: d */
    public final void mo6331d(int i) {
        this.f7346K = i;
        for (InterfaceC1768y interfaceC1768y : this.f7355w) {
            if (interfaceC1768y.mo6122a() == 2) {
                this.f7356y.mo6300a(interfaceC1768y).m8514a(4).m8515a(Integer.valueOf(i)).m8524i();
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: e */
    public final C1581g mo6332e() {
        return this.f7356y.mo6332e();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: f */
    public final boolean mo6333f() {
        return this.f7356y.mo6333f();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: g */
    public final int mo6334g() {
        return this.f7356y.mo6334g();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: h */
    public final boolean mo6335h() {
        return this.f7356y.mo6335h();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: i */
    public final boolean mo6336i() {
        return this.f7356y.mo6336i();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: j */
    public final void mo6337j() {
        this.f7341F.m6162a();
        this.f7356y.mo6337j();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: k */
    public final C1765v mo6338k() {
        return this.f7356y.mo6338k();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object mo6339l() {
        return this.f7356y.mo6339l();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: m */
    public final void mo6340m() {
        mo6329c(false);
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: n */
    public final void mo6341n() {
        this.f7356y.mo6341n();
        m6258T();
        Surface surface = this.f7344I;
        if (surface != null) {
            if (this.f7345J) {
                surface.release();
            }
            this.f7344I = null;
        }
        InterfaceC1650s interfaceC1650s = this.f7354S;
        if (interfaceC1650s != null) {
            interfaceC1650s.mo7357a(this.f7341F);
        }
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: o */
    public final int mo6342o() {
        return this.f7356y.mo6342o();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: p */
    public final int mo6343p() {
        return this.f7356y.mo6343p();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: q */
    public final int mo6344q() {
        return this.f7356y.mo6344q();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: r */
    public final int mo6345r() {
        return this.f7356y.mo6345r();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: s */
    public final long mo6346s() {
        return this.f7356y.mo6346s();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: t */
    public final long mo6347t() {
        return this.f7356y.mo6347t();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: u */
    public final long mo6348u() {
        return this.f7356y.mo6348u();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: v */
    public final int mo6349v() {
        return this.f7356y.mo6349v();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: w */
    public final boolean mo6350w() {
        return this.f7356y.mo6350w();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: x */
    public final boolean mo6351x() {
        return this.f7356y.mo6351x();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: y */
    public final boolean mo6352y() {
        return this.f7356y.mo6352y();
    }

    @Override // com.anythink.expressad.exoplayer.InterfaceC1766w
    /* JADX INFO: renamed from: z */
    public final int mo6353z() {
        return this.f7356y.mo6353z();
    }
}
