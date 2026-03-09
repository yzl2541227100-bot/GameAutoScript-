package mobi.oneway.export.p280e;

import java.io.IOException;
import mobi.oneway.export.enums.PluginErrorType;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p279d.C3608f;
import mobi.oneway.export.p283g.C3643o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.e.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3611c extends Thread {

    /* JADX INFO: renamed from: a */
    private JSONObject f19719a;

    public C3611c(JSONObject jSONObject) {
        this.f19719a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m16816a(PluginErrorType pluginErrorType, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", pluginErrorType);
            jSONObject.put("name", "Error");
            jSONObject.put("stack", str);
            jSONObject.put("zc", C3643o.m17000a());
            jSONObject.put("zm", C3643o.m17001b());
            new C3611c(jSONObject).start();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        super.run();
        try {
            new C3608f(C3581a.f19605f, C3581a.f19601b).m16771a(this.f19719a).m16780c("POST").m16792n();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
