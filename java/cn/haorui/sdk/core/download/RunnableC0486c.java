package cn.haorui.sdk.core.download;

import java.util.Iterator;

/* JADX INFO: renamed from: cn.haorui.sdk.core.download.c */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0486c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0485b f64a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC0487d f65b;

    public RunnableC0486c(RunnableC0487d runnableC0487d, C0485b c0485b) {
        this.f65b = runnableC0487d;
        this.f64a = c0485b;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<InterfaceC0491h> it = this.f65b.f71e.values().iterator();
        while (it.hasNext()) {
            it.next().mo33b(this.f64a);
        }
    }
}
