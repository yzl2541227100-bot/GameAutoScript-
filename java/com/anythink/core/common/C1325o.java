package com.anythink.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1340d;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.anythink.core.common.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1325o {

    /* JADX INFO: renamed from: b */
    public static final String f5119b = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";

    /* JADX INFO: renamed from: c */
    public static final String f5120c = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";

    /* JADX INFO: renamed from: d */
    public static final String f5121d = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";

    /* JADX INFO: renamed from: e */
    public static final String f5122e = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";

    /* JADX INFO: renamed from: f */
    private static final String f5123f = "code";

    /* JADX INFO: renamed from: g */
    private static final String f5124g = "packageName";

    /* JADX INFO: renamed from: j */
    private static volatile String f5125j;

    /* JADX INFO: renamed from: n */
    private static volatile C1325o f5126n;

    /* JADX INFO: renamed from: a */
    public BroadcastReceiver f5127a;

    /* JADX INFO: renamed from: h */
    private CopyOnWriteArrayList<AbstractC1247l> f5128h = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f5129i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private volatile Boolean f5130k;

    /* JADX INFO: renamed from: l */
    private AbstractC1247l f5131l;

    /* JADX INFO: renamed from: m */
    private Context f5132m;

    /* JADX INFO: renamed from: com.anythink.core.common.o$1 */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        /* JADX INFO: renamed from: a */
        private AbstractC1247l m3953a(String str) {
            if (C1325o.this.f5131l != null && TextUtils.equals(C1325o.this.f5131l.m3167F(), str)) {
                return C1325o.this.f5131l;
            }
            if (C1325o.this.f5128h == null || C1325o.this.f5128h.size() <= 0) {
                return null;
            }
            for (AbstractC1247l abstractC1247l : C1325o.this.f5128h) {
                if (abstractC1247l != null && TextUtils.equals(abstractC1247l.m3167F(), str)) {
                    return abstractC1247l;
                }
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            AbstractC1247l abstractC1247l;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(C1340d.m4030b(C1325o.f5119b)) || action.equals(C1340d.m4030b(C1325o.f5120c)) || !action.equals(C1340d.m4030b(C1325o.f5121d)) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i = extras.getInt("code", -1);
            String string = extras.getString(C1325o.f5124g, "");
            if (i == -1 || TextUtils.isEmpty(string)) {
                return;
            }
            if (C1325o.this.f5131l != null && TextUtils.equals(C1325o.this.f5131l.m3167F(), string)) {
                abstractC1247l = C1325o.this.f5131l;
            } else if (C1325o.this.f5128h == null || C1325o.this.f5128h.size() <= 0) {
                abstractC1247l = null;
            } else {
                for (AbstractC1247l abstractC1247l2 : C1325o.this.f5128h) {
                    if (abstractC1247l2 != null && TextUtils.equals(abstractC1247l2.m3167F(), string)) {
                        abstractC1247l = abstractC1247l2;
                        break;
                    }
                }
                abstractC1247l = null;
            }
            if (abstractC1247l == null) {
                return;
            }
            if (i == 4) {
                C1325o.this.m3951b(abstractC1247l);
            }
            C1322e.m3914a(abstractC1247l.m3217n(), abstractC1247l.m3229t(), "", i, "", 0L, 0L);
        }
    }

    private C1325o() {
    }

    /* JADX INFO: renamed from: a */
    public static C1325o m3942a() {
        if (f5126n == null) {
            synchronized (C1325o.class) {
                if (f5126n == null) {
                    f5126n = new C1325o();
                }
            }
        }
        return f5126n;
    }

    /* JADX INFO: renamed from: b */
    public static String m3943b() {
        try {
            return f5125j == null ? "" : String.format("[%s]", f5125j);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3945b(Context context) {
        BroadcastReceiver broadcastReceiver = this.f5127a;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.f5131l = null;
        this.f5128h.clear();
        this.f5128h = null;
        this.f5127a = null;
        this.f5132m = null;
    }

    /* JADX INFO: renamed from: d */
    private AbstractC1247l m3946d() {
        return this.f5131l;
    }

    /* JADX INFO: renamed from: e */
    private void m3947e() {
        if (this.f5130k == null || !this.f5130k.booleanValue() || this.f5132m == null) {
            return;
        }
        try {
            this.f5127a = new AnonymousClass1();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(C1340d.m4030b(f5119b));
            intentFilter.addAction(C1340d.m4030b(f5120c));
            intentFilter.addAction(C1340d.m4030b(f5121d));
            this.f5132m.registerReceiver(this.f5127a, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private static Boolean m3948f() {
        Cursor cursorQuery;
        Context contextM2148f = C1175n.m2059a().m2148f();
        Boolean boolValueOf = null;
        if (contextM2148f != null && contextM2148f.getContentResolver() != null) {
            try {
                cursorQuery = contextM2148f.getContentResolver().query(Uri.parse(C1340d.m4030b(f5122e)), null, null, null, null);
            } catch (Throwable unused) {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        f5125j = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    cursorQuery.close();
                } catch (Throwable unused4) {
                }
            }
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: a */
    public final void m3949a(Context context) {
        this.f5132m = context;
        if (this.f5129i.compareAndSet(false, true)) {
            try {
                this.f5130k = m3948f();
                if (this.f5130k == null || !this.f5130k.booleanValue() || this.f5132m == null) {
                    return;
                }
                this.f5127a = new AnonymousClass1();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(C1340d.m4030b(f5119b));
                intentFilter.addAction(C1340d.m4030b(f5120c));
                intentFilter.addAction(C1340d.m4030b(f5121d));
                this.f5132m.registerReceiver(this.f5127a, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3950a(AbstractC1247l abstractC1247l) {
        if (this.f5130k == null || abstractC1247l == null || !this.f5130k.booleanValue()) {
            return;
        }
        this.f5131l = abstractC1247l;
        this.f5128h.add(abstractC1247l);
    }

    /* JADX INFO: renamed from: b */
    public final void m3951b(AbstractC1247l abstractC1247l) {
        if (this.f5130k == null || abstractC1247l == null || !this.f5130k.booleanValue()) {
            return;
        }
        this.f5131l = null;
        try {
            this.f5128h.remove(abstractC1247l);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3952c() {
        if (this.f5130k != null) {
            return this.f5130k.booleanValue() ? 1 : 0;
        }
        return -1;
    }
}
