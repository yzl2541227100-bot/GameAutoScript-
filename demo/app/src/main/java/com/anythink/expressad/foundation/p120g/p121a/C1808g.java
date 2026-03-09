package com.anythink.expressad.foundation.p120g.p121a;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1808g extends AbstractC1802a<String, Bitmap> {
    /* JADX INFO: renamed from: a */
    private static Reference<Bitmap> m9401a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }

    @Override // com.anythink.expressad.foundation.p120g.p121a.AbstractC1802a
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Reference<Bitmap> mo9387c(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }
}
