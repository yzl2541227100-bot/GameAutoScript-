package com.octopus.p222ad.utils.p229a;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.octopus.p222ad.Octopus;
import com.octopus.p222ad.internal.utilities.SPUtils;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3226b {

    /* JADX INFO: renamed from: a */
    private static volatile boolean f17839a;

    /* JADX INFO: renamed from: b */
    private static volatile String f17840b;

    /* JADX INFO: renamed from: c */
    private static volatile String f17841c;

    /* JADX INFO: renamed from: d */
    private static volatile String f17842d;

    /* JADX INFO: renamed from: e */
    private static volatile String f17843e;

    /* JADX INFO: renamed from: f */
    private static volatile String f17844f;

    /* JADX INFO: renamed from: g */
    private static volatile String f17845g;

    /* JADX INFO: renamed from: h */
    private static volatile String f17846h;

    /* JADX INFO: renamed from: i */
    private static volatile String f17847i;

    private C3226b() {
    }

    /* JADX INFO: renamed from: a */
    public static String m14910a() {
        if (TextUtils.isEmpty(f17840b)) {
            synchronized (C3226b.class) {
                if (TextUtils.isEmpty(f17840b)) {
                    f17840b = C3216a.m14838b();
                }
            }
        }
        if (f17840b == null) {
            f17840b = "";
        }
        return f17840b;
    }

    /* JADX INFO: renamed from: a */
    public static String m14911a(Context context) {
        if (Octopus.getCustomController() != null && !Octopus.getCustomController().isCanUsePhoneState()) {
            f17841c = Octopus.getCustomController().getImei();
        } else if (f17841c == null) {
            synchronized (C3226b.class) {
                if (f17841c == null) {
                    f17841c = C3216a.m14832a(context);
                }
            }
        }
        if (f17841c == null) {
            f17841c = "";
        }
        return f17841c;
    }

    /* JADX INFO: renamed from: a */
    public static void m14913a(Application application) {
        if (f17839a) {
            return;
        }
        synchronized (C3226b.class) {
            if (!f17839a) {
                C3216a.m14835a(application);
                f17839a = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m14914b(Context context) {
        f17842d = SPUtils.getString(context, "oaid");
        if (TextUtils.isEmpty(f17842d)) {
            synchronized (C3226b.class) {
                if (TextUtils.isEmpty(f17842d)) {
                    f17842d = C3216a.m14842c();
                    if (TextUtils.isEmpty(f17842d)) {
                        C3216a.m14836a(context, new InterfaceC3244c() { // from class: com.octopus.ad.utils.a.b.1
                            @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
                            /* JADX INFO: renamed from: a */
                            public void mo14853a(Exception exc) {
                                String unused = C3226b.f17842d = C3226b.m14910a();
                            }

                            @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
                            /* JADX INFO: renamed from: a */
                            public void mo14854a(String str) {
                                String unused = C3226b.f17842d = str;
                            }
                        });
                    }
                }
            }
            if (f17842d == null) {
                f17842d = "";
            } else {
                SPUtils.put(context, "oaid", f17842d);
            }
        }
        C3247f.m14936b("Oaid is: " + f17842d);
        return f17842d;
    }

    /* JADX INFO: renamed from: c */
    public static String m14916c(final Context context) {
        f17847i = SPUtils.getString(context, "gaid");
        if (TextUtils.isEmpty(f17847i)) {
            synchronized (C3226b.class) {
                if (TextUtils.isEmpty(f17847i)) {
                    f17847i = C3216a.m14845d();
                    if (TextUtils.isEmpty(f17847i)) {
                        C3216a.m14836a(context, new InterfaceC3244c() { // from class: com.octopus.ad.utils.a.b.2
                            @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
                            /* JADX INFO: renamed from: a */
                            public void mo14853a(Exception exc) {
                                String unused = C3226b.f17847i = C3226b.m14918e(context);
                            }

                            @Override // com.octopus.p222ad.utils.p229a.InterfaceC3244c
                            /* JADX INFO: renamed from: a */
                            public void mo14854a(String str) {
                                String unused = C3226b.f17847i = str;
                            }
                        });
                    }
                }
            }
            if (f17847i == null) {
                f17847i = "";
            } else {
                SPUtils.put(context, "gaid", f17847i);
            }
        }
        C3247f.m14936b("Gaid is: " + f17847i);
        return f17847i;
    }

    /* JADX INFO: renamed from: d */
    public static String m14917d(Context context) {
        if (f17843e == null) {
            synchronized (C3226b.class) {
                if (f17843e == null) {
                    f17843e = C3216a.m14839b(context);
                }
            }
        }
        if (f17843e == null) {
            f17843e = "";
        }
        return f17843e;
    }

    /* JADX INFO: renamed from: e */
    public static String m14918e(Context context) {
        if (f17846h == null) {
            synchronized (C3226b.class) {
                if (f17846h == null) {
                    f17846h = C3216a.m14843c(context);
                }
            }
        }
        if (f17846h == null) {
            f17846h = "";
        }
        return f17846h;
    }
}
