package com.anythink.expressad.video.signal.p176a;

import android.app.Activity;
import com.anythink.expressad.video.p154bt.module.AnythinkBTContainer;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2201i extends C2194b {

    /* JADX INFO: renamed from: a */
    private Activity f13935a;

    /* JADX INFO: renamed from: d */
    private AnythinkBTContainer f13936d;

    public C2201i(Activity activity, AnythinkBTContainer anythinkBTContainer) {
        this.f13935a = activity;
        this.f13936d = anythinkBTContainer;
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2194b, com.anythink.expressad.video.signal.InterfaceC2305d
    public final void click(int i, String str) {
        super.click(i, str);
        AnythinkBTContainer anythinkBTContainer = this.f13936d;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.click(i, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2194b, com.anythink.expressad.video.signal.InterfaceC2305d
    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        AnythinkBTContainer anythinkBTContainer = this.f13936d;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.handlerH5Exception(i, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.p176a.C2194b, com.anythink.expressad.video.signal.InterfaceC2208b
    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        AnythinkBTContainer anythinkBTContainer = this.f13936d;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.reactDeveloper(obj, str);
        }
    }
}
