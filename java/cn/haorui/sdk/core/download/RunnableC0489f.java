package cn.haorui.sdk.core.download;

import java.util.Iterator;

/* JADX INFO: renamed from: cn.haorui.sdk.core.download.f */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0489f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0485b f81a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC0487d f82b;

    public RunnableC0489f(RunnableC0487d runnableC0487d, C0485b c0485b) {
        this.f82b = runnableC0487d;
        this.f81a = c0485b;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<InterfaceC0491h> it = this.f82b.f71e.values().iterator();
        while (it.hasNext()) {
            it.next().mo33b(this.f81a);
        }
    }
}
