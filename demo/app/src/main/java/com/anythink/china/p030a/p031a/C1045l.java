package com.anythink.china.p030a.p031a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.china.p030a.InterfaceC1033a;
import com.anythink.china.p030a.p031a.InterfaceC1046m;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.anythink.china.a.a.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1045l {

    /* JADX INFO: renamed from: a */
    public InterfaceC1046m f2276a;

    /* JADX INFO: renamed from: b */
    public ServiceConnection f2277b = new ServiceConnection() { // from class: com.anythink.china.a.a.l.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1045l.this.f2276a = InterfaceC1046m.a.m1364a(iBinder);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C1045l.this.f2276a = null;
        }
    };

    /* JADX INFO: renamed from: c */
    private Context f2278c;

    public C1045l(Context context) {
        this.f2278c = context;
    }

    /* JADX INFO: renamed from: a */
    private String m1362a(String str) {
        Signature[] signatureArr;
        String packageName = this.f2278c.getPackageName();
        String string = null;
        try {
            signatureArr = this.f2278c.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (Exception e) {
            e.printStackTrace();
            signatureArr = null;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            byte[] byteArray = signatureArr[0].toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                if (messageDigest != null) {
                    byte[] bArrDigest = messageDigest.digest(byteArray);
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                    }
                    string = sb.toString();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return ((InterfaceC1046m.a.C4658a) this.f2276a).m1365a(packageName, string, str);
    }

    /* JADX INFO: renamed from: a */
    public final String m1363a(InterfaceC1033a interfaceC1033a) {
        String strM1362a = "";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return "";
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        if (this.f2278c.bindService(intent, this.f2277b, 1)) {
            try {
                SystemClock.sleep(C2187m.f13871ag);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.f2276a != null) {
                strM1362a = m1362a("OUID");
                interfaceC1033a.mo1323a(strM1362a, false);
            }
        }
        if (TextUtils.isEmpty(strM1362a)) {
            interfaceC1033a.mo1322a();
        }
        return strM1362a;
    }
}
