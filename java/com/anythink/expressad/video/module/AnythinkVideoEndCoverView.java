package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.C1801a;
import com.anythink.expressad.foundation.p120g.p124d.C1818b;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.video.module.p172a.p173a.C2184j;
import com.anythink.expressad.video.signal.InterfaceC2307f;
import com.anythink.expressad.video.signal.factory.C2309b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkVideoEndCoverView extends AnythinkBaseView implements InterfaceC2307f {

    /* JADX INFO: renamed from: n */
    private final String f13678n;

    /* JADX INFO: renamed from: o */
    private View f13679o;

    /* JADX INFO: renamed from: p */
    private ImageView f13680p;

    /* JADX INFO: renamed from: q */
    private ImageView f13681q;

    /* JADX INFO: renamed from: r */
    private TextView f13682r;

    /* JADX INFO: renamed from: s */
    private TextView f13683s;

    /* JADX INFO: renamed from: t */
    private TextView f13684t;

    /* JADX INFO: renamed from: u */
    private C2309b f13685u;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoEndCoverView$1 */
    public class ViewOnClickListenerC21571 implements View.OnClickListener {
        public ViewOnClickListenerC21571() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkVideoEndCoverView.this.f13481e.mo10950a(104, "");
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoEndCoverView$2 */
    public class ViewOnClickListenerC21582 implements View.OnClickListener {
        public ViewOnClickListenerC21582() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkVideoEndCoverView.this.m11422a();
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.AnythinkVideoEndCoverView$3 */
    public class ViewOnClickListenerC21593 implements View.OnClickListener {
        public ViewOnClickListenerC21593() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AnythinkVideoEndCoverView.this.m11422a();
        }
    }

    public AnythinkVideoEndCoverView(Context context) {
        super(context);
        this.f13678n = "AnythinkVideoEndCoverView";
    }

    public AnythinkVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13678n = "AnythinkVideoEndCoverView";
    }

    /* JADX INFO: renamed from: a */
    private boolean m11419a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f13680p = (ImageView) view.findViewById(findID("anythink_vec_iv_icon"));
            this.f13681q = (ImageView) view.findViewById(findID("anythink_vec_iv_close"));
            this.f13682r = (TextView) view.findViewById(findID("anythink_vec_tv_title"));
            this.f13683s = (TextView) view.findViewById(findID("anythink_vec_tv_desc"));
            this.f13684t = (TextView) view.findViewById(findID("anythink_vec_btn"));
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11420b() {
        View view = this.f13679o;
        if (view == null) {
            init(this.f13477a);
            preLoadData(this.f13685u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f13679o.getParent()).removeView(this.f13679o);
        }
        addView(this.f13679o);
        m11419a(this.f13679o);
        mo11316c();
    }

    /* JADX INFO: renamed from: e */
    private void m11421e() {
        ImageView imageView;
        C1781c c1781c = this.f13478b;
        if (c1781c != null) {
            if (!TextUtils.isEmpty(c1781c.m10150bd()) && (imageView = this.f13680p) != null) {
                C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10150bd(), new C2184j(imageView, C1886t.m9834b(C1175n.m2059a().m2148f(), 8.0f)));
            }
            TextView textView = this.f13682r;
            if (textView != null) {
                textView.setText(this.f13478b.m10148bb());
            }
            TextView textView2 = this.f13684t;
            if (textView2 != null) {
                textView2.setText(this.f13478b.f11928cU);
            }
            TextView textView3 = this.f13683s;
            if (textView3 != null) {
                textView3.setText(this.f13478b.m10149bc());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11422a() {
        JSONObject jSONObject;
        JSONException e;
        JSONObject jSONObject2;
        JSONException e2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException e3) {
                jSONObject2 = jSONObject3;
                e2 = e3;
            }
            try {
                jSONObject2.put(C1801a.f11114cc, C1886t.m9821a(C1175n.m2059a().m2148f(), this.f13483g));
                jSONObject2.put(C1801a.f11115cd, C1886t.m9821a(C1175n.m2059a().m2148f(), this.f13484h));
                jSONObject2.put(C1801a.f11117cf, 0);
                try {
                    this.f13480d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                jSONObject2.put(C1801a.f11118cg, this.f13480d);
                jSONObject2.put(C1801a.f11119ch, C1886t.m9841c(getContext()));
            } catch (JSONException e5) {
                e2 = e5;
                e2.getMessage();
            }
            jSONObject = new JSONObject();
        } catch (JSONException e6) {
            jSONObject = null;
            e = e6;
        }
        try {
            jSONObject.put(C1801a.f11116ce, jSONObject2);
        } catch (JSONException e7) {
            e = e7;
            e.printStackTrace();
        }
        this.f13481e.mo10950a(105, jSONObject);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /* JADX INFO: renamed from: c */
    public final void mo11316c() {
        super.mo11316c();
        this.f13681q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.1
            public ViewOnClickListenerC21571() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.f13481e.mo10950a(104, "");
            }
        });
        this.f13680p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.2
            public ViewOnClickListenerC21582() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.m11422a();
            }
        });
        this.f13684t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.3
            public ViewOnClickListenerC21593() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.m11422a();
            }
        });
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("anythink_reward_videoend_cover");
        if (iFindLayout >= 0) {
            View viewInflate = this.f13479c.inflate(iFindLayout, (ViewGroup) null);
            this.f13679o = viewInflate;
            if (viewInflate != null) {
                this.f13482f = m11419a(viewInflate);
                addView(this.f13679o, -1, -1);
                mo11316c();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f13483g = motionEvent.getRawX();
        this.f13484h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f13480d = configuration.orientation;
        removeView(this.f13679o);
        View view = this.f13679o;
        if (view == null) {
            init(this.f13477a);
            preLoadData(this.f13685u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f13679o.getParent()).removeView(this.f13679o);
        }
        addView(this.f13679o);
        m11419a(this.f13679o);
        mo11316c();
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
        ImageView imageView;
        this.f13685u = c2309b;
        try {
            C1781c c1781c = this.f13478b;
            if (c1781c == null || !this.f13482f || c1781c == null) {
                return;
            }
            if (!TextUtils.isEmpty(c1781c.m10150bd()) && (imageView = this.f13680p) != null) {
                C1818b.m9427a(this.f13477a.getApplicationContext()).m9443a(this.f13478b.m10150bd(), new C2184j(imageView, C1886t.m9834b(C1175n.m2059a().m2148f(), 8.0f)));
            }
            TextView textView = this.f13682r;
            if (textView != null) {
                textView.setText(this.f13478b.m10148bb());
            }
            TextView textView2 = this.f13684t;
            if (textView2 != null) {
                textView2.setText(this.f13478b.f11928cU);
            }
            TextView textView3 = this.f13683s;
            if (textView3 != null) {
                textView3.setText(this.f13478b.m10149bc());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
