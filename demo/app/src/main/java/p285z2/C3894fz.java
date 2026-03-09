package p285z2;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p285z2.C3931gz;

/* JADX INFO: renamed from: z2.fz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3894fz implements Closeable {
    public static final int o00oO0O = 16777216;
    private static final ExecutorService o0ooOO0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C4558xx.Oooo00o("OkHttp Http2Connection", true));
    public static final /* synthetic */ boolean o0ooOOo = false;
    public final boolean OoooOoO;
    public final OooOOO0 OoooOoo;
    public final String Ooooo0o;
    public int OooooO0;
    public int OooooOO;
    public boolean OooooOo;
    private final ExecutorService Oooooo;
    private final ScheduledExecutorService Oooooo0;
    public final InterfaceC4079kz OoooooO;
    private boolean Ooooooo;
    public final C4116lz o00Oo0;
    public boolean o00Ooo;
    public final Socket o00o0O;
    public final Set<Integer> o00oO0o;
    public final C4005iz o00ooo;
    public final OooOOOO oo000o;
    public long ooOO;
    public final Map<Integer, C3968hz> Ooooo00 = new LinkedHashMap();
    public long o0OoOo0 = 0;
    public C4116lz o00O0O = new C4116lz();

    /* JADX INFO: renamed from: z2.fz$OooO */
    public class OooO extends AbstractRunnableC4521wx {
        public final /* synthetic */ int OoooOoo;
        public final /* synthetic */ h00 Ooooo00;
        public final /* synthetic */ int Ooooo0o;
        public final /* synthetic */ boolean OooooO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Object[] objArr, int i, h00 h00Var, int i2, boolean z) {
            super(str, objArr);
            this.OoooOoo = i;
            this.Ooooo00 = h00Var;
            this.Ooooo0o = i2;
            this.OooooO0 = z;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            try {
                boolean zOooO0Oo = C3894fz.this.OoooooO.OooO0Oo(this.OoooOoo, this.Ooooo00, this.Ooooo0o, this.OooooO0);
                if (zOooO0Oo) {
                    C3894fz.this.o00ooo.o00o0O(this.OoooOoo, ErrorCode.CANCEL);
                }
                if (zOooO0Oo || this.OooooO0) {
                    synchronized (C3894fz.this) {
                        C3894fz.this.o00oO0o.remove(Integer.valueOf(this.OoooOoo));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooO00o */
    public class OooO00o extends AbstractRunnableC4521wx {
        public final /* synthetic */ int OoooOoo;
        public final /* synthetic */ ErrorCode Ooooo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.OoooOoo = i;
            this.Ooooo00 = errorCode;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            try {
                C3894fz.this.o00000OO(this.OoooOoo, this.Ooooo00);
            } catch (IOException unused) {
                C3894fz.this.o0OoOo0();
            }
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooO0O0 */
    public class OooO0O0 extends AbstractRunnableC4521wx {
        public final /* synthetic */ int OoooOoo;
        public final /* synthetic */ long Ooooo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.OoooOoo = i;
            this.Ooooo00 = j;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            try {
                C3894fz.this.o00ooo.o00oO0O(this.OoooOoo, this.Ooooo00);
            } catch (IOException unused) {
                C3894fz.this.o0OoOo0();
            }
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooO0OO */
    public class OooO0OO extends AbstractRunnableC4521wx {
        public final /* synthetic */ int OoooOoo;
        public final /* synthetic */ List Ooooo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.OoooOoo = i;
            this.Ooooo00 = list;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            if (C3894fz.this.OoooooO.OooO00o(this.OoooOoo, this.Ooooo00)) {
                try {
                    C3894fz.this.o00ooo.o00o0O(this.OoooOoo, ErrorCode.CANCEL);
                    synchronized (C3894fz.this) {
                        C3894fz.this.o00oO0o.remove(Integer.valueOf(this.OoooOoo));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooO0o */
    public class OooO0o extends AbstractRunnableC4521wx {
        public final /* synthetic */ int OoooOoo;
        public final /* synthetic */ List Ooooo00;
        public final /* synthetic */ boolean Ooooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.OoooOoo = i;
            this.Ooooo00 = list;
            this.Ooooo0o = z;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            boolean zOooO0O0 = C3894fz.this.OoooooO.OooO0O0(this.OoooOoo, this.Ooooo00, this.Ooooo0o);
            if (zOooO0O0) {
                try {
                    C3894fz.this.o00ooo.o00o0O(this.OoooOoo, ErrorCode.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zOooO0O0 || this.Ooooo0o) {
                synchronized (C3894fz.this) {
                    C3894fz.this.o00oO0o.remove(Integer.valueOf(this.OoooOoo));
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooOO0 */
    public class OooOO0 extends AbstractRunnableC4521wx {
        public final /* synthetic */ int OoooOoo;
        public final /* synthetic */ ErrorCode Ooooo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, Object[] objArr, int i, ErrorCode errorCode) {
            super(str, objArr);
            this.OoooOoo = i;
            this.Ooooo00 = errorCode;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            C3894fz.this.OoooooO.OooO0OO(this.OoooOoo, this.Ooooo00);
            synchronized (C3894fz.this) {
                C3894fz.this.o00oO0o.remove(Integer.valueOf(this.OoooOoo));
            }
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooOO0O */
    public static class OooOO0O {
        public Socket OooO00o;
        public String OooO0O0;
        public j00 OooO0OO;
        public i00 OooO0Oo;
        public boolean OooO0oO;
        public int OooO0oo;
        public OooOOO0 OooO0o0 = OooOOO0.OooO00o;
        public InterfaceC4079kz OooO0o = InterfaceC4079kz.OooO00o;

        public OooOO0O(boolean z) {
            this.OooO0oO = z;
        }

        public C3894fz OooO00o() {
            return new C3894fz(this);
        }

        public OooOO0O OooO0O0(OooOOO0 oooOOO0) {
            this.OooO0o0 = oooOOO0;
            return this;
        }

        public OooOO0O OooO0OO(int i) {
            this.OooO0oo = i;
            return this;
        }

        public OooOO0O OooO0Oo(InterfaceC4079kz interfaceC4079kz) {
            this.OooO0o = interfaceC4079kz;
            return this;
        }

        public OooOO0O OooO0o(Socket socket, String str, j00 j00Var, i00 i00Var) {
            this.OooO00o = socket;
            this.OooO0O0 = str;
            this.OooO0OO = j00Var;
            this.OooO0Oo = i00Var;
            return this;
        }

        public OooOO0O OooO0o0(Socket socket) throws IOException {
            return OooO0o(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), u00.OooO0Oo(u00.OooOOO(socket)), u00.OooO0OO(u00.OooO(socket)));
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooOOO */
    public final class OooOOO extends AbstractRunnableC4521wx {
        public final boolean OoooOoo;
        public final int Ooooo00;
        public final int Ooooo0o;

        public OooOOO(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C3894fz.this.Ooooo0o, Integer.valueOf(i), Integer.valueOf(i2));
            this.OoooOoo = z;
            this.Ooooo00 = i;
            this.Ooooo0o = i2;
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() {
            C3894fz.this.o00000(this.OoooOoo, this.Ooooo00, this.Ooooo0o);
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooOOO0 */
    public static abstract class OooOOO0 {
        public static final OooOOO0 OooO00o = new OooO00o();

        /* JADX INFO: renamed from: z2.fz$OooOOO0$OooO00o */
        public class OooO00o extends OooOOO0 {
            @Override // p285z2.C3894fz.OooOOO0
            public void OooO0o(C3968hz c3968hz) throws IOException {
                c3968hz.OooO0o(ErrorCode.REFUSED_STREAM);
            }
        }

        public abstract void OooO0o(C3968hz c3968hz) throws IOException;

        public void OooO0o0(C3894fz c3894fz) {
        }
    }

    /* JADX INFO: renamed from: z2.fz$OooOOOO */
    public class OooOOOO extends AbstractRunnableC4521wx implements C3931gz.OooO0O0 {
        public final C3931gz OoooOoo;

        /* JADX INFO: renamed from: z2.fz$OooOOOO$OooO00o */
        public class OooO00o extends AbstractRunnableC4521wx {
            public final /* synthetic */ C3968hz OoooOoo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str, Object[] objArr, C3968hz c3968hz) {
                super(str, objArr);
                this.OoooOoo = c3968hz;
            }

            @Override // p285z2.AbstractRunnableC4521wx
            public void OooOO0o() {
                try {
                    C3894fz.this.OoooOoo.OooO0o(this.OoooOoo);
                } catch (IOException e) {
                    C4375sz.OooOO0O().OooOOo(4, "Http2Connection.Listener failure for " + C3894fz.this.Ooooo0o, e);
                    try {
                        this.OoooOoo.OooO0o(ErrorCode.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: z2.fz$OooOOOO$OooO0O0 */
        public class OooO0O0 extends AbstractRunnableC4521wx {
            public OooO0O0(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // p285z2.AbstractRunnableC4521wx
            public void OooOO0o() {
                C3894fz c3894fz = C3894fz.this;
                c3894fz.OoooOoo.OooO0o0(c3894fz);
            }
        }

        /* JADX INFO: renamed from: z2.fz$OooOOOO$OooO0OO */
        public class OooO0OO extends AbstractRunnableC4521wx {
            public final /* synthetic */ C4116lz OoooOoo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(String str, Object[] objArr, C4116lz c4116lz) {
                super(str, objArr);
                this.OoooOoo = c4116lz;
            }

            @Override // p285z2.AbstractRunnableC4521wx
            public void OooOO0o() {
                try {
                    C3894fz.this.o00ooo.OooOO0(this.OoooOoo);
                } catch (IOException unused) {
                    C3894fz.this.o0OoOo0();
                }
            }
        }

        public OooOOOO(C3931gz c3931gz) {
            super("OkHttp %s", C3894fz.this.Ooooo0o);
            this.OoooOoo = c3931gz;
        }

        private void OooOOO0(C4116lz c4116lz) {
            try {
                C3894fz.this.Oooooo0.execute(new OooO0OO("OkHttp %s ACK Settings", new Object[]{C3894fz.this.Ooooo0o}, c4116lz));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO(int i, ErrorCode errorCode) {
            if (C3894fz.this.o0Oo0oo(i)) {
                C3894fz.this.o0ooOoO(i, errorCode);
                return;
            }
            C3968hz c3968hzO0OO00O = C3894fz.this.o0OO00O(i);
            if (c3968hzO0OO00O != null) {
                c3968hzO0OO00O.OooOo00(errorCode);
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO00o() {
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0O0(boolean z, C4116lz c4116lz) {
            C3968hz[] c3968hzArr;
            long j;
            int i;
            synchronized (C3894fz.this) {
                int iOooO0o0 = C3894fz.this.o00Oo0.OooO0o0();
                if (z) {
                    C3894fz.this.o00Oo0.OooO00o();
                }
                C3894fz.this.o00Oo0.OooOO0(c4116lz);
                OooOOO0(c4116lz);
                int iOooO0o02 = C3894fz.this.o00Oo0.OooO0o0();
                c3968hzArr = null;
                if (iOooO0o02 == -1 || iOooO0o02 == iOooO0o0) {
                    j = 0;
                } else {
                    j = iOooO0o02 - iOooO0o0;
                    C3894fz c3894fz = C3894fz.this;
                    if (!c3894fz.o00Ooo) {
                        c3894fz.o00Ooo = true;
                    }
                    if (!c3894fz.Ooooo00.isEmpty()) {
                        c3968hzArr = (C3968hz[]) C3894fz.this.Ooooo00.values().toArray(new C3968hz[C3894fz.this.Ooooo00.size()]);
                    }
                }
                C3894fz.o0ooOO0.execute(new OooO0O0("OkHttp %s settings", C3894fz.this.Ooooo0o));
            }
            if (c3968hzArr == null || j == 0) {
                return;
            }
            for (C3968hz c3968hz : c3968hzArr) {
                synchronized (c3968hz) {
                    c3968hz.OooO0OO(j);
                }
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0OO(boolean z, int i, int i2, List<C3746bz> list) {
            if (C3894fz.this.o0Oo0oo(i)) {
                C3894fz.this.o0ooOO0(i, list, z);
                return;
            }
            synchronized (C3894fz.this) {
                C3968hz c3968hzO00O0O = C3894fz.this.o00O0O(i);
                if (c3968hzO00O0O != null) {
                    c3968hzO00O0O.OooOOoo(list);
                    if (z) {
                        c3968hzO00O0O.OooOOo();
                        return;
                    }
                    return;
                }
                C3894fz c3894fz = C3894fz.this;
                if (c3894fz.OooooOo) {
                    return;
                }
                if (i <= c3894fz.OooooO0) {
                    return;
                }
                if (i % 2 == c3894fz.OooooOO % 2) {
                    return;
                }
                C3968hz c3968hz = new C3968hz(i, C3894fz.this, false, z, C4558xx.Oooo0(list));
                C3894fz c3894fz2 = C3894fz.this;
                c3894fz2.OooooO0 = i;
                c3894fz2.Ooooo00.put(Integer.valueOf(i), c3968hz);
                C3894fz.o0ooOO0.execute(new OooO00o("OkHttp %s stream %d", new Object[]{C3894fz.this.Ooooo0o, Integer.valueOf(i)}, c3968hz));
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0Oo(int i, long j) {
            C3894fz c3894fz = C3894fz.this;
            if (i == 0) {
                synchronized (c3894fz) {
                    C3894fz c3894fz2 = C3894fz.this;
                    c3894fz2.ooOO += j;
                    c3894fz2.notifyAll();
                }
                return;
            }
            C3968hz c3968hzO00O0O = c3894fz.o00O0O(i);
            if (c3968hzO00O0O != null) {
                synchronized (c3968hzO00O0O) {
                    c3968hzO00O0O.OooO0OO(j);
                }
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0o(boolean z, int i, j00 j00Var, int i2) throws IOException {
            if (C3894fz.this.o0Oo0oo(i)) {
                C3894fz.this.o00oO0o(i, j00Var, i2, z);
                return;
            }
            C3968hz c3968hzO00O0O = C3894fz.this.o00O0O(i);
            if (c3968hzO00O0O == null) {
                C3894fz.this.o00000Oo(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                C3894fz.this.o000000O(j);
                j00Var.skip(j);
                return;
            }
            c3968hzO00O0O.OooOOo0(j00Var, i2);
            if (z) {
                c3968hzO00O0O.OooOOo();
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0o0(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0oO(boolean z, int i, int i2) {
            if (!z) {
                try {
                    C3894fz.this.Oooooo0.execute(C3894fz.this.new OooOOO(true, i, i2));
                } catch (RejectedExecutionException unused) {
                }
            } else {
                synchronized (C3894fz.this) {
                    C3894fz.this.Ooooooo = false;
                    C3894fz.this.notifyAll();
                }
            }
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooO0oo(int i, int i2, int i3, boolean z) {
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooOO0(int i, int i2, List<C3746bz> list) {
            C3894fz.this.o0ooOOo(i2, list);
        }

        @Override // p285z2.C3931gz.OooO0O0
        public void OooOO0O(int i, ErrorCode errorCode, ByteString byteString) {
            C3968hz[] c3968hzArr;
            byteString.size();
            synchronized (C3894fz.this) {
                c3968hzArr = (C3968hz[]) C3894fz.this.Ooooo00.values().toArray(new C3968hz[C3894fz.this.Ooooo00.size()]);
                C3894fz.this.OooooOo = true;
            }
            for (C3968hz c3968hz : c3968hzArr) {
                if (c3968hz.OooOO0O() > i && c3968hz.OooOOO()) {
                    c3968hz.OooOo00(ErrorCode.REFUSED_STREAM);
                    C3894fz.this.o0OO00O(c3968hz.OooOO0O());
                }
            }
        }

        @Override // p285z2.AbstractRunnableC4521wx
        public void OooOO0o() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.OoooOoo.Oooooo0(this);
                    while (this.OoooOoo.OooooOo(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                } catch (IOException unused) {
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    try {
                        C3894fz.this.Ooooooo(errorCode, errorCode2);
                    } catch (IOException unused2) {
                    }
                    C4558xx.OooO0oO(this.OoooOoo);
                    throw th;
                }
                try {
                    try {
                        C3894fz.this.Ooooooo(errorCode, ErrorCode.CANCEL);
                    } catch (Throwable th2) {
                        th = th2;
                        C3894fz.this.Ooooooo(errorCode, errorCode2);
                        C4558xx.OooO0oO(this.OoooOoo);
                        throw th;
                    }
                } catch (IOException unused3) {
                    ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                    C3894fz.this.Ooooooo(errorCode3, errorCode3);
                }
            } catch (IOException unused4) {
            }
            C4558xx.OooO0oO(this.OoooOoo);
        }
    }

    public C3894fz(OooOO0O oooOO0O) {
        C4116lz c4116lz = new C4116lz();
        this.o00Oo0 = c4116lz;
        this.o00Ooo = false;
        this.o00oO0o = new LinkedHashSet();
        this.OoooooO = oooOO0O.OooO0o;
        boolean z = oooOO0O.OooO0oO;
        this.OoooOoO = z;
        this.OoooOoo = oooOO0O.OooO0o0;
        int i = z ? 1 : 2;
        this.OooooOO = i;
        if (z) {
            this.OooooOO = i + 2;
        }
        if (z) {
            this.o00O0O.OooOO0O(7, 16777216);
        }
        String str = oooOO0O.OooO0O0;
        this.Ooooo0o = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C4558xx.Oooo00o(C4558xx.OooOOoo("OkHttp %s Writer", str), false));
        this.Oooooo0 = scheduledThreadPoolExecutor;
        if (oooOO0O.OooO0oo != 0) {
            OooOOO oooOOO = new OooOOO(false, 0, 0);
            int i2 = oooOO0O.OooO0oo;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(oooOOO, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.Oooooo = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4558xx.Oooo00o(C4558xx.OooOOoo("OkHttp %s Push Observer", str), true));
        c4116lz.OooOO0O(7, 65535);
        c4116lz.OooOO0O(5, 16384);
        this.ooOO = c4116lz.OooO0o0();
        this.o00o0O = oooOO0O.OooO00o;
        this.o00ooo = new C4005iz(oooOO0O.OooO0Oo, z);
        this.oo000o = new OooOOOO(new C3931gz(oooOO0O.OooO0OO, z));
    }

    private C3968hz o00o0O(int i, List<C3746bz> list, boolean z) throws IOException {
        int i2;
        C3968hz c3968hz;
        boolean z3;
        boolean z4 = !z;
        synchronized (this.o00ooo) {
            synchronized (this) {
                if (this.OooooOO > 1073741823) {
                    o0O0O00(ErrorCode.REFUSED_STREAM);
                }
                if (this.OooooOo) {
                    throw new ConnectionShutdownException();
                }
                i2 = this.OooooOO;
                this.OooooOO = i2 + 2;
                c3968hz = new C3968hz(i2, this, z4, false, null);
                z3 = !z || this.ooOO == 0 || c3968hz.OooO0O0 == 0;
                if (c3968hz.OooOOOO()) {
                    this.Ooooo00.put(Integer.valueOf(i2), c3968hz);
                }
            }
            if (i == 0) {
                this.o00ooo.o00oO0o(z4, i2, i, list);
            } else {
                if (this.OoooOoO) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.o00ooo.o00Ooo(i, i2, list);
            }
        }
        if (z3) {
            this.o00ooo.flush();
        }
        return c3968hz;
    }

    private synchronized void o00oO0O(AbstractRunnableC4521wx abstractRunnableC4521wx) {
        if (!o00Oo0()) {
            this.Oooooo.execute(abstractRunnableC4521wx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0OoOo0() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            Ooooooo(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    public synchronized void OoooooO() throws InterruptedException {
        while (this.Ooooooo) {
            wait();
        }
    }

    public void Ooooooo(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        C3968hz[] c3968hzArr = null;
        try {
            o0O0O00(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.Ooooo00.isEmpty()) {
                c3968hzArr = (C3968hz[]) this.Ooooo00.values().toArray(new C3968hz[this.Ooooo00.size()]);
                this.Ooooo00.clear();
            }
        }
        if (c3968hzArr != null) {
            for (C3968hz c3968hz : c3968hzArr) {
                try {
                    c3968hz.OooO0o(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.o00ooo.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.o00o0O.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.Oooooo0.shutdown();
        this.Oooooo.shutdown();
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Ooooooo(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() throws IOException {
        this.o00ooo.flush();
    }

    public void o00000(boolean z, int i, int i2) {
        boolean z3;
        if (!z) {
            synchronized (this) {
                z3 = this.Ooooooo;
                this.Ooooooo = true;
            }
            if (z3) {
                o0OoOo0();
                return;
            }
        }
        try {
            this.o00ooo.o00Oo0(z, i, i2);
        } catch (IOException unused) {
            o0OoOo0();
        }
    }

    public void o000000(boolean z) throws IOException {
        if (z) {
            this.o00ooo.OooooOo();
            this.o00ooo.o00ooo(this.o00O0O);
            if (this.o00O0O.OooO0o0() != 65535) {
                this.o00ooo.o00oO0O(0, r6 - 65535);
            }
        }
        new Thread(this.oo000o).start();
    }

    public synchronized void o000000O(long j) {
        long j2 = this.o0OoOo0 + j;
        this.o0OoOo0 = j2;
        if (j2 >= this.o00O0O.OooO0o0() / 2) {
            o00000o0(0, this.o0OoOo0);
            this.o0OoOo0 = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.o00ooo.o00O0O());
        r6 = r3;
        r8.ooOO -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o000000o(int r9, boolean r10, p285z2.h00 r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            z2.iz r12 = r8.o00ooo
            r12.Oooooo0(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r3 = r8.ooOO     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, z2.hz> r3 = r8.Ooooo00     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            z2.iz r3 = r8.o00ooo     // Catch: java.lang.Throwable -> L56
            int r3 = r3.o00O0O()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.ooOO     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.ooOO = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            z2.iz r4 = r8.o00ooo
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.Oooooo0(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3894fz.o000000o(int, boolean, z2.h00, long):void");
    }

    public void o00000O(int i, boolean z, List<C3746bz> list) throws IOException {
        this.o00ooo.oo000o(z, i, list);
    }

    public void o00000O0() throws InterruptedException {
        o00000(false, 1330343787, -257978967);
        OoooooO();
    }

    public void o00000OO(int i, ErrorCode errorCode) throws IOException {
        this.o00ooo.o00o0O(i, errorCode);
    }

    public void o00000Oo(int i, ErrorCode errorCode) {
        try {
            this.Oooooo0.execute(new OooO00o("OkHttp %s stream %d", new Object[]{this.Ooooo0o, Integer.valueOf(i)}, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void o00000o0(int i, long j) {
        try {
            this.Oooooo0.execute(new OooO0O0("OkHttp Window Update %s stream %d", new Object[]{this.Ooooo0o, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void o000OOo() throws IOException {
        o000000(true);
    }

    public synchronized C3968hz o00O0O(int i) {
        return this.Ooooo00.get(Integer.valueOf(i));
    }

    public synchronized boolean o00Oo0() {
        return this.OooooOo;
    }

    public synchronized int o00Ooo() {
        return this.o00Oo0.OooO0o(Integer.MAX_VALUE);
    }

    public void o00oO0o(int i, j00 j00Var, int i2, boolean z) throws IOException {
        h00 h00Var = new h00();
        long j = i2;
        j00Var.OoooOo0(j);
        j00Var.read(h00Var, j);
        if (h00Var.o00000O0() == j) {
            o00oO0O(new OooO("OkHttp %s Push Data[%s]", new Object[]{this.Ooooo0o, Integer.valueOf(i)}, i, h00Var, i2, z));
            return;
        }
        throw new IOException(h00Var.o00000O0() + " != " + i2);
    }

    public C3968hz o00ooo(List<C3746bz> list, boolean z) throws IOException {
        return o00o0O(0, list, z);
    }

    public void o0O0O00(ErrorCode errorCode) throws IOException {
        synchronized (this.o00ooo) {
            synchronized (this) {
                if (this.OooooOo) {
                    return;
                }
                this.OooooOo = true;
                this.o00ooo.Ooooooo(this.OooooO0, errorCode, C4558xx.OooO00o);
            }
        }
    }

    public synchronized C3968hz o0OO00O(int i) {
        C3968hz c3968hzRemove;
        c3968hzRemove = this.Ooooo00.remove(Integer.valueOf(i));
        notifyAll();
        return c3968hzRemove;
    }

    public C3968hz o0OOO0o(int i, List<C3746bz> list, boolean z) throws IOException {
        if (this.OoooOoO) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return o00o0O(i, list, z);
    }

    public boolean o0Oo0oo(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public void o0ooOO0(int i, List<C3746bz> list, boolean z) {
        try {
            o00oO0O(new OooO0o("OkHttp %s Push Headers[%s]", new Object[]{this.Ooooo0o, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void o0ooOOo(int i, List<C3746bz> list) {
        synchronized (this) {
            if (this.o00oO0o.contains(Integer.valueOf(i))) {
                o00000Oo(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.o00oO0o.add(Integer.valueOf(i));
            try {
                o00oO0O(new OooO0OO("OkHttp %s Push Request[%s]", new Object[]{this.Ooooo0o, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void o0ooOoO(int i, ErrorCode errorCode) {
        o00oO0O(new OooOO0("OkHttp %s Push Reset[%s]", new Object[]{this.Ooooo0o, Integer.valueOf(i)}, i, errorCode));
    }

    public synchronized int oo000o() {
        return this.Ooooo00.size();
    }

    public void oo0o0Oo(C4116lz c4116lz) throws IOException {
        synchronized (this.o00ooo) {
            synchronized (this) {
                if (this.OooooOo) {
                    throw new ConnectionShutdownException();
                }
                this.o00O0O.OooOO0(c4116lz);
            }
            this.o00ooo.o00ooo(c4116lz);
        }
    }

    public Protocol ooOO() {
        return Protocol.HTTP_2;
    }
}
