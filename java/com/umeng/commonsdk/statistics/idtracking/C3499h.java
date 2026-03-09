package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.C3483b;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3499h extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19238a = "mac";

    /* JADX INFO: renamed from: b */
    private Context f19239b;

    public C3499h(Context context) {
        super("mac");
        this.f19239b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        try {
            return DeviceConfig.getMac(this.f19239b);
        } catch (Exception e) {
            if (C3483b.f19146f) {
                e.printStackTrace();
            }
            C3454e.m15904a(this.f19239b, e);
            return null;
        }
    }
}
