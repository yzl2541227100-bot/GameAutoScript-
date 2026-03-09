package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.p055f.C1226as;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.c.d */
/* JADX INFO: loaded from: classes.dex */
public class C1183d extends C1180a<C1226as> {

    /* JADX INFO: renamed from: b */
    private static final String f3461b = "com.anythink.core.common.c.d";

    /* JADX INFO: renamed from: c */
    private static volatile C1183d f3462c;

    /* JADX INFO: renamed from: com.anythink.core.common.c.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3463a = "sdkconfig";

        /* JADX INFO: renamed from: b */
        public static final String f3464b = "key";

        /* JADX INFO: renamed from: c */
        public static final String f3465c = "type";

        /* JADX INFO: renamed from: d */
        public static final String f3466d = "value";

        /* JADX INFO: renamed from: e */
        public static final String f3467e = "lastupdatetime";

        /* JADX INFO: renamed from: f */
        public static final String f3468f = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";
    }

    private C1183d(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
    }

    /* JADX INFO: renamed from: a */
    private synchronized long m2214a(C1226as c1226as) {
        if (m2202b() == null || c1226as == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", c1226as.m2645b());
            contentValues.put("type", c1226as.m2647c());
            contentValues.put("value", c1226as.m2649d());
            contentValues.put(a.f3467e, c1226as.m2643a());
            if (m2220b(c1226as.m2645b(), c1226as.m2643a(), c1226as.m2647c())) {
                return m2202b().update(a.f3463a, contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{c1226as.m2645b(), c1226as.m2647c(), c1226as.m2643a()});
            }
            return m2202b().insert(a.f3463a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1183d m2215a(AbstractC1181b abstractC1181b) {
        if (f3462c == null) {
            synchronized (C1183d.class) {
                if (f3462c == null) {
                    f3462c = new C1183d(abstractC1181b);
                }
            }
        }
        return f3462c;
    }

    /* JADX INFO: renamed from: a */
    private synchronized List<C1226as> m2216a(Cursor cursor) {
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    C1226as c1226as = new C1226as();
                    c1226as.m2646b(cursor.getString(cursor.getColumnIndex("key")));
                    c1226as.m2648c(cursor.getString(cursor.getColumnIndex("type")));
                    c1226as.m2650d(cursor.getString(cursor.getColumnIndex("value")));
                    c1226as.m2644a(cursor.getString(cursor.getColumnIndex(a.f3467e)));
                    arrayList.add(c1226as);
                }
                cursor.close();
                return arrayList;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m2217a(String str) {
        try {
            if (m2202b() == null) {
                return;
            }
            m2202b().delete(a.f3463a, "lastupdatetime< ? and type = ?", new String[]{str, C1226as.a.f3890a});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[Catch: all -> 0x0040, PHI: r10
  0x0031: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:13:0x0028, B:17:0x002f, B:24:0x003d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x001e, B:18:0x0031, B:21:0x0038, B:22:0x003b, B:16:0x002c), top: B:32:0x0002, inners: #3 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.anythink.core.common.p055f.C1226as> m2218b(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m2201a()     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3c
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "type = ?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3c
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3c
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27 java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L3c
            java.util.List r0 = r9.m2216a(r10)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25 java.lang.OutOfMemoryError -> L2c
            if (r10 == 0) goto L21
            r10.close()     // Catch: java.lang.Throwable -> L40
        L21:
            monitor-exit(r9)
            return r0
        L23:
            goto L28
        L25:
            goto L3d
        L27:
            r10 = r0
        L28:
            if (r10 == 0) goto L43
            goto L3f
        L2b:
            r10 = r0
        L2c:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L43
        L31:
            r10.close()     // Catch: java.lang.Throwable -> L40
            goto L43
        L35:
            r0 = move-exception
            if (r10 == 0) goto L3b
            r10.close()     // Catch: java.lang.Throwable -> L40
        L3b:
            throw r0     // Catch: java.lang.Throwable -> L40
        L3c:
            r10 = r0
        L3d:
            if (r10 == 0) goto L43
        L3f:
            goto L31
        L40:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L43:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1183d.m2218b(java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: b */
    private synchronized boolean m2219b(String str, String str2) {
        Cursor cursorQuery = m2201a().query(a.f3463a, new String[]{"key"}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private synchronized boolean m2220b(String str, String str2, String str3) {
        Cursor cursorQuery = m2201a().query(a.f3463a, new String[]{"key"}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x0046, PHI: r10
  0x0037: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:13:0x002e, B:17:0x0035, B:24:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x0024, B:18:0x0037, B:21:0x003e, B:22:0x0041, B:16:0x0032), top: B:32:0x0002, inners: #3 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.anythink.core.common.p055f.C1226as> m2221c(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m2201a()     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L31 java.lang.Exception -> L42
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "key = ? and type = ? and lastupdatetime = ?"
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L31 java.lang.Exception -> L42
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L31 java.lang.Exception -> L42
            r10 = 1
            r5[r10] = r12     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L31 java.lang.Exception -> L42
            r10 = 2
            r5[r10] = r11     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L31 java.lang.Exception -> L42
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2d java.lang.OutOfMemoryError -> L31 java.lang.Exception -> L42
            java.util.List r11 = r9.m2216a(r10)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b java.lang.OutOfMemoryError -> L32
            if (r10 == 0) goto L27
            r10.close()     // Catch: java.lang.Throwable -> L46
        L27:
            monitor-exit(r9)
            return r11
        L29:
            goto L2e
        L2b:
            goto L43
        L2d:
            r10 = r0
        L2e:
            if (r10 == 0) goto L49
            goto L45
        L31:
            r10 = r0
        L32:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L49
        L37:
            r10.close()     // Catch: java.lang.Throwable -> L46
            goto L49
        L3b:
            r11 = move-exception
            if (r10 == 0) goto L41
            r10.close()     // Catch: java.lang.Throwable -> L46
        L41:
            throw r11     // Catch: java.lang.Throwable -> L46
        L42:
            r10 = r0
        L43:
            if (r10 == 0) goto L49
        L45:
            goto L37
        L46:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L49:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1183d.m2221c(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m2222c(String str, String str2) {
        List<C1226as> listM2221c = m2221c(str, str2, C1226as.a.f3890a);
        if (listM2221c == null || listM2221c.size() <= 0) {
            C1226as c1226as = new C1226as();
            c1226as.m2644a(str2);
            c1226as.m2650d("1");
            c1226as.m2648c(C1226as.a.f3890a);
            c1226as.m2646b(str);
            m2214a(c1226as);
            return;
        }
        for (C1226as c1226as2 : listM2221c) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.parseInt(c1226as2.m2649d()) + 1);
            c1226as2.m2650d(sb.toString());
            m2214a(c1226as2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0043, PHI: r10
  0x0034: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:13:0x002b, B:17:0x0032, B:24:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x0021, B:18:0x0034, B:21:0x003b, B:22:0x003e, B:16:0x002f), top: B:32:0x0002, inners: #3 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.anythink.core.common.p055f.C1226as> m2223d(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m2201a()     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "key != ? and type = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            r10 = 1
            r5[r10] = r11     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            java.util.List r11 = r9.m2216a(r10)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28 java.lang.OutOfMemoryError -> L2f
            if (r10 == 0) goto L24
            r10.close()     // Catch: java.lang.Throwable -> L43
        L24:
            monitor-exit(r9)
            return r11
        L26:
            goto L2b
        L28:
            goto L40
        L2a:
            r10 = r0
        L2b:
            if (r10 == 0) goto L46
            goto L42
        L2e:
            r10 = r0
        L2f:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L46
        L34:
            r10.close()     // Catch: java.lang.Throwable -> L43
            goto L46
        L38:
            r11 = move-exception
            if (r10 == 0) goto L3e
            r10.close()     // Catch: java.lang.Throwable -> L43
        L3e:
            throw r11     // Catch: java.lang.Throwable -> L43
        L3f:
            r10 = r0
        L40:
            if (r10 == 0) goto L46
        L42:
            goto L34
        L43:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L46:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1183d.m2223d(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2224a(String str, String str2, String str3) {
        if (m2202b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            contentValues.put(a.f3467e, sb.toString());
            if (m2219b(str, str3)) {
                return m2202b().update(a.f3463a, contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return m2202b().insert(a.f3463a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0043, PHI: r10
  0x0034: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:13:0x002b, B:17:0x0032, B:24:0x0040] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {, blocks: (B:7:0x0021, B:18:0x0034, B:21:0x003b, B:22:0x003e, B:16:0x002f), top: B:32:0x0002, inners: #3 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.anythink.core.common.p055f.C1226as> m2225a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m2201a()     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            java.lang.String r2 = "sdkconfig"
            r3 = 0
            java.lang.String r4 = "key = ? and type = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            r10 = 1
            r5[r10] = r11     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a java.lang.OutOfMemoryError -> L2e java.lang.Exception -> L3f
            java.util.List r11 = r9.m2216a(r10)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28 java.lang.OutOfMemoryError -> L2f
            if (r10 == 0) goto L24
            r10.close()     // Catch: java.lang.Throwable -> L43
        L24:
            monitor-exit(r9)
            return r11
        L26:
            goto L2b
        L28:
            goto L40
        L2a:
            r10 = r0
        L2b:
            if (r10 == 0) goto L46
            goto L42
        L2e:
            r10 = r0
        L2f:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L46
        L34:
            r10.close()     // Catch: java.lang.Throwable -> L43
            goto L46
        L38:
            r11 = move-exception
            if (r10 == 0) goto L3e
            r10.close()     // Catch: java.lang.Throwable -> L43
        L3e:
            throw r11     // Catch: java.lang.Throwable -> L43
        L3f:
            r10 = r0
        L40:
            if (r10 == 0) goto L46
        L42:
            goto L34
        L43:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L46:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1183d.m2225a(java.lang.String, java.lang.String):java.util.List");
    }
}
