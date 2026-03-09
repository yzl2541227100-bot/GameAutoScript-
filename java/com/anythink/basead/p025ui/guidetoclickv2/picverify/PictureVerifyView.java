package com.anythink.basead.p025ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.anythink.core.common.p066o.C1345i;
import com.anythink.core.common.p071ui.component.RoundImageView;

/* JADX INFO: loaded from: classes.dex */
public class PictureVerifyView extends RoundImageView {

    /* JADX INFO: renamed from: c */
    private static final int f2172c = 1;

    /* JADX INFO: renamed from: d */
    private static final int f2173d = 2;

    /* JADX INFO: renamed from: e */
    private static final int f2174e = 3;

    /* JADX INFO: renamed from: f */
    private static final int f2175f = 4;

    /* JADX INFO: renamed from: g */
    private static final int f2176g = 5;

    /* JADX INFO: renamed from: h */
    private static final int f2177h = 6;

    /* JADX INFO: renamed from: i */
    private static final int f2178i = 20;

    /* JADX INFO: renamed from: A */
    private float f2179A;

    /* JADX INFO: renamed from: B */
    private float f2180B;

    /* JADX INFO: renamed from: C */
    private float f2181C;

    /* JADX INFO: renamed from: j */
    private int f2182j;

    /* JADX INFO: renamed from: k */
    private C1025c f2183k;

    /* JADX INFO: renamed from: l */
    private C1025c f2184l;

    /* JADX INFO: renamed from: m */
    private Bitmap f2185m;

    /* JADX INFO: renamed from: n */
    private Path f2186n;

    /* JADX INFO: renamed from: o */
    private Paint f2187o;

    /* JADX INFO: renamed from: p */
    private Paint f2188p;

    /* JADX INFO: renamed from: q */
    private Paint f2189q;

    /* JADX INFO: renamed from: r */
    private long f2190r;

    /* JADX INFO: renamed from: s */
    private long f2191s;

    /* JADX INFO: renamed from: t */
    private int f2192t;

    /* JADX INFO: renamed from: u */
    private boolean f2193u;

    /* JADX INFO: renamed from: v */
    private InterfaceC1022a f2194v;

    /* JADX INFO: renamed from: w */
    private AbstractC1023a f2195w;

    /* JADX INFO: renamed from: x */
    private int f2196x;

    /* JADX INFO: renamed from: y */
    private int f2197y;

    /* JADX INFO: renamed from: z */
    private float f2198z;

    /* JADX INFO: renamed from: com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView$a */
    public interface InterfaceC1022a {
        /* JADX INFO: renamed from: a */
        void mo1260a();

        /* JADX INFO: renamed from: b */
        void mo1261b();
    }

    public PictureVerifyView(Context context) {
        this(context, null);
    }

    public PictureVerifyView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PictureVerifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2182j = 4;
        this.f2192t = 50;
        this.f2193u = true;
        this.f2197y = -1;
        C1024b c1024b = new C1024b(context);
        this.f2195w = c1024b;
        this.f2188p = c1024b.mo1303a();
        Paint paint = new Paint();
        this.f2189q = paint;
        paint.setColor(Color.parseColor("#B5B5B5"));
        this.f2189q.setStrokeWidth(C1345i.m4153a(getContext(), 1.0f));
        this.f2189q.setStyle(Paint.Style.STROKE);
        this.f2187o = this.f2195w.mo1307b();
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m1291a(Bitmap bitmap) {
        C1025c c1025c = this.f2183k;
        int i = c1025c.f2206a;
        int i2 = c1025c.f2207b;
        int i3 = this.f2192t;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i2, i3, i3);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    private void m1292a() {
        Bitmap bitmapCreateBitmap;
        if (getDrawable() == null || getWidth() <= 0 || getHeight() < 0) {
            return;
        }
        if (this.f2183k == null) {
            this.f2183k = this.f2195w.mo1305a(getWidth(), getHeight(), this.f2192t);
            this.f2184l = this.f2195w.mo1308b(getWidth(), getHeight(), this.f2192t);
        }
        if (this.f2186n == null) {
            Path pathMo1304a = this.f2195w.mo1304a(this.f2192t);
            this.f2186n = pathMo1304a;
            C1025c c1025c = this.f2183k;
            pathMo1304a.offset(c1025c.f2206a, c1025c.f2207b);
        }
        if (this.f2185m == null) {
            if (getDrawable() != null) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                getDrawable().setBounds(0, 0, getWidth(), getHeight());
                canvas.clipPath(this.f2186n);
                getDrawable().draw(canvas);
                this.f2195w.mo1306a(getContext(), canvas, this.f2186n);
                C1025c c1025c2 = this.f2183k;
                int i = c1025c2.f2206a;
                int i2 = c1025c2.f2207b;
                int i3 = this.f2192t;
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, i, i2, i3, i3);
                bitmapCreateBitmap2.recycle();
            } else {
                bitmapCreateBitmap = null;
            }
            this.f2185m = bitmapCreateBitmap;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1293a(float f, float f2) {
        this.f2182j = 1;
        C1025c c1025c = this.f2184l;
        int i = this.f2192t;
        c1025c.f2206a = (int) (f - (i / 2.0f));
        c1025c.f2207b = (int) (f2 - (i / 2.0f));
        this.f2190r = System.currentTimeMillis();
        postInvalidate();
    }

    /* JADX INFO: renamed from: a */
    private void m1294a(AbstractC1023a abstractC1023a) {
        this.f2195w = abstractC1023a;
    }

    /* JADX INFO: renamed from: a */
    private void m1295a(boolean z) {
        this.f2193u = z;
    }

    /* JADX INFO: renamed from: b */
    private void m1296b() {
        this.f2182j = 4;
        this.f2185m = null;
        this.f2183k = null;
        this.f2186n = null;
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    private void m1297b(float f, float f2) {
        this.f2182j = 2;
        C1025c c1025c = this.f2184l;
        c1025c.f2206a = (int) (c1025c.f2206a + f);
        c1025c.f2207b = (int) (c1025c.f2207b + f2);
        postInvalidate();
    }

    /* JADX INFO: renamed from: c */
    private void m1298c() {
        this.f2182j = 6;
        postInvalidate();
    }

    /* JADX INFO: renamed from: d */
    private void m1299d() {
        this.f2182j = 5;
        postInvalidate();
    }

    /* JADX INFO: renamed from: e */
    private Bitmap m1300e() {
        if (getDrawable() == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        canvas.clipPath(this.f2186n);
        getDrawable().draw(canvas);
        this.f2195w.mo1306a(getContext(), canvas, this.f2186n);
        C1025c c1025c = this.f2183k;
        int i = c1025c.f2206a;
        int i2 = c1025c.f2207b;
        int i3 = this.f2192t;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, i, i2, i3, i3);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: f */
    private void m1301f() {
        if (Math.abs(this.f2184l.f2206a - this.f2183k.f2206a) >= 20 || Math.abs(this.f2184l.f2207b - this.f2183k.f2207b) >= 20) {
            this.f2182j = 6;
            postInvalidate();
            return;
        }
        this.f2182j = 5;
        postInvalidate();
        InterfaceC1022a interfaceC1022a = this.f2194v;
        if (interfaceC1022a != null) {
            interfaceC1022a.mo1260a();
        }
    }

    public void callback(InterfaceC1022a interfaceC1022a) {
        this.f2194v = interfaceC1022a;
    }

    public void down(int i) {
        this.f2190r = System.currentTimeMillis();
        this.f2182j = 1;
        C1025c c1025c = this.f2184l;
        int width = getWidth() - this.f2192t;
        c1025c.f2206a = (int) (((i / 100.0f) * (width - (r2 * 2))) + this.f2184l.f2208c);
        postInvalidate();
    }

    public void loose() {
        this.f2182j = 3;
        this.f2191s = System.currentTimeMillis();
        if (Math.abs(this.f2184l.f2206a - this.f2183k.f2206a) >= 20 || Math.abs(this.f2184l.f2207b - this.f2183k.f2207b) >= 20) {
            this.f2182j = 6;
            postInvalidate();
        } else {
            this.f2182j = 5;
            postInvalidate();
            InterfaceC1022a interfaceC1022a = this.f2194v;
            if (interfaceC1022a != null) {
                interfaceC1022a.mo1260a();
            }
        }
        postInvalidate();
    }

    public void move(int i) {
        if (this.f2197y != i) {
            this.f2197y = i;
            this.f2182j = 2;
            C1025c c1025c = this.f2184l;
            int width = getWidth() - this.f2192t;
            c1025c.f2206a = (int) (((i / 100.0f) * (width - (r2 * 2))) + this.f2184l.f2208c);
            postInvalidate();
        }
    }

    @Override // com.anythink.core.common.p071ui.component.RoundImageView, com.anythink.core.common.res.image.RecycleImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapCreateBitmap;
        if (getDrawable() != null && getWidth() > 0 && getHeight() >= 0) {
            if (this.f2183k == null) {
                this.f2183k = this.f2195w.mo1305a(getWidth(), getHeight(), this.f2192t);
                this.f2184l = this.f2195w.mo1308b(getWidth(), getHeight(), this.f2192t);
            }
            if (this.f2186n == null) {
                Path pathMo1304a = this.f2195w.mo1304a(this.f2192t);
                this.f2186n = pathMo1304a;
                C1025c c1025c = this.f2183k;
                pathMo1304a.offset(c1025c.f2206a, c1025c.f2207b);
            }
            if (this.f2185m == null) {
                if (getDrawable() != null) {
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    getDrawable().setBounds(0, 0, getWidth(), getHeight());
                    canvas2.clipPath(this.f2186n);
                    getDrawable().draw(canvas2);
                    this.f2195w.mo1306a(getContext(), canvas2, this.f2186n);
                    C1025c c1025c2 = this.f2183k;
                    int i = c1025c2.f2206a;
                    int i2 = c1025c2.f2207b;
                    int i3 = this.f2192t;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap2, i, i2, i3, i3);
                    bitmapCreateBitmap2.recycle();
                } else {
                    bitmapCreateBitmap = null;
                }
                this.f2185m = bitmapCreateBitmap;
            }
        }
        if (getDrawable() == null) {
            return;
        }
        if (this.f2182j != 5) {
            canvas.drawPath(this.f2186n, this.f2188p);
            C1025c c1025c3 = this.f2183k;
            int i4 = c1025c3.f2206a;
            int i5 = c1025c3.f2207b;
            int i6 = this.f2192t;
            canvas.drawRect(i4, i5, i4 + i6, i5 + i6, this.f2189q);
        }
        int i7 = this.f2182j;
        if (i7 == 2 || i7 == 4 || i7 == 1 || i7 == 6) {
            Bitmap bitmap = this.f2185m;
            C1025c c1025c4 = this.f2184l;
            canvas.drawBitmap(bitmap, c1025c4.f2206a, c1025c4.f2207b, this.f2187o);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f2186n = null;
        this.f2184l = null;
        this.f2183k = null;
        this.f2185m.recycle();
        this.f2185m = null;
        setImageBitmap(bitmap);
    }

    public void setBlockSize(int i) {
        this.f2192t = i;
        this.f2186n = null;
        this.f2184l = null;
        this.f2183k = null;
        this.f2185m = null;
        postInvalidate();
    }
}
