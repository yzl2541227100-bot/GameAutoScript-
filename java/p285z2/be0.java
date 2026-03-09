package p285z2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p285z2.ce0;

/* JADX INFO: loaded from: classes2.dex */
public class be0 extends ce0.OooO00o {
    public be0(fe0 fe0Var, ce0.OooO0O0 oooO0O0, long j, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(oooO0O0.OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        this.OooO00o = fe0Var.o0OoOo0(byteBufferAllocate, j2);
        this.OooO0O0 = fe0Var.o0OoOo0(byteBufferAllocate, j2 + 8);
    }
}
