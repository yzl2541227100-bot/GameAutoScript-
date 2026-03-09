package p285z2;

/* JADX INFO: renamed from: z2.tm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4399tm extends AbstractC4325rm {
    private static String OooOo00(String str) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf < 0) {
            return str;
        }
        return str.substring(iIndexOf + 1) + ' ' + str.substring(0, iIndexOf);
    }

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOoo, reason: merged with bridge method [inline-methods] */
    public final C4436um OooOO0O(C3770cm c3770cm) {
        String[] strArrOooOOo0;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("MECARD:") || (strArrOooOOo0 = AbstractC4325rm.OooOOo0("N:", strOooO0OO, true)) == null) {
            return null;
        }
        String strOooOo00 = OooOo00(strArrOooOOo0[0]);
        String strOooOOo = AbstractC4325rm.OooOOo("SOUND:", strOooO0OO, true);
        String[] strArrOooOOo02 = AbstractC4325rm.OooOOo0("TEL:", strOooO0OO, true);
        String[] strArrOooOOo03 = AbstractC4325rm.OooOOo0("EMAIL:", strOooO0OO, true);
        String strOooOOo2 = AbstractC4325rm.OooOOo("NOTE:", strOooO0OO, false);
        String[] strArrOooOOo04 = AbstractC4325rm.OooOOo0("ADR:", strOooO0OO, true);
        String strOooOOo3 = AbstractC4325rm.OooOOo("BDAY:", strOooO0OO, true);
        return new C4436um(AbstractC4067kn.OooOO0(strOooOo00), null, strOooOOo, strArrOooOOo02, null, strArrOooOOo03, null, null, strOooOOo2, strArrOooOOo04, null, AbstractC4325rm.OooOOo("ORG:", strOooO0OO, true), !AbstractC4067kn.OooO0Oo(strOooOOo3, 8) ? null : strOooOOo3, null, AbstractC4325rm.OooOOo0("URL:", strOooO0OO, true), null);
    }
}
