package p285z2;

/* JADX INFO: renamed from: z2.on */
/* JADX INFO: loaded from: classes2.dex */
public final class C4216on extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C4584ym OooOO0O(C3770cm c3770cm) {
        String strSubstring;
        String str;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("smtp:") && !strOooO0OO.startsWith("SMTP:")) {
            return null;
        }
        String strSubstring2 = strOooO0OO.substring(5);
        int iIndexOf = strSubstring2.indexOf(58);
        if (iIndexOf >= 0) {
            String strSubstring3 = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
            int iIndexOf2 = strSubstring3.indexOf(58);
            if (iIndexOf2 >= 0) {
                String strSubstring4 = strSubstring3.substring(iIndexOf2 + 1);
                strSubstring = strSubstring3.substring(0, iIndexOf2);
                str = strSubstring4;
            } else {
                str = null;
                strSubstring = strSubstring3;
            }
        } else {
            strSubstring = null;
            str = null;
        }
        return new C4584ym(new String[]{strSubstring2}, null, null, strSubstring, str);
    }
}
