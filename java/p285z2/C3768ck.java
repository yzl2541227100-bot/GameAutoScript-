package p285z2;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p285z2.InterfaceC3805dk;

/* JADX INFO: renamed from: z2.ck */
/* JADX INFO: loaded from: classes2.dex */
public class C3768ck {
    private static final boolean OooOO0O = false;
    public static final int OooOO0o = 0;
    public static final int OooOOO = 2;
    public static final int OooOOO0 = 1;
    public static final int OooOOOO;
    private boolean OooO;
    private final OooO00o OooO00o;
    private final View OooO0O0;
    private final Path OooO0OO;
    private final Paint OooO0Oo;

    @Nullable
    private InterfaceC3805dk.OooO OooO0o;
    private final Paint OooO0o0;

    @Nullable
    private Drawable OooO0oO;
    private Paint OooO0oo;
    private boolean OooOO0;

    /* JADX INFO: renamed from: z2.ck$OooO00o */
    public interface OooO00o {
        void OooO0OO(Canvas canvas);

        boolean OooO0Oo();
    }

    /* JADX INFO: renamed from: z2.ck$OooO0O0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface OooO0O0 {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        OooOOOO = i >= 21 ? 2 : i >= 18 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3768ck(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
        View view = (View) oooO00o;
        this.OooO0O0 = view;
        view.setWillNotDraw(false);
        this.OooO0OO = new Path();
        this.OooO0Oo = new Paint(7);
        Paint paint = new Paint(1);
        this.OooO0o0 = paint;
        paint.setColor(0);
    }

    private float OooO(InterfaceC3805dk.OooO oooO) {
        return C4582yk.OooO0O0(oooO.OooO00o, oooO.OooO0O0, 0.0f, 0.0f, this.OooO0O0.getWidth(), this.OooO0O0.getHeight());
    }

    private void OooO0Oo(Canvas canvas, int i, float f) {
        this.OooO0oo.setColor(i);
        this.OooO0oo.setStrokeWidth(f);
        InterfaceC3805dk.OooO oooO = this.OooO0o;
        canvas.drawCircle(oooO.OooO00o, oooO.OooO0O0, oooO.OooO0OO - (f / 2.0f), this.OooO0oo);
    }

    private void OooO0o(Canvas canvas) {
        if (OooOOo0()) {
            Rect bounds = this.OooO0oO.getBounds();
            float fWidth = this.OooO0o.OooO00o - (bounds.width() / 2.0f);
            float fHeight = this.OooO0o.OooO0O0 - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.OooO0oO.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private void OooO0o0(Canvas canvas) {
        this.OooO00o.OooO0OO(canvas);
        if (OooOOo()) {
            InterfaceC3805dk.OooO oooO = this.OooO0o;
            canvas.drawCircle(oooO.OooO00o, oooO.OooO0O0, oooO.OooO0OO, this.OooO0o0);
        }
        if (OooOOOo()) {
            OooO0Oo(canvas, -16777216, 10.0f);
            OooO0Oo(canvas, -65536, 5.0f);
        }
        OooO0o(canvas);
    }

    private void OooOO0O() {
        if (OooOOOO == 1) {
            this.OooO0OO.rewind();
            InterfaceC3805dk.OooO oooO = this.OooO0o;
            if (oooO != null) {
                this.OooO0OO.addCircle(oooO.OooO00o, oooO.OooO0O0, oooO.OooO0OO, Path.Direction.CW);
            }
        }
        this.OooO0O0.invalidate();
    }

    private boolean OooOOOo() {
        InterfaceC3805dk.OooO oooO = this.OooO0o;
        boolean z = oooO == null || oooO.OooO00o();
        return OooOOOO == 0 ? !z && this.OooOO0 : !z;
    }

    private boolean OooOOo() {
        return (this.OooO || Color.alpha(this.OooO0o0.getColor()) == 0) ? false : true;
    }

    private boolean OooOOo0() {
        return (this.OooO || this.OooO0oO == null || this.OooO0o == null) ? false : true;
    }

    public void OooO00o() {
        if (OooOOOO == 0) {
            this.OooO = true;
            this.OooOO0 = false;
            this.OooO0O0.buildDrawingCache();
            Bitmap drawingCache = this.OooO0O0.getDrawingCache();
            if (drawingCache == null && this.OooO0O0.getWidth() != 0 && this.OooO0O0.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.OooO0O0.getWidth(), this.OooO0O0.getHeight(), Bitmap.Config.ARGB_8888);
                this.OooO0O0.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.OooO0Oo;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.OooO = false;
            this.OooOO0 = true;
        }
    }

    public void OooO0O0() {
        if (OooOOOO == 0) {
            this.OooOO0 = false;
            this.OooO0O0.destroyDrawingCache();
            this.OooO0Oo.setShader(null);
            this.OooO0O0.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0OO(android.graphics.Canvas r9) {
        /*
            r8 = this;
            boolean r0 = r8.OooOOOo()
            if (r0 == 0) goto L82
            int r0 = p285z2.C3768ck.OooOOOO
            if (r0 == 0) goto L61
            r1 = 1
            if (r0 == r1) goto L33
            r1 = 2
            if (r0 != r1) goto L1c
            z2.ck$OooO00o r0 = r8.OooO00o
            r0.OooO0OO(r9)
            boolean r0 = r8.OooOOo()
            if (r0 == 0) goto La3
            goto L8d
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported strategy "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L33:
            int r0 = r9.save()
            android.graphics.Path r1 = r8.OooO0OO
            r9.clipPath(r1)
            z2.ck$OooO00o r1 = r8.OooO00o
            r1.OooO0OO(r9)
            boolean r1 = r8.OooOOo()
            if (r1 == 0) goto L5d
            r3 = 0
            r4 = 0
            android.view.View r1 = r8.OooO0O0
            int r1 = r1.getWidth()
            float r5 = (float) r1
            android.view.View r1 = r8.OooO0O0
            int r1 = r1.getHeight()
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.OooO0o0
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L5d:
            r9.restoreToCount(r0)
            goto La3
        L61:
            z2.dk$OooO r0 = r8.OooO0o
            float r1 = r0.OooO00o
            float r2 = r0.OooO0O0
            float r0 = r0.OooO0OO
            android.graphics.Paint r3 = r8.OooO0Oo
            r9.drawCircle(r1, r2, r0, r3)
            boolean r0 = r8.OooOOo()
            if (r0 == 0) goto La3
            z2.dk$OooO r0 = r8.OooO0o
            float r1 = r0.OooO00o
            float r2 = r0.OooO0O0
            float r0 = r0.OooO0OO
            android.graphics.Paint r3 = r8.OooO0o0
            r9.drawCircle(r1, r2, r0, r3)
            goto La3
        L82:
            z2.ck$OooO00o r0 = r8.OooO00o
            r0.OooO0OO(r9)
            boolean r0 = r8.OooOOo()
            if (r0 == 0) goto La3
        L8d:
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.OooO0O0
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.OooO0O0
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.OooO0o0
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        La3:
            r8.OooO0o(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C3768ck.OooO0OO(android.graphics.Canvas):void");
    }

    @Nullable
    public Drawable OooO0oO() {
        return this.OooO0oO;
    }

    @ColorInt
    public int OooO0oo() {
        return this.OooO0o0.getColor();
    }

    @Nullable
    public InterfaceC3805dk.OooO OooOO0() {
        InterfaceC3805dk.OooO oooO = this.OooO0o;
        if (oooO == null) {
            return null;
        }
        InterfaceC3805dk.OooO oooO2 = new InterfaceC3805dk.OooO(oooO);
        if (oooO2.OooO00o()) {
            oooO2.OooO0OO = OooO(oooO2);
        }
        return oooO2;
    }

    public boolean OooOO0o() {
        return this.OooO00o.OooO0Oo() && !OooOOOo();
    }

    public void OooOOO(@ColorInt int i) {
        this.OooO0o0.setColor(i);
        this.OooO0O0.invalidate();
    }

    public void OooOOO0(@Nullable Drawable drawable) {
        this.OooO0oO = drawable;
        this.OooO0O0.invalidate();
    }

    public void OooOOOO(@Nullable InterfaceC3805dk.OooO oooO) {
        if (oooO == null) {
            this.OooO0o = null;
        } else {
            InterfaceC3805dk.OooO oooO2 = this.OooO0o;
            if (oooO2 == null) {
                this.OooO0o = new InterfaceC3805dk.OooO(oooO);
            } else {
                oooO2.OooO0OO(oooO);
            }
            if (C4582yk.OooO0OO(oooO.OooO0OO, OooO(oooO), 1.0E-4f)) {
                this.OooO0o.OooO0OO = Float.MAX_VALUE;
            }
        }
        OooOO0O();
    }
}
