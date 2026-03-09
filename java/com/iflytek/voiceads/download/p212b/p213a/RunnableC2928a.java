package com.iflytek.voiceads.download.p212b.p213a;

import android.os.Process;
import android.text.TextUtils;
import cn.haorui.sdk.core.HRConfig;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.iflytek.voiceads.download.p212b.InterfaceC2927a;
import com.iflytek.voiceads.download.p216d.C2938a;
import com.iflytek.voiceads.download.p217e.C2941a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/* JADX INFO: renamed from: com.iflytek.voiceads.download.b.a.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class RunnableC2928a implements Runnable {

    /* JADX INFO: renamed from: a */
    private InterfaceC2927a f16250a;

    /* JADX INFO: renamed from: b */
    private C2938a f16251b;

    /* JADX INFO: renamed from: c */
    private a f16252c;

    /* JADX INFO: renamed from: d */
    private final int f16253d = 10000;

    /* JADX INFO: renamed from: e */
    private final int f16254e = 10000;

    /* JADX INFO: renamed from: com.iflytek.voiceads.download.b.a.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13318a(long j, boolean z);

        /* JADX INFO: renamed from: b */
        void mo13319b();
    }

    public RunnableC2928a(InterfaceC2927a interfaceC2927a, C2938a c2938a, a aVar) {
        this.f16250a = interfaceC2927a;
        this.f16251b = c2938a;
        this.f16252c = aVar;
    }

    /* JADX INFO: renamed from: a */
    private void m13316a() throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.f16251b.m13378b()).openConnection();
                try {
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setRequestProperty(HttpHeaders.RANGE, "bytes=0-");
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode == 200) {
                        m13317a(httpURLConnection2, false);
                    } else {
                        if (responseCode != 206) {
                            throw new C2941a(3, "UnSupported response code:" + responseCode);
                        }
                        m13317a(httpURLConnection2, true);
                    }
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (MalformedURLException e) {
                    e = e;
                    throw new C2941a(2, "Bad url.", e);
                } catch (ProtocolException e2) {
                    e = e2;
                    throw new C2941a(4, "Protocol error", e);
                } catch (IOException e3) {
                    e = e3;
                    throw new C2941a(5, "IO error", e);
                } catch (Exception e4) {
                    e = e4;
                    throw new C2941a(5, "Unknown error", e);
                } catch (Throwable th) {
                    httpURLConnection = httpURLConnection2;
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (MalformedURLException e5) {
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

    /* JADX INFO: renamed from: a */
    private void m13317a(HttpURLConnection httpURLConnection, boolean z) throws C2941a {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        long contentLength = (TextUtils.isEmpty(headerField) || headerField.equals("0") || headerField.equals(HRConfig.GENDER_UNKNOWN)) ? httpURLConnection.getContentLength() : Long.parseLong(headerField);
        if (contentLength <= 0) {
            throw new C2941a(6, "length <= 0");
        }
        if (this.f16251b.m13390k()) {
            throw new C2941a(7);
        }
        this.f16252c.mo13318a(contentLength, z);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        Process.setThreadPriority(10);
        try {
            m13316a();
        } catch (C2941a e) {
            this.f16252c.mo13319b();
            this.f16251b.m13374a(e);
            this.f16251b.m13371a(5);
            this.f16250a.mo13315a(this.f16251b);
        }
    }
}
