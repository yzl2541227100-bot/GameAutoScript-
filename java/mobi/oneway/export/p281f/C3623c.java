package mobi.oneway.export.p281f;

import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.ArrayList;
import java.util.List;
import mobi.oneway.export.p275b.C3586a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.f.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3623c {

    /* JADX INFO: renamed from: a */
    private String f19750a;

    /* JADX INFO: renamed from: b */
    private List<a> f19751b;

    /* JADX INFO: renamed from: mobi.oneway.export.f.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private int f19752a;

        /* JADX INFO: renamed from: b */
        private String f19753b;

        /* JADX INFO: renamed from: c */
        private int f19754c;

        /* JADX INFO: renamed from: d */
        private int f19755d;

        /* JADX INFO: renamed from: e */
        private int f19756e;

        /* JADX INFO: renamed from: f */
        private int f19757f;

        /* JADX INFO: renamed from: g */
        private int f19758g;

        public a(String str, JSONObject jSONObject) {
            this.f19752a = jSONObject.optInt("adp");
            this.f19753b = jSONObject.optString(C1485b.f6981aB);
            this.f19754c = jSONObject.optInt("dayReqLimit");
            this.f19755d = jSONObject.optInt("dayShowLimit");
            this.f19756e = jSONObject.optInt("fsc");
            this.f19757f = jSONObject.optInt("hvcb");
            this.f19758g = jSONObject.optInt("ocb");
            C3586a.m16671a().m16678a(str, this.f19753b, this.f19754c, this.f19755d);
        }

        /* JADX INFO: renamed from: a */
        public int m16859a() {
            return this.f19752a;
        }

        /* JADX INFO: renamed from: a */
        public void m16860a(int i) {
            this.f19752a = i;
        }

        /* JADX INFO: renamed from: a */
        public void m16861a(String str) {
            this.f19753b = str;
        }

        /* JADX INFO: renamed from: b */
        public String m16862b() {
            return this.f19753b;
        }

        /* JADX INFO: renamed from: b */
        public void m16863b(int i) {
            this.f19754c = i;
        }

        /* JADX INFO: renamed from: c */
        public int m16864c() {
            return this.f19754c;
        }

        /* JADX INFO: renamed from: c */
        public void m16865c(int i) {
            this.f19755d = i;
        }

        /* JADX INFO: renamed from: d */
        public int m16866d() {
            return this.f19755d;
        }

        /* JADX INFO: renamed from: d */
        public void m16867d(int i) {
            this.f19756e = i;
        }

        /* JADX INFO: renamed from: e */
        public int m16868e() {
            return this.f19756e;
        }

        /* JADX INFO: renamed from: e */
        public void m16869e(int i) {
            this.f19757f = i;
        }

        /* JADX INFO: renamed from: f */
        public int m16870f() {
            return this.f19757f;
        }

        /* JADX INFO: renamed from: f */
        public void m16871f(int i) {
            this.f19758g = i;
        }

        /* JADX INFO: renamed from: g */
        public int m16872g() {
            return this.f19758g;
        }
    }

    public C3623c(JSONObject jSONObject) {
        this.f19750a = jSONObject.optString(C1485b.f6981aB);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pidConfigs");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        this.f19751b = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            this.f19751b.add(new a(this.f19750a, jSONArrayOptJSONArray.optJSONObject(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m16855a() {
        return this.f19750a;
    }

    /* JADX INFO: renamed from: a */
    public void m16856a(String str) {
        this.f19750a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m16857a(List<a> list) {
        this.f19751b = list;
    }

    /* JADX INFO: renamed from: b */
    public List<a> m16858b() {
        return this.f19751b;
    }
}
