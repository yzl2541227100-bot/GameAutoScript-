package com.anythink.core.common.p052c;

import android.content.ContentValues;
import com.anythink.core.common.p055f.C1258w;
import com.anythink.expressad.p086d.C1486b;

/* JADX INFO: renamed from: com.anythink.core.common.c.h */
/* JADX INFO: loaded from: classes.dex */
public class C1187h extends C1180a<C1258w> {

    /* JADX INFO: renamed from: b */
    private static final String f3500b = "com.anythink.core.common.c.h";

    /* JADX INFO: renamed from: c */
    private static volatile C1187h f3501c;

    /* JADX INFO: renamed from: d */
    private int f3502d;

    /* JADX INFO: renamed from: com.anythink.core.common.c.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3503a = "inspect_info";

        /* JADX INFO: renamed from: b */
        public static final String f3504b = "inspect_id";

        /* JADX INFO: renamed from: c */
        public static final String f3505c = "update_time";

        /* JADX INFO: renamed from: d */
        public static final String f3506d = "CREATE TABLE IF NOT EXISTS inspect_info(inspect_id TEXT, update_time INTEGER )";
    }

    private C1187h(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3502d = C1486b.f7228b;
    }

    /* JADX INFO: renamed from: a */
    public static C1187h m2243a(AbstractC1181b abstractC1181b) {
        if (f3501c == null) {
            synchronized (C1187h.class) {
                if (f3501c == null) {
                    f3501c = new C1187h(abstractC1181b);
                }
            }
        }
        return f3501c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: all -> 0x003e, PHI: r1
  0x003a: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v3 android.database.Cursor) binds: [B:20:0x0038, B:18:0x0035] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x002e, B:21:0x003a), top: B:30:0x0007 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m2244b(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r12 != 0) goto L6
            monitor-exit(r11)
            return r0
        L6:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.m2201a()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "inspect_info"
            java.lang.String r4 = "inspect_id"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "inspect_id=?"
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L33
            r6[r0] = r12     // Catch: java.lang.Throwable -> L33
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L33
            if (r12 <= 0) goto L35
            r1.close()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.lang.Throwable -> L3e
        L31:
            monitor-exit(r11)
            return r10
        L33:
            goto L38
        L35:
            if (r1 == 0) goto L41
            goto L3a
        L38:
            if (r1 == 0) goto L41
        L3a:
            r1.close()     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        L41:
            monitor-exit(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1187h.m2244b(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2245a(String str) {
        if (m2202b() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.f3504b, str);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            if (m2244b(str)) {
                return m2202b().update(a.f3503a, contentValues, "inspect_id = ? ", new String[]{str});
            }
            return m2202b().insert(a.f3503a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[Catch: all -> 0x0053, DONT_GENERATE, PHI: r0 r1
  0x003f: PHI (r0v6 android.database.Cursor) = 
  (r0v2 android.database.Cursor)
  (r0v3 android.database.Cursor)
  (r0v4 android.database.Cursor)
  (r0v9 android.database.Cursor)
 binds: [B:14:0x003d, B:18:0x0046, B:24:0x0050, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r1v5 long) = (r1v2 long), (r1v3 long), (r1v4 long), (r1v8 long) binds: [B:14:0x003d, B:18:0x0046, B:24:0x0050, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:15:0x003f, B:22:0x004c, B:23:0x004f, B:17:0x0043), top: B:37:0x0004, inners: #4 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m2246c() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = -1
            android.database.sqlite.SQLiteDatabase r3 = r12.m2201a()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            java.lang.String r4 = "inspect_info"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "update_time DESC"
            int r11 = r12.f3502d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            if (r0 == 0) goto L3a
            int r3 = r0.getCount()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            int r4 = r12.f3502d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            if (r3 < r4) goto L3a
            r0.moveToLast()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            java.lang.String r3 = "update_time"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            long r1 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            r0.close()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38 java.lang.OutOfMemoryError -> L43
            goto L3a
        L36:
            goto L3d
        L38:
            goto L50
        L3a:
            if (r0 == 0) goto L56
            goto L52
        L3d:
            if (r0 == 0) goto L56
        L3f:
            r0.close()     // Catch: java.lang.Throwable -> L53
            goto L56
        L43:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L56
            goto L52
        L49:
            r1 = move-exception
            if (r0 == 0) goto L4f
            r0.close()     // Catch: java.lang.Throwable -> L53
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L53
        L50:
            if (r0 == 0) goto L56
        L52:
            goto L3f
        L53:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L56:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L73
            android.database.sqlite.SQLiteDatabase r0 = r12.m2202b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "inspect_info"
            java.lang.String r4 = "update_time<?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L73
            r6 = 0
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L73
            r5[r6] = r1     // Catch: java.lang.Throwable -> L73
            r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r12)
            return
        L73:
            monitor-exit(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1187h.m2246c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x0073, PHI: r1
  0x005d: PHI (r1v6 android.database.Cursor) = 
  (r1v3 android.database.Cursor)
  (r1v4 android.database.Cursor)
  (r1v5 android.database.Cursor)
  (r1v8 android.database.Cursor)
 binds: [B:22:0x005b, B:27:0x0065, B:34:0x0070, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x004e, B:23:0x005d, B:31:0x006b, B:32:0x006e, B:26:0x0062), top: B:42:0x0002, inners: #3 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.anythink.core.common.p055f.C1258w> m2247d() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m2201a()     // Catch: java.lang.Throwable -> L5a java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L6f
            java.lang.String r2 = "inspect_info"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L5a java.lang.OutOfMemoryError -> L61 java.lang.Exception -> L6f
            if (r1 == 0) goto L57
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            if (r2 <= 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
        L20:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            if (r3 == 0) goto L49
            com.anythink.core.common.f.w r3 = new com.anythink.core.common.f.w     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            r3.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            java.lang.String r4 = "inspect_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            java.lang.String r5 = "update_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            long r5 = r1.getLong(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            r3.m3452a(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            r3.m3451a(r5)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            r2.add(r3)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            goto L20
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55 java.lang.OutOfMemoryError -> L62
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.lang.Throwable -> L73
        L51:
            monitor-exit(r10)
            return r2
        L53:
            goto L5b
        L55:
            goto L70
        L57:
            if (r1 == 0) goto L76
            goto L72
        L5a:
            r1 = r0
        L5b:
            if (r1 == 0) goto L76
        L5d:
            r1.close()     // Catch: java.lang.Throwable -> L73
            goto L76
        L61:
            r1 = r0
        L62:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L76
            goto L72
        L68:
            r0 = move-exception
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.lang.Throwable -> L73
        L6e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L6f:
            r1 = r0
        L70:
            if (r1 == 0) goto L76
        L72:
            goto L5d
        L73:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L76:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1187h.m2247d():java.util.List");
    }
}
