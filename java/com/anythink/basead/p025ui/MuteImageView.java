package com.anythink.basead.p025ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class MuteImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private boolean f1541a;

    public MuteImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1541a = false;
    }

    public void setMute(boolean z) {
        setSelected(z);
    }
}
