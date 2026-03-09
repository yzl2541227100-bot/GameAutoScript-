package com.anythink.expressad.foundation.p138h;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.anythink.core.common.p051b.C1175n;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.h.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1880n {
    /* JADX INFO: renamed from: a */
    public static Bitmap m9755a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            if (bitmap.isRecycled()) {
                return null;
            }
            int width = bitmap.getWidth();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawCircle(width / 2, width / 2, width / 2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m9756a(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = null;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, width, height);
            RectF rectF = new RectF(rect);
            float f = i;
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return bitmapCreateBitmap;
        } catch (Error | Exception unused) {
            return bitmapCreateBitmap;
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    private static Bitmap m9757b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                    RenderScript renderScriptCreate = RenderScript.create(C1175n.m2059a().m2148f());
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(25.0f);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    renderScriptCreate.destroy();
                    return bitmapCreateBitmap;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
