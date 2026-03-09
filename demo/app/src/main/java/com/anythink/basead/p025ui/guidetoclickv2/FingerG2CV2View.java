package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.anythink.basead.p025ui.GuideToClickView;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;

/* JADX INFO: loaded from: classes.dex */
public class FingerG2CV2View extends BaseG2CV2View {

    /* JADX INFO: renamed from: c */
    public GuideToClickView f2072c;

    /* JADX INFO: renamed from: d */
    public int f2073d;

    public FingerG2CV2View(Context context) {
        super(context);
        this.f2073d = 501;
    }

    @Override // com.anythink.basead.p025ui.guidetoclickv2.BaseG2CV2View
    /* JADX INFO: renamed from: a */
    public final void mo1223a(int i, int i2) {
        setGravity(17);
        GuideToClickView guideToClickView = new GuideToClickView(getContext());
        this.f2072c = guideToClickView;
        guideToClickView.setFingerViewMode(this.f2073d);
        addView(this.f2072c, -2, -2);
        setClipChildren(false);
        if (this.f2057b != null) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.guidetoclickv2.FingerG2CV2View.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC0989b.a aVar = FingerG2CV2View.this.f2057b;
                    if (aVar != null) {
                        aVar.mo534a(11, 20);
                    }
                }
            });
        }
    }

    public void setFingerViewMode(int i) {
        if (i == 503) {
            setBackgroundColor(Color.parseColor("#66000000"));
        }
        this.f2073d = i;
        GuideToClickView guideToClickView = this.f2072c;
        if (guideToClickView != null) {
            guideToClickView.setFingerViewMode(i);
        }
    }
}
