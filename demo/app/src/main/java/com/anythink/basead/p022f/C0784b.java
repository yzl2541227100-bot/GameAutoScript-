package com.anythink.basead.p022f;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anythink.basead.p021e.InterfaceC0771a;
import com.anythink.basead.p025ui.MraidBannerATView;
import com.anythink.basead.p025ui.SdkBannerATView;
import com.anythink.core.common.p055f.C1248m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.basead.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0784b extends AbstractC0785c {

    /* JADX INFO: renamed from: a */
    public InterfaceC0771a f992a;

    /* JADX INFO: renamed from: k */
    private final String f993k;

    public C0784b(Context context, C1248m c1248m, String str, boolean z) {
        super(context, c1248m, str, z);
        this.f993k = C0784b.class.getSimpleName();
    }

    @Override // com.anythink.basead.p022f.InterfaceC0781a
    /* JADX INFO: renamed from: a */
    public final void mo560a(Activity activity, Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: a */
    public final void m579a(InterfaceC0771a interfaceC0771a) {
        this.f992a = interfaceC0771a;
    }

    /* JADX INFO: renamed from: b */
    public final View m580b() {
        if (mo562a()) {
            return this.f1002g.m3210k() ? new MraidBannerATView(this.f998c, this.f999d, this.f1002g, this.f992a) : new SdkBannerATView(this.f998c, this.f999d, this.f1002g, this.f992a);
        }
        return null;
    }

    @Override // com.anythink.basead.p022f.AbstractC0785c
    /* JADX INFO: renamed from: c */
    public final void mo581c() {
        this.f992a = null;
    }
}
