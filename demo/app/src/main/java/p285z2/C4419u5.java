package p285z2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.cyjh.common.util.toast.ThreadUtils;
import java.util.Objects;

/* JADX INFO: renamed from: z2.u5 */
/* JADX INFO: loaded from: classes.dex */
public final class C4419u5 {

    @SuppressLint({"StaticFieldLeak"})
    private static Application OooO00o;

    /* JADX INFO: renamed from: z2.u5$OooO */
    public interface OooO<T> {
        T get();
    }

    /* JADX INFO: renamed from: z2.u5$OooO00o */
    public static class OooO00o {
        public void OooO00o(@NonNull Activity activity) {
        }

        public void OooO0O0(@NonNull Activity activity) {
        }

        public void OooO0OO(@NonNull Activity activity) {
        }

        public void OooO0Oo(@NonNull Activity activity) {
        }

        public void OooO0o(@NonNull Activity activity) {
        }

        public void OooO0o0(@NonNull Activity activity) {
        }

        public void OooO0oO(@NonNull Activity activity, Lifecycle.Event event) {
        }
    }

    /* JADX INFO: renamed from: z2.u5$OooO0O0 */
    public interface OooO0O0<T> {
        void accept(T t);
    }

    /* JADX INFO: renamed from: z2.u5$OooO0OO */
    public interface OooO0OO<Ret, Par> {
        Ret OooO00o(Par par);
    }

    /* JADX INFO: renamed from: z2.u5$OooO0o */
    public interface OooO0o {
        void OooO00o(Activity activity);

        void OooO0O0(Activity activity);
    }

    /* JADX INFO: renamed from: z2.u5$OooOO0 */
    public static abstract class OooOO0<Result> extends ThreadUtils.OooO0o<Result> {
        private OooO0O0<Result> o00Oo0;

        public OooOO0(OooO0O0<Result> oooO0O0) {
            this.o00Oo0 = oooO0O0;
        }

        @Override // com.cyjh.common.util.toast.ThreadUtils.OooOO0
        public void OooOOO0(Result result) {
            OooO0O0<Result> oooO0O0 = this.o00Oo0;
            if (oooO0O0 != null) {
                oooO0O0.accept(result);
            }
        }
    }

    private C4419u5() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Application OooO00o() {
        Application application = OooO00o;
        if (application != null) {
            return application;
        }
        OooO0O0(C4493w5.OooOO0O());
        Objects.requireNonNull(OooO00o, "reflect failed.");
        Log.i("Utils", C4493w5.OooOO0o() + " reflect app success.");
        return OooO00o;
    }

    public static void OooO0O0(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = OooO00o;
        if (application2 == null) {
            OooO00o = application;
            C4493w5.OooOo0o(application);
            C4493w5.OooOooo();
        } else {
            if (application2.equals(application)) {
                return;
            }
            C4493w5.Oooo0o(OooO00o);
            OooO00o = application;
            C4493w5.OooOo0o(application);
        }
    }
}
