package com.anythink.expressad.widget;

import android.view.View;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import java.util.Calendar;

/* JADX INFO: renamed from: com.anythink.expressad.widget.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC2343a implements View.OnClickListener {

    /* JADX INFO: renamed from: d */
    public static final int f14722d = 2000;

    /* JADX INFO: renamed from: a */
    private long f14723a = 0;

    /* JADX INFO: renamed from: a */
    public abstract void mo11015a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f14723a > C1659a.f9130f) {
            this.f14723a = timeInMillis;
            mo11015a(view);
        }
    }
}
