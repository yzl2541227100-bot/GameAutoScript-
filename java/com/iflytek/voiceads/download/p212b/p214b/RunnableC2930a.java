package com.iflytek.voiceads.download.p212b.p214b;

import android.os.Process;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1849b;
import com.github.kevinsawicki.http.HttpRequest;
import com.iflytek.voiceads.download.p212b.InterfaceC2927a;
import com.iflytek.voiceads.download.p216d.C2938a;
import com.iflytek.voiceads.download.p216d.C2939b;
import com.iflytek.voiceads.download.p217e.C2941a;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.b.b.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class RunnableC2930a implements Runnable {

    /* JADX INFO: renamed from: a */
    private C2939b f16257a;

    /* JADX INFO: renamed from: b */
    private InterfaceC2927a f16258b;

    /* JADX INFO: renamed from: c */
    private C2938a f16259c;

    /* JADX INFO: renamed from: d */
    private a f16260d;

    /* JADX INFO: renamed from: e */
    private InputStream f16261e;

    /* JADX INFO: renamed from: f */
    private long f16262f;

    /* JADX INFO: renamed from: com.iflytek.voiceads.download.b.b.a$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo13322c();

        /* JADX INFO: renamed from: d */
        void mo13323d();

        /* JADX INFO: renamed from: e */
        void mo13324e();
    }

    public RunnableC2930a(C2939b c2939b, InterfaceC2927a interfaceC2927a, C2938a c2938a, a aVar) {
        this.f16257a = c2939b;
        this.f16258b = interfaceC2927a;
        this.f16259c = c2938a;
        this.f16262f = c2939b.m13398d();
        this.f16260d = aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m13320a() throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.f16257a.m13394a()).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setRequestProperty(HttpRequest.HEADER_ACCEPT, "image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
                    httpURLConnection2.setRequestProperty("Accept-Language", "zh-CN");
                    httpURLConnection2.setRequestProperty("Charset", "UTF-8");
                    httpURLConnection2.setRequestProperty("Connection", C1849b.f11404c);
                    long jM13396b = this.f16257a.m13396b() + this.f16262f;
                    if (this.f16259c.m13388i()) {
                        httpURLConnection2.setRequestProperty(HttpHeaders.RANGE, "bytes=" + jM13396b + "-" + this.f16257a.m13397c());
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode != 206 && responseCode != 200) {
                        throw new C2941a(8, "UnSupported response code:" + responseCode);
                    }
                    m13321b();
                    this.f16261e = httpURLConnection2.getInputStream();
                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.f16259c.m13382c(), "rwd");
                    randomAccessFile.seek(jM13396b);
                    byte[] bArr = new byte[4096];
                    int i = 0;
                    while (true) {
                        int i2 = this.f16261e.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        randomAccessFile.write(bArr, 0, i2);
                        i += i2;
                        synchronized (this.f16260d) {
                            this.f16257a.m13395a(this.f16262f + ((long) i));
                            this.f16260d.mo13322c();
                        }
                    }
                    this.f16260d.mo13323d();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (C2941a e) {
                    e = e;
                    throw new C2941a(7, "illegal error", e);
                } catch (ProtocolException e2) {
                    e = e2;
                    throw new C2941a(4, "Protocol error", e);
                } catch (IOException e3) {
                    e = e3;
                    throw new C2941a(5, "IO error", e);
                } catch (Exception e4) {
                    e = e4;
                    throw new C2941a(9, "other error", e);
                } catch (Throwable th) {
                    httpURLConnection = httpURLConnection2;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (C2941a e5) {
                e = e5;
            } catch (ProtocolException e6) {
                e = e6;
            } catch (IOException e7) {
                e = e7;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m13321b() {
        if (this.f16259c != null && this.f16259c.m13390k()) {
            throw new C2941a(7);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        Process.setThreadPriority(10);
        try {
            m13321b();
            m13320a();
        } catch (C2941a e) {
            this.f16260d.mo13324e();
            this.f16259c.m13374a(e);
            this.f16259c.m13371a(5);
            this.f16258b.mo13315a(this.f16259c);
        }
    }
}
