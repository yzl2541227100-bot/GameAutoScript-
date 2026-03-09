package com.anythink.expressad.video.signal;

import android.content.res.Configuration;
import com.anythink.expressad.foundation.p116d.C1781c;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2311h {
    void handlerPlayableException(String str);

    void install(C1781c c1781c);

    void notifyCloseBtn(int i);

    void orientation(Configuration configuration);

    void readyStatus(int i);

    void toggleCloseBtn(int i);

    void webviewshow();
}
