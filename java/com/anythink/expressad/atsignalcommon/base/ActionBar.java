package com.anythink.expressad.atsignalcommon.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class ActionBar extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private WebView f6670a;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.base.ActionBar$a */
    public interface InterfaceC1447a {
        /* JADX INFO: renamed from: a */
        void m5619a();

        /* JADX INFO: renamed from: b */
        View m5620b();
    }

    public ActionBar(Context context) {
        super(context);
    }

    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private View m5618a(InterfaceC1447a interfaceC1447a) {
        View viewM5620b = interfaceC1447a.m5620b();
        if (viewM5620b == null) {
            return null;
        }
        View viewNewActionItem = newActionItem();
        ((ViewGroup) ((ViewGroup) viewNewActionItem).getChildAt(0)).addView(viewM5620b);
        viewM5620b.setTag(interfaceC1447a);
        viewM5620b.setOnClickListener(this);
        return viewNewActionItem;
    }

    public void addAction(InterfaceC1447a interfaceC1447a) {
        addAction(interfaceC1447a, getChildCount());
    }

    public void addAction(InterfaceC1447a interfaceC1447a, int i) {
        View viewNewActionItem;
        View viewM5620b = interfaceC1447a.m5620b();
        if (viewM5620b != null) {
            viewNewActionItem = newActionItem();
            ((ViewGroup) ((ViewGroup) viewNewActionItem).getChildAt(0)).addView(viewM5620b);
            viewM5620b.setTag(interfaceC1447a);
            viewM5620b.setOnClickListener(this);
        } else {
            viewNewActionItem = null;
        }
        addView(viewNewActionItem, i);
    }

    public int getActionCount() {
        return getChildCount();
    }

    public WebView getWebView() {
        return this.f6670a;
    }

    public View newActionItem() {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getTag();
    }

    public boolean removeAction(InterfaceC1447a interfaceC1447a) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof InterfaceC1447a) && tag.equals(interfaceC1447a)) {
                    removeView(childAt);
                    return true;
                }
            }
        }
        return false;
    }

    public void removeActionAt(int i) {
        if (i < 0 || i >= getChildCount()) {
            return;
        }
        removeViewAt(i);
    }

    public void removeAllActions() {
        removeAllViews();
    }

    public void setWebView(WebView webView) {
        this.f6670a = webView;
    }
}
