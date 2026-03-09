package com.octopus.p222ad.internal;

import android.graphics.Rect;
import android.view.View;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.octopus.ad.internal.r */
/* JADX INFO: loaded from: classes2.dex */
public class C3132r {

    /* JADX INFO: renamed from: b */
    private View f17409b;

    /* JADX INFO: renamed from: d */
    private Runnable f17411d;

    /* JADX INFO: renamed from: e */
    private ScheduledExecutorService f17412e;

    /* JADX INFO: renamed from: a */
    private boolean f17408a = false;

    /* JADX INFO: renamed from: c */
    private ArrayList<a> f17410c = new ArrayList<>();

    /* JADX INFO: renamed from: com.octopus.ad.internal.r$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo14424a(boolean z);
    }

    private C3132r(View view) {
        this.f17409b = view;
        m14603b();
    }

    /* JADX INFO: renamed from: a */
    public static C3132r m14597a(View view) {
        if (view != null) {
            return new C3132r(view);
        }
        HaoboLog.m14607d(HaoboLog.nativeLogTag, "Unable to check visibility");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public View m14601a() {
        return this.f17409b;
    }

    /* JADX INFO: renamed from: a */
    public void m14602a(a aVar) {
        if (aVar != null) {
            this.f17410c.add(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14603b() {
        if (this.f17408a) {
            return;
        }
        this.f17408a = true;
        this.f17411d = new Runnable() { // from class: com.octopus.ad.internal.r.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3132r.this.f17410c != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = C3132r.this.f17410c.iterator();
                    while (it.hasNext()) {
                        arrayList.add((a) it.next());
                    }
                    boolean zM14605c = C3132r.this.m14605c();
                    Iterator it2 = arrayList.iterator();
                    if (zM14605c) {
                        while (it2.hasNext()) {
                            ((a) it2.next()).mo14424a(true);
                        }
                    } else {
                        while (it2.hasNext()) {
                            ((a) it2.next()).mo14424a(false);
                        }
                    }
                }
            }
        };
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f17412e = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.octopus.ad.internal.r.2
            @Override // java.lang.Runnable
            public void run() {
                C3132r.this.f17409b.post(C3132r.this.f17411d);
            }
        }, 0L, 250L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public boolean m14604b(a aVar) {
        return this.f17410c.remove(aVar);
    }

    /* JADX INFO: renamed from: c */
    public boolean m14605c() {
        View view = this.f17409b;
        if (view == null || view.getVisibility() != 0 || this.f17409b.getParent() == null) {
            return false;
        }
        Rect rect = new Rect();
        if (!this.f17409b.getGlobalVisibleRect(rect)) {
            return false;
        }
        int iHeight = rect.height() * rect.width();
        int height = this.f17409b.getHeight() * this.f17409b.getWidth();
        return height > 0 && iHeight * 100 >= height * 50;
    }

    /* JADX INFO: renamed from: d */
    public void m14606d() {
        ScheduledExecutorService scheduledExecutorService = this.f17412e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        View view = this.f17409b;
        if (view != null) {
            view.removeCallbacks(this.f17411d);
            this.f17409b = null;
        }
        this.f17410c = null;
    }
}
