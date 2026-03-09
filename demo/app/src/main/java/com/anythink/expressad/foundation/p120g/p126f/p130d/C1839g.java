package com.anythink.expressad.foundation.p120g.p126f.p130d;

import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.C1858k;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1851d;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.g */
/* JADX INFO: loaded from: classes.dex */
public class C1839g extends AbstractC1856i<String> {

    /* JADX INFO: renamed from: c */
    private static final String f11365c = C1839g.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private String f11366d;

    public C1839g(int i, String str, String str2, InterfaceC1840e<String> interfaceC1840e) {
        super(i, str, interfaceC1840e);
        this.f11366d = str2;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: a */
    public final C1858k<String> mo9519a(C1846c c1846c) {
        try {
            return C1858k.m9635a(new String(c1846c.f11383b, C1851d.m9571a(c1846c.f11385d)), c1846c);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            return C1858k.m9634a(new C1824a(8, c1846c));
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: h */
    public final byte[] mo9542h() {
        try {
            String str = this.f11366d;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
