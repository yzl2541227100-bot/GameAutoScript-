package com.anythink.expressad.out;

import com.anythink.expressad.p089e.C1490a;

/* JADX INFO: renamed from: com.anythink.expressad.out.g */
/* JADX INFO: loaded from: classes.dex */
public class C1932g {

    /* JADX INFO: renamed from: a */
    private static C1490a f11914a;

    private C1932g() {
    }

    /* JADX INFO: renamed from: a */
    public static C1490a m10119a() {
        if (f11914a == null) {
            synchronized (C1932g.class) {
                if (f11914a == null) {
                    f11914a = new C1490a();
                }
            }
        }
        return f11914a;
    }
}
