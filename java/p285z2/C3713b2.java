package p285z2;

import android.view.View;
import p285z2.InterfaceC4526x1;

/* JADX INFO: renamed from: z2.b2 */
/* JADX INFO: loaded from: classes.dex */
public class C3713b2<R> implements InterfaceC4526x1<R> {
    private final OooO00o OooO00o;

    /* JADX INFO: renamed from: z2.b2$OooO00o */
    public interface OooO00o {
        void OooO00o(View view);
    }

    public C3713b2(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // p285z2.InterfaceC4526x1
    public boolean OooO00o(R r, InterfaceC4526x1.OooO00o oooO00o) {
        if (oooO00o.getView() == null) {
            return false;
        }
        this.OooO00o.OooO00o(oooO00o.getView());
        return false;
    }
}
