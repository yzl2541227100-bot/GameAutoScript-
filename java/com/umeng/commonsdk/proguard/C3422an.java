package com.umeng.commonsdk.proguard;

import java.io.Serializable;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.an */
/* JADX INFO: loaded from: classes2.dex */
public class C3422an implements Serializable {

    /* JADX INFO: renamed from: a */
    private final boolean f18683a;

    /* JADX INFO: renamed from: b */
    public final byte f18684b;

    /* JADX INFO: renamed from: c */
    private final String f18685c;

    /* JADX INFO: renamed from: d */
    private final boolean f18686d;

    public C3422an(byte b) {
        this(b, false);
    }

    public C3422an(byte b, String str) {
        this.f18684b = b;
        this.f18683a = true;
        this.f18685c = str;
        this.f18686d = false;
    }

    public C3422an(byte b, boolean z) {
        this.f18684b = b;
        this.f18683a = false;
        this.f18685c = null;
        this.f18686d = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15775a() {
        return this.f18683a;
    }

    /* JADX INFO: renamed from: b */
    public String m15776b() {
        return this.f18685c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m15777c() {
        return this.f18684b == 12;
    }

    /* JADX INFO: renamed from: d */
    public boolean m15778d() {
        byte b = this.f18684b;
        return b == 15 || b == 13 || b == 14;
    }

    /* JADX INFO: renamed from: e */
    public boolean m15779e() {
        return this.f18686d;
    }
}
