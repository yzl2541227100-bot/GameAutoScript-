package retrofit2;

import java.io.IOException;
import p285z2.C4225ox;

/* JADX INFO: loaded from: classes2.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    Call<T> mo17069clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C4225ox request();
}
