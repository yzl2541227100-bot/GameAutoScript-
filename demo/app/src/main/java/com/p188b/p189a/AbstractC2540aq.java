package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.InterfaceC2580g;
import java.util.Objects;

/* JADX INFO: renamed from: com.b.a.aq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2540aq {
    /* JADX INFO: renamed from: a */
    public static AbstractC2540aq m12880a(byte[] bArr) {
        int length = bArr.length;
        Objects.requireNonNull(bArr, "content == null");
        C2446c.m12581a(bArr.length, length);
        return new C2541ar(length, bArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract C2531ah mo12881a();

    /* JADX INFO: renamed from: a */
    public abstract void mo12882a(InterfaceC2580g interfaceC2580g);

    /* JADX INFO: renamed from: b */
    public long mo12883b() {
        return -1L;
    }
}
