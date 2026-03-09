package com.anythink.basead.p025ui;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.p025ui.BaseMediaATView;
import com.anythink.basead.p025ui.MraidContainerView;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p065n.C1322e;

/* JADX INFO: loaded from: classes.dex */
public class MraidMediaView extends BaseMediaATView {

    /* JADX INFO: renamed from: g */
    public boolean f1528g;

    /* JADX INFO: renamed from: h */
    public boolean f1529h;

    /* JADX INFO: renamed from: i */
    public boolean f1530i;

    /* JADX INFO: renamed from: j */
    private MraidContainerView f1531j;

    /* JADX INFO: renamed from: k */
    private InterfaceC0894a f1532k;

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidMediaView$1 */
    public class C08931 implements MraidContainerView.InterfaceC0889a {
        public C08931() {
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: a */
        public final void mo890a() {
            MraidMediaView mraidMediaView = MraidMediaView.this;
            mraidMediaView.f1528g = true;
            mraidMediaView.m911a();
            if (MraidMediaView.this.f1532k != null) {
                MraidMediaView.this.f1532k.mo532a();
            }
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: a */
        public final void mo891a(String str) {
            if (MraidMediaView.this.f1532k != null) {
                MraidMediaView.this.f1532k.mo533a(str);
            }
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: b */
        public final void mo892b() {
        }

        @Override // com.anythink.basead.p025ui.MraidContainerView.InterfaceC0889a
        /* JADX INFO: renamed from: c */
        public final void mo893c() {
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.MraidMediaView$a */
    public interface InterfaceC0894a {
        /* JADX INFO: renamed from: a */
        void mo532a();

        /* JADX INFO: renamed from: a */
        void mo533a(String str);
    }

    public MraidMediaView(Context context) {
        this(context, null, null, false, null);
    }

    public MraidMediaView(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, BaseMediaATView.InterfaceC0819a interfaceC0819a) {
        super(context, abstractC1247l, c1248m, z, interfaceC0819a);
    }

    /* JADX INFO: renamed from: a */
    private static void m909a(String str) {
        Log.d("MraidMediaView", str);
    }

    /* JADX INFO: renamed from: b */
    private void m910b() {
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1223a, this.f1225c, new C08931());
        this.f1531j = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.f1228f;
        if (frameLayout == null || this.f1531j == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f1228f.addView(this.f1531j, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m911a() {
        if (this.f1528g && this.f1529h && !this.f1530i) {
            this.f1530i = true;
            C1322e.m3894a(this.f1225c, this.f1223a);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseMediaATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f1531j;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    public void fireAudioVolumeChange(boolean z) {
        MraidContainerView mraidContainerView = this.f1531j;
        if (mraidContainerView != null) {
            mraidContainerView.fireAudioVolumeChange(z);
        }
    }

    @Override // com.anythink.basead.p025ui.BaseMediaATView
    public void init(int i, int i2) {
        super.init(i, i2);
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f1223a, this.f1225c, new C08931());
        this.f1531j = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = this.f1228f;
        if (frameLayout == null || this.f1531j == null) {
            return;
        }
        frameLayout.removeAllViews();
        this.f1228f.addView(this.f1531j, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1529h = true;
        m911a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1529h = false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        MraidContainerView mraidContainerView = this.f1531j;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z);
        }
    }

    public void setMraidWebViewListener(InterfaceC0894a interfaceC0894a) {
        this.f1532k = interfaceC0894a;
    }
}
