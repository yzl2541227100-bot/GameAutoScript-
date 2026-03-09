package p285z2;

import java.io.IOException;

/* JADX INFO: renamed from: z2.ey */
/* JADX INFO: loaded from: classes2.dex */
public class C3856ey extends l00 {
    private boolean OoooOoo;

    public C3856ey(b10 b10Var) {
        super(b10Var);
    }

    @Override // p285z2.l00, p285z2.b10
    public void OooOooO(h00 h00Var, long j) throws IOException {
        if (this.OoooOoo) {
            h00Var.skip(j);
            return;
        }
        try {
            super.OooOooO(h00Var, j);
        } catch (IOException e) {
            this.OoooOoo = true;
            OooooOo(e);
        }
    }

    public void OooooOo(IOException iOException) {
    }

    @Override // p285z2.l00, p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.OoooOoo) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.OoooOoo = true;
            OooooOo(e);
        }
    }

    @Override // p285z2.l00, p285z2.b10, java.io.Flushable
    public void flush() throws IOException {
        if (this.OoooOoo) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.OoooOoo = true;
            OooooOo(e);
        }
    }
}
