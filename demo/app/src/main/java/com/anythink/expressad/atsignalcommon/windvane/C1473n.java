package com.anythink.expressad.atsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.windvane.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1473n {

    /* JADX INFO: renamed from: a */
    private static final String[] f6793a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* JADX INFO: renamed from: b */
    private static final Pattern f6794b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: c */
    private static final Pattern f6795c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: d */
    private static final Pattern f6796d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: e */
    private static final Pattern f6797e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* JADX INFO: renamed from: f */
    private static Map<String, String> f6798f = new HashMap();

    static {
        for (EnumC1467h enumC1467h : EnumC1467h.values()) {
            f6798f.put(enumC1467h.m5692a(), enumC1467h.m5693b());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5708a(String str) {
        for (String str2 : f6793a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static Pattern m5709b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f6797e;
        }
        if ("mraid:".equals(str)) {
            return f6795c;
        }
        if ("ssp:".equals(str)) {
            return f6796d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f6797e;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m5710c(String str) {
        char[] cArr = {'\'', IOUtils.DIR_SEPARATOR_WINDOWS};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            boolean z = true;
            if (cCharAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(cCharAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(cCharAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        z = false;
                        break;
                    }
                    if (cArr[i2] == cCharAt) {
                        stringBuffer.append("\\".concat(String.valueOf(cCharAt)));
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    stringBuffer.append(cCharAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m5711d(String str) {
        return m5712e(str).startsWith(C1781c.c.f10525e);
    }

    /* JADX INFO: renamed from: e */
    public static String m5712e(String str) {
        String str2 = f6798f.get(m5713f(str));
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: f */
    private static String m5713f(String str) {
        String path;
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (iLastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(iLastIndexOf + 1);
    }
}
