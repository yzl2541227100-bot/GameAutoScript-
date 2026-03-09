package com.sun.mail.util;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.mail.internet.MimePart;

/* JADX INFO: loaded from: classes2.dex */
public class MimeUtil {
    private static final Method cleanContentType;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[Catch: all -> 0x0031, RuntimeException -> 0x0035, NoSuchMethodException -> 0x0038, ClassNotFoundException -> 0x003b, TRY_ENTER, TryCatch #4 {ClassNotFoundException -> 0x003b, blocks: (B:3:0x0001, B:5:0x0009, B:12:0x0018, B:13:0x001c), top: B:28:0x0001 }] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "mail.mime.contenttypehandler"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
            if (r1 == 0) goto L2e
            java.lang.ClassLoader r2 = getContextClassLoader()     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
            r3 = 0
            if (r2 == 0) goto L15
            java.lang.Class r2 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L15 java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38
            goto L16
        L15:
            r2 = r0
        L16:
            if (r2 != 0) goto L1c
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
        L1c:
            java.lang.String r1 = "cleanContentType"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
            java.lang.Class<javax.mail.internet.MimePart> r5 = javax.mail.internet.MimePart.class
            r4[r3] = r5     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
            r3 = 1
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
            java.lang.reflect.Method r0 = r2.getMethod(r1, r4)     // Catch: java.lang.Throwable -> L31 java.lang.RuntimeException -> L35 java.lang.NoSuchMethodException -> L38 java.lang.ClassNotFoundException -> L3b
        L2e:
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            return
        L31:
            r1 = move-exception
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            throw r1
        L35:
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            return
        L38:
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            return
        L3b:
            com.sun.mail.util.MimeUtil.cleanContentType = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.MimeUtil.<clinit>():void");
    }

    private MimeUtil() {
    }

    public static String cleanContentType(MimePart mimePart, String str) {
        Method method = cleanContentType;
        if (method != null) {
            try {
                return (String) method.invoke(null, mimePart, str);
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: com.sun.mail.util.MimeUtil.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }
}
