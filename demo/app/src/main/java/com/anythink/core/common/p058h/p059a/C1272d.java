package com.anythink.core.common.p058h.p059a;

import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p058h.p059a.AbstractC1271c;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: renamed from: com.anythink.core.common.h.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1272d {

    /* JADX INFO: renamed from: g */
    private static C1272d f4614g;

    /* JADX INFO: renamed from: h */
    private String f4621h;

    /* JADX INFO: renamed from: i */
    private int f4622i;

    /* JADX INFO: renamed from: j */
    private Socket f4623j;

    /* JADX INFO: renamed from: c */
    private final int f4617c = 0;

    /* JADX INFO: renamed from: d */
    private final int f4618d = 7;

    /* JADX INFO: renamed from: e */
    private final int f4619e = 1;

    /* JADX INFO: renamed from: f */
    private final String f4620f = C1272d.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public byte[] f4615a = null;

    /* JADX INFO: renamed from: b */
    public byte[] f4616b = new byte[1];

    /* JADX INFO: renamed from: com.anythink.core.common.h.a.d$1 */
    public class AnonymousClass1 extends AbstractRunnableC1337d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1271c f4624a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC1271c.a f4625b;

        public AnonymousClass1(AbstractC1271c abstractC1271c, AbstractC1271c.a aVar) {
            this.f4624a = abstractC1271c;
            this.f4625b = aVar;
        }

        @Override // com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d
        /* JADX INFO: renamed from: a */
        public final void mo1492a() {
            try {
                try {
                    C1272d.this.m3664a(this.f4624a);
                    int iM3673e = C1272d.this.m3673e();
                    if (iM3673e != 1) {
                        throw new Exception("Response Error Code:".concat(String.valueOf(iM3673e)));
                    }
                    AbstractC1271c.a aVar = this.f4625b;
                    if (aVar != null) {
                        aVar.mo3660a(this.f4624a);
                    }
                } catch (SocketException unused) {
                    C1272d.m3668b(C1272d.this);
                    C1272d.this.m3664a(this.f4624a);
                    int iM3673e2 = C1272d.this.m3673e();
                    if (iM3673e2 != 1) {
                        throw new Exception("Response Error Code:".concat(String.valueOf(iM3673e2)));
                    }
                    AbstractC1271c.a aVar2 = this.f4625b;
                    if (aVar2 != null) {
                        aVar2.mo3660a(this.f4624a);
                    }
                }
            } catch (Throwable th) {
                this.f4624a.mo3648a("", th.getMessage() + "," + C1345i.m4155a(th.getStackTrace()), C1272d.this.f4621h, C1272d.this.f4622i);
                AbstractC1271c.a aVar3 = this.f4625b;
                if (aVar3 != null) {
                    aVar3.mo3661a(th);
                }
            }
        }
    }

    private C1272d() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C1272d m3663a() {
        if (f4614g == null) {
            f4614g = new C1272d();
        }
        return f4614g;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3664a(AbstractC1271c abstractC1271c) {
        Socket socket = this.f4623j;
        if (!((socket == null || !socket.isConnected() || this.f4623j.isClosed()) ? false : true)) {
            synchronized (this) {
                if (this.f4623j == null) {
                    Socket socket2 = new Socket();
                    this.f4623j = socket2;
                    socket2.setSoTimeout(60000);
                }
                C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                if (c1391aM4865b != null) {
                    this.f4621h = c1391aM4865b.m4779x();
                    this.f4622i = c1391aM4865b.m4780y();
                    this.f4623j.connect(new InetSocketAddress(this.f4621h, this.f4622i), 30000);
                }
            }
        }
        byte[] bArrMo3652e = abstractC1271c.mo3652e();
        if (bArrMo3652e != null) {
            int length = bArrMo3652e.length;
            if (bArrMo3652e.length == 0) {
                return;
            }
            int i = length + 7;
            byte[] bArr = this.f4615a;
            if (bArr == null || bArr.length < i) {
                this.f4615a = new byte[i];
            }
            byte[] bArr2 = this.f4615a;
            bArr2[0] = 0;
            bArr2[1] = 3;
            bArr2[2] = (byte) abstractC1271c.mo3650c();
            byte[] bArr3 = this.f4615a;
            bArr3[3] = (byte) ((length >>> 24) & 255);
            bArr3[4] = (byte) ((length >>> 16) & 255);
            bArr3[5] = (byte) ((length >>> 8) & 255);
            bArr3[6] = (byte) ((length >>> 0) & 255);
            System.arraycopy(bArrMo3652e, 0, bArr3, 7, bArrMo3652e.length);
            OutputStream outputStream = this.f4623j.getOutputStream();
            outputStream.write(this.f4615a, 0, i);
            outputStream.flush();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3665a(AbstractC1271c abstractC1271c, AbstractC1271c.a aVar) {
        C1335b.m3998a().m4004a((AbstractRunnableC1337d) new AnonymousClass1(abstractC1271c, aVar), 3);
    }

    /* JADX INFO: renamed from: b */
    private void m3667b() {
        synchronized (this) {
            if (this.f4623j == null) {
                Socket socket = new Socket();
                this.f4623j = socket;
                socket.setSoTimeout(60000);
            }
            C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
            if (c1391aM4865b != null) {
                this.f4621h = c1391aM4865b.m4779x();
                this.f4622i = c1391aM4865b.m4780y();
                this.f4623j.connect(new InetSocketAddress(this.f4621h, this.f4622i), 30000);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3668b(C1272d c1272d) {
        synchronized (c1272d) {
            try {
                Socket socket = c1272d.f4623j;
                if (socket != null) {
                    socket.close();
                    c1272d.f4623j = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3670c() {
        synchronized (this) {
            try {
                Socket socket = this.f4623j;
                if (socket != null) {
                    socket.close();
                    this.f4623j = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m3672d() {
        Socket socket = this.f4623j;
        return (socket == null || !socket.isConnected() || this.f4623j.isClosed()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public synchronized int m3673e() {
        byte b;
        if (this.f4623j.getInputStream().read(this.f4616b, 0, 1) == -1) {
            throw new SocketException("Socket.InputStream read length = -1!");
        }
        byte[] bArr = this.f4616b;
        b = bArr[0];
        bArr[0] = 0;
        return b;
    }
}
