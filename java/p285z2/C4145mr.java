package p285z2;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: z2.mr */
/* JADX INFO: loaded from: classes2.dex */
public final class C4145mr extends AbstractC4182nr {
    private static final int OooO0Oo = 4;

    public C4145mr(C3735bo c3735bo) {
        super(c3735bo);
    }

    @Override // p285z2.AbstractC4256pr
    public final String OooO0Oo() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(OooO0O0().OooO0o(4, 4));
        OooO0oO(sb, 8, length);
        return OooO0O0().OooO00o(sb, 48);
    }
}
