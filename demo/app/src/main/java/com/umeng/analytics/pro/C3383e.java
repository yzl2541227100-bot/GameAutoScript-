package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.umeng.analytics.pro.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3383e {

    /* JADX INFO: renamed from: b */
    private static SQLiteOpenHelper f18475b;

    /* JADX INFO: renamed from: d */
    private static Context f18476d;

    /* JADX INFO: renamed from: a */
    private AtomicInteger f18477a;

    /* JADX INFO: renamed from: c */
    private SQLiteDatabase f18478c;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3383e f18479a = new C3383e();

        private a() {
        }
    }

    private C3383e() {
        this.f18477a = new AtomicInteger();
    }

    /* JADX INFO: renamed from: a */
    public static C3383e m15475a(Context context) {
        if (f18476d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f18476d = applicationContext;
            f18475b = C3382d.m15467a(applicationContext);
        }
        return a.f18479a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized SQLiteDatabase m15476a() {
        if (this.f18477a.incrementAndGet() == 1) {
            this.f18478c = f18475b.getWritableDatabase();
        }
        return this.f18478c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m15477b() {
        try {
            if (this.f18477a.decrementAndGet() == 0) {
                this.f18478c.close();
            }
        } catch (Throwable unused) {
        }
    }
}
