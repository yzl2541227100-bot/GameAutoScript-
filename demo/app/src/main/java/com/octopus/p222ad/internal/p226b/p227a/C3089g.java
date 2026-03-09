package com.octopus.p222ad.internal.p226b.p227a;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.octopus.ad.internal.b.a.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3089g extends AbstractC3087e {

    /* JADX INFO: renamed from: a */
    private final long f17040a;

    public C3089g(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.f17040a = j;
    }

    @Override // com.octopus.p222ad.internal.p226b.p227a.AbstractC3087e, com.octopus.p222ad.internal.p226b.p227a.InterfaceC3083a
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo14252a(File file) throws IOException {
        super.mo14252a(file);
    }

    @Override // com.octopus.p222ad.internal.p226b.p227a.AbstractC3087e
    /* JADX INFO: renamed from: a */
    public boolean mo14266a(File file, long j, int i) {
        return j <= this.f17040a;
    }
}
