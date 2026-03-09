package com.cyjh.mobileanjian.ipc.interfaces;

import com.google.protobuf.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public interface OnScriptMessageCallback {
    void onDebugMessage(ByteString byteString);

    void onTracePrint(String str);
}
