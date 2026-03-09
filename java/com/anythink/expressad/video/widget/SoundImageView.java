package com.anythink.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class SoundImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private boolean f14348a;

    public SoundImageView(Context context) {
        super(context);
        this.f14348a = true;
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14348a = true;
    }

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14348a = true;
    }

    public boolean getStatus() {
        return this.f14348a;
    }

    public void setSoundStatus(boolean z) {
        Context context;
        String str;
        this.f14348a = z;
        if (z) {
            context = getContext();
            str = "anythink_reward_sound_open";
        } else {
            context = getContext();
            str = "anythink_reward_sound_close";
        }
        setImageResource(C1875i.m9684a(context, str, C1875i.f11528c));
    }
}
