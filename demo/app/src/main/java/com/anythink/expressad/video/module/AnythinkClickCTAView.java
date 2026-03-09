package com.anythink.expressad.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.video.dynview.C2068a;
import com.anythink.expressad.video.dynview.C2071b;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.dynview.p170j.C2099c;
import com.anythink.expressad.video.module.p172a.p173a.C2179e;
import com.anythink.expressad.video.signal.InterfaceC2307f;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkClickCTAView extends AnythinkBaseView implements InterfaceC2307f {

    /* JADX INFO: renamed from: n */
    private static final String f13490n = "anythink_reward_clickable_cta";

    /* JADX INFO: renamed from: o */
    private ViewGroup f13491o;

    /* JADX INFO: renamed from: p */
    private ImageView f13492p;

    /* JADX INFO: renamed from: q */
    private TextView f13493q;

    /* JADX INFO: renamed from: r */
    private TextView f13494r;

    /* JADX INFO: renamed from: s */
    private TextView f13495s;

    /* JADX INFO: renamed from: t */
    private String f13496t;

    /* JADX INFO: renamed from: u */
    private float f13497u;

    /* JADX INFO: renamed from: v */
    private float f13498v;

    /* JADX INFO: renamed from: w */
    private int f13499w;

    /* JADX INFO: renamed from: x */
    private ObjectAnimator f13500x;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$1 */
    public class C21141 implements InterfaceC2086h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f13501a;

        public C21141(ViewGroup viewGroup) {
            this.f13501a = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10989a(C2068a c2068a) {
            this.f13501a.addView(c2068a.m11055a());
            AnythinkClickCTAView anythinkClickCTAView = AnythinkClickCTAView.this;
            anythinkClickCTAView.f13482f = anythinkClickCTAView.m11326f();
            AnythinkClickCTAView anythinkClickCTAView2 = AnythinkClickCTAView.this;
            anythinkClickCTAView2.f13494r = (TextView) anythinkClickCTAView2.findViewById(anythinkClickCTAView2.findID("anythink_tv_desc"));
            AnythinkClickCTAView.this.mo11316c();
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10990a(EnumC2076b enumC2076b) {
            new StringBuilder("errorMsg:").append(enumC2076b.m11124b());
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$2 */
    public class C21152 extends AbstractViewOnClickListenerC2343a {
        public C21152() {
        }

        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
        /* JADX INFO: renamed from: a */
        public final void mo11015a(View view) {
            AnythinkClickCTAView.m11323b(AnythinkClickCTAView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$3 */
    public class C21163 extends AbstractViewOnClickListenerC2343a {
        public C21163() {
        }

        @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
        /* JADX INFO: renamed from: a */
        public final void mo11015a(View view) {
            AnythinkClickCTAView.m11323b(AnythinkClickCTAView.this);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$4 */
    public class ViewOnClickListenerC21174 implements View.OnClickListener {
        public ViewOnClickListenerC21174() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkClickCTAView$5 */
    public class C21185 extends C2179e {
        public C21185(ImageView imageView, C1781c c1781c, String str) {
            super(imageView, c1781c, str);
        }

        @Override // com.anythink.expressad.video.module.p172a.p173a.C2179e, com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
        /* JADX INFO: renamed from: a */
        public final void mo5463a(String str, String str2) {
            super.mo5463a(str, str2);
            AnythinkClickCTAView.this.m11322b();
        }
    }

    public AnythinkClickCTAView(Context context) {
        super(context);
    }

    public AnythinkClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m11319a() {
        int iFindLayout = findLayout(f13490n);
        if (iFindLayout >= 0) {
            this.f13479c.inflate(iFindLayout, this);
            this.f13482f = m11326f();
            mo11316c();
            setWrapContent();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11320a(ViewGroup viewGroup, C1781c c1781c) {
        new C2099c();
        C2074c c2074cM11257b = C2099c.m11257b(viewGroup, c1781c);
        C2071b.m11062a();
        C2071b.m11064a(c2074cM11257b, new C21141(viewGroup));
    }

    /* JADX INFO: renamed from: b */
    public void m11322b() {
        ImageView imageView = this.f13492p;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11323b(AnythinkClickCTAView anythinkClickCTAView) {
        JSONObject jSONObject;
        JSONException e;
        C1781c c1781c = anythinkClickCTAView.f13478b;
        if (c1781c != null) {
            c1781c.m8886j();
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e2) {
            jSONObject = null;
            e = e2;
        }
        try {
            jSONObject.put(C1801a.f11116ce, anythinkClickCTAView.m11315a(0));
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
        }
        anythinkClickCTAView.f13481e.mo10950a(105, jSONObject);
    }

    /* JADX INFO: renamed from: e */
    private void m11325e() {
        setWrapContent();
    }

    /* JADX INFO: renamed from: f */
    public boolean m11326f() {
        this.f13491o = (ViewGroup) findViewById(findID("anythink_viewgroup_ctaroot"));
        this.f13492p = (ImageView) findViewById(findID("anythink_iv_appicon"));
        this.f13493q = (TextView) findViewById(findID("anythink_tv_title"));
        TextView textView = (TextView) findViewById(findID("anythink_tv_install"));
        this.f13495s = textView;
        return isNotNULL(this.f13491o, this.f13492p, this.f13493q, textView);
    }

    /* JADX INFO: renamed from: g */
    private void m11327g() {
        JSONObject jSONObject;
        JSONException e;
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            c1781c.m8886j();
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e2) {
            jSONObject = null;
            e = e2;
        }
        try {
            jSONObject.put(C1801a.f11116ce, m11315a(0));
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
        }
        this.f13481e.mo10950a(105, jSONObject);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /* JADX INFO: renamed from: c */
    public final void mo11316c() {
        super.mo11316c();
        if (this.f13482f) {
            C1781c c1781c = this.f13478b;
            if (c1781c != null && c1781c.m8886j()) {
                setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.2
                    public C21152() {
                    }

                    @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                    /* JADX INFO: renamed from: a */
                    public final void mo11015a(View view) {
                        AnythinkClickCTAView.m11323b(AnythinkClickCTAView.this);
                    }
                });
            }
            this.f13495s.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.3
                public C21163() {
                }

                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkClickCTAView.m11323b(AnythinkClickCTAView.this);
                }
            });
            ImageView imageView = this.f13492p;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.4
                    public ViewOnClickListenerC21174() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f13500x;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f13500x;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f13497u = motionEvent.getRawX();
        this.f13498v = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f13499w = configuration.orientation;
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            if (c1781c.m8886j()) {
                C1781c c1781c2 = this.f13478b;
                new C2099c();
                C2074c c2074cM11257b = C2099c.m11257b(this, c1781c2);
                C2071b.m11062a();
                C2071b.m11064a(c2074cM11257b, new C21141(this));
            } else {
                int iFindLayout = findLayout(f13490n);
                if (iFindLayout >= 0) {
                    this.f13479c.inflate(iFindLayout, this);
                    this.f13482f = m11326f();
                    mo11316c();
                    setWrapContent();
                }
            }
            if (this.f13482f) {
                this.f13495s.setText(this.f13478b.f11928cU);
                if (TextUtils.isEmpty(this.f13478b.m10150bd())) {
                    m11322b();
                } else {
                    C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10150bd(), new C2179e(this.f13492p, this.f13478b, this.f13496t) { // from class: com.anythink.expressad.video.module.AnythinkClickCTAView.5
                        public C21185(ImageView imageView, C1781c c1781c3, String str) {
                            super(imageView, c1781c3, str);
                        }

                        @Override // com.anythink.expressad.video.module.p172a.p173a.C2179e, com.anythink.expressad.foundation.p120g.p124d.InterfaceC1819c
                        /* JADX INFO: renamed from: a */
                        public final void mo5463a(String str, String str2) {
                            super.mo5463a(str, str2);
                            AnythinkClickCTAView.this.m11322b();
                        }
                    });
                }
                if (this.f13493q != null && !TextUtils.isEmpty(this.f13478b.m10148bb())) {
                    this.f13493q.setText(this.f13478b.m10148bb());
                }
                if (this.f13494r == null || TextUtils.isEmpty(this.f13478b.m10149bc())) {
                    return;
                }
                this.f13494r.setText(this.f13478b.m10149bc());
            }
        }
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f13500x = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f13496t = str;
    }
}
