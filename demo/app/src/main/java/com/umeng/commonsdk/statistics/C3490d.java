package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.C3403a;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3412ad;
import com.umeng.commonsdk.proguard.C3427as;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.proguard.C3466q;
import com.umeng.commonsdk.proguard.C3471v;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.idtracking.C3496e;
import com.umeng.commonsdk.statistics.idtracking.C3498g;
import com.umeng.commonsdk.statistics.internal.C3516c;
import com.umeng.commonsdk.statistics.internal.InterfaceC3517d;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import com.umeng.commonsdk.statistics.proto.Response;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3490d {

    /* JADX INFO: renamed from: b */
    private static final int f19181b = 1;

    /* JADX INFO: renamed from: c */
    private static final int f19182c = 2;

    /* JADX INFO: renamed from: d */
    private static final int f19183d = 3;

    /* JADX INFO: renamed from: p */
    private static final String f19184p = "thtstart";

    /* JADX INFO: renamed from: q */
    private static final String f19185q = "gkvc";

    /* JADX INFO: renamed from: r */
    private static final String f19186r = "ekvc";

    /* JADX INFO: renamed from: a */
    public String f19187a;

    /* JADX INFO: renamed from: f */
    private C3516c f19189f;

    /* JADX INFO: renamed from: g */
    private C3498g f19190g;

    /* JADX INFO: renamed from: h */
    private C3496e f19191h;

    /* JADX INFO: renamed from: i */
    private C3498g.a f19192i;

    /* JADX INFO: renamed from: j */
    private ABTest f19193j;

    /* JADX INFO: renamed from: k */
    private ImLatent f19194k;

    /* JADX INFO: renamed from: l */
    private Defcon f19195l;

    /* JADX INFO: renamed from: m */
    private long f19196m;

    /* JADX INFO: renamed from: n */
    private int f19197n;

    /* JADX INFO: renamed from: o */
    private int f19198o;

    /* JADX INFO: renamed from: s */
    private Context f19199s;

    /* JADX INFO: renamed from: e */
    private final int f19188e = 1;

    /* JADX INFO: renamed from: t */
    private ReportPolicy.ReportStrategy f19200t = null;

    public C3490d(Context context) {
        this.f19192i = null;
        this.f19193j = null;
        this.f19194k = null;
        this.f19195l = null;
        this.f19196m = 0L;
        this.f19197n = 0;
        this.f19198o = 0;
        this.f19187a = null;
        this.f19199s = context;
        this.f19192i = C3498g.m16393a(context).m16403b();
        this.f19193j = ABTest.getService(this.f19199s);
        this.f19195l = Defcon.getService(this.f19199s);
        Context context2 = this.f19199s;
        this.f19194k = ImLatent.getService(context2, StatTracer.getInstance(context2));
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f19199s);
        this.f19196m = sharedPreferences.getLong(f19184p, 0L);
        this.f19197n = sharedPreferences.getInt(f19185q, 0);
        this.f19198o = sharedPreferences.getInt(f19186r, 0);
        this.f19187a = UMEnvelopeBuild.imprintProperty(this.f19199s, "track_list", null);
        C3498g c3498gM16393a = C3498g.m16393a(this.f19199s);
        this.f19190g = c3498gM16393a;
        c3498gM16393a.m16401a(new InterfaceC3517d() { // from class: com.umeng.commonsdk.statistics.d.1
            @Override // com.umeng.commonsdk.statistics.internal.InterfaceC3517d
            public void onImprintChanged(C3498g.a aVar) {
                C3490d.this.f19193j.onImprintChanged(aVar);
                C3490d.this.f19195l.onImprintChanged(aVar);
                C3490d.this.f19194k.onImprintChanged(aVar);
                C3490d c3490d = C3490d.this;
                c3490d.f19187a = UMEnvelopeBuild.imprintProperty(c3490d.f19199s, "track_list", null);
                try {
                    C3466q c3466q = new C3466q(C3490d.this.f19199s);
                    String strM15641a = C3403a.m15641a(C3490d.this.f19199s, C3471v.f18971d, (String) null);
                    String strM15997g = c3466q.m15997g();
                    if (TextUtils.isEmpty(strM15641a)) {
                        return;
                    }
                    if (TextUtils.isEmpty(strM15997g) || !strM15641a.equals(strM15997g)) {
                        c3466q.m15991a(strM15641a);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        this.f19191h = C3496e.m16376a(this.f19199s);
        C3516c c3516c = new C3516c(this.f19199s);
        this.f19189f = c3516c;
        c3516c.m16433a(StatTracer.getInstance(this.f19199s));
    }

    /* JADX INFO: renamed from: a */
    private int m16357a(byte[] bArr) {
        Response response = new Response();
        try {
            new C3412ad(new C3427as.a()).m15727a(response, bArr);
            if (response.resp_code == 1) {
                this.f19190g.m16404b(response.getImprint());
                this.f19190g.m16405c();
            }
            MLog.m16275i("send log:" + response.getMsg());
        } catch (Throwable th) {
            C3454e.m15904a(this.f19199s, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16362a() {
        if (!this.f19195l.isOpen()) {
            ReportPolicy.ReportStrategy reportStrategy = this.f19200t;
            if (!((reportStrategy instanceof ReportPolicy.LatentPolicy) && reportStrategy.isValid()) && this.f19194k.shouldStartLatency()) {
                this.f19200t = new ReportPolicy.LatentPolicy((int) this.f19194k.getDelayTime());
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m16363a(java.io.File r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.getPath()     // Catch: java.lang.Throwable -> L5a
            byte[] r1 = com.umeng.commonsdk.framework.C3404b.m15651a(r1)     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto Lf
            return r0
        Lf:
            android.content.Context r2 = r4.f19199s     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.statistics.internal.a r2 = com.umeng.commonsdk.statistics.internal.C3514a.m16423a(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = r5.getName()     // Catch: java.lang.Throwable -> L5a
            r2.m16429b(r3)     // Catch: java.lang.Throwable -> L5a
            android.content.Context r2 = r4.f19199s     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.statistics.internal.a r2 = com.umeng.commonsdk.statistics.internal.C3514a.m16423a(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L5a
            boolean r5 = r2.m16427a(r5)     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.statistics.internal.c r2 = r4.f19189f     // Catch: java.lang.Throwable -> L5a
            byte[] r5 = r2.m16435a(r1, r5)     // Catch: java.lang.Throwable -> L5a
            r1 = 1
            if (r5 != 0) goto L35
            r5 = 1
            goto L39
        L35:
            int r5 = r4.m16357a(r5)     // Catch: java.lang.Throwable -> L5a
        L39:
            r2 = 2
            if (r5 == r2) goto L4a
            r3 = 3
            if (r5 == r3) goto L40
            goto L56
        L40:
            android.content.Context r3 = r4.f19199s     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.statistics.internal.StatTracer r3 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r3)     // Catch: java.lang.Throwable -> L5a
        L46:
            r3.saveSate()     // Catch: java.lang.Throwable -> L5a
            goto L56
        L4a:
            com.umeng.commonsdk.statistics.idtracking.e r3 = r4.f19191h     // Catch: java.lang.Throwable -> L5a
            r3.m16385d()     // Catch: java.lang.Throwable -> L5a
            android.content.Context r3 = r4.f19199s     // Catch: java.lang.Throwable -> L5a
            com.umeng.commonsdk.statistics.internal.StatTracer r3 = com.umeng.commonsdk.statistics.internal.StatTracer.getInstance(r3)     // Catch: java.lang.Throwable -> L5a
            goto L46
        L56:
            if (r5 != r2) goto L59
            return r1
        L59:
            return r0
        L5a:
            r5 = move-exception
            android.content.Context r1 = r4.f19199s
            com.umeng.commonsdk.proguard.C3454e.m15904a(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.C3490d.m16363a(java.io.File):boolean");
    }

    /* JADX INFO: renamed from: b */
    public int m16364b() {
        this.f19194k.getDelayTime();
        return (int) (System.currentTimeMillis() - StatTracer.getInstance(this.f19199s).getLastReqTime());
    }
}
