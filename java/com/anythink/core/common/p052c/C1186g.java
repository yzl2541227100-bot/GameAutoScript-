package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.p055f.C1256u;

/* JADX INFO: renamed from: com.anythink.core.common.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C1186g extends C1180a<C1256u> {

    /* JADX INFO: renamed from: b */
    private static final String f3488b = "com.anythink.core.common.c.g";

    /* JADX INFO: renamed from: c */
    private static C1186g f3489c;

    /* JADX INFO: renamed from: d */
    private int f3490d;

    /* JADX INFO: renamed from: com.anythink.core.common.c.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3491a = "request_info";

        /* JADX INFO: renamed from: b */
        public static final String f3492b = "id";

        /* JADX INFO: renamed from: c */
        public static final String f3493c = "req_type";

        /* JADX INFO: renamed from: d */
        public static final String f3494d = "req_url";

        /* JADX INFO: renamed from: e */
        public static final String f3495e = "req_head";

        /* JADX INFO: renamed from: f */
        public static final String f3496f = "req_content";

        /* JADX INFO: renamed from: g */
        public static final String f3497g = "time";

        /* JADX INFO: renamed from: h */
        public static final String f3498h = "extra";

        /* JADX INFO: renamed from: i */
        public static final String f3499i = "CREATE TABLE IF NOT EXISTS request_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, req_content TEXT, time INTEGER, extra TEXT )";
    }

    private C1186g(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3490d = 1000;
    }

    /* JADX INFO: renamed from: a */
    public static C1186g m2238a(AbstractC1181b abstractC1181b) {
        if (f3489c == null) {
            synchronized (C1186g.class) {
                if (f3489c == null) {
                    f3489c = new C1186g(abstractC1181b);
                }
            }
        }
        return f3489c;
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m2239d() {
        try {
            if (m2202b() == null) {
                return;
            }
            m2202b().delete(a.f3491a, null, null);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2240a(C1256u c1256u) {
        Cursor cursorQuery;
        if (m2202b() == null) {
            return -1L;
        }
        Cursor cursor = null;
        try {
            cursorQuery = m2201a().query(a.f3491a, null, null, null, null, null, null);
            try {
                if (cursorQuery.getCount() >= this.f3490d) {
                    m2239d();
                }
            } catch (Exception unused) {
                if (cursorQuery != null) {
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", c1256u.f4473a);
                contentValues.put("req_type", Integer.valueOf(c1256u.f4474b));
                contentValues.put("req_url", c1256u.f4476d);
                contentValues.put("req_head", c1256u.f4475c);
                contentValues.put(a.f3496f, c1256u.f4477e);
                contentValues.put("time", Long.valueOf(c1256u.f4478f));
                contentValues.put(a.f3498h, c1256u.f4479g);
                return m2202b().insert(a.f3491a, null, contentValues);
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Exception unused4) {
            }
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", c1256u.f4473a);
            contentValues2.put("req_type", Integer.valueOf(c1256u.f4474b));
            contentValues2.put("req_url", c1256u.f4476d);
            contentValues2.put("req_head", c1256u.f4475c);
            contentValues2.put(a.f3496f, c1256u.f4477e);
            contentValues2.put("time", Long.valueOf(c1256u.f4478f));
            contentValues2.put(a.f3498h, c1256u.f4479g);
            return m2202b().insert(a.f3491a, null, contentValues2);
        } catch (Exception unused5) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m2241b(C1256u c1256u) {
        if (m2202b() == null || c1256u == null) {
            return -1;
        }
        try {
            return m2202b().delete(a.f3491a, "id=?", new String[]{c1256u.f4473a});
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x00b3, PHI: r1
  0x00a4: PHI (r1v5 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v4 android.database.Cursor), (r1v6 android.database.Cursor) binds: [B:24:0x009b, B:28:0x00a2, B:35:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {, blocks: (B:14:0x008a, B:20:0x0095, B:29:0x00a4, B:32:0x00ab, B:33:0x00ae, B:27:0x009f), top: B:43:0x0002, inners: #2 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.anythink.core.common.p055f.C1256u> m2242c() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m2201a()     // Catch: java.lang.Throwable -> L9a java.lang.OutOfMemoryError -> L9e java.lang.Exception -> Laf
            java.lang.String r2 = "request_info"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "time"
            java.lang.String r9 = "10"
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9a java.lang.OutOfMemoryError -> L9e java.lang.Exception -> Laf
            if (r1 == 0) goto L93
            int r2 = r1.getCount()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            if (r2 <= 0) goto L93
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
        L22:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            if (r3 == 0) goto L85
            com.anythink.core.common.f.u r3 = new com.anythink.core.common.f.u     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4473a = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "req_type"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            int r4 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4474b = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "req_url"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4476d = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "req_head"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4475c = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "req_content"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4477e = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "time"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            long r4 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4478f = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = "extra"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r3.f4479g = r4     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            r2.add(r3)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            goto L22
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91 java.lang.OutOfMemoryError -> L9f
            if (r1 == 0) goto L8d
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        L8d:
            monitor-exit(r10)
            return r2
        L8f:
            goto L9b
        L91:
            goto Lb0
        L93:
            if (r1 == 0) goto L98
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        L98:
            monitor-exit(r10)
            return r0
        L9a:
            r1 = r0
        L9b:
            if (r1 == 0) goto Lb6
            goto Lb2
        L9e:
            r1 = r0
        L9f:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb6
        La4:
            r1.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb6
        La8:
            r0 = move-exception
            if (r1 == 0) goto Lae
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Laf:
            r1 = r0
        Lb0:
            if (r1 == 0) goto Lb6
        Lb2:
            goto La4
        Lb3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        Lb6:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1186g.m2242c():java.util.List");
    }
}
