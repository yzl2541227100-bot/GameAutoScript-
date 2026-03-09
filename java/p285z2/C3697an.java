package p285z2;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: z2.an */
/* JADX INFO: loaded from: classes2.dex */
public final class C3697an extends AbstractC4325rm {
    private static final Pattern OooO0o = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    public static boolean OooOOoo(String str) {
        return str != null && OooO0o.matcher(str).matches() && str.indexOf(64) >= 0;
    }

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOo00, reason: merged with bridge method [inline-methods] */
    public final C4584ym OooOO0O(C3770cm c3770cm) {
        String[] strArrOooOOo0;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("MATMSG:") || (strArrOooOOo0 = AbstractC4325rm.OooOOo0("TO:", strOooO0OO, true)) == null) {
            return null;
        }
        for (String str : strArrOooOOo0) {
            if (!OooOOoo(str)) {
                return null;
            }
        }
        return new C4584ym(strArrOooOOo0, null, null, AbstractC4325rm.OooOOo("SUB:", strOooO0OO, false), AbstractC4325rm.OooOOo("BODY:", strOooO0OO, false));
    }
}
