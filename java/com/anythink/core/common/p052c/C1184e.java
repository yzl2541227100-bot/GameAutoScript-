package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.p050a.C1154f;
import com.anythink.core.common.p050a.C1155g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C1184e extends C1180a<C1155g> {

    /* JADX INFO: renamed from: c */
    private static volatile C1184e f3469c;

    /* JADX INFO: renamed from: b */
    private final String f3470b;

    /* JADX INFO: renamed from: com.anythink.core.common.c.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3471a = "dsp_offer_install_record";

        /* JADX INFO: renamed from: b */
        public static final String f3472b = "dsp_id";

        /* JADX INFO: renamed from: c */
        public static final String f3473c = "dsp_offer_id";

        /* JADX INFO: renamed from: d */
        public static final String f3474d = "package_name";

        /* JADX INFO: renamed from: e */
        public static final String f3475e = "last_update_time";

        /* JADX INFO: renamed from: f */
        public static final String f3476f = "CREATE TABLE IF NOT EXISTS dsp_offer_install_record(dsp_id TEXT ,dsp_offer_id TEXT ,package_name TEXT ,last_update_time INTEGER)";
    }

    private C1184e(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3470b = C1184e.class.getName();
    }

    /* JADX INFO: renamed from: a */
    public static C1184e m2226a(AbstractC1181b abstractC1181b) {
        if (f3469c == null) {
            synchronized (C1184e.class) {
                if (f3469c == null) {
                    f3469c = new C1184e(abstractC1181b);
                }
            }
        }
        return f3469c;
    }

    /* JADX INFO: renamed from: a */
    private synchronized List<C1155g> m2227a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        C1155g c1155g = new C1155g();
                        c1155g.m1966a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        c1155g.m1968b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        c1155g.m1970c(cursor.getString(cursor.getColumnIndex("package_name")));
                        arrayList.add(c1155g);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x004a, PHI: r1
  0x0036: PHI (r1v5 android.database.Cursor) = 
  (r1v2 android.database.Cursor)
  (r1v3 android.database.Cursor)
  (r1v4 android.database.Cursor)
  (r1v6 android.database.Cursor)
 binds: [B:17:0x0034, B:21:0x003d, B:27:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:10:0x0028, B:18:0x0036, B:25:0x0043, B:26:0x0046, B:20:0x003a), top: B:34:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m2228a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.m2201a()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            java.lang.String r3 = "dsp_offer_install_record"
            r4 = 0
            java.lang.String r5 = "dsp_id = ?  AND dsp_offer_id = ? "
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            r6[r0] = r11     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            r11 = 1
            r6[r11] = r12     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            if (r1 == 0) goto L31
            int r12 = r1.getCount()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            if (r12 <= 0) goto L31
            r1.close()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f java.lang.OutOfMemoryError -> L3a
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L2b:
            monitor-exit(r10)
            return r11
        L2d:
            goto L34
        L2f:
            goto L47
        L31:
            if (r1 == 0) goto L4d
            goto L49
        L34:
            if (r1 == 0) goto L4d
        L36:
            r1.close()     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L3a:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L4d
            goto L49
        L40:
            r11 = move-exception
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.lang.Throwable -> L4a
        L46:
            throw r11     // Catch: java.lang.Throwable -> L4a
        L47:
            if (r1 == 0) goto L4d
        L49:
            goto L36
        L4a:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L4d:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1184e.m2228a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2229a(C1155g c1155g) {
        if (m2202b() == null) {
            return -1L;
        }
        if (m2228a(c1155g.m1965a(), c1155g.m1967b())) {
            StringBuilder sb = new StringBuilder("insertDspOfferInstallRecord--had inserted...,dspid:");
            sb.append(c1155g.m1965a());
            sb.append(",dspoferrId:");
            sb.append(c1155g.m1967b());
            sb.append(",packagename:");
            sb.append(c1155g.m1969c());
        } else {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", c1155g.m1965a());
                contentValues.put("dsp_offer_id", c1155g.m1967b());
                contentValues.put("package_name", c1155g.m1969c());
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                StringBuilder sb2 = new StringBuilder("insertDspOfferInstallRecord--insert,dspid:");
                sb2.append(c1155g.m1965a());
                sb2.append(",dspoferrId:");
                sb2.append(c1155g.m1967b());
                sb2.append(",packagename:");
                sb2.append(c1155g.m1969c());
                return m2202b().insert(a.f3471a, null, contentValues);
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<C1154f> m2230a(int i) {
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m2201a().query(a.f3471a, null, null, null, null, null, "last_update_time DESC", String.valueOf(i));
                List<C1155g> listM2227a = m2227a(cursorQuery);
                cursorQuery.close();
                new StringBuilder("get limit install record list size:").append(listM2227a.size());
                arrayList.addAll(listM2227a);
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
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
