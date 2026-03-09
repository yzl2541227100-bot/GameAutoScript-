package p285z2;

/* JADX INFO: renamed from: z2.vv */
/* JADX INFO: loaded from: classes2.dex */
public class C4482vv extends C4039jw {
    private volatile int OooO0OO;

    /* JADX INFO: renamed from: z2.vv$OooO00o */
    public class OooO00o extends Thread {
        public final /* synthetic */ InterfaceC3854ew OoooOoO;
        public final /* synthetic */ C4002iw OoooOoo;

        public OooO00o(InterfaceC3854ew interfaceC3854ew, C4002iw c4002iw) {
            this.OoooOoO = interfaceC3854ew;
            this.OoooOoo = c4002iw;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.OoooOoO.OooO0O0(this.OoooOoo);
            } finally {
                C4482vv.this.OooOo00();
            }
        }
    }

    public C4482vv() {
    }

    public C4482vv(Class<? extends AbstractC3891fw> cls) {
        super(cls);
    }

    public C4482vv(Class<? extends AbstractC3891fw> cls, String str) {
        super(cls, str);
    }

    public C4482vv(String str) {
        super(str);
    }

    @Override // p285z2.C4039jw, p285z2.InterfaceC3854ew
    public void OooO0O0(C4002iw c4002iw) {
        this.OooO0OO = 0;
        super.OooO0O0(c4002iw);
        OooOo0();
    }

    @Override // p285z2.C4039jw
    public void OooOOO0(InterfaceC3854ew interfaceC3854ew, C4002iw c4002iw) {
        new OooO00o(interfaceC3854ew, c4002iw).start();
    }

    public synchronized void OooOo0() {
        while (this.OooO0OO < OooOOo0()) {
            try {
                wait();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public synchronized void OooOo00() {
        this.OooO0OO++;
        notifyAll();
    }
}
