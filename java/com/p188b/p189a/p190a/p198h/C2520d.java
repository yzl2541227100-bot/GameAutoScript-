package com.p188b.p189a.p190a.p198h;

import com.p188b.p189a.p190a.C2446c;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.commons.p284io.FilenameUtils;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.b.a.a.h.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2520d implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C2520d f15451a = new C2520d();

    private C2520d() {
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m12782a(X509Certificate x509Certificate) {
        List<String> listM12783a = m12783a(x509Certificate, 7);
        List<String> listM12783a2 = m12783a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM12783a.size() + listM12783a2.size());
        arrayList.addAll(listM12783a);
        arrayList.addAll(listM12783a2);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m12783a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12784a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + FilenameUtils.EXTENSION_SEPARATOR;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + FilenameUtils.EXTENSION_SEPARATOR;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(Marker.ANY_MARKER)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        X509Certificate x509Certificate;
        String strM12781a;
        try {
            x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
        } catch (SSLException unused) {
        }
        if (C2446c.m12593c(str)) {
            List<String> listM12783a = m12783a(x509Certificate, 7);
            int size = listM12783a.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(listM12783a.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> listM12783a2 = m12783a(x509Certificate, 2);
        int size2 = listM12783a2.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size2) {
            if (m12784a(lowerCase, listM12783a2.get(i2))) {
                return true;
            }
            i2++;
            z = true;
        }
        if (!z && (strM12781a = new C2519c(x509Certificate.getSubjectX500Principal()).m12781a("cn")) != null) {
            return m12784a(lowerCase, strM12781a);
        }
        return false;
    }
}
