package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.expressad.foundation.p138h.C1875i;

/* JADX INFO: loaded from: classes.dex */
public class ClickToReLoadView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private ImageView f1350a;

    /* JADX INFO: renamed from: b */
    private TextView f1351b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0858a f1352c;

    /* JADX INFO: renamed from: d */
    private int f1353d;

    /* JADX INFO: renamed from: com.anythink.basead.ui.ClickToReLoadView$1 */
    public class ViewOnClickListenerC08571 implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public long f1354a;

        public ViewOnClickListenerC08571() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f1354a > 1000) {
                this.f1354a = jCurrentTimeMillis;
                if (ClickToReLoadView.this.f1352c != null) {
                    ClickToReLoadView.this.f1352c.mo845a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.ClickToReLoadView$a */
    public interface InterfaceC0858a {
        /* JADX INFO: renamed from: a */
        void mo845a();
    }

    public ClickToReLoadView(Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        this.f1353d = C1345i.m4153a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f1350a = imageView;
        imageView.setImageResource(C1345i.m4154a(context, "myoffer_webview_reload_icon", C1875i.f11528c));
        int iM4153a = C1345i.m4153a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM4153a, iM4153a);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f1353d;
        TextView textView = new TextView(context);
        this.f1351b = textView;
        textView.setText(getResources().getText(C1345i.m4154a(context, "myoffer_webview_reload", C1875i.f11532g)));
        this.f1351b.setTextColor(getResources().getColor(C1345i.m4154a(context, "color_reload_button", C1875i.f11529d)));
        this.f1351b.setBackgroundResource(C1345i.m4154a(context, "myoffer_webview_bg_reload_button", C1875i.f11528c));
        int iM4153a2 = C1345i.m4153a(context, 9.0f);
        int iM4153a3 = C1345i.m4153a(context, 5.0f);
        this.f1351b.setPadding(iM4153a2, iM4153a3, iM4153a2, iM4153a3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f1353d;
        addView(this.f1350a, layoutParams);
        addView(this.f1351b, layoutParams2);
        this.f1351b.setOnClickListener(new ViewOnClickListenerC08571());
    }

    /* JADX INFO: renamed from: a */
    private void m842a() {
        this.f1351b.setOnClickListener(new ViewOnClickListenerC08571());
    }

    /* JADX INFO: renamed from: a */
    private void m843a(Context context) {
        setOrientation(1);
        setGravity(17);
        this.f1353d = C1345i.m4153a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f1350a = imageView;
        imageView.setImageResource(C1345i.m4154a(context, "myoffer_webview_reload_icon", C1875i.f11528c));
        int iM4153a = C1345i.m4153a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM4153a, iM4153a);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f1353d;
        TextView textView = new TextView(context);
        this.f1351b = textView;
        textView.setText(getResources().getText(C1345i.m4154a(context, "myoffer_webview_reload", C1875i.f11532g)));
        this.f1351b.setTextColor(getResources().getColor(C1345i.m4154a(context, "color_reload_button", C1875i.f11529d)));
        this.f1351b.setBackgroundResource(C1345i.m4154a(context, "myoffer_webview_bg_reload_button", C1875i.f11528c));
        int iM4153a2 = C1345i.m4153a(context, 9.0f);
        int iM4153a3 = C1345i.m4153a(context, 5.0f);
        this.f1351b.setPadding(iM4153a2, iM4153a3, iM4153a2, iM4153a3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f1353d;
        addView(this.f1350a, layoutParams);
        addView(this.f1351b, layoutParams2);
    }

    /* JADX INFO: renamed from: b */
    private void m844b() {
        try {
            this.f1350a.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1351b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.f1351b.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHeight() < C1345i.m4153a(getContext(), 100.0f)) {
            try {
                this.f1350a.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1351b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.topMargin = 0;
                    this.f1351b.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setListener(InterfaceC0858a interfaceC0858a) {
        this.f1352c = interfaceC0858a;
    }
}
