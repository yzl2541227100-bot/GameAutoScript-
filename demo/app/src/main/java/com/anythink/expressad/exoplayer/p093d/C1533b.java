package com.anythink.expressad.exoplayer.p093d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1534c;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1537f;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1540i;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1541j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.b */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
public final class C1533b<T extends InterfaceC1540i> implements InterfaceC1537f<T> {

    /* JADX INFO: renamed from: i */
    private static final String f7925i = "DefaultDrmSession";

    /* JADX INFO: renamed from: j */
    private static final int f7926j = 0;

    /* JADX INFO: renamed from: k */
    private static final int f7927k = 1;

    /* JADX INFO: renamed from: l */
    private static final int f7928l = 60;

    /* JADX INFO: renamed from: A */
    private byte[] f7929A;

    /* JADX INFO: renamed from: B */
    private Object f7930B;

    /* JADX INFO: renamed from: C */
    private Object f7931C;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1545n f7932a;

    /* JADX INFO: renamed from: b */
    public final UUID f7933b;

    /* JADX INFO: renamed from: c */
    public final C1533b<T>.b f7934c;

    /* JADX INFO: renamed from: m */
    private final InterfaceC1541j<T> f7935m;

    /* JADX INFO: renamed from: n */
    private final c<T> f7936n;

    /* JADX INFO: renamed from: o */
    private final C1536e.a f7937o;

    /* JADX INFO: renamed from: p */
    private final int f7938p;

    /* JADX INFO: renamed from: q */
    private final HashMap<String, String> f7939q;

    /* JADX INFO: renamed from: r */
    private final InterfaceC1534c.a f7940r;

    /* JADX INFO: renamed from: s */
    private final int f7941s;

    /* JADX INFO: renamed from: t */
    private int f7942t;

    /* JADX INFO: renamed from: u */
    private int f7943u;

    /* JADX INFO: renamed from: v */
    private HandlerThread f7944v;

    /* JADX INFO: renamed from: w */
    private C1533b<T>.a f7945w;

    /* JADX INFO: renamed from: x */
    private T f7946x;

    /* JADX INFO: renamed from: y */
    private InterfaceC1537f.a f7947y;

    /* JADX INFO: renamed from: z */
    private byte[] f7948z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.b$a */
    @SuppressLint({"HandlerLeak"})
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        private static long m6732a(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        /* JADX INFO: renamed from: a */
        private boolean m6733a(Message message) {
            int i;
            if (!(message.arg1 == 1) || (i = message.arg2 + 1) > C1533b.this.f7941s) {
                return false;
            }
            Message messageObtain = Message.obtain(message);
            messageObtain.arg2 = i;
            sendMessageDelayed(messageObtain, Math.min((i - 1) * 1000, 5000));
            return true;
        }

        /* JADX INFO: renamed from: a */
        public final void m6734a(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i;
            Object objM6806a;
            Object obj = message.obj;
            boolean z = true;
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    objM6806a = C1533b.this.f7932a.m6806a();
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    Pair pair = (Pair) obj;
                    Object obj2 = pair.first;
                    Object obj3 = pair.second;
                    objM6806a = C1533b.this.f7932a.m6807b();
                }
            } catch (Exception e) {
                if ((message.arg1 == 1) && (i = message.arg2 + 1) <= C1533b.this.f7941s) {
                    Message messageObtain = Message.obtain(message);
                    messageObtain.arg2 = i;
                    sendMessageDelayed(messageObtain, Math.min((i - 1) * 1000, 5000));
                } else {
                    z = false;
                }
                if (z) {
                    return;
                } else {
                    objM6806a = e;
                }
            }
            C1533b.this.f7934c.obtainMessage(message.what, Pair.create(obj, objM6806a)).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.b$b */
    @SuppressLint({"HandlerLeak"})
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C1533b.m6707a(C1533b.this, obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                C1533b.m6710b(C1533b.this, obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.b$c */
    public interface c<T extends InterfaceC1540i> {
        /* JADX INFO: renamed from: a */
        void mo6735a();

        /* JADX INFO: renamed from: a */
        void mo6736a(C1533b<T> c1533b);

        /* JADX INFO: renamed from: a */
        void mo6737a(Exception exc);
    }

    public C1533b(UUID uuid, InterfaceC1541j<T> interfaceC1541j, c<T> cVar, @Nullable C1536e.a aVar, int i, @Nullable byte[] bArr, HashMap<String, String> map, InterfaceC1545n interfaceC1545n, Looper looper, InterfaceC1534c.a aVar2, int i2) {
        this.f7933b = uuid;
        this.f7936n = cVar;
        this.f7935m = interfaceC1541j;
        this.f7938p = i;
        this.f7929A = bArr;
        this.f7937o = bArr != null ? null : aVar;
        this.f7939q = map;
        this.f7932a = interfaceC1545n;
        this.f7941s = i2;
        this.f7940r = aVar2;
        this.f7942t = 2;
        this.f7934c = new b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f7944v = handlerThread;
        handlerThread.start();
        this.f7945w = new a(this.f7944v.getLooper());
    }

    /* JADX INFO: renamed from: a */
    private void m6706a(int i, boolean z) {
        String str;
        byte[] bArr;
        String str2;
        byte[] bArr2 = i == 3 ? this.f7929A : this.f7948z;
        C1536e.a aVar = this.f7937o;
        if (aVar != null) {
            byte[] bArr3 = aVar.f7991c;
            String str3 = aVar.f7990b;
            str = aVar.f7989a;
            str2 = str3;
            bArr = bArr3;
        } else {
            str = null;
            bArr = null;
            str2 = null;
        }
        try {
            Pair pairCreate = Pair.create(this.f7935m.mo6779a(bArr2, bArr, str2, i, this.f7939q), str);
            this.f7930B = pairCreate;
            this.f7945w.m6734a(1, pairCreate, z);
        } catch (Exception e) {
            m6711b(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6707a(C1533b c1533b, Object obj, Object obj2) {
        if (obj == c1533b.f7931C) {
            if (c1533b.f7942t == 2 || c1533b.m6718n()) {
                c1533b.f7931C = null;
                if (obj2 instanceof Exception) {
                    c1533b.f7936n.mo6737a((Exception) obj2);
                    return;
                }
                try {
                    c1533b.f7935m.mo6789b((byte[]) obj2);
                    c1533b.f7936n.mo6735a();
                } catch (Exception e) {
                    c1533b.f7936n.mo6737a(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6708a(Object obj, Object obj2) {
        if (obj == this.f7931C) {
            if (this.f7942t == 2 || m6718n()) {
                this.f7931C = null;
                if (obj2 instanceof Exception) {
                    this.f7936n.mo6737a((Exception) obj2);
                    return;
                }
                try {
                    this.f7935m.mo6789b((byte[]) obj2);
                    this.f7936n.mo6735a();
                } catch (Exception e) {
                    this.f7936n.mo6737a(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m6709a(boolean z) {
        int i = this.f7938p;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3 && m6715k()) {
                    m6706a(3, z);
                    return;
                }
                return;
            }
            if (this.f7929A == null) {
                m6706a(2, z);
                return;
            } else {
                if (m6715k()) {
                    m6706a(2, z);
                    return;
                }
                return;
            }
        }
        if (this.f7929A == null) {
            m6706a(1, z);
            return;
        }
        if (this.f7942t == 4 || m6715k()) {
            long jM6716l = m6716l();
            if (this.f7938p == 0 && jM6716l <= 60) {
                Log.d(f7925i, "Offline license has expired or will expire soon. Remaining seconds: ".concat(String.valueOf(jM6716l)));
                m6706a(2, z);
            } else if (jM6716l <= 0) {
                m6713c(new C1544m());
            } else {
                this.f7942t = 4;
                this.f7940r.m6742b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6710b(C1533b c1533b, Object obj, Object obj2) {
        if (obj == c1533b.f7930B && c1533b.m6718n()) {
            c1533b.f7930B = null;
            if (obj2 instanceof Exception) {
                c1533b.m6711b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (c1533b.f7938p == 3) {
                    c1533b.f7935m.mo6787a(c1533b.f7929A, bArr);
                    c1533b.f7940r.m6743c();
                    return;
                }
                byte[] bArrMo6787a = c1533b.f7935m.mo6787a(c1533b.f7948z, bArr);
                int i = c1533b.f7938p;
                if ((i == 2 || (i == 0 && c1533b.f7929A != null)) && bArrMo6787a != null && bArrMo6787a.length != 0) {
                    c1533b.f7929A = bArrMo6787a;
                }
                c1533b.f7942t = 4;
                c1533b.f7940r.m6738a();
            } catch (Exception e) {
                c1533b.m6711b(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6711b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f7936n.mo6736a(this);
        } else {
            m6713c(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m6712b(Object obj, Object obj2) {
        if (obj == this.f7930B && m6718n()) {
            this.f7930B = null;
            if (obj2 instanceof Exception) {
                m6711b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f7938p == 3) {
                    this.f7935m.mo6787a(this.f7929A, bArr);
                    this.f7940r.m6743c();
                    return;
                }
                byte[] bArrMo6787a = this.f7935m.mo6787a(this.f7948z, bArr);
                int i = this.f7938p;
                if ((i == 2 || (i == 0 && this.f7929A != null)) && bArrMo6787a != null && bArrMo6787a.length != 0) {
                    this.f7929A = bArrMo6787a;
                }
                this.f7942t = 4;
                this.f7940r.m6738a();
            } catch (Exception e) {
                m6711b(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m6713c(Exception exc) {
        this.f7947y = new InterfaceC1537f.a(exc);
        this.f7940r.m6741a(exc);
        if (this.f7942t != 4) {
            this.f7942t = 1;
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m6714j() {
        if (m6718n()) {
            return true;
        }
        try {
            byte[] bArrMo6786a = this.f7935m.mo6786a();
            this.f7948z = bArrMo6786a;
            this.f7946x = (T) this.f7935m.mo6794d(bArrMo6786a);
            this.f7942t = 3;
            return true;
        } catch (Exception e) {
            m6713c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m6715k() {
        try {
            this.f7935m.mo6790b(this.f7948z, this.f7929A);
            return true;
        } catch (Exception e) {
            Log.e(f7925i, "Error trying to restore Widevine keys.", e);
            m6713c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    private long m6716l() {
        if (!C1500b.f7471bk.equals(this.f7933b)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> pairM6809a = C1547p.m6809a(this);
        return Math.min(((Long) pairM6809a.first).longValue(), ((Long) pairM6809a.second).longValue());
    }

    /* JADX INFO: renamed from: m */
    private void m6717m() {
        if (this.f7942t == 4) {
            this.f7942t = 3;
            m6713c(new C1544m());
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m6718n() {
        int i = this.f7942t;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: a */
    public final void m6719a() {
        int i = this.f7943u + 1;
        this.f7943u = i;
        if (i == 1 && this.f7942t != 1 && m6714j()) {
            m6709a(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6720a(int i) {
        if (m6718n()) {
            if (i == 1) {
                this.f7942t = 3;
                this.f7936n.mo6736a(this);
            } else if (i == 2) {
                m6709a(false);
            } else if (i == 3 && this.f7942t == 4) {
                this.f7942t = 3;
                m6713c(new C1544m());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6721a(Exception exc) {
        m6713c(exc);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6722a(byte[] bArr) {
        C1536e.a aVar = this.f7937o;
        return Arrays.equals(aVar != null ? aVar.f7991c : null, bArr);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6723b() {
        int i = this.f7943u - 1;
        this.f7943u = i;
        if (i != 0) {
            return false;
        }
        this.f7942t = 0;
        this.f7934c.removeCallbacksAndMessages(null);
        this.f7945w.removeCallbacksAndMessages(null);
        this.f7945w = null;
        this.f7944v.quit();
        this.f7944v = null;
        this.f7946x = null;
        this.f7947y = null;
        this.f7930B = null;
        this.f7931C = null;
        byte[] bArr = this.f7948z;
        if (bArr != null) {
            this.f7935m.mo6785a(bArr);
            this.f7948z = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6724b(byte[] bArr) {
        return Arrays.equals(this.f7948z, bArr);
    }

    /* JADX INFO: renamed from: c */
    public final void m6725c() {
        InterfaceC1541j.h hVarMo6788b = this.f7935m.mo6788b();
        this.f7931C = hVarMo6788b;
        this.f7945w.m6734a(0, hVarMo6788b, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m6726d() {
        if (m6714j()) {
            m6709a(true);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1537f
    /* JADX INFO: renamed from: e */
    public final int mo6727e() {
        return this.f7942t;
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1537f
    /* JADX INFO: renamed from: f */
    public final InterfaceC1537f.a mo6728f() {
        if (this.f7942t == 1) {
            return this.f7947y;
        }
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1537f
    /* JADX INFO: renamed from: g */
    public final T mo6729g() {
        return this.f7946x;
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1537f
    /* JADX INFO: renamed from: h */
    public final Map<String, String> mo6730h() {
        byte[] bArr = this.f7948z;
        if (bArr == null) {
            return null;
        }
        return this.f7935m.mo6792c(bArr);
    }

    @Override // com.anythink.expressad.exoplayer.p093d.InterfaceC1537f
    /* JADX INFO: renamed from: i */
    public final byte[] mo6731i() {
        return this.f7929A;
    }
}
