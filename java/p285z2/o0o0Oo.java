package p285z2;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.cyjh.elfin.base.glidemodule.CustomGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo extends o00OOO0O {
    private final CustomGlideModule OooO00o = new CustomGlideModule();

    public o0o0Oo() {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.cyjh.elfin.base.glidemodule.CustomGlideModule");
        }
    }

    @Override // p285z2.AbstractC4488w0, p285z2.InterfaceC4525x0
    public void OooO00o(@NonNull Context context, @NonNull o0oOO o0ooo) {
        this.OooO00o.OooO00o(context, o0ooo);
    }

    @Override // p285z2.AbstractC4599z0, p285z2.InterfaceC3712b1
    public void OooO0O0(@NonNull Context context, @NonNull o00Oo00 o00oo00, @NonNull Registry registry) {
        this.OooO00o.OooO0O0(context, o00oo00, registry);
    }

    @Override // p285z2.AbstractC4488w0
    public boolean OooO0OO() {
        return this.OooO00o.OooO0OO();
    }

    @Override // p285z2.o00OOO0O
    @NonNull
    public Set<Class<?>> OooO0Oo() {
        return Collections.emptySet();
    }

    @Override // p285z2.o00OOO0O
    @NonNull
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public o00OOOO0 OooO0o0() {
        return new o00OOOO0();
    }
}
