package com.umeng.commonsdk.proguard;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.bl */
/* JADX INFO: loaded from: classes2.dex */
public class C3447bl extends AbstractC3449bn {

    /* JADX INFO: renamed from: a */
    public InputStream f18785a;

    /* JADX INFO: renamed from: b */
    public OutputStream f18786b;

    public C3447bl() {
        this.f18785a = null;
        this.f18786b = null;
    }

    public C3447bl(InputStream inputStream) {
        this.f18785a = null;
        this.f18786b = null;
        this.f18785a = inputStream;
    }

    public C3447bl(InputStream inputStream, OutputStream outputStream) {
        this.f18785a = null;
        this.f18786b = null;
        this.f18785a = inputStream;
        this.f18786b = outputStream;
    }

    public C3447bl(OutputStream outputStream) {
        this.f18785a = null;
        this.f18786b = null;
        this.f18786b = outputStream;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: a */
    public int mo15862a(byte[] bArr, int i, int i2) throws C3450bo {
        InputStream inputStream = this.f18785a;
        if (inputStream == null) {
            throw new C3450bo(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new C3450bo(4);
        } catch (IOException e) {
            throw new C3450bo(0, e);
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: a */
    public boolean mo15863a() {
        return true;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: b */
    public void mo15864b() throws C3450bo {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: b */
    public void mo15865b(byte[] bArr, int i, int i2) throws C3450bo {
        OutputStream outputStream = this.f18786b;
        if (outputStream == null) {
            throw new C3450bo(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C3450bo(0, e);
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: c */
    public void mo15866c() {
        InputStream inputStream = this.f18785a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f18785a = null;
        }
        OutputStream outputStream = this.f18786b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.f18786b = null;
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3449bn
    /* JADX INFO: renamed from: d */
    public void mo15867d() throws C3450bo {
        OutputStream outputStream = this.f18786b;
        if (outputStream == null) {
            throw new C3450bo(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new C3450bo(0, e);
        }
    }
}
