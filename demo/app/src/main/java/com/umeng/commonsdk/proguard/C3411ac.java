package com.umeng.commonsdk.proguard;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ac */
/* JADX INFO: loaded from: classes2.dex */
public class C3411ac extends ByteArrayOutputStream {
    public C3411ac() {
    }

    public C3411ac(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m15720a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    /* JADX INFO: renamed from: b */
    public int m15721b() {
        return ((ByteArrayOutputStream) this).count;
    }
}
