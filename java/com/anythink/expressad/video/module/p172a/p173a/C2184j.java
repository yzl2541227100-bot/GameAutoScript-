package com.anythink.expressad.video.module.p172a.p173a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p138h.C1880n;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2184j extends C2179e {

    /* JADX INFO: renamed from: a */
    private int f13854a;

    public C2184j(ImageView imageView, int i) {
        super(imageView);
        this.f13854a = i;
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2179e, com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public final void mo5462a(Bitmap bitmap, String str) {
        Bitmap bitmapM9756a;
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f13849c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled() || (bitmapM9756a = C1880n.m9756a(bitmap, this.f13854a)) == null) {
                return;
            }
            this.f13849c.get().setImageBitmap(bitmapM9756a);
        } catch (Throwable th) {
            if (C1404a.f6209a) {
                th.printStackTrace();
            }
        }
    }
}
