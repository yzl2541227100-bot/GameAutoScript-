package cn.haorui.sdk.core.oaid.impl;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.k */
/* JADX INFO: loaded from: classes.dex */
public class C0531k implements InterfaceC0520b {

    /* JADX INFO: renamed from: a */
    public final Context f199a;

    public C0531k(Context context) {
        this.f199a = context;
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (this.f199a == null || interfaceC0519a == null) {
            return;
        }
        if (!mo68a()) {
            new OAIDException("Only supports Android 10.0 and above for Nubia");
            return;
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f199a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (contentProviderClientAcquireContentProviderClient == null) {
                return;
            }
            Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
            if (Build.VERSION.SDK_INT >= 24) {
                contentProviderClientAcquireContentProviderClient.close();
            } else {
                contentProviderClientAcquireContentProviderClient.release();
            }
            if (bundleCall == null) {
                throw new OAIDException("OAID query failed: bundle is null");
            }
            String string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
            if (string == null || string.length() == 0) {
                throw new OAIDException("OAID query failed: " + bundleCall.getString("message"));
            }
            String str = "OAID query success: " + string;
            ((AdSdk.C0476a) interfaceC0519a).m17a(string);
        } catch (Exception unused) {
        }
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    @SuppressLint({"AnnotateVersionCheck"})
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
