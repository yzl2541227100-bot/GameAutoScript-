package com.umeng.commonsdk.proguard;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.au */
/* JADX INFO: loaded from: classes2.dex */
public class C3429au {

    /* JADX INFO: renamed from: a */
    public final String f18740a;

    /* JADX INFO: renamed from: b */
    public final byte f18741b;

    /* JADX INFO: renamed from: c */
    public final short f18742c;

    public C3429au() {
        this("", (byte) 0, (short) 0);
    }

    public C3429au(String str, byte b, short s) {
        this.f18740a = str;
        this.f18741b = b;
        this.f18742c = s;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15847a(C3429au c3429au) {
        return this.f18741b == c3429au.f18741b && this.f18742c == c3429au.f18742c;
    }

    public String toString() {
        return "<TField name:'" + this.f18740a + "' type:" + ((int) this.f18741b) + " field-id:" + ((int) this.f18742c) + ">";
    }
}
