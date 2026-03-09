package p285z2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: z2.su */
/* JADX INFO: loaded from: classes2.dex */
public class C4370su implements Closeable {
    private Socket OoooOoO;
    private InputStream Ooooo00;
    public OutputStream Ooooo0o;
    private boolean OooooOO;
    private boolean OooooOo;
    private C4407tu Oooooo;
    private int Oooooo0;
    private boolean OoooooO;
    private HashMap<Integer, C4481vu> Ooooooo = new HashMap<>();
    private int OoooOoo = 0;
    private Thread OooooO0 = o00oO0o();

    /* JADX INFO: renamed from: z2.su$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ C4370su OoooOoO;

        public OooO00o(C4370su c4370su) {
            this.OoooOoO = c4370su;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p285z2.C4370su.OooO00o.run():void");
        }
    }

    private C4370su() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o00o0O() {
        Iterator<C4481vu> it = this.Ooooooo.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().close();
            } catch (IOException unused) {
            }
        }
        this.Ooooooo.clear();
    }

    private Thread o00oO0o() {
        return new Thread(new OooO00o(this));
    }

    public static C4370su oo000o(Socket socket, C4407tu c4407tu) throws IOException {
        C4370su c4370su = new C4370su();
        c4370su.Oooooo = c4407tu;
        c4370su.OoooOoO = socket;
        c4370su.Ooooo00 = socket.getInputStream();
        c4370su.Ooooo0o = socket.getOutputStream();
        socket.setTcpNoDelay(true);
        return c4370su;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.OooooO0 == null) {
            return;
        }
        this.OoooOoO.close();
        this.OooooO0.interrupt();
        try {
            this.OooooO0.join();
        } catch (InterruptedException unused) {
        }
    }

    public int o00oO0O() throws InterruptedException, IOException {
        if (!this.OooooOO) {
            throw new IllegalStateException("connect() must be called first");
        }
        synchronized (this) {
            if (!this.OooooOo) {
                wait();
            }
            if (!this.OooooOo) {
                throw new IOException("Connection failed");
            }
        }
        return this.Oooooo0;
    }

    public void o00ooo() throws InterruptedException, IOException {
        if (this.OooooOo) {
            throw new IllegalStateException("Already connected");
        }
        this.Ooooo0o.write(C4444uu.OooO0OO());
        this.Ooooo0o.flush();
        this.OooooOO = true;
        this.OooooO0.start();
        synchronized (this) {
            if (!this.OooooOo) {
                wait();
            }
            if (!this.OooooOo) {
                throw new IOException("Connection failed");
            }
        }
    }

    public C4481vu o0ooOO0(String str) throws InterruptedException, IOException {
        int i = this.OoooOoo + 1;
        this.OoooOoo = i;
        if (!this.OooooOO) {
            throw new IllegalStateException("connect() must be called first");
        }
        synchronized (this) {
            if (!this.OooooOo) {
                wait();
            }
            if (!this.OooooOo) {
                throw new IOException("Connection failed");
            }
        }
        C4481vu c4481vu = new C4481vu(this, i);
        this.Ooooooo.put(Integer.valueOf(i), c4481vu);
        this.Ooooo0o.write(C4444uu.OooO0o0(i, str));
        this.Ooooo0o.flush();
        synchronized (c4481vu) {
            c4481vu.wait();
        }
        if (c4481vu.OooooOo()) {
            throw new ConnectException("Stream open actively rejected by remote peer");
        }
        return c4481vu;
    }
}
