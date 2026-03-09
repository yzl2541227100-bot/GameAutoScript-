package p285z2;

/* JADX INFO: renamed from: z2.nn */
/* JADX INFO: loaded from: classes2.dex */
public final class C4178nn extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C4141mn OooOO0O(C3770cm c3770cm) {
        String strSubstring;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("smsto:") && !strOooO0OO.startsWith("SMSTO:") && !strOooO0OO.startsWith("mmsto:") && !strOooO0OO.startsWith("MMSTO:")) {
            return null;
        }
        String strSubstring2 = strOooO0OO.substring(6);
        int iIndexOf = strSubstring2.indexOf(58);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = null;
        }
        return new C4141mn(strSubstring2, (String) null, (String) null, strSubstring);
    }
}
