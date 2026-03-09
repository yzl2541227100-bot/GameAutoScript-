package p285z2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: z2.dx */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3818dx {
    public static final InterfaceC3818dx OooO00o = new OooO00o();

    /* JADX INFO: renamed from: z2.dx$OooO00o */
    public class OooO00o implements InterfaceC3818dx {
        @Override // p285z2.InterfaceC3818dx
        public List<InetAddress> OooO00o(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    List<InetAddress> OooO00o(String str) throws UnknownHostException;
}
