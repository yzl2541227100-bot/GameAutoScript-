package com.anythink.china.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.anythink.china.common.p035b.C1076a;

/* JADX INFO: loaded from: classes.dex */
public class NotificationBroadcaseReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f2355a = NotificationBroadcaseReceiver.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        intent.getStringExtra(C1076a.f2475d);
        String stringExtra = intent.getStringExtra(C1076a.f2476e);
        String stringExtra2 = intent.getStringExtra(C1076a.f2477f);
        int intExtra = intent.getIntExtra(C1076a.f2478g, -1);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        action.hashCode();
        if (action.equals(C1076a.f2473b)) {
            C1066a.m1427a(context).mo1450a(stringExtra, stringExtra2, intExtra);
        } else if (action.equals(C1076a.f2474c)) {
            C1066a.m1427a(context).mo1449a(stringExtra, stringExtra2);
        }
    }
}
