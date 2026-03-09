package com.octopus.p222ad.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.octopus.ad.utils.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3262c {

    /* JADX INFO: renamed from: a */
    private static final Handler f17910a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m15017a(Runnable runnable, long j) {
        f17910a.postDelayed(runnable, j);
    }
}
