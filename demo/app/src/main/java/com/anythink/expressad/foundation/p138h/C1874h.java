package com.anythink.expressad.foundation.p138h;

import com.octopus.p222ad.widget.ScrollClickView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1874h {

    /* JADX INFO: renamed from: a */
    private static final String f11525a = "JSONUtils";

    /* JADX INFO: renamed from: a */
    public static String m9682a(int i, int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put("message", "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ScrollClickView.DIR_LEFT, i2);
                jSONObject3.put(ScrollClickView.DIR_RIGHT, i3);
                jSONObject3.put("top", i4);
                jSONObject3.put("bottom", i5);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e) {
                e.getMessage();
            }
        } catch (Throwable th) {
            th.getMessage();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Fail");
            } catch (JSONException e2) {
                e2.getMessage();
            }
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList<String> m9683a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }
}
