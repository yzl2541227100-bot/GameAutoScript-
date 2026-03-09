package p285z2;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: z2.vy */
/* JADX INFO: loaded from: classes2.dex */
public final class C4485vy extends AbstractC4336rx {

    @Nullable
    private final String OoooOoO;
    private final long OoooOoo;
    private final j00 Ooooo00;

    public C4485vy(@Nullable String str, long j, j00 j00Var) {
        this.OoooOoO = str;
        this.OoooOoo = j;
        this.Ooooo00 = j00Var;
    }

    @Override // p285z2.AbstractC4336rx
    public long contentLength() {
        return this.OoooOoo;
    }

    @Override // p285z2.AbstractC4336rx
    public C4077kx contentType() {
        String str = this.OoooOoO;
        if (str != null) {
            return C4077kx.OooO0Oo(str);
        }
        return null;
    }

    @Override // p285z2.AbstractC4336rx
    public j00 source() {
        return this.Ooooo00;
    }
}
