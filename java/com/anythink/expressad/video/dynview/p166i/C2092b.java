package com.anythink.expressad.video.dynview.p166i;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.anythink.expressad.C1404a;

/* JADX INFO: renamed from: com.anythink.expressad.video.dynview.i.b */
/* JADX INFO: loaded from: classes.dex */
public class C2092b {

    /* JADX INFO: renamed from: a */
    private static volatile C2092b f13260a;

    /* JADX INFO: renamed from: a */
    private static Bitmap m11186a(int i) {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            bitmapCreateBitmap.eraseColor(i == 1 ? Color.parseColor("#FF0000") : Color.parseColor("#FFFFFF"));
        } catch (Exception e) {
            if (C1404a.f6209a) {
                e.printStackTrace();
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap m11187a(android.graphics.Bitmap r5, int r6) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6b
            r2 = 17
            if (r1 < r2) goto L49
            int r6 = r5.getWidth()     // Catch: java.lang.Throwable -> L6b
            int r1 = r5.getHeight()     // Catch: java.lang.Throwable -> L6b
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.Throwable -> L6b
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r1, r2)     // Catch: java.lang.Throwable -> L6b
            com.anythink.core.common.b.n r1 = com.anythink.core.common.p051b.C1175n.m2059a()     // Catch: java.lang.Throwable -> L6b
            android.content.Context r1 = r1.m2148f()     // Catch: java.lang.Throwable -> L6b
            android.renderscript.RenderScript r1 = android.renderscript.RenderScript.create(r1)     // Catch: java.lang.Throwable -> L6b
            android.renderscript.Element r2 = android.renderscript.Element.U8_4(r1)     // Catch: java.lang.Throwable -> L46
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r1, r2)     // Catch: java.lang.Throwable -> L46
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createFromBitmap(r1, r5)     // Catch: java.lang.Throwable -> L43
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r1, r6)     // Catch: java.lang.Throwable -> L41
            r4 = 1099956224(0x41900000, float:18.0)
            r2.setRadius(r4)     // Catch: java.lang.Throwable -> L6f
            r2.setInput(r5)     // Catch: java.lang.Throwable -> L6f
            r2.forEach(r3)     // Catch: java.lang.Throwable -> L6f
            r3.copyTo(r6)     // Catch: java.lang.Throwable -> L6f
            r0 = r1
            goto L50
        L41:
            r3 = r0
            goto L6f
        L43:
            r5 = r0
            r3 = r5
            goto L6f
        L46:
            r5 = r0
            r2 = r5
            goto L6e
        L49:
            android.graphics.Bitmap r6 = m11186a(r6)     // Catch: java.lang.Throwable -> L6b
            r5 = r0
            r2 = r5
            r3 = r2
        L50:
            if (r0 == 0) goto L57
            r0.destroy()     // Catch: java.lang.Throwable -> L56
            goto L57
        L56:
        L57:
            if (r2 == 0) goto L5e
            r2.destroy()     // Catch: java.lang.Throwable -> L5d
            goto L5e
        L5d:
        L5e:
            if (r5 == 0) goto L65
            r5.destroy()     // Catch: java.lang.Throwable -> L64
            goto L65
        L64:
        L65:
            if (r3 == 0) goto L6a
            r3.destroy()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r6
        L6b:
            r5 = r0
            r1 = r5
            r2 = r1
        L6e:
            r3 = r2
        L6f:
            if (r1 == 0) goto L76
            r1.destroy()     // Catch: java.lang.Throwable -> L75
            goto L76
        L75:
        L76:
            if (r2 == 0) goto L7d
            r2.destroy()     // Catch: java.lang.Throwable -> L7c
            goto L7d
        L7c:
        L7d:
            if (r5 == 0) goto L84
            r5.destroy()     // Catch: java.lang.Throwable -> L83
            goto L84
        L83:
        L84:
            if (r3 == 0) goto L89
            r3.destroy()     // Catch: java.lang.Throwable -> L89
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.dynview.p166i.C2092b.m11187a(android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: a */
    public static C2092b m11188a() {
        if (f13260a == null) {
            synchronized (C2092b.class) {
                if (f13260a == null) {
                    f13260a = new C2092b();
                }
            }
        }
        return f13260a;
    }
}
