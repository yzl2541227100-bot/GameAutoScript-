package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1360x;

/* JADX INFO: loaded from: classes.dex */
public class CloseFrameLayout extends FrameLayout implements InterfaceC0958a {

    /* JADX INFO: renamed from: a */
    private static final String f1356a = CloseFrameLayout.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private float f1357b;

    /* JADX INFO: renamed from: c */
    private Rect f1358c;

    public CloseFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1357b = 1.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        if (this.f1357b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || this.f1358c.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.p025ui.InterfaceC0958a
    public void setClickAreaScaleFactor(float f) {
        this.f1357b = f;
        if (f <= 0.0f) {
            this.f1357b = 1.0f;
        }
        new StringBuilder("setClickAreaScaleFactor: ").append(this.f1357b);
        float f2 = this.f1357b;
        if (f2 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseFrameLayout.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseFrameLayout.this.f1358c = new Rect();
                    CloseFrameLayout closeFrameLayout = CloseFrameLayout.this;
                    closeFrameLayout.getHitRect(closeFrameLayout.f1358c);
                    int iWidth = ((int) (CloseFrameLayout.this.f1358c.width() * (CloseFrameLayout.this.f1357b - 1.0f))) / 2;
                    int iHeight = ((int) (CloseFrameLayout.this.f1358c.height() * (CloseFrameLayout.this.f1357b - 1.0f))) / 2;
                    CloseFrameLayout.this.f1358c.top -= iHeight;
                    CloseFrameLayout.this.f1358c.bottom += iHeight;
                    CloseFrameLayout.this.f1358c.left -= iWidth;
                    CloseFrameLayout.this.f1358c.right += iWidth;
                }
            });
        } else if (f2 > 1.0f) {
            C1360x.m4266a(this, f2);
        }
    }
}
