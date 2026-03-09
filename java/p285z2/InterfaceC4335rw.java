package p285z2;

import java.io.IOException;

/* JADX INFO: renamed from: z2.rw */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4335rw extends Cloneable {

    /* JADX INFO: renamed from: z2.rw$OooO00o */
    public interface OooO00o {
        InterfaceC4335rw OooO00o(C4225ox c4225ox);
    }

    void OooOO0(InterfaceC4372sw interfaceC4372sw);

    void cancel();

    /* JADX INFO: renamed from: clone */
    InterfaceC4335rw mo17070clone();

    C4299qx execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C4225ox request();

    d10 timeout();
}
