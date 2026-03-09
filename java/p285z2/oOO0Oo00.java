package p285z2;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class oOO0Oo00 extends AbstractC3932h<BitmapDrawable> implements oO0000o0 {
    private final oO000o00 OoooOoo;

    public oOO0Oo00(BitmapDrawable bitmapDrawable, oO000o00 oo000o00) {
        super(bitmapDrawable);
        this.OoooOoo = oo000o00;
    }

    @Override // p285z2.AbstractC3932h, p285z2.oO0000o0
    public void OooO00o() {
        ((BitmapDrawable) this.OoooOoO).getBitmap().prepareToDraw();
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    public Class<BitmapDrawable> OooO0O0() {
        return BitmapDrawable.class;
    }

    @Override // p285z2.oO0Ooooo
    public int getSize() {
        return C4379t2.OooO0oo(((BitmapDrawable) this.OoooOoO).getBitmap());
    }

    @Override // p285z2.oO0Ooooo
    public void recycle() {
        this.OoooOoo.OooO0Oo(((BitmapDrawable) this.OoooOoO).getBitmap());
    }
}
