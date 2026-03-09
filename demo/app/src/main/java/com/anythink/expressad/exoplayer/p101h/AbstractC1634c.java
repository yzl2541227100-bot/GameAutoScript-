package com.anythink.expressad.exoplayer.p101h;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1651t;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1634c implements InterfaceC1650s {

    /* JADX INFO: renamed from: a */
    private final ArrayList<InterfaceC1650s.b> f8825a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b */
    private final InterfaceC1651t.a f8826b = new InterfaceC1651t.a();

    /* JADX INFO: renamed from: c */
    private InterfaceC1610h f8827c;

    /* JADX INFO: renamed from: d */
    private AbstractC1499ae f8828d;

    /* JADX INFO: renamed from: e */
    private Object f8829e;

    /* JADX INFO: renamed from: a */
    private InterfaceC1651t.a m7351a(InterfaceC1650s.a aVar, long j) {
        C1711a.m8010a(aVar != null);
        return this.f8826b.m7470a(0, aVar, j);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1651t.a m7352a(int i, @Nullable InterfaceC1650s.a aVar) {
        return this.f8826b.m7470a(i, aVar, 0L);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1651t.a m7353a(@Nullable InterfaceC1650s.a aVar) {
        return this.f8826b.m7470a(0, aVar, 0L);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7227a();

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7354a(Handler handler, InterfaceC1651t interfaceC1651t) {
        this.f8826b.m7474a(handler, interfaceC1651t);
    }

    /* JADX INFO: renamed from: a */
    public final void m7355a(AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        this.f8828d = abstractC1499ae;
        this.f8829e = obj;
        Iterator<InterfaceC1650s.b> it = this.f8825a.iterator();
        while (it.hasNext()) {
            it.next().mo7375a(this, abstractC1499ae, obj);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7356a(InterfaceC1650s.b bVar) {
        this.f8825a.remove(bVar);
        if (this.f8825a.isEmpty()) {
            this.f8827c = null;
            this.f8828d = null;
            this.f8829e = null;
            mo7227a();
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7357a(InterfaceC1651t interfaceC1651t) {
        this.f8826b.m7478a(interfaceC1651t);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7229a(InterfaceC1610h interfaceC1610h, boolean z);

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7358a(InterfaceC1610h interfaceC1610h, boolean z, InterfaceC1650s.b bVar) {
        InterfaceC1610h interfaceC1610h2 = this.f8827c;
        C1711a.m8010a(interfaceC1610h2 == null || interfaceC1610h2 == interfaceC1610h);
        this.f8825a.add(bVar);
        if (this.f8827c == null) {
            this.f8827c = interfaceC1610h;
            mo7229a(interfaceC1610h, z);
        } else {
            AbstractC1499ae abstractC1499ae = this.f8828d;
            if (abstractC1499ae != null) {
                bVar.mo7375a(this, abstractC1499ae, this.f8829e);
            }
        }
    }
}
