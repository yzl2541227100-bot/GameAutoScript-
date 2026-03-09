package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.anythink.core.common.p066o.C1360x;
import com.anythink.core.common.p071ui.component.RoundImageView;

/* JADX INFO: loaded from: classes.dex */
public class WrapRoundImageView extends RoundImageView {
    public WrapRoundImageView(Context context) {
        super(context);
    }

    public WrapRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int[] setBitmapAndResize(Bitmap bitmap, int i, int i2) {
        setImageBitmap(bitmap);
        if (i > 0 && i2 > 0) {
            try {
                int[] iArrM4270a = C1360x.m4270a(i, i2, bitmap.getWidth() / bitmap.getHeight());
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iArrM4270a[0];
                    layoutParams.height = iArrM4270a[1];
                    setLayoutParams(layoutParams);
                    return iArrM4270a;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }
}
