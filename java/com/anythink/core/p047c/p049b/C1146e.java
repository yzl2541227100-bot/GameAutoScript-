package com.anythink.core.p047c.p049b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.AbstractC1181b;
import com.anythink.core.common.p052c.C1180a;
import com.anythink.core.common.p052c.C1182c;
import com.anythink.core.p047c.p048a.C1137a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.core.c.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C1146e extends C1180a<C1137a> {

    /* JADX INFO: renamed from: b */
    private static final String f2881b = "PlacementStatisticsDao";

    /* JADX INFO: renamed from: c */
    private static final int f2882c = 50;

    /* JADX INFO: renamed from: d */
    private static volatile C1146e f2883d;

    /* JADX INFO: renamed from: com.anythink.core.c.b.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f2884a = "user_value_placement";

        /* JADX INFO: renamed from: b */
        public static final String f2885b = "type";

        /* JADX INFO: renamed from: c */
        public static final String f2886c = "placement_id";

        /* JADX INFO: renamed from: d */
        public static final String f2887d = "request_id";

        /* JADX INFO: renamed from: e */
        public static final String f2888e = "network_firm_id";

        /* JADX INFO: renamed from: f */
        public static final String f2889f = "ad_source_id";

        /* JADX INFO: renamed from: g */
        public static final String f2890g = "dsp_id";

        /* JADX INFO: renamed from: h */
        public static final String f2891h = "price";

        /* JADX INFO: renamed from: i */
        public static final String f2892i = "record_time";

        /* JADX INFO: renamed from: j */
        public static final String f2893j = "ps_id";

        /* JADX INFO: renamed from: k */
        public static final String f2894k = "segment_id";

        /* JADX INFO: renamed from: l */
        public static final String f2895l = "CREATE TABLE IF NOT EXISTS user_value_placement(type INTEGER, placement_id TEXT, request_id TEXT, network_firm_id INTEGER, ad_source_id TEXT, dsp_id TEXT, price DOUBLE, record_time INTEGER, ps_id TEXT )";

        /* JADX INFO: renamed from: m */
        public static final String f2896m = "ALTER TABLE user_value_placement ADD COLUMN segment_id INTEGER";

        /* JADX INFO: renamed from: n */
        public static final String f2897n = "CREATE INDEX placement_id ON user_value_placement (placement_id)";
    }

    private C1146e(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
    }

    /* JADX INFO: renamed from: a */
    private static C1137a m1894a(Cursor cursor) {
        C1137a c1137a = new C1137a();
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("type"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("placement_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("request_id"));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("network_firm_id"));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("ad_source_id"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("dsp_id"));
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("price"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow(a.f2892i));
        String string5 = cursor.getString(cursor.getColumnIndexOrThrow("ps_id"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("segment_id"));
        c1137a.m1824c(i);
        c1137a.m1829e(string);
        c1137a.m1819a(string2);
        c1137a.m1821b(i2);
        c1137a.m1822b(string3);
        c1137a.m1825c(string4);
        c1137a.m1816a(d);
        c1137a.m1818a(j);
        c1137a.m1827d(string5);
        c1137a.m1817a(i3);
        return c1137a;
    }

    /* JADX INFO: renamed from: a */
    private boolean m1895a(String str, String str2, int i) {
        Cursor cursorQuery = m2201a().query(a.f2884a, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{str, str2, String.valueOf(i)}, null, null, null);
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
    public static C1146e m1896c() {
        if (f2883d == null) {
            synchronized (C1146e.class) {
                if (f2883d == null) {
                    f2883d = new C1146e(C1182c.m2210a(C1175n.m2059a().m2148f()));
                }
            }
        }
        return f2883d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #1 {, blocks: (B:10:0x0043, B:21:0x005a, B:27:0x0063, B:28:0x0066), top: B:32:0x0002 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.anythink.core.p047c.p048a.C1137a> m1897a(int r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            android.database.sqlite.SQLiteDatabase r2 = r11.m2201a()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r5 = "type = ? AND placement_id = ?"
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r3 = 0
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6[r3] = r12     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r12 = 1
            r6[r12] = r13     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r9 = "record_time DESC"
            java.lang.String r3 = "user_value_placement"
            r4 = 0
            r7 = 0
            r8 = 0
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
        L29:
            boolean r13 = r12.moveToNext()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            if (r13 == 0) goto L37
            com.anythink.core.c.a.a r13 = m1894a(r12)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            r1.add(r13)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            goto L29
        L37:
            r1.size()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            r13.getId()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L5f
            if (r12 == 0) goto L46
            r12.close()     // Catch: java.lang.Throwable -> L67
        L46:
            monitor-exit(r11)
            return r1
        L48:
            r13 = move-exception
            goto L4e
        L4a:
            r13 = move-exception
            goto L61
        L4c:
            r13 = move-exception
            r12 = r0
        L4e:
            r13.getMessage()     // Catch: java.lang.Throwable -> L5f
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5f
            r13.getName()     // Catch: java.lang.Throwable -> L5f
            if (r12 == 0) goto L5d
            r12.close()     // Catch: java.lang.Throwable -> L67
        L5d:
            monitor-exit(r11)
            return r0
        L5f:
            r13 = move-exception
            r0 = r12
        L61:
            if (r0 == 0) goto L66
            r0.close()     // Catch: java.lang.Throwable -> L67
        L66:
            throw r13     // Catch: java.lang.Throwable -> L67
        L67:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.p047c.p049b.C1146e.m1897a(int, java.lang.String, int):java.util.List");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<C1137a> m1898a(String str, int i, long j, int i2) {
        ArrayList arrayList;
        String str2;
        String[] strArr;
        arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                if (i == -1) {
                    str2 = "placement_id = ? AND record_time > ? AND price > ?";
                    strArr = new String[]{str, String.valueOf(j), "0"};
                } else {
                    str2 = "placement_id = ? AND segment_id = ? AND record_time > ? AND price > ?";
                    strArr = new String[]{str, String.valueOf(i), String.valueOf(j), "0"};
                }
                cursorQuery = m2201a().query(a.f2884a, null, str2, strArr, null, null, null, String.valueOf(i2));
                while (cursorQuery.moveToNext()) {
                    arrayList.add(m1894a(cursorQuery));
                    Thread.currentThread().getName();
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Exception e) {
            e.getMessage();
            Thread.currentThread().getName();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1899a(C1137a c1137a) {
        String strM1834j;
        String strM1820b;
        SQLiteDatabase sQLiteDatabaseM2202b;
        ContentValues contentValues;
        boolean z;
        int iM1835k = c1137a.m1835k();
        Cursor cursor = null;
        try {
            try {
                strM1834j = c1137a.m1834j();
                strM1820b = c1137a.m1820b();
                sQLiteDatabaseM2202b = m2202b();
                contentValues = new ContentValues();
                contentValues.put("type", Integer.valueOf(iM1835k));
                contentValues.put("placement_id", strM1834j);
                contentValues.put("request_id", strM1820b);
                contentValues.put("ad_source_id", c1137a.m1826d());
                contentValues.put("network_firm_id", Integer.valueOf(c1137a.m1823c()));
                contentValues.put("dsp_id", c1137a.m1828e());
                contentValues.put("price", Double.valueOf(c1137a.m1830f()));
                contentValues.put(a.f2892i, Long.valueOf(c1137a.m1831g()));
                contentValues.put("ps_id", c1137a.m1832h());
                contentValues.put("segment_id", Integer.valueOf(c1137a.m1815a()));
                Cursor cursorQuery = m2201a().query(a.f2884a, new String[]{"placement_id", "request_id"}, "placement_id=? AND request_id=? AND type=?", new String[]{strM1834j, strM1820b, String.valueOf(iM1835k)}, null, null, null);
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    z = false;
                } else {
                    cursorQuery.close();
                    z = true;
                }
            } catch (Exception e) {
                e = e;
            }
            if (z) {
                m2202b().update(a.f2884a, contentValues, "placement_id = ? AND request_id = ? AND type = ?", new String[]{strM1834j, strM1820b, String.valueOf(iM1835k)});
                return;
            }
            Cursor cursorQuery2 = sQLiteDatabaseM2202b.query(a.f2884a, new String[]{a.f2892i}, "type = ? AND placement_id = ?", new String[]{String.valueOf(iM1835k), strM1834j}, null, null, "record_time ASC");
            try {
                if (cursorQuery2.getCount() > 50) {
                    long j = cursorQuery2.moveToNext() ? cursorQuery2.getLong(cursorQuery2.getColumnIndexOrThrow(a.f2892i)) : 0L;
                    if (j != 0) {
                        sQLiteDatabaseM2202b.delete(a.f2884a, "record_time = ?", new String[]{String.valueOf(j)});
                    }
                }
                sQLiteDatabaseM2202b.insertOrThrow(a.f2884a, null, contentValues);
                Thread.currentThread().getName();
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
            } catch (Exception e2) {
                e = e2;
                cursor = cursorQuery2;
                e.getMessage();
                Thread.currentThread().getName();
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1900a(String str) {
        try {
            m2202b().delete(a.f2884a, "placement_id = ?", new String[]{str});
        } catch (Exception e) {
            e.getMessage();
            Thread.currentThread().getName();
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized double[] m1901a(String[] strArr, String str) {
        double[] dArr;
        Cursor cursorQuery = null;
        dArr = new double[2];
        try {
            try {
                cursorQuery = m2201a().query(str, strArr, null, null, null, null, null, null);
                if (cursorQuery.moveToNext()) {
                    dArr[0] = cursorQuery.getDouble(0);
                    dArr[1] = cursorQuery.getInt(1);
                }
            } catch (Exception e) {
                e.getMessage();
                Thread.currentThread().getName();
                if (cursorQuery != null) {
                }
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return dArr;
    }
}
