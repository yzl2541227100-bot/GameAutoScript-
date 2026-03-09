package com.anythink.expressad.foundation.webview;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1898a {

    /* JADX INFO: renamed from: a */
    public static final int f11691a = 4;

    /* JADX INFO: renamed from: b */
    public static final int f11692b = 5;

    /* JADX INFO: renamed from: c */
    public static final int f11693c = 6;

    /* JADX INFO: renamed from: d */
    public static final int f11694d = 7;

    /* JADX INFO: renamed from: e */
    public static final int f11695e = 8;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.webview.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m9891a();

        /* JADX INFO: renamed from: b */
        void m9892b();
    }

    Drawable getBackground();

    ViewGroup.LayoutParams getLayoutParams();

    float getProgress();

    int getVisibility();

    void initResource(boolean z);

    void onThemeChange();

    void setBackgroundColor(int i);

    void setBackgroundDrawable(Drawable drawable);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPaused(boolean z);

    void setProgress(float f, boolean z);

    void setProgressBarListener(a aVar);

    void setProgressState(int i);

    void setVisibility(int i);

    void setVisible(boolean z);

    void startEndAnimation();
}
