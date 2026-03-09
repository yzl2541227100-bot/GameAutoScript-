package com.anythink.basead.p025ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.p015c.C0747e;
import com.anythink.basead.p015c.C0748f;
import com.anythink.basead.p025ui.WrapRoundImageView;
import com.anythink.basead.p025ui.animplayerview.BasePlayerView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1339c;
import com.anythink.core.common.res.C1378b;
import com.anythink.core.common.res.C1381e;
import com.anythink.core.common.res.image.RecycleImageView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAnimPlayerView extends BasePlayerView {

    /* JADX INFO: renamed from: a */
    public final String f1790a;

    /* JADX INFO: renamed from: b */
    public long f1791b;

    /* JADX INFO: renamed from: c */
    public long f1792c;

    /* JADX INFO: renamed from: d */
    public List<Bitmap> f1793d;

    /* JADX INFO: renamed from: e */
    public String f1794e;

    /* JADX INFO: renamed from: f */
    public RecycleImageView f1795f;

    /* JADX INFO: renamed from: g */
    public WrapRoundImageView f1796g;

    /* JADX INFO: renamed from: y */
    private boolean f1797y;

    /* JADX INFO: renamed from: z */
    private boolean f1798z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView$3 */
    public class RunnableC09633 implements Runnable {
        public RunnableC09633() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            while (true) {
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView.f1820q) {
                    return;
                }
                if (baseAnimPlayerView.f1822s || (handler = baseAnimPlayerView.f1824u) == null) {
                    Thread.sleep(10L);
                } else {
                    try {
                        handler.sendEmptyMessage(1);
                    } catch (Throwable unused) {
                    }
                    try {
                        Thread.sleep(200L);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    public BaseAnimPlayerView(Context context) {
        super(context);
        this.f1790a = getClass().getSimpleName();
        this.f1791b = 0L;
        this.f1792c = 0L;
        this.f1794e = "";
        this.f1797y = false;
        this.f1798z = false;
        m1087j();
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1790a = getClass().getSimpleName();
        this.f1791b = 0L;
        this.f1792c = 0L;
        this.f1794e = "";
        this.f1797y = false;
        this.f1798z = false;
        m1087j();
    }

    public BaseAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1790a = getClass().getSimpleName();
        this.f1791b = 0L;
        this.f1792c = 0L;
        this.f1794e = "";
        this.f1797y = false;
        this.f1798z = false;
        m1087j();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m1086b(BaseAnimPlayerView baseAnimPlayerView) {
        baseAnimPlayerView.f1797y = false;
        return false;
    }

    /* JADX INFO: renamed from: j */
    private void m1087j() {
        this.f1824u = new Handler(Looper.getMainLooper()) { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                BasePlayerView.InterfaceC0966a interfaceC0966a;
                int i;
                BaseAnimPlayerView baseAnimPlayerView = BaseAnimPlayerView.this;
                if (baseAnimPlayerView.f1825v == null) {
                    return;
                }
                long jElapsedRealtime = baseAnimPlayerView.f1791b + SystemClock.elapsedRealtime();
                BaseAnimPlayerView baseAnimPlayerView2 = BaseAnimPlayerView.this;
                baseAnimPlayerView.f1812i = jElapsedRealtime - baseAnimPlayerView2.f1792c;
                if (!baseAnimPlayerView2.f1821r && !baseAnimPlayerView2.f1822s) {
                    baseAnimPlayerView2.f1821r = true;
                    BasePlayerView.InterfaceC0966a interfaceC0966a2 = baseAnimPlayerView2.f1825v;
                    if (interfaceC0966a2 != null) {
                        interfaceC0966a2.mo800a();
                    }
                }
                BaseAnimPlayerView baseAnimPlayerView3 = BaseAnimPlayerView.this;
                BasePlayerView.InterfaceC0966a interfaceC0966a3 = baseAnimPlayerView3.f1825v;
                if (interfaceC0966a3 != null) {
                    interfaceC0966a3.mo802a(baseAnimPlayerView3.f1812i);
                }
                BaseAnimPlayerView baseAnimPlayerView4 = BaseAnimPlayerView.this;
                if (!baseAnimPlayerView4.f1816m && baseAnimPlayerView4.f1812i >= baseAnimPlayerView4.f1813j) {
                    baseAnimPlayerView4.f1816m = true;
                    interfaceC0966a = baseAnimPlayerView4.f1825v;
                    if (interfaceC0966a != null) {
                        i = 25;
                        interfaceC0966a.mo801a(i);
                    }
                } else if (!baseAnimPlayerView4.f1817n && baseAnimPlayerView4.f1812i >= baseAnimPlayerView4.f1814k) {
                    baseAnimPlayerView4.f1817n = true;
                    interfaceC0966a = baseAnimPlayerView4.f1825v;
                    if (interfaceC0966a != null) {
                        i = 50;
                        interfaceC0966a.mo801a(i);
                    }
                } else if (!baseAnimPlayerView4.f1818o && baseAnimPlayerView4.f1812i >= baseAnimPlayerView4.f1815l) {
                    baseAnimPlayerView4.f1818o = true;
                    interfaceC0966a = baseAnimPlayerView4.f1825v;
                    if (interfaceC0966a != null) {
                        i = 75;
                        interfaceC0966a.mo801a(i);
                    }
                }
                BaseAnimPlayerView baseAnimPlayerView5 = BaseAnimPlayerView.this;
                if (baseAnimPlayerView5.f1822s || baseAnimPlayerView5.f1812i < baseAnimPlayerView5.f1811h) {
                    return;
                }
                baseAnimPlayerView5.m1089l();
                BaseAnimPlayerView.m1086b(BaseAnimPlayerView.this);
                BaseAnimPlayerView baseAnimPlayerView6 = BaseAnimPlayerView.this;
                baseAnimPlayerView6.f1822s = true;
                BasePlayerView.InterfaceC0966a interfaceC0966a4 = baseAnimPlayerView6.f1825v;
                if (interfaceC0966a4 != null) {
                    interfaceC0966a4.mo806c();
                }
                BaseAnimPlayerView.this.m1096i();
            }
        };
    }

    /* JADX INFO: renamed from: k */
    private void m1088k() {
        if (this.f1823t != null) {
            return;
        }
        this.f1820q = true;
        Thread thread = new Thread(new RunnableC09633());
        this.f1823t = thread;
        thread.setName("anythink_type_anim_player_progress");
        this.f1823t.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m1089l() {
        this.f1820q = false;
        this.f1823t = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1079a();

    /* JADX INFO: renamed from: a */
    public final void m1090a(final int i, final int i2) {
        RecycleImageView recycleImageView = new RecycleImageView(getContext());
        this.f1795f = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f1795f, -1, -1);
        this.f1796g = new WrapRoundImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f1796g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f1796g, layoutParams);
        C1378b.m4482a(getContext()).m4494a(new C1381e(1, this.f1794e), i, i2, new C1378b.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4
            @Override // com.anythink.core.common.res.C1378b.a
            public final void onFail(String str, String str2) {
                BaseAnimPlayerView.this.mo1091a(C0748f.m310a(C0748f.f730l, C0748f.f716O));
            }

            @Override // com.anythink.core.common.res.C1378b.a
            public final void onSuccess(String str, Bitmap bitmap) {
                if (TextUtils.equals(str, BaseAnimPlayerView.this.f1794e)) {
                    BaseAnimPlayerView.this.f1796g.setBitmapAndResize(bitmap, i, i2);
                    C1339c.m4025a(BaseAnimPlayerView.this.getContext(), bitmap, new C1339c.a() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.4.1
                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo673a() {
                        }

                        @Override // com.anythink.core.common.p066o.C1339c.a
                        /* JADX INFO: renamed from: a */
                        public final void mo674a(Bitmap bitmap2) {
                            BaseAnimPlayerView.this.f1795f.setImageBitmap(bitmap2);
                        }
                    });
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setDuration(100L);
                    BaseAnimPlayerView.this.f1796g.startAnimation(alphaAnimation);
                    BaseAnimPlayerView.this.f1795f.startAnimation(alphaAnimation);
                }
            }
        });
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    /* JADX INFO: renamed from: a */
    public final void mo1091a(C0747e c0747e) {
        this.f1798z = true;
        super.mo1091a(c0747e);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1081b();

    /* JADX INFO: renamed from: c */
    public abstract void mo1082c();

    /* JADX INFO: renamed from: d */
    public abstract void mo1083d();

    /* JADX INFO: renamed from: e */
    public int mo1084e() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public void mo1092f() {
        if (TextUtils.isEmpty(this.f1794e)) {
            mo1091a(C0748f.m310a(C0748f.f730l, C0748f.f716O));
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo1093g() {
        m1089l();
        m1096i();
        Handler handler = this.f1824u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        mo1083d();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public long getCurrentPosition() {
        return this.f1812i;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public long getVideoLength() {
        return this.f1811h;
    }

    /* JADX INFO: renamed from: h */
    public final void m1094h() {
        m1090a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public boolean hasVideo() {
        return this.f1826w != null;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void init(AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, List<Bitmap> list) {
        super.init(abstractC1247l, c1248m, z, list);
        this.f1793d = list;
        this.f1794e = abstractC1247l.m3239y();
        long jMax = Math.max(this.f1827x.f4333n.m3308ai(), mo1084e());
        this.f1811h = jMax;
        this.f1813j = Math.round(jMax * 0.25f);
        this.f1814k = Math.round(this.f1811h * 0.5f);
        this.f1815l = Math.round(this.f1811h * 0.75f);
        BasePlayerView.InterfaceC0966a interfaceC0966a = this.f1825v;
        if (interfaceC0966a != null) {
            interfaceC0966a.mo805b(this.f1811h);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.animplayerview.BaseAnimPlayerView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePlayerView.InterfaceC0966a interfaceC0966a2 = BaseAnimPlayerView.this.f1825v;
                if (interfaceC0966a2 != null) {
                    interfaceC0966a2.mo807d();
                }
            }
        });
        mo1092f();
        StringBuilder sb = new StringBuilder("init success mDuration:");
        sb.append(this.f1811h);
        sb.append(",mEndCardImageUrl:");
        sb.append(this.f1794e);
        sb.append(",mAnimBitmapList:");
        List<Bitmap> list2 = this.f1793d;
        sb.append(list2 == null ? "null" : Integer.valueOf(list2.size()));
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public boolean isMute() {
        return this.f1819p;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public boolean isPlaying() {
        return this.f1797y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1093g();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void pause() {
        this.f1797y = false;
        this.f1791b += SystemClock.elapsedRealtime() - this.f1792c;
        m1089l();
        mo1081b();
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void setListener(BasePlayerView.InterfaceC0966a interfaceC0966a) {
        this.f1825v = interfaceC0966a;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void setMute(boolean z) {
        this.f1819p = z;
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void start() {
        if (this.f1798z) {
            return;
        }
        this.f1797y = !this.f1822s;
        this.f1792c = SystemClock.elapsedRealtime();
        if (this.f1823t == null) {
            this.f1820q = true;
            Thread thread = new Thread(new RunnableC09633());
            this.f1823t = thread;
            thread.setName("anythink_type_anim_player_progress");
            this.f1823t.start();
        }
        if (this.f1797y) {
            mo1079a();
        }
        new StringBuilder("start mIsPlaying:").append(this.f1797y);
    }

    @Override // com.anythink.basead.p025ui.animplayerview.BasePlayerView
    public void stop() {
        this.f1797y = false;
        m1089l();
        BasePlayerView.InterfaceC0966a interfaceC0966a = this.f1825v;
        if (interfaceC0966a != null) {
            interfaceC0966a.mo804b();
        }
        mo1082c();
        m1096i();
    }
}
