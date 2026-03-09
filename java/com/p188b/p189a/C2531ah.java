package com.p188b.p189a;

import com.github.kevinsawicki.http.HttpRequest;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.b.a.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C2531ah {

    /* JADX INFO: renamed from: a */
    private static final Pattern f15481a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b */
    private static final Pattern f15482b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: c */
    private final String f15483c;

    /* JADX INFO: renamed from: d */
    private final String f15484d;

    /* JADX INFO: renamed from: e */
    private final String f15485e;

    /* JADX INFO: renamed from: f */
    private final String f15486f;

    private C2531ah(String str, String str2, String str3, String str4) {
        this.f15483c = str;
        this.f15484d = str2;
        this.f15485e = str3;
        this.f15486f = str4;
    }

    /* JADX INFO: renamed from: a */
    public static C2531ah m12833a(String str) {
        Matcher matcher = f15481a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f15482b.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(HttpRequest.PARAM_CHARSET)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple different charsets: ".concat(String.valueOf(str)));
                }
                str2 = strGroup3;
            }
        }
        return new C2531ah(str, lowerCase, lowerCase2, str2);
    }

    /* JADX INFO: renamed from: a */
    public final Charset m12834a(Charset charset) {
        String str = this.f15486f;
        return str != null ? Charset.forName(str) : charset;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2531ah) && ((C2531ah) obj).f15483c.equals(this.f15483c);
    }

    public final int hashCode() {
        return this.f15483c.hashCode();
    }

    public final String toString() {
        return this.f15483c;
    }
}
