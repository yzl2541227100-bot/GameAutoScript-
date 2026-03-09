package com.anythink.expressad.mbbanner.p139a.p142c;

import com.anythink.expressad.mbbanner.p139a.p143d.C1916b;
import com.anythink.expressad.videocommon.p178b.C2324i;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C1913f implements C2324i.b {

    /* JADX INFO: renamed from: a */
    private static final String f11770a = "f";

    /* JADX INFO: renamed from: b */
    private C1916b f11771b;

    /* JADX INFO: renamed from: c */
    private String f11772c;

    public C1913f(C1916b c1916b, String str) {
        this.f11771b = c1916b;
        this.f11772c = str;
    }

    @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
    /* JADX INFO: renamed from: a */
    public final void mo5464a(String str) {
        C1916b c1916b = this.f11771b;
        if (c1916b != null) {
            c1916b.m9998a(this.f11772c, 3, str, true);
        }
    }

    @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
    /* JADX INFO: renamed from: a */
    public final void mo5465a(String str, String str2) {
        C1916b c1916b = this.f11771b;
        if (c1916b != null) {
            c1916b.m9998a(this.f11772c, 3, str, false);
        }
    }
}
