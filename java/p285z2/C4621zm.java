package p285z2;

import com.anythink.expressad.p086d.p087a.C1485b;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: z2.zm */
/* JADX INFO: loaded from: classes2.dex */
public final class C4621zm extends AbstractC4067kn {
    private static final Pattern OooO0o = Pattern.compile(",");

    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final C4584ym OooOO0O(C3770cm c3770cm) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String strOooO0OO = AbstractC4067kn.OooO0OO(c3770cm);
        if (!strOooO0OO.startsWith("mailto:") && !strOooO0OO.startsWith("MAILTO:")) {
            if (C3697an.OooOOoo(strOooO0OO)) {
                return new C4584ym(strOooO0OO);
            }
            return null;
        }
        String strSubstring = strOooO0OO.substring(7);
        int iIndexOf = strSubstring.indexOf(63);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        try {
            String strOooOOOo = AbstractC4067kn.OooOOOo(strSubstring);
            String[] strArrSplit = !strOooOOOo.isEmpty() ? OooO0o.split(strOooOOOo) : null;
            Map<String, String> mapOooOOO0 = AbstractC4067kn.OooOOO0(strOooO0OO);
            if (mapOooOOO0 != null) {
                if (strArrSplit == null && (str3 = mapOooOOO0.get("to")) != null) {
                    strArrSplit = OooO0o.split(str3);
                }
                String str4 = mapOooOOO0.get(C1485b.f7208h);
                String[] strArrSplit2 = str4 != null ? OooO0o.split(str4) : null;
                String str5 = mapOooOOO0.get("bcc");
                String[] strArrSplit3 = str5 != null ? OooO0o.split(str5) : null;
                String str6 = mapOooOOO0.get("subject");
                str2 = mapOooOOO0.get("body");
                strArr = strArrSplit;
                strArr3 = strArrSplit3;
                strArr2 = strArrSplit2;
                str = str6;
            } else {
                strArr = strArrSplit;
                strArr2 = null;
                strArr3 = null;
                str = null;
                str2 = null;
            }
            return new C4584ym(strArr, strArr2, strArr3, str, str2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
