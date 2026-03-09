package com.umeng.commonsdk.proguard;

import java.util.BitSet;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.bf */
/* JADX INFO: loaded from: classes2.dex */
public final class C3441bf extends C3428at {

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.bf$a */
    public static class a implements InterfaceC3437bb {
        @Override // com.umeng.commonsdk.proguard.InterfaceC3437bb
        /* JADX INFO: renamed from: a */
        public AbstractC3434az mo15825a(AbstractC3449bn abstractC3449bn) {
            return new C3441bf(abstractC3449bn);
        }
    }

    public C3441bf(AbstractC3449bn abstractC3449bn) {
        super(abstractC3449bn);
    }

    /* JADX INFO: renamed from: a */
    public static BitSet m15858a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i = 0; i < bArr.length * 8; i++) {
            if ((bArr[(bArr.length - (i / 8)) - 1] & (1 << (i % 8))) > 0) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m15859b(BitSet bitSet, int i) {
        int iCeil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i2 = 0; i2 < bitSet.length(); i2++) {
            if (bitSet.get(i2)) {
                int i3 = (iCeil - (i2 / 8)) - 1;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        return bArr;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3434az
    /* JADX INFO: renamed from: D */
    public Class<? extends InterfaceC3443bh> mo15850D() {
        return AbstractC3446bk.class;
    }

    /* JADX INFO: renamed from: a */
    public void m15860a(BitSet bitSet, int i) throws C3415ag {
        for (byte b : m15859b(bitSet, i)) {
            mo15783a(b);
        }
    }

    /* JADX INFO: renamed from: b */
    public BitSet m15861b(int i) throws C3415ag {
        int iCeil = (int) Math.ceil(((double) i) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i2 = 0; i2 < iCeil; i2++) {
            bArr[i2] = mo15819u();
        }
        return m15858a(bArr);
    }
}
