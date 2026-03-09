package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1739v;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1706w implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1691h f9527a;

    /* JADX INFO: renamed from: b */
    private final C1739v f9528b;

    /* JADX INFO: renamed from: c */
    private final int f9529c;

    public C1706w(InterfaceC1691h interfaceC1691h, C1739v c1739v, int i) {
        this.f9527a = (InterfaceC1691h) C1711a.m8005a(interfaceC1691h);
        this.f9528b = (C1739v) C1711a.m8005a(c1739v);
        this.f9529c = i;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) {
        this.f9528b.m8302a(this.f9529c);
        return this.f9527a.mo7741a(bArr, i, i2);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final long mo7742a(C1694k c1694k) {
        this.f9528b.m8302a(this.f9529c);
        return this.f9527a.mo7742a(c1694k);
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9527a.mo7743a();
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        this.f9527a.mo7744b();
    }
}
