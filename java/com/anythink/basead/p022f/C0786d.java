package com.anythink.basead.p022f;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p021e.C0772b;
import com.anythink.basead.p021e.C0779i;
import com.anythink.basead.p021e.InterfaceC0780j;
import com.anythink.basead.p025ui.BaseATActivity;
import com.anythink.core.basead.p044b.C1121c;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.f.d */
/* JADX INFO: loaded from: classes.dex */
public class C0786d extends AbstractC0785c {

    /* JADX INFO: renamed from: a */
    public static final String f1005a = "d";

    /* JADX INFO: renamed from: k */
    private InterfaceC0780j f1006k;

    public C0786d(Context context, C1248m c1248m, String str, boolean z) {
        super(context, c1248m, str, z);
    }

    @Override // com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    public final void mo560a(Activity activity, Map<String, Object> map) {
        try {
            if (this.f998c == null) {
                InterfaceC0780j interfaceC0780j = this.f1006k;
                if (interfaceC0780j != null) {
                    interfaceC0780j.onShowFailed(C0748f.m310a(C0748f.f727i, C0748f.f704C));
                    return;
                }
                return;
            }
            map.get(AbstractC0785c.f994h);
            String string = map.get("extra_scenario").toString();
            int iIntValue = ((Integer) map.get(AbstractC0785c.f996j)).intValue();
            final String str = this.f999d.f4321b + this.f1000e + System.currentTimeMillis();
            C0772b.m542a().m544a(str, new C0772b.b() { // from class: com.anythink.basead.f.d.1
                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo458a() {
                    String str2 = C0786d.f1005a;
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo459a(C0747e c0747e) {
                    String str2 = C0786d.f1005a;
                    new StringBuilder("onVideoShowFailed.......").append(c0747e.m309c());
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onShowFailed(c0747e);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo460a(C0779i c0779i) {
                    String str2 = C0786d.f1005a;
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onAdShow(c0779i);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo461a(boolean z) {
                    String str2 = C0786d.f1005a;
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onDeeplinkCallback(z);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: b */
                public final void mo462b() {
                    String str2 = C0786d.f1005a;
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: b */
                public final void mo463b(C0779i c0779i) {
                    String str2 = C0786d.f1005a;
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onAdClick(c0779i);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: c */
                public final void mo464c() {
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: d */
                public final void mo465d() {
                    String str2 = C0786d.f1005a;
                    if (C0786d.this.f1006k != null) {
                        C0786d.this.f1006k.onAdClosed();
                    }
                    C0772b.m542a().m545b(str);
                }
            });
            C1121c c1121c = new C1121c();
            c1121c.f2751c = this.f1002g;
            c1121c.f2752d = str;
            c1121c.f2749a = 3;
            c1121c.f2756h = this.f999d;
            c1121c.f2753e = iIntValue;
            c1121c.f2750b = string;
            BaseATActivity.m680a(activity, c1121c);
        } catch (Exception e) {
            e.printStackTrace();
            InterfaceC0780j interfaceC0780j2 = this.f1006k;
            if (interfaceC0780j2 != null) {
                interfaceC0780j2.onShowFailed(C0748f.m310a("-9999", e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m586a(InterfaceC0780j interfaceC0780j) {
        this.f1006k = interfaceC0780j;
    }
}
