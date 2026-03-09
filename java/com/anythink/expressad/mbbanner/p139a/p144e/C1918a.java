package com.anythink.expressad.mbbanner.p139a.p144e;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.mbbanner.p139a.p142c.InterfaceC1909b;

/* JADX INFO: renamed from: com.anythink.expressad.mbbanner.a.e.a */
/* JADX INFO: loaded from: classes.dex */
public class C1918a {

    /* JADX INFO: renamed from: a */
    private static final String f11843a = "a";

    /* JADX INFO: renamed from: b */
    private final Handler f11844b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private boolean f11845c;

    /* JADX INFO: renamed from: a */
    private void m10060a(final InterfaceC1909b interfaceC1909b, final C1782d c1782d, final String str) {
        this.f11844b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1909b interfaceC1909b2 = interfaceC1909b;
                if (interfaceC1909b2 != null) {
                    C1782d c1782d2 = c1782d;
                    boolean unused = C1918a.this.f11845c;
                    interfaceC1909b2.mo9960a(c1782d2);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m10061a(boolean z) {
        this.f11845c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m10063a(final InterfaceC1909b interfaceC1909b, final String str) {
        this.f11844b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1909b interfaceC1909b2 = interfaceC1909b;
                if (interfaceC1909b2 != null) {
                    boolean unused = C1918a.this.f11845c;
                    interfaceC1909b2.mo9959a();
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m10064a(final InterfaceC1909b interfaceC1909b, final String str, final String str2) {
        StringBuilder sb = new StringBuilder("postCampaignFail errorMsg=");
        sb.append(str);
        sb.append(" unitId=");
        sb.append(str2);
        this.f11844b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1909b interfaceC1909b2 = interfaceC1909b;
                if (interfaceC1909b2 != null) {
                    String str3 = str;
                    boolean unused = C1918a.this.f11845c;
                    interfaceC1909b2.mo9961a(str3);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m10065b(final InterfaceC1909b interfaceC1909b, final String str) {
        this.f11844b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC1909b interfaceC1909b2 = interfaceC1909b;
                if (interfaceC1909b2 != null) {
                    boolean unused = C1918a.this.f11845c;
                    interfaceC1909b2.mo9962b();
                }
            }
        });
    }
}
