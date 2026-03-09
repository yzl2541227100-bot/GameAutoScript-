package com.anythink.expressad.foundation.p118f;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.p119a.C1799a;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.p182a.DialogC2346c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1800b {

    /* JADX INFO: renamed from: a */
    public static int f10956a = -2;

    /* JADX INFO: renamed from: b */
    public static int f10957b = -2;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f10958c;

    /* JADX INFO: renamed from: d */
    private final ConcurrentHashMap<String, C1799a> f10959d;

    /* JADX INFO: renamed from: e */
    private final RelativeLayout.LayoutParams f10960e;

    /* JADX INFO: renamed from: f */
    private C1483a f10961f;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.f.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C1800b f10962a = new C1800b(0);
    }

    private C1800b() {
        this.f10959d = new ConcurrentHashMap<>();
        this.f10960e = new RelativeLayout.LayoutParams(f10956a, f10957b);
    }

    public /* synthetic */ C1800b(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static Activity m9366a(Context context) {
        int i = Build.VERSION.SDK_INT;
        Context contextM8560h = C1773a.m8548c().m8560h();
        Activity activity = null;
        try {
            Activity activity2 = contextM8560h instanceof Activity ? (Activity) contextM8560h : null;
            try {
                if ((context instanceof Activity) && (i < 17 || !((Activity) context).isDestroyed())) {
                    activity2 = (Activity) context;
                }
                if (activity2 == null || activity2.isFinishing()) {
                    return null;
                }
                if (i >= 17) {
                    if (activity2.isDestroyed()) {
                        return null;
                    }
                }
                return activity2;
            } catch (Exception e) {
                e = e;
                activity = activity2;
                e.printStackTrace();
                return activity;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1800b m9367a() {
        return a.f10962a;
    }

    /* JADX INFO: renamed from: a */
    private void m9368a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3) {
        C1799a c1799aM9376a = m9376a(str);
        Context contextM2148f = C1175n.m2059a().m2148f();
        c1799aM9376a.m9352a(C1886t.m9834b(contextM2148f, f), C1886t.m9834b(contextM2148f, f2), C1886t.m9834b(contextM2148f, i), C1886t.m9834b(contextM2148f, i2), C1886t.m9834b(contextM2148f, i3), f3, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    private void m9369a(String str, int i, ViewGroup viewGroup) {
        C1799a c1799aM9376a = m9376a(str);
        if (c1799aM9376a.m9358c() != null) {
            c1799aM9376a.m9351a(i);
            if (i == 0) {
                m9378a(str, C1175n.m2059a().m2148f(), viewGroup, null, null);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9370a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        m9378a(str, context, viewGroup, layoutParams, null);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9371a(Context context, DialogC2346c dialogC2346c) {
        if (dialogC2346c == null) {
            return false;
        }
        return m9372b(context, dialogC2346c);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9372b(Context context, DialogC2346c dialogC2346c) {
        Activity activityM9366a = m9366a(context);
        if (activityM9366a == null || dialogC2346c == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 17 && activityM9366a.isDestroyed()) {
            return false;
        }
        try {
            if (dialogC2346c.isShowing() || activityM9366a.isFinishing()) {
                return false;
            }
            dialogC2346c.show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9373c(String str, int i) {
        C1799a c1799aM9376a = m9376a(str);
        if (i == 1) {
            c1799aM9376a.m9356b();
        } else {
            c1799aM9376a.m9350a();
        }
    }

    /* JADX INFO: renamed from: d */
    private C1799a m9374d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C1773a.m8548c().m8558f();
        }
        if (this.f10959d.containsKey(str)) {
            return this.f10959d.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private void m9375e(String str) {
        m9376a(str).m9361e();
    }

    /* JADX INFO: renamed from: a */
    public final C1799a m9376a(String str) {
        C1799a c1799a;
        if (TextUtils.isEmpty(str)) {
            str = C1773a.m8548c().m8558f();
        }
        if (this.f10959d.containsKey(str)) {
            c1799a = this.f10959d.get(str);
        } else {
            c1799a = new C1799a(str);
            this.f10959d.put(str, c1799a);
        }
        if (c1799a != null) {
            return c1799a;
        }
        C1799a c1799a2 = new C1799a(str);
        this.f10959d.put(str, c1799a2);
        return c1799a2;
    }

    /* JADX INFO: renamed from: a */
    public final void m9377a(String str, int i) {
        m9376a(str).m9357b(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m9378a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, InterfaceC1798a interfaceC1798a) {
        if (m9384b()) {
            C1799a c1799aM9376a = m9376a(str);
            if (interfaceC1798a != null) {
                c1799aM9376a.m9354a(new C1799a.a(str, interfaceC1798a));
            }
            FeedBackButton feedBackButtonM9358c = c1799aM9376a.m9358c();
            if (feedBackButtonM9358c != null) {
                if (layoutParams == null) {
                    int iM9834b = C1886t.m9834b(C1175n.m2059a().m2148f(), 10.0f);
                    this.f10960e.setMargins(iM9834b, iM9834b, iM9834b, iM9834b);
                    layoutParams = this.f10960e;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonM9358c.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonM9358c);
                }
                Activity activityM9366a = m9366a(context);
                if (activityM9366a != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityM9366a.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonM9358c);
                    viewGroup.addView(feedBackButtonM9358c, layoutParams);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9379a(String str, C1781c c1781c) {
        m9376a(str).m9353a(c1781c);
    }

    /* JADX INFO: renamed from: a */
    public final void m9380a(String str, InterfaceC1798a interfaceC1798a) {
        m9376a(str).m9354a(new C1799a.a(str, interfaceC1798a));
    }

    /* JADX INFO: renamed from: a */
    public final void m9381a(String str, FeedBackButton feedBackButton) {
        m9376a(str).m9355a(feedBackButton);
    }

    /* JADX INFO: renamed from: b */
    public final FeedBackButton m9382b(String str) {
        return m9376a(str).m9358c();
    }

    /* JADX INFO: renamed from: b */
    public final void m9383b(String str, int i) {
        m9376a(str).m9359c(i);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9384b() {
        C1486b.m6002a();
        C1483a c1483aM6010c = C1486b.m6010c();
        this.f10961f = c1483aM6010c;
        return c1483aM6010c.m5937K() != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m9385c(String str) {
        try {
            String strM8558f = TextUtils.isEmpty(str) ? C1773a.m8548c().m8558f() : str;
            C1799a c1799a = this.f10959d.containsKey(strM8558f) ? this.f10959d.get(strM8558f) : null;
            if (c1799a != null) {
                c1799a.m9360d();
            }
            this.f10959d.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
