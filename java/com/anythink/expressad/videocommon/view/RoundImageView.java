package com.anythink.expressad.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.anythink.expressad.foundation.p138h.C1886t;
import com.anythink.expressad.widget.ATImageView;

/* JADX INFO: loaded from: classes.dex */
public class RoundImageView extends ATImageView {

    /* JADX INFO: renamed from: a */
    private static final String f14696a = "RoundImageView";

    /* JADX INFO: renamed from: c */
    private static final int f14697c = 0;

    /* JADX INFO: renamed from: d */
    private static final int f14698d = 1;

    /* JADX INFO: renamed from: e */
    private static final int f14699e = 5;

    /* JADX INFO: renamed from: m */
    private static final String f14700m = "state_instance";

    /* JADX INFO: renamed from: n */
    private static final String f14701n = "state_type";

    /* JADX INFO: renamed from: o */
    private static final String f14702o = "state_border_radius";

    /* JADX INFO: renamed from: b */
    private int f14703b;

    /* JADX INFO: renamed from: f */
    private int f14704f;

    /* JADX INFO: renamed from: g */
    private Paint f14705g;

    /* JADX INFO: renamed from: h */
    private int f14706h;

    /* JADX INFO: renamed from: i */
    private Matrix f14707i;

    /* JADX INFO: renamed from: j */
    private BitmapShader f14708j;

    /* JADX INFO: renamed from: k */
    private int f14709k;

    /* JADX INFO: renamed from: l */
    private RectF f14710l;

    public RoundImageView(Context context) {
        super(context);
        this.f14707i = new Matrix();
        Paint paint = new Paint();
        this.f14705g = paint;
        paint.setAntiAlias(true);
        this.f14704f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f14703b = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14707i = new Matrix();
        Paint paint = new Paint();
        this.f14705g = paint;
        paint.setAntiAlias(true);
        this.f14704f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f14703b = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14707i = new Matrix();
        Paint paint = new Paint();
        this.f14705g = paint;
        paint.setAntiAlias(true);
        this.f14704f = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f14703b = 1;
    }

    /* JADX INFO: renamed from: a */
    private static Bitmap m12109a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m12110a() {
        Bitmap bitmapM12109a;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapM12109a = m12109a(drawable)) == null || bitmapM12109a.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f14708j = new BitmapShader(bitmapM12109a, tileMode, tileMode);
            int i = this.f14703b;
            float fMax = 1.0f;
            if (i == 0) {
                fMax = (this.f14709k * 1.0f) / Math.min(bitmapM12109a.getWidth(), bitmapM12109a.getHeight());
            } else if (i == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapM12109a.getWidth(), (getHeight() * 1.0f) / bitmapM12109a.getHeight());
            }
            this.f14707i.setScale(fMax, fMax);
            this.f14708j.setLocalMatrix(this.f14707i);
            this.f14705g.setShader(this.f14708j);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.widget.ATImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapM12109a;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (bitmapM12109a = m12109a(drawable)) != null && !bitmapM12109a.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f14708j = new BitmapShader(bitmapM12109a, tileMode, tileMode);
                    int i = this.f14703b;
                    float fMax = 1.0f;
                    if (i == 0) {
                        fMax = (this.f14709k * 1.0f) / Math.min(bitmapM12109a.getWidth(), bitmapM12109a.getHeight());
                    } else if (i == 1) {
                        fMax = Math.max((getWidth() * 1.0f) / bitmapM12109a.getWidth(), (getHeight() * 1.0f) / bitmapM12109a.getHeight());
                    }
                    this.f14707i.setScale(fMax, fMax);
                    this.f14708j.setLocalMatrix(this.f14707i);
                    this.f14705g.setShader(this.f14708j);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
            if (this.f14703b != 1) {
                int i2 = this.f14706h;
                canvas.drawCircle(i2, i2, i2, this.f14705g);
            } else {
                RectF rectF = this.f14710l;
                int i3 = this.f14704f;
                canvas.drawRoundRect(rectF, i3, i3, this.f14705g);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f14703b == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f14709k = iMin;
            this.f14706h = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(f14700m));
        this.f14703b = bundle.getInt(f14701n);
        this.f14704f = bundle.getInt(f14702o);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f14700m, super.onSaveInstanceState());
        bundle.putInt(f14701n, this.f14703b);
        bundle.putInt(f14702o, this.f14704f);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f14703b == 1) {
            this.f14710l = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int iM9834b = C1886t.m9834b(getContext(), i);
        if (this.f14704f != iM9834b) {
            this.f14704f = iM9834b;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f14703b != i) {
            this.f14703b = i;
            if (i != 1 && i != 0) {
                this.f14703b = 0;
            }
            requestLayout();
        }
    }
}
