package com.anythink.expressad.foundation.p120g.p124d;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.d.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1821e {
    /* JADX INFO: renamed from: a */
    private static String m9467a(long j) {
        if (j <= 0) {
            return "0M";
        }
        return String.format("%.1f", Float.valueOf((j / 1024.0f) / 1024.0f)) + "M";
    }

    /* JADX INFO: renamed from: a */
    private static String m9468a(String str, String str2) {
        if (m9470b(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9469a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9470b(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: c */
    private static String m9471c(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: d */
    private static String m9472d(String str) {
        if (m9470b(str)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLetter(cCharAt) || Character.isUpperCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append(str.substring(1));
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    private static String m9473e(String str) {
        if (m9470b(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException occurred. ", e);
        }
    }

    /* JADX INFO: renamed from: f */
    private static String m9474f(String str) {
        if (m9470b(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile(".*<[\\s]*a[\\s]*.*>(.+?)<[\\s]*/a[\\s]*>.*", 2).matcher(str);
        return matcher.matches() ? matcher.group(1) : str;
    }

    /* JADX INFO: renamed from: g */
    private static String m9475g(String str) {
        return m9470b(str) ? str : str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", "&").replaceAll("&quot;", "\"");
    }

    /* JADX INFO: renamed from: h */
    private static String m9476h(String str) {
        if (m9470b(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 12288) {
                charArray[i] = ' ';
            } else if (charArray[i] < 65281 || charArray[i] > 65374) {
                charArray[i] = charArray[i];
            } else {
                charArray[i] = (char) (charArray[i] - 65248);
            }
        }
        return new String(charArray);
    }

    /* JADX INFO: renamed from: i */
    private static String m9477i(String str) {
        if (m9470b(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = 12288;
            } else if (charArray[i] < '!' || charArray[i] > '~') {
                charArray[i] = charArray[i];
            } else {
                charArray[i] = (char) (charArray[i] + 65248);
            }
        }
        return new String(charArray);
    }
}
