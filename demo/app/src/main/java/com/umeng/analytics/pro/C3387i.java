package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3375b;
import com.umeng.analytics.C3376c;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p285z2.C3688ae;

/* JADX INFO: renamed from: com.umeng.analytics.pro.i */
/* JADX INFO: loaded from: classes2.dex */
public class C3387i {

    /* JADX INFO: renamed from: A */
    private static boolean f18505A = false;

    /* JADX INFO: renamed from: B */
    private static final String f18506B = "n_sess_dp";

    /* JADX INFO: renamed from: C */
    private static final String f18507C = "n_sess_dp_type";

    /* JADX INFO: renamed from: a */
    private static Context f18508a = null;

    /* JADX INFO: renamed from: q */
    private static final String f18509q = "first_activate_time";

    /* JADX INFO: renamed from: r */
    private static final String f18510r = "ana_is_f";

    /* JADX INFO: renamed from: s */
    private static final String f18511s = "thtstart";

    /* JADX INFO: renamed from: t */
    private static final String f18512t = "dstk_last_time";

    /* JADX INFO: renamed from: u */
    private static final String f18513u = "dstk_cnt";

    /* JADX INFO: renamed from: v */
    private static final String f18514v = "gkvc";

    /* JADX INFO: renamed from: w */
    private static final String f18515w = "ekvc";

    /* JADX INFO: renamed from: y */
    private static final String f18516y = "-1";

    /* JADX INFO: renamed from: z */
    private static boolean f18517z;

    /* JADX INFO: renamed from: b */
    private ABTest f18518b;

    /* JADX INFO: renamed from: c */
    private ImLatent f18519c;

    /* JADX INFO: renamed from: d */
    private c f18520d;

    /* JADX INFO: renamed from: e */
    private SharedPreferences f18521e;

    /* JADX INFO: renamed from: f */
    private String f18522f;

    /* JADX INFO: renamed from: g */
    private String f18523g;

    /* JADX INFO: renamed from: h */
    private String f18524h;

    /* JADX INFO: renamed from: i */
    private String f18525i;

    /* JADX INFO: renamed from: j */
    private long f18526j;

    /* JADX INFO: renamed from: k */
    private int f18527k;

    /* JADX INFO: renamed from: l */
    private JSONArray f18528l;

    /* JADX INFO: renamed from: m */
    private final int f18529m;

    /* JADX INFO: renamed from: n */
    private int f18530n;

    /* JADX INFO: renamed from: o */
    private int f18531o;

    /* JADX INFO: renamed from: p */
    private long f18532p;

    /* JADX INFO: renamed from: x */
    private final long f18533x;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final int f18534a = 4097;

        /* JADX INFO: renamed from: b */
        public static final int f18535b = 4098;

        /* JADX INFO: renamed from: c */
        public static final int f18536c = 4099;

        /* JADX INFO: renamed from: d */
        public static final int f18537d = 4100;

        /* JADX INFO: renamed from: e */
        public static final int f18538e = 4101;

        /* JADX INFO: renamed from: f */
        public static final int f18539f = 4102;

        /* JADX INFO: renamed from: g */
        public static final int f18540g = 4103;

        /* JADX INFO: renamed from: h */
        public static final int f18541h = 4104;

        /* JADX INFO: renamed from: i */
        public static final int f18542i = 4105;

        /* JADX INFO: renamed from: j */
        public static final int f18543j = 4106;

        /* JADX INFO: renamed from: k */
        public static final int f18544k = 8193;

        /* JADX INFO: renamed from: l */
        public static final int f18545l = 8194;

        /* JADX INFO: renamed from: m */
        public static final int f18546m = 8195;

        /* JADX INFO: renamed from: n */
        public static final int f18547n = 8196;

        /* JADX INFO: renamed from: o */
        public static final int f18548o = 8197;
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.i$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private static final C3387i f18549a = new C3387i();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.i$c */
    public class c {

        /* JADX INFO: renamed from: b */
        private ReportPolicy.ReportStrategy f18551b = null;

        /* JADX INFO: renamed from: c */
        private int f18552c = -1;

        /* JADX INFO: renamed from: d */
        private int f18553d = -1;

        /* JADX INFO: renamed from: e */
        private int f18554e = -1;

        /* JADX INFO: renamed from: f */
        private int f18555f = -1;

        public c() {
        }

        /* JADX INFO: renamed from: b */
        private ReportPolicy.ReportStrategy m15559b(int i, int i2) {
            if (i == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f18551b;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f18551b;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f18551b;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(C3387i.f18508a));
            }
            if (i == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f18551b;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(C3387i.f18508a);
            }
            if (i != 6) {
                if (i != 8) {
                    ReportPolicy.ReportStrategy reportStrategy5 = this.f18551b;
                    return reportStrategy5 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy5 : new ReportPolicy.ReportAtLaunch();
                }
                ReportPolicy.ReportStrategy reportStrategy6 = this.f18551b;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(C3387i.f18508a));
            }
            ReportPolicy.ReportStrategy reportStrategy7 = this.f18551b;
            if (!(reportStrategy7 instanceof ReportPolicy.ReportByInterval)) {
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(C3387i.f18508a), i2);
            }
            ((ReportPolicy.ReportByInterval) reportStrategy7).setReportInterval(i2);
            return reportStrategy7;
        }

        /* JADX INFO: renamed from: a */
        public int m15560a(int i) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3387i.f18508a, "test_report_interval", "-1")).intValue();
            return (iIntValue == -1 || iIntValue < 90 || iIntValue > 86400) ? i : iIntValue * 1000;
        }

        /* JADX INFO: renamed from: a */
        public void m15561a() {
            try {
                int[] iArrM15562a = m15562a(-1, -1);
                this.f18552c = iArrM15562a[0];
                this.f18553d = iArrM15562a[1];
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public int[] m15562a(int i, int i2) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3387i.f18508a, "report_policy", "-1")).intValue();
            int iIntValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3387i.f18508a, "report_interval", "-1")).intValue();
            if (iIntValue == -1 || !ReportPolicy.isValid(iIntValue)) {
                return new int[]{i, i2};
            }
            if (iIntValue2 == -1 || iIntValue2 < 90 || iIntValue2 > 86400) {
                iIntValue2 = 90;
            }
            return new int[]{iIntValue, iIntValue2 * 1000};
        }

        /* JADX INFO: renamed from: b */
        public void m15563b() {
            int testPolicy;
            ReportPolicy.ReportStrategy reportStrategyM15559b;
            Defcon service = Defcon.getService(C3387i.f18508a);
            if (service.isOpen()) {
                ReportPolicy.ReportStrategy reportStrategy = this.f18551b;
                if ((reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid()) {
                    iM15560a = 1;
                }
                reportStrategyM15559b = iM15560a != 0 ? this.f18551b : new ReportPolicy.DefconPolicy(StatTracer.getInstance(C3387i.f18508a), service);
            } else {
                boolean z = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3387i.f18508a, "integrated_test", "-1")).intValue() == 1;
                if (MLog.DEBUG && z) {
                    reportStrategyM15559b = new ReportPolicy.DebugPolicy(StatTracer.getInstance(C3387i.f18508a));
                } else {
                    if (C3387i.this.f18518b.isInTest() && "RPT".equals(C3387i.this.f18518b.getTestName())) {
                        if (C3387i.this.f18518b.getTestPolicy() == 6) {
                            if ((Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3387i.f18508a, "test_report_interval", "-1")).intValue() != -1 ? 1 : 0) != 0) {
                                iM15560a = m15560a(C1801a.f11055bM);
                            } else {
                                iM15560a = this.f18553d;
                                if (iM15560a <= 0) {
                                    iM15560a = this.f18555f;
                                }
                            }
                        }
                        testPolicy = C3387i.this.f18518b.getTestPolicy();
                    } else {
                        testPolicy = this.f18554e;
                        iM15560a = this.f18555f;
                        int i = this.f18552c;
                        if (i != -1) {
                            iM15560a = this.f18553d;
                            testPolicy = i;
                        }
                    }
                    reportStrategyM15559b = m15559b(testPolicy, iM15560a);
                }
            }
            this.f18551b = reportStrategyM15559b;
            MLog.m16263d("Report policy : " + this.f18551b.getClass().getSimpleName());
        }

        /* JADX INFO: renamed from: c */
        public ReportPolicy.ReportStrategy m15564c() {
            m15563b();
            return this.f18551b;
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.i$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private Map<String, Object> f18556a;

        /* JADX INFO: renamed from: b */
        private String f18557b;

        /* JADX INFO: renamed from: c */
        private String f18558c;

        /* JADX INFO: renamed from: d */
        private long f18559d;

        private d() {
            this.f18556a = null;
            this.f18557b = null;
            this.f18558c = null;
            this.f18559d = 0L;
        }

        public d(String str, Map<String, Object> map, String str2, long j) {
            this.f18556a = null;
            this.f18557b = null;
            this.f18558c = null;
            this.f18559d = 0L;
            this.f18556a = map;
            this.f18557b = str;
            this.f18559d = j;
            this.f18558c = str2;
        }

        /* JADX INFO: renamed from: a */
        public Map<String, Object> m15565a() {
            return this.f18556a;
        }

        /* JADX INFO: renamed from: b */
        public String m15566b() {
            return this.f18558c;
        }

        /* JADX INFO: renamed from: c */
        public String m15567c() {
            return this.f18557b;
        }

        /* JADX INFO: renamed from: d */
        public long m15568d() {
            return this.f18559d;
        }
    }

    private C3387i() {
        this.f18518b = null;
        this.f18519c = null;
        this.f18520d = null;
        this.f18521e = null;
        this.f18522f = null;
        this.f18523g = null;
        this.f18524h = null;
        this.f18525i = null;
        this.f18526j = 0L;
        this.f18527k = 10;
        this.f18528l = new JSONArray();
        this.f18529m = 5000;
        this.f18530n = 0;
        this.f18531o = 0;
        this.f18532p = 0L;
        this.f18533x = 28800000L;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18508a);
            this.f18532p = sharedPreferences.getLong(f18511s, 0L);
            this.f18530n = sharedPreferences.getInt(f18514v, 0);
            this.f18531o = sharedPreferences.getInt(f18515w, 0);
            this.f18520d = new c();
            this.f18518b = ABTest.getService(f18508a);
            Context context = f18508a;
            this.f18519c = ImLatent.getService(context, StatTracer.getInstance(context));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3387i m15520a(Context context) {
        if (f18508a == null && context != null) {
            f18508a = context.getApplicationContext();
        }
        return b.f18549a;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m15522a(JSONObject jSONObject, long j) {
        try {
            if (C3389k.m15572a(jSONObject) <= j) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(C3380b.f18387an, C3389k.m15572a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return C3389k.m15574a(f18508a, j, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m15523a(long j, int i) {
        if (j == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j <= 28800000) {
            return i < 5000;
        }
        m15537j();
        return true;
    }

    /* JADX INFO: renamed from: b */
    private void m15524b(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("analytics");
                if (jSONObject3.has(C3380b.f18360N)) {
                    str = "appkey";
                    jSONObject2.put(C3380b.f18360N, jSONObject3.getJSONArray(C3380b.f18360N));
                } else {
                    str = "appkey";
                }
                if (jSONObject3.has(C3380b.f18361O)) {
                    jSONObject2.put(C3380b.f18361O, jSONObject3.getJSONArray(C3380b.f18361O));
                }
                if (jSONObject3.has("error")) {
                    jSONObject2.put("error", jSONObject3.getJSONArray("error"));
                }
                if (jSONObject3.has(C3380b.f18403n)) {
                    JSONArray jSONArray = jSONObject3.getJSONArray(C3380b.f18403n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                        if (jSONObject4 != null && jSONObject4.length() > 0) {
                            if (jSONObject4.has(C3380b.f18409t)) {
                                jSONObject4.remove(C3380b.f18409t);
                            }
                            jSONArray2.put(jSONObject4);
                        }
                    }
                    jSONObject2.put(C3380b.f18403n, jSONArray2);
                }
                if (jSONObject3.has(C3380b.f18350D)) {
                    jSONObject2.put(C3380b.f18350D, jSONObject3.getJSONObject(C3380b.f18350D));
                }
                if (jSONObject3.has(C3380b.f18353G)) {
                    jSONObject2.put(C3380b.f18353G, jSONObject3.getJSONObject(C3380b.f18353G));
                }
            } else {
                str = "appkey";
            }
            if (jSONObject.has("dplus")) {
                jSONObject2.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has("header")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("header");
                jSONObject2.put("sdk_version", jSONObject5.getString("sdk_version"));
                jSONObject2.put("device_id", jSONObject5.getString("device_id"));
                jSONObject2.put("device_model", jSONObject5.getString("device_model"));
                jSONObject2.put("version", jSONObject5.getString("version_code"));
                String str2 = str;
                jSONObject2.put(str2, jSONObject5.getString(str2));
                jSONObject2.put("channel", jSONObject5.getString("channel"));
            }
            if (jSONObject2.length() > 0) {
                MLog.m16263d("constructMessage:" + jSONObject2.toString());
            }
        } catch (Throwable th) {
            MLog.m16273e(th);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m15525c(JSONObject jSONObject) {
        Context context;
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has(C3380b.f18387an)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                    if (jSONObject2.has(C3380b.f18403n)) {
                        JSONObject jSONObject3 = jSONObject2.getJSONArray(C3380b.f18403n).getJSONObject(0);
                        if (jSONObject3 != null) {
                            C3385g.m15485a(f18508a).m15499a(true, jSONObject3.getString("id"));
                        }
                    } else {
                        C3385g.m15485a(f18508a).m15510g();
                    }
                } else if (jSONObject.has("dplus")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("dplus");
                    if (jSONObject4.has(C3380b.f18371Y)) {
                        C3385g.m15485a(f18508a).m15505b(0);
                    }
                    if (jSONObject4.has(C3380b.f18376ac)) {
                        C3385g.m15485a(f18508a).m15505b(4);
                    }
                    if (jSONObject4.has(C3380b.f18381ah)) {
                        C3385g.m15485a(f18508a).m15505b(1);
                    }
                }
                context = f18508a;
            } else {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0) {
                    if (jSONObjectOptJSONObject.has(C3380b.f18403n)) {
                        C3385g.m15485a(f18508a).m15500a(true, false);
                    }
                    if (jSONObjectOptJSONObject.has(C3380b.f18360N) || jSONObjectOptJSONObject.has(C3380b.f18361O)) {
                        C3385g.m15485a(f18508a).m15507d();
                    }
                    if (jSONObjectOptJSONObject.has("error")) {
                        C3385g.m15485a(f18508a).m15508e();
                    }
                }
                if (jSONObject.has("dplus")) {
                    C3385g.m15485a(f18508a).m15509f();
                }
                context = f18508a;
            }
            C3385g.m15485a(context).m15495a();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m15526c(boolean z) {
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            jSONObject = m15543a(UMEnvelopeBuild.maxDataSpace(f18508a));
        } else if (AnalyticsConfig.FLAG_DPLUS) {
            jSONObject = m15550b(UMEnvelopeBuild.maxDataSpace(f18508a));
        }
        if (jSONObject == null || jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
        JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
        Context context = f18508a;
        if (context == null || jSONObject2 == null || jSONObject3 == null || (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject2, jSONObject3)) == null) {
            return;
        }
        m15524b(jSONObjectBuildEnvelopeWithExtHeader);
        m15545a((Object) jSONObjectBuildEnvelopeWithExtHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:3:0x000d, B:5:0x0011, B:7:0x0015, B:8:0x0021, B:10:0x0031, B:11:0x0035, B:16:0x0049, B:18:0x0065, B:19:0x006a, B:22:0x0089, B:24:0x0099, B:26:0x00a3, B:29:0x00cd, B:30:0x00db, B:31:0x0107, B:32:0x010c, B:34:0x011c, B:36:0x0126, B:39:0x0150, B:40:0x015e, B:12:0x003a, B:14:0x0042, B:15:0x0047), top: B:45:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: all -> 0x018c, TRY_ENTER, TryCatch #0 {all -> 0x018c, blocks: (B:3:0x000d, B:5:0x0011, B:7:0x0015, B:8:0x0021, B:10:0x0031, B:11:0x0035, B:16:0x0049, B:18:0x0065, B:19:0x006a, B:22:0x0089, B:24:0x0099, B:26:0x00a3, B:29:0x00cd, B:30:0x00db, B:31:0x0107, B:32:0x010c, B:34:0x011c, B:36:0x0126, B:39:0x0150, B:40:0x015e, B:12:0x003a, B:14:0x0042, B:15:0x0047), top: B:45:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c A[Catch: all -> 0x018c, TryCatch #0 {all -> 0x018c, blocks: (B:3:0x000d, B:5:0x0011, B:7:0x0015, B:8:0x0021, B:10:0x0031, B:11:0x0035, B:16:0x0049, B:18:0x0065, B:19:0x006a, B:22:0x0089, B:24:0x0099, B:26:0x00a3, B:29:0x00cd, B:30:0x00db, B:31:0x0107, B:32:0x010c, B:34:0x011c, B:36:0x0126, B:39:0x0150, B:40:0x015e, B:12:0x003a, B:14:0x0042, B:15:0x0047), top: B:45:0x000d }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject m15527d(boolean r16) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3387i.m15527d(boolean):org.json.JSONObject");
    }

    /* JADX INFO: renamed from: d */
    private void m15528d(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!m15523a(this.f18532p, this.f18530n)) {
                    return;
                } else {
                    this.f18530n++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!m15523a(this.f18532p, this.f18531o)) {
                    return;
                } else {
                    this.f18531o++;
                }
            }
            if (this.f18528l.length() >= this.f18527k) {
                C3385g.m15485a(f18508a).m15497a(this.f18528l);
                this.f18528l = new JSONArray();
            }
            if (this.f18532p == 0) {
                this.f18532p = System.currentTimeMillis();
            }
            this.f18528l.put(jSONObject);
        } catch (Throwable th) {
            MLog.m16273e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m15530e(Object obj) {
        try {
            m15553b(f18508a);
            m15544a();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(C3380b.f18354H);
                String string2 = jSONObject.getString("uid");
                String[] strArrM15437a = C3376c.m15437a(f18508a);
                if (strArrM15437a != null && string.equals(strArrM15437a[0]) && string2.equals(strArrM15437a[1])) {
                    return;
                }
                boolean zM15607a = C3393o.m15600a().m15607a(f18508a, System.currentTimeMillis());
                C3376c.m15436a(f18508a, string, string2);
                if (zM15607a) {
                    C3393o.m15600a().m15609b(f18508a, System.currentTimeMillis());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m15531e(boolean z) {
        if (m15541n()) {
            return true;
        }
        if (this.f18520d == null) {
            this.f18520d = new c();
        }
        this.f18520d.m15561a();
        ReportPolicy.ReportStrategy reportStrategyM15564c = this.f18520d.m15564c();
        boolean zShouldSendMessage = reportStrategyM15564c.shouldSendMessage(z);
        if (zShouldSendMessage && (((reportStrategyM15564c instanceof ReportPolicy.ReportByInterval) || (reportStrategyM15564c instanceof ReportPolicy.DebugPolicy)) && m15538k())) {
            m15544a();
        }
        return zShouldSendMessage;
    }

    /* JADX INFO: renamed from: f */
    private String m15532f() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f18508a, "pr_ve", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f18522f)) {
                    return this.f18522f;
                }
                if (this.f18521e == null) {
                    this.f18521e = PreferenceWrapper.getDefault(f18508a);
                }
                String string = this.f18521e.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f18508a);
                if (TextUtils.isEmpty(string)) {
                    this.f18521e.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
                    strImprintProperty = "0";
                } else {
                    String string2 = this.f18521e.getString("cur_version", "");
                    if (appVersionName.equals(string2)) {
                        strImprintProperty = string;
                    } else {
                        this.f18521e.edit().putString("pre_version", string2).putString("cur_version", appVersionName).commit();
                        strImprintProperty = string2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f18522f = strImprintProperty;
        return strImprintProperty;
    }

    /* JADX INFO: renamed from: f */
    private void m15533f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String strOptString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            C3385g.m15485a(f18508a).m15501a(strOptString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private String m15534g() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f18508a, "ud_da", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f18523g)) {
                    return this.f18523g;
                }
                if (this.f18521e == null) {
                    this.f18521e = PreferenceWrapper.getDefault(f18508a);
                }
                String string = this.f18521e.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat(C3688ae.OooO0O0, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f18521e.edit().putString("pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat(C3688ae.OooO0O0, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f18521e.edit().putString("pre_date", str).commit();
                        strImprintProperty = str;
                    }
                }
                strImprintProperty = string;
            }
        } catch (Throwable unused) {
        }
        this.f18523g = strImprintProperty;
        return strImprintProperty;
    }

    /* JADX INFO: renamed from: h */
    private String m15535h() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f18508a, "pr_ve", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f18524h)) {
                    return this.f18524h;
                }
                if (this.f18521e == null) {
                    this.f18521e = PreferenceWrapper.getDefault(f18508a);
                }
                String string = this.f18521e.getString("dp_pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f18508a);
                if (TextUtils.isEmpty(string)) {
                    this.f18521e.edit().putString("dp_pre_version", "0").putString("dp_cur_version", appVersionName).commit();
                    strImprintProperty = "0";
                } else {
                    String string2 = this.f18521e.getString("dp_cur_version", "");
                    if (appVersionName.equals(string2)) {
                        strImprintProperty = string;
                    } else {
                        this.f18521e.edit().putString("dp_pre_version", string2).putString("dp_cur_version", appVersionName).commit();
                        strImprintProperty = string2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f18524h = strImprintProperty;
        return strImprintProperty;
    }

    /* JADX INFO: renamed from: i */
    private String m15536i() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f18508a, "ud_da", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f18525i)) {
                    return this.f18525i;
                }
                if (this.f18521e == null) {
                    this.f18521e = PreferenceWrapper.getDefault(f18508a);
                }
                String string = this.f18521e.getString("dp_pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat(C3688ae.OooO0O0, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f18521e.edit().putString("dp_pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat(C3688ae.OooO0O0, Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f18521e.edit().putString("dp_pre_date", str).commit();
                        strImprintProperty = str;
                    }
                }
                strImprintProperty = string;
            }
        } catch (Throwable unused) {
        }
        this.f18525i = strImprintProperty;
        return strImprintProperty;
    }

    /* JADX INFO: renamed from: j */
    private void m15537j() {
        try {
            this.f18530n = 0;
            this.f18531o = 0;
            this.f18532p = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f18508a).edit().putLong(f18512t, System.currentTimeMillis()).putInt(f18513u, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m15538k() {
        try {
            if (!TextUtils.isEmpty(C3393o.m15600a().m15612c())) {
                m15553b(f18508a);
            }
            if (this.f18528l.length() <= 0) {
                return false;
            }
            for (int i = 0; i < this.f18528l.length(); i++) {
                JSONObject jSONObjectOptJSONObject = this.f18528l.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    String strOptString = jSONObjectOptJSONObject.optString("__i");
                    if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    private void m15539l() {
        if (this.f18528l.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f18528l.length(); i++) {
                try {
                    JSONObject jSONObject = this.f18528l.getJSONObject(i);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String strOptString = jSONObject.optString("__i");
                        String str = "-1";
                        if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                            String strM15612c = C3393o.m15600a().m15612c();
                            if (!TextUtils.isEmpty(strM15612c)) {
                                str = strM15612c;
                            }
                            jSONObject.put("__i", str);
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
            this.f18528l = jSONArray;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m15540m() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (!m15541n() || (context = f18508a) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f18509q, 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong(f18509q, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m15541n() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f18508a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return false;
            }
            return sharedPreferences.getLong(f18510r, -1L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m15542o() {
        try {
            m15553b(f18508a);
            m15544a();
            String[] strArrM15437a = C3376c.m15437a(f18508a);
            if (strArrM15437a == null || TextUtils.isEmpty(strArrM15437a[0]) || TextUtils.isEmpty(strArrM15437a[1])) {
                return;
            }
            boolean zM15607a = C3393o.m15600a().m15607a(f18508a, System.currentTimeMillis());
            C3376c.m15438b(f18508a);
            if (zM15607a) {
                C3393o.m15600a().m15609b(f18508a, System.currentTimeMillis());
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m16271e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:27:0x006d, B:30:0x0076, B:31:0x007b, B:37:0x008a, B:39:0x0090, B:40:0x0095, B:42:0x009b, B:43:0x00a0, B:33:0x0081), top: B:46:0x006d }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject m15543a(long r10) {
        /*
            r9 = this;
            com.umeng.analytics.pro.o r0 = com.umeng.analytics.pro.C3393o.m15600a()
            android.content.Context r1 = com.umeng.analytics.pro.C3387i.f18508a
            java.lang.String r0 = r0.m15613c(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            r0 = 0
            org.json.JSONObject r2 = r9.m15551b(r0)
            com.umeng.analytics.pro.l r3 = com.umeng.analytics.pro.C3390l.m15578a()
            android.content.Context r4 = com.umeng.analytics.pro.C3387i.f18508a
            int r3 = r3.m15580a(r4)
            int r4 = r2.length()
            if (r4 > 0) goto L28
            return r1
        L28:
            int r4 = r2.length()
            r5 = 1
            java.lang.String r6 = "userlevel"
            java.lang.String r7 = "active_user"
            r8 = 3
            if (r4 != r5) goto L4a
            org.json.JSONObject r4 = r2.optJSONObject(r7)
            if (r4 == 0) goto L3d
            if (r3 == r8) goto L3d
            return r1
        L3d:
            java.lang.String r4 = r2.optString(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L64
            if (r3 == r8) goto L64
            return r1
        L4a:
            int r4 = r2.length()
            r5 = 2
            if (r4 != r5) goto L64
            org.json.JSONObject r4 = r2.optJSONObject(r7)
            if (r4 == 0) goto L64
            java.lang.String r4 = r2.optString(r6)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L64
            if (r3 == r8) goto L64
            return r1
        L64:
            org.json.JSONObject r0 = r9.m15527d(r0)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La4
            r4.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = "analytics"
            if (r3 != r8) goto L7f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La4
            r2.<init>()     // Catch: java.lang.Throwable -> La4
        L7b:
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> La4
            goto L88
        L7f:
            if (r2 == 0) goto L88
            int r3 = r2.length()     // Catch: java.lang.Throwable -> La4
            if (r3 <= 0) goto L88
            goto L7b
        L88:
            if (r0 == 0) goto L95
            int r2 = r0.length()     // Catch: java.lang.Throwable -> La4
            if (r2 <= 0) goto L95
            java.lang.String r2 = "header"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> La4
        L95:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> La4
            if (r0 <= 0) goto La0
            java.lang.String r0 = "content"
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> La4
        La0:
            org.json.JSONObject r1 = r9.m15522a(r1, r10)     // Catch: java.lang.Throwable -> La4
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3387i.m15543a(long):org.json.JSONObject");
    }

    /* JADX INFO: renamed from: a */
    public void m15544a() {
        try {
            if (this.f18528l.length() > 0) {
                C3385g.m15485a(f18508a).m15497a(this.f18528l);
                this.f18528l = new JSONArray();
            }
            PreferenceWrapper.getDefault(f18508a).edit().putLong(f18511s, this.f18532p).putInt(f18514v, this.f18530n).putInt(f18515w, this.f18531o).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15545a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception") && 101 == jSONObject.getInt("exception")) {
                        return;
                    }
                    m15525c(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15546a(Object obj, int i) {
        try {
            switch (i) {
                case 4097:
                    if (obj != null) {
                        m15528d(obj);
                    }
                    if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                        return;
                    }
                    break;
                case 4098:
                    if (obj != null) {
                        m15528d(obj);
                    }
                    if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                        return;
                    }
                    break;
                case 4099:
                    C3394p.m15616a(f18508a);
                    return;
                case a.f18537d /* 4100 */:
                    C3386h.m15515b(f18508a);
                    return;
                case a.f18538e /* 4101 */:
                    m15530e(obj);
                    return;
                case a.f18539f /* 4102 */:
                    m15542o();
                    return;
                case a.f18540g /* 4103 */:
                    C3393o.m15600a().m15605a(f18508a, obj);
                    return;
                case a.f18541h /* 4104 */:
                    C3393o.m15600a().m15610b(f18508a, obj);
                    return;
                case a.f18542i /* 4105 */:
                    m15544a();
                    return;
                case a.f18543j /* 4106 */:
                    m15533f(obj);
                    return;
                default:
                    switch (i) {
                        case a.f18544k /* 8193 */:
                            m15547a(obj, 1, false);
                            break;
                        case 8194:
                            C3391m.m15584a(f18508a).m15594a(obj);
                            break;
                        case a.f18546m /* 8195 */:
                            C3375b.m15394a().m15411a(obj);
                            break;
                        case a.f18547n /* 8196 */:
                            C3375b.m15394a().m15434j();
                            break;
                        case a.f18548o /* 8197 */:
                            C3375b.m15394a().m15432h();
                            break;
                    }
                    return;
            }
            m15549a(false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15547a(Object obj, int i, boolean z) {
        int i2;
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0) {
                return;
            }
            String strOptString = jSONObject.optString("__ii");
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18508a);
            int i3 = 1;
            if (i == 0) {
                long j = sharedPreferences.getLong(f18512t, 0L);
                int i4 = sharedPreferences.getInt(f18513u, 0);
                if (!m15523a(j, i4)) {
                    return;
                } else {
                    sharedPreferences.edit().putLong(f18512t, System.currentTimeMillis()).putInt(f18513u, i4 == 5000 ? 0 : i4 + 1).commit();
                }
            }
            String string = sharedPreferences.getString(f18506B, "");
            JSONArray jSONArray = TextUtils.isEmpty(string) ? new JSONArray() : new JSONArray(string);
            JSONObject jSONObjectM15433i = C3375b.m15394a().m15433i();
            if ("-1".equals(strOptString)) {
                jSONObject.put(f18507C, i);
                if (!jSONObject.has(C3380b.f18375ab) && jSONObjectM15433i.length() > 0) {
                    jSONObject.put(C3380b.f18375ab, jSONObjectM15433i);
                }
                jSONArray.put(jSONObject);
                sharedPreferences.edit().putString(f18506B, jSONArray.toString()).commit();
                return;
            }
            if (i != 3 && jSONArray.length() > 0) {
                int i5 = 0;
                while (i5 < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                    if (jSONObject2 == null || jSONObject2.length() <= 0) {
                        i2 = i5;
                    } else {
                        int i6 = jSONObject2.getInt(f18507C);
                        if (!jSONObject2.has(C3380b.f18375ab) && jSONObjectM15433i.length() > 0) {
                            jSONObject2.put(C3380b.f18375ab, jSONObjectM15433i);
                        }
                        i2 = i5;
                        if (i6 == 0 || i6 == i3) {
                            jSONObject2.put("_$!ts", System.currentTimeMillis());
                        }
                        jSONObject2.put("__ii", strOptString);
                        jSONObject2.remove(f18507C);
                        C3385g.m15485a(f18508a).m15498a(jSONObject2, i6);
                    }
                    i5 = i2 + 1;
                    i3 = 1;
                }
                C3375b.m15394a().m15427d();
                sharedPreferences.edit().remove(f18506B).commit();
            }
            C3385g.m15485a(f18508a).m15498a(jSONObject, i);
            if (!z) {
                if (!UMEnvelopeBuild.isReadyBuild(f18508a, UMLogDataProtocol.UMBusinessType.U_DPLUS)) {
                    return;
                }
                Defcon service = Defcon.getService(f18508a);
                if (service.isOpen() && !new ReportPolicy.DefconPolicy(StatTracer.getInstance(f18508a), service).shouldSendMessage(false)) {
                    return;
                }
            }
            m15526c(true);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15548a(JSONObject jSONObject) {
        JSONObject jSONObjectM15527d;
        try {
            if (!UMEnvelopeBuild.isReadyBuild(f18508a, UMLogDataProtocol.UMBusinessType.U_DPLUS) || jSONObject == null || (jSONObjectM15527d = m15527d(true)) == null || jSONObjectM15527d.length() <= 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C3380b.f18376ac, jSONArray);
            jSONObject2.put("dplus", jSONObject3);
            Context context = f18508a;
            if (context == null || jSONObjectM15527d == null) {
                return;
            }
            UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObjectM15527d, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15549a(boolean z) {
        if (m15531e(z) && UMEnvelopeBuild.isReadyBuild(f18508a, UMLogDataProtocol.UMBusinessType.U_APP)) {
            m15526c(false);
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m15550b(long j) {
        if (!AnalyticsConfig.FLAG_DPLUS || TextUtils.isEmpty(C3393o.m15600a().m15613c(f18508a))) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (AnalyticsConfig.FLAG_DPLUS) {
            jSONObject = C3385g.m15485a(f18508a).m15506c();
            C3390l.m15578a().m15581a(jSONObject, f18508a);
            Defcon service = Defcon.getService(f18508a);
            if (service.isOpen() && !new ReportPolicy.DefconPolicy(StatTracer.getInstance(f18508a), service).shouldSendMessage(false)) {
                jSONObject = new JSONObject();
            }
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        JSONObject jSONObjectM15527d = m15527d(true);
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObject3.put("dplus", jSONObject);
            }
            if (jSONObjectM15527d != null && jSONObjectM15527d.length() > 0) {
                jSONObject2.put("header", jSONObjectM15527d);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return m15522a(jSONObject2, j);
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m15551b(boolean z) {
        JSONObject jSONObjectM15494a = null;
        try {
            jSONObjectM15494a = C3385g.m15485a(f18508a).m15494a(z);
            if (jSONObjectM15494a == null) {
                jSONObjectM15494a = new JSONObject();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18508a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObjectM15494a.put("userlevel", string);
                }
            }
            if (m15541n()) {
                long jM15555c = m15555c();
                this.f18526j = jM15555c;
                if (jM15555c != 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", this.f18526j);
                    jSONObjectM15494a.put(C3380b.f18350D, jSONObject);
                    sharedPreferences.edit().putLong(f18510r, 0L).commit();
                }
            }
            String[] strArrM15437a = C3376c.m15437a(f18508a);
            if (strArrM15437a != null && !TextUtils.isEmpty(strArrM15437a[0]) && !TextUtils.isEmpty(strArrM15437a[1])) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3380b.f18354H, strArrM15437a[0]);
                jSONObject2.put(C3380b.f18355I, strArrM15437a[1]);
                if (jSONObject2.length() > 0) {
                    jSONObjectM15494a.put(C3380b.f18353G, jSONObject2);
                }
            }
            if (ABTest.getService(f18508a).isInTest()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ABTest.getService(f18508a).getTestName(), ABTest.getService(f18508a).getGroupInfo());
                jSONObjectM15494a.put(C3380b.f18352F, jSONObject3);
            }
            C3390l.m15578a().m15583b(jSONObjectM15494a, f18508a);
            if (jSONObjectM15494a.length() > 0) {
                new JSONObject().put("analytics", jSONObjectM15494a);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectM15494a;
    }

    /* JADX INFO: renamed from: b */
    public void m15552b() {
        f18517z = true;
        m15526c(false);
    }

    /* JADX INFO: renamed from: b */
    public void m15553b(Context context) {
        try {
            C3385g.m15485a(context).m15504b();
            m15539l();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15554b(Object obj) {
        f18517z = true;
        m15553b(f18508a);
        m15544a();
        m15526c(false);
        if (AnalyticsConfig.FLAG_DPLUS) {
            m15547a(obj, 2, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public long m15555c() {
        SharedPreferences sharedPreferences;
        long jCurrentTimeMillis = 0;
        try {
            Context context = f18508a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j = sharedPreferences.getLong(f18509q, 0L);
            if (j == 0) {
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f18509q, jCurrentTimeMillis).commit();
                    return jCurrentTimeMillis;
                } catch (Throwable unused) {
                }
            }
            return j;
        } catch (Throwable unused2) {
            return jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15556c(Object obj) {
        m15540m();
        f18505A = true;
        m15532f();
        m15534g();
        m15535h();
        m15536i();
        m15549a(true);
        if (AnalyticsConfig.FLAG_DPLUS) {
            m15547a(obj, 2, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15557d() {
        try {
            String strM15612c = C3393o.m15600a().m15612c();
            if (TextUtils.isEmpty(strM15612c)) {
                return;
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18508a);
            String string = sharedPreferences.getString(f18506B, "");
            JSONArray jSONArray = TextUtils.isEmpty(string) ? new JSONArray() : new JSONArray(string);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        int i2 = jSONObject.getInt(f18507C);
                        if (i2 == 0 || i2 == 1) {
                            jSONObject.put("_$!ts", System.currentTimeMillis());
                        }
                        jSONObject.put("__ii", strM15612c);
                        jSONObject.remove(f18507C);
                        C3385g.m15485a(f18508a).m15498a(jSONObject, i2);
                    }
                }
                sharedPreferences.edit().remove(f18506B).commit();
                if (UMEnvelopeBuild.isReadyBuild(f18508a, UMLogDataProtocol.UMBusinessType.U_DPLUS)) {
                    m15526c(true);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
