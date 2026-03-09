package com.umeng.commonsdk.proguard;

import android.os.Build;
import com.umeng.commonsdk.proguard.C3462m;
import java.io.File;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3465p {
    /* JADX INFO: renamed from: b */
    private boolean m15980b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: c */
    private boolean m15981c() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m15982d() {
        return new C3462m().m15967a(C3462m.a.check_su_binary) != null;
    }

    /* JADX INFO: renamed from: e */
    private boolean m15983e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/"};
        for (int i = 0; i < 7; i++) {
            if (new File(strArr[i] + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15984a() {
        return m15980b() || m15981c() || m15982d() || m15983e();
    }
}
