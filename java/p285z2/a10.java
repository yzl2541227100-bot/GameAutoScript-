package p285z2;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a10 {
    public static final long OooO00o = 65536;

    @Nullable
    public static z00 OooO0O0;
    public static long OooO0OO;

    private a10() {
    }

    public static void OooO00o(z00 z00Var) {
        if (z00Var.OooO0o != null || z00Var.OooO0oO != null) {
            throw new IllegalArgumentException();
        }
        if (z00Var.OooO0Oo) {
            return;
        }
        synchronized (a10.class) {
            long j = OooO0OO;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                return;
            }
            OooO0OO = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            z00Var.OooO0o = OooO0O0;
            z00Var.OooO0OO = 0;
            z00Var.OooO0O0 = 0;
            OooO0O0 = z00Var;
        }
    }

    public static z00 OooO0O0() {
        synchronized (a10.class) {
            z00 z00Var = OooO0O0;
            if (z00Var == null) {
                return new z00();
            }
            OooO0O0 = z00Var.OooO0o;
            z00Var.OooO0o = null;
            OooO0OO -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return z00Var;
        }
    }
}
