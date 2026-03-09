package com.anythink.expressad.atsignalcommon.mraid;

import com.anythink.expressad.foundation.p116d.C1781c;

/* JADX INFO: loaded from: classes.dex */
public interface IMraidJSBridge {
    void close();

    void expand(String str, boolean z);

    C1781c getMraidCampaign();

    void open(String str);

    void unload();

    void useCustomClose(boolean z);
}
