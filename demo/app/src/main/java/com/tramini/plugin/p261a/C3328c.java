package com.tramini.plugin.p261a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tramini.plugin.p261a.p263b.C3327c;

/* JADX INFO: renamed from: com.tramini.plugin.a.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3328c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f18095a = C3328c.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(intent.getAction());
            String stringExtra2 = intent.getStringExtra("data");
            String[] stringArrayExtra = intent.getStringArrayExtra("denied");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                C3327c.m15142a().m15157a(stringArrayExtra);
                C3327c.m15142a().m15161b(stringExtra);
                C3327c.m15142a().m15162c(stringExtra2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
