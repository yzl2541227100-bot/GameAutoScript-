package com.anythink.expressad.video.dynview.p166i.p168b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.anythink.expressad.foundation.p138h.C1886t;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.i.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2093a {
    /* JADX INFO: renamed from: a */
    public static void m11189a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null) {
            int[] iArr = new int[2];
            for (int i = 0; i < 2; i++) {
                iArr[i] = Color.parseColor(strArr[i]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(C1886t.m9834b(view.getContext(), f2));
            gradientDrawable.setStroke(C1886t.m9834b(view.getContext(), f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m11190a(View view, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(C1886t.m9834b(view.getContext(), 12.0f));
            gradientDrawable.setStroke(C1886t.m9834b(view.getContext(), 1.0f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }
}
