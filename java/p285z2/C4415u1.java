package p285z2;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: renamed from: z2.u1 */
/* JADX INFO: loaded from: classes.dex */
public class C4415u1 implements InterfaceC4563y1<Drawable> {
    private final int OooO00o;
    private final boolean OooO0O0;
    private C4452v1 OooO0OO;

    /* JADX INFO: renamed from: z2.u1$OooO00o */
    public static class OooO00o {
        private static final int OooO0OO = 300;
        private final int OooO00o;
        private boolean OooO0O0;

        public OooO00o() {
            this(OooO0OO);
        }

        public OooO00o(int i) {
            this.OooO00o = i;
        }

        public C4415u1 OooO00o() {
            return new C4415u1(this.OooO00o, this.OooO0O0);
        }

        public OooO00o OooO0O0(boolean z) {
            this.OooO0O0 = z;
            return this;
        }
    }

    public C4415u1(int i, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = z;
    }

    private InterfaceC4526x1<Drawable> OooO0O0() {
        if (this.OooO0OO == null) {
            this.OooO0OO = new C4452v1(this.OooO00o, this.OooO0O0);
        }
        return this.OooO0OO;
    }

    @Override // p285z2.InterfaceC4563y1
    public InterfaceC4526x1<Drawable> OooO00o(DataSource dataSource, boolean z) {
        return dataSource == DataSource.MEMORY_CACHE ? C4489w1.OooO0O0() : OooO0O0();
    }
}
