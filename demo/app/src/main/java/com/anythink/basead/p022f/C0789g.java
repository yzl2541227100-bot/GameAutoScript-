package com.anythink.basead.p022f;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p022f.p023a.C0782a;
import com.anythink.basead.p025ui.AsseblemSplashATView;
import com.anythink.basead.p025ui.BaseSdkSplashATView;
import com.anythink.basead.p025ui.BaseSplashATView;
import com.anythink.basead.p025ui.SinglePictureSplashATView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.f.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0789g extends AbstractC0785c {

    /* JADX INFO: renamed from: a */
    public InterfaceC0771a f1031a;

    /* JADX INFO: renamed from: k */
    public BaseSplashATView f1032k;

    /* JADX INFO: renamed from: l */
    public boolean f1033l;

    public C0789g(Context context, C1248m c1248m, String str) {
        super(context, c1248m, str, false);
    }

    @Override // com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    public final void mo560a(Activity activity, Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: a */
    public final void m617a(final ViewGroup viewGroup) {
        C1175n.m2059a().m2135b(new Runnable() { // from class: com.anythink.basead.f.g.1
            @Override // java.lang.Runnable
            public final void run() {
                C0789g c0789g;
                BaseSplashATView asseblemSplashATView;
                C0789g c0789g2 = C0789g.this;
                if (BaseSdkSplashATView.isSinglePicture(c0789g2.f1002g, c0789g2.f999d.f4333n)) {
                    c0789g = C0789g.this;
                    Context context = viewGroup.getContext();
                    C0789g c0789g3 = C0789g.this;
                    asseblemSplashATView = new SinglePictureSplashATView(context, c0789g3.f999d, c0789g3.f1002g, c0789g3.f1031a);
                } else {
                    c0789g = C0789g.this;
                    Context context2 = viewGroup.getContext();
                    C0789g c0789g4 = C0789g.this;
                    asseblemSplashATView = new AsseblemSplashATView(context2, c0789g4.f999d, c0789g4.f1002g, c0789g4.f1031a);
                }
                c0789g.f1032k = asseblemSplashATView;
                C0789g c0789g5 = C0789g.this;
                c0789g5.f1032k.setDontCountDown(c0789g5.f1033l);
                viewGroup.addView(C0789g.this.f1032k);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m618a(InterfaceC0771a interfaceC0771a) {
        this.f1031a = interfaceC0771a;
    }

    @Override // com.anythink.basead.p022f.AbstractC0785c, com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    public final boolean mo562a() {
        try {
            if (m583d()) {
                return C0782a.m563a(this.f998c).m568a(this.f1002g, this.f999d, this.f1001f);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m619b() {
        this.f1033l = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m620f() {
        this.f1031a = null;
        BaseSplashATView baseSplashATView = this.f1032k;
        if (baseSplashATView != null) {
            baseSplashATView.destroy();
            this.f1032k = null;
        }
    }
}
