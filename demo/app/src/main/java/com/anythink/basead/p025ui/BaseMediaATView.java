package com.anythink.basead.p025ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.core.common.p055f.AbstractC1247l;
import com.anythink.core.common.p055f.AbstractC1249n;
import com.anythink.core.common.p055f.C1248m;
import com.anythink.core.common.p066o.C1345i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaATView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AbstractC1247l f1223a;

    /* JADX INFO: renamed from: b */
    public AbstractC1249n f1224b;

    /* JADX INFO: renamed from: c */
    public C1248m f1225c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0819a f1226d;

    /* JADX INFO: renamed from: e */
    public boolean f1227e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f1228f;

    /* JADX INFO: renamed from: g */
    private int f1229g;

    /* JADX INFO: renamed from: h */
    private int f1230h;

    /* JADX INFO: renamed from: i */
    private CloseImageView f1231i;

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseMediaATView$1 */
    public class ViewOnClickListenerC08181 implements View.OnClickListener {
        public ViewOnClickListenerC08181() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC0819a interfaceC0819a = BaseMediaATView.this.f1226d;
            if (interfaceC0819a != null) {
                interfaceC0819a.onClickCloseView();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.basead.ui.BaseMediaATView$a */
    public interface InterfaceC0819a {
        void onClickCloseView();
    }

    public BaseMediaATView(Context context) {
        super(context);
        this.f1229g = 0;
        this.f1230h = 0;
    }

    public BaseMediaATView(Context context, AbstractC1247l abstractC1247l, C1248m c1248m, boolean z, InterfaceC0819a interfaceC0819a) {
        super(context);
        this.f1229g = 0;
        this.f1230h = 0;
        this.f1223a = abstractC1247l;
        this.f1224b = c1248m.f4333n;
        this.f1227e = z;
        this.f1226d = interfaceC0819a;
        this.f1225c = c1248m;
        LayoutInflater.from(getContext()).inflate(C1345i.m4154a(getContext(), "base_myoffer_media_ad_view", "layout"), this);
        this.f1228f = (FrameLayout) findViewById(C1345i.m4154a(getContext(), "base_media_view_content", "id"));
        this.f1231i = (CloseImageView) findViewById(C1345i.m4154a(getContext(), "base_media_ad_close", "id"));
    }

    /* JADX INFO: renamed from: a */
    private void m725a() {
        CloseImageView closeImageView = this.f1231i;
        if (closeImageView == null) {
            return;
        }
        closeImageView.setVisibility(this.f1227e ? 0 : 8);
        m726a(this.f1231i, this.f1224b.m3363n());
        this.f1231i.setOnClickListener(new ViewOnClickListenerC08181());
    }

    /* JADX INFO: renamed from: a */
    private static void m726a(InterfaceC0958a interfaceC0958a, int i) {
        if (interfaceC0958a != null) {
            interfaceC0958a.setClickAreaScaleFactor(i != 2 ? i != 3 ? i != 4 ? 1.0f : 0.5f : 0.75f : 1.5f);
        }
    }

    public void destroy() {
    }

    public List<View> getClickViews() {
        return new ArrayList();
    }

    public int getMediaViewHeight() {
        return this.f1230h;
    }

    public int getMediaViewWidth() {
        return this.f1229g;
    }

    public View getMonitorClickView() {
        return null;
    }

    public void init(int i, int i2) {
        this.f1229g = i;
        this.f1230h = i2;
        CloseImageView closeImageView = this.f1231i;
        if (closeImageView != null) {
            closeImageView.setVisibility(this.f1227e ? 0 : 8);
            m726a(this.f1231i, this.f1224b.m3363n());
            this.f1231i.setOnClickListener(new ViewOnClickListenerC08181());
        }
    }

    public void notifyClick() {
        AbstractC1249n abstractC1249n;
        CloseImageView closeImageView = this.f1231i;
        if (closeImageView == null || (abstractC1249n = this.f1224b) == null) {
            return;
        }
        m726a(closeImageView, abstractC1249n.m3361m());
    }
}
