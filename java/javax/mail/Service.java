package javax.mail;

import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.umeng.analytics.pro.C3380b;
import java.net.UnknownHostException;
import java.util.EventListener;
import java.util.Vector;
import java.util.concurrent.Executor;
import javax.mail.event.ConnectionEvent;
import javax.mail.event.ConnectionListener;
import javax.mail.event.MailEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Service implements AutoCloseable {
    private boolean connected = false;
    private final Vector<ConnectionListener> connectionListeners = new Vector<>();
    public boolean debug;

    /* JADX INFO: renamed from: q */
    private final EventQueue f19527q;
    public Session session;
    public volatile URLName url;

    public Service(Session session, URLName uRLName) {
        String property;
        String str;
        String file;
        String password;
        int i;
        String property2;
        String property3 = null;
        this.url = null;
        this.debug = false;
        this.session = session;
        this.debug = session.getDebug();
        this.url = uRLName;
        if (this.url != null) {
            String protocol = this.url.getProtocol();
            String host = this.url.getHost();
            int port = this.url.getPort();
            property = this.url.getUsername();
            i = port;
            password = this.url.getPassword();
            file = this.url.getFile();
            str = protocol;
            property3 = host;
        } else {
            property = null;
            str = null;
            file = null;
            password = null;
            i = -1;
        }
        if (str != null) {
            if (property3 == null) {
                property3 = session.getProperty("mail." + str + ".host");
            }
            if (property == null) {
                property = session.getProperty("mail." + str + ".user");
            }
        }
        String property4 = property3 == null ? session.getProperty("mail.host") : property3;
        property = property == null ? session.getProperty("mail.user") : property;
        if (property == null) {
            try {
                property2 = System.getProperty("user.name");
            } catch (SecurityException unused) {
                property2 = property;
            }
        } else {
            property2 = property;
        }
        this.url = new URLName(str, property4, i, file, property2, password);
        String property5 = session.getProperties().getProperty("mail.event.scope", "folder");
        Executor executor = (Executor) session.getProperties().get("mail.event.executor");
        this.f19527q = property5.equalsIgnoreCase(C1732o.f9734d) ? EventQueue.getApplicationEventQueue(executor) : property5.equalsIgnoreCase(C3380b.f18376ac) ? session.getEventQueue() : new EventQueue(executor);
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        this.connectionListeners.addElement(connectionListener);
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() throws MessagingException {
        setConnected(false);
        notifyConnectionListeners(3);
    }

    public void connect() throws MessagingException {
        connect(null, null, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(6:8|(1:10)(1:11)|12|(1:14)(1:15)|(3:17|(2:19|20)|25)(2:(2:24|20)|25)|26)(1:27)|(2:(1:30)|(1:32))|(1:34)|(1:36)|(2:93|38)|41|(1:54)(2:45|(2:(1:48)(2:50|(0))|49)(6:53|89|56|57|(5:91|61|62|64|(1:66))|(1:(1:(1:(2:71|72)(2:73|74))(2:75|76))(1:77))(4:78|(1:80)|81|82)))|55|89|56|57|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0108, code lost:
    
        r16 = r0;
        r0 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d A[Catch: all -> 0x017c, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x000f, B:10:0x0017, B:14:0x0025, B:17:0x002f, B:19:0x0037, B:20:0x0039, B:26:0x0051, B:30:0x0069, B:32:0x0084, B:34:0x009f, B:36:0x00a9, B:38:0x00b3, B:43:0x00be, B:45:0x00c2, B:48:0x00e4, B:49:0x00e8, B:56:0x0100, B:61:0x010d, B:64:0x0114, B:66:0x0120, B:71:0x0134, B:72:0x013b, B:73:0x013c, B:74:0x0143, B:75:0x0144, B:76:0x014b, B:77:0x014c, B:78:0x014d, B:80:0x015e, B:81:0x016c, B:50:0x00ed, B:22:0x0040, B:24:0x004c, B:84:0x0174, B:85:0x017b), top: B:95:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void connect(java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21) throws javax.mail.MessagingException, java.net.UnknownHostException {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: javax.mail.Service.connect(java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public void connect(String str, String str2) throws MessagingException, UnknownHostException {
        connect(null, str, str2);
    }

    public void connect(String str, String str2, String str3) throws MessagingException, UnknownHostException {
        connect(str, -1, str2, str3);
    }

    public void finalize() throws Throwable {
        try {
            this.f19527q.terminateQueue();
        } finally {
            super.finalize();
        }
    }

    public EventQueue getEventQueue() {
        return this.f19527q;
    }

    public Session getSession() {
        return this.session;
    }

    public URLName getURLName() {
        URLName uRLName = this.url;
        return (uRLName == null || (uRLName.getPassword() == null && uRLName.getFile() == null)) ? uRLName : new URLName(uRLName.getProtocol(), uRLName.getHost(), uRLName.getPort(), null, uRLName.getUsername(), null);
    }

    public synchronized boolean isConnected() {
        return this.connected;
    }

    public void notifyConnectionListeners(int i) {
        if (this.connectionListeners.size() > 0) {
            queueEvent(new ConnectionEvent(this, i), this.connectionListeners);
        }
        if (i == 3) {
            this.f19527q.terminateQueue();
        }
    }

    public boolean protocolConnect(String str, int i, String str2, String str3) throws MessagingException {
        return false;
    }

    public void queueEvent(MailEvent mailEvent, Vector<? extends EventListener> vector) {
        this.f19527q.enqueue(mailEvent, (Vector) vector.clone());
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.connectionListeners.removeElement(connectionListener);
    }

    public synchronized void setConnected(boolean z) {
        this.connected = z;
    }

    public void setURLName(URLName uRLName) {
        this.url = uRLName;
    }

    public String toString() {
        URLName uRLName = getURLName();
        return uRLName != null ? uRLName.toString() : super.toString();
    }
}
