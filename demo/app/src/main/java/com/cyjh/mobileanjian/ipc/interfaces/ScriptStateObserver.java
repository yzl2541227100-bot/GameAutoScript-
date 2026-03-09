package com.cyjh.mobileanjian.ipc.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public interface ScriptStateObserver {
    void onScriptIsRunning();

    void onStartScript();

    void onStopScript(int i, String str);
}
