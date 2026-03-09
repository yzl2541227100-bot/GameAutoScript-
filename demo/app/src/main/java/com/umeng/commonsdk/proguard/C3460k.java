package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.C3489e;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.k */
/* JADX INFO: loaded from: classes2.dex */
public class C3460k {

    /* JADX INFO: renamed from: b */
    private static final String f18840b = "BaseStationUtils";

    /* JADX INFO: renamed from: c */
    private static boolean f18841c;

    /* JADX INFO: renamed from: d */
    private static Context f18842d;

    /* JADX INFO: renamed from: a */
    public PhoneStateListener f18843a;

    /* JADX INFO: renamed from: e */
    private TelephonyManager f18844e;

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static final C3460k f18846a = new C3460k(C3460k.f18842d);

        private a() {
        }
    }

    private C3460k(Context context) {
        this.f18843a = new PhoneStateListener() { // from class: com.umeng.commonsdk.proguard.k.1
            /* JADX WARN: Removed duplicated region for block: B:48:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.telephony.PhoneStateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onSignalStrengthsChanged(android.telephony.SignalStrength r10) {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.C3460k.AnonymousClass1.onSignalStrengthsChanged(android.telephony.SignalStrength):void");
            }
        };
        if (context != null) {
            try {
                this.f18844e = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C3460k m15953a(Context context) {
        if (f18842d == null && context != null) {
            f18842d = context.getApplicationContext();
        }
        return a.f18846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public String m15956e() {
        try {
            String simOperator = ((TelephonyManager) f18842d.getSystemService("phone")).getSimOperator();
            if (TextUtils.isEmpty(simOperator)) {
                return null;
            }
            if (!simOperator.equals("46000") && !simOperator.equals("46002")) {
                if (simOperator.equals("46001")) {
                    return "中国联通";
                }
                if (simOperator.equals("46003")) {
                    return "中国电信";
                }
                return null;
            }
            return "中国移动";
        } catch (Throwable th) {
            C3454e.m15904a(f18842d, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m15957a() {
        return f18841c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m15958b() {
        C3489e.m16341c(f18840b, "base station registerListener");
        try {
            TelephonyManager telephonyManager = this.f18844e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f18843a, 256);
            }
            f18841c = true;
        } catch (Throwable th) {
            C3454e.m15904a(f18842d, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m15959c() {
        C3489e.m16341c(f18840b, "base station unRegisterListener");
        try {
            TelephonyManager telephonyManager = this.f18844e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f18843a, 0);
            }
            f18841c = false;
        } catch (Throwable th) {
            C3454e.m15904a(f18842d, th);
        }
    }
}
