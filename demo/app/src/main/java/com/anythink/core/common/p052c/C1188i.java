package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.p055f.C1211ad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.c.i */
/* JADX INFO: loaded from: classes.dex */
public class C1188i extends C1180a<C1188i> {

    /* JADX INFO: renamed from: b */
    private static final String f3507b = "com.anythink.core.common.c.i";

    /* JADX INFO: renamed from: c */
    private static C1188i f3508c;

    /* JADX INFO: renamed from: com.anythink.core.common.c.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public List<C1211ad> f3509a;

        /* JADX INFO: renamed from: b */
        public Map<String, C1211ad> f3510b;
    }

    /* JADX INFO: renamed from: com.anythink.core.common.c.i$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final String f3511a = "notice_url_fail_info";

        /* JADX INFO: renamed from: b */
        public static final String f3512b = "id";

        /* JADX INFO: renamed from: c */
        public static final String f3513c = "req_type";

        /* JADX INFO: renamed from: d */
        public static final String f3514d = "req_url";

        /* JADX INFO: renamed from: e */
        public static final String f3515e = "req_head";

        /* JADX INFO: renamed from: f */
        public static final String f3516f = "first_fail_time";

        /* JADX INFO: renamed from: g */
        public static final String f3517g = "offer_out_date_time";

        /* JADX INFO: renamed from: h */
        public static final String f3518h = "retry_count";

        /* JADX INFO: renamed from: i */
        public static final String f3519i = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";
    }

    private C1188i(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
    }

    /* JADX INFO: renamed from: a */
    public static C1188i m2248a(AbstractC1181b abstractC1181b) {
        if (f3508c == null) {
            synchronized (C1188i.class) {
                if (f3508c == null) {
                    f3508c = new C1188i(abstractC1181b);
                }
            }
        }
        return f3508c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r11
  0x0035: PHI (r11v3 android.database.Cursor) = (r11v2 android.database.Cursor), (r11v4 android.database.Cursor) binds: [B:15:0x0033, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2249a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m2201a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "notice_url_fail_info"
            java.lang.String r3 = "id"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L32
            r5[r0] = r11     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "id"
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto L2f
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L2d
            if (r1 <= 0) goto L2f
            r11.close()     // Catch: java.lang.Throwable -> L2d
            if (r11 == 0) goto L2c
            r11.close()
        L2c:
            return r9
        L2d:
            goto L33
        L2f:
            if (r11 == 0) goto L38
            goto L35
        L32:
            r11 = 0
        L33:
            if (r11 == 0) goto L38
        L35:
            r11.close()
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1188i.m2249a(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m2250d() {
        try {
            if (m2202b() == null) {
                return;
            }
            m2202b().delete(b.f3511a, null, null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2251a(C1211ad c1211ad) {
        if (m2202b() == null || c1211ad == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", c1211ad.f3718a);
            contentValues.put("req_type", Integer.valueOf(c1211ad.f3719b));
            contentValues.put("req_url", c1211ad.f3721d);
            contentValues.put("req_head", c1211ad.f3720c);
            contentValues.put(b.f3516f, Long.valueOf(c1211ad.f3722e));
            contentValues.put(b.f3517g, Long.valueOf(c1211ad.f3723f));
            contentValues.put(b.f3518h, Integer.valueOf(c1211ad.f3724g));
            if (m2249a(c1211ad.f3718a)) {
                return m2202b().update(b.f3511a, contentValues, "id = ? ", new String[]{c1211ad.f3718a});
            }
            return m2202b().insert(b.f3511a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m2252b(C1211ad c1211ad) {
        if (m2202b() == null || c1211ad == null) {
            return -1;
        }
        try {
            return m2202b().delete(b.f3511a, "id=?", new String[]{c1211ad.f3718a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized a m2253c() {
        a aVar = new a();
        List<C1211ad> listSynchronizedList = Collections.synchronizedList(new ArrayList(8));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        aVar.f3509a = listSynchronizedList;
        aVar.f3510b = concurrentHashMap;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m2201a().query(b.f3511a, null, null, null, null, null, b.f3516f);
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
            if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                if (cursorQuery != null) {
                }
                return aVar;
            }
            ArrayList<C1211ad> arrayList = new ArrayList(4);
            while (cursorQuery.moveToNext()) {
                C1211ad c1211ad = new C1211ad();
                c1211ad.f3718a = cursorQuery.getString(cursorQuery.getColumnIndex("id"));
                c1211ad.f3719b = cursorQuery.getInt(cursorQuery.getColumnIndex("req_type"));
                c1211ad.f3721d = cursorQuery.getString(cursorQuery.getColumnIndex("req_url"));
                c1211ad.f3720c = cursorQuery.getString(cursorQuery.getColumnIndex("req_head"));
                c1211ad.f3722e = cursorQuery.getLong(cursorQuery.getColumnIndex(b.f3516f));
                c1211ad.f3723f = cursorQuery.getLong(cursorQuery.getColumnIndex(b.f3517g));
                c1211ad.f3724g = cursorQuery.getInt(cursorQuery.getColumnIndex(b.f3518h));
                if (System.currentTimeMillis() < c1211ad.f3723f) {
                    listSynchronizedList.add(c1211ad);
                    concurrentHashMap.put(c1211ad.f3718a, c1211ad);
                } else {
                    arrayList.add(c1211ad);
                }
            }
            cursorQuery.close();
            if (arrayList.size() > 0) {
                for (C1211ad c1211ad2 : arrayList) {
                    new StringBuilder("delete out date-- ").append(c1211ad2.m2433a());
                    m2252b(c1211ad2);
                }
            }
            return aVar;
            cursorQuery.close();
            return aVar;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
