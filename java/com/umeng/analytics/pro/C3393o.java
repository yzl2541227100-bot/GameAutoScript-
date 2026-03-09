package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.haorui.sdk.core.HRConfig;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3375b;
import com.umeng.analytics.pro.C3381c;
import com.umeng.analytics.pro.C3385g;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.o */
/* JADX INFO: loaded from: classes2.dex */
public class C3393o {

    /* JADX INFO: renamed from: a */
    private static final String f18576a = "session_start_time";

    /* JADX INFO: renamed from: b */
    private static final String f18577b = "session_end_time";

    /* JADX INFO: renamed from: c */
    private static final String f18578c = "session_id";

    /* JADX INFO: renamed from: f */
    private static String f18579f;

    /* JADX INFO: renamed from: g */
    private static Context f18580g;

    /* JADX INFO: renamed from: d */
    private final String f18581d;

    /* JADX INFO: renamed from: e */
    private final String f18582e;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3393o f18583a = new C3393o();

        private a() {
        }
    }

    private C3393o() {
        this.f18581d = "a_start_time";
        this.f18582e = "a_end_time";
    }

    public /* synthetic */ C3393o(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C3393o m15600a() {
        return a.f18583a;
    }

    /* JADX INFO: renamed from: a */
    private String m15601a(Context context, SharedPreferences sharedPreferences, long j) {
        if (f18580g == null && context != null) {
            f18580g = context.getApplicationContext();
        }
        String strM15608b = m15608b(f18580g);
        try {
            m15604d(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            C3385g.m15485a(f18580g).m15502a(strM15608b, jSONObject, C3385g.a.BEGIN);
            m15606a(f18580g);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("session_id", strM15608b);
            editorEdit.putLong(f18576a, j);
            editorEdit.putLong(f18577b, 0L);
            editorEdit.putLong("a_start_time", j);
            editorEdit.putLong("a_end_time", 0L);
            editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
            editorEdit.putString(C3380b.f18385al, UMUtils.getAppVersionName(context));
            editorEdit.commit();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectM15433i = C3375b.m15394a().m15433i();
            if (jSONObjectM15433i.length() > 0) {
                jSONObject2.put(C3380b.f18375ab, jSONObjectM15433i);
            }
            jSONObject2.put(C3380b.f18377ad, strM15608b);
            jSONObject2.put("__ii", strM15608b);
            jSONObject2.put(C3380b.f18378ae, j);
            C3387i.m15520a(f18580g).m15556c((Object) jSONObject2);
        } catch (Throwable unused) {
        }
        return strM15608b;
    }

    /* JADX INFO: renamed from: a */
    private void m15602a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove(f18576a);
        editorEdit.remove(f18577b);
        editorEdit.remove("a_start_time");
        editorEdit.remove("a_end_time");
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    private boolean m15603a(SharedPreferences sharedPreferences, long j) {
        long j2 = sharedPreferences.getLong("a_start_time", 0L);
        long j3 = sharedPreferences.getLong("a_end_time", 0L);
        if (j2 != 0 && j - j2 < AnalyticsConfig.kContinueSessionMillis) {
            MLog.m16269e("onResume called before onPause");
            return false;
        }
        if (j - j3 <= AnalyticsConfig.kContinueSessionMillis) {
            return false;
        }
        try {
            String string = sharedPreferences.getString("session_id", HRConfig.GENDER_UNKNOWN);
            long jCurrentTimeMillis = sharedPreferences.getLong(f18577b, 0L);
            if (HRConfig.GENDER_UNKNOWN.equals(string)) {
                return true;
            }
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3381c.e.a.f18462g, jCurrentTimeMillis);
            C3385g.m15485a(f18580g).m15502a(string, jSONObject, C3385g.a.END);
            if (!AnalyticsConfig.FLAG_DPLUS) {
                return true;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectM15433i = C3375b.m15394a().m15433i();
            if (jSONObjectM15433i.length() > 0) {
                jSONObject2.put(C3380b.f18375ab, jSONObjectM15433i);
            }
            jSONObject2.put(C3380b.f18379af, string);
            jSONObject2.put("__ii", string);
            jSONObject2.put(C3380b.f18380ag, jCurrentTimeMillis);
            C3387i.m15520a(f18580g).m15547a(jSONObject2, 3, false);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m15604d(Context context) {
        C3387i.m15520a(context).m15553b(context);
        C3387i.m15520a(context).m15544a();
    }

    /* JADX INFO: renamed from: a */
    public void m15605a(Context context, Object obj) {
        try {
            if (f18580g == null && context != null) {
                f18580g = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18580g);
            if (sharedPreferences == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            String string = sharedPreferences.getString(C3380b.f18385al, "");
            String appVersionName = UMUtils.getAppVersionName(f18580g);
            if (TextUtils.isEmpty(string) || string.equals(appVersionName)) {
                if (m15603a(sharedPreferences, jLongValue)) {
                    f18579f = m15601a(context, sharedPreferences, jLongValue);
                    MLog.m16275i("Start new session: " + f18579f);
                    return;
                }
                f18579f = sharedPreferences.getString("session_id", null);
                editorEdit.putLong("a_start_time", jLongValue);
                editorEdit.putLong("a_end_time", 0L);
                editorEdit.commit();
                MLog.m16275i("Extend current session: " + f18579f);
                m15604d(context);
                C3387i.m15520a(f18580g).m15549a(false);
                C3387i.m15520a(f18580g).m15557d();
                return;
            }
            int i = sharedPreferences.getInt("versioncode", 0);
            String string2 = sharedPreferences.getString("pre_date", "");
            String string3 = sharedPreferences.getString("pre_version", "");
            String string4 = sharedPreferences.getString(C3380b.f18385al, "");
            editorEdit.putString("vers_date", string2);
            editorEdit.putString("vers_pre_version", string3);
            editorEdit.putString("cur_version", string4);
            editorEdit.putString("dp_vers_date", string2);
            editorEdit.putString("dp_vers_pre_version", string3);
            editorEdit.putString("dp_cur_version", string4);
            editorEdit.putInt("vers_code", i);
            editorEdit.putString("vers_name", string);
            editorEdit.putInt("dp_vers_code", i);
            editorEdit.putString("dp_vers_name", string);
            editorEdit.putLong("a_end_time", 0L);
            editorEdit.commit();
            if (m15613c(context) == null) {
                f18579f = m15601a(context, sharedPreferences, jLongValue);
            }
            m15607a(f18580g, jLongValue);
            m15609b(f18580g, jLongValue);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m15606a(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        String string = sharedPreferences.getString("session_id", null);
        if (string == null) {
            return false;
        }
        long j = sharedPreferences.getLong(f18576a, 0L);
        long j2 = sharedPreferences.getLong(f18577b, 0L);
        if (j2 != 0) {
            int i = (Math.abs(j2 - j) > 86400000L ? 1 : (Math.abs(j2 - j) == 86400000L ? 0 : -1));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", string);
            jSONObject.put("__e", j);
            jSONObject.put(C3381c.e.a.f18462g, j2);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", location[0]);
                jSONObject2.put("lng", location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(C3381c.e.a.f18460e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i2 = context.getApplicationInfo().uid;
            if (i2 == -1) {
                return false;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i2))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i2))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C3380b.f18349C, jLongValue);
                jSONObject3.put(C3380b.f18348B, jLongValue2);
                jSONObject.put(C3381c.e.a.f18459d, jSONObject3);
            }
            C3385g.m15485a(context).m15502a(string, jSONObject, C3385g.a.NEWSESSION);
            C3394p.m15616a(f18580g);
            C3386h.m15515b(f18580g);
            try {
                m15602a(sharedPreferences);
                return true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15607a(Context context, long j) {
        String string;
        boolean z = true;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (string = sharedPreferences.getString("session_id", null)) == null) {
                return false;
            }
            long j2 = sharedPreferences.getLong("a_start_time", 0L);
            long j3 = sharedPreferences.getLong("a_end_time", 0L);
            if (j2 <= 0 || j3 != 0) {
                z = false;
            } else {
                try {
                    m15610b(f18580g, Long.valueOf(j));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(C3381c.e.a.f18462g, j);
                        C3385g.m15485a(context).m15502a(string, jSONObject, C3385g.a.END);
                        C3387i.m15520a(f18580g).m15552b();
                        if (AnalyticsConfig.FLAG_DPLUS) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObjectM15422c = C3375b.m15394a().m15422c();
                            if (jSONObjectM15422c == null || jSONObjectM15422c.length() < 1) {
                                jSONObjectM15422c = C3375b.m15394a().m15433i();
                            }
                            if (jSONObjectM15422c.length() > 0) {
                                jSONObject2.put(C3380b.f18375ab, jSONObjectM15422c);
                            }
                            jSONObject2.put(C3380b.f18379af, string);
                            jSONObject2.put("__ii", string);
                            jSONObject2.put(C3380b.f18380ag, j);
                            C3387i.m15520a(f18580g).m15547a(jSONObject2, 3, true);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    return z;
                }
            }
            m15606a(context);
            return z;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m15608b(Context context) {
        String deviceId = DeviceConfig.getDeviceId(context);
        String appkey = UMUtils.getAppkey(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (appkey == null) {
            throw new RuntimeException("Appkey is null or empty, Please check!");
        }
        String strMD5 = UMUtils.MD5(jCurrentTimeMillis + appkey + deviceId);
        f18579f = strMD5;
        return strMD5;
    }

    /* JADX INFO: renamed from: b */
    public void m15609b(Context context, long j) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
        if (sharedPreferences == null) {
            return;
        }
        f18579f = m15608b(context);
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("session_id", f18579f);
            editorEdit.putLong(f18576a, j);
            editorEdit.putLong(f18577b, 0L);
            editorEdit.putLong("a_start_time", j);
            editorEdit.putLong("a_end_time", 0L);
            editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(f18580g)));
            editorEdit.putString(C3380b.f18385al, UMUtils.getAppVersionName(f18580g));
            editorEdit.commit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            C3385g.m15485a(f18580g).m15502a(f18579f, jSONObject, C3385g.a.BEGIN);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectM15433i = C3375b.m15394a().m15433i();
            if (jSONObjectM15433i.length() > 0) {
                jSONObject2.put(C3380b.f18375ab, jSONObjectM15433i);
            }
            jSONObject2.put(C3380b.f18377ad, f18579f);
            jSONObject2.put("__ii", f18579f);
            jSONObject2.put(C3380b.f18378ae, j);
            C3387i.m15520a(f18580g).m15554b((Object) jSONObject2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15610b(Context context, Object obj) {
        try {
            if (f18580g == null && context != null) {
                f18580g = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong("a_start_time", 0L) == 0 && AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                MLog.m16269e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("a_end_time", jLongValue);
            editorEdit.putLong(f18577b, jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m15611b() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f18580g);
        if (sharedPreferences == null) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("a_start_time", 0L);
        return (j == 0 || jCurrentTimeMillis - j >= AnalyticsConfig.kContinueSessionMillis) && jCurrentTimeMillis - sharedPreferences.getLong("a_end_time", 0L) > AnalyticsConfig.kContinueSessionMillis;
    }

    /* JADX INFO: renamed from: c */
    public String m15612c() {
        return f18579f;
    }

    /* JADX INFO: renamed from: c */
    public String m15613c(Context context) {
        try {
            if (f18579f == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f18579f;
    }

    /* JADX INFO: renamed from: d */
    public String m15614d() {
        return m15613c(f18580g);
    }
}
