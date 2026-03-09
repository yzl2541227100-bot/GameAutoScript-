package com.anythink.core.common.p055f;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1244i extends AbstractC1259x {

    /* JADX INFO: renamed from: a */
    public int f4223a;

    /* JADX INFO: renamed from: b */
    public AbstractC1228au f4224b;

    /* JADX INFO: renamed from: c */
    public long f4225c;

    @Override // com.anythink.core.common.p055f.AbstractC1259x
    /* JADX INFO: renamed from: a */
    public final JSONObject mo3143a() {
        JSONObject jSONObjectMo2660F = this.f4224b.mo2660F(this.f4223a);
        if (jSONObjectMo2660F != null) {
            try {
                jSONObjectMo2660F.put("sdk_time", this.f4225c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObjectMo2660F;
    }
}
