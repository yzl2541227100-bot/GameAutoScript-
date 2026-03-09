package com.goldcoast.sdk.domain;

import android.annotation.TargetApi;
import android.util.Pair;
import com.goldcoast.sdk.p204a.C2729d;
import com.goldcoast.sdk.p206c.C2741g;
import com.p005a.p006a.p007a.C0684a;
import com.p005a.p006a.p007a.C0685b;
import java.io.File;

/* JADX INFO: renamed from: com.goldcoast.sdk.domain.j */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2753j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2729d f16070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EntryPoint f16071b;

    public RunnableC2753j(EntryPoint entryPoint, C2729d c2729d) {
        this.f16071b = entryPoint;
        this.f16070a = c2729d;
    }

    @Override // java.lang.Runnable
    @TargetApi(5)
    public final void run() {
        this.f16071b.f16037D = true;
        if (this.f16071b.f16039F != null) {
            this.f16071b.f16039F = null;
        }
        EntryPoint.m13215f(this.f16071b);
        C2741g.m13175a();
        C2741g.m13178b("######\n" + String.format("In <<<<<< %d  >>>>>> \n", Integer.valueOf(this.f16071b.f16044s)));
        EntryPoint entryPoint = this.f16071b;
        entryPoint.m13207b(String.format("正在计算第  <%d>  个$$$方案 请等待...", Integer.valueOf(entryPoint.f16044s)), 2);
        this.f16071b.m13207b(String.format("key:%s\norder:%d name: %s", this.f16070a.m13125e(), Integer.valueOf(this.f16070a.m13124d()), this.f16070a.m13119a()), 2);
        StringBuilder sb = new StringBuilder();
        C2729d c2729d = this.f16070a;
        c2729d.m13122b(c2729d.m13121b().replace("\n", ""));
        try {
            C0684a c0684aM106a = C0685b.m106a("sh", String.format("%s %d %s\n", EntryPoint.m13189a(this.f16070a.m13119a(), this.f16070a.m13123c()), 2, this.f16070a.m13121b()));
            C2741g.m13175a();
            C2741g.m13177a(c0684aM106a.m105a());
            Thread.sleep(6000L);
        } catch (Exception e) {
            this.f16071b.m13207b(String.format("A9DDDF2A4F7D94594EC2EA98407A410E1 exception: %s", e.getMessage()), 2);
        }
        File file = new File(EntryPoint.extractDir.getAbsolutePath() + File.separator + this.f16070a.m13119a());
        if (file.exists() && file.delete()) {
            C2741g.m13175a();
            C2741g.m13177a("delete file");
        }
        this.f16071b.f16039F = new Pair("no", sb.toString());
        this.f16071b.f16037D = false;
        EntryPoint.m13219h(this.f16071b);
    }
}
