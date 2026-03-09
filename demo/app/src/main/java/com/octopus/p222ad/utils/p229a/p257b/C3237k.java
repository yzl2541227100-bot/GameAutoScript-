package com.octopus.p222ad.utils.p229a.p257b;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.octopus.p222ad.utils.p229a.C3246e;
import com.octopus.p222ad.utils.p229a.C3247f;
import com.octopus.p222ad.utils.p229a.InterfaceC3244c;
import com.octopus.p222ad.utils.p229a.InterfaceC3245d;

/* JADX INFO: renamed from: com.octopus.ad.utils.a.b.k */
/* JADX INFO: loaded from: classes2.dex */
public class C3237k implements InterfaceC3245d {

    /* JADX INFO: renamed from: a */
    private final Context f17867a;

    public C3237k(Context context) {
        this.f17867a = context;
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    /* JADX INFO: renamed from: a */
    public void mo14919a(InterfaceC3244c interfaceC3244c) {
        if (this.f17867a == null || interfaceC3244c == null) {
            return;
        }
        if (!mo14920a()) {
            C3247f.m14935a("Only supports Android 10.0 and above for Nubia");
            interfaceC3244c.mo14853a(new C3246e("Only supports Android 10.0 and above for Nubia"));
            return;
        }
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f17867a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
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
                throw new C3246e("OAID query failed: bundle is null");
            }
            String string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
            if (string == null || string.length() == 0) {
                throw new C3246e("OAID query failed: " + bundleCall.getString("message"));
            }
            C3247f.m14935a("OAID query success: " + string);
            interfaceC3244c.mo14854a(string);
        } catch (Exception e) {
            C3247f.m14935a(e);
            interfaceC3244c.mo14853a(e);
        }
    }

    @Override // com.octopus.p222ad.utils.p229a.InterfaceC3245d
    @SuppressLint({"AnnotateVersionCheck"})
    /* JADX INFO: renamed from: a */
    public boolean mo14920a() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
