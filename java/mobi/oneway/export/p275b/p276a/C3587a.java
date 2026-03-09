package mobi.oneway.export.p275b.p276a;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import mobi.oneway.export.AdListener.AdMonitor;
import mobi.oneway.export.AdListener.OWInteractiveAdListener;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p275b.p277b.AbstractC3591b;
import mobi.oneway.export.p275b.p277b.C3594e;
import mobi.oneway.export.p275b.p277b.C3595f;
import mobi.oneway.export.p275b.p277b.C3596g;
import mobi.oneway.export.p275b.p277b.C3597h;
import mobi.oneway.export.p281f.C3613a;
import mobi.oneway.export.p281f.C3624d;

/* JADX INFO: renamed from: mobi.oneway.export.b.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3587a {

    /* JADX INFO: renamed from: a */
    private Object f19633a;

    /* JADX INFO: renamed from: b */
    private AdType f19634b;

    /* JADX INFO: renamed from: c */
    private List<C3613a> f19635c;

    /* JADX INFO: renamed from: d */
    private AbstractC3591b f19636d;

    /* JADX INFO: renamed from: mobi.oneway.export.b.a.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19637a;

        static {
            int[] iArr = new int[AdType.values().length];
            f19637a = iArr;
            try {
                iArr[AdType.rewarded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19637a[AdType.interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19637a[AdType.interactive.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19637a[AdType.interstitialimage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C3587a(AdType adType, String str) {
        this.f19634b = adType;
        this.f19635c = C3624d.m16874a(str, adType);
    }

    /* JADX INFO: renamed from: a */
    private void m16684a(OnewaySdkError onewaySdkError, String str) {
        if (this.f19633a == null) {
            return;
        }
        int i = AnonymousClass1.f19637a[this.f19634b.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                ((OWInteractiveAdListener) this.f19633a).onSdkError(onewaySdkError, str);
                return;
            } else if (i != 4) {
                return;
            }
        }
        ((AdMonitor) this.f19633a).onSdkError(onewaySdkError, str);
    }

    /* JADX INFO: renamed from: d */
    private void m16685d() {
        AbstractC3591b c3597h;
        List<String> listM16875a = C3624d.m16875a(this.f19635c);
        long jM16683c = C3586a.m16671a().m16683c();
        int i = AnonymousClass1.f19637a[this.f19634b.ordinal()];
        if (i == 1) {
            c3597h = new C3597h(this.f19634b, listM16875a, jM16683c);
        } else if (i == 2) {
            c3597h = new C3595f(this.f19634b, listM16875a, jM16683c);
        } else if (i == 3) {
            c3597h = new C3594e(this.f19634b, listM16875a, jM16683c);
        } else if (i != 4) {
            return;
        } else {
            c3597h = new C3596g(this.f19634b, listM16875a, jM16683c);
        }
        this.f19636d = c3597h;
    }

    /* JADX INFO: renamed from: a */
    public void m16686a() {
        if (this.f19635c == null) {
            m16684a(OnewaySdkError.LOAD_ERROR, this.f19634b.name() + C3581a.f19612m);
            return;
        }
        AbstractC3591b abstractC3591b = this.f19636d;
        if (abstractC3591b != null) {
            abstractC3591b.mo16714c();
        }
        Iterator<C3613a> it = this.f19635c.iterator();
        while (it.hasNext()) {
            it.next().m16834a(this.f19634b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16687a(Activity activity, Object obj) {
        this.f19633a = obj;
        if (this.f19635c == null) {
            return;
        }
        m16685d();
        AbstractC3591b abstractC3591b = this.f19636d;
        if (abstractC3591b != null) {
            abstractC3591b.m16710a(obj);
        }
        for (C3613a c3613a : this.f19635c) {
            int i = AnonymousClass1.f19637a[this.f19634b.ordinal()];
            if (i == 1) {
                c3613a.m16828a(activity, (C3597h) this.f19636d);
            } else if (i == 2) {
                c3613a.m16826a(activity, (C3595f) this.f19636d);
            } else if (i == 3) {
                c3613a.m16825a(activity, (C3594e) this.f19636d);
            } else if (i == 4) {
                c3613a.m16827a(activity, (C3596g) this.f19636d);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16688a(Activity activity, String str) {
        if (str == null) {
            str = "";
        }
        List<C3613a> list = this.f19635c;
        if (list == null) {
            return;
        }
        for (C3613a c3613a : list) {
            if (c3613a.m16838b(this.f19634b)) {
                c3613a.m16835a(this.f19634b, activity, str);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16689a(Object obj) {
        this.f19633a = obj;
        if (this.f19635c == null) {
            return;
        }
        AbstractC3591b abstractC3591b = this.f19636d;
        if (abstractC3591b != null) {
            abstractC3591b.m16710a(obj);
        }
        for (C3613a c3613a : this.f19635c) {
            int i = AnonymousClass1.f19637a[this.f19634b.ordinal()];
            if (i == 1) {
                c3613a.m16833a((C3597h) this.f19636d);
            } else if (i == 2) {
                c3613a.m16831a((C3595f) this.f19636d);
            } else if (i == 3) {
                c3613a.m16830a((C3594e) this.f19636d);
            } else if (i == 4) {
                c3613a.m16832a((C3596g) this.f19636d);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m16690b() {
        AbstractC3591b abstractC3591b;
        if (this.f19635c != null && (abstractC3591b = this.f19636d) != null && abstractC3591b.m16713b()) {
            Iterator<C3613a> it = this.f19635c.iterator();
            while (it.hasNext()) {
                if (it.next().m16838b(this.f19634b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m16691c() {
        this.f19633a = null;
        AbstractC3591b abstractC3591b = this.f19636d;
        if (abstractC3591b != null) {
            abstractC3591b.m16710a((Object) null);
            this.f19636d = null;
        }
        List<C3613a> list = this.f19635c;
        if (list == null) {
            return;
        }
        Iterator<C3613a> it = list.iterator();
        while (it.hasNext()) {
            it.next().m16840c(this.f19634b);
        }
    }
}
