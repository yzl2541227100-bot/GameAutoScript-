package com.octopus.p222ad.internal.p226b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.octopus.p222ad.internal.p226b.p227a.C3088f;
import com.octopus.p222ad.internal.p226b.p227a.C3089g;
import com.octopus.p222ad.internal.p226b.p227a.InterfaceC3083a;
import com.octopus.p222ad.internal.p226b.p227a.InterfaceC3085c;
import com.octopus.p222ad.internal.p226b.p228b.C3094d;
import com.octopus.p222ad.internal.p226b.p228b.InterfaceC3093c;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.utils.p258b.C3252c;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3098f {

    /* JADX INFO: renamed from: a */
    private final Object f17054a;

    /* JADX INFO: renamed from: b */
    private final ExecutorService f17055b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C3099g> f17056c;

    /* JADX INFO: renamed from: d */
    private final ServerSocket f17057d;

    /* JADX INFO: renamed from: e */
    private final int f17058e;

    /* JADX INFO: renamed from: f */
    private final Thread f17059f;

    /* JADX INFO: renamed from: g */
    private final C3095c f17060g;

    /* JADX INFO: renamed from: h */
    private final C3102j f17061h;

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private File f17062a;

        /* JADX INFO: renamed from: d */
        private InterfaceC3093c f17065d;

        /* JADX INFO: renamed from: c */
        private InterfaceC3083a f17064c = new C3089g(536870912);

        /* JADX INFO: renamed from: b */
        private InterfaceC3085c f17063b = new C3088f();

        public a(Context context) {
            this.f17065d = C3094d.m14275a(context);
            this.f17062a = C3109q.m14355a(context);
        }

        /* JADX INFO: renamed from: b */
        private C3095c m14305b() {
            return new C3095c(this.f17062a, this.f17063b, this.f17064c, this.f17065d);
        }

        /* JADX INFO: renamed from: a */
        public a m14306a(long j) {
            this.f17064c = new C3089g(j);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C3098f m14307a() {
            return new C3098f(m14305b());
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.f$b */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: b */
        private final Socket f17067b;

        public b(Socket socket) {
            this.f17067b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3098f.this.m14291a(this.f17067b);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.f$c */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: b */
        private final CountDownLatch f17069b;

        public c(CountDownLatch countDownLatch) {
            this.f17069b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17069b.countDown();
            C3098f.this.m14293b();
        }
    }

    private C3098f(C3095c c3095c) {
        this.f17054a = new Object();
        this.f17055b = Executors.newFixedThreadPool(8);
        this.f17056c = new ConcurrentHashMap();
        this.f17060g = (C3095c) C3103k.m14329a(c3095c);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f17057d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f17058e = localPort;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new c(countDownLatch));
            this.f17059f = thread;
            thread.start();
            countDownLatch.await();
            this.f17061h = new C3102j("127.0.0.1", localPort);
            HaoboLog.m14611i(HaoboLog.httpProxyCacheServerLogTag, "Proxy cache server started. Is it alive? " + m14292a());
        } catch (IOException | InterruptedException e) {
            this.f17055b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14289a(File file) {
        try {
            this.f17060g.f17044c.mo14252a(file);
        } catch (IOException e) {
            HaoboLog.m14610e(HaoboLog.httpProxyCacheServerLogTag, "Error touching file " + file, e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m14290a(Throwable th) {
        HaoboLog.m14610e(HaoboLog.httpProxyCacheServerLogTag, "HttpProxyCacheServer error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m14291a(Socket socket) {
        String str;
        StringBuilder sb;
        try {
            try {
                C3096d c3096dM14278a = C3096d.m14278a(socket.getInputStream());
                HaoboLog.m14607d(HaoboLog.httpProxyCacheServerLogTag, "Request to cache proxy:" + c3096dM14278a);
                String strM14353c = C3106n.m14353c(c3096dM14278a.f17048a);
                if (this.f17061h.m14327a(strM14353c)) {
                    this.f17061h.m14325a(socket);
                } else {
                    m14300e(strM14353c).m14312a(c3096dM14278a, socket);
                }
                m14294b(socket);
                str = HaoboLog.httpProxyCacheServerLogTag;
                sb = new StringBuilder();
            } catch (C3105m e) {
                e = e;
                m14290a(new C3105m("Error processing request", e));
                m14294b(socket);
                str = HaoboLog.httpProxyCacheServerLogTag;
                sb = new StringBuilder();
            } catch (SocketException unused) {
                m14294b(socket);
                str = HaoboLog.httpProxyCacheServerLogTag;
                sb = new StringBuilder();
            } catch (IOException e2) {
                e = e2;
                m14290a(new C3105m("Error processing request", e));
                m14294b(socket);
                str = HaoboLog.httpProxyCacheServerLogTag;
                sb = new StringBuilder();
            }
            sb.append("Opened connections: ");
            sb.append(m14295c());
            HaoboLog.m14607d(str, sb.toString());
        } catch (Throwable th) {
            m14294b(socket);
            HaoboLog.m14607d(HaoboLog.httpProxyCacheServerLogTag, "Opened connections: " + m14295c());
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m14292a() {
        return this.f17061h.m14326a(3, 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m14293b() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket socketAccept = this.f17057d.accept();
                HaoboLog.m14607d(HaoboLog.httpProxyCacheServerLogTag, "Accept new socket " + socketAccept);
                this.f17055b.submit(new b(socketAccept));
            } catch (IOException e) {
                m14290a(new C3105m("Error during waiting connection", e));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m14294b(Socket socket) {
        m14297c(socket);
        m14299d(socket);
        m14301e(socket);
    }

    /* JADX INFO: renamed from: c */
    private int m14295c() {
        int iM14311a;
        synchronized (this.f17054a) {
            iM14311a = 0;
            Iterator<C3099g> it = this.f17056c.values().iterator();
            while (it.hasNext()) {
                iM14311a += it.next().m14311a();
            }
        }
        return iM14311a;
    }

    /* JADX INFO: renamed from: c */
    private String m14296c(String str) {
        String strM14971a = C3252c.m14971a("aHR0cDovLyVzOiVkLyVz");
        if (TextUtils.isEmpty(strM14971a)) {
            return null;
        }
        return String.format(Locale.US, strM14971a, "127.0.0.1", Integer.valueOf(this.f17058e), C3106n.m14352b(str));
    }

    /* JADX INFO: renamed from: c */
    private void m14297c(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
        } catch (IOException e) {
            m14290a(new C3105m("Error closing socket input stream", e));
        }
    }

    /* JADX INFO: renamed from: d */
    private File m14298d(String str) {
        C3095c c3095c = this.f17060g;
        return new File(c3095c.f17042a, c3095c.f17043b.mo14254a(str));
    }

    /* JADX INFO: renamed from: d */
    private void m14299d(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException e) {
            HaoboLog.m14616w(HaoboLog.httpProxyCacheServerLogTag, "Failed to close socket on proxy side: {}. It seems client have already closed connection.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    private C3099g m14300e(String str) throws C3105m {
        C3099g c3099g;
        synchronized (this.f17054a) {
            c3099g = this.f17056c.get(str);
            if (c3099g == null) {
                c3099g = new C3099g(str, this.f17060g);
                this.f17056c.put(str, c3099g);
            }
        }
        return c3099g;
    }

    /* JADX INFO: renamed from: e */
    private void m14301e(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e) {
            m14290a(new C3105m("Error closing socket", e));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m14302a(String str) {
        return m14303a(str, true);
    }

    /* JADX INFO: renamed from: a */
    public String m14303a(String str, boolean z) {
        if (!z || !m14304b(str)) {
            return m14292a() ? m14296c(str) : str;
        }
        File fileM14298d = m14298d(str);
        m14289a(fileM14298d);
        return Uri.fromFile(fileM14298d).toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m14304b(String str) {
        C3103k.m14330a(str, "Url can't be null!");
        return m14298d(str).exists();
    }
}
