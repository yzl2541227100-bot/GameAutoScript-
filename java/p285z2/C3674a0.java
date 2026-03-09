package p285z2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: z2.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C3674a0 implements InterfaceC3785d0<Bitmap, BitmapDrawable> {
    private final Resources OooO00o;

    public C3674a0(@NonNull Context context) {
        this(context.getResources());
    }

    public C3674a0(@NonNull Resources resources) {
        this.OooO00o = (Resources) C4305r2.OooO0Oo(resources);
    }

    @Deprecated
    public C3674a0(@NonNull Resources resources, oO000o00 oo000o00) {
        this(resources);
    }

    @Override // p285z2.InterfaceC3785d0
    @Nullable
    public oO0Ooooo<BitmapDrawable> OooO00o(@NonNull oO0Ooooo<Bitmap> oo0ooooo, @NonNull o0O0OOO0 o0o0ooo0) {
        return oo00.OooO0Oo(this.OooO00o, oo0ooooo);
    }
}
