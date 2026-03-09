package p285z2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p285z2.ce0;

/* JADX INFO: loaded from: classes2.dex */
public class he0 extends ce0.OooO0OO {
    public he0(fe0 fe0Var, ce0.OooO0O0 oooO0O0, long j) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(oooO0O0.OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = oooO0O0.OooO0OO + (j * ((long) oooO0O0.OooO0o0));
        this.OooO00o = fe0Var.o00O0O(byteBufferAllocate, j2);
        this.OooO0O0 = fe0Var.o0OoOo0(byteBufferAllocate, 8 + j2);
        this.OooO0OO = fe0Var.o0OoOo0(byteBufferAllocate, 16 + j2);
        this.OooO0Oo = fe0Var.o0OoOo0(byteBufferAllocate, j2 + 40);
    }
}
