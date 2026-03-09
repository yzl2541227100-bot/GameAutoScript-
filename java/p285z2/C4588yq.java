package p285z2;

/* JADX INFO: renamed from: z2.yq */
/* JADX INFO: loaded from: classes2.dex */
public final class C4588yq {
    private final int OooO00o;
    private final int[] OooO0O0;
    private final C3807dm[] OooO0OO;

    public C4588yq(int i, int[] iArr, int i2, int i3, int i4) {
        this.OooO00o = i;
        this.OooO0O0 = iArr;
        float f = i4;
        this.OooO0OO = new C3807dm[]{new C3807dm(i2, f), new C3807dm(i3, f)};
    }

    public final C3807dm[] OooO00o() {
        return this.OooO0OO;
    }

    public final int[] OooO0O0() {
        return this.OooO0O0;
    }

    public final int OooO0OO() {
        return this.OooO00o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4588yq) && this.OooO00o == ((C4588yq) obj).OooO00o;
    }

    public final int hashCode() {
        return this.OooO00o;
    }
}
