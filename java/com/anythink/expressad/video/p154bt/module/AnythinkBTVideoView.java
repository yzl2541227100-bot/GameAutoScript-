package com.anythink.expressad.video.p154bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.atsignalcommon.windvane.C1469j;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerErrorConstant;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.video.p154bt.p155a.C2024c;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p181e.C2337a;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkBTVideoView extends BTBaseView {

    /* JADX INFO: renamed from: H */
    private static boolean f13029H = false;

    /* JADX INFO: renamed from: N */
    private static final String f13030N = "2";

    /* JADX INFO: renamed from: p */
    private static final String f13031p = "anythink_reward_videoview_item";

    /* JADX INFO: renamed from: A */
    private C2053a f13032A;

    /* JADX INFO: renamed from: B */
    private int f13033B;

    /* JADX INFO: renamed from: C */
    private int f13034C;

    /* JADX INFO: renamed from: D */
    private boolean f13035D;

    /* JADX INFO: renamed from: E */
    private int f13036E;

    /* JADX INFO: renamed from: F */
    private int f13037F;

    /* JADX INFO: renamed from: G */
    private String f13038G;

    /* JADX INFO: renamed from: I */
    private boolean f13039I;

    /* JADX INFO: renamed from: J */
    private boolean f13040J;

    /* JADX INFO: renamed from: K */
    private boolean f13041K;

    /* JADX INFO: renamed from: L */
    private RelativeLayout f13042L;

    /* JADX INFO: renamed from: M */
    private ProgressBar f13043M;

    /* JADX INFO: renamed from: q */
    private PlayerView f13044q;

    /* JADX INFO: renamed from: r */
    private SoundImageView f13045r;

    /* JADX INFO: renamed from: s */
    private TextView f13046s;

    /* JADX INFO: renamed from: t */
    private View f13047t;

    /* JADX INFO: renamed from: u */
    private FeedBackButton f13048u;

    /* JADX INFO: renamed from: v */
    private WebView f13049v;

    /* JADX INFO: renamed from: w */
    private C2318c f13050w;

    /* JADX INFO: renamed from: x */
    private int f13051x;

    /* JADX INFO: renamed from: y */
    private int f13052y;

    /* JADX INFO: renamed from: z */
    private int f13053z;

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTVideoView$1 */
    public class ViewOnClickListenerC20501 implements View.OnClickListener {
        public ViewOnClickListenerC20501() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean zIsSilent = AnythinkBTVideoView.this.f13044q.isSilent();
            if (AnythinkBTVideoView.this.f13049v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f13087n);
                    jSONObject.put("id", AnythinkBTVideoView.this.f13093d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("mute", AnythinkBTVideoView.this.f13033B);
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(AnythinkBTVideoView.this.f13049v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    StringBuilder sb = new StringBuilder("onPlayerMuteBtnClicked isMute = ");
                    sb.append(zIsSilent);
                    sb.append(" mute = ");
                    sb.append(AnythinkBTVideoView.this.f13033B);
                } catch (Exception e) {
                    C2024c.m10829a();
                    C2024c.m10831a(AnythinkBTVideoView.this.f13049v, e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTVideoView$2 */
    public class ViewOnClickListenerC20512 implements View.OnClickListener {
        public ViewOnClickListenerC20512() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (AnythinkBTVideoView.this.f13049v != null) {
                BTBaseView.m11042a(AnythinkBTVideoView.this.f13049v, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.f13093d);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTVideoView$3 */
    public class ViewOnClickListenerC20523 implements View.OnClickListener {
        public ViewOnClickListenerC20523() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (AnythinkBTVideoView.this.f13049v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f13087n);
                    jSONObject.put("id", AnythinkBTVideoView.this.f13093d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(AnythinkBTVideoView.this.f13049v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    C2024c.m10829a();
                    C2024c.m10832a(AnythinkBTVideoView.this.f13049v, "onClicked", AnythinkBTVideoView.this.f13093d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.bt.module.AnythinkBTVideoView$a */
    public static final class C2053a extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a */
        private AnythinkBTVideoView f13057a;

        /* JADX INFO: renamed from: b */
        private WebView f13058b;

        /* JADX INFO: renamed from: c */
        private String f13059c;

        /* JADX INFO: renamed from: d */
        private String f13060d;

        /* JADX INFO: renamed from: e */
        private int f13061e;

        /* JADX INFO: renamed from: f */
        private int f13062f;

        /* JADX INFO: renamed from: g */
        private boolean f13063g;

        /* JADX INFO: renamed from: k */
        private int f13067k;

        /* JADX INFO: renamed from: l */
        private int f13068l;

        /* JADX INFO: renamed from: h */
        private boolean f13064h = false;

        /* JADX INFO: renamed from: i */
        private boolean f13065i = false;

        /* JADX INFO: renamed from: j */
        private boolean f13066j = false;

        /* JADX INFO: renamed from: m */
        private boolean f13069m = false;

        public C2053a(AnythinkBTVideoView anythinkBTVideoView, WebView webView) {
            this.f13057a = anythinkBTVideoView;
            this.f13058b = webView;
            this.f13059c = anythinkBTVideoView.f13093d;
            this.f13060d = anythinkBTVideoView.f13092c;
        }

        /* JADX INFO: renamed from: a */
        private int m11030a() {
            return this.f13061e;
        }

        /* JADX INFO: renamed from: b */
        private void m11031b() {
            this.f13057a = null;
            this.f13058b = null;
            boolean unused = AnythinkBTVideoView.f13029H = false;
        }

        /* JADX INFO: renamed from: a */
        public final void m11032a(int i, int i2) {
            this.f13067k = i;
            this.f13068l = i2;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals("play buffering tiemout")) && this.f13058b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f13087n);
                        jSONObject.put("id", this.f13059c);
                        jSONObject.put("data", new JSONObject());
                        C1469j.m5701a();
                        C1469j.m5703a(this.f13058b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C2024c.m10829a();
                        C2024c.m10831a(this.f13058b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            AnythinkBTVideoView anythinkBTVideoView = this.f13057a;
            C1781c c1781c = anythinkBTVideoView.f13091b;
            if (c1781c == null) {
                anythinkBTVideoView.f13046s.setText("0");
            } else if (c1781c.m8881i() > 0) {
                this.f13057a.f13046s.setText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
            } else {
                anythinkBTVideoView = this.f13057a;
                anythinkBTVideoView.f13046s.setText("0");
            }
            this.f13057a.f13044q.setClickable(false);
            WebView webView = this.f13058b;
            if (webView != null) {
                BTBaseView.m11042a(webView, "onPlayerFinish", this.f13059c);
            }
            this.f13061e = this.f13062f;
            boolean unused = AnythinkBTVideoView.f13029H = true;
            this.f13057a.stop();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f13058b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f13088o);
                    jSONObject.put("id", this.f13059c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f13059c);
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(this.f13058b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C2024c.m10829a();
                    C2024c.m10831a(this.f13058b, e.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i2) {
            int i3;
            int i4;
            StringBuilder sb;
            String strValueOf;
            super.onPlayProgress(i, i2);
            AnythinkBTVideoView anythinkBTVideoView = this.f13057a;
            if (anythinkBTVideoView.f13097h) {
                int iM8881i = 0;
                C1781c c1781c = anythinkBTVideoView.f13091b;
                if (c1781c != null) {
                    iM8881i = c1781c.m8881i();
                    C1800b.m9367a().m9377a(this.f13057a.f13091b.m8803K() + "_1", i);
                }
                if (iM8881i > i2) {
                    iM8881i = i2;
                }
                int i5 = iM8881i <= 0 ? i2 - i : iM8881i - i;
                if (i5 <= 0) {
                    strValueOf = iM8881i <= 0 ? "0" : (String) this.f13057a.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
                } else if (iM8881i <= 0) {
                    strValueOf = String.valueOf(i5);
                } else {
                    strValueOf = i5 + ((String) this.f13057a.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_left", C1875i.f11532g)));
                }
                this.f13057a.f13046s.setText(strValueOf);
            }
            this.f13062f = i2;
            this.f13061e = i;
            this.f13057a.f13043M.setMax(this.f13062f);
            this.f13057a.f13043M.setProgress(this.f13061e);
            if (this.f13058b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f13087n);
                    jSONObject.put("id", this.f13059c);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f13059c);
                    jSONObject2.put(NotificationCompat.CATEGORY_PROGRESS, AnythinkBTVideoView.m11021b(i, i2));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i2));
                    jSONObject.put("data", jSONObject2);
                    C1469j.m5701a();
                    C1469j.m5703a(this.f13058b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C2024c.m10829a();
                    C2024c.m10831a(this.f13058b, e.getMessage());
                }
            }
            try {
                int i6 = this.f13067k;
                if (i6 == 100 || this.f13069m || i6 == 0 || (i3 = this.f13068l) < 0 || i < (i4 = (i2 * i3) / 100)) {
                    return;
                }
                if (this.f13057a.f13091b.m8913w() == 94 || this.f13057a.f13091b.m8913w() == 287) {
                    sb = new StringBuilder();
                    sb.append(this.f13057a.f13091b.m8818Z());
                    sb.append(this.f13057a.f13091b.m10146aZ());
                    sb.append(this.f13057a.f13091b.m8811S());
                } else {
                    sb = new StringBuilder();
                    sb.append(this.f13057a.f13091b.m10146aZ());
                    sb.append(this.f13057a.f13091b.m8811S());
                    sb.append(this.f13057a.f13091b.m8794B());
                }
                C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f13060d, sb.toString());
                if (c2318cM11851a != null) {
                    c2318cM11851a.m11828i();
                    this.f13069m = true;
                    StringBuilder sb2 = new StringBuilder("CDRate is : ");
                    sb2.append(i4);
                    sb2.append(" and start download !");
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f13063g) {
                this.f13057a.f13043M.setMax(i);
                WebView webView = this.f13058b;
                if (webView != null) {
                    BTBaseView.m11042a(webView, "onPlayerPlay", this.f13059c);
                }
                this.f13063g = true;
            }
            boolean unused = AnythinkBTVideoView.f13029H = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            StringBuilder sb;
            String strM8811S;
            if (this.f13057a.f13091b.m8913w() == 94 || this.f13057a.f13091b.m8913w() == 287) {
                sb = new StringBuilder();
                sb.append(this.f13057a.f13091b.m8818Z());
                sb.append(this.f13057a.f13091b.m10146aZ());
                strM8811S = this.f13057a.f13091b.m8811S();
            } else {
                sb = new StringBuilder();
                sb.append(this.f13057a.f13091b.m10146aZ());
                sb.append(this.f13057a.f13091b.m8811S());
                strM8811S = this.f13057a.f13091b.m8794B();
            }
            sb.append(strM8811S);
            C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f13060d, sb.toString());
            if (c2318cM11851a != null) {
                c2318cM11851a.m11828i();
                this.f13069m = true;
            }
        }
    }

    public AnythinkBTVideoView(Context context) {
        super(context);
        this.f13051x = 0;
        this.f13052y = 0;
        this.f13053z = 0;
        this.f13033B = 2;
        this.f13035D = false;
        this.f13036E = 2;
        this.f13037F = 1;
        this.f13039I = false;
        this.f13040J = false;
        this.f13041K = false;
    }

    public AnythinkBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13051x = 0;
        this.f13052y = 0;
        this.f13053z = 0;
        this.f13033B = 2;
        this.f13035D = false;
        this.f13036E = 2;
        this.f13037F = 1;
        this.f13039I = false;
        this.f13040J = false;
        this.f13041K = false;
    }

    /* JADX INFO: renamed from: a */
    private int m11016a(C1781c c1781c) {
        return (c1781c == null || c1781c.m8846ao() == -1) ? C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13092c, false).m12104v() : c1781c.m8846ao();
    }

    /* JADX INFO: renamed from: b */
    public static String m11021b(int i, int i2) {
        if (i2 != 0) {
            double d = i / i2;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(C1886t.m9818a(Double.valueOf(d)));
                return sb.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return String.valueOf(i2);
    }

    /* JADX INFO: renamed from: b */
    private boolean m11022b() {
        try {
            this.f13044q = (PlayerView) findViewById(findID("anythink_vfpv"));
            this.f13045r = (SoundImageView) findViewById(findID("anythink_sound_switch"));
            this.f13046s = (TextView) findViewById(findID("anythink_tv_count"));
            this.f13047t = findViewById(findID("anythink_rl_playing_close"));
            this.f13042L = (RelativeLayout) findViewById(findID("anythink_top_control"));
            this.f13043M = (ProgressBar) findViewById(findID("anythink_video_progress_bar"));
            this.f13044q.setIsBTVideo(true);
            this.f13048u = (FeedBackButton) findViewById(findID("anythink_native_endcard_feed_btn"));
            return isNotNULL(this.f13044q, this.f13045r, this.f13046s, this.f13047t);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m11024c() {
        StringBuilder sb;
        String strM8811S;
        if (this.f13091b.m8913w() == 94 || this.f13091b.m8913w() == 287) {
            sb = new StringBuilder();
            sb.append(this.f13091b.m8818Z());
            sb.append(this.f13091b.m10146aZ());
            strM8811S = this.f13091b.m8811S();
        } else {
            sb = new StringBuilder();
            sb.append(this.f13091b.m10146aZ());
            sb.append(this.f13091b.m8811S());
            strM8811S = this.f13091b.m8794B();
        }
        sb.append(strM8811S);
        C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f13092c, sb.toString());
        if (c2318cM11851a != null) {
            this.f13050w = c2318cM11851a;
        }
    }

    /* JADX INFO: renamed from: d */
    private String m11026d() {
        String strM8811S = "";
        try {
            strM8811S = this.f13091b.m8811S();
            C2318c c2318c = this.f13050w;
            if (c2318c == null || c2318c.m11830k() != 5) {
                return strM8811S;
            }
            String strM11823e = this.f13050w.m11823e();
            return !C1889w.m9867a(strM11823e) ? new File(strM11823e).exists() ? strM11823e : strM8811S : strM8811S;
        } catch (Throwable th) {
            th.getMessage();
            return strM8811S;
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m11027e() {
        try {
            C2337a c2337aM12002b = C2339c.m11994a().m12002b();
            if (c2337aM12002b == null) {
                C2339c.m11994a();
                C2339c.m11998c();
            }
            if (c2337aM12002b != null) {
                return (int) c2337aM12002b.m11989g();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    /* JADX INFO: renamed from: f */
    private int m11029f() {
        return C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13092c, false).m12106x();
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    /* JADX INFO: renamed from: a */
    public final void mo11014a() {
        super.mo11014a();
        if (this.f13097h) {
            this.f13045r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.1
                public ViewOnClickListenerC20501() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean zIsSilent = AnythinkBTVideoView.this.f13044q.isSilent();
                    if (AnythinkBTVideoView.this.f13049v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f13087n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f13093d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("mute", AnythinkBTVideoView.this.f13033B);
                            jSONObject.put("data", jSONObject2);
                            C1469j.m5701a();
                            C1469j.m5703a(AnythinkBTVideoView.this.f13049v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            StringBuilder sb = new StringBuilder("onPlayerMuteBtnClicked isMute = ");
                            sb.append(zIsSilent);
                            sb.append(" mute = ");
                            sb.append(AnythinkBTVideoView.this.f13033B);
                        } catch (Exception e) {
                            C2024c.m10829a();
                            C2024c.m10831a(AnythinkBTVideoView.this.f13049v, e.getMessage());
                        }
                    }
                }
            });
            this.f13047t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.2
                public ViewOnClickListenerC20512() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f13049v != null) {
                        BTBaseView.m11042a(AnythinkBTVideoView.this.f13049v, "onPlayerCloseBtnClicked", AnythinkBTVideoView.this.f13093d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTVideoView.3
                public ViewOnClickListenerC20523() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkBTVideoView.this.f13049v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f13087n);
                            jSONObject.put("id", AnythinkBTVideoView.this.f13093d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put("data", jSONObject2);
                            C1469j.m5701a();
                            C1469j.m5703a(AnythinkBTVideoView.this.f13049v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            C2024c.m10829a();
                            C2024c.m10832a(AnythinkBTVideoView.this.f13049v, "onClicked", AnythinkBTVideoView.this.f13093d);
                        }
                    }
                }
            });
        }
    }

    public int getMute() {
        return this.f13033B;
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout(f13031p);
        if (iFindLayout > 0) {
            this.f13095f.inflate(iFindLayout, this);
            this.f13097h = m11022b();
            mo11014a();
        }
        f13029H = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f13041K) {
            C2024c.m10829a();
            this.f13036E = C2024c.m10848e(this.f13092c);
        }
        View view = this.f13047t;
        if (view != null) {
            view.setVisibility(this.f13052y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f13045r;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f13053z == 0 ? 8 : 0);
        }
        TextView textView = this.f13046s;
        if (textView != null) {
            textView.setVisibility(this.f13051x != 0 ? 0 : 8);
            if (this.f13046s.getVisibility() == 0 && C1800b.m9367a().m9384b()) {
                this.f13091b.m8891l(this.f13092c);
                C1800b.m9367a().m9379a(this.f13092c + "_1", this.f13091b);
                C1800b.m9367a().m9381a(this.f13092c + "_1", this.f13048u);
            }
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f13044q;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f13044q.release();
                this.f13044q = null;
            }
            SoundImageView soundImageView = this.f13045r;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f13047t;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f13049v != null) {
                this.f13049v = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onPause() {
        PlayerView playerView = this.f13044q;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.f13040J = zIsPlayIng;
            this.f13044q.setIsBTVideoPlaying(zIsPlayIng);
            this.f13044q.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f13044q;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f13044q.setIsCovered(false);
            if (this.f13040J) {
                this.f13044q.onResume();
            }
        }
    }

    public void onStop() {
        PlayerView playerView = this.f13044q;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f13044q;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f13049v;
                if (webView != null) {
                    BTBaseView.m11042a(webView, "onPlayerPause", this.f13093d);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void play() {
        C2053a c2053a;
        try {
            if (this.f13041K) {
                if (this.f13035D) {
                    this.f13044q.playVideo(0);
                    this.f13035D = false;
                } else {
                    this.f13044q.start(false);
                }
                WebView webView = this.f13049v;
                if (webView != null) {
                    BTBaseView.m11042a(webView, "onPlayerPlay", this.f13093d);
                    return;
                }
                return;
            }
            if (this.f13036E == 1) {
                playMute();
            } else {
                playUnMute();
            }
            if (!this.f13044q.playVideo() && (c2053a = this.f13032A) != null) {
                c2053a.onPlayError("play video failed");
            }
            this.f13041K = true;
            WebView webView2 = this.f13049v;
            if (webView2 != null) {
                BTBaseView.m11042a(webView2, "onPlayerPlay", this.f13093d);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f13044q;
            if (playerView != null && this.f13049v != null) {
                playerView.closeSound();
                this.f13045r.setSoundStatus(false);
                this.f13033B = 1;
                BTBaseView.m11042a(this.f13049v, "onPlayerMute", this.f13093d);
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f13044q;
            if (playerView == null || this.f13049v == null) {
                return false;
            }
            playerView.openSound();
            this.f13045r.setSoundStatus(true);
            this.f13033B = 2;
            BTBaseView.m11042a(this.f13049v, "onUnmute", this.f13093d);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public void preLoadData() {
        StringBuilder sb;
        String strM8811S;
        if (this.f13091b.m8913w() == 94 || this.f13091b.m8913w() == 287) {
            sb = new StringBuilder();
            sb.append(this.f13091b.m8818Z());
            sb.append(this.f13091b.m10146aZ());
            strM8811S = this.f13091b.m8811S();
        } else {
            sb = new StringBuilder();
            sb.append(this.f13091b.m10146aZ());
            sb.append(this.f13091b.m8811S());
            strM8811S = this.f13091b.m8794B();
        }
        sb.append(strM8811S);
        C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f13092c, sb.toString());
        if (c2318cM11851a != null) {
            this.f13050w = c2318cM11851a;
        }
        this.f13034C = m11027e();
        String strM11026d = m11026d();
        this.f13038G = strM11026d;
        if (this.f13097h && !TextUtils.isEmpty(strM11026d) && this.f13091b != null) {
            C2053a c2053a = new C2053a(this, this.f13049v);
            this.f13032A = c2053a;
            C1781c c1781c = this.f13091b;
            c2053a.m11032a((c1781c == null || c1781c.m8846ao() == -1) ? C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13092c, false).m12104v() : c1781c.m8846ao(), C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13092c, false).m12106x());
            this.f13044q.setDesk(false);
            this.f13044q.initBufferIngParam(this.f13034C);
            this.f13044q.initVFPData(this.f13038G, this.f13091b.m8811S(), this.f13091b.m8846ao(), this.f13032A);
            soundOperate(this.f13033B, -1, null);
        }
        f13029H = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f13044q;
            if (playerView != null) {
                if (this.f13035D) {
                    playerView.playVideo(0);
                    this.f13035D = false;
                } else {
                    playerView.onResume();
                }
                WebView webView = this.f13049v;
                if (webView != null) {
                    BTBaseView.m11042a(webView, "onPlayerResume", this.f13093d);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.p154bt.module.BTBaseView
    public void setCampaign(C1781c c1781c) {
        super.setCampaign(c1781c);
        if (c1781c == null || c1781c.m8881i() <= 0) {
            this.f13046s.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_shape_progress", C1875i.f11528c));
            this.f13046s.setWidth(C1886t.m9834b(C1175n.m2059a().m2148f(), 30.0f));
            return;
        }
        this.f13046s.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_time_count_num_bg", C1875i.f11528c));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C1886t.m9834b(C1175n.m2059a().m2148f(), 30.0f));
        int iM9834b = C1886t.m9834b(C1175n.m2059a().m2148f(), 5.0f);
        layoutParams.setMargins(iM9834b, 0, 0, 0);
        this.f13046s.setPadding(iM9834b, 0, iM9834b, 0);
        this.f13046s.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i) {
        this.f13047t.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f13046s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f13049v = webView;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.f13042L.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.f13042L.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.f13042L.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.f13042L.getPaddingBottom();
        }
        new StringBuilder("NOTCH BTVideoView ").append(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.f13042L.setPadding(i, i3, i2, i4);
    }

    public void setOrientation(int i) {
        this.f13037F = i;
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.f13044q;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f13043M;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
        }
    }

    public void setShowClose(int i) {
        this.f13052y = i;
    }

    public void setShowMute(int i) {
        this.f13053z = i;
    }

    public void setShowTime(int i) {
        this.f13051x = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.f13045r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.f13044q;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f13097h) {
            this.f13033B = i;
            if (i == 1) {
                this.f13045r.setSoundStatus(false);
                this.f13044q.closeSound();
            } else if (i == 2) {
                this.f13045r.setSoundStatus(true);
                this.f13044q.openSound();
            }
            if (i2 == 1) {
                this.f13045r.setVisibility(8);
            } else if (i2 == 2) {
                this.f13045r.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f13044q;
            if (playerView != null) {
                playerView.pause();
                this.f13044q.stop();
                try {
                    this.f13044q.prepare();
                    this.f13044q.justSeekTo(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                WebView webView = this.f13049v;
                if (webView != null) {
                    BTBaseView.m11042a(webView, "onPlayerStop", this.f13093d);
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
