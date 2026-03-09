package com.anythink.core.common.p058h.p059a;

import android.text.TextUtils;
import com.anythink.core.common.C1386t;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1256u;
import com.anythink.core.common.p058h.C1275c;
import com.anythink.core.common.p066o.C1340d;
import com.anythink.core.common.p066o.C1341e;
import com.anythink.core.common.p066o.C1343g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.h.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1269a extends AbstractC1271c {

    /* JADX INFO: renamed from: a */
    public List<String> f4598a;

    /* JADX INFO: renamed from: b */
    public int f4599b;

    /* JADX INFO: renamed from: c */
    public boolean f4600c;

    /* JADX INFO: renamed from: k */
    private final String f4601k = C1269a.class.getSimpleName();

    public C1269a(List<String> list) {
        this.f4598a = list;
        this.f4599b = list.size();
    }

    /* JADX INFO: renamed from: j */
    private String m3646j() {
        JSONObject jSONObjectM3658h = super.m3658h();
        JSONObject jSONObjectM3659i = super.m3659i();
        if (jSONObjectM3658h != null) {
            try {
                jSONObjectM3658h.put("app_id", C1175n.m2059a().m2165o());
                jSONObjectM3658h.put("nw_ver", C1341e.m4071h());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f4598a;
                if (list != null && list.size() > 0) {
                    for (String str : this.f4598a) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                jSONObjectM3658h.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (jSONObjectM3659i != null) {
            try {
                jSONObjectM3659i.put(C1275c.f4654R, this.f4612i);
                jSONObjectM3659i.put(C1275c.f4656T, this.f4613j);
            } catch (Exception unused2) {
            }
        }
        HashMap map = new HashMap();
        String strM4028a = C1340d.m4028a(jSONObjectM3658h.toString());
        String strM4028a2 = C1340d.m4028a(jSONObjectM3659i.toString());
        map.put(C1275c.f4651O, "1.0");
        map.put("p", strM4028a);
        map.put(C1275c.f4658V, strM4028a2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str2);
            sb.append("=");
            sb.append(map.get(str2));
        }
        map.put("sign", C1343g.m4127c(C1175n.m2059a().m2167p() + sb.toString()));
        return new JSONObject(map).toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m3647a() {
        this.f4600c = true;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: a */
    public final void mo3648a(String str, String str2, String str3, int i) {
        if (this.f4600c) {
            C1386t.m4552a().m4554a(3, "", "", m3646j(), C1256u.m3442a(1001));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3649b() {
        return this.f4599b;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: c */
    public final int mo3650c() {
        return 2;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: d */
    public final int mo3651d() {
        return 3;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: e */
    public final byte[] mo3652e() {
        return AbstractC1271c.m3655a(m3646j());
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: f */
    public final boolean mo3653f() {
        return false;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: g */
    public final int mo3654g() {
        return 4;
    }
}
