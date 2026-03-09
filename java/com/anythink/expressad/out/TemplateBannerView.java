package com.anythink.expressad.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.p050a.InterfaceC1157i;
import com.anythink.expressad.foundation.p113b.C1773a;
import com.anythink.expressad.foundation.p116d.C1782d;
import com.anythink.expressad.foundation.p118f.C1800b;
import com.anythink.expressad.mbbanner.p139a.C1899a;
import com.anythink.expressad.mbbanner.p145b.C1920a;

/* JADX INFO: loaded from: classes.dex */
public class TemplateBannerView extends RelativeLayout implements InterfaceC1157i {

    /* JADX INFO: renamed from: a */
    private C1920a f11901a;

    /* JADX INFO: renamed from: b */
    private InterfaceC1933h f11902b;

    /* JADX INFO: renamed from: c */
    private boolean f11903c;

    /* JADX INFO: renamed from: d */
    private boolean f11904d;

    /* JADX INFO: renamed from: e */
    private String f11905e;

    /* JADX INFO: renamed from: com.anythink.expressad.out.TemplateBannerView$1 */
    public class RunnableC19251 implements Runnable {
        public RunnableC19251() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TemplateBannerView.this.f11901a == null || C1800b.f10958c) {
                return;
            }
            TemplateBannerView.this.f11901a.m10106c(true);
        }
    }

    public TemplateBannerView(Context context) {
        this(context, null);
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemplateBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11903c = false;
        this.f11904d = false;
        C1773a.m8548c().m8553b(context);
    }

    /* JADX INFO: renamed from: a */
    private void m10114a() {
        postDelayed(new Runnable() { // from class: com.anythink.expressad.out.TemplateBannerView.1
            public RunnableC19251() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (TemplateBannerView.this.f11901a == null || C1800b.f10958c) {
                    return;
                }
                TemplateBannerView.this.f11901a.m10106c(true);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: a */
    private void m10115a(boolean z) {
        this.f11903c = z;
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10104b(z);
        }
    }

    public String getRequestId() {
        C1920a c1920a = this.f11901a;
        return c1920a != null ? c1920a.m10097a() : "";
    }

    public void init(C1934i c1934i, String str, String str2) {
        C1920a c1920a = new C1920a(this, c1934i, str, str2);
        this.f11901a = c1920a;
        c1920a.m10106c(this.f11904d);
        this.f11901a.m10104b(this.f11903c);
    }

    @Override // com.anythink.core.common.p050a.InterfaceC1157i
    public boolean isReady() {
        return true;
    }

    public void load(C1782d c1782d) {
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10104b(this.f11903c);
            this.f11901a.m10099a(c1782d);
        } else {
            InterfaceC1933h interfaceC1933h = this.f11902b;
            if (interfaceC1933h != null) {
                interfaceC1933h.mo322a(C1899a.f11696a);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10115a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10115a(false);
    }

    public void onPause() {
        if (this.f11901a == null || !TextUtils.isEmpty(this.f11905e)) {
            return;
        }
        this.f11901a.m10105c();
    }

    public void onResume() {
        if (this.f11901a == null || !TextUtils.isEmpty(this.f11905e) || C1800b.f10958c) {
            return;
        }
        this.f11901a.m10107d();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10098a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f11904d = i == 0;
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            if (i == 0) {
                m10114a();
            } else {
                c1920a.m10106c(false);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f11904d = i == 0;
        if (this.f11901a != null) {
            if (i == 0) {
                m10114a();
            } else {
                if (C1800b.f10958c) {
                    return;
                }
                this.f11901a.m10106c(false);
            }
        }
    }

    public void release() {
        if (this.f11902b != null) {
            this.f11902b = null;
        }
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10100a((InterfaceC1933h) null);
            this.f11901a.m10103b();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z) {
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10102a(z);
        }
    }

    public void setBannerAdListener(InterfaceC1933h interfaceC1933h) {
        this.f11902b = interfaceC1933h;
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10100a(interfaceC1933h);
        }
    }

    public void updateBannerSize(C1934i c1934i) {
        C1920a c1920a = this.f11901a;
        if (c1920a != null) {
            c1920a.m10101a(c1934i);
        }
    }
}
