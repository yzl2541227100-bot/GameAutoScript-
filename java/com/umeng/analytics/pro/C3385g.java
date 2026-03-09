package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3381c;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3385g {

    /* JADX INFO: renamed from: a */
    public static final int f18480a = 2049;

    /* JADX INFO: renamed from: b */
    public static final int f18481b = 2050;

    /* JADX INFO: renamed from: c */
    private static Context f18482c = null;

    /* JADX INFO: renamed from: d */
    private static String f18483d = null;

    /* JADX INFO: renamed from: e */
    private static final String f18484e = "umeng+";

    /* JADX INFO: renamed from: f */
    private static final String f18485f = "ek__id";

    /* JADX INFO: renamed from: g */
    private static final String f18486g = "ek_key";

    /* JADX INFO: renamed from: h */
    private List<String> f18487h;

    /* JADX INFO: renamed from: i */
    private List<Integer> f18488i;

    /* JADX INFO: renamed from: j */
    private String f18489j;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.g$a */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private static final C3385g f18496a = new C3385g();

        private b() {
        }
    }

    private C3385g() {
        this.f18487h = new ArrayList();
        this.f18488i = new ArrayList();
        this.f18489j = null;
    }

    /* JADX INFO: renamed from: a */
    public static C3385g m15485a(Context context) {
        C3385g c3385g = b.f18496a;
        if (f18482c == null && context != null) {
            f18482c = context.getApplicationContext();
            c3385g.m15491h();
        }
        return c3385g;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0168 A[EXC_TOP_SPLITTER, PHI: r0 r2
  0x0168: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v15 java.lang.String) binds: [B:61:0x0166, B:46:0x0138] A[DONT_GENERATE, DONT_INLINE]
  0x0168: PHI (r2v6 android.database.sqlite.SQLiteDatabase) = (r2v3 android.database.sqlite.SQLiteDatabase), (r2v11 android.database.sqlite.SQLiteDatabase) binds: [B:61:0x0166, B:46:0x0138] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m15486a(org.json.JSONObject r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15486a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX INFO: renamed from: a */
    private void m15487a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        strM15503b = null;
        strM15503b = null;
        String strM15503b = null;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(C3381c.e.a.f18460e);
            if (jSONObject2 != null) {
                cursorRawQuery = sQLiteDatabase.rawQuery("select __d from __sd where __ii=\"" + str + "\"", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            strM15503b = m15503b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(C3381c.e.a.f18460e)));
                        } catch (Throwable unused) {
                            cursor = cursorRawQuery;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
            if (jSONObject2 != null) {
                JSONArray jSONArray = new JSONArray();
                if (!TextUtils.isEmpty(strM15503b)) {
                    jSONArray = new JSONArray(strM15503b);
                }
                jSONArray.put(jSONObject2);
                String strM15493a = m15493a(jSONArray.toString());
                if (!TextUtils.isEmpty(strM15493a)) {
                    sQLiteDatabase.execSQL("update  __sd set __d=\"" + strM15493a + "\" where __ii=\"" + str + "\"");
                }
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(C3381c.e.a.f18459d);
            if (jSONObject3 != null) {
                String strM15493a2 = m15493a(jSONObject3.toString());
                if (!TextUtils.isEmpty(strM15493a2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strM15493a2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.getLong(C3381c.e.a.f18462g)) + "\" where __ii=\"" + str + "\"");
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m15488a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        Cursor cursor = null;
        strM15503b = null;
        String strM15503b = null;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select " + str2 + " from " + C3381c.e.f18455a + " where __ii=\"" + str + "\"", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    try {
                        strM15503b = m15503b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2)));
                    } catch (Throwable unused) {
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.isEmpty(strM15503b)) {
                jSONArray = new JSONArray(strM15503b);
            }
            jSONArray.put(jSONObject);
            String strM15493a = m15493a(jSONArray.toString());
            if (!TextUtils.isEmpty(strM15493a)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strM15493a + "\" where __ii=\"" + str + "\"");
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0178 A[EXC_TOP_SPLITTER, PHI: r1
  0x0178: PHI (r1v4 android.database.sqlite.SQLiteDatabase) = 
  (r1v2 android.database.sqlite.SQLiteDatabase)
  (r1v3 android.database.sqlite.SQLiteDatabase)
  (r1v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:69:0x0176, B:76:0x0190, B:63:0x016b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15489a(org.json.JSONObject r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15489a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x007a A[EXC_TOP_SPLITTER, PHI: r1
  0x007a: PHI (r1v4 android.database.sqlite.SQLiteDatabase) = 
  (r1v2 android.database.sqlite.SQLiteDatabase)
  (r1v3 android.database.sqlite.SQLiteDatabase)
  (r1v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:27:0x0078, B:34:0x0092, B:21:0x006d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m15490b(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            android.database.sqlite.SQLiteDatabase r1 = r1.m15476a()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            java.lang.String r2 = "select *  from __er"
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r3 != 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r2.<init>()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            java.lang.String r3 = "select *  from __er where __i=\""
            r2.append(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r2.append(r6)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            java.lang.String r6 = "\""
            r2.append(r6)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
        L2c:
            android.database.Cursor r0 = r1.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r0 == 0) goto L65
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r6.<init>()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
        L37:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r2 == 0) goto L5a
            java.lang.String r2 = "__a"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r3 != 0) goto L37
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            java.lang.String r2 = r4.m15503b(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r6.put(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            goto L37
        L5a:
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r2 <= 0) goto L65
            java.lang.String r2 = "error"
            r5.put(r2, r6)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
        L65:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r0 == 0) goto L6d
            r0.close()
        L6d:
            if (r1 == 0) goto L7d
            goto L7a
        L70:
            goto L73
        L72:
            r1 = r0
        L73:
            if (r0 == 0) goto L78
            r0.close()
        L78:
            if (r1 == 0) goto L7d
        L7a:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L7d
        L7d:
            android.content.Context r5 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r5 = com.umeng.analytics.pro.C3383e.m15475a(r5)
            r5.m15477b()
            goto L95
        L87:
            r1 = r0
        L88:
            android.content.Context r5 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L96
            com.umeng.analytics.pro.C3384f.m15481a(r5)     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L92
            r0.close()
        L92:
            if (r1 == 0) goto L7d
            goto L7a
        L95:
            return
        L96:
            r5 = move-exception
            if (r0 == 0) goto L9c
            r0.close()
        L9c:
            if (r1 == 0) goto La1
            r1.endTransaction()     // Catch: java.lang.Throwable -> La1
        La1:
            android.content.Context r6 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r6 = com.umeng.analytics.pro.C3383e.m15475a(r6)
            r6.m15477b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15490b(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX INFO: renamed from: h */
    private void m15491h() {
        synchronized (this) {
            m15492i();
            this.f18487h.clear();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m15492i() {
        try {
            if (TextUtils.isEmpty(f18483d)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18482c);
                String string = sharedPreferences.getString(f18485f, null);
                if (TextUtils.isEmpty(string)) {
                    string = DeviceConfig.getDBencryptID(f18482c);
                    if (!TextUtils.isEmpty(string)) {
                        sharedPreferences.edit().putString(f18485f, string).commit();
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    String strSubstring = string.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strSubstring.length(); i++) {
                        char cCharAt = strSubstring.charAt(i);
                        if (!Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                        }
                    }
                    f18483d = sb.toString();
                }
                if (TextUtils.isEmpty(f18483d)) {
                    return;
                }
                f18483d += new StringBuilder(f18483d).reverse().toString();
                String string2 = sharedPreferences.getString(f18486g, null);
                if (TextUtils.isEmpty(string2)) {
                    sharedPreferences.edit().putString(f18486g, m15493a(f18484e)).commit();
                } else {
                    if (f18484e.equals(m15503b(string2))) {
                        return;
                    }
                    m15500a(true, false);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public String m15493a(String str) {
        try {
            return TextUtils.isEmpty(f18483d) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f18483d.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m15494a(boolean z) {
        String strM15486a;
        m15495a();
        this.f18488i.clear();
        JSONObject jSONObject = new JSONObject();
        if (z) {
            strM15486a = m15486a(jSONObject, z);
            if (!TextUtils.isEmpty(strM15486a)) {
            }
            return jSONObject;
        }
        m15486a(jSONObject, z);
        strM15486a = null;
        m15490b(jSONObject, strM15486a);
        m15489a(jSONObject, strM15486a);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public void m15495a() {
        this.f18487h.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002f A[EXC_TOP_SPLITTER, PHI: r0
  0x002f: PHI (r0v6 android.database.sqlite.SQLiteDatabase) = 
  (r0v4 android.database.sqlite.SQLiteDatabase)
  (r0v5 android.database.sqlite.SQLiteDatabase)
  (r0v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:16:0x002d, B:20:0x0041, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15496a(int r3) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            android.database.sqlite.SQLiteDatabase r0 = r1.m15476a()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            if (r3 != 0) goto L16
            java.lang.String r3 = "delete from __dp where __ty=0"
        L12:
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            goto L27
        L16:
            r1 = 4
            if (r3 != r1) goto L21
            java.lang.String r3 = "delete from __dp where __ty=3"
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            java.lang.String r3 = "delete from __dp where __ty=2"
            goto L12
        L21:
            r1 = 1
            if (r3 != r1) goto L27
            java.lang.String r3 = "delete from __dp where __ty=1"
            goto L12
        L27:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteDatabaseCorruptException -> L3c
            if (r0 == 0) goto L32
            goto L2f
        L2d:
            if (r0 == 0) goto L32
        L2f:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L32
        L32:
            android.content.Context r3 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r3 = com.umeng.analytics.pro.C3383e.m15475a(r3)
            r3.m15477b()
            goto L44
        L3c:
            android.content.Context r3 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L45
            com.umeng.analytics.pro.C3384f.m15481a(r3)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L32
            goto L2f
        L44:
            return
        L45:
            r3 = move-exception
            if (r0 == 0) goto L4b
            r0.endTransaction()     // Catch: java.lang.Throwable -> L4b
        L4b:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15496a(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15497a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            com.umeng.analytics.pro.e r3 = com.umeng.analytics.pro.C3383e.m15475a(r3)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            android.database.sqlite.SQLiteDatabase r3 = r3.m15476a()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteDatabaseCorruptException -> L93
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            if (r4 >= r5) goto L77
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r6.<init>()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L34
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            if (r8 == 0) goto L43
        L34:
            com.umeng.analytics.pro.o r7 = com.umeng.analytics.pro.C3393o.m15600a()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r7 = r7.m15612c()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            if (r8 == 0) goto L43
            r7 = r9
        L43:
            r6.put(r1, r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            int r7 = r5.optInt(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r5.remove(r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r5.remove(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r5 = r10.m15493a(r5)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L80
        L74:
            int r4 = r4 + 1
            goto L13
        L77:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            if (r3 == 0) goto L89
            r3.endTransaction()     // Catch: java.lang.Throwable -> L89
            goto L89
        L80:
            r2 = r3
            goto L84
        L82:
            r2 = r3
            goto L93
        L84:
            if (r2 == 0) goto L89
        L86:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L89
        L89:
            android.content.Context r11 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r11 = com.umeng.analytics.pro.C3383e.m15475a(r11)
            r11.m15477b()
            goto L9b
        L93:
            android.content.Context r11 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L9c
            com.umeng.analytics.pro.C3384f.m15481a(r11)     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L89
            goto L86
        L9b:
            return
        L9c:
            r11 = move-exception
            if (r2 == 0) goto La2
            r2.endTransaction()     // Catch: java.lang.Throwable -> La2
        La2:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15497a(org.json.JSONArray):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r1.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15498a(org.json.JSONObject r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "__ii"
            r1 = 0
            android.content.Context r2 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteDatabaseCorruptException -> L79
            com.umeng.analytics.pro.e r2 = com.umeng.analytics.pro.C3383e.m15475a(r2)     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteDatabaseCorruptException -> L79
            android.database.sqlite.SQLiteDatabase r2 = r2.m15476a()     // Catch: java.lang.Throwable -> L6a android.database.sqlite.SQLiteDatabaseCorruptException -> L79
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r3.<init>()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r4 = r11.optString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r5 = "__id"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r8 = 10000(0x2710, double:4.9407E-320)
            long r6 = r6 - r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            if (r5 == 0) goto L31
            java.lang.String r4 = "-1"
        L31:
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r11.remove(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r0 = "__io"
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r11 = r10.m15493a(r11)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r3.put(r0, r11)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r11 = "__ty"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r3.put(r11, r12)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r11 = "__ve"
            android.content.Context r12 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r12 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAppVersionCode(r12)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r3.put(r11, r12)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            java.lang.String r11 = "__dp"
            r2.insert(r11, r1, r3)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteDatabaseCorruptException -> L68
            if (r2 == 0) goto L6f
            r2.endTransaction()     // Catch: java.lang.Throwable -> L6f
            goto L6f
        L66:
            r1 = r2
            goto L6a
        L68:
            r1 = r2
            goto L79
        L6a:
            if (r1 == 0) goto L6f
        L6c:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L6f
        L6f:
            android.content.Context r11 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r11 = com.umeng.analytics.pro.C3383e.m15475a(r11)
            r11.m15477b()
            goto L81
        L79:
            android.content.Context r11 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L82
            com.umeng.analytics.pro.C3384f.m15481a(r11)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L6f
            goto L6c
        L81:
            return
        L82:
            r11 = move-exception
            if (r1 == 0) goto L88
            r1.endTransaction()     // Catch: java.lang.Throwable -> L88
        L88:
            android.content.Context r12 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r12 = com.umeng.analytics.pro.C3383e.m15475a(r12)
            r12.m15477b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15498a(org.json.JSONObject, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        r4.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15499a(boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15499a(boolean, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[EXC_TOP_SPLITTER, PHI: r0
  0x0055: PHI (r0v4 android.database.sqlite.SQLiteDatabase) = 
  (r0v2 android.database.sqlite.SQLiteDatabase)
  (r0v3 android.database.sqlite.SQLiteDatabase)
  (r0v5 android.database.sqlite.SQLiteDatabase)
 binds: [B:16:0x0053, B:20:0x0067, B:14:0x0050] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15500a(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            android.database.sqlite.SQLiteDatabase r0 = r1.m15476a()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            if (r4 == 0) goto L18
            if (r3 == 0) goto L4d
            java.lang.String r3 = "delete from __sd"
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            goto L4d
        L18:
            java.util.List<java.lang.String> r3 = r2.f18487h     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            if (r3 <= 0) goto L4d
            r3 = 0
        L21:
            java.util.List<java.lang.String> r4 = r2.f18487h     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            if (r3 >= r4) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            java.lang.String r1 = "delete from __sd where __ii=\""
            r4.append(r1)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            java.util.List<java.lang.String> r1 = r2.f18487h     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            r4.append(r1)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            r0.execSQL(r4)     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            int r3 = r3 + 1
            goto L21
        L4d:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L53 android.database.sqlite.SQLiteDatabaseCorruptException -> L62
            if (r0 == 0) goto L58
            goto L55
        L53:
            if (r0 == 0) goto L58
        L55:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L58
        L58:
            android.content.Context r3 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r3 = com.umeng.analytics.pro.C3383e.m15475a(r3)
            r3.m15477b()
            goto L6a
        L62:
            android.content.Context r3 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L6b
            com.umeng.analytics.pro.C3384f.m15481a(r3)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L58
            goto L55
        L6a:
            return
        L6b:
            r3 = move-exception
            if (r0 == 0) goto L71
            r0.endTransaction()     // Catch: java.lang.Throwable -> L71
        L71:
            android.content.Context r4 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r4 = com.umeng.analytics.pro.C3383e.m15475a(r4)
            r4.m15477b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15500a(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m15501a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L42 android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L42 android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            android.database.sqlite.SQLiteDatabase r1 = r1.m15476a()     // Catch: java.lang.Throwable -> L42 android.database.sqlite.SQLiteDatabaseCorruptException -> L51
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            r2.<init>()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r5 = r4.m15493a(r6)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            if (r6 != 0) goto L35
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
        L35:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteDatabaseCorruptException -> L40
            if (r1 == 0) goto L47
            r1.endTransaction()     // Catch: java.lang.Throwable -> L47
            goto L47
        L3e:
            r0 = r1
            goto L42
        L40:
            r0 = r1
            goto L51
        L42:
            if (r0 == 0) goto L47
        L44:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L47
        L47:
            android.content.Context r5 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r5 = com.umeng.analytics.pro.C3383e.m15475a(r5)
            r5.m15477b()
            goto L59
        L51:
            android.content.Context r5 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L5b
            com.umeng.analytics.pro.C3384f.m15481a(r5)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L47
            goto L44
        L59:
            r5 = 0
            return r5
        L5b:
            r5 = move-exception
            if (r0 == 0) goto L61
            r0.endTransaction()     // Catch: java.lang.Throwable -> L61
        L61:
            android.content.Context r6 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r6 = com.umeng.analytics.pro.C3383e.m15475a(r6)
            r6.m15477b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15501a(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m15502a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.C3385g.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            com.umeng.analytics.pro.e r3 = com.umeng.analytics.pro.C3383e.m15475a(r3)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            android.database.sqlite.SQLiteDatabase r3 = r3.m15476a()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> La7
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            com.umeng.analytics.pro.g$a r4 = com.umeng.analytics.pro.C3385g.a.BEGIN     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r5 = "__ii"
            if (r9 != r4) goto L39
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r4.<init>()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            goto L8b
        L39:
            com.umeng.analytics.pro.g$a r0 = com.umeng.analytics.pro.C3385g.a.END     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r9 != r0) goto L73
            java.lang.String r9 = "__f"
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r2 = "update __sd set __f=\""
            r0.append(r2)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r0.append(r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r8 = "\" where "
            r0.append(r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r0.append(r5)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r8 = "=\""
            r0.append(r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r0.append(r7)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r7 = "\""
            r0.append(r7)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r3.execSQL(r7)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            goto L8b
        L73:
            com.umeng.analytics.pro.g$a r0 = com.umeng.analytics.pro.C3385g.a.PAGE     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r9 != r0) goto L7d
            java.lang.String r9 = "__a"
        L79:
            r6.m15488a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            goto L8b
        L7d:
            com.umeng.analytics.pro.g$a r0 = com.umeng.analytics.pro.C3385g.a.AUTOPAGE     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r9 != r0) goto L84
            java.lang.String r9 = "__b"
            goto L79
        L84:
            com.umeng.analytics.pro.g$a r0 = com.umeng.analytics.pro.C3385g.a.NEWSESSION     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r9 != r0) goto L8b
            r6.m15487a(r7, r8, r3)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
        L8b:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r3 == 0) goto L9d
            r3.endTransaction()     // Catch: java.lang.Throwable -> L9d
            goto L9d
        L94:
            r2 = r3
            goto L98
        L96:
            r2 = r3
            goto La7
        L98:
            if (r2 == 0) goto L9d
        L9a:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L9d
        L9d:
            android.content.Context r7 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r7 = com.umeng.analytics.pro.C3383e.m15475a(r7)
            r7.m15477b()
            goto Laf
        La7:
            android.content.Context r7 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> Lb0
            com.umeng.analytics.pro.C3384f.m15481a(r7)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto L9d
            goto L9a
        Laf:
            return r1
        Lb0:
            r7 = move-exception
            if (r2 == 0) goto Lb6
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            android.content.Context r8 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r8 = com.umeng.analytics.pro.C3383e.m15475a(r8)
            r8.m15477b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15502a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.g$a):boolean");
    }

    /* JADX INFO: renamed from: b */
    public String m15503b(String str) {
        try {
            return TextUtils.isEmpty(f18483d) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f18483d.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[EXC_TOP_SPLITTER, PHI: r0
  0x006f: PHI (r0v6 android.database.sqlite.SQLiteDatabase) = 
  (r0v4 android.database.sqlite.SQLiteDatabase)
  (r0v5 android.database.sqlite.SQLiteDatabase)
  (r0v9 android.database.sqlite.SQLiteDatabase)
 binds: [B:16:0x006d, B:20:0x0081, B:14:0x006a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15504b() {
        /*
            r7 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            android.database.sqlite.SQLiteDatabase r0 = r1.m15476a()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            com.umeng.analytics.pro.o r1 = com.umeng.analytics.pro.C3393o.m15600a()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r1 = r1.m15614d()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            if (r2 == 0) goto L2b
            if (r0 == 0) goto L21
            r0.endTransaction()     // Catch: java.lang.Throwable -> L21
        L21:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            return
        L2b:
            r2 = 2
            java.lang.String r3 = ""
            java.lang.String r4 = "-1"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r4 = 0
        L35:
            if (r4 >= r2) goto L67
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r5.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r6 = "update __et set __i=\""
            r5.append(r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r5.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r6 = "\" where "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r6 = "__i"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r6 = "=\""
            r5.append(r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r6 = r3[r4]     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r5.append(r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r6 = "\""
            r5.append(r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            r0.execSQL(r5)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            int r4 = r4 + 1
            goto L35
        L67:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteDatabaseCorruptException -> L7c
            if (r0 == 0) goto L72
            goto L6f
        L6d:
            if (r0 == 0) goto L72
        L6f:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L72
        L72:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            goto L84
        L7c:
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L85
            com.umeng.analytics.pro.C3384f.m15481a(r1)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L72
            goto L6f
        L84:
            return
        L85:
            r1 = move-exception
            if (r0 == 0) goto L8b
            r0.endTransaction()     // Catch: java.lang.Throwable -> L8b
        L8b:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15504b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0046 A[EXC_TOP_SPLITTER, PHI: r0
  0x0046: PHI (r0v6 android.database.sqlite.SQLiteDatabase) = 
  (r0v4 android.database.sqlite.SQLiteDatabase)
  (r0v5 android.database.sqlite.SQLiteDatabase)
  (r0v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:26:0x0044, B:30:0x0058, B:24:0x0041] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15505b(int r5) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            android.database.sqlite.SQLiteDatabase r0 = r1.m15476a()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            java.lang.String r1 = "delete from __dp"
            r2 = -1
            if (r5 != r2) goto L17
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            goto L3e
        L17:
            r1 = 1
            if (r5 != r1) goto L20
            java.lang.String r5 = "delete from __dp where __ty=1"
        L1c:
            r0.execSQL(r5)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            goto L3e
        L20:
            r1 = 4
            java.lang.String r2 = "delete from __dp where __ty=2"
            java.lang.String r3 = "delete from __dp where __ty=3"
            if (r5 != r1) goto L2e
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
        L2a:
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            goto L3e
        L2e:
            r1 = 3
            if (r5 != r1) goto L35
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            goto L3e
        L35:
            if (r5 != 0) goto L3a
            java.lang.String r5 = "delete from __dp where __ty=0"
            goto L1c
        L3a:
            r1 = 2
            if (r5 != r1) goto L3e
            goto L2a
        L3e:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteDatabaseCorruptException -> L53
            if (r0 == 0) goto L49
            goto L46
        L44:
            if (r0 == 0) goto L49
        L46:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L49
        L49:
            android.content.Context r5 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r5 = com.umeng.analytics.pro.C3383e.m15475a(r5)
            r5.m15477b()
            goto L5b
        L53:
            android.content.Context r5 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L5c
            com.umeng.analytics.pro.C3384f.m15481a(r5)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L49
            goto L46
        L5b:
            return
        L5c:
            r5 = move-exception
            if (r0 == 0) goto L62
            r0.endTransaction()     // Catch: java.lang.Throwable -> L62
        L62:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15505b(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7 A[EXC_TOP_SPLITTER, PHI: r2
  0x00a7: PHI (r2v4 android.database.sqlite.SQLiteDatabase) = 
  (r2v2 android.database.sqlite.SQLiteDatabase)
  (r2v3 android.database.sqlite.SQLiteDatabase)
  (r2v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:42:0x00a5, B:49:0x00bf, B:36:0x009a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject m15506c() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15506c():org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[EXC_TOP_SPLITTER, PHI: r0
  0x0049: PHI (r0v6 android.database.sqlite.SQLiteDatabase) = 
  (r0v4 android.database.sqlite.SQLiteDatabase)
  (r0v5 android.database.sqlite.SQLiteDatabase)
  (r0v9 android.database.sqlite.SQLiteDatabase)
 binds: [B:12:0x0047, B:16:0x005b, B:10:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15507d() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            android.database.sqlite.SQLiteDatabase r0 = r1.m15476a()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.util.List<java.lang.Integer> r1 = r4.f18488i     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            if (r1 <= 0) goto L3c
            r1 = 0
        L17:
            java.util.List<java.lang.Integer> r2 = r4.f18488i     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            if (r1 >= r2) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r2.<init>()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r3 = "delete from __et where rowid="
            r2.append(r3)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.util.List<java.lang.Integer> r3 = r4.f18488i     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r2.append(r3)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            int r1 = r1 + 1
            goto L17
        L3c:
            java.util.List<java.lang.Integer> r1 = r4.f18488i     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r1.clear()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteDatabaseCorruptException -> L56
            if (r0 == 0) goto L4c
            goto L49
        L47:
            if (r0 == 0) goto L4c
        L49:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L4c
        L4c:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            goto L5e
        L56:
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L5f
            com.umeng.analytics.pro.C3384f.m15481a(r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L4c
            goto L49
        L5e:
            return
        L5f:
            r1 = move-exception
            if (r0 == 0) goto L65
            r0.endTransaction()     // Catch: java.lang.Throwable -> L65
        L65:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15507d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x001b A[EXC_TOP_SPLITTER, PHI: r0
  0x001b: PHI (r0v6 android.database.sqlite.SQLiteDatabase) = 
  (r0v4 android.database.sqlite.SQLiteDatabase)
  (r0v5 android.database.sqlite.SQLiteDatabase)
  (r0v9 android.database.sqlite.SQLiteDatabase)
 binds: [B:6:0x0019, B:10:0x002d, B:4:0x0016] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15508e() {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            android.database.sqlite.SQLiteDatabase r0 = r1.m15476a()     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            java.lang.String r1 = "delete from __er"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L19 android.database.sqlite.SQLiteDatabaseCorruptException -> L28
            if (r0 == 0) goto L1e
            goto L1b
        L19:
            if (r0 == 0) goto L1e
        L1b:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L1e
        L1e:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            goto L30
        L28:
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L31
            com.umeng.analytics.pro.C3384f.m15481a(r1)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L1e
            goto L1b
        L30:
            return
        L31:
            r1 = move-exception
            if (r0 == 0) goto L37
            r0.endTransaction()     // Catch: java.lang.Throwable -> L37
        L37:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15508e():void");
    }

    /* JADX INFO: renamed from: f */
    public void m15509f() {
        m15505b(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[EXC_TOP_SPLITTER, PHI: r1
  0x0053: PHI (r1v8 android.database.sqlite.SQLiteDatabase) = 
  (r1v4 android.database.sqlite.SQLiteDatabase)
  (r1v5 android.database.sqlite.SQLiteDatabase)
  (r1v11 android.database.sqlite.SQLiteDatabase)
 binds: [B:9:0x0051, B:14:0x0066, B:6:0x004d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15510g() {
        /*
            r5 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = r5.f18489j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L79
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            android.database.sqlite.SQLiteDatabase r1 = r1.m15476a()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteDatabaseCorruptException -> L60
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.String r4 = "delete from __er where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.String r4 = r5.f18489j     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r3.append(r4)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r1.execSQL(r3)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.String r4 = "delete from __et where __i=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.String r4 = r5.f18489j     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r3.append(r4)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r1.execSQL(r0)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L61
            if (r1 == 0) goto L56
            goto L53
        L50:
            r1 = r2
        L51:
            if (r1 == 0) goto L56
        L53:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L56
        L56:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r0 = com.umeng.analytics.pro.C3383e.m15475a(r0)
            r0.m15477b()
            goto L79
        L60:
            r1 = r2
        L61:
            android.content.Context r0 = com.umeng.analytics.pro.C3385g.f18482c     // Catch: java.lang.Throwable -> L69
            com.umeng.analytics.pro.C3384f.m15481a(r0)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L56
            goto L53
        L69:
            r0 = move-exception
            if (r1 == 0) goto L6f
            r1.endTransaction()     // Catch: java.lang.Throwable -> L6f
        L6f:
            android.content.Context r1 = com.umeng.analytics.pro.C3385g.f18482c
            com.umeng.analytics.pro.e r1 = com.umeng.analytics.pro.C3383e.m15475a(r1)
            r1.m15477b()
            throw r0
        L79:
            r5.f18489j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3385g.m15510g():void");
    }
}
