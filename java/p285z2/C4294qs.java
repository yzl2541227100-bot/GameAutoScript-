package p285z2;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: z2.qs */
/* JADX INFO: loaded from: classes2.dex */
public final class C4294qs {
    private final C4331rs[] OooO00o;
    private int OooO0O0;
    private final int OooO0OO;
    private final int OooO0Oo;

    public C4294qs(int i, int i2) {
        C4331rs[] c4331rsArr = new C4331rs[i];
        this.OooO00o = c4331rsArr;
        int length = c4331rsArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.OooO00o[i3] = new C4331rs(((i2 + 4) * 17) + 1);
        }
        this.OooO0Oo = i2 * 17;
        this.OooO0OO = i;
        this.OooO0O0 = -1;
    }

    public final C4331rs OooO00o() {
        return this.OooO00o[this.OooO0O0];
    }

    public final byte[][] OooO0O0() {
        return OooO0OO(1, 1);
    }

    public final byte[][] OooO0OO(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.OooO0OO * i2, this.OooO0Oo * i);
        int i3 = this.OooO0OO * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.OooO00o[i4 / i2].OooO0O0(i);
        }
        return bArr;
    }

    public final void OooO0Oo(int i, int i2, byte b) {
        this.OooO00o[i2].OooO0OO(i, b);
    }

    public final void OooO0o0() {
        this.OooO0O0++;
    }
}
