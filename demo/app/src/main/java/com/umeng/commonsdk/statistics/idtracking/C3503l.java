package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.proguard.C3466q;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.l */
/* JADX INFO: loaded from: classes2.dex */
public class C3503l extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19247a = "umtt5";

    /* JADX INFO: renamed from: b */
    private Context f19248b;

    public C3503l(Context context) {
        super(f19247a);
        this.f19248b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return new C3466q(this.f19248b).m15997g();
    }
}
