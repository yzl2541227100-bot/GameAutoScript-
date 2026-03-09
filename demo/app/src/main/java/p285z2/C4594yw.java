package p285z2;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* JADX INFO: renamed from: z2.yw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4594yw {
    public static final C4594yw OooO;
    private static final C4483vw[] OooO0o;
    private static final C4483vw[] OooO0o0;
    public static final C4594yw OooO0oO;
    public static final C4594yw OooO0oo;
    public static final C4594yw OooOO0;
    public final boolean OooO00o;
    public final boolean OooO0O0;

    @Nullable
    public final String[] OooO0OO;

    @Nullable
    public final String[] OooO0Oo;

    /* JADX INFO: renamed from: z2.yw$OooO00o */
    public static final class OooO00o {
        public boolean OooO00o;

        @Nullable
        public String[] OooO0O0;

        @Nullable
        public String[] OooO0OO;
        public boolean OooO0Oo;

        public OooO00o(C4594yw c4594yw) {
            this.OooO00o = c4594yw.OooO00o;
            this.OooO0O0 = c4594yw.OooO0OO;
            this.OooO0OO = c4594yw.OooO0Oo;
            this.OooO0Oo = c4594yw.OooO0O0;
        }

        public OooO00o(boolean z) {
            this.OooO00o = z;
        }

        public OooO00o OooO00o() {
            if (!this.OooO00o) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            this.OooO0O0 = null;
            return this;
        }

        public OooO00o OooO0O0() {
            if (!this.OooO00o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            this.OooO0OO = null;
            return this;
        }

        public C4594yw OooO0OO() {
            return new C4594yw(this);
        }

        public OooO00o OooO0Oo(String... strArr) {
            if (!this.OooO00o) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.OooO0O0 = (String[]) strArr.clone();
            return this;
        }

        public OooO00o OooO0o(boolean z) {
            if (!this.OooO00o) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.OooO0Oo = z;
            return this;
        }

        public OooO00o OooO0o0(C4483vw... c4483vwArr) {
            if (!this.OooO00o) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c4483vwArr.length];
            for (int i = 0; i < c4483vwArr.length; i++) {
                strArr[i] = c4483vwArr[i].OooO00o;
            }
            return OooO0Oo(strArr);
        }

        public OooO00o OooO0oO(String... strArr) {
            if (!this.OooO00o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.OooO0OO = (String[]) strArr.clone();
            return this;
        }

        public OooO00o OooO0oo(TlsVersion... tlsVersionArr) {
            if (!this.OooO00o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            return OooO0oO(strArr);
        }
    }

    static {
        C4483vw c4483vw = C4483vw.o000;
        C4483vw c4483vw2 = C4483vw.o000O000;
        C4483vw c4483vw3 = C4483vw.o000OoO;
        C4483vw c4483vw4 = C4483vw.o000O0o;
        C4483vw c4483vw5 = C4483vw.o000Ooo;
        C4483vw c4483vw6 = C4483vw.o0000OOO;
        C4483vw c4483vw7 = C4483vw.o0000OoO;
        C4483vw c4483vw8 = C4483vw.o0000OOo;
        C4483vw c4483vw9 = C4483vw.o0000o0;
        C4483vw c4483vw10 = C4483vw.o0000oOo;
        C4483vw c4483vw11 = C4483vw.o0000oOO;
        C4483vw[] c4483vwArr = {c4483vw, c4483vw2, c4483vw3, c4483vw4, c4483vw5, c4483vw6, c4483vw7, c4483vw8, c4483vw9, c4483vw10, c4483vw11};
        OooO0o0 = c4483vwArr;
        C4483vw[] c4483vwArr2 = {c4483vw, c4483vw2, c4483vw3, c4483vw4, c4483vw5, c4483vw6, c4483vw7, c4483vw8, c4483vw9, c4483vw10, c4483vw11, C4483vw.o00000Oo, C4483vw.o00000o0, C4483vw.OoooooO, C4483vw.Ooooooo, C4483vw.Oooo00O, C4483vw.Oooo0OO, C4483vw.OooOO0O};
        OooO0o = c4483vwArr2;
        OooO00o oooO00oOooO0o0 = new OooO00o(true).OooO0o0(c4483vwArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        OooO0oO = oooO00oOooO0o0.OooO0oo(tlsVersion, tlsVersion2).OooO0o(true).OooO0OO();
        OooO00o oooO00oOooO0o02 = new OooO00o(true).OooO0o0(c4483vwArr2);
        TlsVersion tlsVersion3 = TlsVersion.TLS_1_0;
        OooO0oo = oooO00oOooO0o02.OooO0oo(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, tlsVersion3).OooO0o(true).OooO0OO();
        OooO = new OooO00o(true).OooO0o0(c4483vwArr2).OooO0oo(tlsVersion3).OooO0o(true).OooO0OO();
        OooOO0 = new OooO00o(false).OooO0OO();
    }

    public C4594yw(OooO00o oooO00o) {
        this.OooO00o = oooO00o.OooO00o;
        this.OooO0OO = oooO00o.OooO0O0;
        this.OooO0Oo = oooO00o.OooO0OO;
        this.OooO0O0 = oooO00o.OooO0Oo;
    }

    private C4594yw OooO0o0(SSLSocket sSLSocket, boolean z) {
        String[] strArrOooOoOO = this.OooO0OO != null ? C4558xx.OooOoOO(C4483vw.OooO0O0, sSLSocket.getEnabledCipherSuites(), this.OooO0OO) : sSLSocket.getEnabledCipherSuites();
        String[] strArrOooOoOO2 = this.OooO0Oo != null ? C4558xx.OooOoOO(C4558xx.OooOOo0, sSLSocket.getEnabledProtocols(), this.OooO0Oo) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iOooOo = C4558xx.OooOo(C4483vw.OooO0O0, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iOooOo != -1) {
            strArrOooOoOO = C4558xx.OooOO0(strArrOooOoOO, supportedCipherSuites[iOooOo]);
        }
        return new OooO00o(this).OooO0Oo(strArrOooOoOO).OooO0oO(strArrOooOoOO2).OooO0OO();
    }

    public void OooO00o(SSLSocket sSLSocket, boolean z) {
        C4594yw c4594ywOooO0o0 = OooO0o0(sSLSocket, z);
        String[] strArr = c4594ywOooO0o0.OooO0Oo;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c4594ywOooO0o0.OooO0OO;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<C4483vw> OooO0O0() {
        String[] strArr = this.OooO0OO;
        if (strArr != null) {
            return C4483vw.OooO0O0(strArr);
        }
        return null;
    }

    public boolean OooO0OO(SSLSocket sSLSocket) {
        if (!this.OooO00o) {
            return false;
        }
        String[] strArr = this.OooO0Oo;
        if (strArr != null && !C4558xx.OooOoo(C4558xx.OooOOo0, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.OooO0OO;
        return strArr2 == null || C4558xx.OooOoo(C4483vw.OooO0O0, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean OooO0Oo() {
        return this.OooO00o;
    }

    public boolean OooO0o() {
        return this.OooO0O0;
    }

    @Nullable
    public List<TlsVersion> OooO0oO() {
        String[] strArr = this.OooO0Oo;
        if (strArr != null) {
            return TlsVersion.forJavaNames(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C4594yw)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4594yw c4594yw = (C4594yw) obj;
        boolean z = this.OooO00o;
        if (z != c4594yw.OooO00o) {
            return false;
        }
        return !z || (Arrays.equals(this.OooO0OO, c4594yw.OooO0OO) && Arrays.equals(this.OooO0Oo, c4594yw.OooO0Oo) && this.OooO0O0 == c4594yw.OooO0O0);
    }

    public int hashCode() {
        if (this.OooO00o) {
            return ((((527 + Arrays.hashCode(this.OooO0OO)) * 31) + Arrays.hashCode(this.OooO0Oo)) * 31) + (!this.OooO0O0 ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.OooO00o) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.OooO0OO != null ? OooO0O0().toString() : "[all enabled]") + ", tlsVersions=" + (this.OooO0Oo != null ? OooO0oO().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.OooO0O0 + ")";
    }
}
