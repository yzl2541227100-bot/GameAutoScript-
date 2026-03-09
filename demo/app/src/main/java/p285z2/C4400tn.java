package p285z2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p285z2.C4196o4;

/* JADX INFO: renamed from: z2.tn */
/* JADX INFO: loaded from: classes2.dex */
public final class C4400tn extends AbstractC4067kn {
    private static final Pattern OooO0o = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");
    private static final Pattern OooO0oO = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    public static boolean OooOOo0(String str) {
        if (str.contains(C4196o4.OooO00o.OooO0Oo)) {
            return false;
        }
        Matcher matcher = OooO0o.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = OooO0oO.matcher(str);
        return matcher2.find() && matcher2.start() == 0;
    }

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public final C4363sn OooOO0O(C3770cm c3770cm) {
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (strOooO0OO.startsWith("URL:") || strOooO0OO.startsWith("URI:")) {
            return new C4363sn(strOooO0OO.substring(4).trim(), null);
        }
        String strTrim = strOooO0OO.trim();
        if (OooOOo0(strTrim)) {
            return new C4363sn(strTrim, null);
        }
        return null;
    }
}
