package com.anythink.expressad.video.signal.p176a;

import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.InterfaceC2310g;

/* JADX INFO: renamed from: com.anythink.expressad.video.signal.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C2197e implements InterfaceC2310g {

    /* JADX INFO: renamed from: m */
    public static final String f13923m = "DefaultJSNotifyProxy";

    @Override // com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public void mo11582a() {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public void mo11583a(int i) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public void mo11584a(int i, int i2, int i3, int i4) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public void mo11585a(int i, String str) {
        StringBuilder sb = new StringBuilder("onClick:");
        sb.append(i);
        sb.append(",pt:");
        sb.append(str);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public void mo11586a(AnythinkVideoView.C2172a c2172a) {
        new StringBuilder("onProgressNotify:").append(c2172a.toString());
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2310g
    /* JADX INFO: renamed from: a */
    public void mo11587a(Object obj) {
        new StringBuilder("onWebviewShow:").append(obj);
    }
}
