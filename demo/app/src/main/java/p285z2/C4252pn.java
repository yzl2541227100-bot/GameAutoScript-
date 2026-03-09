package p285z2;

import com.google.zxing.client.result.ParsedResultType;

/* JADX INFO: renamed from: z2.pn */
/* JADX INFO: loaded from: classes2.dex */
public final class C4252pn extends AbstractC3956hn {
    private final String OooO0O0;
    private final String OooO0OO;
    private final String OooO0Oo;

    public C4252pn(String str, String str2, String str3) {
        super(ParsedResultType.TEL);
        this.OooO0O0 = str;
        this.OooO0OO = str2;
        this.OooO0Oo = str3;
    }

    @Override // p285z2.AbstractC3956hn
    public final String OooO00o() {
        StringBuilder sb = new StringBuilder(20);
        AbstractC3956hn.OooO0OO(this.OooO0O0, sb);
        AbstractC3956hn.OooO0OO(this.OooO0Oo, sb);
        return sb.toString();
    }

    public final String OooO0o() {
        return this.OooO0OO;
    }

    public final String OooO0o0() {
        return this.OooO0O0;
    }

    public final String OooO0oO() {
        return this.OooO0Oo;
    }
}
