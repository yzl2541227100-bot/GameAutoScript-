package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.p055f.C1212ae;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.c.j */
/* JADX INFO: loaded from: classes.dex */
public class C1189j extends C1180a<C1212ae> {

    /* JADX INFO: renamed from: c */
    private static C1189j f3520c;

    /* JADX INFO: renamed from: b */
    private final String f3521b;

    /* JADX INFO: renamed from: com.anythink.core.common.c.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3522a = "offer_action_record";

        /* JADX INFO: renamed from: b */
        public static final String f3523b = "adsource_id";

        /* JADX INFO: renamed from: c */
        public static final String f3524c = "type";

        /* JADX INFO: renamed from: d */
        public static final String f3525d = "unit_id";

        /* JADX INFO: renamed from: e */
        public static final String f3526e = "click_count";

        /* JADX INFO: renamed from: f */
        public static final String f3527f = "show_count";

        /* JADX INFO: renamed from: g */
        public static final String f3528g = "expire_time";

        /* JADX INFO: renamed from: h */
        public static final String f3529h = "CREATE TABLE IF NOT EXISTS offer_action_record(adsource_id TEXT ,type INTEGER ,unit_id TEXT ,click_count INTEGER ,show_count INTEGER ,expire_time INTEGER )";
    }

    private C1189j(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3521b = C1189j.class.getName();
    }

    /* JADX INFO: renamed from: a */
    private synchronized long m2254a(C1212ae c1212ae) {
        if (m2202b() == null || c1212ae == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(c1212ae.m2443e()));
            contentValues.put("unit_id", c1212ae.m2436a());
            contentValues.put(a.f3526e, Integer.valueOf(c1212ae.m2442d()));
            contentValues.put("show_count", Integer.valueOf(c1212ae.m2441c()));
            contentValues.put(a.f3528g, Long.valueOf(c1212ae.m2439b()));
            return m2202b().update(a.f3522a, contentValues, "type = ? and unit_id = ?", new String[]{String.valueOf(c1212ae.m2443e()), c1212ae.m2436a()});
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1189j m2255a(AbstractC1181b abstractC1181b) {
        if (f3520c == null) {
            synchronized (C1189j.class) {
                if (f3520c == null) {
                    f3520c = new C1189j(abstractC1181b);
                }
            }
        }
        return f3520c;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: all -> 0x0084, PHI: r1
  0x0075: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:20:0x006c, B:24:0x0073, B:31:0x0081] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {, blocks: (B:10:0x005b, B:16:0x0066, B:25:0x0075, B:28:0x007c, B:29:0x007f, B:23:0x0070), top: B:39:0x0002, inners: #3 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized com.anythink.core.common.p055f.C1212ae m2256a(int r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m2201a()     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L6f java.lang.Exception -> L80
            java.lang.String r2 = "offer_action_record"
            r3 = 0
            java.lang.String r4 = "type=? and unit_id = ?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L6f java.lang.Exception -> L80
            r6 = 0
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L6f java.lang.Exception -> L80
            r5[r6] = r7     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L6f java.lang.Exception -> L80
            r6 = 1
            r5[r6] = r11     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L6f java.lang.Exception -> L80
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6b java.lang.OutOfMemoryError -> L6f java.lang.Exception -> L80
            if (r1 == 0) goto L64
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            if (r2 <= 0) goto L64
            r1.moveToNext()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            com.anythink.core.common.f.ae r2 = new com.anythink.core.common.f.ae     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            r2.<init>(r10, r11)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            java.lang.String r10 = "click_count"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            r2.m2440b(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            java.lang.String r10 = "show_count"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            r2.m2437a(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            java.lang.String r10 = "expire_time"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            long r10 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            r2.m2438a(r10)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            r1.close()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62 java.lang.OutOfMemoryError -> L70
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.lang.Throwable -> L84
        L5e:
            monitor-exit(r9)
            return r2
        L60:
            goto L6c
        L62:
            goto L81
        L64:
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.lang.Throwable -> L84
        L69:
            monitor-exit(r9)
            return r0
        L6b:
            r1 = r0
        L6c:
            if (r1 == 0) goto L87
            goto L83
        L6f:
            r1 = r0
        L70:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L87
        L75:
            r1.close()     // Catch: java.lang.Throwable -> L84
            goto L87
        L79:
            r10 = move-exception
            if (r1 == 0) goto L7f
            r1.close()     // Catch: java.lang.Throwable -> L84
        L7f:
            throw r10     // Catch: java.lang.Throwable -> L84
        L80:
            r1 = r0
        L81:
            if (r1 == 0) goto L87
        L83:
            goto L75
        L84:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L87:
            monitor-exit(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1189j.m2256a(int, java.lang.String):com.anythink.core.common.f.ae");
    }

    /* JADX INFO: renamed from: b */
    private synchronized long m2257b(String str, int i, String str2) {
        if (m2202b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("adsource_id", str);
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("unit_id", str2);
            C1212ae c1212aeM2256a = m2256a(i, str2);
            if (c1212aeM2256a != null) {
                contentValues.put(a.f3526e, Integer.valueOf(c1212aeM2256a.m2442d()));
                contentValues.put("show_count", Integer.valueOf(c1212aeM2256a.m2441c()));
                contentValues.put(a.f3528g, Long.valueOf(c1212aeM2256a.m2439b()));
            } else {
                contentValues.put(a.f3526e, (Integer) 0);
                contentValues.put("show_count", (Integer) 0);
                contentValues.put(a.f3528g, (Integer) (-1));
            }
            return m2202b().insert(a.f3522a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m2258b(int i) {
        if (i <= 0) {
            throw new RuntimeException("No placeholders");
        }
        StringBuilder sb = new StringBuilder((i * 2) - 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private boolean m2259b(int i, String str) {
        Cursor cursorQuery = m2201a().query(a.f3522a, null, "type = ? and unit_id = ?", new String[]{String.valueOf(i), str}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m2260c(String str, int i, String str2) {
        Cursor cursorQuery = m2201a().query(a.f3522a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<C1212ae> m2261a(int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m2201a().query(a.f3522a, null, "type = ? and expire_time > ?", new String[]{String.valueOf(i), String.valueOf(System.currentTimeMillis())}, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        C1212ae c1212ae = new C1212ae(i, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                        c1212ae.m2440b(cursorQuery.getInt(cursorQuery.getColumnIndex(a.f3526e)));
                        c1212ae.m2437a(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                        c1212ae.m2438a(cursorQuery.getLong(cursorQuery.getColumnIndex(a.f3528g)));
                        arrayList.add(c1212ae);
                    }
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                }
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<C1212ae> m2262a(List<String> list, int i) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM offer_action_record WHERE adsource_id IN (");
        sb.append(m2258b(list.size()));
        sb.append(") and type = ? and expire_time > ?");
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = new String[list.size() + 2];
                list.toArray(strArr);
                strArr[list.size()] = String.valueOf(i);
                strArr[list.size() + 1] = String.valueOf(System.currentTimeMillis());
                cursorQuery = m2201a().query(a.f3522a, null, "adsource_id IN (" + m2258b(list.size()) + ") and type = ? and expire_time > ?", strArr, null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        C1212ae c1212ae = new C1212ae(i, cursorQuery.getString(cursorQuery.getColumnIndex("unit_id")));
                        c1212ae.m2440b(cursorQuery.getInt(cursorQuery.getColumnIndex(a.f3526e)));
                        c1212ae.m2437a(cursorQuery.getInt(cursorQuery.getColumnIndex("show_count")));
                        c1212ae.m2438a(cursorQuery.getLong(cursorQuery.getColumnIndex(a.f3528g)));
                        arrayList.add(c1212ae);
                    }
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
            } catch (OutOfMemoryError unused2) {
                System.gc();
                if (cursorQuery != null) {
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                }
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2263a(int i, String str, int i2, int i3) {
        C1212ae c1212aeM2256a = m2256a(i, str);
        if (c1212aeM2256a != null) {
            c1212aeM2256a.m2440b(c1212aeM2256a.m2442d() + i2);
            c1212aeM2256a.m2437a(c1212aeM2256a.m2441c() + i3);
            m2254a(c1212aeM2256a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2264a(int i, String str, long j) {
        C1212ae c1212aeM2256a = m2256a(i, str);
        if (c1212aeM2256a != null) {
            c1212aeM2256a.m2438a(j);
            m2254a(c1212aeM2256a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2265a(String str, int i, String str2) {
        boolean z = false;
        Cursor cursorQuery = m2201a().query(a.f3522a, null, "adsource_id = ? and type = ? and unit_id = ?", new String[]{str, String.valueOf(i), str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            z = true;
        } else if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (!z) {
            m2257b(str, i, str2);
        }
    }
}
