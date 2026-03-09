package com.anythink.expressad.foundation.p138h;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p113b.C1773a;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1875i {

    /* JADX INFO: renamed from: a */
    public static final String f11526a = "layout";

    /* JADX INFO: renamed from: b */
    public static final String f11527b = "id";

    /* JADX INFO: renamed from: c */
    public static final String f11528c = "drawable";

    /* JADX INFO: renamed from: d */
    public static final String f11529d = "color";

    /* JADX INFO: renamed from: e */
    public static final String f11530e = "style";

    /* JADX INFO: renamed from: f */
    public static final String f11531f = "anim";

    /* JADX INFO: renamed from: g */
    public static final String f11532g = "string";

    /* JADX INFO: renamed from: h */
    public static final int f11533h = -1;

    /* JADX INFO: renamed from: i */
    private static final String f11534i = "ResourceUtil";

    /* JADX INFO: renamed from: a */
    public static int m9684a(Context context, String str, String str2) {
        if (context == null) {
            return -1;
        }
        try {
            String strM8549a = C1773a.m8548c().m8549a();
            int identifier = !TextUtils.isEmpty(strM8549a) ? context.getResources().getIdentifier(str, str2, strM8549a) : -1;
            if (identifier > 0) {
                StringBuilder sb = new StringBuilder("getRes (use bundle name), ");
                sb.append(str);
                sb.append(", resId: ");
                sb.append(identifier);
                return identifier;
            }
            String packageName = "";
            try {
                packageName = C1773a.m8548c().m8552b();
            } catch (Exception unused) {
            }
            if (C1889w.m9867a(packageName)) {
                packageName = context.getPackageName();
            }
            if (C1889w.m9867a(packageName)) {
                return -1;
            }
            int identifier2 = context.getResources().getIdentifier(str, str2, packageName);
            StringBuilder sb2 = new StringBuilder("getRes (use default package name), ");
            sb2.append(str);
            sb2.append(", resId: ");
            sb2.append(identifier2);
            return identifier2;
        } catch (Exception unused2) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Resources m9685a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                new StringBuilder("Resource error:").append(e.getMessage());
            }
        }
        return null;
    }
}
