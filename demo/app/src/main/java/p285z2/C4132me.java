package p285z2;

import com.cyjh.mobileanjian.ipc.share.proto.Ipc;

/* JADX INFO: renamed from: z2.me */
/* JADX INFO: loaded from: classes2.dex */
public final class C4132me extends AbstractC4169ne {
    private Ipc.IpcMessage OooO00o;

    public C4132me(Ipc.IpcMessage ipcMessage) {
        this.OooO00o = null;
        this.OooO00o = ipcMessage;
    }

    public static final Ipc.IpcMessage OooO0OO(int i) {
        return Ipc.IpcMessage.newBuilder().setCmd(i).build();
    }

    @Override // p285z2.AbstractC4169ne
    public final byte[] OooO00o() {
        Ipc.IpcMessage ipcMessage = this.OooO00o;
        if (ipcMessage == null) {
            return null;
        }
        return ipcMessage.toByteArray();
    }
}
