package p285z2;

import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.lr */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4108lr extends AbstractC4219or {
    private static final int OooO0Oo = 5;
    private static final int OooO0o0 = 15;

    public AbstractC4108lr(C3735bo c3735bo) {
        super(c3735bo);
    }

    @Override // p285z2.AbstractC4256pr
    public String OooO0Oo() throws NotFoundException {
        if (OooO0OO().OooOOO0() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb = new StringBuilder();
        OooO0o(sb, 5);
        OooOO0(sb, 45, 15);
        return sb.toString();
    }
}
