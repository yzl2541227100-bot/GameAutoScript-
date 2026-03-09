package mobi.oneway.export.p283g;

import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.g.i */
/* JADX INFO: loaded from: classes2.dex */
public class C3637i {

    /* JADX INFO: renamed from: a */
    public static final String f19795a = "POST";

    /* JADX INFO: renamed from: b */
    public static final String f19796b = "GET";

    /* JADX INFO: renamed from: c */
    public static final String f19797c = "HEAD";

    /* JADX INFO: renamed from: d */
    public static final String f19798d = "Content-Type";

    /* JADX INFO: renamed from: e */
    public static final String f19799e = "application/json";

    /* JADX INFO: renamed from: f */
    public static final long f19800f = 15000;

    /* JADX INFO: renamed from: g */
    private String f19801g;

    /* JADX INFO: renamed from: h */
    private String f19802h;

    /* JADX INFO: renamed from: i */
    private long f19803i;

    /* JADX INFO: renamed from: a */
    public C3637i m16975a(long j) {
        this.f19803i = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3637i m16976a(String str) {
        this.f19801g = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m16977a() {
        JSONObject jSONObject = new JSONObject();
        m16978b("GET");
        try {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public C3637i m16978b(String str) {
        this.f19802h = str;
        return this;
    }
}
