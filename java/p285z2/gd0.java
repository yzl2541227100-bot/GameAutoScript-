package p285z2;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class gd0 extends ScheduledThreadPoolExecutor {

    public static final class OooO0O0 {
        private static final gd0 OooO00o = new gd0();

        private OooO0O0() {
        }
    }

    private gd0() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    public static gd0 OooO00o() {
        return OooO0O0.OooO00o;
    }
}
