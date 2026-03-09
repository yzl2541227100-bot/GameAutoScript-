package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3471v;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.i */
/* JADX INFO: loaded from: classes2.dex */
public class C3500i extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19240a = "newumid";

    /* JADX INFO: renamed from: b */
    private Context f19241b;

    public C3500i(Context context) {
        super(f19240a);
        this.f19241b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() {
        return UMEnvelopeBuild.imprintProperty(this.f19241b, C3471v.f18972e, null);
    }
}
