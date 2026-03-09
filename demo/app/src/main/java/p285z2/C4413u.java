package p285z2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: renamed from: z2.u */
/* JADX INFO: loaded from: classes.dex */
public class C4413u implements o0O0o000<C4302r> {
    private final o0O0o000<Bitmap> OooO0OO;

    public C4413u(o0O0o000<Bitmap> o0o0o000) {
        this.OooO0OO = (o0O0o000) C4305r2.OooO0Oo(o0o0o000);
    }

    @Override // p285z2.o0O0O0Oo
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        this.OooO0OO.OooO00o(messageDigest);
    }

    @Override // p285z2.o0O0o000
    @NonNull
    public oO0Ooooo<C4302r> OooO0O0(@NonNull Context context, @NonNull oO0Ooooo<C4302r> oo0ooooo, int i, int i2) {
        C4302r c4302r = oo0ooooo.get();
        oO0Ooooo<Bitmap> ooo = new oOO(c4302r.OooO0o0(), o00Oo00.OooO0Oo(context).OooO0oO());
        oO0Ooooo<Bitmap> oo0oooooOooO0O0 = this.OooO0OO.OooO0O0(context, ooo, i, i2);
        if (!ooo.equals(oo0oooooOooO0O0)) {
            ooo.recycle();
        }
        c4302r.OooOOOO(this.OooO0OO, oo0oooooOooO0O0.get());
        return oo0ooooo;
    }

    @Override // p285z2.o0O0O0Oo
    public boolean equals(Object obj) {
        if (obj instanceof C4413u) {
            return this.OooO0OO.equals(((C4413u) obj).OooO0OO);
        }
        return false;
    }

    @Override // p285z2.o0O0O0Oo
    public int hashCode() {
        return this.OooO0OO.hashCode();
    }
}
