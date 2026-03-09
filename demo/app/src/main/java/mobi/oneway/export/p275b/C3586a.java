package mobi.oneway.export.p275b;

import android.text.TextUtils;
import com.anythink.expressad.p086d.p087a.C1485b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import mobi.oneway.export.p283g.C3641m;
import mobi.oneway.export.p283g.C3646r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3586a {

    /* JADX INFO: renamed from: i */
    private static C3586a f19621i;

    /* JADX INFO: renamed from: a */
    private final String f19622a = "sp_ad_c_info";

    /* JADX INFO: renamed from: b */
    private final String f19623b = "ld";

    /* JADX INFO: renamed from: c */
    private final String f19624c = "rc";

    /* JADX INFO: renamed from: d */
    private final String f19625d = C1485b.f7040bH;

    /* JADX INFO: renamed from: e */
    private final String f19626e = "msc";

    /* JADX INFO: renamed from: f */
    private final String f19627f = "mrc";

    /* JADX INFO: renamed from: g */
    private boolean f19628g;

    /* JADX INFO: renamed from: h */
    private long f19629h;

    /* JADX INFO: renamed from: mobi.oneway.export.b.a$a */
    public enum a {
        TYPE_REQUEST,
        TYPE_SHOW
    }

    private C3586a() {
    }

    /* JADX INFO: renamed from: a */
    public static C3586a m16671a() {
        if (f19621i == null) {
            f19621i = new C3586a();
        }
        return f19621i;
    }

    /* JADX INFO: renamed from: a */
    private void m16672a(JSONObject jSONObject) {
        C3646r.m17006a().m17009a("sp_ad_c_info", jSONObject.toString());
    }

    /* JADX INFO: renamed from: a */
    private void m16673a(JSONObject jSONObject, String str) {
        try {
            C3641m.m16987a((Object) "resume ad control count");
            jSONObject.put("ld", str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                Object obj = jSONObject.get(itKeys.next());
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    jSONObject2.put("rc", 0);
                    jSONObject2.put(C1485b.f7040bH, 0);
                }
            }
            m16672a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m16674b(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str.equals(str2)) {
            return str;
        }
        return str + "-" + str2;
    }

    /* JADX INFO: renamed from: d */
    private JSONObject m16675d() {
        String str = (String) C3646r.m17006a().m17010b("sp_ad_c_info", "");
        return TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
    }

    /* JADX INFO: renamed from: e */
    private String m16676e() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public void m16677a(long j) {
        this.f19629h = j;
    }

    /* JADX INFO: renamed from: a */
    public void m16678a(String str, String str2, int i, int i2) {
        JSONObject jSONObject;
        String strM16674b = m16674b(str, str2);
        try {
            JSONObject jSONObjectM16675d = m16675d();
            if (jSONObjectM16675d.has(strM16674b)) {
                jSONObject = jSONObjectM16675d.getJSONObject(strM16674b);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObjectM16675d.put(strM16674b, jSONObject2);
                jSONObject = jSONObject2;
            }
            jSONObject.put("mrc", i);
            jSONObject.put("msc", i2);
            m16672a(jSONObjectM16675d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16679a(a aVar, String str, String str2) {
        JSONObject jSONObject;
        try {
            String strM16674b = m16674b(str, str2);
            JSONObject jSONObjectM16675d = m16675d();
            if (jSONObjectM16675d.has(strM16674b)) {
                jSONObject = jSONObjectM16675d.getJSONObject(strM16674b);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObjectM16675d.put(strM16674b, jSONObject2);
                jSONObject = jSONObject2;
            }
            if (aVar == a.TYPE_REQUEST) {
                jSONObject.put("rc", jSONObject.optInt("rc") + 1);
            }
            if (aVar == a.TYPE_SHOW) {
                jSONObject.put(C1485b.f7040bH, jSONObject.optInt(C1485b.f7040bH) + 1);
            }
            m16672a(jSONObjectM16675d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16680a(boolean z) {
        this.f19628g = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16681a(String str, String str2) {
        JSONObject jSONObjectM16675d;
        String strM16676e = m16676e();
        String strM16674b = m16674b(str, str2);
        try {
            jSONObjectM16675d = m16675d();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!strM16676e.equals(jSONObjectM16675d.optString("ld"))) {
            m16673a(jSONObjectM16675d, strM16676e);
            return false;
        }
        if (jSONObjectM16675d.has(strM16674b)) {
            JSONObject jSONObject = jSONObjectM16675d.getJSONObject(strM16674b);
            int iOptInt = jSONObject.optInt("rc");
            int iOptInt2 = jSONObject.optInt(C1485b.f7040bH);
            int iOptInt3 = jSONObject.optInt("mrc");
            int iOptInt4 = jSONObject.optInt("msc");
            C3641m.m16987a((Object) String.format("adtype=%s,maxRequest=%d,curRequest=%d;maxShow=%d,curShow=%d", strM16674b, Integer.valueOf(iOptInt3), Integer.valueOf(iOptInt), Integer.valueOf(iOptInt4), Integer.valueOf(iOptInt2)));
            return (iOptInt3 != 0 && iOptInt >= iOptInt3) || (iOptInt4 != 0 && iOptInt2 >= iOptInt4);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16682b() {
        return this.f19628g;
    }

    /* JADX INFO: renamed from: c */
    public long m16683c() {
        return this.f19629h;
    }
}
