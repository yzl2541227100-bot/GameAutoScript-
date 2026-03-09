package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.p025ui.MraidContainerView;
import com.anythink.basead.p025ui.p026a.C0959a;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;

/* JADX INFO: loaded from: classes.dex */
public class MraidEndCardView extends BaseEndCardView {

    /* JADX INFO: renamed from: g */
    private static String f1523g = MraidEndCardView.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    public MraidContainerView f1524e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0892a f1525f;

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidEndCardView$a */
    public interface InterfaceC0892a {
        /* JADX INFO: renamed from: a */
        void mo812a();

        /* JADX INFO: renamed from: a */
        void mo813a(String str);

        /* JADX INFO: renamed from: b */
        void mo814b();

        /* JADX INFO: renamed from: c */
        void mo815c();
    }

    public MraidEndCardView(Context context, AbstractC1247l abstractC1247l, C1248m c1248m) {
        super(context, abstractC1247l, c1248m);
        setId(C1345i.m4154a(getContext(), "myoffer_end_card_id", "id"));
        setBackgroundDrawable(new C0959a());
    }

    @Override // com.anythink.basead.p025ui.BaseEndCardView
    /* JADX INFO: renamed from: a */
    public final void mo723a() {
        MraidContainerView mraidContainerView = this.f1524e;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.anythink.basead.p025ui.BaseEndCardView
    /* JADX INFO: renamed from: b */
    public final Drawable mo724b() {
        return new C0959a();
    }

    public void init(boolean z) {
        if (this.f1220c.f4333n.m3251D() == 0) {
            setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.MraidEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MraidEndCardView mraidEndCardView = MraidEndCardView.this;
                    InterfaceC0892a interfaceC0892a = mraidEndCardView.f1525f;
                    if (interfaceC0892a != null) {
                        interfaceC0892a.mo813a(mraidEndCardView.f1219b.m3165E());
                    }
                }
            });
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1219b, this.f1220c, new MraidContainerView.InterfaceC0889a() { // from class: com.anythink.basead.ui.MraidEndCardView.2
            @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
            /* JADX INFO: renamed from: a */
            public final void mo890a() {
                InterfaceC0892a interfaceC0892a = MraidEndCardView.this.f1525f;
                if (interfaceC0892a != null) {
                    interfaceC0892a.mo812a();
                }
            }

            @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
            /* JADX INFO: renamed from: a */
            public final void mo891a(String str) {
                InterfaceC0892a interfaceC0892a = MraidEndCardView.this.f1525f;
                if (interfaceC0892a != null) {
                    interfaceC0892a.mo813a(str);
                }
            }

            @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
            /* JADX INFO: renamed from: b */
            public final void mo892b() {
            }

            @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
            /* JADX INFO: renamed from: c */
            public final void mo893c() {
                InterfaceC0892a interfaceC0892a = MraidEndCardView.this.f1525f;
                if (interfaceC0892a != null) {
                    interfaceC0892a.mo815c();
                }
            }
        });
        this.f1524e = mraidContainerView;
        mraidContainerView.setBackgroundColor(0);
        this.f1524e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f1524e);
        this.f1524e.setNeedRegisterVolumeChangeReceiver(true);
        this.f1524e.init();
        if (z) {
            this.f1524e.loadMraidWebView(1);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        MraidContainerView mraidContainerView = this.f1524e;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z);
        }
    }

    public void setEndCardListener(InterfaceC0892a interfaceC0892a) {
        this.f1525f = interfaceC0892a;
    }
}
