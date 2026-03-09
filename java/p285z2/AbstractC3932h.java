package p285z2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: z2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3932h<T extends Drawable> implements oO0Ooooo<T>, oO0000o0 {
    public final T OoooOoO;

    public AbstractC3932h(T t) {
        this.OoooOoO = (T) C4305r2.OooO0Oo(t);
    }

    @Override // p285z2.oO0000o0
    public void OooO00o() {
        Bitmap bitmapOooO0o0;
        T t = this.OoooOoO;
        if (t instanceof BitmapDrawable) {
            bitmapOooO0o0 = ((BitmapDrawable) t).getBitmap();
        } else if (!(t instanceof C4302r)) {
            return;
        } else {
            bitmapOooO0o0 = ((C4302r) t).OooO0o0();
        }
        bitmapOooO0o0.prepareToDraw();
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.OoooOoO.getConstantState();
        return constantState == null ? this.OoooOoO : (T) constantState.newDrawable();
    }
}
