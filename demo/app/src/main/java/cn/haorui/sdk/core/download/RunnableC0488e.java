package cn.haorui.sdk.core.download;

import java.util.Iterator;

/* JADX INFO: renamed from: cn.haorui.sdk.core.download.e */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0488e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0485b f79a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC0487d f80b;

    public RunnableC0488e(RunnableC0487d runnableC0487d, C0485b c0485b) {
        this.f80b = runnableC0487d;
        this.f79a = c0485b;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<InterfaceC0491h> it = this.f80b.f71e.values().iterator();
        while (it.hasNext()) {
            it.next().mo30a(this.f79a);
        }
    }
}
