package com.anythink.core.basead.p045ui.web;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class WebLoadFailRefrshView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private View.OnClickListener f2813a;

    /* JADX INFO: renamed from: com.anythink.core.basead.ui.web.WebLoadFailRefrshView$1 */
    public class ViewOnClickListenerC11321 implements View.OnClickListener {
        public ViewOnClickListenerC11321() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLoadFailRefrshView.this.f2813a != null) {
                WebLoadFailRefrshView.this.f2813a.onClick(view);
            }
        }
    }

    public WebLoadFailRefrshView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(C1345i.m4154a(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new ViewOnClickListenerC11321());
    }

    /* JADX INFO: renamed from: a */
    private void m1802a() {
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "web_load_fail_refresh", "layout"), this);
        setOrientation(1);
        setGravity(17);
        findViewById(C1345i.m4154a(getContext(), "web_load_fail_refresh", "id")).setOnClickListener(new ViewOnClickListenerC11321());
    }

    public void setOnRefreshListener(View.OnClickListener onClickListener) {
        this.f2813a = onClickListener;
    }
}
