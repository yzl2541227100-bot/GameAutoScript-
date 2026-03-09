package com.goldcoast.sdk.p204a;

import android.os.Build;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.goldcoast.sdk.a.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C2731f extends AbstractC2728c<C2731f> {

    /* JADX INFO: renamed from: a */
    private String f15976a;

    /* JADX INFO: renamed from: b */
    private String f15977b;

    /* JADX INFO: renamed from: c */
    private String f15978c;

    /* JADX INFO: renamed from: d */
    private String f15979d;

    /* JADX INFO: renamed from: e */
    private String f15980e;

    public C2731f() {
    }

    public C2731f(String[] strArr) {
        if (strArr != null) {
            Map mapM13129a = m13129a(strArr);
            Iterator it = mapM13129a.keySet().iterator();
            if (it == null || !it.hasNext()) {
                return;
            }
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.equals(".vendor")) {
                    this.f15976a = (String) mapM13129a.get(str);
                } else if (str.equals(".product")) {
                    this.f15977b = (String) mapM13129a.get(str);
                } else if (str.equals(".uname_r")) {
                    this.f15978c = (String) mapM13129a.get(str);
                } else if (str.equals(".uname_v")) {
                    this.f15979d = (String) mapM13129a.get(str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map m13129a(String[] strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            try {
                if (str.contains("=")) {
                    String[] strArrSplit = str.split("=");
                    map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static String[] m13130a() {
        String[] strArr = new String[4];
        strArr[0] = ".vendor=" + Build.BRAND;
        strArr[1] = ".product=" + Build.MODEL;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 8192);
            String line = bufferedReader.readLine();
            String[] strArrSplit = line.split("\\s+");
            strArr[2] = ".uname_v=" + line.substring(line.lastIndexOf("#"), line.length());
            strArr[3] = ".uname_r=" + strArrSplit[2];
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return strArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m13131a(String str) {
        this.f15980e = str;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m13132b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(".vendor", this.f15976a);
            jSONObject.put(".product", this.f15977b);
            jSONObject.put(".uname_r", this.f15978c);
            jSONObject.put(".uname_v", this.f15979d);
            jSONObject.put(".uname_v_utc", this.f15980e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
