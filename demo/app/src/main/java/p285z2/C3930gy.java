package p285z2;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: z2.gy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3930gy {
    private final FileChannel OooO00o;

    public C3930gy(FileChannel fileChannel) {
        this.OooO00o = fileChannel;
    }

    public void OooO00o(long j, h00 h00Var, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferTo = this.OooO00o.transferTo(j, j2, h00Var);
            j += jTransferTo;
            j2 -= jTransferTo;
        }
    }

    public void OooO0O0(long j, h00 h00Var, long j2) throws IOException {
        if (j2 < 0 || j2 > h00Var.o00000O0()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferFrom = this.OooO00o.transferFrom(h00Var, j3, j4);
            j3 += jTransferFrom;
            j4 -= jTransferFrom;
        }
    }
}
