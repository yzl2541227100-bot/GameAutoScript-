package com.anythink.expressad.exoplayer.p104i;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.InterfaceC1769z;
import com.anythink.expressad.exoplayer.p101h.C1621af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1666h {

    /* JADX INFO: renamed from: a */
    @Nullable
    private a f9231a;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.i.h$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo7691c();
    }

    /* JADX INFO: renamed from: a */
    public abstract C1667i mo7673a(InterfaceC1769z[] interfaceC1769zArr, C1621af c1621af);

    /* JADX INFO: renamed from: a */
    public final void m7689a(a aVar) {
        this.f9231a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7674a(Object obj);

    /* JADX INFO: renamed from: b */
    public final void m7690b() {
        a aVar = this.f9231a;
        if (aVar != null) {
            aVar.mo7691c();
        }
    }
}
