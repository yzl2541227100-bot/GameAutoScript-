package com.anythink.core.common.p061j;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.C1201f;
import com.anythink.core.common.C1387u;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;

/* JADX INFO: renamed from: com.anythink.core.common.j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1295a implements InterfaceC1298d {

    /* JADX INFO: renamed from: a */
    public String f4918a;

    /* JADX INFO: renamed from: b */
    public String f4919b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1296b f4920c;

    /* JADX INFO: renamed from: d */
    public InterfaceRunnableC1313b f4921d = new InterfaceRunnableC1313b() { // from class: com.anythink.core.common.j.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (C1295a.this.mo3730a()) {
                C1295a.this.mo3727a(C1175n.m2059a().m2099E(), 4);
            }
        }
    };

    public C1295a(String str, String str2) {
        this.f4918a = str;
        this.f4919b = str2;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: a */
    public final void mo3726a(int i) {
        C1315d.m3806a().mo3800a(this.f4921d, ((long) Math.pow(2.0d, i)) * 1000, false);
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: a */
    public final void mo3727a(Context context, int i) {
        C1257v c1257v = new C1257v();
        c1257v.m3446a(context);
        c1257v.f4483d = i;
        C1201f.m2340a(context, this.f4918a, this.f4919b).m2398b(context, this.f4919b, this.f4918a, c1257v, null);
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: a */
    public final void mo3728a(AdError adError, int i) {
        if (mo3730a()) {
            C1315d.m3806a().mo3800a(this.f4921d, ((long) Math.pow(2.0d, i)) * 1000, false);
            InterfaceC1296b interfaceC1296b = this.f4920c;
            if (interfaceC1296b != null) {
                interfaceC1296b.mo3734a(this.f4918a, adError);
            }
        }
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: a */
    public final void mo3729a(InterfaceC1296b interfaceC1296b) {
        this.f4920c = interfaceC1296b;
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: a */
    public final boolean mo3730a() {
        return C1387u.m4556a().m4573e(this.f4918a);
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: b */
    public final void mo3731b() {
        InterfaceC1296b interfaceC1296b;
        if (!mo3730a() || (interfaceC1296b = this.f4920c) == null) {
            return;
        }
        interfaceC1296b.mo3733a(this.f4918a);
    }

    @Override // com.anythink.core.common.p061j.InterfaceC1298d
    /* JADX INFO: renamed from: c */
    public final void mo3732c() {
        C1315d.m3806a().mo3801b(this.f4921d);
    }
}
