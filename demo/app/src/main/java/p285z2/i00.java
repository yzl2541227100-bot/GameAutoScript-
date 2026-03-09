package p285z2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public interface i00 extends b10, WritableByteChannel {
    i00 OooO(long j) throws IOException;

    h00 OooO00o();

    i00 OooO0o(int i) throws IOException;

    i00 OooO0o0() throws IOException;

    i00 OooO0oO(int i) throws IOException;

    i00 OooO0oo(int i) throws IOException;

    i00 OooOOO0(int i) throws IOException;

    i00 OooOOOO(int i) throws IOException;

    i00 OooOo(int i) throws IOException;

    i00 OooOo0() throws IOException;

    i00 OooOoO0(String str) throws IOException;

    i00 OooOoo0(byte[] bArr, int i, int i2) throws IOException;

    i00 OooOooo(String str, int i, int i2) throws IOException;

    i00 Oooo(byte[] bArr) throws IOException;

    i00 Oooo0(String str, Charset charset) throws IOException;

    long Oooo000(c10 c10Var) throws IOException;

    i00 Oooo00O(long j) throws IOException;

    i00 Oooo0O0(c10 c10Var, long j) throws IOException;

    i00 OoooO0(ByteString byteString) throws IOException;

    i00 OoooOOo(long j) throws IOException;

    i00 OoooOoO(long j) throws IOException;

    OutputStream OoooOoo();

    @Override // p285z2.b10, java.io.Flushable
    void flush() throws IOException;

    i00 o000oOoO(String str, int i, int i2, Charset charset) throws IOException;
}
