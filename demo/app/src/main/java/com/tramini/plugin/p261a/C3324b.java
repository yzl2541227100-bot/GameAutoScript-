package com.tramini.plugin.p261a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tramini.plugin.p261a.p263b.C3327c;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p268g.C3350a;
import com.tramini.plugin.p261a.p269h.C3351a;
import com.tramini.plugin.p261a.p269h.C3353b;
import com.tramini.plugin.p261a.p269h.C3357c;
import com.tramini.plugin.p261a.p269h.C3362h;
import com.tramini.plugin.p272b.C3366b;
import com.tramini.plugin.p272b.C3367c;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3324b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f18044a = C3324b.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public static final String f18045b = "tramini";

    /* JADX INFO: renamed from: com.tramini.plugin.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements C3351a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f18046a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18047b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3366b f18048c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f18049d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f18050e;

        public AnonymousClass1(int i, String str, C3366b c3366b, String str2, String str3) {
            this.f18046a = i;
            this.f18047b = str;
            this.f18048c = c3366b;
            this.f18049d = str2;
            this.f18050e = str3;
        }

        @Override // com.tramini.plugin.p261a.p269h.C3351a.a
        /* JADX INFO: renamed from: a */
        public final void mo15135a(final C3333a c3333a) {
            int i;
            if (c3333a != null || (i = this.f18046a) == 18 || i == 19 || i == 20) {
                C3327c.m15142a();
                C3327c.m15145a(new Runnable() { // from class: com.tramini.plugin.a.b.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        String strM15299a;
                        JSONObject jSONObject;
                        try {
                            JSONObject jSONObject2 = new JSONObject(AnonymousClass1.this.f18047b);
                            C3333a c3333a2 = c3333a;
                            if (c3333a2 == null || (jSONObject = c3333a2.f18100a) == null) {
                                if (c3333a2 == null || c3333a2.f18101b == null) {
                                    int i2 = AnonymousClass1.this.f18046a;
                                    if (i2 != 18 && i2 != 19 && i2 != 20) {
                                        return;
                                    }
                                } else {
                                    jSONObject2.put("type", 10001);
                                    jSONObject2.put("i_t", c3333a.f18101b.f18102a);
                                    if (!TextUtils.isEmpty(c3333a.f18101b.f18103b)) {
                                        str = "i_al";
                                        strM15299a = C3357c.m15299a(c3333a.f18101b.f18103b.getBytes());
                                    }
                                }
                                C3350a.m15276a().m15281a(AnonymousClass1.this.f18049d, new JSONObject(AnonymousClass1.this.f18050e), jSONObject2);
                            }
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                jSONObject2.put(next, jSONObject.optString(next));
                            }
                            str = "setting_id";
                            strM15299a = AnonymousClass1.this.f18048c.m15355c();
                            jSONObject2.put(str, strM15299a);
                            C3350a.m15276a().m15281a(AnonymousClass1.this.f18049d, new JSONObject(AnonymousClass1.this.f18050e), jSONObject2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m15134a(Intent intent, C3366b c3366b) {
        String stringExtra = intent.getStringExtra(c3366b.m15359g());
        String stringExtra2 = intent.getStringExtra(c3366b.m15360h());
        intent.getStringExtra(c3366b.m15361i());
        String stringExtra3 = intent.getStringExtra(c3366b.m15362j());
        C3351a.m15282a(c3366b, stringExtra3, intent.getStringExtra(c3366b.m15364l()), intent.getStringExtra(c3366b.m15363k()), new AnonymousClass1(intent.getIntExtra(c3366b.m15365m(), 0), stringExtra2, c3366b, stringExtra3, stringExtra));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        List<String> listM15357e;
        intent.getAction();
        C3366b c3366bM15389b = C3367c.m15382a(context).m15389b();
        if (c3366bM15389b == null) {
            return;
        }
        C3353b.m15283a().m15288a(c3366bM15389b);
        if (!(C3362h.m15315a(context) && c3366bM15389b.m15366n() == 0) && (listM15357e = c3366bM15389b.m15357e()) != null && listM15357e.size() > 0 && listM15357e.contains(intent.getAction())) {
            try {
                String stringExtra = intent.getStringExtra(c3366bM15389b.m15359g());
                String stringExtra2 = intent.getStringExtra(c3366bM15389b.m15360h());
                intent.getStringExtra(c3366bM15389b.m15361i());
                String stringExtra3 = intent.getStringExtra(c3366bM15389b.m15362j());
                C3351a.m15282a(c3366bM15389b, stringExtra3, intent.getStringExtra(c3366bM15389b.m15364l()), intent.getStringExtra(c3366bM15389b.m15363k()), new AnonymousClass1(intent.getIntExtra(c3366bM15389b.m15365m(), 0), stringExtra2, c3366bM15389b, stringExtra3, stringExtra));
            } catch (Throwable unused) {
            }
        }
    }
}
