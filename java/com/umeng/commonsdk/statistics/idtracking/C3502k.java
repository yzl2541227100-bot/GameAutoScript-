package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.k */
/* JADX INFO: loaded from: classes2.dex */
public class C3502k extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19246a = "serial";

    public C3502k() {
        super(f19246a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return DeviceConfig.getSerial();
    }
}
