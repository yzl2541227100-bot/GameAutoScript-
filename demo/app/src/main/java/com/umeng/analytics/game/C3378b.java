package com.umeng.analytics.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3375b;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.game.C3377a;
import com.umeng.analytics.pro.InterfaceC3396r;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.umeng.analytics.game.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3378b implements InterfaceC3396r {

    /* JADX INFO: renamed from: a */
    public static boolean f18319a = true;

    /* JADX INFO: renamed from: A */
    private Context f18320A;

    /* JADX INFO: renamed from: b */
    private C3375b f18321b = MobclickAgent.getAgent();

    /* JADX INFO: renamed from: c */
    private C3377a f18322c = null;

    /* JADX INFO: renamed from: d */
    private final int f18323d = 100;

    /* JADX INFO: renamed from: e */
    private final int f18324e = 1;

    /* JADX INFO: renamed from: f */
    private final int f18325f = 0;

    /* JADX INFO: renamed from: g */
    private final int f18326g = -1;

    /* JADX INFO: renamed from: h */
    private final int f18327h = 1;

    /* JADX INFO: renamed from: i */
    private final String f18328i = "level";

    /* JADX INFO: renamed from: j */
    private final String f18329j = "pay";

    /* JADX INFO: renamed from: k */
    private final String f18330k = "buy";

    /* JADX INFO: renamed from: l */
    private final String f18331l = "use";

    /* JADX INFO: renamed from: m */
    private final String f18332m = "bonus";

    /* JADX INFO: renamed from: n */
    private final String f18333n = "item";

    /* JADX INFO: renamed from: o */
    private final String f18334o = "cash";

    /* JADX INFO: renamed from: p */
    private final String f18335p = "coin";

    /* JADX INFO: renamed from: q */
    private final String f18336q = "source";

    /* JADX INFO: renamed from: r */
    private final String f18337r = "amount";

    /* JADX INFO: renamed from: s */
    private final String f18338s = "user_level";

    /* JADX INFO: renamed from: t */
    private final String f18339t = "bonus_source";

    /* JADX INFO: renamed from: u */
    private final String f18340u = "level";

    /* JADX INFO: renamed from: v */
    private final String f18341v = "status";

    /* JADX INFO: renamed from: w */
    private final String f18342w = "duration";

    /* JADX INFO: renamed from: x */
    private final String f18343x = "curtype";

    /* JADX INFO: renamed from: y */
    private final String f18344y = "orderid";

    /* JADX INFO: renamed from: z */
    private final String f18345z = "UMGameAgent.init(Context) should be called before any game api";

    public C3378b() {
        f18319a = true;
    }

    /* JADX INFO: renamed from: a */
    private void m15451a(String str, int i) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        C3377a.a aVarM15442b = this.f18322c.m15442b(str);
        if (aVarM15442b == null) {
            MLog.m16287w(String.format("finishLevel(or failLevel) called before startLevel", new Object[0]));
            return;
        }
        long jM15449e = aVarM15442b.m15449e();
        if (jM15449e <= 0) {
            MLog.m16263d("level duration is 0");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("level", str);
        map.put("status", Integer.valueOf(i));
        map.put("duration", Long.valueOf(jM15449e));
        String str2 = this.f18322c.f18308b;
        if (str2 != null) {
            map.put("user_level", str2);
        }
        this.f18321b.m15405a(this.f18320A, "level", map);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3396r
    /* JADX INFO: renamed from: a */
    public void mo15452a() {
        String str;
        MLog.m16263d("App resume from background");
        Context context = this.f18320A;
        if (context == null) {
            str = "UMGameAgent.init(Context) should be called before any game api";
        } else {
            if (AnalyticsConfig.getVerticalType(context) != MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() && AnalyticsConfig.getVerticalType(this.f18320A) != MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
                if (f18319a) {
                    this.f18322c.m15443b();
                    return;
                }
                return;
            }
            str = "UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ";
        }
        MLog.m16269e(str);
    }

    /* JADX INFO: renamed from: a */
    public void m15453a(double d, double d2, int i) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("cash", Long.valueOf((long) (d * 100.0d)));
        map.put("coin", Long.valueOf((long) (d2 * 100.0d)));
        map.put("source", Integer.valueOf(i));
        String str = this.f18322c.f18308b;
        if (str != null) {
            map.put("user_level", str);
        }
        String str2 = this.f18322c.f18307a;
        if (str2 != null) {
            map.put("level", str2);
        }
        this.f18321b.m15405a(this.f18320A, "pay", map);
    }

    /* JADX INFO: renamed from: a */
    public void m15454a(double d, int i) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("coin", Long.valueOf((long) (d * 100.0d)));
        map.put("bonus_source", Integer.valueOf(i));
        String str = this.f18322c.f18308b;
        if (str != null) {
            map.put("user_level", str);
        }
        String str2 = this.f18322c.f18307a;
        if (str2 != null) {
            map.put("level", str2);
        }
        this.f18321b.m15405a(this.f18320A, "bonus", map);
    }

    /* JADX INFO: renamed from: a */
    public void m15455a(double d, String str, double d2, int i, String str2) {
        String str3;
        Context context = this.f18320A;
        if (context == null) {
            str3 = "UMGameAgent.init(Context) should be called before any game api";
        } else {
            if (AnalyticsConfig.getVerticalType(context) != MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() && AnalyticsConfig.getVerticalType(this.f18320A) != MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
                if (d < 0.0d || d2 < 0.0d) {
                    return;
                }
                HashMap<String, Object> map = new HashMap<>();
                if (!TextUtils.isEmpty(str) && str.length() > 0 && str.length() <= 3) {
                    map.put("curtype", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        int length = str2.getBytes("UTF-8").length;
                        if (length > 0 && length <= 1024) {
                            map.put("orderid", str2);
                        }
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
                map.put("cash", Long.valueOf((long) (d * 100.0d)));
                map.put("coin", Long.valueOf((long) (d2 * 100.0d)));
                map.put("source", Integer.valueOf(i));
                String str4 = this.f18322c.f18308b;
                if (str4 != null) {
                    map.put("user_level", str4);
                }
                String str5 = this.f18322c.f18307a;
                if (str5 != null) {
                    map.put("level", str5);
                }
                this.f18321b.m15405a(this.f18320A, "pay", map);
                return;
            }
            str3 = "UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ";
        }
        MLog.m16269e(str3);
    }

    /* JADX INFO: renamed from: a */
    public void m15456a(double d, String str, int i, double d2, int i2) {
        if (AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
        } else {
            m15453a(d, d2 * ((double) i), i2);
            m15459a(str, i, d2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15457a(Context context) {
        if (context == null) {
            MLog.m16269e("Context is null, can't init GameAgent");
            return;
        }
        this.f18320A = context.getApplicationContext();
        this.f18321b.m15410a((InterfaceC3396r) this);
        this.f18322c = new C3377a(this.f18320A);
    }

    /* JADX INFO: renamed from: a */
    public void m15458a(String str) {
        try {
            Context context = this.f18320A;
            if (context == null) {
                MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
                return;
            }
            this.f18322c.f18308b = str;
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("userlevel", str).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15459a(String str, int i, double d) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("item", str);
        map.put("amount", Integer.valueOf(i));
        map.put("coin", Long.valueOf((long) (((double) i) * d * 100.0d)));
        String str2 = this.f18322c.f18308b;
        if (str2 != null) {
            map.put("user_level", str2);
        }
        String str3 = this.f18322c.f18307a;
        if (str3 != null) {
            map.put("level", str3);
        }
        this.f18321b.m15405a(this.f18320A, "buy", map);
    }

    /* JADX INFO: renamed from: a */
    public void m15460a(String str, int i, double d, int i2) {
        if (AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
        } else {
            m15454a(((double) i) * d, i2);
            m15459a(str, i, d);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15461a(boolean z) {
        MLog.m16263d(String.format("Trace sleep time : %b", Boolean.valueOf(z)));
        f18319a = z;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3396r
    /* JADX INFO: renamed from: b */
    public void mo15462b() {
        String str;
        Context context = this.f18320A;
        if (context == null) {
            str = "UMGameAgent.init(Context) should be called before any game api";
        } else {
            if (AnalyticsConfig.getVerticalType(context) != MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() && AnalyticsConfig.getVerticalType(this.f18320A) != MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
                if (f18319a) {
                    this.f18322c.m15441a();
                    return;
                }
                return;
            }
            str = "UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ";
        }
        MLog.m16269e(str);
    }

    /* JADX INFO: renamed from: b */
    public void m15463b(String str) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        C3377a c3377a = this.f18322c;
        c3377a.f18307a = str;
        c3377a.m15440a(str);
        HashMap<String, Object> map = new HashMap<>();
        map.put("level", str);
        map.put("status", 0);
        String str2 = this.f18322c.f18308b;
        if (str2 != null) {
            map.put("user_level", str2);
        }
        this.f18321b.m15405a(this.f18320A, "level", map);
    }

    /* JADX INFO: renamed from: b */
    public void m15464b(String str, int i, double d) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("item", str);
        map.put("amount", Integer.valueOf(i));
        map.put("coin", Long.valueOf((long) (((double) i) * d * 100.0d)));
        String str2 = this.f18322c.f18308b;
        if (str2 != null) {
            map.put("user_level", str2);
        }
        String str3 = this.f18322c.f18307a;
        if (str3 != null) {
            map.put("level", str3);
        }
        this.f18321b.m15405a(this.f18320A, "use", map);
    }

    /* JADX INFO: renamed from: c */
    public void m15465c(String str) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
        } else if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
        } else {
            m15451a(str, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15466d(String str) {
        Context context = this.f18320A;
        if (context == null) {
            MLog.m16269e("UMGameAgent.init(Context) should be called before any game api");
        } else if (AnalyticsConfig.getVerticalType(context) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.f18320A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.m16269e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
        } else {
            m15451a(str, -1);
        }
    }
}
