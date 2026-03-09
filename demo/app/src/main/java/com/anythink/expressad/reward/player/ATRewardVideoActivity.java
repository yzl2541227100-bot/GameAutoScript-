package com.anythink.expressad.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.anythink.core.common.p050a.C1160l;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1318a;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1794p;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p136h.C1865a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.reward.p146a.C1963e;
import com.anythink.expressad.reward.p147b.C1964a;
import com.anythink.expressad.video.dynview.p158a.C2070b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2079a;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2082d;
import com.anythink.expressad.video.dynview.p165h.C2089b;
import com.anythink.expressad.video.module.p174b.C2190a;
import com.anythink.expressad.video.p154bt.module.ATTempContainer;
import com.anythink.expressad.video.p154bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a;
import com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h;
import com.anythink.expressad.video.signal.activity.AbstractJSActivity;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p177a.C2315a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p178b.C2329n;
import com.anythink.expressad.videocommon.p179c.C2333c;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ATRewardVideoActivity extends AbstractJSActivity {

    /* JADX INFO: renamed from: a */
    public static String f12376a = "unitId";

    /* JADX INFO: renamed from: b */
    public static String f12377b = "userId";

    /* JADX INFO: renamed from: c */
    public static String f12378c = "reward";

    /* JADX INFO: renamed from: d */
    public static String f12379d = "mute";

    /* JADX INFO: renamed from: e */
    public static String f12380e = "isIV";

    /* JADX INFO: renamed from: f */
    public static String f12381f = "isBid";

    /* JADX INFO: renamed from: g */
    public static String f12382g = "isBigOffer";

    /* JADX INFO: renamed from: h */
    public static String f12383h = "hasRelease";

    /* JADX INFO: renamed from: i */
    public static String f12384i = "ivRewardMode";

    /* JADX INFO: renamed from: j */
    public static String f12385j = "ivRewardValueType";

    /* JADX INFO: renamed from: k */
    public static String f12386k = "ivRewardValue";

    /* JADX INFO: renamed from: l */
    public static String f12387l = "extraData";

    /* JADX INFO: renamed from: m */
    public static String f12388m = "baserequestInfo";

    /* JADX INFO: renamed from: v */
    private static final String f12389v = "ATRewardVideoActivity";

    /* JADX INFO: renamed from: D */
    private int f12393D;

    /* JADX INFO: renamed from: E */
    private int f12394E;

    /* JADX INFO: renamed from: F */
    private int f12395F;

    /* JADX INFO: renamed from: I */
    private InterfaceC2067h f12398I;

    /* JADX INFO: renamed from: J */
    private C2340d f12399J;

    /* JADX INFO: renamed from: M */
    private C2318c f12402M;

    /* JADX INFO: renamed from: N */
    private C1781c f12403N;

    /* JADX INFO: renamed from: O */
    private List<C2318c> f12404O;

    /* JADX INFO: renamed from: P */
    private List<C1781c> f12405P;

    /* JADX INFO: renamed from: Q */
    private ATTempContainer f12406Q;

    /* JADX INFO: renamed from: R */
    private AnythinkBTContainer f12407R;

    /* JADX INFO: renamed from: S */
    private WindVaneWebView f12408S;

    /* JADX INFO: renamed from: T */
    private InterfaceC2058a f12409T;

    /* JADX INFO: renamed from: U */
    private String f12410U;

    /* JADX INFO: renamed from: V */
    private String f12411V;

    /* JADX INFO: renamed from: W */
    private boolean f12412W;

    /* JADX INFO: renamed from: n */
    public C1248m f12422n;

    /* JADX INFO: renamed from: o */
    public C1781c f12423o;

    /* JADX INFO: renamed from: p */
    public long f12424p;

    /* JADX INFO: renamed from: q */
    public long f12425q;

    /* JADX INFO: renamed from: r */
    public long f12426r;

    /* JADX INFO: renamed from: w */
    private String f12428w;

    /* JADX INFO: renamed from: x */
    private String f12429x;

    /* JADX INFO: renamed from: y */
    private String f12430y;

    /* JADX INFO: renamed from: z */
    private C2333c f12431z;

    /* JADX INFO: renamed from: A */
    private int f12390A = 2;

    /* JADX INFO: renamed from: B */
    private boolean f12391B = false;

    /* JADX INFO: renamed from: C */
    private boolean f12392C = false;

    /* JADX INFO: renamed from: G */
    private boolean f12396G = false;

    /* JADX INFO: renamed from: H */
    private boolean f12397H = false;

    /* JADX INFO: renamed from: K */
    private boolean f12400K = false;

    /* JADX INFO: renamed from: L */
    private boolean f12401L = false;

    /* JADX INFO: renamed from: X */
    private int f12413X = 1;

    /* JADX INFO: renamed from: Y */
    private int f12414Y = 0;

    /* JADX INFO: renamed from: Z */
    private int f12415Z = 0;

    /* JADX INFO: renamed from: aa */
    private int f12416aa = 0;

    /* JADX INFO: renamed from: ab */
    private int f12417ab = 0;

    /* JADX INFO: renamed from: ac */
    private int f12418ac = 0;

    /* JADX INFO: renamed from: ad */
    private int f12419ad = 0;

    /* JADX INFO: renamed from: ae */
    private InterfaceC2079a f12420ae = new InterfaceC2079a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.1
        public C19651() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2079a
        /* JADX INFO: renamed from: a */
        public final void mo10458a(Map<String, Object> map) {
            if (map.containsKey("mute")) {
                ATRewardVideoActivity.this.f12390A = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey(RequestParameters.POSITION)) {
                int iIntValue = ((Integer) map.get(RequestParameters.POSITION)).intValue();
                if (ATRewardVideoActivity.this.f12405P == null || ATRewardVideoActivity.this.f12405P.size() <= 0 || iIntValue <= 0) {
                    return;
                }
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.f12403N = (C1781c) aTRewardVideoActivity.f12405P.get(iIntValue);
                ATRewardVideoActivity.m10433b(ATRewardVideoActivity.this);
                int i = iIntValue - 1;
                if (ATRewardVideoActivity.this.f12405P.get(i) != null) {
                    ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.m10434b(aTRewardVideoActivity2, ((C1781c) aTRewardVideoActivity2.f12405P.get(i)).m10155bi());
                }
                ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                ATRewardVideoActivity.this.f12403N.m8859b(aTRewardVideoActivity3.m10422a(aTRewardVideoActivity3.f12403N.m8881i(), ATRewardVideoActivity.this.f12413X));
                ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                aTRewardVideoActivity4.m10436b(aTRewardVideoActivity4.f12403N);
            }
        }
    };

    /* JADX INFO: renamed from: af */
    private InterfaceC2082d f12421af = new InterfaceC2082d() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.2
        public C19662() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2082d
        /* JADX INFO: renamed from: a */
        public final void mo10459a() {
            if (ATRewardVideoActivity.this.f12407R != null) {
                new C2089b().m11179d(ATRewardVideoActivity.this.f12407R);
            }
            ATRewardVideoActivity.m10449f(ATRewardVideoActivity.this);
            ATRewardVideoActivity.this.m10435b();
            if (ATRewardVideoActivity.this.f12406Q != null) {
                ATRewardVideoActivity.this.f12406Q.setNotchPadding(ATRewardVideoActivity.this.f12419ad, ATRewardVideoActivity.this.f12415Z, ATRewardVideoActivity.this.f12417ab, ATRewardVideoActivity.this.f12416aa, ATRewardVideoActivity.this.f12418ac);
            }
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2082d
        /* JADX INFO: renamed from: a */
        public final void mo10460a(C1781c c1781c) {
            if (c1781c == null) {
                ATRewardVideoActivity.this.m10439b("campaign is null");
                return;
            }
            if (ATRewardVideoActivity.this.f12407R != null) {
                new C2089b().m11179d(ATRewardVideoActivity.this.f12407R);
            }
            ATRewardVideoActivity.this.f12403N = c1781c;
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.m10436b(aTRewardVideoActivity.f12403N);
        }
    };

    /* JADX INFO: renamed from: s */
    public InterfaceC1972b f12427s = new InterfaceC1972b() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.3

        /* JADX INFO: renamed from: a */
        public String f12434a = "1";

        public C19673() {
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1972b
        /* JADX INFO: renamed from: a */
        public final String mo10461a() {
            return this.f12434a;
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: b */
        public final void mo10462b() {
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: c */
        public final void mo10463c() {
            this.f12434a = "1";
            ATRewardVideoActivity.this.m10431a("4", 0L);
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: d */
        public final void mo10464d() {
            if (TextUtils.equals(this.f12434a, "1")) {
                this.f12434a = "2";
            }
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            StringBuilder sb = new StringBuilder("5-");
            ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
            sb.append(aTRewardVideoActivity2.f12425q <= aTRewardVideoActivity2.f12426r ? "2" : "1");
            aTRewardVideoActivity.m10431a(sb.toString(), 0L);
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: e */
        public final void mo10465e() {
            if (TextUtils.equals(this.f12434a, "1")) {
                this.f12434a = "3";
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                StringBuilder sb = new StringBuilder("6-");
                ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                sb.append(aTRewardVideoActivity2.f12425q <= aTRewardVideoActivity2.f12426r ? "2" : "1");
                aTRewardVideoActivity.m10431a(sb.toString(), 0L);
            }
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: f */
        public final void mo10466f() {
        }
    };

    /* JADX INFO: renamed from: com.anythink.expressad.reward.player.ATRewardVideoActivity$1 */
    public class C19651 implements InterfaceC2079a {
        public C19651() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2079a
        /* JADX INFO: renamed from: a */
        public final void mo10458a(Map<String, Object> map) {
            if (map.containsKey("mute")) {
                ATRewardVideoActivity.this.f12390A = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey(RequestParameters.POSITION)) {
                int iIntValue = ((Integer) map.get(RequestParameters.POSITION)).intValue();
                if (ATRewardVideoActivity.this.f12405P == null || ATRewardVideoActivity.this.f12405P.size() <= 0 || iIntValue <= 0) {
                    return;
                }
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.f12403N = (C1781c) aTRewardVideoActivity.f12405P.get(iIntValue);
                ATRewardVideoActivity.m10433b(ATRewardVideoActivity.this);
                int i = iIntValue - 1;
                if (ATRewardVideoActivity.this.f12405P.get(i) != null) {
                    ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.m10434b(aTRewardVideoActivity2, ((C1781c) aTRewardVideoActivity2.f12405P.get(i)).m10155bi());
                }
                ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                ATRewardVideoActivity.this.f12403N.m8859b(aTRewardVideoActivity3.m10422a(aTRewardVideoActivity3.f12403N.m8881i(), ATRewardVideoActivity.this.f12413X));
                ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                aTRewardVideoActivity4.m10436b(aTRewardVideoActivity4.f12403N);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.player.ATRewardVideoActivity$2 */
    public class C19662 implements InterfaceC2082d {
        public C19662() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2082d
        /* JADX INFO: renamed from: a */
        public final void mo10459a() {
            if (ATRewardVideoActivity.this.f12407R != null) {
                new C2089b().m11179d(ATRewardVideoActivity.this.f12407R);
            }
            ATRewardVideoActivity.m10449f(ATRewardVideoActivity.this);
            ATRewardVideoActivity.this.m10435b();
            if (ATRewardVideoActivity.this.f12406Q != null) {
                ATRewardVideoActivity.this.f12406Q.setNotchPadding(ATRewardVideoActivity.this.f12419ad, ATRewardVideoActivity.this.f12415Z, ATRewardVideoActivity.this.f12417ab, ATRewardVideoActivity.this.f12416aa, ATRewardVideoActivity.this.f12418ac);
            }
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2082d
        /* JADX INFO: renamed from: a */
        public final void mo10460a(C1781c c1781c) {
            if (c1781c == null) {
                ATRewardVideoActivity.this.m10439b("campaign is null");
                return;
            }
            if (ATRewardVideoActivity.this.f12407R != null) {
                new C2089b().m11179d(ATRewardVideoActivity.this.f12407R);
            }
            ATRewardVideoActivity.this.f12403N = c1781c;
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.m10436b(aTRewardVideoActivity.f12403N);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.player.ATRewardVideoActivity$3 */
    public class C19673 implements InterfaceC1972b {

        /* JADX INFO: renamed from: a */
        public String f12434a = "1";

        public C19673() {
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1972b
        /* JADX INFO: renamed from: a */
        public final String mo10461a() {
            return this.f12434a;
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: b */
        public final void mo10462b() {
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: c */
        public final void mo10463c() {
            this.f12434a = "1";
            ATRewardVideoActivity.this.m10431a("4", 0L);
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: d */
        public final void mo10464d() {
            if (TextUtils.equals(this.f12434a, "1")) {
                this.f12434a = "2";
            }
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            StringBuilder sb = new StringBuilder("5-");
            ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
            sb.append(aTRewardVideoActivity2.f12425q <= aTRewardVideoActivity2.f12426r ? "2" : "1");
            aTRewardVideoActivity.m10431a(sb.toString(), 0L);
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: e */
        public final void mo10465e() {
            if (TextUtils.equals(this.f12434a, "1")) {
                this.f12434a = "3";
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                StringBuilder sb = new StringBuilder("6-");
                ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                sb.append(aTRewardVideoActivity2.f12425q <= aTRewardVideoActivity2.f12426r ? "2" : "1");
                aTRewardVideoActivity.m10431a(sb.toString(), 0L);
            }
        }

        @Override // com.anythink.expressad.reward.player.InterfaceC1973c
        /* JADX INFO: renamed from: f */
        public final void mo10466f() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.player.ATRewardVideoActivity$4 */
    public class C19684 implements InterfaceC2058a {
        public C19684() {
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: a */
        public final void mo10467a() {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10415a();
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: a */
        public final void mo10468a(C1781c c1781c) {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10416a(c1781c);
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: a */
        public final void mo10469a(String str) {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10417a(str);
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: a */
        public final void mo10470a(boolean z, int i) {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10418a(z, i);
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: a */
        public final void mo10471a(boolean z, C2333c c2333c) {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10419a(z, c2333c);
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: b */
        public final void mo10472b() {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10420b();
            }
        }

        @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
        /* JADX INFO: renamed from: c */
        public final void mo10473c() {
            if (ATRewardVideoActivity.this.f12398I != null) {
                ATRewardVideoActivity.this.f12398I.mo10421c();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.player.ATRewardVideoActivity$5 */
    public class C19695 implements InterfaceC1798a {
        public C19695() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            ATRewardVideoActivity.this.onPause();
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            ATRewardVideoActivity.this.onResume();
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            ATRewardVideoActivity.this.onResume();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.player.ATRewardVideoActivity$a */
    public static final class RunnableC1970a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final List<C2318c> f12438a;

        /* JADX INFO: renamed from: b */
        private final String f12439b;

        /* JADX INFO: renamed from: c */
        private final String f12440c;

        public RunnableC1970a(List<C2318c> list, String str, String str2) {
            this.f12438a = list;
            this.f12439b = str;
            this.f12440c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<C2318c> list = this.f12438a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (C2318c c2318c : this.f12438a) {
                    if (c2318c != null && c2318c.m11833n() != null) {
                        C1781c c1781cM11833n = c2318c.m11833n();
                        String str = c1781cM11833n.m8818Z() + c1781cM11833n.m10146aZ() + c1781cM11833n.m8811S();
                        C2329n c2329nM11860c = C2320e.m11843a().m11860c(this.f12439b);
                        if (c2329nM11860c != null) {
                            try {
                                c2329nM11860c.m11949b(str);
                            } catch (Exception unused) {
                            }
                        }
                        if (c1781cM11833n != null && c1781cM11833n.m8805M() != null) {
                            if (!TextUtils.isEmpty(c1781cM11833n.m8805M().m8957e())) {
                                C2314a.m11751b(this.f12439b + "_" + c1781cM11833n.m10146aZ() + "_" + this.f12440c + "_" + c1781cM11833n.m8805M().m8957e());
                                C2314a.m11749b(c1781cM11833n.m8913w(), c1781cM11833n);
                            }
                            if (!TextUtils.isEmpty(c1781cM11833n.m8849ar())) {
                                C2314a.m11751b(this.f12439b + "_" + this.f12440c + "_" + c1781cM11833n.m8849ar());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m10422a(int i, int i2) {
        List<C1781c> list = this.f12405P;
        if (list == null || list.size() == 0) {
            return i;
        }
        int iM10155bi = 0;
        int iM8881i = 0;
        for (int i3 = 0; i3 < this.f12405P.size(); i3++) {
            if (this.f12405P.get(0) != null) {
                if (i3 == 0) {
                    iM8881i = this.f12405P.get(0).m8881i();
                }
                iM10155bi += this.f12405P.get(i3).m10155bi();
            }
        }
        if (i2 == 1) {
            if (i == 0) {
                if (iM10155bi >= 45) {
                    return 45;
                }
            } else if (iM10155bi > i) {
                if (i > 45) {
                    return 45;
                }
                return i;
            }
            return iM10155bi;
        }
        int iM10155bi2 = 0;
        for (int i4 = 0; i4 < i2 - 1; i4++) {
            if (this.f12405P.get(i4) != null) {
                iM10155bi2 += this.f12405P.get(i4).m10155bi();
            }
        }
        if (iM8881i > iM10155bi2) {
            return iM8881i - iM10155bi2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private static WindVaneWebView m10425a(String str) {
        C2314a.a aVarM11740a = C2314a.m11740a(str);
        if (aVarM11740a != null) {
            return aVarM11740a.m11758a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m10428a(int i) {
        try {
            C1781c c1781c = this.f12403N;
            if (c1781c == null || c1781c.m8872f() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(0));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12406Q.getLayoutParams();
            int iM9834b = C1886t.m9834b(this, 58.0f);
            int iM9834b2 = C1886t.m9834b(this, 104.0f);
            if (this.f12403N.m8805M().m8955c() != 0) {
                if (this.f12403N.m8805M().m8955c() == 2) {
                    layoutParams.setMargins(iM9834b2, iM9834b, iM9834b2, iM9834b);
                }
                layoutParams.setMargins(iM9834b, iM9834b2, iM9834b, iM9834b2);
            } else if (i == 2) {
                layoutParams.setMargins(iM9834b2, iM9834b, iM9834b2, iM9834b);
            } else {
                layoutParams.setMargins(iM9834b, iM9834b2, iM9834b, iM9834b2);
            }
            this.f12406Q.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10429a(C1781c c1781c) {
        if (c1781c == null) {
            m10439b("campaign is less");
            return;
        }
        int iM10422a = m10422a(c1781c.m8881i(), this.f12413X);
        this.f12403N = c1781c;
        c1781c.m8893m();
        this.f12413X = 1;
        this.f12403N.m8859b(iM10422a);
        m10436b(this.f12403N);
    }

    /* JADX INFO: renamed from: a */
    public void m10431a(String str, long j) {
        String string;
        String string2;
        try {
            C1248m c1248m = this.f12422n;
            String str2 = c1248m != null ? c1248m.f4323d : "";
            String str3 = c1248m != null ? c1248m.f4321b : "";
            String str4 = c1248m != null ? c1248m.f4322c : "";
            if (c1248m != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f12422n.f4329j);
                string = sb.toString();
            } else {
                string = "";
            }
            if (this.f12422n != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f12422n.f4325f);
                string2 = sb2.toString();
            } else {
                string2 = "";
            }
            C1781c c1781c = this.f12423o;
            String strM10146aZ = c1781c != null ? c1781c.m10146aZ() : "";
            C1781c c1781c2 = this.f12423o;
            C1322e.m3921a(str, str2, str3, str4, string, string2, 2, 1, strM10146aZ, "20", !TextUtils.isEmpty(c1781c2 != null ? c1781c2.m8811S() : ""), j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10432a(List<C1781c> list) {
        if (list == null) {
            m10439b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            m10439b("no available campaign");
            return;
        }
        if ((list.get(0) != null ? list.get(0).m8887k() : 0) != 5) {
            m10442c();
            return;
        }
        for (C1781c c1781c : list) {
            if (c1781c != null) {
                this.f12414Y += c1781c.m10155bi();
            }
        }
        C1781c c1781c2 = list.get(0);
        if (c1781c2 == null) {
            m10439b("campaign is less");
            return;
        }
        int iM10422a = m10422a(c1781c2.m8881i(), this.f12413X);
        this.f12403N = c1781c2;
        c1781c2.m8893m();
        this.f12413X = 1;
        this.f12403N.m8859b(iM10422a);
        m10436b(this.f12403N);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m10433b(ATRewardVideoActivity aTRewardVideoActivity) {
        int i = aTRewardVideoActivity.f12413X;
        aTRewardVideoActivity.f12413X = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m10434b(ATRewardVideoActivity aTRewardVideoActivity, int i) {
        int i2 = aTRewardVideoActivity.f12414Y - i;
        aTRewardVideoActivity.f12414Y = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public void m10435b() {
        List<C1781c> list;
        C1794p c1794p;
        List<C1781c> list2;
        int iM10440c = m10440c("anythink_temp_container");
        if (iM10440c < 0) {
            m10439b("no id anythink_bt_container in anythink_more_offer_activity layout");
        }
        ATTempContainer aTTempContainer = (ATTempContainer) findViewById(iM10440c);
        this.f12406Q = aTTempContainer;
        if (aTTempContainer == null) {
            m10439b("env error");
        }
        List<C1781c> list3 = this.f12405P;
        if (list3 == null || list3.size() <= 0 || !this.f12405P.get(0).m8886j()) {
            this.f12406Q.setVisibility(0);
        } else {
            new C2089b();
            C2089b.m11174e(this.f12406Q);
        }
        m10428a(-1);
        this.f12406Q.setVisibility(0);
        this.f12406Q.setActivity(this);
        this.f12406Q.setBidCampaign(this.f12392C);
        this.f12406Q.setBigOffer(this.f12396G);
        this.f12406Q.setUnitId(this.f12428w);
        this.f12406Q.setCampaign(this.f12403N);
        if (this.f12403N.m8887k() == 5 && (list2 = this.f12405P) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(m10440c("anythink_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(-16777216);
            }
            this.f12406Q.removeAllViews();
            this.f12406Q.setCampOrderViewData(this.f12405P, this.f12414Y);
            this.f12406Q.setCamPlayOrderCallback(this.f12420ae, this.f12413X);
        }
        this.f12406Q.setCampaignDownLoadTask(this.f12402M);
        this.f12406Q.setIV(this.f12391B);
        C1781c c1781c = this.f12403N;
        if (c1781c == null || c1781c.m8872f() != 2) {
            this.f12406Q.setIVRewardEnable(this.f12393D, this.f12394E, this.f12395F);
        } else {
            this.f12406Q.setIVRewardEnable(0, 0, 0);
        }
        this.f12406Q.setMute(this.f12390A);
        this.f12406Q.setDeveloperExtraData(this.f12411V);
        C1781c c1781c2 = this.f12403N;
        if (((c1781c2 != null && (c1794p = c1781c2.f10352aH) != null) || ((list = this.f12405P) != null && list.size() > 0 && this.f12405P.get(0) != null && (c1794p = this.f12405P.get(0).f10352aH) != null)) && !TextUtils.isEmpty(c1794p.m9234b()) && c1794p.m9233a() > 0) {
            C2333c c2333c = new C2333c(c1794p.m9234b(), c1794p.m9233a());
            if (c2333c.m11972b() < 0) {
                c2333c.m11970a(1);
            }
            this.f12431z = c2333c;
        }
        this.f12406Q.setReward(this.f12431z);
        this.f12406Q.setRewardUnitSetting(this.f12399J);
        this.f12406Q.setPlacementId(this.f12429x);
        this.f12406Q.setUserId(this.f12430y);
        this.f12406Q.setShowRewardListener(this.f12398I);
        this.f12406Q.setTempEventListener(this.f12427s);
        this.f12406Q.init(this);
        this.f12406Q.onCreate();
    }

    /* JADX INFO: renamed from: b */
    public void m10436b(C1781c c1781c) {
        C1781c c1781cM11833n;
        try {
            List<C2318c> list = this.f12404O;
            if (list != null && list.size() > 0) {
                for (C2318c c2318c : this.f12404O) {
                    if (c2318c != null && (c1781cM11833n = c2318c.m11833n()) != null && TextUtils.equals(c1781cM11833n.m10146aZ(), c1781c.m10146aZ()) && TextUtils.equals(c1781cM11833n.m8818Z(), c1781c.m8818Z())) {
                        this.f12402M = c2318c;
                    }
                }
            }
            this.f12396G = true;
            m10435b();
            ATTempContainer aTTempContainer = this.f12406Q;
            if (aTTempContainer != null) {
                aTTempContainer.setNotchPadding(this.f12419ad, this.f12415Z, this.f12417ab, this.f12416aa, this.f12418ac);
            }
        } catch (Exception e) {
            e.getMessage();
            m10439b("more offer to one offer exception");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10439b(String str) {
        InterfaceC2067h interfaceC2067h = this.f12398I;
        if (interfaceC2067h != null) {
            interfaceC2067h.mo10417a(str);
        }
        finish();
    }

    /* JADX INFO: renamed from: c */
    private int m10440c(String str) {
        return C1875i.m9684a(getApplicationContext(), str, "id");
    }

    /* JADX INFO: renamed from: c */
    private void m10442c() {
        C1794p c1794p;
        int iM10440c = m10440c("anythink_bt_container");
        if (iM10440c < 0) {
            m10439b("no anythink_webview_framelayout in anythink_more_offer_activity layout");
        }
        AnythinkBTContainer anythinkBTContainer = (AnythinkBTContainer) findViewById(iM10440c);
        this.f12407R = anythinkBTContainer;
        if (anythinkBTContainer == null) {
            m10439b("env error");
        }
        this.f12407R.setVisibility(0);
        InterfaceC2058a interfaceC2058aM10446d = m10446d();
        this.f12409T = interfaceC2058aM10446d;
        this.f12407R.setBTContainerCallback(interfaceC2058aM10446d);
        this.f12407R.setShowRewardVideoListener(this.f12398I);
        this.f12407R.setChoiceOneCallback(this.f12421af);
        this.f12407R.setCampaigns(this.f12405P);
        this.f12407R.setCampaignDownLoadTasks(this.f12404O);
        this.f12407R.setRewardUnitSetting(this.f12399J);
        this.f12407R.setUnitId(this.f12428w);
        this.f12407R.setPlacementId(this.f12429x);
        this.f12407R.setUserId(this.f12430y);
        this.f12407R.setActivity(this);
        this.f12407R.setDeveloperExtraData(this.f12411V);
        C1781c c1781c = this.f12403N;
        if (((c1781c != null && (c1794p = c1781c.f10352aH) != null) || (this.f12405P.get(0) != null && (c1794p = this.f12405P.get(0).f10352aH) != null)) && !TextUtils.isEmpty(c1794p.m9234b()) && c1794p.m9233a() > 0) {
            C2333c c2333c = new C2333c(c1794p.m9234b(), c1794p.m9233a());
            if (c2333c.m11972b() < 0) {
                c2333c.m11970a(1);
            }
            this.f12431z = c2333c;
        }
        this.f12407R.setReward(this.f12431z);
        this.f12407R.setIVRewardEnable(this.f12393D, this.f12394E, this.f12395F);
        this.f12407R.setIV(this.f12391B);
        this.f12407R.setMute(this.f12390A);
        this.f12407R.setJSFactory((C2309b) this.f13966u);
        this.f12407R.init(this);
        this.f12407R.onCreate();
    }

    /* JADX INFO: renamed from: c */
    private static void m10443c(C1781c c1781c) {
        if (c1781c != null) {
            if (!TextUtils.isEmpty(c1781c.m10151be())) {
                C1818b.m9427a(C1175n.m2059a().m2148f()).m9445c(c1781c.m10151be());
            }
            if (TextUtils.isEmpty(c1781c.m10150bd())) {
                return;
            }
            C1818b.m9427a(C1175n.m2059a().m2148f()).m9445c(c1781c.m10150bd());
        }
    }

    /* JADX INFO: renamed from: d */
    private int m10445d(String str) {
        return C1875i.m9684a(getApplicationContext(), str, "layout");
    }

    /* JADX INFO: renamed from: d */
    private InterfaceC2058a m10446d() {
        if (this.f12409T == null) {
            this.f12409T = new InterfaceC2058a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.4
                public C19684() {
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: a */
                public final void mo10467a() {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10415a();
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: a */
                public final void mo10468a(C1781c c1781c) {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10416a(c1781c);
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: a */
                public final void mo10469a(String str) {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10417a(str);
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: a */
                public final void mo10470a(boolean z, int i) {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10418a(z, i);
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: a */
                public final void mo10471a(boolean z, C2333c c2333c) {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10419a(z, c2333c);
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: b */
                public final void mo10472b() {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10420b();
                    }
                }

                @Override // com.anythink.expressad.video.p154bt.module.p156a.InterfaceC2058a
                /* JADX INFO: renamed from: c */
                public final void mo10473c() {
                    if (ATRewardVideoActivity.this.f12398I != null) {
                        ATRewardVideoActivity.this.f12398I.mo10421c();
                    }
                }
            };
        }
        return this.f12409T;
    }

    /* JADX INFO: renamed from: e */
    private void m10448e() {
        try {
            List<C1781c> list = this.f12405P;
            if (list != null && list.size() > 0) {
                Iterator<C1781c> it = this.f12405P.iterator();
                while (it.hasNext()) {
                    m10443c(it.next());
                }
            }
            C1781c c1781c = this.f12403N;
            if (c1781c != null) {
                m10443c(c1781c);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m10449f(ATRewardVideoActivity aTRewardVideoActivity) {
        aTRewardVideoActivity.f12396G = true;
        return true;
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity
    /* JADX INFO: renamed from: a */
    public final void mo5392a(int i, int i2, int i3, int i4, int i5) {
        this.f12415Z = i2;
        this.f12417ab = i3;
        this.f12416aa = i4;
        this.f12418ac = i5;
        this.f12419ad = i;
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.setNotchPadding(i, i2, i3, i4, i5);
        }
        C2070b.f13179e = i;
        C2070b.f13175a = i2;
        C2070b.f13176b = i3;
        C2070b.f13177c = i4;
        C2070b.f13178d = i5;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        int iM9684a = C1875i.m9684a(this, "anythink_reward_activity_close", C1875i.f11531f);
        int iM9684a2 = C1875i.m9684a(this, "anythink_reward_activity_stay", C1875i.f11531f);
        if (iM9684a > 1 && iM9684a2 > 1) {
            overridePendingTransition(iM9684a2, iM9684a);
        }
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f12406Q = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f12407R = null;
        }
        C1800b.m9367a().m9385c(this.f12428w + "_1");
        C1800b.m9367a().m9385c(this.f12428w + "_2");
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onBackPressed();
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onBackPressed();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f12406Q != null) {
            m10428a(configuration.orientation);
            this.f12406Q.onConfigurationChanged(configuration);
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        List<C1781c> listM11853a;
        List<C2318c> list;
        String strM8849ar = "";
        super.onCreate(bundle);
        C1404a.f6237x = true;
        C1773a.m8548c().m8553b(this);
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(f12376a);
            this.f12428w = stringExtra;
            if (stringExtra != null) {
                try {
                    listM11853a = C2320e.m11843a().m11853a(this.f12428w);
                } catch (Throwable unused) {
                }
            } else {
                listM11853a = null;
            }
            this.f12423o = listM11853a != null ? listM11853a.get(0) : null;
            Serializable serializableExtra = intent.getSerializableExtra(f12388m);
            this.f12422n = serializableExtra instanceof C1248m ? (C1248m) serializableExtra : null;
            m10431a("1", 0L);
            int iM9684a = C1875i.m9684a(getApplicationContext(), "anythink_more_offer_activity", "layout");
            if (iM9684a < 0) {
                m10439b("no anythink_more_offer_activity layout");
                return;
            }
            setContentView(iM9684a);
            if (TextUtils.isEmpty(this.f12428w)) {
                m10439b("data empty error");
                return;
            }
            this.f12398I = C1964a.f12301c.get(this.f12428w);
            this.f12429x = intent.getStringExtra(C1404a.f6238y);
            this.f12431z = C2333c.m11967b(intent.getStringExtra(f12378c));
            this.f12430y = intent.getStringExtra(f12377b);
            this.f12390A = intent.getIntExtra(f12379d, 2);
            this.f12391B = intent.getBooleanExtra(f12380e, false);
            this.f12392C = intent.getBooleanExtra(f12381f, false);
            this.f12411V = intent.getStringExtra(f12387l);
            if (this.f12391B) {
                this.f12393D = intent.getIntExtra(f12384i, 0);
                this.f12394E = intent.getIntExtra(f12385j, 0);
                this.f12395F = intent.getIntExtra(f12386k, 0);
            }
            C2309b c2309b = new C2309b(this);
            this.f13966u = c2309b;
            m11625a(c2309b);
            if (this.f12398I == null) {
                m10439b("showRewardListener is null");
                return;
            }
            C2340d c2340dM10327a = C1963e.m10326a().m10327a(this.f12429x, this.f12428w);
            this.f12399J = c2340dM10327a;
            if (c2340dM10327a == null) {
                C2340d c2340dM11999a = C2339c.m11994a().m11999a(C1773a.m8548c().m8558f(), this.f12428w);
                this.f12399J = c2340dM11999a;
                if (c2340dM11999a == null) {
                    this.f12399J = C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f12428w, this.f12391B);
                }
            }
            C2340d c2340d = this.f12399J;
            if (c2340d != null) {
                this.f12431z.m11970a(c2340d.m12095m());
                this.f12431z.m11971a(this.f12399J.m12096n());
            }
            C2333c c2333c = this.f12431z;
            if (c2333c != null && c2333c.m11972b() <= 0) {
                this.f12431z.m11970a(1);
            }
            int iM9684a2 = C1875i.m9684a(this, "anythink_reward_activity_open", C1875i.f11531f);
            int iM9684a3 = C1875i.m9684a(this, "anythink_reward_activity_stay", C1875i.f11531f);
            if (iM9684a2 > 1 && iM9684a3 > 1) {
                overridePendingTransition(iM9684a2, iM9684a3);
            }
            if (bundle != null) {
                try {
                    this.f12401L = bundle.getBoolean(f12383h);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f12404O = C2320e.m11843a().m11857b(this.f12428w);
            boolean booleanExtra = intent.getBooleanExtra(f12382g, false);
            this.f12396G = booleanExtra;
            if (!booleanExtra) {
                List<C2318c> list2 = this.f12404O;
                if (list2 != null && list2.size() > 0) {
                    this.f12402M = this.f12404O.get(0);
                }
                C2318c c2318c = this.f12402M;
                if (c2318c != null) {
                    this.f12403N = c2318c.m11833n();
                    this.f12402M.m11815a(true);
                    this.f12402M.m11817b(false);
                }
                if (this.f12402M == null || this.f12403N == null || this.f12431z == null) {
                    m10439b("data empty error");
                }
                m10435b();
                return;
            }
            List<C1781c> listM11853a2 = C2320e.m11843a().m11853a(this.f12428w);
            this.f12405P = listM11853a2;
            this.f12410U = "";
            if (listM11853a2 != null && listM11853a2.size() > 0) {
                C1781c c1781c = this.f12405P.get(0);
                strM8849ar = c1781c.m8849ar();
                this.f12410U = c1781c.m8818Z();
            }
            C2314a.a aVarM11740a = C2314a.m11740a(this.f12428w + "_" + this.f12410U + "_" + strM8849ar);
            WindVaneWebView windVaneWebViewM11758a = aVarM11740a != null ? aVarM11740a.m11758a() : null;
            this.f12408S = windVaneWebViewM11758a;
            if (windVaneWebViewM11758a != null) {
                m10442c();
                return;
            }
            if (this.f12402M == null && (list = this.f12404O) != null && list.size() > 0) {
                this.f12402M = this.f12404O.get(0);
            }
            if (this.f12402M == null) {
                C2320e c2320eM11843a = C2320e.m11843a();
                int i = this.f12391B ? C1801a.f11010aU : 94;
                String str = this.f12428w;
                boolean z = this.f12392C;
                C2329n c2329nM11860c = c2320eM11843a.m11860c(str);
                this.f12402M = c2329nM11860c != null ? c2329nM11860c.m11947b(i, z) : null;
            }
            C2318c c2318c2 = this.f12402M;
            if (c2318c2 != null) {
                this.f12403N = c2318c2.m11833n();
                this.f12402M.m11815a(true);
                this.f12402M.m11817b(false);
            }
            if (this.f12402M == null || this.f12403N == null || this.f12431z == null) {
                m10439b("data empty error");
            }
            this.f12396G = false;
            C2315a.m11764a();
            List<C1781c> listM11765a = C2315a.m11765a(this.f12405P);
            if (listM11765a == null) {
                m10439b("no available campaign");
                return;
            }
            int size = listM11765a.size();
            if (size == 0) {
                m10439b("no available campaign");
                return;
            }
            if (listM11765a.get(0) == null || !listM11765a.get(0).m8886j()) {
                m10435b();
                return;
            }
            if (size != 1) {
                m10432a(listM11765a);
                return;
            }
            C1781c c1781c2 = listM11765a.get(0);
            this.f12403N = c1781c2;
            if (c1781c2 != null) {
                c1781c2.m8893m();
            }
            m10436b(this.f12403N);
        } catch (Throwable th) {
            m10439b("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Throwable unused) {
        }
        try {
            List<C1781c> list = this.f12405P;
            if (list != null && list.size() > 0) {
                Iterator<C1781c> it = this.f12405P.iterator();
                while (it.hasNext()) {
                    m10443c(it.next());
                }
            }
            C1781c c1781c = this.f12403N;
            if (c1781c != null) {
                m10443c(c1781c);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        C2190a.m11528a(this.f12428w);
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f12406Q = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f12407R = null;
        }
        this.f12420ae = null;
        this.f12421af = null;
        C1865a.m9657a().execute(new RunnableC1970a(this.f12404O, this.f12428w, this.f12410U));
        List<C1781c> list2 = this.f12405P;
        C1781c c1781c2 = (list2 == null || list2.size() <= 0) ? null : this.f12405P.get(0);
        if (c1781c2 == null) {
            c1781c2 = this.f12403N;
        }
        if (c1781c2 != null && !TextUtils.isEmpty(c1781c2.m8811S())) {
            C1160l.m1996a().m2006b();
        }
        this.f12427s = null;
        if (this.f12422n != null) {
            C1318a.m3818a().m3819a(this.f12422n.f4323d + this.f12422n.f4322c);
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        long j = this.f12426r + 1;
        this.f12426r = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            InterfaceC1972b interfaceC1972b = this.f12427s;
            sb.append(interfaceC1972b != null ? interfaceC1972b.mo10461a() : "0");
            m10431a(sb.toString(), SystemClock.elapsedRealtime() - this.f12424p);
        }
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onPause();
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onRestart();
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onRestart();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f12424p = SystemClock.elapsedRealtime();
        long j = this.f12425q + 1;
        this.f12425q = j;
        if (j <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            InterfaceC1972b interfaceC1972b = this.f12427s;
            sb.append(interfaceC1972b != null ? interfaceC1972b.mo10461a() : "0");
            m10431a(sb.toString(), 0L);
        }
        if (C1800b.f10958c) {
            return;
        }
        C1773a.m8548c().m8553b(this);
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onResume();
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(f12383h, this.f12401L);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        new InterfaceC1798a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.5
            public C19695() {
            }

            @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
            /* JADX INFO: renamed from: a */
            public final void mo5503a() {
                ATRewardVideoActivity.this.onPause();
            }

            @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
            /* JADX INFO: renamed from: b */
            public final void mo5504b() {
                ATRewardVideoActivity.this.onResume();
            }

            @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
            /* JADX INFO: renamed from: c */
            public final void mo5505c() {
                ATRewardVideoActivity.this.onResume();
            }
        };
        if (C1800b.f10958c) {
            return;
        }
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onStart();
            this.f12403N.m8891l(this.f12428w);
            C1800b.m9367a().m9379a(this.f12428w + "_1", this.f12403N);
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStart();
            List<C1781c> list = this.f12405P;
            if (list != null && list.size() > 0) {
                C1781c c1781c = this.f12405P.get(0);
                c1781c.m8891l(this.f12428w);
                C1800b.m9367a().m9379a(this.f12428w + "_1", c1781c);
            }
        }
        if (this.f12412W) {
            return;
        }
        C1800b.m9367a().m9383b(this.f12428w + "_1", 1);
        C1800b.m9367a().m9385c(this.f12428w + "_2");
        this.f12412W = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        C1404a.f6237x = false;
        try {
            super.onStop();
        } catch (Throwable unused) {
        }
        ATTempContainer aTTempContainer = this.f12406Q;
        if (aTTempContainer != null) {
            aTTempContainer.onStop();
        }
        AnythinkBTContainer anythinkBTContainer = this.f12407R;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(C1875i.m9684a(this, "anythink_transparent_theme", C1875i.f11530e));
    }
}
