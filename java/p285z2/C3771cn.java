package p285z2;

/* JADX INFO: renamed from: z2.cn */
/* JADX INFO: loaded from: classes2.dex */
public final class C3771cn extends AbstractC4067kn {
    private static String OooOOo(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(i);
        for (int i2 = 0; i2 < strSubstring.length(); i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (cCharAt != '(') {
                sb.append(cCharAt);
            } else {
                if (OooOOo0(i2, strSubstring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    private static String OooOOo0(int i, String str) {
        char cCharAt;
        if (str.charAt(i) != '(') {
            return null;
        }
        String strSubstring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strSubstring.length() && (cCharAt = strSubstring.charAt(i2)) != ')'; i2++) {
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    @Override // p285z2.AbstractC4067kn
    /* JADX INFO: renamed from: OooOOoo, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p285z2.C3734bn OooOO0O(p285z2.C3770cm r24) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3771cn.OooOO0O(z2.cm):z2.bn");
    }
}
