package com.anythink.basead.mraid;

import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.foundation.p116d.C1781c;

/* JADX INFO: renamed from: com.anythink.basead.mraid.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0799b implements IMraidJSBridge {
    /* JADX INFO: renamed from: a */
    public void mo651a() {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void expand(String str, boolean z) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final C1781c getMraidCampaign() {
        return null;
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public final void unload() {
        close();
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public void useCustomClose(boolean z) {
    }
}
