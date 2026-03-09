package com.anythink.expressad.video.signal.p176a;

import android.app.Activity;
import com.anythink.expressad.video.module.AnythinkContainerView;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2207o extends C2197e {

    /* JADX INFO: renamed from: n */
    private Activity f13963n;

    /* JADX INFO: renamed from: o */
    private AnythinkContainerView f13964o;

    private C2207o(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f13963n = activity;
        this.f13964o = anythinkContainerView;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2197e, com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public final void mo11585a(int i, String str) {
        Activity activity;
        super.mo11585a(i, str);
        int iIntValue = 1;
        if (i != 1) {
            if (i == 2 && (activity = this.f13963n) != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (this.f13964o != null) {
            try {
                iIntValue = Integer.valueOf(str).intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f13964o.showVideoClickView(iIntValue);
        }
    }
}
