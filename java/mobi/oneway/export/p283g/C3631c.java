package mobi.oneway.export.p283g;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: mobi.oneway.export.g.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3631c extends InputStream {

    /* JADX INFO: renamed from: a */
    private InputStream f19781a;

    /* JADX INFO: renamed from: b */
    private int[] f19782b;

    /* JADX INFO: renamed from: c */
    private int f19783c = 0;

    /* JADX INFO: renamed from: d */
    private boolean f19784d = false;

    public C3631c(InputStream inputStream) {
        this.f19781a = inputStream;
    }

    /* JADX INFO: renamed from: a */
    private void m16926a() throws IOException {
        int i;
        char[] cArr = new char[4];
        int i2 = 0;
        do {
            int i3 = this.f19781a.read();
            i = 1;
            if (i3 == -1) {
                if (i2 != 0) {
                    throw new IOException("Bad base64 stream");
                }
                this.f19782b = new int[0];
                this.f19784d = true;
                return;
            }
            char c = (char) i3;
            if (C3645q.f19811a.indexOf(c) != -1 || c == C3645q.f19812b) {
                cArr[i2] = c;
                i2++;
            } else if (c != '\r' && c != '\n') {
                throw new IOException("Bad base64 stream");
            }
        } while (i2 < 4);
        boolean z = false;
        for (int i4 = 0; i4 < 4; i4++) {
            if (cArr[i4] != C3645q.f19812b) {
                if (z) {
                    throw new IOException("Bad base64 stream");
                }
            } else if (!z) {
                z = true;
            }
        }
        if (cArr[3] != C3645q.f19812b) {
            i = 3;
        } else {
            if (this.f19781a.read() != -1) {
                throw new IOException("Bad base64 stream");
            }
            this.f19784d = true;
            if (cArr[2] != C3645q.f19812b) {
                i = 2;
            }
        }
        int iIndexOf = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            if (cArr[i5] != C3645q.f19812b) {
                iIndexOf |= C3645q.f19811a.indexOf(cArr[i5]) << ((3 - i5) * 6);
            }
        }
        this.f19782b = new int[i];
        for (int i6 = 0; i6 < i; i6++) {
            this.f19782b[i6] = (iIndexOf >>> ((2 - i6) * 8)) & 255;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19781a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i;
        int[] iArr = this.f19782b;
        if (iArr != null && (i = this.f19783c) != iArr.length) {
            this.f19783c = i + 1;
            return iArr[i];
        }
        if (this.f19784d) {
            return -1;
        }
        m16926a();
        int[] iArr2 = this.f19782b;
        if (iArr2.length == 0) {
            this.f19782b = null;
            return -1;
        }
        this.f19783c = 0;
        this.f19783c = 0 + 1;
        return iArr2[0];
    }
}
