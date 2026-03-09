package p285z2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes.dex */
public class ooooO0O0 implements oo0OOoo<Bitmap> {
    public static final o0O0OO0<Integer> OooO0O0 = o0O0OO0.OooO0oO("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final o0O0OO0<Bitmap.CompressFormat> OooO0OO = o0O0OO0.OooO0o("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private static final String OooO0Oo = "BitmapEncoder";

    @Nullable
    private final oO0OOo0o OooO00o;

    @Deprecated
    public ooooO0O0() {
        this.OooO00o = null;
    }

    public ooooO0O0(@NonNull oO0OOo0o oo0ooo0o) {
        this.OooO00o = oo0ooo0o;
    }

    private Bitmap.CompressFormat OooO0Oo(Bitmap bitmap, o0O0OOO0 o0o0ooo0) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) o0o0ooo0.OooO0OO(OooO0OO);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // p285z2.oo0OOoo
    @NonNull
    public EncodeStrategy OooO0O0(@NonNull o0O0OOO0 o0o0ooo0) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #2 {all -> 0x00c0, blocks: (B:3:0x0021, B:13:0x004d, B:29:0x006a, B:31:0x0070, B:35:0x00bc, B:36:0x00bf), top: B:46:0x0021 }] */
    @Override // p285z2.o0oO0O0o
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO00o(@androidx.annotation.NonNull p285z2.oO0Ooooo<android.graphics.Bitmap> r9, @androidx.annotation.NonNull java.io.File r10, @androidx.annotation.NonNull p285z2.o0O0OOO0 r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.OooO0Oo(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p285z2.C4490w2.OooO0Oo(r4, r2, r3, r1)
            long r2 = p285z2.C4157n2.OooO0O0()     // Catch: java.lang.Throwable -> Lc0
            z2.o0O0OO0<java.lang.Integer> r4 = p285z2.ooooO0O0.OooO0O0     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r4 = r11.OooO0OO(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc0
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            z2.oO0OOo0o r10 = r8.OooO00o     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r10 == 0) goto L45
            z2.o0oOo0O0 r10 = new z2.o0oOo0O0     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            z2.oO0OOo0o r6 = r8.OooO00o     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r6 = r10
            goto L46
        L45:
            r6 = r7
        L46:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r6.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5 = 1
        L4d:
            r6.close()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> Lc0
            goto L69
        L51:
            r9 = move-exception
            r6 = r7
            goto Lba
        L54:
            r10 = move-exception
            r6 = r7
            goto L5a
        L57:
            r9 = move-exception
            goto Lba
        L59:
            r10 = move-exception
        L5a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L66
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L57
        L66:
            if (r6 == 0) goto L69
            goto L4d
        L69:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc0
            if (r10 == 0) goto Lb6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r10.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            int r1 = p285z2.C4379t2.OooO0oo(r9)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            double r1 = p285z2.C4157n2.OooO00o(r2)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            z2.o0O0OO0<android.graphics.Bitmap$CompressFormat> r1 = p285z2.ooooO0O0.OooO0OO     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r11 = r11.OooO0OO(r1)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc0
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc0
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc0
        Lb6:
            p285z2.C4490w2.OooO0o0()
            return r5
        Lba:
            if (r6 == 0) goto Lbf
            r6.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Lc0
        Lbf:
            throw r9     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r9 = move-exception
            p285z2.C4490w2.OooO0o0()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.ooooO0O0.OooO00o(z2.oO0Ooooo, java.io.File, z2.o0O0OOO0):boolean");
    }
}
