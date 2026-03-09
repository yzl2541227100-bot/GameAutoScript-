package com.anythink.expressad.exoplayer.p105j;

import android.net.Uri;
import android.util.Base64;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.C1763t;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1689f implements InterfaceC1691h {

    /* JADX INFO: renamed from: a */
    public static final String f9381a = "data";

    /* JADX INFO: renamed from: b */
    private C1694k f9382b;

    /* JADX INFO: renamed from: c */
    private int f9383c;

    /* JADX INFO: renamed from: d */
    private byte[] f9384d;

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final int mo7741a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.f9384d.length - this.f9383c;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i2, length);
        System.arraycopy(this.f9384d, this.f9383c, bArr, i, iMin);
        this.f9383c += iMin;
        return iMin;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final long mo7742a(C1694k c1694k) throws C1763t {
        this.f9382b = c1694k;
        Uri uri = c1694k.f9395c;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new C1763t("Unsupported scheme: ".concat(String.valueOf(scheme)));
        }
        String[] strArrM8091a = C1717af.m8091a(uri.getSchemeSpecificPart(), ",");
        if (strArrM8091a.length != 2) {
            throw new C1763t("Unexpected URI format: ".concat(String.valueOf(uri)));
        }
        String str = strArrM8091a[1];
        if (strArrM8091a[0].contains(";base64")) {
            try {
                this.f9384d = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new C1763t("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f9384d = URLDecoder.decode(str, C1500b.f7493i).getBytes();
        }
        return this.f9384d.length;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: a */
    public final Uri mo7743a() {
        C1694k c1694k = this.f9382b;
        if (c1694k != null) {
            return c1694k.f9395c;
        }
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1691h
    /* JADX INFO: renamed from: b */
    public final void mo7744b() {
        this.f9382b = null;
        this.f9384d = null;
    }
}
