package com.anythink.china.p030a.p031a;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: com.anythink.china.a.a.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1044k {

    /* JADX INFO: renamed from: a */
    private Context f2275a;

    public C1044k(Context context) {
        this.f2275a = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m1361a() {
        Bundle bundleCall;
        try {
            Uri uri = Uri.parse("content://cn.nubia.identity/identity");
            int i = Build.VERSION.SDK_INT;
            if (i > 17) {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f2275a.getContentResolver().acquireContentProviderClient(uri);
                bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                if (contentProviderClientAcquireContentProviderClient != null) {
                    if (i >= 24) {
                        contentProviderClientAcquireContentProviderClient.close();
                    } else {
                        contentProviderClientAcquireContentProviderClient.release();
                    }
                }
            } else {
                bundleCall = this.f2275a.getContentResolver().call(uri, "getOAID", (String) null, (Bundle) null);
            }
            return (bundleCall != null ? bundleCall.getInt("code", -1) : -1) == 0 ? bundleCall.getString("id") : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
