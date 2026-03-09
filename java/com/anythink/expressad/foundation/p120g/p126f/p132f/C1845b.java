package com.anythink.expressad.foundation.p120g.p126f.p132f;

import com.anythink.expressad.foundation.p120g.p126f.p129c.C1831c;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1845b {

    /* JADX INFO: renamed from: a */
    private final int f11379a;

    /* JADX INFO: renamed from: b */
    private final List<C1831c> f11380b;

    /* JADX INFO: renamed from: c */
    private final InputStream f11381c;

    public C1845b(int i, List<C1831c> list) {
        this(i, list, null);
    }

    public C1845b(int i, List<C1831c> list, InputStream inputStream) {
        this.f11379a = i;
        this.f11380b = list;
        this.f11381c = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final int m9566a() {
        return this.f11379a;
    }

    /* JADX INFO: renamed from: b */
    public final List<C1831c> m9567b() {
        return Collections.unmodifiableList(this.f11380b);
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m9568c() {
        return this.f11381c;
    }
}
