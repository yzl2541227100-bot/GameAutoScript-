package p285z2;

import androidx.annotation.NonNull;
import p285z2.C3713b2;
import p285z2.o0O00000;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O00000<CHILD extends o0O00000<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    private InterfaceC4563y1<? super TranscodeType> OoooOoO = C4489w1.OooO0OO();

    private CHILD OooO0Oo() {
        return this;
    }

    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public final CHILD OooO0O0() {
        return (CHILD) OooO0o(C4489w1.OooO0OO());
    }

    public final InterfaceC4563y1<? super TranscodeType> OooO0OO() {
        return this.OoooOoO;
    }

    @NonNull
    public final CHILD OooO0o(@NonNull InterfaceC4563y1<? super TranscodeType> interfaceC4563y1) {
        this.OoooOoO = (InterfaceC4563y1) C4305r2.OooO0Oo(interfaceC4563y1);
        return (CHILD) OooO0Oo();
    }

    @NonNull
    public final CHILD OooO0o0(int i) {
        return (CHILD) OooO0o(new C4600z1(i));
    }

    @NonNull
    public final CHILD OooO0oO(@NonNull C3713b2.OooO00o oooO00o) {
        return (CHILD) OooO0o(new C3676a2(oooO00o));
    }
}
