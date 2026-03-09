package mobi.oneway.export.p275b.p277b;

import com.umeng.commonsdk.amap.UMAmapConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.p280e.C3610b;
import mobi.oneway.export.p283g.C3641m;

/* JADX INFO: renamed from: mobi.oneway.export.b.b.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3591b<T> implements InterfaceC3593d {

    /* JADX INFO: renamed from: a */
    public T f19643a;

    /* JADX INFO: renamed from: b */
    public AdType f19644b;

    /* JADX INFO: renamed from: c */
    private long f19645c;

    /* JADX INFO: renamed from: d */
    private Map<String, Boolean> f19646d;

    /* JADX INFO: renamed from: e */
    private Map<String, Boolean> f19647e;

    /* JADX INFO: renamed from: f */
    private volatile boolean f19648f;

    /* JADX INFO: renamed from: g */
    private Timer f19649g;

    /* JADX INFO: renamed from: h */
    private TimerTask f19650h;

    /* JADX INFO: renamed from: i */
    private boolean f19651i;

    public AbstractC3591b(AdType adType, List<String> list, long j) {
        this.f19645c = UMAmapConfig.AMAP_CACHE_WRITE_TIME;
        if (j != 0) {
            this.f19645c = j;
        }
        this.f19644b = adType;
        this.f19646d = new ConcurrentHashMap();
        this.f19647e = new ConcurrentHashMap();
        m16711a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m16706f() {
        C3641m.m16987a((Object) "load ad timeout");
        this.f19648f = true;
        m16709i();
        C3610b.m16807a().m16814c(new Runnable() { // from class: mobi.oneway.export.b.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC3591b.this.m16707g()) {
                    AbstractC3591b.this.m16712a(true);
                    AbstractC3591b.this.mo16694a();
                } else {
                    AbstractC3591b.this.m16712a(false);
                    AbstractC3591b.this.mo16695a("load ad timeout");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m16707g() {
        Iterator<Map.Entry<String, Boolean>> it = this.f19646d.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private boolean m16708h() {
        Iterator<Map.Entry<String, Boolean>> it = this.f19647e.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private void m16709i() {
        TimerTask timerTask = this.f19650h;
        if (timerTask != null) {
            timerTask.cancel();
            this.f19650h = null;
        }
        Timer timer = this.f19649g;
        if (timer != null) {
            timer.cancel();
            this.f19649g = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16694a();

    /* JADX INFO: renamed from: a */
    public void m16710a(T t) {
        this.f19643a = t;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16695a(String str);

    /* JADX INFO: renamed from: a */
    public void m16711a(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            Map<String, Boolean> map = this.f19646d;
            Boolean bool = Boolean.FALSE;
            map.put(str, bool);
            this.f19647e.put(str, bool);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16712a(boolean z) {
        this.f19651i = z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16713b() {
        return this.f19651i;
    }

    /* JADX INFO: renamed from: c */
    public void mo16714c() {
        Boolean bool = Boolean.FALSE;
        Iterator<Map.Entry<String, Boolean>> it = this.f19646d.entrySet().iterator();
        while (it.hasNext()) {
            this.f19646d.put(it.next().getKey(), bool);
        }
        Iterator<Map.Entry<String, Boolean>> it2 = this.f19647e.entrySet().iterator();
        while (it2.hasNext()) {
            this.f19647e.put(it2.next().getKey(), bool);
        }
        if (this.f19649g == null) {
            this.f19648f = false;
            this.f19650h = new TimerTask() { // from class: mobi.oneway.export.b.b.b.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    AbstractC3591b.this.m16706f();
                }
            };
            Timer timer = new Timer();
            this.f19649g = timer;
            timer.schedule(this.f19650h, this.f19645c);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m16715d() {
        if (!m16708h() || this.f19648f) {
            return false;
        }
        m16709i();
        m16712a(true);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16716e() {
        if (this.f19648f || !m16708h()) {
            return false;
        }
        m16709i();
        if (!m16707g()) {
            return true;
        }
        m16712a(true);
        mo16694a();
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m16717f(String str) {
        Map<String, Boolean> map = this.f19646d;
        Boolean bool = Boolean.TRUE;
        map.put(str, bool);
        this.f19647e.put(str, bool);
    }

    /* JADX INFO: renamed from: g */
    public void m16718g(String str) {
        this.f19647e.put(str, Boolean.TRUE);
    }
}
