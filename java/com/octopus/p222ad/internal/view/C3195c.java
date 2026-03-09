package com.octopus.p222ad.internal.view;

import android.view.View;

/* JADX INFO: renamed from: com.octopus.ad.internal.view.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3195c implements InterfaceC3196d {

    /* JADX INFO: renamed from: a */
    private long f17749a;

    /* JADX INFO: renamed from: b */
    private InterfaceC3194b f17750b;

    /* JADX INFO: renamed from: c */
    private boolean f17751c;

    public C3195c(InterfaceC3194b interfaceC3194b, Long l, boolean z) {
        this.f17749a = l.longValue();
        this.f17750b = interfaceC3194b;
        this.f17751c = z;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3196d
    /* JADX INFO: renamed from: a */
    public long mo14774a() {
        return this.f17749a;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3196d
    /* JADX INFO: renamed from: b */
    public boolean mo14775b() {
        return this.f17751c;
    }

    @Override // com.octopus.p222ad.internal.view.InterfaceC3196d
    /* JADX INFO: renamed from: c */
    public View mo14776c() {
        InterfaceC3194b interfaceC3194b = this.f17750b;
        if (interfaceC3194b == null) {
            return null;
        }
        return interfaceC3194b.getView();
    }
}
