package com.anythink.expressad.reward.p146a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.multidex.MultiDexExtractor;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.p081a.C1441a;
import com.anythink.expressad.atsignalcommon.p081a.C1442b;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.exoplayer.C1575f;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1877k;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.reward.p146a.C1961c;
import com.anythink.expressad.reward.p146a.C1963e;
import com.anythink.expressad.reward.p147b.C1964a;
import com.anythink.expressad.reward.player.ATRewardVideoActivity;
import com.anythink.expressad.video.p154bt.module.p157b.InterfaceC2067h;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.C2314a;
import com.anythink.expressad.videocommon.p177a.C2315a;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p178b.C2325j;
import com.anythink.expressad.videocommon.p178b.C2327l;
import com.anythink.expressad.videocommon.p178b.C2328m;
import com.anythink.expressad.videocommon.p180d.InterfaceC2336c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.reward.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1962d implements InterfaceC1959a {

    /* JADX INFO: renamed from: L */
    private static final int f12123L = 8;

    /* JADX INFO: renamed from: M */
    private static final int f12124M = 9;

    /* JADX INFO: renamed from: N */
    private static final int f12125N = 16;

    /* JADX INFO: renamed from: O */
    private static final int f12126O = 17;

    /* JADX INFO: renamed from: P */
    private static final int f12127P = 5000;

    /* JADX INFO: renamed from: Q */
    private static final int f12128Q = 30000;

    /* JADX INFO: renamed from: a */
    public static final String f12129a = "APP ALREADY INSTALLED";

    /* JADX INFO: renamed from: b */
    public static final String f12130b = "Offer list is empty";

    /* JADX INFO: renamed from: d */
    public static final String f12131d = "1";

    /* JADX INFO: renamed from: e */
    public static final String f12132e = "1";

    /* JADX INFO: renamed from: f */
    public static final int f12133f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f12134g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f12135h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f12136i = 4;

    /* JADX INFO: renamed from: j */
    public static final int f12137j = 5;

    /* JADX INFO: renamed from: k */
    public static final int f12138k = 6;

    /* JADX INFO: renamed from: l */
    public static final int f12139l = 7;

    /* JADX INFO: renamed from: u */
    private static final String f12140u = "RewardMVVideoAdapter";

    /* JADX INFO: renamed from: A */
    private int f12141A;

    /* JADX INFO: renamed from: B */
    private int f12142B;

    /* JADX INFO: renamed from: C */
    private boolean f12143C;

    /* JADX INFO: renamed from: D */
    private String f12144D;

    /* JADX INFO: renamed from: E */
    private String f12145E;

    /* JADX INFO: renamed from: F */
    private InterfaceC2067h f12146F;

    /* JADX INFO: renamed from: G */
    private volatile InterfaceC1960b f12147G;

    /* JADX INFO: renamed from: H */
    private Runnable f12148H;

    /* JADX INFO: renamed from: I */
    private C2340d f12149I;

    /* JADX INFO: renamed from: T */
    private boolean f12154T;

    /* JADX INFO: renamed from: U */
    private boolean f12155U;

    /* JADX INFO: renamed from: W */
    private int f12157W;

    /* JADX INFO: renamed from: X */
    private int f12158X;

    /* JADX INFO: renamed from: Y */
    private int f12159Y;

    /* JADX INFO: renamed from: Z */
    private C1782d f12160Z;

    /* JADX INFO: renamed from: aa */
    private CopyOnWriteArrayList<C1781c> f12161aa;

    /* JADX INFO: renamed from: ag */
    private List<C1781c> f12167ag;

    /* JADX INFO: renamed from: ah */
    private List<C1781c> f12168ah;

    /* JADX INFO: renamed from: v */
    private Context f12178v;

    /* JADX INFO: renamed from: w */
    private String f12179w;

    /* JADX INFO: renamed from: x */
    private String f12180x;

    /* JADX INFO: renamed from: y */
    private int f12181y;

    /* JADX INFO: renamed from: z */
    private int f12182z;

    /* JADX INFO: renamed from: J */
    private boolean f12150J = false;

    /* JADX INFO: renamed from: K */
    private boolean f12151K = false;

    /* JADX INFO: renamed from: c */
    public Object f12169c = new Object();

    /* JADX INFO: renamed from: R */
    private CopyOnWriteArrayList<C1781c> f12152R = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: S */
    private int f12153S = 2;

    /* JADX INFO: renamed from: V */
    private String f12156V = "";

    /* JADX INFO: renamed from: ab */
    private boolean f12162ab = false;

    /* JADX INFO: renamed from: m */
    public String f12170m = "";

    /* JADX INFO: renamed from: n */
    public String f12171n = "";

    /* JADX INFO: renamed from: ac */
    private long f12163ac = 0;

    /* JADX INFO: renamed from: ad */
    private Handler f12164ad = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.reward.a.d.1
        /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r19) {
            /*
                Method dump skipped, instruction units count: 1200
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1962d.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f12172o = false;

    /* JADX INFO: renamed from: ae */
    private long f12165ae = 0;

    /* JADX INFO: renamed from: p */
    public volatile boolean f12173p = false;

    /* JADX INFO: renamed from: q */
    public volatile boolean f12174q = false;

    /* JADX INFO: renamed from: r */
    public volatile boolean f12175r = false;

    /* JADX INFO: renamed from: s */
    public volatile boolean f12176s = false;

    /* JADX INFO: renamed from: t */
    public volatile boolean f12177t = false;

    /* JADX INFO: renamed from: af */
    private String f12166af = "";

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$2, reason: invalid class name */
    public class AnonymousClass2 implements C1961c.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f12184a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1781c f12185b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f12186c;

        public AnonymousClass2(boolean z, C1781c c1781c, int i) {
            this.f12184a = z;
            this.f12185b = c1781c;
            this.f12186c = i;
        }

        @Override // com.anythink.expressad.reward.p146a.C1961c.c
        /* JADX INFO: renamed from: a */
        public final void mo10227a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<C1781c> copyOnWriteArrayList) {
            new StringBuilder("Campaign download sucess: ").append(copyOnWriteArrayList.size());
            C1962d.this.f12173p = true;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.size();
            }
            if (this.f12184a) {
                if (!C1962d.this.f12174q || C1962d.this.f12175r || C1962d.this.f12164ad == null) {
                    StringBuilder sb = new StringBuilder("Campaign download success:bid temp,big temp download fail: isCampaignTPLDownloadSuccess: ");
                    sb.append(C1962d.this.f12174q);
                    sb.append("  isCampaignTPLProLoad: ");
                    sb.append(C1962d.this.f12175r);
                    return;
                }
                synchronized (C1962d.this.f12169c) {
                    if (C1962d.this.f12175r) {
                        return;
                    }
                    C1962d.this.f12175r = true;
                    C1962d.this.f12164ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1961c c1961c = C1961c.m.f12122a;
                            boolean z = C1962d.this.f12162ab;
                            Handler handler = C1962d.this.f12164ad;
                            boolean z3 = C1962d.this.f12154T;
                            boolean z4 = C1962d.this.f12155U;
                            String str4 = str3;
                            AnonymousClass2.this.f12185b.m8832aa();
                            String str5 = C1962d.this.f12180x;
                            String str6 = str2;
                            String strM8849ar = AnonymousClass2.this.f12185b.m8849ar();
                            int i = C1962d.this.f12153S;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            c1961c.m10226a(z, handler, z3, z4, str4, str5, str6, strM8849ar, i, anonymousClass2.f12185b, C1962d.this.f12161aa, C2324i.m11867a().m11883c(AnonymousClass2.this.f12185b.m8849ar()), str2, C1962d.this.f12149I, new C1961c.j() { // from class: com.anythink.expressad.reward.a.d.2.2.1
                                @Override // com.anythink.expressad.reward.p146a.C1961c.j
                                /* JADX INFO: renamed from: a */
                                public final void mo10236a() {
                                    C1962d c1962d = C1962d.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = c1962d.f12161aa;
                                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                    if (!c1962d.m10318a(copyOnWriteArrayList2, anonymousClass22.f12184a, anonymousClass22.f12186c)) {
                                        List unused = C1962d.this.f12167ag;
                                        boolean unused2 = C1962d.this.f12155U;
                                        if (C1962d.this.f12164ad != null) {
                                            C1962d.this.f12164ad.removeMessages(5);
                                        }
                                        if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                                            return;
                                        }
                                        C1962d.this.f12177t = true;
                                        TextUtils.isEmpty(C1962d.this.f12179w);
                                        C1962d.this.f12147G.mo10206a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                        return;
                                    }
                                    String str7 = C1962d.this.f12179w;
                                    List list = C1962d.this.f12168ah;
                                    boolean unused3 = C1962d.this.f12155U;
                                    C1962d.m10252a(str7, list);
                                    if (C1962d.this.f12164ad != null) {
                                        C1962d.this.f12164ad.removeMessages(5);
                                    }
                                    if (C1962d.this.f12147G == null || C1962d.this.f12176s) {
                                        return;
                                    }
                                    C1962d.this.f12176s = true;
                                    TextUtils.isEmpty(C1962d.this.f12179w);
                                    C1962d.this.f12147G.mo10205a();
                                }

                                @Override // com.anythink.expressad.reward.p146a.C1961c.j
                                /* JADX INFO: renamed from: a */
                                public final void mo10237a(String str7) {
                                    if (AnonymousClass2.this.f12185b.m8827aB() == null || AnonymousClass2.this.f12185b.m8827aB().size() <= 0 || !AnonymousClass2.this.f12185b.m8827aB().contains(3)) {
                                        List unused = C1962d.this.f12167ag;
                                        boolean unused2 = C1962d.this.f12155U;
                                        if (C1962d.this.f12164ad != null) {
                                            C1962d.this.f12164ad.removeMessages(5);
                                        }
                                        if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                                            return;
                                        }
                                        C1962d.this.f12177t = true;
                                        C1962d.this.f12147G.mo10206a("errorCode: 3303 errorMessage: tpl temp preload failed: ".concat(String.valueOf(str7)));
                                    }
                                }
                            });
                        }
                    });
                    return;
                }
            }
            for (final C1781c c1781c : copyOnWriteArrayList) {
                if (c1781c == null || c1781c.m8805M() == null || TextUtils.isEmpty(c1781c.m8805M().m8957e()) || c1781c.m8805M().m8957e().contains(C1781c.f10327d) || C1962d.this.f12164ad == null) {
                    C1962d c1962d = C1962d.this;
                    if (c1962d.m10318a(c1962d.f12161aa, this.f12184a, this.f12186c)) {
                        new StringBuilder("模板加载成功 requestId ").append(copyOnWriteArrayList.get(0).m8818Z());
                        String str4 = C1962d.this.f12179w;
                        List list = C1962d.this.f12168ah;
                        boolean unused = C1962d.this.f12155U;
                        C1962d.m10252a(str4, list);
                        if (C1962d.this.f12164ad != null) {
                            C1962d.this.f12164ad.removeMessages(5);
                        }
                        if (C1962d.this.f12147G != null && !C1962d.this.f12176s) {
                            C1962d.this.f12176s = true;
                            TextUtils.isEmpty(C1962d.this.f12179w);
                            C1962d.this.f12147G.mo10205a();
                        }
                    } else {
                        new StringBuilder("temp load fail requestId ").append(copyOnWriteArrayList.get(0).m8818Z());
                        List unused2 = C1962d.this.f12167ag;
                        boolean unused3 = C1962d.this.f12155U;
                        if (C1962d.this.f12164ad != null) {
                            C1962d.this.f12164ad.removeMessages(5);
                        }
                        if (C1962d.this.f12147G != null && !C1962d.this.f12177t) {
                            C1962d.this.f12177t = true;
                            if (!TextUtils.isEmpty(C1962d.this.f12179w) && c1781c != null && !TextUtils.isEmpty(c1781c.m8832aa())) {
                                c1781c.m8832aa();
                            }
                            C1962d.this.f12147G.mo10206a("errorCode: 3503 errorMessage: have no temp but isReady false");
                        }
                    }
                } else {
                    C1962d.this.f12164ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1961c c1961c = C1961c.m.f12122a;
                            boolean z = C1962d.this.f12162ab;
                            Handler handler = C1962d.this.f12164ad;
                            boolean z3 = C1962d.this.f12154T;
                            boolean z4 = C1962d.this.f12155U;
                            String strM8957e = c1781c.m8805M().m8957e();
                            int i = C1962d.this.f12153S;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            C1781c c1781c2 = anonymousClass2.f12185b;
                            CopyOnWriteArrayList<C1781c> copyOnWriteArrayList2 = C1962d.this.f12161aa;
                            String strM11883c = C2324i.m11867a().m11883c(c1781c.m8805M().m8957e());
                            String str5 = str;
                            String str6 = str2;
                            String str7 = str3;
                            c1781c.m8832aa();
                            c1961c.m10225a(z, handler, z3, z4, (WindVaneWebView) null, strM8957e, i, c1781c2, copyOnWriteArrayList2, strM11883c, str5, str6, str7, C1962d.this.f12149I, new C1961c.j() { // from class: com.anythink.expressad.reward.a.d.2.1.1
                                @Override // com.anythink.expressad.reward.p146a.C1961c.j
                                /* JADX INFO: renamed from: a */
                                public final void mo10236a() {
                                    C1962d c1962d2 = C1962d.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList3 = c1962d2.f12161aa;
                                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                    if (!c1962d2.m10318a(copyOnWriteArrayList3, anonymousClass22.f12184a, anonymousClass22.f12186c)) {
                                        List unused4 = C1962d.this.f12167ag;
                                        boolean unused5 = C1962d.this.f12155U;
                                        if (C1962d.this.f12164ad != null) {
                                            C1962d.this.f12164ad.removeMessages(5);
                                        }
                                        if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                                            return;
                                        }
                                        C1962d.this.f12177t = true;
                                        TextUtils.isEmpty(C1962d.this.f12179w);
                                        C1962d.this.f12147G.mo10206a("errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        return;
                                    }
                                    String str8 = C1962d.this.f12179w;
                                    List list2 = C1962d.this.f12168ah;
                                    boolean unused6 = C1962d.this.f12155U;
                                    C1962d.m10252a(str8, list2);
                                    if (C1962d.this.f12164ad != null) {
                                        C1962d.this.f12164ad.removeMessages(5);
                                    }
                                    if (C1962d.this.f12147G == null || C1962d.this.f12176s) {
                                        return;
                                    }
                                    C1962d.this.f12176s = true;
                                    TextUtils.isEmpty(C1962d.this.f12179w);
                                    C1962d.this.f12147G.mo10205a();
                                }

                                @Override // com.anythink.expressad.reward.p146a.C1961c.j
                                /* JADX INFO: renamed from: a */
                                public final void mo10237a(String str8) {
                                    if (AnonymousClass2.this.f12185b.m8827aB() == null || AnonymousClass2.this.f12185b.m8827aB().size() <= 0 || !AnonymousClass2.this.f12185b.m8827aB().contains(1)) {
                                        List unused4 = C1962d.this.f12167ag;
                                        boolean unused5 = C1962d.this.f12155U;
                                        if (C1962d.this.f12164ad != null) {
                                            C1962d.this.f12164ad.removeMessages(5);
                                        }
                                        if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                                            return;
                                        }
                                        C1962d.this.f12177t = true;
                                        TextUtils.isEmpty(C1962d.this.f12179w);
                                        C1962d.this.f12147G.mo10206a("errorCode: 3301 errorMessage: temp preload failed: ".concat(String.valueOf(str8)));
                                    }
                                }
                            });
                        }
                    });
                }
            }
        }

        @Override // com.anythink.expressad.reward.p146a.C1961c.c
        /* JADX INFO: renamed from: a */
        public final void mo10228a(final String str, CopyOnWriteArrayList<C1781c> copyOnWriteArrayList) {
            new StringBuilder("Campaign download fail: ").append(copyOnWriteArrayList.size());
            C1962d.this.f12173p = false;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.size();
            }
            if (C1962d.this.f12147G == null || C1962d.this.f12164ad == null) {
                return;
            }
            C1962d.this.f12164ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.3
                @Override // java.lang.Runnable
                public final void run() {
                    List unused = C1962d.this.f12167ag;
                    boolean unused2 = C1962d.this.f12155U;
                    if (C1962d.this.f12164ad != null) {
                        C1962d.this.f12164ad.removeMessages(5);
                    }
                    if (C1962d.this.f12177t || C1962d.this.f12147G == null) {
                        return;
                    }
                    C1962d.this.f12177t = true;
                    TextUtils.isEmpty(C1962d.this.f12179w);
                    C1962d.this.f12147G.mo10206a("errorCode: 3201 errorMessage: campaign resource download failed");
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$4, reason: invalid class name */
    public class AnonymousClass4 implements C1961c.i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1781c f12210a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f12211b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f12212c;

        public AnonymousClass4(C1781c c1781c, boolean z, int i) {
            this.f12210a = c1781c;
            this.f12211b = z;
            this.f12212c = i;
        }

        @Override // com.anythink.expressad.reward.p146a.C1961c.i
        /* JADX INFO: renamed from: a */
        public final void mo10234a(String str) {
            if (C1962d.this.f12167ag.get(0) != null) {
                C1962d.this.f12167ag.size();
            }
            if (this.f12210a.m8827aB() != null && this.f12210a.m8827aB().size() > 0) {
                if (this.f12210a.m8827aB().contains(3)) {
                    return;
                }
                if (this.f12210a.m8849ar().equals(this.f12210a.m8801I()) && this.f12210a.m8827aB().contains(2)) {
                    return;
                }
            }
            C1962d.this.f12174q = false;
            List unused = C1962d.this.f12167ag;
            boolean unused2 = C1962d.this.f12155U;
            if (C1962d.this.f12164ad != null) {
                C1962d.this.f12164ad.removeMessages(5);
            }
            if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                return;
            }
            C1962d.this.f12177t = true;
            C1962d.this.f12147G.mo10206a("errorCode: 3203 errorMessage: tpl temp resource download failed");
        }

        @Override // com.anythink.expressad.reward.p146a.C1961c.i
        /* JADX INFO: renamed from: a */
        public final void mo10235a(final String str, final String str2, final String str3) {
            C1962d.this.f12174q = true;
            if (!C1962d.this.f12173p || C1962d.this.f12175r || C1962d.this.f12164ad == null) {
                StringBuilder sb = new StringBuilder("bid temp,big temp download success，Campaign 下载不成功，isCampaignsDownloadSuccess: ");
                sb.append(C1962d.this.f12173p);
                sb.append("  isCampaignTPLProLoad: ");
                sb.append(C1962d.this.f12175r);
                return;
            }
            synchronized (C1962d.this.f12169c) {
                if (C1962d.this.f12175r) {
                    return;
                }
                C1962d.this.f12175r = true;
                C1962d.this.f12164ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1961c c1961c = C1961c.m.f12122a;
                        boolean z = C1962d.this.f12162ab;
                        Handler handler = C1962d.this.f12164ad;
                        boolean z3 = C1962d.this.f12154T;
                        boolean z4 = C1962d.this.f12155U;
                        String str4 = str3;
                        AnonymousClass4.this.f12210a.m8832aa();
                        String str5 = str;
                        String str6 = str2;
                        String strM8849ar = AnonymousClass4.this.f12210a.m8849ar();
                        int i = C1962d.this.f12153S;
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        c1961c.m10226a(z, handler, z3, z4, str4, str5, str6, strM8849ar, i, anonymousClass4.f12210a, C1962d.this.f12161aa, C2324i.m11867a().m11883c(AnonymousClass4.this.f12210a.m8849ar()), str2, C1962d.this.f12149I, new C1961c.j() { // from class: com.anythink.expressad.reward.a.d.4.1.1
                            @Override // com.anythink.expressad.reward.p146a.C1961c.j
                            /* JADX INFO: renamed from: a */
                            public final void mo10236a() {
                                C1962d c1962d = C1962d.this;
                                CopyOnWriteArrayList copyOnWriteArrayList = c1962d.f12161aa;
                                AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                if (!c1962d.m10318a(copyOnWriteArrayList, anonymousClass42.f12211b, anonymousClass42.f12212c)) {
                                    List unused = C1962d.this.f12167ag;
                                    boolean unused2 = C1962d.this.f12155U;
                                    if (C1962d.this.f12164ad != null) {
                                        C1962d.this.f12164ad.removeMessages(5);
                                    }
                                    if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                                        return;
                                    }
                                    C1962d.this.f12177t = true;
                                    C1962d.this.f12147G.mo10206a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                    return;
                                }
                                String str7 = C1962d.this.f12179w;
                                List unused3 = C1962d.this.f12167ag;
                                List list = C1962d.this.f12168ah;
                                boolean unused4 = C1962d.this.f12155U;
                                C1962d.m10252a(str7, list);
                                if (C1962d.this.f12164ad != null) {
                                    C1962d.this.f12164ad.removeMessages(5);
                                }
                                if (C1962d.this.f12147G == null || C1962d.this.f12176s) {
                                    return;
                                }
                                C1962d.this.f12176s = true;
                                TextUtils.isEmpty(C1962d.this.f12179w);
                                C1962d.this.f12147G.mo10205a();
                            }

                            @Override // com.anythink.expressad.reward.p146a.C1961c.j
                            /* JADX INFO: renamed from: a */
                            public final void mo10237a(String str7) {
                                List unused = C1962d.this.f12167ag;
                                boolean unused2 = C1962d.this.f12155U;
                                if (C1962d.this.f12164ad != null) {
                                    C1962d.this.f12164ad.removeMessages(5);
                                }
                                if (C1962d.this.f12147G == null || C1962d.this.f12177t) {
                                    return;
                                }
                                C1962d.this.f12177t = true;
                                C1962d.this.f12147G.mo10206a("errorCode: 3303 errorMessage: tpl temp preload failed: ".concat(String.valueOf(str7)));
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1782d f12219a;

        public AnonymousClass5(C1782d c1782d) {
            this.f12219a = c1782d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<C1781c> arrayList;
            C1782d c1782d = this.f12219a;
            if (c1782d == null || (arrayList = c1782d.f10572J) == null || arrayList.size() <= 0) {
                return;
            }
            C1962d.m10247a(C1962d.this, this.f12219a.f10572J);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$a */
    public static class a extends C1441a {

        /* JADX INFO: renamed from: b */
        private C1962d f12221b;

        /* JADX INFO: renamed from: c */
        private String f12222c;

        /* JADX INFO: renamed from: d */
        private String f12223d;

        /* JADX INFO: renamed from: e */
        private C2314a.a f12224e;

        /* JADX INFO: renamed from: f */
        private C1781c f12225f;

        /* JADX INFO: renamed from: g */
        private boolean f12226g;

        /* JADX INFO: renamed from: h */
        private boolean f12227h;

        /* JADX INFO: renamed from: i */
        private g f12228i;

        /* JADX INFO: renamed from: j */
        private Handler f12229j;

        public a(String str, String str2, C2314a.a aVar, C1781c c1781c, C1962d c1962d, g gVar, Handler handler) {
            this.f12222c = str;
            this.f12223d = str2;
            this.f12224e = aVar;
            if (c1962d != null) {
                this.f12221b = c1962d;
            }
            this.f12225f = c1781c;
            this.f12228i = gVar;
            this.f12229j = handler;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
        /* JADX INFO: renamed from: a */
        public final String mo5574a(String str) {
            return C2324i.m11867a().m11883c(str);
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1462c
        /* JADX INFO: renamed from: a */
        public final void mo5577a(String str, int i, int i2) {
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f12226g) {
                return;
            }
            C1469j.m5701a();
            C1469j.m5704b(webView);
            this.f12226g = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            try {
                C1962d c1962d = this.f12221b;
                if (c1962d != null) {
                    synchronized (c1962d) {
                        C1962d.m10246a(this.f12221b, str, str2);
                        this.f12221b = null;
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1441a, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            Handler handler;
            if (this.f12227h) {
                return;
            }
            g gVar = this.f12228i;
            if (gVar != null && (handler = this.f12229j) != null) {
                handler.removeCallbacks(gVar);
            }
            C2327l.m11891a().m11908c(this.f12222c, true);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12223d);
            sb.append("_");
            sb.append(this.f12222c);
            C2314a.a aVar = this.f12224e;
            if (aVar != null) {
                aVar.m11761a(true);
            }
            this.f12227h = true;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$b */
    public static final class b implements InterfaceC2336c {

        /* JADX INFO: renamed from: a */
        private C1962d f12230a;

        /* JADX INFO: renamed from: b */
        private C1781c f12231b;

        public b(C1962d c1962d, C1781c c1781c) {
            this.f12230a = c1962d;
            this.f12231b = c1781c;
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5460a(String str) {
            try {
                C2327l.m11891a().m11903a(str, true);
                C1962d c1962d = this.f12230a;
                if (c1962d != null) {
                    synchronized (c1962d) {
                        C1962d c1962d2 = this.f12230a;
                        if (c1962d2 != null && c1962d2.mo10203c() && this.f12230a.f12164ad != null) {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.obj = this.f12231b;
                            this.f12230a.f12164ad.sendMessage(messageObtain);
                            this.f12230a.f12164ad.removeMessages(5);
                            this.f12230a = null;
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2336c
        /* JADX INFO: renamed from: a */
        public final void mo5461a(String str, String str2) {
            try {
                C1962d c1962d = this.f12230a;
                if (c1962d != null) {
                    synchronized (c1962d) {
                        C1962d.m10246a(this.f12230a, str, str2);
                        this.f12230a = null;
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$c */
    public static final class c implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        private C1962d f12232a;

        /* JADX INFO: renamed from: b */
        private C1781c f12233b;

        /* JADX INFO: renamed from: c */
        private String f12234c;

        public c(C1962d c1962d, C1781c c1781c, String str) {
            this.f12232a = c1962d;
            this.f12233b = c1781c;
            this.f12234c = str;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$d */
    public static class d implements C2324i.b {

        /* JADX INFO: renamed from: a */
        private C1781c f12235a;

        /* JADX INFO: renamed from: b */
        private String f12236b;

        /* JADX INFO: renamed from: c */
        private C2340d f12237c;

        /* JADX INFO: renamed from: d */
        private C1962d f12238d;

        public d(C1962d c1962d, C1781c c1781c, String str, C2340d c2340d) {
            this.f12235a = c1781c;
            this.f12236b = str;
            this.f12237c = c2340d;
            this.f12238d = c1962d;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            C1962d c1962d = this.f12238d;
            if (c1962d != null) {
                c1962d.m10241a(this.f12235a, str, this.f12236b, this.f12237c);
            }
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            C1962d c1962d = this.f12238d;
            if (c1962d != null) {
                C1962d.m10246a(c1962d, "TemplateUrl source download failed", str);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$e */
    public static final class e implements InterfaceC1819c {

        /* JADX INFO: renamed from: a */
        private C1962d f12239a;

        /* JADX INFO: renamed from: b */
        private C1781c f12240b;

        /* JADX INFO: renamed from: c */
        private String f12241c;

        public e(C1962d c1962d, C1781c c1781c, String str) {
            this.f12239a = c1962d;
            this.f12240b = c1781c;
            this.f12241c = str;
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            try {
                C2327l.m11891a();
                C2327l.m11898c(str);
                C1962d c1962d = this.f12239a;
                if (c1962d != null) {
                    synchronized (c1962d) {
                        if (this.f12239a.mo10203c() && this.f12239a.f12164ad != null) {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.obj = this.f12240b;
                            this.f12239a.f12164ad.sendMessage(messageObtain);
                            this.f12239a.f12164ad.removeMessages(5);
                            this.f12239a = null;
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            try {
                C1962d c1962d = this.f12239a;
                if (c1962d != null) {
                    synchronized (c1962d) {
                        C1962d.m10246a(this.f12239a, str, str2);
                        this.f12239a = null;
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$f */
    public static final class f implements C2324i.b {

        /* JADX INFO: renamed from: a */
        private C1962d f12242a;

        /* JADX INFO: renamed from: b */
        private C1781c f12243b;

        /* JADX INFO: renamed from: c */
        private long f12244c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d */
        private String f12245d;

        /* JADX INFO: renamed from: e */
        private boolean f12246e;

        public f(C1962d c1962d, C1781c c1781c, String str, boolean z) {
            this.f12246e = true;
            this.f12245d = str;
            this.f12242a = c1962d;
            this.f12243b = c1781c;
            this.f12246e = z;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            try {
                if (this.f12242a.f12164ad != null) {
                    StringBuilder sb = new StringBuilder("H5SourceDownloadListener source code download success cid:");
                    sb.append(this.f12243b.m10146aZ());
                    sb.append("  url:");
                    sb.append(str);
                    this.f12242a.f12164ad.removeMessages(5);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 8;
                    messageObtain.obj = this.f12243b;
                    this.f12242a.f12164ad.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            try {
                StringBuilder sb = new StringBuilder("H5SourceDownloadListener source code download fail cid:");
                sb.append(this.f12243b.m10146aZ());
                sb.append("  url:");
                sb.append(str);
                C1962d c1962d = this.f12242a;
                if (c1962d != null) {
                    C1962d.m10246a(c1962d, "H5 code resource download failed ", str);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: b */
        private String f12248b;

        /* JADX INFO: renamed from: c */
        private C1781c f12249c;

        /* JADX INFO: renamed from: d */
        private String f12250d;

        /* JADX INFO: renamed from: e */
        private String f12251e;

        /* JADX INFO: renamed from: f */
        private C2340d f12252f;

        /* JADX INFO: renamed from: g */
        private int f12253g;

        /* JADX INFO: renamed from: h */
        private C1962d f12254h;

        public g(String str, C1781c c1781c, String str2, String str3, C2340d c2340d, int i, C1962d c1962d) {
            this.f12248b = str;
            this.f12249c = c1781c;
            this.f12250d = str2;
            this.f12251e = str3;
            this.f12252f = c2340d;
            this.f12253g = i;
            this.f12254h = c1962d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                new StringBuilder("retry load tpl url = ").append(this.f12250d);
                C2314a.a aVar = new C2314a.a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C1175n.m2059a().m2148f());
                aVar.m11759a(windVaneWebView);
                C2024c.m10829a();
                String strM10842b = C2024c.m10842b();
                aVar.m11760a(strM10842b);
                C2202j c2202j = (C1962d.this.f12160Z.f10572J == null || C1962d.this.f12160Z.f10572J.size() <= 0) ? new C2202j(null, this.f12249c) : new C2202j(null, this.f12249c, C1962d.this.f12160Z.f10572J);
                c2202j.mo11550a(this.f12253g);
                c2202j.mo11556a(this.f12251e);
                c2202j.m11614c(strM10842b);
                c2202j.mo11555a(this.f12252f);
                c2202j.m11613b(C1962d.this.f12162ab);
                windVaneWebView.setWebViewListener(new a(this.f12250d, this.f12248b, aVar, this.f12249c, this.f12254h, null, null));
                windVaneWebView.setObject(c2202j);
                windVaneWebView.loadUrl(this.f12250d);
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: b */
        private WindVaneWebView f12256b;

        /* JADX INFO: renamed from: c */
        private String f12257c;

        /* JADX INFO: renamed from: d */
        private C1781c f12258d;

        /* JADX INFO: renamed from: e */
        private List<C1781c> f12259e;

        /* JADX INFO: renamed from: f */
        private String f12260f;

        /* JADX INFO: renamed from: g */
        private String f12261g;

        /* JADX INFO: renamed from: h */
        private C2340d f12262h;

        /* JADX INFO: renamed from: i */
        private int f12263i;

        /* JADX INFO: renamed from: j */
        private C1962d f12264j;

        public h(WindVaneWebView windVaneWebView, String str, C1781c c1781c, List<C1781c> list, String str2, String str3, C2340d c2340d, int i, C1962d c1962d) {
            this.f12256b = windVaneWebView;
            this.f12257c = str;
            this.f12258d = c1781c;
            this.f12259e = list;
            this.f12260f = str2;
            this.f12261g = str3;
            this.f12262h = c2340d;
            this.f12263i = i;
            this.f12264j = c1962d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                new StringBuilder("retry load template url = ").append(this.f12260f);
                C2314a.a aVar = new C2314a.a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C1175n.m2059a().m2148f());
                aVar.m11759a(windVaneWebView);
                List<C1781c> list = this.f12259e;
                C2202j c2202j = (list == null || list.size() <= 0) ? new C2202j(null, this.f12258d) : new C2202j(null, this.f12258d, this.f12259e);
                c2202j.mo11550a(this.f12263i);
                c2202j.mo11556a(this.f12261g);
                c2202j.mo11555a(this.f12262h);
                c2202j.m11613b(C1962d.this.f12162ab);
                windVaneWebView.setWebViewListener(new j(this.f12256b, this.f12260f, this.f12257c, aVar, this.f12258d, this.f12264j, null, null));
                windVaneWebView.setObject(c2202j);
                windVaneWebView.loadUrl(this.f12260f);
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$i */
    public static final class i implements C2324i.d {

        /* JADX INFO: renamed from: a */
        public static final int f12265a = 497;

        /* JADX INFO: renamed from: b */
        public static final int f12266b = 859;

        /* JADX INFO: renamed from: c */
        public static final int f12267c = 313;

        /* JADX INFO: renamed from: d */
        public static final int f12268d = 502;

        /* JADX INFO: renamed from: e */
        private C1781c f12269e;

        /* JADX INFO: renamed from: f */
        private C1962d f12270f;

        /* JADX INFO: renamed from: g */
        private long f12271g = System.currentTimeMillis();

        /* JADX INFO: renamed from: h */
        private String f12272h;

        /* JADX INFO: renamed from: i */
        private int f12273i;

        /* JADX INFO: renamed from: j */
        private C2340d f12274j;

        /* JADX INFO: renamed from: k */
        private boolean f12275k;

        public i(C1781c c1781c, C1962d c1962d, String str, int i, C2340d c2340d, boolean z) {
            this.f12273i = 0;
            this.f12275k = true;
            this.f12272h = str;
            this.f12269e = c1781c;
            this.f12273i = i;
            this.f12274j = c2340d;
            this.f12270f = c1962d;
            this.f12275k = z;
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5464a(String str) {
            C1796r c1796r;
            String str2;
            Context context;
            String str3;
            try {
                C2327l.m11891a().m11906b(str, true);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f12271g;
                int i = this.f12273i;
                if (i != 497) {
                    if (i == 859) {
                        c1796r = new C1796r();
                        c1796r.m9326h(C1796r.f10874m);
                        if (this.f12270f != null) {
                            if (TextUtils.isEmpty(this.f12269e.m8849ar())) {
                                this.f12270f.m10241a(this.f12269e, str, this.f12272h, this.f12274j);
                            }
                            Context context2 = this.f12270f.f12178v;
                            if (context2 != null) {
                                context2.getApplicationContext();
                                c1796r.m9319c(C1877k.m9690a());
                            }
                        }
                        c1796r.m9321d(1);
                        C1781c c1781c = this.f12269e;
                        if (c1781c != null) {
                            c1796r.m9325g(c1781c.m10146aZ());
                            c1796r.m9322d(this.f12269e.m8818Z());
                            c1796r.m9323e(this.f12269e.m8832aa());
                        }
                        c1796r.m9318b(str);
                        c1796r.m9327i("");
                        str2 = this.f12272h;
                    } else if (i == 502) {
                        c1796r = new C1796r();
                        c1796r.m9326h(C1796r.f10874m);
                        C1962d c1962d = this.f12270f;
                        if (c1962d != null && (context = c1962d.f12178v) != null) {
                            context.getApplicationContext();
                            c1796r.m9319c(C1877k.m9690a());
                        }
                        c1796r.m9321d(1);
                        C1781c c1781c2 = this.f12269e;
                        if (c1781c2 != null) {
                            c1796r.m9325g(c1781c2.m10146aZ());
                            c1796r.m9322d(this.f12269e.m8818Z());
                            c1796r.m9323e(this.f12269e.m8832aa());
                        }
                        c1796r.m9318b(str);
                        c1796r.m9327i("");
                        str2 = this.f12272h;
                    } else if (i == 313) {
                        return;
                    }
                    c1796r.m9324f(str2);
                } else if (this.f12275k) {
                    C1796r c1796r2 = new C1796r(C1796r.f10872k, 14, String.valueOf(jCurrentTimeMillis), str, this.f12269e.m10146aZ(), this.f12272h, "", "1");
                    c1796r2.m9322d(this.f12269e.m8818Z());
                    c1796r2.m9323e(this.f12269e.m8832aa());
                    c1796r2.m9325g(this.f12269e.m10146aZ());
                    c1796r2.m9317b(this.f12269e.m8872f());
                    if (this.f12269e.m8913w() != 287) {
                        str3 = this.f12269e.m8913w() == 94 ? "1" : "3";
                    }
                    c1796r2.m9316a(str3);
                }
                C1962d c1962d2 = this.f12270f;
                if (c1962d2 != null) {
                    synchronized (c1962d2) {
                        if (this.f12270f.mo10203c() && this.f12270f.f12164ad != null) {
                            this.f12270f.f12164ad.sendEmptyMessage(6);
                            this.f12270f.f12164ad.removeMessages(5);
                            this.f12270f = null;
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.videocommon.p178b.C2324i.a
        /* JADX INFO: renamed from: a */
        public final void mo5465a(String str, String str2) {
            Context context;
            String str3;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f12271g;
                int i = this.f12273i;
                if (i == 497) {
                    if (this.f12275k) {
                        C1796r c1796r = new C1796r(C1796r.f10872k, 3, String.valueOf(jCurrentTimeMillis), str2, this.f12269e.m10146aZ(), this.f12272h, "zip download failed", "1");
                        c1796r.m9322d(this.f12269e.m8818Z());
                        c1796r.m9323e(this.f12269e.m8832aa());
                        c1796r.m9325g(this.f12269e.m10146aZ());
                        c1796r.m9317b(this.f12269e.m8872f());
                        if (this.f12269e.m8913w() != 287) {
                            str3 = this.f12269e.m8913w() == 94 ? "1" : "3";
                        }
                        c1796r.m9316a(str3);
                    }
                } else if (i == 859) {
                    C1796r c1796r2 = new C1796r();
                    c1796r2.m9326h(C1796r.f10874m);
                    C1962d c1962d = this.f12270f;
                    if (c1962d != null && (context = c1962d.f12178v) != null) {
                        context.getApplicationContext();
                        c1796r2.m9319c(C1877k.m9690a());
                    }
                    c1796r2.m9321d(3);
                    C1781c c1781c = this.f12269e;
                    if (c1781c != null) {
                        c1796r2.m9325g(c1781c.m10146aZ());
                        c1796r2.m9322d(this.f12269e.m8818Z());
                        c1796r2.m9323e(this.f12269e.m8832aa());
                    }
                    c1796r2.m9318b(str2);
                    c1796r2.m9327i(str);
                    c1796r2.m9324f(this.f12272h);
                } else if (i == 313) {
                    return;
                }
                C1962d c1962d2 = this.f12270f;
                if (c1962d2 != null) {
                    C1962d.m10246a(c1962d2, str, str2);
                }
            } catch (Exception e) {
                try {
                    C1962d c1962d3 = this.f12270f;
                    if (c1962d3 != null) {
                        c1962d3.m10261b("clear error info failed");
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                e.getMessage();
            }
            if (this.f12270f != null) {
                this.f12270f = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.d$j */
    public static class j extends C1442b {

        /* JADX INFO: renamed from: a */
        public static final int f12276a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f12277b = 1;

        /* JADX INFO: renamed from: c */
        private C1962d f12278c;

        /* JADX INFO: renamed from: e */
        private WindVaneWebView f12279e;

        /* JADX INFO: renamed from: f */
        private String f12280f;

        /* JADX INFO: renamed from: g */
        private String f12281g;

        /* JADX INFO: renamed from: h */
        private C2314a.a f12282h;

        /* JADX INFO: renamed from: i */
        private C1781c f12283i;

        /* JADX INFO: renamed from: j */
        private boolean f12284j;

        /* JADX INFO: renamed from: k */
        private boolean f12285k;

        /* JADX INFO: renamed from: l */
        private h f12286l;

        /* JADX INFO: renamed from: m */
        private Handler f12287m;

        public j(WindVaneWebView windVaneWebView, String str, String str2, C2314a.a aVar, C1781c c1781c, C1962d c1962d, h hVar, Handler handler) {
            this.f12279e = windVaneWebView;
            this.f12280f = str;
            this.f12281g = str2;
            this.f12282h = aVar;
            if (c1962d != null) {
                this.f12278c = c1962d;
            }
            this.f12283i = c1781c;
            this.f12286l = hVar;
            this.f12287m = handler;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f12284j) {
                return;
            }
            C1469j.m5701a();
            C1469j.m5704b(webView);
            this.f12284j = true;
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            try {
                C1962d c1962d = this.f12278c;
                if (c1962d != null) {
                    synchronized (c1962d) {
                        C1962d.m10246a(this.f12278c, str, str2);
                        this.f12278c = null;
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.p081a.C1442b, com.anythink.expressad.atsignalcommon.windvane.InterfaceC1464e
        public final void readyState(WebView webView, int i) {
            int i2;
            Handler handler;
            if (this.f12285k) {
                return;
            }
            h hVar = this.f12286l;
            if (hVar != null && (handler = this.f12287m) != null) {
                handler.removeCallbacks(hVar);
            }
            String str = this.f12281g + "_" + this.f12280f;
            C2314a.a aVar = this.f12282h;
            if (aVar != null) {
                aVar.m11761a(true);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", 1);
                jSONObject.put("id", str);
                jSONObject.put("unitid", this.f12281g);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C2327l.m11891a().m11908c(this.f12280f, true);
            C1962d c1962d = this.f12278c;
            if (c1962d == null || !c1962d.f12154T) {
                if (this.f12283i.m8793A()) {
                    i2 = 94;
                    C2314a.m11744a(i2, this.f12283i.m8832aa(), this.f12282h);
                }
            } else if (this.f12283i.m8793A()) {
                i2 = C1801a.f11010aU;
                C2314a.m11744a(i2, this.f12283i.m8832aa(), this.f12282h);
            }
            try {
                C1962d c1962d2 = this.f12278c;
                if (c1962d2 != null) {
                    synchronized (c1962d2) {
                        C1962d c1962d3 = this.f12278c;
                        if (c1962d3 != null && c1962d3.mo10203c() && this.f12278c.f12164ad != null) {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.obj = this.f12283i;
                            this.f12278c.f12164ad.sendMessage(messageObtain);
                            this.f12278c.f12164ad.removeMessages(5);
                            this.f12278c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            this.f12285k = true;
        }
    }

    public C1962d(Context context, String str, String str2) {
        try {
            this.f12178v = context.getApplicationContext();
            this.f12179w = str2;
            this.f12180x = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10240a(WindVaneWebView windVaneWebView, String str, C1781c c1781c, List<C1781c> list, String str2, String str3, C2340d c2340d) {
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C1175n.m2059a().m2148f());
            aVar.m11759a(windVaneWebView2);
            C2202j c2202j = (list == null || list.size() <= 0) ? new C2202j(null, c1781c) : new C2202j(null, c1781c, list);
            c2202j.mo11550a(this.f12153S);
            c2202j.mo11556a(str3);
            c2202j.mo11555a(c2340d);
            c2202j.m11613b(this.f12162ab);
            h hVar = new h(windVaneWebView, str3, c1781c, list, str2, str3, c2340d, this.f12153S, this);
            windVaneWebView2.setWebViewListener(new j(windVaneWebView, str, str3, aVar, c1781c, this, hVar, this.f12164ad));
            windVaneWebView2.setObject(c2202j);
            windVaneWebView2.loadUrl(str2);
            this.f12164ad.postDelayed(hVar, C1575f.f8394a);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10241a(C1781c c1781c, String str, String str2, C2340d c2340d) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strM11883c = C2324i.m11867a().m11883c(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 16;
            messageObtain.obj = new Object[]{c1781c, strM11883c, str2, c2340d, str};
            Handler handler = this.f12164ad;
            if (handler != null) {
                handler.sendMessage(messageObtain);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10242a(C1962d c1962d, WindVaneWebView windVaneWebView, String str, C1781c c1781c, List list, String str2, String str3, C2340d c2340d) {
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C1175n.m2059a().m2148f());
            aVar.m11759a(windVaneWebView2);
            C2202j c2202j = (list == null || list.size() <= 0) ? new C2202j(null, c1781c) : new C2202j(null, c1781c, list);
            c2202j.mo11550a(c1962d.f12153S);
            c2202j.mo11556a(str3);
            c2202j.mo11555a(c2340d);
            c2202j.m11613b(c1962d.f12162ab);
            h hVar = c1962d.new h(windVaneWebView, str3, c1781c, list, str2, str3, c2340d, c1962d.f12153S, c1962d);
            windVaneWebView2.setWebViewListener(new j(windVaneWebView, str, str3, aVar, c1781c, c1962d, hVar, c1962d.f12164ad));
            windVaneWebView2.setObject(c2202j);
            windVaneWebView2.loadUrl(str2);
            c1962d.f12164ad.postDelayed(hVar, C1575f.f8394a);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10245a(C1962d c1962d, String str, C1781c c1781c, String str2, String str3, C2340d c2340d) {
        ArrayList<C1781c> arrayList;
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(C1175n.m2059a().m2148f());
            aVar.m11759a(windVaneWebView);
            C2024c.m10829a();
            String strM10842b = C2024c.m10842b();
            aVar.m11760a(strM10842b);
            C1782d c1782d = c1962d.f12160Z;
            C2202j c2202j = (c1782d == null || (arrayList = c1782d.f10572J) == null || arrayList.size() <= 0) ? new C2202j(null, c1781c) : new C2202j(null, c1781c, c1962d.f12160Z.f10572J);
            c2202j.mo11550a(c1962d.f12153S);
            c2202j.mo11556a(str3);
            c2202j.m11614c(strM10842b);
            c2202j.mo11555a(c2340d);
            c2202j.m11613b(c1962d.f12162ab);
            g gVar = c1962d.new g(str3, c1781c, str2, str3, c2340d, c1962d.f12153S, c1962d);
            windVaneWebView.setWebViewListener(new a(str, str3, aVar, c1781c, c1962d, gVar, c1962d.f12164ad));
            windVaneWebView.setObject(c2202j);
            windVaneWebView.loadUrl(str2);
            c1962d.f12164ad.postDelayed(gVar, C1575f.f8394a);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10246a(C1962d c1962d, String str, String str2) {
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList;
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList2;
        List<String> list;
        try {
            if (c1962d.f12152R == null || TextUtils.isEmpty(str2)) {
                if (c1962d.f12147G != null) {
                    Handler handler = c1962d.f12164ad;
                    if (handler != null) {
                        handler.removeMessages(5);
                    }
                    c1962d.m10261b(str);
                    c1962d.f12147G.mo10206a(str);
                    return;
                }
                return;
            }
            for (C1781c c1781c : c1962d.f12152R) {
                if (c1781c != null) {
                    String strM8811S = c1781c.m8811S();
                    if (TextUtils.isEmpty(strM8811S) || !str2.equals(strM8811S)) {
                        String strM8801I = c1781c.m8801I();
                        if (TextUtils.isEmpty(strM8801I) || !str2.equals(strM8801I)) {
                            C1781c.c cVarM8805M = c1781c.m8805M();
                            if (cVarM8805M == null) {
                                continue;
                            } else {
                                List<C1781c.c.a> listM8958f = cVarM8805M.m8958f();
                                if (listM8958f != null) {
                                    Iterator<C1781c.c.a> it = listM8958f.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        C1781c.c.a next = it.next();
                                        if (next != null && (list = next.f10534b) != null && list.contains(str2)) {
                                            c1962d.f12152R.remove(c1781c);
                                            break;
                                        }
                                    }
                                }
                                String strM8957e = cVarM8805M.m8957e();
                                if (!TextUtils.isEmpty(strM8957e) && str2.equals(strM8957e)) {
                                    copyOnWriteArrayList2 = c1962d.f12152R;
                                }
                            }
                        } else {
                            copyOnWriteArrayList2 = c1962d.f12152R;
                        }
                    } else {
                        copyOnWriteArrayList2 = c1962d.f12152R;
                    }
                    copyOnWriteArrayList2.remove(c1781c);
                    break;
                }
            }
            if (c1962d.f12147G == null || (copyOnWriteArrayList = c1962d.f12152R) == null || copyOnWriteArrayList.size() != 0) {
                return;
            }
            Handler handler2 = c1962d.f12164ad;
            if (handler2 != null) {
                handler2.removeMessages(5);
            }
            c1962d.m10261b(str);
            c1962d.f12147G.mo10206a(str);
        } catch (Throwable th) {
            th.getMessage();
            try {
                if (c1962d.f12147G != null) {
                    Handler handler3 = c1962d.f12164ad;
                    if (handler3 != null) {
                        handler3.removeMessages(5);
                    }
                    c1962d.m10261b(str);
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10247a(C1962d c1962d, List list) {
        if (c1962d.f12178v == null || list == null || list.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1781c c1781c = (C1781c) list.get(i2);
            if (c1781c != null) {
                C1886t.m9827a(c1962d.f12178v, c1781c.m10147ba());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10248a(Runnable runnable) {
        this.f12148H = runnable;
    }

    /* JADX INFO: renamed from: a */
    private void m10249a(String str) {
        this.f12156V = str;
    }

    /* JADX INFO: renamed from: a */
    private void m10250a(String str, C1781c c1781c, String str2, String str3, C2340d c2340d) {
        ArrayList<C1781c> arrayList;
        try {
            C2314a.a aVar = new C2314a.a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(C1175n.m2059a().m2148f());
            aVar.m11759a(windVaneWebView);
            C2024c.m10829a();
            String strM10842b = C2024c.m10842b();
            aVar.m11760a(strM10842b);
            C1782d c1782d = this.f12160Z;
            C2202j c2202j = (c1782d == null || (arrayList = c1782d.f10572J) == null || arrayList.size() <= 0) ? new C2202j(null, c1781c) : new C2202j(null, c1781c, this.f12160Z.f10572J);
            c2202j.mo11550a(this.f12153S);
            c2202j.mo11556a(str3);
            c2202j.m11614c(strM10842b);
            c2202j.mo11555a(c2340d);
            c2202j.m11613b(this.f12162ab);
            g gVar = new g(str3, c1781c, str2, str3, c2340d, this.f12153S, this);
            windVaneWebView.setWebViewListener(new a(str, str3, aVar, c1781c, this, gVar, this.f12164ad));
            windVaneWebView.setObject(c2202j);
            windVaneWebView.loadUrl(str2);
            this.f12164ad.postDelayed(gVar, C1575f.f8394a);
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10251a(String str, String str2) {
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList;
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList2;
        List<String> list;
        try {
            if (this.f12152R == null || TextUtils.isEmpty(str2)) {
                if (this.f12147G != null) {
                    Handler handler = this.f12164ad;
                    if (handler != null) {
                        handler.removeMessages(5);
                    }
                    m10261b(str);
                    this.f12147G.mo10206a(str);
                    return;
                }
                return;
            }
            for (C1781c c1781c : this.f12152R) {
                if (c1781c != null) {
                    String strM8811S = c1781c.m8811S();
                    if (TextUtils.isEmpty(strM8811S) || !str2.equals(strM8811S)) {
                        String strM8801I = c1781c.m8801I();
                        if (TextUtils.isEmpty(strM8801I) || !str2.equals(strM8801I)) {
                            C1781c.c cVarM8805M = c1781c.m8805M();
                            if (cVarM8805M == null) {
                                continue;
                            } else {
                                List<C1781c.c.a> listM8958f = cVarM8805M.m8958f();
                                if (listM8958f != null) {
                                    Iterator<C1781c.c.a> it = listM8958f.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        C1781c.c.a next = it.next();
                                        if (next != null && (list = next.f10534b) != null && list.contains(str2)) {
                                            this.f12152R.remove(c1781c);
                                            break;
                                        }
                                    }
                                }
                                String strM8957e = cVarM8805M.m8957e();
                                if (!TextUtils.isEmpty(strM8957e) && str2.equals(strM8957e)) {
                                    copyOnWriteArrayList2 = this.f12152R;
                                }
                            }
                        } else {
                            copyOnWriteArrayList2 = this.f12152R;
                        }
                    } else {
                        copyOnWriteArrayList2 = this.f12152R;
                    }
                    copyOnWriteArrayList2.remove(c1781c);
                    break;
                }
            }
            if (this.f12147G == null || (copyOnWriteArrayList = this.f12152R) == null || copyOnWriteArrayList.size() != 0) {
                return;
            }
            Handler handler2 = this.f12164ad;
            if (handler2 != null) {
                handler2.removeMessages(5);
            }
            m10261b(str);
            this.f12147G.mo10206a(str);
        } catch (Throwable th) {
            th.getMessage();
            try {
                if (this.f12147G != null) {
                    Handler handler3 = this.f12164ad;
                    if (handler3 != null) {
                        handler3.removeMessages(5);
                    }
                    m10261b(str);
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10252a(String str, List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        new StringBuilder("mark cache data: ").append(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1781c c1781c = (C1781c) it.next();
            if (c1781c.m8805M() != null && !TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                C2314a.m11751b(str + "_" + c1781c.m10146aZ() + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e());
                C2314a.m11749b(c1781c.m8913w(), c1781c);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10253a(List<C1781c> list) {
        if (this.f12178v == null || list == null || list.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1781c c1781c = list.get(i2);
            if (c1781c != null) {
                C1886t.m9827a(this.f12178v, c1781c.m10147ba());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m10254a(List<C1781c> list, C2340d c2340d) {
        if (list != null) {
            try {
                Iterator<C1781c> it = list.iterator();
                while (it.hasNext()) {
                    C1781c next = it.next();
                    boolean z = true;
                    boolean z3 = next != null;
                    if (next.m8805M() == null) {
                        z = false;
                    }
                    if ((z & z3) && !TextUtils.isEmpty(next.m8805M().m8957e())) {
                        m10241a(next, next.m8805M().m8957e(), this.f12179w, c2340d);
                    }
                    if (next != null && !TextUtils.isEmpty(next.m8849ar())) {
                        m10241a(next, next.m8849ar(), this.f12179w, c2340d);
                    }
                }
            } catch (Exception e2) {
                if (C1404a.f6209a) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m10255a(C1781c c1781c) {
        try {
            if (C2315a.m11764a() == null) {
                return true;
            }
            C2315a.m11764a();
            return C2315a.m11767a(c1781c);
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m10257a(List<C1781c> list, String str, boolean z, int i2) {
        if (list != null && list.size() > 0) {
            C1781c c1781c = list.get(0);
            if (C2320e.m11843a().m11859b(str, false, list.size(), z, i2, list)) {
                if (!z) {
                    if (c1781c != null && c1781c.m8886j()) {
                        return true;
                    }
                    if ((c1781c.m8827aB() == null || c1781c.m8827aB().size() <= 0 || !c1781c.m8827aB().contains(1)) && c1781c.m8805M() != null && !TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                        if (C2327l.m11891a().m11909d(str + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e())) {
                        }
                    }
                    return true;
                }
                if (c1781c.m8886j()) {
                    return true;
                }
                if (c1781c.m8827aB() != null && c1781c.m8827aB().size() > 0) {
                    if (c1781c.m8827aB().contains(3)) {
                        return true;
                    }
                    if (c1781c.m8849ar().equals(c1781c.m8801I()) && c1781c.m8827aB().contains(2)) {
                        return true;
                    }
                }
                if (C2327l.m11891a().m11909d(str + "_" + c1781c.m8818Z() + "_" + c1781c.m8849ar())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m10259b(C1781c c1781c, String str, String str2, C2340d c2340d) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Object[] objArr = new Object[5];
            if (!str.contains("zip") || this.f12164ad == null) {
                return;
            }
            String strM11883c = C2324i.m11867a().m11883c(str);
            Message messageObtain = Message.obtain();
            messageObtain.what = 17;
            objArr[0] = c1781c;
            objArr[1] = strM11883c;
            objArr[2] = str2;
            objArr[3] = c2340d;
            objArr[4] = str;
            messageObtain.obj = objArr;
            this.f12164ad.sendMessage(messageObtain);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10260b(C1782d c1782d) {
        ArrayList<C1781c> arrayList;
        try {
            this.f12160Z = c1782d;
            new StringBuilder("V3 data just requested back,requestId ").append(this.f12160Z.m9024f());
            C1782d c1782d2 = this.f12160Z;
            if (c1782d2 != null && (arrayList = c1782d2.f10572J) != null) {
                arrayList.size();
            }
            m10268c(this.f12160Z);
            this.f12170m = this.f12160Z.m9024f();
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
            CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            List<C1781c> list = this.f12167ag;
            if (list != null) {
                list.clear();
            }
            this.f12173p = false;
            this.f12174q = false;
            synchronized (this.f12169c) {
                if (this.f12175r) {
                    this.f12175r = false;
                }
                this.f12177t = false;
                this.f12176s = false;
                m10261b("exception after load success");
                m10305r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m10261b(String str) {
        if (this.f12164ad != null) {
            if (TextUtils.isEmpty(str)) {
                this.f12164ad.sendEmptyMessage(4);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (str.contains("exception")) {
                this.f12164ad.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.f12164ad.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m10262b(String str, List<C1781c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        new StringBuilder("mark cache data: ").append(list.size());
        for (C1781c c1781c : list) {
            if (c1781c.m8805M() != null && !TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                C2314a.m11751b(str + "_" + c1781c.m10146aZ() + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e());
                C2314a.m11749b(c1781c.m8913w(), c1781c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10263b(List<C1781c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C1781c c1781c : list) {
            if (c1781c != null) {
                if (!TextUtils.isEmpty(c1781c.m8808P())) {
                    C2324i.m11867a().m11881b(c1781c.m8808P());
                }
                if (c1781c.m8805M() != null) {
                    C1781c.c cVarM8805M = c1781c.m8805M();
                    if (!TextUtils.isEmpty(cVarM8805M.m8956d())) {
                        if (cVarM8805M.m8956d().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                            C2324i.m11867a().m11882b(cVarM8805M.m8956d(), (C2324i.a) new i(c1781c, this, this.f12179w, 313, this.f12149I, false));
                        } else {
                            C2324i.m11867a().m11882b(cVarM8805M.m8956d(), (C2324i.a) null);
                        }
                    }
                    if (!TextUtils.isEmpty(cVarM8805M.m8957e()) && !cVarM8805M.m8957e().contains(C1781c.f10327d)) {
                        if (cVarM8805M.m8957e().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                            C2324i.m11867a().m11882b(cVarM8805M.m8957e(), (C2324i.a) new i(c1781c, this, this.f12179w, 859, this.f12149I, false));
                        } else {
                            C2324i.m11867a().m11882b(cVarM8805M.m8957e(), new d(this, c1781c, this.f12179w, this.f12149I));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m10264b(C1781c c1781c) {
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<C1781c> it = this.f12161aa.iterator();
            while (it.hasNext()) {
                if (it.next().m10146aZ().equals(c1781c.m10146aZ())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m10265b(List<C1781c> list, boolean z, int i2) {
        if (list != null && list.size() > 0) {
            C1781c c1781c = list.get(0);
            if (C2320e.m11843a().m11859b(this.f12179w, this.f12155U, list.size(), z, i2, list)) {
                if (!z) {
                    if (c1781c != null && c1781c.m8886j()) {
                        return true;
                    }
                    if ((c1781c.m8827aB() == null || c1781c.m8827aB().size() <= 0 || !c1781c.m8827aB().contains(1)) && c1781c.m8805M() != null && !TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                        if (C2327l.m11891a().m11909d(this.f12179w + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e())) {
                        }
                    }
                    return true;
                }
                if (c1781c.m8886j()) {
                    return true;
                }
                if (c1781c.m8827aB() != null && c1781c.m8827aB().size() > 0) {
                    if (c1781c.m8827aB().contains(3)) {
                        return true;
                    }
                    if (c1781c.m8849ar().equals(c1781c.m8801I()) && c1781c.m8827aB().contains(2)) {
                        return true;
                    }
                }
                if (C2327l.m11891a().m11909d(this.f12179w + "_" + c1781c.m8818Z() + "_" + c1781c.m8849ar())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m10267c(C1781c c1781c) {
        if (c1781c == null) {
            return;
        }
        if (!TextUtils.isEmpty(c1781c.m8808P())) {
            C2324i.m11867a().m11881b(c1781c.m8808P());
        }
        if (c1781c.m8805M() != null) {
            C1781c.c cVarM8805M = c1781c.m8805M();
            if (!TextUtils.isEmpty(cVarM8805M.m8956d())) {
                if (cVarM8805M.m8956d().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                    C2324i.m11867a().m11882b(cVarM8805M.m8956d(), (C2324i.a) new i(c1781c, this, this.f12179w, 313, this.f12149I, false));
                } else {
                    C2324i.m11867a().m11882b(cVarM8805M.m8956d(), (C2324i.a) null);
                }
            }
            if (TextUtils.isEmpty(cVarM8805M.m8957e()) || cVarM8805M.m8957e().contains(C1781c.f10327d)) {
                return;
            }
            if (cVarM8805M.m8957e().contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                C2324i.m11867a().m11882b(cVarM8805M.m8957e(), (C2324i.a) new i(c1781c, this, this.f12179w, 859, this.f12149I, false));
            } else {
                C2324i.m11867a().m11882b(cVarM8805M.m8957e(), new d(this, c1781c, this.f12179w, this.f12149I));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10268c(C1782d c1782d) {
        this.f12160Z = c1782d;
        new StringBuilder("Campaign request success: ").append(c1782d.f10572J.size());
        this.f12161aa = m10272d(c1782d);
        C1335b.m3998a().m4005a(new AnonymousClass5(c1782d));
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            if (TextUtils.isEmpty(this.f12166af)) {
                this.f12166af = f12130b;
            }
            m10261b(this.f12166af);
            return;
        }
        new StringBuilder("onload load success,size:").append(this.f12161aa.size());
        Handler handler = this.f12164ad;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        if (c1782d != null) {
            String strM9021c = c1782d.m9021c();
            if (C1889w.m9868b(strM9021c)) {
                C1964a.f12300b = strM9021c;
            }
        }
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList2 = this.f12161aa;
        if (copyOnWriteArrayList2 != null) {
            try {
                if (copyOnWriteArrayList2.size() > 0) {
                    this.f12181y += copyOnWriteArrayList2.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        C2340d c2340d = this.f12149I;
        if (c2340d == null || this.f12181y > c2340d.m12060D()) {
            this.f12181y = 0;
        }
        new StringBuilder("onload 算出 下次的offset是:").append(this.f12181y);
        if (C1889w.m9868b(this.f12179w)) {
            C1964a.m10336a(this.f12179w, this.f12181y);
        }
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList3 = this.f12161aa;
        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
            new StringBuilder("#######onload,save the ad data locally,size:").append(this.f12161aa.size());
        }
        final C1781c c1781c = this.f12161aa.get(0);
        final boolean z = !TextUtils.isEmpty(c1781c.m8849ar());
        final int iM8847ap = c1781c.m8847ap();
        this.f12173p = false;
        this.f12174q = false;
        synchronized (this.f12169c) {
            if (this.f12175r) {
                this.f12175r = false;
            }
        }
        this.f12177t = false;
        this.f12176s = false;
        C1961c.m.f12122a.m10224a(this.f12178v, z, iM8847ap, this.f12155U, this.f12154T ? C1801a.f11010aU : 94, this.f12180x, this.f12179w, c1781c.m8818Z(), this.f12161aa, new AnonymousClass2(z, c1781c, iM8847ap), new C1961c.i() { // from class: com.anythink.expressad.reward.a.d.3
            @Override // com.anythink.expressad.reward.p146a.C1961c.i
            /* JADX INFO: renamed from: a */
            public final void mo10234a(final String str) {
                if (!z && C1962d.this.f12147G != null && C1962d.this.f12164ad != null) {
                    if (c1781c.m8827aB() == null || c1781c.m8827aB().size() <= 0 || !c1781c.m8827aB().contains(1)) {
                        C1962d.this.f12164ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                List unused = C1962d.this.f12167ag;
                                boolean unused2 = C1962d.this.f12155U;
                                if (C1962d.this.f12164ad != null) {
                                    C1962d.this.f12164ad.removeMessages(5);
                                }
                                if (C1962d.this.f12177t || C1962d.this.f12147G == null) {
                                    return;
                                }
                                C1962d.this.f12177t = true;
                                C1962d.this.f12147G.mo10206a("errorCode: 3202 errorMessage: temp resource download failed");
                            }
                        });
                        return;
                    }
                    return;
                }
                if (iM8847ap == 1) {
                    if (c1781c.m8827aB() != null && c1781c.m8827aB().size() > 0) {
                        if (c1781c.m8827aB().contains(3)) {
                            return;
                        }
                        if (c1781c.m8849ar().equals(c1781c.m8801I()) && c1781c.m8827aB().contains(2)) {
                            return;
                        }
                    }
                    if (C1962d.this.f12147G == null || C1962d.this.f12164ad == null) {
                        return;
                    }
                    C1962d.this.f12164ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            List unused = C1962d.this.f12167ag;
                            boolean unused2 = C1962d.this.f12155U;
                            if (C1962d.this.f12164ad != null) {
                                C1962d.this.f12164ad.removeMessages(5);
                            }
                            if (C1962d.this.f12177t || C1962d.this.f12147G == null) {
                                return;
                            }
                            C1962d.this.f12177t = true;
                            C1962d.this.f12147G.mo10206a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                        }
                    });
                }
            }

            @Override // com.anythink.expressad.reward.p146a.C1961c.i
            /* JADX INFO: renamed from: a */
            public final void mo10235a(String str, String str2, String str3) {
            }
        });
        if (z) {
            C1961c.m.f12122a.m10223a(this.f12178v, c1781c, this.f12180x, this.f12179w, c1781c.m8818Z(), new AnonymousClass4(c1781c, z, iM8847ap));
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m10269c(String str) {
        if (C1889w.m9868b(str)) {
            C1964a.f12300b = str;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10270c(List<C1781c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C1781c c1781c : list) {
            String strM8801I = c1781c.m8801I();
            if (!TextUtils.isEmpty(strM8801I) && !c1781c.m8800H()) {
                if (strM8801I.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && strM8801I.contains(C2328m.f14474b)) {
                    C2324i.m11867a().m11882b(strM8801I, (C2324i.a) new i(c1781c, this, this.f12179w, 497, this.f12149I, TextUtils.isEmpty(C2324i.m11867a().m11883c(strM8801I))));
                } else {
                    C2324i.m11867a().m11882b(strM8801I, new f(this, c1781c, this.f12179w, TextUtils.isEmpty(C2325j.m11884a().m11889b(strM8801I))));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.concurrent.CopyOnWriteArrayList<com.anythink.expressad.foundation.p116d.C1781c> m10272d(com.anythink.expressad.foundation.p116d.C1782d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.p146a.C1962d.m10272d(com.anythink.expressad.foundation.d.d):java.util.concurrent.CopyOnWriteArrayList");
    }

    /* JADX INFO: renamed from: d */
    private void m10273d(C1781c c1781c) {
        if (c1781c == null || TextUtils.isEmpty(c1781c.m8849ar())) {
            return;
        }
        String strM8849ar = c1781c.m8849ar();
        C2324i.m11867a().m11882b(strM8849ar, (C2324i.a) new i(c1781c, this, this.f12179w, 502, this.f12149I, TextUtils.isEmpty(C2324i.m11867a().m11883c(strM8849ar))));
    }

    /* JADX INFO: renamed from: d */
    private void m10274d(List<C1781c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (C1781c c1781c : list) {
            if (!TextUtils.isEmpty(c1781c.m10150bd())) {
                C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10150bd(), new c(this, c1781c, this.f12179w));
            }
            if (!TextUtils.isEmpty(c1781c.m10151be())) {
                C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(c1781c.m10151be(), new c(this, c1781c, this.f12179w));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m10276e(C1782d c1782d) {
        C1335b.m3998a().m4005a(new AnonymousClass5(c1782d));
    }

    /* JADX INFO: renamed from: e */
    private void m10277e(List<C1781c> list) {
        List<C1781c.c.a> listM8958f;
        List<String> list2;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C1781c c1781c : list) {
                        if (c1781c.m8805M() != null && c1781c.m8805M().m8958f() != null && (listM8958f = c1781c.m8805M().m8958f()) != null) {
                            for (C1781c.c.a aVar : listM8958f) {
                                if (aVar != null && (list2 = aVar.f10534b) != null) {
                                    for (String str : list2) {
                                        if (C1889w.m9868b(str)) {
                                            C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(str, new e(this, c1781c, this.f12179w));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (C1404a.f6209a) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static boolean m10278e(C1781c c1781c) {
        if (c1781c == null) {
            return false;
        }
        try {
            return c1781c.m8802J() == 2;
        } catch (Throwable th) {
            if (!C1404a.f6209a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m10280f(List<C1781c> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    new StringBuilder("onload 开始下载视频素材 size:").append(list.size());
                    this.f12152R.clear();
                    this.f12152R.addAll(list);
                    C2327l.m11891a().m11904a(list);
                    if (C2320e.m11843a() != null) {
                        C2320e.m11843a().m11852a(this.f12179w, list, 94, new b(this, list.get(0)));
                        C2320e.m11843a().m11862d(this.f12179w);
                    }
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m10282g() {
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12152R;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.f12152R.clear();
    }

    /* JADX INFO: renamed from: g */
    private void m10283g(List<C1781c> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f12181y += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        C2340d c2340d = this.f12149I;
        if (c2340d == null || this.f12181y > c2340d.m12060D()) {
            this.f12181y = 0;
        }
        new StringBuilder("onload 算出 下次的offset是:").append(this.f12181y);
        if (C1889w.m9868b(this.f12179w)) {
            C1964a.m10336a(this.f12179w, this.f12181y);
        }
    }

    /* JADX INFO: renamed from: h */
    private int m10284h() {
        return this.f12153S;
    }

    /* JADX INFO: renamed from: h */
    private void m10285h(List<C1781c> list) {
        this.f12168ah = list;
    }

    /* JADX INFO: renamed from: i */
    private static void m10288i() {
    }

    /* JADX INFO: renamed from: j */
    private static void m10290j() {
    }

    /* JADX INFO: renamed from: k */
    private void m10292k() {
        Handler handler = this.f12164ad;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    /* JADX INFO: renamed from: l */
    private static void m10293l() {
    }

    /* JADX INFO: renamed from: m */
    private static void m10295m() {
    }

    /* JADX INFO: renamed from: n */
    private static void m10298n() {
    }

    /* JADX INFO: renamed from: o */
    private static void m10300o() {
    }

    /* JADX INFO: renamed from: p */
    private static void m10302p() {
    }

    /* JADX INFO: renamed from: q */
    private int m10303q() {
        try {
            int iM10330a = C1889w.m9868b(this.f12179w) ? C1964a.m10330a(this.f12179w) : 0;
            C2340d c2340d = this.f12149I;
            if (c2340d == null) {
                return 0;
            }
            if (iM10330a > c2340d.m12060D()) {
                return 0;
            }
            return iM10330a;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m10305r() {
        try {
            if (C1889w.m9868b(this.f12179w)) {
                C1964a.m10336a(this.f12179w, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    private static String m10306s() {
        try {
            return C1889w.m9868b(C1964a.f12300b) ? C1964a.f12300b : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: t */
    private static String m10307t() {
        return "";
    }

    /* JADX INFO: renamed from: u */
    private static void m10308u() {
        try {
            Map<String, Long> map = C1807f.f11184h;
            if (map == null || map.size() <= 0) {
                return;
            }
            C1807f.f11184h.clear();
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private static void m10309v() {
    }

    /* JADX INFO: renamed from: w */
    private static /* synthetic */ void m10310w() {
    }

    /* JADX INFO: renamed from: x */
    private static /* synthetic */ void m10311x() {
    }

    /* JADX INFO: renamed from: a */
    public final void m10312a(int i2) {
        this.f12153S = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m10313a(int i2, int i3, int i4) {
        this.f12157W = i2;
        this.f12158X = i3;
        this.f12159Y = i4;
    }

    /* JADX INFO: renamed from: a */
    public final void m10314a(Activity activity, InterfaceC2067h interfaceC2067h, String str, String str2, int i2, String str3, C1248m c1248m) {
        Context context;
        try {
            this.f12146F = interfaceC2067h;
            if (this.f12178v != null && !C1889w.m9867a(this.f12179w)) {
                Context context2 = this.f12178v;
                if (activity == null || activity.isFinishing()) {
                    Log.i("anythink_BaseAdActivity", "Activity is null");
                    context = context2;
                } else {
                    context = activity;
                }
                Intent intent = new Intent(context, (Class<?>) ATRewardVideoActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra(ATRewardVideoActivity.f12376a, this.f12179w);
                intent.putExtra(C1404a.f6238y, this.f12180x);
                intent.putExtra(ATRewardVideoActivity.f12378c, str);
                intent.putExtra(ATRewardVideoActivity.f12379d, i2);
                intent.putExtra(ATRewardVideoActivity.f12380e, this.f12154T);
                intent.putExtra(ATRewardVideoActivity.f12381f, this.f12155U);
                intent.putExtra(ATRewardVideoActivity.f12387l, str3);
                intent.putExtra(ATRewardVideoActivity.f12388m, c1248m);
                List<C1781c> listM11853a = C2320e.m11843a().m11853a(this.f12179w);
                boolean z = false;
                new StringBuilder("cur showing Offer requestId").append(listM11853a.get(0).m8818Z());
                if (listM11853a == null || listM11853a.size() <= 0) {
                    InterfaceC2067h interfaceC2067h2 = this.f12146F;
                    if (interfaceC2067h2 != null) {
                        interfaceC2067h2.mo10417a("load failed");
                        return;
                    }
                } else {
                    new StringBuilder("can show data: ").append(listM11853a.size());
                    C1781c c1781c = listM11853a.get(0);
                    if (c1781c != null) {
                        this.f12171n = c1781c.m8818Z();
                    }
                    if (c1781c != null && !TextUtils.isEmpty(c1781c.m8849ar())) {
                        z = true;
                    }
                }
                intent.putExtra(ATRewardVideoActivity.f12382g, z);
                if (this.f12154T) {
                    intent.putExtra(ATRewardVideoActivity.f12384i, this.f12157W);
                    intent.putExtra(ATRewardVideoActivity.f12385j, this.f12158X);
                    intent.putExtra(ATRewardVideoActivity.f12386k, this.f12159Y);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(ATRewardVideoActivity.f12377b, str2);
                }
                C1963e.a.f12290a.m10328a(this.f12180x, this.f12179w, this.f12149I);
                context.startActivity(intent);
                return;
            }
            InterfaceC2067h interfaceC2067h3 = this.f12146F;
            if (interfaceC2067h3 != null) {
                interfaceC2067h3.mo10417a("context or unitid is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            InterfaceC2067h interfaceC2067h4 = this.f12146F;
            if (interfaceC2067h4 != null) {
                interfaceC2067h4.mo10417a("show failed, exception is " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10315a(C1782d c1782d) {
        ArrayList<C1781c> arrayList;
        this.f12182z = 1;
        this.f12142B = 8;
        this.f12143C = true;
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        List<C1781c> list = this.f12167ag;
        if (list != null) {
            list.clear();
        }
        this.f12173p = false;
        this.f12174q = false;
        synchronized (this.f12169c) {
            if (this.f12175r) {
                this.f12175r = false;
            }
        }
        this.f12177t = false;
        this.f12176s = false;
        if (this.f12178v == null) {
            m10261b("Context is null");
            return;
        }
        if (C1889w.m9867a(this.f12179w)) {
            m10261b("UnitId is null");
            return;
        }
        if (this.f12149I == null) {
            m10261b("RewardUnitSetting is null");
            return;
        }
        try {
            Map<String, Long> map = C1807f.f11184h;
            if (map != null && map.size() > 0) {
                C1807f.f11184h.clear();
            }
        } catch (Exception e2) {
            if (C1404a.f6209a) {
                e2.printStackTrace();
            }
        }
        try {
            this.f12160Z = c1782d;
            new StringBuilder("V3 data just requested back,requestId ").append(this.f12160Z.m9024f());
            C1782d c1782d2 = this.f12160Z;
            if (c1782d2 != null && (arrayList = c1782d2.f10572J) != null) {
                arrayList.size();
            }
            m10268c(this.f12160Z);
            this.f12170m = this.f12160Z.m9024f();
        } catch (Exception e3) {
            if (C1404a.f6209a) {
                e3.printStackTrace();
            }
            CopyOnWriteArrayList<C1781c> copyOnWriteArrayList2 = this.f12161aa;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.clear();
            }
            List<C1781c> list2 = this.f12167ag;
            if (list2 != null) {
                list2.clear();
            }
            this.f12173p = false;
            this.f12174q = false;
            synchronized (this.f12169c) {
                if (this.f12175r) {
                    this.f12175r = false;
                }
                this.f12177t = false;
                this.f12176s = false;
                m10261b("exception after load success");
                m10305r();
            }
        }
    }

    @Override // com.anythink.expressad.reward.p146a.InterfaceC1959a
    /* JADX INFO: renamed from: a */
    public final void mo10200a(InterfaceC1960b interfaceC1960b) {
        this.f12147G = interfaceC1960b;
    }

    /* JADX INFO: renamed from: a */
    public final void m10316a(C2340d c2340d) {
        try {
            this.f12149I = c2340d;
            if (c2340d == null || c2340d.m12077V() * 1000 == C1801a.f11128cq) {
                return;
            }
            C1801a.f11128cq = this.f12149I.m12077V() * 1000;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10317a(boolean z) {
        this.f12154T = z;
    }

    @Override // com.anythink.expressad.reward.p146a.InterfaceC1959a
    /* JADX INFO: renamed from: a */
    public final boolean mo10201a() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10318a(List<C1781c> list, boolean z, int i2) {
        return m10265b(list, z, i2);
    }

    @Override // com.anythink.expressad.reward.p146a.InterfaceC1959a
    /* JADX INFO: renamed from: b */
    public final void mo10202b() {
    }

    /* JADX INFO: renamed from: b */
    public final void m10319b(boolean z) {
        this.f12155U = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m10320c(boolean z) {
        List<C1781c> listM11853a;
        C1781c c1781c;
        if (!z) {
            return this.f12170m;
        }
        if (TextUtils.isEmpty(this.f12171n) && (listM11853a = C2320e.m11843a().m11853a(this.f12179w)) != null && listM11853a.size() > 0 && (c1781c = listM11853a.get(0)) != null) {
            this.f12171n = c1781c.m8818Z();
        }
        return this.f12171n;
    }

    @Override // com.anythink.expressad.reward.p146a.InterfaceC1959a
    /* JADX INFO: renamed from: c */
    public final boolean mo10203c() {
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return false;
        }
        return m10265b(this.f12161aa, !TextUtils.isEmpty(r0.m8849ar()), this.f12161aa.get(0).m8847ap());
    }

    @Override // com.anythink.expressad.reward.p146a.InterfaceC1959a
    /* JADX INFO: renamed from: d */
    public final void mo10204d() {
    }

    /* JADX INFO: renamed from: d */
    public final void m10321d(boolean z) {
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList;
        if (z || (copyOnWriteArrayList = this.f12161aa) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        C2315a.m11764a();
    }

    /* JADX INFO: renamed from: e */
    public final String m10322e() {
        return this.f12179w;
    }

    /* JADX INFO: renamed from: e */
    public final void m10323e(boolean z) {
        if (z) {
            List<C1781c> list = this.f12168ah;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (C1781c c1781c : this.f12168ah) {
                if (c1781c != null) {
                    c1781c.m8890l(0);
                    if (c1781c.m8805M() != null && !TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                        C2327l.m11891a().m11908c(this.f12179w + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e(), false);
                    }
                }
            }
            return;
        }
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (C1781c c1781c2 : this.f12161aa) {
            if (c1781c2 != null) {
                c1781c2.m8890l(0);
                if (c1781c2.m8805M() != null && !TextUtils.isEmpty(c1781c2.m8805M().m8957e())) {
                    C2327l.m11891a().m11908c(this.f12179w + "_" + c1781c2.m8818Z() + "_" + c1781c2.m8805M().m8957e(), false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArrayList<C1781c> m10324f() {
        return this.f12161aa;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10325f(boolean z) {
        if (z) {
            List<C1781c> list = this.f12168ah;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (C1781c c1781c : this.f12168ah) {
                if (c1781c != null) {
                    c1781c.m8890l(1);
                    if (c1781c.m8805M() != null && !TextUtils.isEmpty(c1781c.m8805M().m8957e())) {
                        C2327l.m11891a().m11908c(this.f12179w + "_" + c1781c.m8818Z() + "_" + c1781c.m8805M().m8957e(), true);
                    }
                }
            }
            return true;
        }
        CopyOnWriteArrayList<C1781c> copyOnWriteArrayList = this.f12161aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (C1781c c1781c2 : this.f12161aa) {
            if (c1781c2 != null) {
                c1781c2.m8890l(1);
                if (c1781c2.m8805M() != null && !TextUtils.isEmpty(c1781c2.m8805M().m8957e())) {
                    C2327l.m11891a().m11908c(this.f12179w + "_" + c1781c2.m8818Z() + "_" + c1781c2.m8805M().m8957e(), true);
                }
            }
        }
        return true;
    }
}
