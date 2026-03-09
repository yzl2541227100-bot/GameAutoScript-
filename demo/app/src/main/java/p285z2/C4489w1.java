package p285z2;

import com.bumptech.glide.load.DataSource;
import p285z2.InterfaceC4526x1;

/* JADX INFO: renamed from: z2.w1 */
/* JADX INFO: loaded from: classes.dex */
public class C4489w1<R> implements InterfaceC4526x1<R> {
    public static final C4489w1<?> OooO00o = new C4489w1<>();
    private static final InterfaceC4563y1<?> OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: z2.w1$OooO00o */
    public static class OooO00o<R> implements InterfaceC4563y1<R> {
        @Override // p285z2.InterfaceC4563y1
        public InterfaceC4526x1<R> OooO00o(DataSource dataSource, boolean z) {
            return C4489w1.OooO00o;
        }
    }

    public static <R> InterfaceC4526x1<R> OooO0O0() {
        return OooO00o;
    }

    public static <R> InterfaceC4563y1<R> OooO0OO() {
        return (InterfaceC4563y1<R>) OooO0O0;
    }

    @Override // p285z2.InterfaceC4526x1
    public boolean OooO00o(Object obj, InterfaceC4526x1.OooO00o oooO00o) {
        return false;
    }
}
