package com.anythink.expressad.video.module.p172a.p173a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C2179e implements InterfaceC1819c {

    /* JADX INFO: renamed from: b */
    public static final String f13847b = "ImageLoaderListener";

    /* JADX INFO: renamed from: a */
    private C1781c f13848a;

    /* JADX INFO: renamed from: c */
    public WeakReference<ImageView> f13849c;

    /* JADX INFO: renamed from: d */
    private String f13850d;

    public C2179e(ImageView imageView) {
        this.f13849c = new WeakReference<>(imageView);
    }

    public C2179e(ImageView imageView, C1781c c1781c, String str) {
        this.f13849c = new WeakReference<>(imageView);
        this.f13848a = c1781c;
        this.f13850d = str;
    }

    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public void mo5462a(Bitmap bitmap, String str) {
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.f13849c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled()) {
                return;
            }
            this.f13849c.get().setImageBitmap(bitmap);
            this.f13849c.get().setVisibility(0);
        } catch (Throwable th) {
            if (C1404a.f6209a) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
    /* JADX INFO: renamed from: a */
    public void mo5463a(String str, String str2) {
    }
}
