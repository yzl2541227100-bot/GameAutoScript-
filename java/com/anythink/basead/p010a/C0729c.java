package com.anythink.basead.p010a;

import com.anythink.basead.p015c.C0746d;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.basead.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0729c {

    /* JADX INFO: renamed from: a */
    public static final String f557a = "c";

    /* JADX INFO: renamed from: c */
    private static volatile C0729c f558c;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, C0746d> f559b = new ConcurrentHashMap<>();

    private C0729c() {
    }

    /* JADX INFO: renamed from: a */
    public static C0729c m232a() {
        if (f558c == null) {
            synchronized (C0729c.class) {
                if (f558c == null) {
                    f558c = new C0729c();
                }
            }
        }
        return f558c;
    }

    /* JADX INFO: renamed from: a */
    public final C0746d m233a(int i, String str) {
        return this.f559b.get(i + str);
    }

    /* JADX INFO: renamed from: a */
    public final void m234a(int i, String str, C0746d c0746d) {
        this.f559b.put(i + str, c0746d);
    }
}
