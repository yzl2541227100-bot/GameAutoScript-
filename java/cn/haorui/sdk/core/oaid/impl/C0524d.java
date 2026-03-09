package cn.haorui.sdk.core.oaid.impl;

import cn.haorui.sdk.core.oaid.InterfaceC0519a;
import cn.haorui.sdk.core.oaid.InterfaceC0520b;
import cn.haorui.sdk.core.oaid.OAIDException;

/* JADX INFO: renamed from: cn.haorui.sdk.core.oaid.impl.d */
/* JADX INFO: loaded from: classes.dex */
public class C0524d implements InterfaceC0520b {
    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public void mo67a(InterfaceC0519a interfaceC0519a) {
        if (interfaceC0519a == null) {
            return;
        }
        new OAIDException("Unsupported");
    }

    @Override // cn.haorui.sdk.core.oaid.InterfaceC0520b
    /* JADX INFO: renamed from: a */
    public boolean mo68a() {
        return false;
    }
}
