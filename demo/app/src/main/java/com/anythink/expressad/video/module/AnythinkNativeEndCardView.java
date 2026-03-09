package com.anythink.expressad.video.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.C1404a;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.foundation.p138h.C1890x;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.shake.AbstractC1975b;
import com.anythink.expressad.shake.C1974a;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.video.dynview.C2068a;
import com.anythink.expressad.video.dynview.C2071b;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.dynview.p170j.C2099c;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnythinkBaitClickView;
import com.anythink.expressad.video.module.p172a.p173a.C2184j;
import com.anythink.expressad.video.signal.InterfaceC2307f;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.videocommon.view.RoundImageView;
import com.anythink.expressad.videocommon.view.StarLevelView;
import com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkNativeEndCardView extends AnythinkBaseView implements InterfaceC2307f {

    /* JADX INFO: renamed from: n */
    private static final String f13610n = "anythink_reward_endcard_native_hor";

    /* JADX INFO: renamed from: o */
    private static final String f13611o = "anythink_reward_endcard_native_land";

    /* JADX INFO: renamed from: p */
    private static final String f13612p = "anythink_reward_endcard_native_half_portrait";

    /* JADX INFO: renamed from: q */
    private static final String f13613q = "anythink_reward_endcard_native_half_landscape";

    /* JADX INFO: renamed from: A */
    private ImageView f13614A;

    /* JADX INFO: renamed from: B */
    private TextView f13615B;

    /* JADX INFO: renamed from: C */
    private TextView f13616C;

    /* JADX INFO: renamed from: D */
    private TextView f13617D;

    /* JADX INFO: renamed from: E */
    private LinearLayout f13618E;

    /* JADX INFO: renamed from: F */
    private FeedBackButton f13619F;

    /* JADX INFO: renamed from: G */
    private Runnable f13620G;

    /* JADX INFO: renamed from: H */
    private RelativeLayout f13621H;

    /* JADX INFO: renamed from: I */
    private C2309b f13622I;

    /* JADX INFO: renamed from: J */
    private boolean f13623J;

    /* JADX INFO: renamed from: K */
    private boolean f13624K;

    /* JADX INFO: renamed from: L */
    private int f13625L;

    /* JADX INFO: renamed from: M */
    private boolean f13626M;

    /* JADX INFO: renamed from: N */
    private boolean f13627N;

    /* JADX INFO: renamed from: O */
    private boolean f13628O;

    /* JADX INFO: renamed from: P */
    private AlphaAnimation f13629P;

    /* JADX INFO: renamed from: Q */
    private int f13630Q;

    /* JADX INFO: renamed from: R */
    private int f13631R;

    /* JADX INFO: renamed from: S */
    private int f13632S;

    /* JADX INFO: renamed from: T */
    private int f13633T;

    /* JADX INFO: renamed from: U */
    private boolean f13634U;

    /* JADX INFO: renamed from: V */
    private View f13635V;

    /* JADX INFO: renamed from: W */
    private TextView f13636W;

    /* JADX INFO: renamed from: aa */
    private boolean f13637aa;

    /* JADX INFO: renamed from: ab */
    private String f13638ab;

    /* JADX INFO: renamed from: ac */
    private C1782d f13639ac;

    /* JADX INFO: renamed from: ad */
    private MBShakeView f13640ad;

    /* JADX INFO: renamed from: ae */
    private AbstractC1975b f13641ae;

    /* JADX INFO: renamed from: af */
    private AnythinkBaitClickView f13642af;

    /* JADX INFO: renamed from: ag */
    private int f13643ag;

    /* JADX INFO: renamed from: r */
    private ViewGroup f13644r;

    /* JADX INFO: renamed from: s */
    private ViewGroup f13645s;

    /* JADX INFO: renamed from: t */
    private RelativeLayout f13646t;

    /* JADX INFO: renamed from: u */
    private RelativeLayout f13647u;

    /* JADX INFO: renamed from: v */
    private ImageView f13648v;

    /* JADX INFO: renamed from: w */
    private ImageView f13649w;

    /* JADX INFO: renamed from: x */
    private ImageView f13650x;

    /* JADX INFO: renamed from: y */
    private ImageView f13651y;

    /* JADX INFO: renamed from: z */
    private ImageView f13652z;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$1 */
    public class RunnableC21381 implements Runnable {
        public RunnableC21381() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView.m11384a(AnythinkNativeEndCardView.this);
            if (AnythinkNativeEndCardView.this.f13635V != null) {
                AnythinkNativeEndCardView.this.f13635V.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$10 */
    public class C213910 implements InterfaceC2086h {
        public C213910() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10989a(C2068a c2068a) {
            AnythinkNativeEndCardView.this.addView(c2068a.m11055a());
            AnythinkNativeEndCardView.this.f13634U = c2068a.m11059c();
            AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
            anythinkNativeEndCardView.f13482f = anythinkNativeEndCardView.m11390b(c2068a.m11055a());
            AnythinkNativeEndCardView.this.m11396e();
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10990a(EnumC2076b enumC2076b) {
            new StringBuilder("errorMsg:").append(enumC2076b.m11124b());
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$11 */
    public class C214011 implements InterfaceC1819c {
        public C214011() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (AnythinkNativeEndCardView.this.f13649w != null) {
                    AnythinkNativeEndCardView anythinkNativeEndCardView = AnythinkNativeEndCardView.this;
                    if (anythinkNativeEndCardView.f13485i) {
                        anythinkNativeEndCardView.f13649w.setBackgroundDrawable(null);
                    }
                    AnythinkNativeEndCardView.this.f13649w.setImageBitmap(bitmap);
                }
                Bitmap bitmapBlurBitmap = AnythinkNativeEndCardView.this.blurBitmap(bitmap);
                if (bitmapBlurBitmap == null || bitmapBlurBitmap.isRecycled() || AnythinkNativeEndCardView.this.f13648v == null) {
                    return;
                }
                AnythinkNativeEndCardView anythinkNativeEndCardView2 = AnythinkNativeEndCardView.this;
                if (anythinkNativeEndCardView2.f13485i) {
                    anythinkNativeEndCardView2.f13648v.setBackgroundDrawable(null);
                }
                AnythinkNativeEndCardView.this.f13648v.setImageBitmap(bitmapBlurBitmap);
            } catch (Throwable unused) {
                if (AnythinkNativeEndCardView.this.f13648v != null) {
                    AnythinkNativeEndCardView.this.f13648v.setVisibility(4);
                }
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$12 */
    public class C214112 implements InterfaceC1819c {
        public C214112() {
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5462a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled() || bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                int iM9834b = C1886t.m9834b(AnythinkNativeEndCardView.this.f13477a, 12.0f);
                AnythinkNativeEndCardView.this.f13651y.getLayoutParams().height = iM9834b;
                AnythinkNativeEndCardView.this.f13651y.getLayoutParams().width = (int) (iM9834b * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                AnythinkNativeEndCardView.this.f13651y.setImageBitmap(bitmap);
                AnythinkNativeEndCardView.this.f13651y.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }

        @Override // com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$13 */
    public class ViewOnClickListenerC214213 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f13657a;

        public ViewOnClickListenerC214213(String str) {
            this.f13657a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4203a(AnythinkNativeEndCardView.this.f13477a, this.f13657a);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$14 */
    public class ViewOnClickListenerC214314 implements View.OnClickListener {
        public ViewOnClickListenerC214314() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (AnythinkNativeEndCardView.this.f13623J) {
                AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 1);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$15 */
    public class ViewOnClickListenerC214415 implements View.OnClickListener {
        public ViewOnClickListenerC214415() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.this.f13481e.mo10950a(104, "");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$16 */
    public class C214516 extends AbstractViewOnClickListenerC2343a {
        public C214516() {
        }

        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
        /* JADX INFO: renamed from: a */
        public final void mo11015a(View view) {
            AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$17 */
    public class C214617 extends AbstractViewOnClickListenerC2343a {
        public C214617() {
        }

        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
        /* JADX INFO: renamed from: a */
        public final void mo11015a(View view) {
            AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$2 */
    public class C21472 extends AbstractViewOnClickListenerC2343a {
        public C21472() {
        }

        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
        /* JADX INFO: renamed from: a */
        public final void mo11015a(View view) {
            AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$3 */
    public class RunnableC21483 implements Runnable {
        public RunnableC21483() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1781c c1781c = AnythinkNativeEndCardView.this.f13478b;
            if (c1781c != null && !c1781c.m8886j() && AnythinkNativeEndCardView.this.f13478b.m8872f() != 2) {
                AnythinkNativeEndCardView.this.f13621H.setPadding(AnythinkNativeEndCardView.this.f13630Q, AnythinkNativeEndCardView.this.f13632S, AnythinkNativeEndCardView.this.f13631R, AnythinkNativeEndCardView.this.f13633T);
                AnythinkNativeEndCardView.this.f13621H.startAnimation(AnythinkNativeEndCardView.this.f13629P);
            }
            AnythinkNativeEndCardView.this.f13621H.setVisibility(0);
            if (AnythinkNativeEndCardView.this.f13635V.getVisibility() != 0 && AnythinkNativeEndCardView.this.f13624K) {
                AnythinkNativeEndCardView.this.f13635V.setVisibility(0);
            }
            AnythinkNativeEndCardView.m11413o(AnythinkNativeEndCardView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$4 */
    public class C21494 implements InterfaceC1798a {
        public C21494() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
            AnythinkNativeEndCardView.this.f13628O = true;
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
            AnythinkNativeEndCardView.this.f13628O = false;
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
            AnythinkNativeEndCardView.this.f13628O = false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$5 */
    public class ViewOnClickListenerC21505 implements View.OnClickListener {
        public ViewOnClickListenerC21505() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$6 */
    public class C21516 extends AbstractC1975b {
        public C21516(int i, int i2) {
            super(i, i2);
        }

        @Override // com.anythink.expressad.shake.AbstractC1975b
        /* JADX INFO: renamed from: a */
        public final void mo10481a() {
            if (!AnythinkNativeEndCardView.this.f13628O && AnythinkNativeEndCardView.this.f13627N && AnythinkNativeEndCardView.this.isShown()) {
                AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 4);
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$7 */
    public class ViewOnAttachStateChangeListenerC21527 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f13668a = false;

        public ViewOnAttachStateChangeListenerC21527() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NonNull View view) {
            if (this.f13668a || AnythinkNativeEndCardView.this.f13641ae == null) {
                return;
            }
            this.f13668a = true;
            C1974a.m10477a().m10478a(AnythinkNativeEndCardView.this.f13641ae);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NonNull View view) {
            if (AnythinkNativeEndCardView.this.f13641ae != null) {
                C1974a.m10477a().m10479b(AnythinkNativeEndCardView.this.f13641ae);
            }
            AnythinkNativeEndCardView.this.f13641ae = null;
            this.f13668a = false;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$8 */
    public class ViewOnClickListenerC21538 implements View.OnClickListener {
        public ViewOnClickListenerC21538() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkNativeEndCardView$9 */
    public class RunnableC21549 implements Runnable {
        public RunnableC21549() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 2);
        }
    }

    public AnythinkNativeEndCardView(Context context) {
        super(context);
        this.f13623J = false;
        this.f13624K = false;
        this.f13625L = 0;
        this.f13626M = false;
        this.f13627N = false;
        this.f13628O = false;
        this.f13634U = false;
        this.f13643ag = 1;
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13623J = false;
        this.f13624K = false;
        this.f13625L = 0;
        this.f13626M = false;
        this.f13627N = false;
        this.f13628O = false;
        this.f13634U = false;
        this.f13643ag = 1;
    }

    public AnythinkNativeEndCardView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z3, int i2, int i3) {
        super(context, attributeSet, z, i, z3, i2, i3);
        this.f13623J = false;
        this.f13624K = false;
        this.f13625L = 0;
        this.f13626M = false;
        this.f13627N = false;
        this.f13628O = false;
        this.f13634U = false;
        this.f13643ag = 1;
    }

    /* JADX INFO: renamed from: a */
    private void m11381a() {
        new C2099c();
        C2074c c2074cM11252a = C2099c.m11252a(getContext(), this.f13478b, this.f13486j);
        C2071b.m11062a();
        C2071b.m11064a(c2074cM11252a, new C213910());
    }

    /* JADX INFO: renamed from: a */
    private void m11382a(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.f13622I);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            m11390b(view);
            mo11316c();
        }
        m11402h();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11383a(AnythinkNativeEndCardView anythinkNativeEndCardView, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C1801a.f11116ce, anythinkNativeEndCardView.m11315a(i));
                if (anythinkNativeEndCardView.f13478b.m8887k() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        anythinkNativeEndCardView.f13481e.mo10950a(105, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11384a(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        anythinkNativeEndCardView.f13624K = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0031  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11388b() {
        /*
            r6 = this;
            int r0 = r6.f13643ag
            java.lang.String r1 = "anythink_reward_endcard_native_half_landscape"
            java.lang.String r2 = "anythink_reward_endcard_native_land"
            java.lang.String r3 = "anythink_reward_endcard_native_half_portrait"
            java.lang.String r4 = "anythink_reward_endcard_native_hor"
            if (r0 != 0) goto L1d
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L33
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L31
            goto L32
        L1d:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f13637aa
            if (r5 == 0) goto L25
            goto L29
        L25:
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L33
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            r3 = r1
        L33:
            int r0 = r6.findLayout(r3)
            if (r0 <= 0) goto L68
            boolean r1 = r6.isLandscape()
            r2 = 0
            if (r1 == 0) goto L50
            android.view.LayoutInflater r1 = r6.f13479c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f13645s = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f13645s
            goto L5f
        L50:
            android.view.LayoutInflater r1 = r6.f13479c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f13644r = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f13644r
        L5f:
            boolean r0 = r6.m11390b(r0)
            r6.f13482f = r0
            r6.m11396e()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkNativeEndCardView.m11388b():void");
    }

    /* JADX INFO: renamed from: b */
    private boolean m11389b(int i) {
        View view;
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f13479c.inflate(i, (ViewGroup) null);
            this.f13645s = viewGroup;
            addView(viewGroup);
            view = this.f13645s;
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.f13479c.inflate(i, (ViewGroup) null);
            this.f13644r = viewGroup2;
            addView(viewGroup2);
            view = this.f13644r;
        }
        return m11390b(view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m11390b(View view) {
        try {
            this.f13646t = (RelativeLayout) view.findViewById(filterFindViewId(this.f13634U, "anythink_native_ec_layout"));
            this.f13647u = (RelativeLayout) view.findViewById(filterFindViewId(this.f13634U, "anythink_native_ec_layer_layout"));
            this.f13649w = (ImageView) view.findViewById(filterFindViewId(this.f13634U, "anythink_iv_adbanner"));
            this.f13650x = (ImageView) view.findViewById(filterFindViewId(this.f13634U, "anythink_iv_icon"));
            this.f13651y = (ImageView) view.findViewById(filterFindViewId(this.f13634U, "anythink_iv_flag"));
            this.f13652z = (ImageView) view.findViewById(filterFindViewId(this.f13634U, "anythink_iv_link"));
            this.f13615B = (TextView) view.findViewById(filterFindViewId(this.f13634U, "anythink_tv_apptitle"));
            this.f13618E = (LinearLayout) view.findViewById(filterFindViewId(this.f13634U, "anythink_sv_starlevel"));
            this.f13635V = view.findViewById(filterFindViewId(this.f13634U, "anythink_iv_close"));
            View viewFindViewById = view.findViewById(filterFindViewId(this.f13634U, "anythink_tv_cta"));
            if (viewFindViewById != null && (viewFindViewById instanceof TextView)) {
                this.f13636W = (TextView) viewFindViewById;
            }
            this.f13619F = (FeedBackButton) view.findViewById(filterFindViewId(this.f13634U, "anythink_native_endcard_feed_btn"));
            this.f13621H = (RelativeLayout) view.findViewById(filterFindViewId(this.f13634U, "anythink_native_ec_controller"));
            this.f13648v = (ImageView) view.findViewById(filterFindViewId(this.f13634U, "anythink_iv_adbanner_bg"));
            if (!this.f13485i) {
                this.f13616C = (TextView) view.findViewById(filterFindViewId(this.f13634U, "anythink_tv_appdesc"));
                TextView textView = (TextView) view.findViewById(filterFindViewId(this.f13634U, "anythink_tv_number"));
                this.f13617D = textView;
                return isNotNULL(this.f13648v, this.f13649w, this.f13650x, this.f13615B, this.f13616C, textView, this.f13618E, this.f13635V, this.f13636W);
            }
            ImageView imageView = this.f13649w;
            if (imageView != null && (imageView instanceof RoundImageView)) {
                ((RoundImageView) imageView).setBorderRadius(10);
            }
            ImageView imageView2 = this.f13650x;
            if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                ((RoundImageView) imageView2).setBorderRadius(10);
            }
            return isNotNULL(this.f13648v, this.f13649w, this.f13650x, this.f13615B, this.f13618E, this.f13635V);
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m11392c(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C1801a.f11116ce, m11315a(i));
                if (this.f13478b.m8887k() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        this.f13481e.mo10950a(105, jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public void m11396e() {
        mo11316c();
        if (!this.f13482f) {
            this.f13481e.mo10950a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f13629P = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    /* JADX INFO: renamed from: f */
    private void m11398f() {
        ImageView imageView;
        C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10151be(), new C214011());
        C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10150bd(), new C2184j(this.f13650x, C1886t.m9834b(C1175n.m2059a().m2148f(), 8.0f)));
        this.f13615B.setText(this.f13478b.m10148bb());
        TextView textView = this.f13636W;
        if (textView != null) {
            textView.setText(this.f13478b.f11928cU);
        }
        TextView textView2 = this.f13616C;
        if (textView2 != null) {
            textView2.setText(this.f13478b.m10149bc());
        }
        TextView textView3 = this.f13617D;
        if (textView3 != null) {
            textView3.setText(this.f13478b.m10145aY() + ")");
        }
        this.f13618E.removeAllViews();
        double dM10144aX = this.f13478b.m10144aX();
        if (dM10144aX <= 0.0d) {
            dM10144aX = 5.0d;
        }
        LinearLayout linearLayout = this.f13618E;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(dM10144aX);
        }
        LinearLayout linearLayout2 = this.f13618E;
        if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
            ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(dM10144aX, this.f13478b.m10145aY());
        }
        if (!TextUtils.isEmpty(this.f13478b.m8801I()) && this.f13478b.m8801I().contains("alecfc=1")) {
            this.f13623J = true;
        }
        C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(TextUtils.isEmpty(this.f13478b.m8830aE()) ? C1404a.f6211ab : this.f13478b.m8830aE(), new C214112());
        C1773a.m8548c().m8558f();
        C1486b.m6002a();
        C1483a c1483aM6007b = C1486b.m6007b();
        if (c1483aM6007b != null) {
            String strM5936J = c1483aM6007b.m5936J();
            if (TextUtils.isEmpty(strM5936J)) {
                this.f13652z.setVisibility(8);
            }
            this.f13652z.setOnClickListener(new ViewOnClickListenerC214213(strM5936J));
        } else {
            this.f13652z.setVisibility(8);
        }
        if (!this.f13624K) {
            this.f13635V.setVisibility(8);
        }
        if (Build.VERSION.SDK_INT >= 17 || (imageView = this.f13648v) == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0031  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m11399g() {
        /*
            r6 = this;
            int r0 = r6.f13643ag
            java.lang.String r1 = "anythink_reward_endcard_native_half_landscape"
            java.lang.String r2 = "anythink_reward_endcard_native_land"
            java.lang.String r3 = "anythink_reward_endcard_native_half_portrait"
            java.lang.String r4 = "anythink_reward_endcard_native_hor"
            if (r0 != 0) goto L1d
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L33
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L31
            goto L32
        L1d:
            r5 = 1
            if (r0 != r5) goto L27
            boolean r5 = r6.f13637aa
            if (r5 == 0) goto L25
            goto L29
        L25:
            r3 = r4
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            r4 = 2
            if (r0 != r4) goto L33
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            r3 = r1
        L33:
            int r0 = r6.findLayout(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkNativeEndCardView.m11399g():int");
    }

    /* JADX INFO: renamed from: h */
    private void m11402h() {
        RelativeLayout relativeLayout;
        if (!this.f13482f || (relativeLayout = this.f13621H) == null) {
            return;
        }
        relativeLayout.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.3
            public RunnableC21483() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1781c c1781c = AnythinkNativeEndCardView.this.f13478b;
                if (c1781c != null && !c1781c.m8886j() && AnythinkNativeEndCardView.this.f13478b.m8872f() != 2) {
                    AnythinkNativeEndCardView.this.f13621H.setPadding(AnythinkNativeEndCardView.this.f13630Q, AnythinkNativeEndCardView.this.f13632S, AnythinkNativeEndCardView.this.f13631R, AnythinkNativeEndCardView.this.f13633T);
                    AnythinkNativeEndCardView.this.f13621H.startAnimation(AnythinkNativeEndCardView.this.f13629P);
                }
                AnythinkNativeEndCardView.this.f13621H.setVisibility(0);
                if (AnythinkNativeEndCardView.this.f13635V.getVisibility() != 0 && AnythinkNativeEndCardView.this.f13624K) {
                    AnythinkNativeEndCardView.this.f13635V.setVisibility(0);
                }
                AnythinkNativeEndCardView.m11413o(AnythinkNativeEndCardView.this);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: i */
    private void m11404i() {
        if (!C1800b.m9367a().m9384b()) {
            FeedBackButton feedBackButton = this.f13619F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f13478b.m8891l(this.f13638ab);
        C1800b.m9367a().m9380a(this.f13638ab + "_2", new C21494());
        C1800b.m9367a().m9379a(this.f13638ab + "_2", this.f13478b);
        C1800b.m9367a().m9385c(this.f13638ab + "_1");
        C1800b.m9367a().m9381a(this.f13638ab + "_2", this.f13619F);
        if (this.f13619F != null) {
            C1800b.m9367a().m9381a(this.f13638ab + "_2", this.f13619F);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m11406j() {
        int i;
        int i2;
        try {
            C1781c c1781c = this.f13478b;
            if (c1781c == null || !c1781c.m8886j()) {
                return;
            }
            String strM8801I = this.f13478b.m8801I();
            if (TextUtils.isEmpty(strM8801I)) {
                strM8801I = this.f13478b.m8808P();
            }
            String strM9870a = C1890x.m9870a(strM8801I, "shake_strength");
            String strM9870a2 = C1890x.m9870a(strM8801I, "shake_time");
            if (TextUtils.isEmpty("1") || this.f13640ad != null) {
                return;
            }
            AnythinkBaitClickView anythinkBaitClickView = this.f13642af;
            if (anythinkBaitClickView != null) {
                anythinkBaitClickView.setVisibility(8);
            }
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f13640ad = mBShakeView;
            mBShakeView.initView(this.f13478b.f11928cU, true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (isLandscape()) {
                layoutParams.addRule(13);
            } else {
                layoutParams.addRule(2, findID("anythink_iv_logo"));
                layoutParams.addRule(14);
                this.f13640ad.setPadding(0, 0, 0, C1886t.m9834b(getContext(), 20.0f));
            }
            this.f13640ad.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout = this.f13646t;
            if (relativeLayout != null && relativeLayout.isShown()) {
                if (this.f13636W != null) {
                    this.f13646t.addView(this.f13640ad);
                }
                this.f13636W.setVisibility(4);
                this.f13640ad.setOnClickListener(new ViewOnClickListenerC21505());
                int i3 = 10;
                if (!TextUtils.isEmpty(strM9870a) && (i2 = Integer.parseInt(strM9870a)) >= 0) {
                    i3 = i2;
                }
                int i4 = 5000;
                if (!TextUtils.isEmpty(strM9870a2) && (i = Integer.parseInt(strM9870a2)) > 0) {
                    i4 = i * 1000;
                }
                this.f13641ae = new C21516(i3, i4);
                this.f13640ad.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC21527());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m11408k() {
        try {
            C1781c c1781c = this.f13478b;
            if (c1781c == null || !c1781c.m8886j()) {
                return;
            }
            String strM8801I = this.f13478b.m8801I();
            if (TextUtils.isEmpty(strM8801I)) {
                strM8801I = this.f13478b.m8808P();
            }
            String strM9870a = C1890x.m9870a(strM8801I, "bait_click");
            int i = 1;
            try {
                i = Integer.parseInt(strM9870a);
            } catch (Throwable th) {
                th.getMessage();
            }
            if (TextUtils.isEmpty(strM9870a) || i == 0 || this.f13642af != null) {
                return;
            }
            AnythinkBaitClickView anythinkBaitClickView = new AnythinkBaitClickView(getContext());
            this.f13642af = anythinkBaitClickView;
            anythinkBaitClickView.init(1342177280, i);
            this.f13642af.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            RelativeLayout relativeLayout = this.f13647u;
            if (relativeLayout != null) {
                relativeLayout.addView(this.f13642af);
                this.f13642af.startAnimation();
                this.f13642af.setOnClickListener(new ViewOnClickListenerC21538());
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m11410l() {
        try {
            C1781c c1781c = this.f13478b;
            if (c1781c == null || !c1781c.m8886j()) {
                return;
            }
            String strM8801I = this.f13478b.m8801I();
            if (TextUtils.isEmpty(strM8801I)) {
                strM8801I = this.f13478b.m8808P();
            }
            String strM9870a = C1890x.m9870a(strM8801I, "alac");
            if (TextUtils.isEmpty(strM9870a) || !strM9870a.equals("1")) {
                return;
            }
            postDelayed(new RunnableC21549(), 1000L);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m11413o(AnythinkNativeEndCardView anythinkNativeEndCardView) {
        if (!C1800b.m9367a().m9384b()) {
            FeedBackButton feedBackButton = anythinkNativeEndCardView.f13619F;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        anythinkNativeEndCardView.f13478b.m8891l(anythinkNativeEndCardView.f13638ab);
        C1800b.m9367a().m9380a(anythinkNativeEndCardView.f13638ab + "_2", anythinkNativeEndCardView.new C21494());
        C1800b.m9367a().m9379a(anythinkNativeEndCardView.f13638ab + "_2", anythinkNativeEndCardView.f13478b);
        C1800b.m9367a().m9385c(anythinkNativeEndCardView.f13638ab + "_1");
        C1800b.m9367a().m9381a(anythinkNativeEndCardView.f13638ab + "_2", anythinkNativeEndCardView.f13619F);
        if (anythinkNativeEndCardView.f13619F != null) {
            C1800b.m9367a().m9381a(anythinkNativeEndCardView.f13638ab + "_2", anythinkNativeEndCardView.f13619F);
        }
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.f13477a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /* JADX INFO: renamed from: c */
    public final void mo11316c() {
        if (this.f13482f) {
            this.f13646t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.14
                public ViewOnClickListenerC214314() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (AnythinkNativeEndCardView.this.f13623J) {
                        AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 1);
                    }
                }
            });
            this.f13635V.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.15
                public ViewOnClickListenerC214415() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkNativeEndCardView.this.f13481e.mo10950a(104, "");
                }
            });
            TextView textView = this.f13636W;
            if (textView != null) {
                textView.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.16
                    public C214516() {
                    }

                    @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                    /* JADX INFO: renamed from: a */
                    public final void mo11015a(View view) {
                        AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
                    }
                });
            }
            this.f13650x.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.17
                public C214617() {
                }

                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
                }
            });
            this.f13649w.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.2
                public C21472() {
                }

                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkNativeEndCardView.m11383a(AnythinkNativeEndCardView.this, 0);
                }
            });
        }
    }

    public boolean canBackPress() {
        View view = this.f13635V;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        C1782d c1782d;
        ArrayList<C1781c> arrayList;
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8886j() || (c1782d = this.f13639ac) == null || (arrayList = c1782d.f10572J) == null || arrayList.size() <= 0) {
            return;
        }
        for (C1781c c1781c2 : this.f13639ac.f10572J) {
            if (!TextUtils.isEmpty(c1781c2.m10150bd())) {
                C1818b.m9427a(C1175n.m2059a().m2148f()).m9445c(c1781c2.m10150bd());
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    public boolean isDyXmlSuccess() {
        return this.f13634U;
    }

    public void notifyShowListener() {
        this.f13481e.mo10950a(110, "");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i;
        int i2;
        int i3;
        super.onAttachedToWindow();
        if (this.f13620G == null) {
            this.f13620G = new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkNativeEndCardView.1
                public RunnableC21381() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnythinkNativeEndCardView.m11384a(AnythinkNativeEndCardView.this);
                    if (AnythinkNativeEndCardView.this.f13635V != null) {
                        AnythinkNativeEndCardView.this.f13635V.setVisibility(0);
                    }
                }
            };
        }
        Runnable runnable = this.f13620G;
        if (runnable != null) {
            postDelayed(runnable, this.f13625L * 1000);
            if (!this.f13627N) {
                this.f13627N = true;
            }
            try {
                C1781c c1781c = this.f13478b;
                if (c1781c != null && c1781c.m8886j()) {
                    String strM8801I = this.f13478b.m8801I();
                    if (TextUtils.isEmpty(strM8801I)) {
                        strM8801I = this.f13478b.m8808P();
                    }
                    String strM9870a = C1890x.m9870a(strM8801I, "alac");
                    if (!TextUtils.isEmpty(strM9870a) && strM9870a.equals("1")) {
                        postDelayed(new RunnableC21549(), 1000L);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        try {
            C1781c c1781c2 = this.f13478b;
            if (c1781c2 != null && c1781c2.m8886j()) {
                String strM8801I2 = this.f13478b.m8801I();
                if (TextUtils.isEmpty(strM8801I2)) {
                    strM8801I2 = this.f13478b.m8808P();
                }
                String strM9870a2 = C1890x.m9870a(strM8801I2, "bait_click");
                try {
                    i3 = Integer.parseInt(strM9870a2);
                } catch (Throwable th2) {
                    th2.getMessage();
                    i3 = 1;
                }
                if (!TextUtils.isEmpty(strM9870a2) && i3 != 0 && this.f13642af == null) {
                    AnythinkBaitClickView anythinkBaitClickView = new AnythinkBaitClickView(getContext());
                    this.f13642af = anythinkBaitClickView;
                    anythinkBaitClickView.init(1342177280, i3);
                    this.f13642af.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    RelativeLayout relativeLayout = this.f13647u;
                    if (relativeLayout != null) {
                        relativeLayout.addView(this.f13642af);
                        this.f13642af.startAnimation();
                        this.f13642af.setOnClickListener(new ViewOnClickListenerC21538());
                    }
                }
            }
        } catch (Throwable th3) {
            th3.getMessage();
        }
        try {
            C1781c c1781c3 = this.f13478b;
            if (c1781c3 == null || !c1781c3.m8886j()) {
                return;
            }
            String strM8801I3 = this.f13478b.m8801I();
            if (TextUtils.isEmpty(strM8801I3)) {
                strM8801I3 = this.f13478b.m8808P();
            }
            String strM9870a3 = C1890x.m9870a(strM8801I3, "shake_strength");
            String strM9870a4 = C1890x.m9870a(strM8801I3, "shake_time");
            if (TextUtils.isEmpty("1") || this.f13640ad != null) {
                return;
            }
            AnythinkBaitClickView anythinkBaitClickView2 = this.f13642af;
            if (anythinkBaitClickView2 != null) {
                anythinkBaitClickView2.setVisibility(8);
            }
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.f13640ad = mBShakeView;
            mBShakeView.initView(this.f13478b.f11928cU, true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (isLandscape()) {
                layoutParams.addRule(13);
            } else {
                layoutParams.addRule(2, findID("anythink_iv_logo"));
                layoutParams.addRule(14);
                this.f13640ad.setPadding(0, 0, 0, C1886t.m9834b(getContext(), 20.0f));
            }
            this.f13640ad.setLayoutParams(layoutParams);
            RelativeLayout relativeLayout2 = this.f13646t;
            if (relativeLayout2 != null && relativeLayout2.isShown()) {
                if (this.f13636W != null) {
                    this.f13646t.addView(this.f13640ad);
                }
                this.f13636W.setVisibility(4);
                this.f13640ad.setOnClickListener(new ViewOnClickListenerC21505());
                int i4 = 10;
                if (!TextUtils.isEmpty(strM9870a3) && (i2 = Integer.parseInt(strM9870a3)) >= 0) {
                    i4 = i2;
                }
                int i5 = 5000;
                if (!TextUtils.isEmpty(strM9870a4) && (i = Integer.parseInt(strM9870a4)) > 0) {
                    i5 = i * 1000;
                }
                this.f13641ae = new C21516(i4, i5);
                this.f13640ad.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC21527());
            }
        } catch (Throwable th4) {
            th4.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f13620G;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (this.f13641ae != null) {
            C1974a.m10477a().m10479b(this.f13641ae);
            this.f13641ae = null;
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        ViewGroup viewGroup;
        super.onSelfConfigurationChanged(configuration);
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8886j()) {
            RelativeLayout relativeLayout = this.f13621H;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            this.f13480d = configuration.orientation;
            new StringBuilder(" native onSelfConfigurationChanged:").append(this.f13480d);
            if (this.f13480d == 2) {
                removeView(this.f13644r);
                viewGroup = this.f13645s;
            } else {
                removeView(this.f13645s);
                viewGroup = this.f13644r;
            }
            m11382a(viewGroup);
        }
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        ImageView imageView;
        this.f13622I = c2309b;
        try {
            if (this.f13478b == null || !this.f13482f) {
                return;
            }
            C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10151be(), new C214011());
            C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10150bd(), new C2184j(this.f13650x, C1886t.m9834b(C1175n.m2059a().m2148f(), 8.0f)));
            this.f13615B.setText(this.f13478b.m10148bb());
            TextView textView = this.f13636W;
            if (textView != null) {
                textView.setText(this.f13478b.f11928cU);
            }
            TextView textView2 = this.f13616C;
            if (textView2 != null) {
                textView2.setText(this.f13478b.m10149bc());
            }
            TextView textView3 = this.f13617D;
            if (textView3 != null) {
                textView3.setText(this.f13478b.m10145aY() + ")");
            }
            this.f13618E.removeAllViews();
            double dM10144aX = this.f13478b.m10144aX();
            if (dM10144aX <= 0.0d) {
                dM10144aX = 5.0d;
            }
            LinearLayout linearLayout = this.f13618E;
            if (linearLayout instanceof StarLevelView) {
                ((StarLevelView) linearLayout).initScore(dM10144aX);
            }
            LinearLayout linearLayout2 = this.f13618E;
            if (linearLayout2 instanceof AnyThinkLevelLayoutView) {
                ((AnyThinkLevelLayoutView) linearLayout2).setRatingAndUser(dM10144aX, this.f13478b.m10145aY());
            }
            if (!TextUtils.isEmpty(this.f13478b.m8801I()) && this.f13478b.m8801I().contains("alecfc=1")) {
                this.f13623J = true;
            }
            C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(TextUtils.isEmpty(this.f13478b.m8830aE()) ? C1404a.f6211ab : this.f13478b.m8830aE(), new C214112());
            C1773a.m8548c().m8558f();
            C1486b.m6002a();
            C1483a c1483aM6007b = C1486b.m6007b();
            if (c1483aM6007b != null) {
                String strM5936J = c1483aM6007b.m5936J();
                if (TextUtils.isEmpty(strM5936J)) {
                    this.f13652z.setVisibility(8);
                }
                this.f13652z.setOnClickListener(new ViewOnClickListenerC214213(strM5936J));
            } else {
                this.f13652z.setVisibility(8);
            }
            if (!this.f13624K) {
                this.f13635V.setVisibility(8);
            }
            if (Build.VERSION.SDK_INT >= 17 || (imageView = this.f13648v) == null) {
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.f13629P;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.f13641ae = null;
            this.f13620G = null;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setCloseBtnDelay(int i) {
        this.f13625L = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLayout() {
        /*
            r6 = this;
            boolean r0 = r6.f13485i
            if (r0 == 0) goto L21
            com.anythink.expressad.video.dynview.j.c r0 = new com.anythink.expressad.video.dynview.j.c
            r0.<init>()
            android.content.Context r0 = r6.getContext()
            com.anythink.expressad.foundation.d.c r1 = r6.f13478b
            int r2 = r6.f13486j
            com.anythink.expressad.video.dynview.c r0 = com.anythink.expressad.video.dynview.p170j.C2099c.m11252a(r0, r1, r2)
            com.anythink.expressad.video.dynview.C2071b.m11062a()
            com.anythink.expressad.video.module.AnythinkNativeEndCardView$10 r1 = new com.anythink.expressad.video.module.AnythinkNativeEndCardView$10
            r1.<init>()
            com.anythink.expressad.video.dynview.C2071b.m11064a(r0, r1)
            return
        L21:
            int r0 = r6.f13643ag
            java.lang.String r1 = "anythink_reward_endcard_native_half_landscape"
            java.lang.String r2 = "anythink_reward_endcard_native_land"
            java.lang.String r3 = "anythink_reward_endcard_native_half_portrait"
            java.lang.String r4 = "anythink_reward_endcard_native_hor"
            if (r0 != 0) goto L3e
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L32
            goto L33
        L32:
            r3 = r4
        L33:
            boolean r0 = r6.isLandscape()
            if (r0 == 0) goto L54
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L52
            goto L53
        L3e:
            r5 = 1
            if (r0 != r5) goto L48
            boolean r5 = r6.f13637aa
            if (r5 == 0) goto L46
            goto L4a
        L46:
            r3 = r4
            goto L4a
        L48:
            java.lang.String r3 = ""
        L4a:
            r4 = 2
            if (r0 != r4) goto L54
            boolean r0 = r6.f13637aa
            if (r0 == 0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            r3 = r1
        L54:
            int r0 = r6.findLayout(r3)
            if (r0 <= 0) goto L89
            boolean r1 = r6.isLandscape()
            r2 = 0
            if (r1 == 0) goto L71
            android.view.LayoutInflater r1 = r6.f13479c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f13645s = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f13645s
            goto L80
        L71:
            android.view.LayoutInflater r1 = r6.f13479c
            android.view.View r0 = r1.inflate(r0, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f13644r = r0
            r6.addView(r0)
            android.view.ViewGroup r0 = r6.f13644r
        L80:
            boolean r0 = r6.m11390b(r0)
            r6.f13482f = r0
            r6.m11396e()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.AnythinkNativeEndCardView.setLayout():void");
    }

    public void setMoreOfferCampaignUnit(C1782d c1782d) {
        ArrayList<C1781c> arrayList;
        MBShakeView mBShakeView;
        C1781c c1781c = this.f13478b;
        if (c1781c == null || !c1781c.m8886j()) {
            return;
        }
        this.f13639ac = c1782d;
        if (c1782d == null || (arrayList = c1782d.f10572J) == null || arrayList.size() <= 5 || (mBShakeView = this.f13640ad) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, C1886t.m9834b(getContext(), 5.0f));
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        new StringBuilder("NOTCH NativeEndCard ").append(String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.f13630Q = i;
        this.f13631R = i2;
        this.f13632S = i3;
        this.f13633T = i4;
        m11402h();
    }

    public void setOnPause() {
        this.f13627N = false;
    }

    public void setOnResume() {
        this.f13627N = true;
    }

    public void setUnitId(String str) {
        this.f13638ab = str;
    }
}
