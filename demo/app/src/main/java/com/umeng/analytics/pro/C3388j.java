package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* JADX INFO: renamed from: com.umeng.analytics.pro.j */
/* JADX INFO: loaded from: classes2.dex */
public class C3388j implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f18560a;

    /* JADX INFO: renamed from: b */
    private InterfaceC3392n f18561b;

    public C3388j() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f18560a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: renamed from: a */
    private void m15569a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f18561b.mo15414a(th);
        } else {
            this.f18561b.mo15414a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15570a(InterfaceC3392n interfaceC3392n) {
        this.f18561b = interfaceC3392n;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m15569a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18560a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f18560a.uncaughtException(thread, th);
    }
}
