package p285z2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: z2.k2 */
/* JADX INFO: loaded from: classes.dex */
public class C4046k2 extends InputStream {
    private static final Queue<C4046k2> Ooooo00 = C4379t2.OooO0o(0);
    private InputStream OoooOoO;
    private IOException OoooOoo;

    public static void OooOO0() {
        while (true) {
            Queue<C4046k2> queue = Ooooo00;
            if (queue.isEmpty()) {
                return;
            } else {
                queue.remove();
            }
        }
    }

    @NonNull
    public static C4046k2 Oooooo0(@NonNull InputStream inputStream) {
        C4046k2 c4046k2Poll;
        Queue<C4046k2> queue = Ooooo00;
        synchronized (queue) {
            c4046k2Poll = queue.poll();
        }
        if (c4046k2Poll == null) {
            c4046k2Poll = new C4046k2();
        }
        c4046k2Poll.OoooooO(inputStream);
        return c4046k2Poll;
    }

    @Nullable
    public IOException OooooOo() {
        return this.OoooOoo;
    }

    public void Oooooo() {
        this.OoooOoo = null;
        this.OoooOoO = null;
        Queue<C4046k2> queue = Ooooo00;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void OoooooO(@NonNull InputStream inputStream) {
        this.OoooOoO = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.OoooOoO.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.OoooOoO.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.OoooOoO.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.OoooOoO.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.OoooOoO.read();
        } catch (IOException e) {
            this.OoooOoo = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.OoooOoO.read(bArr);
        } catch (IOException e) {
            this.OoooOoo = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.OoooOoO.read(bArr, i, i2);
        } catch (IOException e) {
            this.OoooOoo = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.OoooOoO.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.OoooOoO.skip(j);
        } catch (IOException e) {
            this.OoooOoo = e;
            return 0L;
        }
    }
}
