package com.octopus.p222ad.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.octopus.p222ad.C3063R;
import com.octopus.p222ad.internal.nativead.AsyncTaskC3122a;
import com.octopus.p222ad.internal.nativead.C3123b;
import com.octopus.p222ad.internal.utilities.HaoboLog;
import com.octopus.p222ad.internal.view.BannerAdViewImpl;
import com.octopus.p222ad.internal.view.InterstitialAdViewImpl;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.octopus.ad.internal.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3110c {

    /* JADX INFO: renamed from: a */
    private ScheduledExecutorService f17098a;

    /* JADX INFO: renamed from: f */
    private final InterfaceC3073a f17103f;

    /* JADX INFO: renamed from: g */
    private AbstractC3129o f17104g;

    /* JADX INFO: renamed from: b */
    private int f17099b = -1;

    /* JADX INFO: renamed from: d */
    private long f17101d = -1;

    /* JADX INFO: renamed from: e */
    private long f17102e = -1;

    /* JADX INFO: renamed from: h */
    private c f17105h = c.STOPPED;

    /* JADX INFO: renamed from: c */
    private final b f17100c = new b(this);

    /* JADX INFO: renamed from: com.octopus.ad.internal.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17106a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f17107b;

        static {
            int[] iArr = new int[EnumC3119l.values().length];
            f17107b = iArr;
            try {
                iArr[EnumC3119l.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17107b[EnumC3119l.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17107b[EnumC3119l.SPLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17107b[EnumC3119l.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17107b[EnumC3119l.PREFETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.values().length];
            f17106a = iArr2;
            try {
                iArr2[c.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17106a[c.SINGLE_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17106a[c.AUTO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.c$a */
    public class a implements Runnable {
        private a() {
        }

        public /* synthetic */ a(C3110c c3110c, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.handler_message_pass));
            C3110c.this.f17100c.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.c$b */
    public static class b extends Handler {

        /* JADX INFO: renamed from: a */
        private final C3110c f17109a;

        public b(C3110c c3110c) {
            super(Looper.getMainLooper());
            this.f17109a = c3110c;
        }

        @Override // android.os.Handler
        @SuppressLint({"NewApi"})
        public synchronized void handleMessage(Message message) {
            AbstractC3129o c3113f;
            C3110c c3110c = this.f17109a;
            if (c3110c != null && c3110c.f17103f.isReadyToStart()) {
                if (c3110c.f17101d != -1) {
                    HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.new_ad_since, Math.max(0, (int) (System.currentTimeMillis() - c3110c.f17101d))));
                }
                c3110c.f17101d = System.currentTimeMillis();
                int i = AnonymousClass1.f17107b[c3110c.f17103f.getMediaType().ordinal()];
                if (i == 1) {
                    c3113f = new C3113f((BannerAdViewImpl) c3110c.f17103f);
                } else if (i == 2) {
                    c3113f = new C3113f((InterstitialAdViewImpl) c3110c.f17103f);
                } else if (i == 3) {
                    c3113f = new C3113f((BannerAdViewImpl) c3110c.f17103f);
                } else if (i == 4) {
                    c3113f = new C3123b((AsyncTaskC3122a) c3110c.f17103f);
                } else {
                    if (i != 5) {
                        c3110c.f17104g.mo14393a();
                    }
                    c3113f = new C3121n();
                }
                c3110c.f17104g = c3113f;
                c3110c.f17104g.mo14393a();
            }
        }
    }

    /* JADX INFO: renamed from: com.octopus.ad.internal.c$c */
    public enum c {
        STOPPED,
        SINGLE_REQUEST,
        AUTO_REFRESH
    }

    public C3110c(InterfaceC3073a interfaceC3073a) {
        this.f17103f = interfaceC3073a;
    }

    /* JADX INFO: renamed from: d */
    private void m14363d() {
        if (this.f17098a == null) {
            this.f17098a = Executors.newScheduledThreadPool(4);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m14364e() {
        ScheduledExecutorService scheduledExecutorService = this.f17098a;
        if (scheduledExecutorService == null) {
            return;
        }
        scheduledExecutorService.shutdownNow();
        try {
            this.f17098a.awaitTermination(this.f17099b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.f17098a = null;
            throw th;
        }
        this.f17098a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m14365a() {
        AbstractC3129o abstractC3129o = this.f17104g;
        if (abstractC3129o != null) {
            abstractC3129o.mo14400c();
            this.f17104g = null;
        }
        m14364e();
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.stop));
        this.f17102e = System.currentTimeMillis();
        this.f17105h = c.STOPPED;
    }

    /* JADX INFO: renamed from: a */
    public void m14366a(int i) {
        boolean z = this.f17099b != i;
        this.f17099b = i;
        if (!z || this.f17105h.equals(c.STOPPED)) {
            return;
        }
        HaoboLog.m14607d(HaoboLog.baseLogTag, "AdFetcher refresh mPeriod changed to " + this.f17099b);
        HaoboLog.m14607d(HaoboLog.baseLogTag, "Resetting AdFetcher");
        m14365a();
        m14367b();
    }

    /* JADX INFO: renamed from: b */
    public void m14367b() {
        c cVar;
        HaoboLog.m14607d(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.start));
        m14363d();
        int i = AnonymousClass1.f17106a[this.f17105h.ordinal()];
        AnonymousClass1 anonymousClass1 = null;
        long jMin = 0;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.fetcher_start_single));
            this.f17098a.schedule(new a(this, anonymousClass1), 0L, TimeUnit.SECONDS);
            return;
        }
        if (this.f17099b <= 0) {
            HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.fetcher_start_single));
            this.f17098a.schedule(new a(this, anonymousClass1), 0L, TimeUnit.SECONDS);
            cVar = c.SINGLE_REQUEST;
        } else {
            HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.fetcher_start_auto));
            int i2 = this.f17099b;
            long j = this.f17102e;
            if (j != -1) {
                long j2 = this.f17101d;
                if (j2 != -1) {
                    long j3 = i2;
                    jMin = Math.min(j3, Math.max(0L, j3 - (j - j2)));
                }
            }
            long j4 = jMin;
            HaoboLog.m14613v(HaoboLog.baseLogTag, HaoboLog.getString(C3063R.string.request_delayed_by_x_ms, j4));
            this.f17098a.scheduleAtFixedRate(new a(this, anonymousClass1), j4, i2, TimeUnit.MILLISECONDS);
            cVar = c.AUTO_REFRESH;
        }
        this.f17105h = cVar;
    }

    /* JADX INFO: renamed from: c */
    public void m14368c() {
        this.f17101d = -1L;
        this.f17102e = -1L;
    }
}
