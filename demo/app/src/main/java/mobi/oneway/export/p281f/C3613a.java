package mobi.oneway.export.p281f;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.Map;
import mobi.oneway.export.enums.AdType;
import mobi.oneway.export.enums.OnewaySdkError;
import mobi.oneway.export.enums.PluginErrorType;
import mobi.oneway.export.p274a.C3581a;
import mobi.oneway.export.p275b.C3586a;
import mobi.oneway.export.p275b.p277b.C3592c;
import mobi.oneway.export.p275b.p277b.C3594e;
import mobi.oneway.export.p275b.p277b.C3595f;
import mobi.oneway.export.p275b.p277b.C3596g;
import mobi.oneway.export.p275b.p277b.C3597h;
import mobi.oneway.export.p275b.p277b.C3598i;
import mobi.oneway.export.p275b.p277b.InterfaceC3593d;
import mobi.oneway.export.p280e.C3611c;
import mobi.oneway.export.p281f.p282a.AbstractC3614a;
import mobi.oneway.export.p281f.p282a.C3616c;
import mobi.oneway.export.p281f.p282a.C3617d;
import mobi.oneway.export.p281f.p282a.C3618e;
import mobi.oneway.export.p281f.p282a.C3619f;
import mobi.oneway.export.p281f.p282a.C3620g;
import mobi.oneway.export.p281f.p282a.C3621h;
import mobi.oneway.export.p283g.C3635g;
import mobi.oneway.export.p283g.C3641m;
import mobi.oneway.export.plugin.BaseAd;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: mobi.oneway.export.f.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3613a {

    /* JADX INFO: renamed from: a */
    private int f19725a;

    /* JADX INFO: renamed from: b */
    private BaseAd f19726b;

    /* JADX INFO: renamed from: c */
    private Class f19727c;

    /* JADX INFO: renamed from: d */
    private long f19728d = -1;

    /* JADX INFO: renamed from: e */
    private long f19729e;

    /* JADX INFO: renamed from: f */
    private String f19730f;

    /* JADX INFO: renamed from: g */
    private ClassLoader f19731g;

    /* JADX INFO: renamed from: h */
    private String f19732h;

    /* JADX INFO: renamed from: i */
    private String f19733i;

    /* JADX INFO: renamed from: j */
    private String f19734j;

    /* JADX INFO: renamed from: k */
    private String f19735k;

    /* JADX INFO: renamed from: l */
    private AbstractC3614a f19736l;

    /* JADX INFO: renamed from: mobi.oneway.export.f.a$1 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19737a;

        static {
            int[] iArr = new int[AdType.values().length];
            f19737a = iArr;
            try {
                iArr[AdType.rewarded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19737a[AdType.interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19737a[AdType.interstitialimage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19737a[AdType.interactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19737a[AdType.feed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19737a[AdType.splash.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C3613a(C3627g c3627g, String str, String str2) {
        this.f19725a = c3627g.m16891a();
        this.f19727c = c3627g.m16897b();
        this.f19730f = c3627g.m16900d();
        this.f19731g = c3627g.m16899c();
        this.f19729e = c3627g.m16901e();
        this.f19734j = c3627g.m16902f();
        this.f19732h = str2;
        this.f19733i = str;
        if (TextUtils.isEmpty(str2) || str.equals(str2)) {
            this.f19735k = str;
        } else {
            this.f19735k = str + "-" + str2;
        }
        m16820a(this.f19734j, (Map<String, String>) null);
        m16836a(C3641m.m16992a());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private mobi.oneway.export.p281f.p282a.AbstractC3614a m16818a(mobi.oneway.export.enums.AdType r2, mobi.oneway.export.p275b.p277b.AbstractC3591b r3) {
        /*
            r1 = this;
            int[] r0 = mobi.oneway.export.p281f.C3613a.AnonymousClass1.f19737a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto L2a;
                case 2: goto L24;
                case 3: goto L1e;
                case 4: goto L18;
                case 5: goto L12;
                case 6: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L31
        Lc:
            mobi.oneway.export.f.a.h r2 = new mobi.oneway.export.f.a.h
            r2.<init>(r1)
            goto L2f
        L12:
            mobi.oneway.export.f.a.c r2 = new mobi.oneway.export.f.a.c
            r2.<init>(r1)
            goto L2f
        L18:
            mobi.oneway.export.f.a.d r2 = new mobi.oneway.export.f.a.d
            r2.<init>(r1)
            goto L2f
        L1e:
            mobi.oneway.export.f.a.e r2 = new mobi.oneway.export.f.a.e
            r2.<init>(r1)
            goto L2f
        L24:
            mobi.oneway.export.f.a.f r2 = new mobi.oneway.export.f.a.f
            r2.<init>(r1)
            goto L2f
        L2a:
            mobi.oneway.export.f.a.g r2 = new mobi.oneway.export.f.a.g
            r2.<init>(r1)
        L2f:
            r1.f19736l = r2
        L31:
            mobi.oneway.export.f.a.a r2 = r1.f19736l
            if (r2 == 0) goto L38
            r2.m16847a(r3)
        L38:
            mobi.oneway.export.f.a.a r2 = r1.f19736l
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.oneway.export.p281f.C3613a.m16818a(mobi.oneway.export.enums.AdType, mobi.oneway.export.b.b.b):mobi.oneway.export.f.a.a");
    }

    /* JADX INFO: renamed from: a */
    private void m16819a(Exception exc) {
        C3611c.m16816a(PluginErrorType.shell_error_reflectMethod, C3635g.m16943a((Throwable) exc));
    }

    /* JADX INFO: renamed from: a */
    private void m16820a(String str, Map<String, String> map) {
        try {
            BaseAd baseAd = (BaseAd) this.f19727c.getConstructor(String.class, Map.class).newInstance(str, map);
            this.f19726b = baseAd;
            baseAd.setAdConfig(m16822i());
        } catch (Exception e) {
            e.printStackTrace();
            m16819a(e);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m16821h() {
        if (!C3586a.m16671a().m16681a(this.f19733i, this.f19732h)) {
            C3586a.m16671a().m16679a(C3586a.a.TYPE_REQUEST, this.f19733i, this.f19732h);
            return false;
        }
        AbstractC3614a abstractC3614a = this.f19736l;
        if (abstractC3614a == null) {
            return true;
        }
        abstractC3614a.m16851b(OnewaySdkError.LOAD_ERROR, C3581a.f19613n);
        return true;
    }

    /* JADX INFO: renamed from: i */
    private String m16822i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cacheAd", C3586a.m16671a().m16682b());
            jSONObject.put("placements", new JSONArray(C3624d.m16873a()));
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public int m16823a() {
        return this.f19725a;
    }

    /* JADX INFO: renamed from: a */
    public void m16824a(Activity activity, ViewGroup viewGroup, C3598i c3598i, long j) {
        if (this.f19726b == null) {
            return;
        }
        C3621h c3621h = (C3621h) m16818a(AdType.splash, c3598i);
        if (m16821h()) {
            return;
        }
        this.f19726b.showSplashAd(activity, this.f19735k, viewGroup, c3621h, j);
    }

    /* JADX INFO: renamed from: a */
    public void m16825a(Activity activity, C3594e c3594e) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.initInteractiveAd(activity, this.f19735k, (C3617d) m16818a(AdType.interactive, c3594e));
    }

    /* JADX INFO: renamed from: a */
    public void m16826a(Activity activity, C3595f c3595f) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.initInterstitialAd(activity, this.f19735k, (C3619f) m16818a(AdType.interstitial, c3595f));
    }

    /* JADX INFO: renamed from: a */
    public void m16827a(Activity activity, C3596g c3596g) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.initInterstitialImageAd(activity, this.f19735k, (C3618e) m16818a(AdType.interstitialimage, c3596g));
    }

    /* JADX INFO: renamed from: a */
    public void m16828a(Activity activity, C3597h c3597h) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.initRewardAd(activity, this.f19735k, (C3620g) m16818a(AdType.rewarded, c3597h));
    }

    /* JADX INFO: renamed from: a */
    public void m16829a(Context context, C3592c c3592c) {
        if (this.f19726b == null) {
            return;
        }
        C3616c c3616c = (C3616c) m16818a(AdType.feed, c3592c);
        if (m16821h()) {
            return;
        }
        this.f19726b.loadFeedAd(context, this.f19735k, c3616c);
    }

    /* JADX INFO: renamed from: a */
    public void m16830a(C3594e c3594e) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.setInteractiveAdListener(this.f19735k, (C3617d) m16818a(AdType.interactive, c3594e));
    }

    /* JADX INFO: renamed from: a */
    public void m16831a(C3595f c3595f) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.setInterstitialAdListener(this.f19735k, (C3619f) m16818a(AdType.interstitial, c3595f));
    }

    /* JADX INFO: renamed from: a */
    public void m16832a(C3596g c3596g) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.setInterstitialImageAdListener(this.f19735k, (C3618e) m16818a(AdType.interstitialimage, c3596g));
    }

    /* JADX INFO: renamed from: a */
    public void m16833a(C3597h c3597h) {
        if (this.f19726b == null) {
            return;
        }
        this.f19726b.setRewardAdListener(this.f19735k, (C3620g) m16818a(AdType.rewarded, c3597h));
    }

    /* JADX INFO: renamed from: a */
    public void m16834a(AdType adType) {
        if (this.f19726b == null || m16821h()) {
            return;
        }
        int i = AnonymousClass1.f19737a[adType.ordinal()];
        if (i == 1) {
            this.f19726b.loadRewardAd(this.f19735k);
            return;
        }
        if (i == 2) {
            this.f19726b.loadInterstitialAd(this.f19735k);
        } else if (i == 3) {
            this.f19726b.loadInterstitialImageAd(this.f19735k);
        } else {
            if (i != 4) {
                return;
            }
            this.f19726b.loadInteractiveAd(this.f19735k);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16835a(AdType adType, Activity activity, String str) {
        if (this.f19726b == null) {
            return;
        }
        int i = AnonymousClass1.f19737a[adType.ordinal()];
        if (i == 1) {
            this.f19726b.showRewardAd(activity, this.f19735k, str);
            return;
        }
        if (i == 2) {
            this.f19726b.showInterstitialAd(activity, this.f19735k, str);
        } else if (i == 3) {
            this.f19726b.showInterstitialImageAd(activity, this.f19735k, str);
        } else {
            if (i != 4) {
                return;
            }
            this.f19726b.showInteractiveAd(activity, this.f19735k, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16836a(boolean z) {
        BaseAd baseAd = this.f19726b;
        if (baseAd == null) {
            return;
        }
        baseAd.setDebugMode(z);
    }

    /* JADX INFO: renamed from: b */
    public long m16837b() {
        BaseAd baseAd;
        if (this.f19728d != -1 || (baseAd = this.f19726b) == null) {
            return 0L;
        }
        return baseAd.getCrc();
    }

    /* JADX INFO: renamed from: b */
    public boolean m16838b(AdType adType) {
        if (this.f19726b == null) {
            return false;
        }
        int i = AnonymousClass1.f19737a[adType.ordinal()];
        if (i == 1) {
            return this.f19726b.isRewardAdReady(this.f19735k);
        }
        if (i == 2) {
            return this.f19726b.isInterstitialAdReady(this.f19735k);
        }
        if (i == 3) {
            return this.f19726b.isInterstitialImageAdReady(this.f19735k);
        }
        if (i != 4) {
            return false;
        }
        return this.f19726b.isInteractiveAdReady(this.f19735k);
    }

    /* JADX INFO: renamed from: c */
    public long m16839c() {
        return this.f19729e;
    }

    /* JADX INFO: renamed from: c */
    public void m16840c(AdType adType) {
        BaseAd baseAd = this.f19726b;
        if (baseAd == null) {
            return;
        }
        baseAd.destoryAd(adType, this.f19735k);
        AbstractC3614a abstractC3614a = this.f19736l;
        if (abstractC3614a != null) {
            abstractC3614a.m16847a((InterfaceC3593d) null);
            this.f19736l = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public String m16841d() {
        return this.f19730f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m16842d(AdType adType) {
        if (adType == AdType.splash) {
            return true;
        }
        int i = AnonymousClass1.f19737a[adType.ordinal()];
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "hasFeedAd" : "hasInteractiveAd" : "hasInterstitialImageAd" : "hasInterstitialAd" : "hasRewardAd";
        try {
            BaseAd baseAd = this.f19726b;
            if (baseAd == null) {
                return false;
            }
            Field declaredField = baseAd.getClass().getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(this.f19726b)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            m16819a(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public ClassLoader m16843e() {
        return this.f19731g;
    }

    /* JADX INFO: renamed from: f */
    public String m16844f() {
        return this.f19732h;
    }

    /* JADX INFO: renamed from: g */
    public String m16845g() {
        return this.f19733i;
    }
}
