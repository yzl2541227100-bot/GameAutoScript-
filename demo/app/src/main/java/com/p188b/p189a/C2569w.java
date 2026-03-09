package com.p188b.p189a;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.b.a.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2569w implements InterfaceC2568v {
    @Override // com.p188b.p189a.InterfaceC2568v
    /* JADX INFO: renamed from: a */
    public final List<InetAddress> mo12967a(String str) throws UnknownHostException {
        if (str != null) {
            return Arrays.asList(InetAddress.getAllByName(str));
        }
        throw new UnknownHostException("hostname == null");
    }
}
