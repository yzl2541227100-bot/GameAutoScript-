package com.anythink.china.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.anythink.china.common.b */
/* JADX INFO: loaded from: classes.dex */
public class C1075b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f2471a = C1075b.class.getSimpleName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REPLACED".equals(action)) && intent.getData() != null) {
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            StringBuilder sb = new StringBuilder("onReceive: apk install success( ");
            sb.append(schemeSpecificPart);
            sb.append(")");
            C1066a.m1427a(context).m1456b(schemeSpecificPart);
        }
    }
}
