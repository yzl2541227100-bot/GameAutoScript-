package com.king.sdk.p220a;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.king.sdk.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3028a {

    /* JADX INFO: renamed from: a */
    private static Method f16629a;

    /* JADX INFO: renamed from: b */
    private static Method f16630b;

    static {
        try {
            Method declaredMethod = Intent.class.getDeclaredMethod("getIBinderExtra", String.class);
            f16629a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Intent.class.getDeclaredMethod("putExtra", String.class, IBinder.class);
            f16630b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static IBinder m13743a(Intent intent, String str) {
        try {
            return (IBinder) f16629a.invoke(intent, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
