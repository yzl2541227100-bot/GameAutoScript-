package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1701r implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1684aa<? super C1701r> f9480a;

    /* JADX INFO: renamed from: b */
    private RandomAccessFile f9481b;

    /* JADX INFO: renamed from: c */
    private Uri f9482c;

    /* JADX INFO: renamed from: d */
    private long f9483d;

    /* JADX INFO: renamed from: e */
    private boolean f9484e;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.r$a */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C1701r() {
        this(null);
    }

    public C1701r(InterfaceC1684aa<? super C1701r> interfaceC1684aa) {
        this.f9480a = interfaceC1684aa;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9483d;
        if (j == 0) {
            return -1;
        }
        try {
            int i3 = this.f9481b.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f9483d -= (long) i3;
                InterfaceC1684aa<? super C1701r> interfaceC1684aa = this.f9480a;
                if (interfaceC1684aa != null) {
                    interfaceC1684aa.mo7840a(i3);
                }
            }
            return i3;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final long mo7742a(C1694k c1694k) throws a {
        try {
            this.f9482c = c1694k.f9395c;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c1694k.f9395c.getPath(), C1781c.f10296bk);
            this.f9481b = randomAccessFile;
            randomAccessFile.seek(c1694k.f9398f);
            long length = c1694k.f9399g;
            if (length == -1) {
                length = this.f9481b.length() - c1694k.f9398f;
            }
            this.f9483d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f9484e = true;
            InterfaceC1684aa<? super C1701r> interfaceC1684aa = this.f9480a;
            if (interfaceC1684aa != null) {
                interfaceC1684aa.mo7841b();
            }
            return this.f9483d;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9482c;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        this.f9482c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9481b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.f9481b = null;
            if (this.f9484e) {
                this.f9484e = false;
                InterfaceC1684aa<? super C1701r> interfaceC1684aa = this.f9480a;
                if (interfaceC1684aa != null) {
                    interfaceC1684aa.mo7842c();
                }
            }
        }
    }
}
