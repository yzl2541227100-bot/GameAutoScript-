package p285z2;

/* JADX INFO: renamed from: z2.wm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4510wm extends AbstractC4325rm {
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOoo, reason: merged with bridge method [inline-methods] */
    public final C4363sn OooOO0O(C3770cm c3770cm) {
        String strOooO0oO = c3770cm.OooO0oO();
        if (!strOooO0oO.startsWith("MEBKM:")) {
            return null;
        }
        String strOooOOo = AbstractC4325rm.OooOOo("TITLE:", strOooO0oO, true);
        String[] strArrOooOOo0 = AbstractC4325rm.OooOOo0("URL:", strOooO0oO, true);
        if (strArrOooOOo0 == null) {
            return null;
        }
        String str = strArrOooOOo0[0];
        if (C4400tn.OooOOo0(str)) {
            return new C4363sn(str, strOooOOo);
        }
        return null;
    }
}
