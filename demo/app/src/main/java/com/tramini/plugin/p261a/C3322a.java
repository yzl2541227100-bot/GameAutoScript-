package com.tramini.plugin.p261a;

import android.text.TextUtils;
import com.tramini.plugin.p261a.p263b.C3325a;
import com.tramini.plugin.p261a.p263b.C3327c;
import com.tramini.plugin.p272b.C3366b;
import com.tramini.plugin.p272b.C3367c;

/* JADX INFO: renamed from: com.tramini.plugin.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3322a {

    /* JADX INFO: renamed from: a */
    private static volatile C3322a f18042a;

    private C3322a() {
    }

    /* JADX INFO: renamed from: a */
    public static C3322a m15128a() {
        if (f18042a == null) {
            synchronized (C3322a.class) {
                if (f18042a == null) {
                    f18042a = new C3322a();
                }
            }
        }
        return f18042a;
    }

    /* JADX INFO: renamed from: a */
    private static String m15129a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m15130b() {
        C3366b c3366bM15386b = C3367c.m15386b(C3327c.m15142a().m15159b());
        return c3366bM15386b != null ? m15129a(c3366bM15386b.m15367o(), C3325a.a.f18061b) : C3325a.a.f18061b;
    }

    /* JADX INFO: renamed from: c */
    public static String m15131c() {
        C3366b c3366bM15386b = C3367c.m15386b(C3327c.m15142a().m15159b());
        return c3366bM15386b != null ? m15129a(c3366bM15386b.m15368p(), C3325a.a.f18062c) : C3325a.a.f18062c;
    }
}
