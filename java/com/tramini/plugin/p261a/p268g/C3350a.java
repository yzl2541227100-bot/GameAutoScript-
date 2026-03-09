package com.tramini.plugin.p261a.p268g;

import com.tramini.plugin.p261a.p263b.C3327c;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p261a.p266e.C3340e;
import com.tramini.plugin.p261a.p266e.InterfaceC3337b;
import com.tramini.plugin.p272b.C3366b;
import com.tramini.plugin.p272b.C3367c;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.g.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3350a {

    /* JADX INFO: renamed from: a */
    public static final String f18184a = "a";

    /* JADX INFO: renamed from: b */
    public static final int f18185b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f18186c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f18187d = 3;

    /* JADX INFO: renamed from: e */
    private static C3350a f18188e;

    /* JADX INFO: renamed from: com.tramini.plugin.a.g.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f18189a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ JSONObject f18190b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JSONObject f18191c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f18192d;

        public AnonymousClass1(String str, JSONObject jSONObject, JSONObject jSONObject2, int i) {
            this.f18189a = str;
            this.f18190b = jSONObject;
            this.f18191c = jSONObject2;
            this.f18192d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            new C3340e(C3327c.m15142a().m15159b(), this.f18189a, this.f18190b, this.f18191c).m15186a(this.f18192d, new InterfaceC3337b() { // from class: com.tramini.plugin.a.g.a.1.1
                @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
                /* JADX INFO: renamed from: a */
                public final void mo15198a() {
                }

                @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
                /* JADX INFO: renamed from: a */
                public final void mo15199a(Object obj) {
                    C3327c.m15142a().m15160b(C3327c.m15142a().m15159b());
                }

                @Override // com.tramini.plugin.p261a.p266e.InterfaceC3337b
                /* JADX INFO: renamed from: b */
                public final void mo15200b() {
                    C3327c.m15142a().m15160b(C3327c.m15142a().m15159b());
                }
            });
        }
    }

    private C3350a() {
    }

    /* JADX INFO: renamed from: a */
    public static C3350a m15276a() {
        if (f18188e == null) {
            f18188e = new C3350a();
        }
        return f18188e;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m15277a(int i, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C3366b c3366bM15389b = C3367c.m15382a(C3327c.m15142a().m15159b()).m15389b();
        if (c3366bM15389b == null) {
            return;
        }
        C3335c c3335c = c3366bM15389b.m15358f().get(str);
        int iNextInt = 5000;
        if (c3335c != null) {
            iNextInt = c3335c.f18110b;
            int i2 = c3335c.f18111c;
            if (iNextInt == 0 && i2 == 0) {
                iNextInt = 0;
            } else if (iNextInt != i2) {
                iNextInt += new Random().nextInt(i2 - iNextInt);
            }
        }
        C3327c.m15142a().m15156a(new AnonymousClass1(str, jSONObject, jSONObject2, i), iNextInt);
    }

    /* JADX INFO: renamed from: a */
    private void m15278a(int i, String str, JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        C3327c.m15142a().m15156a(new AnonymousClass1(str, jSONObject, jSONObject2, i), i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m15279a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 14);
            jSONObject.put("setting_id", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m15277a(0, str, (JSONObject) null, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public final void m15280a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            jSONObject2.put("sdk_time", System.currentTimeMillis());
            jSONObject2.put("type", 17);
            jSONObject2.put("setting_id", str2);
        } catch (Throwable unused) {
        }
        m15277a(3, str, jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m15281a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        m15277a(1, str, jSONObject, jSONObject2);
    }
}
