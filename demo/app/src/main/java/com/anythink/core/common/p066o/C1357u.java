package com.anythink.core.common.p066o;

import android.text.TextUtils;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.core.common.o.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1357u {
    /* JADX INFO: renamed from: a */
    private static String m4247a(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return str;
        }
        int iAbs = Math.abs(length2 - length);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < iAbs; i++) {
            sb.append(C4196o4.OooO00o.OooO0Oo);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4248a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4249a(String str) {
        return str.matches("[\\u4e00-\\u9fa5]+");
    }
}
