package com.anythink.expressad.exoplayer;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1767x;
import com.anythink.expressad.exoplayer.InterfaceC1766w;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1610h extends InterfaceC1766w {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final int f8625a = 1;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f8626b = 2;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f8627c = 3;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f8628d = 4;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public static final int f8629e = 0;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final int f8630f = 1;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final int f8631g = 2;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h$a */
    @Deprecated
    public interface a extends InterfaceC1766w.c {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h$b */
    @Deprecated
    public interface b extends C1767x.b {
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h$c */
    @Deprecated
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final C1767x.b f8632a;

        /* JADX INFO: renamed from: b */
        public final int f8633b;

        /* JADX INFO: renamed from: c */
        public final Object f8634c;

        @Deprecated
        private c(C1767x.b bVar, int i, Object obj) {
            this.f8632a = bVar;
            this.f8633b = i;
            this.f8634c = obj;
        }
    }

    /* JADX INFO: renamed from: a */
    Looper mo6299a();

    /* JADX INFO: renamed from: a */
    C1767x mo6300a(C1767x.b bVar);

    /* JADX INFO: renamed from: a */
    void mo6309a(@Nullable C1497ac c1497ac);

    /* JADX INFO: renamed from: a */
    void mo6310a(InterfaceC1650s interfaceC1650s);

    /* JADX INFO: renamed from: a */
    void mo6311a(InterfaceC1650s interfaceC1650s, boolean z, boolean z3);

    @Deprecated
    /* JADX INFO: renamed from: a */
    void mo6316a(c... cVarArr);

    @Deprecated
    /* JADX INFO: renamed from: b */
    void mo6326b(c... cVarArr);
}
