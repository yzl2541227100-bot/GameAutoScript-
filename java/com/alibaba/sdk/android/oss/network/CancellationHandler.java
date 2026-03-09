package com.alibaba.sdk.android.oss.network;

import p285z2.InterfaceC4335rw;

/* JADX INFO: loaded from: classes.dex */
public class CancellationHandler {
    private volatile InterfaceC4335rw call;
    private volatile boolean isCancelled;

    public void cancel() {
        if (this.call != null) {
            this.call.cancel();
        }
        this.isCancelled = true;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCall(InterfaceC4335rw interfaceC4335rw) {
        this.call = interfaceC4335rw;
    }
}
