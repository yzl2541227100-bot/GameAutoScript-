package com.cyjh.mobileanjian.ipc.interfaces;

import p285z2.C3764cg;
import p285z2.C3910ge;

/* JADX INFO: loaded from: classes2.dex */
public interface EngineStateObserver {
    void onConnected(C3764cg c3764cg);

    void onCrash(C3910ge c3910ge);

    void onExit();
}
