package com.umeng.commonsdk.proguard;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.am */
/* JADX INFO: loaded from: classes2.dex */
public class C3421am implements Serializable {

    /* JADX INFO: renamed from: d */
    private static Map<Class<? extends InterfaceC3409aa>, Map<? extends InterfaceC3416ah, C3421am>> f18679d = new HashMap();

    /* JADX INFO: renamed from: a */
    public final String f18680a;

    /* JADX INFO: renamed from: b */
    public final byte f18681b;

    /* JADX INFO: renamed from: c */
    public final C3422an f18682c;

    public C3421am(String str, byte b, C3422an c3422an) {
        this.f18680a = str;
        this.f18681b = b;
        this.f18682c = c3422an;
    }

    /* JADX INFO: renamed from: a */
    public static Map<? extends InterfaceC3416ah, C3421am> m15773a(Class<? extends InterfaceC3409aa> cls) {
        if (!f18679d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return f18679d.get(cls);
    }

    /* JADX INFO: renamed from: a */
    public static void m15774a(Class<? extends InterfaceC3409aa> cls, Map<? extends InterfaceC3416ah, C3421am> map) {
        f18679d.put(cls, map);
    }
}
