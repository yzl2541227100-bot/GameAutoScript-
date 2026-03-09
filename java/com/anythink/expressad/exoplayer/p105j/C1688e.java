package com.anythink.expressad.exoplayer.p105j;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.anythink.expressad.foundation.p116d.C1781c;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1688e implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    private final ContentResolver f9374a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1684aa<? super C1688e> f9375b;

    /* JADX INFO: renamed from: c */
    private Uri f9376c;

    /* JADX INFO: renamed from: d */
    private AssetFileDescriptor f9377d;

    /* JADX INFO: renamed from: e */
    private FileInputStream f9378e;

    /* JADX INFO: renamed from: f */
    private long f9379f;

    /* JADX INFO: renamed from: g */
    private boolean f9380g;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.e$a */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    private C1688e(Context context) {
        this(context, null);
    }

    public C1688e(Context context, InterfaceC1684aa<? super C1688e> interfaceC1684aa) {
        this.f9374a = context.getContentResolver();
        this.f9375b = interfaceC1684aa;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9379f;
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
        int i3 = this.f9378e.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f9379f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f9379f;
        if (j2 != -1) {
            this.f9379f = j2 - ((long) i3);
        }
        InterfaceC1684aa<? super C1688e> interfaceC1684aa = this.f9375b;
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
            this.f9376c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f9374a.openAssetFileDescriptor(uri, C1781c.f10296bk);
            this.f9377d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f9376c);
            }
            this.f9378e = new FileInputStream(this.f9377d.getFileDescriptor());
            long startOffset = this.f9377d.getStartOffset();
            long jSkip = this.f9378e.skip(c1694k.f9398f + startOffset) - startOffset;
            if (jSkip != c1694k.f9398f) {
                throw new EOFException();
            }
            long j = c1694k.f9399g;
            long jPosition = -1;
            if (j != -1) {
                this.f9379f = j;
            } else {
                long length = this.f9377d.getLength();
                if (length == -1) {
                    FileChannel channel = this.f9378e.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        jPosition = size - channel.position();
                    }
                    this.f9379f = jPosition;
                } else {
                    this.f9379f = length - jSkip;
                }
            }
            this.f9380g = true;
            InterfaceC1684aa<? super C1688e> interfaceC1684aa = this.f9375b;
            if (interfaceC1684aa != null) {
                interfaceC1684aa.mo7841b();
            }
            return this.f9379f;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9376c;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        this.f9376c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f9378e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f9378e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f9377d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.f9377d = null;
                    if (this.f9380g) {
                        this.f9380g = false;
                        InterfaceC1684aa<? super C1688e> interfaceC1684aa = this.f9375b;
                        if (interfaceC1684aa != null) {
                            interfaceC1684aa.mo7842c();
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.f9378e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f9377d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f9377d = null;
                    if (this.f9380g) {
                        this.f9380g = false;
                        InterfaceC1684aa<? super C1688e> interfaceC1684aa2 = this.f9375b;
                        if (interfaceC1684aa2 != null) {
                            interfaceC1684aa2.mo7842c();
                        }
                    }
                    throw th;
                } finally {
                    this.f9377d = null;
                    if (this.f9380g) {
                        this.f9380g = false;
                        InterfaceC1684aa<? super C1688e> interfaceC1684aa3 = this.f9375b;
                        if (interfaceC1684aa3 != null) {
                            interfaceC1684aa3.mo7842c();
                        }
                    }
                }
            } catch (IOException e3) {
                throw new a(e3);
            }
        }
    }
}
