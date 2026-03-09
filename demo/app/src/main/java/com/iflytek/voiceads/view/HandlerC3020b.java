package com.iflytek.voiceads.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.voiceads.utils.C2983a;
import com.iflytek.voiceads.utils.C2989g;

/* JADX INFO: renamed from: com.iflytek.voiceads.view.b */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class HandlerC3020b extends Handler {

    /* JADX INFO: renamed from: a */
    private C2983a.c f16608a;

    /* JADX INFO: renamed from: b */
    private a f16609b;

    /* JADX INFO: renamed from: com.iflytek.voiceads.view.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13700a();

        /* JADX INFO: renamed from: a */
        void mo13703a(Message message);

        /* JADX INFO: renamed from: b */
        void mo13708b();

        /* JADX INFO: renamed from: b */
        void mo13709b(Message message);

        /* JADX INFO: renamed from: c */
        void mo13710c();

        /* JADX INFO: renamed from: c */
        void mo13711c(Message message);
    }

    /* JADX INFO: renamed from: com.iflytek.voiceads.view.b$b */
    public enum b {
        max,
        normal,
        min
    }

    public HandlerC3020b(Looper looper, a aVar) {
        super(looper);
        this.f16608a = C2983a.c.init;
        this.f16609b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C2983a.c m13728a() {
        return this.f16608a;
    }

    /* JADX INFO: renamed from: a */
    public void m13729a(int i) {
        m13732a(obtainMessage(i), b.normal, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m13730a(int i, int i2) {
        m13732a(obtainMessage(i, Integer.valueOf(i2)), b.normal, 0);
    }

    /* JADX INFO: renamed from: a */
    public void m13731a(Message message, int i) {
        m13732a(message, b.normal, i);
    }

    /* JADX INFO: renamed from: a */
    protected void m13732a(Message message, b bVar, int i) {
        if (m13728a() == C2983a.c.exit) {
            C2989g.m13555a("IFLY_AD_SDK", "Ad status is exit, invalid request!");
            return;
        }
        switch (message.what) {
            case 0:
                m13733a(C2983a.c.init);
                break;
            case 1:
                m13733a(C2983a.c.request);
                break;
            case 2:
                m13733a(C2983a.c.response);
                break;
            case 3:
                m13733a(C2983a.c.show);
                break;
            case 5:
                m13733a(C2983a.c.end);
                break;
            case 7:
                m13733a(C2983a.c.exit);
                break;
        }
        if (b.max == bVar) {
            sendMessageAtFrontOfQueue(message);
        } else {
            sendMessageDelayed(message, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m13733a(C2983a.c cVar) {
        C2989g.m13555a("IFLY_AD_SDK", "setStatus: pre=" + this.f16608a + ", cur=" + cVar);
        if (this.f16608a == C2983a.c.exit) {
            C2989g.m13555a("IFLY_AD_SDK", "Invalid setting of ad status, current status is already exit!");
        } else {
            this.f16608a = cVar;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    this.f16609b.mo13703a(message);
                    break;
                case 2:
                    this.f16609b.mo13700a();
                    break;
                case 3:
                    this.f16609b.mo13708b();
                    break;
                case 4:
                    this.f16609b.mo13709b(message);
                    break;
                case 5:
                    this.f16609b.mo13711c(message);
                    break;
                case 7:
                    this.f16609b.mo13710c();
                    break;
            }
        } catch (Exception e) {
            m13733a(C2983a.c.end);
            C2989g.m13557b("IFLY_AD_SDK", "process handle:" + e.getMessage());
        }
    }
}
