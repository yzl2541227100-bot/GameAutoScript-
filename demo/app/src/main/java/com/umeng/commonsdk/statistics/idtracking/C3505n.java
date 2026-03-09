package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3466q;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.n */
/* JADX INFO: loaded from: classes2.dex */
public class C3505n extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19251a = "umtt1";

    /* JADX INFO: renamed from: b */
    private Context f19252b;

    public C3505n(Context context) {
        super(f19251a);
        this.f19252b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return new C3466q(this.f19252b).m15993c();
    }
}
