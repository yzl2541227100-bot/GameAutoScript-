package com.anythink.core.p072d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1344h;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.d.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1401k {

    /* JADX INFO: renamed from: a */
    private static final String f6176a = "PrePlacementStrategy";

    /* JADX INFO: renamed from: b */
    private String f6177b;

    /* JADX INFO: renamed from: c */
    private String m5170c(String str) {
        int i;
        int i2;
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f6177b)) {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(contextM2148f.getResources().getAssets().open(this.f6177b + File.separator + str + ".json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    JSONObject jSONObject = new JSONObject(C1340d.m4030b(sb.toString()));
                    if (!jSONObject.isNull("sdk_ver")) {
                        String string = jSONObject.getString("sdk_ver");
                        if (!TextUtils.isEmpty(string) && (i2 = Integer.parseInt(C1344h.m4131a().replace("UA_", "").replace(".", ""))) < (i = Integer.parseInt(string.replace(".", "")))) {
                            Log.e(f6176a, String.format("The sdk version(%s) must be greater than or equal to the version(%s) in the placement strategy.", Integer.valueOf(i2), Integer.valueOf(i)));
                            return "";
                        }
                    }
                    if (!jSONObject.isNull("pl_id")) {
                        String string2 = jSONObject.getString("pl_id");
                        if (!TextUtils.isEmpty(string2) && !str.equals(string2)) {
                            return "";
                        }
                    }
                    if (!jSONObject.isNull("pl_data")) {
                        return jSONObject.getJSONObject("pl_data").toString();
                    }
                } catch (IOException unused) {
                    return "";
                }
            } catch (Exception e) {
                Log.e(f6176a, "Get pre placement strategy failed: " + e.getMessage());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final void m5171a(String str) {
        this.f6177b = str;
    }

    /* JADX INFO: renamed from: b */
    public final C1396f m5172b(String str) {
        String strM5170c = m5170c(str);
        if (TextUtils.isEmpty(strM5170c)) {
            return null;
        }
        try {
            C1396f c1396fM4919a = C1396f.m4919a(str, new JSONObject(strM5170c));
            c1396fM4919a.m5058a(1);
            return c1396fM4919a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
