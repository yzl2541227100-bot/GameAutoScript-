package com.anythink.core.common.p066o.p067a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.o.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C1332f {

    /* JADX INFO: renamed from: c */
    private static String f5146c = "f";

    /* JADX INFO: renamed from: a */
    public final int f5147a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserver.OnPreDrawListener f5148b;

    /* JADX INFO: renamed from: d */
    private int f5149d;

    /* JADX INFO: renamed from: e */
    private final ArrayList<View> f5150e;

    /* JADX INFO: renamed from: f */
    private long f5151f;

    /* JADX INFO: renamed from: g */
    private final Map<View, a> f5152g;

    /* JADX INFO: renamed from: h */
    private final b f5153h;

    /* JADX INFO: renamed from: i */
    private d f5154i;

    /* JADX INFO: renamed from: j */
    private final c f5155j;

    /* JADX INFO: renamed from: k */
    private final Handler f5156k;

    /* JADX INFO: renamed from: l */
    private boolean f5157l;

    /* JADX INFO: renamed from: com.anythink.core.common.o.a.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f5159a;

        /* JADX INFO: renamed from: b */
        public int f5160b;

        /* JADX INFO: renamed from: c */
        public long f5161c;

        /* JADX INFO: renamed from: d */
        public View f5162d;

        /* JADX INFO: renamed from: e */
        public Integer f5163e;
    }

    /* JADX INFO: renamed from: com.anythink.core.common.o.a.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Rect f5164a = new Rect();

        /* JADX INFO: renamed from: a */
        private static boolean m3986a(long j, int i) {
            return SystemClock.uptimeMillis() - j >= ((long) i);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m3987a(View view, View view2, int i, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() == null || view2.getWindowVisibility() != 0 || !view2.isShown() || !view2.getGlobalVisibleRect(this.f5164a)) {
                        return false;
                    }
                    long jHeight = ((long) this.f5164a.height()) * ((long) this.f5164a.width());
                    long height = ((long) view2.getHeight()) * ((long) view2.getWidth());
                    if (height <= 0) {
                        return false;
                    }
                    return (num == null || num.intValue() <= 0) ? jHeight * 100 >= ((long) i) * height : jHeight >= ((long) num.intValue());
                } catch (Throwable th) {
                    Log.e(C1332f.f5146c, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.o.a.f$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: c */
        private final ArrayList<View> f5167c = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        private final ArrayList<View> f5166b = new ArrayList<>();

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : C1332f.this.f5152g.entrySet()) {
                View view = (View) entry.getKey();
                int i = ((a) entry.getValue()).f5159a;
                int i2 = ((a) entry.getValue()).f5160b;
                Integer num = ((a) entry.getValue()).f5163e;
                View view2 = ((a) entry.getValue()).f5162d;
                if (C1332f.this.f5153h.m3987a(view2, view, i, num)) {
                    this.f5166b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(C1332f.this.f5148b);
                    } catch (Throwable unused) {
                    }
                } else if (!C1332f.this.f5153h.m3987a(view2, view, i2, null)) {
                    this.f5167c.add(view);
                }
            }
            if (C1332f.this.f5154i != null) {
                C1332f.this.f5154i.mo3966a(this.f5166b);
            }
            this.f5166b.clear();
            this.f5167c.clear();
            C1332f.m3979d(C1332f.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.o.a.f$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo3966a(List<View> list);
    }

    public C1332f() {
        this(new WeakHashMap(10), new b(), new Handler(Looper.getMainLooper()));
    }

    public C1332f(int i) {
        this(new WeakHashMap(10), new b(), new Handler(Looper.getMainLooper()));
        this.f5149d = i;
    }

    private C1332f(Map<View, a> map, b bVar, Handler handler) {
        this.f5149d = 100;
        this.f5147a = 50;
        this.f5151f = 0L;
        this.f5152g = map;
        this.f5153h = bVar;
        this.f5156k = handler;
        this.f5155j = new c();
        this.f5150e = new ArrayList<>(50);
        this.f5148b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.o.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C1332f.this.m3985c();
                return true;
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private void m3972a(long j) {
        for (Map.Entry<View, a> entry : this.f5152g.entrySet()) {
            if (entry.getValue().f5161c < j) {
                this.f5150e.add(entry.getKey());
            }
        }
        Iterator<View> it = this.f5150e.iterator();
        while (it.hasNext()) {
            m3981a(it.next());
        }
        this.f5150e.clear();
    }

    /* JADX INFO: renamed from: a */
    private void m3973a(View view, int i, Integer num) {
        m3982a(view, view, i, i, num);
    }

    /* JADX INFO: renamed from: a */
    private void m3974a(View view, View view2, int i, Integer num) {
        m3982a(view, view2, i, i, num);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m3975a(Context context, View view) {
        View rootView;
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
            viewFindViewById = rootView;
        }
        if (viewFindViewById2 == null) {
            viewFindViewById2 = viewFindViewById;
        }
        return viewFindViewById2 != null && viewFindViewById2.getViewTreeObserver().isAlive();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m3979d(C1332f c1332f) {
        c1332f.f5157l = false;
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3980a() {
        this.f5152g.clear();
        this.f5156k.removeMessages(0);
        this.f5157l = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3981a(View view) {
        this.f5152g.remove(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m3982a(View view, View view2, int i, int i2, Integer num) {
        try {
            if (m3975a(view2.getContext(), view2)) {
                a aVar = this.f5152g.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.f5152g.put(view2, aVar);
                    m3985c();
                }
                int iMin = Math.min(i2, i);
                aVar.f5162d = view;
                aVar.f5159a = i;
                aVar.f5160b = iMin;
                aVar.f5161c = this.f5151f;
                aVar.f5163e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.f5148b);
                long j = this.f5151f + 1;
                this.f5151f = j;
                if (j % 50 == 0) {
                    m3972a(j - 50);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3983a(d dVar) {
        this.f5154i = dVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m3984b() {
        m3980a();
        this.f5154i = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3985c() {
        if (this.f5157l) {
            return;
        }
        this.f5157l = true;
        this.f5156k.postDelayed(this.f5155j, this.f5149d);
    }
}
