package com.anythink.basead.p025ui.animplayerview.scale;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.InterfaceC0975c;
import com.anythink.core.common.p066o.C1345i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AlbumScaleAnimatorView extends FrameLayout implements InterfaceC0975c {

    /* JADX INFO: renamed from: a */
    private List<Bitmap> f1898a;

    /* JADX INFO: renamed from: b */
    private AlbumScaleMainView f1899b;

    /* JADX INFO: renamed from: c */
    private BaseAlbumScaleItemView f1900c;

    /* JADX INFO: renamed from: d */
    private BaseAlbumScaleItemView f1901d;

    /* JADX INFO: renamed from: e */
    private BaseAlbumScaleItemView f1902e;

    /* JADX INFO: renamed from: f */
    private boolean f1903f;

    public AlbumScaleAnimatorView(Context context) {
        this(context, null);
    }

    public AlbumScaleAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1903f = false;
    }

    /* JADX INFO: renamed from: a */
    private int m1133a(int i) {
        return C1345i.m4153a(getContext(), i);
    }

    /* JADX INFO: renamed from: a */
    private ViewGroup.LayoutParams m1134a(boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? m1133a(90) : m1133a(42), z ? m1133a(42) : m1133a(90));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX INFO: renamed from: a */
    private void m1135a(Bitmap bitmap) {
        AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
        this.f1899b = albumScaleMainView;
        boolean zM4172c = C1345i.m4172c(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(zM4172c ? m1133a(90) : m1133a(42), zM4172c ? m1133a(42) : m1133a(90));
        layoutParams.gravity = 17;
        albumScaleMainView.setLayoutParams(layoutParams);
        addView(this.f1899b);
        this.f1899b.initView(bitmap, true);
    }

    /* JADX INFO: renamed from: a */
    private boolean m1136a() {
        return C1345i.m4172c(getContext());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1137a(AlbumScaleAnimatorView albumScaleAnimatorView) {
        albumScaleAnimatorView.f1903f = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m1139b() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView01 albumScaleItemView01 = new AlbumScaleItemView01(getContext());
        albumScaleItemView01.setBitmapResources(this.f1898a);
        albumScaleItemView01.setOrientation(C1345i.m4172c(getContext()));
        addView(albumScaleItemView01, layoutParams);
        this.f1900c = albumScaleItemView01;
    }

    /* JADX INFO: renamed from: c */
    private void m1141c() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView02 albumScaleItemView02 = new AlbumScaleItemView02(getContext());
        albumScaleItemView02.setOrientation(C1345i.m4172c(getContext()));
        albumScaleItemView02.setBitmapResources(this.f1898a);
        addView(albumScaleItemView02, layoutParams);
        this.f1901d = albumScaleItemView02;
    }

    /* JADX INFO: renamed from: d */
    private void m1143d() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView03 albumScaleItemView03 = new AlbumScaleItemView03(getContext());
        albumScaleItemView03.setBitmapResources(this.f1898a);
        albumScaleItemView03.setOrientation(C1345i.m4172c(getContext()));
        addView(albumScaleItemView03, layoutParams);
        this.f1902e = albumScaleItemView03;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0975c
    public void addMainView(Bitmap bitmap, WrapRoundImageView... wrapRoundImageViewArr) {
        if (bitmap == null) {
            return;
        }
        AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
        this.f1899b = albumScaleMainView;
        boolean zM4172c = C1345i.m4172c(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(zM4172c ? m1133a(90) : m1133a(42), zM4172c ? m1133a(42) : m1133a(90));
        layoutParams.gravity = 17;
        albumScaleMainView.setLayoutParams(layoutParams);
        addView(this.f1899b);
        this.f1899b.initView(bitmap, true);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView03 albumScaleItemView03 = new AlbumScaleItemView03(getContext());
        albumScaleItemView03.setBitmapResources(this.f1898a);
        albumScaleItemView03.setOrientation(C1345i.m4172c(getContext()));
        addView(albumScaleItemView03, layoutParams2);
        this.f1902e = albumScaleItemView03;
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView02 albumScaleItemView02 = new AlbumScaleItemView02(getContext());
        albumScaleItemView02.setOrientation(C1345i.m4172c(getContext()));
        albumScaleItemView02.setBitmapResources(this.f1898a);
        addView(albumScaleItemView02, layoutParams3);
        this.f1901d = albumScaleItemView02;
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView01 albumScaleItemView01 = new AlbumScaleItemView01(getContext());
        albumScaleItemView01.setBitmapResources(this.f1898a);
        albumScaleItemView01.setOrientation(C1345i.m4172c(getContext()));
        addView(albumScaleItemView01, layoutParams4);
        this.f1900c = albumScaleItemView01;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void pause() {
        AlbumScaleMainView albumScaleMainView = this.f1899b;
        if (albumScaleMainView != null) {
            albumScaleMainView.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f1900c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f1901d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f1902e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.pause();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0975c
    public void release() {
        List<Bitmap> list = this.f1898a;
        if (list != null) {
            for (Bitmap bitmap : list) {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            this.f1898a.clear();
        }
        AlbumScaleMainView albumScaleMainView = this.f1899b;
        if (albumScaleMainView != null) {
            albumScaleMainView.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f1900c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f1901d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f1902e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.release();
        }
        removeAllViews();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void resume() {
        AlbumScaleMainView albumScaleMainView = this.f1899b;
        if (albumScaleMainView != null) {
            albumScaleMainView.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f1900c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f1901d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f1902e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.resume();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void setBitmapResources(List<Bitmap> list) {
        this.f1898a = list;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void start() {
        if (this.f1899b == null || this.f1900c == null || this.f1901d == null || this.f1902e == null) {
            return;
        }
        if (this.f1903f) {
            resume();
        } else {
            post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleAnimatorView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AlbumScaleAnimatorView.m1137a(AlbumScaleAnimatorView.this);
                    AlbumScaleAnimatorView.this.f1900c.start();
                    AlbumScaleAnimatorView.this.f1901d.setStartDelay(200L);
                    AlbumScaleAnimatorView.this.f1901d.start();
                    AlbumScaleAnimatorView.this.f1899b.setStartDelay(300L);
                    AlbumScaleAnimatorView.this.f1899b.start();
                    AlbumScaleAnimatorView.this.f1902e.setMainViewScale(AlbumScaleAnimatorView.this.f1899b.getMainViewScale());
                    AlbumScaleAnimatorView.this.f1902e.setStartDelay(300L);
                    AlbumScaleAnimatorView.this.f1902e.start();
                }
            });
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.InterfaceC0974b
    public void stop() {
        AlbumScaleMainView albumScaleMainView = this.f1899b;
        if (albumScaleMainView != null) {
            albumScaleMainView.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f1900c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f1901d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f1902e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.stop();
        }
        this.f1903f = false;
    }
}
