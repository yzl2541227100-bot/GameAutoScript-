package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.InterfaceC3409aa;
import com.umeng.commonsdk.proguard.InterfaceC3416ah;
import java.io.Serializable;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.aa */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3409aa<T extends InterfaceC3409aa<?, ?>, F extends InterfaceC3416ah> extends Serializable {
    void clear();

    InterfaceC3409aa<T, F> deepCopy();

    F fieldForId(int i);

    void read(AbstractC3434az abstractC3434az) throws C3415ag;

    void write(AbstractC3434az abstractC3434az) throws C3415ag;
}
