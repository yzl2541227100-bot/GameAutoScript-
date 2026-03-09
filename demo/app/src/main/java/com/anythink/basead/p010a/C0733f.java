package com.anythink.basead.p010a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.anythink.china.common.C1066a;

/* JADX INFO: renamed from: com.anythink.basead.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0733f extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String action = intent.getAction();
        if (action != null) {
            stringExtra = intent.getStringExtra(C1066a.f2361f);
            stringExtra2 = intent.getStringExtra(C1066a.f2362g);
            action.hashCode();
            switch (action) {
                case "action_offer_download_end":
                    C0734g.m256a(context.getApplicationContext()).m261b(stringExtra, stringExtra2);
                    break;
                case "action_offer_download_start":
                    C0734g.m256a(context.getApplicationContext()).m260a(stringExtra, stringExtra2);
                    break;
                case "action_offer_install_successful":
                    C0734g.m256a(context.getApplicationContext()).m263d(stringExtra, stringExtra2);
                    break;
                case "action_offer_install_start":
                    C0734g.m256a(context.getApplicationContext()).m262c(stringExtra, stringExtra2);
                    break;
            }
        }
    }
}
