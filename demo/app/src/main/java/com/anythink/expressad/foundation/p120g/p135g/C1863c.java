package com.anythink.expressad.foundation.p120g.p135g;

import android.annotation.SuppressLint;
import android.content.Context;
import com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.g.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1863c {

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f11478a;

    /* JADX INFO: renamed from: b */
    public HashMap<Long, AbstractRunnableC1861a> f11479b;

    /* JADX INFO: renamed from: c */
    public WeakReference<Context> f11480c;

    @SuppressLint({"UseSparseArrays"})
    public C1863c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f11478a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11479b = new HashMap<>();
        this.f11480c = new WeakReference<>(context);
    }

    @SuppressLint({"UseSparseArrays"})
    private C1863c(Context context, byte b) {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f11478a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11479b = new HashMap<>();
        this.f11480c = new WeakReference<>(context);
    }

    @SuppressLint({"UseSparseArrays"})
    public C1863c(Context context, int i) {
        this.f11478a = i == 0 ? new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy()) : new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f11478a.allowCoreThreadTimeOut(true);
        this.f11479b = new HashMap<>();
        this.f11480c = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: b */
    private void m9649b() {
        Iterator<Map.Entry<Long, AbstractRunnableC1861a>> it = this.f11479b.entrySet().iterator();
        while (it.hasNext()) {
            AbstractRunnableC1861a value = it.next().getValue();
            AbstractRunnableC1861a.a aVar = value.f11466c;
            if (aVar == AbstractRunnableC1861a.a.PAUSE) {
                value.m9647g();
            } else if (aVar == AbstractRunnableC1861a.a.READY) {
                this.f11478a.execute(value);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m9650b(AbstractRunnableC1861a abstractRunnableC1861a) {
        if (abstractRunnableC1861a != null) {
            if (this.f11479b.containsKey(Long.valueOf(AbstractRunnableC1861a.m9645e()))) {
                AbstractRunnableC1861a abstractRunnableC1861a2 = this.f11479b.get(Long.valueOf(AbstractRunnableC1861a.m9645e()));
                if (abstractRunnableC1861a2 != null) {
                    abstractRunnableC1861a2.m9646f();
                }
                this.f11479b.remove(Long.valueOf(AbstractRunnableC1861a.m9645e()));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m9651b(final AbstractRunnableC1861a abstractRunnableC1861a, final AbstractRunnableC1861a.b bVar) {
        this.f11479b.put(Long.valueOf(AbstractRunnableC1861a.m9645e()), abstractRunnableC1861a);
        abstractRunnableC1861a.f11467d = new AbstractRunnableC1861a.b() { // from class: com.anythink.expressad.foundation.g.g.c.1
            @Override // com.anythink.expressad.foundation.p120g.p135g.AbstractRunnableC1861a.b
            /* JADX INFO: renamed from: a */
            public final void mo5268a(AbstractRunnableC1861a.a aVar) {
                if (aVar == AbstractRunnableC1861a.a.CANCEL || aVar == AbstractRunnableC1861a.a.FINISH) {
                    C1863c.this.f11479b.remove(Long.valueOf(AbstractRunnableC1861a.m9645e()));
                } else if (aVar == AbstractRunnableC1861a.a.RUNNING && C1863c.this.f11480c.get() == null) {
                    C1863c.this.m9652a();
                }
                AbstractRunnableC1861a.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.mo5268a(aVar);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9652a() {
        try {
            Iterator<Map.Entry<Long, AbstractRunnableC1861a>> it = this.f11479b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().m9646f();
            }
            this.f11479b.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9653a(AbstractRunnableC1861a abstractRunnableC1861a) {
        m9651b(abstractRunnableC1861a, null);
        this.f11478a.execute(abstractRunnableC1861a);
    }

    /* JADX INFO: renamed from: a */
    public final void m9654a(AbstractRunnableC1861a abstractRunnableC1861a, AbstractRunnableC1861a.b bVar) {
        m9651b(abstractRunnableC1861a, bVar);
        this.f11478a.execute(abstractRunnableC1861a);
    }
}
