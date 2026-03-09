package com.umeng.commonsdk.proguard;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.af */
/* JADX INFO: loaded from: classes2.dex */
public class C3414af {
    /* JADX INFO: renamed from: a */
    public static InterfaceC3413ae m15737a(Class<? extends InterfaceC3413ae> cls, int i) {
        try {
            return (InterfaceC3413ae) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
