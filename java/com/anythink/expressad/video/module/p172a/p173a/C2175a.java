package com.anythink.expressad.video.module.p172a.p173a;

import android.app.Activity;
import com.anythink.expressad.foundation.p116d.C1781c;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2175a extends C2180f {

    /* JADX INFO: renamed from: V */
    private C1781c f13842V;

    /* JADX INFO: renamed from: a */
    private Activity f13843a;

    private C2175a(Activity activity, C1781c c1781c) {
        this.f13843a = activity;
        this.f13842V = c1781c;
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    public final void mo10950a(int i, Object obj) {
        Activity activity;
        super.mo10950a(i, obj);
        if (i != 106 || (activity = this.f13843a) == null || this.f13842V == null) {
            return;
        }
        activity.finish();
    }
}
