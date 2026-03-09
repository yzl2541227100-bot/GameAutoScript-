package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1889w;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.p073a.C1405a;
import com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener;
import com.anythink.expressad.playercommon.PlayerView;
import com.anythink.expressad.reward.player.InterfaceC1973c;
import com.anythink.expressad.video.dynview.C2068a;
import com.anythink.expressad.video.dynview.C2071b;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2079a;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.dynview.p166i.C2092b;
import com.anythink.expressad.video.dynview.p170j.C2099c;
import com.anythink.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar;
import com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.video.module.p172a.p173a.C2183i;
import com.anythink.expressad.video.module.p172a.p173a.C2187m;
import com.anythink.expressad.video.signal.InterfaceC2307f;
import com.anythink.expressad.video.signal.InterfaceC2313j;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.video.widget.SoundImageView;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p178b.C2320e;
import com.anythink.expressad.videocommon.p181e.C2339c;
import com.anythink.expressad.videocommon.p181e.C2340d;
import com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.p182a.DialogC2344a;
import com.anythink.expressad.widget.p182a.InterfaceC2345b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;
import p285z2.C4196o4;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkVideoView extends AnythinkBaseView implements InterfaceC2307f, InterfaceC2313j {

    /* JADX INFO: renamed from: A */
    private static int f13689A = 0;

    /* JADX INFO: renamed from: B */
    private static int f13690B = 0;

    /* JADX INFO: renamed from: C */
    private static int f13691C = 0;

    /* JADX INFO: renamed from: D */
    private static final String f13692D = "2";
    public static final String TAG = "AnythinkVideoView";

    /* JADX INFO: renamed from: aw */
    private static boolean f13693aw = false;

    /* JADX INFO: renamed from: t */
    private static final String f13694t = "anythink_reward_videoview_item";

    /* JADX INFO: renamed from: u */
    private static final int f13695u = 1;

    /* JADX INFO: renamed from: v */
    private static final float f13696v = 1280.0f;

    /* JADX INFO: renamed from: w */
    private static final float f13697w = 720.0f;

    /* JADX INFO: renamed from: x */
    private static final float f13698x = 0.1f;

    /* JADX INFO: renamed from: y */
    private static int f13699y;

    /* JADX INFO: renamed from: z */
    private static int f13700z;

    /* JADX INFO: renamed from: E */
    private PlayerView f13701E;

    /* JADX INFO: renamed from: F */
    private SoundImageView f13702F;

    /* JADX INFO: renamed from: G */
    private TextView f13703G;

    /* JADX INFO: renamed from: H */
    private View f13704H;

    /* JADX INFO: renamed from: I */
    private RelativeLayout f13705I;

    /* JADX INFO: renamed from: J */
    private ImageView f13706J;

    /* JADX INFO: renamed from: K */
    private ProgressBar f13707K;

    /* JADX INFO: renamed from: L */
    private FeedBackButton f13708L;

    /* JADX INFO: renamed from: M */
    private boolean f13709M;

    /* JADX INFO: renamed from: N */
    private AnyThinkSegmentsProgressBar f13710N;

    /* JADX INFO: renamed from: O */
    private InterfaceC2079a f13711O;

    /* JADX INFO: renamed from: P */
    private int f13712P;

    /* JADX INFO: renamed from: Q */
    private FrameLayout f13713Q;

    /* JADX INFO: renamed from: R */
    private AnythinkClickCTAView f13714R;

    /* JADX INFO: renamed from: S */
    private C2309b f13715S;

    /* JADX INFO: renamed from: T */
    private int f13716T;

    /* JADX INFO: renamed from: U */
    private RelativeLayout f13717U;

    /* JADX INFO: renamed from: V */
    private InterfaceC2174a f13718V;

    /* JADX INFO: renamed from: W */
    private boolean f13719W;

    /* JADX INFO: renamed from: aA */
    private int f13720aA;

    /* JADX INFO: renamed from: aB */
    private int f13721aB;

    /* JADX INFO: renamed from: aC */
    private boolean f13722aC;

    /* JADX INFO: renamed from: aD */
    private boolean f13723aD;

    /* JADX INFO: renamed from: aE */
    private boolean f13724aE;

    /* JADX INFO: renamed from: aF */
    private boolean f13725aF;

    /* JADX INFO: renamed from: aG */
    private boolean f13726aG;

    /* JADX INFO: renamed from: aH */
    private boolean f13727aH;

    /* JADX INFO: renamed from: aI */
    private boolean f13728aI;

    /* JADX INFO: renamed from: aJ */
    private boolean f13729aJ;

    /* JADX INFO: renamed from: aK */
    private AlphaAnimation f13730aK;

    /* JADX INFO: renamed from: aL */
    private AnythinkBaitClickView f13731aL;

    /* JADX INFO: renamed from: aM */
    private C2173b f13732aM;

    /* JADX INFO: renamed from: aN */
    private boolean f13733aN;

    /* JADX INFO: renamed from: aO */
    private Runnable f13734aO;

    /* JADX INFO: renamed from: aa */
    private boolean f13735aa;

    /* JADX INFO: renamed from: ab */
    private String f13736ab;

    /* JADX INFO: renamed from: ac */
    private int f13737ac;

    /* JADX INFO: renamed from: ad */
    private int f13738ad;

    /* JADX INFO: renamed from: ae */
    private int f13739ae;

    /* JADX INFO: renamed from: af */
    private int f13740af;

    /* JADX INFO: renamed from: ag */
    private DialogC2344a f13741ag;

    /* JADX INFO: renamed from: ah */
    private InterfaceC2345b f13742ah;

    /* JADX INFO: renamed from: ai */
    private String f13743ai;

    /* JADX INFO: renamed from: aj */
    private double f13744aj;

    /* JADX INFO: renamed from: ak */
    private double f13745ak;

    /* JADX INFO: renamed from: al */
    private boolean f13746al;

    /* JADX INFO: renamed from: am */
    private boolean f13747am;

    /* JADX INFO: renamed from: an */
    private boolean f13748an;

    /* JADX INFO: renamed from: ao */
    private boolean f13749ao;

    /* JADX INFO: renamed from: ap */
    private boolean f13750ap;

    /* JADX INFO: renamed from: aq */
    private boolean f13751aq;

    /* JADX INFO: renamed from: ar */
    private boolean f13752ar;

    /* JADX INFO: renamed from: as */
    private boolean f13753as;

    /* JADX INFO: renamed from: at */
    private boolean f13754at;

    /* JADX INFO: renamed from: au */
    private int f13755au;

    /* JADX INFO: renamed from: av */
    private boolean f13756av;

    /* JADX INFO: renamed from: ax */
    private int f13757ax;

    /* JADX INFO: renamed from: ay */
    private String f13758ay;

    /* JADX INFO: renamed from: az */
    private int f13759az;
    public List<C1781c> mCampOrderViewData;
    public int mCampaignSize;
    public int mCurrPlayNum;
    public int mCurrentPlayProgressTime;
    public int mMuteSwitch;

    /* JADX INFO: renamed from: n */
    public InterfaceC1973c f13760n;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$1 */
    public class C21601 implements InterfaceC2086h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f13761a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2074c f13762b;

        /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$1$1 */
        public class AnonymousClass1 extends AbstractViewOnClickListenerC2343a {
            public AnonymousClass1() {
            }

            @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
            /* JADX INFO: renamed from: a */
            public final void mo11015a(View view) {
                JSONObject jSONObject;
                JSONException e;
                if (AnythinkVideoView.this.f13718V != null) {
                    try {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put(C1801a.f11116ce, AnythinkVideoView.this.m11315a(0));
                        } catch (JSONException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    } catch (JSONException e3) {
                        jSONObject = null;
                        e = e3;
                    }
                    AnythinkVideoView.this.f13718V.mo10950a(105, jSONObject);
                    C1175n.m2059a().m2148f();
                }
            }
        }

        public C21601(ViewGroup viewGroup, C2074c c2074c) {
            this.f13761a = viewGroup;
            this.f13762b = c2074c;
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10989a(C2068a c2068a) {
            if (this.f13761a != null && c2068a.m11055a() != null) {
                c2068a.m11055a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f13761a.addView(c2068a.m11055a());
            }
            if (c2068a.m11058b() != null) {
                Iterator<View> it = c2068a.m11058b().iterator();
                while (it.hasNext()) {
                    it.next().setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.1.1
                        public AnonymousClass1() {
                        }

                        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                        /* JADX INFO: renamed from: a */
                        public final void mo11015a(View view) {
                            JSONObject jSONObject;
                            JSONException e;
                            if (AnythinkVideoView.this.f13718V != null) {
                                try {
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put(C1801a.f11116ce, AnythinkVideoView.this.m11315a(0));
                                    } catch (JSONException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                    }
                                } catch (JSONException e3) {
                                    jSONObject = null;
                                    e = e3;
                                }
                                AnythinkVideoView.this.f13718V.mo10950a(105, jSONObject);
                                C1175n.m2059a().m2148f();
                            }
                        }
                    });
                }
            }
            AnythinkVideoView.this.f13729aJ = c2068a.m11059c();
            AnythinkVideoView.this.m11442b();
            boolean unused = AnythinkVideoView.f13693aw = false;
            AnythinkVideoView.this.f13716T = this.f13762b.m11096j();
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10990a(EnumC2076b enumC2076b) {
            new StringBuilder("errorMsg:").append(enumC2076b.m11124b());
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$10 */
    public class C216110 implements InterfaceC1819c {
        public C216110() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            int iM9834b = C1886t.m9834b(AnythinkVideoView.this.f13477a, 12.0f);
            ImageView imageView = new ImageView(AnythinkVideoView.this.f13477a);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageBitmap(bitmap);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (iM9834b * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight())), iM9834b);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = C1886t.m9834b(AnythinkVideoView.this.f13477a, 5.0f);
            layoutParams.rightMargin = C1886t.m9834b(AnythinkVideoView.this.f13477a, 12.0f);
            AnythinkVideoView.this.addView(imageView, layoutParams);
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$11 */
    public class RunnableC216211 implements Runnable {
        public RunnableC216211() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkVideoView.m11471p(AnythinkVideoView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$12 */
    public class RunnableC216312 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f13767a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13768b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f13769c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f13770d;

        public RunnableC216312(int i, int i2, int i3, int i4) {
            i = i;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (AnythinkVideoView.this.f13705I == null) {
                return;
            }
            AnythinkVideoView.this.f13705I.setVisibility(0);
            C1781c c1781c = AnythinkVideoView.this.f13478b;
            if (c1781c != null && !c1781c.m8886j() && AnythinkVideoView.this.f13478b.m8872f() != 2) {
                AnythinkVideoView.this.f13705I.setPadding(i, i, i, i);
                AnythinkVideoView.this.f13705I.startAnimation(AnythinkVideoView.this.f13730aK);
            }
            AnythinkVideoView.this.f13705I.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$2 */
    public class C21642 implements InterfaceC1819c {
        public C21642() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || AnythinkVideoView.this.f13706J == null) {
                        return;
                    }
                    AnythinkVideoView.this.f13706J.setVisibility(0);
                    ImageView imageView = AnythinkVideoView.this.f13706J;
                    C2092b.m11188a();
                    imageView.setImageBitmap(C2092b.m11187a(bitmap, 20));
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$3 */
    public class RunnableC21653 implements Runnable {
        public RunnableC21653() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (AnythinkVideoView.this.f13713Q != null) {
                AnythinkVideoView.this.f13713Q.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$4 */
    public class ViewOnClickListenerC21664 implements View.OnClickListener {
        public ViewOnClickListenerC21664() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(1, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$5 */
    public class ViewOnClickListenerC21675 implements View.OnClickListener {
        public ViewOnClickListenerC21675() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(1, "");
            }
            AnythinkVideoView.this.setCTALayoutVisibleOrGone();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$6 */
    public class ViewOnClickListenerC21686 implements View.OnClickListener {
        public ViewOnClickListenerC21686() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(1, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$7 */
    public class ViewOnClickListenerC21697 implements View.OnClickListener {
        public ViewOnClickListenerC21697() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer num = 2;
            if (AnythinkVideoView.this.f13701E != null && AnythinkVideoView.this.f13701E.isSilent()) {
                num = 1;
            }
            if (num.intValue() == 1) {
                AnythinkVideoView.this.mMuteSwitch = 2;
            } else {
                AnythinkVideoView.this.mMuteSwitch = 1;
            }
            InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(5, num);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$8 */
    public class ViewOnClickListenerC21708 implements View.OnClickListener {
        public ViewOnClickListenerC21708() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!AnythinkVideoView.this.f13756av) {
                AnythinkVideoView.this.m11448e();
                return;
            }
            AnythinkVideoView.m11449e(AnythinkVideoView.this);
            if (AnythinkVideoView.this.f13725aF) {
                AnythinkVideoView.this.m11448e();
                return;
            }
            InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(InterfaceC2174a.f13810N, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$9 */
    public class C21719 implements InterfaceC2345b {
        public C21719() {
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: a */
        public final void mo9362a() {
            AnythinkVideoView.m11455h(AnythinkVideoView.this);
            AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
            anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.f13719W);
            if (AnythinkVideoView.this.f13756av && (AnythinkVideoView.this.f13759az == C1801a.f11130cs || AnythinkVideoView.this.f13759az == C1801a.f11129cr)) {
                AnythinkVideoView.m11461k(AnythinkVideoView.this);
                InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
                if (interfaceC2174a != null) {
                    interfaceC2174a.mo10950a(InterfaceC2174a.f13811O, "");
                }
                AnythinkVideoView.m11463l(AnythinkVideoView.this);
                AnythinkVideoView.this.gonePlayingCloseView();
            }
            AnythinkVideoView.this.m11456i();
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: b */
        public final void mo9363b() {
            AnythinkVideoView.m11455h(AnythinkVideoView.this);
            AnythinkVideoView.m11467n(AnythinkVideoView.this);
            AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
            anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.f13719W);
            if (AnythinkVideoView.this.f13756av && AnythinkVideoView.this.f13759az == C1801a.f11129cr) {
                AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                InterfaceC2174a interfaceC2174a = anythinkVideoView2.f13481e;
                if (interfaceC2174a != null) {
                    interfaceC2174a.mo10950a(2, anythinkVideoView2.m11441b(anythinkVideoView2.f13726aG));
                    return;
                }
                return;
            }
            if (AnythinkVideoView.this.f13756av && AnythinkVideoView.this.f13759az == C1801a.f11130cs) {
                AnythinkVideoView.this.m11456i();
                return;
            }
            InterfaceC2174a interfaceC2174a2 = AnythinkVideoView.this.f13481e;
            if (interfaceC2174a2 != null) {
                interfaceC2174a2.mo10950a(2, "");
            }
        }

        @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
        /* JADX INFO: renamed from: c */
        public final void mo9364c() {
            mo9362a();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$a */
    public static class C2172a {

        /* JADX INFO: renamed from: a */
        public int f13780a;

        /* JADX INFO: renamed from: b */
        public int f13781b;

        /* JADX INFO: renamed from: c */
        public boolean f13782c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f13780a + ", allDuration=" + this.f13781b + MessageFormatter.DELIM_STOP;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoView$b */
    public static final class C2173b extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a */
        private AnythinkVideoView f13783a;

        /* JADX INFO: renamed from: b */
        private int f13784b;

        /* JADX INFO: renamed from: c */
        private int f13785c;

        /* JADX INFO: renamed from: d */
        private boolean f13786d;

        /* JADX INFO: renamed from: i */
        private boolean f13791i;

        /* JADX INFO: renamed from: j */
        private String f13792j;

        /* JADX INFO: renamed from: k */
        private C1781c f13793k;

        /* JADX INFO: renamed from: l */
        private int f13794l;

        /* JADX INFO: renamed from: m */
        private int f13795m;

        /* JADX INFO: renamed from: e */
        private C2172a f13787e = new C2172a();

        /* JADX INFO: renamed from: f */
        private boolean f13788f = false;

        /* JADX INFO: renamed from: g */
        private boolean f13789g = false;

        /* JADX INFO: renamed from: h */
        private boolean f13790h = false;

        /* JADX INFO: renamed from: n */
        private boolean f13796n = false;

        public C2173b(AnythinkVideoView anythinkVideoView) {
            this.f13783a = anythinkVideoView;
        }

        /* JADX INFO: renamed from: a */
        private void m11482a(int i) {
            if (i <= 0) {
                this.f13783a.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_shape_progress", C1875i.f11528c));
                return;
            }
            this.f13783a.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_time_count_num_bg", C1875i.f11528c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C1886t.m9834b(C1175n.m2059a().m2148f(), 30.0f));
            int iM9834b = C1886t.m9834b(C1175n.m2059a().m2148f(), 5.0f);
            layoutParams.addRule(1, C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_native_endcard_feed_btn", "id"));
            layoutParams.setMargins(iM9834b, 0, 0, 0);
            this.f13783a.f13703G.setPadding(iM9834b, 0, iM9834b, 0);
            this.f13783a.f13703G.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: a */
        private void m11483a(int i, int i2, int i3) {
            AnythinkVideoView anythinkVideoView = this.f13783a;
            if (anythinkVideoView == null) {
                return;
            }
            String strValueOf = (String) anythinkVideoView.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
            String str = (String) this.f13783a.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_left", C1875i.f11532g));
            if (i >= 0) {
                int i4 = i - i3;
                if (i4 > 0) {
                    strValueOf = i4 + str;
                }
            } else {
                int i5 = i2 - i3;
                if (i5 <= 0) {
                    if (i <= 0) {
                        strValueOf = "0";
                    }
                } else if (i <= 0) {
                    strValueOf = String.valueOf(i5);
                } else {
                    strValueOf = i5 + str;
                }
            }
            this.f13787e.f13780a = i3;
            this.f13783a.f13703G.setText(strValueOf);
            if (this.f13783a.f13707K == null || this.f13783a.f13707K.getVisibility() != 0) {
                return;
            }
            this.f13783a.f13707K.setProgress(i3);
        }

        /* JADX INFO: renamed from: b */
        private void m11484b(int i) {
            AnythinkVideoView anythinkVideoView = this.f13783a;
            if (anythinkVideoView == null || anythinkVideoView.f13703G == null) {
                return;
            }
            String str = "anythink_reward_video_time_count_num_bg";
            if (this.f13793k.m8887k() == 5) {
                AnythinkVideoView anythinkVideoView2 = this.f13783a;
                if (anythinkVideoView2.mCurrPlayNum > 1 && i <= 0) {
                    anythinkVideoView2.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_time_count_num_bg", C1875i.f11528c));
                    m11487d();
                    return;
                }
            }
            if (i > 0) {
                m11487d();
            } else {
                str = "anythink_reward_shape_progress";
            }
            this.f13783a.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), str, C1875i.f11528c));
        }

        /* JADX INFO: renamed from: b */
        private void m11485b(int i, int i2, int i3) {
            String strValueOf;
            AnythinkVideoView anythinkVideoView = this.f13783a;
            if (anythinkVideoView == null) {
                return;
            }
            if (i > i2) {
                i = i2;
            }
            int i4 = i <= 0 ? i2 - i3 : i - i3;
            if (i4 <= 0) {
                strValueOf = i <= 0 ? "0" : (String) anythinkVideoView.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
            } else if (i <= 0) {
                strValueOf = String.valueOf(i4);
            } else {
                strValueOf = i4 + ((String) this.f13783a.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_left", C1875i.f11532g)));
            }
            this.f13783a.f13703G.setText(strValueOf);
            if (this.f13783a.f13707K == null || this.f13783a.f13707K.getVisibility() != 0) {
                return;
            }
            this.f13783a.f13707K.setProgress(i3);
        }

        /* JADX INFO: renamed from: c */
        private C1781c m11486c() {
            return this.f13793k;
        }

        /* JADX INFO: renamed from: d */
        private void m11487d() {
            AnythinkVideoView anythinkVideoView = this.f13783a;
            if (anythinkVideoView == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) anythinkVideoView.f13703G.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = C1886t.m9834b(C1175n.m2059a().m2148f(), 25.0f);
                this.f13783a.f13703G.setLayoutParams(layoutParams);
            }
            int iM9834b = C1886t.m9834b(C1175n.m2059a().m2148f(), 5.0f);
            this.f13783a.f13703G.setPadding(iM9834b, 0, iM9834b, 0);
        }

        /* JADX INFO: renamed from: a */
        public final int m11488a() {
            return this.f13784b;
        }

        /* JADX INFO: renamed from: a */
        public final void m11489a(int i, int i2) {
            this.f13794l = i;
            this.f13795m = i2;
        }

        /* JADX INFO: renamed from: a */
        public final void m11490a(C1781c c1781c) {
            this.f13793k = c1781c;
        }

        /* JADX INFO: renamed from: a */
        public final void m11491a(String str) {
            this.f13792j = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m11492a(boolean z) {
            this.f13791i = z;
        }

        /* JADX INFO: renamed from: b */
        public final void m11493b() {
            this.f13783a = null;
            boolean unused = AnythinkVideoView.f13693aw = false;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                this.f13783a.f13481e.mo10950a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                this.f13783a.f13481e.mo10950a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            AnythinkVideoView anythinkVideoView;
            super.onPlayCompleted();
            AnythinkVideoView.m11478w(this.f13783a);
            C1781c c1781c = this.f13793k;
            if (c1781c != null) {
                if (c1781c.m8881i() > 0) {
                    this.f13783a.f13703G.setText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
                } else {
                    this.f13783a.f13703G.setText("0");
                }
                this.f13793k.m8897n(100);
                if (this.f13793k.m8872f() == 2) {
                    this.f13783a.f13704H.setVisibility(4);
                    if (this.f13783a.f13708L != null) {
                        this.f13783a.f13708L.setClickable(false);
                    }
                    if (this.f13783a.f13702F != null) {
                        this.f13783a.f13702F.setClickable(false);
                    }
                }
            } else {
                this.f13783a.f13703G.setText("0");
            }
            this.f13783a.f13701E.setClickable(false);
            String strM11441b = this.f13783a.m11441b(true);
            C1781c c1781c2 = this.f13793k;
            if (c1781c2 != null && c1781c2.m8887k() == 5 && (anythinkVideoView = this.f13783a) != null && anythinkVideoView.f13711O != null) {
                AnythinkVideoView anythinkVideoView2 = this.f13783a;
                if (anythinkVideoView2.mCampaignSize > anythinkVideoView2.mCurrPlayNum) {
                    HashMap map = new HashMap();
                    map.put(RequestParameters.POSITION, Integer.valueOf(this.f13783a.mCurrPlayNum));
                    int i = this.f13783a.mMuteSwitch;
                    if (i != 0) {
                        map.put("mute", Integer.valueOf(i));
                    }
                    this.f13783a.f13711O.mo10458a(map);
                    return;
                }
            }
            this.f13783a.f13481e.mo10950a(InterfaceC2174a.f13808L, "");
            this.f13783a.f13481e.mo10950a(11, strM11441b);
            int i2 = this.f13785c;
            this.f13784b = i2;
            this.f13783a.mCurrentPlayProgressTime = i2;
            boolean unused = AnythinkVideoView.f13693aw = true;
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            AnythinkVideoView anythinkVideoView = this.f13783a;
            if (anythinkVideoView != null) {
                anythinkVideoView.f13481e.mo10950a(12, str);
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayProgress(int i, int i2) {
            int i3;
            StringBuilder sb;
            String strM8811S;
            C1781c c1781c;
            String strValueOf;
            super.onPlayProgress(i, i2);
            if (this.f13783a.f13482f) {
                int iM8881i = 0;
                C1781c c1781c2 = this.f13793k;
                if (c1781c2 != null) {
                    iM8881i = c1781c2.m8881i();
                    C1800b.m9367a().m9377a(this.f13793k.m8803K() + "_1", i);
                }
                String str = "0";
                if (this.f13793k.m8886j() && this.f13793k.m8887k() == 5) {
                    try {
                        int i4 = this.f13783a.f13712P;
                        AnythinkVideoView anythinkVideoView = this.f13783a;
                        if (anythinkVideoView != null) {
                            String strValueOf2 = (String) anythinkVideoView.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
                            String str2 = (String) this.f13783a.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_left", C1875i.f11532g));
                            if (iM8881i >= 0) {
                                int i5 = iM8881i - i;
                                if (i5 > 0) {
                                    strValueOf2 = i5 + str2;
                                }
                            } else {
                                int i6 = i4 - i;
                                if (i6 <= 0) {
                                    if (iM8881i <= 0) {
                                    }
                                    this.f13787e.f13780a = i;
                                    this.f13783a.f13703G.setText(str);
                                    if (this.f13783a.f13707K != null && this.f13783a.f13707K.getVisibility() == 0) {
                                        this.f13783a.f13707K.setProgress(i);
                                    }
                                } else if (iM8881i <= 0) {
                                    strValueOf2 = String.valueOf(i6);
                                } else {
                                    strValueOf2 = i6 + str2;
                                }
                            }
                            str = strValueOf2;
                            this.f13787e.f13780a = i;
                            this.f13783a.f13703G.setText(str);
                            if (this.f13783a.f13707K != null) {
                                this.f13783a.f13707K.setProgress(i);
                            }
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                } else {
                    AnythinkVideoView anythinkVideoView2 = this.f13783a;
                    if (anythinkVideoView2 != null) {
                        if (iM8881i > i2) {
                            iM8881i = i2;
                        }
                        int i7 = iM8881i <= 0 ? i2 - i : iM8881i - i;
                        if (i7 > 0) {
                            if (iM8881i <= 0) {
                                strValueOf = String.valueOf(i7);
                            } else {
                                strValueOf = i7 + ((String) this.f13783a.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_left", C1875i.f11532g)));
                            }
                            str = strValueOf;
                        } else if (iM8881i > 0) {
                            str = (String) anythinkVideoView2.getContext().getResources().getText(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_view_reward_time_complete", C1875i.f11532g));
                        }
                        this.f13783a.f13703G.setText(str);
                        if (this.f13783a.f13707K != null && this.f13783a.f13707K.getVisibility() == 0) {
                            this.f13783a.f13707K.setProgress(i);
                        }
                    }
                    this.f13787e.f13780a = i;
                }
            }
            this.f13785c = i2;
            AnythinkVideoView anythinkVideoView3 = this.f13783a;
            anythinkVideoView3.mCurrentPlayProgressTime = i;
            C2172a c2172a = this.f13787e;
            c2172a.f13780a = i;
            c2172a.f13781b = i2;
            c2172a.f13782c = anythinkVideoView3.f13727aH;
            this.f13784b = i;
            this.f13783a.f13481e.mo10950a(15, this.f13787e);
            if (this.f13783a.f13756av && !this.f13783a.f13722aC && this.f13783a.f13759az == C1801a.f11130cs) {
                this.f13783a.m11448e();
            }
            try {
                AnythinkVideoView anythinkVideoView4 = this.f13783a;
                if (anythinkVideoView4 != null && anythinkVideoView4.f13710N != null) {
                    int i8 = (i * 100) / i2;
                    this.f13783a.f13710N.setProgress(i8, this.f13783a.mCurrPlayNum - 1);
                    this.f13793k.m8897n(i8);
                }
                AnythinkVideoView anythinkVideoView5 = this.f13783a;
                if (anythinkVideoView5 != null && anythinkVideoView5.f13716T != -1 && i == this.f13783a.f13716T && (c1781c = this.f13783a.f13478b) != null && c1781c.m8886j()) {
                    this.f13783a.setCTALayoutVisibleOrGone();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            int i9 = this.f13794l;
            if (i9 == 100 || this.f13796n || i9 == 0) {
                return;
            }
            if (this.f13795m > i9) {
                this.f13795m = i9 / 2;
            }
            int i10 = this.f13795m;
            if (i10 < 0 || i < (i3 = (i2 * i10) / 100)) {
                return;
            }
            if (this.f13793k.m8913w() == 94 || this.f13793k.m8913w() == 287) {
                sb = new StringBuilder();
                sb.append(this.f13793k.m8818Z());
                sb.append(this.f13793k.m10146aZ());
                strM8811S = this.f13793k.m8811S();
            } else {
                sb = new StringBuilder();
                sb.append(this.f13793k.m10146aZ());
                sb.append(this.f13793k.m8811S());
                strM8811S = this.f13793k.m8794B();
            }
            sb.append(strM8811S);
            C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f13792j, sb.toString());
            if (c2318cM11851a != null) {
                c2318cM11851a.m11828i();
                this.f13796n = true;
                StringBuilder sb2 = new StringBuilder("CDRate is : ");
                sb2.append(i3);
                sb2.append(" and start download !");
            }
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f13786d) {
                AnythinkVideoView anythinkVideoView = this.f13783a;
                if (anythinkVideoView != null) {
                    AnythinkVideoView.m11472q(anythinkVideoView);
                }
                this.f13783a.f13481e.mo10950a(10, this.f13787e);
                this.f13786d = true;
            }
            C1781c c1781c = this.f13793k;
            if (c1781c != null) {
                int iM8881i = c1781c.m8881i();
                String str = "anythink_reward_shape_progress";
                if (this.f13793k.m8886j()) {
                    AnythinkVideoView anythinkVideoView2 = this.f13783a;
                    if (anythinkVideoView2 != null && anythinkVideoView2.f13703G != null) {
                        if (this.f13793k.m8887k() == 5) {
                            AnythinkVideoView anythinkVideoView3 = this.f13783a;
                            if (anythinkVideoView3.mCurrPlayNum > 1 && iM8881i <= 0) {
                                anythinkVideoView3.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_time_count_num_bg", C1875i.f11528c));
                                m11487d();
                            }
                        }
                        if (iM8881i > 0) {
                            m11487d();
                            str = "anythink_reward_video_time_count_num_bg";
                        }
                        this.f13783a.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), str, C1875i.f11528c));
                    }
                } else if (iM8881i > 0) {
                    this.f13783a.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_reward_video_time_count_num_bg", C1875i.f11528c));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C1886t.m9834b(C1175n.m2059a().m2148f(), 30.0f));
                    int iM9834b = C1886t.m9834b(C1175n.m2059a().m2148f(), 5.0f);
                    layoutParams.addRule(1, C1875i.m9684a(C1175n.m2059a().m2148f(), "anythink_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(iM9834b, 0, 0, 0);
                    this.f13783a.f13703G.setPadding(iM9834b, 0, iM9834b, 0);
                    this.f13783a.f13703G.setLayoutParams(layoutParams);
                } else {
                    this.f13783a.f13703G.setBackgroundResource(C1875i.m9684a(C1175n.m2059a().m2148f(), str, C1875i.f11528c));
                }
            }
            if (this.f13783a.f13707K != null) {
                this.f13783a.f13707K.setMax(i);
            }
            C1781c c1781c2 = this.f13793k;
            if (c1781c2 != null && c1781c2.m8872f() == 2) {
                this.f13783a.f13705I.setVisibility(0);
            }
            if (this.f13783a.f13703G.getVisibility() == 0) {
                this.f13783a.m11466n();
            }
            boolean unused = AnythinkVideoView.f13693aw = false;
            if (this.f13783a.f13716T == 0) {
                this.f13783a.setCTALayoutVisibleOrGone();
            }
            this.f13783a.showMoreOfferInPlayTemplate();
            this.f13783a.showBaitClickView();
        }

        @Override // com.anythink.expressad.playercommon.DefaultVideoPlayerStatusListener, com.anythink.expressad.playercommon.VideoPlayerStatusListener
        public final void onVideoDownloadResume() {
            StringBuilder sb;
            String strM8811S;
            if (this.f13793k.m8913w() == 94 || this.f13793k.m8913w() == 287) {
                sb = new StringBuilder();
                sb.append(this.f13793k.m8818Z());
                sb.append(this.f13793k.m10146aZ());
                strM8811S = this.f13793k.m8811S();
            } else {
                sb = new StringBuilder();
                sb.append(this.f13793k.m10146aZ());
                sb.append(this.f13793k.m8811S());
                strM8811S = this.f13793k.m8794B();
            }
            sb.append(strM8811S);
            C2318c c2318cM11851a = C2320e.m11843a().m11851a(this.f13792j, sb.toString());
            if (c2318cM11851a != null) {
                c2318cM11851a.m11828i();
                this.f13796n = true;
            }
        }
    }

    public AnythinkVideoView(Context context) {
        super(context);
        this.mMuteSwitch = 0;
        this.f13712P = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.f13719W = false;
        this.f13735aa = false;
        this.f13743ai = "";
        this.f13746al = false;
        this.f13747am = false;
        this.f13748an = false;
        this.f13749ao = false;
        this.f13750ap = false;
        this.f13751aq = false;
        this.f13752ar = false;
        this.f13753as = false;
        this.f13754at = false;
        this.f13756av = false;
        this.f13757ax = 2;
        this.f13722aC = false;
        this.f13723aD = false;
        this.f13724aE = false;
        this.f13725aF = true;
        this.f13726aG = false;
        this.f13727aH = false;
        this.f13728aI = false;
        this.f13729aJ = false;
        this.f13732aM = new C2173b(this);
        this.f13733aN = false;
        this.f13734aO = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.3
            public RunnableC21653() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.f13713Q != null) {
                    AnythinkVideoView.this.f13713Q.setVisibility(8);
                }
            }
        };
    }

    public AnythinkVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMuteSwitch = 0;
        this.f13712P = 0;
        this.mCampaignSize = 1;
        this.mCurrPlayNum = 1;
        this.mCurrentPlayProgressTime = 0;
        this.f13719W = false;
        this.f13735aa = false;
        this.f13743ai = "";
        this.f13746al = false;
        this.f13747am = false;
        this.f13748an = false;
        this.f13749ao = false;
        this.f13750ap = false;
        this.f13751aq = false;
        this.f13752ar = false;
        this.f13753as = false;
        this.f13754at = false;
        this.f13756av = false;
        this.f13757ax = 2;
        this.f13722aC = false;
        this.f13723aD = false;
        this.f13724aE = false;
        this.f13725aF = true;
        this.f13726aG = false;
        this.f13727aH = false;
        this.f13728aI = false;
        this.f13729aJ = false;
        this.f13732aM = new C2173b(this);
        this.f13733aN = false;
        this.f13734aO = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.3
            public RunnableC21653() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (AnythinkVideoView.this.f13713Q != null) {
                    AnythinkVideoView.this.f13713Q.setVisibility(8);
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private int m11431a(C1781c c1781c) {
        return (c1781c == null || c1781c.m8846ao() == -1) ? C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13743ai, false).m12104v() : c1781c.m8846ao();
    }

    /* JADX INFO: renamed from: a */
    private static String m11434a(int i, int i2) {
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

    /* JADX INFO: renamed from: a */
    private void m11435a() {
        int iFindLayout = findLayout(f13694t);
        if (iFindLayout > 0) {
            this.f13479c.inflate(iFindLayout, this);
            m11442b();
        }
        f13693aw = false;
    }

    /* JADX INFO: renamed from: a */
    private void m11436a(ViewGroup viewGroup, C1781c c1781c) {
        new C2099c();
        C2074c c2074cM11254a = C2099c.m11254a(viewGroup, c1781c);
        C2071b.m11062a();
        C2071b.m11064a(c2074cM11254a, new C21601(viewGroup, c2074cM11254a));
    }

    /* JADX INFO: renamed from: a */
    private void m11437a(String str) {
        C1818b.m9427a(C1175n.m2059a().m2148f()).m9443a(str, new InterfaceC1819c() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.2
            public C21642() {
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5462a(Bitmap bitmap, String str2) {
                if (bitmap != null) {
                    try {
                        if (bitmap.isRecycled() || AnythinkVideoView.this.f13706J == null) {
                            return;
                        }
                        AnythinkVideoView.this.f13706J.setVisibility(0);
                        ImageView imageView = AnythinkVideoView.this.f13706J;
                        C2092b.m11188a();
                        imageView.setImageBitmap(C2092b.m11187a(bitmap, 20));
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
            }

            @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
            /* JADX INFO: renamed from: a */
            public final void mo5463a(String str2, String str22) {
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public String m11441b(boolean z) {
        if (!this.f13756av) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f13722aC) {
                jSONObject.put("Alert_window_status", C1801a.f11133cv);
            }
            if (this.f13724aE) {
                jSONObject.put("Alert_window_status", C1801a.f11135cx);
            }
            if (this.f13723aD) {
                jSONObject.put("Alert_window_status", C1801a.f11134cw);
            }
            jSONObject.put("complete_info", z ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11442b() {
        this.f13482f = m11450f();
        mo11316c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f13730aK = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: renamed from: b */
    private void m11443b(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C1886t.m9834b(getContext(), i));
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, 0);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16) {
                setBackground(gradientDrawable);
                this.f13701E.setBackground(gradientDrawable);
            } else {
                setBackgroundDrawable(gradientDrawable);
                this.f13701E.setBackgroundDrawable(gradientDrawable);
            }
            if (i2 >= 21) {
                setClipToOutline(true);
                this.f13701E.setClipToOutline(true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m11445b(int i, int i2) {
        return i > 0 && i2 > 0 && C1886t.m9847f(this.f13477a) >= i && C1886t.m9845e(this.f13477a) >= i2;
    }

    /* JADX INFO: renamed from: e */
    public void m11448e() {
        int i;
        InterfaceC2174a interfaceC2174a;
        try {
            if (!this.f13756av || ((i = this.f13759az) != C1801a.f11129cr && i != C1801a.f11130cs)) {
                C1781c c1781c = this.f13478b;
                if (c1781c == null || c1781c.m8872f() == 2) {
                    InterfaceC2174a interfaceC2174a2 = this.f13481e;
                    if (interfaceC2174a2 != null) {
                        interfaceC2174a2.mo10950a(2, "");
                        return;
                    }
                    return;
                }
                int iM8881i = this.f13478b.m8881i();
                int curPosition = this.f13701E.getCurPosition() / 1000;
                boolean z = false;
                if (this.f13478b.m8887k() != 5 || this.mCurrPlayNum <= 1 ? !((iM8881i <= 0 || curPosition >= iM8881i) && iM8881i != 0) : !(iM8881i == 0 || iM8881i <= 0 || curPosition >= iM8881i)) {
                    z = true;
                }
                if (!z || this.f13739ae != 1 || this.f13754at) {
                    InterfaceC2174a interfaceC2174a3 = this.f13481e;
                    if (interfaceC2174a3 != null) {
                        interfaceC2174a3.mo10950a(2, "");
                        return;
                    }
                    return;
                }
                m11454h();
                InterfaceC2174a interfaceC2174a4 = this.f13481e;
                if (interfaceC2174a4 != null) {
                    interfaceC2174a4.mo10950a(8, "");
                    return;
                }
                return;
            }
            if (this.f13722aC) {
                if (i != C1801a.f11130cs || (interfaceC2174a = this.f13481e) == null) {
                    return;
                }
                interfaceC2174a.mo10950a(2, m11441b(this.f13726aG));
                return;
            }
            if (i == C1801a.f11130cs && this.f13728aI) {
                InterfaceC2174a interfaceC2174a5 = this.f13481e;
                if (interfaceC2174a5 != null) {
                    interfaceC2174a5.mo10950a(2, m11441b(this.f13726aG));
                    return;
                }
                return;
            }
            if (this.f13725aF) {
                int curPosition2 = this.f13701E.getCurPosition() / 1000;
                int iM10155bi = (int) ((curPosition2 / (this.f13701E.getDuration() == 0 ? this.f13478b.m10155bi() : this.f13701E.getDuration())) * 100.0f);
                if (this.f13759az == C1801a.f11129cr) {
                    m11454h();
                    int i2 = this.f13720aA;
                    if (i2 == C1801a.f11131ct && iM10155bi >= this.f13721aB) {
                        InterfaceC2174a interfaceC2174a6 = this.f13481e;
                        if (interfaceC2174a6 != null) {
                            interfaceC2174a6.mo10950a(2, m11441b(this.f13726aG));
                            return;
                        }
                        return;
                    }
                    if (i2 == C1801a.f11132cu && curPosition2 >= this.f13721aB) {
                        InterfaceC2174a interfaceC2174a7 = this.f13481e;
                        if (interfaceC2174a7 != null) {
                            interfaceC2174a7.mo10950a(2, m11441b(this.f13726aG));
                            return;
                        }
                        return;
                    }
                    InterfaceC2174a interfaceC2174a8 = this.f13481e;
                    if (interfaceC2174a8 != null) {
                        interfaceC2174a8.mo10950a(8, "");
                    }
                }
                if (this.f13759az == C1801a.f11130cs) {
                    int i3 = this.f13720aA;
                    if (i3 == C1801a.f11131ct && iM10155bi >= this.f13721aB) {
                        m11454h();
                        InterfaceC2174a interfaceC2174a9 = this.f13481e;
                        if (interfaceC2174a9 != null) {
                            interfaceC2174a9.mo10950a(8, "");
                            return;
                        }
                        return;
                    }
                    if (i3 != C1801a.f11132cu || curPosition2 < this.f13721aB) {
                        return;
                    }
                    m11454h();
                    InterfaceC2174a interfaceC2174a10 = this.f13481e;
                    if (interfaceC2174a10 != null) {
                        interfaceC2174a10.mo10950a(8, "");
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m11449e(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13728aI = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m11450f() {
        try {
            this.f13701E = (PlayerView) findViewById(filterFindViewId(this.f13729aJ, "anythink_vfpv"));
            this.f13702F = (SoundImageView) findViewById(filterFindViewId(this.f13729aJ, "anythink_sound_switch"));
            this.f13703G = (TextView) findViewById(filterFindViewId(this.f13729aJ, "anythink_tv_count"));
            View viewFindViewById = findViewById(filterFindViewId(this.f13729aJ, "anythink_rl_playing_close"));
            this.f13704H = viewFindViewById;
            viewFindViewById.setVisibility(4);
            this.f13705I = (RelativeLayout) findViewById(filterFindViewId(this.f13729aJ, "anythink_top_control"));
            this.f13706J = (ImageView) findViewById(filterFindViewId(this.f13729aJ, "anythink_videoview_bg"));
            this.f13707K = (ProgressBar) findViewById(filterFindViewId(this.f13729aJ, "anythink_video_progress_bar"));
            this.f13708L = (FeedBackButton) findViewById(filterFindViewId(this.f13729aJ, "anythink_native_endcard_feed_btn"));
            this.f13710N = (AnyThinkSegmentsProgressBar) findViewById(filterFindViewId(this.f13729aJ, "anythink_reward_segment_progressbar"));
            this.f13713Q = (FrameLayout) findViewById(filterFindViewId(this.f13729aJ, "anythink_reward_cta_layout"));
            this.f13731aL = (AnythinkBaitClickView) findViewById(filterFindViewId(this.f13729aJ, "anythink_animation_click_view"));
            this.f13717U = (RelativeLayout) findViewById(filterFindViewId(this.f13729aJ, "anythink_reward_moreoffer_layout"));
            try {
                String strM8830aE = this.f13478b.m8830aE();
                if (TextUtils.isEmpty(strM8830aE)) {
                    strM8830aE = C1404a.f6211ab;
                }
                if (!TextUtils.isEmpty(strM8830aE)) {
                    C1818b.m9427a(this.f13477a).m9443a(strM8830aE, new InterfaceC1819c() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.10
                        public C216110() {
                        }

                        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                        /* JADX INFO: renamed from: a */
                        public final void mo5462a(Bitmap bitmap, String str) {
                            int iM9834b = C1886t.m9834b(AnythinkVideoView.this.f13477a, 12.0f);
                            ImageView imageView = new ImageView(AnythinkVideoView.this.f13477a);
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            imageView.setImageBitmap(bitmap);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (iM9834b * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight())), iM9834b);
                            layoutParams.addRule(11);
                            layoutParams.addRule(12);
                            layoutParams.bottomMargin = C1886t.m9834b(AnythinkVideoView.this.f13477a, 5.0f);
                            layoutParams.rightMargin = C1886t.m9834b(AnythinkVideoView.this.f13477a, 12.0f);
                            AnythinkVideoView.this.addView(imageView, layoutParams);
                        }

                        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                        /* JADX INFO: renamed from: a */
                        public final void mo5463a(String str, String str2) {
                        }
                    });
                }
            } catch (Exception e) {
                if (C1404a.f6209a) {
                    e.getLocalizedMessage();
                }
            }
            return isNotNULL(this.f13701E, this.f13702F, this.f13703G, this.f13704H);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m11452g() {
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !C1889w.m9868b(c1781c.m8813U())) {
            return;
        }
        String[] strArrSplit = this.f13478b.m8813U().split("x");
        if (strArrSplit.length == 2) {
            if (C1886t.m9833b(strArrSplit[0]) > 0.0d) {
                this.f13744aj = C1886t.m9833b(strArrSplit[0]);
            }
            if (C1886t.m9833b(strArrSplit[1]) > 0.0d) {
                this.f13745ak = C1886t.m9833b(strArrSplit[1]);
            }
            StringBuilder sb = new StringBuilder("AnythinkBaseView mVideoW:");
            sb.append(this.f13744aj);
            sb.append("  mVideoH:");
            sb.append(this.f13745ak);
        }
        if (this.f13744aj <= 0.0d) {
            this.f13744aj = 1280.0d;
        }
        if (this.f13745ak <= 0.0d) {
            this.f13745ak = 720.0d;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m11454h() {
        try {
            PlayerView playerView = this.f13701E;
            if (playerView != null) {
                playerView.setIsCovered(this.f13735aa || this.f13719W);
                this.f13701E.onPause();
                C1781c c1781c = this.f13478b;
                if (c1781c == null || c1781c.m8804L() == null || this.f13478b.m8854aw()) {
                    return;
                }
                this.f13478b.m8855ax();
                Context contextM2148f = C1175n.m2059a().m2148f();
                C1781c c1781c2 = this.f13478b;
                C1405a.m5187a(contextM2148f, c1781c2, this.f13743ai, c1781c2.m8804L().m9201m(), false);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m11455h(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13719W = false;
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m11456i() {
        C2173b c2173b;
        try {
            if (this.f13747am) {
                if (this.f13735aa || this.f13719W) {
                    return;
                }
                this.f13701E.setIsCovered(false);
                this.f13701E.onResume();
                return;
            }
            boolean zPlayVideo = this.f13701E.playVideo();
            C1781c c1781c = this.f13478b;
            if (c1781c != null && c1781c.m8802J() != 2 && !zPlayVideo && (c2173b = this.f13732aM) != null) {
                c2173b.onPlayError("play video failed");
            }
            this.f13747am = true;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m11459j() {
        if (!this.f13482f || this.f13704H.getVisibility() == 0) {
            return;
        }
        if (!this.f13485i || this.f13709M) {
            this.f13704H.setVisibility(0);
        }
        this.f13750ap = true;
    }

    /* JADX INFO: renamed from: k */
    private void m11460k() {
        if (this.f13733aN || this.f13753as || this.f13751aq) {
            return;
        }
        this.f13733aN = true;
        int i = this.f13737ac;
        if (i >= 0) {
            if (i == 0) {
                this.f13753as = true;
            } else {
                new Handler().postDelayed(new RunnableC216211(), this.f13737ac * 1000);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m11461k(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13723aD = true;
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:112|(1:114)(2:116|(1:118)(6:119|149|120|(5:124|(1:(1:128)(1:129))|(1:133)|134|(2:138|(1:140)(1:141)))|145|146))|115|149|120|(3:122|124|(4:(0)(0)|(2:131|133)|134|(3:136|138|(0)(0))(0))(0))|145|146) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0191, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0192, code lost:
    
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x012b A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:120:0x0103, B:122:0x0107, B:124:0x010d, B:131:0x0146, B:133:0x0152, B:138:0x0163, B:140:0x016f, B:141:0x0179, B:128:0x012b, B:129:0x013a), top: B:149:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x013a A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:120:0x0103, B:122:0x0107, B:124:0x010d, B:131:0x0146, B:133:0x0152, B:138:0x0163, B:140:0x016f, B:141:0x0179, B:128:0x012b, B:129:0x013a), top: B:149:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0163 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:120:0x0103, B:122:0x0107, B:124:0x010d, B:131:0x0146, B:133:0x0152, B:138:0x0163, B:140:0x016f, B:141:0x0179, B:128:0x012b, B:129:0x013a), top: B:149:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x016f A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:120:0x0103, B:122:0x0107, B:124:0x010d, B:131:0x0146, B:133:0x0152, B:138:0x0163, B:140:0x016f, B:141:0x0179, B:128:0x012b, B:129:0x013a), top: B:149:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0179 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:120:0x0103, B:122:0x0107, B:124:0x010d, B:131:0x0146, B:133:0x0152, B:138:0x0163, B:140:0x016f, B:141:0x0179, B:128:0x012b, B:129:0x013a), top: B:149:0x0103 }] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11462l() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkVideoView.m11462l():void");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m11463l(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13727aH = true;
        return true;
    }

    /* JADX INFO: renamed from: m */
    private void m11464m() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (isLandscape() || !this.f13482f) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13701E.getLayoutParams();
            int iM9847f = C1886t.m9847f(this.f13477a);
            layoutParams.width = -1;
            layoutParams.height = (iM9847f * 9) / 16;
            layoutParams.gravity = 17;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11466n() {
        if (!C1800b.m9367a().m9384b()) {
            FeedBackButton feedBackButton = this.f13708L;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f13478b.m8891l(this.f13743ai);
        C1800b.m9367a().m9379a(this.f13743ai + "_1", this.f13478b);
        C1800b.m9367a().m9381a(this.f13743ai + "_1", this.f13708L);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m11467n(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13724aE = true;
        return true;
    }

    /* JADX INFO: renamed from: o */
    private int m11468o() {
        return C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13743ai, false).m12106x();
    }

    /* JADX INFO: renamed from: p */
    private void m11470p() {
        if (this.f13713Q == null) {
            return;
        }
        if (this.f13714R == null) {
            AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(getContext());
            this.f13714R = anythinkClickCTAView;
            anythinkClickCTAView.setCampaign(this.f13478b);
            this.f13714R.setUnitId(this.f13743ai);
            InterfaceC2174a interfaceC2174a = this.f13718V;
            if (interfaceC2174a != null) {
                this.f13714R.setNotifyListener(new C2183i(interfaceC2174a));
            }
            this.f13714R.preLoadData(this.f13715S);
        }
        this.f13713Q.addView(this.f13714R);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ boolean m11471p(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13753as = true;
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m11472q(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13709M = true;
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m11478w(AnythinkVideoView anythinkVideoView) {
        anythinkVideoView.f13726aG = true;
        return true;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void alertWebViewShowed() {
        this.f13719W = true;
        setShowingAlertViewCover(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo11316c() {
        /*
            r2 = this;
            super.mo11316c()
            boolean r0 = r2.f13482f
            if (r0 == 0) goto L46
            boolean r0 = r2.f13485i
            if (r0 == 0) goto L26
            com.anythink.expressad.foundation.d.c r0 = r2.f13478b
            int r0 = com.anythink.expressad.video.dynview.p166i.C2094c.m11191a(r0)
            r1 = -1
            if (r0 == r1) goto L1e
            com.anythink.expressad.foundation.d.c r0 = r2.f13478b
            int r0 = com.anythink.expressad.video.dynview.p166i.C2094c.m11191a(r0)
            r1 = 100
            if (r0 != r1) goto L30
        L1e:
            com.anythink.expressad.playercommon.PlayerView r0 = r2.f13701E
            com.anythink.expressad.video.module.AnythinkVideoView$5 r1 = new com.anythink.expressad.video.module.AnythinkVideoView$5
            r1.<init>()
            goto L2d
        L26:
            com.anythink.expressad.playercommon.PlayerView r0 = r2.f13701E
            com.anythink.expressad.video.module.AnythinkVideoView$6 r1 = new com.anythink.expressad.video.module.AnythinkVideoView$6
            r1.<init>()
        L2d:
            r0.setOnClickListener(r1)
        L30:
            com.anythink.expressad.video.widget.SoundImageView r0 = r2.f13702F
            if (r0 == 0) goto L3c
            com.anythink.expressad.video.module.AnythinkVideoView$7 r1 = new com.anythink.expressad.video.module.AnythinkVideoView$7
            r1.<init>()
            r0.setOnClickListener(r1)
        L3c:
            android.view.View r0 = r2.f13704H
            com.anythink.expressad.video.module.AnythinkVideoView$8 r1 = new com.anythink.expressad.video.module.AnythinkVideoView$8
            r1.<init>()
            r0.setOnClickListener(r1)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkVideoView.mo11316c():void");
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.f13728aI = true;
            if (getVisibility() == 0) {
                m11448e();
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
            return;
        }
        if (i2 == 2) {
            if ((this.f13727aH && getVisibility() == 0) || !this.f13482f || this.f13704H.getVisibility() == 0) {
                return;
            }
            if (!this.f13485i || this.f13709M) {
                this.f13704H.setVisibility(0);
            }
            this.f13750ap = true;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
        this.f13746al = true;
        showVideoLocation(0, 0, C1886t.m9847f(this.f13477a), C1886t.m9845e(this.f13477a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f13737ac == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void dismissAllAlert() {
        DialogC2344a dialogC2344a = this.f13741ag;
        if (dialogC2344a != null) {
            dialogC2344a.dismiss();
        }
        InterfaceC2174a interfaceC2174a = this.f13481e;
        if (interfaceC2174a != null) {
            interfaceC2174a.mo10950a(125, "");
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public int getBorderViewHeight() {
        return f13691C;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public int getBorderViewLeft() {
        return f13689A;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public int getBorderViewRadius() {
        return f13699y;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public int getBorderViewTop() {
        return f13700z;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public int getBorderViewWidth() {
        return f13690B;
    }

    public int getCloseAlert() {
        return this.f13739ae;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public String getCurrentProgress() {
        try {
            int iM11488a = this.f13732aM.m11488a();
            C1781c c1781c = this.f13478b;
            int iM10155bi = c1781c != null ? c1781c.m10155bi() : 0;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m11434a(iM11488a, iM10155bi));
            jSONObject.put("time", iM11488a);
            jSONObject.put("duration", String.valueOf(iM10155bi));
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return MessageFormatter.DELIM_STR;
        }
    }

    public int getMute() {
        return this.f13757ax;
    }

    public String getUnitId() {
        return this.f13743ai;
    }

    public int getVideoSkipTime() {
        return this.f13737ac;
    }

    public void gonePlayingCloseView() {
        if (this.f13482f && this.f13704H.getVisibility() != 8) {
            this.f13704H.setVisibility(8);
            this.f13750ap = false;
        }
        if (this.f13733aN || this.f13753as || this.f13751aq) {
            return;
        }
        this.f13733aN = true;
        int i = this.f13737ac;
        if (i >= 0) {
            if (i == 0) {
                this.f13753as = true;
            } else {
                new Handler().postDelayed(new RunnableC216211(), this.f13737ac * 1000);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void hideAlertView(int i) {
        if (this.f13719W) {
            this.f13719W = false;
            this.f13722aC = true;
            setShowingAlertViewCover(false);
            C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13743ai, false);
            if (i == 0) {
                m11456i();
                if (this.f13756av) {
                    int i2 = this.f13759az;
                    if (i2 == C1801a.f11130cs || i2 == C1801a.f11129cr) {
                        this.f13723aD = true;
                        InterfaceC2174a interfaceC2174a = this.f13481e;
                        if (interfaceC2174a != null) {
                            interfaceC2174a.mo10950a(InterfaceC2174a.f13811O, "");
                        }
                        this.f13727aH = true;
                        gonePlayingCloseView();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f13724aE = true;
            boolean z = this.f13756av;
            if (z && this.f13759az == C1801a.f11130cs) {
                m11456i();
                return;
            }
            if (z && this.f13759az == C1801a.f11129cr) {
                InterfaceC2174a interfaceC2174a2 = this.f13481e;
                if (interfaceC2174a2 != null) {
                    interfaceC2174a2.mo10950a(2, m11441b(this.f13726aG));
                    return;
                }
                return;
            }
            InterfaceC2174a interfaceC2174a3 = this.f13481e;
            if (interfaceC2174a3 != null) {
                interfaceC2174a3.mo10950a(2, "");
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public boolean isH5Canvas() {
        return getLayoutParams().height < C1886t.m9845e(this.f13477a.getApplicationContext());
    }

    public boolean isInstallDialogShowing() {
        return this.f13735aa;
    }

    public boolean isMiniCardShowing() {
        return this.f13749ao;
    }

    public boolean isShowingAlertView() {
        return this.f13719W;
    }

    public boolean isShowingTransparent() {
        return this.f13754at;
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = iIndexOfChild + 1;
        boolean z = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.f13749ao) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f13751aq = true;
            this.f13753as = false;
        } else if (i == 1) {
            this.f13752ar = true;
        }
    }

    public void notifyVideoClose() {
        this.f13481e.mo10950a(2, "");
    }

    public void onBackPress() {
        if (this.f13749ao || this.f13719W || this.f13723aD) {
            return;
        }
        if (this.f13750ap) {
            m11448e();
            return;
        }
        boolean z = this.f13751aq;
        if (z && this.f13752ar) {
            m11448e();
        } else {
            if (z || !this.f13753as) {
                return;
            }
            m11448e();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1781c c1781c = this.f13478b;
        if ((c1781c == null || !c1781c.m8886j()) && this.f13482f && this.f13746al) {
            m11462l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f13734aO != null) {
                getHandler().removeCallbacks(this.f13734aO);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        C1781c c1781c;
        this.f13715S = c2309b;
        if (!this.f13482f) {
            InterfaceC2174a interfaceC2174a = this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(12, "AnyThinkVideoView initSuccess false");
            }
        } else if (!TextUtils.isEmpty(this.f13736ab) && (c1781c = this.f13478b) != null) {
            if (c1781c != null && C1889w.m9868b(c1781c.m8813U())) {
                String[] strArrSplit = this.f13478b.m8813U().split("x");
                if (strArrSplit.length == 2) {
                    if (C1886t.m9833b(strArrSplit[0]) > 0.0d) {
                        this.f13744aj = C1886t.m9833b(strArrSplit[0]);
                    }
                    if (C1886t.m9833b(strArrSplit[1]) > 0.0d) {
                        this.f13745ak = C1886t.m9833b(strArrSplit[1]);
                    }
                    StringBuilder sb = new StringBuilder("AnythinkBaseView mVideoW:");
                    sb.append(this.f13744aj);
                    sb.append("  mVideoH:");
                    sb.append(this.f13745ak);
                }
                if (this.f13744aj <= 0.0d) {
                    this.f13744aj = 1280.0d;
                }
                if (this.f13745ak <= 0.0d) {
                    this.f13745ak = 720.0d;
                }
            }
            InterfaceC1973c interfaceC1973c = this.f13760n;
            if (interfaceC1973c != null) {
                interfaceC1973c.mo10463c();
            }
            this.f13701E.setTempEventListener(this.f13760n);
            this.f13701E.initBufferIngParam(this.f13738ad);
            this.f13701E.initVFPData(this.f13736ab, this.f13478b.m8811S(), this.f13478b.m8846ao(), this.f13732aM);
            soundOperate(this.f13757ax, -1, null);
        }
        f13693aw = false;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (this.f13482f) {
            if (i == 1) {
                ProgressBar progressBar2 = this.f13707K;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                }
                return;
            }
            if (i != 2 || (progressBar = this.f13707K) == null) {
                return;
            }
            progressBar.setVisibility(0);
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void progressOperate(int i, int i2) {
        PlayerView playerView;
        if (this.f13482f) {
            C1781c c1781c = this.f13478b;
            int iM10155bi = c1781c != null ? c1781c.m10155bi() : 0;
            if (i > 0 && i <= iM10155bi && (playerView = this.f13701E) != null) {
                playerView.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.f13703G.setVisibility(8);
            } else if (i2 == 2) {
                this.f13703G.setVisibility(0);
            }
            if (this.f13703G.getVisibility() == 0) {
                m11466n();
            }
        }
    }

    public void releasePlayer() {
        try {
            PlayerView playerView = this.f13701E;
            if (playerView != null && !this.f13748an) {
                playerView.release();
            }
            C2173b c2173b = this.f13732aM;
            if (c2173b != null) {
                c2173b.m11493b();
            }
            if (this.f13718V != null) {
                this.f13718V = null;
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setBufferTimeout(int i) {
        this.f13738ad = i;
    }

    public void setCTALayoutVisibleOrGone() {
        FrameLayout frameLayout;
        C1781c c1781c = this.f13478b;
        if (c1781c != null && c1781c.m8886j() && (frameLayout = this.f13713Q) != null && this.f13716T >= -1) {
            AnythinkClickCTAView anythinkClickCTAView = this.f13714R;
            if (anythinkClickCTAView == null && frameLayout != null) {
                if (anythinkClickCTAView == null) {
                    AnythinkClickCTAView anythinkClickCTAView2 = new AnythinkClickCTAView(getContext());
                    this.f13714R = anythinkClickCTAView2;
                    anythinkClickCTAView2.setCampaign(this.f13478b);
                    this.f13714R.setUnitId(this.f13743ai);
                    InterfaceC2174a interfaceC2174a = this.f13718V;
                    if (interfaceC2174a != null) {
                        this.f13714R.setNotifyListener(new C2183i(interfaceC2174a));
                    }
                    this.f13714R.preLoadData(this.f13715S);
                }
                this.f13713Q.addView(this.f13714R);
            }
            int i = this.f13716T;
            if (i >= 0) {
                this.f13713Q.setVisibility(0);
                return;
            }
            if (i == -1) {
                if (this.f13713Q.getVisibility() != 0) {
                    this.f13713Q.setVisibility(0);
                    postDelayed(this.f13734aO, C2187m.f13871ag);
                } else {
                    this.f13713Q.setVisibility(8);
                    getHandler().removeCallbacks(this.f13734aO);
                }
            }
        }
    }

    public void setCamPlayOrderCallback(InterfaceC2079a interfaceC2079a, List<C1781c> list, int i, int i2) {
        AnyThinkSegmentsProgressBar anyThinkSegmentsProgressBar;
        this.f13711O = interfaceC2079a;
        this.mCampaignSize = list.size();
        this.mCurrPlayNum = i;
        this.f13712P = i2;
        this.mCampOrderViewData = list;
        C1781c c1781c = this.f13478b;
        if (c1781c == null || c1781c.m8887k() != 5 || (anyThinkSegmentsProgressBar = this.f13710N) == null || this.mCampOrderViewData == null) {
            return;
        }
        if (this.mCampaignSize <= 1) {
            anyThinkSegmentsProgressBar.setVisibility(8);
            return;
        }
        anyThinkSegmentsProgressBar.setVisibility(0);
        this.f13710N.init(this.mCampaignSize, 2);
        for (int i3 = 0; i3 < this.mCampOrderViewData.size(); i3++) {
            int iM8831aF = this.mCampOrderViewData.get(i3).m8831aF();
            if (iM8831aF > 0) {
                this.f13710N.setProgress(iM8831aF, i3);
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setCampaign(C1781c c1781c) {
        super.setCampaign(c1781c);
        C2173b c2173b = this.f13732aM;
        if (c2173b != null) {
            c2173b.m11490a(c1781c);
            this.f13732aM.m11489a((c1781c == null || c1781c.m8846ao() == -1) ? C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13743ai, false).m12104v() : c1781c.m8846ao(), C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13743ai, false).m12106x());
        }
    }

    public void setCloseAlert(int i) {
        this.f13739ae = i;
    }

    public void setContainerViewOnNotifyListener(InterfaceC2174a interfaceC2174a) {
        this.f13718V = interfaceC2174a;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void setCover(boolean z) {
        if (this.f13482f) {
            this.f13701E.setIsCovered(z);
        }
    }

    public void setDialogRole(int i) {
        this.f13725aF = i == 1;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(C4196o4.OooO00o.OooO0Oo);
        sb.append(this.f13725aF);
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f13759az = i;
        this.f13720aA = i2;
        this.f13721aB = i3;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void setInstallDialogState(boolean z) {
        this.f13735aa = z;
        this.f13701E.setIsCovered(z);
    }

    public void setIsIV(boolean z) {
        this.f13756av = z;
        C2173b c2173b = this.f13732aM;
        if (c2173b != null) {
            c2173b.m11492a(z);
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void setMiniEndCardState(boolean z) {
        this.f13749ao = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        RelativeLayout relativeLayout;
        try {
            new StringBuilder("NOTCH VideoView ").append(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            if (!(Math.max(Math.max(layoutParams.leftMargin, layoutParams.rightMargin), Math.max(layoutParams.topMargin, layoutParams.bottomMargin)) > Math.max(Math.max(i, i2), Math.max(i3, i4))) && (relativeLayout = this.f13705I) != null) {
                relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.12

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f13767a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ int f13768b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ int f13769c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ int f13770d;

                    public RunnableC216312(int i5, int i32, int i22, int i42) {
                        i = i5;
                        i = i32;
                        i = i22;
                        i = i42;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AnythinkVideoView.this.f13705I == null) {
                            return;
                        }
                        AnythinkVideoView.this.f13705I.setVisibility(0);
                        C1781c c1781c = AnythinkVideoView.this.f13478b;
                        if (c1781c != null && !c1781c.m8886j() && AnythinkVideoView.this.f13478b.m8872f() != 2) {
                            AnythinkVideoView.this.f13705I.setPadding(i, i, i, i);
                            AnythinkVideoView.this.f13705I.startAnimation(AnythinkVideoView.this.f13730aK);
                        }
                        AnythinkVideoView.this.f13705I.setVisibility(0);
                    }
                }, 200L);
            }
            if (this.f13703G.getVisibility() == 0) {
                m11466n();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setPlayURL(String str) {
        this.f13736ab = str;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void setScaleFitXY(int i) {
        this.f13755au = i;
    }

    public void setShowingAlertViewCover(boolean z) {
        this.f13701E.setIsCovered(z);
    }

    public void setShowingTransparent(boolean z) {
        this.f13754at = z;
    }

    public void setSoundState(int i) {
        this.f13757ax = i;
    }

    public void setTempEventListener(InterfaceC1973c interfaceC1973c) {
        this.f13760n = interfaceC1973c;
    }

    public void setUnitId(String str) {
        this.f13743ai = str;
        C2173b c2173b = this.f13732aM;
        if (c2173b != null) {
            c2173b.m11491a(str);
        }
    }

    public void setVideoLayout(C1781c c1781c) {
        if (c1781c != null) {
            this.f13478b = c1781c;
            this.f13485i = c1781c.m8886j();
        }
        if (this.f13485i) {
            new C2099c();
            C2074c c2074cM11254a = C2099c.m11254a(this, c1781c);
            C2071b.m11062a();
            C2071b.m11064a(c2074cM11254a, new C21601(this, c2074cM11254a));
            return;
        }
        int iFindLayout = findLayout(f13694t);
        if (iFindLayout > 0) {
            this.f13479c.inflate(iFindLayout, this);
            m11442b();
        }
        f13693aw = false;
    }

    public void setVideoSkipTime(int i) {
        this.f13737ac = i;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void setVisible(int i) {
        setVisibility(i);
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void showAlertView() {
        if (this.f13749ao) {
            return;
        }
        if (this.f13742ah == null) {
            this.f13742ah = new InterfaceC2345b() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.9
                public C21719() {
                }

                @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
                /* JADX INFO: renamed from: a */
                public final void mo9362a() {
                    AnythinkVideoView.m11455h(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.f13719W);
                    if (AnythinkVideoView.this.f13756av && (AnythinkVideoView.this.f13759az == C1801a.f11130cs || AnythinkVideoView.this.f13759az == C1801a.f11129cr)) {
                        AnythinkVideoView.m11461k(AnythinkVideoView.this);
                        InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
                        if (interfaceC2174a != null) {
                            interfaceC2174a.mo10950a(InterfaceC2174a.f13811O, "");
                        }
                        AnythinkVideoView.m11463l(AnythinkVideoView.this);
                        AnythinkVideoView.this.gonePlayingCloseView();
                    }
                    AnythinkVideoView.this.m11456i();
                }

                @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
                /* JADX INFO: renamed from: b */
                public final void mo9363b() {
                    AnythinkVideoView.m11455h(AnythinkVideoView.this);
                    AnythinkVideoView.m11467n(AnythinkVideoView.this);
                    AnythinkVideoView anythinkVideoView = AnythinkVideoView.this;
                    anythinkVideoView.setShowingAlertViewCover(anythinkVideoView.f13719W);
                    if (AnythinkVideoView.this.f13756av && AnythinkVideoView.this.f13759az == C1801a.f11129cr) {
                        AnythinkVideoView anythinkVideoView2 = AnythinkVideoView.this;
                        InterfaceC2174a interfaceC2174a = anythinkVideoView2.f13481e;
                        if (interfaceC2174a != null) {
                            interfaceC2174a.mo10950a(2, anythinkVideoView2.m11441b(anythinkVideoView2.f13726aG));
                            return;
                        }
                        return;
                    }
                    if (AnythinkVideoView.this.f13756av && AnythinkVideoView.this.f13759az == C1801a.f11130cs) {
                        AnythinkVideoView.this.m11456i();
                        return;
                    }
                    InterfaceC2174a interfaceC2174a2 = AnythinkVideoView.this.f13481e;
                    if (interfaceC2174a2 != null) {
                        interfaceC2174a2.mo10950a(2, "");
                    }
                }

                @Override // com.anythink.expressad.widget.p182a.InterfaceC2345b
                /* JADX INFO: renamed from: c */
                public final void mo9364c() {
                    mo9362a();
                }
            };
        }
        if (this.f13741ag == null) {
            this.f13741ag = new DialogC2344a(getContext(), this.f13742ah);
        }
        if (this.f13756av) {
            this.f13741ag.m12128a(this.f13759az, this.f13743ai);
        } else {
            this.f13741ag.m12129b();
        }
        PlayerView playerView = this.f13701E;
        if (playerView == null || playerView.isComplete()) {
            return;
        }
        this.f13741ag.show();
        this.f13722aC = true;
        this.f13719W = true;
        setShowingAlertViewCover(true);
        C2339c.m11994a().m12000a(C1773a.m8548c().m8558f(), this.f13743ai, false);
        this.f13758ay = C2340d.m12003J();
    }

    public void showBaitClickView() {
        int i;
        AnythinkBaitClickView anythinkBaitClickView;
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8886j() || this.f13478b.m8805M() == null) {
            return;
        }
        String strM8957e = this.f13478b.m8805M().m8957e();
        if (TextUtils.isEmpty(strM8957e)) {
            return;
        }
        try {
            String strM9870a = C1890x.m9870a(strM8957e, "bait_click");
            if (TextUtils.isEmpty(strM9870a) || (i = Integer.parseInt(strM9870a)) == 0 || (anythinkBaitClickView = this.f13731aL) == null) {
                return;
            }
            anythinkBaitClickView.setVisibility(0);
            this.f13731aL.init(i);
            this.f13731aL.startAnimation();
            this.f13731aL.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoView.4
                public ViewOnClickListenerC21664() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC2174a interfaceC2174a = AnythinkVideoView.this.f13481e;
                    if (interfaceC2174a != null) {
                        interfaceC2174a.mo10950a(1, "");
                    }
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void showIVRewardAlertView(String str) {
        this.f13481e.mo10950a(8, "");
    }

    public void showMoreOfferInPlayTemplate() {
        C1781c c1781c = this.f13478b;
        if (c1781c == null || this.f13717U == null || !c1781c.m8886j() || this.f13478b.m8805M() == null) {
            return;
        }
        TextUtils.isEmpty(this.f13478b.m8805M().m8957e());
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        StringBuilder sb = new StringBuilder("showVideoLocation marginTop:");
        sb.append(i);
        sb.append(" marginLeft:");
        sb.append(i2);
        sb.append(" width:");
        sb.append(i3);
        sb.append("  height:");
        sb.append(i4);
        sb.append(" radius:");
        sb.append(i5);
        sb.append(" borderTop:");
        sb.append(i6);
        sb.append(" borderLeft:");
        sb.append(i7);
        sb.append(" borderWidth:");
        sb.append(i8);
        sb.append(" borderHeight:");
        sb.append(i9);
        if (this.f13482f) {
            this.f13705I.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f13705I.getVisibility() != 0) {
                this.f13705I.setVisibility(0);
            }
            if (this.f13703G.getVisibility() == 0) {
                m11466n();
            }
            if (!(i3 > 0 && i4 > 0 && C1886t.m9847f(this.f13477a) >= i3 && C1886t.m9845e(this.f13477a) >= i4) || this.f13746al) {
                m11462l();
                return;
            }
            f13700z = i6;
            f13689A = i7;
            f13690B = i8 + 4;
            f13691C = i9 + 4;
            float f = i3 / i4;
            float f2 = 0.0f;
            try {
                f2 = (float) (this.f13744aj / this.f13745ak);
            } catch (Throwable th) {
                th.getMessage();
            }
            if (i5 > 0) {
                f13699y = i5;
                if (i5 > 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(C1886t.m9834b(getContext(), i5));
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(1, 0);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 16) {
                        setBackground(gradientDrawable);
                        this.f13701E.setBackground(gradientDrawable);
                    } else {
                        setBackgroundDrawable(gradientDrawable);
                        this.f13701E.setBackgroundDrawable(gradientDrawable);
                    }
                    if (i10 >= 21) {
                        setClipToOutline(true);
                        this.f13701E.setClipToOutline(true);
                    }
                }
            }
            if (Math.abs(f - f2) > 0.1f && this.f13755au != 1) {
                m11462l();
                videoOperate(1);
                return;
            }
            m11462l();
            if (!this.f13754at) {
                setLayoutParam(i2, i, i3, i4);
                return;
            }
            setLayoutCenter(i3, i4);
            if (f13693aw) {
                this.f13481e.mo10950a(114, "");
            } else {
                this.f13481e.mo10950a(116, "");
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0034 A[PHI: r6
  0x0034: PHI (r6v6 com.anythink.expressad.video.widget.SoundImageView) = (r6v4 com.anythink.expressad.video.widget.SoundImageView), (r6v7 com.anythink.expressad.video.widget.SoundImageView) binds: [B:68:0x0048, B:60:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void soundOperate(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r4.f13482f
            if (r0 == 0) goto L4b
            r4.f13757ax = r5
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != r2) goto L18
            com.anythink.expressad.video.widget.SoundImageView r3 = r4.f13702F
            if (r3 == 0) goto L12
            r3.setSoundStatus(r1)
        L12:
            com.anythink.expressad.playercommon.PlayerView r3 = r4.f13701E
            r3.closeSound()
            goto L26
        L18:
            if (r5 != r0) goto L26
            com.anythink.expressad.video.widget.SoundImageView r3 = r4.f13702F
            if (r3 == 0) goto L21
            r3.setSoundStatus(r2)
        L21:
            com.anythink.expressad.playercommon.PlayerView r3 = r4.f13701E
            r3.openSound()
        L26:
            com.anythink.expressad.foundation.d.c r3 = r4.f13478b
            if (r3 == 0) goto L38
            boolean r3 = r3.m8886j()
            if (r3 == 0) goto L38
            com.anythink.expressad.video.widget.SoundImageView r6 = r4.f13702F
            if (r6 == 0) goto L4b
        L34:
            r6.setVisibility(r1)
            goto L4b
        L38:
            if (r6 != r2) goto L44
            com.anythink.expressad.video.widget.SoundImageView r6 = r4.f13702F
            if (r6 == 0) goto L4b
            r0 = 8
            r6.setVisibility(r0)
            goto L4b
        L44:
            if (r6 != r0) goto L4b
            com.anythink.expressad.video.widget.SoundImageView r6 = r4.f13702F
            if (r6 == 0) goto L4b
            goto L34
        L4b:
            if (r7 == 0) goto L61
            java.lang.String r6 = "2"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L61
            com.anythink.expressad.video.module.a.a r6 = r4.f13481e
            if (r6 == 0) goto L61
            r7 = 7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo10950a(r7, r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkVideoView.soundOperate(int, int, java.lang.String):void");
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2313j
    public void videoOperate(int i) {
        if (this.f13482f) {
            if (i == 1) {
                if (getVisibility() != 0 || !isfront() || this.f13719W || this.f13749ao || this.f13735aa || C1800b.f10958c) {
                    return;
                }
                m11456i();
                return;
            }
            if (i == 2) {
                if (getVisibility() == 0) {
                    m11454h();
                    return;
                }
                return;
            }
            if (i == 3) {
                if (this.f13748an) {
                    return;
                }
                this.f13701E.release();
                this.f13748an = true;
                return;
            }
            if (i == 5) {
                this.f13735aa = true;
                if (this.f13748an) {
                    return;
                }
                m11454h();
                return;
            }
            if (i == 4) {
                this.f13735aa = false;
                if (this.f13748an || isMiniCardShowing()) {
                    return;
                }
                m11456i();
            }
        }
    }
}
