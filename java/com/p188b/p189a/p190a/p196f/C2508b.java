package com.p188b.p189a.p190a.p196f;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.b.a.a.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2508b implements InterfaceC2507a {
    @Override // com.p188b.p189a.p190a.p196f.InterfaceC2507a
    /* JADX INFO: renamed from: a */
    public final void mo12748a(File file) throws IOException {
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete ".concat(String.valueOf(file)));
        }
    }
}
