package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.C3488d;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3482a {

    /* JADX INFO: renamed from: a */
    public static int f19139a;

    /* JADX INFO: renamed from: b */
    private static String f19140b;

    /* JADX INFO: renamed from: a */
    public static String m16252a(Context context) {
        if (TextUtils.isEmpty(f19140b)) {
            f19140b = C3488d.m16307a(context).m16313b();
        }
        return f19140b;
    }
}
