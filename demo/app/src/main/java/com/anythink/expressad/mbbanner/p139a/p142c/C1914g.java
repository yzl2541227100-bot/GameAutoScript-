package com.anythink.expressad.mbbanner.p139a.p142c;

import android.graphics.Bitmap;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.mbbanner.p139a.p143d.C1916b;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C1914g implements InterfaceC1819c {

    /* JADX INFO: renamed from: a */
    private static final String f11773a = "g";

    /* JADX INFO: renamed from: b */
    private C1916b f11774b;

    /* JADX INFO: renamed from: c */
    private String f11775c;

    public C1914g(C1916b c1916b, String str) {
        this.f11774b = c1916b;
        this.f11775c = str;
    }

    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public final void mo5462a(Bitmap bitmap, String str) {
        this.f11774b.m9998a(this.f11775c, 1, str, true);
    }

    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public final void mo5463a(String str, String str2) {
        this.f11774b.m9998a(this.f11775c, 1, str2, false);
    }
}
