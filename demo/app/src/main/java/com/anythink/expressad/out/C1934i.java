package com.anythink.expressad.out;

import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p138h.C1877k;

/* JADX INFO: renamed from: com.anythink.expressad.out.i */
/* JADX INFO: loaded from: classes.dex */
public class C1934i {

    /* JADX INFO: renamed from: a */
    public static final int f11915a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f11916b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f11917c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f11918d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f11919e = 5;

    /* JADX INFO: renamed from: f */
    private int f11920f;

    /* JADX INFO: renamed from: g */
    private int f11921g;

    public C1934i(int i, int i2) {
        if (i == 1) {
            this.f11920f = 90;
            this.f11921g = 320;
            return;
        }
        if (i == 2) {
            this.f11920f = 250;
            this.f11921g = 300;
            return;
        }
        if (i == 3) {
            if (C1877k.m9705f(C1175n.m2059a().m2148f()) < 720) {
                this.f11920f = 50;
                this.f11921g = 320;
                return;
            } else {
                this.f11920f = 90;
                this.f11921g = 728;
                return;
            }
        }
        if (i == 4) {
            this.f11920f = 50;
            this.f11921g = 320;
        } else {
            if (i != 5) {
                return;
            }
            this.f11920f = i2;
            this.f11921g = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10120c() {
        int i;
        if (C1877k.m9705f(C1175n.m2059a().m2148f()) < 720) {
            this.f11920f = 50;
            i = 320;
        } else {
            this.f11920f = 90;
            i = 728;
        }
        this.f11921g = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m10121a() {
        return this.f11920f;
    }

    /* JADX INFO: renamed from: b */
    public final int m10122b() {
        return this.f11921g;
    }
}
