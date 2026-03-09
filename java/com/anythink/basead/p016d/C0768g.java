package com.anythink.basead.p016d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p016d.AbstractC0756b;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.AsseblemSplashATView;
import com.anythink.basead.p025ui.BaseSdkSplashATView;
import com.anythink.basead.p025ui.BaseSplashATView;
import com.anythink.basead.p025ui.MraidSplashATView;
import com.anythink.basead.p025ui.SinglePictureSplashATView;
import com.anythink.core.common.p050a.C1150b;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1930e;
import com.anythink.expressad.splash.p152d.C1990c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.d.g */
/* JADX INFO: loaded from: classes.dex */
public class C0768g extends AbstractC0756b {

    /* JADX INFO: renamed from: l */
    private static final String f918l = "g";

    /* JADX INFO: renamed from: a */
    public BaseSplashATView f919a;

    /* JADX INFO: renamed from: k */
    public boolean f920k;

    /* JADX INFO: renamed from: m */
    private final Map<String, Object> f921m;

    /* JADX INFO: renamed from: com.anythink.basead.d.g$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f922a;

        /* JADX INFO: renamed from: com.anythink.basead.d.g$1$1 */
        public class C46501 implements InterfaceC1930e {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean[] f924a;

            /* JADX INFO: renamed from: com.anythink.basead.d.g$1$1$1 */
            public class RunnableC46511 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1781c f926a;

                public RunnableC46511(C1781c c1781c) {
                    c1781c = c1781c;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0768g.this.m404a(c1781c, "");
                }
            }

            public C46501(boolean[] zArr) {
                zArr = zArr;
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: a */
            public final void mo474a() {
                InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdShow(new C0779i());
                }
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: a */
            public final void mo475a(int i) {
                zArr[0] = true;
                C0768g.this.f921m.put(C1150b.b.f2927a, Integer.valueOf(i));
                InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdClosed();
                }
                C0768g.this.m409e();
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: a */
            public final void mo476a(C1781c c1781c) {
                C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.d.g.1.1.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C1781c f926a;

                    public RunnableC46511(C1781c c1781c2) {
                        c1781c = c1781c2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0768g.this.m404a(c1781c, "");
                    }
                }, 2, true);
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: a */
            public final void mo477a(String str) {
                InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onShowFailed(C0748f.m310a(C0748f.f729k, str));
                }
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: b */
            public final void mo478b() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: c */
            public final void mo479c() {
            }

            @Override // com.anythink.expressad.out.InterfaceC1930e
            /* JADX INFO: renamed from: d */
            public final void mo480d() {
            }
        }

        /* JADX INFO: renamed from: com.anythink.basead.d.g$1$2 */
        public class AnonymousClass2 implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean[] f928a;

            public AnonymousClass2(boolean[] zArr) {
                zArr = zArr;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                String unused = C0768g.f918l;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                String unused = C0768g.f918l;
                new StringBuilder("onViewDetachedFromWindow() >>> adx模板, dismissCallbacked[0]: ").append(zArr[0]);
                if (zArr[0]) {
                    return;
                }
                try {
                    C0768g.this.f921m.put(C1150b.b.f2927a, 3);
                    InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                    if (interfaceC0771a != null) {
                        interfaceC0771a.onAdClosed();
                    }
                    C0768g.this.m409e();
                } catch (Throwable unused2) {
                }
            }
        }

        public AnonymousClass1(ViewGroup viewGroup) {
            this.f922a = viewGroup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0768g c0768g;
            BaseSplashATView asseblemSplashATView;
            C0768g c0768g2 = C0768g.this;
            InterfaceC1157i interfaceC1157i = c0768g2.f848f;
            if (interfaceC1157i instanceof C1990c) {
                boolean[] zArr = {false};
                ((C1990c) interfaceC1157i).m10707a(new InterfaceC1930e() { // from class: com.anythink.basead.d.g.1.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ boolean[] f924a;

                    /* JADX INFO: renamed from: com.anythink.basead.d.g$1$1$1 */
                    public class RunnableC46511 implements Runnable {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ C1781c f926a;

                        public RunnableC46511(C1781c c1781c2) {
                            c1781c = c1781c2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C0768g.this.m404a(c1781c, "");
                        }
                    }

                    public C46501(boolean[] zArr2) {
                        zArr = zArr2;
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: a */
                    public final void mo474a() {
                        InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onAdShow(new C0779i());
                        }
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: a */
                    public final void mo475a(int i) {
                        zArr[0] = true;
                        C0768g.this.f921m.put(C1150b.b.f2927a, Integer.valueOf(i));
                        InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onAdClosed();
                        }
                        C0768g.this.m409e();
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: a */
                    public final void mo476a(C1781c c1781c2) {
                        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.basead.d.g.1.1.1

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ C1781c f926a;

                            public RunnableC46511(C1781c c1781c22) {
                                c1781c = c1781c22;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C0768g.this.m404a(c1781c, "");
                            }
                        }, 2, true);
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: a */
                    public final void mo477a(String str) {
                        InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onShowFailed(C0748f.m310a(C0748f.f729k, str));
                        }
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: b */
                    public final void mo478b() {
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: c */
                    public final void mo479c() {
                    }

                    @Override // com.anythink.expressad.out.InterfaceC1930e
                    /* JADX INFO: renamed from: d */
                    public final void mo480d() {
                    }
                });
                this.f922a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.anythink.basead.d.g.1.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ boolean[] f928a;

                    public AnonymousClass2(boolean[] zArr2) {
                        zArr = zArr2;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        String unused = C0768g.f918l;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        String unused = C0768g.f918l;
                        new StringBuilder("onViewDetachedFromWindow() >>> adx模板, dismissCallbacked[0]: ").append(zArr[0]);
                        if (zArr[0]) {
                            return;
                        }
                        try {
                            C0768g.this.f921m.put(C1150b.b.f2927a, 3);
                            InterfaceC0771a interfaceC0771a = C0768g.this.f850h;
                            if (interfaceC0771a != null) {
                                interfaceC0771a.onAdClosed();
                            }
                            C0768g.this.m409e();
                        } catch (Throwable unused2) {
                        }
                    }
                });
                ((C1990c) C0768g.this.f848f).m10703a(this.f922a);
                return;
            }
            if (c0768g2.f847e.m3210k()) {
                c0768g = C0768g.this;
                Context context = this.f922a.getContext();
                C0768g c0768g3 = C0768g.this;
                asseblemSplashATView = new MraidSplashATView(context, c0768g3.f845c, c0768g3.f847e, c0768g3.f850h);
            } else {
                C0768g c0768g4 = C0768g.this;
                if (BaseSdkSplashATView.isSinglePicture(c0768g4.f847e, c0768g4.f845c.f4333n)) {
                    c0768g = C0768g.this;
                    Context context2 = this.f922a.getContext();
                    C0768g c0768g5 = C0768g.this;
                    asseblemSplashATView = new SinglePictureSplashATView(context2, c0768g5.f845c, c0768g5.f847e, c0768g5.f850h);
                } else {
                    c0768g = C0768g.this;
                    Context context3 = this.f922a.getContext();
                    C0768g c0768g6 = C0768g.this;
                    asseblemSplashATView = new AsseblemSplashATView(context3, c0768g6.f845c, c0768g6.f847e, c0768g6.f850h);
                }
            }
            c0768g.f919a = asseblemSplashATView;
            C0768g c0768g7 = C0768g.this;
            c0768g7.f919a.setAdExtraInfoMap(c0768g7.f921m);
            C0768g c0768g8 = C0768g.this;
            c0768g8.f919a.setDontCountDown(c0768g8.f920k);
            this.f922a.addView(C0768g.this.f919a);
        }
    }

    public C0768g(Context context, AbstractC0756b.b bVar, C1248m c1248m) {
        super(context, bVar, c1248m);
        HashMap map = new HashMap();
        this.f921m = map;
        m406a(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m471a() {
        this.f920k = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m472a(ViewGroup viewGroup) {
        if (super.m407c()) {
            C1360x.m4268a(false);
            C1175n.m2059a().m2135b(new AnonymousClass1(viewGroup));
        }
    }

    @Override // com.anythink.basead.p016d.AbstractC0756b
    /* JADX INFO: renamed from: b */
    public final void mo319b() {
        BaseSplashATView baseSplashATView = this.f919a;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.f919a = null;
        }
        InterfaceC1157i interfaceC1157i = this.f848f;
        if (interfaceC1157i == null || !(interfaceC1157i instanceof C1990c)) {
            return;
        }
        ((C1990c) interfaceC1157i).m10717g();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m473h() {
        return this.f848f == null;
    }
}
