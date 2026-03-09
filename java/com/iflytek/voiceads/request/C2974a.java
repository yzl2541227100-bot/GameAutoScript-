package com.iflytek.voiceads.request;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.voiceads.utils.C2985c;
import com.iflytek.voiceads.utils.C2989g;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.iflytek.voiceads.request.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2974a extends Thread {

    /* JADX INFO: renamed from: a */
    private URL f16430a;

    /* JADX INFO: renamed from: b */
    private Context f16431b;

    /* JADX INFO: renamed from: d */
    private int f16433d;

    /* JADX INFO: renamed from: e */
    private int f16434e;

    /* JADX INFO: renamed from: f */
    private long f16435f;

    /* JADX INFO: renamed from: c */
    private int f16432c = 0;

    /* JADX INFO: renamed from: g */
    private boolean f16436g = true;

    /* JADX INFO: renamed from: h */
    private ArrayList<byte[]> f16437h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    private a f16438i = null;

    /* JADX INFO: renamed from: com.iflytek.voiceads.request.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13286a(Exception exc, int i);

        /* JADX INFO: renamed from: a */
        void mo13287a(byte[] bArr);
    }

    /* JADX INFO: renamed from: a */
    public static URL m13513a(String str, String str2) throws MalformedURLException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.endsWith("?")) {
                str = str + "?";
            }
            str = str + str2;
        }
        if (str.contains(C4196o4.OooO00o.OooO0Oo)) {
            str = str.replaceAll(C4196o4.OooO00o.OooO0Oo, "%20");
        }
        return new URL(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[Catch: Exception -> 0x00c9, TRY_LEAVE, TryCatch #3 {Exception -> 0x00c9, blocks: (B:30:0x00c0, B:32:0x00c5), top: B:49:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m13514a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.voiceads.request.C2974a.m13514a():void");
    }

    /* JADX INFO: renamed from: a */
    private void m13515a(Exception exc, int i) {
        if (this.f16438i != null) {
            this.f16438i.mo13286a(exc, i);
        }
        if (this.f16436g) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f16435f;
            switch (this.f16433d) {
                case 0:
                    C2985c.m13541a(this.f16431b, "reqDuration", jCurrentTimeMillis);
                    C2985c.m13541a(this.f16431b, "reqFailCnt", C2985c.m13539a(this.f16431b, "reqFailCnt") + 1);
                    break;
                case 1:
                    C2985c.m13541a(this.f16431b, "impDuration", jCurrentTimeMillis);
                    C2985c.m13541a(this.f16431b, "impFailCnt", C2985c.m13539a(this.f16431b, "impFailCnt") + 1);
                    break;
                case 2:
                    C2985c.m13541a(this.f16431b, "clkDuration", jCurrentTimeMillis);
                    C2985c.m13541a(this.f16431b, "clkFailCnt", C2985c.m13539a(this.f16431b, "clkFailCnt") + 1);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m13516a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            SSLContext sSLContextM13530a = C2980g.m13530a();
            if (sSLContextM13530a != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContextM13530a.getSocketFactory());
            }
            if (C2980g.f16442a != null) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(C2980g.f16442a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m13517a(byte[] bArr) {
        if (bArr != null) {
            this.f16437h.add(bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m13518a(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = bufferedInputStream.read(bArr, 0, bArr.length);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010a A[Catch: Exception -> 0x0132, TryCatch #11 {Exception -> 0x0132, blocks: (B:39:0x0105, B:41:0x010a, B:43:0x010f), top: B:69:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #11 {Exception -> 0x0132, blocks: (B:39:0x0105, B:41:0x010a, B:43:0x010f), top: B:69:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m13519b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.voiceads.request.C2974a.m13519b():void");
    }

    /* JADX INFO: renamed from: b */
    private void m13520b(byte[] bArr) {
        if (this.f16438i != null) {
            this.f16438i.mo13287a(bArr);
        }
        if (this.f16436g) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f16435f;
            switch (this.f16433d) {
                case 0:
                    C2985c.m13541a(this.f16431b, "reqDuration", jCurrentTimeMillis);
                    C2985c.m13541a(this.f16431b, "reqFailCnt", 0L);
                    break;
                case 1:
                    C2985c.m13541a(this.f16431b, "impDuration", jCurrentTimeMillis);
                    C2985c.m13541a(this.f16431b, "impFailCnt", 0L);
                    break;
                case 2:
                    C2985c.m13541a(this.f16431b, "clkDuration", jCurrentTimeMillis);
                    C2985c.m13541a(this.f16431b, "clkFailCnt", 0L);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13521a(int i) {
        this.f16433d = i;
    }

    /* JADX INFO: renamed from: a */
    public void m13522a(Context context) {
        this.f16431b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public void m13523a(a aVar) {
        if (this.f16436g) {
            this.f16435f = System.currentTimeMillis();
        }
        this.f16438i = aVar;
        start();
    }

    /* JADX INFO: renamed from: a */
    public void m13524a(String str, String str2, byte[] bArr) {
        this.f16437h.clear();
        m13517a(bArr);
        try {
            this.f16430a = m13513a(str, str2);
        } catch (MalformedURLException e) {
            C2989g.m13557b("IFLY_AD_SDK", "url error:" + e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13525a(boolean z) {
        this.f16436g = z;
    }

    /* JADX INFO: renamed from: b */
    public void m13526b(int i) {
        this.f16432c = i;
    }

    /* JADX INFO: renamed from: c */
    public void m13527c(int i) {
        this.f16434e = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        if (this.f16432c == 1) {
            m13519b();
        } else {
            m13514a();
        }
    }
}
