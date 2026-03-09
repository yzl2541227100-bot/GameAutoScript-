package p285z2;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import p285z2.InterfaceC4526x1;

/* JADX INFO: renamed from: z2.c2 */
/* JADX INFO: loaded from: classes.dex */
public class C3750c2<R> implements InterfaceC4526x1<R> {
    private final OooO00o OooO00o;

    /* JADX INFO: renamed from: z2.c2$OooO00o */
    public interface OooO00o {
        Animation OooO00o(Context context);
    }

    public C3750c2(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // p285z2.InterfaceC4526x1
    public boolean OooO00o(R r, InterfaceC4526x1.OooO00o oooO00o) {
        View view = oooO00o.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.OooO00o.OooO00o(view.getContext()));
        return false;
    }
}
