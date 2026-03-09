package com.anythink.basead.p025ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.picverify.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1023a {

    /* JADX INFO: renamed from: a */
    public Context f2205a;

    public AbstractC1023a(Context context) {
        this.f2205a = context;
    }

    /* JADX INFO: renamed from: c */
    private Context m1302c() {
        return this.f2205a;
    }

    /* JADX INFO: renamed from: a */
    public abstract Paint mo1303a();

    /* JADX INFO: renamed from: a */
    public abstract Path mo1304a(int i);

    /* JADX INFO: renamed from: a */
    public abstract C1025c mo1305a(int i, int i2, int i3);

    /* JADX INFO: renamed from: a */
    public void mo1306a(Context context, Canvas canvas, Path path) {
    }

    /* JADX INFO: renamed from: b */
    public abstract Paint mo1307b();

    /* JADX INFO: renamed from: b */
    public C1025c mo1308b(int i, int i2, int i3) {
        return mo1305a(i, i2, i3);
    }
}
