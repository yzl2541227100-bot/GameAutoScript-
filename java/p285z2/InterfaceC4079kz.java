package p285z2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: renamed from: z2.kz */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4079kz {
    public static final InterfaceC4079kz OooO00o = new OooO00o();

    /* JADX INFO: renamed from: z2.kz$OooO00o */
    public class OooO00o implements InterfaceC4079kz {
        @Override // p285z2.InterfaceC4079kz
        public boolean OooO00o(int i, List<C3746bz> list) {
            return true;
        }

        @Override // p285z2.InterfaceC4079kz
        public boolean OooO0O0(int i, List<C3746bz> list, boolean z) {
            return true;
        }

        @Override // p285z2.InterfaceC4079kz
        public void OooO0OO(int i, ErrorCode errorCode) {
        }

        @Override // p285z2.InterfaceC4079kz
        public boolean OooO0Oo(int i, j00 j00Var, int i2, boolean z) throws IOException {
            j00Var.skip(i2);
            return true;
        }
    }

    boolean OooO00o(int i, List<C3746bz> list);

    boolean OooO0O0(int i, List<C3746bz> list, boolean z);

    void OooO0OO(int i, ErrorCode errorCode);

    boolean OooO0Oo(int i, j00 j00Var, int i2, boolean z) throws IOException;
}
