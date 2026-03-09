package p285z2;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: z2.bc */
/* JADX INFO: loaded from: classes2.dex */
public class C3723bc {
    private static String OooO0O0 = "bc";
    public static int OooO0OO = 1;
    public static int OooO0Oo = 2;
    public static int OooO0o = 0;
    public static int OooO0o0 = 1;
    private static C3723bc OooO0oO;
    private int OooO00o;

    private C3723bc() {
    }

    public static C3723bc OooO00o() {
        if (OooO0oO == null) {
            synchronized (C3723bc.class) {
                if (OooO0oO == null) {
                    OooO0oO = new C3723bc();
                }
            }
        }
        return OooO0oO;
    }

    private String[] OooO0OO(String str) {
        String str2 = "getPackageArr --> packageNames=" + str;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.contains(",") ? str.split(",") : new String[]{str};
    }

    private boolean OooO0Oo(Context context, int i, String[] strArr) {
        String str = "getRecognitionResult --> mode=" + i;
        boolean z = false;
        if (strArr != null) {
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = true;
            for (String str2 : strArr) {
                boolean zOooOooo = C3688ae.OooOooo(context, str2);
                String str3 = "getRecognitionResult --> packageName=" + str2 + ",isInstall=" + zOooOooo;
                if (i == OooO0OO) {
                    z4 = z5 & zOooOooo;
                    z5 = z4;
                } else if (i == OooO0Oo) {
                    z3 |= zOooOooo;
                    z4 = z3;
                }
                if (!z5 || z3) {
                    break;
                }
            }
            z = z4;
        }
        String str4 = "getRecognitionResult --> result=" + z;
        return z;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.cyjh.http.bean.response.PhoneConfig OooO0o0(android.content.Context r5, java.util.List<com.cyjh.http.bean.response.PhoneConfig> r6) {
        /*
            r4 = this;
            java.util.Iterator r6 = r6.iterator()
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r6.next()
            com.cyjh.http.bean.response.PhoneConfig r0 = (com.cyjh.http.bean.response.PhoneConfig) r0
            int r1 = r0.getJudgeMode()
            java.lang.String r2 = r0.getPackage()
            java.lang.String[] r2 = r4.OooO0OO(r2)
            boolean r1 = r4.OooO0Oo(r5, r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "init --> recognitionResult="
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            if (r1 == 0) goto L4
            int r5 = r0.getCloudPhoneType()
            r4.OooO00o = r5
            int r5 = r0.getActive()
            int r6 = p285z2.C3723bc.OooO0o
            if (r5 != r6) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3723bc.OooO0o0(android.content.Context, java.util.List):com.cyjh.http.bean.response.PhoneConfig");
    }
}
