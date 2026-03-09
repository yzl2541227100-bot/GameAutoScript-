package p285z2;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: z2.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3898g2 implements o0O0O0Oo {
    private final Object OooO0OO;

    public C3898g2(@NonNull Object obj) {
        this.OooO0OO = C4305r2.OooO0Oo(obj);
    }

    @Override // p285z2.o0O0O0Oo
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.OooO0OO.toString().getBytes(o0O0O0Oo.OooO0O0));
    }

    @Override // p285z2.o0O0O0Oo
    public boolean equals(Object obj) {
        if (obj instanceof C3898g2) {
            return this.OooO0OO.equals(((C3898g2) obj).OooO0OO);
        }
        return false;
    }

    @Override // p285z2.o0O0O0Oo
    public int hashCode() {
        return this.OooO0OO.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.OooO0OO + MessageFormatter.DELIM_STOP;
    }
}
