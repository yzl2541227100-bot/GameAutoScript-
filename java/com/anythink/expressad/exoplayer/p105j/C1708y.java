package com.anythink.expressad.exoplayer.p105j;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1708y implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    public static final String f9533a = "rawresource";

    /* JADX INFO: renamed from: b */
    private final Resources f9534b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1684aa<? super C1708y> f9535c;

    /* JADX INFO: renamed from: d */
    private Uri f9536d;

    /* JADX INFO: renamed from: e */
    private AssetFileDescriptor f9537e;

    /* JADX INFO: renamed from: f */
    private InputStream f9538f;

    /* JADX INFO: renamed from: g */
    private long f9539g;

    /* JADX INFO: renamed from: h */
    private boolean f9540h;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.y$a */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }

        public a(String str) {
            super(str);
        }
    }

    private C1708y(Context context) {
        this(context, null);
    }

    public C1708y(Context context, InterfaceC1684aa<? super C1708y> interfaceC1684aa) {
        this.f9534b = context.getResources();
        this.f9535c = interfaceC1684aa;
    }

    /* JADX INFO: renamed from: a */
    private static Uri m7927a(int i) {
        return Uri.parse("rawresource:///".concat(String.valueOf(i)));
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9539g;
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
        int i3 = this.f9538f.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f9539g == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f9539g;
        if (j2 != -1) {
            this.f9539g = j2 - ((long) i3);
        }
        InterfaceC1684aa<? super C1708y> interfaceC1684aa = this.f9535c;
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
            this.f9536d = uri;
            if (!TextUtils.equals(f9533a, uri.getScheme())) {
                throw new a("URI must use scheme rawresource");
            }
            try {
                this.f9537e = this.f9534b.openRawResourceFd(Integer.parseInt(this.f9536d.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.f9537e.getFileDescriptor());
                this.f9538f = fileInputStream;
                fileInputStream.skip(this.f9537e.getStartOffset());
                if (this.f9538f.skip(c1694k.f9398f) < c1694k.f9398f) {
                    throw new EOFException();
                }
                long j = c1694k.f9399g;
                long j2 = -1;
                if (j != -1) {
                    this.f9539g = j;
                } else {
                    long length = this.f9537e.getLength();
                    if (length != -1) {
                        j2 = length - c1694k.f9398f;
                    }
                    this.f9539g = j2;
                }
                this.f9540h = true;
                InterfaceC1684aa<? super C1708y> interfaceC1684aa = this.f9535c;
                if (interfaceC1684aa != null) {
                    interfaceC1684aa.mo7841b();
                }
                return this.f9539g;
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.");
            }
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        return this.f9536d;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        this.f9536d = null;
        try {
            try {
                InputStream inputStream = this.f9538f;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9538f = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f9537e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.f9537e = null;
                    if (this.f9540h) {
                        this.f9540h = false;
                        InterfaceC1684aa<? super C1708y> interfaceC1684aa = this.f9535c;
                        if (interfaceC1684aa != null) {
                            interfaceC1684aa.mo7842c();
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.f9538f = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f9537e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f9537e = null;
                    if (this.f9540h) {
                        this.f9540h = false;
                        InterfaceC1684aa<? super C1708y> interfaceC1684aa2 = this.f9535c;
                        if (interfaceC1684aa2 != null) {
                            interfaceC1684aa2.mo7842c();
                        }
                    }
                    throw th;
                } finally {
                    this.f9537e = null;
                    if (this.f9540h) {
                        this.f9540h = false;
                        InterfaceC1684aa<? super C1708y> interfaceC1684aa3 = this.f9535c;
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
