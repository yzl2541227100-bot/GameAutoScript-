package com.umeng.commonsdk.proguard;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.bn */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3449bn {
    /* JADX INFO: renamed from: a */
    public abstract int mo15862a(byte[] bArr, int i, int i2) throws C3450bo;

    /* JADX INFO: renamed from: a */
    public void mo15868a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo15863a();

    /* JADX INFO: renamed from: b */
    public abstract void mo15864b() throws C3450bo;

    /* JADX INFO: renamed from: b */
    public void m15875b(byte[] bArr) throws C3450bo {
        mo15865b(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo15865b(byte[] bArr, int i, int i2) throws C3450bo;

    /* JADX INFO: renamed from: c */
    public abstract void mo15866c();

    /* JADX INFO: renamed from: d */
    public int m15876d(byte[] bArr, int i, int i2) throws C3450bo {
        int i3 = 0;
        while (i3 < i2) {
            int iMo15862a = mo15862a(bArr, i + i3, i2 - i3);
            if (iMo15862a <= 0) {
                throw new C3450bo("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i3 += iMo15862a;
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public void mo15867d() throws C3450bo {
    }

    /* JADX INFO: renamed from: f */
    public byte[] mo15872f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int mo15873g() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo15874h() {
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15877i() {
        return mo15863a();
    }
}
