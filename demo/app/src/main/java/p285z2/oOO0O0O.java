package p285z2;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class oOO0O0O<T> implements oO0Ooooo<T> {
    public final T OoooOoO;

    public oOO0O0O(@NonNull T t) {
        this.OoooOoO = (T) C4305r2.OooO0Oo(t);
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    public Class<T> OooO0O0() {
        return (Class<T>) this.OoooOoO.getClass();
    }

    @Override // p285z2.oO0Ooooo
    @NonNull
    public final T get() {
        return this.OoooOoO;
    }

    @Override // p285z2.oO0Ooooo
    public final int getSize() {
        return 1;
    }

    @Override // p285z2.oO0Ooooo
    public void recycle() {
    }
}
