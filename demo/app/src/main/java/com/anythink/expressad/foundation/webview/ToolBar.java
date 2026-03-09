package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: loaded from: classes.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        m9889a();
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9889a();
    }

    /* JADX INFO: renamed from: a */
    private void m9889a() {
        setOrientation(0);
        int iM9834b = C1886t.m9834b(getContext(), 10.0f);
        setPadding(0, iM9834b, 0, iM9834b);
        ImageView imageView = (ImageView) m9890b();
        imageView.setTag("backward");
        imageView.setImageDrawable(getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_expressad_backward", C1875i.f11528c)));
        addView(imageView);
        ImageView imageView2 = (ImageView) m9890b();
        imageView2.setTag("forward");
        imageView2.setImageDrawable(getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_expressad_forward", C1875i.f11528c)));
        addView(imageView2);
        ImageView imageView3 = (ImageView) m9890b();
        imageView3.setTag("refresh");
        imageView3.setImageDrawable(getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_expressad_refresh", C1875i.f11528c)));
        addView(imageView3);
        ImageView imageView4 = (ImageView) m9890b();
        imageView4.setTag("exits");
        imageView4.setImageDrawable(getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_expressad_exits", C1875i.f11528c)));
        addView(imageView4);
    }

    /* JADX INFO: renamed from: b */
    private View m9890b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }
}
