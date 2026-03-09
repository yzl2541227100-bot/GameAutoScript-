package retrofit2;

import javax.annotation.Nullable;
import okhttp3.Protocol;
import p285z2.AbstractC4336rx;
import p285z2.C3966hx;
import p285z2.C4225ox;
import p285z2.C4299qx;

/* JADX INFO: loaded from: classes2.dex */
public final class Response<T> {

    @Nullable
    private final T body;

    @Nullable
    private final AbstractC4336rx errorBody;
    private final C4299qx rawResponse;

    private Response(C4299qx c4299qx, @Nullable T t, @Nullable AbstractC4336rx abstractC4336rx) {
        this.rawResponse = c4299qx;
        this.body = t;
        this.errorBody = abstractC4336rx;
    }

    public static <T> Response<T> error(int i, AbstractC4336rx abstractC4336rx) {
        if (i >= 400) {
            return error(abstractC4336rx, new C4299qx.OooO00o().OooO0oO(i).OooOO0O("Response.error()").OooOOO(Protocol.HTTP_1_1).OooOOo0(new C4225ox.OooO00o().OooOOo0("http://localhost/").OooO0O0()).OooO0OO());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    public static <T> Response<T> error(AbstractC4336rx abstractC4336rx, C4299qx c4299qx) {
        Utils.checkNotNull(abstractC4336rx, "body == null");
        Utils.checkNotNull(c4299qx, "rawResponse == null");
        if (c4299qx.o00o0O()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response<>(c4299qx, null, abstractC4336rx);
    }

    public static <T> Response<T> success(int i, @Nullable T t) {
        if (i >= 200 && i < 300) {
            return success(t, new C4299qx.OooO00o().OooO0oO(i).OooOO0O("Response.success()").OooOOO(Protocol.HTTP_1_1).OooOOo0(new C4225ox.OooO00o().OooOOo0("http://localhost/").OooO0O0()).OooO0OO());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    public static <T> Response<T> success(@Nullable T t) {
        return success(t, new C4299qx.OooO00o().OooO0oO(200).OooOO0O("OK").OooOOO(Protocol.HTTP_1_1).OooOOo0(new C4225ox.OooO00o().OooOOo0("http://localhost/").OooO0O0()).OooO0OO());
    }

    public static <T> Response<T> success(@Nullable T t, C3966hx c3966hx) {
        Utils.checkNotNull(c3966hx, "headers == null");
        return success(t, new C4299qx.OooO00o().OooO0oO(200).OooOO0O("OK").OooOOO(Protocol.HTTP_1_1).OooOO0(c3966hx).OooOOo0(new C4225ox.OooO00o().OooOOo0("http://localhost/").OooO0O0()).OooO0OO());
    }

    public static <T> Response<T> success(@Nullable T t, C4299qx c4299qx) {
        Utils.checkNotNull(c4299qx, "rawResponse == null");
        if (c4299qx.o00o0O()) {
            return new Response<>(c4299qx, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.OoooooO();
    }

    @Nullable
    public AbstractC4336rx errorBody() {
        return this.errorBody;
    }

    public C3966hx headers() {
        return this.rawResponse.o00Oo0();
    }

    public boolean isSuccessful() {
        return this.rawResponse.o00o0O();
    }

    public String message() {
        return this.rawResponse.o00ooo();
    }

    public C4299qx raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }
}
