package com.anythink.expressad.foundation.p120g.p126f.p130d;

import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.C1858k;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;
import java.io.File;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1833a extends AbstractC1856i<Void> {

    /* JADX INFO: renamed from: c */
    private static final String f11338c = C1833a.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private File f11339d;

    /* JADX INFO: renamed from: e */
    private File f11340e;

    public C1833a(File file, String str) {
        super(str);
        this.f11339d = file;
        this.f11340e = new File(file + ".tmp");
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: a */
    public final C1858k<Void> mo9519a(C1846c c1846c) {
        return !m9619f() ? (!this.f11340e.canRead() || this.f11340e.length() <= 0) ? C1858k.m9634a(new C1824a(4, c1846c)) : this.f11340e.renameTo(this.f11339d) ? C1858k.m9635a(null, c1846c) : C1858k.m9634a(new C1824a(4, c1846c)) : C1858k.m9634a(new C1824a(-2, c1846c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r15.mo9503b(r13);
     */
    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] mo9520a(com.anythink.expressad.foundation.p120g.p126f.p132f.C1845b r14, com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c r15) throws java.lang.Throwable {
        /*
            r13 = this;
            java.util.List r0 = r14.m9567b()
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = com.anythink.expressad.foundation.p120g.p126f.p133g.C1851d.m9572a(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L1b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r0 = r0.longValue()
            goto L1c
        L1b:
            r0 = r2
        L1c:
            r10 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3a
            java.io.File r4 = r13.f11339d
            long r4 = r4.length()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L3a
            java.io.File r14 = r13.f11339d
            java.io.File r2 = r13.f11340e
            r14.renameTo(r2)
            r4 = r15
            r5 = r13
            r6 = r0
            r8 = r0
            r4.mo9500a(r5, r6, r8)
            return r10
        L3a:
            java.io.RandomAccessFile r11 = new java.io.RandomAccessFile
            java.io.File r4 = r13.f11340e
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r5 = "rw"
            r11.<init>(r4, r5)
            r11.setLength(r2)
            java.io.InputStream r4 = r14.m9568c()     // Catch: java.lang.Throwable -> L99
            java.util.List r14 = r14.m9567b()     // Catch: java.lang.Throwable -> L96
            boolean r14 = com.anythink.expressad.foundation.p120g.p126f.p133g.C1851d.m9575b(r14)     // Catch: java.lang.Throwable -> L96
            if (r14 == 0) goto L62
            boolean r14 = r4 instanceof java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L96
            if (r14 != 0) goto L62
            java.util.zip.GZIPInputStream r14 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L96
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L96
            goto L63
        L62:
            r14 = r4
        L63:
            r4 = 6144(0x1800, float:8.61E-42)
            byte[] r12 = new byte[r4]     // Catch: java.lang.Throwable -> L92
        L67:
            int r4 = r14.read(r12)     // Catch: java.lang.Throwable -> L92
            r5 = -1
            if (r4 == r5) goto L84
            r5 = 0
            r11.write(r12, r5, r4)     // Catch: java.lang.Throwable -> L92
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L92
            long r2 = r2 + r4
            r4 = r15
            r5 = r13
            r6 = r0
            r8 = r2
            r4.mo9500a(r5, r6, r8)     // Catch: java.lang.Throwable -> L92
            boolean r4 = r13.m9619f()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L67
            r15.mo9503b(r13)     // Catch: java.lang.Throwable -> L92
        L84:
            if (r14 == 0) goto L8e
            r14.close()     // Catch: java.lang.Exception -> L8a
            goto L8e
        L8a:
            r14 = move-exception
            r14.getMessage()
        L8e:
            r11.close()
            return r10
        L92:
            r15 = move-exception
            r10 = r14
            r14 = r15
            goto L9a
        L96:
            r14 = move-exception
            r10 = r4
            goto L9a
        L99:
            r14 = move-exception
        L9a:
            if (r10 == 0) goto La4
            r10.close()     // Catch: java.lang.Exception -> La0
            goto La4
        La0:
            r15 = move-exception
            r15.getMessage()
        La4:
            r11.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p120g.p126f.p130d.C1833a.mo9520a(com.anythink.expressad.foundation.g.f.f.b, com.anythink.expressad.foundation.g.f.c):byte[]");
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: j */
    public final int mo9521j() {
        return 1;
    }
}
