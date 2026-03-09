package com.anythink.expressad.p089e;

import android.content.Context;
import com.anythink.expressad.InterfaceC1476b;
import com.anythink.expressad.foundation.p113b.C1774b;
import com.anythink.expressad.foundation.p120g.p126f.C1860m;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1490a implements InterfaceC1476b {

    /* JADX INFO: renamed from: a */
    public static Map<String, String> f7294a;

    /* JADX INFO: renamed from: b */
    private Context f7295b;

    /* JADX INFO: renamed from: c */
    private boolean f7296c = false;

    /* JADX INFO: renamed from: a */
    private void m6120a() {
        this.f7296c = false;
        try {
            C1860m.m9638a(this.f7295b);
            C1774b.m8563a().m8569a(f7294a, this.f7295b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.InterfaceC1476b
    /* JADX INFO: renamed from: a */
    public final void mo5718a(Map<String, String> map, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7295b = applicationContext;
        f7294a = map;
        this.f7296c = false;
        try {
            C1860m.m9638a(applicationContext);
            C1774b.m8563a().m8569a(f7294a, this.f7295b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
