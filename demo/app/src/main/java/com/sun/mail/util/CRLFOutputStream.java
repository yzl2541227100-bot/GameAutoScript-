package com.sun.mail.util;

import com.umeng.commonsdk.proguard.C3442bg;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class CRLFOutputStream extends FilterOutputStream {
    private static final byte[] newline = {C3442bg.f18781k, 10};
    public boolean atBOL;
    public int lastb;

    public CRLFOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.lastb = -1;
        this.atBOL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(int r3) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 13
            if (r3 != r0) goto L8
        L4:
            r2.writeln()
            goto L19
        L8:
            r1 = 10
            if (r3 != r1) goto L11
            int r1 = r2.lastb
            if (r1 == r0) goto L19
            goto L4
        L11:
            java.io.OutputStream r0 = r2.out
            r0.write(r3)
            r0 = 0
            r2.atBOL = r0
        L19:
            r2.lastb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.CRLFOutputStream.write(int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            int r7 = r7 + r6
            r0 = r6
        L2:
            if (r6 >= r7) goto L29
            r1 = r5[r6]
            r2 = 13
            if (r1 != r2) goto L15
        La:
            java.io.OutputStream r1 = r4.out
            int r2 = r6 - r0
            r1.write(r5, r0, r2)
            r4.writeln()
            goto L20
        L15:
            r1 = r5[r6]
            r3 = 10
            if (r1 != r3) goto L22
            int r1 = r4.lastb
            if (r1 == r2) goto L20
            goto La
        L20:
            int r0 = r6 + 1
        L22:
            r1 = r5[r6]
            r4.lastb = r1
            int r6 = r6 + 1
            goto L2
        L29:
            int r7 = r7 - r0
            if (r7 <= 0) goto L34
            java.io.OutputStream r6 = r4.out
            r6.write(r5, r0, r7)
            r5 = 0
            r4.atBOL = r5
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.CRLFOutputStream.write(byte[], int, int):void");
    }

    public void writeln() throws IOException {
        ((FilterOutputStream) this).out.write(newline);
        this.atBOL = true;
    }
}
