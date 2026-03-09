package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.anythink.expressad.foundation.p138h.C1875i;
import com.anythink.expressad.foundation.webview.InterfaceC1898a;

/* JADX INFO: loaded from: classes.dex */
public class ProgressBar extends View implements InterfaceC1898a {

    /* JADX INFO: renamed from: C */
    private static final float f11655C = 1200.0f;

    /* JADX INFO: renamed from: L */
    private static final long f11656L = 25;

    /* JADX INFO: renamed from: g */
    private static final String f11657g = "ProgressBar";

    /* JADX INFO: renamed from: h */
    private static final boolean f11658h = false;

    /* JADX INFO: renamed from: t */
    private static final float f11659t = 0.05f;

    /* JADX INFO: renamed from: u */
    private static final float f11660u = 0.2f;

    /* JADX INFO: renamed from: v */
    private static final float f11661v = 0.4f;

    /* JADX INFO: renamed from: w */
    private static final float f11662w = 1.0f;

    /* JADX INFO: renamed from: x */
    private static final long f11663x = 2000;

    /* JADX INFO: renamed from: y */
    private static final float f11664y = 0.2f;

    /* JADX INFO: renamed from: A */
    private int f11665A;

    /* JADX INFO: renamed from: B */
    private int f11666B;

    /* JADX INFO: renamed from: D */
    private long f11667D;

    /* JADX INFO: renamed from: E */
    private Drawable f11668E;

    /* JADX INFO: renamed from: F */
    private Drawable f11669F;

    /* JADX INFO: renamed from: G */
    private Drawable f11670G;

    /* JADX INFO: renamed from: H */
    private Drawable f11671H;

    /* JADX INFO: renamed from: I */
    private boolean f11672I;

    /* JADX INFO: renamed from: J */
    private InterfaceC1898a.a f11673J;

    /* JADX INFO: renamed from: K */
    private Handler f11674K;

    /* JADX INFO: renamed from: M */
    private boolean f11675M;

    /* JADX INFO: renamed from: N */
    private boolean f11676N;

    /* JADX INFO: renamed from: f */
    public Runnable f11677f;

    /* JADX INFO: renamed from: i */
    private Rect f11678i;

    /* JADX INFO: renamed from: j */
    private float f11679j;

    /* JADX INFO: renamed from: k */
    private float f11680k;

    /* JADX INFO: renamed from: l */
    private long f11681l;

    /* JADX INFO: renamed from: m */
    private float f11682m;

    /* JADX INFO: renamed from: n */
    private boolean f11683n;

    /* JADX INFO: renamed from: o */
    private float f11684o;

    /* JADX INFO: renamed from: p */
    private float f11685p;

    /* JADX INFO: renamed from: q */
    private float f11686q;

    /* JADX INFO: renamed from: r */
    private long f11687r;

    /* JADX INFO: renamed from: s */
    private int f11688s;

    /* JADX INFO: renamed from: z */
    private int f11689z;

    public ProgressBar(Context context) {
        super(context);
        this.f11678i = new Rect();
        this.f11680k = 0.95f;
        this.f11667D = f11656L;
        this.f11672I = false;
        this.f11674K = new Handler(Looper.getMainLooper());
        this.f11677f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f11676N = false;
        setWillNotDraw(false);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11678i = new Rect();
        this.f11680k = 0.95f;
        this.f11667D = f11656L;
        this.f11672I = false;
        this.f11674K = new Handler(Looper.getMainLooper());
        this.f11677f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f11676N = false;
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    private void m9886a() {
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    private void m9887a(Canvas canvas, float f) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f11683n) {
            float f2 = this.f11684o;
            float f3 = this.f11679j;
            int i = (int) ((1.0f - (f2 / (f3 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f2 > f3 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f11669F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f11670G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f11668E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f11684o, 0.0f);
        }
        if (this.f11669F != null && this.f11668E != null) {
            int iWidth = (int) (this.f11678i.width() - (this.f11668E.getIntrinsicWidth() * f11659t));
            Drawable drawable6 = this.f11669F;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.f11669F.draw(canvas);
        }
        if (this.f11683n && (drawable2 = this.f11670G) != null && this.f11668E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f11670G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f11670G.draw(canvas);
            canvas.restore();
        }
        if (this.f11668E != null) {
            canvas.save();
            canvas.translate(this.f11678i.width() - getWidth(), 0.0f);
            this.f11668E.draw(canvas);
            canvas.restore();
        }
        if (!this.f11683n && Math.abs(this.f11685p - this.f11680k) < 1.0E-5f && (drawable = this.f11671H) != null) {
            int i2 = (int) (this.f11688s + (f * 0.2f * this.f11679j));
            this.f11688s = i2;
            if (i2 + drawable.getIntrinsicWidth() >= this.f11678i.width()) {
                this.f11688s = -this.f11671H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f11688s, 0.0f);
            this.f11671H.draw(canvas);
            canvas.restore();
        }
        if (this.f11683n) {
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: b */
    private float m9888b() {
        if (this.f11683n) {
            return this.f11675M ? 1.0f : 0.4f;
        }
        if (this.f11687r < 2000) {
            if (this.f11665A == 1) {
                return this.f11675M ? 1.0f : 0.4f;
            }
            if (this.f11689z == 1) {
                return this.f11675M ? 0.4f : 0.2f;
            }
            if (this.f11675M) {
                return 0.2f;
            }
        }
        return f11659t;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public float getProgress() {
        return this.f11685p;
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void initResource(boolean z) {
        if (z || (this.f11671H == null && this.f11668E == null && this.f11669F == null && this.f11670G == null)) {
            Drawable drawable = getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_cm_highlight", C1875i.f11528c));
            this.f11671H = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f11671H.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_cm_head", C1875i.f11528c));
            this.f11668E = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f11668E.getIntrinsicHeight());
            }
            this.f11669F = getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_cm_tail", C1875i.f11528c));
            this.f11670G = getResources().getDrawable(C1875i.m9684a(getContext(), "anythink_cm_end_animation", C1875i.f11528c));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11679j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void onThemeChange() {
        if (this.f11672I) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.f11671H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f11668E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void setPaused(boolean z) {
        this.f11676N = z;
        if (z) {
            return;
        }
        this.f11681l = System.currentTimeMillis();
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void setProgress(float f, boolean z) {
        if (!z || f < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void setProgressBarListener(InterfaceC1898a.a aVar) {
        this.f11673J = aVar;
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void setProgressState(int i) {
        if (i == 5) {
            this.f11689z = 1;
            this.f11665A = 0;
            this.f11666B = 0;
            this.f11687r = 0L;
            return;
        }
        if (i == 6) {
            this.f11665A = 1;
            if (this.f11666B == 1) {
                startEndAnimation();
            }
            this.f11687r = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.f11666B = 1;
            if (this.f11665A == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void setVisible(boolean z) {
        if (!z) {
            setVisibility(4);
            return;
        }
        this.f11675M = true;
        this.f11681l = System.currentTimeMillis();
        this.f11682m = 0.0f;
        this.f11687r = 0L;
        this.f11683n = false;
        this.f11684o = 0.0f;
        this.f11685p = 0.0f;
        this.f11679j = getMeasuredWidth();
        this.f11676N = false;
        this.f11689z = 0;
        this.f11665A = 0;
        this.f11666B = 0;
        Drawable drawable = this.f11671H;
        if (drawable != null) {
            this.f11688s = -drawable.getIntrinsicWidth();
        } else {
            this.f11688s = 0;
        }
        Drawable drawable2 = this.f11669F;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f11670G;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f11668E;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    @Override // com.anythink.expressad.foundation.webview.InterfaceC1898a
    public void startEndAnimation() {
        if (this.f11683n) {
            return;
        }
        this.f11683n = true;
        this.f11684o = 0.0f;
    }
}
