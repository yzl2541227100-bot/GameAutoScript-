package com.anythink.expressad.exoplayer.p105j;

import android.content.Context;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1698o implements InterfaceC1691h.a {

    /* JADX INFO: renamed from: a */
    private final Context f9449a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1684aa<? super InterfaceC1691h> f9450b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1691h.a f9451c;

    private C1698o(Context context, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa, InterfaceC1691h.a aVar) {
        this.f9449a = context.getApplicationContext();
        this.f9450b = interfaceC1684aa;
        this.f9451c = aVar;
    }

    public C1698o(Context context, String str) {
        this(context, str, (InterfaceC1684aa<? super InterfaceC1691h>) null);
    }

    private C1698o(Context context, String str, InterfaceC1684aa<? super InterfaceC1691h> interfaceC1684aa) {
        this(context, interfaceC1684aa, new C1700q(str, interfaceC1684aa));
    }

    /* JADX INFO: renamed from: b */
    private C1697n m7874b() {
        return new C1697n(this.f9449a, this.f9450b, this.f9451c.mo7851a());
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h.a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC1691h mo7851a() {
        return new C1697n(this.f9449a, this.f9450b, this.f9451c.mo7851a());
    }
}
