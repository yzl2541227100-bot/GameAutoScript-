package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.proguard.C3454e;
import com.umeng.commonsdk.statistics.common.C3489e;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.framework.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3407e {

    /* JADX INFO: renamed from: a */
    private static HandlerThread f18647a = null;

    /* JADX INFO: renamed from: b */
    private static Handler f18648b = null;

    /* JADX INFO: renamed from: c */
    private static C3406d f18649c = null;

    /* JADX INFO: renamed from: d */
    private static final int f18650d = 768;

    /* JADX INFO: renamed from: e */
    private static final int f18651e = 769;

    /* JADX INFO: renamed from: f */
    private static final int f18652f = 770;

    private C3407e() {
    }

    /* JADX INFO: renamed from: a */
    private static JSONObject m15688a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String str2;
        Context contextM15665a = C3405c.m15665a();
        if (jSONObject != null && jSONObject2 != null) {
            try {
                if (jSONObject.opt(str) != null && (jSONObject.opt(str) instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) jSONObject.opt(str);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception e) {
                                C3454e.m15904a(contextM15665a, e);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C3454e.m15904a(contextM15665a, th);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m15689a() {
        Handler handler = f18648b;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = f18652f;
            f18648b.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15690a(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        if (context == null || uMLogDataProtocol == null) {
            C3489e.m16332b("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        C3405c.m15668a(context.getApplicationContext());
        if (C3405c.m15669a(i, uMLogDataProtocol)) {
            if (f18647a == null || f18648b == null) {
                m15696e();
            }
            if (f18648b != null) {
                if (f18649c == null) {
                    C3404b.m15658f(context);
                    f18649c = new C3406d(context, f18648b);
                }
                Message messageObtainMessage = f18648b.obtainMessage();
                messageObtainMessage.what = f18650d;
                messageObtainMessage.arg1 = i;
                messageObtainMessage.obj = obj;
                f18648b.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m15693b(Message message) {
        int i = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol uMLogDataProtocolM15666a = C3405c.m15666a(C3405c.m15667a(i));
        if (uMLogDataProtocolM15666a != null) {
            C3489e.m16332b("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x" + Integer.toHexString(i) + "]");
            uMLogDataProtocolM15666a.workEvent(obj, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static void m15695d() {
        C3489e.m16332b("--->>> autoProcess Enter...");
        Context contextM15665a = C3405c.m15665a();
        if (contextM15665a != null) {
            long jMaxDataSpace = UMEnvelopeBuild.maxDataSpace(contextM15665a);
            UMLogDataProtocol uMLogDataProtocolM15666a = C3405c.m15666a("analytics");
            JSONObject jSONObject = null;
            int length = 0;
            try {
                if (UMEnvelopeBuild.isReadyBuild(contextM15665a, UMLogDataProtocol.UMBusinessType.U_DPLUS) && uMLogDataProtocolM15666a != null && (jSONObject = uMLogDataProtocolM15666a.setupReportData(jMaxDataSpace)) != null) {
                    length = jSONObject.toString().getBytes().length;
                }
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("header", new JSONObject());
                        jSONObject2.put("content", new JSONObject());
                    } catch (Throwable th) {
                        C3454e.m15904a(contextM15665a, th);
                    }
                    if (jSONObject != null && length > 0) {
                        jSONObject2 = m15688a(m15688a(jSONObject2, jSONObject.optJSONObject("header"), "header"), jSONObject.optJSONObject("content"), "content");
                    }
                    if (jSONObject2 == null || UMEnvelopeBuild.buildEnvelopeWithExtHeader(contextM15665a, jSONObject2.optJSONObject("header"), jSONObject2.optJSONObject("content")) == null || jSONObject == null) {
                        return;
                    }
                    uMLogDataProtocolM15666a.removeCacheData(jSONObject);
                }
            } catch (Throwable th2) {
                C3454e.m15904a(contextM15665a, th2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m15696e() {
        C3489e.m16332b("--->>> Dispatch: init Enter...");
        if (f18647a == null) {
            HandlerThread handlerThread = new HandlerThread("work_thread");
            f18647a = handlerThread;
            handlerThread.start();
            if (f18648b == null) {
                f18648b = new Handler(f18647a.getLooper()) { // from class: com.umeng.commonsdk.framework.e.1
                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        switch (message.what) {
                            case C3407e.f18650d /* 768 */:
                                C3407e.m15693b(message);
                                break;
                            case C3407e.f18651e /* 769 */:
                                C3407e.m15695d();
                                break;
                            case C3407e.f18652f /* 770 */:
                                C3407e.m15698g();
                                break;
                        }
                    }
                };
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m15697f() {
        if (f18647a != null) {
            f18647a = null;
        }
        if (f18648b != null) {
            f18648b = null;
        }
        if (f18649c != null) {
            f18649c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static void m15698g() {
        if (f18649c == null || f18647a == null) {
            return;
        }
        C3406d.m15672a();
        C3489e.m16332b("--->>> handleQuit: Quit dispatch thread.");
        f18647a.quit();
        m15697f();
    }
}
