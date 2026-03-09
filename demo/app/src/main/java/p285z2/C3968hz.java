package p285z2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p285z2.C3746bz;

/* JADX INFO: renamed from: z2.hz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3968hz {
    public static final /* synthetic */ boolean OooOOO0 = false;
    public final OooO00o OooO;
    public long OooO00o = 0;
    public long OooO0O0;
    public final int OooO0OO;
    public final C3894fz OooO0Oo;
    private C3746bz.OooO00o OooO0o;
    private final Deque<C3966hx> OooO0o0;
    private boolean OooO0oO;
    private final OooO0O0 OooO0oo;
    public final OooO0OO OooOO0;
    public final OooO0OO OooOO0O;
    public ErrorCode OooOO0o;

    /* JADX INFO: renamed from: z2.hz$OooO00o */
    public final class OooO00o implements b10 {
        private static final long OooooO0 = 16384;
        public static final /* synthetic */ boolean OooooOO = false;
        private final h00 OoooOoO = new h00();
        public boolean OoooOoo;
        public boolean Ooooo00;

        public OooO00o() {
        }

        private void OooOO0(boolean z) throws IOException {
            C3968hz c3968hz;
            long jMin;
            C3968hz c3968hz2;
            synchronized (C3968hz.this) {
                C3968hz.this.OooOO0O.OooOOO0();
                while (true) {
                    try {
                        c3968hz = C3968hz.this;
                        if (c3968hz.OooO0O0 > 0 || this.Ooooo00 || this.OoooOoo || c3968hz.OooOO0o != null) {
                            break;
                        } else {
                            c3968hz.OooOo0o();
                        }
                    } finally {
                    }
                }
                c3968hz.OooOO0O.OooOo0o();
                C3968hz.this.OooO0o0();
                jMin = Math.min(C3968hz.this.OooO0O0, this.OoooOoO.o00000O0());
                c3968hz2 = C3968hz.this;
                c3968hz2.OooO0O0 -= jMin;
            }
            c3968hz2.OooOO0O.OooOOO0();
            try {
                C3968hz c3968hz3 = C3968hz.this;
                c3968hz3.OooO0Oo.o000000o(c3968hz3.OooO0OO, z && jMin == this.OoooOoO.o00000O0(), this.OoooOoO, jMin);
            } finally {
            }
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            this.OoooOoO.OooOooO(h00Var, j);
            while (this.OoooOoO.o00000O0() >= 16384) {
                OooOO0(false);
            }
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (C3968hz.this) {
                if (this.OoooOoo) {
                    return;
                }
                if (!C3968hz.this.OooO.Ooooo00) {
                    if (this.OoooOoO.o00000O0() > 0) {
                        while (this.OoooOoO.o00000O0() > 0) {
                            OooOO0(true);
                        }
                    } else {
                        C3968hz c3968hz = C3968hz.this;
                        c3968hz.OooO0Oo.o000000o(c3968hz.OooO0OO, true, null, 0L);
                    }
                }
                synchronized (C3968hz.this) {
                    this.OoooOoo = true;
                }
                C3968hz.this.OooO0Oo.flush();
                C3968hz.this.OooO0Oo();
            }
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
            synchronized (C3968hz.this) {
                C3968hz.this.OooO0o0();
            }
            while (this.OoooOoO.o00000O0() > 0) {
                OooOO0(false);
                C3968hz.this.OooO0Oo.flush();
            }
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return C3968hz.this.OooOO0O;
        }
    }

    /* JADX INFO: renamed from: z2.hz$OooO0O0 */
    public final class OooO0O0 implements c10 {
        public static final /* synthetic */ boolean OooooOo = false;
        private final h00 OoooOoO = new h00();
        private final h00 OoooOoo = new h00();
        private final long Ooooo00;
        public boolean Ooooo0o;
        public boolean OooooO0;

        public OooO0O0(long j) {
            this.Ooooo00 = j;
        }

        private void OooooOo(long j) {
            C3968hz.this.OooO0Oo.o000000O(j);
        }

        public void OooOO0(j00 j00Var, long j) throws IOException {
            boolean z;
            boolean z3;
            boolean z4;
            while (j > 0) {
                synchronized (C3968hz.this) {
                    z = this.OooooO0;
                    z3 = true;
                    z4 = this.OoooOoo.o00000O0() + j > this.Ooooo00;
                }
                if (z4) {
                    j00Var.skip(j);
                    C3968hz.this.OooO0oo(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    j00Var.skip(j);
                    return;
                }
                long j2 = j00Var.read(this.OoooOoO, j);
                if (j2 == -1) {
                    throw new EOFException();
                }
                j -= j2;
                synchronized (C3968hz.this) {
                    if (this.OoooOoo.o00000O0() != 0) {
                        z3 = false;
                    }
                    this.OoooOoo.Oooo000(this.OoooOoO);
                    if (z3) {
                        C3968hz.this.notifyAll();
                    }
                }
            }
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long jO00000O0;
            C3746bz.OooO00o oooO00o;
            ArrayList arrayList;
            synchronized (C3968hz.this) {
                this.Ooooo0o = true;
                jO00000O0 = this.OoooOoo.o00000O0();
                this.OoooOoo.OooooOo();
                oooO00o = null;
                if (C3968hz.this.OooO0o0.isEmpty() || C3968hz.this.OooO0o == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(C3968hz.this.OooO0o0);
                    C3968hz.this.OooO0o0.clear();
                    oooO00o = C3968hz.this.OooO0o;
                    arrayList = arrayList2;
                }
                C3968hz.this.notifyAll();
            }
            if (jO00000O0 > 0) {
                OooooOo(jO00000O0);
            }
            C3968hz.this.OooO0Oo();
            if (oooO00o != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    oooO00o.OooO00o((C3966hx) it.next());
                }
            }
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            ErrorCode errorCode;
            long j2;
            C3966hx c3966hx;
            C3746bz.OooO00o oooO00o;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            while (true) {
                synchronized (C3968hz.this) {
                    C3968hz.this.OooOO0.OooOOO0();
                    try {
                        C3968hz c3968hz = C3968hz.this;
                        errorCode = c3968hz.OooOO0o;
                        if (errorCode == null) {
                            errorCode = null;
                        }
                        if (!this.Ooooo0o) {
                            if (!c3968hz.OooO0o0.isEmpty() && C3968hz.this.OooO0o != null) {
                                c3966hx = (C3966hx) C3968hz.this.OooO0o0.removeFirst();
                                oooO00o = C3968hz.this.OooO0o;
                            } else if (this.OoooOoo.o00000O0() > 0) {
                                h00 h00Var2 = this.OoooOoo;
                                j2 = h00Var2.read(h00Var, Math.min(j, h00Var2.o00000O0()));
                                C3968hz c3968hz2 = C3968hz.this;
                                long j3 = c3968hz2.OooO00o + j2;
                                c3968hz2.OooO00o = j3;
                                if (errorCode == null && j3 >= c3968hz2.OooO0Oo.o00O0O.OooO0o0() / 2) {
                                    C3968hz c3968hz3 = C3968hz.this;
                                    c3968hz3.OooO0Oo.o00000o0(c3968hz3.OooO0OO, c3968hz3.OooO00o);
                                    C3968hz.this.OooO00o = 0L;
                                }
                                c3966hx = null;
                                oooO00o = null;
                                if (c3966hx == null || oooO00o == null) {
                                    break;
                                }
                                oooO00o.OooO00o(c3966hx);
                            } else if (this.OooooO0 || errorCode != null) {
                                c3966hx = null;
                                oooO00o = null;
                            } else {
                                C3968hz.this.OooOo0o();
                                C3968hz.this.OooOO0.OooOo0o();
                            }
                            j2 = -1;
                            if (c3966hx == null) {
                                break;
                            }
                            break;
                            break;
                        }
                        throw new IOException("stream closed");
                    } finally {
                    }
                }
            }
            if (j2 != -1) {
                OooooOo(j2);
                return j2;
            }
            if (errorCode == null) {
                return -1L;
            }
            throw new StreamResetException(errorCode);
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return C3968hz.this.OooOO0;
        }
    }

    /* JADX INFO: renamed from: z2.hz$OooO0OO */
    public class OooO0OO extends f00 {
        public OooO0OO() {
        }

        @Override // p285z2.f00
        public IOException OooOOo0(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p285z2.f00
        public void OooOo0O() {
            C3968hz.this.OooO0oo(ErrorCode.CANCEL);
        }

        public void OooOo0o() throws IOException {
            if (OooOOOo()) {
                throw OooOOo0(null);
            }
        }
    }

    public C3968hz(int i, C3894fz c3894fz, boolean z, boolean z3, @Nullable C3966hx c3966hx) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.OooO0o0 = arrayDeque;
        this.OooOO0 = new OooO0OO();
        this.OooOO0O = new OooO0OO();
        this.OooOO0o = null;
        Objects.requireNonNull(c3894fz, "connection == null");
        this.OooO0OO = i;
        this.OooO0Oo = c3894fz;
        this.OooO0O0 = c3894fz.o00Oo0.OooO0o0();
        OooO0O0 oooO0O0 = new OooO0O0(c3894fz.o00O0O.OooO0o0());
        this.OooO0oo = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        this.OooO = oooO00o;
        oooO0O0.OooooO0 = z3;
        oooO00o.Ooooo00 = z;
        if (c3966hx != null) {
            arrayDeque.add(c3966hx);
        }
        if (OooOOO() && c3966hx != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!OooOOO() && c3966hx == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private boolean OooO0oO(ErrorCode errorCode) {
        synchronized (this) {
            if (this.OooOO0o != null) {
                return false;
            }
            if (this.OooO0oo.OooooO0 && this.OooO.Ooooo00) {
                return false;
            }
            this.OooOO0o = errorCode;
            notifyAll();
            this.OooO0Oo.o0OO00O(this.OooO0OO);
            return true;
        }
    }

    public C3894fz OooO() {
        return this.OooO0Oo;
    }

    public void OooO0OO(long j) {
        this.OooO0O0 += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0Oo() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            z2.hz$OooO0O0 r0 = r2.OooO0oo     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.OooooO0     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L17
            boolean r0 = r0.Ooooo0o     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
            z2.hz$OooO00o r0 = r2.OooO     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.Ooooo00     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L15
            boolean r0 = r0.OoooOoo     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            boolean r1 = r2.OooOOOO()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L25
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2.OooO0o(r0)
            goto L2e
        L25:
            if (r1 != 0) goto L2e
            z2.fz r0 = r2.OooO0Oo
            int r1 = r2.OooO0OO
            r0.o0OO00O(r1)
        L2e:
            return
        L2f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3968hz.OooO0Oo():void");
    }

    public void OooO0o(ErrorCode errorCode) throws IOException {
        if (OooO0oO(errorCode)) {
            this.OooO0Oo.o00000OO(this.OooO0OO, errorCode);
        }
    }

    public void OooO0o0() throws IOException {
        OooO00o oooO00o = this.OooO;
        if (oooO00o.OoooOoo) {
            throw new IOException("stream closed");
        }
        if (oooO00o.Ooooo00) {
            throw new IOException("stream finished");
        }
        if (this.OooOO0o != null) {
            throw new StreamResetException(this.OooOO0o);
        }
    }

    public void OooO0oo(ErrorCode errorCode) {
        if (OooO0oO(errorCode)) {
            this.OooO0Oo.o00000Oo(this.OooO0OO, errorCode);
        }
    }

    public synchronized ErrorCode OooOO0() {
        return this.OooOO0o;
    }

    public int OooOO0O() {
        return this.OooO0OO;
    }

    public b10 OooOO0o() {
        synchronized (this) {
            if (!this.OooO0oO && !OooOOO()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.OooO;
    }

    public boolean OooOOO() {
        return this.OooO0Oo.OoooOoO == ((this.OooO0OO & 1) == 1);
    }

    public c10 OooOOO0() {
        return this.OooO0oo;
    }

    public synchronized boolean OooOOOO() {
        if (this.OooOO0o != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.OooO0oo;
        if (oooO0O0.OooooO0 || oooO0O0.Ooooo0o) {
            OooO00o oooO00o = this.OooO;
            if (oooO00o.Ooooo00 || oooO00o.OoooOoo) {
                if (this.OooO0oO) {
                    return false;
                }
            }
        }
        return true;
    }

    public d10 OooOOOo() {
        return this.OooOO0;
    }

    public void OooOOo() {
        boolean zOooOOOO;
        synchronized (this) {
            this.OooO0oo.OooooO0 = true;
            zOooOOOO = OooOOOO();
            notifyAll();
        }
        if (zOooOOOO) {
            return;
        }
        this.OooO0Oo.o0OO00O(this.OooO0OO);
    }

    public void OooOOo0(j00 j00Var, int i) throws IOException {
        this.OooO0oo.OooOO0(j00Var, i);
    }

    public void OooOOoo(List<C3746bz> list) {
        boolean zOooOOOO;
        synchronized (this) {
            this.OooO0oO = true;
            this.OooO0o0.add(C4558xx.Oooo0(list));
            zOooOOOO = OooOOOO();
            notifyAll();
        }
        if (zOooOOOO) {
            return;
        }
        this.OooO0Oo.o0OO00O(this.OooO0OO);
    }

    public void OooOo(List<C3746bz> list, boolean z) throws IOException {
        boolean z3;
        boolean z4;
        boolean z5;
        Objects.requireNonNull(list, "headers == null");
        synchronized (this) {
            z3 = true;
            this.OooO0oO = true;
            if (z) {
                z4 = false;
                z5 = false;
            } else {
                this.OooO.Ooooo00 = true;
                z4 = true;
                z5 = true;
            }
        }
        if (!z4) {
            synchronized (this.OooO0Oo) {
                if (this.OooO0Oo.ooOO != 0) {
                    z3 = false;
                }
            }
            z4 = z3;
        }
        this.OooO0Oo.o00000O(this.OooO0OO, z5, list);
        if (z4) {
            this.OooO0Oo.flush();
        }
    }

    public synchronized void OooOo0(C3746bz.OooO00o oooO00o) {
        this.OooO0o = oooO00o;
        if (!this.OooO0o0.isEmpty() && oooO00o != null) {
            notifyAll();
        }
    }

    public synchronized void OooOo00(ErrorCode errorCode) {
        if (this.OooOO0o == null) {
            this.OooOO0o = errorCode;
            notifyAll();
        }
    }

    public synchronized C3966hx OooOo0O() throws IOException {
        this.OooOO0.OooOOO0();
        while (this.OooO0o0.isEmpty() && this.OooOO0o == null) {
            try {
                OooOo0o();
            } catch (Throwable th) {
                this.OooOO0.OooOo0o();
                throw th;
            }
        }
        this.OooOO0.OooOo0o();
        if (this.OooO0o0.isEmpty()) {
            throw new StreamResetException(this.OooOO0o);
        }
        return this.OooO0o0.removeFirst();
    }

    public void OooOo0o() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public d10 OooOoO0() {
        return this.OooOO0O;
    }
}
