package com.anythink.basead.p016d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.basead.p010a.C0717a;
import com.anythink.basead.p010a.C0721b;
import com.anythink.basead.p015c.C0743a;
import com.anythink.basead.p015c.C0751i;
import com.anythink.basead.p016d.p017a.C0755b;
import com.anythink.basead.p016d.p020c.C0764d;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.BaseMediaATView;
import com.anythink.basead.p025ui.MediaATView;
import com.anythink.basead.p025ui.MraidMediaView;
import com.anythink.basead.p025ui.OwnNativeATView;
import com.anythink.basead.p025ui.SimpleMediaATView;
import com.anythink.basead.p025ui.p027b.AbstractC0988a;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1216ai;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.p067a.AbstractC1327a;
import com.anythink.core.common.p066o.p067a.C1329c;
import com.anythink.expressad.advanced.p079d.C1431c;
import com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.out.InterfaceC1940o;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.anythink.basead.d.h */
/* JADX INFO: loaded from: classes.dex */
public class C0769h {

    /* JADX INFO: renamed from: a */
    public Context f930a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0771a f931b;

    /* JADX INFO: renamed from: c */
    public C1329c f932c;

    /* JADX INFO: renamed from: d */
    public C0721b f933d;

    /* JADX INFO: renamed from: e */
    public View f934e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f935f;

    /* JADX INFO: renamed from: g */
    public AbstractC1217aj f936g;

    /* JADX INFO: renamed from: h */
    public C1248m f937h;

    /* JADX INFO: renamed from: i */
    public boolean f938i;

    /* JADX INFO: renamed from: j */
    public boolean f939j;

    /* JADX INFO: renamed from: k */
    public String f940k;

    /* JADX INFO: renamed from: l */
    public C1431c f941l;

    /* JADX INFO: renamed from: m */
    public BaseMediaATView f942m;

    /* JADX INFO: renamed from: n */
    public View f943n;

    /* JADX INFO: renamed from: q */
    public int f946q;

    /* JADX INFO: renamed from: r */
    public int f947r;

    /* JADX INFO: renamed from: s */
    public AbstractC0988a f948s;

    /* JADX INFO: renamed from: t */
    public OwnNativeATView f949t;

    /* JADX INFO: renamed from: u */
    private final String f950u = getClass().getSimpleName();

    /* JADX INFO: renamed from: o */
    public View.OnClickListener f944o = new View.OnClickListener() { // from class: com.anythink.basead.d.h.1
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0769h.this.m504a(view, false);
        }
    };

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f945p = new View.OnClickListener() { // from class: com.anythink.basead.d.h.2
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0769h.this.m504a(view, true);
        }
    };

    /* JADX INFO: renamed from: com.anythink.basead.d.h$1 */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0769h.this.m504a(view, false);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$2 */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0769h.this.m504a(view, true);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$3 */
    public class AnonymousClass3 implements C0721b.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f953a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f954b;

        public AnonymousClass3(int i, int i2) {
            i = i;
            i = i2;
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo162a() {
            InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClick(new C0779i().m559a(i, i));
            }
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: a */
        public final void mo163a(boolean z) {
            InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
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
            BaseMediaATView baseMediaATView = C0769h.this.f942m;
            if (baseMediaATView != null) {
                baseMediaATView.notifyClick();
            }
        }

        @Override // com.anythink.basead.p010a.C0721b.b
        /* JADX INFO: renamed from: c */
        public final void mo166c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$4 */
    public class AnonymousClass4 implements InterfaceC1940o {

        /* JADX INFO: renamed from: com.anythink.basead.d.h$4$1 */
        public class AnonymousClass1 implements C0721b.b {
            public AnonymousClass1() {
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final void mo162a() {
                InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                if (interfaceC0771a != null) {
                    interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
                }
            }

            @Override // com.anythink.basead.p010a.C0721b.b
            /* JADX INFO: renamed from: a */
            public final void mo163a(boolean z) {
                InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
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

        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: a */
        public final void mo383a() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: a */
        public final void mo384a(C1781c c1781c) {
            Context contextM2148f = C1175n.m2059a().m2148f();
            C0769h c0769h = C0769h.this;
            if (c0769h.f933d == null) {
                c0769h.f933d = new C0721b(contextM2148f, c0769h.f937h, c0769h.f936g);
                C0769h.this.f933d.m156a(new C0721b.b() { // from class: com.anythink.basead.d.h.4.1
                    public AnonymousClass1() {
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final void mo162a() {
                        InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
                        }
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final void mo163a(boolean z) {
                        InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
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
                });
            }
            C0755b.m358a(C0769h.this.f933d.m159b(), c1781c);
            C1431c c1431c = C0769h.this.f941l;
            ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroupM5545c = c1431c != null ? c1431c.m5545c() : null;
            C0751i c0751i = new C0751i(C0769h.this.f937h.f4323d, "");
            if (aTOutNativeAdvancedViewGroupM5545c != null) {
                c0751i.f766f = aTOutNativeAdvancedViewGroupM5545c.getHeight();
                c0751i.f765e = aTOutNativeAdvancedViewGroupM5545c.getWidth();
            }
            c0751i.f767g = new C0743a();
            C0769h.this.f933d.m157a(c0751i);
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: a */
        public final void mo385a(String str) {
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: b */
        public final void mo386b() {
            InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdShow(new C0779i());
            }
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: c */
        public final void mo387c() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: d */
        public final void mo388d() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: e */
        public final void mo389e() {
        }

        @Override // com.anythink.expressad.out.InterfaceC1940o
        /* JADX INFO: renamed from: f */
        public final void mo390f() {
            InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdClosed();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$5 */
    public class AnonymousClass5 implements MraidMediaView.InterfaceC0894a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.p025ui.MraidMediaView.InterfaceC0894a
        /* JADX INFO: renamed from: a */
        public final void mo532a() {
            C0769h c0769h = C0769h.this;
            OwnNativeATView ownNativeATView = c0769h.f949t;
            if (ownNativeATView != null) {
                c0769h.m501a(ownNativeATView);
            }
        }

        @Override // com.anythink.basead.p025ui.MraidMediaView.InterfaceC0894a
        /* JADX INFO: renamed from: a */
        public final void mo533a(String str) {
            AbstractC1217aj abstractC1217aj = C0769h.this.f936g;
            if (abstractC1217aj != null) {
                abstractC1217aj.m3236w(str);
            }
            C0769h c0769h = C0769h.this;
            c0769h.m502a(c0769h.f942m, 1, 13);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$6 */
    public class AnonymousClass6 extends AbstractC1327a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
        public final void recordImpression(View view) {
            C0769h.this.m496y();
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$7 */
    public class AnonymousClass7 implements AbstractC0989b.a {
        public AnonymousClass7() {
        }

        @Override // com.anythink.basead.p025ui.p027b.AbstractC0989b.a
        /* JADX INFO: renamed from: a */
        public final void mo534a(int i, int i2) {
            C0769h c0769h = C0769h.this;
            c0769h.m502a(C0769h.m492b(c0769h), i, i2);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$8 */
    public class AnonymousClass8 extends AbstractC0988a {
        public AnonymousClass8(ViewGroup viewGroup, AbstractC1247l abstractC1247l, C1248m c1248m, int i, AbstractC0989b.a aVar) {
            super(viewGroup, abstractC1247l, c1248m, i, aVar);
        }

        @Override // com.anythink.basead.p025ui.p027b.AbstractC0988a
        /* JADX INFO: renamed from: a */
        public final ViewGroup.LayoutParams mo535a() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (C0769h.this.f949t != null) {
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, 0);
            }
            return layoutParams;
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$9 */
    public class AnonymousClass9 implements OwnNativeATView.InterfaceC0899a {
        public AnonymousClass9() {
        }

        @Override // com.anythink.basead.p025ui.OwnNativeATView.InterfaceC0899a
        /* JADX INFO: renamed from: a */
        public final void mo536a() {
            C0769h.this.m494b(110);
        }

        @Override // com.anythink.basead.p025ui.OwnNativeATView.InterfaceC0899a
        /* JADX INFO: renamed from: b */
        public final void mo537b() {
            C0769h.this.m494b(111);
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.d.h$a */
    public static class a implements BaseMediaATView.InterfaceC0819a {

        /* JADX INFO: renamed from: a */
        private final BaseMediaATView.InterfaceC0819a f963a;

        public a(BaseMediaATView.InterfaceC0819a interfaceC0819a) {
            this.f963a = interfaceC0819a;
        }

        @Override // com.anythink.basead.p025ui.BaseMediaATView.InterfaceC0819a
        public final void onClickCloseView() {
            BaseMediaATView.InterfaceC0819a interfaceC0819a = this.f963a;
            if (interfaceC0819a != null) {
                interfaceC0819a.onClickCloseView();
            }
        }
    }

    public C0769h(Context context, AbstractC1217aj abstractC1217aj, C1248m c1248m, InterfaceC1157i interfaceC1157i, boolean z) {
        this.f930a = context.getApplicationContext();
        this.f936g = abstractC1217aj;
        this.f937h = c1248m;
        this.f938i = z;
        if (interfaceC1157i instanceof C1431c) {
            C1431c c1431c = (C1431c) interfaceC1157i;
            this.f941l = c1431c;
            c1431c.m5541a(new InterfaceC1940o() { // from class: com.anythink.basead.d.h.4

                /* JADX INFO: renamed from: com.anythink.basead.d.h$4$1 */
                public class AnonymousClass1 implements C0721b.b {
                    public AnonymousClass1() {
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final void mo162a() {
                        InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                        if (interfaceC0771a != null) {
                            interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
                        }
                    }

                    @Override // com.anythink.basead.p010a.C0721b.b
                    /* JADX INFO: renamed from: a */
                    public final void mo163a(boolean z) {
                        InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
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

                public AnonymousClass4() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: a */
                public final void mo383a() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: a */
                public final void mo384a(C1781c c1781c) {
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    C0769h c0769h = C0769h.this;
                    if (c0769h.f933d == null) {
                        c0769h.f933d = new C0721b(contextM2148f, c0769h.f937h, c0769h.f936g);
                        C0769h.this.f933d.m156a(new C0721b.b() { // from class: com.anythink.basead.d.h.4.1
                            public AnonymousClass1() {
                            }

                            @Override // com.anythink.basead.p010a.C0721b.b
                            /* JADX INFO: renamed from: a */
                            public final void mo162a() {
                                InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                                if (interfaceC0771a != null) {
                                    interfaceC0771a.onAdClick(new C0779i().m559a(1, 13));
                                }
                            }

                            @Override // com.anythink.basead.p010a.C0721b.b
                            /* JADX INFO: renamed from: a */
                            public final void mo163a(boolean z3) {
                                InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                                if (interfaceC0771a != null) {
                                    interfaceC0771a.onDeeplinkCallback(z3);
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
                        });
                    }
                    C0755b.m358a(C0769h.this.f933d.m159b(), c1781c);
                    C1431c c1431c2 = C0769h.this.f941l;
                    ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroupM5545c = c1431c2 != null ? c1431c2.m5545c() : null;
                    C0751i c0751i = new C0751i(C0769h.this.f937h.f4323d, "");
                    if (aTOutNativeAdvancedViewGroupM5545c != null) {
                        c0751i.f766f = aTOutNativeAdvancedViewGroupM5545c.getHeight();
                        c0751i.f765e = aTOutNativeAdvancedViewGroupM5545c.getWidth();
                    }
                    c0751i.f767g = new C0743a();
                    C0769h.this.f933d.m157a(c0751i);
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: a */
                public final void mo385a(String str) {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: b */
                public final void mo386b() {
                    InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                    if (interfaceC0771a != null) {
                        interfaceC0771a.onAdShow(new C0779i());
                    }
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: c */
                public final void mo387c() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: d */
                public final void mo388d() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: e */
                public final void mo389e() {
                }

                @Override // com.anythink.expressad.out.InterfaceC1940o
                /* JADX INFO: renamed from: f */
                public final void mo390f() {
                    InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                    if (interfaceC0771a != null) {
                        interfaceC0771a.onAdClosed();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    private void m481A() {
        OwnNativeATView ownNativeATView;
        AbstractC1217aj abstractC1217aj;
        C1248m c1248m;
        if (this.f941l != null || (ownNativeATView = this.f949t) == null || (abstractC1217aj = this.f936g) == null || (c1248m = this.f937h) == null) {
            return;
        }
        this.f948s = new AnonymousClass8(ownNativeATView, abstractC1217aj, c1248m, this.f938i ? 5 : 6, new AnonymousClass7());
        this.f949t.setLifeCallback(new AnonymousClass9());
    }

    /* JADX INFO: renamed from: a */
    private static int m482a(int i) {
        Random random = new Random();
        if (i <= 0) {
            return 0;
        }
        double d = i;
        int i2 = (int) (0.1d * d);
        return random.nextInt((((int) (d * 0.9d)) - i2) + 1) + i2;
    }

    /* JADX INFO: renamed from: a */
    private View m483a(Context context, AbstractC1247l abstractC1247l, AbstractC1249n abstractC1249n) {
        SimpleMediaATView simpleMediaATView = new SimpleMediaATView(context);
        simpleMediaATView.initView(abstractC1247l);
        if (abstractC1249n != null && abstractC1249n.m3251D() != 1) {
            simpleMediaATView.setOnClickListener(this.f944o);
        }
        return simpleMediaATView;
    }

    /* JADX INFO: renamed from: a */
    private View m484a(Context context, boolean z, boolean z3, BaseMediaATView.InterfaceC0819a interfaceC0819a) {
        a aVar = new a(interfaceC0819a);
        OwnNativeATView ownNativeATView = new OwnNativeATView(this.f930a);
        this.f949t = ownNativeATView;
        if (z) {
            MraidMediaView mraidMediaView = new MraidMediaView(context, this.f936g, this.f937h, z3, aVar);
            this.f942m = mraidMediaView;
            mraidMediaView.setMraidWebViewListener(new MraidMediaView.InterfaceC0894a() { // from class: com.anythink.basead.d.h.5
                public AnonymousClass5() {
                }

                @Override // com.anythink.basead.p025ui.MraidMediaView.InterfaceC0894a
                /* JADX INFO: renamed from: a */
                public final void mo532a() {
                    C0769h c0769h = C0769h.this;
                    OwnNativeATView ownNativeATView2 = c0769h.f949t;
                    if (ownNativeATView2 != null) {
                        c0769h.m501a(ownNativeATView2);
                    }
                }

                @Override // com.anythink.basead.p025ui.MraidMediaView.InterfaceC0894a
                /* JADX INFO: renamed from: a */
                public final void mo533a(String str) {
                    AbstractC1217aj abstractC1217aj = C0769h.this.f936g;
                    if (abstractC1217aj != null) {
                        abstractC1217aj.m3236w(str);
                    }
                    C0769h c0769h = C0769h.this;
                    c0769h.m502a(c0769h.f942m, 1, 13);
                }
            });
        } else {
            this.f942m = new MediaATView(context, this.f936g, this.f937h, z3, aVar);
        }
        this.f942m.init(this.f946q, this.f947r);
        ownNativeATView.addView(this.f942m, new FrameLayout.LayoutParams(this.f942m.getMediaViewWidth(), this.f942m.getMediaViewHeight()));
        m487a(ownNativeATView, this.f942m.getClickViews());
        return ownNativeATView;
    }

    /* JADX INFO: renamed from: a */
    private void m485a(View view, int i, int i2, boolean z) {
        if (this.f949t != null) {
            m496y();
            if (this.f933d == null) {
                this.f933d = new C0721b(C1175n.m2059a().m2148f(), this.f937h, this.f936g);
            }
            if (this.f933d.m158a()) {
                return;
            }
            this.f933d.m156a(new C0721b.b() { // from class: com.anythink.basead.d.h.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f953a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f954b;

                public AnonymousClass3(int i3, int i22) {
                    i = i3;
                    i = i22;
                }

                @Override // com.anythink.basead.p010a.C0721b.b
                /* JADX INFO: renamed from: a */
                public final void mo162a() {
                    InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                    if (interfaceC0771a != null) {
                        interfaceC0771a.onAdClick(new C0779i().m559a(i, i));
                    }
                }

                @Override // com.anythink.basead.p010a.C0721b.b
                /* JADX INFO: renamed from: a */
                public final void mo163a(boolean z3) {
                    InterfaceC0771a interfaceC0771a = C0769h.this.f931b;
                    if (interfaceC0771a != null) {
                        interfaceC0771a.onDeeplinkCallback(z3);
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
                    BaseMediaATView baseMediaATView = C0769h.this.f942m;
                    if (baseMediaATView != null) {
                        baseMediaATView.notifyClick();
                    }
                }

                @Override // com.anythink.basead.p010a.C0721b.b
                /* JADX INFO: renamed from: c */
                public final void mo166c() {
                }
            });
            C0751i c0751i = new C0751i(this.f937h.f4323d, "");
            c0751i.f766f = this.f949t.getHeight();
            c0751i.f765e = this.f949t.getWidth();
            c0751i.f767g = i3 == 1 ? this.f949t.getAdClickRecord() : m493b(view);
            if (z) {
                c0751i.f771k = true;
            }
            this.f933d.m157a(c0751i);
            m494b(113);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m486a(View view, View.OnClickListener onClickListener) {
        if (!(view instanceof ViewGroup)) {
            view.setOnClickListener(onClickListener);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            m486a(viewGroup.getChildAt(i), onClickListener);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m487a(View view, List<View> list) {
        m503a(view, list, (List<View>) null);
    }

    /* JADX INFO: renamed from: a */
    private void m488a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m488a(viewGroup.getChildAt(i), viewArr);
            }
            return;
        }
        if (((view instanceof Button) || (view instanceof TextView)) && TextUtils.equals(((TextView) view).getText().toString(), this.f936g.m3157A())) {
            viewArr[0] = view;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m491a(OwnNativeATView[] ownNativeATViewArr, View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof OwnNativeATView) {
                ownNativeATViewArr[0] = (OwnNativeATView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m491a(ownNativeATViewArr, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ View m492b(C0769h c0769h) {
        View monitorClickView;
        BaseMediaATView baseMediaATView = c0769h.f942m;
        if (baseMediaATView != null && (monitorClickView = baseMediaATView.getMonitorClickView()) != null) {
            c0769h.f943n = monitorClickView;
            return monitorClickView;
        }
        View[] viewArr = new View[1];
        c0769h.m488a(c0769h.f949t, viewArr);
        if (viewArr[0] == null) {
            return c0769h.f949t;
        }
        c0769h.f943n = viewArr[0];
        return viewArr[0];
    }

    /* JADX INFO: renamed from: b */
    private static C0743a m493b(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int iM482a = m482a(width);
        int iM482a2 = m482a(height);
        C0743a c0743a = new C0743a();
        int i3 = i + iM482a;
        c0743a.f680a = i3;
        c0743a.f681b = i2 + iM482a2;
        c0743a.f684e = iM482a;
        c0743a.f685f = iM482a2;
        c0743a.f682c = i3 + ((int) (Math.random() * 15.0d));
        int iRandom = c0743a.f681b + ((int) (Math.random() * 15.0d));
        c0743a.f683d = iRandom;
        c0743a.f686g = c0743a.f682c - i;
        c0743a.f687h = iRandom - i2;
        return c0743a;
    }

    /* JADX INFO: renamed from: b */
    public void m494b(int i) {
        AbstractC0988a abstractC0988a = this.f948s;
        if (abstractC0988a != null) {
            abstractC0988a.m1177a(i);
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m495c(View view) {
        String str;
        if (this.f949t == null) {
            OwnNativeATView[] ownNativeATViewArr = new OwnNativeATView[1];
            m491a(ownNativeATViewArr, view);
            if (ownNativeATViewArr[0] == null) {
                str = "Register View don't contain OwnNativeAdView.";
            } else if (ownNativeATViewArr[0].getChildCount() == 0) {
                str = "OwnNativeAdView View don't contain any child views.";
            } else {
                this.f949t = ownNativeATViewArr[0];
            }
            Log.i("anythink", str);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void m496y() {
        if (this.f935f) {
            return;
        }
        this.f935f = true;
        if (this.f939j && this.f936g.m3210k()) {
            BaseMediaATView baseMediaATView = this.f942m;
            if (baseMediaATView instanceof MraidMediaView) {
                ((MraidMediaView) baseMediaATView).fireAudioVolumeChange(this.f939j);
            }
        }
        if (this.f936g instanceof C1216ai) {
            C0764d c0764dM453a = C0764d.m453a();
            Context context = this.f930a;
            C1248m c1248m = this.f937h;
            c0764dM453a.m455a(context, C0764d.m454a(c1248m.f4321b, c1248m.f4322c), this.f936g, this.f937h.f4333n);
        }
        C1431c c1431c = this.f941l;
        View viewM5545c = c1431c != null ? c1431c.m5545c() : this.f949t;
        if (this.f936g.m3210k()) {
            viewM5545c = this.f942m;
        }
        if (viewM5545c != null) {
            C0751i c0751i = new C0751i(this.f937h.f4323d, "");
            c0751i.f766f = viewM5545c.getHeight();
            c0751i.f765e = viewM5545c.getWidth();
            C0717a.m126a(8, this.f936g, c0751i);
            InterfaceC0771a interfaceC0771a = this.f931b;
            if (interfaceC0771a != null) {
                interfaceC0771a.onAdShow(new C0779i());
            }
        }
        m494b(114);
    }

    /* JADX INFO: renamed from: z */
    private View m497z() {
        View monitorClickView;
        BaseMediaATView baseMediaATView = this.f942m;
        if (baseMediaATView != null && (monitorClickView = baseMediaATView.getMonitorClickView()) != null) {
            this.f943n = monitorClickView;
            return monitorClickView;
        }
        View[] viewArr = new View[1];
        m488a(this.f949t, viewArr);
        if (viewArr[0] == null) {
            return this.f949t;
        }
        this.f943n = viewArr[0];
        return viewArr[0];
    }

    /* JADX INFO: renamed from: a */
    public final View m498a(Context context, boolean z, BaseMediaATView.InterfaceC0819a interfaceC0819a) {
        C1431c c1431c = this.f941l;
        if (c1431c != null) {
            c1431c.m5537a(z ? 1 : 0);
            return this.f941l.m5545c();
        }
        AbstractC1217aj abstractC1217aj = this.f936g;
        if (abstractC1217aj != null && abstractC1217aj.m3210k() && this.f938i) {
            return m484a(context, true, z, interfaceC0819a);
        }
        AbstractC1217aj abstractC1217aj2 = this.f936g;
        if (abstractC1217aj2 == null || TextUtils.isEmpty(abstractC1217aj2.m3239y())) {
            return null;
        }
        boolean z3 = this.f938i;
        if (z3 && (this.f936g instanceof C1245j)) {
            return m484a(context, false, z, interfaceC0819a);
        }
        if (!z3) {
            AbstractC1217aj abstractC1217aj3 = this.f936g;
            if (abstractC1217aj3 instanceof C1245j) {
                AbstractC1249n abstractC1249n = this.f937h.f4333n;
                SimpleMediaATView simpleMediaATView = new SimpleMediaATView(context);
                simpleMediaATView.initView(abstractC1217aj3);
                if (abstractC1249n != null && abstractC1249n.m3251D() != 1) {
                    simpleMediaATView.setOnClickListener(this.f944o);
                }
                return simpleMediaATView;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1247l m499a() {
        return this.f936g;
    }

    /* JADX INFO: renamed from: a */
    public final void m500a(int i, int i2) {
        this.f946q = i;
        this.f947r = i2;
        C1431c c1431c = this.f941l;
        if (c1431c != null) {
            c1431c.m5538a(i2, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m501a(View view) {
        this.f934e = view;
        AnonymousClass6 anonymousClass6 = new AbstractC1327a() { // from class: com.anythink.basead.d.h.6
            public AnonymousClass6() {
            }

            @Override // com.anythink.core.common.p066o.p067a.AbstractC1327a, com.anythink.core.common.p066o.p067a.InterfaceC1328b
            public final void recordImpression(View view2) {
                C0769h.this.m496y();
            }
        };
        if (this.f932c == null) {
            view.getContext();
            this.f932c = new C1329c(this.f937h.f4333n.m3287V() <= 0 ? 100 : this.f937h.f4333n.m3287V());
        }
        this.f932c.m3964a(view, anonymousClass6);
    }

    /* JADX INFO: renamed from: a */
    public final void m502a(View view, int i, int i2) {
        m485a(view, i, i2, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m503a(View view, List<View> list, List<View> list2) {
        OwnNativeATView ownNativeATView;
        AbstractC1217aj abstractC1217aj;
        C1248m c1248m;
        String str;
        boolean z = true;
        if (this.f949t == null) {
            OwnNativeATView[] ownNativeATViewArr = new OwnNativeATView[1];
            m491a(ownNativeATViewArr, view);
            if (ownNativeATViewArr[0] == null) {
                str = "Register View don't contain OwnNativeAdView.";
            } else if (ownNativeATViewArr[0].getChildCount() == 0) {
                str = "OwnNativeAdView View don't contain any child views.";
            } else {
                this.f949t = ownNativeATViewArr[0];
            }
            Log.i("anythink", str);
            z = false;
        }
        if (z) {
            AbstractC1217aj abstractC1217aj2 = this.f936g;
            if (abstractC1217aj2 != null && !abstractC1217aj2.m3210k()) {
                m501a(view);
                if (list == null || list.size() <= 0) {
                    m486a(view, this.f944o);
                } else {
                    for (View view2 : list) {
                        if (view2 != null) {
                            view2.setOnClickListener(this.f944o);
                        }
                    }
                }
                if (list2 != null && list2.size() > 0) {
                    for (View view3 : list2) {
                        if (view3 != null) {
                            view3.setOnClickListener(this.f945p);
                        }
                    }
                }
            }
            if (this.f941l != null || (ownNativeATView = this.f949t) == null || (abstractC1217aj = this.f936g) == null || (c1248m = this.f937h) == null) {
                return;
            }
            this.f948s = new AnonymousClass8(ownNativeATView, abstractC1217aj, c1248m, this.f938i ? 5 : 6, new AnonymousClass7());
            this.f949t.setLifeCallback(new AnonymousClass9());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m504a(View view, boolean z) {
        View view2 = this.f943n;
        if (view2 != null && view == view2) {
            m485a(view, 1, 1, z);
        } else {
            View view3 = this.f934e;
            m485a(view, 1, (view3 == null || view != view3) ? 2 : 3, z);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m505a(InterfaceC0771a interfaceC0771a) {
        this.f931b = interfaceC0771a;
    }

    /* JADX INFO: renamed from: a */
    public final void m506a(String str) {
        this.f940k = str;
        if (this.f941l != null) {
            if (TextUtils.isEmpty(str)) {
                this.f941l.m5546c(3);
                return;
            }
            String str2 = this.f940k;
            str2.hashCode();
            switch (str2) {
                case "1":
                    this.f941l.m5546c(3);
                    break;
                case "2":
                    this.f941l.m5546c(1);
                    break;
                case "3":
                    this.f941l.m5546c(2);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m507a(boolean z) {
        this.f939j = z;
        C1431c c1431c = this.f941l;
        if (c1431c != null) {
            c1431c.m5544b(z ? 1 : 2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m508a(boolean z, boolean z3) {
        if (this.f936g.m3225r() != 67) {
            return false;
        }
        return this.f936g.m2481a(z, z3);
    }

    /* JADX INFO: renamed from: b */
    public final String m509b() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3233v() : "";
    }

    /* JADX INFO: renamed from: c */
    public final String m510c() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3235w() : "";
    }

    /* JADX INFO: renamed from: d */
    public final String m511d() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3157A() : "";
    }

    /* JADX INFO: renamed from: e */
    public final String m512e() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3237x() : "";
    }

    /* JADX INFO: renamed from: f */
    public final String m513f() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3239y() : "";
    }

    /* JADX INFO: renamed from: g */
    public final String m514g() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3241z() : "";
    }

    /* JADX INFO: renamed from: h */
    public final String m515h() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m2492ak() : "";
    }

    /* JADX INFO: renamed from: i */
    public final String m516i() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3171J() : "";
    }

    /* JADX INFO: renamed from: j */
    public final String m517j() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3174M() : "";
    }

    /* JADX INFO: renamed from: k */
    public final String m518k() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3173L() : "";
    }

    /* JADX INFO: renamed from: l */
    public final String m519l() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3172K() : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m520m() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        return abstractC1217aj != null ? abstractC1217aj.m3193f() : "";
    }

    /* JADX INFO: renamed from: n */
    public final boolean m521n() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        if (abstractC1217aj != null) {
            return (TextUtils.isEmpty(abstractC1217aj.m3171J()) && TextUtils.isEmpty(this.f936g.m2492ak()) && TextUtils.isEmpty(this.f936g.m3174M()) && TextUtils.isEmpty(this.f936g.m3173L()) && TextUtils.isEmpty(this.f936g.m3193f()) && TextUtils.isEmpty(this.f936g.m3172K())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m522o() {
        return this.f938i || this.f941l != null;
    }

    /* JADX INFO: renamed from: p */
    public final void m523p() {
        C1329c c1329c = this.f932c;
        if (c1329c != null) {
            c1329c.m3962a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m524q() {
        m523p();
        m494b(112);
        this.f934e = null;
        this.f949t = null;
        this.f931b = null;
        try {
            C1431c c1431c = this.f941l;
            if (c1431c != null) {
                c1431c.m5549e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        C0721b c0721b = this.f933d;
        if (c0721b != null) {
            c0721b.m161d();
            this.f933d = null;
        }
        C1329c c1329c = this.f932c;
        if (c1329c != null) {
            c1329c.m3965b();
            this.f932c = null;
        }
        BaseMediaATView baseMediaATView = this.f942m;
        if (baseMediaATView != null) {
            baseMediaATView.destroy();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m525r() {
        C1431c c1431c = this.f941l;
        if (c1431c != null) {
            c1431c.m5548d(3);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m526s() {
        C1431c c1431c = this.f941l;
        if (c1431c != null) {
            c1431c.m5550e(3);
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m527t() {
        C1431c c1431c = this.f941l;
        if (c1431c == null) {
            return 2;
        }
        return c1431c.m5551f();
    }

    /* JADX INFO: renamed from: u */
    public final int m528u() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        if (abstractC1217aj != null) {
            return abstractC1217aj.m3183W();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public final int m529v() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        if (abstractC1217aj != null) {
            return abstractC1217aj.m3184X();
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public final int m530w() {
        AbstractC1217aj abstractC1217aj = this.f936g;
        if (abstractC1217aj != null) {
            return abstractC1217aj.m3169H();
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final int m531x() {
        AbstractC1217aj abstractC1217aj;
        if (this.f938i || (abstractC1217aj = this.f936g) == null) {
            return 0;
        }
        return abstractC1217aj.m3182V();
    }
}
