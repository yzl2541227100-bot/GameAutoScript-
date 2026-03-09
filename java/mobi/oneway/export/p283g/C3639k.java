package mobi.oneway.export.p283g;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.g.k */
/* JADX INFO: loaded from: classes2.dex */
public class C3639k {
    /* JADX INFO: renamed from: a */
    public static void m16982a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
