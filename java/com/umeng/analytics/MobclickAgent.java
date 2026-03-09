package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public class MobclickAgent {

    /* JADX INFO: renamed from: a */
    private static final String f18280a = "input map is null";

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1),
        E_DUM_NORMAL(160),
        E_DUM_GAME(161);


        /* JADX INFO: renamed from: a */
        private int f18282a;

        EScenarioType(int i) {
            this.f18282a = i;
        }

        public int toValue() {
            return this.f18282a;
        }
    }

    public static void enableEncrypt(boolean z) {
    }

    public static C3375b getAgent() {
        return C3375b.m15394a();
    }

    public static void onEvent(Context context, String str) {
        C3375b.m15394a().m15404a(context, str, null, -1L, 1);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            MLog.m16287w("label is null or empty");
        } else {
            C3375b.m15394a().m15404a(context, str, str2, -1L, 1);
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        if (map == null) {
            MLog.m16269e(f18280a);
        } else {
            C3375b.m15394a().m15407a(context, str, new HashMap(map), -1L);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("__ct__", Integer.valueOf(i));
        C3375b.m15394a().m15407a(context, str, map2, -1L);
    }

    public static void onKillProcess(Context context) {
        C3375b.m15394a().m15423c(context);
    }

    public static void onPageEnd(String str) {
        if (TextUtils.isEmpty(str)) {
            MLog.m16269e("pageName is null or empty");
        } else {
            C3375b.m15394a().m15420b(str);
        }
    }

    public static void onPageStart(String str) {
        if (TextUtils.isEmpty(str)) {
            MLog.m16269e("pageName is null or empty");
        } else {
            C3375b.m15394a().m15412a(str);
        }
    }

    public static void onPause(Context context) {
        C3375b.m15394a().m15418b(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignIn(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "uid is null";
        } else if (str2.length() > 64) {
            str3 = "uid is Illegal(length bigger then  legitimate length).";
        } else if (TextUtils.isEmpty(str)) {
            C3375b.m15394a().m15413a("_adhoc", str2);
            return;
        } else {
            if (str.length() <= 32) {
                C3375b.m15394a().m15413a(str, str2);
                return;
            }
            str3 = "provider is Illegal(length bigger then  legitimate length).";
        }
        MLog.m16287w(str3);
    }

    public static void onProfileSignOff() {
        C3375b.m15394a().m15431g();
    }

    public static void onResume(Context context) {
        if (context == null) {
            MLog.m16269e("unexpected null context in onResume");
        } else {
            C3375b.m15394a().m15399a(context);
        }
    }

    public static void openActivityDurationTrack(boolean z) {
        C3375b.m15394a().m15421b(z);
    }

    public static void reportError(Context context, String str) {
        C3375b.m15394a().m15402a(context, str);
    }

    public static void reportError(Context context, Throwable th) {
        C3375b.m15394a().m15408a(context, th);
    }

    public static void setCatchUncaughtExceptions(boolean z) {
        C3375b.m15394a().m15416a(z);
    }

    public static void setCheckDevice(boolean z) {
    }

    public static void setDebugMode(boolean z) {
    }

    public static void setLatencyWindow(long j) {
    }

    public static void setLocation(double d, double d2) {
        C3375b.m15394a().m15397a(d, d2);
    }

    public static void setOpenGLContext(GL10 gl10) {
        C3375b.m15394a().m15415a(gl10);
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
        C3375b.m15394a().m15401a(context, eScenarioType);
    }

    public static void setSecret(Context context, String str) {
        C3375b.m15394a().m15419b(context, str);
    }

    public static void setSessionContinueMillis(long j) {
        C3375b.m15394a().m15398a(j);
    }
}
