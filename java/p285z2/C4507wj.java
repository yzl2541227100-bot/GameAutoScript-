package p285z2;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: z2.wj */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public class C4507wj extends RippleDrawable {
    public C4507wj(@NonNull ColorStateList colorStateList, @Nullable InsetDrawable insetDrawable, @Nullable Drawable drawable) {
        super(colorStateList, insetDrawable, drawable);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((GradientDrawable) ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0)).setColorFilter(colorFilter);
        }
    }
}
