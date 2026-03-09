package com.anythink.core.common.p065n;

import android.app.KeyguardManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.AbstractC1217aj;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1202a;
import com.anythink.core.common.p055f.C1215ah;
import com.anythink.core.common.p055f.C1229av;
import com.anythink.core.common.p055f.C1234b;
import com.anythink.core.common.p055f.C1235ba;
import com.anythink.core.common.p055f.C1237bc;
import com.anythink.core.common.p055f.C1238c;
import com.anythink.core.common.p055f.C1243h;
import com.anythink.core.common.p055f.C1245j;
import com.anythink.core.common.p055f.C1246k;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p055f.C1260y;
import com.anythink.core.common.p060i.C1292d;
import com.anythink.core.common.p060i.C1293e;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p066o.p068b.C1335b;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import com.anythink.core.p072d.C1394d;
import com.anythink.core.p072d.C1396f;
import com.anythink.core.p072d.C1398h;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1322e {

    /* JADX INFO: renamed from: a */
    public static final int f5060a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f5061b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f5062c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f5063d = 4;

    /* JADX INFO: renamed from: e */
    public static final int f5064e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f5065f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f5066g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f5067h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f5068i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f5069j = 3;

    /* JADX INFO: renamed from: k */
    public static final int f5070k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f5071l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f5072m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f5073n = 4;

    /* JADX INFO: renamed from: o */
    public static final int f5074o = 5;

    /* JADX INFO: renamed from: p */
    public static final int f5075p = 0;

    /* JADX INFO: renamed from: q */
    private static String f5076q = "";

    /* JADX INFO: renamed from: com.anythink.core.common.n.e$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1396f f5078b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5079c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f5080d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f5081e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f5082f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f5083g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f5084h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ long f5085i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Map f5086j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C1238c f5087k;

        public AnonymousClass1(C1396f c1396f, String str, String str2, boolean z, int i, String str3, String str4, long j, Map map, C1238c c1238c) {
            c1396f = c1396f;
            str = str;
            str = str2;
            z = z;
            i = i;
            str = str3;
            str = str4;
            j = j;
            map = map;
            c1238c = c1238c;
        }

        /* JADX WARN: Removed duplicated region for block: B:122:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x014d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 359
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1322e.AnonymousClass1.run():void");
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.n.e$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5089b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5090c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f5091d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f5092e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f5093f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f5094g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f5095h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f5096i;

        public AnonymousClass2(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, String str7) {
            str = str;
            str = str2;
            str = str3;
            str = str4;
            str = str5;
            i = i;
            z = z;
            str = str6;
            str = str7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1246k c1246k = new C1246k(str, str);
            c1246k.f4244a = "1004680";
            c1246k.f4245b = str;
            c1246k.f4247d = str;
            c1246k.f4256m = str;
            c1246k.f4257n = String.valueOf(i);
            c1246k.f4258o = z ? "1" : "0";
            boolean zIsScreenOn = true;
            try {
                zIsScreenOn = ((PowerManager) C1175n.m2059a().m2148f().getSystemService("power")).isScreenOn();
            } catch (Throwable unused) {
            }
            c1246k.f4259p = zIsScreenOn ? "1" : "0";
            c1246k.f4260q = C1345i.m4159a(C1175n.m2059a().m2148f()) ? "1" : "0";
            c1246k.f4261r = str;
            c1246k.f4262s = str;
            C1322e.m3892a(c1246k);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.n.e$3 */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5097a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5098b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5099c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f5100d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f5101e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f5102f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f5103g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f5104h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f5105i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ boolean f5106j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ String f5107k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ long f5108l;

        public AnonymousClass3(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, boolean z, String str8, long j) {
            str = str;
            str = str2;
            str = str3;
            str = str4;
            str = str5;
            i = i;
            i = i2;
            str = str6;
            str = str7;
            z = z;
            str = str8;
            j = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zIsScreenOn;
            C1246k c1246k = new C1246k(str, str);
            c1246k.f4244a = "1004687";
            C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
            if (c1391aM4865b == null || !C1322e.m3936c(c1391aM4865b, c1246k)) {
                c1246k.f4245b = str;
                c1246k.f4247d = str;
                c1246k.f4256m = str;
                c1246k.f4257n = String.valueOf(i);
                c1246k.f4258o = String.valueOf(i);
                boolean zM4159a = true;
                try {
                    zIsScreenOn = ((PowerManager) C1175n.m2059a().m2148f().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                    zIsScreenOn = true;
                }
                boolean zInKeyguardRestrictedInputMode = false;
                try {
                    KeyguardManager keyguardManager = (KeyguardManager) C1175n.m2059a().m2148f().getSystemService("keyguard");
                    if (keyguardManager != null) {
                        zInKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                    }
                } catch (Throwable unused2) {
                }
                c1246k.f4259p = (zInKeyguardRestrictedInputMode || !zIsScreenOn) ? (zInKeyguardRestrictedInputMode || zIsScreenOn) ? (zInKeyguardRestrictedInputMode && zIsScreenOn) ? "2" : "3" : "1" : "0";
                try {
                    zM4159a = C1345i.m4159a(C1175n.m2059a().m2148f());
                } catch (Throwable unused3) {
                }
                c1246k.f4260q = zM4159a ? "1" : "0";
                c1246k.f4261r = str;
                c1246k.f4262s = str;
                c1246k.f4263t = z ? "1" : "2";
                if (TextUtils.isEmpty(C1322e.f5076q)) {
                    try {
                        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                        long blockSize = statFs.getBlockSize();
                        String unused4 = C1322e.f5076q = ((statFs.getAvailableBlocks() * blockSize) / 1048576) + "MB";
                        c1246k.f4264u = C1322e.f5076q;
                    } catch (Throwable unused5) {
                    }
                } else {
                    c1246k.f4264u = C1322e.f5076q;
                }
                c1246k.f4265v = str;
                c1246k.f4266w = String.valueOf(j);
                C1322e.m3892a(c1246k);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.n.e$4 */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5109a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5110b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5111c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f5112d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f5113e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ long f5114f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f5115g;

        public AnonymousClass4(int i, String str, String str2, String str3, String str4, long j, int i2) {
            i = i;
            str = str;
            str = str2;
            str = str3;
            str = str4;
            j = j;
            i = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1246k c1246k = new C1246k(String.valueOf(i), "");
            c1246k.f4244a = "1004691";
            C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
            if (c1391aM4865b == null || c1391aM4865b.m4712I() || !c1391aM4865b.m4756c() || C1322e.m3936c(c1391aM4865b, c1246k)) {
                return;
            }
            c1246k.f4245b = str;
            c1246k.f4247d = str;
            c1246k.f4256m = str;
            c1246k.f4257n = str;
            long j = j;
            if (j >= 0) {
                c1246k.f4258o = String.valueOf(j);
            }
            int i = i;
            if (i > 0) {
                c1246k.f4259p = String.valueOf(i);
            }
            C1292d c1292dM3719b = C1293e.m3713a().m3719b();
            if (c1292dM3719b != null) {
                c1246k.f4260q = String.valueOf(c1292dM3719b.m3705a());
                c1246k.f4261r = String.valueOf(c1292dM3719b.m3709e());
                c1246k.f4262s = String.valueOf(c1292dM3719b.m3710f());
                c1246k.f4263t = String.valueOf(c1292dM3719b.m3706b());
                c1246k.f4264u = String.valueOf(c1292dM3719b.m3711g());
                c1246k.f4265v = String.valueOf(c1292dM3719b.m3712h());
                c1246k.f4266w = String.valueOf(c1292dM3719b.m3707c());
                c1246k.f4267x = String.valueOf(c1292dM3719b.m3708d());
            }
            c1246k.f4268y = String.valueOf(C1293e.m3713a().m3722e());
            C1322e.m3892a(c1246k);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.n.e$5 */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(c1246k.f4248e)) {
                c1246k.f4248e = C1175n.m2059a().m2168q();
            }
            if (!TextUtils.isEmpty(c1246k.f4247d)) {
                c1246k.f4249f = C1175n.m2059a().m2151g(c1246k.f4247d);
                C1322e.m3934c(c1246k);
                if (ATAdxSetting.getInstance().isAdxNetworkMode(c1246k.f4247d)) {
                    c1246k.f4243I = 1;
                }
            }
            c1246k.f4252i = String.valueOf(System.currentTimeMillis());
            C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
            boolean zM3925a = false;
            if (c1391aM4865b != null) {
                zM3925a = C1322e.m3925a(c1246k, c1391aM4865b);
                if (C1322e.m3936c(c1391aM4865b, c1246k)) {
                    return;
                }
                if (C1322e.m3933b(c1391aM4865b, c1246k)) {
                    C1323f.m3938a(C1175n.m2059a().m2148f()).m3797a(c1246k, zM3925a);
                    return;
                }
            }
            C1321d.m3855a().m3869a(c1246k, zM3925a);
        }
    }

    /* JADX INFO: renamed from: com.anythink.core.common.n.e$6 */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5117a;

        public AnonymousClass6(String str) {
            str = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C1246k c1246kM3152a = C1246k.m3152a(str);
            if (TextUtils.isEmpty(c1246kM3152a.f4244a)) {
                return;
            }
            C1322e.m3892a(c1246kM3152a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3871a() {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004657";
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3872a(int i, int i2, int i3, int i4) {
        C1246k c1246k = new C1246k(null, String.valueOf(i4));
        c1246k.f4244a = "1004641";
        c1246k.f4256m = String.valueOf(i);
        c1246k.f4257n = String.valueOf(i2);
        c1246k.f4258o = String.valueOf(i3);
        c1246k.f4259p = String.valueOf(i4);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3873a(int i, long j, long j2, String str) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004644";
        c1246k.f4248e = str;
        c1246k.f4256m = String.valueOf(i);
        c1246k.f4257n = String.valueOf(j);
        c1246k.f4258o = String.valueOf(j2);
        c1246k.f4259p = String.valueOf(j2 - j);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    private static void m3874a(int i, long j, long j2, String str, String str2) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004651";
        c1246k.f4248e = str;
        c1246k.f4256m = String.valueOf(i);
        c1246k.f4257n = String.valueOf(j2 - j);
        c1246k.f4258o = str2;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3875a(C1229av c1229av, C1202a c1202a, long j, boolean z, boolean z3) {
        C1246k c1246k = new C1246k(String.valueOf(c1202a.f3682f), String.valueOf(c1229av.m2784d()));
        c1246k.f4244a = "1004660";
        C1235ba c1235ba = c1202a.f3690n;
        C1396f c1396fM2916a = c1235ba != null ? c1235ba.m2916a() : null;
        c1246k.f4245b = c1202a.f3680d;
        c1246k.f4247d = c1202a.f3681e;
        String strM5123q = "";
        c1246k.f4250g = String.valueOf(c1396fM2916a != null ? Integer.valueOf(c1396fM2916a.m5097ao()) : "");
        c1246k.f4255l = String.valueOf(c1396fM2916a != null ? Integer.valueOf(c1396fM2916a.m5054Z()) : "");
        c1246k.f4253j = c1396fM2916a != null ? c1396fM2916a.m5087ae() : "";
        c1246k.f4256m = String.valueOf(c1229av.m2784d());
        c1246k.f4257n = c1229av.m2842u();
        c1246k.f4258o = z ? "1" : "2";
        c1246k.f4259p = String.valueOf(j);
        c1246k.f4260q = z3 ? "1" : "2";
        if (c1396fM2916a != null) {
            try {
                strM5123q = c1396fM2916a.m5123q();
            } catch (Throwable unused) {
            }
        }
        c1246k.f4237C = strM5123q;
        try {
            Object obj = c1202a.f3679c.f4486g.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                c1246k.f4238D = obj.toString();
            }
        } catch (Throwable unused2) {
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3876a(C1237bc c1237bc) {
        if (c1237bc == null) {
            return;
        }
        C1246k c1246k = new C1246k(c1237bc.m2959q(), String.valueOf(c1237bc.m2956n()));
        c1246k.f4244a = "1004667";
        c1246k.f4256m = String.valueOf(c1237bc.m2956n());
        c1246k.f4257n = c1237bc.m2957o();
        c1246k.f4258o = c1237bc.m2948f();
        c1246k.f4259p = c1237bc.m2949g();
        c1246k.f4260q = c1237bc.m2947e();
        c1246k.f4261r = c1237bc.m2945d();
        c1246k.f4262s = c1237bc.m2951i();
        c1246k.f4263t = c1237bc.m2950h();
        c1246k.f4264u = String.valueOf(c1237bc.m2960r());
        c1246k.f4265v = String.valueOf(c1237bc.m2961s());
        c1246k.f4266w = String.valueOf(c1237bc.m2962t());
        c1246k.f4267x = String.valueOf(c1237bc.m2963u());
        c1246k.f4268y = String.valueOf(c1237bc.m2964v());
        if (c1237bc.m2940b() != null) {
            c1246k.f4269z = c1237bc.m2940b();
        }
        c1246k.f4245b = c1237bc.m2952j();
        c1246k.f4250g = c1237bc.m2953k();
        c1246k.f4255l = c1237bc.m2954l();
        c1246k.f4247d = c1237bc.m2955m();
        c1246k.f4253j = c1237bc.m2958p();
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3877a(C1243h c1243h) {
        try {
            C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
            c1246k.f4244a = "1004640";
            c1246k.f4245b = c1243h.m2678ai();
            c1246k.f4250g = String.valueOf(c1243h.m3040Q());
            c1246k.f4255l = String.valueOf(c1243h.m2675af());
            c1246k.f4247d = c1243h.m2677ah();
            c1246k.f4256m = String.valueOf(c1243h.m3039P());
            c1246k.f4257n = c1243h.m3026F();
            c1246k.f4258o = String.valueOf(c1243h.m3029H());
            c1246k.f4259p = String.valueOf(c1243h.m3041R());
            c1246k.f4260q = String.valueOf(c1243h.m3042S());
            c1246k.f4237C = c1243h.m2670aa();
            c1246k.f4238D = c1243h.m2671ab();
            c1246k.f4235A = c1243h.m2679aj();
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3878a(C1243h c1243h, int i, AdError adError) {
        try {
            m3904a(c1243h.m2678ai(), c1243h.m2677ah(), c1243h.m3040Q(), c1243h.m3037N(), c1243h.m3039P(), c1243h.m3026F(), c1243h.m2679aj(), -1, i, adError, c1243h.m3022D(), c1243h.m3024E(), 0L, c1243h.m2675af(), c1243h.m3043T(), c1243h.f4213q, c1243h.m2670aa(), c1243h.m2671ab());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3879a(C1243h c1243h, int i, AdError adError, long j) {
        try {
            m3904a(c1243h.m2678ai(), c1243h.m2677ah(), c1243h.m3040Q(), c1243h.m3037N(), c1243h.m3039P(), c1243h.m3026F(), c1243h.m2679aj(), c1243h.m3029H(), i, adError, c1243h.m3022D(), c1243h.m3024E(), j, c1243h.m2675af(), c1243h.m3043T(), c1243h.f4213q, c1243h.m2670aa(), c1243h.m2671ab());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3880a(C1243h c1243h, int i, String str, double d, String str2, String str3) {
        C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(i));
        c1246k.f4244a = "1004668";
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4256m = String.valueOf(i);
        c1246k.f4257n = str;
        c1246k.f4258o = String.valueOf(d);
        c1246k.f4259p = str2;
        c1246k.f4260q = str3;
        c1246k.f4253j = c1243h.m2676ag();
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4237C = c1243h.m2670aa();
        c1246k.f4238D = c1243h.m2671ab();
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3881a(C1243h c1243h, AdError adError) {
        try {
            C1246k c1246k = new C1246k(c1243h.m2679aj(), null);
            c1246k.f4244a = "1004630";
            c1246k.f4245b = c1243h.m2678ai();
            c1246k.f4247d = c1243h.m2677ah();
            c1246k.f4255l = String.valueOf(c1243h.m2675af());
            c1246k.f4250g = String.valueOf(c1243h.m3040Q());
            c1246k.f4254k = String.valueOf(c1243h.m3037N());
            C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1243h.m2677ah());
            c1246k.f4253j = c1396fM5139a != null ? c1396fM5139a.m5087ae() : "";
            if (adError != null) {
                c1246k.f4256m = adError.printStackTrace();
                c1246k.f4257n = adError.getCode();
            }
            c1246k.f4237C = c1243h.m2670aa();
            c1246k.f4238D = c1243h.m2671ab();
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3882a(C1243h c1243h, AdError adError, Map<String, Object> map) {
        C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
        c1246k.f4244a = "1004636";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4254k = String.valueOf(c1243h.m3037N());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4256m = String.valueOf(c1243h.m3039P());
        c1246k.f4257n = c1243h.m3026F();
        c1246k.f4258o = String.valueOf(c1243h.m3031I());
        if (adError != null) {
            c1246k.f4259p = adError.getCode();
            c1246k.f4260q = adError.getPlatformCode();
            c1246k.f4261r = adError.getPlatformMSG();
        }
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1243h.m2677ah());
        c1246k.f4253j = c1396fM5139a != null ? c1396fM5139a.m5087ae() : "";
        c1246k.f4235A = c1243h.m2679aj();
        if (map != null) {
            try {
                if (map.containsKey("offer_id")) {
                    c1246k.f4262s = map.get("offer_id").toString();
                }
                if (map.containsKey(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE) && c1243h.m2679aj().equals("1")) {
                    c1246k.f4263t = map.get(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE).toString();
                }
            } catch (Throwable unused) {
            }
        }
        c1246k.f4237C = c1243h.m2670aa();
        c1246k.f4238D = c1243h.m2671ab();
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3883a(C1243h c1243h, C1394d c1394d, String str, double d, String str2, double d2) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004702";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4256m = c1243h.m2679aj();
        c1246k.f4257n = c1394d.m4879a() == 1 ? "1" : "2";
        c1246k.f4258o = String.valueOf(c1394d.m4880b());
        c1246k.f4259p = String.valueOf(c1394d.m4881c());
        c1246k.f4260q = String.valueOf(c1394d.m4882d());
        c1246k.f4261r = String.valueOf(c1394d.m4884f());
        c1246k.f4262s = String.valueOf(c1394d.m4883e());
        c1246k.f4263t = str;
        c1246k.f4264u = String.valueOf(d);
        c1246k.f4265v = str2;
        c1246k.f4266w = String.valueOf(d2);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3884a(C1243h c1243h, C1396f c1396f, String str, String str2, String str3, int i) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004696";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        if (c1396f != null) {
            c1246k.f4253j = c1396f.m5087ae();
        }
        c1246k.f4256m = str;
        c1246k.f4257n = str2;
        c1246k.f4258o = str3;
        c1246k.f4259p = String.valueOf(i);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3885a(C1243h c1243h, C1396f c1396f, String str, String str2, String str3, String str4, String str5) {
        C1246k c1246k = new C1246k(null, str);
        c1246k.f4244a = "1004695";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        if (c1396f != null) {
            c1246k.f4253j = c1396f.m5087ae();
        }
        c1246k.f4256m = str;
        c1246k.f4257n = str2;
        c1246k.f4258o = str3;
        c1246k.f4259p = str4;
        c1246k.f4260q = str5;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    private static void m3886a(C1243h c1243h, String str) {
        try {
            C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
            c1246k.f4244a = "1004639";
            c1246k.f4245b = c1243h.m2678ai();
            c1246k.f4247d = c1243h.m2677ah();
            c1246k.f4255l = String.valueOf(c1243h.m2675af());
            c1246k.f4250g = String.valueOf(c1243h.m3040Q());
            c1246k.f4256m = String.valueOf(c1243h.m3039P());
            c1246k.f4257n = c1243h.m3026F();
            c1246k.f4258o = String.valueOf(c1243h.m3029H());
            c1246k.f4259p = str;
            c1246k.f4235A = c1243h.m2679aj();
            c1246k.f4237C = c1243h.m2670aa();
            c1246k.f4238D = c1243h.m2671ab();
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3887a(C1243h c1243h, String str, String str2) {
        C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
        c1246k.f4244a = "1004669";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4256m = String.valueOf(c1243h.m3039P());
        c1246k.f4257n = str;
        c1246k.f4258o = str2;
        c1246k.f4253j = c1243h.m2676ag();
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4237C = c1243h.m2670aa();
        c1246k.f4238D = c1243h.m2671ab();
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3888a(C1243h c1243h, String str, String str2, String str3, String str4, String str5) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004705";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4254k = String.valueOf(c1243h.m3037N());
        c1246k.f4256m = String.valueOf(c1243h.m3039P());
        c1246k.f4257n = c1243h.m3026F();
        c1246k.f4258o = str4;
        c1246k.f4259p = str5;
        c1246k.f4260q = str;
        c1246k.f4261r = str2;
        c1246k.f4262s = str3;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3889a(C1243h c1243h, boolean z) {
        int iM3046W;
        C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
        c1246k.f4244a = "1004634";
        c1246k.f4245b = c1243h.m2678ai();
        c1246k.f4247d = c1243h.m2677ah();
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4254k = String.valueOf(c1243h.m3037N());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4256m = String.valueOf(c1243h.m3039P());
        c1246k.f4257n = c1243h.m3026F();
        c1246k.f4258o = String.valueOf(c1243h.m3031I());
        c1246k.f4259p = z ? "1" : "0";
        c1246k.f4260q = String.valueOf(c1243h.f4221y);
        if (c1243h.m3039P() == 66 && (iM3046W = c1243h.m3046W()) != 0) {
            c1246k.f4261r = String.valueOf(iM3046W);
        }
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1243h.m2677ah());
        c1246k.f4253j = c1396fM5139a != null ? c1396fM5139a.m5087ae() : "";
        c1246k.f4235A = c1243h.m2679aj();
        c1246k.f4237C = c1243h.m2670aa();
        c1246k.f4238D = c1243h.m2671ab();
        m3892a(c1246k);
        C1319b.m3821a().m3834a(c1246k, c1243h);
    }

    /* JADX INFO: renamed from: a */
    public static void m3890a(C1243h c1243h, boolean z, long j, long j2, long j3) {
        try {
            C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
            c1246k.f4244a = "1004643";
            c1246k.f4245b = c1243h.m2678ai();
            c1246k.f4247d = c1243h.m2677ah();
            c1246k.f4250g = String.valueOf(c1243h.m3040Q());
            c1246k.f4254k = String.valueOf(c1243h.m3037N());
            c1246k.f4255l = String.valueOf(c1243h.m2675af());
            c1246k.f4256m = c1243h.m2679aj();
            c1246k.f4257n = String.valueOf(j);
            c1246k.f4258o = String.valueOf(j2);
            c1246k.f4259p = String.valueOf(j3);
            c1246k.f4260q = String.valueOf(c1243h.m3039P());
            c1246k.f4261r = c1243h.m3026F();
            c1246k.f4262s = String.valueOf(c1243h.m3031I());
            c1246k.f4263t = String.valueOf(c1243h.f4221y);
            c1246k.f4264u = z ? "1" : "0";
            C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(c1243h.m2677ah());
            c1246k.f4253j = c1396fM5139a != null ? c1396fM5139a.m5087ae() : "";
            c1246k.f4235A = c1243h.m2679aj();
            c1246k.f4237C = c1243h.m2670aa();
            c1246k.f4238D = c1243h.m2671ab();
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3891a(C1245j c1245j, C1248m c1248m, String str, C1215ah c1215ah, boolean z) {
        C1246k c1246k = new C1246k(String.valueOf(c1248m.f4329j), "66");
        c1246k.f4244a = "1004704";
        c1246k.f4245b = c1248m.f4323d;
        c1246k.f4247d = c1248m.f4321b;
        c1246k.f4255l = String.valueOf(c1248m.f4327h);
        c1246k.f4250g = String.valueOf(c1248m.f4328i);
        c1246k.f4256m = c1245j != null ? c1245j.m3229t() : "";
        c1246k.f4257n = "2";
        c1246k.f4258o = String.valueOf(c1248m.f4329j);
        if (!TextUtils.isEmpty(str)) {
            c1246k.f4259p = str;
        }
        c1246k.f4260q = String.valueOf(c1215ah.f3734b - c1215ah.f3733a);
        c1246k.f4261r = String.valueOf(c1215ah.f3735c - c1215ah.f3733a);
        if (c1245j != null) {
            c1246k.f4262s = c1245j.m3151e() == 1 ? "1" : "0";
        } else {
            c1246k.f4262s = "0";
        }
        c1246k.f4263t = String.valueOf(c1215ah.f3737e - c1215ah.f3736d);
        c1246k.f4264u = c1248m.f4335p ? "1" : "0";
        c1246k.f4265v = String.valueOf(c1215ah.f3734b - c1215ah.f3735c);
        c1246k.f4266w = z ? "1" : "0";
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3892a(C1246k c1246k) {
        if (c1246k == null) {
            return;
        }
        C1335b.m3998a().m4007a((Runnable) new Runnable() { // from class: com.anythink.core.common.n.e.5
            public AnonymousClass5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(c1246k.f4248e)) {
                    c1246k.f4248e = C1175n.m2059a().m2168q();
                }
                if (!TextUtils.isEmpty(c1246k.f4247d)) {
                    c1246k.f4249f = C1175n.m2059a().m2151g(c1246k.f4247d);
                    C1322e.m3934c(c1246k);
                    if (ATAdxSetting.getInstance().isAdxNetworkMode(c1246k.f4247d)) {
                        c1246k.f4243I = 1;
                    }
                }
                c1246k.f4252i = String.valueOf(System.currentTimeMillis());
                C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                boolean zM3925a = false;
                if (c1391aM4865b != null) {
                    zM3925a = C1322e.m3925a(c1246k, c1391aM4865b);
                    if (C1322e.m3936c(c1391aM4865b, c1246k)) {
                        return;
                    }
                    if (C1322e.m3933b(c1391aM4865b, c1246k)) {
                        C1323f.m3938a(C1175n.m2059a().m2148f()).m3797a(c1246k, zM3925a);
                        return;
                    }
                }
                C1321d.m3855a().m3869a(c1246k, zM3925a);
            }
        }, 8, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:43|(1:45)(2:47|(1:49)(10:50|(1:52)|53|(1:55)|56|71|57|(2:59|(6:61|(1:63)|73|64|(1:66)|67))|68|69))|46|53|(0)|56|71|57|(0)|68|69) */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:57:0x0082, B:59:0x0086, B:61:0x0097, B:63:0x00a3, B:64:0x00b2, B:66:0x00b9, B:67:0x00c1), top: B:71:0x0082 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3893a(com.anythink.core.common.p055f.AbstractC1247l r3, com.anythink.core.common.p055f.C1248m r4, java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1322e.m3893a(com.anythink.core.common.f.l, com.anythink.core.common.f.m, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: a */
    public static void m3894a(C1248m c1248m, AbstractC1247l abstractC1247l) {
        if (abstractC1247l == null || c1248m == null || !(abstractC1247l instanceof AbstractC1217aj)) {
            return;
        }
        C1246k c1246k = new C1246k(String.valueOf(c1248m.f4329j), String.valueOf(c1248m.f4325f));
        c1246k.f4244a = "1004697";
        c1246k.f4245b = c1248m.f4323d;
        c1246k.f4247d = c1248m.f4321b;
        c1246k.f4250g = String.valueOf(c1248m.f4328i);
        c1246k.f4255l = String.valueOf(c1248m.f4327h);
        c1246k.f4256m = abstractC1247l.m3229t();
        c1246k.f4257n = abstractC1247l.m3231u();
        c1246k.f4258o = ((AbstractC1217aj) abstractC1247l).m2485ad();
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3895a(C1248m c1248m, AbstractC1247l abstractC1247l, int i) {
        try {
            C1246k c1246k = new C1246k(String.valueOf(c1248m.f4329j), String.valueOf(c1248m.f4325f));
            c1246k.f4244a = "1004679";
            c1246k.f4245b = c1248m.f4323d;
            c1246k.f4247d = c1248m.f4321b;
            if (abstractC1247l instanceof C1245j) {
                c1246k.f4256m = ((C1245j) abstractC1247l).m2485ad();
            }
            c1246k.f4257n = c1248m.f4322c;
            c1246k.f4258o = abstractC1247l.m3229t();
            c1246k.f4259p = String.valueOf(abstractC1247l.mo2426d());
            c1246k.f4260q = abstractC1247l.m3202i();
            c1246k.f4261r = abstractC1247l.m3205j();
            c1246k.f4262s = String.valueOf(i);
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3896a(C1248m c1248m, AbstractC1247l abstractC1247l, String str, String str2, int i) {
        if (c1248m == null || abstractC1247l == null) {
            return;
        }
        C1246k c1246k = new C1246k(String.valueOf(c1248m.f4329j), String.valueOf(c1248m.f4325f));
        c1246k.f4244a = "1004650";
        c1246k.f4247d = c1248m.f4321b;
        c1246k.f4256m = abstractC1247l.m3229t();
        c1246k.f4257n = String.valueOf(abstractC1247l.mo2426d());
        c1246k.f4258o = str;
        c1246k.f4259p = str2;
        c1246k.f4260q = String.valueOf(i);
        c1246k.f4245b = c1248m.f4323d;
        c1246k.f4263t = String.valueOf(c1248m.f4329j);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3897a(C1248m c1248m, AbstractC1247l abstractC1247l, String str, String str2, String str3, String str4) {
        if (c1248m == null || abstractC1247l == null) {
            return;
        }
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004648";
        c1246k.f4247d = c1248m.f4321b;
        c1246k.f4256m = abstractC1247l.m3229t();
        c1246k.f4257n = String.valueOf(abstractC1247l.mo2426d());
        c1246k.f4258o = str;
        c1246k.f4259p = str2;
        c1246k.f4260q = str3;
        c1246k.f4261r = str4;
        c1246k.f4245b = c1248m.f4323d;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3898a(C1248m c1248m, AbstractC1247l abstractC1247l, boolean z, int i, int i2, long j, long j2) {
        if (c1248m == null || abstractC1247l == null) {
            return;
        }
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004699";
        c1246k.f4245b = c1248m.f4323d;
        c1246k.f4247d = c1248m.f4321b;
        c1246k.f4256m = z ? "2" : "1";
        c1246k.f4257n = String.valueOf(i);
        c1246k.f4258o = String.valueOf(j);
        c1246k.f4259p = String.valueOf(j2);
        c1246k.f4260q = String.valueOf(c1248m.f4329j);
        c1246k.f4261r = String.valueOf(i2);
        if (abstractC1247l instanceof C1245j) {
            C1245j c1245j = (C1245j) abstractC1247l;
            c1246k.f4262s = String.valueOf(c1245j.m2485ad());
            c1246k.f4263t = String.valueOf(c1245j.m3229t());
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3899a(C1260y c1260y, double d, String str, double d2, double d3, double d4) {
        C1246k c1246k = new C1246k(String.valueOf(c1260y.m3469n()), String.valueOf(c1260y.m3466k()));
        c1246k.f4244a = "1004659";
        c1246k.f4245b = c1260y.m3462g();
        c1246k.f4247d = c1260y.m3465j();
        c1246k.f4250g = String.valueOf(c1260y.m3463h());
        c1246k.f4255l = String.valueOf(c1260y.m3464i());
        c1246k.f4253j = c1260y.m3468m();
        c1246k.f4256m = String.valueOf(c1260y.m3466k());
        c1246k.f4257n = c1260y.m3467l();
        c1246k.f4258o = String.valueOf(d);
        c1246k.f4259p = str;
        c1246k.f4237C = c1260y.m3470o();
        c1246k.f4238D = c1260y.m3471p();
        c1246k.f4260q = String.valueOf(d2);
        c1246k.f4261r = String.valueOf(d3);
        c1246k.f4262s = c1260y.m3473r();
        c1246k.f4263t = String.valueOf(c1260y.m3474s());
        c1246k.f4264u = String.valueOf(c1260y.m3461f());
        c1246k.f4265v = String.valueOf(d4);
        if (c1260y.m3457b() != null) {
            c1246k.f4266w = c1260y.m3457b();
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    private static void m3900a(Runnable runnable) {
        C1335b.m3998a().m4007a(runnable, 13, true);
    }

    /* JADX INFO: renamed from: a */
    public static void m3901a(String str) {
        m3900a(new Runnable() { // from class: com.anythink.core.common.n.e.6

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5117a;

            public AnonymousClass6(String str2) {
                str = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C1246k c1246kM3152a = C1246k.m3152a(str);
                if (TextUtils.isEmpty(c1246kM3152a.f4244a)) {
                    return;
                }
                C1322e.m3892a(c1246kM3152a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m3902a(String str, C1229av c1229av, boolean z, long j, C1202a c1202a) {
        C1396f c1396fM2916a = c1202a != null ? c1202a.f3690n.m2916a() : null;
        C1246k c1246k = new C1246k(String.valueOf(c1202a.f3682f), String.valueOf(c1229av.m2784d()));
        c1246k.f4244a = "1004665";
        c1246k.f4247d = str;
        String strM5123q = "";
        c1246k.f4253j = c1396fM2916a != null ? c1396fM2916a.m5087ae() : "";
        c1246k.f4256m = String.valueOf(c1229av.m2784d());
        c1246k.f4257n = c1229av.m2842u();
        c1246k.f4258o = String.valueOf(z ? 1 : 2);
        c1246k.f4259p = String.valueOf(j);
        if (c1396fM2916a != null) {
            try {
                strM5123q = c1396fM2916a.m5123q();
            } catch (Throwable unused) {
            }
        }
        c1246k.f4237C = strM5123q;
        try {
            Object obj = c1202a.f3679c.f4486g.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                c1246k.f4238D = obj.toString();
            }
        } catch (Throwable unused2) {
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3903a(String str, C1243h c1243h, String str2, Object obj) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004701";
        c1246k.f4247d = str;
        c1246k.f4250g = String.valueOf(c1243h.m3040Q());
        c1246k.f4255l = String.valueOf(c1243h.m2675af());
        c1246k.f4256m = c1243h.m2679aj();
        c1246k.f4257n = String.valueOf(c1243h.m3039P());
        c1246k.f4258o = c1243h.m3026F();
        c1246k.f4259p = String.valueOf(c1243h.m3043T());
        c1246k.f4260q = str2;
        c1246k.f4261r = obj != null ? obj.toString() : "";
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    private static void m3904a(String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, int i5, AdError adError, int i6, double d, long j, int i7, int i8, int i9, String str5, String str6) {
        C1246k c1246k = new C1246k(str4, String.valueOf(i3));
        c1246k.f4244a = "1004631";
        c1246k.f4245b = str;
        c1246k.f4247d = str2;
        c1246k.f4250g = String.valueOf(i);
        c1246k.f4254k = String.valueOf(i2);
        c1246k.f4255l = String.valueOf(i7);
        c1246k.f4256m = String.valueOf(i3);
        c1246k.f4257n = str3;
        c1246k.f4258o = String.valueOf(i4);
        c1246k.f4259p = String.valueOf(i5);
        c1246k.f4260q = adError != null ? adError.getPlatformCode() : "";
        c1246k.f4261r = adError != null ? adError.getPlatformMSG() : "";
        c1246k.f4262s = String.valueOf(i6);
        c1246k.f4263t = String.valueOf(d);
        if (i5 == 0) {
            c1246k.f4264u = String.valueOf(j);
        }
        c1246k.f4265v = String.valueOf(i8);
        c1246k.f4266w = String.valueOf(i9);
        C1396f c1396fM5139a = C1398h.m5135a(C1175n.m2059a().m2148f()).m5139a(str2);
        c1246k.f4253j = c1396fM5139a != null ? c1396fM5139a.m5087ae() : "";
        c1246k.f4237C = str5;
        c1246k.f4238D = str6;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3905a(String str, String str2, int i, String str3, Map<String, JSONArray> map, int i2, int i3, int i4, String str4, int i5, int i6, long j, String str5, int i7) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004675";
        c1246k.f4245b = str2;
        c1246k.f4247d = str;
        c1246k.f4256m = str3;
        c1246k.f4257n = String.valueOf(i);
        c1246k.f4259p = String.valueOf(i2);
        c1246k.f4260q = String.valueOf(i3);
        c1246k.f4261r = String.valueOf(i4);
        c1246k.f4262s = str4;
        c1246k.f4263t = String.valueOf(i5);
        if (i6 >= 0) {
            c1246k.f4264u = String.valueOf(i6);
        }
        if (j > 0) {
            c1246k.f4265v = String.valueOf(j);
        }
        if (!TextUtils.isEmpty(str5)) {
            c1246k.f4266w = str5;
        }
        if (i7 > 0) {
            c1246k.f4267x = String.valueOf(i7);
        }
        if (map != null && map.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, JSONArray> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                c1246k.f4268y = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3906a(String str, String str2, int i, String str3, JSONArray jSONArray, String str4, int i2) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004700";
        c1246k.f4245b = str2;
        c1246k.f4247d = str;
        c1246k.f4256m = str3;
        c1246k.f4257n = String.valueOf(i);
        c1246k.f4258o = jSONArray != null ? jSONArray.toString() : "";
        c1246k.f4259p = str4;
        c1246k.f4260q = String.valueOf(i2);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3907a(String str, String str2, long j, long j2, long j3) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004635";
        if (!TextUtils.isEmpty(str2)) {
            c1246k.f4247d = str2;
        }
        c1246k.f4256m = str;
        c1246k.f4257n = String.valueOf(j);
        c1246k.f4258o = String.valueOf(j2);
        c1246k.f4259p = String.valueOf(j3);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3908a(String str, String str2, C1243h c1243h, C1396f c1396f, String str3, String str4) {
        try {
            C1246k c1246k = new C1246k(c1243h.m2679aj(), String.valueOf(c1243h.m3039P()));
            c1246k.f4244a = "1004658";
            c1246k.f4245b = c1243h.m2678ai();
            c1246k.f4247d = str;
            c1246k.f4250g = String.valueOf(c1243h.m3040Q());
            c1246k.f4254k = String.valueOf(c1243h.m3037N());
            c1246k.f4255l = String.valueOf(c1243h.m2675af());
            c1246k.f4253j = c1396f != null ? c1396f.m5087ae() : "";
            c1246k.f4256m = String.valueOf(c1243h.m3039P());
            c1246k.f4257n = c1243h.m3026F();
            c1246k.f4258o = c1243h.m3129t();
            c1246k.f4259p = c1243h.m3109m();
            c1246k.f4260q = c1243h.f4134B;
            c1246k.f4261r = str3;
            c1246k.f4262s = str4;
            c1246k.f4263t = str2;
            c1246k.f4237C = c1243h.m2670aa();
            c1246k.f4238D = c1243h.m2671ab();
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3909a(String str, String str2, C1396f c1396f, int i, String str3, Map<String, Object> map) {
        Object obj;
        try {
            C1246k c1246k = new C1246k(c1396f != null ? String.valueOf(c1396f.m5090ah()) : "", "");
            c1246k.f4244a = "1004633";
            c1246k.f4245b = str;
            c1246k.f4247d = str2;
            c1246k.f4250g = String.valueOf(c1396f != null ? c1396f.m5097ao() : 0);
            c1246k.f4254k = "0";
            c1246k.f4255l = String.valueOf(c1396f != null ? Integer.valueOf(c1396f.m5054Z()) : "");
            c1246k.f4256m = String.valueOf(i);
            c1246k.f4257n = str3;
            c1246k.f4260q = str;
            c1246k.f4261r = "0";
            c1246k.f4253j = c1396f != null ? c1396f.m5087ae() : "";
            c1246k.f4237C = c1396f != null ? c1396f.m5123q() : "";
            if (map != null && (obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                c1246k.f4238D = obj.toString();
            }
            m3892a(c1246k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m3910a(String str, String str2, C1396f c1396f, String str3) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004646";
        c1246k.f4245b = str;
        c1246k.f4247d = str2;
        c1246k.f4250g = String.valueOf(c1396f.m5097ao());
        c1246k.f4255l = String.valueOf(c1396f.m5054Z());
        c1246k.f4253j = c1396f.m5087ae();
        c1246k.f4263t = String.valueOf(str3);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3911a(String str, String str2, C1396f c1396f, String str3, C1234b c1234b, long j) {
        String string;
        if (c1234b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c1234b.m2908h().m3039P());
            string = sb.toString();
        } else {
            string = null;
        }
        C1246k c1246k = new C1246k("4", string);
        c1246k.f4244a = "1004690";
        c1246k.f4245b = str2;
        c1246k.f4247d = str;
        if (c1396f != null) {
            c1246k.f4255l = String.valueOf(c1396f.m5054Z());
            c1246k.f4250g = String.valueOf(c1396f.m5097ao());
            c1246k.f4253j = c1396f != null ? c1396f.m5087ae() : "";
        }
        c1246k.f4256m = str3;
        if (c1234b != null) {
            c1246k.f4257n = c1234b.m2911k();
            c1246k.f4258o = c1246k.f4236B;
            c1246k.f4259p = c1234b.m2908h() != null ? c1234b.m2908h().m3026F() : "";
        }
        c1246k.f4260q = "1";
        c1246k.f4261r = String.valueOf(j);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3912a(String str, String str2, C1396f c1396f, boolean z, boolean z3, boolean z4, String str3, String str4, String str5) {
        C1246k c1246k = new C1246k(null, "");
        c1246k.f4244a = "1004694";
        c1246k.f4245b = str3;
        c1246k.f4247d = str;
        if (c1396f != null) {
            c1246k.f4250g = String.valueOf(c1396f.m5097ao());
            c1246k.f4255l = String.valueOf(c1396f.m5054Z());
            c1246k.f4253j = c1396f.m5087ae();
        }
        c1246k.f4254k = str5;
        c1246k.f4256m = z ? "1" : "0";
        c1246k.f4257n = z4 ? "1" : "0";
        c1246k.f4258o = z3 ? "1" : "0";
        c1246k.f4259p = str2;
        c1246k.f4260q = str4;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3913a(String str, String str2, String str3) {
        m3931b(str, str2, str3, "");
    }

    /* JADX INFO: renamed from: a */
    public static void m3914a(String str, String str2, String str3, int i, String str4, long j, long j2) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004642";
        c1246k.f4245b = str;
        c1246k.f4256m = str2;
        c1246k.f4257n = str3;
        c1246k.f4258o = String.valueOf(i);
        if (i == 3 || i == 10) {
            c1246k.f4259p = str4;
        } else if (i == 2) {
            c1246k.f4260q = String.valueOf(j);
            c1246k.f4261r = String.valueOf(j2 / 1024.0f);
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3915a(String str, String str2, String str3, String str4) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004637";
        c1246k.f4247d = str;
        c1246k.f4256m = str2;
        c1246k.f4257n = str3;
        c1246k.f4258o = str4;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3916a(String str, String str2, String str3, String str4, int i, int i2, long j) {
        m3900a(new Runnable() { // from class: com.anythink.core.common.n.e.4

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f5109a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5110b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f5111c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f5112d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f5113e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ long f5114f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f5115g;

            public AnonymousClass4(int i22, String str22, String str32, String str5, String str42, long j2, int i3) {
                i = i22;
                str = str22;
                str = str32;
                str = str5;
                str = str42;
                j = j2;
                i = i3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1246k c1246k = new C1246k(String.valueOf(i), "");
                c1246k.f4244a = "1004691";
                C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                if (c1391aM4865b == null || c1391aM4865b.m4712I() || !c1391aM4865b.m4756c() || C1322e.m3936c(c1391aM4865b, c1246k)) {
                    return;
                }
                c1246k.f4245b = str;
                c1246k.f4247d = str;
                c1246k.f4256m = str;
                c1246k.f4257n = str;
                long j2 = j;
                if (j2 >= 0) {
                    c1246k.f4258o = String.valueOf(j2);
                }
                int i3 = i;
                if (i3 > 0) {
                    c1246k.f4259p = String.valueOf(i3);
                }
                C1292d c1292dM3719b = C1293e.m3713a().m3719b();
                if (c1292dM3719b != null) {
                    c1246k.f4260q = String.valueOf(c1292dM3719b.m3705a());
                    c1246k.f4261r = String.valueOf(c1292dM3719b.m3709e());
                    c1246k.f4262s = String.valueOf(c1292dM3719b.m3710f());
                    c1246k.f4263t = String.valueOf(c1292dM3719b.m3706b());
                    c1246k.f4264u = String.valueOf(c1292dM3719b.m3711g());
                    c1246k.f4265v = String.valueOf(c1292dM3719b.m3712h());
                    c1246k.f4266w = String.valueOf(c1292dM3719b.m3707c());
                    c1246k.f4267x = String.valueOf(c1292dM3719b.m3708d());
                }
                c1246k.f4268y = String.valueOf(C1293e.m3713a().m3722e());
                C1322e.m3892a(c1246k);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m3917a(String str, String str2, String str3, String str4, long j, String str5, long j2, long j3, int i, long j4) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004638";
        c1246k.f4247d = str;
        c1246k.f4256m = str2;
        c1246k.f4257n = str3;
        c1246k.f4258o = str4;
        c1246k.f4259p = String.valueOf(j);
        c1246k.f4260q = str5;
        c1246k.f4261r = String.valueOf(j2);
        c1246k.f4262s = String.valueOf(j3);
        c1246k.f4263t = "1".equals(str4) ? String.valueOf(j4) : null;
        c1246k.f4264u = String.valueOf(i);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3918a(String str, String str2, String str3, String str4, C1396f c1396f, boolean z, String str5, String str6, String str7) {
        C1246k c1246k = new C1246k(str3, "");
        c1246k.f4244a = "1004693";
        c1246k.f4245b = str4;
        c1246k.f4247d = str;
        if (c1396f != null) {
            c1246k.f4250g = String.valueOf(c1396f.m5097ao());
            c1246k.f4255l = String.valueOf(c1396f.m5054Z());
            c1246k.f4253j = c1396f.m5087ae();
        }
        c1246k.f4256m = z ? "1" : "2";
        c1246k.f4257n = str5;
        c1246k.f4258o = str6;
        if (c1396f != null) {
            c1246k.f4259p = c1396f.m5121o() != 1 ? "2" : "1";
        }
        c1246k.f4260q = str2;
        c1246k.f4261r = str7;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3919a(String str, String str2, String str3, String str4, String str5) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004688";
        if (!TextUtils.isEmpty(str)) {
            c1246k.f4247d = str;
        }
        c1246k.f4256m = str2;
        c1246k.f4257n = str3;
        c1246k.f4258o = str4;
        c1246k.f4259p = str5;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    private static void m3920a(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6, String str7) {
        m3900a(new Runnable() { // from class: com.anythink.core.common.n.e.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5088a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5089b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f5090c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f5091d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f5092e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f5093f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ boolean f5094g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f5095h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ String f5096i;

            public AnonymousClass2(String str42, String str52, String str8, String str22, String str32, int i2, boolean z3, String str72, String str62) {
                str = str42;
                str = str52;
                str = str8;
                str = str22;
                str = str32;
                i = i2;
                z = z3;
                str = str72;
                str = str62;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1246k c1246k = new C1246k(str, str);
                c1246k.f4244a = "1004680";
                c1246k.f4245b = str;
                c1246k.f4247d = str;
                c1246k.f4256m = str;
                c1246k.f4257n = String.valueOf(i);
                c1246k.f4258o = z ? "1" : "0";
                boolean zIsScreenOn = true;
                try {
                    zIsScreenOn = ((PowerManager) C1175n.m2059a().m2148f().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                }
                c1246k.f4259p = zIsScreenOn ? "1" : "0";
                c1246k.f4260q = C1345i.m4159a(C1175n.m2059a().m2148f()) ? "1" : "0";
                c1246k.f4261r = str;
                c1246k.f4262s = str;
                C1322e.m3892a(c1246k);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m3921a(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, String str8, boolean z, long j) {
        m3900a(new Runnable() { // from class: com.anythink.core.common.n.e.3

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f5097a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f5098b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f5099c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f5100d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ String f5101e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f5102f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ int f5103g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ String f5104h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ String f5105i;

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ boolean f5106j;

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ String f5107k;

            /* JADX INFO: renamed from: l */
            public final /* synthetic */ long f5108l;

            public AnonymousClass3(String str52, String str62, String str22, String str32, String str42, int i3, int i22, String str82, String str72, boolean z3, String str9, long j2) {
                str = str52;
                str = str62;
                str = str22;
                str = str32;
                str = str42;
                i = i3;
                i = i22;
                str = str82;
                str = str72;
                z = z3;
                str = str9;
                j = j2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsScreenOn;
                C1246k c1246k = new C1246k(str, str);
                c1246k.f4244a = "1004687";
                C1391a c1391aM4865b = C1392b.m4845a(C1175n.m2059a().m2148f()).m4865b(C1175n.m2059a().m2165o());
                if (c1391aM4865b == null || !C1322e.m3936c(c1391aM4865b, c1246k)) {
                    c1246k.f4245b = str;
                    c1246k.f4247d = str;
                    c1246k.f4256m = str;
                    c1246k.f4257n = String.valueOf(i);
                    c1246k.f4258o = String.valueOf(i);
                    boolean zM4159a = true;
                    try {
                        zIsScreenOn = ((PowerManager) C1175n.m2059a().m2148f().getSystemService("power")).isScreenOn();
                    } catch (Throwable unused) {
                        zIsScreenOn = true;
                    }
                    boolean zInKeyguardRestrictedInputMode = false;
                    try {
                        KeyguardManager keyguardManager = (KeyguardManager) C1175n.m2059a().m2148f().getSystemService("keyguard");
                        if (keyguardManager != null) {
                            zInKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                        }
                    } catch (Throwable unused2) {
                    }
                    c1246k.f4259p = (zInKeyguardRestrictedInputMode || !zIsScreenOn) ? (zInKeyguardRestrictedInputMode || zIsScreenOn) ? (zInKeyguardRestrictedInputMode && zIsScreenOn) ? "2" : "3" : "1" : "0";
                    try {
                        zM4159a = C1345i.m4159a(C1175n.m2059a().m2148f());
                    } catch (Throwable unused3) {
                    }
                    c1246k.f4260q = zM4159a ? "1" : "0";
                    c1246k.f4261r = str;
                    c1246k.f4262s = str;
                    c1246k.f4263t = z ? "1" : "2";
                    if (TextUtils.isEmpty(C1322e.f5076q)) {
                        try {
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            long blockSize = statFs.getBlockSize();
                            String unused4 = C1322e.f5076q = ((statFs.getAvailableBlocks() * blockSize) / 1048576) + "MB";
                            c1246k.f4264u = C1322e.f5076q;
                        } catch (Throwable unused5) {
                        }
                    } else {
                        c1246k.f4264u = C1322e.f5076q;
                    }
                    c1246k.f4265v = str;
                    c1246k.f4266w = String.valueOf(j);
                    C1322e.m3892a(c1246k);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m3922a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004616";
        c1246k.f4247d = str5;
        c1246k.f4256m = str;
        c1246k.f4257n = str2;
        c1246k.f4258o = str3;
        c1246k.f4259p = str4;
        c1246k.f4260q = str6;
        c1246k.f4261r = str7;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: a */
    public static void m3923a(String str, String str2, boolean z, int i, C1396f c1396f, C1234b c1234b, String str3, String str4, Map<String, Object> map, C1238c c1238c) {
        m3924a(str, str2, z, i, c1396f, c1234b, str3, str4, map, c1238c, 0L);
    }

    /* JADX INFO: renamed from: a */
    public static void m3924a(String str, String str2, boolean z, int i, C1396f c1396f, C1234b c1234b, String str3, String str4, Map<String, Object> map, C1238c c1238c, long j) {
        try {
            m3900a(new Runnable() { // from class: com.anythink.core.common.n.e.1

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1396f f5078b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f5079c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f5080d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f5081e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f5082f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ String f5083g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ String f5084h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f5085i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ Map f5086j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ C1238c f5087k;

                public AnonymousClass1(C1396f c1396f2, String str5, String str22, boolean z3, int i2, String str32, String str42, long j2, Map map2, C1238c c1238c2) {
                    c1396f = c1396f2;
                    str = str5;
                    str = str22;
                    z = z3;
                    i = i2;
                    str = str32;
                    str = str42;
                    j = j2;
                    map = map2;
                    c1238c = c1238c2;
                }

                /* JADX WARN: Removed duplicated region for block: B:122:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x007d  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:145:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x00bd  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x00fd  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:176:0x010c  */
                /* JADX WARN: Removed duplicated region for block: B:179:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x011f  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0126  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0131  */
                /* JADX WARN: Removed duplicated region for block: B:190:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x014d  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 359
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p065n.C1322e.AnonymousClass1.run():void");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m3925a(C1246k c1246k, C1391a c1391a) {
        Map<String, String> mapM4760e;
        if (TextUtils.isEmpty(c1246k.f4244a) || TextUtils.isEmpty(c1246k.f4236B) || TextUtils.isEmpty(c1246k.f4235A) || (mapM4760e = c1391a.m4760e(c1246k.f4244a)) == null) {
            return false;
        }
        if (mapM4760e.containsKey("0")) {
            String str = mapM4760e.get("0");
            if (TextUtils.isEmpty(str) || !str.contains(c1246k.f4235A)) {
                return false;
            }
        } else {
            if (!mapM4760e.containsKey(c1246k.f4236B)) {
                return false;
            }
            String str2 = mapM4760e.get(c1246k.f4236B);
            if (TextUtils.isEmpty(str2) || !str2.contains(c1246k.f4235A)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m3929b(C1246k c1246k) {
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: b */
    public static void m3930b(C1248m c1248m, AbstractC1247l abstractC1247l, int i) {
        if (c1248m == null || abstractC1247l == null) {
            return;
        }
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004698";
        c1246k.f4245b = c1248m.f4323d;
        c1246k.f4247d = c1248m.f4321b;
        c1246k.f4250g = String.valueOf(c1248m.f4328i);
        c1246k.f4255l = String.valueOf(c1248m.f4327h);
        c1246k.f4256m = abstractC1247l.m3229t();
        c1246k.f4257n = abstractC1247l.m3231u();
        c1246k.f4258o = abstractC1247l instanceof C1245j ? ((C1245j) abstractC1247l).m2485ad() : "";
        c1246k.f4259p = String.valueOf(c1248m.f4329j);
        c1246k.f4260q = String.valueOf(c1248m.f4320a);
        c1246k.f4261r = String.valueOf(i);
        c1246k.f4262s = String.valueOf(c1248m.f4330k);
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: b */
    public static void m3931b(String str, String str2, String str3, String str4) {
        C1246k c1246k = new C1246k(null, null);
        c1246k.f4244a = "1004647";
        c1246k.f4248e = str3;
        c1246k.f4256m = str2;
        c1246k.f4257n = str;
        c1246k.f4258o = str4;
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m3932b(C1246k c1246k, C1391a c1391a) {
        Map<String, String> mapM4760e;
        if (TextUtils.isEmpty(c1246k.f4244a) || TextUtils.isEmpty(c1246k.f4236B) || TextUtils.isEmpty(c1246k.f4235A) || (mapM4760e = c1391a.m4760e(c1246k.f4244a)) == null) {
            return false;
        }
        if (mapM4760e.containsKey("0")) {
            String str = mapM4760e.get("0");
            if (TextUtils.isEmpty(str) || !str.contains(c1246k.f4235A)) {
                return false;
            }
        } else {
            if (!mapM4760e.containsKey(c1246k.f4236B)) {
                return false;
            }
            String str2 = mapM4760e.get(c1246k.f4236B);
            if (TextUtils.isEmpty(str2) || !str2.contains(c1246k.f4235A)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m3933b(C1391a c1391a, C1246k c1246k) {
        Map<String, String> mapM4745al = c1391a.m4745al();
        if (mapM4745al != null) {
            if (TextUtils.isEmpty(c1246k.f4235A)) {
                return mapM4745al.containsKey(c1246k.f4244a);
            }
            if (mapM4745al.containsKey(c1246k.f4244a)) {
                String str = mapM4745al.get(c1246k.f4244a);
                if (!TextUtils.isEmpty(str) && str.contains(c1246k.f4235A)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m3934c(C1246k c1246k) {
        C1396f c1396fM5146b = C1398h.m5135a(C1175n.m2059a().m2148f()).m5146b(c1246k.f4247d);
        if (c1396fM5146b != null) {
            c1246k.f4239E = c1396fM5146b.m5067aI();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3935c(String str, String str2, String str3, String str4) {
        C1246k c1246k = new C1246k("", "");
        if (TextUtils.isEmpty(c1246k.f4244a)) {
            c1246k.f4244a = "1004685";
        }
        c1246k.f4246c = C1175n.m2059a().m2165o();
        if (!TextUtils.isEmpty(str)) {
            c1246k.f4256m = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            c1246k.f4257n = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            c1246k.f4258o = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            c1246k.f4259p = str4;
        }
        m3892a(c1246k);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3936c(C1391a c1391a, C1246k c1246k) {
        if (C1175n.m2059a().m2175v()) {
            return true;
        }
        String strM4749ap = c1391a.m4749ap();
        if (!TextUtils.isEmpty(strM4749ap)) {
            String str = c1246k.f4236B;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(strM4749ap);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        if (TextUtils.equals(str, jSONArray.optString(i))) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        Map<String, String> mapM4747an = c1391a.m4747an();
        if (mapM4747an == null) {
            return false;
        }
        if (TextUtils.isEmpty(c1246k.f4235A)) {
            return mapM4747an.containsKey(c1246k.f4244a);
        }
        if (mapM4747an.containsKey(c1246k.f4244a)) {
            String str2 = mapM4747an.get(c1246k.f4244a);
            if (!TextUtils.isEmpty(str2) && str2.contains(c1246k.f4235A)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m3937d(C1391a c1391a, C1246k c1246k) {
        Map<String, String> mapM4745al = c1391a.m4745al();
        if (mapM4745al != null) {
            if (TextUtils.isEmpty(c1246k.f4235A)) {
                return mapM4745al.containsKey(c1246k.f4244a);
            }
            if (mapM4745al.containsKey(c1246k.f4244a)) {
                String str = mapM4745al.get(c1246k.f4244a);
                if (!TextUtils.isEmpty(str) && str.contains(c1246k.f4235A)) {
                    return true;
                }
            }
        }
        return false;
    }
}
