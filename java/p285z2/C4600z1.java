package p285z2;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import p285z2.C3750c2;

/* JADX INFO: renamed from: z2.z1 */
/* JADX INFO: loaded from: classes.dex */
public class C4600z1<R> implements InterfaceC4563y1<R> {
    private final C3750c2.OooO00o OooO00o;
    private InterfaceC4526x1<R> OooO0O0;

    /* JADX INFO: renamed from: z2.z1$OooO00o */
    public static class OooO00o implements C3750c2.OooO00o {
        private final Animation OooO00o;

        public OooO00o(Animation animation) {
            this.OooO00o = animation;
        }

        @Override // p285z2.C3750c2.OooO00o
        public Animation OooO00o(Context context) {
            return this.OooO00o;
        }
    }

    /* JADX INFO: renamed from: z2.z1$OooO0O0 */
    public static class OooO0O0 implements C3750c2.OooO00o {
        private final int OooO00o;

        public OooO0O0(int i) {
            this.OooO00o = i;
        }

        @Override // p285z2.C3750c2.OooO00o
        public Animation OooO00o(Context context) {
            return AnimationUtils.loadAnimation(context, this.OooO00o);
        }
    }

    public C4600z1(int i) {
        this(new OooO0O0(i));
    }

    public C4600z1(Animation animation) {
        this(new OooO00o(animation));
    }

    public C4600z1(C3750c2.OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // p285z2.InterfaceC4563y1
    public InterfaceC4526x1<R> OooO00o(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return C4489w1.OooO0O0();
        }
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C3750c2(this.OooO00o);
        }
        return this.OooO0O0;
    }
}
