package com.octopus.p222ad.internal.p226b;

import android.text.TextUtils;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.utils.p258b.C3252c;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3102j {

    /* JADX INFO: renamed from: a */
    private final ExecutorService f17082a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b */
    private final String f17083b;

    /* JADX INFO: renamed from: c */
    private final int f17084c;

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.j$a */
    public class a implements Callable<Boolean> {
        private a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C3102j.this.m14322a());
        }
    }

    public C3102j(String str, int i) {
        this.f17083b = (String) C3103k.m14329a(str);
        this.f17084c = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m14322a() throws C3105m {
        C3100h c3100h = new C3100h(m14324b());
        try {
            byte[] bytes = "ping ok".getBytes();
            c3100h.mo14318a(0);
            byte[] bArr = new byte[bytes.length];
            c3100h.mo14317a(bArr);
            boolean zEquals = Arrays.equals(bytes, bArr);
            HaoboLog.m14611i(HaoboLog.pingerLogTag, "Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
            return zEquals;
        } catch (C3105m e) {
            HaoboLog.m14610e(HaoboLog.pingerLogTag, "Error reading ping response", e);
            return false;
        } finally {
            c3100h.mo14319b();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m14324b() {
        String strM14971a = C3252c.m14971a("aHR0cDovLyVzOiVkLyVz");
        if (TextUtils.isEmpty(strM14971a)) {
            return null;
        }
        return String.format(Locale.US, strM14971a, this.f17083b, Integer.valueOf(this.f17084c), "ping");
    }

    /* JADX INFO: renamed from: a */
    public void m14325a(Socket socket) throws IOException {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* JADX INFO: renamed from: a */
    public boolean m14326a(int i, int i2) {
        C3103k.m14331a(i >= 1);
        C3103k.m14331a(i2 > 0);
        int i3 = 0;
        while (i3 < i) {
            try {
            } catch (InterruptedException e) {
                e = e;
                HaoboLog.m14610e(HaoboLog.pingerLogTag, "Error pinging server due to unexpected error", e);
            } catch (ExecutionException e2) {
                e = e2;
                HaoboLog.m14610e(HaoboLog.pingerLogTag, "Error pinging server due to unexpected error", e);
            } catch (TimeoutException unused) {
                HaoboLog.m14615w(HaoboLog.pingerLogTag, "Error pinging server (attempt: " + i3 + ", timeout: " + i2 + "). ");
            }
            if (((Boolean) this.f17082a.submit(new a()).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                return true;
            }
            i3++;
            i2 *= 2;
        }
        String str = String.format("Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, create issue here https://github.com/danikula/AndroidVideoCache/issues", Integer.valueOf(i3), Integer.valueOf(i2 / 2));
        HaoboLog.m14610e(HaoboLog.pingerLogTag, str, new C3105m(str));
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m14327a(String str) {
        return "ping".equals(str);
    }
}
