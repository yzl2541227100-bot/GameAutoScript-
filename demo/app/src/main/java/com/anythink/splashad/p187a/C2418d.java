package com.anythink.splashad.p187a;

import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p061j.InterfaceC1297c;

/* JADX INFO: renamed from: com.anythink.splashad.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2418d implements InterfaceC1297c {
    @Override // com.anythink.core.common.p061j.InterfaceC1297c
    /* JADX INFO: renamed from: a */
    public final void mo3735a(String str, InterfaceC1162a interfaceC1162a) {
        if (interfaceC1162a == null || !(interfaceC1162a instanceof AbstractC2416b)) {
            return;
        }
        ((AbstractC2416b) interfaceC1162a).setRequestId(str);
    }
}
