package com.anythink.expressad.exoplayer.p101h;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.AbstractC1499ae;
import com.anythink.expressad.exoplayer.InterfaceC1610h;
import com.anythink.expressad.exoplayer.p101h.InterfaceC1650s;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1685b;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1653v extends AbstractC1637f<Integer> {

    /* JADX INFO: renamed from: a */
    private static final int f9071a = -1;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1650s[] f9072b;

    /* JADX INFO: renamed from: c */
    private final ArrayList<InterfaceC1650s> f9073c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1639h f9074d;

    /* JADX INFO: renamed from: e */
    private AbstractC1499ae f9075e;

    /* JADX INFO: renamed from: f */
    private Object f9076f;

    /* JADX INFO: renamed from: g */
    private int f9077g;

    /* JADX INFO: renamed from: h */
    private a f9078h;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.v$a */
    public static final class a extends IOException {

        /* JADX INFO: renamed from: a */
        public static final int f9079a = 0;

        /* JADX INFO: renamed from: b */
        public final int f9080b = 0;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.v$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC4677a {
        }
    }

    private C1653v(InterfaceC1639h interfaceC1639h, InterfaceC1650s... interfaceC1650sArr) {
        this.f9072b = interfaceC1650sArr;
        this.f9074d = interfaceC1639h;
        this.f9073c = new ArrayList<>(Arrays.asList(interfaceC1650sArr));
        this.f9077g = -1;
    }

    private C1653v(InterfaceC1650s... interfaceC1650sArr) {
        this(new C1641j(), interfaceC1650sArr);
    }

    /* JADX INFO: renamed from: a */
    private a m7490a(AbstractC1499ae abstractC1499ae) {
        int i = this.f9077g;
        int iMo6370c = abstractC1499ae.mo6370c();
        if (i == -1) {
            this.f9077g = iMo6370c;
            return null;
        }
        if (iMo6370c != this.f9077g) {
            return new a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m7491a(InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        if (this.f9078h == null) {
            if (this.f9077g == -1) {
                this.f9077g = abstractC1499ae.mo6370c();
            } else {
                a aVar = abstractC1499ae.mo6370c() != this.f9077g ? new a() : null;
                this.f9078h = aVar;
            }
            this.f9078h = aVar;
        }
        if (this.f9078h != null) {
            return;
        }
        this.f9073c.remove(interfaceC1650s);
        if (interfaceC1650s == this.f9072b[0]) {
            this.f9075e = abstractC1499ae;
            this.f9076f = obj;
        }
        if (this.f9073c.isEmpty()) {
            m7355a(this.f9075e, this.f9076f);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final InterfaceC1649r mo7225a(InterfaceC1650s.a aVar, InterfaceC1685b interfaceC1685b) {
        int length = this.f9072b.length;
        InterfaceC1649r[] interfaceC1649rArr = new InterfaceC1649r[length];
        for (int i = 0; i < length; i++) {
            interfaceC1649rArr[i] = this.f9072b[i].mo7225a(aVar, interfaceC1685b);
        }
        return new C1652u(this.f9074d, interfaceC1649rArr);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7227a() {
        super.mo7227a();
        this.f9075e = null;
        this.f9076f = null;
        this.f9077g = -1;
        this.f9078h = null;
        this.f9073c.clear();
        Collections.addAll(this.f9073c, this.f9072b);
    }

    @Override // com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: a */
    public final void mo7228a(InterfaceC1649r interfaceC1649r) {
        C1652u c1652u = (C1652u) interfaceC1649r;
        int i = 0;
        while (true) {
            InterfaceC1650s[] interfaceC1650sArr = this.f9072b;
            if (i >= interfaceC1650sArr.length) {
                return;
            }
            interfaceC1650sArr[i].mo7228a(c1652u.f9063a[i]);
            i++;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.AbstractC1634c
    /* JADX INFO: renamed from: a */
    public final void mo7229a(InterfaceC1610h interfaceC1610h, boolean z) {
        super.mo7229a(interfaceC1610h, z);
        for (int i = 0; i < this.f9072b.length; i++) {
            m7374a(Integer.valueOf(i), this.f9072b[i]);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo7230a(Integer num, InterfaceC1650s interfaceC1650s, AbstractC1499ae abstractC1499ae, @Nullable Object obj) {
        if (this.f9078h == null) {
            if (this.f9077g == -1) {
                this.f9077g = abstractC1499ae.mo6370c();
            } else {
                a aVar = abstractC1499ae.mo6370c() != this.f9077g ? new a() : null;
                this.f9078h = aVar;
            }
            this.f9078h = aVar;
        }
        if (this.f9078h == null) {
            this.f9073c.remove(interfaceC1650s);
            if (interfaceC1650s == this.f9072b[0]) {
                this.f9075e = abstractC1499ae;
                this.f9076f = obj;
            }
            if (this.f9073c.isEmpty()) {
                m7355a(this.f9075e, this.f9076f);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.p101h.AbstractC1637f, com.anythink.expressad.exoplayer.p101h.InterfaceC1650s
    /* JADX INFO: renamed from: b */
    public final void mo7286b() throws a {
        a aVar = this.f9078h;
        if (aVar != null) {
            throw aVar;
        }
        super.mo7286b();
    }
}
