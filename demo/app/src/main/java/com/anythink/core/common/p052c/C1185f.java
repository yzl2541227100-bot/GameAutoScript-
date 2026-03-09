package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import com.anythink.core.common.p050a.C1154f;
import com.anythink.core.common.p050a.C1156h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.common.c.f */
/* JADX INFO: loaded from: classes.dex */
public class C1185f extends C1180a<C1156h> {

    /* JADX INFO: renamed from: d */
    private static volatile C1185f f3477d;

    /* JADX INFO: renamed from: b */
    private final String f3478b;

    /* JADX INFO: renamed from: c */
    private final long f3479c;

    /* JADX INFO: renamed from: com.anythink.core.common.c.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3480a = "dsp_offer_show_record";

        /* JADX INFO: renamed from: b */
        public static final String f3481b = "dsp_id";

        /* JADX INFO: renamed from: c */
        public static final String f3482c = "dsp_offer_id";

        /* JADX INFO: renamed from: d */
        public static final String f3483d = "show_limit";

        /* JADX INFO: renamed from: e */
        public static final String f3484e = "show_count";

        /* JADX INFO: renamed from: f */
        public static final String f3485f = "create_time";

        /* JADX INFO: renamed from: g */
        public static final String f3486g = "last_update_time";

        /* JADX INFO: renamed from: h */
        public static final String f3487h = "CREATE TABLE IF NOT EXISTS dsp_offer_show_record(dsp_id TEXT ,dsp_offer_id TEXT ,show_limit INTEGER ,show_count INTEGER ,create_time INTEGER ,last_update_time INTEGER)";
    }

    private C1185f(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3478b = C1185f.class.getName();
        this.f3479c = 86400000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[Catch: all -> 0x0055, PHI: r11
  0x003f: PHI (r11v8 android.database.Cursor) = 
  (r11v5 android.database.Cursor)
  (r11v6 android.database.Cursor)
  (r11v7 android.database.Cursor)
  (r11v10 android.database.Cursor)
 binds: [B:17:0x003d, B:22:0x0047, B:29:0x0052, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x0030, B:18:0x003f, B:26:0x004d, B:27:0x0050, B:21:0x0044), top: B:37:0x0002, inners: #4 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized com.anythink.core.common.p050a.C1156h m2231a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.m2201a()     // Catch: java.lang.Throwable -> L3c java.lang.OutOfMemoryError -> L43 java.lang.Exception -> L51
            java.lang.String r2 = "dsp_offer_show_record"
            r3 = 0
            java.lang.String r4 = "dsp_id = ?  AND dsp_offer_id = ? "
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L3c java.lang.OutOfMemoryError -> L43 java.lang.Exception -> L51
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L3c java.lang.OutOfMemoryError -> L43 java.lang.Exception -> L51
            r11 = 1
            r5[r11] = r12     // Catch: java.lang.Throwable -> L3c java.lang.OutOfMemoryError -> L43 java.lang.Exception -> L51
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3c java.lang.OutOfMemoryError -> L43 java.lang.Exception -> L51
            java.util.List r12 = r10.m2233a(r11)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.OutOfMemoryError -> L44
            r11.close()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.OutOfMemoryError -> L44
            int r1 = r12.size()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.OutOfMemoryError -> L44
            if (r1 <= 0) goto L35
            java.lang.Object r12 = r12.get(r9)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.OutOfMemoryError -> L44
            com.anythink.core.common.a.h r12 = (com.anythink.core.common.p050a.C1156h) r12     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.lang.OutOfMemoryError -> L44
            if (r11 == 0) goto L33
            r11.close()     // Catch: java.lang.Throwable -> L55
        L33:
            monitor-exit(r10)
            return r12
        L35:
            if (r11 == 0) goto L58
            goto L54
        L38:
            goto L3d
        L3a:
            goto L52
        L3c:
            r11 = r0
        L3d:
            if (r11 == 0) goto L58
        L3f:
            r11.close()     // Catch: java.lang.Throwable -> L55
            goto L58
        L43:
            r11 = r0
        L44:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L58
            goto L54
        L4a:
            r12 = move-exception
            if (r11 == 0) goto L50
            r11.close()     // Catch: java.lang.Throwable -> L55
        L50:
            throw r12     // Catch: java.lang.Throwable -> L55
        L51:
            r11 = r0
        L52:
            if (r11 == 0) goto L58
        L54:
            goto L3f
        L55:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L58:
            monitor-exit(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1185f.m2231a(java.lang.String, java.lang.String):com.anythink.core.common.a.h");
    }

    /* JADX INFO: renamed from: a */
    public static C1185f m2232a(AbstractC1181b abstractC1181b) {
        if (f3477d == null) {
            synchronized (C1185f.class) {
                if (f3477d == null) {
                    f3477d = new C1185f(abstractC1181b);
                }
            }
        }
        return f3477d;
    }

    /* JADX INFO: renamed from: a */
    private synchronized List<C1156h> m2233a(Cursor cursor) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    try {
                        C1156h c1156h = new C1156h();
                        c1156h.m1966a(cursor.getString(cursor.getColumnIndex("dsp_id")));
                        c1156h.m1968b(cursor.getString(cursor.getColumnIndex("dsp_offer_id")));
                        c1156h.m1971a(cursor.getInt(cursor.getColumnIndex(a.f3483d)));
                        c1156h.m1972b(cursor.getInt(cursor.getColumnIndex("show_count")));
                        arrayList.add(c1156h);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m2234a(C1156h c1156h) {
        if (m2202b() == null) {
            return -1L;
        }
        if (c1156h.m1973c() <= 0) {
            return -1L;
        }
        if (m2231a(c1156h.m1965a(), c1156h.m1967b()) != null) {
            StringBuilder sb = new StringBuilder("insertDspOfferShowRecord--had inserted...,dspid:");
            sb.append(c1156h.m1965a());
            sb.append(",dspOfferId:");
            sb.append(c1156h.m1967b());
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("dsp_id", c1156h.m1965a());
        contentValues.put("dsp_offer_id", c1156h.m1967b());
        contentValues.put(a.f3483d, Integer.valueOf(c1156h.m1973c()));
        contentValues.put("show_count", (Integer) 0);
        contentValues.put(a.f3485f, Long.valueOf(System.currentTimeMillis()));
        contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder("insertDspOfferShowRecord--insert dspid:");
        sb2.append(c1156h.m1965a());
        sb2.append(",dspOfferId:");
        sb2.append(c1156h.m1967b());
        return m2202b().insert(a.f3480a, null, contentValues);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<C1154f> m2235a(int i) {
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            return arrayList;
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m2201a().query(a.f3480a, null, "show_count > show_limit", null, null, null, "last_update_time DESC", String.valueOf(i));
                List<C1156h> listM2233a = m2233a(cursorQuery);
                new StringBuilder("get limit show cap record list size:").append(listM2233a.size());
                cursorQuery.close();
                arrayList.addAll(listM2233a);
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

    /* JADX INFO: renamed from: b */
    public final synchronized long m2236b(C1156h c1156h) {
        if (m2202b() == null) {
            return -1L;
        }
        if (c1156h.m1973c() <= 0) {
            return -1L;
        }
        C1156h c1156hM2231a = m2231a(c1156h.m1965a(), c1156h.m1967b());
        if (c1156hM2231a != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dsp_id", c1156h.m1965a());
                contentValues.put("dsp_offer_id", c1156h.m1967b());
                contentValues.put(a.f3483d, Integer.valueOf(c1156h.m1973c()));
                contentValues.put("show_count", Integer.valueOf(c1156hM2231a.m1974d() + 1));
                contentValues.put("last_update_time", Long.valueOf(System.currentTimeMillis()));
                StringBuilder sb = new StringBuilder("updateDspOfferShowRecord--update dspid:");
                sb.append(c1156h.m1965a());
                sb.append(",dspOfferId:");
                sb.append(c1156h.m1967b());
                sb.append(",cur show count:");
                sb.append(c1156hM2231a.m1974d() + 1);
                sb.append(",limit show cap:");
                sb.append(c1156h.m1973c());
                return m2202b().update(a.f3480a, contentValues, "dsp_id = ? and dsp_offer_id = ? ", new String[]{c1156h.m1965a(), c1156h.m1967b()});
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: c */
    public final void m2237c() {
        try {
            String str = "create_time < " + (System.currentTimeMillis() - 86400000);
            if (m2202b() == null) {
                return;
            }
            m2202b().delete(a.f3480a, str, null);
        } catch (Exception unused) {
        }
    }
}
