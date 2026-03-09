package p285z2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p285z2.ce0;

/* JADX INFO: loaded from: classes2.dex */
public class ee0 extends ce0.OooO0O0 {
    private final fe0 OooOOO0;

    public ee0(boolean z, fe0 fe0Var) throws IOException {
        this.OooO00o = z;
        this.OooOOO0 = fe0Var;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.OooO0O0 = fe0Var.Ooooooo(byteBufferAllocate, 16L);
        this.OooO0OO = fe0Var.o0OoOo0(byteBufferAllocate, 32L);
        this.OooO0Oo = fe0Var.o0OoOo0(byteBufferAllocate, 40L);
        this.OooO0o0 = fe0Var.Ooooooo(byteBufferAllocate, 54L);
        this.OooO0o = fe0Var.Ooooooo(byteBufferAllocate, 56L);
        this.OooO0oO = fe0Var.Ooooooo(byteBufferAllocate, 58L);
        this.OooO0oo = fe0Var.Ooooooo(byteBufferAllocate, 60L);
        this.OooO = fe0Var.Ooooooo(byteBufferAllocate, 62L);
    }

    @Override // z2.ce0.OooO0O0
    public ce0.OooO00o OooO00o(long j, int i) throws IOException {
        return new be0(this.OooOOO0, this, j, i);
    }

    @Override // z2.ce0.OooO0O0
    public ce0.OooO0OO OooO0O0(long j) throws IOException {
        return new he0(this.OooOOO0, this, j);
    }

    @Override // z2.ce0.OooO0O0
    public ce0.OooO0o OooO0OO(int i) throws IOException {
        return new je0(this.OooOOO0, this, i);
    }
}
