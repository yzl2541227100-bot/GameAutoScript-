package okhttp3.logging;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import p285z2.AbstractC4262px;
import p285z2.AbstractC4336rx;
import p285z2.C3966hx;
import p285z2.C4077kx;
import p285z2.C4225ox;
import p285z2.C4299qx;
import p285z2.C4374sy;
import p285z2.C4375sz;
import p285z2.InterfaceC4040jx;
import p285z2.InterfaceC4520ww;
import p285z2.h00;
import p285z2.j00;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements InterfaceC4040jx {
    private static final Charset OooO0OO = Charset.forName("UTF-8");
    private final OooO00o OooO00o;
    private volatile Level OooO0O0;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface OooO00o {
        public static final OooO00o OooO00o = new C4721OooO00o();

        /* JADX INFO: renamed from: okhttp3.logging.HttpLoggingInterceptor$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C4721OooO00o implements OooO00o {
            @Override // okhttp3.logging.HttpLoggingInterceptor.OooO00o
            public void OooO00o(String str) {
                C4375sz.OooOO0O().OooOOo(4, str, null);
            }
        }

        void OooO00o(String str);
    }

    public HttpLoggingInterceptor() {
        this(OooO00o.OooO00o);
    }

    public HttpLoggingInterceptor(OooO00o oooO00o) {
        this.OooO0O0 = Level.NONE;
        this.OooO00o = oooO00o;
    }

    private boolean OooO00o(C3966hx c3966hx) {
        String strOooO0Oo = c3966hx.OooO0Oo("Content-Encoding");
        return (strOooO0Oo == null || strOooO0Oo.equalsIgnoreCase("identity")) ? false : true;
    }

    public static boolean OooO0OO(h00 h00Var) {
        try {
            h00 h00Var2 = new h00();
            h00Var.o0OoOo0(h00Var2, 0L, h00Var.o00000O0() < 64 ? h00Var.o00000O0() : 64L);
            for (int i = 0; i < 16; i++) {
                if (h00Var2.OooOOO()) {
                    return true;
                }
                int iOooOoo = h00Var2.OooOoo();
                if (Character.isISOControl(iOooOoo) && !Character.isWhitespace(iOooOoo)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public Level OooO0O0() {
        return this.OooO0O0;
    }

    public HttpLoggingInterceptor OooO0Oo(Level level) {
        Objects.requireNonNull(level, "level == null. Use Level.NONE instead.");
        this.OooO0O0 = level;
        return this;
    }

    @Override // p285z2.InterfaceC4040jx
    public C4299qx intercept(InterfaceC4040jx.OooO00o oooO00o) throws Exception {
        boolean z;
        OooO00o oooO00o2;
        String str;
        OooO00o oooO00o3;
        StringBuilder sb;
        String strOooO0oO;
        boolean z3;
        Level level = this.OooO0O0;
        C4225ox c4225oxRequest = oooO00o.request();
        if (level == Level.NONE) {
            return oooO00o.OooO0o0(c4225oxRequest);
        }
        boolean z4 = level == Level.BODY;
        boolean z5 = z4 || level == Level.HEADERS;
        AbstractC4262px abstractC4262pxOooO00o = c4225oxRequest.OooO00o();
        boolean z6 = abstractC4262pxOooO00o != null;
        InterfaceC4520ww interfaceC4520wwOooO0o = oooO00o.OooO0o();
        String str2 = "--> " + c4225oxRequest.OooO0oO() + ' ' + c4225oxRequest.OooOO0O() + ' ' + (interfaceC4520wwOooO0o != null ? interfaceC4520wwOooO0o.OooO00o() : Protocol.HTTP_1_1);
        if (!z5 && z6) {
            str2 = str2 + " (" + abstractC4262pxOooO00o.contentLength() + "-byte body)";
        }
        this.OooO00o.OooO00o(str2);
        if (z5) {
            if (z6) {
                if (abstractC4262pxOooO00o.contentType() != null) {
                    this.OooO00o.OooO00o("Content-Type: " + abstractC4262pxOooO00o.contentType());
                }
                if (abstractC4262pxOooO00o.contentLength() != -1) {
                    this.OooO00o.OooO00o("Content-Length: " + abstractC4262pxOooO00o.contentLength());
                }
            }
            C3966hx c3966hxOooO0o0 = c4225oxRequest.OooO0o0();
            int iOooOO0o = c3966hxOooO0o0.OooOO0o();
            int i = 0;
            while (i < iOooOO0o) {
                String strOooO0oO2 = c3966hxOooO0o0.OooO0oO(i);
                int i2 = iOooOO0o;
                if ("Content-Type".equalsIgnoreCase(strOooO0oO2) || "Content-Length".equalsIgnoreCase(strOooO0oO2)) {
                    z3 = z5;
                } else {
                    z3 = z5;
                    this.OooO00o.OooO00o(strOooO0oO2 + ": " + c3966hxOooO0o0.OooOOO(i));
                }
                i++;
                iOooOO0o = i2;
                z5 = z3;
            }
            z = z5;
            if (!z4 || !z6) {
                oooO00o3 = this.OooO00o;
                sb = new StringBuilder();
                sb.append("--> END ");
                strOooO0oO = c4225oxRequest.OooO0oO();
            } else if (OooO00o(c4225oxRequest.OooO0o0())) {
                oooO00o3 = this.OooO00o;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(c4225oxRequest.OooO0oO());
                strOooO0oO = " (encoded body omitted)";
            } else {
                h00 h00Var = new h00();
                abstractC4262pxOooO00o.writeTo(h00Var);
                Charset charsetOooO0O0 = OooO0OO;
                C4077kx c4077kxContentType = abstractC4262pxOooO00o.contentType();
                if (c4077kxContentType != null) {
                    charsetOooO0O0 = c4077kxContentType.OooO0O0(charsetOooO0O0);
                }
                this.OooO00o.OooO00o("");
                if (OooO0OO(h00Var)) {
                    this.OooO00o.OooO00o(h00Var.OooOoOO(charsetOooO0O0));
                    oooO00o3 = this.OooO00o;
                    sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(c4225oxRequest.OooO0oO());
                    sb.append(" (");
                    sb.append(abstractC4262pxOooO00o.contentLength());
                    sb.append("-byte body)");
                } else {
                    oooO00o3 = this.OooO00o;
                    sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(c4225oxRequest.OooO0oO());
                    sb.append(" (binary ");
                    sb.append(abstractC4262pxOooO00o.contentLength());
                    sb.append("-byte body omitted)");
                }
                oooO00o3.OooO00o(sb.toString());
            }
            sb.append(strOooO0oO);
            oooO00o3.OooO00o(sb.toString());
        } else {
            z = z5;
        }
        long jNanoTime = System.nanoTime();
        try {
            C4299qx c4299qxOooO0o0 = oooO00o.OooO0o0(c4225oxRequest);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            AbstractC4336rx abstractC4336rxOooOO0 = c4299qxOooO0o0.OooOO0();
            long jContentLength = abstractC4336rxOooOO0.contentLength();
            String str3 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            OooO00o oooO00o4 = this.OooO00o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- ");
            sb2.append(c4299qxOooO0o0.OoooooO());
            sb2.append(' ');
            sb2.append(c4299qxOooO0o0.o00ooo());
            sb2.append(' ');
            sb2.append(c4299qxOooO0o0.o0OOO0o().OooOO0O());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z ? "" : ", " + str3 + " body");
            sb2.append(')');
            oooO00o4.OooO00o(sb2.toString());
            if (z) {
                C3966hx c3966hxO00Oo0 = c4299qxOooO0o0.o00Oo0();
                int iOooOO0o2 = c3966hxO00Oo0.OooOO0o();
                for (int i3 = 0; i3 < iOooOO0o2; i3++) {
                    this.OooO00o.OooO00o(c3966hxO00Oo0.OooO0oO(i3) + ": " + c3966hxO00Oo0.OooOOO(i3));
                }
                if (z4 && C4374sy.OooO0OO(c4299qxOooO0o0)) {
                    if (OooO00o(c4299qxOooO0o0.o00Oo0())) {
                        oooO00o2 = this.OooO00o;
                        str = "<-- END HTTP (encoded body omitted)";
                    } else {
                        j00 j00VarSource = abstractC4336rxOooOO0.source();
                        j00VarSource.request(Long.MAX_VALUE);
                        h00 h00VarOooO00o = j00VarSource.OooO00o();
                        Charset charsetOooO0O02 = OooO0OO;
                        C4077kx c4077kxContentType2 = abstractC4336rxOooOO0.contentType();
                        if (c4077kxContentType2 != null) {
                            try {
                                charsetOooO0O02 = c4077kxContentType2.OooO0O0(charsetOooO0O02);
                            } catch (UnsupportedCharsetException unused) {
                                this.OooO00o.OooO00o("");
                                this.OooO00o.OooO00o("Couldn't decode the response body; charset is likely malformed.");
                                this.OooO00o.OooO00o("<-- END HTTP");
                                return c4299qxOooO0o0;
                            }
                        }
                        if (!OooO0OO(h00VarOooO00o)) {
                            this.OooO00o.OooO00o("");
                            this.OooO00o.OooO00o("<-- END HTTP (binary " + h00VarOooO00o.o00000O0() + "-byte body omitted)");
                            return c4299qxOooO0o0;
                        }
                        if (jContentLength != 0) {
                            this.OooO00o.OooO00o("");
                            this.OooO00o.OooO00o(h00VarOooO00o.clone().OooOoOO(charsetOooO0O02));
                        }
                        oooO00o2 = this.OooO00o;
                        str = "<-- END HTTP (" + h00VarOooO00o.o00000O0() + "-byte body)";
                    }
                    oooO00o2.OooO00o(str);
                } else {
                    this.OooO00o.OooO00o("<-- END HTTP");
                }
            }
            return c4299qxOooO0o0;
        } catch (Exception e) {
            this.OooO00o.OooO00o("<-- HTTP FAILED: " + e);
            throw e;
        }
    }
}
