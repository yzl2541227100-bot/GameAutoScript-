package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3466q;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3507p extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19255a = "umtt2";

    /* JADX INFO: renamed from: b */
    private Context f19256b;

    public C3507p(Context context) {
        super(f19255a);
        this.f19256b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return new C3466q(this.f19256b).m15994d();
    }
}
