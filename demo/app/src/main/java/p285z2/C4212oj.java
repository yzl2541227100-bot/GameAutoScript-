package p285z2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: z2.oj */
/* JADX INFO: loaded from: classes2.dex */
public class C4212oj<V extends View> extends CoordinatorLayout.Behavior<V> {
    private C4248pj OooO00o;
    private int OooO0O0;
    private int OooO0OO;

    public C4212oj() {
        this.OooO0O0 = 0;
        this.OooO0OO = 0;
    }

    public C4212oj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0O0 = 0;
        this.OooO0OO = 0;
    }

    public int OooO00o() {
        C4248pj c4248pj = this.OooO00o;
        if (c4248pj != null) {
            return c4248pj.OooO0OO();
        }
        return 0;
    }

    public int OooO0O0() {
        C4248pj c4248pj = this.OooO00o;
        if (c4248pj != null) {
            return c4248pj.OooO0Oo();
        }
        return 0;
    }

    public void OooO0OO(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean OooO0Oo(int i) {
        C4248pj c4248pj = this.OooO00o;
        if (c4248pj != null) {
            return c4248pj.OooO0o(i);
        }
        this.OooO0OO = i;
        return false;
    }

    public boolean OooO0o0(int i) {
        C4248pj c4248pj = this.OooO00o;
        if (c4248pj != null) {
            return c4248pj.OooO0oO(i);
        }
        this.OooO0O0 = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        OooO0OO(coordinatorLayout, v, i);
        if (this.OooO00o == null) {
            this.OooO00o = new C4248pj(v);
        }
        this.OooO00o.OooO0o0();
        int i2 = this.OooO0O0;
        if (i2 != 0) {
            this.OooO00o.OooO0oO(i2);
            this.OooO0O0 = 0;
        }
        int i3 = this.OooO0OO;
        if (i3 == 0) {
            return true;
        }
        this.OooO00o.OooO0o(i3);
        this.OooO0OO = 0;
        return true;
    }
}
