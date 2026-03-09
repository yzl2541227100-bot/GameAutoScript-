package com.anythink.expressad.foundation.p120g.p126f.p130d;

import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1837e<T> extends AbstractC1856i<T> {

    /* JADX INFO: renamed from: c */
    private static final String f11359c = AbstractC1837e.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private final String f11360d;

    public AbstractC1837e(int i, String str, String str2, InterfaceC1840e<T> interfaceC1840e) {
        super(i, str, interfaceC1840e);
        this.f11360d = str2;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: h */
    public final byte[] mo9542h() {
        try {
            String str = this.f11360d;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
