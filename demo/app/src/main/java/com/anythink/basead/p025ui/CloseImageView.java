package com.anythink.basead.p025ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1360x;

/* JADX INFO: loaded from: classes.dex */
public class CloseImageView extends ImageView implements InterfaceC0958a {

    /* JADX INFO: renamed from: a */
    private final String f1367a;

    /* JADX INFO: renamed from: b */
    private float f1368b;

    /* JADX INFO: renamed from: c */
    private Rect f1369c;

    public CloseImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1367a = getClass().getSimpleName();
        this.f1368b = 1.0f;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = this.f1368b;
        if (f > 1.0f) {
            C1360x.m4266a(this, f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        if (this.f1368b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || this.f1369c.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.p025ui.InterfaceC0958a
    public void setClickAreaScaleFactor(float f) {
        this.f1368b = f;
        if (f <= 0.0f) {
            this.f1368b = 1.0f;
        }
        new StringBuilder("setClickAreaScaleFactor: ").append(this.f1368b);
        float f2 = this.f1368b;
        if (f2 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.f1369c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.f1369c);
                    int iWidth = ((int) (CloseImageView.this.f1369c.width() * (CloseImageView.this.f1368b - 1.0f))) / 2;
                    int iHeight = ((int) (CloseImageView.this.f1369c.height() * (CloseImageView.this.f1368b - 1.0f))) / 2;
                    CloseImageView.this.f1369c.top -= iHeight;
                    CloseImageView.this.f1369c.bottom += iHeight;
                    CloseImageView.this.f1369c.left -= iWidth;
                    CloseImageView.this.f1369c.right += iWidth;
                }
            });
        } else if (f2 > 1.0f) {
            C1360x.m4266a(this, f2);
        }
    }
}
