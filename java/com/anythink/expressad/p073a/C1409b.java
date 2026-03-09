package com.anythink.expressad.p073a;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1409b {
    /* JADX INFO: renamed from: a */
    private static String m5253a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static String m5254a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }
}
