package p285z2;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;
import com.google.android.material.C2754R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: z2.zj */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C4618zj {
    private static final int OooO0Oo = -1;
    private final MaterialCardView OooO00o;
    private int OooO0O0;
    private int OooO0OO;

    public C4618zj(MaterialCardView materialCardView) {
        this.OooO00o = materialCardView;
    }

    private void OooO00o() {
        this.OooO00o.setContentPadding(this.OooO00o.getContentPaddingLeft() + this.OooO0OO, this.OooO00o.getContentPaddingTop() + this.OooO0OO, this.OooO00o.getContentPaddingRight() + this.OooO0OO, this.OooO00o.getContentPaddingBottom() + this.OooO0OO);
    }

    private Drawable OooO0O0() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.OooO00o.getRadius());
        int i = this.OooO0O0;
        if (i != -1) {
            gradientDrawable.setStroke(this.OooO0OO, i);
        }
        return gradientDrawable;
    }

    @ColorInt
    public int OooO0OO() {
        return this.OooO0O0;
    }

    @Dimension
    public int OooO0Oo() {
        return this.OooO0OO;
    }

    public void OooO0o(@ColorInt int i) {
        this.OooO0O0 = i;
        OooO0oo();
    }

    public void OooO0o0(TypedArray typedArray) {
        this.OooO0O0 = typedArray.getColor(C2754R.styleable.MaterialCardView_strokeColor, -1);
        this.OooO0OO = typedArray.getDimensionPixelSize(C2754R.styleable.MaterialCardView_strokeWidth, 0);
        OooO0oo();
        OooO00o();
    }

    public void OooO0oO(@Dimension int i) {
        this.OooO0OO = i;
        OooO0oo();
        OooO00o();
    }

    public void OooO0oo() {
        this.OooO00o.setForeground(OooO0O0());
    }
}
