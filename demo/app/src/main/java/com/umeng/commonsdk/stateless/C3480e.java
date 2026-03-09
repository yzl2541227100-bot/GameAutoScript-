package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3480e {

    /* JADX INFO: renamed from: a */
    private String f19132a = "10.0.0.172";

    /* JADX INFO: renamed from: b */
    private int f19133b = 80;

    /* JADX INFO: renamed from: c */
    private Context f19134c;

    public C3480e(Context context) {
        this.f19134c = context;
    }

    /* JADX INFO: renamed from: a */
    private boolean m16238a() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.f19134c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f19134c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f19134c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f19134c, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            C3454e.m15904a(this.f19134c, th);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16239a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        URLConnection uRLConnectionOpenConnection;
        if (bArr == null || str == null) {
            C3489e.m16329a("walle", "[stateless] sendMessage, envelopeByte == null || path == null ");
            return false;
        }
        OutputStream outputStream = null;
        try {
            if (m16238a()) {
                uRLConnectionOpenConnection = new URL("https://plbslog.umeng.com/" + str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f19132a, this.f19133b)));
            } else {
                uRLConnectionOpenConnection = new URL("https://plbslog.umeng.com/" + str).openConnection();
            }
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            try {
                HttpsURLConnection.setDefaultHostnameVerifier(new X509HostnameVerifier() { // from class: com.umeng.commonsdk.stateless.e.1
                    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
                    public void verify(String str2, X509Certificate x509Certificate) throws SSLException {
                    }

                    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
                    public void verify(String str2, SSLSocket sSLSocket) throws IOException {
                    }

                    @Override // org.apache.http.conn.ssl.X509HostnameVerifier
                    public void verify(String str2, String[] strArr, String[] strArr2) throws SSLException {
                    }

                    @Override // org.apache.http.conn.ssl.X509HostnameVerifier, javax.net.ssl.HostnameVerifier
                    public boolean verify(String str2, SSLSession sSLSession) {
                        return true;
                    }
                });
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
                httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setUseCaches(false);
                outputStream = httpsURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                httpsURLConnection.connect();
                z = httpsURLConnection.getResponseCode() == 200;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C3454e.m15904a(this.f19134c, th);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    if (httpsURLConnection != null) {
                    }
                    return z;
                } finally {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection = null;
        }
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16240b(byte[] bArr, String str) {
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnectionOpenConnection;
        if (bArr == null || str == null) {
            return false;
        }
        OutputStream outputStream = null;
        try {
            if (m16238a()) {
                uRLConnectionOpenConnection = new URL("https://plbslog.umeng.com/" + str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f19132a, this.f19133b)));
            } else {
                uRLConnectionOpenConnection = new URL("https://plbslog.umeng.com/" + str).openConnection();
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
            httpURLConnection.setRequestProperty("Msg-Type", "envelope/json");
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            httpURLConnection.connect();
            z = httpURLConnection.getResponseCode() == 200;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                C3454e.m15904a(this.f19134c, th);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                if (httpURLConnection != null) {
                }
                return z;
            } finally {
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return z;
    }
}
