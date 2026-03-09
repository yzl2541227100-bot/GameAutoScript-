package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.basead.p015c.C0747e;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.expressad.exoplayer.C1575f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: h */
    public long f1811h;

    /* JADX INFO: renamed from: i */
    public long f1812i;

    /* JADX INFO: renamed from: j */
    public int f1813j;

    /* JADX INFO: renamed from: k */
    public int f1814k;

    /* JADX INFO: renamed from: l */
    public int f1815l;

    /* JADX INFO: renamed from: m */
    public boolean f1816m;

    /* JADX INFO: renamed from: n */
    public boolean f1817n;

    /* JADX INFO: renamed from: o */
    public boolean f1818o;

    /* JADX INFO: renamed from: p */
    public boolean f1819p;

    /* JADX INFO: renamed from: q */
    public boolean f1820q;

    /* JADX INFO: renamed from: r */
    public boolean f1821r;

    /* JADX INFO: renamed from: s */
    public boolean f1822s;

    /* JADX INFO: renamed from: t */
    public Thread f1823t;

    /* JADX INFO: renamed from: u */
    public Handler f1824u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0966a f1825v;

    /* JADX INFO: renamed from: w */
    public AbstractC1247l f1826w;

    /* JADX INFO: renamed from: x */
    public C1248m f1827x;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.BasePlayerView$a */
    public interface InterfaceC0966a {
        /* JADX INFO: renamed from: a */
        void mo800a();

        /* JADX INFO: renamed from: a */
        void mo801a(int i);

        /* JADX INFO: renamed from: a */
        void mo802a(long j);

        /* JADX INFO: renamed from: a */
        void mo803a(C0747e c0747e);

        /* JADX INFO: renamed from: b */
        void mo804b();

        /* JADX INFO: renamed from: b */
        void mo805b(long j);

        /* JADX INFO: renamed from: c */
        void mo806c();

        /* JADX INFO: renamed from: d */
        void mo807d();

        /* JADX INFO: renamed from: e */
        void mo808e();

        /* JADX INFO: renamed from: f */
        void mo809f();

        /* JADX INFO: renamed from: g */
        void mo810g();
    }

    public BasePlayerView(Context context) {
        super(context);
        this.f1811h = C1575f.f8394a;
        this.f1812i = -1L;
        this.f1820q = false;
        this.f1821r = false;
        this.f1822s = false;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1811h = C1575f.f8394a;
        this.f1812i = -1L;
        this.f1820q = false;
        this.f1821r = false;
        this.f1822s = false;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1811h = C1575f.f8394a;
        this.f1812i = -1L;
        this.f1820q = false;
        this.f1821r = false;
        this.f1822s = false;
    }

    /* JADX INFO: renamed from: a */
    public void mo1091a(C0747e c0747e) {
        InterfaceC0966a interfaceC0966a = this.f1825v;
        if (interfaceC0966a != null) {
            interfaceC0966a.mo803a(c0747e);
        }
        this.f1825v = null;
    }

    public abstract long getCurrentPosition();

    public abstract long getVideoLength();

    public abstract boolean hasVideo();

    /* JADX INFO: renamed from: i */
    public final void m1096i() {
        this.f1825v = null;
    }

    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        this.f1826w = abstractC1247l;
        this.f1827x = c1248m;
    }

    public abstract boolean isMute();

    public abstract boolean isPlaying();

    public abstract void pause();

    public abstract void setListener(InterfaceC0966a interfaceC0966a);

    public abstract void setMute(boolean z);

    public abstract void start();

    public abstract void stop();
}
