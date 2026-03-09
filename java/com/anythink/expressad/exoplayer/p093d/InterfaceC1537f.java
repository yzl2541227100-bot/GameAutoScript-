package com.anythink.expressad.exoplayer.p093d;

import android.annotation.TargetApi;
import com.anythink.expressad.exoplayer.p093d.InterfaceC1540i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.f */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public interface InterfaceC1537f<T extends InterfaceC1540i> {

    /* JADX INFO: renamed from: d */
    public static final int f7995d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f7996e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f7997f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f7998g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f7999h = 4;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.f$a */
    public static class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.f$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: e */
    int mo6727e();

    /* JADX INFO: renamed from: f */
    a mo6728f();

    /* JADX INFO: renamed from: g */
    T mo6729g();

    /* JADX INFO: renamed from: h */
    Map<String, String> mo6730h();

    /* JADX INFO: renamed from: i */
    byte[] mo6731i();
}
