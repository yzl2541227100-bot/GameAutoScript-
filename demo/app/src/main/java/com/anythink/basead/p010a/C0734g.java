package com.anythink.basead.p010a;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.basead.p015c.C0744b;
import com.anythink.basead.p015c.C0751i;
import com.anythink.china.common.C1066a;
import com.anythink.core.common.C1300k;
import com.anythink.core.common.p055f.AbstractC1247l;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.basead.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0734g {

    /* JADX INFO: renamed from: b */
    private static volatile C0734g f590b;

    /* JADX INFO: renamed from: a */
    public C0733f f591a;

    /* JADX INFO: renamed from: c */
    private Context f592c;

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, AbstractC1247l> f593d = new ConcurrentHashMap<>();

    private C0734g(Context context) {
        this.f592c = context;
    }

    /* JADX INFO: renamed from: a */
    public static C0734g m256a(Context context) {
        if (f590b == null) {
            synchronized (C0734g.class) {
                if (f590b == null) {
                    f590b = new C0734g(context);
                }
            }
        }
        return f590b;
    }

    /* JADX INFO: renamed from: b */
    private void m257b() {
        if (this.f591a != null) {
            C1300k.m3741a(this.f592c).m3744a(this.f591a);
            this.f591a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m258a() {
        if (this.f592c != null && this.f591a == null) {
            this.f591a = new C0733f();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C1066a.f2357b);
            intentFilter.addAction(C1066a.f2358c);
            intentFilter.addAction(C1066a.f2359d);
            intentFilter.addAction(C1066a.f2360e);
            C1300k.m3741a(this.f592c).m3745a(this.f591a, intentFilter);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m259a(String str, AbstractC1247l abstractC1247l) {
        this.f593d.put(str, abstractC1247l);
    }

    /* JADX INFO: renamed from: a */
    public final void m260a(String str, String str2) {
        AbstractC1247l abstractC1247l = this.f593d.get(str);
        if (abstractC1247l != null) {
            C0751i c0751i = new C0751i("", "");
            C0744b c0744b = new C0744b();
            c0751i.f769i = c0744b;
            c0744b.f690a = str2;
            C0717a.m126a(18, abstractC1247l, c0751i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m261b(String str, String str2) {
        AbstractC1247l abstractC1247l = this.f593d.get(str);
        if (abstractC1247l != null) {
            C0751i c0751i = new C0751i("", "");
            C0744b c0744b = new C0744b();
            c0751i.f769i = c0744b;
            c0744b.f690a = str2;
            C0717a.m126a(19, abstractC1247l, c0751i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m262c(String str, String str2) {
        AbstractC1247l abstractC1247l = this.f593d.get(str);
        if (abstractC1247l != null) {
            C0751i c0751i = new C0751i("", "");
            C0744b c0744b = new C0744b();
            c0751i.f769i = c0744b;
            c0744b.f690a = str2;
            C0717a.m126a(20, abstractC1247l, c0751i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m263d(String str, String str2) {
        AbstractC1247l abstractC1247lRemove = this.f593d.remove(str);
        if (abstractC1247lRemove != null) {
            C0751i c0751i = new C0751i("", "");
            C0744b c0744b = new C0744b();
            c0751i.f769i = c0744b;
            c0744b.f690a = str2;
            C0717a.m126a(21, abstractC1247lRemove, c0751i);
        }
        if (this.f593d.size() != 0 || this.f591a == null) {
            return;
        }
        C1300k.m3741a(this.f592c).m3744a(this.f591a);
        this.f591a = null;
    }
}
