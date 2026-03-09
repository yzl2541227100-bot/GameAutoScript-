package p285z2;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: z2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4006j extends AbstractC3932h<Drawable> {
    private C4006j(Drawable drawable) {
        super(drawable);
    }

    @Nullable
    public static oO0Ooooo<Drawable> OooO0Oo(@Nullable Drawable drawable) {
        if (drawable != null) {
            return new C4006j(drawable);
        }
        return null;
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    public Class<Drawable> OooO0O0() {
        return this.OoooOoO.getClass();
    }

    @Override // p285z2.oO0Ooooo
    public int getSize() {
        return Math.max(1, this.OoooOoO.getIntrinsicWidth() * this.OoooOoO.getIntrinsicHeight() * 4);
    }

    @Override // p285z2.oO0Ooooo
    public void recycle() {
    }
}
