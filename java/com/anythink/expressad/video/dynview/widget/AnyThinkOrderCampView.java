package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p066o.C1350n;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.foundation.p118f.InterfaceC1798a;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.p086d.C1483a;
import com.anythink.expressad.p086d.C1486b;
import com.anythink.expressad.video.dynview.C2068a;
import com.anythink.expressad.video.dynview.C2071b;
import com.anythink.expressad.video.dynview.C2074c;
import com.anythink.expressad.video.dynview.p158a.C2069a;
import com.anythink.expressad.video.dynview.p160c.EnumC2076b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2080b;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2081c;
import com.anythink.expressad.video.dynview.p163f.InterfaceC2086h;
import com.anythink.expressad.video.dynview.p170j.C2099c;
import com.anythink.expressad.video.module.AnythinkBaseView;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnyThinkOrderCampView extends AnythinkBaseView {

    /* JADX INFO: renamed from: n */
    private AnyThinkOrderCampView f13413n;

    /* JADX INFO: renamed from: o */
    private List<C1781c> f13414o;

    /* JADX INFO: renamed from: p */
    private int f13415p;

    /* JADX INFO: renamed from: q */
    private int f13416q;

    /* JADX INFO: renamed from: r */
    private int f13417r;

    /* JADX INFO: renamed from: s */
    private int f13418s;

    /* JADX INFO: renamed from: t */
    private String f13419t;

    /* JADX INFO: renamed from: u */
    private FeedBackButton f13420u;

    /* JADX INFO: renamed from: v */
    private ImageView f13421v;

    /* JADX INFO: renamed from: w */
    private boolean f13422w;

    /* JADX INFO: renamed from: x */
    private InterfaceC2081c f13423x;

    /* JADX INFO: renamed from: y */
    private InterfaceC2080b f13424y;

    /* JADX INFO: renamed from: z */
    private boolean f13425z;

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$1 */
    public class C21021 implements InterfaceC2081c {
        public C21021() {
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2081c
        /* JADX INFO: renamed from: a */
        public final void mo11131a() {
            AnyThinkOrderCampView.m11291a(AnyThinkOrderCampView.this);
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2081c
        /* JADX INFO: renamed from: a */
        public final void mo11132a(C1781c c1781c, int i) {
            if (c1781c != null) {
                try {
                    AnyThinkOrderCampView.this.setCampaign(c1781c);
                    AnyThinkOrderCampView.m11292a(AnyThinkOrderCampView.this, c1781c, i);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$2 */
    public class C21032 implements InterfaceC2086h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f13427a;

        public C21032(ViewGroup viewGroup) {
            viewGroup = viewGroup;
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10989a(C2068a c2068a) {
            try {
                AnyThinkOrderCampView.this.f13413n.addView(c2068a.m11055a());
                AnyThinkOrderCampView.this.f13422w = c2068a.m11059c();
                viewGroup.removeAllViews();
                viewGroup.addView(AnyThinkOrderCampView.this.f13413n);
                AnyThinkOrderCampView.this.setViewStatus();
                if (AnyThinkOrderCampView.this.f13424y != null) {
                    AnyThinkOrderCampView.this.f13424y.mo11129a();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

        @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
        /* JADX INFO: renamed from: a */
        public final void mo10990a(EnumC2076b enumC2076b) {
            try {
                if (AnyThinkOrderCampView.this.f13424y != null) {
                    AnyThinkOrderCampView.this.f13424y.mo11130b();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$3 */
    public class C21043 implements InterfaceC1798a {
        public C21043() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: a */
        public final void mo5503a() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: b */
        public final void mo5504b() {
        }

        @Override // com.anythink.expressad.foundation.p118f.InterfaceC1798a
        /* JADX INFO: renamed from: c */
        public final void mo5505c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView$4 */
    public class ViewOnClickListenerC21054 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f13430a;

        public ViewOnClickListenerC21054(String str) {
            this.f13430a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C1350n.m4204a(this.f13430a);
        }
    }

    public AnyThinkOrderCampView(Context context) {
        super(context);
        this.f13422w = false;
        this.f13423x = new InterfaceC2081c() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.1
            public C21021() {
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2081c
            /* JADX INFO: renamed from: a */
            public final void mo11131a() {
                AnyThinkOrderCampView.m11291a(AnyThinkOrderCampView.this);
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2081c
            /* JADX INFO: renamed from: a */
            public final void mo11132a(C1781c c1781c, int i) {
                if (c1781c != null) {
                    try {
                        AnyThinkOrderCampView.this.setCampaign(c1781c);
                        AnyThinkOrderCampView.m11292a(AnyThinkOrderCampView.this, c1781c, i);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        };
        this.f13425z = false;
    }

    public AnyThinkOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13422w = false;
        this.f13423x = new InterfaceC2081c() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.1
            public C21021() {
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2081c
            /* JADX INFO: renamed from: a */
            public final void mo11131a() {
                AnyThinkOrderCampView.m11291a(AnyThinkOrderCampView.this);
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2081c
            /* JADX INFO: renamed from: a */
            public final void mo11132a(C1781c c1781c, int i) {
                if (c1781c != null) {
                    try {
                        AnyThinkOrderCampView.this.setCampaign(c1781c);
                        AnyThinkOrderCampView.m11292a(AnyThinkOrderCampView.this, c1781c, i);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        };
        this.f13425z = false;
    }

    /* JADX INFO: renamed from: a */
    private void m11289a() {
        InterfaceC2174a interfaceC2174a = this.f13481e;
        if (interfaceC2174a != null) {
            interfaceC2174a.mo10950a(104, "");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11290a(C1781c c1781c, int i, int i2) {
        JSONObject jSONObject;
        JSONException e;
        if (c1781c != null && c1781c.m8886j()) {
            try {
                C1781c.c cVarM8805M = c1781c.m8805M();
                if (cVarM8805M != null) {
                    new StringBuilder().append(cVarM8805M.m8954b());
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e3) {
            jSONObject = null;
            e = e3;
        }
        try {
            jSONObject.put(C1801a.f11116ce, m11315a(i));
            jSONObject.put("camp_position", i2);
        } catch (JSONException e4) {
            e = e4;
            e.printStackTrace();
        }
        InterfaceC2174a interfaceC2174a = this.f13481e;
        if (interfaceC2174a != null) {
            interfaceC2174a.mo10950a(105, jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11291a(AnyThinkOrderCampView anyThinkOrderCampView) {
        InterfaceC2174a interfaceC2174a = anyThinkOrderCampView.f13481e;
        if (interfaceC2174a != null) {
            interfaceC2174a.mo10950a(104, "");
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11292a(AnyThinkOrderCampView anyThinkOrderCampView, C1781c c1781c, int i) {
        JSONObject jSONObject;
        JSONException e;
        if (c1781c != null && c1781c.m8886j()) {
            try {
                C1781c.c cVarM8805M = c1781c.m8805M();
                if (cVarM8805M != null) {
                    new StringBuilder().append(cVarM8805M.m8954b());
                }
            } catch (Exception e2) {
                e2.getMessage();
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e3) {
            jSONObject = null;
            e = e3;
        }
        try {
            jSONObject.put(C1801a.f11116ce, anyThinkOrderCampView.m11315a(0));
            jSONObject.put("camp_position", i);
        } catch (JSONException e4) {
            e = e4;
            e.printStackTrace();
        }
        InterfaceC2174a interfaceC2174a = anyThinkOrderCampView.f13481e;
        if (interfaceC2174a != null) {
            interfaceC2174a.mo10950a(105, jSONObject);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11295b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 2, 0.5f, 2, 0.5f);
        scaleAnimation.setDuration(500L);
        this.f13413n.startAnimation(scaleAnimation);
    }

    /* JADX INFO: renamed from: e */
    private void m11297e() {
        FeedBackButton feedBackButton = this.f13420u;
        if (feedBackButton == null) {
            return;
        }
        List<C1781c> list = this.f13414o;
        if (list == null) {
            feedBackButton.setVisibility(8);
            return;
        }
        if (list.get(0) == null) {
            this.f13420u.setVisibility(8);
            return;
        }
        if (!C1800b.m9367a().m9384b()) {
            this.f13420u.setVisibility(8);
            return;
        }
        this.f13419t = this.f13414o.get(0).m8803K();
        this.f13478b = this.f13414o.get(0);
        C1800b.m9367a().m9380a(this.f13419t + "_2", new C21043());
        C1800b.m9367a().m9379a(this.f13419t + "_2", this.f13478b);
        C1800b.m9367a().m9381a(this.f13419t + "_2", this.f13420u);
    }

    /* JADX INFO: renamed from: f */
    private void m11298f() {
        if (this.f13421v == null) {
            return;
        }
        C1773a.m8548c().m8558f();
        C1486b.m6002a();
        C1483a c1483aM6007b = C1486b.m6007b();
        if (c1483aM6007b == null) {
            this.f13421v.setVisibility(8);
            return;
        }
        String strM5936J = c1483aM6007b.m5936J();
        if (TextUtils.isEmpty(strM5936J)) {
            this.f13421v.setVisibility(8);
        }
        this.f13421v.setOnClickListener(new ViewOnClickListenerC21054(strM5936J));
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f13414o == null) {
            InterfaceC2080b interfaceC2080b = this.f13424y;
            if (interfaceC2080b != null) {
                interfaceC2080b.mo11130b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put(C2069a.f13127E, this.f13423x);
        new C2099c();
        C2074c c2074cM11256b = C2099c.m11256b(C1175n.m2059a().m2148f(), this.f13414o);
        C2071b.m11062a();
        C2071b.m11065a(c2074cM11256b, new InterfaceC2086h() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewGroup f13427a;

            public C21032(ViewGroup viewGroup2) {
                viewGroup = viewGroup2;
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
            /* JADX INFO: renamed from: a */
            public final void mo10989a(C2068a c2068a) {
                try {
                    AnyThinkOrderCampView.this.f13413n.addView(c2068a.m11055a());
                    AnyThinkOrderCampView.this.f13422w = c2068a.m11059c();
                    viewGroup.removeAllViews();
                    viewGroup.addView(AnyThinkOrderCampView.this.f13413n);
                    AnyThinkOrderCampView.this.setViewStatus();
                    if (AnyThinkOrderCampView.this.f13424y != null) {
                        AnyThinkOrderCampView.this.f13424y.mo11129a();
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }

            @Override // com.anythink.expressad.video.dynview.p163f.InterfaceC2086h
            /* JADX INFO: renamed from: a */
            public final void mo10990a(EnumC2076b enumC2076b) {
                try {
                    if (AnyThinkOrderCampView.this.f13424y != null) {
                        AnyThinkOrderCampView.this.f13424y.mo11130b();
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
        }, map);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        this.f13413n = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        JSONObject jSONObject;
        JSONException e;
        super.onAttachedToWindow();
        if (this.f13414o == null) {
            return;
        }
        for (int i = 0; i < this.f13414o.size(); i++) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e2) {
                jSONObject = null;
                e = e2;
            }
            try {
                jSONObject.put("camp_position", i);
            } catch (JSONException e3) {
                e = e3;
                e.printStackTrace();
            }
            InterfaceC2174a interfaceC2174a = this.f13481e;
            if (interfaceC2174a != null) {
                interfaceC2174a.mo10950a(110, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(InterfaceC2080b interfaceC2080b) {
        this.f13424y = interfaceC2080b;
    }

    public void setCampaignExes(List<C1781c> list) {
        this.f13414o = list;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        this.f13415p = i;
        this.f13416q = i2;
        this.f13417r = i3;
        this.f13418s = i4;
        setViewStatus();
    }

    public void setRewarded(boolean z) {
        this.f13425z = z;
    }

    public void setViewStatus() {
        AnyThinkOrderCampView anyThinkOrderCampView = this.f13413n;
        if (anyThinkOrderCampView == null || !this.f13425z) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) anyThinkOrderCampView.findViewById(filterFindViewId(this.f13422w, "anythink_native_order_camp_controller"));
        this.f13420u = (FeedBackButton) this.f13413n.findViewById(filterFindViewId(this.f13422w, "anythink_native_order_camp_feed_btn"));
        this.f13421v = (ImageView) this.f13413n.findViewById(filterFindViewId(this.f13422w, "anythink_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f13415p, this.f13417r, this.f13416q, this.f13418s);
        }
        FeedBackButton feedBackButton = this.f13420u;
        if (feedBackButton != null && feedBackButton != null) {
            try {
                List<C1781c> list = this.f13414o;
                if (list == null) {
                    feedBackButton.setVisibility(8);
                } else if (list.get(0) != null && C1800b.m9367a().m9384b()) {
                    this.f13419t = this.f13414o.get(0).m8803K();
                    this.f13478b = this.f13414o.get(0);
                    C1800b.m9367a().m9380a(this.f13419t + "_2", new C21043());
                    C1800b.m9367a().m9379a(this.f13419t + "_2", this.f13478b);
                    C1800b.m9367a().m9381a(this.f13419t + "_2", this.f13420u);
                } else {
                    FeedBackButton feedBackButton2 = this.f13420u;
                    feedBackButton2.setVisibility(8);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        ImageView imageView = this.f13421v;
        if (imageView == null || imageView == null) {
            return;
        }
        try {
            C1773a.m8548c().m8558f();
            C1486b.m6002a();
            C1483a c1483aM6007b = C1486b.m6007b();
            if (c1483aM6007b == null) {
                this.f13421v.setVisibility(8);
                return;
            }
            String strM5936J = c1483aM6007b.m5936J();
            if (TextUtils.isEmpty(strM5936J)) {
                this.f13421v.setVisibility(8);
            }
            this.f13421v.setOnClickListener(new ViewOnClickListenerC21054(strM5936J));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f13413n.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f13413n.startAnimation(translateAnimation);
    }
}
