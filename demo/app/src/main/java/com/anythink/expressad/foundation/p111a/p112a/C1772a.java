package com.anythink.expressad.foundation.p111a.p112a;

import android.content.Context;
import android.content.SharedPreferences;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p120g.C1801a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1772a {

    /* JADX INFO: renamed from: a */
    public static final String f10124a = "a";

    /* JADX INFO: renamed from: c */
    private static volatile C1772a f10125c;

    /* JADX INFO: renamed from: b */
    public SharedPreferences f10126b;

    private C1772a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1772a m8536a() {
        if (f10125c == null) {
            synchronized (C1772a.class) {
                if (f10125c == null) {
                    f10125c = new C1772a();
                }
            }
        }
        return f10125c;
    }

    /* JADX INFO: renamed from: a */
    private void m8537a(String str, int i) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return;
            }
            if (this.f10126b == null && contextM8557e != null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            SharedPreferences.Editor editorEdit = this.f10126b.edit();
            editorEdit.putInt(str, i);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m8538a(String str, long j) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return;
            }
            if (this.f10126b == null && contextM8557e != null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            SharedPreferences.Editor editorEdit = this.f10126b.edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private int m8539b(String str, int i) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return i;
            }
            if (this.f10126b == null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            return this.f10126b.getInt(str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    private List<String> m8540b() {
        ArrayList arrayList = new ArrayList();
        Context contextM8557e = C1773a.m8548c().m8557e();
        if (contextM8557e == null) {
            return null;
        }
        if (this.f10126b == null && contextM8557e != null) {
            this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
        }
        Iterator<Map.Entry<String, ?>> it = this.f10126b.getAll().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private int m8541c(String str) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return 0;
            }
            if (this.f10126b == null && contextM8557e != null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            return this.f10126b.getInt(str, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private Long m8542d(String str) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return 0L;
            }
            if (this.f10126b == null && contextM8557e != null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            return Long.valueOf(this.f10126b.getLong(str, 0L));
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8543a(String str) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return null;
            }
            if (this.f10126b == null && contextM8557e != null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            return this.f10126b.getString(str, "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8544a(String str, String str2) {
        try {
            Context contextM8557e = C1773a.m8548c().m8557e();
            if (contextM8557e == null) {
                return;
            }
            if (this.f10126b == null && contextM8557e != null) {
                this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
            }
            SharedPreferences.Editor editorEdit = this.f10126b.edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8545b(String str) {
        Context contextM8557e = C1773a.m8548c().m8557e();
        if (contextM8557e == null) {
            return;
        }
        if (this.f10126b == null && contextM8557e != null) {
            this.f10126b = contextM8557e.getSharedPreferences(C1801a.f11149o, 0);
        }
        this.f10126b.edit().remove(str).apply();
    }
}
