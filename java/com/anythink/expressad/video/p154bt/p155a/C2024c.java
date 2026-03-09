package com.anythink.expressad.video.p154bt.p155a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.common.p050a.C1159k;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p052c.C1186g;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.atsignalcommon.windvane.C1460a;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p121a.C1807f;
import com.anythink.expressad.foundation.p138h.C1874h;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1885s;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.video.p154bt.module.ATTempContainer;
import com.anythink.expressad.video.p154bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.p154bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.p154bt.module.AnythinkBTNativeEC;
import com.anythink.expressad.video.p154bt.module.AnythinkBTVideoView;
import com.anythink.expressad.video.p154bt.module.AnythinkBTWebView;
import com.anythink.expressad.video.p154bt.module.BTBaseView;
import com.anythink.expressad.video.signal.p176a.C2202j;
import com.anythink.expressad.videocommon.p178b.C2316a;
import com.anythink.expressad.videocommon.p178b.C2324i;
import com.anythink.expressad.videocommon.p179c.C2333c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import com.octopus.p222ad.widget.ScrollClickView;
import com.tramini.plugin.p261a.p267f.C3341a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2024c {

    /* JADX INFO: renamed from: a */
    public static final int f12852a = -999;

    /* JADX INFO: renamed from: b */
    private static final String f12853b = "OperateViews";

    /* JADX INFO: renamed from: c */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f12854c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    private static LinkedHashMap<String, String> f12855d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e */
    private static LinkedHashMap<String, C1781c> f12856e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f */
    private static LinkedHashMap<String, C2340d> f12857f = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g */
    private static LinkedHashMap<String, String> f12858g = new LinkedHashMap<>();

    /* JADX INFO: renamed from: h */
    private static LinkedHashMap<String, Integer> f12859h = new LinkedHashMap<>();

    /* JADX INFO: renamed from: i */
    private static LinkedHashMap<String, Activity> f12860i = new LinkedHashMap<>();

    /* JADX INFO: renamed from: j */
    private static volatile int f12861j = 10000;

    /* JADX INFO: renamed from: k */
    private static int f12862k = 0;

    /* JADX INFO: renamed from: l */
    private static int f12863l = 1;

    /* JADX INFO: renamed from: m */
    private static String f12864m = "";

    /* JADX INFO: renamed from: n */
    private static int f12865n;

    /* JADX INFO: renamed from: o */
    private static int f12866o;

    /* JADX INFO: renamed from: p */
    private static int f12867p;

    /* JADX INFO: renamed from: q */
    private static int f12868q;

    /* JADX INFO: renamed from: r */
    private static int f12869r;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.c$1 */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f12870a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12871b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f12872c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f12873d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f12874e;

        public AnonymousClass1(Object obj, String str, Rect rect, int i, int i2) {
            obj = obj;
            str = str;
            rect = rect;
            i = i;
            i = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.this.m10868b(str, rid);
            String strM10842b = C2024c.m10842b();
            C2024c.f12855d.put(strM10842b, rid);
            AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(C1175n.m2059a().m2148f());
            linkedHashMapM10868b.put(strM10842b, anythinkBTLayout);
            anythinkBTLayout.setInstanceId(strM10842b);
            anythinkBTLayout.setUnitId(str);
            anythinkBTLayout.setWebView(windVaneWebView);
            anythinkBTLayout.setRect(rect);
            int i = i;
            if (i > 0 || i > 0) {
                anythinkBTLayout.setLayout(i, i);
            }
            C2024c.m10834a(obj, strM10842b);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.c$2 */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f12876a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f12877b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f12878c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f12879d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f12880e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Rect f12881f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f12882g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f12883h;

        public AnonymousClass2(Object obj, String str, String str2, String str3, String str4, Rect rect, int i, int i2) {
            obj = obj;
            str = str;
            str = str2;
            str = str3;
            str = str4;
            rect = rect;
            i = i;
            i = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String rid;
            WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
            if (windVaneWebView != null) {
                rid = windVaneWebView.getRid();
            } else {
                rid = "";
                windVaneWebView = null;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.this.m10868b(str, rid);
            String strM10842b = C2024c.m10842b();
            C2024c.f12855d.put(strM10842b, rid);
            AnythinkBTWebView anythinkBTWebView = new AnythinkBTWebView(C1175n.m2059a().m2148f());
            linkedHashMapM10868b.put(strM10842b, anythinkBTWebView);
            anythinkBTWebView.setInstanceId(strM10842b);
            anythinkBTWebView.setUnitId(str);
            anythinkBTWebView.setFileURL(str);
            anythinkBTWebView.setFilePath(str);
            anythinkBTWebView.setHtml(str);
            anythinkBTWebView.setRect(rect);
            anythinkBTWebView.setWebViewRid(rid);
            anythinkBTWebView.setCreateWebView(windVaneWebView);
            int i = i;
            if (i > 0 || i > 0) {
                anythinkBTWebView.setLayout(i, i);
            }
            anythinkBTWebView.preload();
            C2024c.m10834a(obj, strM10842b);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.a.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C2024c f12885a = new C2024c((byte) 0);

        private a() {
        }
    }

    private C2024c() {
    }

    public /* synthetic */ C2024c(byte b) {
        this();
    }

    /* JADX INFO: renamed from: E */
    public static void m10823E(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m10824I(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m10825J(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
            } else {
                m10846c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX INFO: renamed from: P */
    public static void m10826P(Object obj, JSONObject jSONObject) {
        String str;
        ?? r17;
        String str2;
        File file;
        ?? r3 = "message";
        String str3 = "code";
        ?? jSONObject2 = new JSONObject();
        int i = 1;
        try {
            jSONObject2.put("code", 0);
            jSONObject2.put("message", "");
            JSONArray jSONArray = jSONObject.getJSONArray("resource");
            if (jSONArray != null && jSONArray.length() > 0) {
                ?? jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i2 = 0;
                r3 = r3;
                while (i2 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    String strOptString = jSONObject3.optString("ref", "");
                    int i3 = jSONObject3.getInt("type");
                    ?? jSONObject4 = new JSONObject();
                    if (i3 != i || TextUtils.isEmpty(strOptString)) {
                        r17 = r3;
                        str2 = str3;
                        if (i3 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", C2324i.m11867a().m11883c(strOptString) == null ? "" : C2324i.m11867a().m11883c(strOptString));
                            jSONObject4.put(strOptString, jSONObject5);
                            r17 = r17;
                        } else if (i3 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th) {
                                if (C1404a.f6209a) {
                                    th.printStackTrace();
                                }
                            }
                            String strConcat = (file.exists() && file.isFile() && file.canRead()) ? "file:////".concat(String.valueOf(strOptString)) : "";
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put("path", strConcat);
                            jSONObject4.put(strOptString, jSONObject6);
                            r17 = r17;
                        } else if (i3 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", C1885s.m9804a(strOptString) == null ? "" : C1885s.m9804a(strOptString));
                            jSONObject4.put(strOptString, jSONObject7);
                            r17 = r17;
                        }
                        jSONArray2.put(jSONObject4);
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        C2316a.m11773a();
                        C1159k c1159kM11775b = C2316a.m11775b(strOptString);
                        if (c1159kM11775b != null) {
                            jSONObject8.put("type", i);
                            r17 = r3;
                            str2 = str3;
                            try {
                                jSONObject8.put("videoDataLength", c1159kM11775b.m1993d());
                                String strM1988b = c1159kM11775b.m1988b();
                                if (TextUtils.isEmpty(strM1988b)) {
                                    jSONObject8.put("path", "");
                                    jSONObject8.put("path4Web", "");
                                } else {
                                    jSONObject8.put("path", strM1988b);
                                    jSONObject8.put("path4Web", strM1988b);
                                }
                                if (c1159kM11775b.m1991c() == 100) {
                                    jSONObject8.put("downloaded", 1);
                                } else {
                                    jSONObject8.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject8);
                                r17 = r17;
                                jSONArray2.put(jSONObject4);
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = r17;
                                str = str2;
                            }
                        } else {
                            r17 = r3;
                            str2 = str3;
                        }
                    }
                    i2++;
                    r3 = r17;
                    str3 = str2;
                    i = 1;
                }
                r17 = r3;
                str2 = str3;
                jSONObject2.put("resource", jSONArray2);
                C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            str = "code";
            r3 = 1;
            try {
                try {
                    jSONObject2.put(str, 1);
                } catch (JSONException e) {
                    e = e;
                } catch (Throwable th3) {
                    th = th3;
                    r3 = "message";
                }
                try {
                    jSONObject2.put("message", "resource is null");
                    C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e2) {
                    e = e2;
                    e.getMessage();
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = str3;
        }
        try {
            jSONObject2.put(str, 1);
            jSONObject2.put(r3, th.getLocalizedMessage());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (JSONException e3) {
            e3.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX INFO: renamed from: a */
    private static ViewGroup.LayoutParams m10827a(ViewGroup.LayoutParams layoutParams, Rect rect, int i, int i2) {
        if (rect == null) {
            rect = new Rect(f12852a, f12852a, f12852a, f12852a);
        }
        Context contextM2148f = C1175n.m2059a().m2148f();
        if (contextM2148f == null) {
            return layoutParams;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int i3 = rect.left;
            if (i3 != -999) {
                layoutParams2.leftMargin = C1886t.m9834b(contextM2148f, i3);
            }
            int i4 = rect.top;
            if (i4 != -999) {
                layoutParams2.topMargin = C1886t.m9834b(contextM2148f, i4);
            }
            int i5 = rect.right;
            if (i5 != -999) {
                layoutParams2.rightMargin = C1886t.m9834b(contextM2148f, i5);
            }
            int i6 = rect.bottom;
            if (i6 != -999) {
                layoutParams2.bottomMargin = C1886t.m9834b(contextM2148f, i6);
            }
            if (i > 0) {
                layoutParams2.width = C1886t.m9834b(contextM2148f, i);
            }
            if (i2 > 0) {
                layoutParams2.height = C1886t.m9834b(contextM2148f, i2);
            }
            return layoutParams2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            int i7 = rect.left;
            if (i7 != -999) {
                layoutParams3.leftMargin = C1886t.m9834b(contextM2148f, i7);
            }
            int i8 = rect.top;
            if (i8 != -999) {
                layoutParams3.topMargin = C1886t.m9834b(contextM2148f, i8);
            }
            int i9 = rect.right;
            if (i9 != -999) {
                layoutParams3.rightMargin = C1886t.m9834b(contextM2148f, i9);
            }
            int i10 = rect.bottom;
            if (i10 != -999) {
                layoutParams3.bottomMargin = C1886t.m9834b(contextM2148f, i10);
            }
            if (i > 0) {
                layoutParams3.width = C1886t.m9834b(contextM2148f, i);
            }
            if (i2 > 0) {
                layoutParams3.height = C1886t.m9834b(contextM2148f, i2);
            }
            return layoutParams3;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            int i11 = rect.left;
            if (i11 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = C1886t.m9834b(contextM2148f, i11);
            }
            int i12 = rect.top;
            if (i12 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).topMargin = C1886t.m9834b(contextM2148f, i12);
            }
            int i13 = rect.right;
            if (i13 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = C1886t.m9834b(contextM2148f, i13);
            }
            int i14 = rect.bottom;
            if (i14 != -999) {
                ((LinearLayout.LayoutParams) layoutParams).bottomMargin = C1886t.m9834b(contextM2148f, i14);
            }
            if (i > 0) {
                ((LinearLayout.LayoutParams) layoutParams).width = C1886t.m9834b(contextM2148f, i);
            }
            if (i2 > 0) {
                ((LinearLayout.LayoutParams) layoutParams).height = C1886t.m9834b(contextM2148f, i2);
            }
        }
        return layoutParams;
    }

    /* JADX INFO: renamed from: a */
    public static C1781c m10828a(String str) {
        if (f12856e.containsKey(str)) {
            return f12856e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C2024c m10829a() {
        return a.f12885a;
    }

    /* JADX INFO: renamed from: a */
    public static void m10830a(int i, int i2, int i3, int i4, int i5) {
        new StringBuilder("OperateViews setNotchString = ").append(String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        f12864m = C1874h.m9682a(i, i2, i3, i4, i5);
        f12865n = i;
        f12866o = i2;
        f12867p = i3;
        f12868q = i4;
        f12869r = i5;
    }

    /* JADX INFO: renamed from: a */
    public static void m10831a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12863l);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10832a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12862k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a();
            C1469j.m5703a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m10831a(webView, e.getMessage());
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10833a(Object obj) {
        try {
            m10834a(obj, "");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10834a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12862k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m10846c(obj, e.getMessage());
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m10835a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12862k);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            C1469j.m5701a().mo5674a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m10846c(obj, e.getMessage());
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10836a(String str, int i) {
        f12859h.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public static void m10837a(String str, Activity activity) {
        f12860i.put(str, activity);
    }

    /* JADX INFO: renamed from: a */
    private static void m10838a(String str, C1781c c1781c) {
        if (C1807f.f11187k == null || TextUtils.isEmpty(c1781c.m10146aZ())) {
            return;
        }
        C1807f.m9397a(str, c1781c, "reward");
    }

    /* JADX INFO: renamed from: a */
    public static void m10839a(String str, String str2) {
        f12855d.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    private static void m10840a(String str, String str2, String str3) {
        try {
            LinkedHashMap<String, View> linkedHashMapM10868b = a.f12885a.m10868b(str, str2);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).notifyEvent(str3);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).notifyEvent(str3);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).notifyEvent(str3);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2340d m10841b(String str) {
        if (f12857f.containsKey(str)) {
            return f12857f.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m10842b() {
        int i = f12861j + 1;
        f12861j = i;
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m10843b(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int iOptInt = jSONObject.optInt("type");
                String strOptString = jSONObject.optString(C1781c.f10246am);
                int iOptInt2 = jSONObject.optInt("report");
                boolean z = true;
                if (iOptInt2 == 0) {
                    Context contextM2148f = C1175n.m2059a().m2148f();
                    if (iOptInt == 0) {
                        z = false;
                    }
                    C1405a.m5185a(contextM2148f, (C1781c) null, "", strOptString, z);
                } else {
                    C1405a.m5186a(C1175n.m2059a().m2148f(), null, "", strOptString, false, iOptInt != 0, iOptInt2);
                }
            }
            m10834a(obj, "");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m10844c(String str) {
        return f12858g.containsKey(str) ? f12858g.get(str) : "";
    }

    /* JADX INFO: renamed from: c */
    private static void m10846c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f12863l);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m10847d(String str) {
        f12860i.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public static int m10848e(String str) {
        if (f12859h.containsKey(str)) {
            return f12859h.get(str).intValue();
        }
        return 2;
    }

    /* JADX INFO: renamed from: f */
    public static void m10849f(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String strOptString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
            } else {
                m10834a(obj, strOptString);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m10850f(String str) {
        if (f12858g.containsKey(str)) {
            f12858g.remove(str);
        }
        if (f12857f.containsKey(str)) {
            f12857f.remove(str);
        }
        if (f12856e.containsKey(str)) {
            f12856e.remove(str);
        }
        if (f12855d.containsKey(str)) {
            f12855d.remove(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m10851g(String str) {
        if (f12859h.containsKey(str)) {
            f12859h.remove(str);
        }
    }

    /* JADX INFO: renamed from: h */
    private static String m10852h(String str) {
        return f12855d.containsKey(str) ? f12855d.get(str) : "";
    }

    /* JADX INFO: renamed from: i */
    private static Activity m10853i(String str) {
        if (f12860i.containsKey(str)) {
            return f12860i.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m10854A(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).play();
                m10834a(obj, strOptString2);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerPlay failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m10855B(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).pause();
                m10834a(obj, strOptString2);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerPause failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m10856C(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).resume();
                m10834a(obj, strOptString2);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerResume failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m10857D(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
            } else {
                ((AnythinkBTVideoView) view).stop();
                m10834a(obj, strOptString2);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerStop failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m10858F(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
            } else if (((AnythinkBTVideoView) view).playMute()) {
                m10834a(obj, strOptString2);
            } else {
                m10846c(obj, "set mute failed");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerMute failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m10859G(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exit");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
            } else if (!((AnythinkBTVideoView) view).playUnMute()) {
                m10834a(obj, "set unmute failed");
            } else {
                m10834a(obj, strOptString2);
                m10835a(obj, "onUnmute", strOptString2);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerUnmute failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m10860H(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTVideoView)) {
                m10846c(obj, "instanceId is not player");
                return;
            }
            int mute = ((AnythinkBTVideoView) view).getMute();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f12862k);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", strOptString2);
            jSONObject3.put("mute", mute);
            jSONObject2.put("data", jSONObject3);
            C1469j.m5701a().mo5673a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("playerGetMuteState failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m10861K(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof ATTempContainer)) {
                m10846c(obj, "view not exist");
            } else {
                ((ATTempContainer) view).preload();
                m10834a(obj, strOptString2);
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("preloadSubPlayTemplateView failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m10862L(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            AnythinkBTContainer anythinkBTContainer = null;
            if (linkedHashMapM10868b.size() <= 0) {
                m10846c(obj, "unitId or instanceId not exist");
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof AnythinkBTContainer) {
                    anythinkBTContainer = (AnythinkBTContainer) view;
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onDestory();
                } else if (view instanceof AnythinkBTVideoView) {
                    String instanceId = ((AnythinkBTVideoView) view).getInstanceId();
                    C2022a.m10813a();
                    C2022a.m10815a(instanceId);
                    ((AnythinkBTVideoView) view).onDestory();
                } else if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onDestroy();
                }
            }
            if (anythinkBTContainer == null) {
                m10846c(obj, "not found AnythinkBTContainer");
                return;
            }
            anythinkBTContainer.onAdClose();
            f12854c.remove(linkedHashMapM10868b);
            linkedHashMapM10868b.clear();
            f12854c.remove(strOptString + "_" + strM10852h);
            m10834a(obj, strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("closeAd failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m10863M(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("eventName");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, rid);
            if (linkedHashMapM10868b == null || linkedHashMapM10868b.size() <= 0) {
                m10846c(obj, "unitId not exist");
                return;
            }
            for (View view : linkedHashMapM10868b.values()) {
                if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                }
                if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).broadcast(strOptString2, jSONObjectOptJSONObject);
                }
            }
            m10834a(obj, "");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("broadcast failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m10864N(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
            String strOptString = "";
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString2 = jSONObject.optString("unitId");
            String strOptString3 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString4 = jSONObjectOptJSONObject.optString("userId");
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("expired");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("reward");
            String strOptString5 = jSONObjectOptJSONObject.optString(C1186g.a.f3498h);
            C2333c c2333c = null;
            if (jSONObjectOptJSONObject2 != null) {
                c2333c = new C2333c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                strOptString = jSONObjectOptJSONObject2.optString("id");
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString2, rid);
            if (linkedHashMapM10868b.size() <= 0 || !f12858g.containsKey(strOptString3)) {
                m10846c(obj, "unitId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString3);
            if (!(view instanceof ATTempContainer)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            ATTempContainer aTTempContainer = (ATTempContainer) view;
            aTTempContainer.setReward(c2333c);
            aTTempContainer.setUserId(strOptString4);
            aTTempContainer.setRewardId(strOptString);
            aTTempContainer.setCampaignExpired(zOptBoolean);
            if (!TextUtils.isEmpty(strOptString5)) {
                aTTempContainer.setDeveloperExtraData(strOptString5);
            }
            m10834a(obj, strOptString3);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("setSubPlayTemplateInfo failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m10865O(Object obj, JSONObject jSONObject) {
        try {
            WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
            String rid = windVaneWebView != null ? windVaneWebView.getRid() : "";
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString3 = jSONObjectOptJSONObject.optString("eventName");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("eventData");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, rid);
            if (linkedHashMapM10868b.size() <= 0) {
                m10846c(obj, "unitId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof WindVaneWebView) {
                        C1469j.m5701a();
                        C1469j.m5703a((WebView) childAt, strOptString3, Base64.encodeToString(jSONObjectOptJSONObject2.toString().getBytes(), 2));
                        m10834a(obj, strOptString2);
                        return;
                    }
                }
            }
            m10846c(obj, "instanceId not exist");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("webviewFireEvent failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m10866Q(Object obj, JSONObject jSONObject) {
        new StringBuilder("createNativeEC:").append(jSONObject);
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject.optJSONObject("campaign"));
                if (c1781cM8703b != null && !TextUtils.isEmpty(strOptString)) {
                    c1781cM8703b.m8891l(strOptString);
                    rid = c1781cM8703b.m8818Z();
                }
                C2340d c2340dM12008a = C2340d.m12008a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (c2340dM12008a != null) {
                    c2340dM12008a.m12080a(strOptString);
                }
                AnythinkBTNativeEC anythinkBTNativeEC = new AnythinkBTNativeEC(C1175n.m2059a().m2148f());
                anythinkBTNativeEC.setCampaign(c1781cM8703b);
                C2202j c2202j = new C2202j(null, c1781cM8703b);
                c2202j.mo11556a(strOptString);
                anythinkBTNativeEC.setJSCommon(c2202j);
                anythinkBTNativeEC.setUnitId(strOptString);
                anythinkBTNativeEC.setRewardUnitSetting(c2340dM12008a);
                WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    anythinkBTNativeEC.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, rid);
                String strM10842b = m10842b();
                f12855d.put(strM10842b, rid);
                anythinkBTNativeEC.setInstanceId(strM10842b);
                linkedHashMapM10868b.put(strM10842b, anythinkBTNativeEC);
                anythinkBTNativeEC.preLoadData();
                if (c1781cM8703b == null) {
                    m10846c(obj, "campaign is null");
                    return;
                } else {
                    m10834a(obj, strM10842b);
                    return;
                }
            }
            m10846c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("createNativeEC failed:").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10867a(Object obj, JSONObject jSONObject) {
        Rect rect;
        int i;
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                m10846c(obj, "unitId is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(f12852a, f12852a, f12852a, f12852a);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect3 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect3;
                i = iOptInt3;
            } else {
                rect = rect2;
                i = 0;
                iOptInt = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object f12870a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f12871b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Rect f12872c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f12873d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f12874e;

                public AnonymousClass1(Object obj2, String strOptString2, Rect rect4, int i2, int iOptInt4) {
                    obj = obj2;
                    str = strOptString2;
                    rect = rect4;
                    i = i2;
                    i = iOptInt4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String rid;
                    WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                    if (windVaneWebView != null) {
                        rid = windVaneWebView.getRid();
                    } else {
                        rid = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.this.m10868b(str, rid);
                    String strM10842b = C2024c.m10842b();
                    C2024c.f12855d.put(strM10842b, rid);
                    AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(C1175n.m2059a().m2148f());
                    linkedHashMapM10868b.put(strM10842b, anythinkBTLayout);
                    anythinkBTLayout.setInstanceId(strM10842b);
                    anythinkBTLayout.setUnitId(str);
                    anythinkBTLayout.setWebView(windVaneWebView);
                    anythinkBTLayout.setRect(rect);
                    int i2 = i;
                    if (i2 > 0 || i > 0) {
                        anythinkBTLayout.setLayout(i2, i);
                    }
                    C2024c.m10834a(obj, strM10842b);
                }
            }, iOptInt2);
        } catch (Throwable th) {
            m10846c(obj2, th.getMessage());
            new StringBuilder("create view failed:").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized LinkedHashMap<String, View> m10868b(String str, String str2) {
        if (f12854c.containsKey(str + "_" + str2)) {
            return f12854c.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        f12854c.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public final void m10869b(Object obj, JSONObject jSONObject) {
        Rect rect;
        int i;
        int iOptInt;
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                m10846c(obj, "unitId is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("delay", 0);
            String strOptString2 = jSONObjectOptJSONObject.optString("fileURL");
            String strOptString3 = jSONObjectOptJSONObject.optString("filePath");
            String strOptString4 = jSONObjectOptJSONObject.optString(C3341a.f18138b);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(f12852a, f12852a, f12852a, f12852a);
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect3 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                int iOptInt3 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect3;
                i = iOptInt3;
            } else {
                rect = rect2;
                i = 0;
                iOptInt = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.a.c.2

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object f12876a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f12877b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f12878c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f12879d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f12880e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Rect f12881f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ int f12882g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f12883h;

                public AnonymousClass2(Object obj2, String strOptString5, String strOptString22, String strOptString32, String strOptString42, Rect rect4, int i2, int iOptInt4) {
                    obj = obj2;
                    str = strOptString5;
                    str = strOptString22;
                    str = strOptString32;
                    str = strOptString42;
                    rect = rect4;
                    i = i2;
                    i = iOptInt4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String rid;
                    WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                    if (windVaneWebView != null) {
                        rid = windVaneWebView.getRid();
                    } else {
                        rid = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> linkedHashMapM10868b = C2024c.this.m10868b(str, rid);
                    String strM10842b = C2024c.m10842b();
                    C2024c.f12855d.put(strM10842b, rid);
                    AnythinkBTWebView anythinkBTWebView = new AnythinkBTWebView(C1175n.m2059a().m2148f());
                    linkedHashMapM10868b.put(strM10842b, anythinkBTWebView);
                    anythinkBTWebView.setInstanceId(strM10842b);
                    anythinkBTWebView.setUnitId(str);
                    anythinkBTWebView.setFileURL(str);
                    anythinkBTWebView.setFilePath(str);
                    anythinkBTWebView.setHtml(str);
                    anythinkBTWebView.setRect(rect);
                    anythinkBTWebView.setWebViewRid(rid);
                    anythinkBTWebView.setCreateWebView(windVaneWebView);
                    int i2 = i;
                    if (i2 > 0 || i > 0) {
                        anythinkBTWebView.setLayout(i2, i);
                    }
                    anythinkBTWebView.preload();
                    C2024c.m10834a(obj, strM10842b);
                }
            }, iOptInt2);
        } catch (Throwable th) {
            m10846c(obj2, th.getMessage());
            new StringBuilder("createWebview failed:").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10870c(Object obj, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String rid = "";
                C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject.optJSONObject("campaign"));
                if (c1781cM8703b != null && !TextUtils.isEmpty(strOptString)) {
                    c1781cM8703b.m8891l(strOptString);
                    rid = c1781cM8703b.m8818Z();
                }
                int iOptInt = jSONObjectOptJSONObject.optInt("show_time", 0);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("show_mute", 0);
                int iOptInt3 = jSONObjectOptJSONObject.optInt("show_close", 0);
                int iOptInt4 = jSONObjectOptJSONObject.optInt("orientation", 1);
                int iOptInt5 = jSONObjectOptJSONObject.optInt("show_pgb", 0);
                AnythinkBTVideoView anythinkBTVideoView = new AnythinkBTVideoView(C1175n.m2059a().m2148f());
                anythinkBTVideoView.setCampaign(c1781cM8703b);
                anythinkBTVideoView.setUnitId(strOptString);
                anythinkBTVideoView.setShowMute(iOptInt2);
                anythinkBTVideoView.setShowTime(iOptInt);
                anythinkBTVideoView.setShowClose(iOptInt3);
                anythinkBTVideoView.setOrientation(iOptInt4);
                anythinkBTVideoView.setProgressBarState(iOptInt5);
                WindVaneWebView windVaneWebView = ((C1460a) obj).f6757a;
                if (windVaneWebView != null) {
                    rid = windVaneWebView.getRid();
                    anythinkBTVideoView.setCreateWebView(windVaneWebView);
                }
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, rid);
                String strM10842b = m10842b();
                f12855d.put(strM10842b, rid);
                anythinkBTVideoView.setInstanceId(strM10842b);
                linkedHashMapM10868b.put(strM10842b, anythinkBTVideoView);
                anythinkBTVideoView.preLoadData();
                if (c1781cM8703b == null) {
                    m10846c(obj, "campaign is null");
                } else {
                    m10834a(obj, strM10842b);
                }
                C2022a.m10813a();
                C2022a.m10816a(strM10842b, anythinkBTVideoView);
                return;
            }
            m10846c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("createPlayerView failed:").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10871d(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                int iOptInt = jSONObjectOptJSONObject.optInt("mute");
                String rid = "";
                C1781c c1781cM8703b = C1781c.m8703b(jSONObjectOptJSONObject.optJSONObject("campaign"));
                if (c1781cM8703b != null && !TextUtils.isEmpty(strOptString)) {
                    c1781cM8703b.m8891l(strOptString);
                    rid = c1781cM8703b.m8818Z();
                }
                C2340d c2340dM12008a = C2340d.m12008a(jSONObjectOptJSONObject.optJSONObject("unitSetting"));
                if (c2340dM12008a != null) {
                    c2340dM12008a.m12080a(strOptString);
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("userId");
                if (TextUtils.isEmpty(rid) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                    rid = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, rid);
                String strM10842b = m10842b();
                f12855d.put(strM10842b, rid);
                ATTempContainer aTTempContainer = new ATTempContainer(C1175n.m2059a().m2148f());
                aTTempContainer.setInstanceId(strM10842b);
                aTTempContainer.setUnitId(strOptString);
                aTTempContainer.setCampaign(c1781cM8703b);
                aTTempContainer.setRewardUnitSetting(c2340dM12008a);
                aTTempContainer.setBigOffer(true);
                if (!TextUtils.isEmpty(strOptString2)) {
                    aTTempContainer.setUserId(strOptString2);
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("reward");
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString3 = jSONObjectOptJSONObject2.optString("id");
                    C2333c c2333c = new C2333c(jSONObjectOptJSONObject2.optString("name"), jSONObjectOptJSONObject2.optInt("amount"));
                    if (!TextUtils.isEmpty(strOptString3)) {
                        aTTempContainer.setRewardId(strOptString3);
                    }
                    if (!TextUtils.isEmpty(c2333c.m11969a())) {
                        aTTempContainer.setReward(c2333c);
                    }
                }
                String strOptString4 = jSONObjectOptJSONObject.optString(C1186g.a.f3498h);
                if (!TextUtils.isEmpty(strOptString4)) {
                    aTTempContainer.setDeveloperExtraData(strOptString4);
                }
                aTTempContainer.setMute(iOptInt);
                linkedHashMapM10868b.put(strM10842b, aTTempContainer);
                f12858g.put(strM10842b, strOptString);
                f12856e.put(strM10842b, c1781cM8703b);
                f12857f.put(strM10842b, c2340dM12008a);
                m10834a(obj, strM10842b);
                return;
            }
            m10846c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("createSubPlayTemplateView failed:").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10872e(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null && !TextUtils.isEmpty(strOptString)) {
                String strM10852h = m10852h(strOptString2);
                if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                    strM10852h = windVaneWebView.getRid();
                }
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
                if (linkedHashMapM10868b == null || !linkedHashMapM10868b.containsKey(strOptString2)) {
                    m10846c(obj, "unitId or instanceId not exist");
                    return;
                }
                View view = linkedHashMapM10868b.get(strOptString2);
                linkedHashMapM10868b.remove(strOptString2);
                if (view != null && view.getParent() != null) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) view;
                        if (viewGroup2.getChildCount() > 0) {
                            int childCount = viewGroup2.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = viewGroup2.getChildAt(i);
                                if (childAt instanceof AnythinkBTWebView) {
                                    linkedHashMapM10868b.remove(((AnythinkBTWebView) childAt).getInstanceId());
                                    ((AnythinkBTWebView) childAt).onDestory();
                                } else if (childAt instanceof AnythinkBTVideoView) {
                                    linkedHashMapM10868b.remove(((AnythinkBTVideoView) childAt).getInstanceId());
                                    ((AnythinkBTVideoView) childAt).onDestory();
                                } else if (childAt instanceof ATTempContainer) {
                                    linkedHashMapM10868b.remove(((ATTempContainer) childAt).getInstanceId());
                                    ((ATTempContainer) childAt).onDestroy();
                                }
                            }
                        }
                    }
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onDestroy();
                }
                if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onDestory();
                }
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onDestory();
                }
                m10834a(obj, strOptString2);
                m10835a(obj, "onComponentDestroy", strOptString2);
                return;
            }
            m10846c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10873g(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            if (jSONObjectOptJSONObject2 == null) {
                m10846c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            Rect rect = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
            int iOptInt = jSONObjectOptJSONObject2.optInt("width");
            int iOptInt2 = jSONObjectOptJSONObject2.optInt("height");
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null) {
                m10846c(obj, "view is null");
                return;
            }
            if (view.getParent() != null) {
                view.setLayoutParams(m10827a(view.getLayoutParams(), rect, iOptInt, iOptInt2));
                view.requestLayout();
            } else {
                if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).setRect(rect);
                    ((AnythinkBTWebView) view).setLayout(iOptInt, iOptInt2);
                }
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setRect(rect);
                    ((AnythinkBTVideoView) view).setLayout(iOptInt, iOptInt2);
                }
            }
            m10834a(obj, strOptString2);
            m10835a(obj, "onViewRectChanged", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("setViewRect failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10874h(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "params not enough");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null || view.getParent() == null) {
                m10846c(obj, "view is null");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                m10846c(obj, "parent is null");
                return;
            }
            viewGroup.removeView(view);
            m10834a(obj, strOptString2);
            m10835a(obj, "onRemoveFromView", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("removeFromSuperView failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10875i(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString3) || !linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) linkedHashMapM10868b.get(strOptString2);
            View view = linkedHashMapM10868b.get(strOptString3);
            C1360x.m4265a(view);
            if (viewGroup != null && view != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                int iOptInt2 = 0;
                if (view instanceof ATTempContainer) {
                    new StringBuilder("OperateViews setNotchString = ").append(String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f12865n), Integer.valueOf(f12866o), Integer.valueOf(f12867p), Integer.valueOf(f12868q), Integer.valueOf(f12869r)));
                    ((ATTempContainer) view).setNotchPadding(f12865n, f12866o, f12867p, f12868q, f12869r);
                    Iterator<View> it = linkedHashMapM10868b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View next = it.next();
                        if (next instanceof AnythinkBTContainer) {
                            C1360x.m4265a(view);
                            ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, jSONObjectOptJSONObject2);
                            break;
                        }
                    }
                } else {
                    Rect rect = null;
                    if (jSONObjectOptJSONObject2 != null) {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    } else if (view instanceof BTBaseView) {
                        rect = ((BTBaseView) view).getRect();
                        iOptInt2 = ((BTBaseView) view).getViewWidth();
                        iOptInt = ((BTBaseView) view).getViewHeight();
                    } else {
                        iOptInt = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    ViewGroup.LayoutParams layoutParamsM10827a = m10827a(layoutParams, rect, iOptInt2, iOptInt);
                    C1360x.m4265a(view);
                    viewGroup.addView(view, layoutParamsM10827a);
                }
                m10834a(obj, strOptString2);
                m10835a(obj, "onAppendView", strOptString2);
                StringBuilder sb = new StringBuilder("appendSubView parentId = ");
                sb.append(strOptString2);
                sb.append(" childId = ");
                sb.append(strOptString3);
                return;
            }
            m10846c(obj, "view is not exist");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("appendSubView failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10876j(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
                if (!linkedHashMapM10868b.containsKey(strOptString2) || !linkedHashMapM10868b.containsKey(strOptString3)) {
                    m10846c(obj, "instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) linkedHashMapM10868b.get(strOptString3);
                View view = linkedHashMapM10868b.get(strOptString2);
                C1360x.m4265a(view);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        Iterator<View> it = linkedHashMapM10868b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                C1360x.m4265a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        Rect rect = null;
                        int iOptInt2 = 0;
                        if (jSONObjectOptJSONObject2 != null) {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt2 = ((BTBaseView) view).getViewWidth();
                            iOptInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        ViewGroup.LayoutParams layoutParamsM10827a = m10827a(layoutParams, rect, iOptInt2, iOptInt);
                        C1360x.m4265a(view);
                        viewGroup.addView(view, layoutParamsM10827a);
                    }
                    m10834a(obj, strOptString2);
                    m10835a(obj, "onAppendViewTo", strOptString2);
                    StringBuilder sb = new StringBuilder("appendViewTo parentId = ");
                    sb.append(strOptString3);
                    sb.append(" childId = ");
                    sb.append(strOptString2);
                    return;
                }
                m10846c(obj, "view is not exist");
                return;
            }
            m10846c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("appendViewTo failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10877k(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("id");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString3) || !linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) linkedHashMapM10868b.get(strOptString2);
            View view = linkedHashMapM10868b.get(strOptString3);
            if (viewGroup != null && view != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                int iOptInt2 = 0;
                if (view instanceof ATTempContainer) {
                    new StringBuilder("OperateViews setNotchString = ").append(String.format("%1$s-%2$s-%3$s-%4$s-%5$s", Integer.valueOf(f12865n), Integer.valueOf(f12866o), Integer.valueOf(f12867p), Integer.valueOf(f12868q), Integer.valueOf(f12869r)));
                    ((ATTempContainer) view).setNotchPadding(f12865n, f12866o, f12867p, f12868q, f12869r);
                    Iterator<View> it = linkedHashMapM10868b.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View next = it.next();
                        if (next instanceof AnythinkBTContainer) {
                            C1360x.m4265a(view);
                            ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, jSONObjectOptJSONObject2);
                            break;
                        }
                    }
                } else {
                    Rect rect = null;
                    if (jSONObjectOptJSONObject2 != null) {
                        Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                        iOptInt = jSONObjectOptJSONObject2.optInt("height");
                        rect = rect2;
                    } else if (view instanceof BTBaseView) {
                        rect = ((BTBaseView) view).getRect();
                        iOptInt2 = ((BTBaseView) view).getViewWidth();
                        iOptInt = ((BTBaseView) view).getViewHeight();
                    } else {
                        iOptInt = 0;
                    }
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    if (viewGroup instanceof FrameLayout) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    } else if (viewGroup instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    }
                    viewGroup.addView(view, m10827a(layoutParams, rect, iOptInt2, iOptInt));
                }
                m10834a(obj, strOptString2);
                m10835a(obj, "onAppendView", strOptString2);
                StringBuilder sb = new StringBuilder("appendSubView parentId = ");
                sb.append(strOptString2);
                sb.append(" childId = ");
                sb.append(strOptString3);
                return;
            }
            m10846c(obj, "view is not exist");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("appendSubView failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10878l(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(strOptString)) {
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
                if (!linkedHashMapM10868b.containsKey(strOptString2) || !linkedHashMapM10868b.containsKey(strOptString3)) {
                    m10846c(obj, "instanceId is not exist");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) linkedHashMapM10868b.get(strOptString3);
                View view = linkedHashMapM10868b.get(strOptString2);
                if (viewGroup != null && view != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
                    if (view instanceof ATTempContainer) {
                        Iterator<View> it = linkedHashMapM10868b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof AnythinkBTContainer) {
                                C1360x.m4265a(view);
                                ((AnythinkBTContainer) next).appendSubView((AnythinkBTContainer) next, (ATTempContainer) view, jSONObjectOptJSONObject2);
                                break;
                            }
                        }
                    } else {
                        Rect rect = null;
                        int iOptInt2 = 0;
                        if (jSONObjectOptJSONObject2 != null) {
                            Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                            iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                            iOptInt = jSONObjectOptJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            iOptInt2 = ((BTBaseView) view).getViewWidth();
                            iOptInt = ((BTBaseView) view).getViewHeight();
                        } else {
                            iOptInt = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, m10827a(layoutParams, rect, iOptInt2, iOptInt));
                    }
                    m10834a(obj, strOptString2);
                    m10835a(obj, "onAppendViewTo", strOptString2);
                    StringBuilder sb = new StringBuilder("appendViewTo parentId = ");
                    sb.append(strOptString3);
                    sb.append(" childId = ");
                    sb.append(strOptString2);
                    return;
                }
                m10846c(obj, "view is not exist");
                return;
            }
            m10846c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("appendViewTo failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m10879m(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId is not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null || view.getParent() == null) {
                m10846c(obj, "view is null");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                m10846c(obj, "parent is null");
                return;
            }
            viewGroup.bringChildToFront(view);
            m10834a(obj, strOptString2);
            m10835a(obj, "onBringViewToFront", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("bringViewToFront failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10880n(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null) {
                m10846c(obj, "view not exist");
                return;
            }
            view.setVisibility(8);
            m10834a(obj, strOptString2);
            m10835a(obj, "onHideView", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("hideView failed: + ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10881o(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null) {
                m10846c(obj, "view not exist");
                return;
            }
            view.setVisibility(0);
            m10834a(obj, strOptString2);
            m10835a(obj, "onShowView", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("showView failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m10882p(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString(C1875i.f11529d);
            if (TextUtils.isEmpty(strOptString3)) {
                m10846c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null) {
                m10846c(obj, "view not exist");
                return;
            }
            m10834a(obj, strOptString2);
            view.setBackgroundColor(Color.parseColor(strOptString3));
            m10835a(obj, "onViewBgColorChanged", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("setViewBgColor failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10883q(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null) {
                m10846c(obj, "view not exist");
                return;
            }
            view.setAlpha((float) dOptDouble);
            m10834a(obj, strOptString2);
            m10835a(obj, "onViewAlphaChanged", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("setViewAlpha failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m10884r(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            double dOptDouble = jSONObjectOptJSONObject.optDouble("vertical", 1.0d);
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (view == null) {
                m10846c(obj, "view not exist");
                return;
            }
            view.setScaleX((float) dOptDouble2);
            view.setScaleY((float) dOptDouble);
            m10834a(obj, strOptString2);
            m10835a(obj, "onViewScaleChanged", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("setViewScale failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m10885s(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2) || !linkedHashMapM10868b.containsKey(strOptString3)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            View view2 = linkedHashMapM10868b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m10846c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            Rect rect = null;
            int iOptInt2 = 0;
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt2 = ((BTBaseView) view).getViewWidth();
                iOptInt = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            ViewGroup.LayoutParams layoutParamsM10827a = m10827a(layoutParams, rect, iOptInt2, iOptInt);
            C1360x.m4265a(view);
            viewGroup.addView(view, iIndexOfChild + 1, layoutParamsM10827a);
            m10834a(obj, strOptString2);
            m10835a(obj, "onInsertViewAbove", strOptString2);
            StringBuilder sb = new StringBuilder("insertViewAbove instanceId = ");
            sb.append(strOptString2);
            sb.append(" brotherId = ");
            sb.append(strOptString3);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("insertViewAbove failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m10886t(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int viewWidth;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2) || !linkedHashMapM10868b.containsKey(strOptString3)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            View view2 = linkedHashMapM10868b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m10846c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            Rect rect = null;
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                int iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                viewWidth = iOptInt2;
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                viewWidth = ((BTBaseView) view).getViewWidth();
                iOptInt = ((BTBaseView) view).getViewHeight();
            } else {
                viewWidth = 0;
                iOptInt = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            ViewGroup.LayoutParams layoutParamsM10827a = m10827a(layoutParams, rect, viewWidth, iOptInt);
            C1360x.m4265a(view);
            int i = iIndexOfChild - 1;
            viewGroup.addView(view, i >= 0 ? i : 0, layoutParamsM10827a);
            m10834a(obj, strOptString2);
            m10835a(obj, "onInsertViewBelow", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("insertViewBelow failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m10887u(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2) || !linkedHashMapM10868b.containsKey(strOptString3)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            View view2 = linkedHashMapM10868b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m10846c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            Rect rect = null;
            int iOptInt2 = 0;
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt2 = ((BTBaseView) view).getViewWidth();
                iOptInt = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, iIndexOfChild + 1, m10827a(layoutParams, rect, iOptInt2, iOptInt));
            m10834a(obj, strOptString2);
            m10835a(obj, "onInsertViewAbove", strOptString2);
            StringBuilder sb = new StringBuilder("insertViewAbove instanceId = ");
            sb.append(strOptString2);
            sb.append(" brotherId = ");
            sb.append(strOptString3);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("insertViewAbove failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m10888v(Object obj, JSONObject jSONObject) {
        int iOptInt;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("targetComponentId");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rect");
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2) || !linkedHashMapM10868b.containsKey(strOptString3)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            View view2 = linkedHashMapM10868b.get(strOptString3);
            if (view2 == null || view2.getParent() == null) {
                m10846c(obj, "view not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            Rect rect = null;
            int iOptInt2 = 0;
            if (jSONObjectOptJSONObject2 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject2.optInt("top", f12852a), jSONObjectOptJSONObject2.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject2.optInt("bottom", f12852a));
                iOptInt2 = jSONObjectOptJSONObject2.optInt("width");
                iOptInt = jSONObjectOptJSONObject2.optInt("height");
                rect = rect2;
            } else if (view instanceof BTBaseView) {
                rect = ((BTBaseView) view).getRect();
                iOptInt2 = ((BTBaseView) view).getViewWidth();
                iOptInt = ((BTBaseView) view).getViewHeight();
            } else {
                iOptInt = 0;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(-1, -1);
            }
            viewGroup.addView(view, iIndexOfChild, m10827a(layoutParams, rect, iOptInt2, iOptInt));
            m10834a(obj, strOptString2);
            m10835a(obj, "onInsertViewBelow", strOptString2);
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("insertViewBelow failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10889w(Object obj, JSONObject jSONObject) {
        int iOptInt;
        int i;
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m10846c(obj, "data is empty");
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("content");
            if (jSONObjectOptJSONObject2 == null) {
                m10846c(obj, "content is empty");
                return;
            }
            String strOptString3 = jSONObjectOptJSONObject2.optString("fileURL");
            String strOptString4 = jSONObjectOptJSONObject2.optString("filePath");
            String strOptString5 = jSONObjectOptJSONObject2.optString(C3341a.f18138b);
            if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4) && TextUtils.isEmpty(strOptString5)) {
                m10846c(obj, "url is empty");
                return;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("campaigns");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    C1781c c1781cM8703b = C1781c.m8703b(jSONArrayOptJSONArray.getJSONObject(i2));
                    if (c1781cM8703b != null) {
                        c1781cM8703b.m8891l(strOptString);
                        arrayList.add(c1781cM8703b);
                    }
                }
            }
            String strOptString6 = jSONObjectOptJSONObject2.optString("unitId");
            C2340d c2340dM12008a = C2340d.m12008a(jSONObjectOptJSONObject2.optJSONObject("unitSetting"));
            if (c2340dM12008a != null) {
                c2340dM12008a.m12080a(strOptString6);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rect");
            Rect rect = new Rect(f12852a, f12852a, f12852a, f12852a);
            if (jSONObjectOptJSONObject3 != null) {
                Rect rect2 = new Rect(jSONObjectOptJSONObject3.optInt(ScrollClickView.DIR_LEFT, f12852a), jSONObjectOptJSONObject3.optInt("top", f12852a), jSONObjectOptJSONObject3.optInt(ScrollClickView.DIR_RIGHT, f12852a), jSONObjectOptJSONObject3.optInt("bottom", f12852a));
                int iOptInt2 = jSONObjectOptJSONObject3.optInt("width");
                iOptInt = jSONObjectOptJSONObject3.optInt("height");
                i = iOptInt2;
                rect = rect2;
            } else {
                iOptInt = 0;
                i = 0;
            }
            int iOptInt3 = jSONObjectOptJSONObject2.optInt("refreshCache", 0);
            try {
                LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
                if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                    m10846c(obj, "instanceId not exist");
                    return;
                }
                View view = linkedHashMapM10868b.get(strOptString2);
                if (!(view instanceof AnythinkBTWebView)) {
                    m10846c(obj, "view not exist");
                    return;
                }
                AnythinkBTWebView anythinkBTWebView = (AnythinkBTWebView) view;
                anythinkBTWebView.setHtml(strOptString5);
                anythinkBTWebView.setFilePath(strOptString4);
                anythinkBTWebView.setFileURL(strOptString3);
                anythinkBTWebView.setRect(rect);
                anythinkBTWebView.setLayout(i, iOptInt);
                anythinkBTWebView.setCampaigns(arrayList);
                anythinkBTWebView.setRewardUnitSetting(c2340dM12008a);
                anythinkBTWebView.webviewLoad(iOptInt3);
                m10834a(obj, strOptString2);
            } catch (Throwable th) {
                th = th;
                m10846c(obj, th.getMessage());
                new StringBuilder("webviewLoad failed: ").append(th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m10890x(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                m10846c(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewReload()) {
                m10834a(obj, strOptString2);
            } else {
                m10846c(obj, "reload failed");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("webviewReload failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m10891y(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                m10846c(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewGoBack()) {
                m10834a(obj, strOptString2);
            } else {
                m10846c(obj, "webviewGoBack failed");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("webviewGoBack failed: ").append(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m10892z(Object obj, JSONObject jSONObject) {
        WindVaneWebView windVaneWebView;
        try {
            String strOptString = jSONObject.optString("unitId");
            String strOptString2 = jSONObject.optString("id");
            String strM10852h = m10852h(strOptString2);
            if (TextUtils.isEmpty(strM10852h) && (windVaneWebView = ((C1460a) obj).f6757a) != null) {
                strM10852h = windVaneWebView.getRid();
            }
            if (jSONObject.optJSONObject("data") == null) {
                m10846c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> linkedHashMapM10868b = m10868b(strOptString, strM10852h);
            if (!linkedHashMapM10868b.containsKey(strOptString2)) {
                m10846c(obj, "instanceId not exist");
                return;
            }
            View view = linkedHashMapM10868b.get(strOptString2);
            if (!(view instanceof AnythinkBTWebView)) {
                m10846c(obj, "view not exist");
            } else if (((AnythinkBTWebView) view).webviewGoForward()) {
                m10834a(obj, strOptString2);
            } else {
                m10846c(obj, "webviewGoForward failed");
            }
        } catch (Throwable th) {
            m10846c(obj, th.getMessage());
            new StringBuilder("webviewGoForward failed: ").append(th.getMessage());
        }
    }
}
