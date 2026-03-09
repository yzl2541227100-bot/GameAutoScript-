package com.anythink.expressad.exoplayer.p105j;

import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1687d;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1742y;
import com.anythink.expressad.exoplayer.p107k.InterfaceC1720c;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1696m implements InterfaceC1684aa<Object>, InterfaceC1687d {

    /* JADX INFO: renamed from: a */
    public static final long f9411a = 1000000;

    /* JADX INFO: renamed from: b */
    public static final int f9412b = 2000;

    /* JADX INFO: renamed from: c */
    private static final int f9413c = 2000;

    /* JADX INFO: renamed from: d */
    private static final int f9414d = 524288;

    /* JADX INFO: renamed from: e */
    @Nullable
    private final Handler f9415e;

    /* JADX INFO: renamed from: f */
    @Nullable
    private final InterfaceC1687d.a f9416f;

    /* JADX INFO: renamed from: g */
    private final C1742y f9417g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1720c f9418h;

    /* JADX INFO: renamed from: i */
    private int f9419i;

    /* JADX INFO: renamed from: j */
    private long f9420j;

    /* JADX INFO: renamed from: k */
    private long f9421k;

    /* JADX INFO: renamed from: l */
    private long f9422l;

    /* JADX INFO: renamed from: m */
    private long f9423m;

    /* JADX INFO: renamed from: n */
    private long f9424n;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f9425a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f9426b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f9427c;

        public AnonymousClass1(int i, long j, long j2) {
            this.f9425a = i;
            this.f9426b = j;
            this.f9427c = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1696m.this.f9416f.mo6186c();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        @Nullable
        private Handler f9429a;

        /* JADX INFO: renamed from: b */
        @Nullable
        private InterfaceC1687d.a f9430b;

        /* JADX INFO: renamed from: c */
        private long f9431c = 1000000;

        /* JADX INFO: renamed from: d */
        private int f9432d = 2000;

        /* JADX INFO: renamed from: e */
        private InterfaceC1720c f9433e = InterfaceC1720c.f9643a;

        /* JADX INFO: renamed from: a */
        private a m7863a(int i) {
            this.f9432d = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m7864a(long j) {
            this.f9431c = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m7865a(Handler handler, InterfaceC1687d.a aVar) {
            C1711a.m8010a((handler == null || aVar == null) ? false : true);
            this.f9429a = handler;
            this.f9430b = aVar;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m7866a(InterfaceC1720c interfaceC1720c) {
            this.f9433e = interfaceC1720c;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private C1696m m7867a() {
            return new C1696m(this.f9429a, this.f9430b, this.f9431c, this.f9432d, this.f9433e, (byte) 0);
        }
    }

    public C1696m() {
        this(null, null, 1000000L, 2000, InterfaceC1720c.f9643a);
    }

    @Deprecated
    private C1696m(Handler handler, InterfaceC1687d.a aVar) {
        this(handler, aVar, 1000000L, 2000, InterfaceC1720c.f9643a);
    }

    @Deprecated
    private C1696m(Handler handler, InterfaceC1687d.a aVar, int i) {
        this(handler, aVar, 1000000L, i, InterfaceC1720c.f9643a);
    }

    private C1696m(@Nullable Handler handler, @Nullable InterfaceC1687d.a aVar, long j, int i, InterfaceC1720c interfaceC1720c) {
        this.f9415e = handler;
        this.f9416f = aVar;
        this.f9417g = new C1742y(i);
        this.f9418h = interfaceC1720c;
        this.f9424n = j;
    }

    public /* synthetic */ C1696m(Handler handler, InterfaceC1687d.a aVar, long j, int i, InterfaceC1720c interfaceC1720c, byte b) {
        this(handler, aVar, j, i, interfaceC1720c);
    }

    /* JADX INFO: renamed from: a */
    private void m7862a(int i, long j, long j2) {
        Handler handler = this.f9415e;
        if (handler == null || this.f9416f == null) {
            return;
        }
        handler.post(new AnonymousClass1(i, j, j2));
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1687d
    /* JADX INFO: renamed from: a */
    public final synchronized long mo7849a() {
        return this.f9424n;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1684aa
    /* JADX INFO: renamed from: a */
    public final synchronized void mo7840a(int i) {
        this.f9421k += (long) i;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1684aa
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7841b() {
        if (this.f9419i == 0) {
            this.f9420j = this.f9418h.mo8014a();
        }
        this.f9419i++;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1684aa
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7842c() {
        C1711a.m8012b(this.f9419i > 0);
        long jMo8014a = this.f9418h.mo8014a();
        int i = (int) (jMo8014a - this.f9420j);
        this.f9422l += i;
        long j = this.f9423m;
        long j2 = this.f9421k;
        this.f9423m = j + j2;
        if (i > 0) {
            this.f9417g.m8311a((int) Math.sqrt(j2), (8000 * j2) / r6);
            if (this.f9422l >= C1659a.f9130f || this.f9423m >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                this.f9424n = (long) this.f9417g.m8310a();
            }
        }
        long j3 = this.f9421k;
        long j4 = this.f9424n;
        Handler handler = this.f9415e;
        if (handler != null && this.f9416f != null) {
            handler.post(new AnonymousClass1(i, j3, j4));
        }
        int i2 = this.f9419i - 1;
        this.f9419i = i2;
        if (i2 > 0) {
            this.f9420j = jMo8014a;
        }
        this.f9421k = 0L;
    }
}
