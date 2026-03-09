package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.umeng.commonsdk.amap.UMAmapConfig;
import com.umeng.commonsdk.statistics.common.C3489e;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.g */
/* JADX INFO: loaded from: classes2.dex */
public class C3456g {

    /* JADX INFO: renamed from: a */
    private static final String f18802a = "UMSysLocation";

    /* JADX INFO: renamed from: c */
    private static final int f18803c = 10000;

    /* JADX INFO: renamed from: b */
    private LocationManager f18804b;

    /* JADX INFO: renamed from: e */
    private Context f18806e;

    /* JADX INFO: renamed from: g */
    private AbstractC3458i f18808g;

    /* JADX INFO: renamed from: d */
    private boolean f18805d = false;

    /* JADX INFO: renamed from: f */
    private LocationListener f18807f = new LocationListener() { // from class: com.umeng.commonsdk.proguard.g.1
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            C3489e.m16329a(C3456g.f18802a, "onLocationChanged");
            try {
                C3456g.this.f18805d = false;
                if (C3456g.this.f18808g != null) {
                    C3456g.this.f18808g.mo15916a(location);
                }
            } catch (Throwable th) {
                C3454e.m15904a(C3456g.this.f18806e, th);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    private C3456g() {
    }

    public C3456g(Context context) {
        if (context == null) {
            MLog.m16269e("Context参数不能为null");
        } else {
            this.f18806e = context.getApplicationContext();
            this.f18804b = (LocationManager) context.getApplicationContext().getSystemService(RequestParameters.SUBRESOURCE_LOCATION);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m15912a() {
        C3489e.m16329a(f18802a, "destroy");
        try {
        } catch (Throwable th) {
            C3454e.m15904a(this.f18806e, th);
        }
        if (UMUtils.checkPermission(this.f18806e, "android.permission.ACCESS_COARSE_LOCATION") && UMUtils.checkPermission(this.f18806e, "android.permission.ACCESS_FINE_LOCATION")) {
            LocationManager locationManager = this.f18804b;
            if (locationManager != null) {
                LocationListener locationListener = this.f18807f;
                if (locationListener != null) {
                    try {
                        locationManager.removeUpdates(locationListener);
                    } catch (Throwable unused) {
                    }
                }
                this.f18804b = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m15913a(AbstractC3458i abstractC3458i) {
        Context context;
        LocationManager locationManager;
        final Timer timer;
        TimerTask timerTask;
        C3489e.m16329a(f18802a, "getSystemLocation");
        if (abstractC3458i != null && (context = this.f18806e) != null) {
            this.f18808g = abstractC3458i;
            if (!UMUtils.checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || !UMUtils.checkPermission(this.f18806e, "android.permission.ACCESS_FINE_LOCATION")) {
                AbstractC3458i abstractC3458i2 = this.f18808g;
                if (abstractC3458i2 != null) {
                    abstractC3458i2.mo15916a(null);
                }
                return;
            }
            try {
                this.f18805d = true;
                locationManager = this.f18804b;
            } catch (Throwable th) {
                C3489e.m16329a(f18802a, "e is " + th);
                if (abstractC3458i != null) {
                    try {
                        abstractC3458i.mo15916a(null);
                    } catch (Throwable th2) {
                        C3454e.m15904a(this.f18806e, th2);
                    }
                }
                C3454e.m15904a(this.f18806e, th);
            }
            if (locationManager == null || !locationManager.isProviderEnabled("network")) {
                if (this.f18804b.isProviderEnabled("gps")) {
                    C3489e.m16329a(f18802a, "GPS_PROVIDER");
                    this.f18804b.requestLocationUpdates("gps", 1000L, 0.0f, this.f18807f);
                    timer = new Timer();
                    timerTask = new TimerTask() { // from class: com.umeng.commonsdk.proguard.g.3
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            try {
                                C3489e.m16329a(C3456g.f18802a, "GPS_PROVIDER runing");
                                Timer timer2 = timer;
                                if (timer2 != null) {
                                    timer2.cancel();
                                }
                                if (C3456g.this.f18805d) {
                                    if (C3456g.this.f18804b != null && C3456g.this.f18807f != null) {
                                        try {
                                            C3456g.this.f18804b.removeUpdates(C3456g.this.f18807f);
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    if (C3456g.this.f18808g != null) {
                                        C3456g.this.f18808g.mo15916a(null);
                                    }
                                }
                            } catch (Throwable th3) {
                                C3454e.m15904a(C3456g.this.f18806e, th3);
                            }
                        }
                    };
                }
            }
            C3489e.m16329a(f18802a, "NETWORK_PROVIDER");
            this.f18804b.requestLocationUpdates("network", 1000L, 0.0f, this.f18807f);
            timer = new Timer();
            timerTask = new TimerTask() { // from class: com.umeng.commonsdk.proguard.g.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        C3489e.m16329a(C3456g.f18802a, "NETWORK_PROVIDER runing");
                        Timer timer2 = timer;
                        if (timer2 != null) {
                            timer2.cancel();
                        }
                        if (C3456g.this.f18805d) {
                            if (C3456g.this.f18804b != null && C3456g.this.f18807f != null) {
                                try {
                                    C3456g.this.f18804b.removeUpdates(C3456g.this.f18807f);
                                } catch (Throwable unused) {
                                }
                            }
                            if (C3456g.this.f18808g != null) {
                                C3456g.this.f18808g.mo15916a(null);
                            }
                        }
                    } catch (Throwable th3) {
                        C3454e.m15904a(C3456g.this.f18806e, th3);
                    }
                }
            };
            timer.schedule(timerTask, UMAmapConfig.AMAP_CACHE_WRITE_TIME);
        }
    }
}
