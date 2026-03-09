package com.anythink.core.common.p051b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.anythink.core.common.p065n.C1322e;
import com.anythink.core.common.p066o.C1344h;
import com.anythink.core.p072d.C1391a;
import com.anythink.core.p072d.C1392b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.core.common.b.i */
/* JADX INFO: loaded from: classes.dex */
public class C1170i implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d */
    private static volatile C1170i f3284d = null;

    /* JADX INFO: renamed from: j */
    private static final String f3285j = "0";

    /* JADX INFO: renamed from: k */
    private static final String f3286k = "1";

    /* JADX INFO: renamed from: l */
    private static final int f3287l = 4;

    /* JADX INFO: renamed from: b */
    private Thread.UncaughtExceptionHandler f3289b;

    /* JADX INFO: renamed from: c */
    private Context f3290c;

    /* JADX INFO: renamed from: e */
    private SharedPreferences f3291e;

    /* JADX INFO: renamed from: f */
    private final String f3292f = "crash_type";

    /* JADX INFO: renamed from: g */
    private final String f3293g = "crash_msg";

    /* JADX INFO: renamed from: h */
    private final String f3294h = C1166e.f3017c;

    /* JADX INFO: renamed from: i */
    private final String f3295i = "crash_sdk_type";

    /* JADX INFO: renamed from: a */
    public String f3288a = "com.anythink";

    private C1170i(Context context) {
        this.f3290c = context;
        this.f3291e = context.getSharedPreferences(C1169h.f3073x, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C1170i m2035a(Context context) {
        if (f3284d == null) {
            synchronized (C1170i.class) {
                if (f3284d == null) {
                    f3284d = new C1170i(context);
                }
            }
        }
        return f3284d;
    }

    /* JADX INFO: renamed from: a */
    private void m2036a(Throwable th) throws JSONException {
        try {
            String strM2040b = m2040b(th);
            if (m2037a(strM2040b)) {
                String strM2039b = m2039b(strM2040b);
                String strM2041c = m2041c(strM2040b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(strM2039b));
                jSONObject.put("crash_msg", URLEncoder.encode(m2038b() + "\n" + strM2040b));
                jSONObject.put(C1166e.f3017c, C1175n.m2059a().m2168q());
                jSONObject.put("crash_sdk_type", strM2041c);
                SharedPreferences.Editor editorEdit = this.f3291e.edit();
                editorEdit.putString(System.currentTimeMillis() + "_crash", jSONObject.toString());
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2037a(String str) {
        C1391a c1391aM4865b = C1392b.m4845a(this.f3290c).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b != null) {
            if (c1391aM4865b.m4781z() == 0) {
                return false;
            }
            String strM4705B = c1391aM4865b.m4705B();
            try {
                if (TextUtils.isEmpty(strM4705B)) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray(strM4705B);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.contains(jSONArray.optString(i))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str.contains(this.f3288a)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private String m2038b() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap map = new HashMap(4);
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Thread key = it.next().getKey();
                if (key.getName().startsWith("anythink")) {
                    String str = key.getName() + "-" + key.getState();
                    map.put(str, map.containsKey(str) ? Integer.valueOf(((Integer) map.get(str)).intValue() + 1) : 1);
                    i++;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(map);
                jSONObject.put("anythink_thread_count", i);
                try {
                    ActivityManager activityManager = (ActivityManager) this.f3290c.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                    Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                    if (processMemoryInfo.length > 0) {
                        jSONObject.put("app_memory", (processMemoryInfo[0].getTotalPss() / 1024) + "MB");
                    }
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    if (Build.VERSION.SDK_INT >= 16) {
                        jSONObject.put("sys_total_memory", (memoryInfo.totalMem / 1048576) + "MB");
                        jSONObject.put("sys_avail_memory", (memoryInfo.availMem / 1048576) + "MB");
                    }
                } catch (Throwable unused) {
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                return th.getMessage();
            }
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m2039b(String str) {
        String str2 = "";
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            String strGroup = matcher.find() ? matcher.group(0) : "";
            try {
                return !TextUtils.isEmpty(strGroup) ? strGroup.replaceAll("Caused by:", "").replaceAll(C4196o4.OooO00o.OooO0Oo, "") : strGroup;
            } catch (Exception unused) {
                str2 = strGroup;
                return str2;
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    private static String m2040b(Throwable th) throws Throwable {
        PrintWriter printWriter;
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = null;
        try {
            for (Throwable th2 = new Throwable(C1344h.m4131a(), th); th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            }
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
            } catch (Exception unused) {
                printWriter = null;
            } catch (Throwable th3) {
                th = th3;
                printWriter = null;
            }
            try {
                th.printStackTrace(printWriter);
                printWriter.flush();
                printWriter.close();
                stringWriter2.close();
                String string = stringWriter2.toString();
                try {
                    stringWriter2.close();
                    stringWriter2.close();
                } catch (Throwable unused2) {
                }
                return string;
            } catch (Exception unused3) {
                stringWriter = stringWriter2;
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (Throwable unused4) {
                        return "";
                    }
                }
                if (printWriter != null) {
                    stringWriter.close();
                }
                return "";
            } catch (Throwable th4) {
                th = th4;
                stringWriter = stringWriter2;
                if (stringWriter != null) {
                    try {
                        stringWriter.close();
                    } catch (Throwable unused5) {
                        throw th;
                    }
                }
                if (printWriter != null) {
                    stringWriter.close();
                }
                throw th;
            }
        } catch (Exception unused6) {
            printWriter = null;
        } catch (Throwable th5) {
            th = th5;
            printWriter = null;
        }
    }

    /* JADX INFO: renamed from: c */
    private String m2041c(String str) {
        String str2 = this.f3288a;
        if (!TextUtils.isEmpty(str) && str.contains(str2)) {
            try {
                for (String str3 : str.split("Caused by:")) {
                    if (str3.contains(str2)) {
                        String[] strArrSplit = str3.split("\\n");
                        for (int i = 0; i < strArrSplit.length; i++) {
                            if (strArrSplit[i].contains(str2) && i <= 4) {
                                return "1";
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "0";
    }

    /* JADX INFO: renamed from: c */
    private void m2042c() {
        Map<String, ?> all = this.f3291e.getAll();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    C1322e.m3931b(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString(C1166e.f3017c), jSONObject.optString("crash_sdk_type"));
                } catch (Exception unused) {
                }
            }
        }
        if (all.size() > 0) {
            this.f3291e.edit().clear().commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2043a() {
        C1391a c1391aM4865b = C1392b.m4845a(this.f3290c).m4865b(C1175n.m2059a().m2165o());
        if (c1391aM4865b == null || c1391aM4865b.m4781z() != 0) {
            try {
                Map<String, ?> all = this.f3291e.getAll();
                Iterator<?> it = all.values().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String string = next != null ? next.toString() : "";
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            C1322e.m3931b(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString(C1166e.f3017c), jSONObject.optString("crash_sdk_type"));
                        } catch (Exception unused) {
                        }
                    }
                }
                if (all.size() > 0) {
                    this.f3291e.edit().clear().commit();
                }
                if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof C1170i)) {
                    this.f3289b = Thread.getDefaultUncaughtExceptionHandler();
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws JSONException {
        if (th == null) {
            return;
        }
        try {
            String strM2040b = m2040b(th);
            if (m2037a(strM2040b)) {
                String strM2039b = m2039b(strM2040b);
                String strM2041c = m2041c(strM2040b);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(strM2039b));
                jSONObject.put("crash_msg", URLEncoder.encode(m2038b() + "\n" + strM2040b));
                jSONObject.put(C1166e.f3017c, C1175n.m2059a().m2168q());
                jSONObject.put("crash_sdk_type", strM2041c);
                SharedPreferences.Editor editorEdit = this.f3291e.edit();
                editorEdit.putString(System.currentTimeMillis() + "_crash", jSONObject.toString());
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3289b;
            if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || (uncaughtExceptionHandler instanceof C1170i)) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Exception unused2) {
        }
    }
}
