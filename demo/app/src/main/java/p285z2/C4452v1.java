package p285z2;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p285z2.InterfaceC4526x1;

/* JADX INFO: renamed from: z2.v1 */
/* JADX INFO: loaded from: classes.dex */
public class C4452v1 implements InterfaceC4526x1<Drawable> {
    private final int OooO00o;
    private final boolean OooO0O0;

    public C4452v1(int i, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = z;
    }

    @Override // p285z2.InterfaceC4526x1
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public boolean OooO00o(Drawable drawable, InterfaceC4526x1.OooO00o oooO00o) {
        Drawable currentDrawable = oooO00o.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(this.OooO0O0);
        transitionDrawable.startTransition(this.OooO00o);
        oooO00o.setDrawable(transitionDrawable);
        return true;
    }
}
