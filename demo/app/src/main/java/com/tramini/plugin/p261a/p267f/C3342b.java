package com.tramini.plugin.p261a.p267f;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.expressad.advanced.p080js.NativeAdvancedJsUtils;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.tramini.plugin.p261a.p265d.C3333a;
import com.tramini.plugin.p261a.p265d.C3335c;
import com.tramini.plugin.p261a.p267f.C3346f;
import com.umeng.commonsdk.amap.UMAmapConfig;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tramini.plugin.a.f.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3342b extends C3346f {

    /* JADX INFO: renamed from: com.tramini.plugin.a.f.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WebView f18157a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExecutorService f18158b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String[] f18159c;

        public AnonymousClass1(WebView webView, ExecutorService executorService, String[] strArr) {
            this.f18157a = webView;
            this.f18158b = executorService;
            this.f18159c = strArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (this.f18157a == null) {
                    synchronized (this.f18158b) {
                        this.f18158b.notifyAll();
                    }
                }
                this.f18157a.post(new Runnable() { // from class: com.tramini.plugin.a.f.b.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (Build.VERSION.SDK_INT >= 19) {
                            AnonymousClass1.this.f18157a.evaluateJavascript("(function() { return (document.getElementsByTagName('html')[0].innerHTML); })();", new ValueCallback<String>() { // from class: com.tramini.plugin.a.f.b.1.1.1
                                /* JADX INFO: renamed from: a */
                                private void m15218a(String str) {
                                    Properties properties = new Properties();
                                    try {
                                        properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
                                    } catch (IOException unused) {
                                    }
                                    String property = properties.getProperty("unicodedString");
                                    if (property.length() > 2) {
                                        AnonymousClass1.this.f18159c[0] = property.substring(1, property.length() - 1);
                                    }
                                    synchronized (AnonymousClass1.this.f18158b) {
                                        AnonymousClass1.this.f18158b.notifyAll();
                                    }
                                }

                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(String str) {
                                    Properties properties = new Properties();
                                    try {
                                        properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
                                    } catch (IOException unused) {
                                    }
                                    String property = properties.getProperty("unicodedString");
                                    if (property.length() > 2) {
                                        AnonymousClass1.this.f18159c[0] = property.substring(1, property.length() - 1);
                                    }
                                    synchronized (AnonymousClass1.this.f18158b) {
                                        AnonymousClass1.this.f18158b.notifyAll();
                                    }
                                }
                            });
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0268 A[Catch: all -> 0x02a8, TRY_LEAVE, TryCatch #4 {all -> 0x02a8, blocks: (B:3:0x002f, B:6:0x003e, B:8:0x0042, B:10:0x004b, B:12:0x0055, B:15:0x006a, B:17:0x0070, B:20:0x0080, B:84:0x0205, B:86:0x0210, B:88:0x0216, B:90:0x021c, B:92:0x0226, B:94:0x022e, B:96:0x0238, B:98:0x023e, B:100:0x0244, B:101:0x024c, B:106:0x0265, B:103:0x0252, B:105:0x0258, B:108:0x0268, B:111:0x0274, B:113:0x027a, B:114:0x027f, B:115:0x0282, B:116:0x0287, B:118:0x028c, B:119:0x0292, B:121:0x0298, B:122:0x029d, B:38:0x00c1, B:42:0x00e5, B:80:0x01d7, B:73:0x019c, B:75:0x01aa, B:77:0x01d2), top: B:137:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210 A[Catch: all -> 0x02a8, TryCatch #4 {all -> 0x02a8, blocks: (B:3:0x002f, B:6:0x003e, B:8:0x0042, B:10:0x004b, B:12:0x0055, B:15:0x006a, B:17:0x0070, B:20:0x0080, B:84:0x0205, B:86:0x0210, B:88:0x0216, B:90:0x021c, B:92:0x0226, B:94:0x022e, B:96:0x0238, B:98:0x023e, B:100:0x0244, B:101:0x024c, B:106:0x0265, B:103:0x0252, B:105:0x0258, B:108:0x0268, B:111:0x0274, B:113:0x027a, B:114:0x027f, B:115:0x0282, B:116:0x0287, B:118:0x028c, B:119:0x0292, B:121:0x0298, B:122:0x029d, B:38:0x00c1, B:42:0x00e5, B:80:0x01d7, B:73:0x019c, B:75:0x01aa, B:77:0x01d2), top: B:137:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.tramini.plugin.p261a.p265d.C3333a m15210a(java.lang.Object r33, java.lang.String r34, java.lang.String r35, long r36, long r38, org.json.JSONObject r40, java.lang.String r41, org.json.JSONArray r42, java.lang.String r43) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p267f.C3342b.m15210a(java.lang.Object, java.lang.String, java.lang.String, long, long, org.json.JSONObject, java.lang.String, org.json.JSONArray, java.lang.String):com.tramini.plugin.a.d.a");
    }

    /* JADX INFO: renamed from: a */
    public static C3333a m15211a(JSONObject jSONObject, C3335c c3335c, String str, String str2) {
        return m15210a(C3346f.m15232a(jSONObject.optString("in_na"), str), "", jSONObject.optString("tobj_k"), jSONObject.optLong("bwt", UMAmapConfig.AMAP_CACHE_WRITE_TIME), jSONObject.optLong("bswt", C1659a.f9130f), jSONObject, jSONObject.optString("bu_k"), c3335c.f18113e, str2);
    }

    /* JADX INFO: renamed from: a */
    private static String m15212a(WebView webView, long j, long j2) {
        if (Build.VERSION.SDK_INT < 19) {
            return "";
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
        String[] strArr = new String[1];
        try {
            executorServiceNewFixedThreadPool.submit(new AnonymousClass1(webView, executorServiceNewFixedThreadPool, strArr));
        } catch (Throwable unused2) {
        }
        try {
            synchronized (executorServiceNewFixedThreadPool) {
                executorServiceNewFixedThreadPool.wait(j + j2);
            }
            executorServiceNewFixedThreadPool.shutdown();
            return strArr[0] != null ? strArr[0] : "";
        } catch (Exception unused3) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m15213a(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            ArrayList<Field> arrayList = new ArrayList();
            C3346f.m15235a(obj.getClass(), arrayList);
            for (Field field : arrayList) {
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (obj2 instanceof String) && ((String) obj2).endsWith(".mp4")) {
                        return (String) obj2;
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m15214a(java.lang.String r8, java.lang.Object r9, org.json.JSONObject r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.p261a.p267f.C3342b.m15214a(java.lang.String, java.lang.Object, org.json.JSONObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: b */
    private static String m15215b(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            ArrayList<Field> arrayList = new ArrayList();
            C3346f.m15235a(obj.getClass(), arrayList);
            for (Field field : arrayList) {
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (obj2 instanceof String) && ((String) obj2).contains("<!DOCTYPE html>")) {
                        return (String) obj2;
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private static JSONObject m15216c(Object obj, String str) {
        try {
            ArrayList<Field> arrayList = new ArrayList();
            C3346f.m15235a(obj.getClass(), arrayList);
            for (Field field : arrayList) {
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (obj2 instanceof JSONObject) && !TextUtils.isEmpty(((JSONObject) obj2).optString(str, ""))) {
                        return (JSONObject) obj2;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m15217d(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            String strM15249a = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt(NativeAdvancedJsUtils.f6629p, -1);
                    String strOptString = jSONObjectOptJSONObject.optString("param", "");
                    if (iOptInt == 101) {
                        if (TextUtils.isEmpty(str2)) {
                            continue;
                        } else {
                            strM15249a = C3346f.b.m15249a(str2, strOptString);
                        }
                    }
                    if (!TextUtils.isEmpty(strM15249a)) {
                        return strM15249a;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
