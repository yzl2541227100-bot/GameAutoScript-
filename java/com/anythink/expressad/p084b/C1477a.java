package com.anythink.expressad.p084b;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.anythink.expressad.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C1477a {

    /* JADX INFO: renamed from: a */
    private static volatile C1477a f6811a;

    private C1477a() {
    }

    /* JADX INFO: renamed from: a */
    private static C1477a m5719a() {
        if (f6811a == null) {
            synchronized (C1477a.class) {
                if (f6811a == null) {
                    f6811a = new C1477a();
                }
            }
        }
        return f6811a;
    }

    /* JADX INFO: renamed from: a */
    private void m5720a(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (File file2 : file.listFiles()) {
                m5720a(new File(file2.getAbsolutePath()));
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5721a(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IOException("zipFilePath or destDirectory is null");
        }
        new C1479c();
        C1479c.m5722a(str, str2);
    }
}
