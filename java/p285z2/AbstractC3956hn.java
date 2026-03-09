package p285z2;

import com.google.zxing.client.result.ParsedResultType;

/* JADX INFO: renamed from: z2.hn */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3956hn {
    private final ParsedResultType OooO00o;

    public AbstractC3956hn(ParsedResultType parsedResultType) {
        this.OooO00o = parsedResultType;
    }

    public static void OooO0OO(String str, StringBuilder sb) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append('\n');
        }
        sb.append(str);
    }

    public static void OooO0Oo(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                OooO0OO(str, sb);
            }
        }
    }

    public abstract String OooO00o();

    public final ParsedResultType OooO0O0() {
        return this.OooO00o;
    }

    public final String toString() {
        return OooO00o();
    }
}
