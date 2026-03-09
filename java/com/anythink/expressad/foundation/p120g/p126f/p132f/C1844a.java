package com.anythink.expressad.foundation.p120g.p126f.p132f;

import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1828c;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1847g;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p131e.InterfaceC1841a;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.f.a */
/* JADX INFO: loaded from: classes.dex */
public class C1844a implements InterfaceC1847g {

    /* JADX INFO: renamed from: a */
    private static final String f11375a = "a";

    /* JADX INFO: renamed from: b */
    private static final int f11376b = 3000;

    /* JADX INFO: renamed from: c */
    private InterfaceC1841a f11377c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1828c f11378d;

    public C1844a(InterfaceC1841a interfaceC1841a, InterfaceC1828c interfaceC1828c) {
        this.f11377c = interfaceC1841a;
        this.f11378d = interfaceC1828c;
    }

    /* JADX INFO: renamed from: a */
    private static void m9562a(long j, AbstractC1856i<?> abstractC1856i, byte[] bArr, int i) {
        if (C1404a.f6209a) {
            if (j > C2187m.f13871ag) {
                try {
                    Object[] objArr = new Object[6];
                    objArr[0] = abstractC1856i.m9617d();
                    objArr[1] = Integer.valueOf(abstractC1856i.m9605a());
                    objArr[2] = Long.valueOf(j);
                    objArr[3] = bArr != null ? Integer.valueOf(bArr.length) : "null";
                    objArr[4] = Integer.valueOf(i);
                    objArr[5] = Integer.valueOf(abstractC1856i.m9622l().mo9492c());
                    String.format("Slow HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", objArr);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            try {
                Object[] objArr2 = new Object[6];
                objArr2[0] = abstractC1856i.m9617d();
                objArr2[1] = Integer.valueOf(abstractC1856i.m9605a());
                objArr2[2] = Long.valueOf(j);
                objArr2[3] = bArr != null ? Integer.valueOf(bArr.length) : "null";
                objArr2[4] = Integer.valueOf(i);
                objArr2[5] = Integer.valueOf(abstractC1856i.m9622l().mo9492c());
                String.format("Normal HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", objArr2);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m9563a(AbstractC1856i<?> abstractC1856i, C1824a c1824a) throws C1824a {
        if (!abstractC1856i.m9622l().mo9493d()) {
            throw c1824a;
        }
        this.f11378d.mo9506e(abstractC1856i);
    }

    /* JADX INFO: renamed from: a */
    private static void m9564a(String str, long j, AbstractC1856i<?> abstractC1856i) {
        if (C1404a.f6209a) {
            try {
                Object[] objArr = new Object[4];
                objArr[0] = abstractC1856i.m9617d();
                objArr[1] = Long.valueOf(j);
                if (str == null) {
                    str = "null";
                }
                objArr[2] = str;
                objArr[3] = Integer.valueOf(abstractC1856i.m9622l().mo9492c());
                String.format("HTTP exception for request=<%s> [lifetime=%d], [size=%s], [retryCount=%s]", objArr);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    @Override // com.anythink.expressad.foundation.p120g.p126f.InterfaceC1847g
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c mo9565a(com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i<?> r22) throws com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.p120g.p126f.p132f.C1844a.mo9565a(com.anythink.expressad.foundation.g.f.i):com.anythink.expressad.foundation.g.f.f.c");
    }
}
