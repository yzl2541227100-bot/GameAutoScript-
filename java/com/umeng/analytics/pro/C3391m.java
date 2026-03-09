package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3387i;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.m */
/* JADX INFO: loaded from: classes2.dex */
public class C3391m {

    /* JADX INFO: renamed from: a */
    private static final String f18568a = "fs_lc_tl";

    /* JADX INFO: renamed from: e */
    private static final String f18569e = "-1";

    /* JADX INFO: renamed from: f */
    private static Context f18570f;

    /* JADX INFO: renamed from: b */
    private final int f18571b;

    /* JADX INFO: renamed from: c */
    private final int f18572c;

    /* JADX INFO: renamed from: d */
    private final int f18573d;

    /* JADX INFO: renamed from: g */
    private JSONObject f18574g;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.m$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3391m f18575a = new C3391m();

        private a() {
        }
    }

    private C3391m() {
        this.f18571b = 128;
        this.f18572c = 256;
        this.f18573d = 10;
        this.f18574g = null;
        if (0 == 0) {
            try {
                m15590b(f18570f);
            } catch (Throwable unused) {
            }
        }
    }

    public /* synthetic */ C3391m(AnonymousClass1 anonymousClass1) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C3391m m15584a(Context context) {
        if (f18570f == null && context != null) {
            f18570f = context.getApplicationContext();
        }
        return a.f18575a;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m15585a(Map<String, Object> map) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String strSubStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    jSONArray = new JSONArray();
                                    while (i < iArr.length) {
                                        jSONArray.put(iArr[i]);
                                        i++;
                                    }
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    jSONArray = new JSONArray();
                                    while (i < dArr.length) {
                                        jSONArray.put(dArr[i]);
                                        i++;
                                    }
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    jSONArray = new JSONArray();
                                    while (i < jArr.length) {
                                        jSONArray.put(jArr[i]);
                                        i++;
                                    }
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    jSONArray = new JSONArray();
                                    while (i < fArr.length) {
                                        jSONArray.put(fArr[i]);
                                        i++;
                                    }
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    jSONArray = new JSONArray();
                                    while (i < sArr.length) {
                                        jSONArray.put((int) sArr[i]);
                                        i++;
                                    }
                                }
                                jSONObject.put(strSubStr, jSONArray);
                            } else if (value instanceof List) {
                                List list = (List) value;
                                jSONArray = new JSONArray();
                                while (i < list.size()) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray.put(list.get(i));
                                    }
                                    i++;
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(strSubStr, jSONArray);
                                }
                            } else {
                                if (value instanceof String) {
                                    value = HelperUtils.subStr(value.toString(), 256);
                                } else if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Short)) {
                                    MLog.m16269e("The param has not support type. please check !");
                                }
                                jSONObject.put(strSubStr, value);
                            }
                        }
                    }
                } catch (Exception e) {
                    MLog.m16273e(e);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private void m15586a() {
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f18570f, "track_list", "");
            if (TextUtils.isEmpty(strImprintProperty)) {
                return;
            }
            String[] strArrSplit = strImprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (this.f18574g != null) {
                for (String str : strArrSplit) {
                    String strSubStr = HelperUtils.subStr(str, 128);
                    if (this.f18574g.has(strSubStr)) {
                        jSONObject.put(strSubStr, this.f18574g.get(strSubStr));
                    }
                }
            }
            this.f18574g = new JSONObject();
            if (strArrSplit.length >= 10) {
                while (i < 10) {
                    m15587a(strArrSplit[i], jSONObject);
                    i++;
                }
            } else {
                while (i < strArrSplit.length) {
                    m15587a(strArrSplit[i], jSONObject);
                    i++;
                }
            }
            m15593c(f18570f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m15587a(String str, JSONObject jSONObject) throws JSONException {
        String strSubStr = HelperUtils.subStr(str, 128);
        m15588a(strSubStr, jSONObject.has(strSubStr) ? ((Boolean) jSONObject.get(strSubStr)).booleanValue() : false);
    }

    /* JADX INFO: renamed from: a */
    private void m15588a(String str, boolean z) {
        try {
            if (C3380b.f18366T.equals(str) || C3380b.f18364R.equals(str) || "id".equals(str) || "ts".equals(str) || this.f18574g.has(str)) {
                return;
            }
            this.f18574g.put(str, z);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m15589a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        MLog.m16269e("Event id is empty or too long in tracking Event");
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m15590b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f18568a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f18574g = new JSONObject(string);
            }
            m15586a();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m15591b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
            MLog.m16269e("Event label or value is empty or too long in tracking Event");
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m15592b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!m15589a(entry.getKey())) {
                            MLog.m16269e("map has NULL key. please check!");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            return false;
                        }
                        if ((entry.getValue() instanceof String) && !m15591b(entry.getValue().toString())) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        MLog.m16269e("map is null or empty in onEvent");
        return false;
    }

    /* JADX INFO: renamed from: c */
    private void m15593c(Context context) {
        try {
            if (this.f18574g != null) {
                PreferenceWrapper.getDefault(f18570f).edit().putString(f18568a, this.f18574g.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15594a(Object obj) {
        try {
            C3387i.d dVar = (C3387i.d) obj;
            String strM15567c = dVar.m15567c();
            Map<String, Object> mapM15565a = dVar.m15565a();
            String strM15566b = dVar.m15566b();
            long jM15568d = dVar.m15568d();
            if (TextUtils.isEmpty(strM15567c)) {
                return;
            }
            String strSubStr = HelperUtils.subStr(strM15567c, 128);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3380b.f18374aa, strSubStr);
            jSONObject.put("_$!ts", jM15568d);
            String strM15612c = C3393o.m15600a().m15612c();
            if (TextUtils.isEmpty(strM15612c)) {
                strM15612c = "-1";
            }
            jSONObject.put("__ii", strM15612c);
            if (!TextUtils.isEmpty(strM15566b)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strM15566b);
                    if (jSONObject2.length() > 0) {
                        jSONObject.put(C3380b.f18375ab, jSONObject2);
                    }
                } catch (JSONException unused) {
                }
            }
            m15586a();
            if (mapM15565a != null) {
                JSONObject jSONObjectM15585a = m15585a(mapM15565a);
                if (jSONObjectM15585a.length() > 0) {
                    Iterator<String> itKeys = jSONObjectM15585a.keys();
                    while (itKeys.hasNext()) {
                        try {
                            String next = itKeys.next();
                            if (Arrays.asList(C3380b.f18390aq).contains(next)) {
                                MLog.m16269e("the key in map about track interface is invalid.  ");
                            } else {
                                jSONObject.put(next, jSONObjectM15585a.get(next));
                            }
                        } catch (Throwable th) {
                            MLog.m16273e(th);
                        }
                    }
                }
            }
            JSONObject jSONObject3 = this.f18574g;
            if (jSONObject3 != null && jSONObject3.has(strSubStr) && !((Boolean) this.f18574g.get(strSubStr)).booleanValue()) {
                jSONObject.put(C3380b.f18366T, 1);
                this.f18574g.put(strSubStr, true);
                m15593c(f18570f);
            }
            C3387i.m15520a(f18570f).m15547a(jSONObject, 0, false);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15595a(String str, String str2, long j, int i) {
        try {
            if (m15589a(str) && m15591b(str2)) {
                if (Arrays.asList(C3380b.f18389ap).contains(str)) {
                    MLog.m16269e("the id is valid!");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j > 0) {
                    jSONObject.put(C3380b.f18364R, j);
                }
                jSONObject.put("__t", C3385g.f18480a);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put(str, str2);
                String strM15612c = C3393o.m15600a().m15612c();
                if (TextUtils.isEmpty(strM15612c)) {
                    strM15612c = "-1";
                }
                jSONObject.put("__i", strM15612c);
                Context context = f18570f;
                UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15596a(String str, Map<String, Object> map) {
        try {
            if (m15589a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C3380b.f18364R, 0);
                jSONObject.put("__t", C3385g.f18481b);
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!C3380b.f18366T.equals(next.getKey()) && !C3380b.f18364R.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String strM15612c = C3393o.m15600a().m15612c();
                if (TextUtils.isEmpty(strM15612c)) {
                    strM15612c = "-1";
                }
                jSONObject.put("__i", strM15612c);
                Context context = f18570f;
                UMWorkDispatch.sendEvent(context, 4098, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15597a(String str, Map<String, Object> map, long j) {
        try {
            if (m15589a(str) && m15592b(map)) {
                if (Arrays.asList(C3380b.f18389ap).contains(str)) {
                    MLog.m16269e("the id is valid!");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j > 0) {
                    jSONObject.put(C3380b.f18364R, j);
                }
                jSONObject.put("__t", C3385g.f18480a);
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Map.Entry<String, Object> next = it.next();
                    if (Arrays.asList(C3380b.f18389ap).contains(next.getKey())) {
                        MLog.m16269e("the key in map is invalid.  ");
                    } else {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String strM15612c = C3393o.m15600a().m15612c();
                if (TextUtils.isEmpty(strM15612c)) {
                    strM15612c = "-1";
                }
                jSONObject.put("__i", strM15612c);
                Context context = f18570f;
                UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m15598a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() <= 0) {
                    return;
                }
                m15586a();
                JSONObject jSONObject = this.f18574g;
                if (jSONObject == null) {
                    this.f18574g = new JSONObject();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject2 = this.f18574g;
                        if (jSONObject2 == null) {
                            this.f18574g = new JSONObject();
                        } else if (jSONObject2.length() >= 5) {
                            break;
                        }
                        String str = list.get(i);
                        if (!TextUtils.isEmpty(str)) {
                            m15588a(HelperUtils.subStr(str, 128), false);
                        }
                    }
                } else {
                    if (jSONObject.length() >= 5) {
                        MLog.m16263d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (this.f18574g.length() >= 5) {
                            MLog.m16263d(" add setFistLaunchEvent over.");
                            return;
                        }
                        m15588a(HelperUtils.subStr(list.get(i2), 128), false);
                    }
                }
                m15593c(f18570f);
            } catch (Exception unused) {
            }
        }
    }
}
