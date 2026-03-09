package com.iflytek.voiceads.videolib;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.iflytek.voiceads.videolib.a */
/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class C2999a {

    /* JADX INFO: renamed from: b */
    public int f16537b;

    /* JADX INFO: renamed from: d */
    public String f16539d;

    /* JADX INFO: renamed from: g */
    public Object[] f16542g;

    /* JADX INFO: renamed from: a */
    public final String f16536a = "URL_KEY_DEFAULT";

    /* JADX INFO: renamed from: c */
    public LinkedHashMap f16538c = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public HashMap f16540e = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f16541f = false;

    public C2999a(String str, String str2) {
        this.f16539d = "";
        this.f16538c.put("URL_KEY_DEFAULT", str);
        this.f16539d = str2;
        this.f16537b = 0;
    }

    /* JADX INFO: renamed from: a */
    public Object m13653a() {
        return m13654a(this.f16537b);
    }

    /* JADX INFO: renamed from: a */
    public Object m13654a(int i) {
        int i2 = 0;
        for (Object obj : this.f16538c.keySet()) {
            if (i2 == i) {
                return this.f16538c.get(obj);
            }
            i2++;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m13655a(Object obj) {
        if (obj != null) {
            return this.f16538c.containsValue(obj);
        }
        return false;
    }
}
