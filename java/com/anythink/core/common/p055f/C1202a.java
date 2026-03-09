package com.anythink.core.common.p055f;

import android.content.Context;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.p069p.C1370i;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.a */
/* JADX INFO: loaded from: classes.dex */
public class C1202a {

    /* JADX INFO: renamed from: a */
    public static final String f3675a = "a";

    /* JADX INFO: renamed from: A */
    public ATAdxBidFloorInfo f3676A;

    /* JADX INFO: renamed from: B */
    public String f3677B;

    /* JADX INFO: renamed from: b */
    public Context f3678b;

    /* JADX INFO: renamed from: c */
    public C1257v f3679c;

    /* JADX INFO: renamed from: d */
    public String f3680d;

    /* JADX INFO: renamed from: e */
    public String f3681e;

    /* JADX INFO: renamed from: f */
    public int f3682f;

    /* JADX INFO: renamed from: g */
    public long f3683g;

    /* JADX INFO: renamed from: h */
    public long f3684h;

    /* JADX INFO: renamed from: i */
    public long f3685i;

    /* JADX INFO: renamed from: j */
    public List<C1229av> f3686j;

    /* JADX INFO: renamed from: k */
    public List<C1229av> f3687k;

    /* JADX INFO: renamed from: l */
    public String f3688l;

    /* JADX INFO: renamed from: m */
    public boolean f3689m;

    /* JADX INFO: renamed from: n */
    public C1235ba f3690n;

    /* JADX INFO: renamed from: o */
    public String f3691o;

    /* JADX INFO: renamed from: p */
    public String f3692p;

    /* JADX INFO: renamed from: q */
    public Map<String, Object> f3693q;

    /* JADX INFO: renamed from: r */
    public JSONObject f3694r;

    /* JADX INFO: renamed from: s */
    public C1243h f3695s;

    /* JADX INFO: renamed from: u */
    public double f3697u;

    /* JADX INFO: renamed from: v */
    public C1233az f3698v;

    /* JADX INFO: renamed from: w */
    public C1224aq f3699w;

    /* JADX INFO: renamed from: x */
    public C1251p f3700x;

    /* JADX INFO: renamed from: y */
    public C1370i f3701y;

    /* JADX INFO: renamed from: t */
    public int f3696t = 2;

    /* JADX INFO: renamed from: z */
    public int f3702z = 0;

    /* JADX INFO: renamed from: d */
    private C1202a m2410d(List<C1229av> list) {
        C1202a c1202a = new C1202a();
        c1202a.f3678b = this.f3678b;
        c1202a.f3680d = this.f3680d;
        c1202a.f3681e = this.f3681e;
        c1202a.f3682f = this.f3682f;
        c1202a.f3684h = this.f3684h;
        c1202a.f3690n = this.f3690n;
        long j = this.f3683g;
        if (j < 0) {
            j = UMAmapConfig.AMAP_CACHE_WRITE_TIME;
        }
        c1202a.f3683g = j;
        c1202a.f3689m = this.f3689m;
        c1202a.f3691o = this.f3691o;
        c1202a.f3692p = this.f3692p;
        c1202a.f3686j = list;
        c1202a.f3693q = this.f3693q;
        c1202a.f3685i = this.f3685i;
        c1202a.f3679c = this.f3679c;
        c1202a.f3695s = this.f3695s;
        c1202a.f3696t = this.f3696t;
        c1202a.f3697u = this.f3697u;
        c1202a.f3702z = this.f3702z;
        c1202a.f3701y = this.f3701y;
        c1202a.f3700x = this.f3700x;
        c1202a.f3676A = this.f3676A;
        c1202a.f3677B = this.f3677B;
        return c1202a;
    }

    /* JADX INFO: renamed from: a */
    public final C1202a m2411a(List<C1229av> list) {
        return m2410d(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:11:0x006d, B:27:0x009e, B:31:0x00c1, B:33:0x00cb, B:34:0x00ce, B:36:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fe, B:42:0x0109, B:44:0x010f, B:45:0x011b, B:47:0x0121, B:48:0x0126, B:50:0x012c, B:51:0x0131, B:28:0x00a2, B:30:0x00be, B:16:0x0082, B:19:0x008c), top: B:58:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:11:0x006d, B:27:0x009e, B:31:0x00c1, B:33:0x00cb, B:34:0x00ce, B:36:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fe, B:42:0x0109, B:44:0x010f, B:45:0x011b, B:47:0x0121, B:48:0x0126, B:50:0x012c, B:51:0x0131, B:28:0x00a2, B:30:0x00be, B:16:0x0082, B:19:0x008c), top: B:58:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:11:0x006d, B:27:0x009e, B:31:0x00c1, B:33:0x00cb, B:34:0x00ce, B:36:0x00de, B:37:0x00ec, B:39:0x00f2, B:41:0x00fe, B:42:0x0109, B:44:0x010f, B:45:0x011b, B:47:0x0121, B:48:0x0126, B:50:0x012c, B:51:0x0131, B:28:0x00a2, B:30:0x00be, B:16:0x0082, B:19:0x008c), top: B:58:0x006d }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.anythink.core.common.p055f.C1202a m2412a(java.util.List<com.anythink.core.common.p055f.C1229av> r11, java.util.List<com.anythink.core.common.p055f.C1229av> r12) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p055f.C1202a.m2412a(java.util.List, java.util.List):com.anythink.core.common.f.a");
    }

    /* JADX INFO: renamed from: b */
    public final C1202a m2413b(List<C1229av> list) {
        C1202a c1202aM2410d = m2410d(list);
        c1202aM2410d.f3691o = this.f3691o;
        c1202aM2410d.f3684h = this.f3684h;
        return c1202aM2410d;
    }

    /* JADX INFO: renamed from: c */
    public final C1202a m2414c(List<C1229av> list) {
        C1202a c1202aM2410d = m2410d(list);
        c1202aM2410d.f3692p = this.f3692p;
        return c1202aM2410d;
    }
}
