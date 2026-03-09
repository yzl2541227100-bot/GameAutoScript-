package com.anythink.expressad.p073a;

/* JADX INFO: renamed from: com.anythink.expressad.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C1412d {

    /* JADX INFO: renamed from: b */
    public static final int f6333b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f6334c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f6335d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f6336e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f6337f = 16;

    /* JADX INFO: renamed from: g */
    public static final int f6338g = 32;

    /* JADX INFO: renamed from: a */
    private int f6339a = 1;

    /* JADX INFO: renamed from: h */
    public InterfaceC1413e f6340h;

    /* JADX INFO: renamed from: a */
    private int m5296a() {
        return this.f6339a;
    }

    /* JADX INFO: renamed from: a */
    private void m5297a(int i) {
        this.f6339a = i;
    }

    /* JADX INFO: renamed from: a */
    private void m5298a(InterfaceC1413e interfaceC1413e) {
        this.f6340h = interfaceC1413e;
    }

    /* JADX INFO: renamed from: c */
    private boolean m5299c() {
        int i = this.f6339a;
        return i == 8 || i == 16;
    }

    /* JADX INFO: renamed from: d */
    private boolean m5300d() {
        return this.f6339a == 2;
    }

    /* JADX INFO: renamed from: e */
    private boolean m5301e() {
        return this.f6339a == 32;
    }

    /* JADX INFO: renamed from: f */
    private boolean m5302f() {
        return this.f6339a == 4;
    }

    /* JADX INFO: renamed from: b */
    public void mo5267b() {
        this.f6339a = 8;
    }
}
