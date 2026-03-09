package p285z2;

import com.github.kevinsawicki.http.HttpRequest;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

/* JADX INFO: loaded from: classes.dex */
public class o00000 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z2.OooOo.OooO00o OooO00o(p285z2.o00Oo0 r20) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.o00000.OooO00o(z2.o00Oo0):z2.OooOo$OooO00o");
    }

    public static String OooO0O0(Map<String, String> map) {
        return OooO0OO(map, "ISO-8859-1");
    }

    public static String OooO0OO(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] strArrSplit = str2.split(";");
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals(HttpRequest.PARAM_CHARSET)) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long OooO0Oo(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException unused) {
            return 0L;
        }
    }
}
