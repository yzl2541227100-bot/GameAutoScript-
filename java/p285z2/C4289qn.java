package p285z2;

/* JADX INFO: renamed from: z2.qn */
/* JADX INFO: loaded from: classes2.dex */
public final class C4289qn extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C4252pn OooOO0O(C3770cm c3770cm) {
        String str;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("tel:") && !strOooO0OO.startsWith("TEL:")) {
            return null;
        }
        if (strOooO0OO.startsWith("TEL:")) {
            str = "tel:" + strOooO0OO.substring(4);
        } else {
            str = strOooO0OO;
        }
        int iIndexOf = strOooO0OO.indexOf(63, 4);
        return new C4252pn(iIndexOf < 0 ? strOooO0OO.substring(4) : strOooO0OO.substring(4, iIndexOf), str, null);
    }
}
