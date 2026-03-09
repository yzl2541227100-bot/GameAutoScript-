package com.anythink.expressad.foundation.p120g.p126f.p134h;

import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.p126f.p129c.C1830b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1855b {

    /* JADX INFO: renamed from: a */
    public static String f11420a = "a";

    /* JADX INFO: renamed from: b */
    public static String f11421b = "d";

    /* JADX INFO: renamed from: c */
    public static String f11422c = "e";

    /* JADX INFO: renamed from: d */
    private static final String f11423d = "b";

    /* JADX INFO: renamed from: e */
    private Map<String, String> f11424e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    private Map<String, C1830b> f11425f = new LinkedHashMap();

    public C1855b() {
    }

    private C1855b(String str, String str2) {
        this.f11424e.put(str, str2);
    }

    private C1855b(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m9595a(entry.getKey(), entry.getValue());
            }
        }
    }

    private C1855b(String... strArr) {
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i = 0; i < length; i += 2) {
            m9595a(strArr[i], strArr[i + 1]);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9588a(String str) {
        this.f11424e.remove(str);
        this.f11425f.remove(str);
    }

    /* JADX INFO: renamed from: a */
    private void m9589a(String str, File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException();
        }
        String name = TextUtils.isEmpty(null) ? file.getName() : null;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11425f.put(str, new C1830b(name, file, name, null));
    }

    /* JADX INFO: renamed from: a */
    private void m9590a(String str, File file, String str2) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = file.getName();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11425f.put(str, new C1830b(str2, file, str2, null));
    }

    /* JADX INFO: renamed from: a */
    private void m9591a(String str, File file, String str2, String str3) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new FileNotFoundException();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = file.getName();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11425f.put(str, new C1830b(str2, file, str2, str3));
    }

    /* JADX INFO: renamed from: a */
    private void m9592a(Map<String, ?> map) throws FileNotFoundException {
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    m9595a(entry.getKey(), (String) entry.getValue());
                } else if (value instanceof File) {
                    String key = entry.getKey();
                    File file = (File) entry.getValue();
                    if (file == null || !file.exists()) {
                        throw new FileNotFoundException();
                    }
                    String name = TextUtils.isEmpty(null) ? file.getName() : null;
                    if (!TextUtils.isEmpty(key)) {
                        this.f11425f.put(key, new C1830b(name, file, name, null));
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m9593c() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f11424e.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, C1830b> entry2 : this.f11425f.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), "UTF-8"), URLEncoder.encode("FILE_NAME_" + entry2.getValue().m9511b().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e) {
            e.getMessage();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final String m9594a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f11424e.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m9595a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f11424e.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m9596b() {
        return this.f11424e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f11424e.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            for (Map.Entry<String, C1830b> entry2 : this.f11425f.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry2.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().m9511b().getName(), "UTF-8"));
            }
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
        }
        return sb.toString();
    }
}
