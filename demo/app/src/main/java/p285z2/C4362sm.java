package p285z2;

import java.util.ArrayList;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: z2.sm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4362sm extends AbstractC4067kn {
    private static String[] OooOOo0(String str, int i, String str2, boolean z) {
        ArrayList arrayList = null;
        for (int i2 = 1; i2 <= i; i2++) {
            String strOooO0oO = AbstractC4067kn.OooO0oO(str + i2 + ':', str2, '\r', z);
            if (strOooO0oO == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i);
            }
            arrayList.add(strOooO0oO);
        }
        if (arrayList == null) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public final C4436um OooOO0O(C3770cm c3770cm) {
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.contains("MEMORY") || !strOooO0OO.contains(IOUtils.LINE_SEPARATOR_WINDOWS)) {
            return null;
        }
        String strOooO0oO = AbstractC4067kn.OooO0oO("NAME1:", strOooO0OO, '\r', true);
        String strOooO0oO2 = AbstractC4067kn.OooO0oO("NAME2:", strOooO0OO, '\r', true);
        String[] strArrOooOOo0 = OooOOo0("TEL", 3, strOooO0OO, true);
        String[] strArrOooOOo02 = OooOOo0("MAIL", 3, strOooO0OO, true);
        String strOooO0oO3 = AbstractC4067kn.OooO0oO("MEMORY:", strOooO0OO, '\r', false);
        String strOooO0oO4 = AbstractC4067kn.OooO0oO("ADD:", strOooO0OO, '\r', true);
        return new C4436um(AbstractC4067kn.OooOO0(strOooO0oO), null, strOooO0oO2, strArrOooOOo0, null, strArrOooOOo02, null, null, strOooO0oO3, strOooO0oO4 != null ? new String[]{strOooO0oO4} : null, null, null, null, null, null, null);
    }
}
