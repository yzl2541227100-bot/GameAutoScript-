package com.anythink.expressad.exoplayer.p093d;

import android.util.Log;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import org.apache.commons.p284io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1532a {

    /* JADX INFO: renamed from: a */
    private static final String f7924a = "ClearKeyUtil";

    private C1532a() {
    }

    /* JADX INFO: renamed from: a */
    private static String m6701a(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m6702a(byte[] bArr) {
        if (C1717af.f9627a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C1717af.m8068a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m6703b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m6703b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return C1717af.m8107c(sb.toString());
        } catch (JSONException e) {
            Log.e(f7924a, "Failed to adjust response data: " + C1717af.m8068a(bArr), e);
            return bArr;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m6703b(String str) {
        return str.replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX);
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m6704b(byte[] bArr) {
        return C1717af.f9627a >= 27 ? bArr : C1717af.m8107c(C1717af.m8068a(bArr).replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_'));
    }
}
