package p285z2;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: z2.f */
/* JADX INFO: loaded from: classes.dex */
public class C3858f implements oO0Ooooo<byte[]> {
    private final byte[] OoooOoO;

    public C3858f(byte[] bArr) {
        this.OoooOoO = (byte[]) C4305r2.OooO0Oo(bArr);
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.OoooOoO;
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    public Class<byte[]> OooO0O0() {
        return byte[].class;
    }

    @Override // p285z2.oO0Ooooo
    public int getSize() {
        return this.OoooOoO.length;
    }

    @Override // p285z2.oO0Ooooo
    public void recycle() {
    }
}
