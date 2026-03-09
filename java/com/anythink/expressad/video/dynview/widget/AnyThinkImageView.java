package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class AnyThinkImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private static final String f13391a = "MBridgeImageView";

    /* JADX INFO: renamed from: b */
    private Xfermode f13392b;

    /* JADX INFO: renamed from: c */
    private int f13393c;

    /* JADX INFO: renamed from: d */
    private int f13394d;

    /* JADX INFO: renamed from: e */
    private int f13395e;

    /* JADX INFO: renamed from: f */
    private int f13396f;

    /* JADX INFO: renamed from: g */
    private int f13397g;

    /* JADX INFO: renamed from: h */
    private int f13398h;

    /* JADX INFO: renamed from: i */
    private int f13399i;

    /* JADX INFO: renamed from: j */
    private int f13400j;

    /* JADX INFO: renamed from: k */
    private int f13401k;

    /* JADX INFO: renamed from: l */
    private float[] f13402l;

    /* JADX INFO: renamed from: m */
    private float[] f13403m;

    /* JADX INFO: renamed from: n */
    private RectF f13404n;

    /* JADX INFO: renamed from: o */
    private RectF f13405o;

    /* JADX INFO: renamed from: p */
    private boolean f13406p;

    /* JADX INFO: renamed from: q */
    private boolean f13407q;

    /* JADX INFO: renamed from: r */
    private Path f13408r;

    /* JADX INFO: renamed from: s */
    private Paint f13409s;

    public AnyThinkImageView(Context context) {
        this(context, null);
    }

    public AnyThinkImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnyThinkImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13408r = new Path();
        this.f13409s = new Paint();
        this.f13402l = new float[8];
        this.f13403m = new float[8];
        this.f13405o = new RectF();
        this.f13404n = new RectF();
        this.f13392b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* JADX INFO: renamed from: a */
    private void m11281a() {
        if (this.f13402l == null || this.f13403m == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                float[] fArr = this.f13402l;
                if (i >= fArr.length) {
                    return;
                }
                int i2 = this.f13395e;
                fArr[i] = i2;
                this.f13403m[i] = i2 - (this.f13400j / 2.0f);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11282a(int i, int i2) {
        Path path = this.f13408r;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f13409s;
        if (paint != null) {
            paint.setStrokeWidth(i);
            this.f13409s.setColor(i2);
            this.f13409s.setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11283a(Canvas canvas) {
        m11284a(canvas, this.f13400j, this.f13401k, this.f13405o, this.f13402l);
    }

    /* JADX INFO: renamed from: a */
    private void m11284a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        try {
            m11282a(i, i2);
            Path path = this.f13408r;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f13408r, this.f13409s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11285b() {
        int i;
        int i2;
        int i3;
        try {
            if (this.f13402l == null || this.f13403m == null) {
                return;
            }
            int i4 = 0;
            while (true) {
                i = 2;
                if (i4 >= 2) {
                    break;
                }
                float[] fArr = this.f13402l;
                int i5 = this.f13396f;
                fArr[i4] = i5;
                this.f13403m[i4] = i5 - (this.f13400j / 2.0f);
                i4++;
            }
            while (true) {
                i2 = 4;
                if (i >= 4) {
                    break;
                }
                float[] fArr2 = this.f13402l;
                int i6 = this.f13397g;
                fArr2[i] = i6;
                this.f13403m[i] = i6 - (this.f13400j / 2.0f);
                i++;
            }
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                float[] fArr3 = this.f13402l;
                int i7 = this.f13398h;
                fArr3[i2] = i7;
                this.f13403m[i2] = i7 - (this.f13400j / 2.0f);
                i2++;
            }
            for (i3 = 6; i3 < 8; i3++) {
                float[] fArr4 = this.f13402l;
                int i8 = this.f13399i;
                fArr4[i3] = i8;
                this.f13403m[i3] = i8 - (this.f13400j / 2.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m11286c() {
        RectF rectF = this.f13405o;
        if (rectF != null) {
            int i = this.f13400j;
            rectF.set(i / 2.0f, i / 2.0f, this.f13393c - (i / 2.0f), this.f13394d - (i / 2.0f));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m11287d() {
        RectF rectF = this.f13404n;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f13393c, this.f13394d);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f13404n, null, 31);
            int i = this.f13393c;
            int i2 = this.f13400j;
            int i3 = this.f13394d;
            canvas.scale(((i - (i2 * 2)) * 1.0f) / i, ((i3 - (i2 * 2)) * 1.0f) / i3, i / 2.0f, i3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f13409s;
            if (paint != null) {
                paint.reset();
                this.f13409s.setAntiAlias(true);
                this.f13409s.setStyle(Paint.Style.FILL);
                this.f13409s.setXfermode(this.f13392b);
            }
            Path path = this.f13408r;
            if (path != null) {
                path.reset();
                this.f13408r.addRoundRect(this.f13404n, this.f13403m, Path.Direction.CCW);
            }
            canvas.drawPath(this.f13408r, this.f13409s);
            Paint paint2 = this.f13409s;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f13406p) {
                m11284a(canvas, this.f13400j, this.f13401k, this.f13405o, this.f13402l);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onSizeChanged(i, i2, i3, i4);
        this.f13393c = i;
        this.f13394d = i2;
        int i8 = 0;
        try {
            if (this.f13407q) {
                if (this.f13402l != null && this.f13403m != null) {
                    while (true) {
                        i5 = 2;
                        if (i8 >= 2) {
                            break;
                        }
                        float[] fArr = this.f13402l;
                        int i9 = this.f13396f;
                        fArr[i8] = i9;
                        this.f13403m[i8] = i9 - (this.f13400j / 2.0f);
                        i8++;
                    }
                    while (true) {
                        i6 = 4;
                        if (i5 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f13402l;
                        int i10 = this.f13397g;
                        fArr2[i5] = i10;
                        this.f13403m[i5] = i10 - (this.f13400j / 2.0f);
                        i5++;
                    }
                    while (true) {
                        if (i6 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f13402l;
                        int i11 = this.f13398h;
                        fArr3[i6] = i11;
                        this.f13403m[i6] = i11 - (this.f13400j / 2.0f);
                        i6++;
                    }
                    for (i7 = 6; i7 < 8; i7++) {
                        float[] fArr4 = this.f13402l;
                        int i12 = this.f13399i;
                        fArr4[i7] = i12;
                        this.f13403m[i7] = i12 - (this.f13400j / 2.0f);
                    }
                }
            } else if (this.f13402l != null && this.f13403m != null) {
                while (true) {
                    float[] fArr5 = this.f13402l;
                    if (i8 >= fArr5.length) {
                        break;
                    }
                    int i13 = this.f13395e;
                    fArr5[i8] = i13;
                    this.f13403m[i8] = i13 - (this.f13400j / 2.0f);
                    i8++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        RectF rectF = this.f13405o;
        if (rectF != null) {
            int i14 = this.f13400j;
            rectF.set(i14 / 2.0f, i14 / 2.0f, this.f13393c - (i14 / 2.0f), this.f13394d - (i14 / 2.0f));
        }
        RectF rectF2 = this.f13404n;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f13393c, this.f13394d);
        }
    }

    public void setBorder(int i, int i2, int i3) {
        this.f13406p = true;
        this.f13400j = i2;
        this.f13401k = i3;
        this.f13395e = i;
    }

    public void setCornerRadius(int i) {
        this.f13395e = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f13406p = true;
        this.f13407q = true;
        this.f13400j = i5;
        this.f13401k = i6;
        this.f13396f = i;
        this.f13398h = i3;
        this.f13397g = i2;
        this.f13399i = i4;
    }
}
