package p285z2;

import android.support.v4.media.session.PlaybackStateCompat;
import com.anythink.expressad.exoplayer.C1500b;
import com.umeng.commonsdk.amap.UMAmapConfig;
import com.umeng.commonsdk.proguard.C3442bg;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.UIDFolder;
import okio.ByteString;
import okio.SegmentedByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class h00 implements j00, i00, Cloneable, ByteChannel {
    private static final byte[] Ooooo00 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final int Ooooo0o = 65533;

    @Nullable
    public z00 OoooOoO;
    public long OoooOoo;

    public class OooO00o extends OutputStream {
        public OooO00o() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return h00.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            h00.this.OooOOOO((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            h00.this.OooOoo0(bArr, i, i2);
        }
    }

    public class OooO0O0 extends InputStream {
        public OooO0O0() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(h00.this.OoooOoo, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            h00 h00Var = h00.this;
            if (h00Var.OoooOoo > 0) {
                return h00Var.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return h00.this.read(bArr, i, i2);
        }

        public String toString() {
            return h00.this + ".inputStream()";
        }
    }

    public static final class OooO0OO implements Closeable {
        public h00 OoooOoO;
        public boolean OoooOoo;
        private z00 Ooooo00;
        public byte[] OooooO0;
        public long Ooooo0o = -1;
        public int OooooOO = -1;
        public int OooooOo = -1;

        public final long OooOO0(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i);
            }
            if (i > 8192) {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i);
            }
            h00 h00Var = this.OoooOoO;
            if (h00Var == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.OoooOoo) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long j = h00Var.OoooOoo;
            z00 z00VarO00000Oo = h00Var.o00000Oo(i);
            int i2 = 8192 - z00VarO00000Oo.OooO0OO;
            z00VarO00000Oo.OooO0OO = 8192;
            long j2 = i2;
            this.OoooOoO.OoooOoo = j + j2;
            this.Ooooo00 = z00VarO00000Oo;
            this.Ooooo0o = j;
            this.OooooO0 = z00VarO00000Oo.OooO00o;
            this.OooooOO = 8192 - i2;
            this.OooooOo = 8192;
            return j2;
        }

        public final int OooooOo() {
            long j = this.Ooooo0o;
            if (j != this.OoooOoO.OoooOoo) {
                return Oooooo(j == -1 ? 0L : j + ((long) (this.OooooOo - this.OooooOO)));
            }
            throw new IllegalStateException();
        }

        public final int Oooooo(long j) {
            if (j >= -1) {
                h00 h00Var = this.OoooOoO;
                long j2 = h00Var.OoooOoo;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.Ooooo00 = null;
                        this.Ooooo0o = j;
                        this.OooooO0 = null;
                        this.OooooOO = -1;
                        this.OooooOo = -1;
                        return -1;
                    }
                    long j3 = 0;
                    z00 z00Var = h00Var.OoooOoO;
                    z00 z00VarOooO0OO = this.Ooooo00;
                    if (z00VarOooO0OO != null) {
                        long j4 = this.Ooooo0o - ((long) (this.OooooOO - z00VarOooO0OO.OooO0O0));
                        if (j4 > j) {
                            j2 = j4;
                            z00VarOooO0OO = z00Var;
                            z00Var = z00VarOooO0OO;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        z00VarOooO0OO = z00Var;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i = z00VarOooO0OO.OooO0OO;
                            int i2 = z00VarOooO0OO.OooO0O0;
                            if (j < ((long) (i - i2)) + j3) {
                                break;
                            }
                            j3 += (long) (i - i2);
                            z00VarOooO0OO = z00VarOooO0OO.OooO0o;
                        }
                    } else {
                        while (j2 > j) {
                            z00Var = z00Var.OooO0oO;
                            j2 -= (long) (z00Var.OooO0OO - z00Var.OooO0O0);
                        }
                        z00VarOooO0OO = z00Var;
                        j3 = j2;
                    }
                    if (this.OoooOoo && z00VarOooO0OO.OooO0Oo) {
                        z00 z00VarOooO0o = z00VarOooO0OO.OooO0o();
                        h00 h00Var2 = this.OoooOoO;
                        if (h00Var2.OoooOoO == z00VarOooO0OO) {
                            h00Var2.OoooOoO = z00VarOooO0o;
                        }
                        z00VarOooO0OO = z00VarOooO0OO.OooO0OO(z00VarOooO0o);
                        z00VarOooO0OO.OooO0oO.OooO0O0();
                    }
                    this.Ooooo00 = z00VarOooO0OO;
                    this.Ooooo0o = j;
                    this.OooooO0 = z00VarOooO0OO.OooO00o;
                    int i3 = z00VarOooO0OO.OooO0O0 + ((int) (j - j3));
                    this.OooooOO = i3;
                    int i4 = z00VarOooO0OO.OooO0OO;
                    this.OooooOo = i4;
                    return i4 - i3;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.OoooOoO.OoooOoo)));
        }

        public final long Oooooo0(long j) {
            h00 h00Var = this.OoooOoO;
            if (h00Var == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.OoooOoo) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = h00Var.OoooOoo;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException("newSize < 0: " + j);
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    h00 h00Var2 = this.OoooOoO;
                    z00 z00Var = h00Var2.OoooOoO.OooO0oO;
                    int i = z00Var.OooO0OO;
                    long j4 = i - z00Var.OooO0O0;
                    if (j4 > j3) {
                        z00Var.OooO0OO = (int) (((long) i) - j3);
                        break;
                    }
                    h00Var2.OoooOoO = z00Var.OooO0O0();
                    a10.OooO00o(z00Var);
                    j3 -= j4;
                }
                this.Ooooo00 = null;
                this.Ooooo0o = j;
                this.OooooO0 = null;
                this.OooooOO = -1;
                this.OooooOo = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                boolean z = true;
                while (j5 > 0) {
                    z00 z00VarO00000Oo = this.OoooOoO.o00000Oo(1);
                    int iMin = (int) Math.min(j5, 8192 - z00VarO00000Oo.OooO0OO);
                    int i2 = z00VarO00000Oo.OooO0OO + iMin;
                    z00VarO00000Oo.OooO0OO = i2;
                    j5 -= (long) iMin;
                    if (z) {
                        this.Ooooo00 = z00VarO00000Oo;
                        this.Ooooo0o = j2;
                        this.OooooO0 = z00VarO00000Oo.OooO00o;
                        this.OooooOO = i2 - iMin;
                        this.OooooOo = i2;
                        z = false;
                    }
                }
            }
            this.OoooOoO.OoooOoo = j;
            return j2;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.OoooOoO == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.OoooOoO = null;
            this.Ooooo00 = null;
            this.Ooooo0o = -1L;
            this.OooooO0 = null;
            this.OooooOO = -1;
            this.OooooOo = -1;
        }
    }

    private ByteString o00Ooo(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            z00 z00Var = this.OoooOoO;
            if (z00Var != null) {
                byte[] bArr = z00Var.OooO00o;
                int i = z00Var.OooO0O0;
                mac.update(bArr, i, z00Var.OooO0OO - i);
                z00 z00Var2 = this.OoooOoO;
                while (true) {
                    z00Var2 = z00Var2.OooO0o;
                    if (z00Var2 == this.OoooOoO) {
                        break;
                    }
                    byte[] bArr2 = z00Var2.OooO00o;
                    int i2 = z00Var2.OooO0O0;
                    mac.update(bArr2, i2, z00Var2.OooO0OO - i2);
                }
            }
            return ByteString.m17043of(mac.doFinal());
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private boolean o00oO0O(z00 z00Var, int i, ByteString byteString, int i2, int i3) {
        int i4 = z00Var.OooO0OO;
        byte[] bArr = z00Var.OooO00o;
        while (i2 < i3) {
            if (i == i4) {
                z00Var = z00Var.OooO0o;
                byte[] bArr2 = z00Var.OooO00o;
                bArr = bArr2;
                i = z00Var.OooO0O0;
                i4 = z00Var.OooO0OO;
            }
            if (bArr[i] != byteString.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    private void o0Oo0oo(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            z00 z00VarO00000Oo = o00000Oo(1);
            int i = inputStream.read(z00VarO00000Oo.OooO00o, z00VarO00000Oo.OooO0OO, (int) Math.min(j, 8192 - z00VarO00000Oo.OooO0OO));
            if (i == -1) {
                if (!z) {
                    throw new EOFException();
                }
                return;
            } else {
                z00VarO00000Oo.OooO0OO += i;
                long j2 = i;
                this.OoooOoo += j2;
                j -= j2;
            }
        }
    }

    private ByteString ooOO(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            z00 z00Var = this.OoooOoO;
            if (z00Var != null) {
                byte[] bArr = z00Var.OooO00o;
                int i = z00Var.OooO0O0;
                messageDigest.update(bArr, i, z00Var.OooO0OO - i);
                z00 z00Var2 = this.OoooOoO;
                while (true) {
                    z00Var2 = z00Var2.OooO0o;
                    if (z00Var2 == this.OoooOoO) {
                        break;
                    }
                    byte[] bArr2 = z00Var2.OooO00o;
                    int i2 = z00Var2.OooO0O0;
                    messageDigest.update(bArr2, i2, z00Var2.OooO0OO - i2);
                }
            }
            return ByteString.m17043of(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // p285z2.j00, p285z2.i00
    public h00 OooO00o() {
        return this;
    }

    @Override // p285z2.j00
    public String OooO0O0(long j) throws EOFException {
        return OoooO00(j, f10.OooO00o);
    }

    @Override // p285z2.j00
    public long OooO0OO(ByteString byteString, long j) throws IOException {
        byte[] bArr;
        if (byteString.size() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        z00 z00Var = this.OoooOoO;
        long j3 = -1;
        if (z00Var == null) {
            return -1L;
        }
        long j4 = this.OoooOoo;
        if (j4 - j < j) {
            while (j4 > j) {
                z00Var = z00Var.OooO0oO;
                j4 -= (long) (z00Var.OooO0OO - z00Var.OooO0O0);
            }
        } else {
            while (true) {
                long j5 = ((long) (z00Var.OooO0OO - z00Var.OooO0O0)) + j2;
                if (j5 >= j) {
                    break;
                }
                z00Var = z00Var.OooO0o;
                j2 = j5;
            }
            j4 = j2;
        }
        byte b = byteString.getByte(0);
        int size = byteString.size();
        long j6 = 1 + (this.OoooOoo - ((long) size));
        long j7 = j;
        z00 z00Var2 = z00Var;
        long j8 = j4;
        while (j8 < j6) {
            byte[] bArr2 = z00Var2.OooO00o;
            int iMin = (int) Math.min(z00Var2.OooO0OO, (((long) z00Var2.OooO0O0) + j6) - j8);
            int i = (int) ((((long) z00Var2.OooO0O0) + j7) - j8);
            while (i < iMin) {
                if (bArr2[i] == b) {
                    bArr = bArr2;
                    if (o00oO0O(z00Var2, i + 1, byteString, 1, size)) {
                        return ((long) (i - z00Var2.OooO0O0)) + j8;
                    }
                } else {
                    bArr = bArr2;
                }
                i++;
                bArr2 = bArr;
            }
            j8 += (long) (z00Var2.OooO0OO - z00Var2.OooO0O0);
            z00Var2 = z00Var2.OooO0o;
            j7 = j8;
            j3 = -1;
        }
        return j3;
    }

    @Override // p285z2.j00
    public ByteString OooO0Oo(long j) throws EOFException {
        return new ByteString(Oooo0oO(j));
    }

    @Override // p285z2.i00
    public i00 OooO0o0() {
        return this;
    }

    @Override // p285z2.j00
    public byte[] OooOO0O() {
        try {
            return Oooo0oO(this.OoooOoo);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p285z2.j00
    public long OooOO0o(ByteString byteString) throws IOException {
        return OooO0OO(byteString, 0L);
    }

    @Override // p285z2.j00
    public boolean OooOOO() {
        return this.OoooOoo == 0;
    }

    @Override // p285z2.j00
    public long OooOOOo(byte b, long j) {
        return OooOOo(b, j, Long.MAX_VALUE);
    }

    @Override // p285z2.j00
    public long OooOOo(byte b, long j, long j2) {
        z00 z00Var;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.OoooOoo), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.OoooOoo;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (z00Var = this.OoooOoO) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                z00Var = z00Var.OooO0oO;
                j4 -= (long) (z00Var.OooO0OO - z00Var.OooO0O0);
            }
        } else {
            while (true) {
                long j6 = ((long) (z00Var.OooO0OO - z00Var.OooO0O0)) + j3;
                if (j6 >= j) {
                    break;
                }
                z00Var = z00Var.OooO0o;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = z00Var.OooO00o;
            int iMin = (int) Math.min(z00Var.OooO0OO, (((long) z00Var.OooO0O0) + j5) - j4);
            for (int i = (int) ((((long) z00Var.OooO0O0) + j7) - j4); i < iMin; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - z00Var.OooO0O0)) + j4;
                }
            }
            j4 += (long) (z00Var.OooO0OO - z00Var.OooO0O0);
            z00Var = z00Var.OooO0o;
            j7 = j4;
        }
        return -1L;
    }

    @Override // p285z2.j00
    public void OooOOo0(h00 h00Var, long j) throws EOFException {
        long j2 = this.OoooOoo;
        if (j2 >= j) {
            h00Var.OooOooO(this, j);
        } else {
            h00Var.OooOooO(this, j2);
            throw new EOFException();
        }
    }

    @Override // p285z2.j00
    public long OooOOoo(ByteString byteString) {
        return OoooOOO(byteString, 0L);
    }

    @Override // p285z2.j00
    @Nullable
    public String OooOo00() throws EOFException {
        long jOoooo00 = Ooooo00((byte) 10);
        if (jOoooo00 != -1) {
            return o0O0O00(jOoooo00);
        }
        long j = this.OoooOoo;
        if (j != 0) {
            return OooO0O0(j);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x003d, code lost:
    
        r1 = new p285z2.h00().OoooOoO(r3).OooOOOO(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x004a, code lost:
    
        if (r8 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x004c, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0069, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.Oooo0oo());
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a9  */
    @Override // p285z2.j00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long OooOo0O() {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.h00.OooOo0O():long");
    }

    @Override // p285z2.j00
    public String OooOo0o(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jOooOOo = OooOOo((byte) 10, 0L, j2);
        if (jOooOOo != -1) {
            return o0O0O00(jOooOOo);
        }
        if (j2 < o00000O0() && o00Oo0(j2 - 1) == 13 && o00Oo0(j2) == 10) {
            return o0O0O00(j2);
        }
        h00 h00Var = new h00();
        o0OoOo0(h00Var, 0L, Math.min(32L, o00000O0()));
        throw new EOFException("\\n not found: limit=" + Math.min(o00000O0(), j) + " content=" + h00Var.Oooo00o().hex() + (char) 8230);
    }

    @Override // p285z2.j00
    public boolean OooOoO(long j, ByteString byteString) {
        return Oooo0o(j, byteString, 0, byteString.size());
    }

    @Override // p285z2.j00
    public String OooOoOO(Charset charset) {
        try {
            return OoooO00(this.OoooOoo, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p285z2.j00
    public int OooOoo() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.OoooOoo == 0) {
            throw new EOFException();
        }
        byte bO00Oo0 = o00Oo0(0L);
        if ((bO00Oo0 & 128) == 0) {
            i = bO00Oo0 & 127;
            i2 = 1;
            i3 = 0;
        } else if ((bO00Oo0 & 224) == 192) {
            i = bO00Oo0 & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bO00Oo0 & 240) == 224) {
            i = bO00Oo0 & C3442bg.f18783m;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bO00Oo0 & 248) != 240) {
                skip(1L);
                return Ooooo0o;
            }
            i = bO00Oo0 & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.OoooOoo < j) {
            throw new EOFException("size < " + i2 + ": " + this.OoooOoo + " (to read code point prefixed 0x" + Integer.toHexString(bO00Oo0) + ")");
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bO00Oo02 = o00Oo0(j2);
            if ((bO00Oo02 & 192) != 128) {
                skip(j2);
                return Ooooo0o;
            }
            i = (i << 6) | (bO00Oo02 & 63);
        }
        skip(j);
        return i > 1114111 ? Ooooo0o : ((i < 55296 || i > 57343) && i >= i3) ? i : Ooooo0o;
    }

    @Override // p285z2.b10
    public void OooOooO(h00 h00Var, long j) {
        if (h00Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (h00Var == this) {
            throw new IllegalArgumentException("source == this");
        }
        f10.OooO0O0(h00Var.OoooOoo, 0L, j);
        while (j > 0) {
            z00 z00Var = h00Var.OoooOoO;
            if (j < z00Var.OooO0OO - z00Var.OooO0O0) {
                z00 z00Var2 = this.OoooOoO;
                z00 z00Var3 = z00Var2 != null ? z00Var2.OooO0oO : null;
                if (z00Var3 != null && z00Var3.OooO0o0) {
                    if ((((long) z00Var3.OooO0OO) + j) - ((long) (z00Var3.OooO0Oo ? 0 : z00Var3.OooO0O0)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        z00Var.OooO0oO(z00Var3, (int) j);
                        h00Var.OoooOoo -= j;
                        this.OoooOoo += j;
                        return;
                    }
                }
                h00Var.OoooOoO = z00Var.OooO0o0((int) j);
            }
            z00 z00Var4 = h00Var.OoooOoO;
            long j2 = z00Var4.OooO0OO - z00Var4.OooO0O0;
            h00Var.OoooOoO = z00Var4.OooO0O0();
            z00 z00Var5 = this.OoooOoO;
            if (z00Var5 == null) {
                this.OoooOoO = z00Var4;
                z00Var4.OooO0oO = z00Var4;
                z00Var4.OooO0o = z00Var4;
            } else {
                z00Var5.OooO0oO.OooO0OO(z00Var4).OooO00o();
            }
            h00Var.OoooOoo -= j2;
            this.OoooOoo += j2;
            j -= j2;
        }
    }

    @Override // p285z2.i00
    public long Oooo000(c10 c10Var) throws IOException {
        if (c10Var == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long j2 = c10Var.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // p285z2.j00
    public ByteString Oooo00o() {
        return new ByteString(OooOO0O());
    }

    @Override // p285z2.i00
    public i00 Oooo0O0(c10 c10Var, long j) throws IOException {
        while (j > 0) {
            long j2 = c10Var.read(this, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
        }
        return this;
    }

    @Override // p285z2.j00
    public String Oooo0OO() throws EOFException {
        return OooOo0o(Long.MAX_VALUE);
    }

    @Override // p285z2.j00
    public boolean Oooo0o(long j, ByteString byteString, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.OoooOoo - j < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (o00Oo0(((long) i3) + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // p285z2.j00
    public int Oooo0o0() {
        return f10.OooO0OO(readInt());
    }

    @Override // p285z2.j00
    public byte[] Oooo0oO(long j) throws EOFException {
        f10.OooO0O0(this.OoooOoo, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // p285z2.j00
    public String Oooo0oo() {
        try {
            return OoooO00(this.OoooOoo, f10.OooO00o);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p285z2.j00
    public long OoooO() {
        return f10.OooO0Oo(readLong());
    }

    @Override // p285z2.j00
    public String OoooO00(long j, Charset charset) throws EOFException {
        f10.OooO0O0(this.OoooOoo, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        if (j == 0) {
            return "";
        }
        z00 z00Var = this.OoooOoO;
        if (((long) z00Var.OooO0O0) + j > z00Var.OooO0OO) {
            return new String(Oooo0oO(j), charset);
        }
        String str = new String(z00Var.OooO00o, z00Var.OooO0O0, (int) j, charset);
        int i = (int) (((long) z00Var.OooO0O0) + j);
        z00Var.OooO0O0 = i;
        this.OoooOoo -= j;
        if (i == z00Var.OooO0OO) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        }
        return str;
    }

    @Override // p285z2.j00
    public short OoooO0O() {
        return f10.OooO0o0(readShort());
    }

    @Override // p285z2.j00
    public long OoooOO0(b10 b10Var) throws IOException {
        long j = this.OoooOoo;
        if (j > 0) {
            b10Var.OooOooO(this, j);
        }
        return j;
    }

    @Override // p285z2.j00
    public long OoooOOO(ByteString byteString, long j) {
        int i;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        z00 z00Var = this.OoooOoO;
        if (z00Var == null) {
            return -1L;
        }
        long j3 = this.OoooOoo;
        if (j3 - j < j) {
            while (j3 > j) {
                z00Var = z00Var.OooO0oO;
                j3 -= (long) (z00Var.OooO0OO - z00Var.OooO0O0);
            }
        } else {
            while (true) {
                long j4 = ((long) (z00Var.OooO0OO - z00Var.OooO0O0)) + j2;
                if (j4 >= j) {
                    break;
                }
                z00Var = z00Var.OooO0o;
                j2 = j4;
            }
            j3 = j2;
        }
        if (byteString.size() == 2) {
            byte b = byteString.getByte(0);
            byte b2 = byteString.getByte(1);
            while (j3 < this.OoooOoo) {
                byte[] bArr = z00Var.OooO00o;
                i = (int) ((((long) z00Var.OooO0O0) + j) - j3);
                int i2 = z00Var.OooO0OO;
                while (i < i2) {
                    byte b3 = bArr[i];
                    if (b3 == b || b3 == b2) {
                        return ((long) (i - z00Var.OooO0O0)) + j3;
                    }
                    i++;
                }
                j3 += (long) (z00Var.OooO0OO - z00Var.OooO0O0);
                z00Var = z00Var.OooO0o;
                j = j3;
            }
            return -1L;
        }
        byte[] bArrInternalArray = byteString.internalArray();
        while (j3 < this.OoooOoo) {
            byte[] bArr2 = z00Var.OooO00o;
            i = (int) ((((long) z00Var.OooO0O0) + j) - j3);
            int i3 = z00Var.OooO0OO;
            while (i < i3) {
                byte b4 = bArr2[i];
                for (byte b5 : bArrInternalArray) {
                    if (b4 == b5) {
                        return ((long) (i - z00Var.OooO0O0)) + j3;
                    }
                }
                i++;
            }
            j3 += (long) (z00Var.OooO0OO - z00Var.OooO0O0);
            z00Var = z00Var.OooO0o;
            j = j3;
        }
        return -1L;
    }

    @Override // p285z2.j00
    public void OoooOo0(long j) throws EOFException {
        if (this.OoooOoo < j) {
            throw new EOFException();
        }
    }

    @Override // p285z2.i00
    public OutputStream OoooOoo() {
        return new OooO00o();
    }

    @Override // p285z2.j00
    public long Ooooo00(byte b) {
        return OooOOo(b, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a5 A[EDGE_INSN: B:94:0x00a5->B:88:0x00a5 BREAK  A[LOOP:0: B:55:0x000b->B:96:?], SYNTHETIC] */
    @Override // p285z2.j00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long Ooooo0o() {
        /*
            r15 = this;
            long r0 = r15.OoooOoo
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lac
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            z2.z00 r6 = r15.OoooOoO
            byte[] r7 = r6.OooO00o
            int r8 = r6.OooO0O0
            int r9 = r6.OooO0OO
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            z2.h00 r0 = new z2.h00
            r0.<init>()
            z2.h00 r0 = r0.Oooo00O(r4)
            z2.h00 r0 = r0.OooOOOO(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.Oooo0oo()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            z2.z00 r7 = r6.OooO0O0()
            r15.OoooOoO = r7
            p285z2.a10.OooO00o(r6)
            goto L9f
        L9d:
            r6.OooO0O0 = r8
        L9f:
            if (r1 != 0) goto La5
            z2.z00 r6 = r15.OoooOoO
            if (r6 != 0) goto Lb
        La5:
            long r1 = r15.OoooOoo
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.OoooOoo = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.h00.Ooooo0o():long");
    }

    @Override // p285z2.j00
    public InputStream OooooO0() {
        return new OooO0O0();
    }

    @Override // p285z2.j00
    public int OooooOO(v00 v00Var) {
        int iO000000 = o000000(v00Var, false);
        if (iO000000 == -1) {
            return -1;
        }
        try {
            skip(v00Var.OoooOoO[iO000000].size());
            return iO000000;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final void OooooOo() {
        try {
            skip(this.OoooOoo);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long Oooooo() {
        long j = this.OoooOoo;
        if (j == 0) {
            return 0L;
        }
        z00 z00Var = this.OoooOoO.OooO0oO;
        int i = z00Var.OooO0OO;
        return (i >= 8192 || !z00Var.OooO0o0) ? j : j - ((long) (i - z00Var.OooO0O0));
    }

    /* JADX INFO: renamed from: Oooooo0 */
    public h00 clone() {
        h00 h00Var = new h00();
        if (this.OoooOoo == 0) {
            return h00Var;
        }
        z00 z00VarOooO0Oo = this.OoooOoO.OooO0Oo();
        h00Var.OoooOoO = z00VarOooO0Oo;
        z00VarOooO0Oo.OooO0oO = z00VarOooO0Oo;
        z00VarOooO0Oo.OooO0o = z00VarOooO0Oo;
        z00 z00Var = this.OoooOoO;
        while (true) {
            z00Var = z00Var.OooO0o;
            if (z00Var == this.OoooOoO) {
                h00Var.OoooOoo = this.OoooOoo;
                return h00Var;
            }
            h00Var.OoooOoO.OooO0oO.OooO0OO(z00Var.OooO0Oo());
        }
    }

    public final h00 OoooooO(OutputStream outputStream) throws IOException {
        return Ooooooo(outputStream, 0L, this.OoooOoo);
    }

    public final h00 Ooooooo(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        f10.OooO0O0(this.OoooOoo, j, j2);
        if (j2 == 0) {
            return this;
        }
        z00 z00Var = this.OoooOoO;
        while (true) {
            int i = z00Var.OooO0OO;
            int i2 = z00Var.OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            z00Var = z00Var.OooO0o;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) z00Var.OooO0O0) + j);
            int iMin = (int) Math.min(z00Var.OooO0OO - i3, j2);
            outputStream.write(z00Var.OooO00o, i3, iMin);
            j2 -= (long) iMin;
            z00Var = z00Var.OooO0o;
            j = 0;
        }
        return this;
    }

    @Override // p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        long j = this.OoooOoo;
        if (j != h00Var.OoooOoo) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        z00 z00Var = this.OoooOoO;
        z00 z00Var2 = h00Var.OoooOoO;
        int i = z00Var.OooO0O0;
        int i2 = z00Var2.OooO0O0;
        while (j2 < this.OoooOoo) {
            long jMin = Math.min(z00Var.OooO0OO - i, z00Var2.OooO0OO - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (z00Var.OooO00o[i] != z00Var2.OooO00o[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == z00Var.OooO0OO) {
                z00Var = z00Var.OooO0o;
                i = z00Var.OooO0O0;
            }
            if (i2 == z00Var2.OooO0OO) {
                z00Var2 = z00Var2.OooO0o;
                i2 = z00Var2.OooO0O0;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p285z2.i00, p285z2.b10, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        z00 z00Var = this.OoooOoO;
        if (z00Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = z00Var.OooO0OO;
            for (int i3 = z00Var.OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + z00Var.OooO00o[i3];
            }
            z00Var = z00Var.OooO0o;
        } while (z00Var != this.OoooOoO);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000 */
    public h00 OoooOoO(long j) {
        if (j == 0) {
            return OooOOOO(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return OooOoO0("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < C1500b.f7492h ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= UMAmapConfig.AMAP_CACHE_WRITE_TIME) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        z00 z00VarO00000Oo = o00000Oo(i);
        byte[] bArr = z00VarO00000Oo.OooO00o;
        int i2 = z00VarO00000Oo.OooO0OO + i;
        while (j != 0) {
            i2--;
            bArr[i2] = Ooooo00[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        z00VarO00000Oo.OooO0OO += i;
        this.OoooOoo += (long) i;
        return this;
    }

    public final ByteString o00000() {
        return ooOO("SHA-512");
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0055, code lost:
    
        if (r19 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0058, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int o000000(p285z2.v00 r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            z2.z00 r2 = r1.OoooOoO
            r3 = -2
            if (r2 != 0) goto L13
            if (r19 == 0) goto Lc
            return r3
        Lc:
            okio.ByteString r2 = okio.ByteString.EMPTY
            int r0 = r0.indexOf(r2)
            return r0
        L13:
            byte[] r4 = r2.OooO00o
            int r5 = r2.OooO0O0
            int r6 = r2.OooO0OO
            int[] r0 = r0.OoooOoo
            r7 = 0
            r8 = -1
            r10 = r2
            r9 = 0
            r11 = -1
        L20:
            int r12 = r9 + 1
            r9 = r0[r9]
            int r13 = r12 + 1
            r12 = r0[r12]
            if (r12 == r8) goto L2b
            r11 = r12
        L2b:
            if (r10 != 0) goto L2e
            goto L55
        L2e:
            r12 = 0
            if (r9 >= 0) goto L75
            int r9 = r9 * (-1)
            int r14 = r13 + r9
        L35:
            int r9 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r15 = r13 + 1
            r13 = r0[r13]
            if (r5 == r13) goto L42
            return r11
        L42:
            if (r15 != r14) goto L46
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            if (r9 != r6) goto L62
            z2.z00 r4 = r10.OooO0o
            int r6 = r4.OooO0O0
            byte[] r9 = r4.OooO00o
            int r10 = r4.OooO0OO
            if (r4 != r2) goto L5c
            if (r5 != 0) goto L59
        L55:
            if (r19 == 0) goto L58
            return r3
        L58:
            return r11
        L59:
            r4 = r9
            r9 = r12
            goto L68
        L5c:
            r16 = r9
            r9 = r4
            r4 = r16
            goto L68
        L62:
            r16 = r10
            r10 = r6
            r6 = r9
            r9 = r16
        L68:
            if (r5 == 0) goto L70
            r5 = r0[r15]
            r3 = r6
            r6 = r10
            r10 = r9
            goto L96
        L70:
            r5 = r6
            r6 = r10
            r13 = r15
            r10 = r9
            goto L35
        L75:
            int r14 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r15 = r13 + r9
        L7d:
            if (r13 != r15) goto L80
            return r11
        L80:
            r3 = r0[r13]
            if (r5 != r3) goto L9d
            int r13 = r13 + r9
            r5 = r0[r13]
            if (r14 != r6) goto L95
            z2.z00 r10 = r10.OooO0o
            int r3 = r10.OooO0O0
            byte[] r4 = r10.OooO00o
            int r6 = r10.OooO0OO
            if (r10 != r2) goto L96
            r10 = r12
            goto L96
        L95:
            r3 = r14
        L96:
            if (r5 < 0) goto L99
            return r5
        L99:
            int r9 = -r5
            r5 = r3
            r3 = -2
            goto L20
        L9d:
            int r13 = r13 + 1
            r3 = -2
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.h00.o000000(z2.v00, boolean):int");
    }

    public final ByteString o000000O() {
        return ooOO("SHA-1");
    }

    public final ByteString o000000o() {
        return ooOO("SHA-256");
    }

    public final ByteString o00000O() {
        long j = this.OoooOoo;
        if (j <= 2147483647L) {
            return o00000OO((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.OoooOoo);
    }

    public final long o00000O0() {
        return this.OoooOoo;
    }

    public final ByteString o00000OO(int i) {
        return i == 0 ? ByteString.EMPTY : new SegmentedByteString(this, i);
    }

    public z00 o00000Oo(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        z00 z00Var = this.OoooOoO;
        if (z00Var != null) {
            z00 z00Var2 = z00Var.OooO0oO;
            return (z00Var2.OooO0OO + i > 8192 || !z00Var2.OooO0o0) ? z00Var2.OooO0OO(a10.OooO0O0()) : z00Var2;
        }
        z00 z00VarOooO0O0 = a10.OooO0O0();
        this.OoooOoO = z00VarOooO0O0;
        z00VarOooO0O0.OooO0oO = z00VarOooO0O0;
        z00VarOooO0O0.OooO0o = z00VarOooO0O0;
        return z00VarOooO0O0;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o00000o0 */
    public h00 OoooO0(ByteString byteString) {
        if (byteString == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        byteString.write(this);
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o00000oO */
    public h00 OooOoo0(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        f10.OooO0O0(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            z00 z00VarO00000Oo = o00000Oo(1);
            int iMin = Math.min(i3 - i, 8192 - z00VarO00000Oo.OooO0OO);
            System.arraycopy(bArr, i, z00VarO00000Oo.OooO00o, z00VarO00000Oo.OooO0OO, iMin);
            i += iMin;
            z00VarO00000Oo.OooO0OO += iMin;
        }
        this.OoooOoo += j;
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o00000oo */
    public h00 OooOOOO(int i) {
        z00 z00VarO00000Oo = o00000Oo(1);
        byte[] bArr = z00VarO00000Oo.OooO00o;
        int i2 = z00VarO00000Oo.OooO0OO;
        z00VarO00000Oo.OooO0OO = i2 + 1;
        bArr[i2] = (byte) i;
        this.OoooOoo++;
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000O */
    public h00 OooOo(int i) {
        return OooO0o(f10.OooO0o0((short) i));
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000O0 */
    public h00 OoooOOo(long j) {
        z00 z00VarO00000Oo = o00000Oo(8);
        byte[] bArr = z00VarO00000Oo.OooO00o;
        int i = z00VarO00000Oo.OooO0OO;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        z00VarO00000Oo.OooO0OO = i8 + 1;
        this.OoooOoo += 8;
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000O00 */
    public h00 Oooo00O(long j) {
        if (j == 0) {
            return OooOOOO(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        z00 z00VarO00000Oo = o00000Oo(iNumberOfTrailingZeros);
        byte[] bArr = z00VarO00000Oo.OooO00o;
        int i = z00VarO00000Oo.OooO0OO;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = Ooooo00[(int) (15 & j)];
            j >>>= 4;
        }
        z00VarO00000Oo.OooO0OO += iNumberOfTrailingZeros;
        this.OoooOoo += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000O0O */
    public h00 OooO(long j) {
        return OoooOOo(f10.OooO0Oo(j));
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000OO */
    public h00 Oooo0(String str, Charset charset) {
        return o000oOoO(str, 0, str.length(), charset);
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000OO0 */
    public h00 o000oOoO(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 <= str.length()) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (charset.equals(f10.OooO00o)) {
                return OooOooo(str, i, i2);
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return OooOoo0(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
    }

    public final h00 o0000OOO(OutputStream outputStream) throws IOException {
        return o0000OOo(outputStream, this.OoooOoo);
    }

    public final h00 o0000OOo(OutputStream outputStream, long j) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        f10.OooO0O0(this.OoooOoo, 0L, j);
        z00 z00Var = this.OoooOoO;
        while (j > 0) {
            int iMin = (int) Math.min(j, z00Var.OooO0OO - z00Var.OooO0O0);
            outputStream.write(z00Var.OooO00o, z00Var.OooO0O0, iMin);
            int i = z00Var.OooO0O0 + iMin;
            z00Var.OooO0O0 = i;
            long j2 = iMin;
            this.OoooOoo -= j2;
            j -= j2;
            if (i == z00Var.OooO0OO) {
                z00 z00VarOooO0O0 = z00Var.OooO0O0();
                this.OoooOoO = z00VarOooO0O0;
                a10.OooO00o(z00Var);
                z00Var = z00VarOooO0O0;
            }
        }
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000Oo */
    public h00 OooOooo(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                z00 z00VarO00000Oo = o00000Oo(1);
                byte[] bArr = z00VarO00000Oo.OooO00o;
                int i4 = z00VarO00000Oo.OooO0OO - i;
                int iMin = Math.min(i2, 8192 - i4);
                int i5 = i + 1;
                bArr[i + i4] = (byte) cCharAt;
                while (i5 < iMin) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) cCharAt2;
                    i5++;
                }
                int i6 = z00VarO00000Oo.OooO0OO;
                int i7 = (i4 + i5) - i6;
                z00VarO00000Oo.OooO0OO = i6 + i7;
                this.OoooOoo += (long) i7;
                i = i5;
            } else {
                if (cCharAt < 2048) {
                    i3 = (cCharAt >> 6) | 192;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    OooOOOO((cCharAt >> '\f') | 224);
                    i3 = ((cCharAt >> 6) & 63) | 128;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        OooOOOO(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        OooOOOO((i9 >> 18) | 240);
                        OooOOOO(((i9 >> 12) & 63) | 128);
                        OooOOOO(((i9 >> 6) & 63) | 128);
                        OooOOOO((i9 & 63) | 128);
                        i += 2;
                    }
                }
                OooOOOO(i3);
                OooOOOO((cCharAt & '?') | 128);
                i++;
            }
        }
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000Oo0 */
    public h00 OooOoO0(String str) {
        return OooOooo(str, 0, str.length());
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000OoO */
    public h00 OooO0oO(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        OooOOOO(63);
                    }
                } else {
                    if (i > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    OooOOOO((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                OooOOOO(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            OooOOOO(i3);
            i = (i & 63) | 128;
            OooOOOO(i);
        } else {
            OooOOOO(i);
        }
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000Ooo */
    public h00 Oooo(byte[] bArr) {
        if (bArr != null) {
            return OooOoo0(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000oO */
    public h00 OooOOO0(int i) {
        return OooO0oo(f10.OooO0OO(i));
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o0000oo */
    public h00 OooO0oo(int i) {
        z00 z00VarO00000Oo = o00000Oo(4);
        byte[] bArr = z00VarO00000Oo.OooO00o;
        int i2 = z00VarO00000Oo.OooO0OO;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        z00VarO00000Oo.OooO0OO = i5 + 1;
        this.OoooOoo += 4;
        return this;
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o000OO */
    public h00 OooO0o(int i) {
        z00 z00VarO00000Oo = o00000Oo(2);
        byte[] bArr = z00VarO00000Oo.OooO00o;
        int i2 = z00VarO00000Oo.OooO0OO;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        z00VarO00000Oo.OooO0OO = i3 + 1;
        this.OoooOoo += 2;
        return this;
    }

    public List<Integer> o000OOo() {
        if (this.OoooOoO == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        z00 z00Var = this.OoooOoO;
        arrayList.add(Integer.valueOf(z00Var.OooO0OO - z00Var.OooO0O0));
        z00 z00Var2 = this.OoooOoO;
        while (true) {
            z00Var2 = z00Var2.OooO0o;
            if (z00Var2 == this.OoooOoO) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(z00Var2.OooO0OO - z00Var2.OooO0O0));
        }
    }

    @Override // p285z2.i00
    /* JADX INFO: renamed from: o00O0O */
    public h00 OooOo0() {
        return this;
    }

    public final byte o00Oo0(long j) {
        int i;
        f10.OooO0O0(this.OoooOoo, j, 1L);
        long j2 = this.OoooOoo;
        if (j2 - j <= j) {
            long j3 = j - j2;
            z00 z00Var = this.OoooOoO;
            do {
                z00Var = z00Var.OooO0oO;
                int i2 = z00Var.OooO0OO;
                i = z00Var.OooO0O0;
                j3 += (long) (i2 - i);
            } while (j3 < 0);
            return z00Var.OooO00o[i + ((int) j3)];
        }
        z00 z00Var2 = this.OoooOoO;
        while (true) {
            int i3 = z00Var2.OooO0OO;
            int i4 = z00Var2.OooO0O0;
            long j4 = i3 - i4;
            if (j < j4) {
                return z00Var2.OooO00o[i4 + ((int) j)];
            }
            j -= j4;
            z00Var2 = z00Var2.OooO0o;
        }
    }

    public final ByteString o00o0O(ByteString byteString) {
        return o00Ooo("HmacSHA1", byteString);
    }

    public final ByteString o00oO0o() {
        return ooOO("MD5");
    }

    public final ByteString o00ooo(ByteString byteString) {
        return o00Ooo("HmacSHA256", byteString);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String o0O0O00(long r7) throws java.io.EOFException {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            long r2 = r7 - r0
            byte r4 = r6.o00Oo0(r2)
            r5 = 13
            if (r4 != r5) goto L1c
            java.lang.String r7 = r6.OooO0O0(r2)
            r0 = 2
        L18:
            r6.skip(r0)
            return r7
        L1c:
            java.lang.String r7 = r6.OooO0O0(r7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.h00.o0O0O00(long):java.lang.String");
    }

    public final OooO0OO o0OO00O() {
        return oo0o0Oo(new OooO0OO());
    }

    public final h00 o0OOO0o(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            o0Oo0oo(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    public final h00 o0OoOo0(h00 h00Var, long j, long j2) {
        if (h00Var == null) {
            throw new IllegalArgumentException("out == null");
        }
        f10.OooO0O0(this.OoooOoo, j, j2);
        if (j2 == 0) {
            return this;
        }
        h00Var.OoooOoo += j2;
        z00 z00Var = this.OoooOoO;
        while (true) {
            int i = z00Var.OooO0OO;
            int i2 = z00Var.OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            z00Var = z00Var.OooO0o;
        }
        while (j2 > 0) {
            z00 z00VarOooO0Oo = z00Var.OooO0Oo();
            int i3 = (int) (((long) z00VarOooO0Oo.OooO0O0) + j);
            z00VarOooO0Oo.OooO0O0 = i3;
            z00VarOooO0Oo.OooO0OO = Math.min(i3 + ((int) j2), z00VarOooO0Oo.OooO0OO);
            z00 z00Var2 = h00Var.OoooOoO;
            if (z00Var2 == null) {
                z00VarOooO0Oo.OooO0oO = z00VarOooO0Oo;
                z00VarOooO0Oo.OooO0o = z00VarOooO0Oo;
                h00Var.OoooOoO = z00VarOooO0Oo;
            } else {
                z00Var2.OooO0oO.OooO0OO(z00VarOooO0Oo);
            }
            j2 -= (long) (z00VarOooO0Oo.OooO0OO - z00VarOooO0Oo.OooO0O0);
            z00Var = z00Var.OooO0o;
            j = 0;
        }
        return this;
    }

    public final OooO0OO o0ooOO0() {
        return o0ooOOo(new OooO0OO());
    }

    public final OooO0OO o0ooOOo(OooO0OO oooO0OO) {
        if (oooO0OO.OoooOoO != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        oooO0OO.OoooOoO = this;
        oooO0OO.OoooOoo = true;
        return oooO0OO;
    }

    public final h00 o0ooOoO(InputStream inputStream) throws IOException {
        o0Oo0oo(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public final ByteString oo000o(ByteString byteString) {
        return o00Ooo("HmacSHA512", byteString);
    }

    public final OooO0OO oo0o0Oo(OooO0OO oooO0OO) {
        if (oooO0OO.OoooOoO != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        oooO0OO.OoooOoO = this;
        oooO0OO.OoooOoo = false;
        return oooO0OO;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        z00 z00Var = this.OoooOoO;
        if (z00Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), z00Var.OooO0OO - z00Var.OooO0O0);
        byteBuffer.put(z00Var.OooO00o, z00Var.OooO0O0, iMin);
        int i = z00Var.OooO0O0 + iMin;
        z00Var.OooO0O0 = i;
        this.OoooOoo -= (long) iMin;
        if (i == z00Var.OooO0OO) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        }
        return iMin;
    }

    @Override // p285z2.j00
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p285z2.j00
    public int read(byte[] bArr, int i, int i2) {
        f10.OooO0O0(bArr.length, i, i2);
        z00 z00Var = this.OoooOoO;
        if (z00Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, z00Var.OooO0OO - z00Var.OooO0O0);
        System.arraycopy(z00Var.OooO00o, z00Var.OooO0O0, bArr, i, iMin);
        int i3 = z00Var.OooO0O0 + iMin;
        z00Var.OooO0O0 = i3;
        this.OoooOoo -= (long) iMin;
        if (i3 == z00Var.OooO0OO) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        }
        return iMin;
    }

    @Override // p285z2.c10
    public long read(h00 h00Var, long j) {
        if (h00Var == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2 = this.OoooOoo;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        h00Var.OooOooO(this, j);
        return j;
    }

    @Override // p285z2.j00
    public byte readByte() {
        long j = this.OoooOoo;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        z00 z00Var = this.OoooOoO;
        int i = z00Var.OooO0O0;
        int i2 = z00Var.OooO0OO;
        int i3 = i + 1;
        byte b = z00Var.OooO00o[i];
        this.OoooOoo = j - 1;
        if (i3 == i2) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        } else {
            z00Var.OooO0O0 = i3;
        }
        return b;
    }

    @Override // p285z2.j00
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // p285z2.j00
    public int readInt() {
        long j = this.OoooOoo;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.OoooOoo);
        }
        z00 z00Var = this.OoooOoO;
        int i = z00Var.OooO0O0;
        int i2 = z00Var.OooO0OO;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = z00Var.OooO00o;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.OoooOoo = j - 4;
        if (i8 == i2) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        } else {
            z00Var.OooO0O0 = i8;
        }
        return i9;
    }

    @Override // p285z2.j00
    public long readLong() {
        long j = this.OoooOoo;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.OoooOoo);
        }
        z00 z00Var = this.OoooOoO;
        int i = z00Var.OooO0O0;
        int i2 = z00Var.OooO0OO;
        if (i2 - i < 8) {
            return ((((long) readInt()) & UIDFolder.MAXUID) << 32) | (UIDFolder.MAXUID & ((long) readInt()));
        }
        byte[] bArr = z00Var.OooO00o;
        int i3 = i + 1;
        long j2 = (((long) bArr[i]) & 255) << 56;
        int i4 = i3 + 1;
        long j3 = ((((long) bArr[i3]) & 255) << 48) | j2;
        int i5 = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j8 = j7 | (((long) bArr[i9]) & 255);
        this.OoooOoo = j - 8;
        if (i10 == i2) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        } else {
            z00Var.OooO0O0 = i10;
        }
        return j8;
    }

    @Override // p285z2.j00
    public short readShort() {
        long j = this.OoooOoo;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.OoooOoo);
        }
        z00 z00Var = this.OoooOoO;
        int i = z00Var.OooO0O0;
        int i2 = z00Var.OooO0OO;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = z00Var.OooO00o;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.OoooOoo = j - 2;
        if (i4 == i2) {
            this.OoooOoO = z00Var.OooO0O0();
            a10.OooO00o(z00Var);
        } else {
            z00Var.OooO0O0 = i4;
        }
        return (short) i5;
    }

    @Override // p285z2.j00
    public boolean request(long j) {
        return this.OoooOoo >= j;
    }

    @Override // p285z2.j00
    public void skip(long j) throws EOFException {
        while (j > 0) {
            if (this.OoooOoO == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, r0.OooO0OO - r0.OooO0O0);
            long j2 = iMin;
            this.OoooOoo -= j2;
            j -= j2;
            z00 z00Var = this.OoooOoO;
            int i = z00Var.OooO0O0 + iMin;
            z00Var.OooO0O0 = i;
            if (i == z00Var.OooO0OO) {
                this.OoooOoO = z00Var.OooO0O0();
                a10.OooO00o(z00Var);
            }
        }
    }

    @Override // p285z2.c10
    public d10 timeout() {
        return d10.OooO0Oo;
    }

    public String toString() {
        return o00000O().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            z00 z00VarO00000Oo = o00000Oo(1);
            int iMin = Math.min(i, 8192 - z00VarO00000Oo.OooO0OO);
            byteBuffer.get(z00VarO00000Oo.OooO00o, z00VarO00000Oo.OooO0OO, iMin);
            i -= iMin;
            z00VarO00000Oo.OooO0OO += iMin;
        }
        this.OoooOoo += (long) iRemaining;
        return iRemaining;
    }
}
