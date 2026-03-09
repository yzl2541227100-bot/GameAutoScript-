package cn.haorui.sdk.core.loader.strategy;

import android.os.Handler;
import android.text.TextUtils;
import cn.haorui.sdk.core.domain.HRAdInfo;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.AbstractC0497b;
import cn.haorui.sdk.core.loader.AdPlatformError;
import cn.haorui.sdk.core.loader.InterfaceC0508d;
import cn.haorui.sdk.core.loader.cache.C0499a;
import cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener;
import cn.haorui.sdk.core.loader.concurrent.InterfaceC0507a;
import cn.haorui.sdk.core.loader.loadbean.C0512a;
import cn.haorui.sdk.core.utils.DefaultHttpGetWithNoHandlerCallback;
import cn.haorui.sdk.core.utils.HttpUtil;
import cn.haorui.sdk.core.utils.LocalThreadPools;
import cn.haorui.sdk.core.utils.LogUtil;
import cn.haorui.sdk.core.utils.MacroUtil;
import cn.haorui.sdk.core.utils.SdkHandler;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.c */
/* JADX INFO: loaded from: classes.dex */
public class C0515c implements InterfaceC0513a {

    /* JADX INFO: renamed from: a */
    public AbstractC0497b f161a;

    /* JADX INFO: renamed from: b */
    public HRAdInfo f162b;

    /* JADX INFO: renamed from: e */
    public List<List<C0512a>> f165e;

    /* JADX INFO: renamed from: f */
    public List<C0512a> f166f;

    /* JADX INFO: renamed from: g */
    public Map<String, Object> f167g;

    /* JADX INFO: renamed from: h */
    public boolean f168h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0507a f169i;

    /* JADX INFO: renamed from: k */
    public long f171k;

    /* JADX INFO: renamed from: n */
    public List<C0512a> f174n;

    /* JADX INFO: renamed from: o */
    public boolean f175o;

    /* JADX INFO: renamed from: p */
    public long f176p;

    /* JADX INFO: renamed from: q */
    public ArrayList<InterfaceC0508d> f177q;

    /* JADX INFO: renamed from: r */
    public boolean f178r;

    /* JADX INFO: renamed from: s */
    public boolean f179s;

    /* JADX INFO: renamed from: t */
    public boolean f180t;

    /* JADX INFO: renamed from: u */
    public boolean f181u;

    /* JADX INFO: renamed from: c */
    public List<C0499a> f163c = new LinkedList();

    /* JADX INFO: renamed from: d */
    public volatile int f164d = 0;

    /* JADX INFO: renamed from: j */
    public Handler f170j = new Handler();

    /* JADX INFO: renamed from: l */
    public List<C0512a> f172l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public List<C0512a> f173m = new ArrayList();

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.c$a */
    public class a implements IConCurrentLoadListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0508d f182a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0512a f183b;

        public a(InterfaceC0508d interfaceC0508d, C0512a c0512a) {
            this.f182a = interfaceC0508d;
            this.f183b = c0512a;
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onAdError(AdPlatformError adPlatformError, int i) {
            LogUtil.m87e("PriceFirstStrategy", "onAdError: " + adPlatformError.getPlatform() + "  " + adPlatformError.getMessage());
            C0515c.this.m56a(this.f183b, adPlatformError);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAdLoaded(java.lang.Object r9, int r10) {
            /*
                Method dump skipped, instruction units count: 419
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.loader.strategy.C0515c.a.onAdLoaded(java.lang.Object, int):void");
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onRenderFail(String str, int i, int i2) {
            InterfaceC0507a interfaceC0507a;
            SdkAdInfo sdkAdInfo;
            LogUtil.m87e("PriceFirstStrategy", "onRenderFail :" + str);
            C0515c c0515c = C0515c.this;
            C0512a c0512a = this.f183b;
            c0515c.f166f.remove(c0512a);
            if (c0512a != null && (sdkAdInfo = c0512a.f152a) != null) {
                String strReplace = sdkAdInfo.getErr().replace("__MS_ERRNO__", "1026").replace("__ERROR_CODE__", String.valueOf(i)).replace("__TIMEOUT__", String.valueOf(c0512a.f155d));
                if (!TextUtils.isEmpty(strReplace)) {
                    HttpUtil.asyncGetWithWebViewUA(c0515c.f161a.getContext().getApplicationContext(), MacroUtil.replaceExposureMacros(strReplace), new DefaultHttpGetWithNoHandlerCallback());
                }
            }
            if (c0515c.f168h && c0515c.f174n.size() > 0 && c0512a.equals(c0515c.f174n.get(0))) {
                if ((c0515c.f162b.getCache() <= 0 || (c0515c.f162b.getCache() > 0 && !c0515c.f175o)) && (interfaceC0507a = c0515c.f169i) != null) {
                    interfaceC0507a.onRenderFail(str);
                }
            }
        }

        @Override // cn.haorui.sdk.core.loader.concurrent.IConCurrentLoadListener
        public void onRenderSuccess(Object obj, int i) {
            C0515c c0515c = C0515c.this;
            c0515c.f173m.add(this.f183b);
            c0515c.m55a();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.c$b */
    public class b implements Comparator<C0512a> {
        public b(C0515c c0515c) {
        }

        @Override // java.util.Comparator
        public int compare(C0512a c0512a, C0512a c0512a2) {
            return c0512a2.m54a() - c0512a.m54a();
        }
    }

    /* JADX INFO: renamed from: cn.haorui.sdk.core.loader.strategy.c$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0515c c0515c = C0515c.this;
            c0515c.m57a(c0515c.f165e.get(c0515c.f164d));
        }
    }

    public C0515c(AbstractC0497b abstractC0497b, HRAdInfo hRAdInfo) {
        new ArrayList();
        new ArrayList();
        this.f174n = new ArrayList();
        this.f176p = UMAmapConfig.AMAP_CACHE_WRITE_TIME;
        this.f177q = new ArrayList<>();
        new ArrayList();
        new ArrayList();
        this.f161a = abstractC0497b;
        this.f162b = hRAdInfo;
    }

    /* JADX INFO: renamed from: a */
    public final void m55a() {
        if (!this.f179s && this.f174n.size() > 0) {
            C0512a c0512a = this.f174n.get(0);
            if (this.f173m.contains(c0512a)) {
                if ((this.f162b.getCache() <= 0 || (this.f162b.getCache() > 0 && !this.f175o)) && this.f169i != null) {
                    this.f179s = true;
                    LogUtil.m87e("PriceFirstStrategy", "回调adReady,成功的平台为：" + c0512a.f152a.getSdk() + ", readyAd=" + c0512a.f153b);
                    this.f169i.onRenderSuccess(c0512a.f153b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m56a(C0512a c0512a, AdPlatformError adPlatformError) {
        synchronized (c0512a) {
            c0512a.f154c = 3;
        }
        c0512a.f152a.replaceErrorPst(adPlatformError);
        this.f166f.remove(c0512a);
        m66g();
        if (m64e()) {
            m65f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m57a(java.util.List<cn.haorui.sdk.core.loader.loadbean.C0512a> r13) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.haorui.sdk.core.loader.strategy.C0515c.m57a(java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58a(C0512a c0512a) {
        boolean z = false;
        try {
            SdkAdInfo sdkAdInfo = c0512a.f152a;
            int ecpm = sdkAdInfo.getEcpm();
            if (!"bidding".equals(sdkAdInfo.getOtype())) {
                return false;
            }
            if (sdkAdInfo.getPrice() <= ecpm) {
                return false;
            }
            try {
                SdkAdInfo sdkAdInfo2 = c0512a.f152a;
                if (sdkAdInfo2 != null && sdkAdInfo2.getErr().contains("__MS_ERRNO__")) {
                    String strReplace = c0512a.f152a.getErr().replace("__MS_ERRNO__", "1027").replace("__ERROR_CODE__", String.valueOf(0)).replace("__TIMEOUT__", String.valueOf(c0512a.f155d)).replace("__P__", String.valueOf(sdkAdInfo.getPrice())).replace("__S__", String.valueOf(ecpm));
                    if (!TextUtils.isEmpty(strReplace)) {
                        HttpUtil.asyncGetWithWebViewUA(this.f161a.getContext().getApplicationContext(), MacroUtil.replaceExposureMacros(strReplace), new DefaultHttpGetWithNoHandlerCallback());
                    }
                }
                return true;
            } catch (Exception e) {
                e = e;
                z = true;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m59b() {
        if (this.f180t) {
            return;
        }
        this.f180t = true;
        this.f168h = true;
        LocalThreadPools.getInstance().execute(new RunnableC0517e(this));
    }

    /* JADX INFO: renamed from: b */
    public final void m60b(C0512a c0512a) {
        if (this.f162b.getCache() <= 0 || !this.f175o) {
            if (!this.f174n.contains(c0512a)) {
                this.f174n.add(c0512a);
            }
            this.f166f.remove(c0512a);
            this.f172l.remove(c0512a);
            m63d();
            return;
        }
        if (this.f174n.size() >= (this.f162b.getCache() <= 0 ? 1 : this.f162b.getCache()) && !this.f168h) {
            this.f168h = true;
            m59b();
            return;
        }
        this.f166f.remove(c0512a);
        this.f172l.remove(c0512a);
        if (!this.f174n.contains(c0512a)) {
            this.f174n.add(c0512a);
        }
        Collections.sort(this.f174n, new b(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m61c() {
        if (this.f174n.size() == 0 && this.f172l.size() == 0) {
            this.f168h = true;
            synchronized (this) {
                InterfaceC0507a interfaceC0507a = this.f169i;
                if (interfaceC0507a != null) {
                    interfaceC0507a.onAllError();
                }
            }
            return;
        }
        m66g();
        if (!this.f168h) {
            this.f174n.addAll(this.f172l);
            Collections.sort(this.f174n, new C0518f(this));
        }
        m63d();
        m59b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m62c(C0512a c0512a) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f166f);
        arrayList.addAll(this.f172l);
        if (arrayList.size() <= 0) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0512a c0512a2 = (C0512a) it.next();
            if (!c0512a2.equals(c0512a) && c0512a2.f154c == 2 && !this.f172l.contains(c0512a2)) {
                this.f172l.add(c0512a2);
                it.remove();
            }
            int i = c0512a2.f156e;
            int i2 = c0512a.f156e;
            if (i > i2) {
                return false;
            }
            if (i == i2 && ((!c0512a2.f158g && "bidding".equals(c0512a2.f152a.getOtype()) && c0512a2.m54a() == -1) || c0512a2.m54a() > c0512a.m54a())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m63d() {
        InterfaceC0507a interfaceC0507a;
        if (this.f178r) {
            return;
        }
        if (this.f174n.size() <= 0) {
            if (this.f169i != null) {
                this.f178r = true;
                LogUtil.m87e("PriceFirstStrategy", "无广告返回，onAllError");
                this.f169i.onAllError();
                return;
            }
            return;
        }
        C0512a c0512a = this.f174n.get(0);
        if ((this.f162b.getCache() <= 0 || (this.f162b.getCache() > 0 && !this.f175o)) && (interfaceC0507a = this.f169i) != null) {
            if (c0512a.f158g && !this.f168h) {
                if (interfaceC0507a != null) {
                    this.f178r = true;
                    interfaceC0507a.onAllError();
                    return;
                }
                return;
            }
            if (this.f162b.getCache() <= 0) {
                this.f168h = true;
            }
            this.f178r = true;
            LogUtil.m87e("PriceFirstStrategy", "回调onFinalAdLoaded,成功的平台为：" + c0512a.f152a.getSdk() + ", loadedAd=" + c0512a.f153b);
            this.f169i.onFinalAdLoaded(c0512a.f153b, c0512a.f152a);
            m55a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m64e() {
        if (this.f165e.size() <= this.f164d) {
            return true;
        }
        Iterator<C0512a> it = this.f165e.get(this.f164d).iterator();
        while (it.hasNext()) {
            int i = it.next().f154c;
            if (i != 2 && i != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m65f() {
        if (this.f168h) {
            return;
        }
        try {
            if (this.f181u) {
                m61c();
                return;
            }
            this.f164d++;
            List<List<C0512a>> list = this.f165e;
            if (list == null || list.size() <= this.f164d) {
                m61c();
            } else {
                SdkHandler.getInstance().runOnUiThread(new c());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m66g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f172l);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0512a c0512a = (C0512a) it.next();
            if (!this.f168h && m62c(c0512a)) {
                m60b(c0512a);
                it.remove();
            }
        }
    }
}
