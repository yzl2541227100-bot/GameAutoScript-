package retrofit2;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p285z2.AbstractC4336rx;
import p285z2.C4077kx;
import p285z2.C4225ox;
import p285z2.C4299qx;
import p285z2.InterfaceC4335rw;
import p285z2.InterfaceC4372sw;
import p285z2.c10;
import p285z2.h00;
import p285z2.j00;
import p285z2.m00;
import p285z2.u00;

/* JADX INFO: loaded from: classes2.dex */
public final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final InterfaceC4335rw.OooO00o callFactory;
    private volatile boolean canceled;

    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;

    @GuardedBy("this")
    private boolean executed;

    @GuardedBy("this")
    @Nullable
    private InterfaceC4335rw rawCall;
    private final RequestFactory requestFactory;
    private final Converter<AbstractC4336rx, T> responseConverter;

    /* JADX INFO: renamed from: retrofit2.OkHttpCall$1 */
    public class C36681 implements InterfaceC4372sw {
        public final /* synthetic */ Callback val$callback;

        public C36681(Callback callback) {
            callback = callback;
        }

        private void callFailure(Throwable th) {
            try {
                callback.onFailure(OkHttpCall.this, th);
            } catch (Throwable th2) {
                Utils.throwIfFatal(th2);
                th2.printStackTrace();
            }
        }

        @Override // p285z2.InterfaceC4372sw
        public void onFailure(InterfaceC4335rw interfaceC4335rw, IOException iOException) {
            callFailure(iOException);
        }

        @Override // p285z2.InterfaceC4372sw
        public void onResponse(InterfaceC4335rw interfaceC4335rw, C4299qx c4299qx) {
            try {
                try {
                    callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(c4299qx));
                } catch (Throwable th) {
                    Utils.throwIfFatal(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                Utils.throwIfFatal(th2);
                callFailure(th2);
            }
        }
    }

    public static final class ExceptionCatchingResponseBody extends AbstractC4336rx {
        private final AbstractC4336rx delegate;
        private final j00 delegateSource;

        @Nullable
        public IOException thrownException;

        /* JADX INFO: renamed from: retrofit2.OkHttpCall$ExceptionCatchingResponseBody$1 */
        public class C36691 extends m00 {
            public C36691(c10 c10Var) {
                super(c10Var);
            }

            @Override // p285z2.m00, p285z2.c10
            public long read(h00 h00Var, long j) throws IOException {
                try {
                    return super.read(h00Var, j);
                } catch (IOException e) {
                    ExceptionCatchingResponseBody.this.thrownException = e;
                    throw e;
                }
            }
        }

        public ExceptionCatchingResponseBody(AbstractC4336rx abstractC4336rx) {
            this.delegate = abstractC4336rx;
            this.delegateSource = u00.OooO0Oo(new m00(abstractC4336rx.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                public C36691(c10 c10Var) {
                    super(c10Var);
                }

                @Override // p285z2.m00, p285z2.c10
                public long read(h00 h00Var, long j) throws IOException {
                    try {
                        return super.read(h00Var, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        @Override // p285z2.AbstractC4336rx, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // p285z2.AbstractC4336rx
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // p285z2.AbstractC4336rx
        public C4077kx contentType() {
            return this.delegate.contentType();
        }

        @Override // p285z2.AbstractC4336rx
        public j00 source() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends AbstractC4336rx {
        private final long contentLength;

        @Nullable
        private final C4077kx contentType;

        public NoContentResponseBody(@Nullable C4077kx c4077kx, long j) {
            this.contentType = c4077kx;
            this.contentLength = j;
        }

        @Override // p285z2.AbstractC4336rx
        public long contentLength() {
            return this.contentLength;
        }

        @Override // p285z2.AbstractC4336rx
        public C4077kx contentType() {
            return this.contentType;
        }

        @Override // p285z2.AbstractC4336rx
        public j00 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, InterfaceC4335rw.OooO00o oooO00o, Converter<AbstractC4336rx, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = oooO00o;
        this.responseConverter = converter;
    }

    private InterfaceC4335rw createRawCall() throws IOException {
        InterfaceC4335rw interfaceC4335rwOooO00o = this.callFactory.OooO00o(this.requestFactory.create(this.args));
        Objects.requireNonNull(interfaceC4335rwOooO00o, "Call.Factory returned null.");
        return interfaceC4335rwOooO00o;
    }

    @Override // retrofit2.Call
    public void cancel() {
        InterfaceC4335rw interfaceC4335rw;
        this.canceled = true;
        synchronized (this) {
            interfaceC4335rw = this.rawCall;
        }
        if (interfaceC4335rw != null) {
            interfaceC4335rw.cancel();
        }
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }

    @Override // retrofit2.Call
    public void enqueue(Callback<T> callback) {
        InterfaceC4335rw interfaceC4335rw;
        Throwable th;
        Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            interfaceC4335rw = this.rawCall;
            th = this.creationFailure;
            if (interfaceC4335rw == null && th == null) {
                try {
                    InterfaceC4335rw interfaceC4335rwCreateRawCall = createRawCall();
                    this.rawCall = interfaceC4335rwCreateRawCall;
                    interfaceC4335rw = interfaceC4335rwCreateRawCall;
                } catch (Throwable th2) {
                    th = th2;
                    Utils.throwIfFatal(th);
                    this.creationFailure = th;
                }
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            interfaceC4335rw.cancel();
        }
        interfaceC4335rw.OooOO0(new InterfaceC4372sw() { // from class: retrofit2.OkHttpCall.1
            public final /* synthetic */ Callback val$callback;

            public C36681(Callback callback2) {
                callback = callback2;
            }

            private void callFailure(Throwable th3) {
                try {
                    callback.onFailure(OkHttpCall.this, th3);
                } catch (Throwable th22) {
                    Utils.throwIfFatal(th22);
                    th22.printStackTrace();
                }
            }

            @Override // p285z2.InterfaceC4372sw
            public void onFailure(InterfaceC4335rw interfaceC4335rw2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // p285z2.InterfaceC4372sw
            public void onResponse(InterfaceC4335rw interfaceC4335rw2, C4299qx c4299qx) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(c4299qx));
                    } catch (Throwable th3) {
                        Utils.throwIfFatal(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th22) {
                    Utils.throwIfFatal(th22);
                    callFailure(th22);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        InterfaceC4335rw interfaceC4335rwCreateRawCall;
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already executed.");
            }
            this.executed = true;
            Throwable th = this.creationFailure;
            if (th != null) {
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            interfaceC4335rwCreateRawCall = this.rawCall;
            if (interfaceC4335rwCreateRawCall == null) {
                try {
                    interfaceC4335rwCreateRawCall = createRawCall();
                    this.rawCall = interfaceC4335rwCreateRawCall;
                } catch (IOException | Error | RuntimeException e) {
                    Utils.throwIfFatal(e);
                    this.creationFailure = e;
                    throw e;
                }
            }
        }
        if (this.canceled) {
            interfaceC4335rwCreateRawCall.cancel();
        }
        return parseResponse(interfaceC4335rwCreateRawCall.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            InterfaceC4335rw interfaceC4335rw = this.rawCall;
            if (interfaceC4335rw == null || !interfaceC4335rw.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(C4299qx c4299qx) throws IOException {
        AbstractC4336rx abstractC4336rxOooOO0 = c4299qx.OooOO0();
        C4299qx c4299qxOooO0OO = c4299qx.o00oO0o().OooO0O0(new NoContentResponseBody(abstractC4336rxOooOO0.contentType(), abstractC4336rxOooOO0.contentLength())).OooO0OO();
        int iOoooooO = c4299qxOooO0OO.OoooooO();
        if (iOoooooO < 200 || iOoooooO >= 300) {
            try {
                return Response.error(Utils.buffer(abstractC4336rxOooOO0), c4299qxOooO0OO);
            } finally {
                abstractC4336rxOooOO0.close();
            }
        }
        if (iOoooooO == 204 || iOoooooO == 205) {
            abstractC4336rxOooOO0.close();
            return Response.success((Object) null, c4299qxOooO0OO);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(abstractC4336rxOooOO0);
        try {
            return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), c4299qxOooO0OO);
        } catch (RuntimeException e) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e;
        }
    }

    @Override // retrofit2.Call
    public synchronized C4225ox request() {
        InterfaceC4335rw interfaceC4335rw = this.rawCall;
        if (interfaceC4335rw != null) {
            return interfaceC4335rw.request();
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.creationFailure);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC4335rw interfaceC4335rwCreateRawCall = createRawCall();
            this.rawCall = interfaceC4335rwCreateRawCall;
            return interfaceC4335rwCreateRawCall.request();
        } catch (IOException e) {
            this.creationFailure = e;
            throw new RuntimeException("Unable to create request.", e);
        } catch (Error e2) {
            e = e2;
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            Utils.throwIfFatal(e);
            this.creationFailure = e;
            throw e;
        }
    }
}
