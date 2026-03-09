package com.octopus.p222ad.internal.p226b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.octopus.p222ad.internal.p226b.p227a.C3084b;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C3099g {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f17070a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    private final String f17071b;

    /* JADX INFO: renamed from: c */
    private volatile C3097e f17072c;

    /* JADX INFO: renamed from: d */
    private final List<InterfaceC3090b> f17073d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC3090b f17074e;

    /* JADX INFO: renamed from: f */
    private final C3095c f17075f;

    /* JADX INFO: renamed from: com.octopus.ad.internal.b.g$a */
    public static final class a extends Handler implements InterfaceC3090b {

        /* JADX INFO: renamed from: a */
        private final String f17076a;

        /* JADX INFO: renamed from: b */
        private final List<InterfaceC3090b> f17077b;

        public a(String str, List<InterfaceC3090b> list) {
            super(Looper.getMainLooper());
            this.f17076a = str;
            this.f17077b = list;
        }

        @Override // com.octopus.p222ad.internal.p226b.InterfaceC3090b
        /* JADX INFO: renamed from: a */
        public void mo14269a(File file, String str, int i) {
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = file;
            sendMessage(messageObtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<InterfaceC3090b> it = this.f17077b.iterator();
            while (it.hasNext()) {
                it.next().mo14269a((File) message.obj, this.f17076a, message.arg1);
            }
        }
    }

    public C3099g(String str, C3095c c3095c) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f17073d = copyOnWriteArrayList;
        this.f17071b = (String) C3103k.m14329a(str);
        this.f17075f = (C3095c) C3103k.m14329a(c3095c);
        this.f17074e = new a(str, copyOnWriteArrayList);
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m14308b() throws C3105m {
        this.f17072c = this.f17072c == null ? m14310d() : this.f17072c;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m14309c() {
        if (this.f17070a.decrementAndGet() <= 0) {
            this.f17072c.m14345a();
            this.f17072c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    private C3097e m14310d() throws C3105m {
        C3097e c3097e = new C3097e(new C3100h(this.f17071b, this.f17075f.f17045d), new C3084b(this.f17075f.m14276a(this.f17071b), this.f17075f.f17044c));
        c3097e.m14285a(this.f17074e);
        return c3097e;
    }

    /* JADX INFO: renamed from: a */
    public int m14311a() {
        return this.f17070a.get();
    }

    /* JADX INFO: renamed from: a */
    public void m14312a(C3096d c3096d, Socket socket) throws C3105m, IOException {
        m14308b();
        try {
            this.f17070a.incrementAndGet();
            this.f17072c.m14286a(c3096d, socket);
        } finally {
            m14309c();
        }
    }
}
