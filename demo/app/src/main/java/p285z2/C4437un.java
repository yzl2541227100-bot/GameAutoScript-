package p285z2;

/* JADX INFO: renamed from: z2.un */
/* JADX INFO: loaded from: classes2.dex */
public final class C4437un extends AbstractC4067kn {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C4363sn OooOO0O(C3770cm c3770cm) {
        int iIndexOf;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if ((strOooO0OO.startsWith("urlto:") || strOooO0OO.startsWith("URLTO:")) && (iIndexOf = strOooO0OO.indexOf(58, 6)) >= 0) {
            return new C4363sn(strOooO0OO.substring(iIndexOf + 1), iIndexOf > 6 ? strOooO0OO.substring(6, iIndexOf) : null);
        }
        return null;
    }
}
