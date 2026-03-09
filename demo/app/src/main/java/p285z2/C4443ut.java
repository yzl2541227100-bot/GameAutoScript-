package p285z2;

import com.hlzn.socketclient.pbmsg.MessageProtobuf;

/* JADX INFO: renamed from: z2.ut */
/* JADX INFO: loaded from: classes2.dex */
public class C4443ut {
    private InterfaceC3778cu OooO00o;

    public void OooO00o(MessageProtobuf.Heartbeat heartbeat) {
        InterfaceC3778cu interfaceC3778cu = this.OooO00o;
        if (interfaceC3778cu == null) {
            return;
        }
        interfaceC3778cu.OooO0OO(heartbeat);
    }

    public void OooO0O0(InterfaceC3778cu interfaceC3778cu) {
        this.OooO00o = interfaceC3778cu;
    }
}
