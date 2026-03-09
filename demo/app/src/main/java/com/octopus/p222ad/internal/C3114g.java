package com.octopus.p222ad.internal;

import android.graphics.Rect;
import android.view.View;
import com.octopus.p222ad.internal.nativead.NativeAdShownListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.octopus.ad.internal.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3114g {

    /* JADX INFO: renamed from: a */
    private View f17139a;

    /* JADX INFO: renamed from: b */
    private NativeAdShownListener f17140b;

    /* JADX INFO: renamed from: c */
    private ScheduledExecutorService f17141c;

    /* JADX INFO: renamed from: d */
    private Runnable f17142d;

    /* JADX INFO: renamed from: e */
    private Format f17143e = new DecimalFormat("0.00");

    public C3114g(View view, NativeAdShownListener nativeAdShownListener) {
        this.f17139a = view;
        this.f17140b = nativeAdShownListener;
        m14414a();
    }

    /* JADX INFO: renamed from: a */
    public static C3114g m14411a(View view, NativeAdShownListener nativeAdShownListener) {
        if (view == null) {
            return null;
        }
        return new C3114g(view, nativeAdShownListener);
    }

    /* JADX INFO: renamed from: a */
    private void m14414a() {
        this.f17142d = new Runnable() { // from class: com.octopus.ad.internal.g.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3114g.this.m14417b()) {
                    if (C3114g.this.f17140b != null) {
                        C3114g.this.f17140b.onAdShown();
                    }
                    if (C3114g.this.f17141c != null) {
                        C3114g.this.f17141c.shutdownNow();
                    }
                    C3114g.this.f17140b = null;
                    C3114g.this.f17139a = null;
                    C3114g.this.f17141c = null;
                }
            }
        };
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f17141c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.octopus.ad.internal.g.2
            @Override // java.lang.Runnable
            public void run() {
                if (C3114g.this.f17139a != null) {
                    C3114g.this.f17139a.post(C3114g.this.f17142d);
                }
            }
        }, 0L, 250L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m14417b() {
        int i;
        View view = this.f17139a;
        if (view == null || view.getVisibility() != 0 || this.f17139a.getParent() == null) {
            return false;
        }
        Rect rect = new Rect();
        this.f17139a.getLocalVisibleRect(rect);
        return (rect.left == 0 && rect.top >= 0 && rect.bottom <= this.f17139a.getHeight() && ((double) Float.parseFloat(this.f17143e.format(Double.valueOf((((double) ((rect.bottom - rect.top) * rect.right)) * 1.0d) / ((double) (this.f17139a.getWidth() * this.f17139a.getHeight())))))) > 0.5d) || (rect.left > 0 && (i = rect.right) >= 0 && i <= this.f17139a.getWidth() && ((double) Float.parseFloat(this.f17143e.format(Double.valueOf((((double) ((rect.right - rect.left) * (rect.bottom - rect.top))) * 1.0d) / ((double) (this.f17139a.getWidth() * this.f17139a.getHeight())))))) > 0.5d);
    }
}
