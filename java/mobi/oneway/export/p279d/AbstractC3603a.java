package mobi.oneway.export.p279d;

import mobi.oneway.export.p279d.C3608f;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.d.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3603a<Data> implements C3608f.b {
    /* JADX INFO: renamed from: a */
    public abstract void m16725a(int i, String str);

    /* JADX INFO: renamed from: a */
    public abstract void m16726a(Data data);

    @Override // mobi.oneway.export.p279d.C3608f.b
    /* JADX INFO: renamed from: a */
    public void mo16727a(Throwable th, C3604b c3604b) {
        m16725a(-1, "请求失败，请稍后再试");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mobi.oneway.export.p279d.C3608f.b
    /* JADX INFO: renamed from: a */
    public void mo16728a(C3604b c3604b) {
        try {
            JSONObject jSONObjectM16741e = c3604b.m16741e();
            int iOptInt = jSONObjectM16741e.optInt("code", -1);
            String strOptString = jSONObjectM16741e.optString("message", "请求失败");
            Object obj = jSONObjectM16741e.get("data");
            if (iOptInt == 0) {
                m16726a(obj);
            } else {
                m16725a(iOptInt, strOptString);
            }
        } catch (Throwable unused) {
            m16725a(-1, "请求失败，请稍后再试");
        }
    }
}
