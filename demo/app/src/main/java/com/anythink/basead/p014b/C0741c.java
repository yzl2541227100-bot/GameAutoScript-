package com.anythink.basead.p014b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.anythink.basead.p015c.C0745c;

/* JADX INFO: renamed from: com.anythink.basead.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0741c {

    /* JADX INFO: renamed from: a */
    private static C0741c f644a;

    /* JADX INFO: renamed from: b */
    private Context f645b;

    /* JADX INFO: renamed from: com.anythink.basead.b.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f646a = "my_offer_cap_pacing";

        /* JADX INFO: renamed from: b */
        public static final String f647b = "offer_id";

        /* JADX INFO: renamed from: c */
        public static final String f648c = "offer_cap";

        /* JADX INFO: renamed from: d */
        public static final String f649d = "offer_pacing";

        /* JADX INFO: renamed from: e */
        public static final String f650e = "show_num";

        /* JADX INFO: renamed from: f */
        public static final String f651f = "show_time";

        /* JADX INFO: renamed from: g */
        public static final String f652g = "record_date";

        /* JADX INFO: renamed from: h */
        public static final String f653h = "CREATE TABLE IF NOT EXISTS my_offer_cap_pacing (offer_id TEXT,offer_cap INTEGER,offer_pacing INTEGER,show_num INTEGER,show_time INTEGER,record_date INTEGER )";
    }

    private C0741c(Context context) {
        this.f645b = context;
    }

    /* JADX INFO: renamed from: a */
    public static C0741c m284a(Context context) {
        if (f644a == null) {
            f644a = new C0741c(context);
        }
        return f644a;
    }

    /* JADX INFO: renamed from: a */
    private static C0745c m285a(Cursor cursor) {
        C0745c c0745c = new C0745c();
        c0745c.f691a = cursor.getString(cursor.getColumnIndex("offer_id"));
        c0745c.f694d = cursor.getInt(cursor.getColumnIndex(a.f650e));
        c0745c.f695e = cursor.getLong(cursor.getColumnIndex("show_time"));
        c0745c.f696f = cursor.getString(cursor.getColumnIndex(a.f652g));
        c0745c.f692b = cursor.getInt(cursor.getColumnIndex(a.f648c));
        c0745c.f693c = cursor.getLong(cursor.getColumnIndex(a.f649d));
        return c0745c;
    }

    /* JADX INFO: renamed from: d */
    private synchronized boolean m286d(String str) {
        Cursor cursorQuery = C0740b.m282a(this.f645b).getReadableDatabase().query(a.f646a, new String[]{"offer_id"}, "offer_id=?", new String[]{str}, null, null, null);
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
    public final synchronized long m287a(C0745c c0745c) {
        synchronized (this) {
            if (c0745c == null) {
                return 0L;
            }
            try {
                if (C0740b.m282a(this.f645b).getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("offer_id", c0745c.f691a);
                contentValues.put(a.f650e, Integer.valueOf(c0745c.f694d));
                contentValues.put("show_time", Long.valueOf(c0745c.f695e));
                contentValues.put(a.f652g, c0745c.f696f);
                contentValues.put(a.f648c, Integer.valueOf(c0745c.f692b));
                contentValues.put(a.f649d, Long.valueOf(c0745c.f693c));
                if (!m286d(c0745c.f691a)) {
                    return C0740b.m282a(this.f645b).getWritableDatabase().insert(a.f646a, null, contentValues);
                }
                return C0740b.m282a(this.f645b).getWritableDatabase().update(a.f646a, contentValues, "offer_id = '" + c0745c.f691a + "'", null);
            } catch (Exception e) {
                e.printStackTrace();
                return -1L;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0057, PHI: r11
  0x0041: PHI (r11v8 android.database.Cursor) = 
  (r11v5 android.database.Cursor)
  (r11v6 android.database.Cursor)
  (r11v7 android.database.Cursor)
  (r11v9 android.database.Cursor)
 binds: [B:18:0x003f, B:23:0x0049, B:30:0x0054, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:10:0x0032, B:19:0x0041, B:27:0x004f, B:28:0x0052, B:22:0x0046), top: B:38:0x0002, inners: #5 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.anythink.basead.p015c.C0745c m288a(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.content.Context r1 = r10.f645b     // Catch: java.lang.Throwable -> L3e java.lang.OutOfMemoryError -> L45 java.lang.Exception -> L53
            com.anythink.basead.b.b r1 = com.anythink.basead.p014b.C0740b.m282a(r1)     // Catch: java.lang.Throwable -> L3e java.lang.OutOfMemoryError -> L45 java.lang.Exception -> L53
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L3e java.lang.OutOfMemoryError -> L45 java.lang.Exception -> L53
            java.lang.String r3 = "my_offer_cap_pacing"
            r4 = 0
            java.lang.String r5 = "offer_id=?"
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L3e java.lang.OutOfMemoryError -> L45 java.lang.Exception -> L53
            r1 = 0
            r6[r1] = r11     // Catch: java.lang.Throwable -> L3e java.lang.OutOfMemoryError -> L45 java.lang.Exception -> L53
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3e java.lang.OutOfMemoryError -> L45 java.lang.Exception -> L53
            if (r11 == 0) goto L3b
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L46
            if (r1 <= 0) goto L3b
            r11.moveToNext()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L46
            com.anythink.basead.c.c r1 = m285a(r11)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L46
            r11.close()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.lang.OutOfMemoryError -> L46
            if (r11 == 0) goto L35
            r11.close()     // Catch: java.lang.Throwable -> L57
        L35:
            monitor-exit(r10)
            return r1
        L37:
            goto L3f
        L39:
            goto L54
        L3b:
            if (r11 == 0) goto L5a
            goto L56
        L3e:
            r11 = r0
        L3f:
            if (r11 == 0) goto L5a
        L41:
            r11.close()     // Catch: java.lang.Throwable -> L57
            goto L5a
        L45:
            r11 = r0
        L46:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L4c
            if (r11 == 0) goto L5a
            goto L56
        L4c:
            r0 = move-exception
            if (r11 == 0) goto L52
            r11.close()     // Catch: java.lang.Throwable -> L57
        L52:
            throw r0     // Catch: java.lang.Throwable -> L57
        L53:
            r11 = r0
        L54:
            if (r11 == 0) goto L5a
        L56:
            goto L41
        L57:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L5a:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p014b.C0741c.m288a(java.lang.String):com.anythink.basead.c.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x0068, PHI: r11
  0x0052: PHI (r11v8 android.database.Cursor) = 
  (r11v5 android.database.Cursor)
  (r11v6 android.database.Cursor)
  (r11v7 android.database.Cursor)
  (r11v10 android.database.Cursor)
 binds: [B:22:0x0050, B:27:0x005a, B:34:0x0065, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:14:0x0043, B:23:0x0052, B:31:0x0060, B:32:0x0063, B:26:0x0057), top: B:42:0x0002, inners: #6 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.anythink.basead.p015c.C0745c> m289b(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.content.Context r1 = r10.f645b     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            com.anythink.basead.b.b r1 = com.anythink.basead.p014b.C0740b.m282a(r1)     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            android.database.sqlite.SQLiteDatabase r2 = r1.getReadableDatabase()     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            java.lang.String r3 = "my_offer_cap_pacing"
            r4 = 0
            java.lang.String r5 = "offer_cap <= show_num AND record_date=? AND offer_cap !=?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            r1 = 0
            r6[r1] = r11     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            r11 = 1
            java.lang.String r1 = "-1"
            r6[r11] = r1     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4f java.lang.OutOfMemoryError -> L56 java.lang.Exception -> L64
            if (r11 == 0) goto L4c
            int r1 = r11.getCount()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
            if (r1 <= 0) goto L4c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
        L30:
            boolean r2 = r11.moveToNext()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
            if (r2 == 0) goto L3e
            com.anythink.basead.c.c r2 = m285a(r11)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
            r1.add(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
            goto L30
        L3e:
            r11.close()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a java.lang.OutOfMemoryError -> L57
            if (r11 == 0) goto L46
            r11.close()     // Catch: java.lang.Throwable -> L68
        L46:
            monitor-exit(r10)
            return r1
        L48:
            goto L50
        L4a:
            goto L65
        L4c:
            if (r11 == 0) goto L6b
            goto L67
        L4f:
            r11 = r0
        L50:
            if (r11 == 0) goto L6b
        L52:
            r11.close()     // Catch: java.lang.Throwable -> L68
            goto L6b
        L56:
            r11 = r0
        L57:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L6b
            goto L67
        L5d:
            r0 = move-exception
            if (r11 == 0) goto L63
            r11.close()     // Catch: java.lang.Throwable -> L68
        L63:
            throw r0     // Catch: java.lang.Throwable -> L68
        L64:
            r11 = r0
        L65:
            if (r11 == 0) goto L6b
        L67:
            goto L52
        L68:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L6b:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.p014b.C0741c.m289b(java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m290c(String str) {
        synchronized (this) {
            try {
                String str2 = "record_date != '" + str + "'";
                if (C0740b.m282a(this.f645b).getWritableDatabase() == null) {
                } else {
                    C0740b.m282a(this.f645b).getWritableDatabase().delete(a.f646a, str2, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
