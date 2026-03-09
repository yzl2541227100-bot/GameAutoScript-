package com.tramini.plugin.p261a.p269h;

import android.text.TextUtils;
import android.util.Log;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p272b.C3366b;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C3361g {
    /* JADX INFO: renamed from: a */
    public static String m15313a(C3366b c3366b) {
        C3335c c3335c;
        ConcurrentHashMap<String, C3335c> concurrentHashMapM15358f = c3366b.m15358f();
        if (concurrentHashMapM15358f == null) {
            return "";
        }
        for (String str : concurrentHashMapM15358f.keySet()) {
            if (!TextUtils.isEmpty(str) && (c3335c = concurrentHashMapM15358f.get(str)) != null && !TextUtils.isEmpty(c3335c.f18109a) && c3335c.f18109a.startsWith("http")) {
                return str;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    private static void m15314a(String str, String str2) {
        int length = 2001 - str.length();
        while (str2.length() > length) {
            Log.d(str, str2.substring(0, length));
            str2 = str2.substring(length);
        }
        Log.d(str, str2);
    }
}
