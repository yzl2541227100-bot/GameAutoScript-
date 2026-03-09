package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3466q;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.m */
/* JADX INFO: loaded from: classes2.dex */
public class C3504m extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19249a = "umtt4";

    /* JADX INFO: renamed from: b */
    private Context f19250b;

    public C3504m(Context context) {
        super(f19249a);
        this.f19250b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return new C3466q(this.f19250b).m15996f();
    }
}
