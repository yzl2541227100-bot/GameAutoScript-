package com.anythink.basead.p016d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0721b;
import com.anythink.basead.p010a.p012b.C0724c;
import com.anythink.basead.p015c.C0743a;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p016d.p017a.C0754a;
import com.anythink.basead.p016d.p017a.C0755b;
import com.anythink.basead.p016d.p018b.C0757a;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0773c;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.C1118b;
import com.anythink.core.common.p050a.C1149a;
import com.anythink.core.common.p050a.C1152d;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1216ai;
import com.anythink.core.common.p055f.C1218ak;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1319b;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.basead.d.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0756b {

    /* JADX INFO: renamed from: a */
    private b f843a;

    /* JADX INFO: renamed from: b */
    public Context f844b;

    /* JADX INFO: renamed from: c */
    public C1248m f845c;

    /* JADX INFO: renamed from: d */
    public C0760c f846d;

    /* JADX INFO: renamed from: e */
    public AbstractC1217aj f847e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1157i f848f;

    /* JADX INFO: renamed from: g */
    public C0721b f849g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0771a f850h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap<String, C0721b> f851i;

    /* JADX INFO: renamed from: j */
    public String f852j;

    /* JADX INFO: renamed from: k */
    private boolean f853k = false;

    /* JADX INFO: renamed from: l */
    private Map<String, Object> f854l;

    /* JADX INFO: renamed from: com.anythink.basead.d.b$1 */
    public class AnonymousClass1 implements C0754a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ a f855a;

        public AnonymousClass1(a aVar) {
            aVar = aVar;
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo346a(InterfaceC1157i interfaceC1157i) {
            AbstractC0756b.m391a(AbstractC0756b.this, interfaceC1157i);
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo347a(C1245j c1245j) {
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo348a(C1245j c1245j, C0747e c0747e) {
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo349a(C1245j c1245j, InterfaceC1157i interfaceC1157i) {
            a aVar = aVar;
            if (aVar != null) {
                aVar.onAdCacheLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$2 */
    public class AnonymousClass2 implements C0754a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f857a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0773c f858b;

        public AnonymousClass2(String str, InterfaceC0773c interfaceC0773c) {
            this.f857a = str;
            this.f858b = interfaceC0773c;
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo346a(InterfaceC1157i interfaceC1157i) {
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo347a(C1245j c1245j) {
            C1319b c1319bM3821a = C1319b.m3821a();
            String str = this.f857a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("recordOfferDataEndTime, ");
            sb.append(str);
            sb.append(", timeStamp: ");
            sb.append(jCurrentTimeMillis);
            c1319bM3821a.m3832a(str).f3735c = jCurrentTimeMillis;
            AbstractC0756b.this.m403a(c1245j);
            InterfaceC0773c interfaceC0773c = this.f858b;
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo348a(C1245j c1245j, C0747e c0747e) {
            C1319b.m3821a().m3835a(this.f857a, System.currentTimeMillis());
            String str = "0";
            if (!TextUtils.equals(String.valueOf(AbstractC0756b.this.f845c.f4329j), "0")) {
                str = "";
            } else if (AbstractC0756b.this.f845c.f4334o) {
                str = "1";
            }
            C1322e.m3891a(c1245j, AbstractC0756b.this.f845c, str, C1319b.m3821a().m3832a(this.f857a), false);
            C1319b.m3821a().m3837b(this.f857a);
            AbstractC0756b.m392a(AbstractC0756b.this, c1245j, c0747e, this.f858b, true);
        }

        @Override // com.anythink.basead.p016d.p017a.C0754a.a
        /* JADX INFO: renamed from: a */
        public final void mo349a(C1245j c1245j, InterfaceC1157i interfaceC1157i) {
            AbstractC0756b abstractC0756b = AbstractC0756b.this;
            abstractC0756b.f847e = c1245j;
            AbstractC0756b.m391a(abstractC0756b, interfaceC1157i);
            C0717a.m126a(33, c1245j, new C0751i(AbstractC0756b.this.f845c.f4323d, ""));
            C1319b.m3821a().m3835a(this.f857a, System.currentTimeMillis());
            C1322e.m3891a(c1245j, AbstractC0756b.this.f845c, TextUtils.equals(String.valueOf(AbstractC0756b.this.f845c.f4329j), "0") ? (AbstractC0756b.this.f845c.f4334o || interfaceC1157i != null) ? "1" : "0" : "", C1319b.m3821a().m3832a(this.f857a), true);
            C1319b.m3821a().m3837b(this.f857a);
            AbstractC0756b.m395a(AbstractC0756b.this);
            InterfaceC0773c interfaceC0773c = this.f858b;
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdCacheLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$3 */
    public class AnonymousClass3 implements C0721b.b {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo162a() {
            InterfaceC0771a interfaceC0771a = AbstractC0756b.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
            }
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo163a(boolean z) {
            InterfaceC0771a interfaceC0771a = AbstractC0756b.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onDeeplinkCallback(z);
            }
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final boolean mo164a(String str, IOfferClickHandler iOfferClickHandler) {
            return false;
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: b */
        public final void mo165b() {
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: c */
        public final void mo166c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$4 */
    public class AnonymousClass4 implements C0757a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0773c f861a;

        public AnonymousClass4(InterfaceC0773c interfaceC0773c) {
            this.f861a = interfaceC0773c;
        }

        @Override // com.anythink.basead.p016d.p018b.C0757a.a
        /* JADX INFO: renamed from: a */
        public final void mo412a() {
            InterfaceC0773c interfaceC0773c = this.f861a;
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdDataLoaded();
            }
        }

        @Override // com.anythink.basead.p016d.p018b.C0757a.a
        /* JADX INFO: renamed from: a */
        public final void mo413a(C1216ai c1216ai) {
            AbstractC0756b abstractC0756b = AbstractC0756b.this;
            abstractC0756b.f847e = c1216ai;
            C0717a.m126a(33, AbstractC0756b.this.f847e, new C0751i(abstractC0756b.f845c.f4323d, ""));
            AbstractC0756b.m395a(AbstractC0756b.this);
            InterfaceC0773c interfaceC0773c = this.f861a;
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdCacheLoaded();
            }
        }

        @Override // com.anythink.basead.p016d.p018b.C0757a.a
        /* JADX INFO: renamed from: a */
        public final void mo414a(C1216ai c1216ai, C0747e c0747e) {
            AbstractC0756b.m392a(AbstractC0756b.this, c1216ai, c0747e, this.f861a, false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$5 */
    public class AnonymousClass5 implements C0721b.b {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo162a() {
            InterfaceC0771a interfaceC0771a = AbstractC0756b.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
            }
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo163a(boolean z) {
            InterfaceC0771a interfaceC0771a = AbstractC0756b.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onDeeplinkCallback(z);
            }
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final boolean mo164a(String str, IOfferClickHandler iOfferClickHandler) {
            return false;
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: b */
        public final void mo165b() {
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: c */
        public final void mo166c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$6 */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f864a;

        static {
            int[] iArr = new int[b.values().length];
            f864a = iArr;
            try {
                iArr[b.ADX_OFFER_REQUEST_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f864a[b.ONLINE_API_OFFER_REQUEST_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$a */
    public interface a {
        void onAdCacheLoaded();
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.b$b */
    public enum b {
        ADX_OFFER_REQUEST_TYPE,
        ONLINE_API_OFFER_REQUEST_TYPE
    }

    public AbstractC0756b(Context context, b bVar, C1248m c1248m) {
        this.f844b = context.getApplicationContext();
        this.f843a = bVar;
        this.f845c = c1248m;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m391a(AbstractC0756b abstractC0756b, InterfaceC1157i interfaceC1157i) {
        abstractC0756b.f848f = interfaceC1157i;
        C0721b c0721b = new C0721b(abstractC0756b.f844b, abstractC0756b.f845c, abstractC0756b.f847e);
        abstractC0756b.f849g = c0721b;
        c0721b.m156a(abstractC0756b.new AnonymousClass3());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m392a(AbstractC0756b abstractC0756b, AbstractC1247l abstractC1247l, C0747e c0747e, InterfaceC0773c interfaceC0773c, boolean z) {
        if (abstractC1247l != null) {
            C0717a.m126a(34, abstractC1247l, new C0751i(abstractC0756b.f845c.f4323d, ""));
        }
        if (abstractC1247l instanceof C1216ai) {
            C1118b.m1736a();
            Context contextM2148f = C1175n.m2059a().m2148f();
            C1118b.m1736a();
            C1118b.m1741b(contextM2148f, C1118b.m1738a(abstractC0756b.f845c));
        }
        if (z) {
            try {
                C1149a.m1921a().m1932b(C1175n.m2059a().m2148f(), abstractC0756b.f845c.f4320a);
            } catch (Throwable unused) {
            }
        }
        if (interfaceC0773c != null) {
            interfaceC0773c.onAdLoadFailed(c0747e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m393a(InterfaceC1157i interfaceC1157i) {
        this.f848f = interfaceC1157i;
        C0721b c0721b = new C0721b(this.f844b, this.f845c, this.f847e);
        this.f849g = c0721b;
        c0721b.m156a(new AnonymousClass3());
    }

    /* JADX INFO: renamed from: a */
    private void m394a(AbstractC1247l abstractC1247l, C0747e c0747e, InterfaceC0773c interfaceC0773c, boolean z) {
        if (abstractC1247l != null) {
            C0717a.m126a(34, abstractC1247l, new C0751i(this.f845c.f4323d, ""));
        }
        if (abstractC1247l instanceof C1216ai) {
            C1118b.m1736a();
            Context contextM2148f = C1175n.m2059a().m2148f();
            C1118b.m1736a();
            C1118b.m1741b(contextM2148f, C1118b.m1738a(this.f845c));
        }
        if (z) {
            try {
                C1149a.m1921a().m1932b(C1175n.m2059a().m2148f(), this.f845c.f4320a);
            } catch (Throwable unused) {
            }
        }
        if (interfaceC0773c != null) {
            interfaceC0773c.onAdLoadFailed(c0747e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m395a(AbstractC0756b abstractC0756b) {
        abstractC0756b.f853k = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m396b(InterfaceC0773c interfaceC0773c) {
        try {
            C1248m c1248m = this.f845c;
            if (c1248m != null && !TextUtils.isEmpty(c1248m.f4321b) && !TextUtils.isEmpty(this.f845c.f4320a)) {
                C1319b.m3821a();
                String strM3822a = C1319b.m3822a(this.f845c);
                C1319b c1319bM3821a = C1319b.m3821a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("recordOfferLoadStartTime, ");
                sb.append(strM3822a);
                sb.append(", timeStamp: ");
                sb.append(jCurrentTimeMillis);
                c1319bM3821a.m3832a(strM3822a).f3733a = jCurrentTimeMillis;
                C0754a.m329a(this.f844b).m342a(this.f845c, new AnonymousClass2(strM3822a, interfaceC0773c));
                return;
            }
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdLoadFailed(C0748f.m310a(C0748f.f727i, C0748f.f741w));
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdLoadFailed(C0748f.m310a("-9999", th.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m397c(InterfaceC0773c interfaceC0773c) {
        try {
            C0757a.m416a(this.f844b).m423a(this.f845c, this.f852j, new AnonymousClass4(interfaceC0773c));
        } catch (Throwable th) {
            th.printStackTrace();
            if (interfaceC0773c != null) {
                interfaceC0773c.onAdLoadFailed(C0748f.m310a("-9999", th.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m398a(AbstractC1217aj abstractC1217aj) {
        return this.f845c.f4321b + this.f845c.f4322c + this.f845c.f4325f + abstractC1217aj.m3229t() + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public final void m399a(a aVar) {
        if (AnonymousClass6.f864a[this.f843a.ordinal()] != 1) {
            return;
        }
        if (m407c()) {
            if (aVar != null) {
                aVar.onAdCacheLoaded();
            }
        } else if (this.f845c != null) {
            C0754a.m329a(this.f844b).m341a(this.f847e, this.f845c, new C0754a.a() { // from class: com.anythink.basead.d.b.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ a f855a;

                public AnonymousClass1(a aVar2) {
                    aVar = aVar2;
                }

                @Override // com.anythink.basead.p016d.p017a.C0754a.a
                /* JADX INFO: renamed from: a */
                public final void mo346a(InterfaceC1157i interfaceC1157i) {
                    AbstractC0756b.m391a(AbstractC0756b.this, interfaceC1157i);
                }

                @Override // com.anythink.basead.p016d.p017a.C0754a.a
                /* JADX INFO: renamed from: a */
                public final void mo347a(C1245j c1245j) {
                }

                @Override // com.anythink.basead.p016d.p017a.C0754a.a
                /* JADX INFO: renamed from: a */
                public final void mo348a(C1245j c1245j, C0747e c0747e) {
                }

                @Override // com.anythink.basead.p016d.p017a.C0754a.a
                /* JADX INFO: renamed from: a */
                public final void mo349a(C1245j c1245j, InterfaceC1157i interfaceC1157i) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.onAdCacheLoaded();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m400a(C0760c c0760c) {
        this.f846d = c0760c;
        C1248m c1248m = this.f845c;
        AbstractC1249n abstractC1249n = c1248m.f4333n;
        if (abstractC1249n instanceof C1218ak) {
            C1218ak c1218ak = (C1218ak) abstractC1249n;
            boolean z = c1248m.f4325f == 66;
            if (c1218ak == null || c0760c == null) {
                return;
            }
            c1218ak.m3384x(c0760c.m428a());
            if (!z) {
                c1218ak.m3386y(c0760c.m429b());
            }
            c1218ak.m3337e(c0760c.m431d());
            c1218ak.m3372r(c0760c.m430c());
            c1218ak.m3370q(c0760c.m432e());
            c1218ak.m3321b(c0760c.m433f());
            c1218ak.m3368p(c0760c.m434g());
            c1218ak.m3325c(c0760c.m435h());
            c1218ak.m3330d(c0760c.m436i());
            c1218ak.m3342f(c0760c.m437j());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m401a(InterfaceC0771a interfaceC0771a) {
        this.f850h = interfaceC0771a;
    }

    /* JADX INFO: renamed from: a */
    public final void m402a(InterfaceC0773c interfaceC0773c) {
        int i = AnonymousClass6.f864a[this.f843a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            try {
                C0757a.m416a(this.f844b).m423a(this.f845c, this.f852j, new AnonymousClass4(interfaceC0773c));
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                interfaceC0773c.onAdLoadFailed(C0748f.m310a("-9999", th.getMessage()));
                return;
            }
        }
        try {
            C1248m c1248m = this.f845c;
            if (c1248m != null && !TextUtils.isEmpty(c1248m.f4321b) && !TextUtils.isEmpty(this.f845c.f4320a)) {
                C1319b.m3821a();
                String strM3822a = C1319b.m3822a(this.f845c);
                C1319b c1319bM3821a = C1319b.m3821a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("recordOfferLoadStartTime, ");
                sb.append(strM3822a);
                sb.append(", timeStamp: ");
                sb.append(jCurrentTimeMillis);
                c1319bM3821a.m3832a(strM3822a).f3733a = jCurrentTimeMillis;
                C0754a.m329a(this.f844b).m342a(this.f845c, new AnonymousClass2(strM3822a, interfaceC0773c));
                return;
            }
            interfaceC0773c.onAdLoadFailed(C0748f.m310a(C0748f.f727i, C0748f.f741w));
        } catch (Throwable th2) {
            th2.printStackTrace();
            interfaceC0773c.onAdLoadFailed(C0748f.m310a("-9999", th2.getMessage()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m403a(C1245j c1245j) {
        if (c1245j.m3150c() == 1) {
            C1152d.m1954a().m1960b();
            if (C1345i.m4160a(this.f844b, c1245j.m3167F())) {
                StringBuilder sb = new StringBuilder("check offer installed(onAdDataLoaded):ture,dsp offerid:");
                sb.append(c1245j.m2486ae());
                sb.append(",packagename:");
                sb.append(c1245j.m3167F());
                C1152d.m1954a().m1962c(c1245j);
                return;
            }
            StringBuilder sb2 = new StringBuilder("check offer installed(onAdDataLoaded):false,need record show,dsp offerid:");
            sb2.append(c1245j.m2486ae());
            sb2.append(",packagename:");
            sb2.append(c1245j.m3167F());
            C1152d.m1954a().m1958a(c1245j);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m404a(C1781c c1781c, String str) {
        try {
            if (this.f849g == null) {
                return;
            }
            if (this.f851i == null) {
                this.f851i = new ConcurrentHashMap<>(2);
            }
            C0721b c0721bM350a = this.f851i.get(c1781c.m10146aZ());
            if (c0721bM350a == null) {
                c0721bM350a = C0755b.m350a(this.f849g, c1781c);
                this.f851i.put(c1781c.m10146aZ(), c0721bM350a);
            }
            if (c0721bM350a != null) {
                C0751i c0751i = new C0751i(this.f845c.f4323d, str);
                c0751i.f767g = new C0743a();
                c0721bM350a.m156a(new C0721b.b() { // from class: com.anythink.basead.d.b.5
                    public AnonymousClass5() {
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final void mo162a() {
                        InterfaceC0771a interfaceC0771a = AbstractC0756b.this.f850h;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
                        }
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final void mo163a(boolean z) {
                        InterfaceC0771a interfaceC0771a = AbstractC0756b.this.f850h;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onDeeplinkCallback(z);
                        }
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final boolean mo164a(String str2, IOfferClickHandler iOfferClickHandler) {
                        return false;
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: b */
                    public final void mo165b() {
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: c */
                    public final void mo166c() {
                    }
                });
                c0721bM350a.m157a(c0751i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m405a(String str) {
        this.f852j = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m406a(Map<String, Object> map) {
        this.f854l = map;
    }

    /* JADX INFO: renamed from: b */
    public void mo319b() {
        this.f847e = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m407c() {
        AbstractC1217aj abstractC1217aj;
        int i = AnonymousClass6.f864a[this.f843a.ordinal()];
        if (i != 1) {
            if (i != 2 || (abstractC1217aj = this.f847e) == null || !(abstractC1217aj instanceof C1216ai) || abstractC1217aj.m2477Y()) {
                return false;
            }
            if (this.f853k) {
                return true;
            }
            if (C0724c.m197a(this.f847e, this.f845c)) {
                this.f853k = true;
                return true;
            }
            return false;
        }
        if (this.f847e == null) {
            this.f847e = C0754a.m329a(this.f844b).m340a(this.f845c);
        }
        AbstractC1217aj abstractC1217aj2 = this.f847e;
        if (abstractC1217aj2 == null || abstractC1217aj2.m2477Y()) {
            return false;
        }
        AbstractC1217aj abstractC1217aj3 = this.f847e;
        if ((abstractC1217aj3 instanceof C1245j) && !TextUtils.isEmpty(((C1245j) abstractC1217aj3).m3144a())) {
            InterfaceC1157i interfaceC1157i = this.f848f;
            if (interfaceC1157i != null) {
                return interfaceC1157i.isReady();
            }
            return false;
        }
        if (this.f853k) {
            return true;
        }
        if (!C0724c.m197a(this.f847e, this.f845c)) {
            return false;
        }
        this.f853k = true;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m408d() {
        m399a((a) null);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m409e() {
        C0721b c0721b = this.f849g;
        if (c0721b != null) {
            c0721b.m161d();
            this.f849g = null;
        }
        ConcurrentHashMap<String, C0721b> concurrentHashMap = this.f851i;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            Iterator<Map.Entry<String, C0721b>> it = this.f851i.entrySet().iterator();
            while (it.hasNext()) {
                C0721b value = it.next().getValue();
                if (value != null) {
                    value.m161d();
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC1247l m410f() {
        return this.f847e;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> m411g() {
        return this.f854l;
    }
}
