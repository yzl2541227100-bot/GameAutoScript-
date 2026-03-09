package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.animplayerview.redpacket.RedPacketAnimatorView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RedPacketAnimPlayerView extends BaseMainAnimPlayerView {

    /* JADX INFO: renamed from: y */
    private List<Bitmap> f1829y;

    /* JADX INFO: renamed from: z */
    private RedPacketAnimatorView f1830z;

    public RedPacketAnimPlayerView(Context context) {
        this(context, null);
    }

    public RedPacketAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPacketAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: j */
    private ViewGroup.LayoutParams m1098j() {
        if (!C1345i.m4172c(getContext())) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
        layoutParams.addRule(13);
        return layoutParams;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
        RedPacketAnimatorView redPacketAnimatorView = this.f1830z;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.start();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseMainAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1080a(Context context) {
        ViewGroup.LayoutParams layoutParams;
        super.mo1080a(context);
        RedPacketAnimatorView redPacketAnimatorView = new RedPacketAnimatorView(context);
        this.f1830z = redPacketAnimatorView;
        if (C1345i.m4172c(getContext())) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        redPacketAnimatorView.setLayoutParams(layoutParams);
        this.f1830z.setBitmapResources(this.f1829y);
        addView(this.f1830z);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: b */
    public final void mo1081b() {
        RedPacketAnimatorView redPacketAnimatorView = this.f1830z;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.pause();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: c */
    public final void mo1082c() {
        RedPacketAnimatorView redPacketAnimatorView = this.f1830z;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.stop();
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: d */
    public final void mo1083d() {
        RedPacketAnimatorView redPacketAnimatorView = this.f1830z;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.release();
            this.f1830z = null;
        }
        List<Bitmap> list = this.f1829y;
        if (list != null) {
            for (Bitmap bitmap : list) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseMainAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        this.f1829y = list;
        super.init(abstractC1247l, c1248m, z, list);
    }
}
