package p285z2;

import android.content.Context;
import android.os.Handler;
import android.os.Vibrator;
import com.cyjh.elfin.base.AppContext;
import p285z2.C4531x6;

/* JADX INFO: renamed from: z2.d7 */
/* JADX INFO: loaded from: classes.dex */
public class C3792d7 {
    private static C3792d7 OooO0O0;
    public Vibrator OooO00o;

    /* JADX INFO: renamed from: z2.d7$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ Vibrator OoooOoO;
        public final /* synthetic */ C4531x6 OoooOoo;

        public OooO00o(Vibrator vibrator, C4531x6 c4531x6) {
            this.OoooOoO = vibrator;
            this.OoooOoo = c4531x6;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.OoooOoO.cancel();
            this.OoooOoo.OooO0O0();
        }
    }

    public static C3792d7 OooO00o() {
        if (OooO0O0 == null) {
            synchronized (C3792d7.class) {
                if (OooO0O0 == null) {
                    OooO0O0 = new C3792d7();
                }
            }
        }
        return OooO0O0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void OooO0Oo(Vibrator vibrator, C4531x6 c4531x6) {
        if (!C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOO0, Boolean.TRUE) || vibrator == null) {
            return;
        }
        C3977i7.OooO().Oooo0o0();
        c4531x6.OooO0OO();
        if (C3977i7.OooO().OooOOO()) {
            vibrator.vibrate(new long[]{500, 200, 500, 200}, -1);
            new Handler().postDelayed(new OooO00o(vibrator, c4531x6), 1500L);
        }
    }

    public void OooO0O0(Context context) {
        final Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        final C4531x6 c4531x6 = new C4531x6(AppContext.OooO00o());
        c4531x6.OooO00o(new C4531x6.OooO00o() { // from class: z2.y6
            @Override // p285z2.C4531x6.OooO00o
            public final void onShake() {
                this.OooO00o.OooO0Oo(vibrator, c4531x6);
            }
        });
    }

    public void OooO0o0() {
        Vibrator vibrator = (Vibrator) AppContext.OooO00o().getSystemService("vibrator");
        if (C4529x4.OooO0O0().OooO00o(InterfaceC3865f6.OooOOOO, Boolean.TRUE)) {
            vibrator.vibrate(1000L);
        }
    }
}
