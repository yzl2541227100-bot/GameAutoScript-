package p285z2;

/* JADX INFO: renamed from: z2.ao */
/* JADX INFO: loaded from: classes2.dex */
public final class C3698ao extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C4622zn OooOO0O(C3770cm c3770cm) {
        String strSubstring;
        String strOooO0oO;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("WIFI:") || (strOooO0oO = AbstractC4067kn.OooO0oO("S:", (strSubstring = strOooO0OO.substring(5)), ';', false)) == null || strOooO0oO.isEmpty()) {
            return null;
        }
        String strOooO0oO2 = AbstractC4067kn.OooO0oO("P:", strSubstring, ';', false);
        String strOooO0oO3 = AbstractC4067kn.OooO0oO("T:", strSubstring, ';', false);
        if (strOooO0oO3 == null) {
            strOooO0oO3 = "nopass";
        }
        return new C4622zn(strOooO0oO3, strOooO0oO, strOooO0oO2, Boolean.parseBoolean(AbstractC4067kn.OooO0oO("H:", strSubstring, ';', false)), AbstractC4067kn.OooO0oO("I:", strSubstring, ';', false), AbstractC4067kn.OooO0oO("A:", strSubstring, ';', false), AbstractC4067kn.OooO0oO("E:", strSubstring, ';', false), AbstractC4067kn.OooO0oO("H:", strSubstring, ';', false));
    }
}
