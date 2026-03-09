package p285z2;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Protocol;
import okio.ByteString;
import p285z2.C4196o4;
import p285z2.c00;

/* JADX INFO: loaded from: classes2.dex */
public final class a00 implements InterfaceC4410tx, c00.OooO00o {
    private static final List<Protocol> OooOo = Collections.singletonList(Protocol.HTTP_1_1);
    private static final long OooOoO = 60000;
    private static final long OooOoO0 = 16777216;
    public static final /* synthetic */ boolean OooOoOO = false;
    private d00 OooO;
    private final C4225ox OooO00o;
    public final AbstractC4447ux OooO0O0;
    private final Random OooO0OO;
    private final long OooO0Oo;
    private InterfaceC4335rw OooO0o;
    private final String OooO0o0;
    private final Runnable OooO0oO;
    private c00 OooO0oo;
    private ScheduledExecutorService OooOO0;
    private OooOO0O OooOO0O;
    private long OooOOO;
    private boolean OooOOOO;
    private ScheduledFuture<?> OooOOOo;
    private String OooOOo;
    private boolean OooOOoo;
    private int OooOo0;
    private int OooOo00;
    private int OooOo0O;
    private boolean OooOo0o;
    private final ArrayDeque<ByteString> OooOO0o = new ArrayDeque<>();
    private final ArrayDeque<Object> OooOOO0 = new ArrayDeque<>();
    private int OooOOo0 = -1;

    public static final class OooO {
        public final int OooO00o;
        public final ByteString OooO0O0;

        public OooO(int i, ByteString byteString) {
            this.OooO00o = i;
            this.OooO0O0 = byteString;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                } catch (IOException e) {
                    a00.this.OooOOO(e, null);
                    return;
                }
            } while (a00.this.OooOoO0());
        }
    }

    public class OooO0O0 implements InterfaceC4372sw {
        public final /* synthetic */ C4225ox OooO00o;

        public OooO0O0(C4225ox c4225ox) {
            this.OooO00o = c4225ox;
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(InterfaceC4335rw interfaceC4335rw, IOException iOException) {
            a00.this.OooOOO(iOException, null);
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(InterfaceC4335rw interfaceC4335rw, C4299qx c4299qx) {
            try {
                a00.this.OooOO0O(c4299qx);
                C4189ny c4189nyOooOOOO = AbstractC4484vx.OooO00o.OooOOOO(interfaceC4335rw);
                c4189nyOooOOOO.OooOO0();
                OooOO0O oooOO0OOooOOoo = c4189nyOooOOOO.OooO0Oo().OooOOoo(c4189nyOooOOOO);
                try {
                    a00 a00Var = a00.this;
                    a00Var.OooO0O0.OooO0o(a00Var, c4299qx);
                    a00.this.OooOOOO("OkHttp WebSocket " + this.OooO00o.OooOO0O().Oooo0oO(), oooOO0OOooOOoo);
                    c4189nyOooOOOO.OooO0Oo().OooO0Oo().setSoTimeout(0);
                    a00.this.OooOOOo();
                } catch (Exception e) {
                    a00.this.OooOOO(e, null);
                }
            } catch (ProtocolException e2) {
                a00.this.OooOOO(e2, c4299qx);
                C4558xx.OooO0oO(c4299qx);
            }
        }
    }

    public final class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a00.this.cancel();
        }
    }

    public static final class OooO0o {
        public final int OooO00o;
        public final ByteString OooO0O0;
        public final long OooO0OO;

        public OooO0o(int i, ByteString byteString, long j) {
            this.OooO00o = i;
            this.OooO0O0 = byteString;
            this.OooO0OO = j;
        }
    }

    public final class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a00.this.OooOoO();
        }
    }

    public static abstract class OooOO0O implements Closeable {
        public final boolean OoooOoO;
        public final j00 OoooOoo;
        public final i00 Ooooo00;

        public OooOO0O(boolean z, j00 j00Var, i00 i00Var) {
            this.OoooOoO = z;
            this.OoooOoo = j00Var;
            this.Ooooo00 = i00Var;
        }
    }

    public a00(C4225ox c4225ox, AbstractC4447ux abstractC4447ux, Random random, long j) {
        if (!"GET".equals(c4225ox.OooO0oO())) {
            throw new IllegalArgumentException("Request must be GET: " + c4225ox.OooO0oO());
        }
        this.OooO00o = c4225ox;
        this.OooO0O0 = abstractC4447ux;
        this.OooO0OO = random;
        this.OooO0Oo = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.OooO0o0 = ByteString.m17043of(bArr).base64();
        this.OooO0oO = new OooO00o();
    }

    private void OooOo0() {
        ScheduledExecutorService scheduledExecutorService = this.OooOO0;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.OooO0oO);
        }
    }

    private synchronized boolean OooOo0O(ByteString byteString, int i) {
        if (!this.OooOOoo && !this.OooOOOO) {
            if (this.OooOOO + ((long) byteString.size()) > OooOoO0) {
                OooO0o(1001, null);
                return false;
            }
            this.OooOOO += (long) byteString.size();
            this.OooOOO0.add(new OooO(i, byteString));
            OooOo0();
            return true;
        }
        return false;
    }

    @Override // z2.c00.OooO00o
    public void OooO(int i, String str) {
        OooOO0O oooOO0O;
        if (i == -1) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            if (this.OooOOo0 != -1) {
                throw new IllegalStateException("already closed");
            }
            this.OooOOo0 = i;
            this.OooOOo = str;
            oooOO0O = null;
            if (this.OooOOOO && this.OooOOO0.isEmpty()) {
                OooOO0O oooOO0O2 = this.OooOO0O;
                this.OooOO0O = null;
                ScheduledFuture<?> scheduledFuture = this.OooOOOo;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.OooOO0.shutdown();
                oooOO0O = oooOO0O2;
            }
        }
        try {
            this.OooO0O0.OooO0O0(this, i, str);
            if (oooOO0O != null) {
                this.OooO0O0.OooO00o(this, i, str);
            }
        } finally {
            C4558xx.OooO0oO(oooOO0O);
        }
    }

    @Override // p285z2.InterfaceC4410tx
    public boolean OooO00o(ByteString byteString) {
        Objects.requireNonNull(byteString, "bytes == null");
        return OooOo0O(byteString, 2);
    }

    @Override // p285z2.InterfaceC4410tx
    public boolean OooO0O0(String str) {
        Objects.requireNonNull(str, "text == null");
        return OooOo0O(ByteString.encodeUtf8(str), 1);
    }

    @Override // z2.c00.OooO00o
    public void OooO0OO(ByteString byteString) throws IOException {
        this.OooO0O0.OooO0o0(this, byteString);
    }

    @Override // z2.c00.OooO00o
    public void OooO0Oo(String str) throws IOException {
        this.OooO0O0.OooO0Oo(this, str);
    }

    @Override // p285z2.InterfaceC4410tx
    public boolean OooO0o(int i, String str) {
        return OooOO0o(i, str, OooOoO);
    }

    @Override // z2.c00.OooO00o
    public synchronized void OooO0o0(ByteString byteString) {
        if (!this.OooOOoo && (!this.OooOOOO || !this.OooOOO0.isEmpty())) {
            this.OooOO0o.add(byteString);
            OooOo0();
            this.OooOo0++;
        }
    }

    @Override // p285z2.InterfaceC4410tx
    public synchronized long OooO0oO() {
        return this.OooOOO;
    }

    @Override // z2.c00.OooO00o
    public synchronized void OooO0oo(ByteString byteString) {
        this.OooOo0O++;
        this.OooOo0o = false;
    }

    public void OooOO0(int i, TimeUnit timeUnit) throws InterruptedException {
        this.OooOO0.awaitTermination(i, timeUnit);
    }

    public void OooOO0O(C4299qx c4299qx) throws ProtocolException {
        if (c4299qx.OoooooO() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + c4299qx.OoooooO() + C4196o4.OooO00o.OooO0Oo + c4299qx.o00ooo() + "'");
        }
        String strO0OoOo0 = c4299qx.o0OoOo0("Connection");
        if (!"Upgrade".equalsIgnoreCase(strO0OoOo0)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strO0OoOo0 + "'");
        }
        String strO0OoOo02 = c4299qx.o0OoOo0("Upgrade");
        if (!"websocket".equalsIgnoreCase(strO0OoOo02)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strO0OoOo02 + "'");
        }
        String strO0OoOo03 = c4299qx.o0OoOo0("Sec-WebSocket-Accept");
        String strBase64 = ByteString.encodeUtf8(this.OooO0o0 + b00.OooO00o).sha1().base64();
        if (strBase64.equals(strO0OoOo03)) {
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strO0OoOo03 + "'");
    }

    public synchronized boolean OooOO0o(int i, String str, long j) {
        b00.OooO0Oo(i);
        ByteString byteStringEncodeUtf8 = null;
        if (str != null) {
            byteStringEncodeUtf8 = ByteString.encodeUtf8(str);
            if (byteStringEncodeUtf8.size() > 123) {
                throw new IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.OooOOoo && !this.OooOOOO) {
            this.OooOOOO = true;
            this.OooOOO0.add(new OooO0o(i, byteStringEncodeUtf8, j));
            OooOo0();
            return true;
        }
        return false;
    }

    public void OooOOO(Exception exc, @Nullable C4299qx c4299qx) {
        synchronized (this) {
            if (this.OooOOoo) {
                return;
            }
            this.OooOOoo = true;
            OooOO0O oooOO0O = this.OooOO0O;
            this.OooOO0O = null;
            ScheduledFuture<?> scheduledFuture = this.OooOOOo;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledExecutorService scheduledExecutorService = this.OooOO0;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                this.OooO0O0.OooO0OO(this, exc, c4299qx);
            } finally {
                C4558xx.OooO0oO(oooOO0O);
            }
        }
    }

    public void OooOOO0(C4151mx c4151mx) {
        C4151mx c4151mxOooO0Oo = c4151mx.OooOo0().OooOOOo(AbstractC3855ex.OooO00o).OooOoO0(OooOo).OooO0Oo();
        C4225ox c4225oxOooO0O0 = this.OooO00o.OooO0oo().OooO0oo("Upgrade", "websocket").OooO0oo("Connection", "Upgrade").OooO0oo("Sec-WebSocket-Key", this.OooO0o0).OooO0oo("Sec-WebSocket-Version", "13").OooO0O0();
        InterfaceC4335rw interfaceC4335rwOooOO0O = AbstractC4484vx.OooO00o.OooOO0O(c4151mxOooO0Oo, c4225oxOooO0O0);
        this.OooO0o = interfaceC4335rwOooOO0O;
        interfaceC4335rwOooOO0O.timeout().OooO0O0();
        this.OooO0o.OooOO0(new OooO0O0(c4225oxOooO0O0));
    }

    public void OooOOOO(String str, OooOO0O oooOO0O) throws IOException {
        synchronized (this) {
            this.OooOO0O = oooOO0O;
            this.OooO = new d00(oooOO0O.OoooOoO, oooOO0O.Ooooo00, this.OooO0OO);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C4558xx.Oooo00o(str, false));
            this.OooOO0 = scheduledThreadPoolExecutor;
            if (this.OooO0Oo != 0) {
                OooOO0 oooOO0 = new OooOO0();
                long j = this.OooO0Oo;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(oooOO0, j, j, TimeUnit.MILLISECONDS);
            }
            if (!this.OooOOO0.isEmpty()) {
                OooOo0();
            }
        }
        this.OooO0oo = new c00(oooOO0O.OoooOoO, oooOO0O.OoooOoo, this);
    }

    public void OooOOOo() throws IOException {
        while (this.OooOOo0 == -1) {
            this.OooO0oo.OooO00o();
        }
    }

    public boolean OooOOo() throws IOException {
        try {
            this.OooO0oo.OooO00o();
            return this.OooOOo0 == -1;
        } catch (Exception e) {
            OooOOO(e, null);
            return false;
        }
    }

    public synchronized boolean OooOOo0(ByteString byteString) {
        boolean z;
        if (this.OooOOoo || (this.OooOOOO && this.OooOOO0.isEmpty())) {
            z = false;
        } else {
            this.OooOO0o.add(byteString);
            OooOo0();
            z = true;
        }
        return z;
    }

    public synchronized int OooOOoo() {
        return this.OooOo0;
    }

    public void OooOo() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.OooOOOo;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.OooOO0.shutdown();
        this.OooOO0.awaitTermination(10L, TimeUnit.SECONDS);
    }

    public synchronized int OooOo00() {
        return this.OooOo0O;
    }

    public synchronized int OooOo0o() {
        return this.OooOo00;
    }

    public void OooOoO() {
        synchronized (this) {
            if (this.OooOOoo) {
                return;
            }
            d00 d00Var = this.OooO;
            int i = this.OooOo0o ? this.OooOo00 : -1;
            this.OooOo00++;
            this.OooOo0o = true;
            if (i == -1) {
                try {
                    d00Var.OooO0o0(ByteString.EMPTY);
                    return;
                } catch (IOException e) {
                    OooOOO(e, null);
                    return;
                }
            }
            OooOOO(new SocketTimeoutException("sent ping but didn't receive pong within " + this.OooO0Oo + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
        }
    }

    public boolean OooOoO0() throws IOException {
        OooOO0O oooOO0O;
        String str;
        synchronized (this) {
            if (this.OooOOoo) {
                return false;
            }
            d00 d00Var = this.OooO;
            ByteString byteStringPoll = this.OooOO0o.poll();
            int i = -1;
            Object obj = null;
            if (byteStringPoll == null) {
                Object objPoll = this.OooOOO0.poll();
                if (objPoll instanceof OooO0o) {
                    int i2 = this.OooOOo0;
                    str = this.OooOOo;
                    if (i2 != -1) {
                        OooOO0O oooOO0O2 = this.OooOO0O;
                        this.OooOO0O = null;
                        this.OooOO0.shutdown();
                        obj = objPoll;
                        i = i2;
                        oooOO0O = oooOO0O2;
                    } else {
                        this.OooOOOo = this.OooOO0.schedule(new OooO0OO(), ((OooO0o) objPoll).OooO0OO, TimeUnit.MILLISECONDS);
                        i = i2;
                        oooOO0O = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    oooOO0O = null;
                    str = null;
                }
                obj = objPoll;
            } else {
                oooOO0O = null;
                str = null;
            }
            try {
                if (byteStringPoll != null) {
                    d00Var.OooO0o(byteStringPoll);
                } else if (obj instanceof OooO) {
                    ByteString byteString = ((OooO) obj).OooO0O0;
                    i00 i00VarOooO0OO = u00.OooO0OO(d00Var.OooO00o(((OooO) obj).OooO00o, byteString.size()));
                    i00VarOooO0OO.OoooO0(byteString);
                    i00VarOooO0OO.close();
                    synchronized (this) {
                        this.OooOOO -= (long) byteString.size();
                    }
                } else {
                    if (!(obj instanceof OooO0o)) {
                        throw new AssertionError();
                    }
                    OooO0o oooO0o = (OooO0o) obj;
                    d00Var.OooO0O0(oooO0o.OooO00o, oooO0o.OooO0O0);
                    if (oooOO0O != null) {
                        this.OooO0O0.OooO00o(this, i, str);
                    }
                }
                return true;
            } finally {
                C4558xx.OooO0oO(oooOO0O);
            }
        }
    }

    @Override // p285z2.InterfaceC4410tx
    public void cancel() {
        this.OooO0o.cancel();
    }

    @Override // p285z2.InterfaceC4410tx
    public C4225ox request() {
        return this.OooO00o;
    }
}
