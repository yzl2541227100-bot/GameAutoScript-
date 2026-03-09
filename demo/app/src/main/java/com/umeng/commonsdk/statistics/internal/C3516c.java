package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.C3483b;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.noise.ABTest;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.internal.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3516c {

    /* JADX INFO: renamed from: e */
    private static boolean f19278e;

    /* JADX INFO: renamed from: a */
    private String f19279a = "10.0.0.172";

    /* JADX INFO: renamed from: b */
    private int f19280b = 80;

    /* JADX INFO: renamed from: c */
    private Context f19281c;

    /* JADX INFO: renamed from: d */
    private InterfaceC3515b f19282d;

    public C3516c(Context context) {
        this.f19281c = context;
    }

    /* JADX INFO: renamed from: a */
    private void m16431a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f19281c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f19281c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        C3483b.f19145e = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        int testPolicy = ABTest.getService(this.f19281c).getTestPolicy();
        if (testPolicy != -1) {
            if (testPolicy == 0) {
                C3483b.f19145e = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
            } else if (testPolicy == 1) {
                C3483b.f19145e = new String[]{UMServerURL.SECONDARY_URL, UMServerURL.DEFAULT_URL};
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m16432b() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f19281c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f19281c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f19281c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f19281c, "android.permission.ACCESS_NETWORK_STATE") && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            C3454e.m15904a(this.f19281c, th);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m16433a(InterfaceC3515b interfaceC3515b) {
        this.f19282d = interfaceC3515b;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m16434a(byte[] bArr, String str) {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        URLConnection uRLConnectionOpenConnection;
        boolean z;
        try {
            InterfaceC3515b interfaceC3515b = this.f19282d;
            if (interfaceC3515b != null) {
                interfaceC3515b.onRequestStart();
            }
            if (m16432b()) {
                uRLConnectionOpenConnection = new URL(str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f19279a, this.f19280b)));
            } else {
                uRLConnectionOpenConnection = new URL(str).openConnection();
            }
            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            try {
                z = true;
                if (!f19278e) {
                    HttpsURLConnection.setDefaultHostnameVerifier(new X509HostnameVerifier() { // from class: com.umeng.commonsdk.statistics.internal.c.1
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
                    f19278e = true;
                }
                httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                httpsURLConnection.setRequestProperty("X-Umeng-Sdk", C3514a.m16423a(this.f19281c).m16428b());
                httpsURLConnection.setRequestProperty("Content-Type", C3514a.m16423a(this.f19281c).m16426a());
                httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setUseCaches(false);
                outputStream = httpsURLConnection.getOutputStream();
            } catch (Throwable th) {
                th = th;
                outputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            httpsURLConnection = null;
            outputStream = null;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            httpsURLConnection.connect();
            InterfaceC3515b interfaceC3515b2 = this.f19282d;
            if (interfaceC3515b2 != null) {
                interfaceC3515b2.onRequestEnd();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            String headerField = httpsURLConnection.getHeaderField("Content-Type");
            if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                z = false;
            }
            if (C3483b.f19146f) {
                MLog.m16263d("status code : " + responseCode + "; isThrifit:" + z);
            }
            if (responseCode != 200 || !z) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return null;
            }
            MLog.m16275i("Send message to server. status code is: " + responseCode);
            InputStream inputStream = httpsURLConnection.getInputStream();
            try {
                byte[] streamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return streamToByteArray;
            } finally {
                HelperUtils.safeClose(inputStream);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                MLog.m16271e("IOException,Failed to send message.", th);
                C3454e.m15904a(this.f19281c, th);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m16435a(byte[] bArr, boolean z) {
        m16431a();
        byte[] bArrM16434a = null;
        int i = 0;
        while (true) {
            String[] strArr = C3483b.f19145e;
            if (i >= strArr.length) {
                break;
            }
            bArrM16434a = m16434a(bArr, strArr[i]);
            if (bArrM16434a != null) {
                InterfaceC3515b interfaceC3515b = this.f19282d;
                if (interfaceC3515b != null) {
                    interfaceC3515b.onRequestSucceed(z);
                }
            } else {
                InterfaceC3515b interfaceC3515b2 = this.f19282d;
                if (interfaceC3515b2 != null) {
                    interfaceC3515b2.onRequestFailed();
                }
                i++;
            }
        }
        return bArrM16434a;
    }
}
