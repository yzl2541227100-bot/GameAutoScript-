package com.octopus.p222ad.utils.p258b;

import android.util.Base64;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3252c {
    /* JADX INFO: renamed from: a */
    public static String m14971a(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
