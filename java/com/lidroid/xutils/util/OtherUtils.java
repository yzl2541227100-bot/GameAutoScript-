package com.lidroid.xutils.util;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.github.kevinsawicki.http.HttpRequest;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpRequestBase;

/* JADX INFO: loaded from: classes2.dex */
public class OtherUtils {
    private static final int STRING_BUFFER_LENGTH = 100;
    private static SSLSocketFactory sslSocketFactory;

    /* JADX INFO: renamed from: com.lidroid.xutils.util.OtherUtils$1 */
    public class C30501 implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    private OtherUtils() {
    }

    public static long getAvailableSpace(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            return ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
        } catch (Throwable th) {
            LogUtils.m13791e(th.getMessage(), th);
            return -1L;
        }
    }

    public static StackTraceElement getCallerStackTraceElement() {
        return Thread.currentThread().getStackTrace()[4];
    }

    public static Charset getCharsetFromHttpRequest(HttpRequestBase httpRequestBase) {
        String value;
        if (httpRequestBase == null) {
            return null;
        }
        Header firstHeader = httpRequestBase.getFirstHeader("Content-Type");
        boolean zIsSupported = false;
        if (firstHeader != null) {
            for (HeaderElement headerElement : firstHeader.getElements()) {
                NameValuePair parameterByName = headerElement.getParameterByName(HttpRequest.PARAM_CHARSET);
                if (parameterByName != null) {
                    value = parameterByName.getValue();
                    break;
                }
            }
            value = null;
        } else {
            value = null;
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                zIsSupported = Charset.isSupported(value);
            } catch (Throwable unused) {
            }
        }
        if (zIsSupported) {
            return Charset.forName(value);
        }
        return null;
    }

    public static StackTraceElement getCurrentStackTraceElement() {
        return Thread.currentThread().getStackTrace()[3];
    }

    public static String getDiskCacheDir(Context context, String str) {
        File cacheDir;
        File externalCacheDir;
        String path = (!"mounted".equals(Environment.getExternalStorageState()) || (externalCacheDir = context.getExternalCacheDir()) == null) ? null : externalCacheDir.getPath();
        if (path == null && (cacheDir = context.getCacheDir()) != null && cacheDir.exists()) {
            path = cacheDir.getPath();
        }
        return String.valueOf(path) + File.separator + str;
    }

    public static String getFileNameFromHttpResponse(HttpResponse httpResponse) {
        Header firstHeader;
        if (httpResponse == null || (firstHeader = httpResponse.getFirstHeader("Content-Disposition")) == null) {
            return null;
        }
        for (HeaderElement headerElement : firstHeader.getElements()) {
            NameValuePair parameterByName = headerElement.getParameterByName("filename");
            if (parameterByName != null) {
                String value = parameterByName.getValue();
                return CharsetUtils.toCharset(value, "UTF-8", value.length());
            }
        }
        return null;
    }

    public static String getSubString(String str, int i, int i2) {
        return new String(str.substring(i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getUserAgent(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L1f
            java.lang.String r1 = "com.android.internal.R$string"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "web_user_agent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1e
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r4.getString(r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
        L1f:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L27
            java.lang.String r0 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 %sSafari/533.1"
        L27:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            int r3 = r2.length()
            if (r3 <= 0) goto L39
            goto L3b
        L39:
            java.lang.String r2 = "1.0"
        L3b:
            r1.append(r2)
            java.lang.String r2 = "; "
            r1.append(r2)
            java.lang.String r3 = r4.getLanguage()
            if (r3 == 0) goto L60
            java.lang.String r3 = r3.toLowerCase()
            r1.append(r3)
            java.lang.String r4 = r4.getCountry()
            if (r4 == 0) goto L65
            java.lang.String r3 = "-"
            r1.append(r3)
            java.lang.String r4 = r4.toLowerCase()
            goto L62
        L60:
            java.lang.String r4 = "en"
        L62:
            r1.append(r4)
        L65:
            java.lang.String r4 = android.os.Build.VERSION.CODENAME
            java.lang.String r3 = "REL"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L7d
            java.lang.String r4 = android.os.Build.MODEL
            int r3 = r4.length()
            if (r3 <= 0) goto L7d
            r1.append(r2)
            r1.append(r4)
        L7d:
            java.lang.String r4 = android.os.Build.ID
            int r2 = r4.length()
            if (r2 <= 0) goto L8d
            java.lang.String r2 = " Build/"
            r1.append(r2)
            r1.append(r4)
        L8d:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            r4[r2] = r1
            r1 = 1
            java.lang.String r2 = "Mobile "
            r4[r1] = r2
            java.lang.String r4 = java.lang.String.format(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lidroid.xutils.util.OtherUtils.getUserAgent(android.content.Context):java.lang.String");
    }

    public static boolean isSupportRange(HttpResponse httpResponse) {
        String value;
        if (httpResponse == null) {
            return false;
        }
        Header firstHeader = httpResponse.getFirstHeader("Accept-Ranges");
        if (firstHeader != null) {
            return "bytes".equals(firstHeader.getValue());
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Content-Range");
        return (firstHeader2 == null || (value = firstHeader2.getValue()) == null || !value.startsWith("bytes")) ? false : true;
    }

    public static long sizeOfString(String str, String str2) throws UnsupportedEncodingException {
        long length = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length2 = str.length();
        if (length2 < 100) {
            return str.getBytes(str2).length;
        }
        int i = 0;
        while (i < length2) {
            int i2 = i + 100;
            length += (long) getSubString(str, i, i2 < length2 ? i2 : length2).getBytes(str2).length;
            i = i2;
        }
        return length;
    }

    public static void trustAllHttpsURLConnection() {
        if (sslSocketFactory == null) {
            TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.lidroid.xutils.util.OtherUtils.1
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            }};
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, trustManagerArr, null);
                sslSocketFactory = sSLContext.getSocketFactory();
            } catch (Throwable th) {
                LogUtils.m13791e(th.getMessage(), th);
            }
        }
        SSLSocketFactory sSLSocketFactory = sslSocketFactory;
        if (sSLSocketFactory != null) {
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLSocketFactory);
            HttpsURLConnection.setDefaultHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        }
    }
}
