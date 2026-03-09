package com.anythink.expressad.exoplayer.p105j;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1686c implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    private final AssetManager f9368a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1684aa<? super C1686c> f9369b;

    /* JADX INFO: renamed from: c */
    private Uri f9370c;

    /* JADX INFO: renamed from: d */
    private InputStream f9371d;

    /* JADX INFO: renamed from: e */
    private long f9372e;

    /* JADX INFO: renamed from: f */
    private boolean f9373f;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.c$a */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private C1686c(Context context) {
        this(context, null);
    }

    public C1686c(Context context, InterfaceC1684aa<? super C1686c> interfaceC1684aa) {
        this.f9368a = context.getAssets();
        this.f9369b = interfaceC1684aa;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9372e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int i3 = this.f9371d.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f9372e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f9372e;
        if (j2 != -1) {
            this.f9372e = j2 - ((long) i3);
        }
        InterfaceC1684aa<? super C1686c> interfaceC1684aa = this.f9369b;
        if (interfaceC1684aa != null) {
            interfaceC1684aa.mo7840a(i3);
        }
        return i3;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final long mo7742a(C1694k c1694k) throws a {
        try {
            Uri uri = c1694k.f9395c;
            this.f9370c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f9368a.open(path, 1);
            this.f9371d = inputStreamOpen;
            if (inputStreamOpen.skip(c1694k.f9398f) < c1694k.f9398f) {
                throw new EOFException();
            }
            long j = c1694k.f9399g;
            if (j != -1) {
                this.f9372e = j;
            } else {
                long jAvailable = this.f9371d.available();
                this.f9372e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9372e = -1L;
                }
            }
            this.f9373f = true;
            InterfaceC1684aa<? super C1686c> interfaceC1684aa = this.f9369b;
            if (interfaceC1684aa != null) {
                interfaceC1684aa.mo7841b();
            }
            return this.f9372e;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9370c;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        this.f9370c = null;
        try {
            try {
                InputStream inputStream = this.f9371d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.f9371d = null;
            if (this.f9373f) {
                this.f9373f = false;
                InterfaceC1684aa<? super C1686c> interfaceC1684aa = this.f9369b;
                if (interfaceC1684aa != null) {
                    interfaceC1684aa.mo7842c();
                }
            }
        }
    }
}
