package com.tramini.plugin.p261a.p269h.p270a;

/* JADX INFO: renamed from: com.tramini.plugin.a.h.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3352a implements CharSequence {

    /* JADX INFO: renamed from: a */
    public CharSequence f18201a;

    public C3352a(CharSequence charSequence) {
        this.f18201a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (Thread.currentThread().isInterrupted()) {
            throw new RuntimeException("Interrupted!");
        }
        return this.f18201a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f18201a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C3352a(this.f18201a.subSequence(i, i2));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f18201a.toString();
    }
}
