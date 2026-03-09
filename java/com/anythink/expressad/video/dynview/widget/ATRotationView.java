package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ATRotationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Runnable f13372a;

    /* JADX INFO: renamed from: b */
    private Camera f13373b;

    /* JADX INFO: renamed from: c */
    private Matrix f13374c;

    /* JADX INFO: renamed from: d */
    private int f13375d;

    /* JADX INFO: renamed from: e */
    private int f13376e;

    /* JADX INFO: renamed from: f */
    private int f13377f;

    /* JADX INFO: renamed from: g */
    private int f13378g;

    /* JADX INFO: renamed from: h */
    private int f13379h;

    /* JADX INFO: renamed from: i */
    private int f13380i;

    /* JADX INFO: renamed from: j */
    private int f13381j;

    /* JADX INFO: renamed from: k */
    private int f13382k;

    /* JADX INFO: renamed from: l */
    private float f13383l;

    /* JADX INFO: renamed from: m */
    private float f13384m;

    /* JADX INFO: renamed from: n */
    private boolean f13385n;

    /* JADX INFO: renamed from: o */
    private boolean f13386o;

    /* JADX INFO: renamed from: p */
    private boolean f13387p;

    public ATRotationView(Context context) {
        super(context);
        this.f13377f = 40;
        this.f13378g = 20;
        this.f13379h = 0;
        this.f13380i = 0;
        this.f13382k = 0;
        this.f13383l = 0.5f;
        this.f13384m = 0.9f;
        this.f13385n = true;
        this.f13386o = false;
        this.f13387p = false;
        this.f13372a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.m11274a(ATRotationView.this);
            }
        };
        m11270a();
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13377f = 40;
        this.f13378g = 20;
        this.f13379h = 0;
        this.f13380i = 0;
        this.f13382k = 0;
        this.f13383l = 0.5f;
        this.f13384m = 0.9f;
        this.f13385n = true;
        this.f13386o = false;
        this.f13387p = false;
        this.f13372a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.m11274a(ATRotationView.this);
            }
        };
        m11270a();
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13377f = 40;
        this.f13378g = 20;
        this.f13379h = 0;
        this.f13380i = 0;
        this.f13382k = 0;
        this.f13383l = 0.5f;
        this.f13384m = 0.9f;
        this.f13385n = true;
        this.f13386o = false;
        this.f13387p = false;
        this.f13372a = new Runnable() { // from class: com.anythink.expressad.video.dynview.widget.ATRotationView.1
            @Override // java.lang.Runnable
            public final void run() {
                ATRotationView.m11274a(ATRotationView.this);
            }
        };
        m11270a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m11269a(int r3) {
        /*
            r2 = this;
            r0 = 2
            if (r3 == 0) goto L21
            r1 = 1
            if (r3 == r1) goto L15
            if (r3 == r0) goto L10
            r0 = 3
            if (r3 == r0) goto Ld
            r3 = 0
            goto L2c
        Ld:
            int r3 = r2.f13380i
            goto L2c
        L10:
            boolean r3 = r2.f13387p
            if (r3 == 0) goto L19
            goto L1d
        L15:
            boolean r3 = r2.f13387p
            if (r3 == 0) goto L1d
        L19:
            int r3 = r2.f13380i
            int r3 = r3 + r1
            goto L2c
        L1d:
            int r3 = r2.f13380i
            int r3 = r3 - r1
            goto L2c
        L21:
            boolean r3 = r2.f13387p
            if (r3 == 0) goto L29
            int r3 = r2.f13380i
            int r3 = r3 - r0
            goto L2c
        L29:
            int r3 = r2.f13380i
            int r3 = r3 + r0
        L2c:
            int r0 = r2.getChildCount()
            int r3 = r3 % r0
            if (r3 < 0) goto L34
            return r3
        L34:
            int r0 = r2.getChildCount()
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.widget.ATRotationView.m11269a(int):int");
    }

    /* JADX INFO: renamed from: a */
    private void m11270a() {
        this.f13373b = new Camera();
        this.f13374c = new Matrix();
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    private void m11271a(int i, int i2, int i3) {
        float f;
        Camera camera;
        float f2 = (-i) / 2.0f;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f13373b.translate(0.0f, f2, 0.0f);
                camera = this.f13373b;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                this.f13373b.rotateX(0.0f);
                return;
            } else {
                this.f13373b.translate(0.0f, f2, 0.0f);
                camera = this.f13373b;
                i2 = -i2;
            }
            f = i2;
        } else {
            this.f13373b.translate(0.0f, f2, 0.0f);
            f = -i2;
            this.f13373b.rotateX(f);
            this.f13373b.translate(0.0f, f2, 0.0f);
            this.f13373b.translate(0.0f, f2, 0.0f);
            camera = this.f13373b;
        }
        camera.rotateX(f);
        this.f13373b.translate(0.0f, f2, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    private void m11272a(Canvas canvas) {
        int width = getWidth() / 2;
        int i = ((this.f13379h * this.f13376e) / 2) / this.f13377f;
        m11279b(canvas, i, width, 0);
        m11279b(canvas, i, width, 1);
        if (Math.abs(this.f13379h) > this.f13377f / 2) {
            m11279b(canvas, i, width, 3);
            m11279b(canvas, i, width, 2);
        } else {
            m11279b(canvas, i, width, 2);
            m11279b(canvas, i, width, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r6 < 0) goto L7;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11273a(android.graphics.Canvas r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r5.save()
            android.graphics.Camera r0 = r4.f13373b
            r0.save()
            android.graphics.Matrix r0 = r4.f13374c
            r0.reset()
            android.graphics.Camera r0 = r4.f13373b
            float r1 = (float) r6
            r2 = 0
            r0.translate(r2, r1, r2)
            android.graphics.Camera r0 = r4.f13373b
            int r3 = r4.f13379h
            float r3 = (float) r3
            r0.rotateX(r3)
            android.graphics.Camera r0 = r4.f13373b
            r0.translate(r2, r1, r2)
            if (r6 != 0) goto L2f
            boolean r6 = r4.f13387p
            if (r6 == 0) goto L28
            goto L31
        L28:
            int r6 = r4.f13375d
            int r6 = -r6
            int r0 = r4.f13377f
            int r0 = -r0
            goto L35
        L2f:
            if (r6 <= 0) goto L39
        L31:
            int r6 = r4.f13375d
            int r0 = r4.f13377f
        L35:
            r4.m11271a(r6, r0, r8)
            goto L3c
        L39:
            if (r6 >= 0) goto L3c
            goto L28
        L3c:
            android.graphics.Camera r6 = r4.f13373b
            android.graphics.Matrix r0 = r4.f13374c
            r6.getMatrix(r0)
            android.graphics.Camera r6 = r4.f13373b
            r6.restore()
            android.graphics.Matrix r6 = r4.f13374c
            int r0 = r4.getWidth()
            int r0 = -r0
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = -r7
            float r1 = (float) r1
            r6.preTranslate(r0, r1)
            android.graphics.Matrix r6 = r4.f13374c
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r7 = (float) r7
            r6.postTranslate(r0, r7)
            android.graphics.Matrix r6 = r4.f13374c
            r5.concat(r6)
            int r6 = r4.m11269a(r8)
            android.view.View r6 = r4.getChildAt(r6)
            if (r6 == 0) goto L78
            r7 = 0
            r4.drawChild(r5, r6, r7)
        L78:
            r5.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.widget.ATRotationView.m11273a(android.graphics.Canvas, int, int, int):void");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11274a(ATRotationView aTRotationView) {
        if (aTRotationView.getChildCount() != 0) {
            int i = aTRotationView.f13379h - 1;
            aTRotationView.f13379h = i;
            int i2 = aTRotationView.f13380i;
            aTRotationView.f13381j = i2;
            int i3 = aTRotationView.f13377f;
            int i4 = i2 - (i / i3);
            int i5 = i % i3;
            aTRotationView.f13379h = i5;
            aTRotationView.f13380i = i4;
            int iM11269a = Math.abs(i5) > aTRotationView.f13377f / 2 ? aTRotationView.m11269a(2) : aTRotationView.m11269a(3);
            if (aTRotationView.f13382k != iM11269a) {
                aTRotationView.f13382k = iM11269a;
            }
            aTRotationView.invalidate();
            if (aTRotationView.f13385n) {
                aTRotationView.postDelayed(aTRotationView.f13372a, 1000 / aTRotationView.f13378g);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11275b() {
        if (getChildCount() == 0) {
            return;
        }
        int i = this.f13379h - 1;
        this.f13379h = i;
        int i2 = this.f13380i;
        this.f13381j = i2;
        int i3 = this.f13377f;
        int i4 = i2 - (i / i3);
        int i5 = i % i3;
        this.f13379h = i5;
        this.f13380i = i4;
        int iM11269a = Math.abs(i5) > this.f13377f / 2 ? m11269a(2) : m11269a(3);
        if (this.f13382k != iM11269a) {
            this.f13382k = iM11269a;
        }
        invalidate();
        if (this.f13385n) {
            postDelayed(this.f13372a, 1000 / this.f13378g);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11276b(int i) {
        int i2 = this.f13377f;
        int i3 = this.f13381j - (i / i2);
        int i4 = i % i2;
        this.f13379h = i4;
        this.f13380i = i3;
        int iM11269a = Math.abs(i4) > this.f13377f / 2 ? m11269a(2) : m11269a(3);
        if (this.f13382k != iM11269a) {
            this.f13382k = iM11269a;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    private void m11277b(int i, int i2, int i3) {
        float f;
        float f2;
        Camera camera;
        if (i3 != 0) {
            if (i3 == 1) {
                f = i / 2;
                this.f13373b.translate(f, 0.0f, 0.0f);
                camera = this.f13373b;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                this.f13373b.rotateY(0.0f);
                return;
            } else {
                f = (-i) / 2;
                this.f13373b.translate(f, 0.0f, 0.0f);
                camera = this.f13373b;
                i2 = -i2;
            }
            f2 = i2;
        } else {
            f = (-i) / 2;
            this.f13373b.translate(f, 0.0f, 0.0f);
            f2 = -i2;
            this.f13373b.rotateY(f2);
            this.f13373b.translate(f, 0.0f, 0.0f);
            this.f13373b.translate(f, 0.0f, 0.0f);
            camera = this.f13373b;
        }
        camera.rotateY(f2);
        this.f13373b.translate(f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    private void m11278b(Canvas canvas) {
        int height = getHeight() / 2;
        int i = ((this.f13379h * this.f13375d) / 2) / this.f13377f;
        m11273a(canvas, i, height, 0);
        m11273a(canvas, i, height, 1);
        if (Math.abs(this.f13379h) > this.f13377f / 2) {
            m11273a(canvas, i, height, 3);
            m11273a(canvas, i, height, 2);
        } else {
            m11273a(canvas, i, height, 2);
            m11273a(canvas, i, height, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r6 < 0) goto L7;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m11279b(android.graphics.Canvas r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r5.save()
            android.graphics.Camera r0 = r4.f13373b
            r0.save()
            android.graphics.Matrix r0 = r4.f13374c
            r0.reset()
            android.graphics.Camera r0 = r4.f13373b
            float r1 = (float) r6
            r2 = 0
            r0.translate(r1, r2, r2)
            android.graphics.Camera r0 = r4.f13373b
            int r3 = r4.f13379h
            float r3 = (float) r3
            r0.rotateY(r3)
            android.graphics.Camera r0 = r4.f13373b
            r0.translate(r1, r2, r2)
            if (r6 != 0) goto L2f
            boolean r6 = r4.f13387p
            if (r6 == 0) goto L28
            goto L31
        L28:
            int r6 = r4.f13376e
            int r6 = -r6
            int r0 = r4.f13377f
            int r0 = -r0
            goto L35
        L2f:
            if (r6 <= 0) goto L39
        L31:
            int r6 = r4.f13376e
            int r0 = r4.f13377f
        L35:
            r4.m11277b(r6, r0, r8)
            goto L3c
        L39:
            if (r6 >= 0) goto L3c
            goto L28
        L3c:
            android.graphics.Camera r6 = r4.f13373b
            android.graphics.Matrix r0 = r4.f13374c
            r6.getMatrix(r0)
            android.graphics.Camera r6 = r4.f13373b
            r6.restore()
            android.graphics.Matrix r6 = r4.f13374c
            int r0 = -r7
            float r0 = (float) r0
            int r1 = r4.getHeight()
            int r1 = -r1
            int r1 = r1 / 2
            float r1 = (float) r1
            r6.preTranslate(r0, r1)
            android.graphics.Matrix r6 = r4.f13374c
            float r7 = (float) r7
            int r0 = r4.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            r6.postTranslate(r7, r0)
            android.graphics.Matrix r6 = r4.f13374c
            r5.concat(r6)
            int r6 = r4.m11269a(r8)
            android.view.View r6 = r4.getChildAt(r6)
            if (r6 == 0) goto L78
            r7 = 0
            r4.drawChild(r5, r6, r7)
        L78:
            r5.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.widget.ATRotationView.m11279b(android.graphics.Canvas, int, int, int):void");
    }

    /* JADX INFO: renamed from: c */
    private void m11280c(int i) {
        this.f13380i = i;
        int iM11269a = Math.abs(this.f13379h) > this.f13377f / 2 ? m11269a(2) : m11269a(3);
        if (this.f13382k != iM11269a) {
            this.f13382k = iM11269a;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f13386o) {
            int height = getHeight() / 2;
            int i = ((this.f13379h * this.f13375d) / 2) / this.f13377f;
            m11273a(canvas, i, height, 0);
            m11273a(canvas, i, height, 1);
            if (Math.abs(this.f13379h) > this.f13377f / 2) {
                m11273a(canvas, i, height, 3);
                m11273a(canvas, i, height, 2);
                return;
            } else {
                m11273a(canvas, i, height, 2);
                m11273a(canvas, i, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i2 = ((this.f13379h * this.f13376e) / 2) / this.f13377f;
        m11279b(canvas, i2, width, 0);
        m11279b(canvas, i2, width, 1);
        if (Math.abs(this.f13379h) > this.f13377f / 2) {
            m11279b(canvas, i2, width, 3);
            m11279b(canvas, i2, width, 2);
        } else {
            m11279b(canvas, i2, width, 2);
            m11279b(canvas, i2, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        float f = i5;
        float f2 = this.f13383l;
        int i6 = (int) (((1.0f - f2) * f) / 2.0f);
        int i7 = i4 - i2;
        float f3 = i7;
        float f4 = this.f13384m;
        int i8 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.f13375d = (int) (f3 * f4);
        this.f13376e = (int) (f * f2);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.layout(i6, i8, i5 - i6, i7 - i8);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = this.f13376e;
            if (i10 != i11) {
                layoutParams.width = i11;
                layoutParams.height = this.f13375d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z) {
        if (z) {
            postDelayed(this.f13372a, 1000 / this.f13378g);
        }
        this.f13385n = z;
    }

    public void setHeightRatio(float f) {
        this.f13384m = f;
    }

    public void setRotateV(boolean z) {
        this.f13386o = z;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.f13383l = f;
    }
}
