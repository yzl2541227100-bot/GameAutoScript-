package com.anythink.expressad.foundation.p120g.p126f.p129c;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.c.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1830b implements Serializable {

    /* JADX INFO: renamed from: a */
    private byte[] f11308a;

    /* JADX INFO: renamed from: b */
    private InputStream f11309b;

    /* JADX INFO: renamed from: c */
    private File f11310c;

    /* JADX INFO: renamed from: d */
    private long f11311d;

    /* JADX INFO: renamed from: e */
    private String f11312e;

    /* JADX INFO: renamed from: f */
    private String f11313f;

    /* JADX INFO: renamed from: g */
    private String f11314g;

    private C1830b(InputStream inputStream, int i, String str, String str2, String str3) {
        this.f11314g = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        this.f11312e = str;
        this.f11313f = str2;
        this.f11309b = inputStream;
        this.f11311d = i;
        this.f11314g = str3;
    }

    public C1830b(String str, File file, String str2, String str3) {
        this.f11314g = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        this.f11312e = str;
        this.f11313f = str2;
        try {
            this.f11309b = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.f11311d = file.length();
        if (str3 != null) {
            this.f11314g = str3;
        }
        this.f11310c = file;
    }

    private C1830b(String str, byte[] bArr, long j, String str2, String str3) {
        this.f11314g = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        this.f11312e = str;
        this.f11313f = str2;
        this.f11308a = bArr;
        this.f11311d = j;
        if (str3 != null) {
            this.f11314g = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9507a(String str) {
        this.f11312e = str;
    }

    /* JADX INFO: renamed from: b */
    private void m9508b(String str) {
        this.f11313f = str;
    }

    /* JADX INFO: renamed from: c */
    private void m9509c(String str) {
        this.f11314g = str;
    }

    /* JADX INFO: renamed from: a */
    public final long m9510a() {
        return this.f11311d;
    }

    /* JADX INFO: renamed from: b */
    public final File m9511b() {
        return this.f11310c;
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m9512c() {
        return this.f11309b;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m9513d() {
        return this.f11308a;
    }

    /* JADX INFO: renamed from: e */
    public final String m9514e() {
        return this.f11312e;
    }

    /* JADX INFO: renamed from: f */
    public final String m9515f() {
        return this.f11313f;
    }

    /* JADX INFO: renamed from: g */
    public final String m9516g() {
        return this.f11314g;
    }
}
