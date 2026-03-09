package com.goldcoast.sdk.p206c;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.goldcoast.sdk.c.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2737c {

    /* JADX INFO: renamed from: c */
    private static C2737c f15999c;

    /* JADX INFO: renamed from: d */
    private static Context f16000d;

    /* JADX INFO: renamed from: b */
    private String f16002b = "noend.ini";

    /* JADX INFO: renamed from: a */
    private String f16001a = f16000d.getFilesDir().getAbsolutePath();

    private C2737c() {
        File file = new File(this.f16001a);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        File file2 = new File(this.f16001a, this.f16002b);
        if (file2.exists()) {
            return;
        }
        try {
            file2.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2737c m13157a(Context context) {
        if (f15999c == null) {
            f16000d = context;
            f15999c = new C2737c();
        }
        return f15999c;
    }

    /* JADX INFO: renamed from: a */
    public final String m13158a() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(this.f16001a, this.f16002b)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            return sb.toString();
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m13159a(String str) {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f16001a, this.f16002b));
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13160b(String str) {
        String strM13158a = m13158a();
        if (TextUtils.isEmpty(strM13158a)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM13158a);
            if (jSONArray.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (!str.equals(jSONArray.get(i).toString())) {
                        jSONArray2.put(jSONArray.get(i).toString());
                    }
                }
                if (jSONArray2.length() > 0) {
                    m13159a(jSONArray2.toString());
                } else {
                    m13159a("");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13161c(String str) {
        String strM13158a = m13158a();
        if (TextUtils.isEmpty(strM13158a)) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM13158a);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.get(i).toString())) {
                        return true;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
