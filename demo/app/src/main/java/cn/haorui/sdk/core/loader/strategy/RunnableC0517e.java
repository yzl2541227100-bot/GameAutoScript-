package cn.haorui.sdk.core.loader.strategy;

import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.cache.C0499a;
import cn.haorui.sdk.core.loader.cache.CacheManager;
import cn.haorui.sdk.core.loader.loadbean.C0512a;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.e */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0517e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0515c f186a;

    public RunnableC0517e(C0515c c0515c) {
        this.f186a = c0515c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f186a.f162b.getCache() > 0) {
            String cacheKey = this.f186a.f162b.getCacheKey();
            if (this.f186a.f174n.size() > 0) {
                for (int i = 0; i < this.f186a.f174n.size(); i++) {
                    if (i != 0 || this.f186a.f175o) {
                        C0512a c0512a = this.f186a.f174n.get(i);
                        if (c0512a.f158g) {
                            this.f186a.f169i.cacheApi();
                        } else {
                            C0515c c0515c = this.f186a;
                            c0515c.getClass();
                            SdkAdInfo sdkAdInfo = c0512a.f152a;
                            C0499a c0499a = new C0499a();
                            c0499a.f108d = c0512a.f153b;
                            c0499a.f112h = c0515c.f162b;
                            sdkAdInfo.setCache(true);
                            c0499a.f106b = sdkAdInfo;
                            c0499a.f105a = c0515c.f162b.getCacheKey();
                            c0499a.f107c = c0512a.m54a();
                            c0515c.f163c.add(c0499a);
                        }
                    }
                }
            }
            CacheManager cacheManager = CacheManager.INSTANCE;
            C0515c c0515c2 = this.f186a;
            cacheManager.handleCurrentList(cacheKey, c0515c2.f163c, c0515c2.f162b.getCache());
        }
    }
}
