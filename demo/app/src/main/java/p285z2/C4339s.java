package p285z2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: z2.s */
/* JADX INFO: loaded from: classes.dex */
public class C4339s implements oo0OOoo<C4302r> {
    private static final String OooO00o = "GifEncoder";

    @Override // p285z2.oo0OOoo
    @NonNull
    public EncodeStrategy OooO0O0(@NonNull o0O0OOO0 o0o0ooo0) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p285z2.o0oO0O0o
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public boolean OooO00o(@NonNull oO0Ooooo<C4302r> oo0ooooo, @NonNull File file, @NonNull o0O0OOO0 o0o0ooo0) throws Throwable {
        try {
            C3935h2.OooO0o0(oo0ooooo.get().OooO0OO(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(OooO00o, 5)) {
                Log.w(OooO00o, "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
