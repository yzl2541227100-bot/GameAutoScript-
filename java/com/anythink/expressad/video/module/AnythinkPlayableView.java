package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import com.anythink.expressad.video.signal.factory.C2309b;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkPlayableView extends AnythinkH5EndCardView {
    public AnythinkPlayableView(Context context) {
        super(context);
    }

    public AnythinkPlayableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    /* JADX INFO: renamed from: a */
    public final String mo11313a() {
        return super.mo11313a();
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public void onBackPress() {
        super.onBackPress();
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        super.preLoadData(c2309b);
        super.setLoadPlayable(true);
    }
}
