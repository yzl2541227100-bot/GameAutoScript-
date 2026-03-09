package com.anythink.core.common;

import android.text.TextUtils;
import com.anythink.core.common.p066o.p068b.C1335b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.core.common.b */
/* JADX INFO: loaded from: classes.dex */
public class C1161b {

    /* JADX INFO: renamed from: a */
    public static final String f2980a = "1";

    /* JADX INFO: renamed from: c */
    private static volatile C1161b f2981c;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, List<a>> f2982b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.anythink.core.common.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo690a(Object obj);
    }

    private C1161b() {
    }

    /* JADX INFO: renamed from: a */
    public static C1161b m2009a() {
        if (f2981c == null) {
            synchronized (C1161b.class) {
                if (f2981c == null) {
                    f2981c = new C1161b();
                }
            }
        }
        return f2981c;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2010a(final String str, final a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (C1161b.this) {
                        List<a> arrayList = C1161b.this.f2982b.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            C1161b.this.f2982b.put(str, arrayList);
                        }
                        arrayList.add(aVar);
                    }
                }
            }, 2, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2011a(final String str, final Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.b.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1161b.this) {
                    List<a> list = C1161b.this.f2982b.get(str);
                    if (list == null) {
                        return;
                    }
                    for (a aVar : list) {
                        if (aVar != null) {
                            aVar.mo690a(obj);
                        }
                    }
                }
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2012b(final String str, final a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            C1335b.m3998a().m4007a(new Runnable() { // from class: com.anythink.core.common.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (C1161b.this) {
                        List<a> list = C1161b.this.f2982b.get(str);
                        if (list != null) {
                            list.remove(aVar);
                        }
                    }
                }
            }, 2, true);
        }
    }
}
