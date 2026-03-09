package com.anythink.basead.p016d;

import android.content.Context;
import android.view.View;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.BaseBannerATView;
import com.anythink.basead.p025ui.MraidBannerATView;
import com.anythink.basead.p025ui.SdkBannerATView;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1933h;
import com.anythink.expressad.out.TemplateBannerView;

/* JADX INFO: renamed from: com.anythink.basead.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0753a extends AbstractC0756b {

    /* JADX INFO: renamed from: a */
    public BaseBannerATView f794a;

    /* JADX INFO: renamed from: k */
    private final String f795k;

    /* JADX INFO: renamed from: l */
    private InterfaceC1933h f796l;

    /* JADX INFO: renamed from: com.anythink.basead.d.a$1 */
    public class AnonymousClass1 implements InterfaceC1933h {

        /* JADX INFO: renamed from: com.anythink.basead.d.a$1$1 */
        public class RunnableC46461 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1781c f798a;

            public RunnableC46461(C1781c c1781c) {
                c1781c = c1781c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0753a.this.m404a(c1781c, "");
            }
        }

        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: a */
        public final void mo320a() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: a */
        public final void mo321a(C1781c c1781c) {
            C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.d.a.1.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1781c f798a;

                public RunnableC46461(C1781c c1781c2) {
                    c1781c = c1781c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0753a.this.m404a(c1781c, "");
                }
            }, 2, true);
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: a */
        public final void mo322a(String str) {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: b */
        public final void mo323b() {
            InterfaceC0771a interfaceC0771a = C0753a.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdShow(new C0779i());
            }
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: c */
        public final void mo324c() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: d */
        public final void mo325d() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: e */
        public final void mo326e() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1933h
        /* JADX INFO: renamed from: f */
        public final void mo327f() {
            InterfaceC0771a interfaceC0771a = C0753a.this.f850h;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClosed();
            }
            C0753a.this.m409e();
        }
    }

    public C0753a(Context context, AbstractC0756b.b bVar, C1248m c1248m) {
        super(context, bVar, c1248m);
        this.f795k = C0753a.class.getSimpleName();
        this.f796l = new InterfaceC1933h() { // from class: com.anythink.basead.d.a.1

            /* JADX INFO: renamed from: com.anythink.basead.d.a$1$1 */
            public class RunnableC46461 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1781c f798a;

                public RunnableC46461(C1781c c1781c2) {
                    c1781c = c1781c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0753a.this.m404a(c1781c, "");
                }
            }

            public AnonymousClass1() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: a */
            public final void mo320a() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: a */
            public final void mo321a(C1781c c1781c2) {
                C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.d.a.1.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C1781c f798a;

                    public RunnableC46461(C1781c c1781c22) {
                        c1781c = c1781c22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0753a.this.m404a(c1781c, "");
                    }
                }, 2, true);
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: a */
            public final void mo322a(String str) {
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: b */
            public final void mo323b() {
                InterfaceC0771a interfaceC0771a = C0753a.this.f850h;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdShow(new C0779i());
                }
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: c */
            public final void mo324c() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: d */
            public final void mo325d() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: e */
            public final void mo326e() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1933h
            /* JADX INFO: renamed from: f */
            public final void mo327f() {
                InterfaceC0771a interfaceC0771a = C0753a.this.f850h;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdClosed();
                }
                C0753a.this.m409e();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final View m318a() {
        InterfaceC1157i interfaceC1157i = this.f848f;
        if ((interfaceC1157i instanceof TemplateBannerView) && interfaceC1157i != null) {
            ((TemplateBannerView) interfaceC1157i).setBannerAdListener(this.f796l);
            return (TemplateBannerView) this.f848f;
        }
        if (this.f794a == null && super.m407c()) {
            this.f794a = this.f847e.m3210k() ? new MraidBannerATView(this.f844b, this.f845c, this.f847e, this.f850h) : new SdkBannerATView(this.f844b, this.f845c, this.f847e, this.f850h);
        }
        return this.f794a;
    }

    @Override // com.anythink.basead.p016d.AbstractC0756b
    /* JADX INFO: renamed from: b */
    public final void mo319b() {
        super.mo319b();
        InterfaceC1157i interfaceC1157i = this.f848f;
        if (interfaceC1157i instanceof TemplateBannerView) {
            ((TemplateBannerView) interfaceC1157i).release();
        }
        BaseBannerATView baseBannerATView = this.f794a;
        if (baseBannerATView != null) {
            baseBannerATView.destroy();
        }
        this.f848f = null;
        this.f850h = null;
    }
}
