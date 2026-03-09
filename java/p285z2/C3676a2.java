package p285z2;

import com.bumptech.glide.load.DataSource;
import p285z2.C3713b2;

/* JADX INFO: renamed from: z2.a2 */
/* JADX INFO: loaded from: classes.dex */
public class C3676a2<R> implements InterfaceC4563y1<R> {
    private final C3713b2.OooO00o OooO00o;
    private C3713b2<R> OooO0O0;

    public C3676a2(C3713b2.OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // p285z2.InterfaceC4563y1
    public InterfaceC4526x1<R> OooO00o(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE || !z) {
            return C4489w1.OooO0O0();
        }
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C3713b2<>(this.OooO00o);
        }
        return this.OooO0O0;
    }
}
