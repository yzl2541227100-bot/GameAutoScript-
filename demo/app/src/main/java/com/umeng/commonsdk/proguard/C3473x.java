package com.umeng.commonsdk.proguard;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.x */
/* JADX INFO: loaded from: classes2.dex */
public class C3473x {
    /* JADX INFO: renamed from: a */
    public static final byte m16119a(byte b, int i, boolean z) {
        return (byte) m16120a((int) b, i, z);
    }

    /* JADX INFO: renamed from: a */
    public static final int m16120a(int i, int i2, boolean z) {
        return z ? i | (1 << i2) : m16132b(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static final int m16121a(byte[] bArr) {
        return m16122a(bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final int m16122a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static final long m16123a(long j, int i, boolean z) {
        return z ? j | (1 << i) : m16133b(j, i);
    }

    /* JADX INFO: renamed from: a */
    public static final short m16124a(short s, int i, boolean z) {
        return (short) m16120a((int) s, i, z);
    }

    /* JADX INFO: renamed from: a */
    public static final void m16125a(int i, byte[] bArr) {
        m16126a(i, bArr, 0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m16126a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16127a(byte b, int i) {
        return m16128a((int) b, i);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16128a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16129a(long j, int i) {
        return (j & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m16130a(short s, int i) {
        return m16128a((int) s, i);
    }

    /* JADX INFO: renamed from: b */
    public static final byte m16131b(byte b, int i) {
        return (byte) m16132b((int) b, i);
    }

    /* JADX INFO: renamed from: b */
    public static final int m16132b(int i, int i2) {
        return i & (~(1 << i2));
    }

    /* JADX INFO: renamed from: b */
    public static final long m16133b(long j, int i) {
        return j & (~(1 << i));
    }

    /* JADX INFO: renamed from: b */
    public static final short m16134b(short s, int i) {
        return (short) m16132b((int) s, i);
    }
}
