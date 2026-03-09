package com.anythink.expressad.exoplayer.p092c;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import com.anythink.expressad.exoplayer.p107k.C1717af;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1524b {

    /* JADX INFO: renamed from: a */
    public byte[] f7854a;

    /* JADX INFO: renamed from: b */
    public byte[] f7855b;

    /* JADX INFO: renamed from: c */
    public int f7856c;

    /* JADX INFO: renamed from: d */
    public int[] f7857d;

    /* JADX INFO: renamed from: e */
    public int[] f7858e;

    /* JADX INFO: renamed from: f */
    public int f7859f;

    /* JADX INFO: renamed from: g */
    public int f7860g;

    /* JADX INFO: renamed from: h */
    public int f7861h;

    /* JADX INFO: renamed from: i */
    private final MediaCodec.CryptoInfo f7862i;

    /* JADX INFO: renamed from: j */
    private final a f7863j;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.c.b$a */
    @TargetApi(24)
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final MediaCodec.CryptoInfo f7864a;

        /* JADX INFO: renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f7865b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f7864a = cryptoInfo;
            this.f7865b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, byte b) {
            this(cryptoInfo);
        }

        /* JADX INFO: renamed from: a */
        private void m6648a(int i, int i2) {
            this.f7865b.set(i, i2);
            this.f7864a.setPattern(this.f7865b);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m6649a(a aVar, int i, int i2) {
            aVar.f7865b.set(i, i2);
            aVar.f7864a.setPattern(aVar.f7865b);
        }
    }

    public C1524b() {
        int i = C1717af.f9627a;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f7862i = cryptoInfo;
        this.f7863j = i >= 24 ? new a(cryptoInfo, (byte) 0) : null;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: b */
    private static MediaCodec.CryptoInfo m6644b() {
        return new MediaCodec.CryptoInfo();
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: c */
    private void m6645c() {
        MediaCodec.CryptoInfo cryptoInfo = this.f7862i;
        cryptoInfo.numSubSamples = this.f7859f;
        cryptoInfo.numBytesOfClearData = this.f7857d;
        cryptoInfo.numBytesOfEncryptedData = this.f7858e;
        cryptoInfo.key = this.f7855b;
        cryptoInfo.iv = this.f7854a;
        cryptoInfo.mode = this.f7856c;
        if (C1717af.f9627a >= 24) {
            a.m6649a(this.f7863j, this.f7860g, this.f7861h);
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    public final MediaCodec.CryptoInfo m6646a() {
        return this.f7862i;
    }

    /* JADX INFO: renamed from: a */
    public final void m6647a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f7859f = i;
        this.f7857d = iArr;
        this.f7858e = iArr2;
        this.f7855b = bArr;
        this.f7854a = bArr2;
        this.f7856c = i2;
        this.f7860g = i3;
        this.f7861h = i4;
        int i5 = C1717af.f9627a;
        if (i5 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f7862i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i2;
            if (i5 >= 24) {
                a.m6649a(this.f7863j, i3, i4);
            }
        }
    }
}
