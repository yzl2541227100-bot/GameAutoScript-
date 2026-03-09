package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3466q;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.o */
/* JADX INFO: loaded from: classes2.dex */
public class C3506o extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19253a = "umtt3";

    /* JADX INFO: renamed from: b */
    private Context f19254b;

    public C3506o(Context context) {
        super(f19253a);
        this.f19254b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return new C3466q(this.f19254b).m15995e();
    }
}
