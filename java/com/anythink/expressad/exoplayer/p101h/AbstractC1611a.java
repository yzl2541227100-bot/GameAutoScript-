package com.anythink.expressad.exoplayer.p101h;

import android.util.Pair;
import com.anythink.expressad.exoplayer.AbstractC1499ae;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.h.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1611a extends AbstractC1499ae {

    /* JADX INFO: renamed from: b */
    private final int f8635b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1616aa f8636c;

    /* JADX INFO: renamed from: d */
    private final boolean f8637d;

    public AbstractC1611a(boolean z, InterfaceC1616aa interfaceC1616aa) {
        this.f8637d = z;
        this.f8636c = interfaceC1616aa;
        this.f8635b = interfaceC1616aa.mo7247a();
    }

    /* JADX INFO: renamed from: a */
    private int m7174a(int i, boolean z) {
        if (z) {
            return this.f8636c.mo7248a(i);
        }
        if (i < this.f8635b - 1) {
            return i + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private int m7175b(int i, boolean z) {
        if (z) {
            return this.f8636c.mo7251b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo7176a(int i);

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final int mo6356a(int i, int i2, boolean z) {
        if (this.f8637d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo7177b = mo7177b(i);
        int iMo7181e = mo7181e(iMo7177b);
        int iMo6356a = mo7179c(iMo7177b).mo6356a(i - iMo7181e, i2 != 2 ? i2 : 0, z);
        if (iMo6356a != -1) {
            return iMo7181e + iMo6356a;
        }
        int iM7174a = m7174a(iMo7177b, z);
        while (iM7174a != -1 && mo7179c(iM7174a).m6365a()) {
            iM7174a = m7174a(iM7174a, z);
        }
        if (iM7174a != -1) {
            return mo7181e(iM7174a) + mo7179c(iM7174a).mo6368b(z);
        }
        if (i2 == 2) {
            return mo6368b(z);
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final int mo6358a(Object obj) {
        int iMo6358a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo7178b = mo7178b(obj2);
        if (iMo7178b == -1 || (iMo6358a = mo7179c(iMo7178b).mo6358a(obj3)) == -1) {
            return -1;
        }
        return mo7180d(iMo7178b) + iMo6358a;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final int mo6359a(boolean z) {
        int i = this.f8635b;
        if (i == 0) {
            return -1;
        }
        if (this.f8637d) {
            z = false;
        }
        int iMo7250b = z ? this.f8636c.mo7250b() : i - 1;
        while (mo7179c(iMo7250b).m6365a()) {
            iMo7250b = m7175b(iMo7250b, z);
            if (iMo7250b == -1) {
                return -1;
            }
        }
        return mo7181e(iMo7250b) + mo7179c(iMo7250b).mo6359a(z);
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae.a mo6362a(int i, AbstractC1499ae.a aVar, boolean z) {
        int iMo7176a = mo7176a(i);
        int iMo7181e = mo7181e(iMo7176a);
        mo7179c(iMo7176a).mo6362a(i - mo7180d(iMo7176a), aVar, z);
        aVar.f7362c += iMo7181e;
        if (z) {
            aVar.f7361b = Pair.create(mo7182f(iMo7176a), aVar.f7361b);
        }
        return aVar;
    }

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: a */
    public final AbstractC1499ae.b mo6364a(int i, AbstractC1499ae.b bVar, boolean z, long j) {
        int iMo7177b = mo7177b(i);
        int iMo7181e = mo7181e(iMo7177b);
        int iMo7180d = mo7180d(iMo7177b);
        mo7179c(iMo7177b).mo6364a(i - iMo7181e, bVar, z, j);
        bVar.f7371f += iMo7180d;
        bVar.f7372g += iMo7180d;
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo7177b(int i);

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: b */
    public final int mo6367b(int i, int i2, boolean z) {
        if (this.f8637d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iMo7177b = mo7177b(i);
        int iMo7181e = mo7181e(iMo7177b);
        int iMo6367b = mo7179c(iMo7177b).mo6367b(i - iMo7181e, i2 != 2 ? i2 : 0, z);
        if (iMo6367b != -1) {
            return iMo7181e + iMo6367b;
        }
        int iM7175b = m7175b(iMo7177b, z);
        while (iM7175b != -1 && mo7179c(iM7175b).m6365a()) {
            iM7175b = m7175b(iM7175b, z);
        }
        if (iM7175b != -1) {
            return mo7181e(iM7175b) + mo7179c(iM7175b).mo6359a(z);
        }
        if (i2 == 2) {
            return mo6359a(z);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo7178b(Object obj);

    @Override // com.anythink.expressad.exoplayer.AbstractC1499ae
    /* JADX INFO: renamed from: b */
    public final int mo6368b(boolean z) {
        if (this.f8635b == 0) {
            return -1;
        }
        if (this.f8637d) {
            z = false;
        }
        int iMo7252c = z ? this.f8636c.mo7252c() : 0;
        while (mo7179c(iMo7252c).m6365a()) {
            iMo7252c = m7174a(iMo7252c, z);
            if (iMo7252c == -1) {
                return -1;
            }
        }
        return mo7181e(iMo7252c) + mo7179c(iMo7252c).mo6368b(z);
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC1499ae mo7179c(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo7180d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo7181e(int i);

    /* JADX INFO: renamed from: f */
    public abstract Object mo7182f(int i);
}
