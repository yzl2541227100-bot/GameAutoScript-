package com.anythink.core.common.p052c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.p052c.C1183d;
import com.anythink.core.common.p052c.C1184e;
import com.anythink.core.common.p052c.C1185f;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.core.common.p052c.C1187h;
import com.anythink.core.common.p052c.C1188i;
import com.anythink.core.common.p052c.C1189j;
import com.anythink.core.common.p052c.C1190k;
import com.anythink.core.common.p052c.C1191l;
import com.anythink.core.common.p052c.C1192m;
import com.anythink.core.p047c.p049b.C1146e;

/* JADX INFO: renamed from: com.anythink.core.common.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1182c extends AbstractC1181b {

    /* JADX INFO: renamed from: a */
    private static C1182c f3460a;

    private C1182c(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static C1182c m2210a(Context context) {
        if (f3460a == null) {
            synchronized (C1182c.class) {
                if (f3460a == null) {
                    f3460a = new C1182c(context.getApplicationContext());
                }
            }
        }
        return f3460a;
    }

    /* JADX INFO: renamed from: c */
    private void m2211c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(C1183d.a.f3468f);
            sQLiteDatabase.execSQL(C1186g.a.f3499i);
            mo2205a(sQLiteDatabase, 3, 12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m2212d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'placement_ad_impression'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'inspect_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'user_value_placement'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2213e(SQLiteDatabase sQLiteDatabase) {
        m2212d(sQLiteDatabase);
        m2211c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.p052c.AbstractC1181b
    /* JADX INFO: renamed from: a */
    public final void mo2204a(SQLiteDatabase sQLiteDatabase) {
        m2211c(sQLiteDatabase);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.core.common.p052c.AbstractC1181b
    /* JADX INFO: renamed from: a */
    public final void mo2205a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        while (i < i2) {
            String str2 = C1146e.a.f2895l;
            switch (i) {
                case 1:
                case 2:
                    m2212d(sQLiteDatabase);
                    m2211c(sQLiteDatabase);
                    break;
                case 3:
                    str2 = C1191l.a.f3552j;
                    sQLiteDatabase.execSQL(str2);
                    break;
                case 4:
                    str = C1189j.a.f3529h;
                    sQLiteDatabase.execSQL(str);
                    sQLiteDatabase.execSQL(C1190k.a.f3540i);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(C1185f.a.f3487h);
                    str2 = C1184e.a.f3476f;
                    sQLiteDatabase.execSQL(str2);
                    break;
                case 6:
                    str2 = C1187h.a.f3506d;
                    sQLiteDatabase.execSQL(str2);
                    break;
                case 7:
                    str2 = C1192m.a.f3562h;
                    sQLiteDatabase.execSQL(str2);
                    break;
                case 8:
                    sQLiteDatabase.execSQL(C1188i.b.f3519i);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
                    str2 = C1186g.a.f3499i;
                    sQLiteDatabase.execSQL(str2);
                    break;
                case 9:
                    sQLiteDatabase.execSQL(str2);
                    break;
                case 10:
                    try {
                        sQLiteDatabase.execSQL(C1146e.a.f2895l);
                        break;
                    } catch (Throwable unused) {
                    }
                    str = "DROP TABLE IF EXISTS 'offer_data_cache'";
                    sQLiteDatabase.execSQL(str);
                    sQLiteDatabase.execSQL(C1190k.a.f3540i);
                    break;
                case 11:
                    sQLiteDatabase.execSQL(C1146e.a.f2896m);
                    str2 = C1146e.a.f2897n;
                    sQLiteDatabase.execSQL(str2);
                    break;
            }
            i++;
        }
    }

    @Override // com.anythink.core.common.p052c.AbstractC1181b
    /* JADX INFO: renamed from: b */
    public final void mo2207b(SQLiteDatabase sQLiteDatabase) {
        m2212d(sQLiteDatabase);
        m2211c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.p052c.AbstractC1181b
    /* JADX INFO: renamed from: c */
    public final String mo2208c() {
        return "anythink.db";
    }

    @Override // com.anythink.core.common.p052c.AbstractC1181b
    /* JADX INFO: renamed from: d */
    public final int mo2209d() {
        return 12;
    }
}
