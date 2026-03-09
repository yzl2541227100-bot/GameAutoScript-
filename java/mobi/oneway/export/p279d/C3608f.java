package mobi.oneway.export.p279d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.github.kevinsawicki.http.HttpRequest;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import mobi.oneway.export.p283g.C3636h;
import mobi.oneway.export.p283g.C3638j;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.d.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3608f {

    /* JADX INFO: renamed from: a */
    public static final String f19679a = "POST";

    /* JADX INFO: renamed from: b */
    public static final String f19680b = "HEAD";

    /* JADX INFO: renamed from: c */
    public static final String f19681c = "Content-Type";

    /* JADX INFO: renamed from: d */
    public static final String f19682d = "application/json";

    /* JADX INFO: renamed from: e */
    private static final int f19683e = 15000;

    /* JADX INFO: renamed from: f */
    private String f19684f;

    /* JADX INFO: renamed from: g */
    private String f19685g;

    /* JADX INFO: renamed from: h */
    private String f19686h;

    /* JADX INFO: renamed from: i */
    private final Map<String, String> f19687i;

    /* JADX INFO: renamed from: j */
    private final Map<String, String> f19688j;

    /* JADX INFO: renamed from: k */
    private int f19689k;

    /* JADX INFO: renamed from: l */
    private int f19690l;

    /* JADX INFO: renamed from: m */
    private boolean f19691m;

    /* JADX INFO: renamed from: n */
    private File f19692n;

    /* JADX INFO: renamed from: o */
    private boolean f19693o;

    /* JADX INFO: renamed from: p */
    private volatile boolean f19694p;

    /* JADX INFO: renamed from: q */
    private boolean f19695q;

    /* JADX INFO: renamed from: r */
    private long f19696r;

    /* JADX INFO: renamed from: s */
    private long f19697s;

    /* JADX INFO: renamed from: t */
    private boolean f19698t;

    /* JADX INFO: renamed from: u */
    private String[] f19699u;

    /* JADX INFO: renamed from: v */
    private String f19700v;

    /* JADX INFO: renamed from: w */
    private int f19701w;

    /* JADX INFO: renamed from: mobi.oneway.export.d.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m16793a(int i, int i2, C3604b c3604b);

        /* JADX INFO: renamed from: b */
        void m16794b(int i, int i2, C3604b c3604b);
    }

    /* JADX INFO: renamed from: mobi.oneway.export.d.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo16727a(Throwable th, C3604b c3604b);

        /* JADX INFO: renamed from: a */
        void mo16728a(C3604b c3604b);
    }

    /* JADX INFO: renamed from: mobi.oneway.export.d.f$c */
    public static class c extends Handler {

        /* JADX INFO: renamed from: a */
        public static final int f19702a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f19703b = 1;

        /* JADX INFO: renamed from: c */
        private b f19704c;

        public c(b bVar) {
            super(Looper.getMainLooper());
            this.f19704c = bVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                this.f19704c.mo16728a((C3604b) message.obj);
            } else {
                C3604b c3604b = (C3604b) message.obj;
                this.f19704c.mo16727a(c3604b.m16749m(), c3604b);
            }
        }
    }

    public C3608f(String str) {
        this.f19687i = new HashMap();
        this.f19688j = new HashMap();
        this.f19689k = 15000;
        this.f19690l = 15000;
        this.f19691m = false;
        this.f19693o = false;
        this.f19694p = false;
        this.f19695q = false;
        this.f19698t = false;
        m16777b(str);
        this.f19696r = System.currentTimeMillis();
    }

    public C3608f(String[] strArr, String str) {
        this.f19687i = new HashMap();
        this.f19688j = new HashMap();
        this.f19689k = 15000;
        this.f19690l = 15000;
        this.f19691m = false;
        this.f19693o = false;
        this.f19694p = false;
        this.f19695q = false;
        this.f19698t = false;
        this.f19699u = strArr;
        this.f19700v = str;
        this.f19701w = 0;
        this.f19696r = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private int m16753a(HttpURLConnection httpURLConnection, OutputStream outputStream, C3604b c3604b) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        int i;
        Thread threadCurrentThread = Thread.currentThread();
        BufferedInputStream bufferedInputStream2 = null;
        try {
            httpURLConnection.getContentLength();
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            try {
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream());
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            int i2 = 0;
            while (!m16783e() && !threadCurrentThread.isInterrupted() && (i = bufferedInputStream.read(bArr)) != -1) {
                bufferedOutputStream.write(bArr, 0, i);
                i2 += i;
                bufferedOutputStream.flush();
            }
            bufferedOutputStream.flush();
            if (!m16783e() && threadCurrentThread.isInterrupted()) {
                m16782d();
            }
            C3638j.m16981a(outputStream, bufferedInputStream, bufferedOutputStream);
            return i2;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            C3638j.m16981a(outputStream, bufferedInputStream2, bufferedOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m16754a(Map<String, String> map, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (String strM16757d : map.keySet()) {
            String strM16757d2 = map.get(strM16757d);
            if (strM16757d2 != null) {
                if (z) {
                    strM16757d = m16757d(strM16757d);
                    strM16757d2 = m16757d(strM16757d2);
                }
                sb.append(strM16757d);
                sb.append('=');
                sb.append(strM16757d2);
                sb.append('&');
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m16755a(HttpURLConnection httpURLConnection) throws Throwable {
        PrintWriter printWriter;
        String strM16786h;
        if ("POST".equals(m16785g())) {
            PrintWriter printWriter2 = null;
            try {
                httpURLConnection.setDoOutput(true);
                printWriter = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (TextUtils.isEmpty(this.f19686h)) {
                    if (!TextUtils.isEmpty(m16786h())) {
                        strM16786h = m16786h();
                    }
                    printWriter.flush();
                    C3638j.m16981a(printWriter);
                }
                strM16786h = this.f19686h;
                printWriter.write(strM16786h);
                printWriter.flush();
                C3638j.m16981a(printWriter);
            } catch (Throwable th2) {
                th = th2;
                printWriter2 = printWriter;
                C3638j.m16981a(printWriter2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m16756c(int i) {
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: d */
    private static String m16757d(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: o */
    private boolean m16758o() {
        return this.f19692n != null;
    }

    /* JADX INFO: renamed from: p */
    private boolean m16759p() {
        String[] strArr = this.f19699u;
        return strArr != null && strArr.length > 0 && this.f19701w < strArr.length - 1;
    }

    /* JADX INFO: renamed from: q */
    private HttpURLConnection m16760q() throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(m16784f()).openConnection();
        httpURLConnection.setInstanceFollowRedirects(this.f19691m);
        httpURLConnection.setConnectTimeout(m16787i());
        httpURLConnection.setReadTimeout(m16788j());
        httpURLConnection.setRequestMethod(m16785g());
        httpURLConnection.setRequestProperty(HttpRequest.HEADER_ACCEPT_ENCODING, "");
        if (!this.f19688j.isEmpty()) {
            for (String str : this.f19688j.keySet()) {
                httpURLConnection.setRequestProperty(str, this.f19688j.get(str));
            }
        }
        if (URLUtil.isHttpsUrl(this.f19684f)) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setHostnameVerifier(C3606d.m16752b());
            httpsURLConnection.setSSLSocketFactory(C3606d.m16751a());
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: r */
    private void m16761r() {
        if (this.f19685g == null) {
            this.f19685g = "GET";
        }
        this.f19685g = this.f19685g.toUpperCase();
        if (m16788j() <= 0) {
            throw new IllegalArgumentException("read timeout=" + m16788j() + " is <= 0.");
        }
        if (this.f19689k <= 0) {
            throw new IllegalArgumentException("connect timeout=" + m16787i() + " is <= 0.");
        }
        String[] strArr = this.f19699u;
        if (strArr != null && strArr.length > 0 && !TextUtils.isEmpty(this.f19700v)) {
            this.f19684f = this.f19699u[this.f19701w] + this.f19700v;
        }
        if (this.f19687i.isEmpty()) {
            return;
        }
        String strM16754a = m16754a(this.f19687i, true);
        if ("POST".equals(this.f19685g) && TextUtils.isEmpty(this.f19686h)) {
            this.f19686h = strM16754a;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19684f);
        sb.append(this.f19684f.indexOf("?") > 0 ? "&" : "?");
        this.f19684f = sb.toString();
        this.f19684f += strM16754a;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16762a(int i) {
        this.f19689k = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16763a(int i, int i2) {
        m16762a(i);
        m16774b(i2);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16764a(File file) {
        return m16765a(file, false);
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16765a(File file, boolean z) {
        this.f19692n = file;
        this.f19693o = z;
        if (z) {
            m16768a(HttpHeaders.RANGE, "bytes=" + file.length() + "-");
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16766a(String str) {
        this.f19686h = str;
        m16768a("Content-Type", "application/json");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16767a(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        this.f19687i.put(str, String.valueOf(obj));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16768a(String str, String str2) {
        this.f19688j.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16769a(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            this.f19688j.putAll(map);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16770a(JSONArray jSONArray) {
        this.f19686h = jSONArray.toString();
        m16768a("Content-Type", "application/json");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16771a(JSONObject jSONObject) {
        this.f19686h = jSONObject.toString();
        m16768a("Content-Type", "application/json");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3608f m16772a(boolean z) {
        this.f19695q = z;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16773a() {
        return this.f19695q;
    }

    /* JADX INFO: renamed from: b */
    public C3608f m16774b(int i) {
        this.f19690l = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C3608f m16775b(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            this.f19687i.putAll(map);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C3608f m16776b(boolean z) {
        this.f19698t = z;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m16777b(String str) {
        this.f19684f = str;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16778b() {
        return this.f19698t;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m16779c() {
        return this.f19687i;
    }

    /* JADX INFO: renamed from: c */
    public C3608f m16780c(String str) {
        this.f19685g = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C3608f m16781c(boolean z) {
        this.f19691m = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m16782d() {
        this.f19694p = true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16783e() {
        return this.f19694p;
    }

    /* JADX INFO: renamed from: f */
    public String m16784f() {
        return this.f19684f;
    }

    /* JADX INFO: renamed from: g */
    public String m16785g() {
        return this.f19685g;
    }

    /* JADX INFO: renamed from: h */
    public String m16786h() {
        return new URL(this.f19684f).getQuery();
    }

    /* JADX INFO: renamed from: i */
    public int m16787i() {
        return this.f19689k;
    }

    /* JADX INFO: renamed from: j */
    public int m16788j() {
        return this.f19690l;
    }

    /* JADX INFO: renamed from: k */
    public String m16789k() {
        return m16792n().m16740d();
    }

    /* JADX INFO: renamed from: l */
    public byte[] m16790l() {
        return m16792n().m16739c();
    }

    /* JADX INFO: renamed from: m */
    public JSONObject m16791m() {
        return new JSONObject(m16789k());
    }

    /* JADX INFO: renamed from: n */
    public C3604b m16792n() throws Throwable {
        this.f19697s = System.currentTimeMillis();
        C3604b c3604b = new C3604b(this);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                m16761r();
                HttpURLConnection httpURLConnectionM16760q = m16760q();
                try {
                    m16755a(httpURLConnectionM16760q);
                    int responseCode = httpURLConnectionM16760q.getResponseCode();
                    c3604b.m16732a(responseCode);
                    c3604b.m16735a(httpURLConnectionM16760q.getHeaderFields());
                    int contentLength = httpURLConnectionM16760q.getContentLength();
                    c3604b.m16733a(contentLength);
                    if (!this.f19695q) {
                        if (m16758o()) {
                            c3604b.m16734a(this.f19692n);
                            C3636h.m16959c(this.f19692n.getParent(), (String) null);
                            m16753a(httpURLConnectionM16760q, new FileOutputStream(this.f19692n, this.f19693o), c3604b);
                        } else {
                            if (contentLength > 2097152) {
                                throw new IOException("Body is too large to load in memory: contentLength = " + contentLength + " B");
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            m16753a(httpURLConnectionM16760q, byteArrayOutputStream, c3604b);
                            c3604b.m16737a(byteArrayOutputStream.toByteArray());
                        }
                    }
                    if (!m16759p() || m16756c(responseCode)) {
                        C3638j.m16980a(httpURLConnectionM16760q);
                        return c3604b;
                    }
                    this.f19701w++;
                    C3604b c3604bM16792n = m16792n();
                    C3638j.m16980a(httpURLConnectionM16760q);
                    return c3604bM16792n;
                } catch (IOException e) {
                    e = e;
                    httpURLConnection = httpURLConnectionM16760q;
                    if (!m16759p()) {
                        throw e;
                    }
                    this.f19701w++;
                    C3604b c3604bM16792n2 = m16792n();
                    C3638j.m16980a(httpURLConnection);
                    return c3604bM16792n2;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionM16760q;
                    C3638j.m16980a(httpURLConnection);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
