package mobi.oneway.export.p279d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: mobi.oneway.export.d.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3605c extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    private final SSLSocketFactory f19670a;

    /* JADX INFO: renamed from: mobi.oneway.export.d.c$a */
    public class a extends SSLSocket {

        /* JADX INFO: renamed from: a */
        public final SSLSocket f19671a;

        public a(SSLSocket sSLSocket) {
            this.f19671a = sSLSocket;
        }

        @Override // javax.net.ssl.SSLSocket
        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f19671a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) {
            this.f19671a.bind(socketAddress);
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f19671a.close();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) {
            this.f19671a.connect(socketAddress);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i) {
            this.f19671a.connect(socketAddress, i);
        }

        public boolean equals(Object obj) {
            return this.f19671a.equals(obj);
        }

        @Override // java.net.Socket
        public SocketChannel getChannel() {
            return this.f19671a.getChannel();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getEnableSessionCreation() {
            return this.f19671a.getEnableSessionCreation();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledCipherSuites() {
            return this.f19671a.getEnabledCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledProtocols() {
            return this.f19671a.getEnabledProtocols();
        }

        @Override // java.net.Socket
        public InetAddress getInetAddress() {
            return this.f19671a.getInetAddress();
        }

        @Override // java.net.Socket
        public InputStream getInputStream() {
            return this.f19671a.getInputStream();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() {
            return this.f19671a.getKeepAlive();
        }

        @Override // java.net.Socket
        public InetAddress getLocalAddress() {
            return this.f19671a.getLocalAddress();
        }

        @Override // java.net.Socket
        public int getLocalPort() {
            return this.f19671a.getLocalPort();
        }

        @Override // java.net.Socket
        public SocketAddress getLocalSocketAddress() {
            return this.f19671a.getLocalSocketAddress();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getNeedClientAuth() {
            return this.f19671a.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() {
            return this.f19671a.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() {
            return this.f19671a.getOutputStream();
        }

        @Override // java.net.Socket
        public int getPort() {
            return this.f19671a.getPort();
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() {
            return this.f19671a.getReceiveBufferSize();
        }

        @Override // java.net.Socket
        public SocketAddress getRemoteSocketAddress() {
            return this.f19671a.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() {
            return this.f19671a.getReuseAddress();
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() {
            return this.f19671a.getSendBufferSize();
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLSession getSession() {
            return this.f19671a.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() {
            return this.f19671a.getSoLinger();
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() {
            return this.f19671a.getSoTimeout();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedCipherSuites() {
            return this.f19671a.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedProtocols() {
            return this.f19671a.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() {
            return this.f19671a.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() {
            return this.f19671a.getTrafficClass();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getUseClientMode() {
            return this.f19671a.getUseClientMode();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getWantClientAuth() {
            return this.f19671a.getWantClientAuth();
        }

        @Override // java.net.Socket
        public boolean isBound() {
            return this.f19671a.isBound();
        }

        @Override // java.net.Socket
        public boolean isClosed() {
            return this.f19671a.isClosed();
        }

        @Override // java.net.Socket
        public boolean isConnected() {
            return this.f19671a.isConnected();
        }

        @Override // java.net.Socket
        public boolean isInputShutdown() {
            return this.f19671a.isInputShutdown();
        }

        @Override // java.net.Socket
        public boolean isOutputShutdown() {
            return this.f19671a.isOutputShutdown();
        }

        @Override // javax.net.ssl.SSLSocket
        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f19671a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i) {
            this.f19671a.sendUrgentData(i);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnableSessionCreation(boolean z) {
            this.f19671a.setEnableSessionCreation(z);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledCipherSuites(String[] strArr) {
            this.f19671a.setEnabledCipherSuites(strArr);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            this.f19671a.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z) {
            this.f19671a.setKeepAlive(z);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setNeedClientAuth(boolean z) {
            this.f19671a.setNeedClientAuth(z);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z) {
            this.f19671a.setOOBInline(z);
        }

        @Override // java.net.Socket
        public void setPerformancePreferences(int i, int i2, int i3) {
            this.f19671a.setPerformancePreferences(i, i2, i3);
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i) {
            this.f19671a.setReceiveBufferSize(i);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z) {
            this.f19671a.setReuseAddress(z);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i) {
            this.f19671a.setSendBufferSize(i);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z, int i) {
            this.f19671a.setSoLinger(z, i);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i) {
            this.f19671a.setSoTimeout(i);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z) {
            this.f19671a.setTcpNoDelay(z);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i) {
            this.f19671a.setTrafficClass(i);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setUseClientMode(boolean z) {
            this.f19671a.setUseClientMode(z);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setWantClientAuth(boolean z) {
            this.f19671a.setWantClientAuth(z);
        }

        @Override // java.net.Socket
        public void shutdownInput() {
            this.f19671a.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() {
            this.f19671a.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() throws IOException {
            this.f19671a.startHandshake();
        }

        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public String toString() {
            return this.f19671a.toString();
        }
    }

    /* JADX INFO: renamed from: mobi.oneway.export.d.c$b */
    public class b extends a {
        private b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        @Override // mobi.oneway.export.p279d.C3605c.a, javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            PrintStream printStream;
            String str;
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f19671a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                    printStream = System.out;
                    str = "Removed SSLv3 from enabled protocols";
                } else {
                    printStream = System.out;
                    str = "SSL stuck with protocol available for " + String.valueOf(arrayList);
                }
                printStream.println(str);
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }
    }

    public C3605c() {
        this.f19670a = HttpsURLConnection.getDefaultSSLSocketFactory();
    }

    public C3605c(SSLSocketFactory sSLSocketFactory) {
        this.f19670a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: a */
    private Socket m16750a(Socket socket) {
        return socket instanceof SSLSocket ? new b((SSLSocket) socket) : socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return m16750a(this.f19670a.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m16750a(this.f19670a.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return m16750a(this.f19670a.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m16750a(this.f19670a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m16750a(this.f19670a.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f19670a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f19670a.getSupportedCipherSuites();
    }
}
