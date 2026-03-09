package com.anythink.expressad.video.module.p172a.p173a;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.signal.InterfaceC2313j;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p179c.C2333c;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2177c extends C2178d {

    /* JADX INFO: renamed from: ag */
    private IJSFactory f13846ag;

    public C2177c(IJSFactory iJSFactory, C1781c c1781c, C2333c c2333c, C2318c c2318c, String str, String str2, InterfaceC2174a interfaceC2174a, int i, boolean z) {
        super(c1781c, c2318c, c2333c, str, str2, interfaceC2174a, i, z);
        this.f13846ag = iJSFactory;
        if (iJSFactory == null) {
            this.f13858W = false;
        }
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2178d, com.anythink.expressad.video.module.p172a.p173a.C2185k, com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    public final void mo10950a(int i, Object obj) {
        if (this.f13858W) {
            if (i != 8) {
                if (i == 105) {
                    this.f13846ag.getJSNotifyProxy().mo11585a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.f13846ag.getJSContainerModule().showVideoClickView(-1);
                    this.f13846ag.getJSVideoModule().setCover(false);
                    this.f13846ag.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.f13846ag.getJSVideoModule().setCover(true);
                    this.f13846ag.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    InterfaceC2313j jSVideoModule = this.f13846ag.getJSVideoModule();
                    this.f13846ag.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.f13846ag.getJSContainerModule().showAlertWebView()) {
                this.f13846ag.getJSVideoModule().alertWebViewShowed();
            } else {
                this.f13846ag.getJSVideoModule().showAlertView();
            }
        }
        super.mo10950a(i, obj);
    }
}
