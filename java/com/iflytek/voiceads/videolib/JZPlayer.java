package com.iflytek.voiceads.videolib;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.iflytek.voiceads.listener.IFLYVideoListener;
import com.iflytek.voiceads.p218e.C2960g;
import com.iflytek.voiceads.p218e.C2961h;
import com.iflytek.voiceads.param.C2966a;
import com.iflytek.voiceads.utils.C2987e;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;
import com.iflytek.voiceads.utils.C2993k;
import com.ywfzjbcy.R;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public abstract class JZPlayer extends FrameLayout implements View.OnClickListener, View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public static int f16470a = 1;

    /* JADX INFO: renamed from: b */
    public static int f16471b = 0;

    /* JADX INFO: renamed from: c */
    public static long f16472c = 0;

    /* JADX INFO: renamed from: A */
    public int f16473A;

    /* JADX INFO: renamed from: B */
    public int f16474B;

    /* JADX INFO: renamed from: C */
    public int f16475C;

    /* JADX INFO: renamed from: D */
    public int f16476D;

    /* JADX INFO: renamed from: E */
    public int f16477E;

    /* JADX INFO: renamed from: F */
    public int f16478F;

    /* JADX INFO: renamed from: G */
    public int f16479G;

    /* JADX INFO: renamed from: H */
    protected int f16480H;

    /* JADX INFO: renamed from: I */
    protected int f16481I;

    /* JADX INFO: renamed from: J */
    protected AudioManager f16482J;

    /* JADX INFO: renamed from: K */
    protected Handler f16483K;

    /* JADX INFO: renamed from: L */
    protected ScheduledExecutorService f16484L;

    /* JADX INFO: renamed from: M */
    protected C2997a f16485M;

    /* JADX INFO: renamed from: N */
    protected boolean f16486N;

    /* JADX INFO: renamed from: O */
    public C2960g f16487O;

    /* JADX INFO: renamed from: P */
    public C2961h f16488P;

    /* JADX INFO: renamed from: Q */
    public IFLYVideoListener f16489Q;

    /* JADX INFO: renamed from: R */
    public C2966a f16490R;

    /* JADX INFO: renamed from: S */
    public int f16491S;

    /* JADX INFO: renamed from: T */
    public boolean f16492T;

    /* JADX INFO: renamed from: U */
    private final int f16493U;

    /* JADX INFO: renamed from: d */
    public AudioManager.OnAudioFocusChangeListener f16494d;

    /* JADX INFO: renamed from: e */
    public C2999a f16495e;

    /* JADX INFO: renamed from: f */
    public Object[] f16496f;

    /* JADX INFO: renamed from: g */
    public int f16497g;

    /* JADX INFO: renamed from: h */
    public int f16498h;

    /* JADX INFO: renamed from: i */
    public int f16499i;

    /* JADX INFO: renamed from: j */
    public long f16500j;

    /* JADX INFO: renamed from: k */
    public boolean f16501k;

    /* JADX INFO: renamed from: l */
    public SeekBar f16502l;

    /* JADX INFO: renamed from: m */
    public ImageView f16503m;

    /* JADX INFO: renamed from: n */
    public ImageView f16504n;

    /* JADX INFO: renamed from: o */
    public ImageView f16505o;

    /* JADX INFO: renamed from: p */
    public TextView f16506p;

    /* JADX INFO: renamed from: q */
    public TextView f16507q;

    /* JADX INFO: renamed from: r */
    public ViewGroup f16508r;

    /* JADX INFO: renamed from: s */
    public ViewGroup f16509s;

    /* JADX INFO: renamed from: t */
    public int f16510t;

    /* JADX INFO: renamed from: u */
    public int f16511u;

    /* JADX INFO: renamed from: v */
    public int f16512v;

    /* JADX INFO: renamed from: w */
    public int f16513w;

    /* JADX INFO: renamed from: x */
    public int f16514x;

    /* JADX INFO: renamed from: y */
    public int f16515y;

    /* JADX INFO: renamed from: z */
    public int f16516z;

    /* JADX INFO: renamed from: com.iflytek.voiceads.videolib.JZPlayer$a */
    public class C2997a extends TimerTask {
        public C2997a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (JZPlayer.this.f16497g == 3 || JZPlayer.this.f16497g == 5) {
                JZPlayer.this.f16483K.post(new RunnableC3011m(this));
            }
        }
    }

    public JZPlayer(Context context) {
        super(context);
        this.f16493U = R.animator.mtrl_chip_state_list_anim;
        this.f16494d = new C3010l(this);
        this.f16496f = null;
        this.f16497g = -1;
        this.f16498h = -1;
        this.f16499i = 0;
        this.f16500j = 0L;
        this.f16501k = false;
        this.f16476D = 0;
        this.f16477E = 0;
        this.f16478F = -1;
        this.f16479G = 0;
        mo13600a(context);
    }

    public JZPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16493U = R.animator.mtrl_chip_state_list_anim;
        this.f16494d = new C3010l(this);
        this.f16496f = null;
        this.f16497g = -1;
        this.f16498h = -1;
        this.f16499i = 0;
        this.f16500j = 0L;
        this.f16501k = false;
        this.f16476D = 0;
        this.f16477E = 0;
        this.f16478F = -1;
        this.f16479G = 0;
        mo13600a(context);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13580b() {
        if (System.currentTimeMillis() - f16472c < 300) {
            return false;
        }
        if (C3013o.m13682b() != null) {
            f16472c = System.currentTimeMillis();
            if (C3013o.m13680a().f16495e.m13655a(TextureViewSurfaceTextureListenerC3001c.m13669b())) {
                C3013o.m13680a().m13591J();
            } else {
                m13581c();
            }
            return true;
        }
        if (C3013o.m13680a() == null || C3013o.m13680a().f16498h != 1) {
            return false;
        }
        f16472c = System.currentTimeMillis();
        m13581c();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m13581c() {
        C3013o.m13680a().m13636z();
        TextureViewSurfaceTextureListenerC3001c.m13665a().m13674g();
        C3013o.m13685d();
    }

    /* JADX INFO: renamed from: A */
    public void m13582A() {
        C2989g.m13555a("JZVideoPlayer", "onVideoSizeChanged");
        if (TextureViewSurfaceTextureListenerC3001c.f16544a != null) {
            if (this.f16479G != 0) {
                TextureViewSurfaceTextureListenerC3001c.f16544a.setRotation(this.f16479G);
            }
            TextureViewSurfaceTextureListenerC3001c.f16544a.m13637a(TextureViewSurfaceTextureListenerC3001c.m13665a().f16550g, TextureViewSurfaceTextureListenerC3001c.m13665a().f16551h);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m13583B() {
        C2989g.m13555a("JZVideoPlayer", "startProgressTimer");
        m13584C();
        this.f16484L = Executors.newScheduledThreadPool(1);
        this.f16485M = new C2997a();
        this.f16484L.scheduleAtFixedRate(this.f16485M, 0L, 300L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: C */
    public void m13584C() {
        C2989g.m13555a("JZVideoPlayer", "cancelProgressTimer");
        if (this.f16484L != null) {
            this.f16484L.shutdown();
        }
        if (this.f16485M != null) {
            this.f16485M.cancel();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m13585D() {
        this.f16502l.setProgress(0);
        this.f16502l.setSecondaryProgress(0);
        this.f16506p.setText(C3012n.m13678a(0L));
        this.f16507q.setText(C3012n.m13678a(0L));
    }

    /* JADX INFO: renamed from: E */
    public long m13586E() {
        if (this.f16497g != 3 && this.f16497g != 5) {
            return 0L;
        }
        try {
            return TextureViewSurfaceTextureListenerC3001c.m13670c();
        } catch (Exception e) {
            C2989g.m13557b("JZVideoPlayer", "get position" + e.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: F */
    public long m13587F() {
        try {
            return TextureViewSurfaceTextureListenerC3001c.m13671d();
        } catch (Exception e) {
            C2989g.m13557b("JZVideoPlayer", "get dur" + e.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m13588G() {
        try {
            if (this.f16487O.f16368c > this.f16487O.f16369d) {
                C3012n.m13679a(getContext(), 0);
            } else {
                C3012n.m13679a(getContext(), 1);
            }
            Activity activityM13677a = C3012n.m13677a(getContext());
            if (activityM13677a == null) {
                C2989g.m13555a("JZVideoPlayer", "startWindowFullscreen curActivity is null!");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) activityM13677a.findViewById(android.R.id.content);
            View viewFindViewById = viewGroup.findViewById(R.animator.mtrl_chip_state_list_anim);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            this.f16508r.removeView(TextureViewSurfaceTextureListenerC3001c.f16544a);
            JZPlayer jZPlayer = (JZPlayer) getClass().getConstructor(Context.class).newInstance(getContext());
            jZPlayer.setId(R.animator.mtrl_chip_state_list_anim);
            viewGroup.addView(jZPlayer, new FrameLayout.LayoutParams(-1, -1));
            int i = Build.VERSION.SDK_INT;
            int i2 = getContext().getApplicationInfo().targetSdkVersion;
            if (i >= 19 && i2 >= 19) {
                jZPlayer.setSystemUiVisibility(2054);
            } else if (i < 16 || i2 < 16) {
                jZPlayer.setSystemUiVisibility(2);
            } else {
                jZPlayer.setSystemUiVisibility(6);
            }
            jZPlayer.m13601a(this.f16487O);
            jZPlayer.m13604a(this.f16490R);
            jZPlayer.m13595a(this.f16491S);
            jZPlayer.m13603a(this.f16489Q);
            jZPlayer.m13608b(this.f16499i);
            jZPlayer.m13602a(this.f16488P);
            jZPlayer.mo13605a(this.f16495e, 1, this.f16496f);
            jZPlayer.m13611c(this.f16497g);
            jZPlayer.m13633w();
            C3013o.m13683b(jZPlayer);
            mo13623m();
            jZPlayer.f16502l.setSecondaryProgress(this.f16502l.getSecondaryProgress());
            jZPlayer.m13583B();
            f16472c = System.currentTimeMillis();
        } catch (Exception e) {
            C2989g.m13557b("JZVideoPlayer", "window full" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m13589H() {
        return m13590I() && this.f16495e.m13655a(TextureViewSurfaceTextureListenerC3001c.m13669b());
    }

    /* JADX INFO: renamed from: I */
    public boolean m13590I() {
        return C3013o.m13684c() != null && C3013o.m13684c() == this;
    }

    /* JADX INFO: renamed from: J */
    public void m13591J() {
        this.f16499i = C3013o.m13682b().f16499i;
        if (this.f16499i == 0) {
            this.f16505o.setImageResource(this.f16475C);
        } else if (this.f16499i == 1) {
            this.f16505o.setImageResource(this.f16474B);
        }
        this.f16497g = C3013o.m13682b().f16497g;
        m13636z();
        m13611c(this.f16497g);
        m13633w();
    }

    /* JADX INFO: renamed from: K */
    public void m13592K() {
    }

    /* JADX INFO: renamed from: L */
    public void mo13593L() {
    }

    /* JADX INFO: renamed from: a */
    public void m13594a() {
        if (System.currentTimeMillis() - f16472c > 300) {
            C3013o.m13685d();
            TextureViewSurfaceTextureListenerC3001c.m13665a().f16549f = -1;
            TextureViewSurfaceTextureListenerC3001c.m13665a().m13674g();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13595a(int i) {
        this.f16491S = i;
    }

    /* JADX INFO: renamed from: a */
    public void m13596a(int i, int i2) {
        C2989g.m13555a("JZVideoPlayer", "onError");
        if (i == 38 || i2 == -38 || i == -38 || i2 == 38 || i2 == -19) {
            return;
        }
        mo13628r();
        if (m13589H()) {
            TextureViewSurfaceTextureListenerC3001c.m13665a().m13674g();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13597a(int i, int i2, int i3) {
        switch (i) {
            case 0:
                mo13623m();
                break;
            case 1:
                mo13624n();
                break;
            case 2:
                mo13598a(i2, i3);
                break;
            case 3:
                mo13626p();
                break;
            case 5:
                mo13627q();
                break;
            case 6:
                mo13629s();
                break;
            case 7:
                mo13628r();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo13598a(int i, long j) {
        C2989g.m13555a("JZVideoPlayer", "onStatePreparingChangingUrl");
        this.f16497g = 2;
        this.f16500j = j;
        this.f16495e.f16537b = i;
        TextureViewSurfaceTextureListenerC3001c.m13667a(this.f16495e);
        TextureViewSurfaceTextureListenerC3001c.m13665a().m13675h();
    }

    /* JADX INFO: renamed from: a */
    public void m13599a(int i, long j, long j2) {
        if (!this.f16486N && i != 0) {
            this.f16502l.setProgress(i);
            if (21 < i && i < 29 && !this.f16488P.f16391b) {
                C2992j.m13570a(this.f16487O.f16375j);
                this.f16488P.f16391b = true;
            }
            if (46 < i && i < 54 && !this.f16488P.f16392c) {
                C2992j.m13570a(this.f16487O.f16376k);
                this.f16488P.f16392c = true;
            }
            if (71 < i && i < 79 && !this.f16488P.f16393d) {
                C2992j.m13570a(this.f16487O.f16377l);
                this.f16488P.f16393d = true;
            }
        }
        if (j != 0) {
            this.f16506p.setText(C3012n.m13678a(j));
        }
        this.f16507q.setText(C3012n.m13678a(j2));
    }

    /* JADX INFO: renamed from: a */
    public void mo13600a(Context context) {
        try {
            View.inflate(context, mo13617g(), this);
            mo13609b(context);
            this.f16503m = (ImageView) findViewById(this.f16510t);
            this.f16504n = (ImageView) findViewById(this.f16511u);
            this.f16505o = (ImageView) findViewById(this.f16512v);
            this.f16502l = (SeekBar) findViewById(this.f16514x);
            this.f16506p = (TextView) findViewById(this.f16513w);
            this.f16507q = (TextView) findViewById(this.f16515y);
            this.f16509s = (ViewGroup) findViewById(this.f16473A);
            this.f16508r = (ViewGroup) findViewById(this.f16516z);
            this.f16503m.setOnClickListener(this);
            this.f16504n.setOnClickListener(this);
            this.f16505o.setOnClickListener(this);
            this.f16502l.setOnSeekBarChangeListener(this);
            this.f16509s.setOnClickListener(this);
            this.f16508r.setOnClickListener(this);
            this.f16508r.setOnTouchListener(this);
            this.f16480H = getContext().getResources().getDisplayMetrics().widthPixels;
            this.f16481I = getContext().getResources().getDisplayMetrics().heightPixels;
            this.f16482J = (AudioManager) getContext().getSystemService(C1732o.f9732b);
            this.f16483K = new Handler();
            this.f16488P = new C2961h();
            if (m13589H() && (context instanceof Activity)) {
                f16470a = ((Activity) context).getRequestedOrientation();
            }
        } catch (Exception e) {
            C2989g.m13557b("JZVideoPlayer", "jz init" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13601a(C2960g c2960g) {
        this.f16487O = c2960g;
    }

    /* JADX INFO: renamed from: a */
    public void m13602a(C2961h c2961h) {
        this.f16488P = c2961h;
    }

    /* JADX INFO: renamed from: a */
    public void m13603a(IFLYVideoListener iFLYVideoListener) {
        this.f16489Q = iFLYVideoListener;
    }

    /* JADX INFO: renamed from: a */
    public void m13604a(C2966a c2966a) {
        this.f16490R = c2966a;
    }

    /* JADX INFO: renamed from: a */
    public void mo13605a(C2999a c2999a, int i, Object... objArr) {
        if (this.f16495e == null || c2999a.m13653a() == null || !this.f16495e.m13655a(c2999a.m13653a())) {
            if (m13590I() && c2999a.m13655a(TextureViewSurfaceTextureListenerC3001c.m13669b())) {
                TextureViewSurfaceTextureListenerC3001c.m13665a().m13674g();
            }
            this.f16498h = i;
            this.f16495e = c2999a;
            this.f16496f = objArr;
            this.f16495e.f16542g = objArr;
            mo13623m();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13606a(String str, String str2, int i, Object... objArr) {
        mo13605a(new C2999a(str, str2), i, objArr);
    }

    /* JADX INFO: renamed from: a */
    public void m13607a(boolean z) {
        this.f16492T = z;
    }

    /* JADX INFO: renamed from: b */
    public void m13608b(int i) {
        this.f16499i = i;
    }

    /* JADX INFO: renamed from: b */
    public void mo13609b(Context context) {
        this.f16510t = C2987e.m13548a(context, "id", "ifly_ad_play_state_btn");
        this.f16511u = C2987e.m13548a(context, "id", "ifly_ad_fullscreen_btn");
        this.f16512v = C2987e.m13548a(context, "id", "ifly_ad_volume_btn");
        this.f16513w = C2987e.m13548a(context, "id", "ifly_ad_cur_time");
        this.f16514x = C2987e.m13548a(context, "id", "ifly_ad_bottom_seek_bar");
        this.f16515y = C2987e.m13548a(context, "id", "ifly_ad_total_time");
        this.f16516z = C2987e.m13548a(context, "id", "ifly_ad_surface_container");
        this.f16473A = C2987e.m13548a(context, "id", "ifly_ad_layout_bottom");
        this.f16474B = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_open_volume");
        this.f16475C = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_close_volume");
    }

    /* JADX INFO: renamed from: b */
    public void m13610b(boolean z) {
        TextureViewSurfaceTextureListenerC3001c.m13668a(z);
        if (z) {
            this.f16499i = 0;
            if (this.f16488P.f16398i) {
                return;
            }
            C2992j.m13570a(this.f16487O.f16382q);
            this.f16488P.f16398i = true;
            return;
        }
        this.f16499i = 1;
        if (this.f16488P.f16399j) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16383r);
        this.f16488P.f16399j = true;
    }

    /* JADX INFO: renamed from: c */
    public void m13611c(int i) {
        m13597a(i, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m13612c(boolean z) {
        this.f16501k = z;
    }

    /* JADX INFO: renamed from: d */
    public void m13613d() {
        JZPlayer jZPlayerM13684c = C3013o.m13684c();
        if (jZPlayerM13684c == null || jZPlayerM13684c.f16497g != 5) {
            return;
        }
        jZPlayerM13684c.mo13626p();
        TextureViewSurfaceTextureListenerC3001c.m13673f();
        if (this.f16488P.f16396g || this.f16487O == null) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16380o);
        this.f16488P.f16396g = true;
    }

    /* JADX INFO: renamed from: d */
    public void m13614d(int i) {
        if (i != 0) {
            this.f16502l.setSecondaryProgress(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m13615e() {
        JZPlayer jZPlayerM13684c = C3013o.m13684c();
        if (jZPlayerM13684c == null || jZPlayerM13684c.f16497g == 6 || jZPlayerM13684c.f16497g == 0 || jZPlayerM13684c.f16497g == 7) {
            return;
        }
        jZPlayerM13684c.mo13627q();
        TextureViewSurfaceTextureListenerC3001c.m13672e();
        if (this.f16488P.f16395f || this.f16487O == null) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16379n);
        this.f16488P.f16395f = true;
    }

    /* JADX INFO: renamed from: f */
    public void m13616f() {
        JZPlayer jZPlayerM13684c = C3013o.m13684c();
        if (jZPlayerM13684c != null) {
            jZPlayerM13684c.m13592K();
            m13594a();
            if (this.f16488P.f16401l) {
                return;
            }
            C2992j.m13570a(this.f16487O.f16385t);
            this.f16488P.f16401l = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo13617g();

    /* JADX INFO: renamed from: h */
    public void m13618h() {
        m13580b();
        if (this.f16488P.f16397h) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16381p);
        this.f16488P.f16397h = true;
    }

    /* JADX INFO: renamed from: i */
    public void m13619i() {
        if (this.f16488P.f16404o) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16388w);
        this.f16488P.f16404o = true;
    }

    /* JADX INFO: renamed from: j */
    public void m13620j() {
        if (this.f16488P.f16405p) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16389x);
        this.f16488P.f16405p = true;
    }

    /* JADX INFO: renamed from: k */
    public void m13621k() {
        C3013o.m13685d();
        m13632v();
        m13633w();
        ((AudioManager) getContext().getSystemService(C1732o.f9732b)).requestAudioFocus(this.f16494d, 3, 2);
        Activity activityM13677a = C3012n.m13677a(getContext());
        if (activityM13677a != null) {
            activityM13677a.getWindow().addFlags(128);
        }
        TextureViewSurfaceTextureListenerC3001c.m13667a(this.f16495e);
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16549f = this.f16478F;
        mo13624n();
        C3013o.m13681a(this);
    }

    /* JADX INFO: renamed from: l */
    public void m13622l() {
        m13625o();
        mo13626p();
        if (this.f16489Q != null) {
            this.f16489Q.onVideoStart();
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo13623m() {
        C2989g.m13555a("JZVideoPlayer", "onStateNormal");
        this.f16497g = 0;
        m13584C();
    }

    /* JADX INFO: renamed from: n */
    public void mo13624n() {
        C2989g.m13555a("JZVideoPlayer", "onStatePreparing");
        this.f16497g = 1;
        m13585D();
    }

    /* JADX INFO: renamed from: o */
    public void m13625o() {
        C2989g.m13555a("JZVideoPlayer", "onStatePrepared");
        if (this.f16500j == 0) {
            TextureViewSurfaceTextureListenerC3001c.m13666a(0L);
        } else {
            TextureViewSurfaceTextureListenerC3001c.m13666a(this.f16500j);
            this.f16500j = 0L;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != this.f16510t) {
            if (id == this.f16511u) {
                if (this.f16497g != 6) {
                    if (this.f16498h == 1) {
                        m13580b();
                        if (this.f16488P.f16403n) {
                            return;
                        }
                        C2992j.m13570a(this.f16487O.f16387v);
                        this.f16488P.f16403n = true;
                        return;
                    }
                    m13588G();
                    if (this.f16488P.f16402m) {
                        return;
                    }
                    C2992j.m13570a(this.f16487O.f16386u);
                    this.f16488P.f16402m = true;
                    return;
                }
                return;
            }
            if (id == this.f16512v) {
                if (this.f16499i == 0) {
                    TextureViewSurfaceTextureListenerC3001c.m13668a(false);
                    this.f16499i = 1;
                    this.f16505o.setImageResource(this.f16474B);
                    if (this.f16488P.f16399j) {
                        return;
                    }
                    C2992j.m13570a(this.f16487O.f16383r);
                    this.f16488P.f16399j = true;
                    return;
                }
                if (this.f16499i == 1) {
                    TextureViewSurfaceTextureListenerC3001c.m13668a(true);
                    this.f16499i = 0;
                    this.f16505o.setImageResource(this.f16475C);
                    if (this.f16488P.f16398i) {
                        return;
                    }
                    C2992j.m13570a(this.f16487O.f16382q);
                    this.f16488P.f16398i = true;
                    return;
                }
                return;
            }
            return;
        }
        if (this.f16495e == null || this.f16495e.f16538c.isEmpty() || this.f16495e.m13653a() == null) {
            C2989g.m13555a("JZVideoPlayer", "播放地址无效");
            return;
        }
        if (this.f16497g == 0) {
            if (this.f16495e.m13653a().toString().startsWith("file") || this.f16495e.m13653a().toString().startsWith("/") || C2993k.m13575b(getContext()) || !this.f16492T) {
                m13621k();
                return;
            } else {
                mo13593L();
                return;
            }
        }
        if (this.f16497g == 3) {
            TextureViewSurfaceTextureListenerC3001c.m13672e();
            mo13627q();
            if (this.f16488P.f16395f) {
                return;
            }
            C2992j.m13570a(this.f16487O.f16379n);
            this.f16488P.f16395f = true;
            return;
        }
        if (this.f16497g == 5) {
            TextureViewSurfaceTextureListenerC3001c.m13673f();
            mo13626p();
            if (this.f16488P.f16396g) {
                return;
            }
            C2992j.m13570a(this.f16487O.f16380o);
            this.f16488P.f16396g = true;
            return;
        }
        if (this.f16497g == 6) {
            m13621k();
            if (!this.f16488P.f16400k) {
                C2992j.m13570a(this.f16487O.f16384s);
                this.f16488P.f16400k = true;
            }
            if (this.f16489Q != null) {
                this.f16489Q.onVideoReplay();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f16498h == 1) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.f16476D == 0 || this.f16477E == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) ((size * this.f16477E) / this.f16476D);
        setMeasuredDimension(size, i3);
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        m13584C();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        m13583B();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        if (this.f16497g == 3 || this.f16497g == 5) {
            TextureViewSurfaceTextureListenerC3001c.m13666a((((long) seekBar.getProgress()) * m13587F()) / 100);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void mo13626p() {
        C2989g.m13555a("JZVideoPlayer", "onStatePlaying");
        this.f16497g = 3;
        m13583B();
    }

    /* JADX INFO: renamed from: q */
    public void mo13627q() {
        C2989g.m13555a("JZVideoPlayer", "onStatePause");
        this.f16497g = 5;
        m13583B();
    }

    /* JADX INFO: renamed from: r */
    public void mo13628r() {
        C2989g.m13555a("JZVideoPlayer", "onStateError");
        this.f16497g = 7;
        m13584C();
    }

    /* JADX INFO: renamed from: s */
    public void mo13629s() {
        C2989g.m13555a("JZVideoPlayer", "onStateAutoComplete");
        this.f16497g = 6;
        m13584C();
        this.f16502l.setProgress(100);
        this.f16506p.setText(this.f16507q.getText());
    }

    /* JADX INFO: renamed from: t */
    public void mo13630t() {
        C2989g.m13555a("JZVideoPlayer", "onAutoCompletion");
        Runtime.getRuntime().gc();
        mo13629s();
        if (this.f16498h == 1) {
            m13580b();
        }
        TextureViewSurfaceTextureListenerC3001c.m13665a().m13674g();
        Activity activityM13677a = C3012n.m13677a(getContext());
        if (activityM13677a != null) {
            activityM13677a.getWindow().clearFlags(128);
        }
        if (this.f16489Q != null) {
            this.f16489Q.onVideoComplete();
        }
    }

    /* JADX INFO: renamed from: u */
    public void mo13631u() {
        C2989g.m13555a("JZVideoPlayer", "onCompletion");
        m13584C();
        mo13623m();
        this.f16508r.removeView(TextureViewSurfaceTextureListenerC3001c.f16544a);
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16550g = 0;
        TextureViewSurfaceTextureListenerC3001c.m13665a().f16551h = 0;
        ((AudioManager) getContext().getSystemService(C1732o.f9732b)).abandonAudioFocus(this.f16494d);
        Activity activityM13677a = C3012n.m13677a(getContext());
        if (activityM13677a != null) {
            activityM13677a.getWindow().clearFlags(128);
        }
        m13635y();
        C3012n.m13679a(getContext(), f16470a);
        if (TextureViewSurfaceTextureListenerC3001c.f16547d != null) {
            TextureViewSurfaceTextureListenerC3001c.f16547d.release();
        }
        if (TextureViewSurfaceTextureListenerC3001c.f16546c != null) {
            TextureViewSurfaceTextureListenerC3001c.f16546c.release();
        }
        TextureViewSurfaceTextureListenerC3001c.f16544a = null;
        TextureViewSurfaceTextureListenerC3001c.f16546c = null;
    }

    /* JADX INFO: renamed from: v */
    public void m13632v() {
        C2989g.m13555a("JZVideoPlayer", "initTextureView");
        m13634x();
        TextureViewSurfaceTextureListenerC3001c.f16544a = new JZTextureView(getContext());
        TextureViewSurfaceTextureListenerC3001c.f16544a.setSurfaceTextureListener(TextureViewSurfaceTextureListenerC3001c.m13665a());
    }

    /* JADX INFO: renamed from: w */
    public void m13633w() {
        C2989g.m13555a("JZVideoPlayer", "addTextureView");
        this.f16508r.addView(TextureViewSurfaceTextureListenerC3001c.f16544a, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* JADX INFO: renamed from: x */
    public void m13634x() {
        C2989g.m13555a("JZVideoPlayer", "removeTextureView");
        TextureViewSurfaceTextureListenerC3001c.f16546c = null;
        if (TextureViewSurfaceTextureListenerC3001c.f16544a == null || TextureViewSurfaceTextureListenerC3001c.f16544a.getParent() == null) {
            return;
        }
        ((ViewGroup) TextureViewSurfaceTextureListenerC3001c.f16544a.getParent()).removeView(TextureViewSurfaceTextureListenerC3001c.f16544a);
    }

    /* JADX INFO: renamed from: y */
    public void m13635y() {
        ViewGroup viewGroup;
        View viewFindViewById;
        C2989g.m13555a("JZVideoPlayer", "clearFullscreenLayout");
        Activity activityM13677a = C3012n.m13677a(getContext());
        if (activityM13677a == null || (viewFindViewById = (viewGroup = (ViewGroup) activityM13677a.findViewById(android.R.id.content)).findViewById(R.animator.mtrl_chip_state_list_anim)) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewById);
    }

    /* JADX INFO: renamed from: z */
    public void m13636z() {
        C2989g.m13555a("JZVideoPlayer", "clearFloatScreen");
        C3012n.m13679a(getContext(), f16470a);
        JZPlayer jZPlayerM13684c = C3013o.m13684c();
        jZPlayerM13684c.f16508r.removeView(TextureViewSurfaceTextureListenerC3001c.f16544a);
        Activity activityM13677a = C3012n.m13677a(getContext());
        if (activityM13677a != null) {
            ((ViewGroup) activityM13677a.findViewById(android.R.id.content)).removeView(jZPlayerM13684c);
        }
        C3013o.m13683b(null);
    }
}
