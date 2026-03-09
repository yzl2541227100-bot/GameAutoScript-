package p285z2;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class o0OoO00O implements Closeable {
    private static final byte OooooOO = 13;
    private static final byte OooooOo = 10;
    private final InputStream OoooOoO;
    private final Charset OoooOoo;
    private byte[] Ooooo00;
    private int Ooooo0o;
    private int OooooO0;

    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, o0OoO00O.this.OoooOoo.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public o0OoO00O(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(o0O00O0o.OooO00o)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.OoooOoO = inputStream;
        this.OoooOoo = charset;
        this.Ooooo00 = new byte[i];
    }

    public o0OoO00O(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void OooooOo() throws IOException {
        InputStream inputStream = this.OoooOoO;
        byte[] bArr = this.Ooooo00;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.Ooooo0o = 0;
        this.OooooO0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Oooooo() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.OoooOoO
            monitor-enter(r0)
            byte[] r1 = r7.Ooooo00     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L83
            int r1 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.OooooO0     // Catch: java.lang.Throwable -> L8b
            if (r1 < r2) goto L10
            r7.OooooOo()     // Catch: java.lang.Throwable -> L8b
        L10:
            int r1 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
        L12:
            int r2 = r7.OooooO0     // Catch: java.lang.Throwable -> L8b
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.Ooooo00     // Catch: java.lang.Throwable -> L8b
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L8b
            if (r4 != r3) goto L42
            int r3 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
            if (r1 == r3) goto L2b
            int r3 = r1 + (-1)
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L8b
            r4 = 13
            if (r2 != r4) goto L2b
            goto L2c
        L2b:
            r3 = r1
        L2c:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L8b
            byte[] r4 = r7.Ooooo00     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 - r5
            java.nio.charset.Charset r6 = r7.OoooOoo     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L8b
            int r1 = r1 + 1
            r7.Ooooo0o = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r2
        L42:
            int r1 = r1 + 1
            goto L12
        L45:
            z2.o0OoO00O$OooO00o r1 = new z2.o0OoO00O$OooO00o     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.OooooO0     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
        L51:
            byte[] r2 = r7.Ooooo00     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.OooooO0     // Catch: java.lang.Throwable -> L8b
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L8b
            r2 = -1
            r7.OooooO0 = r2     // Catch: java.lang.Throwable -> L8b
            r7.OooooOo()     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
        L63:
            int r4 = r7.OooooO0     // Catch: java.lang.Throwable -> L8b
            if (r2 == r4) goto L51
            byte[] r4 = r7.Ooooo00     // Catch: java.lang.Throwable -> L8b
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L8b
            if (r5 != r3) goto L80
            int r3 = r7.Ooooo0o     // Catch: java.lang.Throwable -> L8b
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L8b
        L76:
            int r2 = r2 + 1
            r7.Ooooo0o = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.o0OoO00O.Oooooo():java.lang.String");
    }

    public boolean Oooooo0() {
        return this.OooooO0 == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.OoooOoO) {
            if (this.Ooooo00 != null) {
                this.Ooooo00 = null;
                this.OoooOoO.close();
            }
        }
    }
}
