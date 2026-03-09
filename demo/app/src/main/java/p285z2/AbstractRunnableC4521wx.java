package p285z2;

/* JADX INFO: renamed from: z2.wx */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC4521wx implements Runnable {
    public final String OoooOoO;

    public AbstractRunnableC4521wx(String str, Object... objArr) {
        this.OoooOoO = C4558xx.OooOOoo(str, objArr);
    }

    public abstract void OooOO0o();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.OoooOoO);
        try {
            OooOO0o();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
