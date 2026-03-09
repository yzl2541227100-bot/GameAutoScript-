package p285z2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: z2.jx */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4040jx {

    /* JADX INFO: renamed from: z2.jx$OooO00o */
    public interface OooO00o {
        OooO00o OooO00o(int i, TimeUnit timeUnit);

        int OooO0O0();

        int OooO0OO();

        OooO00o OooO0Oo(int i, TimeUnit timeUnit);

        @Nullable
        InterfaceC4520ww OooO0o();

        C4299qx OooO0o0(C4225ox c4225ox) throws IOException;

        OooO00o OooO0oO(int i, TimeUnit timeUnit);

        int OooO0oo();

        InterfaceC4335rw call();

        C4225ox request();
    }

    C4299qx intercept(OooO00o oooO00o) throws IOException;
}
