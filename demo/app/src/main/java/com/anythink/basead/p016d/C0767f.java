package com.anythink.basead.p016d;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p021e.C0772b;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p021e.InterfaceC0780j;
import com.anythink.basead.p022f.AbstractC0785c;
import com.anythink.basead.p025ui.BaseATActivity;
import com.anythink.core.basead.p044b.C1121c;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.reward.p147b.C1964a;
import com.anythink.expressad.videocommon.p180d.AbstractC2335b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.d.f */
/* JADX INFO: loaded from: classes.dex */
public class C0767f extends AbstractC0756b {

    /* JADX INFO: renamed from: a */
    public static final String f911a = "f";

    /* JADX INFO: renamed from: com.anythink.basead.d.f$1 */
    public class AnonymousClass1 extends AbstractC2335b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f912a;

        /* JADX INFO: renamed from: com.anythink.basead.d.f$1$1 */
        public class RunnableC46491 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1781c f914a;

            public RunnableC46491(C1781c c1781c) {
                c1781c = c1781c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                C0767f.this.m404a(c1781c, str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map map, String str, String str2) {
            super(map, str);
            str = str2;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: a */
        public final void mo373a() {
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: a */
        public final void mo374a(C1781c c1781c) {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.d.f.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1781c f914a;

                public RunnableC46491(C1781c c1781c2) {
                    c1781c = c1781c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    C0767f.this.m404a(c1781c, str);
                }
            }, 2, true);
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: a */
        public final void mo375a(String str) {
        }

        @Override // com.anythink.expressad.videocommon.p180d.AbstractC2335b, com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: a */
        public final void mo376a(boolean z, String str, float f) {
            InterfaceC0771a interfaceC0771a;
            AbstractC1249n abstractC1249n;
            super.mo376a(z, str, f);
            if ((z || ((abstractC1249n = C0767f.this.f845c.f4333n) != null && abstractC1249n.m3359l() == 1)) && (interfaceC0771a = C0767f.this.f850h) != null && (interfaceC0771a instanceof InterfaceC0780j)) {
                ((InterfaceC0780j) interfaceC0771a).onRewarded();
            }
            InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
            if (interfaceC0771a2 != null) {
                interfaceC0771a2.onAdClosed();
            }
            C0767f.this.m409e();
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: b */
        public final void mo377b() {
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: b */
        public final void mo378b(String str) {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onShowFailed(C0748f.m310a(C0748f.f729k, str));
            }
            C0767f.this.f847e = null;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: c */
        public final void mo379c() {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                C0779i c0779i = new C0779i();
                c0779i.f981c = 9;
                interfaceC0771a.onAdShow(c0779i);
            }
            InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
            if (interfaceC0771a2 != null && (interfaceC0771a2 instanceof InterfaceC0780j)) {
                ((InterfaceC0780j) interfaceC0771a2).onVideoAdPlayStart();
            }
            C0767f.this.f847e = null;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: d */
        public final void mo380d() {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a == null || !(interfaceC0771a instanceof InterfaceC0780j)) {
                return;
            }
            ((InterfaceC0780j) interfaceC0771a).onVideoAdPlayEnd();
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: e */
        public final void mo381e() {
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
        /* JADX INFO: renamed from: f */
        public final void mo382f() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.f$2 */
    public class AnonymousClass2 extends C0772b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Map map, String str, String str2) {
            super(map, str);
            str = str2;
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo458a() {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a == null || !(interfaceC0771a instanceof InterfaceC0780j)) {
                return;
            }
            ((InterfaceC0780j) interfaceC0771a).onVideoAdPlayStart();
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo459a(C0747e c0747e) {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onShowFailed(c0747e);
            }
            C0767f.this.f847e = null;
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo460a(C0779i c0779i) {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdShow(c0779i);
            }
            C0767f.this.f847e = null;
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: a */
        public final void mo461a(boolean z) {
            String str = C0767f.f911a;
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onDeeplinkCallback(z);
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: b */
        public final void mo462b() {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a == null || !(interfaceC0771a instanceof InterfaceC0780j)) {
                return;
            }
            ((InterfaceC0780j) interfaceC0771a).onVideoAdPlayEnd();
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: b */
        public final void mo463b(C0779i c0779i) {
            String str = C0767f.f911a;
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClick(c0779i);
            }
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: c */
        public final void mo464c() {
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a == null || !(interfaceC0771a instanceof InterfaceC0780j)) {
                return;
            }
            ((InterfaceC0780j) interfaceC0771a).onRewarded();
        }

        @Override // com.anythink.basead.p021e.C0772b.b
        /* JADX INFO: renamed from: d */
        public final void mo465d() {
            super.mo465d();
            String str = C0767f.f911a;
            InterfaceC0771a interfaceC0771a = C0767f.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClosed();
            }
            C0772b.m542a().m545b(str);
        }
    }

    public C0767f(Context context, AbstractC0756b.b bVar, C1248m c1248m) {
        super(context, bVar, c1248m);
    }

    /* JADX INFO: renamed from: a */
    public final void m468a(Activity activity, Map<String, Object> map) {
        String str;
        try {
            if (!m407c()) {
                InterfaceC0771a interfaceC0771a = this.f850h;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onShowFailed(C0748f.m310a(C0748f.f727i, C0748f.f743y));
                }
                this.f847e = null;
                return;
            }
            String string = map.get("extra_scenario").toString();
            int iIntValue = ((Integer) map.get(AbstractC0785c.f996j)).intValue();
            String strM398a = m398a(this.f847e);
            HashMap map2 = new HashMap(2);
            m406a(map2);
            if (this.f845c != null) {
                str = this.f845c.f4323d + this.f845c.f4322c;
            } else {
                str = "";
            }
            InterfaceC1157i interfaceC1157i = this.f848f;
            if (interfaceC1157i instanceof C1964a) {
                ((C1964a) interfaceC1157i).m10383a(new AbstractC2335b(map2, str) { // from class: com.anythink.basead.d.f.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ String f912a;

                    /* JADX INFO: renamed from: com.anythink.basead.d.f$1$1 */
                    public class RunnableC46491 implements Runnable {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ C1781c f914a;

                        public RunnableC46491(C1781c c1781c2) {
                            c1781c = c1781c2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            C0767f.this.m404a(c1781c, str);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Map map22, String str2, String string2) {
                        super(map22, str2);
                        str = string2;
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: a */
                    public final void mo373a() {
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: a */
                    public final void mo374a(C1781c c1781c2) {
                        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.d.f.1.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ C1781c f914a;

                            public RunnableC46491(C1781c c1781c22) {
                                c1781c = c1781c22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                C0767f.this.m404a(c1781c, str);
                            }
                        }, 2, true);
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: a */
                    public final void mo375a(String str2) {
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.AbstractC2335b, com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: a */
                    public final void mo376a(boolean z, String str2, float f) {
                        InterfaceC0771a interfaceC0771a2;
                        AbstractC1249n abstractC1249n;
                        super.mo376a(z, str2, f);
                        if ((z || ((abstractC1249n = C0767f.this.f845c.f4333n) != null && abstractC1249n.m3359l() == 1)) && (interfaceC0771a2 = C0767f.this.f850h) != null && (interfaceC0771a2 instanceof InterfaceC0780j)) {
                            ((InterfaceC0780j) interfaceC0771a2).onRewarded();
                        }
                        InterfaceC0771a interfaceC0771a22 = C0767f.this.f850h;
                        if (interfaceC0771a22 != null) {
                            interfaceC0771a22.onAdClosed();
                        }
                        C0767f.this.m409e();
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: b */
                    public final void mo377b() {
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: b */
                    public final void mo378b(String str2) {
                        InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                        if (interfaceC0771a2 != null) {
                            interfaceC0771a2.onShowFailed(C0748f.m310a(C0748f.f729k, str2));
                        }
                        C0767f.this.f847e = null;
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: c */
                    public final void mo379c() {
                        InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                        if (interfaceC0771a2 != null) {
                            C0779i c0779i = new C0779i();
                            c0779i.f981c = 9;
                            interfaceC0771a2.onAdShow(c0779i);
                        }
                        InterfaceC0771a interfaceC0771a22 = C0767f.this.f850h;
                        if (interfaceC0771a22 != null && (interfaceC0771a22 instanceof InterfaceC0780j)) {
                            ((InterfaceC0780j) interfaceC0771a22).onVideoAdPlayStart();
                        }
                        C0767f.this.f847e = null;
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: d */
                    public final void mo380d() {
                        InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                        if (interfaceC0771a2 == null || !(interfaceC0771a2 instanceof InterfaceC0780j)) {
                            return;
                        }
                        ((InterfaceC0780j) interfaceC0771a2).onVideoAdPlayEnd();
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: e */
                    public final void mo381e() {
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: f */
                    public final void mo382f() {
                    }
                });
                ((C1964a) this.f848f).m10381a(activity, "", "", "", this.f845c);
                return;
            }
            C0772b.m542a().m544a(strM398a, new C0772b.b(map22, str2) { // from class: com.anythink.basead.d.f.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f916a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Map map22, String str2, String strM398a2) {
                    super(map22, str2);
                    str = strM398a2;
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo458a() {
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 == null || !(interfaceC0771a2 instanceof InterfaceC0780j)) {
                        return;
                    }
                    ((InterfaceC0780j) interfaceC0771a2).onVideoAdPlayStart();
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo459a(C0747e c0747e) {
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onShowFailed(c0747e);
                    }
                    C0767f.this.f847e = null;
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo460a(C0779i c0779i) {
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onAdShow(c0779i);
                    }
                    C0767f.this.f847e = null;
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo461a(boolean z) {
                    String str2 = C0767f.f911a;
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onDeeplinkCallback(z);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: b */
                public final void mo462b() {
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 == null || !(interfaceC0771a2 instanceof InterfaceC0780j)) {
                        return;
                    }
                    ((InterfaceC0780j) interfaceC0771a2).onVideoAdPlayEnd();
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: b */
                public final void mo463b(C0779i c0779i) {
                    String str2 = C0767f.f911a;
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onAdClick(c0779i);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: c */
                public final void mo464c() {
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 == null || !(interfaceC0771a2 instanceof InterfaceC0780j)) {
                        return;
                    }
                    ((InterfaceC0780j) interfaceC0771a2).onRewarded();
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: d */
                public final void mo465d() {
                    super.mo465d();
                    String str2 = C0767f.f911a;
                    InterfaceC0771a interfaceC0771a2 = C0767f.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onAdClosed();
                    }
                    C0772b.m542a().m545b(str);
                }
            });
            C1121c c1121c = new C1121c();
            c1121c.f2751c = this.f847e;
            c1121c.f2752d = strM398a2;
            c1121c.f2749a = 1;
            c1121c.f2756h = this.f845c;
            c1121c.f2753e = iIntValue;
            c1121c.f2750b = string2;
            BaseATActivity.m680a(activity, c1121c);
        } catch (Exception e) {
            e.printStackTrace();
            InterfaceC0771a interfaceC0771a2 = this.f850h;
            if (interfaceC0771a2 != null) {
                interfaceC0771a2.onShowFailed(C0748f.m310a("-9999", e.getMessage()));
            }
            this.f847e = null;
        }
    }

    @Override // com.anythink.basead.p016d.AbstractC0756b
    /* JADX INFO: renamed from: b */
    public final void mo319b() {
        super.mo319b();
        this.f850h = null;
    }
}
