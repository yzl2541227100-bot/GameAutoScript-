package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3497f extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19226a = "imei";

    /* JADX INFO: renamed from: b */
    private Context f19227b;

    public C3497f(Context context) {
        super("imei");
        this.f19227b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return DeviceConfig.getImei(this.f19227b);
    }
}
