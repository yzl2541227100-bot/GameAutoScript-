package p285z2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: z2.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4083l2 {
    private static final Executor OooO00o = new OooO00o();
    private static final Executor OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: z2.l2$OooO00o */
    public class OooO00o implements Executor {
        private final Handler OooO00o = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.OooO00o.post(runnable);
        }
    }

    /* JADX INFO: renamed from: z2.l2$OooO0O0 */
    public class OooO0O0 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    private C4083l2() {
    }

    public static Executor OooO00o() {
        return OooO0O0;
    }

    public static Executor OooO0O0() {
        return OooO00o;
    }

    @VisibleForTesting
    public static void OooO0OO(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
