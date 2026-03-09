package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.signal.InterfaceC2307f;
import com.anythink.expressad.video.signal.factory.C2309b;
import com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a;

/* JADX INFO: loaded from: classes.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements InterfaceC2307f {

    /* JADX INFO: renamed from: n */
    private static final String f13672n = "anythink_reward_endcard_vast";

    /* JADX INFO: renamed from: o */
    private ViewGroup f13673o;

    /* JADX INFO: renamed from: p */
    private View f13674p;

    /* JADX INFO: renamed from: q */
    private View f13675q;

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private void m11417a() {
        if (this.f13482f) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f13673o.getLayoutParams()).addRule(13, -1);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m11418b() {
        this.f13673o = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.f13674p = findViewById(findID("anythink_iv_vastclose"));
        View viewFindViewById = findViewById(findID("anythink_iv_vastok"));
        this.f13675q = viewFindViewById;
        return isNotNULL(this.f13673o, this.f13674p, viewFindViewById);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    /* JADX INFO: renamed from: c */
    public final void mo11316c() {
        super.mo11316c();
        if (this.f13482f) {
            this.f13674p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkVastEndCardView.this.f13481e.mo10950a(104, "");
                }
            });
            this.f13675q.setOnClickListener(new AbstractViewOnClickListenerC2343a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.AbstractViewOnClickListenerC2343a
                /* JADX INFO: renamed from: a */
                public final void mo11015a(View view) {
                    AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
                    anythinkVastEndCardView.f13481e.mo10950a(108, anythinkVastEndCardView.m11317d());
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int iFindLayout = findLayout(f13672n);
        if (iFindLayout >= 0) {
            this.f13479c.inflate(iFindLayout, this);
            this.f13673o = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.f13674p = findViewById(findID("anythink_iv_vastclose"));
            View viewFindViewById = findViewById(findID("anythink_iv_vastok"));
            this.f13675q = viewFindViewById;
            this.f13482f = isNotNULL(this.f13673o, this.f13674p, viewFindViewById);
            mo11316c();
            if (this.f13482f) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f13673o.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f13481e.mo10950a(111, "");
    }

    @Override // com.anythink.expressad.video.signal.InterfaceC2307f
    public void preLoadData(C2309b c2309b) {
    }
}
