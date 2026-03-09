package com.cyjh.p202mq.sdk.inf;

import com.cyjh.mobileanjian.ipc.interfaces.OnScriptListener;
import p285z2.C4209og;
import p285z2.InterfaceC4319rg;

/* JADX INFO: loaded from: classes2.dex */
public interface IRunner extends InterfaceC4319rg {
    public static final int START_ENIGINE_TIME_OUT_MILLIS = 20000;

    boolean isScriptStarted();

    void notifyRotationStatus();

    void pause();

    void resume();

    IRunner setOnScriptListener(OnScriptListener onScriptListener);

    IRunner setScript(C4209og c4209og);

    void start();

    void stop();
}
