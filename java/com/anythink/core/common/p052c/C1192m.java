package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.p050a.C1159k;

/* JADX INFO: renamed from: com.anythink.core.common.c.m */
/* JADX INFO: loaded from: classes.dex */
public class C1192m extends C1180a<C1159k> {

    /* JADX INFO: renamed from: c */
    private static volatile C1192m f3553c;

    /* JADX INFO: renamed from: b */
    private final String f3554b;

    /* JADX INFO: renamed from: com.anythink.core.common.c.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3555a = "video_res_cache_info";

        /* JADX INFO: renamed from: b */
        public static final String f3556b = "video_url";

        /* JADX INFO: renamed from: c */
        public static final String f3557c = "file_path";

        /* JADX INFO: renamed from: d */
        public static final String f3558d = "ready_rate";

        /* JADX INFO: renamed from: e */
        public static final String f3559e = "download_size";

        /* JADX INFO: renamed from: f */
        public static final String f3560f = "total_size";

        /* JADX INFO: renamed from: g */
        public static final String f3561g = "update_time";

        /* JADX INFO: renamed from: h */
        public static final String f3562h = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";
    }

    private C1192m(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3554b = C1192m.class.getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public static C1192m m2281a(AbstractC1181b abstractC1181b) {
        if (f3553c == null) {
            synchronized (C1190k.class) {
                if (f3553c == null) {
                    f3553c = new C1192m(abstractC1181b);
                }
            }
        }
        return f3553c;
    }

    /* JADX INFO: renamed from: d */
    private void m2282d(String str) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = m2201a().query(a.f3555a, null, null, null, null, null, null);
            StringBuilder sb = new StringBuilder("logDBCurItemNumber ");
            sb.append(str);
            sb.append(":");
            sb.append(cursorQuery.getCount());
        } catch (Throwable th) {
            try {
                new StringBuilder("logDBCurItemNumber fail:").append(th.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r0
  0x003b: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:17:0x0039, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2283e(java.lang.String r12) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.m2201a()     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "video_res_cache_info"
            java.lang.String r4 = "video_url"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "video_url=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L34
            r6[r1] = r12     // Catch: java.lang.Throwable -> L34
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            int r12 = r0.getCount()     // Catch: java.lang.Throwable -> L34
            if (r12 <= 0) goto L36
            r0.close()     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L33
            r0.close()
        L33:
            return r10
        L34:
            goto L39
        L36:
            if (r0 == 0) goto L3e
            goto L3b
        L39:
            if (r0 == 0) goto L3e
        L3b:
            r0.close()
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1192m.m2283e(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[PHI: r1
  0x0077: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:14:0x0075, B:10:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.core.common.p050a.C1159k m2284a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.m2201a()     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "video_res_cache_info"
            r3 = 0
            java.lang.String r4 = "video_url=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L74
            r6 = 0
            r5[r6] = r10     // Catch: java.lang.Throwable -> L74
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L74
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L6f
            com.anythink.core.common.a.k r2 = new com.anythink.core.common.a.k     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            r2.m1987a(r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "file_path"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = r1.getString(r10)     // Catch: java.lang.Throwable -> L72
            r2.m1990b(r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "ready_rate"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L72
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L72
            r2.m1985a(r10)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "download_size"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L72
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L72
            r2.m1989b(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "total_size"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L72
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L72
            r2.m1986a(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r10 = "update_time"
            int r10 = r1.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L72
            long r3 = r1.getLong(r10)     // Catch: java.lang.Throwable -> L72
            r2.m1992c(r3)     // Catch: java.lang.Throwable -> L72
            r1.close()     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L6e
            r1.close()
        L6e:
            return r2
        L6f:
            if (r1 == 0) goto L7a
            goto L77
        L72:
            goto L75
        L74:
            r1 = r0
        L75:
            if (r1 == 0) goto L7a
        L77:
            r1.close()
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1192m.m2284a(java.lang.String):com.anythink.core.common.a.k");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2285a(String str, String str2, long j, long j2, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("video_url", str);
                    contentValues.put(a.f3557c, str2);
                    contentValues.put("ready_rate", Integer.valueOf(i));
                    contentValues.put(a.f3559e, Long.valueOf(j2));
                    contentValues.put(a.f3560f, Long.valueOf(j));
                    contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
                    if (m2283e(str)) {
                        m2202b().update(a.f3555a, contentValues, "video_url = ? ", new String[]{str});
                    } else {
                        m2202b().insert(a.f3555a, null, contentValues);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2286b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            m2202b().update(a.f3555a, contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m2287c() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = m2201a().query(a.f3555a, new String[]{"sum(download_size)"}, null, null, null, null, null);
            if (cursorQuery.moveToNext()) {
                long j = cursorQuery.getLong(0);
                cursorQuery.close();
                return j;
            }
            if (cursorQuery == null) {
                return 0L;
            }
        } catch (Throwable th) {
            try {
                new StringBuilder("getDownloadedVideoSize fail:").append(th.getMessage());
                if (cursorQuery == null) {
                    return 0L;
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
        cursorQuery.close();
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m2288c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m2202b().delete(a.f3555a, "video_url=?", new String[]{str});
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("removeVideoResCacheInfo fail:");
            sb.append(th.getMessage());
            sb.append(",videoUrl:");
            sb.append(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        new java.lang.StringBuilder("removeHalfVideoInfoByUpdateTime fail:").append(r0.getMessage());
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.anythink.core.common.p050a.C1159k> m2289d() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1192m.m2289d():java.util.List");
    }
}
