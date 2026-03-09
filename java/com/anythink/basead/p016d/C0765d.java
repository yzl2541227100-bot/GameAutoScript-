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
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.reward.p147b.C1964a;
import com.anythink.expressad.videocommon.p180d.AbstractC2335b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.d.d */
/* JADX INFO: loaded from: classes.dex */
public class C0765d extends AbstractC0756b {

    /* JADX INFO: renamed from: a */
    public static final String f901a = "d";

    public C0765d(Context context, AbstractC0756b.b bVar, C1248m c1248m) {
        super(context, bVar, c1248m);
    }

    /* JADX INFO: renamed from: a */
    public final void m457a(Activity activity, Map<String, Object> map) {
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
            final String string = map.get("extra_scenario").toString();
            int iIntValue = ((Integer) map.get(AbstractC0785c.f996j)).intValue();
            final String strM398a = m398a(this.f847e);
            HashMap map2 = new HashMap(2);
            m406a(map2);
            if (this.f845c != null) {
                str = this.f845c.f4323d + this.f845c.f4322c;
            } else {
                str = "";
            }
            InterfaceC1157i interfaceC1157i = this.f848f;
            if (interfaceC1157i instanceof C1964a) {
                ((C1964a) interfaceC1157i).m10383a(new AbstractC2335b(map2, str) { // from class: com.anythink.basead.d.d.1
                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: a */
                    public final void mo373a() {
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: a */
                    public final void mo374a(final C1781c c1781c) {
                        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.basead.d.d.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                C0765d.this.m404a(c1781c, string);
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
                        super.mo376a(z, str2, f);
                        InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                        if (interfaceC0771a2 != null) {
                            interfaceC0771a2.onAdClosed();
                        }
                        C0765d.this.m409e();
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: b */
                    public final void mo377b() {
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: b */
                    public final void mo378b(String str2) {
                        InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                        if (interfaceC0771a2 != null) {
                            interfaceC0771a2.onShowFailed(C0748f.m310a(C0748f.f729k, str2));
                        }
                        C0765d.this.f847e = null;
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: c */
                    public final void mo379c() {
                        InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                        if (interfaceC0771a2 != null) {
                            interfaceC0771a2.onAdShow(new C0779i());
                        }
                        C0765d.this.f847e = null;
                    }

                    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
                    /* JADX INFO: renamed from: d */
                    public final void mo380d() {
                        InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
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
            C0772b.m542a().m544a(strM398a, new C0772b.b(map2, str) { // from class: com.anythink.basead.d.d.2
                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo458a() {
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 == null || !(interfaceC0771a2 instanceof InterfaceC0780j)) {
                        return;
                    }
                    ((InterfaceC0780j) interfaceC0771a2).onVideoAdPlayStart();
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo459a(C0747e c0747e) {
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onShowFailed(c0747e);
                    }
                    C0765d.this.f847e = null;
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo460a(C0779i c0779i) {
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onAdShow(c0779i);
                    }
                    C0765d.this.f847e = null;
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: a */
                public final void mo461a(boolean z) {
                    String str2 = C0765d.f901a;
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onDeeplinkCallback(z);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: b */
                public final void mo462b() {
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 == null || !(interfaceC0771a2 instanceof InterfaceC0780j)) {
                        return;
                    }
                    ((InterfaceC0780j) interfaceC0771a2).onVideoAdPlayEnd();
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: b */
                public final void mo463b(C0779i c0779i) {
                    String str2 = C0765d.f901a;
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onAdClick(c0779i);
                    }
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: c */
                public final void mo464c() {
                }

                @Override // com.anythink.basead.p021e.C0772b.b
                /* JADX INFO: renamed from: d */
                public final void mo465d() {
                    super.mo465d();
                    String str2 = C0765d.f901a;
                    InterfaceC0771a interfaceC0771a2 = C0765d.this.f850h;
                    if (interfaceC0771a2 != null) {
                        interfaceC0771a2.onAdClosed();
                    }
                    C0772b.m542a().m545b(strM398a);
                }
            });
            C1121c c1121c = new C1121c();
            c1121c.f2751c = this.f847e;
            c1121c.f2752d = strM398a;
            c1121c.f2749a = 3;
            c1121c.f2756h = this.f845c;
            c1121c.f2753e = iIntValue;
            c1121c.f2750b = string;
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
