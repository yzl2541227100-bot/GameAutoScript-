package p285z2;

import java.lang.Thread;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pd0 implements Runnable {
    public final cd0 OoooOoO;

    public pd0(cd0 cd0Var) {
        this.OoooOoO = cd0Var;
    }

    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.OoooOoO.OooOo0O()) {
                return;
            }
            OooO00o();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
