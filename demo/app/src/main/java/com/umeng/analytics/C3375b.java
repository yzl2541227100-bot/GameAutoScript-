package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3380b;
import com.umeng.analytics.pro.C3385g;
import com.umeng.analytics.pro.C3386h;
import com.umeng.analytics.pro.C3387i;
import com.umeng.analytics.pro.C3388j;
import com.umeng.analytics.pro.C3391m;
import com.umeng.analytics.pro.C3393o;
import com.umeng.analytics.pro.C3394p;
import com.umeng.analytics.pro.InterfaceC3392n;
import com.umeng.analytics.pro.InterfaceC3396r;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3375b implements InterfaceC3392n {

    /* JADX INFO: renamed from: g */
    private static final String f18288g = "sp";

    /* JADX INFO: renamed from: a */
    private Context f18289a;

    /* JADX INFO: renamed from: b */
    private InterfaceC3396r f18290b;

    /* JADX INFO: renamed from: c */
    private C3388j f18291c;

    /* JADX INFO: renamed from: d */
    private C3394p f18292d;

    /* JADX INFO: renamed from: e */
    private C3393o f18293e;

    /* JADX INFO: renamed from: f */
    private C3386h f18294f;

    /* JADX INFO: renamed from: h */
    private boolean f18295h;

    /* JADX INFO: renamed from: i */
    private volatile JSONObject f18296i;

    /* JADX INFO: renamed from: j */
    private volatile JSONObject f18297j;

    /* JADX INFO: renamed from: k */
    private boolean f18298k;

    /* JADX INFO: renamed from: com.umeng.analytics.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3375b f18299a = new C3375b();

        private a() {
        }
    }

    private C3375b() {
        this.f18289a = null;
        this.f18291c = new C3388j();
        this.f18292d = new C3394p();
        this.f18293e = C3393o.m15600a();
        this.f18294f = null;
        this.f18295h = false;
        this.f18296i = null;
        this.f18297j = null;
        this.f18298k = false;
        this.f18291c.m15570a(this);
    }

    public /* synthetic */ C3375b(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C3375b m15394a() {
        return a.f18299a;
    }

    /* JADX INFO: renamed from: a */
    private void m15395a(String str, Object obj) {
        JSONArray jSONArray;
        try {
            if (this.f18296i == null) {
                this.f18296i = new JSONObject();
            }
            new JSONObject();
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    jSONArray = new JSONArray();
                    while (i < strArr.length) {
                        jSONArray.put(strArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    jSONArray = new JSONArray();
                    while (i < jArr.length) {
                        jSONArray.put(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    jSONArray = new JSONArray();
                    while (i < iArr.length) {
                        jSONArray.put(iArr[i]);
                        i++;
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    jSONArray = new JSONArray();
                    while (i < fArr.length) {
                        jSONArray.put(fArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    jSONArray = new JSONArray();
                    while (i < dArr.length) {
                        jSONArray.put(dArr[i]);
                        i++;
                    }
                } else {
                    if (!(obj instanceof short[])) {
                        return;
                    }
                    short[] sArr = (short[]) obj;
                    jSONArray = new JSONArray();
                    while (i < sArr.length) {
                        jSONArray.put((int) sArr[i]);
                        i++;
                    }
                }
            } else {
                if (!(obj instanceof List)) {
                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                        this.f18296i.put(str, obj);
                        return;
                    }
                    return;
                }
                List list = (List) obj;
                jSONArray = new JSONArray();
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray.put(list.get(i));
                    }
                    i++;
                }
            }
            this.f18296i.put(str, jSONArray);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    private JSONObject m15396f(Context context) {
        if (context == null) {
            MLog.m16269e("unexpected null context in getNativeSuperProperties");
            return null;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        String string = PreferenceWrapper.getDefault(context).getString(f18288g, null);
        if (!TextUtils.isEmpty(string)) {
            return new JSONObject(string);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m15397a(double d, double d2) {
        if (AnalyticsConfig.f18271a == null) {
            AnalyticsConfig.f18271a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f18271a;
        dArr[0] = d;
        dArr[1] = d2;
    }

    /* JADX INFO: renamed from: a */
    public void m15398a(long j) {
        AnalyticsConfig.kContinueSessionMillis = j;
    }

    /* JADX INFO: renamed from: a */
    public void m15399a(Context context) {
        if (context == null) {
            MLog.m16269e("unexpected null context in onResume");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        try {
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                this.f18292d.m15618a(context.getClass().getName());
            }
            m15428e();
        } catch (Throwable th) {
            MLog.m16271e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15400a(Context context, int i) {
        if (context == null) {
            MLog.m16269e("unexpected null context in setVerticalType");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        AnalyticsConfig.m15390a(this.f18289a, i);
    }

    /* JADX INFO: renamed from: a */
    public void m15401a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m16269e("unexpected null context in setScenarioType");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        if (eScenarioType != null) {
            int value = eScenarioType.toValue();
            if (value == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || value == MobclickAgent.EScenarioType.E_DUM_GAME.toValue()) {
                AnalyticsConfig.FLAG_DPLUS = true;
            } else {
                AnalyticsConfig.FLAG_DPLUS = false;
            }
            m15400a(this.f18289a, value);
        }
        if (this.f18295h && this.f18298k) {
            return;
        }
        m15417b();
    }

    /* JADX INFO: renamed from: a */
    public void m15402a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (context == null) {
            MLog.m16269e("unexpected null context in reportError");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        try {
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(C3380b.f18358L, 2);
            jSONObject.put(C3380b.f18359M, str);
            jSONObject.put("__ii", this.f18293e.m15614d());
            Context context2 = this.f18289a;
            UMWorkDispatch.sendEvent(context2, C3387i.a.f18543j, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m16273e(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15403a(Context context, String str, Object obj) {
        try {
            if (context == null) {
                MLog.m16269e("unexpected null context in registerSuperProperty");
                return;
            }
            if (this.f18289a == null) {
                this.f18289a = context;
            }
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            if (!TextUtils.isEmpty(str) && obj != null) {
                String strSubStr = HelperUtils.subStr(str, 128);
                if (Arrays.asList(C3380b.f18390aq).contains(strSubStr)) {
                    MLog.m16269e("SuperProperty  key is invalid.  ");
                    return;
                }
                if (obj instanceof String) {
                    obj = HelperUtils.subStr(obj.toString(), 256);
                }
                m15395a(strSubStr, obj);
                Context context2 = this.f18289a;
                UMWorkDispatch.sendEvent(context2, C3387i.a.f18546m, CoreProtocol.getInstance(context2), this.f18296i.toString());
                return;
            }
            MLog.m16269e("please check key or value, must not NULL!");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15404a(Context context, String str, String str2, long j, int i) {
        if (context != null) {
            try {
                this.f18289a = context;
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m16273e(th);
                    return;
                }
                return;
            }
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        C3391m.m15584a(this.f18289a).m15595a(str, str2, j, i);
    }

    /* JADX INFO: renamed from: a */
    public void m15405a(Context context, String str, HashMap<String, Object> map) {
        if (context != null) {
            try {
                if (this.f18289a == null) {
                    this.f18289a = context;
                }
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m16273e(th);
                    return;
                }
                return;
            }
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        C3391m.m15584a(this.f18289a).m15596a(str, map);
    }

    /* JADX INFO: renamed from: a */
    public void m15406a(Context context, String str, Map<String, Object> map) {
        if (context != null) {
            try {
                if (this.f18289a == null) {
                    this.f18289a = context;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        if (TextUtils.isEmpty(str)) {
            MLog.m16269e("the eventName is empty! please check~");
            return;
        }
        String string = "";
        if (this.f18296i == null) {
            this.f18296i = new JSONObject();
        } else {
            string = this.f18296i.toString();
        }
        String str2 = string;
        Context context2 = this.f18289a;
        UMWorkDispatch.sendEvent(context2, 8194, CoreProtocol.getInstance(context2), new C3387i.d(str, map, str2, System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public void m15407a(Context context, String str, Map<String, Object> map, long j) {
        if (context != null) {
            try {
                this.f18289a = context;
            } catch (Throwable th) {
                if (MLog.DEBUG) {
                    MLog.m16273e(th);
                    return;
                }
                return;
            }
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        C3391m.m15584a(this.f18289a).m15597a(str, map, j);
    }

    /* JADX INFO: renamed from: a */
    public void m15408a(Context context, Throwable th) {
        if (context == null || th == null) {
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        try {
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            m15402a(this.f18289a, DataHelper.convertExceptionToString(th));
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m16273e(e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15409a(Context context, List<String> list) {
        try {
            if (context == null) {
                MLog.m16269e("unexpected null context in setFirstLaunchEvent");
                return;
            }
            if (this.f18289a == null) {
                this.f18289a = context;
            }
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            C3391m.m15584a(this.f18289a).m15598a(list);
        } catch (Throwable th) {
            MLog.m16273e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15410a(InterfaceC3396r interfaceC3396r) {
        this.f18290b = interfaceC3396r;
    }

    /* JADX INFO: renamed from: a */
    public void m15411a(Object obj) {
        if (obj != null) {
            try {
                String str = (String) obj;
                SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(this.f18289a).edit();
                if (editorEdit == null || TextUtils.isEmpty(str)) {
                    return;
                }
                editorEdit.putString(f18288g, this.f18296i.toString()).commit();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15412a(String str) {
        if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            return;
        }
        try {
            this.f18292d.m15618a(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15413a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3380b.f18354H, str);
            jSONObject.put("uid", str2);
            Context context = this.f18289a;
            UMWorkDispatch.sendEvent(context, C3387i.a.f18538e, CoreProtocol.getInstance(context), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m16271e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3392n
    /* JADX INFO: renamed from: a */
    public void mo15414a(Throwable th) {
        try {
            this.f18292d.m15617a();
            Context context = this.f18289a;
            if (context != null) {
                this.f18294f.m15519a(context);
                this.f18293e.m15610b(this.f18289a, Long.valueOf(System.currentTimeMillis()));
                C3387i.m15520a(this.f18289a).m15544a();
                C3394p.m15616a(this.f18289a);
                C3386h.m15515b(this.f18289a);
                PreferenceWrapper.getDefault(this.f18289a).edit().commit();
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(C3380b.f18358L, 1);
                    jSONObject.put(C3380b.f18359M, DataHelper.convertExceptionToString(th));
                    C3385g.m15485a(this.f18289a).m15501a(this.f18293e.m15614d(), jSONObject.toString(), 1);
                }
            }
            UMWorkDispatch.Quit();
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m16271e("Exception in onAppCrash", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15415a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15416a(boolean z) {
        AnalyticsConfig.CATCH_EXCEPTION = z;
    }

    /* JADX INFO: renamed from: b */
    public void m15417b() {
        try {
            Context context = this.f18289a;
            if (context == null) {
                return;
            }
            if (!this.f18295h) {
                this.f18295h = true;
                this.f18296i = m15396f(context);
                if (this.f18296i == null) {
                    this.f18296i = new JSONObject();
                }
                this.f18297j = new JSONObject(this.f18296i.toString());
            }
            if (Build.VERSION.SDK_INT > 13) {
                synchronized (this) {
                    if (!this.f18298k && (this.f18289a instanceof Activity)) {
                        this.f18294f = new C3386h((Activity) this.f18289a);
                        this.f18298k = true;
                    }
                }
            } else {
                this.f18298k = true;
            }
            this.f18289a = this.f18289a.getApplicationContext();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15418b(Context context) {
        if (context == null) {
            MLog.m16269e("unexpected null context in onPause");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        try {
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
                this.f18292d.m15619b(context.getClass().getName());
            }
            m15430f();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m16271e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15419b(Context context, String str) {
        if (context == null) {
            MLog.m16269e("unexpected null context in setSecret");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        AnalyticsConfig.m15391a(this.f18289a, str);
    }

    /* JADX INFO: renamed from: b */
    public void m15420b(String str) {
        if (AnalyticsConfig.ACTIVITY_DURATION_OPEN) {
            return;
        }
        try {
            this.f18292d.m15619b(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15421b(boolean z) {
        AnalyticsConfig.ACTIVITY_DURATION_OPEN = z;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m15422c() {
        return this.f18297j;
    }

    /* JADX INFO: renamed from: c */
    public void m15423c(Context context) {
        try {
            if (this.f18289a == null && context != null) {
                this.f18289a = context;
            }
            this.f18292d.m15617a();
            this.f18294f.m15519a(this.f18289a);
            this.f18293e.m15610b(this.f18289a, Long.valueOf(System.currentTimeMillis()));
            C3387i.m15520a(this.f18289a).m15544a();
            C3394p.m15616a(this.f18289a);
            C3386h.m15515b(this.f18289a);
            PreferenceWrapper.getDefault(this.f18289a).edit().commit();
            UMWorkDispatch.Quit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15424c(Context context, String str) {
        try {
            if (context == null) {
                MLog.m16269e("unexpected null context in unregisterSuperProperty");
                return;
            }
            if (this.f18289a == null) {
                this.f18289a = context;
            }
            if (!this.f18295h || !this.f18298k) {
                m15417b();
            }
            String strSubStr = HelperUtils.subStr(str, 128);
            if (this.f18296i == null) {
                this.f18296i = new JSONObject();
            }
            if (this.f18296i.has(strSubStr)) {
                this.f18296i.remove(strSubStr);
                Context context2 = this.f18289a;
                UMWorkDispatch.sendEvent(context2, C3387i.a.f18548o, CoreProtocol.getInstance(context2), strSubStr);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m15425d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            MLog.m16269e("unexpected null context in getSuperProperty");
            return null;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        if (this.f18296i != null) {
            String strSubStr = HelperUtils.subStr(str, 128);
            if (this.f18296i.has(strSubStr)) {
                return this.f18296i.opt(strSubStr);
            }
        } else {
            this.f18296i = new JSONObject();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m15426d(Context context) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            MLog.m16269e("unexpected null context in getSuperProperties");
            return null;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        if (this.f18296i != null) {
            return this.f18296i.toString();
        }
        this.f18296i = new JSONObject();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m15427d() {
        this.f18297j = null;
    }

    /* JADX INFO: renamed from: e */
    public void m15428e() {
        Context context = this.f18289a;
        UMWorkDispatch.sendEvent(context, C3387i.a.f18540g, CoreProtocol.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        InterfaceC3396r interfaceC3396r = this.f18290b;
        if (interfaceC3396r != null) {
            interfaceC3396r.mo15452a();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15429e(Context context) {
        if (context == null) {
            MLog.m16269e("unexpected null context in clearSuperProperties");
            return;
        }
        if (this.f18289a == null) {
            this.f18289a = context;
        }
        if (!this.f18295h || !this.f18298k) {
            m15417b();
        }
        this.f18296i = new JSONObject();
        Context context2 = this.f18289a;
        UMWorkDispatch.sendEvent(context2, C3387i.a.f18547n, CoreProtocol.getInstance(context2), null);
    }

    /* JADX INFO: renamed from: f */
    public void m15430f() {
        try {
            Context context = this.f18289a;
            UMWorkDispatch.sendEvent(context, C3387i.a.f18541h, CoreProtocol.getInstance(context), Long.valueOf(System.currentTimeMillis()));
            Context context2 = this.f18289a;
            UMWorkDispatch.sendEvent(context2, C3387i.a.f18537d, CoreProtocol.getInstance(context2), null);
            Context context3 = this.f18289a;
            UMWorkDispatch.sendEvent(context3, 4099, CoreProtocol.getInstance(context3), null);
            Context context4 = this.f18289a;
            UMWorkDispatch.sendEvent(context4, C3387i.a.f18542i, CoreProtocol.getInstance(context4), null);
        } catch (Throwable unused) {
        }
        InterfaceC3396r interfaceC3396r = this.f18290b;
        if (interfaceC3396r != null) {
            interfaceC3396r.mo15462b();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m15431g() {
        Context context = this.f18289a;
        UMWorkDispatch.sendEvent(context, C3387i.a.f18539f, CoreProtocol.getInstance(context), null);
    }

    /* JADX INFO: renamed from: h */
    public void m15432h() {
        try {
            if (this.f18296i != null) {
                SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(this.f18289a).edit();
                editorEdit.putString(f18288g, this.f18296i.toString());
                editorEdit.commit();
            } else {
                this.f18296i = new JSONObject();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m15433i() {
        try {
            if (this.f18296i == null) {
                this.f18296i = new JSONObject();
            }
        } catch (Throwable unused) {
        }
        return this.f18296i;
    }

    /* JADX INFO: renamed from: j */
    public void m15434j() {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(this.f18289a).edit();
            editorEdit.remove(f18288g);
            editorEdit.commit();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
