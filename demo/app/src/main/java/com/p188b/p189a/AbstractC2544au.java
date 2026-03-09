package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2579f;
import com.p188b.p199b.InterfaceC2581h;
import java.io.Closeable;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.a.au */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2544au implements Closeable {
    /* JADX INFO: renamed from: a */
    public static AbstractC2544au m12909a(byte[] bArr) {
        C2579f c2579fMo13009b = new C2579f().mo13009b(bArr);
        long length = bArr.length;
        Objects.requireNonNull(c2579fMo13009b, "source == null");
        return new C2545av(length, c2579fMo13009b);
    }

    /* JADX INFO: renamed from: a */
    public abstract C2531ah mo12617a();

    /* JADX INFO: renamed from: b */
    public abstract long mo12618b();

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC2581h mo12619c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C2446c.m12582a(mo12619c());
    }

    /* JADX INFO: renamed from: d */
    public final String m12910d() {
        InterfaceC2581h interfaceC2581hMo12619c = mo12619c();
        try {
            C2531ah c2531ahMo12617a = mo12617a();
            return interfaceC2581hMo12619c.mo13003a(C2446c.m12577a(interfaceC2581hMo12619c, c2531ahMo12617a != null ? c2531ahMo12617a.m12834a(C2446c.f15179e) : C2446c.f15179e));
        } finally {
            C2446c.m12582a(interfaceC2581hMo12619c);
        }
    }
}
