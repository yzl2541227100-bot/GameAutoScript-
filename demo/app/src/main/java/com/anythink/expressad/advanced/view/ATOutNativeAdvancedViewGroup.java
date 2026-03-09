package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.expressad.advanced.p079d.C1431c;

/* JADX INFO: loaded from: classes.dex */
public class ATOutNativeAdvancedViewGroup extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private C1431c f6647a;

    /* JADX INFO: renamed from: com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup$1 */
    public class RunnableC14391 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6648a;

        public RunnableC14391(int i) {
            i = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ATOutNativeAdvancedViewGroup.this.f6647a != null) {
                ATOutNativeAdvancedViewGroup.this.f6647a.m5548d(i);
            }
        }
    }

    public ATOutNativeAdvancedViewGroup(Context context) {
        super(context);
    }

    public ATOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ATOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m5569a(int i) {
        postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f6648a;

            public RunnableC14391(int i2) {
                i = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ATOutNativeAdvancedViewGroup.this.f6647a != null) {
                    ATOutNativeAdvancedViewGroup.this.f6647a.m5548d(i);
                }
            }
        }, 200L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6647a != null) {
            m5569a(1);
            if (getVisibility() == 0) {
                m5569a(2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1431c c1431c = this.f6647a;
        if (c1431c != null) {
            c1431c.m5550e(1);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            m5569a(2);
            if (getParent() != null) {
                m5569a(1);
                return;
            }
            return;
        }
        C1431c c1431c = this.f6647a;
        if (c1431c != null) {
            c1431c.m5550e(2);
        }
    }

    public void setProvider(C1431c c1431c) {
        this.f6647a = c1431c;
    }
}
