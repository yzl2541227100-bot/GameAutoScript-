package com.tramini.plugin.p272b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tramini.plugin.p261a.p263b.C3325a;
import com.tramini.plugin.p261a.p263b.C3327c;
import com.tramini.plugin.p261a.p266e.C3339d;
import com.tramini.plugin.p261a.p266e.InterfaceC3337b;
import com.tramini.plugin.p261a.p266e.InterfaceC3338c;
import com.tramini.plugin.p261a.p268g.C3350a;
import com.tramini.plugin.p261a.p269h.C3357c;
import com.tramini.plugin.p261a.p269h.C3361g;
import com.tramini.plugin.p261a.p269h.C3363i;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3367c {

    /* JADX INFO: renamed from: a */
    public static final String f18263a = "c";

    /* JADX INFO: renamed from: b */
    private static volatile C3367c f18264b;

    /* JADX INFO: renamed from: c */
    private static C3366b f18265c;

    /* JADX INFO: renamed from: d */
    private Context f18266d;

    /* JADX INFO: renamed from: f */
    private long f18268f = -1;

    /* JADX INFO: renamed from: e */
    private boolean f18267e = false;

    /* JADX INFO: renamed from: com.tramini.plugin.b.c$1 */
    public class AnonymousClass1 implements InterfaceC3337b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC3338c f18269a;

        public AnonymousClass1(InterfaceC3338c interfaceC3338c) {
            interfaceC3338c = interfaceC3338c;
        }

        @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
        /* JADX INFO: renamed from: a */
        public final void mo15198a() {
            C3367c.this.f18267e = true;
        }

        @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
        /* JADX INFO: renamed from: a */
        public final void mo15199a(Object obj) {
            C3367c.this.f18267e = false;
            if (obj != null) {
                String string = obj.toString();
                C3366b c3366bM15389b = C3367c.this.m15389b();
                if (c3366bM15389b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(C3357c.m15298a(string));
                        c3366bM15389b.m15328a(jSONObject);
                        string = C3357c.m15301b(jSONObject.toString());
                    } catch (Throwable unused) {
                    }
                }
                C3363i.m15321a(C3367c.this.f18266d, "tramini", C3325a.d.f18068a, string);
                C3367c.this.f18268f = System.currentTimeMillis();
                Context context = C3367c.this.f18266d;
                long j = C3367c.this.f18268f;
                if (context != null) {
                    try {
                        SharedPreferences.Editor editorEdit = context.getSharedPreferences("tramini", 0).edit();
                        editorEdit.putLong(C3325a.d.f18069b, j);
                        editorEdit.apply();
                    } catch (Error | Exception unused2) {
                    }
                }
                C3366b c3366bM15332a = C3366b.m15332a(C3357c.m15298a(string));
                if (c3366bM15332a != null) {
                    C3366b unused3 = C3367c.f18265c = c3366bM15332a;
                    C3350a.m15276a().m15279a(C3361g.m15313a(c3366bM15332a), c3366bM15332a.m15355c());
                    C3327c.m15142a().m15155a(c3366bM15332a);
                    InterfaceC3338c interfaceC3338c = interfaceC3338c;
                    if (interfaceC3338c != null) {
                        interfaceC3338c.mo15163a(c3366bM15332a);
                    }
                }
            }
        }

        @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
        /* JADX INFO: renamed from: b */
        public final void mo15200b() {
            C3367c.this.f18267e = false;
        }
    }

    private C3367c(Context context) {
        this.f18266d = context;
    }

    /* JADX INFO: renamed from: a */
    public static C3367c m15382a(Context context) {
        if (f18264b == null) {
            synchronized (C3367c.class) {
                if (f18264b == null) {
                    f18264b = new C3367c(context);
                }
            }
        }
        return f18264b;
    }

    /* JADX INFO: renamed from: a */
    private void m15383a(InterfaceC3337b interfaceC3337b) {
        if (this.f18267e || TextUtils.isEmpty(C3357c.f18213a)) {
            return;
        }
        new C3339d().m15186a(0, interfaceC3337b);
    }

    /* JADX INFO: renamed from: b */
    public static C3366b m15386b(Context context) {
        String strM15323b = C3363i.m15323b(context, "tramini", C3325a.d.f18068a, "");
        if (TextUtils.isEmpty(strM15323b)) {
            return null;
        }
        return C3366b.m15332a(C3357c.m15298a(strM15323b));
    }

    /* JADX INFO: renamed from: a */
    public final void m15387a(InterfaceC3338c interfaceC3338c) {
        AnonymousClass1 anonymousClass1 = new InterfaceC3337b() { // from class: com.tramini.plugin.b.c.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC3338c f18269a;

            public AnonymousClass1(InterfaceC3338c interfaceC3338c2) {
                interfaceC3338c = interfaceC3338c2;
            }

            @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
            /* JADX INFO: renamed from: a */
            public final void mo15198a() {
                C3367c.this.f18267e = true;
            }

            @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
            /* JADX INFO: renamed from: a */
            public final void mo15199a(Object obj) {
                C3367c.this.f18267e = false;
                if (obj != null) {
                    String string = obj.toString();
                    C3366b c3366bM15389b = C3367c.this.m15389b();
                    if (c3366bM15389b != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(C3357c.m15298a(string));
                            c3366bM15389b.m15328a(jSONObject);
                            string = C3357c.m15301b(jSONObject.toString());
                        } catch (Throwable unused) {
                        }
                    }
                    C3363i.m15321a(C3367c.this.f18266d, "tramini", C3325a.d.f18068a, string);
                    C3367c.this.f18268f = System.currentTimeMillis();
                    Context context = C3367c.this.f18266d;
                    long j = C3367c.this.f18268f;
                    if (context != null) {
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("tramini", 0).edit();
                            editorEdit.putLong(C3325a.d.f18069b, j);
                            editorEdit.apply();
                        } catch (Error | Exception unused2) {
                        }
                    }
                    C3366b c3366bM15332a = C3366b.m15332a(C3357c.m15298a(string));
                    if (c3366bM15332a != null) {
                        C3366b unused3 = C3367c.f18265c = c3366bM15332a;
                        C3350a.m15276a().m15279a(C3361g.m15313a(c3366bM15332a), c3366bM15332a.m15355c());
                        C3327c.m15142a().m15155a(c3366bM15332a);
                        InterfaceC3338c interfaceC3338c2 = interfaceC3338c;
                        if (interfaceC3338c2 != null) {
                            interfaceC3338c2.mo15163a(c3366bM15332a);
                        }
                    }
                }
            }

            @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
            /* JADX INFO: renamed from: b */
            public final void mo15200b() {
                C3367c.this.f18267e = false;
            }
        };
        if (this.f18267e || TextUtils.isEmpty(C3357c.f18213a)) {
            return;
        }
        new C3339d().m15186a(0, anonymousClass1);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15388a() {
        if (this.f18268f <= 0) {
            this.f18268f = C3363i.m15317a(this.f18266d, "tramini", C3325a.d.f18069b, (Long) 0L).longValue();
        }
        C3366b c3366bM15389b = m15389b();
        if (c3366bM15389b != null) {
            return this.f18268f + c3366bM15389b.m15356d() <= System.currentTimeMillis();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C3366b m15389b() {
        if (f18265c == null) {
            try {
                if (this.f18266d == null) {
                    this.f18266d = C3327c.m15142a().m15159b();
                }
                f18265c = m15386b(this.f18266d);
            } catch (Exception unused) {
            }
            C3327c.m15142a().m15155a(f18265c);
        }
        return f18265c;
    }
}
