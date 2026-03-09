package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GuideToClickAnimPlayerView extends BaseAnimPlayerView {

    /* JADX INFO: renamed from: y */
    private GuideToClickView f1828y;

    public GuideToClickAnimPlayerView(Context context) {
        super(context);
    }

    public GuideToClickAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GuideToClickAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m1097a(Context context) {
        Bitmap bitmap;
        m1094h();
        GuideToClickView guideToClickView = new GuideToClickView(context);
        this.f1828y = guideToClickView;
        addView(guideToClickView, -1, -1);
        List<Bitmap> list = this.f1793d;
        if (list == null || list.size() <= 0 || (bitmap = this.f1793d.get(0)) == null || bitmap.isRecycled()) {
            return;
        }
        this.f1828y.setFingerImageResource(bitmap);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: b */
    public final void mo1081b() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: c */
    public final void mo1082c() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView
    /* JADX INFO: renamed from: d */
    public final void mo1083d() {
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        Bitmap bitmap;
        super.init(abstractC1247l, c1248m, z, list);
        Context applicationContext = getContext().getApplicationContext();
        m1094h();
        GuideToClickView guideToClickView = new GuideToClickView(applicationContext);
        this.f1828y = guideToClickView;
        addView(guideToClickView, -1, -1);
        List<Bitmap> list2 = this.f1793d;
        if (list2 == null || list2.size() <= 0 || (bitmap = this.f1793d.get(0)) == null || bitmap.isRecycled()) {
            return;
        }
        this.f1828y.setFingerImageResource(bitmap);
    }
}
