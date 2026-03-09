package cn.haorui.sdk.core.download;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import cn.haorui.sdk.core.utils.StringUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.anythink.china.common.p033a.AbstractC1067a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import p285z2.AbstractC4336rx;
import p285z2.C4151mx;
import p285z2.C4225ox;
import p285z2.C4299qx;

/* JADX INFO: renamed from: cn.haorui.sdk.core.download.d */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0487d implements Runnable {

    /* JADX INFO: renamed from: g */
    public static final Handler f66g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public C0485b f67a;

    /* JADX INFO: renamed from: b */
    public String f68b;

    /* JADX INFO: renamed from: c */
    public ThreadPoolExecutor f69c;

    /* JADX INFO: renamed from: d */
    public final C4151mx f70d = new C4151mx.OooO0O0().OooO0Oo();

    /* JADX INFO: renamed from: e */
    public Map<Object, InterfaceC0491h> f71e;

    /* JADX INFO: renamed from: f */
    public transient long f72f;

    /* JADX INFO: renamed from: cn.haorui.sdk.core.download.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0485b f73a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f74b;

        public a(C0485b c0485b, File file) {
            this.f73a = c0485b;
            this.f74b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (InterfaceC0491h interfaceC0491h : RunnableC0487d.this.f71e.values()) {
                interfaceC0491h.mo33b(this.f73a);
                interfaceC0491h.mo32a(this.f74b, this.f73a);
            }
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.download.d$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0485b f76a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f77b;

        public b(C0485b c0485b, String str) {
            this.f76a = c0485b;
            this.f77b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (InterfaceC0491h interfaceC0491h : RunnableC0487d.this.f71e.values()) {
                interfaceC0491h.mo33b(this.f76a);
                interfaceC0491h.mo31a(this.f76a, this.f77b);
            }
        }
    }

    public RunnableC0487d(String str, String str2, String str3, String str4) {
        this.f68b = str;
        C0485b c0485b = new C0485b();
        this.f67a = c0485b;
        c0485b.f54b = str;
        c0485b.f55c = str2;
        c0485b.f56d = str3;
        c0485b.f53a = str4;
        c0485b.f57e = C0484a.m19b().m20a();
        if (!TextUtils.isEmpty(str)) {
            this.f67a.f59g = str.substring(str.lastIndexOf("/")).replace("/", "");
            this.f67a.f58f = this.f67a.f57e + "/" + System.currentTimeMillis() + AbstractC1067a.f2406g;
        }
        C0485b c0485b2 = this.f67a;
        c0485b2.f62j = 0;
        c0485b2.f60h = -1L;
        this.f69c = C0484a.m19b().m23c().m29a();
        this.f71e = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public void m24a() {
        this.f69c.remove(this);
        C0485b c0485b = this.f67a;
        int i = c0485b.f62j;
        if (i == 1) {
            c0485b.f62j = 3;
            f66g.post(new RunnableC0489f(this, c0485b));
        } else if (i == 2) {
            c0485b.f62j = 3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25a(C0485b c0485b, File file) {
        File file2;
        if (file.exists()) {
            String str = c0485b.f59g;
            try {
                str = StringUtils.byte2hex(MessageDigest.getInstance("MD5").digest(c0485b.f54b.getBytes())).toLowerCase() + AbstractC1067a.f2406g;
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            file2 = new File(c0485b.f57e, str);
            file.renameTo(file2);
        } else {
            file2 = null;
        }
        c0485b.f62j = 5;
        f66g.post(new a(c0485b, file2));
    }

    /* JADX INFO: renamed from: a */
    public final void m26a(C0485b c0485b, String str) {
        Log.e("DownloadTask", "postOnError: " + str);
        c0485b.f62j = 4;
        f66g.post(new b(c0485b, str));
    }

    /* JADX INFO: renamed from: a */
    public final void m27a(InputStream inputStream, RandomAccessFile randomAccessFile, C0485b c0485b) {
        byte[] bArr;
        if (inputStream == null) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    return;
                }
            }
            randomAccessFile.close();
            return;
        }
        try {
            c0485b.f62j = 2;
            bArr = new byte[8192];
        } catch (Exception unused2) {
        } catch (Throwable th) {
            try {
                inputStream.close();
                randomAccessFile.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1 && c0485b.f62j == 2) {
                randomAccessFile.write(bArr, 0, i);
                long j = i;
                c0485b.f61i += j;
                c0485b.f63k += j;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - this.f72f >= 300) {
                    this.f72f = jElapsedRealtime;
                    f66g.post(new RunnableC0486c(this, c0485b));
                }
            }
            try {
                inputStream.close();
                randomAccessFile.close();
                return;
            } catch (IOException unused4) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m28b() {
        String str;
        C0485b c0485b = this.f67a;
        int i = c0485b.f62j;
        if (i == 0 || i == 3 || i == 4) {
            c0485b.f62j = 0;
            f66g.post(new RunnableC0488e(this, c0485b));
            this.f69c.execute(this);
            return;
        }
        if (i == 5) {
            if (c0485b.f58f == null) {
                str = "filePath is null";
            } else {
                C0485b c0485b2 = this.f67a;
                File file = new File(c0485b2.f57e, c0485b2.f59g);
                Log.e("DownloadTask", "filepath=: " + file.getAbsolutePath() + "fileIsExists=" + file.exists() + ",fileLength=" + file.length() + ", progressTotalSize=" + this.f67a.f60h);
                if (file.exists()) {
                    long length = file.length();
                    C0485b c0485b3 = this.f67a;
                    if (length == c0485b3.f60h) {
                        m25a(c0485b3, file);
                        return;
                    }
                }
                c0485b = this.f67a;
                str = "filepath may be invalid or damaged";
            }
            m26a(c0485b, str);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C0485b c0485b = this.f67a;
        long j = c0485b.f61i;
        if (j < 0) {
            m26a(c0485b, "startPosition<0");
            return;
        }
        if (TextUtils.isEmpty(c0485b.f59g)) {
            return;
        }
        try {
            C4299qx c4299qxExecute = this.f70d.OooO00o(new C4225ox.OooO00o().OooO00o(HttpHeaders.RANGE, "bytes=" + j + "-").OooOOo0(this.f67a.f54b).OooO0o().OooO0O0()).execute();
            int iOoooooO = c4299qxExecute.OoooooO();
            if (iOoooooO == 404 || iOoooooO >= 500) {
                m26a(this.f67a, "network error! http response code is 404 or 5xx!");
                return;
            }
            AbstractC4336rx abstractC4336rxOooOO0 = c4299qxExecute.OooOO0();
            if (abstractC4336rxOooOO0 == null) {
                m26a(this.f67a, "response body is null");
                return;
            }
            C0485b c0485b2 = this.f67a;
            if (c0485b2.f60h == -1) {
                c0485b2.f60h = abstractC4336rxOooOO0.contentLength();
            }
            File file = new File(this.f67a.f57e);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = !TextUtils.isEmpty(this.f67a.f58f) ? new File(this.f67a.f58f) : new File(file, this.f67a.f59g);
            C0485b c0485b3 = this.f67a;
            long j2 = c0485b3.f60h;
            if (j > j2) {
                m26a(c0485b3, "file has expired");
                return;
            }
            if (j == j2 && j > 0) {
                if (!file2.exists() || j != file2.length()) {
                    m26a(this.f67a, "file has expired");
                    return;
                }
                m25a(this.f67a, file2);
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                randomAccessFile.seek(j);
                this.f67a.f61i = j;
                try {
                    m27a(abstractC4336rxOooOO0.byteStream(), randomAccessFile, this.f67a);
                    C0485b c0485b4 = this.f67a;
                    int i = c0485b4.f62j;
                    if (i == 3) {
                        c0485b4.f62j = 3;
                        f66g.post(new RunnableC0489f(this, c0485b4));
                        return;
                    }
                    if (i == 2) {
                        long length = file2.length();
                        C0485b c0485b5 = this.f67a;
                        if (length == c0485b5.f60h) {
                            m25a(c0485b5, file2);
                            return;
                        }
                        c0485b4 = c0485b5;
                    }
                    m26a(c0485b4, "file has expired");
                } catch (Exception e) {
                    m26a(this.f67a, e.toString());
                }
            } catch (Exception e2) {
                m26a(this.f67a, e2.toString());
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
