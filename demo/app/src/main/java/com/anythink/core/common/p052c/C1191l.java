package com.anythink.core.common.p052c;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.p055f.C1222ao;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.c.l */
/* JADX INFO: loaded from: classes.dex */
public class C1191l extends C1180a<C1222ao> {

    /* JADX INFO: renamed from: c */
    private static volatile C1191l f3541c;

    /* JADX INFO: renamed from: b */
    private final String f3542b;

    /* JADX INFO: renamed from: com.anythink.core.common.c.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final String f3543a = "placement_ad_impression";

        /* JADX INFO: renamed from: b */
        public static final String f3544b = "format";

        /* JADX INFO: renamed from: c */
        public static final String f3545c = "placement_id";

        /* JADX INFO: renamed from: d */
        public static final String f3546d = "adsource_id";

        /* JADX INFO: renamed from: e */
        public static final String f3547e = "hour_time";

        /* JADX INFO: renamed from: f */
        public static final String f3548f = "hour_imp";

        /* JADX INFO: renamed from: g */
        public static final String f3549g = "date_time";

        /* JADX INFO: renamed from: h */
        public static final String f3550h = "date_imp";

        /* JADX INFO: renamed from: i */
        public static final String f3551i = "show_time";

        /* JADX INFO: renamed from: j */
        public static final String f3552j = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
    }

    private C1191l(AbstractC1181b abstractC1181b) {
        super(abstractC1181b);
        this.f3542b = C1191l.class.getName();
    }

    /* JADX INFO: renamed from: a */
    public static C1191l m2274a(AbstractC1181b abstractC1181b) {
        if (f3541c == null) {
            synchronized (C1191l.class) {
                if (f3541c == null) {
                    f3541c = new C1191l(abstractC1181b);
                }
            }
        }
        return f3541c;
    }

    /* JADX INFO: renamed from: a */
    private static C1222ao m2275a(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        C1222ao c1222ao = new C1222ao();
        c1222ao.f3867h = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            c1222ao.f3860a = cursor.getInt(cursor.getColumnIndex("format"));
            c1222ao.f3861b = cursor.getString(cursor.getColumnIndex("placement_id"));
            C1222ao.a aVar = new C1222ao.a();
            aVar.f3868a = cursor.getString(cursor.getColumnIndex("adsource_id"));
            aVar.f3869b = cursor.getString(cursor.getColumnIndex(a.f3547e));
            aVar.f3870c = cursor.getString(cursor.getColumnIndex(a.f3549g));
            if (TextUtils.equals(aVar.f3869b, str2)) {
                aVar.f3872e = cursor.getInt(cursor.getColumnIndex(a.f3548f));
            } else {
                aVar.f3872e = 0;
            }
            c1222ao.f3863d += aVar.f3872e;
            if (TextUtils.equals(aVar.f3870c, str)) {
                aVar.f3871d = cursor.getInt(cursor.getColumnIndex(a.f3550h));
            } else {
                aVar.f3871d = 0;
            }
            c1222ao.f3862c += aVar.f3871d;
            long j = cursor.getLong(cursor.getColumnIndex("show_time"));
            aVar.f3873f = j;
            if (j >= c1222ao.f3864e) {
                c1222ao.f3864e = j;
            }
            c1222ao.f3867h.put(aVar.f3868a, aVar);
        }
        return c1222ao;
    }

    /* JADX INFO: renamed from: b */
    private boolean m2276b(String str) {
        Cursor cursorQuery = m2201a().query(a.f3543a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
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
    public final synchronized long m2277a(int i, String str, C1222ao.a aVar) {
        boolean z;
        if (m2202b() == null || aVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i));
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", aVar.f3868a);
            contentValues.put(a.f3547e, aVar.f3869b);
            contentValues.put(a.f3548f, Integer.valueOf(aVar.f3872e));
            contentValues.put(a.f3549g, aVar.f3870c);
            contentValues.put(a.f3550h, Integer.valueOf(aVar.f3871d));
            contentValues.put("show_time", Long.valueOf(aVar.f3873f));
            Cursor cursorQuery = m2201a().query(a.f3543a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{aVar.f3868a}, "adsource_id", null, null);
            if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                z = false;
            } else {
                cursorQuery.close();
                z = true;
            }
            if (z) {
                return m2202b().update(a.f3543a, contentValues, "adsource_id = ? ", new String[]{aVar.f3868a});
            }
            return m2202b().insert(a.f3543a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8 A[Catch: all -> 0x00f7, PHI: r11
  0x00e8: PHI (r11v7 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v6 android.database.Cursor), (r11v8 android.database.Cursor) binds: [B:32:0x00df, B:36:0x00e6, B:43:0x00f4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {, blocks: (B:28:0x00d9, B:37:0x00e8, B:40:0x00ef, B:41:0x00f2, B:35:0x00e3), top: B:51:0x0002, inners: #1 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.anythink.core.common.p055f.C1222ao m2278a(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1191l.m2278a(java.lang.String, java.lang.String, java.lang.String):com.anythink.core.common.f.ao");
    }

    /* JADX INFO: renamed from: a */
    public final void m2279a(String str) {
        synchronized (this) {
            try {
                String str2 = "date_time!='" + str + "'";
                if (m2202b() == null) {
                } else {
                    m2202b().delete(a.f3543a, str2, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: all -> 0x0097, Exception -> 0x0099, OutOfMemoryError -> 0x00af, TryCatch #7 {Exception -> 0x0099, OutOfMemoryError -> 0x00af, all -> 0x0097, blocks: (B:34:0x0066, B:36:0x0087, B:38:0x008d, B:42:0x009d, B:44:0x00a3), top: B:71:0x0066, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[Catch: all -> 0x0097, Exception -> 0x0099, OutOfMemoryError -> 0x00af, TryCatch #7 {Exception -> 0x0099, OutOfMemoryError -> 0x00af, all -> 0x0097, blocks: (B:34:0x0066, B:36:0x0087, B:38:0x008d, B:42:0x009d, B:44:0x00a3), top: B:71:0x0066, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8 A[Catch: all -> 0x00c6, PHI: r0
  0x00a8: PHI (r0v12 android.database.Cursor) = (r0v8 android.database.Cursor), (r0v11 android.database.Cursor), (r0v13 android.database.Cursor) binds: [B:48:0x00ac, B:59:0x00c1, B:45:0x00a6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:18:0x0049, B:46:0x00a8, B:53:0x00b5, B:57:0x00bd, B:58:0x00c0, B:25:0x0056, B:30:0x005f, B:31:0x0062, B:51:0x00b0, B:23:0x0051, B:34:0x0066, B:36:0x0087, B:38:0x008d, B:42:0x009d, B:44:0x00a3, B:6:0x0007, B:8:0x0028, B:10:0x002e, B:14:0x003e, B:16:0x0044), top: B:66:0x0003, inners: #5, #6, #7, #8, #7, #6 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int[] m2280a(int r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p052c.C1191l.m2280a(int, java.lang.String, java.lang.String):int[]");
    }
}
