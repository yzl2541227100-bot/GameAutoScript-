package com.anythink.core.common.p055f;

import android.os.SystemClock;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.p072d.C1396f;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.anythink.core.common.f.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C1235ba {

    /* JADX INFO: renamed from: a */
    private final String f4067a = C1235ba.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private C1396f f4068b;

    /* JADX INFO: renamed from: c */
    private C1257v f4069c;

    /* JADX INFO: renamed from: d */
    private boolean f4070d;

    /* JADX INFO: renamed from: e */
    private long f4071e;

    /* JADX INFO: renamed from: f */
    private boolean f4072f;

    /* JADX INFO: renamed from: g */
    private int f4073g;

    /* JADX INFO: renamed from: h */
    private int f4074h;

    /* JADX INFO: renamed from: i */
    private boolean f4075i;

    /* JADX INFO: renamed from: j */
    private long f4076j;

    public C1235ba(C1257v c1257v, C1396f c1396f) {
        int i = c1257v.f4483d;
        this.f4069c = c1257v;
        this.f4068b = c1396f;
        this.f4070d = (ATAdxSetting.getInstance().isAdxNetworkMode(c1396f.m5056a()) || c1396f.m5129w() != 1 || i == 8) ? false : true;
        this.f4071e = c1396f.m5116j();
        this.f4072f = c1396f.m5114h() != 1 && c1396f.m5129w() == 1;
        this.f4073g = i == 9 ? c1396f.m5112f() : c1396f.m5130x();
        this.f4074h = i == 9 ? c1396f.m5113g() : c1396f.m5093ak();
        this.f4075i = c1396f.m5114h() != 1;
        this.f4076j = -1L;
        StringBuilder sb = new StringBuilder("LoadType: ");
        sb.append(i);
        sb.append(" :::Generate WaterfallSetting:");
        sb.append(toString());
    }

    /* JADX INFO: renamed from: q */
    private long m2915q() {
        return this.f4068b.m5030B();
    }

    /* JADX INFO: renamed from: a */
    public final C1396f m2916a() {
        return this.f4068b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2917b() {
        return this.f4070d;
    }

    /* JADX INFO: renamed from: c */
    public final long m2918c() {
        return this.f4071e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2919d() {
        return this.f4072f;
    }

    /* JADX INFO: renamed from: e */
    public final int m2920e() {
        return this.f4073g;
    }

    /* JADX INFO: renamed from: f */
    public final int m2921f() {
        return this.f4074h;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2922g() {
        return this.f4075i;
    }

    /* JADX INFO: renamed from: h */
    public final int m2923h() {
        return this.f4068b.m5105ay();
    }

    /* JADX INFO: renamed from: i */
    public final long m2924i() {
        return this.f4068b.m5085ac();
    }

    /* JADX INFO: renamed from: j */
    public final long m2925j() {
        C1257v c1257v = this.f4069c;
        if (!c1257v.f4489j) {
            return this.f4068b.m5132z();
        }
        long j = this.f4076j;
        if (j >= 0) {
            return j;
        }
        long jElapsedRealtime = (((long) c1257v.f4487h) - (SystemClock.elapsedRealtime() - this.f4069c.f4490k)) - 100;
        this.f4076j = jElapsedRealtime;
        if (jElapsedRealtime < 0) {
            this.f4076j = 0L;
        }
        return this.f4076j;
    }

    /* JADX INFO: renamed from: k */
    public final int m2926k() {
        return this.f4068b.m5121o();
    }

    /* JADX INFO: renamed from: l */
    public final long m2927l() {
        return this.f4068b.m5047S();
    }

    /* JADX INFO: renamed from: m */
    public final long m2928m() {
        return this.f4068b.m5041M();
    }

    /* JADX INFO: renamed from: n */
    public final long m2929n() {
        return this.f4068b.m5086ad();
    }

    /* JADX INFO: renamed from: o */
    public final long m2930o() {
        return this.f4068b.m5035G();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2931p() {
        C1396f c1396f = this.f4068b;
        return c1396f != null && c1396f.m5076aR() == 1;
    }

    public final String toString() {
        return "WaterfallSetting{canLoadFailRetry=" + this.f4070d + ", loadFailRetryDelayTime=" + this.f4071e + ", cannBiddingFailRetry=" + this.f4072f + ", requestType=" + this.f4073g + ", requestNum=" + this.f4074h + ", canBuyerIdOverTimeToBid=" + this.f4075i + ", cacheNum:" + this.f4068b.m5105ay() + MessageFormatter.DELIM_STOP;
    }
}
