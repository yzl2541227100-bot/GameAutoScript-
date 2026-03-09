package com.sun.mail.auth;

/* JADX INFO: loaded from: classes2.dex */
public final class MD4 {
    private static final int S11 = 3;
    private static final int S12 = 7;
    private static final int S13 = 11;
    private static final int S14 = 19;
    private static final int S21 = 3;
    private static final int S22 = 5;
    private static final int S23 = 9;
    private static final int S24 = 13;
    private static final int S31 = 3;
    private static final int S32 = 9;
    private static final int S33 = 11;
    private static final int S34 = 15;
    private static final int blockSize = 64;
    private static final byte[] padding;
    private int bufOfs;
    private long bytesProcessed;
    private final byte[] buffer = new byte[64];
    private final int[] state = new int[4];

    /* JADX INFO: renamed from: x */
    private final int[] f18014x = new int[16];

    static {
        byte[] bArr = new byte[136];
        padding = bArr;
        bArr[0] = -128;
    }

    public MD4() {
        implReset();
    }

    /* JADX INFO: renamed from: FF */
    private static int m15118FF(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    /* JADX INFO: renamed from: GG */
    private static int m15119GG(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 & i4) | (i2 & i3) | (i3 & i4)) + i5 + 1518500249;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    /* JADX INFO: renamed from: HH */
    private static int m15120HH(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 ^ i3) ^ i4) + i5 + 1859775393;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    private void engineUpdate(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.bytesProcessed < 0) {
            implReset();
        }
        this.bytesProcessed += (long) i2;
        int i3 = this.bufOfs;
        if (i3 != 0) {
            int iMin = Math.min(i2, 64 - i3);
            System.arraycopy(bArr, i, this.buffer, this.bufOfs, iMin);
            int i4 = this.bufOfs + iMin;
            this.bufOfs = i4;
            i += iMin;
            i2 -= iMin;
            if (i4 >= 64) {
                implCompress(this.buffer, 0);
                this.bufOfs = 0;
            }
        }
        while (i2 >= 64) {
            implCompress(bArr, i);
            i2 -= 64;
            i += 64;
        }
        if (i2 > 0) {
            System.arraycopy(bArr, i, this.buffer, 0, i2);
            this.bufOfs = i2;
        }
    }

    private void implCompress(byte[] bArr, int i) {
        int i2 = i;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f18014x;
            if (i3 >= iArr.length) {
                int[] iArr2 = this.state;
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                int i6 = iArr2[2];
                int i7 = iArr2[3];
                int iM15118FF = m15118FF(i4, i5, i6, i7, iArr[0], 3);
                int iM15118FF2 = m15118FF(i7, iM15118FF, i5, i6, this.f18014x[1], 7);
                int iM15118FF3 = m15118FF(i6, iM15118FF2, iM15118FF, i5, this.f18014x[2], 11);
                int iM15118FF4 = m15118FF(i5, iM15118FF3, iM15118FF2, iM15118FF, this.f18014x[3], 19);
                int iM15118FF5 = m15118FF(iM15118FF, iM15118FF4, iM15118FF3, iM15118FF2, this.f18014x[4], 3);
                int iM15118FF6 = m15118FF(iM15118FF2, iM15118FF5, iM15118FF4, iM15118FF3, this.f18014x[5], 7);
                int iM15118FF7 = m15118FF(iM15118FF3, iM15118FF6, iM15118FF5, iM15118FF4, this.f18014x[6], 11);
                int iM15118FF8 = m15118FF(iM15118FF4, iM15118FF7, iM15118FF6, iM15118FF5, this.f18014x[7], 19);
                int iM15118FF9 = m15118FF(iM15118FF5, iM15118FF8, iM15118FF7, iM15118FF6, this.f18014x[8], 3);
                int iM15118FF10 = m15118FF(iM15118FF6, iM15118FF9, iM15118FF8, iM15118FF7, this.f18014x[9], 7);
                int iM15118FF11 = m15118FF(iM15118FF7, iM15118FF10, iM15118FF9, iM15118FF8, this.f18014x[10], 11);
                int iM15118FF12 = m15118FF(iM15118FF8, iM15118FF11, iM15118FF10, iM15118FF9, this.f18014x[11], 19);
                int iM15118FF13 = m15118FF(iM15118FF9, iM15118FF12, iM15118FF11, iM15118FF10, this.f18014x[12], 3);
                int iM15118FF14 = m15118FF(iM15118FF10, iM15118FF13, iM15118FF12, iM15118FF11, this.f18014x[13], 7);
                int iM15118FF15 = m15118FF(iM15118FF11, iM15118FF14, iM15118FF13, iM15118FF12, this.f18014x[14], 11);
                int iM15118FF16 = m15118FF(iM15118FF12, iM15118FF15, iM15118FF14, iM15118FF13, this.f18014x[15], 19);
                int iM15119GG = m15119GG(iM15118FF13, iM15118FF16, iM15118FF15, iM15118FF14, this.f18014x[0], 3);
                int iM15119GG2 = m15119GG(iM15118FF14, iM15119GG, iM15118FF16, iM15118FF15, this.f18014x[4], 5);
                int iM15119GG3 = m15119GG(iM15118FF15, iM15119GG2, iM15119GG, iM15118FF16, this.f18014x[8], 9);
                int iM15119GG4 = m15119GG(iM15118FF16, iM15119GG3, iM15119GG2, iM15119GG, this.f18014x[12], 13);
                int iM15119GG5 = m15119GG(iM15119GG, iM15119GG4, iM15119GG3, iM15119GG2, this.f18014x[1], 3);
                int iM15119GG6 = m15119GG(iM15119GG2, iM15119GG5, iM15119GG4, iM15119GG3, this.f18014x[5], 5);
                int iM15119GG7 = m15119GG(iM15119GG3, iM15119GG6, iM15119GG5, iM15119GG4, this.f18014x[9], 9);
                int iM15119GG8 = m15119GG(iM15119GG4, iM15119GG7, iM15119GG6, iM15119GG5, this.f18014x[13], 13);
                int iM15119GG9 = m15119GG(iM15119GG5, iM15119GG8, iM15119GG7, iM15119GG6, this.f18014x[2], 3);
                int iM15119GG10 = m15119GG(iM15119GG6, iM15119GG9, iM15119GG8, iM15119GG7, this.f18014x[6], 5);
                int iM15119GG11 = m15119GG(iM15119GG7, iM15119GG10, iM15119GG9, iM15119GG8, this.f18014x[10], 9);
                int iM15119GG12 = m15119GG(iM15119GG8, iM15119GG11, iM15119GG10, iM15119GG9, this.f18014x[14], 13);
                int iM15119GG13 = m15119GG(iM15119GG9, iM15119GG12, iM15119GG11, iM15119GG10, this.f18014x[3], 3);
                int iM15119GG14 = m15119GG(iM15119GG10, iM15119GG13, iM15119GG12, iM15119GG11, this.f18014x[7], 5);
                int iM15119GG15 = m15119GG(iM15119GG11, iM15119GG14, iM15119GG13, iM15119GG12, this.f18014x[11], 9);
                int iM15119GG16 = m15119GG(iM15119GG12, iM15119GG15, iM15119GG14, iM15119GG13, this.f18014x[15], 13);
                int iM15120HH = m15120HH(iM15119GG13, iM15119GG16, iM15119GG15, iM15119GG14, this.f18014x[0], 3);
                int iM15120HH2 = m15120HH(iM15119GG14, iM15120HH, iM15119GG16, iM15119GG15, this.f18014x[8], 9);
                int iM15120HH3 = m15120HH(iM15119GG15, iM15120HH2, iM15120HH, iM15119GG16, this.f18014x[4], 11);
                int iM15120HH4 = m15120HH(iM15119GG16, iM15120HH3, iM15120HH2, iM15120HH, this.f18014x[12], 15);
                int iM15120HH5 = m15120HH(iM15120HH, iM15120HH4, iM15120HH3, iM15120HH2, this.f18014x[2], 3);
                int iM15120HH6 = m15120HH(iM15120HH2, iM15120HH5, iM15120HH4, iM15120HH3, this.f18014x[10], 9);
                int iM15120HH7 = m15120HH(iM15120HH3, iM15120HH6, iM15120HH5, iM15120HH4, this.f18014x[6], 11);
                int iM15120HH8 = m15120HH(iM15120HH4, iM15120HH7, iM15120HH6, iM15120HH5, this.f18014x[14], 15);
                int iM15120HH9 = m15120HH(iM15120HH5, iM15120HH8, iM15120HH7, iM15120HH6, this.f18014x[1], 3);
                int iM15120HH10 = m15120HH(iM15120HH6, iM15120HH9, iM15120HH8, iM15120HH7, this.f18014x[9], 9);
                int iM15120HH11 = m15120HH(iM15120HH7, iM15120HH10, iM15120HH9, iM15120HH8, this.f18014x[5], 11);
                int iM15120HH12 = m15120HH(iM15120HH8, iM15120HH11, iM15120HH10, iM15120HH9, this.f18014x[13], 15);
                int iM15120HH13 = m15120HH(iM15120HH9, iM15120HH12, iM15120HH11, iM15120HH10, this.f18014x[3], 3);
                int iM15120HH14 = m15120HH(iM15120HH10, iM15120HH13, iM15120HH12, iM15120HH11, this.f18014x[11], 9);
                int iM15120HH15 = m15120HH(iM15120HH11, iM15120HH14, iM15120HH13, iM15120HH12, this.f18014x[7], 11);
                int iM15120HH16 = m15120HH(iM15120HH12, iM15120HH15, iM15120HH14, iM15120HH13, this.f18014x[15], 15);
                int[] iArr3 = this.state;
                iArr3[0] = iArr3[0] + iM15120HH13;
                iArr3[1] = iArr3[1] + iM15120HH16;
                iArr3[2] = iArr3[2] + iM15120HH15;
                iArr3[3] = iArr3[3] + iM15120HH14;
                return;
            }
            iArr[i3] = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
            i2 += 4;
            i3++;
        }
    }

    private void implDigest(byte[] bArr, int i) {
        long j = this.bytesProcessed;
        long j2 = j << 3;
        int i2 = ((int) j) & 63;
        int i3 = 0;
        engineUpdate(padding, 0, i2 < 56 ? 56 - i2 : 120 - i2);
        byte[] bArr2 = this.buffer;
        bArr2[56] = (byte) j2;
        bArr2[57] = (byte) (j2 >> 8);
        bArr2[58] = (byte) (j2 >> 16);
        bArr2[59] = (byte) (j2 >> 24);
        bArr2[60] = (byte) (j2 >> 32);
        bArr2[61] = (byte) (j2 >> 40);
        bArr2[62] = (byte) (j2 >> 48);
        bArr2[63] = (byte) (j2 >> 56);
        implCompress(bArr2, 0);
        while (true) {
            int[] iArr = this.state;
            if (i3 >= iArr.length) {
                return;
            }
            int i4 = iArr[i3];
            int i5 = i + 1;
            bArr[i] = (byte) i4;
            int i6 = i5 + 1;
            bArr[i5] = (byte) (i4 >> 8);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (i4 >> 16);
            i = i7 + 1;
            bArr[i7] = (byte) (i4 >> 24);
            i3++;
        }
    }

    private void implReset() {
        int[] iArr = this.state;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        this.bufOfs = 0;
        this.bytesProcessed = 0L;
    }

    public final byte[] digest(byte[] bArr) {
        implReset();
        engineUpdate(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[16];
        implDigest(bArr2, 0);
        return bArr2;
    }
}
