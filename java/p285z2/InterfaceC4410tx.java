package p285z2;

import javax.annotation.Nullable;
import okio.ByteString;

/* JADX INFO: renamed from: z2.tx */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4410tx {

    /* JADX INFO: renamed from: z2.tx$OooO00o */
    public interface OooO00o {
        InterfaceC4410tx OooO0O0(C4225ox c4225ox, AbstractC4447ux abstractC4447ux);
    }

    boolean OooO00o(ByteString byteString);

    boolean OooO0O0(String str);

    boolean OooO0o(int i, @Nullable String str);

    long OooO0oO();

    void cancel();

    C4225ox request();
}
