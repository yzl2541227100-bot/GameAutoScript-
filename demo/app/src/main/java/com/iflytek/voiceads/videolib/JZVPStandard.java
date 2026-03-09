package com.iflytek.voiceads.videolib;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.anythink.expressad.exoplayer.p104i.C1659a;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.iflytek.voiceads.utils.C2987e;
import com.iflytek.voiceads.utils.C2989g;
import com.iflytek.voiceads.utils.C2992j;
import com.iflytek.voiceads.utils.C2993k;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: assets/AdDex.4.0.1.dex */
public class JZVPStandard extends JZPlayer {

    /* JADX INFO: renamed from: U */
    public ProgressBar f16520U;

    /* JADX INFO: renamed from: V */
    public ImageView f16521V;

    /* JADX INFO: renamed from: W */
    public TextView f16522W;

    /* JADX INFO: renamed from: aa */
    public LinearLayout f16523aa;

    /* JADX INFO: renamed from: ab */
    public int f16524ab;

    /* JADX INFO: renamed from: ac */
    public int f16525ac;

    /* JADX INFO: renamed from: ad */
    public int f16526ad;

    /* JADX INFO: renamed from: ae */
    public int f16527ae;

    /* JADX INFO: renamed from: af */
    public int f16528af;

    /* JADX INFO: renamed from: ag */
    public int f16529ag;

    /* JADX INFO: renamed from: ah */
    public int f16530ah;

    /* JADX INFO: renamed from: ai */
    public int f16531ai;

    /* JADX INFO: renamed from: aj */
    public int f16532aj;

    /* JADX INFO: renamed from: ak */
    private Timer f16533ak;

    /* JADX INFO: renamed from: al */
    private C2998a f16534al;

    /* JADX INFO: renamed from: com.iflytek.voiceads.videolib.JZVPStandard$a */
    public class C2998a extends TimerTask {
        public C2998a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            JZVPStandard.this.m13650Y();
        }
    }

    public JZVPStandard(Context context) {
        super(context);
    }

    public JZVPStandard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: L */
    public void mo13593L() {
        super.mo13593L();
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage("您当前正在使用移动网络，继续播放将消耗流量！");
        builder.setPositiveButton("继续", new DialogInterfaceOnClickListenerC3014p(this));
        builder.setNegativeButton("取消", new DialogInterfaceOnClickListenerC3015q(this));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC3016r(this));
        builder.create().show();
    }

    /* JADX INFO: renamed from: M */
    public void m13638M() {
        switch (this.f16497g) {
            case 1:
                m13640O();
                break;
            case 3:
                if (this.f16509s.getVisibility() != 0) {
                    m13641P();
                } else {
                    m13642Q();
                }
                break;
            case 5:
                if (this.f16509s.getVisibility() != 0) {
                    m13643R();
                } else {
                    m13644S();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m13639N() {
        m13651a(4, 0, 4, 0, 4);
        m13647V();
    }

    /* JADX INFO: renamed from: O */
    public void m13640O() {
        m13651a(4, 4, 0, 0, 4);
        m13647V();
    }

    /* JADX INFO: renamed from: P */
    public void m13641P() {
        m13651a(0, 0, 4, 4, 4);
        m13647V();
    }

    /* JADX INFO: renamed from: Q */
    public void m13642Q() {
        m13651a(4, 4, 4, 4, 4);
    }

    /* JADX INFO: renamed from: R */
    public void m13643R() {
        m13651a(0, 0, 4, 4, 4);
        m13647V();
    }

    /* JADX INFO: renamed from: S */
    public void m13644S() {
        m13651a(4, 4, 4, 4, 4);
    }

    /* JADX INFO: renamed from: T */
    public void m13645T() {
        m13651a(4, 0, 4, 0, 4);
        m13647V();
    }

    /* JADX INFO: renamed from: U */
    public void m13646U() {
        m13651a(4, 0, 4, 4, 0);
        m13647V();
    }

    /* JADX INFO: renamed from: V */
    public void m13647V() {
        if (this.f16497g == 3) {
            this.f16503m.setVisibility(0);
            this.f16503m.setImageResource(this.f16531ai);
            return;
        }
        if (this.f16497g == 7) {
            this.f16503m.setVisibility(4);
            return;
        }
        if (this.f16497g != 6) {
            this.f16503m.setImageResource(this.f16530ah);
        } else if (this.f16491S != 0) {
            this.f16503m.setVisibility(4);
        } else {
            this.f16503m.setVisibility(0);
            this.f16503m.setImageResource(this.f16532aj);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m13648W() {
        m13649X();
        this.f16533ak = new Timer();
        this.f16534al = new C2998a();
        this.f16533ak.schedule(this.f16534al, C1659a.f9130f);
    }

    /* JADX INFO: renamed from: X */
    public void m13649X() {
        if (this.f16533ak != null) {
            this.f16533ak.cancel();
        }
        if (this.f16534al != null) {
            this.f16534al.cancel();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m13650Y() {
        if (this.f16497g == 0 || this.f16497g == 7 || this.f16497g == 6 || getContext() == null || !(getContext() instanceof Activity)) {
            return;
        }
        ((Activity) getContext()).runOnUiThread(new RunnableC3017s(this));
    }

    /* JADX INFO: renamed from: a */
    public void m13651a(int i, int i2, int i3, int i4, int i5) {
        this.f16509s.setVisibility(i);
        this.f16503m.setVisibility(i2);
        this.f16520U.setVisibility(i3);
        this.f16521V.setVisibility(i4);
        this.f16523aa.setVisibility(i5);
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: a */
    public void mo13598a(int i, long j) {
        super.mo13598a(i, j);
        this.f16520U.setVisibility(0);
        this.f16503m.setVisibility(4);
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: a */
    public void mo13600a(Context context) {
        super.mo13600a(context);
        mo13609b(context);
        this.f16521V.setOnClickListener(this);
        this.f16522W.setOnClickListener(this);
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: a */
    public void mo13605a(C2999a c2999a, int i, Object... objArr) {
        super.mo13605a(c2999a, i, objArr);
        if (this.f16498h == 1) {
            this.f16504n.setImageResource(this.f16528af);
            m13652e(C3012n.m13676a(getContext(), 62.0f));
        } else if (this.f16498h == 0) {
            this.f16504n.setImageResource(this.f16529ag);
            m13652e(C3012n.m13676a(getContext(), 45.0f));
        }
        if (this.f16499i == 0) {
            this.f16505o.setImageResource(this.f16475C);
        } else if (this.f16499i == 1) {
            this.f16505o.setImageResource(this.f16474B);
        }
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: b */
    public void mo13609b(Context context) {
        super.mo13609b(context);
        this.f16524ab = C2987e.m13548a(context, "id", "ifly_ad_loading_progress");
        this.f16525ac = C2987e.m13548a(context, "id", "ifly_ad_thumb");
        this.f16526ad = C2987e.m13548a(context, "id", "ifly_ad_retry_btn");
        this.f16527ae = C2987e.m13548a(context, "id", "ifly_ad_layout_retry");
        this.f16528af = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_shrink");
        this.f16529ag = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_enlarge");
        this.f16530ah = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_click_play_selector");
        this.f16531ai = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_click_pause_selector");
        this.f16532aj = C2987e.m13548a(context, C1875i.f11528c, "ifly_ad_jz_click_replay_selector");
        this.f16520U = (ProgressBar) findViewById(this.f16524ab);
        this.f16521V = (ImageView) findViewById(this.f16525ac);
        this.f16522W = (TextView) findViewById(this.f16526ad);
        this.f16523aa = (LinearLayout) findViewById(this.f16527ae);
    }

    /* JADX INFO: renamed from: e */
    public void m13652e(int i) {
        ViewGroup.LayoutParams layoutParams = this.f16503m.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i;
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: g */
    public int mo13617g() {
        return C2987e.m13548a(getContext(), "layout", "ifly_ad_jz_layout_standard");
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: m */
    public void mo13623m() {
        super.mo13623m();
        m13639N();
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: n */
    public void mo13624n() {
        super.mo13624n();
        m13640O();
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (id == this.f16525ac) {
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
            if (this.f16497g == 6) {
                m13621k();
                if (this.f16488P.f16400k) {
                    return;
                }
                C2992j.m13570a(this.f16487O.f16384s);
                this.f16488P.f16400k = true;
                return;
            }
            return;
        }
        if (id == this.f16516z) {
            if (this.f16491S != 0) {
                if (this.f16489Q != null) {
                    this.f16489Q.onAdClick();
                    return;
                }
                return;
            } else if (!this.f16501k) {
                m13648W();
                m13638M();
                return;
            } else {
                if (this.f16489Q != null) {
                    this.f16489Q.onAdClick();
                    return;
                }
                return;
            }
        }
        if (id == this.f16526ad) {
            if (!this.f16495e.m13653a().toString().startsWith("file") && !this.f16495e.m13653a().toString().startsWith("/") && !C2993k.m13575b(getContext()) && this.f16492T) {
                mo13593L();
                return;
            }
            m13632v();
            m13633w();
            TextureViewSurfaceTextureListenerC3001c.m13667a(this.f16495e);
            mo13624n();
        }
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        super.onStartTrackingTouch(seekBar);
        m13649X();
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        if (this.f16497g == 3) {
            m13650Y();
        } else if (this.f16491S == 0) {
            m13648W();
        }
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == this.f16514x) {
            switch (motionEvent.getAction()) {
                case 0:
                    m13649X();
                    break;
                case 1:
                    m13648W();
                    break;
            }
        }
        return super.onTouch(view, motionEvent);
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: p */
    public void mo13626p() {
        super.mo13626p();
        m13642Q();
        if (this.f16488P.f16390a) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16374i);
        this.f16488P.f16390a = true;
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: q */
    public void mo13627q() {
        super.mo13627q();
        m13643R();
        m13648W();
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: r */
    public void mo13628r() {
        super.mo13628r();
        m13646U();
        if (this.f16489Q != null) {
            this.f16489Q.onAdPlayError();
        }
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: s */
    public void mo13629s() {
        super.mo13629s();
        m13645T();
        m13649X();
        this.f16505o.setImageResource(this.f16475C);
        if (this.f16488P.f16394e) {
            return;
        }
        C2992j.m13570a(this.f16487O.f16378m);
        this.f16488P.f16394e = true;
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: t */
    public void mo13630t() {
        super.mo13630t();
        m13649X();
    }

    @Override // com.iflytek.voiceads.videolib.JZPlayer
    /* JADX INFO: renamed from: u */
    public void mo13631u() {
        super.mo13631u();
        m13649X();
    }
}
