package com.zbar.lib;

/* JADX INFO: loaded from: classes2.dex */
public class ZbarManager {
    static {
        System.loadLibrary("iconv");
        System.loadLibrary("zbar");
    }

    public native String decode(byte[] bArr, int i, int i2, boolean z, int i3, int i4, int i5, int i6);
}
