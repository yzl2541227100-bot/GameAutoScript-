package p285z2;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class y00 implements j00 {
    public final h00 OoooOoO = new h00();
    public final c10 OoooOoo;
    public boolean Ooooo00;

    public class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            y00 y00Var = y00.this;
            if (y00Var.Ooooo00) {
                throw new IOException("closed");
            }
            return (int) Math.min(y00Var.OoooOoO.OoooOoo, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            y00.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            y00 y00Var = y00.this;
            if (y00Var.Ooooo00) {
                throw new IOException("closed");
            }
            h00 h00Var = y00Var.OoooOoO;
            if (h00Var.OoooOoo == 0 && y00Var.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return y00.this.OoooOoO.readByte() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (y00.this.Ooooo00) {
                throw new IOException("closed");
            }
            f10.OooO0O0(bArr.length, i, i2);
            y00 y00Var = y00.this;
            h00 h00Var = y00Var.OoooOoO;
            if (h00Var.OoooOoo == 0 && y00Var.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return y00.this.OoooOoO.read(bArr, i, i2);
        }

        public String toString() {
            return y00.this + ".inputStream()";
        }
    }

    public y00(c10 c10Var) {
        Objects.requireNonNull(c10Var, "source == null");
        this.OoooOoo = c10Var;
    }

    @Override // p285z2.j00, p285z2.i00
    public h00 OooO00o() {
        return this.OoooOoO;
    }

    @Override // p285z2.j00
    public String OooO0O0(long j) throws IOException {
        OoooOo0(j);
        return this.OoooOoO.OooO0O0(j);
    }

    @Override // p285z2.j00
    public long OooO0OO(ByteString byteString, long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jOooO0OO = this.OoooOoO.OooO0OO(byteString, j);
            if (jOooO0OO != -1) {
                return jOooO0OO;
            }
            h00 h00Var = this.OoooOoO;
            long j2 = h00Var.OoooOoo;
            if (this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - ((long) byteString.size())) + 1);
        }
    }

    @Override // p285z2.j00
    public ByteString OooO0Oo(long j) throws IOException {
        OoooOo0(j);
        return this.OoooOoO.OooO0Oo(j);
    }

    @Override // p285z2.j00
    public byte[] OooOO0O() throws IOException {
        this.OoooOoO.Oooo000(this.OoooOoo);
        return this.OoooOoO.OooOO0O();
    }

    @Override // p285z2.j00
    public long OooOO0o(ByteString byteString) throws IOException {
        return OooO0OO(byteString, 0L);
    }

    @Override // p285z2.j00
    public boolean OooOOO() throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        return this.OoooOoO.OooOOO() && this.OoooOoo.read(this.OoooOoO, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // p285z2.j00
    public long OooOOOo(byte b, long j) throws IOException {
        return OooOOo(b, j, Long.MAX_VALUE);
    }

    @Override // p285z2.j00
    public long OooOOo(byte b, long j, long j2) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        while (j < j2) {
            long jOooOOo = this.OoooOoO.OooOOo(b, j, j2);
            if (jOooOOo != -1) {
                return jOooOOo;
            }
            h00 h00Var = this.OoooOoO;
            long j3 = h00Var.OoooOoo;
            if (j3 >= j2 || this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            j = Math.max(j, j3);
        }
        return -1L;
    }

    @Override // p285z2.j00
    public void OooOOo0(h00 h00Var, long j) throws IOException {
        try {
            OoooOo0(j);
            this.OoooOoO.OooOOo0(h00Var, j);
        } catch (EOFException e) {
            h00Var.Oooo000(this.OoooOoO);
            throw e;
        }
    }

    @Override // p285z2.j00
    public long OooOOoo(ByteString byteString) throws IOException {
        return OoooOOO(byteString, 0L);
    }

    @Override // p285z2.j00
    @Nullable
    public String OooOo00() throws IOException {
        long jOoooo00 = Ooooo00((byte) 10);
        if (jOoooo00 != -1) {
            return this.OoooOoO.o0O0O00(jOoooo00);
        }
        long j = this.OoooOoO.OoooOoo;
        if (j != 0) {
            return OooO0O0(j);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0028, code lost:
    
        if (r1 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x003f, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9] or '-' character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // p285z2.j00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long OooOo0O() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.OoooOo0(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L40
            z2.h00 r3 = r6.OoooOoO
            long r4 = (long) r1
            byte r3 = r3.o00Oo0(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L26
        L1f:
            if (r1 != 0) goto L28
            r4 = 45
            if (r3 == r4) goto L26
            goto L28
        L26:
            r1 = r2
            goto L7
        L28:
            if (r1 == 0) goto L2b
            goto L40
        L2b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L40:
            z2.h00 r0 = r6.OoooOoO
            long r0 = r0.OooOo0O()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.y00.OooOo0O():long");
    }

    @Override // p285z2.j00
    public String OooOo0o(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jOooOOo = OooOOo((byte) 10, 0L, j2);
        if (jOooOOo != -1) {
            return this.OoooOoO.o0O0O00(jOooOOo);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && this.OoooOoO.o00Oo0(j2 - 1) == 13 && request(1 + j2) && this.OoooOoO.o00Oo0(j2) == 10) {
            return this.OoooOoO.o0O0O00(j2);
        }
        h00 h00Var = new h00();
        h00 h00Var2 = this.OoooOoO;
        h00Var2.o0OoOo0(h00Var, 0L, Math.min(32L, h00Var2.o00000O0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.OoooOoO.o00000O0(), j) + " content=" + h00Var.Oooo00o().hex() + (char) 8230);
    }

    @Override // p285z2.j00
    public boolean OooOoO(long j, ByteString byteString) throws IOException {
        return Oooo0o(j, byteString, 0, byteString.size());
    }

    @Override // p285z2.j00
    public String OooOoOO(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.OoooOoO.Oooo000(this.OoooOoo);
        return this.OoooOoO.OooOoOO(charset);
    }

    @Override // p285z2.j00
    public int OooOoo() throws IOException {
        long j;
        OoooOo0(1L);
        byte bO00Oo0 = this.OoooOoO.o00Oo0(0L);
        if ((bO00Oo0 & 224) == 192) {
            j = 2;
        } else {
            if ((bO00Oo0 & 240) != 224) {
                if ((bO00Oo0 & 248) == 240) {
                    j = 4;
                }
                return this.OoooOoO.OooOoo();
            }
            j = 3;
        }
        OoooOo0(j);
        return this.OoooOoO.OooOoo();
    }

    @Override // p285z2.j00
    public ByteString Oooo00o() throws IOException {
        this.OoooOoO.Oooo000(this.OoooOoo);
        return this.OoooOoO.Oooo00o();
    }

    @Override // p285z2.j00
    public String Oooo0OO() throws IOException {
        return OooOo0o(Long.MAX_VALUE);
    }

    @Override // p285z2.j00
    public boolean Oooo0o(long j, ByteString byteString, int i, int i2) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!request(1 + j2) || this.OoooOoO.o00Oo0(j2) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // p285z2.j00
    public int Oooo0o0() throws IOException {
        OoooOo0(4L);
        return this.OoooOoO.Oooo0o0();
    }

    @Override // p285z2.j00
    public byte[] Oooo0oO(long j) throws IOException {
        OoooOo0(j);
        return this.OoooOoO.Oooo0oO(j);
    }

    @Override // p285z2.j00
    public String Oooo0oo() throws IOException {
        this.OoooOoO.Oooo000(this.OoooOoo);
        return this.OoooOoO.Oooo0oo();
    }

    @Override // p285z2.j00
    public long OoooO() throws IOException {
        OoooOo0(8L);
        return this.OoooOoO.OoooO();
    }

    @Override // p285z2.j00
    public String OoooO00(long j, Charset charset) throws IOException {
        OoooOo0(j);
        if (charset != null) {
            return this.OoooOoO.OoooO00(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // p285z2.j00
    public short OoooO0O() throws IOException {
        OoooOo0(2L);
        return this.OoooOoO.OoooO0O();
    }

    @Override // p285z2.j00
    public long OoooOO0(b10 b10Var) throws IOException {
        h00 h00Var;
        if (b10Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (true) {
            long j2 = this.OoooOoo.read(this.OoooOoO, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            h00Var = this.OoooOoO;
            if (j2 == -1) {
                break;
            }
            long jOooooo = h00Var.Oooooo();
            if (jOooooo > 0) {
                j += jOooooo;
                b10Var.OooOooO(this.OoooOoO, jOooooo);
            }
        }
        if (h00Var.o00000O0() <= 0) {
            return j;
        }
        long jO00000O0 = j + this.OoooOoO.o00000O0();
        h00 h00Var2 = this.OoooOoO;
        b10Var.OooOooO(h00Var2, h00Var2.o00000O0());
        return jO00000O0;
    }

    @Override // p285z2.j00
    public long OoooOOO(ByteString byteString, long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jOoooOOO = this.OoooOoO.OoooOOO(byteString, j);
            if (jOoooOOO != -1) {
                return jOoooOOO;
            }
            h00 h00Var = this.OoooOoO;
            long j2 = h00Var.OoooOoo;
            if (this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override // p285z2.j00
    public void OoooOo0(long j) throws IOException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // p285z2.j00
    public long Ooooo00(byte b) throws IOException {
        return OooOOo(b, 0L, Long.MAX_VALUE);
    }

    @Override // p285z2.j00
    public long Ooooo0o() throws IOException {
        byte bO00Oo0;
        OoooOo0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            bO00Oo0 = this.OoooOoO.o00Oo0(i);
            if ((bO00Oo0 < 48 || bO00Oo0 > 57) && ((bO00Oo0 < 97 || bO00Oo0 > 102) && (bO00Oo0 < 65 || bO00Oo0 > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bO00Oo0)));
        }
        return this.OoooOoO.Ooooo0o();
    }

    @Override // p285z2.j00
    public InputStream OooooO0() {
        return new OooO00o();
    }

    @Override // p285z2.j00
    public int OooooOO(v00 v00Var) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        do {
            int iO000000 = this.OoooOoO.o000000(v00Var, true);
            if (iO000000 == -1) {
                return -1;
            }
            if (iO000000 != -2) {
                this.OoooOoO.skip(v00Var.OoooOoO[iO000000].size());
                return iO000000;
            }
        } while (this.OoooOoo.read(this.OoooOoO, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.Ooooo00) {
            return;
        }
        this.Ooooo00 = true;
        this.OoooOoo.close();
        this.OoooOoO.OooooOo();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.Ooooo00;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        h00 h00Var = this.OoooOoO;
        if (h00Var.OoooOoo == 0 && this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.OoooOoO.read(byteBuffer);
    }

    @Override // p285z2.j00
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // p285z2.j00
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = i2;
        f10.OooO0O0(bArr.length, i, j);
        h00 h00Var = this.OoooOoO;
        if (h00Var.OoooOoo == 0 && this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.OoooOoO.read(bArr, i, (int) Math.min(j, this.OoooOoO.OoooOoo));
    }

    @Override // p285z2.c10
    public long read(h00 h00Var, long j) throws IOException {
        if (h00Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        h00 h00Var2 = this.OoooOoO;
        if (h00Var2.OoooOoo == 0 && this.OoooOoo.read(h00Var2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.OoooOoO.read(h00Var, Math.min(j, this.OoooOoO.OoooOoo));
    }

    @Override // p285z2.j00
    public byte readByte() throws IOException {
        OoooOo0(1L);
        return this.OoooOoO.readByte();
    }

    @Override // p285z2.j00
    public void readFully(byte[] bArr) throws IOException {
        try {
            OoooOo0(bArr.length);
            this.OoooOoO.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                h00 h00Var = this.OoooOoO;
                long j = h00Var.OoooOoo;
                if (j <= 0) {
                    throw e;
                }
                int i2 = h00Var.read(bArr, i, (int) j);
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
        }
    }

    @Override // p285z2.j00
    public int readInt() throws IOException {
        OoooOo0(4L);
        return this.OoooOoO.readInt();
    }

    @Override // p285z2.j00
    public long readLong() throws IOException {
        OoooOo0(8L);
        return this.OoooOoO.readLong();
    }

    @Override // p285z2.j00
    public short readShort() throws IOException {
        OoooOo0(2L);
        return this.OoooOoO.readShort();
    }

    @Override // p285z2.j00
    public boolean request(long j) throws IOException {
        h00 h00Var;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        do {
            h00Var = this.OoooOoO;
            if (h00Var.OoooOoo >= j) {
                return true;
            }
        } while (this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // p285z2.j00
    public void skip(long j) throws IOException {
        if (this.Ooooo00) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            h00 h00Var = this.OoooOoO;
            if (h00Var.OoooOoo == 0 && this.OoooOoo.read(h00Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.OoooOoO.o00000O0());
            this.OoooOoO.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p285z2.c10
    public d10 timeout() {
        return this.OoooOoo.timeout();
    }

    public String toString() {
        return "buffer(" + this.OoooOoo + ")";
    }
}
