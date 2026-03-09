package com.anythink.basead.p025ui.guidetoclickv2;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.p027b.AbstractC0989b;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.exoplayer.C1575f;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseG2CV2View extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC1001b f2056a;

    /* JADX INFO: renamed from: b */
    public AbstractC0989b.a f2057b;

    /* JADX INFO: renamed from: c */
    private long f2058c;

    /* JADX INFO: renamed from: d */
    private long f2059d;

    /* JADX INFO: renamed from: e */
    private Runnable f2060e;

    /* JADX INFO: renamed from: f */
    private boolean f2061f;

    /* JADX INFO: renamed from: g */
    private boolean f2062g;

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View$a */
    public class C1000a {

        /* JADX INFO: renamed from: a */
        public static final int f2064a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f2065b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f2066c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f2067d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f2068e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f2069f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f2070g = 7;

        private C1000a() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View$b */
    public interface InterfaceC1001b {
        /* JADX INFO: renamed from: a */
        void mo1225a();

        /* JADX INFO: renamed from: b */
        void mo1226b();
    }

    public BaseG2CV2View(Context context) {
        this(context, null);
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseG2CV2View(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2058c = C1575f.f8394a;
        this.f2062g = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m1221b(BaseG2CV2View baseG2CV2View) {
        baseG2CV2View.f2061f = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void mo1222a() {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1223a(int i, int i2);

    /* JADX INFO: renamed from: b */
    public void mo1224b() {
    }

    public boolean canStartNextAnim() {
        return true;
    }

    public void init(long j, int i, int i2, AbstractC0989b.a aVar, InterfaceC1001b interfaceC1001b) {
        this.f2058c = j;
        this.f2057b = aVar;
        this.f2056a = interfaceC1001b;
        this.f2061f = false;
        this.f2060e = new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseG2CV2View baseG2CV2View = BaseG2CV2View.this;
                if (baseG2CV2View.f2056a == null || baseG2CV2View.f2061f || !BaseG2CV2View.this.canStartNextAnim()) {
                    return;
                }
                BaseG2CV2View.m1221b(BaseG2CV2View.this);
                BaseG2CV2View.this.f2056a.mo1225a();
                BaseG2CV2View.this.mo1224b();
            }
        };
        mo1223a(i, i2);
    }

    public void pauseAnimPlay() {
        if (this.f2062g) {
            this.f2062g = false;
            long j = this.f2058c;
            if (j > 0) {
                this.f2058c = Math.max(j - (SystemClock.elapsedRealtime() - this.f2059d), 0L);
            }
            C1175n.m2059a().m2144d(this.f2060e);
            mo1224b();
        }
    }

    public void release() {
    }

    public void resumeAnimPlay() {
        if (this.f2062g) {
            return;
        }
        this.f2062g = true;
        this.f2059d = SystemClock.elapsedRealtime();
        if (this.f2058c <= 0) {
            this.f2056a.mo1225a();
        } else {
            mo1222a();
            C1175n.m2059a().m2118a(this.f2060e, this.f2058c);
        }
    }
}
