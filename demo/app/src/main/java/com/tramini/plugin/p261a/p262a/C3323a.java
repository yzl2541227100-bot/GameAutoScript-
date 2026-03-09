package com.tramini.plugin.p261a.p262a;

import android.content.Intent;
import com.anythink.core.common.p051b.C1169h;
import com.tramini.plugin.p261a.p263b.C3326b;
import com.tramini.plugin.p261a.p263b.C3327c;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3323a {

    /* JADX INFO: renamed from: com.tramini.plugin.a.a.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f18043a;

        public AnonymousClass1(JSONObject jSONObject) {
            this.f18043a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Intent intent = new Intent();
                intent.setAction(C1169h.f3042G);
                intent.putExtra(C1169h.f3043H, this.f18043a.toString());
                C3326b.m15136a(C3327c.m15142a().m15159b()).m15139a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15132a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "1004688");
            jSONObject.put("msg", "3");
            jSONObject.put("msg1", str);
            jSONObject.put("msg2", str2);
            jSONObject.put("msg3", str3);
            C3327c.m15142a();
            C3327c.m15145a(new AnonymousClass1(jSONObject));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m15133a(JSONObject jSONObject) {
        C3327c.m15142a();
        C3327c.m15145a(new AnonymousClass1(jSONObject));
    }
}
