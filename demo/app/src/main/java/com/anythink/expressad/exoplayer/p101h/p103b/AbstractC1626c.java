package com.anythink.expressad.exoplayer.p101h.p103b;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.C1703t;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p107k.C1711a;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.b.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1626c implements C1703t.c {

    /* JADX INFO: renamed from: b */
    public final C1694k f8764b;

    /* JADX INFO: renamed from: c */
    public final int f8765c = 1;

    /* JADX INFO: renamed from: d */
    public final C1753m f8766d;

    /* JADX INFO: renamed from: e */
    public final int f8767e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Object f8768f;

    /* JADX INFO: renamed from: g */
    public final long f8769g;

    /* JADX INFO: renamed from: h */
    public final long f8770h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1691h f8771i;

    public AbstractC1626c(InterfaceC1691h interfaceC1691h, C1694k c1694k, C1753m c1753m, int i, @Nullable Object obj, long j, long j2) {
        this.f8771i = (InterfaceC1691h) C1711a.m8005a(interfaceC1691h);
        this.f8764b = (C1694k) C1711a.m8005a(c1694k);
        this.f8766d = c1753m;
        this.f8767e = i;
        this.f8768f = obj;
        this.f8769g = j;
        this.f8770h = j2;
    }

    /* JADX INFO: renamed from: c */
    private long m7308c() {
        return this.f8770h - this.f8769g;
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo7309d();
}
