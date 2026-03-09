package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.C1288i;
import com.anythink.core.common.p050a.C1151c;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1171j;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p051b.InterfaceC1162a;
import com.anythink.core.common.p055f.AbstractC1228au;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1223ap;
import com.anythink.core.common.p055f.C1224aq;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1231ax;
import com.anythink.core.common.p055f.C1233az;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1235ba;
import com.anythink.core.common.p055f.C1238c;
import com.anythink.core.common.p055f.C1242g;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1251p;
import com.anythink.core.common.p055f.C1257v;
import com.anythink.core.common.p061j.C1295a;
import com.anythink.core.common.p061j.InterfaceC1297c;
import com.anythink.core.common.p061j.InterfaceC1298d;
import com.anythink.core.common.p061j.InterfaceC1299e;
import com.anythink.core.common.p065n.C1320c;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.common.p066o.C1352p;
import com.anythink.core.common.p066o.C1354r;
import com.anythink.core.common.p066o.C1358v;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.common.p069p.C1369h;
import com.anythink.core.common.p069p.C1370i;
import com.anythink.core.p037a.C1086a;
import com.anythink.core.p037a.C1087b;
import com.anythink.core.p037a.C1088c;
import com.anythink.core.p038b.C1101b;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import com.anythink.core.p072d.C1403m;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p116d.C1796r;
import com.anythink.expressad.videocommon.p181e.C2338b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1201f {

    /* JADX INFO: renamed from: a */
    public Context f3615a;

    /* JADX INFO: renamed from: b */
    public String f3616b;

    /* JADX INFO: renamed from: d */
    public boolean f3618d;

    /* JADX INFO: renamed from: g */
    public C1317n f3621g;

    /* JADX INFO: renamed from: i */
    public InterfaceC1297c f3623i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1299e f3624j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1298d f3625k;

    /* JADX INFO: renamed from: n */
    private boolean f3628n;

    /* JADX INFO: renamed from: o */
    private long f3629o;

    /* JADX INFO: renamed from: l */
    private final String f3626l = C1201f.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    public String f3619e = "";

    /* JADX INFO: renamed from: m */
    private String f3627m = "";

    /* JADX INFO: renamed from: p */
    private boolean f3630p = false;

    /* JADX INFO: renamed from: f */
    public int f3620f = 1;

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, C1262g> f3617c = new ConcurrentHashMap<>(5);

    /* JADX INFO: renamed from: h */
    public final List<C1231ax> f3622h = Collections.synchronizedList(new ArrayList(2));

    /* JADX INFO: renamed from: com.anythink.core.common.f$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1257v f3631a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3632b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3633c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC1162a f3634d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Context f3635e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int[] f3636f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Map f3637g;

        /* JADX INFO: renamed from: com.anythink.core.common.f$1$1 */
        public class C46641 implements C1398h.b {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1243h f3639a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Context f3640b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f3641c;

            public C46641(C1243h c1243h, Context context, String str) {
                c1243h = c1243h;
                context = context;
                str = str;
            }

            @Override // com.anythink.core.p072d.C1398h.b
            /* JADX INFO: renamed from: a */
            public final void mo2405a(AdError adError) {
                String unused = C1201f.this.f3626l;
                String str = C1169h.n.f3187m;
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                String str2 = str;
                String strM4152d = C1344h.m4152d(str);
                String strPrintStackTrace = adError.printStackTrace();
                if (ATSDK.isNetworkLogDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(NativeAdvancedJsUtils.f6629p, C1169h.n.f3173C);
                        jSONObject.put(C1796r.f10844ah, str);
                        jSONObject.put(C2338b.f14610v, str2);
                        jSONObject.put("adtype", strM4152d);
                        jSONObject.put("errorMsg", strPrintStackTrace);
                        C1352p.m4216a("anythink_network", jSONObject.toString(), TextUtils.equals(C1169h.n.f3187m, str));
                    } catch (Throwable unused2) {
                    }
                }
                AdError errorCode = ErrorCode.getErrorCode(ErrorCode.placeStrategyError, adError.getPlatformCode(), adError.getPlatformMSG());
                c1243h.m3025E(5);
                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                C1201f.this.m2354a(true, c1243h, errorCode, c1257v);
            }

            @Override // com.anythink.core.p072d.C1398h.b
            /* JADX INFO: renamed from: a */
            public final void mo2406a(C1396f c1396f) {
                synchronized (C1201f.this) {
                    C1358v.m4255a(c1243h, c1396f);
                    if (TextUtils.equals(String.valueOf(c1396f.m5090ah()), str)) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        C1201f.m2348a(C1201f.this, context, str, str, c1396f, c1243h, c1257v);
                        return;
                    }
                    AdError errorCode = ErrorCode.getErrorCode(ErrorCode.formatError, "", "Format corresponding to API: " + C1344h.m4152d(str) + ", Format corresponding to placement strategy: " + C1344h.m4152d(String.valueOf(c1396f.m5090ah())));
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    C1201f.this.m2389a(c1257v, errorCode);
                    c1243h.m3064b(false);
                    C1322e.m3881a(c1243h, errorCode);
                    C1201f.this.f3618d = false;
                }
            }

            @Override // com.anythink.core.p072d.C1398h.b
            /* JADX INFO: renamed from: b */
            public final void mo2407b(C1396f c1396f) {
                if (c1396f.m4873au()) {
                    return;
                }
                C1201f.this.m2397b();
            }
        }

        public AnonymousClass1(C1257v c1257v, String str, String str2, InterfaceC1162a interfaceC1162a, Context context, int[] iArr, Map map) {
            c1257v = c1257v;
            str = str;
            str = str2;
            interfaceC1162a = interfaceC1162a;
            context = context;
            iArr = iArr;
            map = map;
        }

        /* JADX WARN: Removed duplicated region for block: B:289:0x0365  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x03c3 A[Catch: all -> 0x04a1, TryCatch #0 {, blocks: (B:170:0x0005, B:172:0x000d, B:174:0x0013, B:176:0x0015, B:178:0x001d, B:180:0x0024, B:182:0x0026, B:184:0x002e, B:186:0x0034, B:187:0x004e, B:189:0x0050, B:191:0x0056, B:192:0x005d, B:194:0x007c, B:196:0x0084, B:198:0x00c2, B:200:0x00d1, B:202:0x00de, B:203:0x00e1, B:205:0x00ec, B:207:0x00fa, B:209:0x0108, B:212:0x0112, B:214:0x011a, B:215:0x0149, B:217:0x014b, B:221:0x017a, B:224:0x0185, B:225:0x018c, B:226:0x0192, B:230:0x01bd, B:232:0x01e8, B:235:0x01ef, B:237:0x01f9, B:239:0x01ff, B:241:0x022d, B:242:0x0251, B:244:0x0253, B:259:0x0279, B:261:0x0281, B:264:0x028b, B:266:0x0299, B:268:0x02ba, B:270:0x02db, B:271:0x02e7, B:273:0x02e9, B:275:0x02ed, B:276:0x02f9, B:277:0x0323, B:278:0x0325, B:281:0x032e, B:283:0x0336, B:285:0x0347, B:287:0x034f, B:290:0x0366, B:291:0x037b, B:293:0x037d, B:295:0x038e, B:297:0x039a, B:298:0x03b9, B:300:0x03bb, B:302:0x03c3, B:303:0x03f2, B:305:0x03f4, B:306:0x0407, B:308:0x040d, B:312:0x041c, B:316:0x0428, B:317:0x0444, B:279:0x0329, B:254:0x026b, B:256:0x0270, B:257:0x0277, B:229:0x01b5, B:319:0x0446, B:321:0x0461, B:322:0x049b, B:323:0x049f, B:199:0x00cd, B:195:0x007f, B:251:0x0263), top: B:328:0x0005, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:305:0x03f4 A[Catch: all -> 0x04a1, TryCatch #0 {, blocks: (B:170:0x0005, B:172:0x000d, B:174:0x0013, B:176:0x0015, B:178:0x001d, B:180:0x0024, B:182:0x0026, B:184:0x002e, B:186:0x0034, B:187:0x004e, B:189:0x0050, B:191:0x0056, B:192:0x005d, B:194:0x007c, B:196:0x0084, B:198:0x00c2, B:200:0x00d1, B:202:0x00de, B:203:0x00e1, B:205:0x00ec, B:207:0x00fa, B:209:0x0108, B:212:0x0112, B:214:0x011a, B:215:0x0149, B:217:0x014b, B:221:0x017a, B:224:0x0185, B:225:0x018c, B:226:0x0192, B:230:0x01bd, B:232:0x01e8, B:235:0x01ef, B:237:0x01f9, B:239:0x01ff, B:241:0x022d, B:242:0x0251, B:244:0x0253, B:259:0x0279, B:261:0x0281, B:264:0x028b, B:266:0x0299, B:268:0x02ba, B:270:0x02db, B:271:0x02e7, B:273:0x02e9, B:275:0x02ed, B:276:0x02f9, B:277:0x0323, B:278:0x0325, B:281:0x032e, B:283:0x0336, B:285:0x0347, B:287:0x034f, B:290:0x0366, B:291:0x037b, B:293:0x037d, B:295:0x038e, B:297:0x039a, B:298:0x03b9, B:300:0x03bb, B:302:0x03c3, B:303:0x03f2, B:305:0x03f4, B:306:0x0407, B:308:0x040d, B:312:0x041c, B:316:0x0428, B:317:0x0444, B:279:0x0329, B:254:0x026b, B:256:0x0270, B:257:0x0277, B:229:0x01b5, B:319:0x0446, B:321:0x0461, B:322:0x049b, B:323:0x049f, B:199:0x00cd, B:195:0x007f, B:251:0x0263), top: B:328:0x0005, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 1188
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1201f.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.f$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f3643a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1257v f3644b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3645c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f3646d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1396f f3647e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f3648f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ List f3649g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C1235ba f3650h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C1243h f3651i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C1233az f3652j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C1224aq f3653k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ C1251p f3654l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ C1370i f3655m;

        /* JADX INFO: renamed from: com.anythink.core.common.f$2$1 */
        public class AnonymousClass1 implements C1288i.a {
            public AnonymousClass1() {
            }

            @Override // com.anythink.core.common.C1288i.a
            /* JADX INFO: renamed from: a */
            public final void mo2408a(String str) {
                C1262g c1262g = C1201f.this.f3617c.get(str);
                if (c1262g != null) {
                    c1262g.m3599d();
                }
            }

            @Override // com.anythink.core.common.C1288i.a
            /* JADX INFO: renamed from: a */
            public final void mo2409a(String str, List<C1229av> list, List<C1229av> list2, boolean z) {
                boolean zM2919d = AnonymousClass2.this.f3650h.m2919d();
                ArrayList arrayList = null;
                for (C1229av c1229av : list2) {
                    if (zM2919d && (c1229av.m2826m() == 1 || c1229av.m2826m() == 3)) {
                        if (c1229av.m2721O() != 1) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(4);
                            }
                            c1229av.m2849x(7);
                            arrayList.add(c1229av);
                        }
                    }
                    if (!zM2919d && c1229av.m2822l() != 0) {
                        C1179c c1179cM2193a = C1179c.m2193a();
                        c1179cM2193a.f3452c.put(c1229av.m2842u(), Long.valueOf(System.currentTimeMillis()));
                    }
                }
                C1262g c1262g = C1201f.this.f3617c.get(str);
                if (c1262g != null) {
                    c1262g.m3596a(list, list2, arrayList);
                    if (z) {
                        c1262g.m3600e();
                    }
                }
            }
        }

        public AnonymousClass2(Context context, C1257v c1257v, String str, String str2, C1396f c1396f, boolean z, List list, C1235ba c1235ba, C1243h c1243h, C1233az c1233az, C1224aq c1224aq, C1251p c1251p, C1370i c1370i) {
            this.f3643a = context;
            this.f3644b = c1257v;
            this.f3645c = str;
            this.f3646d = str2;
            this.f3647e = c1396f;
            this.f3648f = z;
            this.f3649g = list;
            this.f3650h = c1235ba;
            this.f3651i = c1243h;
            this.f3652j = c1233az;
            this.f3653k = c1224aq;
            this.f3654l = c1251p;
            this.f3655m = c1370i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C1202a c1202a = new C1202a();
                c1202a.f3678b = this.f3643a;
                c1202a.f3679c = this.f3644b;
                c1202a.f3680d = this.f3645c;
                c1202a.f3681e = this.f3646d;
                c1202a.f3682f = this.f3647e.m5090ah();
                c1202a.f3683g = this.f3647e.m5047S();
                c1202a.f3684h = this.f3647e.m5041M();
                c1202a.f3685i = this.f3647e.m5128v();
                C1267h.m3614a();
                c1202a.f3688l = C1267h.m3616a(this.f3647e, this.f3648f);
                C1267h.m3614a();
                c1202a.f3691o = C1267h.m3615a(this.f3647e);
                C1267h.m3614a();
                c1202a.f3692p = C1267h.m3620b(this.f3647e);
                c1202a.f3686j = this.f3649g;
                c1202a.f3690n = this.f3650h;
                c1202a.f3695s = this.f3651i;
                c1202a.f3698v = this.f3652j;
                c1202a.f3699w = this.f3653k;
                c1202a.f3700x = this.f3654l;
                c1202a.f3693q = C1387u.m4556a().m4570b(C1201f.this.f3616b);
                c1202a.f3689m = this.f3648f;
                C1257v c1257v = this.f3644b;
                if (c1257v.f4483d == 8) {
                    c1202a.f3696t = 7;
                }
                c1202a.f3701y = this.f3655m;
                c1202a.f3676A = c1257v.f4491l;
                c1202a.f3677B = C1193d.m2290a().m2298c(C1201f.this.f3616b);
                C1101b c1101b = new C1101b(c1202a);
                c1101b.mo1625a(ATSDK.isNetworkLogDebug());
                c1101b.mo1624a(new C1288i.a() { // from class: com.anythink.core.common.f.2.1
                    public AnonymousClass1() {
                    }

                    @Override // com.anythink.core.common.C1288i.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2408a(String str) {
                        C1262g c1262g = C1201f.this.f3617c.get(str);
                        if (c1262g != null) {
                            c1262g.m3599d();
                        }
                    }

                    @Override // com.anythink.core.common.C1288i.a
                    /* JADX INFO: renamed from: a */
                    public final void mo2409a(String str, List<C1229av> list, List<C1229av> list2, boolean z) {
                        boolean zM2919d = AnonymousClass2.this.f3650h.m2919d();
                        ArrayList arrayList = null;
                        for (C1229av c1229av : list2) {
                            if (zM2919d && (c1229av.m2826m() == 1 || c1229av.m2826m() == 3)) {
                                if (c1229av.m2721O() != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList(4);
                                    }
                                    c1229av.m2849x(7);
                                    arrayList.add(c1229av);
                                }
                            }
                            if (!zM2919d && c1229av.m2822l() != 0) {
                                C1179c c1179cM2193a = C1179c.m2193a();
                                c1179cM2193a.f3452c.put(c1229av.m2842u(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        C1262g c1262g = C1201f.this.f3617c.get(str);
                        if (c1262g != null) {
                            c1262g.m3596a(list, list2, arrayList);
                            if (z) {
                                c1262g.m3600e();
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
                C1262g c1262g = C1201f.this.f3617c.get(this.f3645c);
                if (c1262g != null) {
                    c1262g.m3600e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.f$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3658a;

        public AnonymousClass3(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1262g c1262g = C1201f.this.f3617c.get(str);
            if (c1262g != null) {
                c1262g.m3602g();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.f$4 */
    public class AnonymousClass4 implements InterfaceC1162a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1162a[] f3660a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3661b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3662c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f3663d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1257v f3664e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C1396f f3665f;

        public AnonymousClass4(InterfaceC1162a[] interfaceC1162aArr, String str, String str2, String str3, C1257v c1257v, C1396f c1396f) {
            this.f3660a = interfaceC1162aArr;
            this.f3661b = str;
            this.f3662c = str2;
            this.f3663d = str3;
            this.f3664e = c1257v;
            this.f3665f = c1396f;
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public final void onAdLoadFail(AdError adError) {
            if (this.f3660a[0] != null) {
                C1322e.m3918a(this.f3661b, this.f3662c, this.f3663d, this.f3664e.f4480a, this.f3665f, false, "0", "0", "");
                this.f3660a[0].onAdLoadFail(adError);
            }
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public final void onAdLoaded() {
            if (this.f3660a[0] != null) {
                C1322e.m3918a(this.f3661b, this.f3662c, this.f3663d, this.f3664e.f4480a, this.f3665f, true, "0", "1", "");
                this.f3660a[0].onAdLoaded();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.f$5 */
    public class AnonymousClass5 implements InterfaceC1162a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3667a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f3668b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f3669c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C1257v f3670d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1396f f3671e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC1162a[] f3672f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f3673g;

        public AnonymousClass5(String str, String str2, String str3, C1257v c1257v, C1396f c1396f, InterfaceC1162a[] interfaceC1162aArr, Context context) {
            this.f3667a = str;
            this.f3668b = str2;
            this.f3669c = str3;
            this.f3670d = c1257v;
            this.f3671e = c1396f;
            this.f3672f = interfaceC1162aArr;
            this.f3673g = context;
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public final void onAdLoadFail(AdError adError) {
            C1234b c1234bM2361b = C1201f.m2361b(this.f3673g, this.f3668b, this.f3669c, this.f3670d);
            if (c1234bM2361b == null) {
                C1389w.m4583a().m4626b(this.f3668b);
                C1322e.m3918a(this.f3667a, this.f3668b, this.f3669c, this.f3670d.f4480a, this.f3671e, false, "0", "0", "");
                InterfaceC1162a[] interfaceC1162aArr = this.f3672f;
                if (interfaceC1162aArr[0] != null) {
                    interfaceC1162aArr[0].onAdLoadFail(adError);
                    return;
                }
                return;
            }
            C1352p.m4211a("Shared", "placementId:" + this.f3667a + ";result_callback:success;");
            C1243h c1243hM2908h = c1234bM2361b.m2908h();
            C1322e.m3918a(this.f3667a, this.f3668b, this.f3669c, this.f3670d.f4480a, this.f3671e, true, "1", "0", c1243hM2908h != null ? c1243hM2908h.m2678ai() : "");
            InterfaceC1162a[] interfaceC1162aArr2 = this.f3672f;
            if (interfaceC1162aArr2[0] != null) {
                interfaceC1162aArr2[0].onAdLoaded();
            }
        }

        @Override // com.anythink.core.common.p051b.InterfaceC1162a
        public final void onAdLoaded() {
            C1322e.m3918a(this.f3667a, this.f3668b, this.f3669c, this.f3670d.f4480a, this.f3671e, true, "2", "1", "");
            InterfaceC1162a[] interfaceC1162aArr = this.f3672f;
            if (interfaceC1162aArr[0] != null) {
                interfaceC1162aArr[0].onAdLoaded();
            }
        }
    }

    private C1201f(Context context, String str) {
        this.f3615a = context.getApplicationContext();
        this.f3616b = str;
        if (C1175n.m2059a().m2148f() == null) {
            C1175n.m2059a().m2111a(this.f3615a);
        }
    }

    /* JADX INFO: renamed from: a */
    private C1234b m2339a(Context context, boolean z, boolean z3, Map<String, Object> map, C1201f c1201f, C1396f c1396f) {
        C1234b c1234bM2382a;
        double dM2913m;
        String str;
        boolean z4;
        String str2;
        String str3;
        boolean z5;
        String strValueOf;
        String strM5118l = c1396f.m5118l();
        int iM5090ah = c1396f.m5090ah();
        C1389w.m4583a();
        C1201f c1201fM4582a = C1389w.m4582a(strM5118l, String.valueOf(iM5090ah));
        if (c1201fM4582a != null) {
            C1238c c1238c = new C1238c();
            m2347a(c1238c, this.f3616b, c1396f);
            c1234bM2382a = c1201fM4582a.m2382a(context, z, z3, map, c1238c);
            if (c1234bM2382a != null) {
                C1358v.m4257a(this.f3616b, c1396f, c1234bM2382a.m2908h());
            }
        } else {
            c1234bM2382a = null;
        }
        double dM2913m2 = 0.0d;
        String strM2678ai = "";
        if (c1234bM2382a != null) {
            C1243h c1243hM2908h = c1234bM2382a.m2908h();
            String strM2678ai2 = c1243hM2908h != null ? c1243hM2908h.m2678ai() : "";
            dM2913m = c1234bM2382a.m2913m();
            str = strM2678ai2;
            z4 = true;
        } else {
            C1389w.m4583a().m4626b(strM5118l);
            dM2913m = 0.0d;
            str = "";
            z4 = false;
        }
        C1234b c1234bM2382a2 = c1201f.m2382a(context, z, z3, map, (C1238c) null);
        if (c1234bM2382a2 != null) {
            C1243h c1243hM2908h2 = c1234bM2382a2.m2908h();
            if (c1243hM2908h2 != null) {
                strM2678ai = c1243hM2908h2.m2678ai();
                strValueOf = String.valueOf(c1243hM2908h2.m3037N());
            } else {
                strValueOf = "";
            }
            str3 = strValueOf;
            str2 = strM2678ai;
            dM2913m2 = c1234bM2382a2.m2913m();
            z5 = true;
        } else {
            str2 = "";
            str3 = str2;
            z5 = false;
        }
        if (c1234bM2382a != null) {
            if (c1234bM2382a2 == null) {
                c1234bM2382a2 = c1234bM2382a;
            } else if (dM2913m > dM2913m2) {
                StringBuilder sb = new StringBuilder("CheckCacheWithShared, shared placement 's price is higher, shared price: ");
                sb.append(dM2913m);
                sb.append(", real price:");
                sb.append(dM2913m2);
                c1234bM2382a2 = c1234bM2382a;
            } else {
                StringBuilder sb2 = new StringBuilder("CheckCacheWithShared, real placement 's price is higher or same, shared price: ");
                sb2.append(dM2913m);
                sb2.append(", real price:");
                sb2.append(dM2913m2);
            }
        }
        C1322e.m3912a(this.f3616b, strM5118l, c1396f, z5 || z4, z5, z4, str2, str, str3);
        return c1234bM2382a2;
    }

    /* JADX INFO: renamed from: a */
    public static C1201f m2340a(Context context, String str, String str2) {
        C1201f c1201fM4559a = C1387u.m4556a().m4559a(str, str2);
        if (c1201fM4559a == null) {
            synchronized (C1201f.class) {
                if (c1201fM4559a == null) {
                    c1201fM4559a = new C1201f(context, str);
                    byte b = -1;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 49) {
                        if (iHashCode == 51 && str2.equals("3")) {
                            b = 1;
                        }
                    } else if (str2.equals("1")) {
                        b = 0;
                    }
                    if (b == 0 || b == 1) {
                        c1201fM4559a.f3625k = new C1295a(str, str2);
                    }
                    C1387u.m4556a().m4564a(str, str2, c1201fM4559a);
                }
            }
        }
        return c1201fM4559a;
    }

    /* JADX INFO: renamed from: a */
    public static String m2341a(C1248m c1248m) {
        return c1248m.f4321b + c1248m.f4322c + c1248m.f4325f + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private static List<ATAdInfo> m2343a(Context context, C1201f c1201f, C1396f c1396f) {
        C1234b c1234bM2382a;
        String strM5118l = c1396f.m5118l();
        C1389w.m4583a();
        C1201f c1201fM4582a = C1389w.m4582a(strM5118l, String.valueOf(c1396f.m5090ah()));
        ATAdInfo aTAdInfoM2914n = (c1201fM4582a == null || (c1234bM2382a = c1201fM4582a.m2382a(context, false, false, (Map<String, Object>) null, (C1238c) null)) == null) ? null : c1234bM2382a.m2914n();
        List<ATAdInfo> listM2384a = c1201f.m2384a(context);
        if (aTAdInfoM2914n == null) {
            return listM2384a;
        }
        if (listM2384a == null || listM2384a.size() == 0) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(aTAdInfoM2914n);
            return arrayList;
        }
        ATAdInfo aTAdInfo = listM2384a.get(0);
        if (aTAdInfo != null && aTAdInfoM2914n.getEcpm() > aTAdInfo.getEcpm()) {
            StringBuilder sb = new StringBuilder("sharedCheckValidAdCaches, shared top price > real top price, shared price: ");
            sb.append(aTAdInfoM2914n.getEcpm());
            sb.append(", real price: ");
            sb.append(aTAdInfo.getEcpm());
            listM2384a.add(0, aTAdInfoM2914n);
        }
        return listM2384a;
    }

    /* JADX INFO: renamed from: a */
    private void m2344a(Context context, String str, String str2, C1257v c1257v, InterfaceC1162a interfaceC1162a, C1201f c1201f, C1396f c1396f) {
        C1201f c1201f2;
        Context context2;
        String str3;
        String str4;
        C1257v c1257v2;
        InterfaceC1162a anonymousClass5;
        String strM5118l = c1396f.m5118l();
        C1238c c1238c = new C1238c();
        m2347a(c1238c, str2, c1396f);
        c1257v.f4488i = c1238c;
        InterfaceC1162a[] interfaceC1162aArr = {interfaceC1162a};
        if (c1396f.m5121o() == 1) {
            C1234b c1234bM2361b = m2361b(context, strM5118l, str, c1257v);
            if (c1234bM2361b != null) {
                String strM4133a = C1344h.m4133a(context);
                c1257v.f4480a = strM4133a;
                C1352p.m4211a("Shared", "placementId:" + str2 + ";result_callback:success;");
                C1243h c1243hM2908h = c1234bM2361b.m2908h();
                C1322e.m3918a(str2, strM5118l, str, strM4133a, c1396f, true, "1", "2", c1243hM2908h != null ? c1243hM2908h.m2678ai() : "");
                if (interfaceC1162aArr[0] != null) {
                    interfaceC1162aArr[0].onAdLoaded();
                }
                interfaceC1162aArr[0] = null;
            } else {
                C1389w.m4583a().m4626b(strM5118l);
            }
            str4 = str2;
            c1201f2 = c1201f;
            context2 = context;
            str3 = str;
            c1257v2 = c1257v;
            anonymousClass5 = new AnonymousClass4(interfaceC1162aArr, str4, strM5118l, str, c1257v, c1396f);
        } else {
            c1201f2 = c1201f;
            context2 = context;
            str3 = str;
            str4 = str2;
            c1257v2 = c1257v;
            anonymousClass5 = new AnonymousClass5(str2, strM5118l, str, c1257v, c1396f, interfaceC1162aArr, context);
        }
        c1201f2.m2385a(context2, str3, str4, c1257v2, anonymousClass5);
    }

    /* JADX INFO: renamed from: a */
    private void m2345a(Context context, String str, String str2, C1396f c1396f, C1243h c1243h, C1257v c1257v) {
        C1243h c1243h2;
        C1257v c1257v2;
        C1201f c1201f;
        boolean z;
        boolean z3;
        C1257v c1257v3;
        C1201f c1201f2;
        C1251p c1251p;
        C1229av c1229av;
        C1262g c1262g;
        boolean z4;
        C1251p c1251p2;
        C1233az c1233az;
        C1251p c1251p3;
        C1224aq c1224aq;
        Map<String, Object> map;
        StringBuilder sb = new StringBuilder("checkToGetWaterfallList() >>> WaterFall started. requestId: ");
        sb.append(str2);
        sb.append(" placementId: ");
        sb.append(str);
        sb.append(" wf_id: ");
        sb.append(c1396f.m5123q());
        C1322e.m3916a("1", str2, str, "", 0, c1396f.m5090ah(), 0L);
        C1235ba c1235ba = new C1235ba(c1257v, c1396f);
        if (c1243h != null) {
            c1243h.m3067c(c1235ba.m2920e());
            c1243h.m3074d(c1235ba.m2921f());
        }
        try {
            try {
                if (c1396f.m5080aV()) {
                    try {
                        m2352a(c1396f, c1243h);
                        m2362b(c1396f, c1243h);
                        C1223ap c1223apM4225a = C1354r.m4225a(c1396f, c1243h);
                        C1243h c1243hM2622c = c1223apM4225a.m2622c();
                        if (c1223apM4225a.m2620b() == 0) {
                            try {
                                c1243hM2622c.m3025E(5);
                                if (c1223apM4225a.m2618a().m5127u() != 1) {
                                    throw new C1242g(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                                }
                                throw new C1242g(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                            } catch (Throwable th) {
                                th = th;
                                c1243h2 = c1243h;
                                c1257v3 = c1257v;
                                c1201f2 = this;
                                z3 = true;
                                c1201f2.m2355a(z3, c1243h2, th, c1257v3);
                                return;
                            }
                        }
                        if (!c1223apM4225a.m2629h()) {
                            c1243hM2622c.m3025E(6);
                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                            throw new C1242g(errorCode, errorCode.printStackTrace());
                        }
                        ArrayList arrayList = new ArrayList(1);
                        C1354r.m4231b(c1223apM4225a, arrayList);
                        List<C1229av> listM4226a = C1354r.m4226a(c1223apM4225a, c1223apM4225a.m2624d());
                        C1148a.m1904a().m1920b(str);
                        boolean z5 = arrayList.size() > 0;
                        boolean z6 = !z5 && (c1223apM4225a.m2626e() == null || c1223apM4225a.m2626e().size() == 0);
                        if (z6 && ((listM4226a == null || listM4226a.size() == 0) && ((c1223apM4225a.m2627f() == null || c1223apM4225a.m2627f().size() == 0) && (c1223apM4225a.m2628g() == null || c1223apM4225a.m2628g().size() == 0)))) {
                            AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                            c1243h.m3025E(6);
                            m2354a(true, c1243h, errorCode2, c1257v);
                            this.f3618d = false;
                            return;
                        }
                        C1087b.m1574a().m1576b(this.f3615a, str, c1396f);
                        C1320c.m3839a(this.f3615a).m3851a(10, c1243h);
                        Map<String, Object> mapM4570b = C1387u.m4556a().m4570b(this.f3616b);
                        Map<String, C1233az> map2 = C1390x.m4629a(this.f3615a).f5681a;
                        C1233az c1233azRemove = map2 != null ? map2.remove(str) : null;
                        C1224aq c1224aqM4578a = C1388v.m4576a(this.f3615a).m4578a(str, str2);
                        C1251p c1251pM2291a = C1193d.m2290a().m2291a(str);
                        C1251p c1251p4 = new C1251p(str2);
                        C1224aq c1224aq2 = c1224aqM4578a;
                        C1193d.m2290a().m2293a(this.f3616b, c1251p4);
                        c1243h.m3064b(true);
                        c1243h.m3136w(c1235ba.m2921f());
                        C1262g c1262g2 = new C1262g(c1257v.m3445a());
                        c1262g2.f4551h = mapM4570b;
                        c1262g2.f4552i = c1243h;
                        c1262g2.m3592a(c1257v);
                        c1262g2.m3591a(c1257v.f4484e);
                        this.f3619e = str2;
                        this.f3627m = c1243h.m2670aa();
                        List<C1229av> listM5175a = C1403m.m5175a(c1396f, c1396f.m5044P());
                        if (listM5175a.size() > 0) {
                            c1251p = c1251p4;
                            c1229av = listM5175a.get(0);
                        } else {
                            c1251p = c1251p4;
                            c1229av = null;
                        }
                        if (c1229av != null) {
                            for (C1229av c1229av2 : c1223apM4225a.m2626e()) {
                                if (c1229av2.m2842u().equals(c1229av.m2842u())) {
                                    c1262g = c1262g2;
                                    C1224aq c1224aq3 = c1224aq2;
                                    z4 = z6;
                                    c1233az = c1233azRemove;
                                    map = mapM4570b;
                                    c1251p2 = c1251pM2291a;
                                    c1251p3 = c1251p;
                                    c1224aq = c1224aq3;
                                    c1262g.f4535H = C1151c.m1933a().m1935a(context, str, str2, c1229av2, c1396f, map);
                                } else {
                                    c1262g = c1262g2;
                                    z4 = z6;
                                    c1251p2 = c1251pM2291a;
                                    c1233az = c1233azRemove;
                                    c1251p3 = c1251p;
                                    c1224aq = c1224aq2;
                                    map = mapM4570b;
                                }
                                c1262g2 = c1262g;
                                z6 = z4;
                                c1233azRemove = c1233az;
                                mapM4570b = map;
                                c1251pM2291a = c1251p2;
                                c1251p = c1251p3;
                                c1224aq2 = c1224aq;
                            }
                        }
                        C1262g c1262g3 = c1262g2;
                        boolean z7 = z6;
                        C1251p c1251p5 = c1251pM2291a;
                        C1233az c1233az2 = c1233azRemove;
                        C1224aq c1224aq4 = c1224aq2;
                        C1370i c1370i = new C1370i(listM4226a);
                        C1369h c1369h = new C1369h();
                        c1369h.f5437a = str;
                        c1369h.f5438b = str2;
                        c1369h.f5439c = c1235ba;
                        c1369h.f5440d = listM4226a;
                        c1369h.f5441e = c1223apM4225a.m2628g();
                        c1369h.f5443g = z7;
                        c1369h.f5444h = c1243h.m2673ad();
                        c1369h.f5445i = c1233az2;
                        c1369h.f5447k = c1224aq4;
                        c1369h.f5446j = c1370i;
                        c1369h.f5449m = c1251p5;
                        c1369h.f5448l = c1251p;
                        c1369h.f5442f = c1223apM4225a.m2627f();
                        c1262g3.m3593a(c1369h);
                        this.f3617c.put(str2, c1262g3);
                        c1262g3.m3597b();
                        this.f3618d = false;
                        if (z7) {
                            return;
                        }
                        C1335b.m3998a().m4010c(new AnonymousClass2(context, c1257v, str2, str, c1396f, z5, c1223apM4225a.m2626e(), c1235ba, c1243h, c1233az2, c1224aq4, c1251p5, c1370i));
                        return;
                    } catch (C1242g e) {
                        e = e;
                        z = true;
                        c1201f = this;
                        c1243h2 = c1243h;
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = true;
                        c1201f2 = this;
                        c1243h2 = c1243h;
                        c1257v3 = c1257v;
                        c1201f2.m2355a(z3, c1243h2, th, c1257v3);
                        return;
                    }
                } else {
                    c1243h2 = c1243h;
                    try {
                        c1243h2.m3025E(5);
                        throw new C1242g(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
                    } catch (C1242g e2) {
                        e = e2;
                        z = true;
                        c1201f = this;
                    } catch (Throwable th3) {
                        th = th3;
                        z3 = true;
                        c1201f2 = this;
                        c1257v3 = c1257v;
                        c1201f2.m2355a(z3, c1243h2, th, c1257v3);
                        return;
                    }
                }
                c1257v2 = c1257v;
            } catch (C1242g e3) {
                e = e3;
                c1243h2 = c1243h;
                c1257v2 = c1257v;
                c1201f = this;
                z = true;
            }
            c1201f.m2355a(z, c1243h2, e, c1257v2);
        } catch (Throwable th4) {
            th = th4;
            c1243h2 = c1243h;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m2346a(C1223ap c1223ap) {
        C1243h c1243hM2622c = c1223ap.m2622c();
        if (c1223ap.m2620b() == 0) {
            c1243hM2622c.m3025E(5);
            if (c1223ap.m2618a().m5127u() != 1) {
                throw new C1242g(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
            }
            throw new C1242g(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
        }
        if (c1223ap.m2629h()) {
            return;
        }
        c1243hM2622c.m3025E(6);
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
        throw new C1242g(errorCode, errorCode.printStackTrace());
    }

    /* JADX INFO: renamed from: a */
    private static void m2347a(C1238c c1238c, String str, C1396f c1396f) {
        c1238c.m2967a(str, c1396f.m5097ao(), c1396f.m5054Z());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2348a(C1201f c1201f, Context context, String str, String str2, C1396f c1396f, C1243h c1243h, C1257v c1257v) {
        C1243h c1243h2;
        C1257v c1257v2;
        C1257v c1257v3;
        C1251p c1251p;
        C1229av c1229av;
        boolean z;
        C1233az c1233az;
        List<C1229av> list;
        C1251p c1251p2;
        C1224aq c1224aq;
        C1251p c1251p3;
        Map<String, Object> map;
        StringBuilder sb = new StringBuilder("checkToGetWaterfallList() >>> WaterFall started. requestId: ");
        sb.append(str2);
        sb.append(" placementId: ");
        sb.append(str);
        sb.append(" wf_id: ");
        sb.append(c1396f.m5123q());
        C1322e.m3916a("1", str2, str, "", 0, c1396f.m5090ah(), 0L);
        C1235ba c1235ba = new C1235ba(c1257v, c1396f);
        if (c1243h != null) {
            c1243h.m3067c(c1235ba.m2920e());
            c1243h.m3074d(c1235ba.m2921f());
        }
        try {
            try {
                if (!c1396f.m5080aV()) {
                    c1243h2 = c1243h;
                    try {
                        c1243h2.m3025E(5);
                        throw new C1242g(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
                    } catch (C1242g e) {
                        e = e;
                        c1257v2 = c1257v;
                        c1201f.m2355a(true, c1243h2, (Throwable) e, c1257v2);
                    } catch (Throwable th) {
                        th = th;
                        c1257v3 = c1257v;
                        c1201f.m2355a(true, c1243h2, th, c1257v3);
                    }
                }
                try {
                    m2352a(c1396f, c1243h);
                    m2362b(c1396f, c1243h);
                    C1223ap c1223apM4225a = C1354r.m4225a(c1396f, c1243h);
                    C1243h c1243hM2622c = c1223apM4225a.m2622c();
                    if (c1223apM4225a.m2620b() == 0) {
                        try {
                            c1243hM2622c.m3025E(5);
                            if (c1223apM4225a.m2618a().m5127u() != 1) {
                                throw new C1242g(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                            }
                            throw new C1242g(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                        } catch (Throwable th2) {
                            th = th2;
                            c1243h2 = c1243h;
                            c1257v3 = c1257v;
                            c1201f.m2355a(true, c1243h2, th, c1257v3);
                        }
                    }
                    if (!c1223apM4225a.m2629h()) {
                        c1243hM2622c.m3025E(6);
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        throw new C1242g(errorCode, errorCode.printStackTrace());
                    }
                    ArrayList arrayList = new ArrayList(1);
                    C1354r.m4231b(c1223apM4225a, arrayList);
                    List<C1229av> listM4226a = C1354r.m4226a(c1223apM4225a, c1223apM4225a.m2624d());
                    C1148a.m1904a().m1920b(str);
                    boolean z3 = arrayList.size() > 0;
                    boolean z4 = !z3 && (c1223apM4225a.m2626e() == null || c1223apM4225a.m2626e().size() == 0);
                    if (z4 && ((listM4226a == null || listM4226a.size() == 0) && ((c1223apM4225a.m2627f() == null || c1223apM4225a.m2627f().size() == 0) && (c1223apM4225a.m2628g() == null || c1223apM4225a.m2628g().size() == 0)))) {
                        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        c1243h.m3025E(6);
                        c1201f.m2354a(true, c1243h, errorCode2, c1257v);
                        c1201f.f3618d = false;
                        return;
                    }
                    C1087b.m1574a().m1576b(c1201f.f3615a, str, c1396f);
                    C1320c.m3839a(c1201f.f3615a).m3851a(10, c1243h);
                    Map<String, Object> mapM4570b = C1387u.m4556a().m4570b(c1201f.f3616b);
                    Map<String, C1233az> map2 = C1390x.m4629a(c1201f.f3615a).f5681a;
                    C1233az c1233azRemove = map2 != null ? map2.remove(str) : null;
                    C1224aq c1224aqM4578a = C1388v.m4576a(c1201f.f3615a).m4578a(str, str2);
                    C1251p c1251pM2291a = C1193d.m2290a().m2291a(str);
                    C1251p c1251p4 = new C1251p(str2);
                    C1224aq c1224aq2 = c1224aqM4578a;
                    C1193d.m2290a().m2293a(c1201f.f3616b, c1251p4);
                    c1243h.m3064b(true);
                    c1243h.m3136w(c1235ba.m2921f());
                    C1262g c1262g = new C1262g(c1257v.m3445a());
                    c1262g.f4551h = mapM4570b;
                    c1262g.f4552i = c1243h;
                    c1262g.m3592a(c1257v);
                    c1262g.m3591a(c1257v.f4484e);
                    c1201f.f3619e = str2;
                    c1201f.f3627m = c1243h.m2670aa();
                    List<C1229av> listM5175a = C1403m.m5175a(c1396f, c1396f.m5044P());
                    if (listM5175a.size() > 0) {
                        c1251p = c1251p4;
                        c1229av = listM5175a.get(0);
                    } else {
                        c1251p = c1251p4;
                        c1229av = null;
                    }
                    if (c1229av != null) {
                        for (C1229av c1229av2 : c1223apM4225a.m2626e()) {
                            if (c1229av2.m2842u().equals(c1229av.m2842u())) {
                                C1224aq c1224aq3 = c1224aq2;
                                z = z4;
                                c1233az = c1233azRemove;
                                map = mapM4570b;
                                c1224aq = c1224aq3;
                                c1251p2 = c1251p;
                                c1251p3 = c1251pM2291a;
                                list = listM4226a;
                                c1262g.f4535H = C1151c.m1933a().m1935a(context, str, str2, c1229av2, c1396f, map);
                            } else {
                                z = z4;
                                c1233az = c1233azRemove;
                                list = listM4226a;
                                c1251p2 = c1251p;
                                c1224aq = c1224aq2;
                                c1251p3 = c1251pM2291a;
                                map = mapM4570b;
                            }
                            z4 = z;
                            c1233azRemove = c1233az;
                            listM4226a = list;
                            c1251pM2291a = c1251p3;
                            mapM4570b = map;
                            c1251p = c1251p2;
                            c1224aq2 = c1224aq;
                        }
                    }
                    boolean z5 = z4;
                    C1233az c1233az2 = c1233azRemove;
                    List<C1229av> list2 = listM4226a;
                    C1251p c1251p5 = c1251p;
                    C1224aq c1224aq4 = c1224aq2;
                    C1251p c1251p6 = c1251pM2291a;
                    C1370i c1370i = new C1370i(list2);
                    C1369h c1369h = new C1369h();
                    c1369h.f5437a = str;
                    c1369h.f5438b = str2;
                    c1369h.f5439c = c1235ba;
                    c1369h.f5440d = list2;
                    c1369h.f5441e = c1223apM4225a.m2628g();
                    c1369h.f5443g = z5;
                    c1369h.f5444h = c1243h.m2673ad();
                    c1369h.f5445i = c1233az2;
                    c1369h.f5447k = c1224aq4;
                    c1369h.f5446j = c1370i;
                    c1369h.f5449m = c1251p6;
                    c1369h.f5448l = c1251p5;
                    c1369h.f5442f = c1223apM4225a.m2627f();
                    c1262g.m3593a(c1369h);
                    c1201f.f3617c.put(str2, c1262g);
                    c1262g.m3597b();
                    c1201f.f3618d = false;
                    if (z5) {
                        return;
                    }
                    C1335b.m3998a().m4010c(c1201f.new AnonymousClass2(context, c1257v, str2, str, c1396f, z3, c1223apM4225a.m2626e(), c1235ba, c1243h, c1233az2, c1224aq4, c1251p6, c1370i));
                } catch (C1242g e2) {
                    e = e2;
                    c1243h2 = c1243h;
                    c1257v2 = c1257v;
                    c1201f.m2355a(true, c1243h2, (Throwable) e, c1257v2);
                } catch (Throwable th3) {
                    th = th3;
                    c1243h2 = c1243h;
                    c1257v3 = c1257v;
                    c1201f.m2355a(true, c1243h2, th, c1257v3);
                }
            } catch (C1242g e3) {
                e = e3;
                c1243h2 = c1243h;
                c1257v2 = c1257v;
            }
        } catch (Throwable th4) {
            th = th4;
            c1243h2 = c1243h;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2351a(InterfaceC1298d interfaceC1298d) {
        this.f3625k = interfaceC1298d;
    }

    /* JADX INFO: renamed from: a */
    public static void m2352a(C1396f c1396f, C1243h c1243h) {
        if (C1086a.m1566a(C1175n.m2059a().m2148f()).m1571a(c1396f, c1243h.m2677ah())) {
            c1243h.m3025E(1);
            throw new C1242g(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2353a(String str, InterfaceC1162a interfaceC1162a) {
        InterfaceC1297c interfaceC1297c = this.f3623i;
        if (interfaceC1297c != null) {
            interfaceC1297c.mo3735a(str, interfaceC1162a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2354a(boolean z, C1243h c1243h, AdError adError, C1257v c1257v) {
        this.f3618d = false;
        c1243h.m3064b(false);
        if (z) {
            C1320c.m3839a(this.f3615a).m3851a(10, c1243h);
            C1322e.m3881a(c1243h, adError);
        }
        m2389a(c1257v, adError);
    }

    /* JADX INFO: renamed from: a */
    public void m2355a(boolean z, C1243h c1243h, Throwable th, C1257v c1257v) {
        m2354a(z, c1243h, th instanceof C1242g ? ((C1242g) th).f4117a : ErrorCode.getErrorCode(ErrorCode.exception, "", th.getMessage()), c1257v);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2356a(C1201f c1201f) {
        InterfaceC1299e interfaceC1299e = c1201f.f3624j;
        return interfaceC1299e != null ? interfaceC1299e.mo3740b() : !TextUtils.isEmpty(c1201f.f3619e);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2357a(C1201f c1201f, String str, String str2, C1257v c1257v, C1317n c1317n) {
        InterfaceC1299e interfaceC1299e = c1201f.f3624j;
        if (interfaceC1299e != null) {
            return interfaceC1299e.mo3739a(c1201f.f3615a, str, str2, c1257v, c1317n);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2359a(String str, String str2, C1257v c1257v, C1317n c1317n) {
        InterfaceC1299e interfaceC1299e = this.f3624j;
        if (interfaceC1299e != null) {
            return interfaceC1299e.mo3739a(this.f3615a, str, str2, c1257v, c1317n);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2360a(boolean z, boolean z3, Map<String, Object> map, C1238c c1238c) {
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.f3616b);
        String str = TextUtils.isEmpty(this.f3619e) ? "" : this.f3619e;
        if (c1396fM5139a == null) {
            c1396fM5139a = C1398h.m5135a(this.f3615a).m5139a(this.f3616b);
        }
        C1396f c1396f = c1396fM5139a;
        if (c1396f == null) {
            if (z) {
                C1322e.m3909a(str, this.f3616b, c1396f, 4, "", map);
            } else if (z3) {
                C1322e.m3923a(str, this.f3616b, false, 4, c1396f, (C1234b) null, "", "", map, c1238c);
            }
            return true;
        }
        C1088c.m1577a();
        if (C1088c.m1579a(this.f3616b, c1396f)) {
            if (z) {
                C1322e.m3909a(str, this.f3616b, c1396f, 3, "", map);
            } else if (z3) {
                C1322e.m3923a(str, this.f3616b, false, 3, c1396f, (C1234b) null, "", "", map, c1238c);
            }
            return true;
        }
        if (!C1086a.m1566a(this.f3615a).m1571a(c1396f, this.f3616b)) {
            return false;
        }
        if (z) {
            C1322e.m3909a(str, this.f3616b, c1396f, 2, "", map);
        } else if (z3) {
            C1322e.m3923a(str, this.f3616b, false, 2, c1396f, (C1234b) null, "", "", map, c1238c);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C1234b m2361b(Context context, String str, String str2, C1257v c1257v) {
        C1389w.m4583a();
        C1201f c1201fM4582a = C1389w.m4582a(str, str2);
        if (c1201fM4582a != null) {
            return c1201fM4582a.m2382a(context, true, false, c1257v.f4486g, c1257v.f4488i);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m2362b(C1396f c1396f, C1243h c1243h) {
        C1088c.m1577a();
        if (C1088c.m1579a(c1243h.m2677ah(), c1396f)) {
            c1243h.m3025E(2);
            throw new C1242g(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2364c(C1201f c1201f) {
        InterfaceC1298d interfaceC1298d = c1201f.f3625k;
        if (interfaceC1298d != null) {
            interfaceC1298d.mo3732c();
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m2365c(C1396f c1396f, C1243h c1243h) {
        if (c1396f.m5080aV()) {
            return;
        }
        c1243h.m3025E(5);
        throw new C1242g(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m2366d(C1201f c1201f) {
        InterfaceC1299e interfaceC1299e = c1201f.f3624j;
        return interfaceC1299e != null && interfaceC1299e.mo3738a();
    }

    /* JADX INFO: renamed from: h */
    private boolean m2371h() {
        return System.currentTimeMillis() - this.f3629o <= C1659a.f9130f;
    }

    /* JADX INFO: renamed from: i */
    private boolean m2372i() {
        InterfaceC1299e interfaceC1299e = this.f3624j;
        return interfaceC1299e != null && interfaceC1299e.mo3738a();
    }

    /* JADX INFO: renamed from: j */
    private boolean m2374j() {
        InterfaceC1299e interfaceC1299e = this.f3624j;
        return interfaceC1299e != null ? interfaceC1299e.mo3740b() : !TextUtils.isEmpty(this.f3619e);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m2375j(C1201f c1201f) {
        c1201f.f3628n = false;
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ long m2376k(C1201f c1201f) {
        c1201f.f3629o = 0L;
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public boolean m2377k() {
        InterfaceC1298d interfaceC1298d = this.f3625k;
        return interfaceC1298d != null && interfaceC1298d.mo3730a();
    }

    /* JADX INFO: renamed from: l */
    private void m2378l() {
        InterfaceC1298d interfaceC1298d = this.f3625k;
        if (interfaceC1298d != null) {
            interfaceC1298d.mo3732c();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m2379m() {
        InterfaceC1298d interfaceC1298d = this.f3625k;
        if (interfaceC1298d != null) {
            interfaceC1298d.mo3731b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final ATAdStatusInfo m2380a(Context context, Map<String, Object> map) {
        boolean zM2403f = m2403f();
        C1234b c1234bM2381a = m2381a(context, true, false, map);
        ATAdStatusInfo aTAdStatusInfo = new ATAdStatusInfo(zM2403f, c1234bM2381a != null, c1234bM2381a != null ? c1234bM2381a.m2914n() : null);
        if (this.f3625k != null) {
            if (!(System.currentTimeMillis() - this.f3629o <= C1659a.f9130f) && m2394a(aTAdStatusInfo) && (m2399c() <= 0 || !aTAdStatusInfo.isReady())) {
                this.f3625k.mo3727a(context, 5);
            }
        }
        return aTAdStatusInfo;
    }

    /* JADX INFO: renamed from: a */
    public final C1234b m2381a(Context context, boolean z, boolean z3, Map<String, Object> map) {
        if (C1389w.m4583a().m4627b()) {
            C1396f c1396fM5139a = C1398h.m5135a(context).m5139a(this.f3616b);
            if (c1396fM5139a != null && C1389w.m4583a().m4628c(this.f3616b)) {
                Log.w("anythink", "Forbidden placement");
                return null;
            }
            if (C1389w.m4583a().m4625a(c1396fM5139a)) {
                return m2339a(context, z, z3, map, this, c1396fM5139a);
            }
        }
        return m2382a(context, z, z3, map, (C1238c) null);
    }

    /* JADX INFO: renamed from: a */
    public final C1234b m2382a(Context context, boolean z, boolean z3, Map<String, Object> map, C1238c c1238c) {
        InterfaceC1299e interfaceC1299e;
        if (m2360a(z3, z, map, c1238c)) {
            return null;
        }
        C1234b c1234bM1912a = C1148a.m1904a().m1912a(context, this.f3616b, z, z3, map, c1238c);
        return (c1234bM1912a != null || (interfaceC1299e = this.f3624j) == null) ? c1234bM1912a : interfaceC1299e.mo3736a(this.f3616b, z, map, c1238c);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1298d m2383a() {
        return this.f3625k;
    }

    /* JADX INFO: renamed from: a */
    public final List<ATAdInfo> m2384a(Context context) {
        List<C1234b> listM1913a;
        C1171j c1171jM2044a;
        if (m2360a(false, false, (Map<String, Object>) null, (C1238c) null) || (listM1913a = C1148a.m1904a().m1913a(context, this.f3616b, false, false, true, (Map<String, Object>) null, (C1238c) null)) == null || listM1913a.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        Iterator<C1234b> it = listM1913a.iterator();
        while (it.hasNext()) {
            C1234b next = it.next();
            BaseAd baseAdM2905e = next != null ? next.m2905e() : null;
            ATBaseAdAdapter aTBaseAdAdapterM2904d = next != null ? next.m2904d() : null;
            if (baseAdM2905e != null) {
                c1171jM2044a = C1171j.m2044a(baseAdM2905e, aTBaseAdAdapterM2904d);
            } else if (aTBaseAdAdapterM2904d != null) {
                c1171jM2044a = C1171j.m2045a(aTBaseAdAdapterM2904d);
            }
            arrayList.add(c1171jM2044a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m2385a(Context context, String str, String str2, C1257v c1257v, InterfaceC1162a interfaceC1162a) {
        if (!C1175n.m2059a().m2175v()) {
            C1175n.m2059a().f3364c = true;
        }
        Map<String, Object> mapM4570b = C1387u.m4556a().m4570b(str2);
        int[] iArr = {0};
        if (mapM4570b.containsKey(AbstractC1228au.f3898N)) {
            try {
                iArr[0] = ((Integer) mapM4570b.get(AbstractC1228au.f3898N)).intValue();
            } catch (Throwable unused) {
            }
        }
        int i = c1257v.f4483d;
        if (i == 0 || i == 3) {
            C1387u.m4556a().m4568a(str2, new Throwable().getStackTrace());
        }
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.f.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1257v f3631a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f3632b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f3633c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ InterfaceC1162a f3634d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Context f3635e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int[] f3636f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Map f3637g;

            /* JADX INFO: renamed from: com.anythink.core.common.f$1$1 */
            public class C46641 implements C1398h.b {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1243h f3639a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Context f3640b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f3641c;

                public C46641(C1243h c1243h, Context context, String str) {
                    c1243h = c1243h;
                    context = context;
                    str = str;
                }

                @Override // com.anythink.core.p072d.C1398h.b
                /* JADX INFO: renamed from: a */
                public final void mo2405a(AdError adError) {
                    String unused = C1201f.this.f3626l;
                    String str = C1169h.n.f3187m;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    String str2 = str;
                    String strM4152d = C1344h.m4152d(str);
                    String strPrintStackTrace = adError.printStackTrace();
                    if (ATSDK.isNetworkLogDebug()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(NativeAdvancedJsUtils.f6629p, C1169h.n.f3173C);
                            jSONObject.put(C1796r.f10844ah, str);
                            jSONObject.put(C2338b.f14610v, str2);
                            jSONObject.put("adtype", strM4152d);
                            jSONObject.put("errorMsg", strPrintStackTrace);
                            C1352p.m4216a("anythink_network", jSONObject.toString(), TextUtils.equals(C1169h.n.f3187m, str));
                        } catch (Throwable unused2) {
                        }
                    }
                    AdError errorCode = ErrorCode.getErrorCode(ErrorCode.placeStrategyError, adError.getPlatformCode(), adError.getPlatformMSG());
                    c1243h.m3025E(5);
                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                    C1201f.this.m2354a(true, c1243h, errorCode, c1257v);
                }

                @Override // com.anythink.core.p072d.C1398h.b
                /* JADX INFO: renamed from: a */
                public final void mo2406a(C1396f c1396f) {
                    synchronized (C1201f.this) {
                        C1358v.m4255a(c1243h, c1396f);
                        if (TextUtils.equals(String.valueOf(c1396f.m5090ah()), str)) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            C1201f.m2348a(C1201f.this, context, str, str, c1396f, c1243h, c1257v);
                            return;
                        }
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.formatError, "", "Format corresponding to API: " + C1344h.m4152d(str) + ", Format corresponding to placement strategy: " + C1344h.m4152d(String.valueOf(c1396f.m5090ah())));
                        AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                        C1201f.this.m2389a(c1257v, errorCode);
                        c1243h.m3064b(false);
                        C1322e.m3881a(c1243h, errorCode);
                        C1201f.this.f3618d = false;
                    }
                }

                @Override // com.anythink.core.p072d.C1398h.b
                /* JADX INFO: renamed from: b */
                public final void mo2407b(C1396f c1396f) {
                    if (c1396f.m4873au()) {
                        return;
                    }
                    C1201f.this.m2397b();
                }
            }

            public AnonymousClass1(C1257v c1257v2, String str22, String str3, InterfaceC1162a interfaceC1162a2, Context context2, int[] iArr2, Map mapM4570b2) {
                c1257v = c1257v2;
                str = str22;
                str = str3;
                interfaceC1162a = interfaceC1162a2;
                context = context2;
                iArr = iArr2;
                map = mapM4570b2;
            }

            /* JADX WARN: Removed duplicated region for block: B:289:0x0365  */
            /* JADX WARN: Removed duplicated region for block: B:302:0x03c3 A[Catch: all -> 0x04a1, TryCatch #0 {, blocks: (B:170:0x0005, B:172:0x000d, B:174:0x0013, B:176:0x0015, B:178:0x001d, B:180:0x0024, B:182:0x0026, B:184:0x002e, B:186:0x0034, B:187:0x004e, B:189:0x0050, B:191:0x0056, B:192:0x005d, B:194:0x007c, B:196:0x0084, B:198:0x00c2, B:200:0x00d1, B:202:0x00de, B:203:0x00e1, B:205:0x00ec, B:207:0x00fa, B:209:0x0108, B:212:0x0112, B:214:0x011a, B:215:0x0149, B:217:0x014b, B:221:0x017a, B:224:0x0185, B:225:0x018c, B:226:0x0192, B:230:0x01bd, B:232:0x01e8, B:235:0x01ef, B:237:0x01f9, B:239:0x01ff, B:241:0x022d, B:242:0x0251, B:244:0x0253, B:259:0x0279, B:261:0x0281, B:264:0x028b, B:266:0x0299, B:268:0x02ba, B:270:0x02db, B:271:0x02e7, B:273:0x02e9, B:275:0x02ed, B:276:0x02f9, B:277:0x0323, B:278:0x0325, B:281:0x032e, B:283:0x0336, B:285:0x0347, B:287:0x034f, B:290:0x0366, B:291:0x037b, B:293:0x037d, B:295:0x038e, B:297:0x039a, B:298:0x03b9, B:300:0x03bb, B:302:0x03c3, B:303:0x03f2, B:305:0x03f4, B:306:0x0407, B:308:0x040d, B:312:0x041c, B:316:0x0428, B:317:0x0444, B:279:0x0329, B:254:0x026b, B:256:0x0270, B:257:0x0277, B:229:0x01b5, B:319:0x0446, B:321:0x0461, B:322:0x049b, B:323:0x049f, B:199:0x00cd, B:195:0x007f, B:251:0x0263), top: B:328:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:305:0x03f4 A[Catch: all -> 0x04a1, TryCatch #0 {, blocks: (B:170:0x0005, B:172:0x000d, B:174:0x0013, B:176:0x0015, B:178:0x001d, B:180:0x0024, B:182:0x0026, B:184:0x002e, B:186:0x0034, B:187:0x004e, B:189:0x0050, B:191:0x0056, B:192:0x005d, B:194:0x007c, B:196:0x0084, B:198:0x00c2, B:200:0x00d1, B:202:0x00de, B:203:0x00e1, B:205:0x00ec, B:207:0x00fa, B:209:0x0108, B:212:0x0112, B:214:0x011a, B:215:0x0149, B:217:0x014b, B:221:0x017a, B:224:0x0185, B:225:0x018c, B:226:0x0192, B:230:0x01bd, B:232:0x01e8, B:235:0x01ef, B:237:0x01f9, B:239:0x01ff, B:241:0x022d, B:242:0x0251, B:244:0x0253, B:259:0x0279, B:261:0x0281, B:264:0x028b, B:266:0x0299, B:268:0x02ba, B:270:0x02db, B:271:0x02e7, B:273:0x02e9, B:275:0x02ed, B:276:0x02f9, B:277:0x0323, B:278:0x0325, B:281:0x032e, B:283:0x0336, B:285:0x0347, B:287:0x034f, B:290:0x0366, B:291:0x037b, B:293:0x037d, B:295:0x038e, B:297:0x039a, B:298:0x03b9, B:300:0x03bb, B:302:0x03c3, B:303:0x03f2, B:305:0x03f4, B:306:0x0407, B:308:0x040d, B:312:0x041c, B:316:0x0428, B:317:0x0444, B:279:0x0329, B:254:0x026b, B:256:0x0270, B:257:0x0277, B:229:0x01b5, B:319:0x0446, B:321:0x0461, B:322:0x049b, B:323:0x049f, B:199:0x00cd, B:195:0x007f, B:251:0x0263), top: B:328:0x0005, inners: #1, #2 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 1188
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.C1201f.AnonymousClass1.run():void");
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m2386a(AdError adError) {
        InterfaceC1298d interfaceC1298d = this.f3625k;
        if (interfaceC1298d != null) {
            interfaceC1298d.mo3728a(adError, this.f3620f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2387a(C1231ax c1231ax, C1396f c1396f) {
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.f3616b);
        if (c1396fM5139a != null) {
            boolean z = true;
            if (c1396f != null && (TextUtils.equals(c1396fM5139a.m5087ae(), c1396f.m5087ae()) || c1396fM5139a.m4873au())) {
                z = false;
            }
            if (z) {
                return;
            }
        }
        synchronized (this.f3622h) {
            this.f3622h.add(c1231ax);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2388a(C1234b c1234b) {
        List<C1231ax> list;
        if (c1234b == null || (list = this.f3622h) == null) {
            return;
        }
        synchronized (list) {
            if (this.f3622h.size() > 0) {
                this.f3622h.remove(0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2389a(C1257v c1257v, AdError adError) {
        C1317n c1317n = this.f3621g;
        if (c1317n != null) {
            c1317n.m3815a(1, c1257v, (C1235ba) null, adError);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2390a(InterfaceC1297c interfaceC1297c) {
        this.f3623i = interfaceC1297c;
    }

    /* JADX INFO: renamed from: a */
    public final void m2391a(InterfaceC1299e interfaceC1299e) {
        this.f3624j = interfaceC1299e;
    }

    /* JADX INFO: renamed from: a */
    public final void m2392a(String str) {
        this.f3617c.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m2393a(String str, double d, C1229av c1229av) {
        C1262g c1262g = this.f3617c.get(str);
        if (c1262g != null) {
            c1262g.m3588a(d, c1229av);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2394a(ATAdStatusInfo aTAdStatusInfo) {
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(this.f3616b);
        if ((c1396fM5139a == null || m2399c() < c1396fM5139a.m5115i() || aTAdStatusInfo == null || !aTAdStatusInfo.isReady()) && !ATAdxSetting.getInstance().isAdxNetworkMode(this.f3616b)) {
            return m2377k() || (c1396fM5139a != null && c1396fM5139a.m5088af() == 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final C1262g m2395b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f3617c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final List<ATAdInfo> m2396b(Context context) {
        C1234b c1234bM2382a;
        if (C1389w.m4583a().m4627b()) {
            C1396f c1396fM5139a = C1398h.m5135a(context).m5139a(this.f3616b);
            ATAdInfo aTAdInfoM2914n = null;
            if (c1396fM5139a != null && C1389w.m4583a().m4628c(this.f3616b)) {
                Log.w("anythink", "Forbidden placement");
                return null;
            }
            if (C1389w.m4583a().m4625a(c1396fM5139a)) {
                String strM5118l = c1396fM5139a.m5118l();
                C1389w.m4583a();
                C1201f c1201fM4582a = C1389w.m4582a(strM5118l, String.valueOf(c1396fM5139a.m5090ah()));
                if (c1201fM4582a != null && (c1234bM2382a = c1201fM4582a.m2382a(context, false, false, (Map<String, Object>) null, (C1238c) null)) != null) {
                    aTAdInfoM2914n = c1234bM2382a.m2914n();
                }
                List<ATAdInfo> listM2384a = m2384a(context);
                if (aTAdInfoM2914n == null) {
                    return listM2384a;
                }
                if (listM2384a == null || listM2384a.size() == 0) {
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(aTAdInfoM2914n);
                    return arrayList;
                }
                ATAdInfo aTAdInfo = listM2384a.get(0);
                if (aTAdInfo == null || aTAdInfoM2914n.getEcpm() <= aTAdInfo.getEcpm()) {
                    return listM2384a;
                }
                StringBuilder sb = new StringBuilder("sharedCheckValidAdCaches, shared top price > real top price, shared price: ");
                sb.append(aTAdInfoM2914n.getEcpm());
                sb.append(", real price: ");
                sb.append(aTAdInfo.getEcpm());
                listM2384a.add(0, aTAdInfoM2914n);
                return listM2384a;
            }
        }
        return m2384a(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2397b() {
        synchronized (this.f3622h) {
            this.f3622h.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2398b(Context context, String str, String str2, C1257v c1257v, InterfaceC1162a interfaceC1162a) {
        C1201f c1201f;
        Context context2;
        String str3;
        String str4;
        C1257v c1257v2;
        InterfaceC1162a anonymousClass5;
        if (C1389w.m4583a().m4627b()) {
            C1396f c1396fM5139a = C1398h.m5135a(context).m5139a(this.f3616b);
            if (c1396fM5139a != null && C1389w.m4583a().m4628c(this.f3616b)) {
                Log.w("anythink", "Forbidden placement");
                if (interfaceC1162a != null) {
                    interfaceC1162a.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.sharedPlacementIdError, "", ""));
                    return;
                }
                return;
            }
            if (C1389w.m4583a().m4625a(c1396fM5139a)) {
                String strM5118l = c1396fM5139a.m5118l();
                C1238c c1238c = new C1238c();
                m2347a(c1238c, str2, c1396fM5139a);
                c1257v.f4488i = c1238c;
                InterfaceC1162a[] interfaceC1162aArr = {interfaceC1162a};
                if (c1396fM5139a.m5121o() == 1) {
                    C1234b c1234bM2361b = m2361b(context, strM5118l, str, c1257v);
                    if (c1234bM2361b != null) {
                        String strM4133a = C1344h.m4133a(context);
                        c1257v.f4480a = strM4133a;
                        C1352p.m4211a("Shared", "placementId:" + str2 + ";result_callback:success;");
                        C1243h c1243hM2908h = c1234bM2361b.m2908h();
                        C1322e.m3918a(str2, strM5118l, str, strM4133a, c1396fM5139a, true, "1", "2", c1243hM2908h != null ? c1243hM2908h.m2678ai() : "");
                        if (interfaceC1162aArr[0] != null) {
                            interfaceC1162aArr[0].onAdLoaded();
                        }
                        interfaceC1162aArr[0] = null;
                    } else {
                        C1389w.m4583a().m4626b(strM5118l);
                    }
                    str4 = str2;
                    c1201f = this;
                    context2 = context;
                    str3 = str;
                    c1257v2 = c1257v;
                    anonymousClass5 = new AnonymousClass4(interfaceC1162aArr, str4, strM5118l, str, c1257v, c1396fM5139a);
                } else {
                    c1201f = this;
                    context2 = context;
                    str3 = str;
                    str4 = str2;
                    c1257v2 = c1257v;
                    anonymousClass5 = new AnonymousClass5(str2, strM5118l, str, c1257v, c1396fM5139a, interfaceC1162aArr, context);
                }
                c1201f.m2385a(context2, str3, str4, c1257v2, anonymousClass5);
                return;
            }
        }
        m2385a(context, str, str2, c1257v, interfaceC1162a);
    }

    /* JADX INFO: renamed from: c */
    public final int m2399c() {
        List<C1231ax> list = this.f3622h;
        int i = 0;
        if (list != null) {
            synchronized (list) {
                Iterator<C1231ax> it = this.f3622h.iterator();
                while (it.hasNext()) {
                    C1231ax next = it.next();
                    if (next == null || !next.m2862a()) {
                        it.remove();
                    } else {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final void m2400c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.f.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f3658a;

            public AnonymousClass3(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1262g c1262g = C1201f.this.f3617c.get(str);
                if (c1262g != null) {
                    c1262g.m3602g();
                }
            }
        }, 2, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m2401d() {
        this.f3628n = false;
        this.f3629o = 0L;
        this.f3630p = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m2402e() {
        C1396f c1396fM5146b = C1398h.m5135a(this.f3615a).m5146b(this.f3616b);
        if (this.f3628n || c1396fM5146b == null) {
            return;
        }
        this.f3628n = true;
        this.f3629o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2403f() {
        C1262g c1262g;
        if (this.f3618d) {
            return true;
        }
        return (TextUtils.isEmpty(this.f3619e) || (c1262g = this.f3617c.get(this.f3619e)) == null || c1262g.m3598c()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final String m2404g() {
        return this.f3619e;
    }
}
