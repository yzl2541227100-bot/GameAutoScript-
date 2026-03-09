package p285z2;

import java.util.concurrent.TimeUnit;
import p285z2.C4151mx;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: z2.zd */
/* JADX INFO: loaded from: classes2.dex */
public class C4612zd {
    private Retrofit OooO00o;

    /* JADX INFO: renamed from: z2.zd$OooO0O0 */
    public static class OooO0O0 {
        private static final C4612zd OooO00o = new C4612zd();

        private OooO0O0() {
        }
    }

    private C4612zd() {
        this.OooO00o = new Retrofit.Builder().client(OooO00o()).baseUrl("").addCallAdapterFactory(C4296qu.OooO00o()).build();
    }

    private C4151mx OooO00o() {
        C4151mx.OooO0O0 oooO0O0 = new C4151mx.OooO0O0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oooO0O0.OooO(60L, timeUnit);
        oooO0O0.Oooo0O0(60L, timeUnit);
        oooO0O0.OooOoo(60L, timeUnit);
        oooO0O0.OooOooo(true);
        return oooO0O0.OooO0Oo();
    }

    public static C4612zd OooO0O0() {
        return OooO0O0.OooO00o;
    }

    public Retrofit OooO0OO() {
        return this.OooO00o;
    }
}
