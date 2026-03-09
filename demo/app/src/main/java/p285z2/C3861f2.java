package p285z2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: z2.f2 */
/* JADX INFO: loaded from: classes.dex */
public class C3861f2 implements o0O0O0Oo {

    @NonNull
    private final String OooO0OO;
    private final long OooO0Oo;
    private final int OooO0o0;

    public C3861f2(@Nullable String str, long j, int i) {
        this.OooO0OO = str == null ? "" : str;
        this.OooO0Oo = j;
        this.OooO0o0 = i;
    }

    @Override // p285z2.o0O0O0Oo
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.OooO0Oo).putInt(this.OooO0o0).array());
        messageDigest.update(this.OooO0OO.getBytes(o0O0O0Oo.OooO0O0));
    }

    @Override // p285z2.o0O0O0Oo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3861f2 c3861f2 = (C3861f2) obj;
        return this.OooO0Oo == c3861f2.OooO0Oo && this.OooO0o0 == c3861f2.OooO0o0 && this.OooO0OO.equals(c3861f2.OooO0OO);
    }

    @Override // p285z2.o0O0O0Oo
    public int hashCode() {
        int iHashCode = this.OooO0OO.hashCode() * 31;
        long j = this.OooO0Oo;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.OooO0o0;
    }
}
