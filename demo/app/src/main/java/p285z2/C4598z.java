package p285z2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: z2.z */
/* JADX INFO: loaded from: classes.dex */
public class C4598z implements InterfaceC3785d0<Bitmap, byte[]> {
    private final Bitmap.CompressFormat OooO00o;
    private final int OooO0O0;

    public C4598z() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C4598z(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.OooO00o = compressFormat;
        this.OooO0O0 = i;
    }

    @Override // p285z2.InterfaceC3785d0
    @Nullable
    public oO0Ooooo<byte[]> OooO00o(@NonNull oO0Ooooo<Bitmap> oo0ooooo, @NonNull o0O0OOO0 o0o0ooo0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oo0ooooo.get().compress(this.OooO00o, this.OooO0O0, byteArrayOutputStream);
        oo0ooooo.recycle();
        return new C3858f(byteArrayOutputStream.toByteArray());
    }
}
