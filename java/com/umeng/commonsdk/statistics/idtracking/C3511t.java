package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.t */
/* JADX INFO: loaded from: classes2.dex */
public class C3511t extends AbstractC3492a {

    /* JADX INFO: renamed from: a */
    private static final String f19266a = "uuid";

    /* JADX INFO: renamed from: e */
    private static final String f19267e = "yosuid";

    /* JADX INFO: renamed from: f */
    private static final String f19268f = "23346339";

    /* JADX INFO: renamed from: b */
    private Context f19269b;

    /* JADX INFO: renamed from: c */
    private String f19270c;

    /* JADX INFO: renamed from: d */
    private String f19271d;

    public C3511t(Context context) {
        super("uuid");
        this.f19269b = null;
        this.f19270c = null;
        this.f19271d = null;
        this.f19269b = context;
        this.f19270c = null;
        this.f19271d = null;
    }

    /* JADX INFO: renamed from: a */
    public static String m16421a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c A[PHI: r1
  0x013c: PHI (r1v9 ??) = (r1v8 ??), (r1v12 ??) binds: [B:87:0x013a, B:53:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m16422b(java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.C3511t.m16422b(java.lang.String):java.lang.String");
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3492a
    /* JADX INFO: renamed from: f */
    public String mo16375f() throws Throwable {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        try {
            if (TextUtils.isEmpty(m16421a("ro.yunos.version", "")) || (context = this.f19269b) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return null;
            }
            String string = sharedPreferences.getString(f19267e, "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String strM16422b = m16422b(f19268f);
            this.f19271d = strM16422b;
            if (!TextUtils.isEmpty(strM16422b) && this.f19269b != null && sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
                editorEdit.putString(f19267e, this.f19271d).commit();
            }
            return this.f19271d;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
