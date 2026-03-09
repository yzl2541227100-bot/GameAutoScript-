package com.anythink.expressad.video.module.p172a.p173a;

import com.anythink.expressad.video.module.AnythinkClickMiniCardView;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2181g extends C2183i {

    /* JADX INFO: renamed from: a */
    private AnythinkClickMiniCardView f13852a;

    public C2181g(AnythinkClickMiniCardView anythinkClickMiniCardView, InterfaceC2174a interfaceC2174a) {
        super(interfaceC2174a);
        this.f13852a = anythinkClickMiniCardView;
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2183i, com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    public final void mo10950a(int i, Object obj) {
        boolean z = false;
        switch (i) {
            case 100:
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f13852a;
                if (anythinkClickMiniCardView != null) {
                    anythinkClickMiniCardView.webviewshow();
                    AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f13852a;
                    anythinkClickMiniCardView2.onSelfConfigurationChanged(anythinkClickMiniCardView2.getResources().getConfiguration());
                }
                break;
            case 101:
            case 102:
                z = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (z) {
            return;
        }
        super.mo10950a(i, obj);
    }
}
