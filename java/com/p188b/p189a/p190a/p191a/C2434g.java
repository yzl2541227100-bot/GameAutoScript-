package com.p188b.p189a.p190a.p191a;

/* JADX INFO: renamed from: com.b.a.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2434g {

    /* JADX INFO: renamed from: a */
    public final C2435h f15122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2433f f15123b;

    /* JADX INFO: renamed from: c */
    private boolean f15124c;

    /* JADX INFO: renamed from: a */
    public final void m12524a() {
        synchronized (this.f15123b) {
            if (this.f15124c) {
                throw new IllegalStateException();
            }
            if (this.f15122a.f15130f == this) {
                this.f15123b.m12523a(this);
            }
            this.f15124c = true;
        }
    }
}
