package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3493b extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19208a = "android_id";

    /* JADX INFO: renamed from: b */
    private Context f19209b;

    public C3493b(Context context) {
        super("android_id");
        this.f19209b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return DeviceConfig.getAndroidId(this.f19209b);
    }
}
