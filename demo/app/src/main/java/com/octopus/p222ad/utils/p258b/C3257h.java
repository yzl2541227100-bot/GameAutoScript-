package com.octopus.p222ad.utils.p258b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.octopus.ad.utils.b.h */
/* JADX INFO: loaded from: classes2.dex */
public class C3257h {

    /* JADX INFO: renamed from: a */
    private static final AtomicBoolean f17892a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    private static volatile C3257h f17893b;

    /* JADX INFO: renamed from: c */
    private static volatile ThreadPoolExecutor f17894c;

    /* JADX INFO: renamed from: d */
    private static volatile ThreadPoolExecutor f17895d;

    /* JADX INFO: renamed from: e */
    private static volatile ThreadPoolExecutor f17896e;

    /* JADX INFO: renamed from: f */
    private static volatile ThreadPoolExecutor f17897f;

    private C3257h() {
        if (f17892a.get()) {
            return;
        }
        m14987a();
    }

    /* JADX INFO: renamed from: a */
    public static void m14987a() {
        AtomicBoolean atomicBoolean = f17892a;
        if (atomicBoolean.get()) {
            return;
        }
        f17894c = C3259j.m14992a();
        f17895d = C3259j.m14993b();
        f17896e = C3259j.m14994c();
        f17897f = C3259j.m14995d();
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: b */
    public static C3257h m14988b() {
        if (f17893b == null) {
            synchronized (C3257h.class) {
                if (f17893b == null) {
                    f17893b = new C3257h();
                }
            }
        }
        return f17893b;
    }

    /* JADX INFO: renamed from: c */
    public ExecutorService m14989c() {
        if (f17894c == null) {
            f17894c = C3259j.m14992a();
        }
        return f17894c;
    }

    /* JADX INFO: renamed from: d */
    public ExecutorService m14990d() {
        if (f17896e == null) {
            f17896e = C3259j.m14994c();
        }
        return f17896e;
    }

    /* JADX INFO: renamed from: e */
    public ExecutorService m14991e() {
        if (f17897f == null) {
            f17897f = C3259j.m14995d();
        }
        return f17897f;
    }
}
