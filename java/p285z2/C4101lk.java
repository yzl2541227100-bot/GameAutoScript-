package p285z2;

import android.graphics.Outline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: z2.lk */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C4101lk extends C4064kk {
    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        copyBounds(this.OooO0O0);
        outline.setOval(this.OooO0O0);
    }
}
