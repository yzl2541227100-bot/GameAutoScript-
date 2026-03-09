package p285z2;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;

/* JADX INFO: renamed from: z2.pu */
/* JADX INFO: loaded from: classes2.dex */
public final class C4259pu implements CallAdapter<Object> {
    private final Type OooO00o;
    private final Scheduler OooO0O0;
    private final boolean OooO0OO;
    private final boolean OooO0Oo;
    private final boolean OooO0o;
    private final boolean OooO0o0;
    private final boolean OooO0oO;
    private final boolean OooO0oo;

    public C4259pu(Type type, Scheduler scheduler, boolean z, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.OooO00o = type;
        this.OooO0O0 = scheduler;
        this.OooO0OO = z;
        this.OooO0Oo = z3;
        this.OooO0o0 = z4;
        this.OooO0o = z5;
        this.OooO0oO = z6;
        this.OooO0oo = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002d  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object adapt(retrofit2.Call<R> r2) {
        /*
            r1 = this;
            z2.mu r0 = new z2.mu
            r0.<init>(r2)
            boolean r2 = r1.OooO0OO
            if (r2 == 0) goto L10
            z2.ou r2 = new z2.ou
            r2.<init>(r0)
        Le:
            r0 = r2
            goto L1a
        L10:
            boolean r2 = r1.OooO0Oo
            if (r2 == 0) goto L1a
            z2.lu r2 = new z2.lu
            r2.<init>(r0)
            goto Le
        L1a:
            io.reactivex.Scheduler r2 = r1.OooO0O0
            if (r2 == 0) goto L22
            io.reactivex.Observable r0 = r0.subscribeOn(r2)
        L22:
            boolean r2 = r1.OooO0o0
            if (r2 == 0) goto L2d
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.Flowable r2 = r0.toFlowable(r2)
            return r2
        L2d:
            boolean r2 = r1.OooO0o
            if (r2 == 0) goto L36
            io.reactivex.Single r2 = r0.singleOrError()
            return r2
        L36:
            boolean r2 = r1.OooO0oO
            if (r2 == 0) goto L3f
            io.reactivex.Maybe r2 = r0.singleElement()
            return r2
        L3f:
            boolean r2 = r1.OooO0oo
            if (r2 == 0) goto L48
            io.reactivex.Completable r2 = r0.ignoreElements()
            return r2
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p285z2.C4259pu.adapt(retrofit2.Call):java.lang.Object");
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.OooO00o;
    }
}
