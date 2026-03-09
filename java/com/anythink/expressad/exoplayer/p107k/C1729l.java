package com.anythink.expressad.exoplayer.p107k;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.k.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1729l {

    /* JADX INFO: renamed from: a */
    private String[] f9687a;

    /* JADX INFO: renamed from: b */
    private boolean f9688b;

    /* JADX INFO: renamed from: c */
    private boolean f9689c;

    private C1729l(String... strArr) {
        this.f9687a = strArr;
    }

    /* JADX INFO: renamed from: a */
    private void m8194a(String... strArr) {
        C1711a.m8013b(!this.f9688b, "Cannot set libraries after loading");
        this.f9687a = strArr;
    }

    /* JADX INFO: renamed from: a */
    private boolean m8195a() {
        if (this.f9688b) {
            return this.f9689c;
        }
        this.f9688b = true;
        try {
            for (String str : this.f9687a) {
                System.loadLibrary(str);
            }
            this.f9689c = true;
        } catch (UnsatisfiedLinkError unused) {
        }
        return this.f9689c;
    }
}
