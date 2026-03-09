package com.goldcoast.sdk.domain;

import android.os.ConditionVariable;
import com.goldcoast.sdk.p206c.C2741g;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.b */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2745b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConditionVariable f16053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EntryPoint f16054b;

    public RunnableC2745b(EntryPoint entryPoint, ConditionVariable conditionVariable) {
        this.f16054b = entryPoint;
        this.f16053a = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        EntryPoint.m13219h(this.f16054b);
        int i = 0;
        while (true) {
            if (i >= EntryPoint.f16029j) {
                str = "timeout";
                break;
            }
            if (this.f16054b.getStatus()) {
                str = "ok";
                break;
            }
            if (!this.f16054b.f16037D) {
                str = "failed";
                break;
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C2741g.m13175a();
            C2741g.m13177a("timer: loop");
            i++;
        }
        if (str.equals("failed")) {
            C2741g.m13175a();
            str2 = "timer: $$$ failed";
        } else if (str.equals("ok")) {
            this.f16054b.m13207b("$$$ success", 0);
            this.f16053a.open();
        } else {
            C2741g.m13175a();
            str2 = "timer: $$$ timeout";
        }
        C2741g.m13177a(str2);
        this.f16053a.open();
    }
}
