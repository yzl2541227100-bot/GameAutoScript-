package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.model.OSSResult;
import java.io.IOException;
import p285z2.C4299qx;

/* JADX INFO: loaded from: classes.dex */
public interface ResponseParser<T extends OSSResult> {
    T parse(C4299qx c4299qx) throws IOException;
}
