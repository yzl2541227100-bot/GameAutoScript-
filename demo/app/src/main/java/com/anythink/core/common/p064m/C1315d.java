package com.anythink.core.common.p064m;

import android.os.Handler;
import android.os.Looper;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;

/* JADX INFO: renamed from: com.anythink.core.common.m.d */
/* JADX INFO: loaded from: classes.dex */
public class C1315d implements InterfaceC1312a {

    /* JADX INFO: renamed from: a */
    private static final String f5014a = "TimeOutHandlerImpl";

    /* JADX INFO: renamed from: b */
    private static volatile C1315d f5015b;

    /* JADX INFO: renamed from: d */
    private final Handler f5017d = C1335b.m3998a().m4003a(12);

    /* JADX INFO: renamed from: c */
    private final Handler f5016c = new Handler(Looper.getMainLooper());

    private C1315d() {
    }

    /* JADX INFO: renamed from: a */
    private Handler m3805a(boolean z) {
        return z ? this.f5016c : this.f5017d;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1312a m3806a() {
        if (f5015b == null) {
            synchronized (C1315d.class) {
                if (f5015b == null) {
                    f5015b = new C1315d();
                }
            }
        }
        return f5015b;
    }

    @Override // com.anythink.core.common.p064m.InterfaceC1312a
    /* JADX INFO: renamed from: a */
    public final void mo3799a(InterfaceRunnableC1313b interfaceRunnableC1313b) {
        mo3800a(interfaceRunnableC1313b, C2187m.f13871ag, true);
    }

    @Override // com.anythink.core.common.p064m.InterfaceC1312a
    /* JADX INFO: renamed from: a */
    public final void mo3800a(InterfaceRunnableC1313b interfaceRunnableC1313b, long j, boolean z) {
        StringBuilder sb = new StringBuilder("sendTimeOutMsg() >>> delayMillis=");
        sb.append(j);
        sb.append(" isMainThread=");
        sb.append(z);
        Handler handlerM3805a = m3805a(z);
        if (handlerM3805a == null) {
            return;
        }
        handlerM3805a.postDelayed(interfaceRunnableC1313b, j);
    }

    @Override // com.anythink.core.common.p064m.InterfaceC1312a
    /* JADX INFO: renamed from: b */
    public final void mo3801b(InterfaceRunnableC1313b interfaceRunnableC1313b) {
        Handler handler = this.f5016c;
        if (handler != null && interfaceRunnableC1313b != null) {
            handler.removeCallbacks(interfaceRunnableC1313b);
        }
        Handler handler2 = this.f5017d;
        if (handler2 == null || interfaceRunnableC1313b == null) {
            return;
        }
        handler2.removeCallbacks(interfaceRunnableC1313b);
    }
}
