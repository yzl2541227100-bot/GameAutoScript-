package com.umeng.commonsdk.proguard;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3455f {
    /* JADX INFO: renamed from: a */
    public static String m15905a(Throwable th) {
        String string = null;
        if (th == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            do {
                th.printStackTrace(printWriter);
                th = th.getCause();
            } while (th != null);
            string = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return string;
        } catch (Exception unused) {
            return string;
        }
    }
}
