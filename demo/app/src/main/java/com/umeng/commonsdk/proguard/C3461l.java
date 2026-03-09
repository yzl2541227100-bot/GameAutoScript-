package com.umeng.commonsdk.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.expressad.p086d.p087a.C1485b;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.common.C3489e;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.l */
/* JADX INFO: loaded from: classes2.dex */
public class C3461l {

    /* JADX INFO: renamed from: a */
    private static final String f18847a = "BatteryUtils";

    /* JADX INFO: renamed from: b */
    private static boolean f18848b;

    /* JADX INFO: renamed from: c */
    private static Context f18849c;

    /* JADX INFO: renamed from: d */
    private BroadcastReceiver f18850d;

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3461l f18852a = new C3461l();

        private a() {
        }
    }

    private C3461l() {
        this.f18850d = new BroadcastReceiver() { // from class: com.umeng.commonsdk.proguard.l.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("le", intent.getIntExtra("level", 0));
                        } catch (Exception unused) {
                        }
                        try {
                            jSONObject.put("vol", intent.getIntExtra("voltage", 0));
                        } catch (Exception unused2) {
                        }
                        try {
                            jSONObject.put("temp", intent.getIntExtra("temperature", 0));
                            jSONObject.put("ts", System.currentTimeMillis());
                        } catch (Exception unused3) {
                        }
                        int intExtra = intent.getIntExtra("status", 0);
                        int i = -1;
                        int i2 = 2;
                        if (intExtra != 1) {
                            if (intExtra == 2) {
                                i = 1;
                            } else if (intExtra == 4) {
                                i = 0;
                            } else if (intExtra == 5) {
                                i = 2;
                            }
                        }
                        try {
                            jSONObject.put("st", i);
                        } catch (Exception unused4) {
                        }
                        int intExtra2 = intent.getIntExtra("plugged", 0);
                        if (intExtra2 == 1) {
                            i2 = 1;
                        } else if (intExtra2 != 2) {
                            i2 = 0;
                        }
                        try {
                            jSONObject.put(C1485b.f7188dx, i2);
                            jSONObject.put("ts", System.currentTimeMillis());
                        } catch (Exception unused5) {
                        }
                        C3489e.m16329a(C3461l.f18847a, jSONObject.toString());
                        UMWorkDispatch.sendEvent(context, C3408a.f18659g, C3435b.m15851a(C3461l.f18849c).m15852a(), jSONObject.toString());
                        C3461l.this.m15965c();
                    }
                } catch (Throwable th) {
                    C3454e.m15904a(C3461l.f18849c, th);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static C3461l m15961a(Context context) {
        if (f18849c == null && context != null) {
            f18849c = context.getApplicationContext();
        }
        return a.f18852a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m15963a() {
        return f18848b;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m15964b() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            f18849c.registerReceiver(this.f18850d, intentFilter);
            f18848b = true;
        } catch (Throwable th) {
            C3454e.m15904a(f18849c, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m15965c() {
        try {
            f18849c.unregisterReceiver(this.f18850d);
            f18848b = false;
        } catch (Throwable th) {
            C3454e.m15904a(f18849c, th);
        }
    }
}
