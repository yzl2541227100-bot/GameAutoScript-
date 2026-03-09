package p285z2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* JADX INFO: renamed from: z2.pz */
/* JADX INFO: loaded from: classes2.dex */
public final class C4264pz extends C4375sz {
    public final Method OooO0o;
    public final Method OooO0o0;

    public C4264pz(Method method, Method method2) {
        this.OooO0o0 = method;
        this.OooO0o = method2;
    }

    public static C4264pz OooOo0O() {
        try {
            return new C4264pz(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p285z2.C4375sz
    public void OooO0oo(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listOooO0O0 = C4375sz.OooO0O0(list);
            this.OooO0o0.invoke(sSLParameters, listOooO0O0.toArray(new String[listOooO0O0.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4558xx.OooO0O0("unable to set ssl parameters", e);
        }
    }

    @Override // p285z2.C4375sz
    @Nullable
    public String OooOOO(SSLSocket sSLSocket) {
        try {
            String str = (String) this.OooO0o.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C4558xx.OooO0O0("unable to get selected protocols", e);
        }
    }

    @Override // p285z2.C4375sz
    public X509TrustManager OooOo0(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
