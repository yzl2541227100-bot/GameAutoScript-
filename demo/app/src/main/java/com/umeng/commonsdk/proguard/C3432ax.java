package com.umeng.commonsdk.proguard;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ax */
/* JADX INFO: loaded from: classes2.dex */
public final class C3432ax {

    /* JADX INFO: renamed from: a */
    public final String f18748a;

    /* JADX INFO: renamed from: b */
    public final byte f18749b;

    /* JADX INFO: renamed from: c */
    public final int f18750c;

    public C3432ax() {
        this("", (byte) 0, 0);
    }

    public C3432ax(String str, byte b, int i) {
        this.f18748a = str;
        this.f18749b = b;
        this.f18750c = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15848a(C3432ax c3432ax) {
        return this.f18748a.equals(c3432ax.f18748a) && this.f18749b == c3432ax.f18749b && this.f18750c == c3432ax.f18750c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3432ax) {
            return m15848a((C3432ax) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f18748a + "' type: " + ((int) this.f18749b) + " seqid:" + this.f18750c + ">";
    }
}
