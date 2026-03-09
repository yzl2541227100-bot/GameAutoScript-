package p285z2;

import com.cyjh.mobileanjian.ipc.share.proto.Ipc;

/* JADX INFO: loaded from: classes.dex */
public final class o00O implements o00O0OO {
    private C3764cg OooO00o;

    @Override // p285z2.o00O0OO
    public final void OooO00o(C3764cg c3764cg) {
        this.OooO00o = c3764cg;
    }

    @Override // p285z2.o00O0OO
    public final void OooO0O0(Ipc.IpcMessage ipcMessage) {
        C3764cg c3764cg = this.OooO00o;
        if (c3764cg != null) {
            c3764cg.OooOOOo(ipcMessage);
        }
    }
}
