package com.anythink.expressad.p084b;

import com.anythink.core.common.p066o.p068b.AbstractRunnableC1337d;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.res.image.AbstractC1383b;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1478b extends AbstractC1383b {

    /* JADX INFO: renamed from: a */
    public String f6812a;

    private C1478b(String str, String str2) {
        super(str);
        this.f6812a = str2;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final Map<String, String> mo210a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo211a(AbstractRunnableC1337d abstractRunnableC1337d) {
        C1335b.m3998a().m4004a(abstractRunnableC1337d, 2);
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final void mo212a(String str, String str2) {
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: a */
    public final boolean mo213a(InputStream inputStream) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f6812a);
            byte[] bArr = new byte[2048];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: b */
    public final void mo214b() {
    }

    @Override // com.anythink.core.common.res.image.AbstractC1383b
    /* JADX INFO: renamed from: c */
    public final void mo215c() {
    }
}
