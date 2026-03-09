package com.anythink.expressad.exoplayer.p094e;

import com.anythink.expressad.exoplayer.p094e.p095a.C1554e;
import com.anythink.expressad.exoplayer.p094e.p095a.C1556g;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1564c implements InterfaceC1569h {

    /* JADX INFO: renamed from: a */
    private static final Constructor<? extends InterfaceC1566e> f8370a;

    /* JADX INFO: renamed from: b */
    private int f8371b;

    /* JADX INFO: renamed from: c */
    private int f8372c;

    static {
        Constructor<? extends InterfaceC1566e> constructor;
        try {
            constructor = Class.forName("com.anythink.expressad.exoplayer.ext.flac.FlacExtractor").asSubclass(InterfaceC1566e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f8370a = constructor;
    }

    /* JADX INFO: renamed from: a */
    private synchronized C1564c m6979a(int i) {
        this.f8371b = i;
        return this;
    }

    /* JADX INFO: renamed from: b */
    private synchronized C1564c m6980b(int i) {
        this.f8372c = i;
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.p094e.InterfaceC1569h
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC1566e[] mo6901a() {
        InterfaceC1566e[] interfaceC1566eArr;
        Constructor<? extends InterfaceC1566e> constructor = f8370a;
        interfaceC1566eArr = new InterfaceC1566e[constructor == null ? 2 : 3];
        interfaceC1566eArr[0] = new C1554e(this.f8372c);
        interfaceC1566eArr[1] = new C1556g(this.f8371b);
        if (constructor != null) {
            try {
                interfaceC1566eArr[2] = constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return interfaceC1566eArr;
    }
}
