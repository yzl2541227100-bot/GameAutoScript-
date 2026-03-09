package com.anythink.expressad.exoplayer.p105j.p106a;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p105j.C1692i;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.C1701r;
import com.anythink.expressad.exoplayer.p105j.C1709z;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1690g;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1672c implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    public static final long f9286a = 2097152;

    /* JADX INFO: renamed from: b */
    public static final int f9287b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f9288c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f9289d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f9290e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f9291f = 1;

    /* JADX INFO: renamed from: g */
    private static final int f9292g = -1;

    /* JADX INFO: renamed from: h */
    private static final long f9293h = 102400;

    /* JADX INFO: renamed from: A */
    private boolean f9294A;

    /* JADX INFO: renamed from: B */
    private long f9295B;

    /* JADX INFO: renamed from: C */
    private long f9296C;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1670a f9297i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1691h f9298j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1691h f9299k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC1691h f9300l;

    /* JADX INFO: renamed from: m */
    @Nullable
    private final b f9301m;

    /* JADX INFO: renamed from: n */
    private final boolean f9302n;

    /* JADX INFO: renamed from: o */
    private final boolean f9303o;

    /* JADX INFO: renamed from: p */
    private final boolean f9304p;

    /* JADX INFO: renamed from: q */
    private InterfaceC1691h f9305q;

    /* JADX INFO: renamed from: r */
    private boolean f9306r;

    /* JADX INFO: renamed from: s */
    private Uri f9307s;

    /* JADX INFO: renamed from: t */
    private Uri f9308t;

    /* JADX INFO: renamed from: u */
    private int f9309u;

    /* JADX INFO: renamed from: v */
    private String f9310v;

    /* JADX INFO: renamed from: w */
    private long f9311w;

    /* JADX INFO: renamed from: x */
    private long f9312x;

    /* JADX INFO: renamed from: y */
    private C1674e f9313y;

    /* JADX INFO: renamed from: z */
    private boolean f9314z;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.c$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m7745a();

        /* JADX INFO: renamed from: b */
        void m7746b();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.c$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public C1672c(InterfaceC1670a interfaceC1670a, InterfaceC1691h interfaceC1691h) {
        this(interfaceC1670a, interfaceC1691h, 0, (byte) 0);
    }

    private C1672c(InterfaceC1670a interfaceC1670a, InterfaceC1691h interfaceC1691h, int i) {
        this(interfaceC1670a, interfaceC1691h, i, (byte) 0);
    }

    private C1672c(InterfaceC1670a interfaceC1670a, InterfaceC1691h interfaceC1691h, int i, byte b2) {
        this(interfaceC1670a, interfaceC1691h, new C1701r(), new C1671b(interfaceC1670a), i, null);
    }

    private C1672c(InterfaceC1670a interfaceC1670a, InterfaceC1691h interfaceC1691h, InterfaceC1691h interfaceC1691h2, InterfaceC1690g interfaceC1690g, int i, @Nullable b bVar) {
        this.f9297i = interfaceC1670a;
        this.f9298j = interfaceC1691h2;
        this.f9302n = (i & 1) != 0;
        this.f9303o = (i & 2) != 0;
        this.f9304p = (i & 4) != 0;
        this.f9300l = interfaceC1691h;
        this.f9299k = new C1709z(interfaceC1691h, interfaceC1690g);
        this.f9301m = bVar;
    }

    /* JADX INFO: renamed from: a */
    private static Uri m7728a(InterfaceC1670a interfaceC1670a, String str, Uri uri) {
        String strMo7793a = interfaceC1670a.mo7717c(str).mo7793a("exo_redir", (String) null);
        Uri uri2 = strMo7793a != null ? Uri.parse(strMo7793a) : null;
        return uri2 == null ? uri : uri2;
    }

    /* JADX INFO: renamed from: a */
    private void m7729a(boolean z) throws InterruptedIOException {
        C1674e c1674eMo7702a;
        long jMin;
        C1694k c1694k;
        InterfaceC1691h interfaceC1691h;
        if (this.f9294A) {
            c1674eMo7702a = null;
        } else if (this.f9302n) {
            try {
                c1674eMo7702a = this.f9297i.mo7702a(this.f9310v, this.f9311w);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c1674eMo7702a = this.f9297i.mo7712b(this.f9310v, this.f9311w);
        }
        if (c1674eMo7702a == null) {
            interfaceC1691h = this.f9300l;
            c1694k = new C1694k(this.f9307s, this.f9311w, this.f9312x, this.f9310v, this.f9309u);
        } else if (c1674eMo7702a.f9318d) {
            Uri uriFromFile = Uri.fromFile(c1674eMo7702a.f9319e);
            long j = this.f9311w - c1674eMo7702a.f9316b;
            long jMin2 = c1674eMo7702a.f9317c - j;
            long j2 = this.f9312x;
            if (j2 != -1) {
                jMin2 = Math.min(jMin2, j2);
            }
            c1694k = new C1694k(uriFromFile, this.f9311w, j, jMin2, this.f9310v, this.f9309u);
            interfaceC1691h = this.f9298j;
        } else {
            if (c1674eMo7702a.m7750a()) {
                jMin = this.f9312x;
            } else {
                jMin = c1674eMo7702a.f9317c;
                long j3 = this.f9312x;
                if (j3 != -1) {
                    jMin = Math.min(jMin, j3);
                }
            }
            C1694k c1694k2 = new C1694k(this.f9307s, this.f9311w, jMin, this.f9310v, this.f9309u);
            InterfaceC1691h interfaceC1691h2 = this.f9299k;
            if (interfaceC1691h2 == null) {
                interfaceC1691h2 = this.f9300l;
                this.f9297i.mo7706a(c1674eMo7702a);
                c1674eMo7702a = null;
            }
            c1694k = c1694k2;
            interfaceC1691h = interfaceC1691h2;
        }
        this.f9296C = (this.f9294A || interfaceC1691h != this.f9300l) ? Long.MAX_VALUE : this.f9311w + 102400;
        if (z) {
            C1711a.m8012b(m7735e());
            if (interfaceC1691h == this.f9300l) {
                return;
            }
            try {
                m7738h();
            } catch (Throwable th) {
                if (c1674eMo7702a.m7751b()) {
                    this.f9297i.mo7706a(c1674eMo7702a);
                }
                throw th;
            }
        }
        if (c1674eMo7702a != null && c1674eMo7702a.m7751b()) {
            this.f9313y = c1674eMo7702a;
        }
        this.f9305q = interfaceC1691h;
        this.f9306r = c1694k.f9399g == -1;
        long jMo7742a = interfaceC1691h.mo7742a(c1694k);
        C1680k c1680k = new C1680k();
        if (this.f9306r && jMo7742a != -1) {
            this.f9312x = jMo7742a;
            C1679j.m7798a(c1680k, this.f9311w + jMo7742a);
        }
        if (m7734d()) {
            Uri uriMo7743a = this.f9305q.mo7743a();
            this.f9308t = uriMo7743a;
            if (true ^ this.f9307s.equals(uriMo7743a)) {
                C1679j.m7799a(c1680k, this.f9308t);
            } else {
                c1680k.m7804a("exo_redir");
            }
        }
        if (m7737g()) {
            this.f9297i.mo7708a(this.f9310v, c1680k);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m7730a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C1692i) && ((C1692i) cause).f9386b == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private int m7731b(C1694k c1694k) {
        if (this.f9303o && this.f9314z) {
            return 0;
        }
        return (this.f9304p && c1694k.f9399g == -1) ? 1 : -1;
    }

    /* JADX INFO: renamed from: b */
    private void m7732b(IOException iOException) {
        if (m7736f() || (iOException instanceof InterfaceC1670a.a)) {
            this.f9314z = true;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m7733c() {
        this.f9312x = 0L;
        if (m7737g()) {
            this.f9297i.mo7719d(this.f9310v, this.f9311w);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m7734d() {
        return !m7736f();
    }

    /* JADX INFO: renamed from: e */
    private boolean m7735e() {
        return this.f9305q == this.f9300l;
    }

    /* JADX INFO: renamed from: f */
    private boolean m7736f() {
        return this.f9305q == this.f9298j;
    }

    /* JADX INFO: renamed from: g */
    private boolean m7737g() {
        return this.f9305q == this.f9299k;
    }

    /* JADX INFO: renamed from: h */
    private void m7738h() {
        InterfaceC1691h interfaceC1691h = this.f9305q;
        if (interfaceC1691h == null) {
            return;
        }
        try {
            interfaceC1691h.mo7744b();
        } finally {
            this.f9305q = null;
            this.f9306r = false;
            C1674e c1674e = this.f9313y;
            if (c1674e != null) {
                this.f9297i.mo7706a(c1674e);
                this.f9313y = null;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m7739i() {
    }

    /* JADX INFO: renamed from: j */
    private void m7740j() {
        if (this.f9301m == null || this.f9295B <= 0) {
            return;
        }
        this.f9297i.mo7716c();
        this.f9295B = 0L;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) throws IOException {
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.f9312x == 0) {
            return -1;
        }
        try {
            if (this.f9311w >= this.f9296C) {
                m7729a(true);
            }
            int iMo7741a = this.f9305q.mo7741a(bArr, i, i2);
            if (iMo7741a != -1) {
                if (m7736f()) {
                    this.f9295B += (long) iMo7741a;
                }
                long j = iMo7741a;
                this.f9311w += j;
                long j2 = this.f9312x;
                if (j2 != -1) {
                    this.f9312x = j2 - j;
                }
            } else {
                if (!this.f9306r) {
                    long j3 = this.f9312x;
                    if (j3 <= 0) {
                        if (j3 == -1) {
                        }
                    }
                    m7738h();
                    m7729a(false);
                    return mo7741a(bArr, i, i2);
                }
                m7733c();
            }
            return iMo7741a;
        } catch (IOException e) {
            if (this.f9306r) {
                Throwable cause = e;
                while (true) {
                    if (cause != null) {
                        if ((cause instanceof C1692i) && ((C1692i) cause).f9386b == 0) {
                            z = true;
                            break;
                        }
                        cause = cause.getCause();
                    } else {
                        break;
                    }
                }
                if (z) {
                    m7733c();
                    return -1;
                }
            }
            m7732b(e);
            throw e;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final long mo7742a(C1694k c1694k) throws IOException {
        try {
            String strM7754a = C1675f.m7754a(c1694k);
            this.f9310v = strM7754a;
            Uri uri = c1694k.f9395c;
            this.f9307s = uri;
            Uri uri2 = null;
            String strMo7793a = this.f9297i.mo7717c(strM7754a).mo7793a("exo_redir", (String) null);
            if (strMo7793a != null) {
                uri2 = Uri.parse(strMo7793a);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f9308t = uri;
            this.f9309u = c1694k.f9401i;
            this.f9311w = c1694k.f9398f;
            boolean z = true;
            if (((this.f9303o && this.f9314z) ? (byte) 0 : (this.f9304p && c1694k.f9399g == -1) ? (byte) 1 : (byte) -1) == -1) {
                z = false;
            }
            this.f9294A = z;
            long j = c1694k.f9399g;
            if (j != -1 || z) {
                this.f9312x = j;
            } else {
                long jMo7710b = this.f9297i.mo7710b(this.f9310v);
                this.f9312x = jMo7710b;
                if (jMo7710b != -1) {
                    long j2 = jMo7710b - c1694k.f9398f;
                    this.f9312x = j2;
                    if (j2 <= 0) {
                        throw new C1692i();
                    }
                }
            }
            m7729a(false);
            return this.f9312x;
        } catch (IOException e) {
            m7732b(e);
            throw e;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9308t;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() throws IOException {
        this.f9307s = null;
        this.f9308t = null;
        if (this.f9301m != null && this.f9295B > 0) {
            this.f9297i.mo7716c();
            this.f9295B = 0L;
        }
        try {
            m7738h();
        } catch (IOException e) {
            m7732b(e);
            throw e;
        }
    }
}
