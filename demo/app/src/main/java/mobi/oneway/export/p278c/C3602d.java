package mobi.oneway.export.p278c;

import androidx.annotation.NonNull;
import java.lang.Thread;

/* JADX INFO: renamed from: mobi.oneway.export.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3602d implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    private Thread.UncaughtExceptionHandler f19661a = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: b */
    private C3599a f19662b;

    public C3602d(C3599a c3599a) {
        this.f19662b = c3599a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        this.f19662b.m16722a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f19661a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
