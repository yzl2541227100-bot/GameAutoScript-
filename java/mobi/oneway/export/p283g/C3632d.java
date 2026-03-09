package mobi.oneway.export.p283g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: mobi.oneway.export.g.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3632d extends OutputStream {

    /* JADX INFO: renamed from: a */
    private OutputStream f19785a;

    /* JADX INFO: renamed from: b */
    private int f19786b;

    /* JADX INFO: renamed from: c */
    private int f19787c;

    /* JADX INFO: renamed from: d */
    private int f19788d;

    /* JADX INFO: renamed from: e */
    private int f19789e;

    public C3632d(OutputStream outputStream) {
        this(outputStream, 76);
    }

    public C3632d(OutputStream outputStream, int i) {
        this.f19785a = null;
        this.f19786b = 0;
        this.f19787c = 0;
        this.f19788d = 0;
        this.f19789e = 0;
        this.f19785a = outputStream;
        this.f19789e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m16927a() throws IOException {
        if (this.f19787c <= 0) {
            return;
        }
        int i = this.f19789e;
        if (i > 0 && this.f19788d == i) {
            this.f19785a.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes("UTF-8"));
            this.f19788d = 0;
        }
        char cCharAt = C3645q.f19811a.charAt((this.f19786b << 8) >>> 26);
        char cCharAt2 = C3645q.f19811a.charAt((this.f19786b << 14) >>> 26);
        char cCharAt3 = this.f19787c < 2 ? C3645q.f19812b : C3645q.f19811a.charAt((this.f19786b << 20) >>> 26);
        char cCharAt4 = this.f19787c < 3 ? C3645q.f19812b : C3645q.f19811a.charAt((this.f19786b << 26) >>> 26);
        this.f19785a.write(cCharAt);
        this.f19785a.write(cCharAt2);
        this.f19785a.write(cCharAt3);
        this.f19785a.write(cCharAt4);
        this.f19788d += 4;
        this.f19787c = 0;
        this.f19786b = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m16927a();
        this.f19785a.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        int i2 = this.f19787c;
        this.f19786b = ((i & 255) << (16 - (i2 * 8))) | this.f19786b;
        int i3 = i2 + 1;
        this.f19787c = i3;
        if (i3 == 3) {
            m16927a();
        }
    }
}
