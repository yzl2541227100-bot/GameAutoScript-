package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3495d extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19212a = "idmd5";

    /* JADX INFO: renamed from: b */
    private Context f19213b;

    public C3495d(Context context) {
        super("idmd5");
        this.f19213b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f19213b);
    }
}
