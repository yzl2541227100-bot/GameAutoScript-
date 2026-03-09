package com.anythink.expressad.video.signal.p176a;

import android.content.res.Configuration;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.signal.InterfaceC2312i;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C2198f implements InterfaceC2312i {

    /* JADX INFO: renamed from: a */
    public static final String f13924a = "js";

    @Override // com.anythink.expressad.video.signal.InterfaceC2312i
    /* JADX INFO: renamed from: a */
    public String mo11588a() {
        return MessageFormatter.DELIM_STR;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2312i
    /* JADX INFO: renamed from: a */
    public void mo11589a(String str) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2312i
    /* JADX INFO: renamed from: b */
    public void mo11590b(String str) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2312i, com.anythink.expressad.video.signal.InterfaceC2311h
    public void handlerPlayableException(String str) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void install(C1781c c1781c) {
        new StringBuilder("install:campaignEx=").append(c1781c);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void notifyCloseBtn(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void orientation(Configuration configuration) {
        new StringBuilder("orientation，config=").append(configuration);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void readyStatus(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void toggleCloseBtn(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2311h
    public void webviewshow() {
    }
}
