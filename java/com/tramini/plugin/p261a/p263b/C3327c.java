package com.tramini.plugin.p261a.p263b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tramini.plugin.p261a.C3324b;
import com.tramini.plugin.p261a.C3328c;
import com.tramini.plugin.p261a.p263b.C3325a;
import com.tramini.plugin.p261a.p264c.C3331c;
import com.tramini.plugin.p261a.p266e.InterfaceC3338c;
import com.tramini.plugin.p261a.p269h.C3353b;
import com.tramini.plugin.p261a.p269h.C3357c;
import com.tramini.plugin.p261a.p269h.C3358d;
import com.tramini.plugin.p261a.p269h.C3360f;
import com.tramini.plugin.p261a.p269h.C3362h;
import com.tramini.plugin.p261a.p269h.C3363i;
import com.tramini.plugin.p261a.p269h.p271b.C3354a;
import com.tramini.plugin.p272b.C3366b;
import com.tramini.plugin.p272b.C3367c;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3327c {

    /* JADX INFO: renamed from: b */
    private static C3327c f18075b;

    /* JADX INFO: renamed from: c */
    private Context f18077c;

    /* JADX INFO: renamed from: e */
    private BroadcastReceiver f18079e;

    /* JADX INFO: renamed from: f */
    private BroadcastReceiver f18080f;

    /* JADX INFO: renamed from: g */
    private String[] f18081g;

    /* JADX INFO: renamed from: a */
    public boolean f18076a = false;

    /* JADX INFO: renamed from: d */
    private Handler f18078d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f18082a;

        public AnonymousClass1(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3331c c3331cM15176a = C3331c.m15176a(context);
            try {
                c3331cM15176a.m15170b().execSQL("DROP TABLE IF EXISTS 'il'");
                c3331cM15176a.m15170b().execSQL("DROP TABLE IF EXISTS 'il_all'");
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3366b f18084a;

        public AnonymousClass2(C3366b c3366b) {
            c3366b = c3366b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3353b.m15283a().m15288a(c3366b);
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f18086a;

        /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$3$1 */
        public class AnonymousClass1 implements InterfaceC3338c {
            public AnonymousClass1() {
            }

            @Override // com.tramini.plugin.p261a.p266e.InterfaceC3338c
            /* JADX INFO: renamed from: a */
            public final void mo15163a(C3366b c3366b) {
                C3327c.this.m15147b(c3366b);
            }
        }

        public AnonymousClass3(Context context) {
            context = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C3367c.m15382a(context).m15388a()) {
                C3367c.m15382a(context).m15387a(new InterfaceC3338c() { // from class: com.tramini.plugin.a.b.c.3.1
                    public AnonymousClass1() {
                    }

                    @Override // com.tramini.plugin.p261a.p266e.InterfaceC3338c
                    /* JADX INFO: renamed from: a */
                    public final void mo15163a(C3366b c3366b) {
                        C3327c.this.m15147b(c3366b);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3366b f18089a;

        public AnonymousClass4(C3366b c3366b) {
            c3366b = c3366b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int size;
            try {
                if (C3327c.this.f18077c == null) {
                    return;
                }
                try {
                    if (C3327c.this.f18079e != null) {
                        C3326b.m15136a(C3327c.this.f18077c).m15137a(C3327c.this.f18079e);
                        C3327c.this.f18079e = null;
                    }
                } catch (Throwable unused) {
                }
                C3327c.this.f18079e = new C3324b();
                IntentFilter intentFilter = new IntentFilter();
                C3366b c3366b = c3366b;
                List<String> listM15357e = c3366b != null ? c3366b.m15357e() : null;
                if (listM15357e != null && (size = listM15357e.size()) > 0) {
                    for (int i = 0; i < size; i++) {
                        intentFilter.addAction(listM15357e.get(i));
                    }
                }
                C3326b.m15136a(C3327c.this.f18077c).m15138a(C3327c.this.f18079e, intentFilter);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$5 */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18091a;

        public AnonymousClass5(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C3363i.m15321a(C3327c.this.f18077c, "tramini", C3325a.d.f18070c, "");
            C3357c.m15302c(str);
            C3327c c3327c = C3327c.this;
            C3327c.m15143a(c3327c, c3327c.f18077c);
        }
    }

    /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18093a;

        public AnonymousClass6(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C3358d.f18220a = new JSONObject(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3327c m15142a() {
        if (f18075b == null) {
            synchronized (C3327c.class) {
                f18075b = new C3327c();
            }
        }
        return f18075b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15143a(C3327c c3327c, Context context) {
        c3327c.m15147b(C3367c.m15382a(context).m15389b());
        c3327c.m15160b(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m15145a(Runnable runnable) {
        C3354a.m15289a().m15291a(runnable);
    }

    /* JADX INFO: renamed from: b */
    public void m15147b(C3366b c3366b) {
        m15148b(new Runnable() { // from class: com.tramini.plugin.a.b.c.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3366b f18089a;

            public AnonymousClass4(C3366b c3366b2) {
                c3366b = c3366b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int size;
                try {
                    if (C3327c.this.f18077c == null) {
                        return;
                    }
                    try {
                        if (C3327c.this.f18079e != null) {
                            C3326b.m15136a(C3327c.this.f18077c).m15137a(C3327c.this.f18079e);
                            C3327c.this.f18079e = null;
                        }
                    } catch (Throwable unused) {
                    }
                    C3327c.this.f18079e = new C3324b();
                    IntentFilter intentFilter = new IntentFilter();
                    C3366b c3366b2 = c3366b;
                    List<String> listM15357e = c3366b2 != null ? c3366b2.m15357e() : null;
                    if (listM15357e != null && (size = listM15357e.size()) > 0) {
                        for (int i = 0; i < size; i++) {
                            intentFilter.addAction(listM15357e.get(i));
                        }
                    }
                    C3326b.m15136a(C3327c.this.f18077c).m15138a(C3327c.this.f18079e, intentFilter);
                } catch (Throwable unused2) {
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m15148b(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f18078d.post(runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m15149b(Runnable runnable, long j) {
        C3354a.m15289a().m15292a(runnable, j);
    }

    /* JADX INFO: renamed from: c */
    private static void m15150c() {
    }

    /* JADX INFO: renamed from: c */
    private void m15151c(Context context) {
        this.f18077c = context;
    }

    /* JADX INFO: renamed from: c */
    private void m15152c(Runnable runnable) {
        this.f18078d.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: d */
    private void m15153d(Context context) {
        m15147b(C3367c.m15382a(context).m15389b());
        m15160b(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m15154a(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.f18077c = context.getApplicationContext();
            C3354a.m15289a().m15291a(new Runnable() { // from class: com.tramini.plugin.a.b.c.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f18082a;

                public AnonymousClass1(Context context2) {
                    context = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3331c c3331cM15176a = C3331c.m15176a(context);
                    try {
                        c3331cM15176a.m15170b().execSQL("DROP TABLE IF EXISTS 'il'");
                        c3331cM15176a.m15170b().execSQL("DROP TABLE IF EXISTS 'il_all'");
                    } catch (Throwable unused) {
                    }
                }
            });
            if (C3362h.m15315a(context2)) {
                return;
            }
            try {
                if (this.f18080f != null) {
                    C3326b.m15136a(this.f18077c).m15137a(this.f18080f);
                    this.f18080f = null;
                }
            } catch (Throwable unused) {
            }
            this.f18080f = new C3328c();
            IntentFilter intentFilter = new IntentFilter();
            String packageName = this.f18077c.getPackageName();
            intentFilter.addAction(C3360f.m15311a(packageName + packageName));
            C3326b.m15136a(this.f18077c).m15138a(this.f18080f, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m15155a(C3366b c3366b) {
        if (this.f18076a) {
            return;
        }
        if (c3366b != null) {
            this.f18076a = true;
            C3353b.m15283a().m15288a(c3366b);
            m15142a().m15156a(new Runnable() { // from class: com.tramini.plugin.a.b.c.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C3366b f18084a;

                public AnonymousClass2(C3366b c3366b2) {
                    c3366b = c3366b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3353b.m15283a().m15288a(c3366b);
                }
            }, 120000L);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15156a(Runnable runnable, long j) {
        this.f18078d.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: a */
    public final void m15157a(String[] strArr) {
        this.f18081g = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15158a(String str) {
        String[] strArr = this.f18081g;
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Context m15159b() {
        return this.f18077c;
    }

    /* JADX INFO: renamed from: b */
    public final void m15160b(Context context) {
        C3354a.m15289a().m15291a(new Runnable() { // from class: com.tramini.plugin.a.b.c.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f18086a;

            /* JADX INFO: renamed from: com.tramini.plugin.a.b.c$3$1 */
            public class AnonymousClass1 implements InterfaceC3338c {
                public AnonymousClass1() {
                }

                @Override // com.tramini.plugin.p261a.p266e.InterfaceC3338c
                /* JADX INFO: renamed from: a */
                public final void mo15163a(C3366b c3366b) {
                    C3327c.this.m15147b(c3366b);
                }
            }

            public AnonymousClass3(Context context2) {
                context = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C3367c.m15382a(context).m15388a()) {
                    C3367c.m15382a(context).m15387a(new InterfaceC3338c() { // from class: com.tramini.plugin.a.b.c.3.1
                        public AnonymousClass1() {
                        }

                        @Override // com.tramini.plugin.p261a.p266e.InterfaceC3338c
                        /* JADX INFO: renamed from: a */
                        public final void mo15163a(C3366b c3366b) {
                            C3327c.this.m15147b(c3366b);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m15161b(String str) {
        C3354a.m15289a().m15291a(new Runnable() { // from class: com.tramini.plugin.a.b.c.5

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f18091a;

            public AnonymousClass5(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3363i.m15321a(C3327c.this.f18077c, "tramini", C3325a.d.f18070c, "");
                C3357c.m15302c(str);
                C3327c c3327c = C3327c.this;
                C3327c.m15143a(c3327c, c3327c.f18077c);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m15162c(String str) {
        C3354a.m15289a().m15291a(new Runnable() { // from class: com.tramini.plugin.a.b.c.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f18093a;

            public AnonymousClass6(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C3358d.f18220a = new JSONObject(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
