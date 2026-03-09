package p285z2;

import java.util.Objects;
import retrofit2.Response;

/* JADX INFO: renamed from: z2.nu */
/* JADX INFO: loaded from: classes2.dex */
public final class C4185nu<T> {
    private final Response<T> OooO00o;
    private final Throwable OooO0O0;

    private C4185nu(Response<T> response, Throwable th) {
        this.OooO00o = response;
        this.OooO0O0 = th;
    }

    public static <T> C4185nu<T> OooO00o(Throwable th) {
        Objects.requireNonNull(th, "error == null");
        return new C4185nu<>(null, th);
    }

    public static <T> C4185nu<T> OooO0Oo(Response<T> response) {
        Objects.requireNonNull(response, "response == null");
        return new C4185nu<>(response, null);
    }

    public Throwable OooO0O0() {
        return this.OooO0O0;
    }

    public boolean OooO0OO() {
        return this.OooO0O0 != null;
    }

    public Response<T> OooO0o0() {
        return this.OooO00o;
    }
}
