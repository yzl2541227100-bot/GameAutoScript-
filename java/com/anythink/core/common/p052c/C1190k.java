package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.p050a.C1158j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1252q;
import com.anythink.core.common.p055f.C1253r;
import com.anythink.core.common.p065n.C1322e;

/* JADX INFO: renamed from: com.anythink.core.common.c.k */
/* JADX INFO: loaded from: classes.dex */
public class C1190k extends C1180a<C1158j> {

    /* JADX INFO: renamed from: c */
    private static volatile C1190k f3530c;

    /* JADX INFO: renamed from: b */
    private final String f3531b;

    /* JADX INFO: renamed from: com.anythink.core.common.c.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3532a = "offer_data_cache";

        /* JADX INFO: renamed from: b */
        public static final String f3533b = "placement_id";

        /* JADX INFO: renamed from: c */
        public static final String f3534c = "bid_id";

        /* JADX INFO: renamed from: d */
        public static final String f3535d = "adsource_id";

        /* JADX INFO: renamed from: e */
        public static final String f3536e = "network_firm_id";

        /* JADX INFO: renamed from: f */
        public static final String f3537f = "bid_result";

        /* JADX INFO: renamed from: g */
        public static final String f3538g = "offer_data";

        /* JADX INFO: renamed from: h */
        public static final String f3539h = "out_date_timestamp";

        /* JADX INFO: renamed from: i */
        public static final String f3540i = "CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER)";
    }

    private C1190k(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3531b = C1190k.class.getName();
    }

    /* JADX INFO: renamed from: a */
    public static C1190k m2266a(AbstractC1181b abstractC1181b) {
        if (f3530c == null) {
            synchronized (C1190k.class) {
                if (f3530c == null) {
                    f3530c = new C1190k(abstractC1181b);
                }
            }
        }
        return f3530c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003a, PHI: r11
  0x0036: PHI (r11v4 android.database.Cursor) = (r11v3 android.database.Cursor), (r11v5 android.database.Cursor) binds: [B:17:0x0034, B:14:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:10:0x0029, B:18:0x0036), top: B:27:0x0002 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m2267d(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m2201a()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "offer_data_cache"
            java.lang.String r3 = "offer_data"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "bid_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L33
            r5[r0] = r11     // Catch: java.lang.Throwable -> L33
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            if (r11 == 0) goto L30
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L2e
            if (r1 <= 0) goto L30
            r11.close()     // Catch: java.lang.Throwable -> L2e
            if (r11 == 0) goto L2c
            r11.close()     // Catch: java.lang.Throwable -> L3a
        L2c:
            monitor-exit(r10)
            return r9
        L2e:
            goto L34
        L30:
            if (r11 == 0) goto L3d
            goto L36
        L33:
            r11 = 0
        L34:
            if (r11 == 0) goto L3d
        L36:
            r11.close()     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L3d:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1190k.m2267d(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m2268a(C1252q c1252q) {
        if (m2267d(c1252q.token)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.f3537f, c1252q.m3412b());
                return m2202b().update(a.f3532a, contentValues, "bid_id = ? ", new String[]{c1252q.token});
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2269a(String str, C1252q c1252q) {
        if (m2202b() == null || c1252q == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", c1252q.f4442k);
            contentValues.put("network_firm_id", Integer.valueOf(c1252q.f4435d));
            contentValues.put(a.f3534c, c1252q.token);
            contentValues.put(a.f3537f, c1252q.m3412b());
            contentValues.put(a.f3539h, Long.valueOf(c1252q.f4437f));
            if (!TextUtils.isEmpty(c1252q.f4440i)) {
                contentValues.put(a.f3538g, c1252q.f4440i);
            }
            if (m2267d(c1252q.token)) {
                new StringBuilder("OfferDataCache update BidId:").append(c1252q.token);
                return m2202b().update(a.f3532a, contentValues, "bid_id = ? ", new String[]{c1252q.token});
            }
            StringBuilder sb = new StringBuilder("OfferDataCache insert BidId:");
            sb.append(c1252q.token);
            sb.append(",adSourceId:");
            sb.append(c1252q.f4442k);
            return m2202b().insert(a.f3532a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2270a(String str, String str2, String str3) {
        if (m2202b() == null) {
            return -1L;
        }
        try {
            new ContentValues().put(a.f3538g, str3);
            if (m2267d(str2)) {
                return m2202b().update(a.f3532a, r0, "bid_id = ? ", new String[]{str2});
            }
            StringBuilder sb = new StringBuilder("OfferDataCache insert BidId:");
            sb.append(str2);
            sb.append(",adSourceId:");
            sb.append(str);
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2271a(String str) {
        try {
            m2202b().delete(a.f3532a, "bid_id = ? ", new String[]{str});
        } catch (Throwable th) {
            C1322e.m3913a("Error_SQL_DELETE", th.getMessage(), C1175n.m2059a().m2168q());
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C1253r m2272b(String str) {
        C1253r c1253r;
        c1253r = new C1253r();
        Cursor cursorQuery = null;
        try {
            cursorQuery = m2201a().query(a.f3532a, new String[]{"placement_id", "adsource_id", a.f3537f}, "out_date_timestamp>? AND placement_id=?", new String[]{String.valueOf(System.currentTimeMillis()), str}, null, null, null);
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("adsource_id"));
                C1252q c1252qM3404a = C1252q.m3404a(cursorQuery.getString(cursorQuery.getColumnIndex(a.f3537f)));
                if (c1252qM3404a != null) {
                    c1253r.m3422a(string, c1252qM3404a);
                }
            }
        } catch (Throwable unused) {
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Throwable unused2) {
            }
        }
        return c1253r;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x004d, PHI: r12
  0x0049: PHI (r12v4 android.database.Cursor) = (r12v3 android.database.Cursor), (r12v5 android.database.Cursor) binds: [B:17:0x0047, B:14:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:10:0x003c, B:18:0x0049), top: B:29:0x0002 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.anythink.core.common.p055f.C1214ag m2273c(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.m2201a()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "offer_data_cache"
            java.lang.String r3 = "offer_data"
            java.lang.String r4 = "out_date_timestamp"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "bid_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L46
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L46
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L46
            if (r12 == 0) goto L43
            int r1 = r12.getCount()     // Catch: java.lang.Throwable -> L41
            if (r1 <= 0) goto L43
            r12.moveToNext()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r12.getString(r10)     // Catch: java.lang.Throwable -> L41
            long r2 = r12.getLong(r9)     // Catch: java.lang.Throwable -> L41
            com.anythink.core.common.f.ag r4 = new com.anythink.core.common.f.ag     // Catch: java.lang.Throwable -> L41
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L41
            r12.close()     // Catch: java.lang.Throwable -> L41
            if (r12 == 0) goto L3f
            r12.close()     // Catch: java.lang.Throwable -> L4d
        L3f:
            monitor-exit(r11)
            return r4
        L41:
            goto L47
        L43:
            if (r12 == 0) goto L50
            goto L49
        L46:
            r12 = r0
        L47:
            if (r12 == 0) goto L50
        L49:
            r12.close()     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        L50:
            monitor-exit(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1190k.m2273c(java.lang.String):com.anythink.core.common.f.ag");
    }
}
