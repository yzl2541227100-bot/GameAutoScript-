package p285z2;

import java.util.concurrent.atomic.AtomicInteger;
import org.jdeferred.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class v40 extends q40<x40, z40, w40> implements Promise<x40, z40, w40> {
    private final int OooO;
    private final AtomicInteger OooOO0 = new AtomicInteger();
    private final AtomicInteger OooOO0O = new AtomicInteger();
    private final x40 OooOO0o;

    public class OooO00o implements w30 {
        public final /* synthetic */ int OooO00o;
        public final /* synthetic */ Promise OooO0O0;

        public OooO00o(int i, Promise promise) {
            this.OooO00o = i;
            this.OooO0O0 = promise;
        }

        @Override // p285z2.w30
        public void OooO0O0(Object obj) {
            synchronized (v40.this) {
                if (v40.this.OooOo00()) {
                    x40 x40Var = v40.this.OooOO0o;
                    int i = this.OooO00o;
                    x40Var.OooO0O0(i, new a50(i, this.OooO0O0, obj));
                    int iIncrementAndGet = v40.this.OooOO0.incrementAndGet();
                    v40 v40Var = v40.this;
                    v40Var.OooOO0O(new w40(iIncrementAndGet, v40Var.OooOO0O.get(), v40.this.OooO));
                    if (iIncrementAndGet == v40.this.OooO) {
                        v40 v40Var2 = v40.this;
                        v40Var2.OooOo0O(v40Var2.OooOO0o);
                    }
                }
            }
        }
    }

    public class OooO0O0 implements c40 {
        public final /* synthetic */ int OooO00o;
        public final /* synthetic */ Promise OooO0O0;

        public OooO0O0(int i, Promise promise) {
            this.OooO00o = i;
            this.OooO0O0 = promise;
        }

        @Override // p285z2.c40
        public void OooO0O0(Object obj) {
            synchronized (v40.this) {
                if (v40.this.OooOo00()) {
                    v40 v40Var = v40.this;
                    v40Var.OooOO0O(new y40(v40Var.OooOO0.get(), v40.this.OooOO0O.get(), v40.this.OooO, this.OooO00o, this.OooO0O0, obj));
                }
            }
        }
    }

    public class OooO0OO implements z30<Object> {
        public final /* synthetic */ int OooO00o;
        public final /* synthetic */ Promise OooO0O0;

        public OooO0OO(int i, Promise promise) {
            this.OooO00o = i;
            this.OooO0O0 = promise;
        }

        @Override // p285z2.z30
        public void OooO0O0(Object obj) {
            synchronized (v40.this) {
                if (v40.this.OooOo00()) {
                    int iIncrementAndGet = v40.this.OooOO0O.incrementAndGet();
                    v40 v40Var = v40.this;
                    v40Var.OooOO0O(new w40(v40Var.OooOO0.get(), iIncrementAndGet, v40.this.OooO));
                    v40.this.OooOo0o(new z40(this.OooO00o, this.OooO0O0, obj));
                }
            }
        }
    }

    public v40(Promise... promiseArr) {
        if (promiseArr == null || promiseArr.length == 0) {
            throw new IllegalArgumentException("Promises is null or empty");
        }
        int length = promiseArr.length;
        this.OooO = length;
        this.OooOO0o = new x40(length);
        int length2 = promiseArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            Promise promise = promiseArr[i];
            promise.OooOO0(new OooO0OO(i2, promise)).OooO00o(new OooO0O0(i2, promise)).OooOOO(new OooO00o(i2, promise));
            i++;
            i2++;
        }
    }
}
