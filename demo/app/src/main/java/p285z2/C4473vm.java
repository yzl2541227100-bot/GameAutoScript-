package p285z2;

import java.util.ArrayList;

/* JADX INFO: renamed from: z2.vm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4473vm extends AbstractC4325rm {
    private static String OooOOoo(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + ' ' + str2;
    }

    private static String[] OooOo00(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOo0, reason: merged with bridge method [inline-methods] */
    public final C4436um OooOO0O(C3770cm c3770cm) {
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("BIZCARD:")) {
            return null;
        }
        String strOooOOoo = OooOOoo(AbstractC4325rm.OooOOo("N:", strOooO0OO, true), AbstractC4325rm.OooOOo("X:", strOooO0OO, true));
        String strOooOOo = AbstractC4325rm.OooOOo("T:", strOooO0OO, true);
        String strOooOOo2 = AbstractC4325rm.OooOOo("C:", strOooO0OO, true);
        return new C4436um(AbstractC4067kn.OooOO0(strOooOOoo), null, null, OooOo00(AbstractC4325rm.OooOOo("B:", strOooO0OO, true), AbstractC4325rm.OooOOo("M:", strOooO0OO, true), AbstractC4325rm.OooOOo("F:", strOooO0OO, true)), null, AbstractC4067kn.OooOO0(AbstractC4325rm.OooOOo("E:", strOooO0OO, true)), null, null, null, AbstractC4325rm.OooOOo0("A:", strOooO0OO, true), null, strOooOOo2, null, strOooOOo, null, null);
    }
}
