package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.common.res.image.RecycleImageView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMainAnimPlayerView extends BaseAnimPlayerView {

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView$1 */
    public class C09651 implements C1378b.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WrapRoundImageView f1806a;

        public C09651(WrapRoundImageView wrapRoundImageView) {
            this.f1806a = wrapRoundImageView;
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onFail(String str, String str2) {
            BaseMainAnimPlayerView.this.mo1091a(C0748f.m310a(C0748f.f730l, C0748f.f716O));
        }

        @Override // com.anythink.core.common.res.C1378b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, BaseMainAnimPlayerView.this.f1794e)) {
                WrapRoundImageView wrapRoundImageView = this.f1806a;
                if (wrapRoundImageView != null) {
                    wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C09651.this.f1806a.setBitmapAndResize(bitmap, BaseMainAnimPlayerView.this.getWidth(), BaseMainAnimPlayerView.this.getHeight());
                        }
                    });
                }
                BaseMainAnimPlayerView baseMainAnimPlayerView = BaseMainAnimPlayerView.this;
                if (baseMainAnimPlayerView.f1795f == null || bitmap == null) {
                    return;
                }
                C1339c.m4025a(baseMainAnimPlayerView.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView.1.2
                    @Override // com.anythink.core.common.p066o.C1339c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo673a() {
                    }

                    @Override // com.anythink.core.common.p066o.C1339c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo674a(Bitmap bitmap2) {
                        BaseMainAnimPlayerView.this.f1795f.setImageBitmap(bitmap2);
                    }
                });
            }
        }
    }

    public BaseMainAnimPlayerView(Context context) {
        this(context, null);
    }

    public BaseMainAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMainAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m1095a(WrapRoundImageView wrapRoundImageView) {
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new C09651(wrapRoundImageView));
    }

    /* JADX INFO: renamed from: a */
    public void mo1080a(Context context) {
        RecycleImageView recycleImageView = new RecycleImageView(context);
        this.f1795f = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f1795f, -1, -1);
        this.f1796g = new WrapRoundImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f1796g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f1796g, layoutParams);
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new C09651(this.f1796g));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        super.init(abstractC1247l, c1248m, z, list);
        mo1080a(getContext().getApplicationContext());
    }
}
