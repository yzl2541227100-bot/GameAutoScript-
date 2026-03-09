package p285z2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: z2.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3711b0 implements InterfaceC3785d0<Drawable, byte[]> {
    private final oO000o00 OooO00o;
    private final InterfaceC3785d0<Bitmap, byte[]> OooO0O0;
    private final InterfaceC3785d0<C4302r, byte[]> OooO0OO;

    public C3711b0(@NonNull oO000o00 oo000o00, @NonNull InterfaceC3785d0<Bitmap, byte[]> interfaceC3785d0, @NonNull InterfaceC3785d0<C4302r, byte[]> interfaceC3785d02) {
        this.OooO00o = oo000o00;
        this.OooO0O0 = interfaceC3785d0;
        this.OooO0OO = interfaceC3785d02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    private static oO0Ooooo<C4302r> OooO0O0(@NonNull oO0Ooooo<Drawable> oo0ooooo) {
        return oo0ooooo;
    }

    @Override // p285z2.InterfaceC3785d0
    @Nullable
    public oO0Ooooo<byte[]> OooO00o(@NonNull oO0Ooooo<Drawable> oo0ooooo, @NonNull o0O0OOO0 o0o0ooo0) {
        Drawable drawable = oo0ooooo.get();
        if (drawable instanceof BitmapDrawable) {
            return this.OooO0O0.OooO00o(oOO.OooO0Oo(((BitmapDrawable) drawable).getBitmap(), this.OooO00o), o0o0ooo0);
        }
        if (drawable instanceof C4302r) {
            return this.OooO0OO.OooO00o(OooO0O0(oo0ooooo), o0o0ooo0);
        }
        return null;
    }
}
