package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.viewpager.VpMainImgAnimatorView;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.common.res.image.RecycleImageView;

/* JADX INFO: loaded from: classes.dex */
public class ViewPagerAnimPlayerView extends BaseMainAnimPlayerView {

    /* JADX INFO: renamed from: A */
    private boolean f1831A;

    /* JADX INFO: renamed from: y */
    private RecycleImageView f1832y;

    /* JADX INFO: renamed from: z */
    private InterfaceC0975c f1833z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.ViewPagerAnimPlayerView$1 */
    public class C09671 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WrapRoundImageView f1834a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WrapRoundImageView f1835b;

        public C09671(WrapRoundImageView wrapRoundImageView, WrapRoundImageView wrapRoundImageView2) {
            this.f1834a = wrapRoundImageView;
            this.f1835b = wrapRoundImageView2;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            ViewPagerAnimPlayerView.this.mo1091a(C0748f.m310a(C0748f.f730l, C0748f.f716O));
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, ViewPagerAnimPlayerView.this.f1794e)) {
                if (ViewPagerAnimPlayerView.this.f1832y != null && bitmap != null) {
                    C1339c.m4025a(ViewPagerAnimPlayerView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.animplayerview.ViewPagerAnimPlayerView.1.1
                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo673a() {
                        }

                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo674a(Bitmap bitmap2) {
                            ViewPagerAnimPlayerView.this.f1832y.setImageBitmap(bitmap2);
                        }
                    });
                }
                if (ViewPagerAnimPlayerView.this.f1833z == null) {
                    ViewPagerAnimPlayerView.this.f1833z = new VpMainImgAnimatorView(ViewPagerAnimPlayerView.this.getContext().getApplicationContext());
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    ((View) ViewPagerAnimPlayerView.this.f1833z).setLayoutParams(layoutParams);
                    ViewPagerAnimPlayerView viewPagerAnimPlayerView = ViewPagerAnimPlayerView.this;
                    viewPagerAnimPlayerView.addView((View) viewPagerAnimPlayerView.f1833z);
                    ViewPagerAnimPlayerView.this.f1833z.addMainView(bitmap, this.f1834a, this.f1835b);
                }
                if (ViewPagerAnimPlayerView.this.f1831A) {
                    ViewPagerAnimPlayerView.m1103d(ViewPagerAnimPlayerView.this);
                    if (ViewPagerAnimPlayerView.this.f1833z != null) {
                        ViewPagerAnimPlayerView.this.f1833z.start();
                    }
                }
            }
        }
    }

    public ViewPagerAnimPlayerView(Context context) {
        this(context, null);
    }

    public ViewPagerAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m1103d(ViewPagerAnimPlayerView viewPagerAnimPlayerView) {
        viewPagerAnimPlayerView.f1831A = false;
        return false;
    }

    /* JADX INFO: renamed from: j */
    private void m1104j() {
        WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext().getApplicationContext());
        WrapRoundImageView wrapRoundImageView2 = new WrapRoundImageView(getContext().getApplicationContext());
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new C09671(wrapRoundImageView, wrapRoundImageView2));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
        InterfaceC0975c interfaceC0975c = this.f1833z;
        if (interfaceC0975c != null) {
            interfaceC0975c.start();
        } else {
            this.f1831A = true;
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseMainAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1080a(Context context) {
        RecycleImageView recycleImageView = new RecycleImageView(context);
        this.f1832y = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f1832y, -1, -1);
        WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext().getApplicationContext());
        WrapRoundImageView wrapRoundImageView2 = new WrapRoundImageView(getContext().getApplicationContext());
        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wrapRoundImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new C09671(wrapRoundImageView, wrapRoundImageView2));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: b */
    public final void mo1081b() {
        InterfaceC0975c interfaceC0975c = this.f1833z;
        if (interfaceC0975c != null) {
            interfaceC0975c.pause();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: c */
    public final void mo1082c() {
        InterfaceC0975c interfaceC0975c = this.f1833z;
        if (interfaceC0975c != null) {
            interfaceC0975c.stop();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: d */
    public final void mo1083d() {
        InterfaceC0975c interfaceC0975c = this.f1833z;
        if (interfaceC0975c != null) {
            interfaceC0975c.release();
            this.f1833z = null;
        }
    }
}
