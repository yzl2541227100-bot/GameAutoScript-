package p285z2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p285z2.ce0;

/* JADX INFO: loaded from: classes2.dex */
public class ie0 extends ce0.OooO0o {
    public ie0(fe0 fe0Var, ce0.OooO0O0 oooO0O0, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(oooO0O0.OooO00o ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.OooO00o = fe0Var.o00O0O(byteBufferAllocate, oooO0O0.OooO0Oo + ((long) (i * oooO0O0.OooO0oO)) + 28);
    }
}
