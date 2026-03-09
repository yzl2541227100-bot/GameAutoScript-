package p285z2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: z2.my */
/* JADX INFO: loaded from: classes2.dex */
public final class C4152my {
    private final C4187nw OooO00o;
    private final C4115ly OooO0O0;
    private final InterfaceC4335rw OooO0OO;
    private final AbstractC3855ex OooO0Oo;
    private int OooO0o;
    private List<Proxy> OooO0o0 = Collections.emptyList();
    private List<InetSocketAddress> OooO0oO = Collections.emptyList();
    private final List<C4373sx> OooO0oo = new ArrayList();

    /* JADX INFO: renamed from: z2.my$OooO00o */
    public static final class OooO00o {
        private final List<C4373sx> OooO00o;
        private int OooO0O0 = 0;

        public OooO00o(List<C4373sx> list) {
            this.OooO00o = list;
        }

        public List<C4373sx> OooO00o() {
            return new ArrayList(this.OooO00o);
        }

        public boolean OooO0O0() {
            return this.OooO0O0 < this.OooO00o.size();
        }

        public C4373sx OooO0OO() {
            if (!OooO0O0()) {
                throw new NoSuchElementException();
            }
            List<C4373sx> list = this.OooO00o;
            int i = this.OooO0O0;
            this.OooO0O0 = i + 1;
            return list.get(i);
        }
    }

    public C4152my(C4187nw c4187nw, C4115ly c4115ly, InterfaceC4335rw interfaceC4335rw, AbstractC3855ex abstractC3855ex) {
        this.OooO00o = c4187nw;
        this.OooO0O0 = c4115ly;
        this.OooO0OO = interfaceC4335rw;
        this.OooO0Oo = abstractC3855ex;
        OooO0oo(c4187nw.OooOO0o(), c4187nw.OooO0oO());
    }

    public static String OooO0O0(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean OooO0Oo() {
        return this.OooO0o < this.OooO0o0.size();
    }

    private Proxy OooO0o() throws IOException {
        if (OooO0Oo()) {
            List<Proxy> list = this.OooO0o0;
            int i = this.OooO0o;
            this.OooO0o = i + 1;
            Proxy proxy = list.get(i);
            OooO0oO(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.OooO00o.OooOO0o().OooOOOo() + "; exhausted proxy configurations: " + this.OooO0o0);
    }

    private void OooO0oO(Proxy proxy) throws IOException {
        String strOooOOOo;
        int iOooOooo;
        this.OooO0oO = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strOooOOOo = this.OooO00o.OooOO0o().OooOOOo();
            iOooOooo = this.OooO00o.OooOO0o().OooOooo();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strOooOOOo = OooO0O0(inetSocketAddress);
            iOooOooo = inetSocketAddress.getPort();
        }
        if (iOooOooo < 1 || iOooOooo > 65535) {
            throw new SocketException("No route to " + strOooOOOo + ":" + iOooOooo + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.OooO0oO.add(InetSocketAddress.createUnresolved(strOooOOOo, iOooOooo));
            return;
        }
        this.OooO0Oo.OooOO0(this.OooO0OO, strOooOOOo);
        List<InetAddress> listOooO00o = this.OooO00o.OooO0OO().OooO00o(strOooOOOo);
        if (listOooO00o.isEmpty()) {
            throw new UnknownHostException(this.OooO00o.OooO0OO() + " returned no addresses for " + strOooOOOo);
        }
        this.OooO0Oo.OooO(this.OooO0OO, strOooOOOo, listOooO00o);
        int size = listOooO00o.size();
        for (int i = 0; i < size; i++) {
            this.OooO0oO.add(new InetSocketAddress(listOooO00o.get(i), iOooOooo));
        }
    }

    private void OooO0oo(C4003ix c4003ix, Proxy proxy) {
        List<Proxy> listOooOo0O;
        if (proxy != null) {
            listOooOo0O = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.OooO00o.OooO().select(c4003ix.OoooO0());
            listOooOo0O = (listSelect == null || listSelect.isEmpty()) ? C4558xx.OooOo0O(Proxy.NO_PROXY) : C4558xx.OooOo0(listSelect);
        }
        this.OooO0o0 = listOooOo0O;
        this.OooO0o = 0;
    }

    public void OooO00o(C4373sx c4373sx, IOException iOException) {
        if (c4373sx.OooO0O0().type() != Proxy.Type.DIRECT && this.OooO00o.OooO() != null) {
            this.OooO00o.OooO().connectFailed(this.OooO00o.OooOO0o().OoooO0(), c4373sx.OooO0O0().address(), iOException);
        }
        this.OooO0O0.OooO0O0(c4373sx);
    }

    public boolean OooO0OO() {
        return OooO0Oo() || !this.OooO0oo.isEmpty();
    }

    public OooO00o OooO0o0() throws IOException {
        if (!OooO0OO()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (OooO0Oo()) {
            Proxy proxyOooO0o = OooO0o();
            int size = this.OooO0oO.size();
            for (int i = 0; i < size; i++) {
                C4373sx c4373sx = new C4373sx(this.OooO00o, proxyOooO0o, this.OooO0oO.get(i));
                if (this.OooO0O0.OooO0OO(c4373sx)) {
                    this.OooO0oo.add(c4373sx);
                } else {
                    arrayList.add(c4373sx);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.OooO0oo);
            this.OooO0oo.clear();
        }
        return new OooO00o(arrayList);
    }
}
