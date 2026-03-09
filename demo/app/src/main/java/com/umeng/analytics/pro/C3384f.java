package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.umeng.analytics.pro.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3384f {
    /* JADX INFO: renamed from: a */
    public static String m15479a(List<String> list) {
        return TextUtils.join("!", list);
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m15480a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    /* JADX INFO: renamed from: a */
    public static void m15481a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File file = new File(C3381c.f18416a + context.getPackageName() + C3381c.f18417b + C3381c.f18418c);
            if (file.exists()) {
                file.delete();
            }
            C3382d.m15467a(context).m15473a();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15482a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("select count(*) as c from sqlite_master where type ='table' and name ='" + str.trim() + "' ", null);
            if (cursorRawQuery.moveToNext()) {
                if (cursorRawQuery.getInt(0) > 0) {
                    z = true;
                }
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static String m15483b(Context context) {
        return C3381c.f18416a + context.getPackageName() + C3381c.f18417b;
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m15484b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : list) {
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
