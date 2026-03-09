package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3466q;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.q */
/* JADX INFO: loaded from: classes2.dex */
public class C3508q extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19257a = "umtt0";

    /* JADX INFO: renamed from: b */
    private Context f19258b;

    public C3508q(Context context) {
        super(f19257a);
        this.f19258b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return new C3466q(this.f19258b).m15992b();
    }
}
