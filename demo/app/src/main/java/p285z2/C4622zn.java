package p285z2;

import com.google.zxing.client.result.ParsedResultType;

/* JADX INFO: renamed from: z2.zn */
/* JADX INFO: loaded from: classes2.dex */
public final class C4622zn extends AbstractC3956hn {
    private final String OooO;
    private final String OooO0O0;
    private final String OooO0OO;
    private final String OooO0Oo;
    private final String OooO0o;
    private final boolean OooO0o0;
    private final String OooO0oO;
    private final String OooO0oo;

    public C4622zn(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public C4622zn(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, null, null, null, null);
    }

    public C4622zn(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        super(ParsedResultType.WIFI);
        this.OooO0O0 = str2;
        this.OooO0OO = str;
        this.OooO0Oo = str3;
        this.OooO0o0 = z;
        this.OooO0o = str4;
        this.OooO0oO = str5;
        this.OooO0oo = str6;
        this.OooO = str7;
    }

    public final String OooO() {
        return this.OooO0Oo;
    }

    @Override // p285z2.AbstractC3956hn
    public final String OooO00o() {
        StringBuilder sb = new StringBuilder(80);
        AbstractC3956hn.OooO0OO(this.OooO0O0, sb);
        AbstractC3956hn.OooO0OO(this.OooO0OO, sb);
        AbstractC3956hn.OooO0OO(this.OooO0Oo, sb);
        AbstractC3956hn.OooO0OO(Boolean.toString(this.OooO0o0), sb);
        return sb.toString();
    }

    public final String OooO0o() {
        return this.OooO0oo;
    }

    public final String OooO0o0() {
        return this.OooO0oO;
    }

    public final String OooO0oO() {
        return this.OooO0o;
    }

    public final String OooO0oo() {
        return this.OooO0OO;
    }

    public final String OooOO0() {
        return this.OooO;
    }

    public final String OooOO0O() {
        return this.OooO0O0;
    }

    public final boolean OooOO0o() {
        return this.OooO0o0;
    }
}
