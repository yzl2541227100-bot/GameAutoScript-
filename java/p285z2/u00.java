package p285z2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class u00 {
    public static final Logger OooO00o = Logger.getLogger(u00.class.getName());

    public class OooO00o implements b10 {
        public final /* synthetic */ d10 OoooOoO;
        public final /* synthetic */ OutputStream OoooOoo;

        public OooO00o(d10 d10Var, OutputStream outputStream) {
            this.OoooOoO = d10Var;
            this.OoooOoo = outputStream;
        }

        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            f10.OooO0O0(h00Var.OoooOoo, 0L, j);
            while (j > 0) {
                this.OoooOoO.OooO0oO();
                z00 z00Var = h00Var.OoooOoO;
                int iMin = (int) Math.min(j, z00Var.OooO0OO - z00Var.OooO0O0);
                this.OoooOoo.write(z00Var.OooO00o, z00Var.OooO0O0, iMin);
                int i = z00Var.OooO0O0 + iMin;
                z00Var.OooO0O0 = i;
                long j2 = iMin;
                j -= j2;
                h00Var.OoooOoo -= j2;
                if (i == z00Var.OooO0OO) {
                    h00Var.OoooOoO = z00Var.OooO0O0();
                    a10.OooO00o(z00Var);
                }
            }
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.OoooOoo.close();
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
            this.OoooOoo.flush();
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return this.OoooOoO;
        }

        public String toString() {
            return "sink(" + this.OoooOoo + ")";
        }
    }

    public class OooO0O0 implements c10 {
        public final /* synthetic */ d10 OoooOoO;
        public final /* synthetic */ InputStream OoooOoo;

        public OooO0O0(d10 d10Var, InputStream inputStream) {
            this.OoooOoO = d10Var;
            this.OoooOoo = inputStream;
        }

        @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.OoooOoo.close();
        }

        @Override // p285z2.c10
        public long read(h00 h00Var, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.OoooOoO.OooO0oO();
                z00 z00VarO00000Oo = h00Var.o00000Oo(1);
                int i = this.OoooOoo.read(z00VarO00000Oo.OooO00o, z00VarO00000Oo.OooO0OO, (int) Math.min(j, 8192 - z00VarO00000Oo.OooO0OO));
                if (i == -1) {
                    return -1L;
                }
                z00VarO00000Oo.OooO0OO += i;
                long j2 = i;
                h00Var.OoooOoo += j2;
                return j2;
            } catch (AssertionError e) {
                if (u00.OooO0o0(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // p285z2.c10
        public d10 timeout() {
            return this.OoooOoO;
        }

        public String toString() {
            return "source(" + this.OoooOoo + ")";
        }
    }

    public class OooO0OO implements b10 {
        @Override // p285z2.b10
        public void OooOooO(h00 h00Var, long j) throws IOException {
            h00Var.skip(j);
        }

        @Override // p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p285z2.b10, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // p285z2.b10
        public d10 timeout() {
            return d10.OooO0Oo;
        }
    }

    public class OooO0o extends f00 {
        public final /* synthetic */ Socket OooOO0o;

        public OooO0o(Socket socket) {
            this.OooOO0o = socket;
        }

        @Override // p285z2.f00
        public IOException OooOOo0(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p285z2.f00
        public void OooOo0O() {
            Level level;
            StringBuilder sb;
            Logger logger;
            Throwable th;
            try {
                this.OooOO0o.close();
            } catch (AssertionError e) {
                if (!u00.OooO0o0(e)) {
                    throw e;
                }
                Logger logger2 = u00.OooO00o;
                level = Level.WARNING;
                sb = new StringBuilder();
                th = e;
                logger = logger2;
                sb.append("Failed to close timed out socket ");
                sb.append(this.OooOO0o);
                logger.log(level, sb.toString(), th);
            } catch (Exception e2) {
                Logger logger3 = u00.OooO00o;
                level = Level.WARNING;
                sb = new StringBuilder();
                th = e2;
                logger = logger3;
                sb.append("Failed to close timed out socket ");
                sb.append(this.OooOO0o);
                logger.log(level, sb.toString(), th);
            }
        }
    }

    private u00() {
    }

    public static b10 OooO(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        f00 f00VarOooOOOo = OooOOOo(socket);
        return f00VarOooOOOo.OooOo00(OooO0oo(socket.getOutputStream(), f00VarOooOOOo));
    }

    public static b10 OooO00o(File file) throws FileNotFoundException {
        if (file != null) {
            return OooO0oO(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static b10 OooO0O0() {
        return new OooO0OO();
    }

    public static i00 OooO0OO(b10 b10Var) {
        return new x00(b10Var);
    }

    public static j00 OooO0Oo(c10 c10Var) {
        return new y00(c10Var);
    }

    public static b10 OooO0o(File file) throws FileNotFoundException {
        if (file != null) {
            return OooO0oO(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static boolean OooO0o0(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static b10 OooO0oO(OutputStream outputStream) {
        return OooO0oo(outputStream, new d10());
    }

    private static b10 OooO0oo(OutputStream outputStream, d10 d10Var) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (d10Var != null) {
            return new OooO00o(d10Var, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    @IgnoreJRERequirement
    public static b10 OooOO0(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return OooO0oO(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static c10 OooOO0O(File file) throws FileNotFoundException {
        if (file != null) {
            return OooOO0o(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static c10 OooOO0o(InputStream inputStream) {
        return OooOOO0(inputStream, new d10());
    }

    public static c10 OooOOO(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        f00 f00VarOooOOOo = OooOOOo(socket);
        return f00VarOooOOOo.OooOo0(OooOOO0(socket.getInputStream(), f00VarOooOOOo));
    }

    private static c10 OooOOO0(InputStream inputStream, d10 d10Var) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (d10Var != null) {
            return new OooO0O0(d10Var, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    @IgnoreJRERequirement
    public static c10 OooOOOO(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return OooOO0o(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    private static f00 OooOOOo(Socket socket) {
        return new OooO0o(socket);
    }
}
