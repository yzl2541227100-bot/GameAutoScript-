package p285z2;

import com.google.zxing.client.result.ParsedResultType;

/* JADX INFO: renamed from: z2.ym */
/* JADX INFO: loaded from: classes2.dex */
public final class C4584ym extends AbstractC3956hn {
    private final String[] OooO0O0;
    private final String[] OooO0OO;
    private final String[] OooO0Oo;
    private final String OooO0o;
    private final String OooO0o0;

    public C4584ym(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    public C4584ym(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.OooO0O0 = strArr;
        this.OooO0OO = strArr2;
        this.OooO0Oo = strArr3;
        this.OooO0o0 = str;
        this.OooO0o = str2;
    }

    @Deprecated
    public final String OooO() {
        return "mailto:";
    }

    @Override // p285z2.AbstractC3956hn
    public final String OooO00o() {
        StringBuilder sb = new StringBuilder(30);
        AbstractC3956hn.OooO0Oo(this.OooO0O0, sb);
        AbstractC3956hn.OooO0Oo(this.OooO0OO, sb);
        AbstractC3956hn.OooO0Oo(this.OooO0Oo, sb);
        AbstractC3956hn.OooO0OO(this.OooO0o0, sb);
        AbstractC3956hn.OooO0OO(this.OooO0o, sb);
        return sb.toString();
    }

    public final String OooO0o() {
        return this.OooO0o;
    }

    public final String[] OooO0o0() {
        return this.OooO0Oo;
    }

    public final String[] OooO0oO() {
        return this.OooO0OO;
    }

    @Deprecated
    public final String OooO0oo() {
        String[] strArr = this.OooO0O0;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    public final String OooOO0() {
        return this.OooO0o0;
    }

    public final String[] OooOO0O() {
        return this.OooO0O0;
    }
}
