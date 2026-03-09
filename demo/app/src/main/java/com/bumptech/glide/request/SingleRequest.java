package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p285z2.AbstractC3971i1;
import p285z2.AbstractC4527x2;
import p285z2.C3895g;
import p285z2.C4157n2;
import p285z2.C4379t2;
import p285z2.C4453v2;
import p285z2.InterfaceC4082l1;
import p285z2.InterfaceC4119m1;
import p285z2.InterfaceC4193o1;
import p285z2.InterfaceC4267q1;
import p285z2.InterfaceC4563y1;
import p285z2.o0O00o0;
import p285z2.oO0Ooooo;
import p285z2.ooo0Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements InterfaceC4082l1, SizeReadyCallback, InterfaceC4267q1, C4453v2.OooOO0 {
    private static final String o000OOo = "Glide";
    private boolean OoooOoO;

    @Nullable
    private final String OoooOoo;
    private final AbstractC4527x2 Ooooo00;

    @Nullable
    private InterfaceC4193o1<R> Ooooo0o;
    private InterfaceC4119m1 OooooO0;
    private Context OooooOO;
    private o0O00o0 OooooOo;
    private Class<R> Oooooo;

    @Nullable
    private Object Oooooo0;
    private AbstractC3971i1<?> OoooooO;
    private int Ooooooo;
    private Target<R> o00O0O;

    @Nullable
    private List<InterfaceC4193o1<R>> o00Oo0;
    private ooo0Oo0 o00Ooo;
    private InterfaceC4563y1<? super R> o00o0O;
    private long o00oO0O;
    private ooo0Oo0.OooO0o o00oO0o;
    private Executor o00ooo;
    private int o0OO00O;
    private Drawable o0OOO0o;
    private int o0Oo0oo;
    private int o0OoOo0;

    @GuardedBy("this")
    private Status o0ooOO0;
    private Drawable o0ooOOo;
    private Drawable o0ooOoO;
    private oO0Ooooo<R> oo000o;

    @Nullable
    private RuntimeException oo0o0Oo;
    private Priority ooOO;
    private static final Pools.Pool<SingleRequest<?>> o000000 = C4453v2.OooO0o0(150, new OooO00o());
    private static final String o0O0O00 = "Request";
    private static final boolean o000000O = Log.isLoggable(o0O0O00, 2);

    public class OooO00o implements C4453v2.OooO0o<SingleRequest<?>> {
        @Override // p285z2.C4453v2.OooO0o
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public SingleRequest<?> OooO00o() {
            return new SingleRequest<>();
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest() {
        this.OoooOoo = o000000O ? String.valueOf(super.hashCode()) : null;
        this.Ooooo00 = AbstractC4527x2.OooO00o();
    }

    private void OooO0oo() {
        if (this.OoooOoO) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean OooOO0() {
        InterfaceC4119m1 interfaceC4119m1 = this.OooooO0;
        return interfaceC4119m1 == null || interfaceC4119m1.OooOO0o(this);
    }

    private boolean OooOO0o() {
        InterfaceC4119m1 interfaceC4119m1 = this.OooooO0;
        return interfaceC4119m1 == null || interfaceC4119m1.OooO0oO(this);
    }

    private void OooOOO() {
        OooO0oo();
        this.Ooooo00.OooO0OO();
        this.o00O0O.removeCallback(this);
        ooo0Oo0.OooO0o oooO0o = this.o00oO0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
            this.o00oO0o = null;
        }
    }

    private boolean OooOOO0() {
        InterfaceC4119m1 interfaceC4119m1 = this.OooooO0;
        return interfaceC4119m1 == null || interfaceC4119m1.OooO0oo(this);
    }

    private Drawable OooOOOO() {
        if (this.o0ooOOo == null) {
            Drawable drawableOooo00o = this.OoooooO.Oooo00o();
            this.o0ooOOo = drawableOooo00o;
            if (drawableOooo00o == null && this.OoooooO.Oooo00O() > 0) {
                this.o0ooOOo = OooOo0(this.OoooooO.Oooo00O());
            }
        }
        return this.o0ooOOo;
    }

    private Drawable OooOOOo() {
        if (this.o0OOO0o == null) {
            Drawable drawableOooo0 = this.OoooooO.Oooo0();
            this.o0OOO0o = drawableOooo0;
            if (drawableOooo0 == null && this.OoooooO.Oooo0O0() > 0) {
                this.o0OOO0o = OooOo0(this.OoooooO.Oooo0O0());
            }
        }
        return this.o0OOO0o;
    }

    private synchronized void OooOOo(Context context, o0O00o0 o0o00o0, Object obj, Class<R> cls, AbstractC3971i1<?> abstractC3971i1, int i, int i2, Priority priority, Target<R> target, InterfaceC4193o1<R> interfaceC4193o1, @Nullable List<InterfaceC4193o1<R>> list, InterfaceC4119m1 interfaceC4119m1, ooo0Oo0 ooo0oo0, InterfaceC4563y1<? super R> interfaceC4563y1, Executor executor) {
        this.OooooOO = context;
        this.OooooOo = o0o00o0;
        this.Oooooo0 = obj;
        this.Oooooo = cls;
        this.OoooooO = abstractC3971i1;
        this.Ooooooo = i;
        this.o0OoOo0 = i2;
        this.ooOO = priority;
        this.o00O0O = target;
        this.Ooooo0o = interfaceC4193o1;
        this.o00Oo0 = list;
        this.OooooO0 = interfaceC4119m1;
        this.o00Ooo = ooo0oo0;
        this.o00o0O = interfaceC4563y1;
        this.o00ooo = executor;
        this.o0ooOO0 = Status.PENDING;
        if (this.oo0o0Oo == null && o0o00o0.OooO()) {
            this.oo0o0Oo = new RuntimeException("Glide request origin trace");
        }
    }

    private Drawable OooOOo0() {
        if (this.o0ooOoO == null) {
            Drawable drawableOooo0oo = this.OoooooO.Oooo0oo();
            this.o0ooOoO = drawableOooo0oo;
            if (drawableOooo0oo == null && this.OoooooO.Oooo() > 0) {
                this.o0ooOoO = OooOo0(this.OoooooO.Oooo());
            }
        }
        return this.o0ooOoO;
    }

    private boolean OooOOoo() {
        InterfaceC4119m1 interfaceC4119m1 = this.OooooO0;
        return interfaceC4119m1 == null || !interfaceC4119m1.OooO0O0();
    }

    private void OooOo() {
        InterfaceC4119m1 interfaceC4119m1 = this.OooooO0;
        if (interfaceC4119m1 != null) {
            interfaceC4119m1.OooO00o(this);
        }
    }

    private Drawable OooOo0(@DrawableRes int i) {
        return C3895g.OooO00o(this.OooooOo, i, this.OoooooO.OoooOO0() != null ? this.OoooooO.OoooOO0() : this.OooooOO.getTheme());
    }

    private synchronized boolean OooOo00(SingleRequest<?> singleRequest) {
        boolean z;
        synchronized (singleRequest) {
            List<InterfaceC4193o1<R>> list = this.o00Oo0;
            int size = list == null ? 0 : list.size();
            List<InterfaceC4193o1<?>> list2 = singleRequest.o00Oo0;
            z = size == (list2 == null ? 0 : list2.size());
        }
        return z;
    }

    private void OooOo0O(String str) {
        Log.v(o0O0O00, str + " this: " + this.OoooOoo);
    }

    private static int OooOo0o(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    public static <R> SingleRequest<R> OooOoO(Context context, o0O00o0 o0o00o0, Object obj, Class<R> cls, AbstractC3971i1<?> abstractC3971i1, int i, int i2, Priority priority, Target<R> target, InterfaceC4193o1<R> interfaceC4193o1, @Nullable List<InterfaceC4193o1<R>> list, InterfaceC4119m1 interfaceC4119m1, ooo0Oo0 ooo0oo0, InterfaceC4563y1<? super R> interfaceC4563y1, Executor executor) {
        SingleRequest<R> singleRequest = (SingleRequest) o000000.acquire();
        if (singleRequest == null) {
            singleRequest = new SingleRequest<>();
        }
        singleRequest.OooOOo(context, o0o00o0, obj, cls, abstractC3971i1, i, i2, priority, target, interfaceC4193o1, list, interfaceC4119m1, ooo0oo0, interfaceC4563y1, executor);
        return singleRequest;
    }

    private void OooOoO0() {
        InterfaceC4119m1 interfaceC4119m1 = this.OooooO0;
        if (interfaceC4119m1 != null) {
            interfaceC4119m1.OooOO0(this);
        }
    }

    private synchronized void OooOoOO(GlideException glideException, int i) {
        boolean zOooO00o;
        this.Ooooo00.OooO0OO();
        glideException.setOrigin(this.oo0o0Oo);
        int iOooO0oO = this.OooooOo.OooO0oO();
        if (iOooO0oO <= i) {
            Log.w(o000OOo, "Load failed for " + this.Oooooo0 + " with size [" + this.o0Oo0oo + "x" + this.o0OO00O + "]", glideException);
            if (iOooO0oO <= 4) {
                glideException.logRootCauses(o000OOo);
            }
        }
        this.o00oO0o = null;
        this.o0ooOO0 = Status.FAILED;
        boolean z = true;
        this.OoooOoO = true;
        try {
            List<InterfaceC4193o1<R>> list = this.o00Oo0;
            if (list != null) {
                Iterator<InterfaceC4193o1<R>> it = list.iterator();
                zOooO00o = false;
                while (it.hasNext()) {
                    zOooO00o |= it.next().OooO00o(glideException, this.Oooooo0, this.o00O0O, OooOOoo());
                }
            } else {
                zOooO00o = false;
            }
            InterfaceC4193o1<R> interfaceC4193o1 = this.Ooooo0o;
            if (interfaceC4193o1 == null || !interfaceC4193o1.OooO00o(glideException, this.Oooooo0, this.o00O0O, OooOOoo())) {
                z = false;
            }
            if (!(zOooO00o | z)) {
                OooOooO();
            }
            this.OoooOoO = false;
            OooOo();
        } catch (Throwable th) {
            this.OoooOoO = false;
            throw th;
        }
    }

    private void OooOoo(oO0Ooooo<?> oo0ooooo) {
        this.o00Ooo.OooOO0O(oo0ooooo);
        this.oo000o = null;
    }

    private synchronized void OooOoo0(oO0Ooooo<R> oo0ooooo, R r, DataSource dataSource) {
        boolean zOooO0O0;
        boolean zOooOOoo = OooOOoo();
        this.o0ooOO0 = Status.COMPLETE;
        this.oo000o = oo0ooooo;
        if (this.OooooOo.OooO0oO() <= 3) {
            Log.d(o000OOo, "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.Oooooo0 + " with size [" + this.o0Oo0oo + "x" + this.o0OO00O + "] in " + C4157n2.OooO00o(this.o00oO0O) + " ms");
        }
        boolean z = true;
        this.OoooOoO = true;
        try {
            List<InterfaceC4193o1<R>> list = this.o00Oo0;
            if (list != null) {
                Iterator<InterfaceC4193o1<R>> it = list.iterator();
                zOooO0O0 = false;
                while (it.hasNext()) {
                    zOooO0O0 |= it.next().OooO0O0(r, this.Oooooo0, this.o00O0O, dataSource, zOooOOoo);
                }
            } else {
                zOooO0O0 = false;
            }
            InterfaceC4193o1<R> interfaceC4193o1 = this.Ooooo0o;
            if (interfaceC4193o1 == null || !interfaceC4193o1.OooO0O0(r, this.Oooooo0, this.o00O0O, dataSource, zOooOOoo)) {
                z = false;
            }
            if (!(z | zOooO0O0)) {
                this.o00O0O.onResourceReady(r, this.o00o0O.OooO00o(dataSource, zOooOOoo));
            }
            this.OoooOoO = false;
            OooOoO0();
        } catch (Throwable th) {
            this.OoooOoO = false;
            throw th;
        }
    }

    private synchronized void OooOooO() {
        if (OooOO0o()) {
            Drawable drawableOooOOOo = this.Oooooo0 == null ? OooOOOo() : null;
            if (drawableOooOOOo == null) {
                drawableOooOOOo = OooOOOO();
            }
            if (drawableOooOOOo == null) {
                drawableOooOOOo = OooOOo0();
            }
            this.o00O0O.onLoadFailed(drawableOooOOOo);
        }
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized void OooO() {
        OooO0oo();
        this.Ooooo00.OooO0OO();
        this.o00oO0O = C4157n2.OooO0O0();
        if (this.Oooooo0 == null) {
            if (C4379t2.OooOo0O(this.Ooooooo, this.o0OoOo0)) {
                this.o0Oo0oo = this.Ooooooo;
                this.o0OO00O = this.o0OoOo0;
            }
            OooOoOO(new GlideException("Received null model"), OooOOOo() == null ? 5 : 3);
            return;
        }
        Status status = this.o0ooOO0;
        Status status2 = Status.RUNNING;
        if (status == status2) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (status == Status.COMPLETE) {
            OooO0O0(this.oo000o, DataSource.MEMORY_CACHE);
            return;
        }
        Status status3 = Status.WAITING_FOR_SIZE;
        this.o0ooOO0 = status3;
        if (C4379t2.OooOo0O(this.Ooooooo, this.o0OoOo0)) {
            onSizeReady(this.Ooooooo, this.o0OoOo0);
        } else {
            this.o00O0O.getSize(this);
        }
        Status status4 = this.o0ooOO0;
        if ((status4 == status2 || status4 == status3) && OooOO0o()) {
            this.o00O0O.onLoadStarted(OooOOo0());
        }
        if (o000000O) {
            OooOo0O("finished run method in " + C4157n2.OooO00o(this.o00oO0O));
        }
    }

    @Override // p285z2.InterfaceC4267q1
    public synchronized void OooO00o(GlideException glideException) {
        OooOoOO(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p285z2.InterfaceC4267q1
    public synchronized void OooO0O0(oO0Ooooo<?> oo0ooooo, DataSource dataSource) {
        this.Ooooo00.OooO0OO();
        this.o00oO0o = null;
        if (oo0ooooo == null) {
            OooO00o(new GlideException("Expected to receive a Resource<R> with an object of " + this.Oooooo + " inside, but instead got null."));
            return;
        }
        Object obj = oo0ooooo.get();
        if (obj != null && this.Oooooo.isAssignableFrom(obj.getClass())) {
            if (OooOOO0()) {
                OooOoo0(oo0ooooo, obj, dataSource);
                return;
            } else {
                OooOoo(oo0ooooo);
                this.o0ooOO0 = Status.COMPLETE;
                return;
            }
        }
        OooOoo(oo0ooooo);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.Oooooo);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(oo0ooooo);
        sb.append("}.");
        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        OooO00o(new GlideException(sb.toString()));
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized boolean OooO0OO(InterfaceC4082l1 interfaceC4082l1) {
        boolean z = false;
        if (!(interfaceC4082l1 instanceof SingleRequest)) {
            return false;
        }
        SingleRequest<?> singleRequest = (SingleRequest) interfaceC4082l1;
        synchronized (singleRequest) {
            if (this.Ooooooo == singleRequest.Ooooooo && this.o0OoOo0 == singleRequest.o0OoOo0 && C4379t2.OooO0OO(this.Oooooo0, singleRequest.Oooooo0) && this.Oooooo.equals(singleRequest.Oooooo) && this.OoooooO.equals(singleRequest.OoooooO) && this.ooOO == singleRequest.ooOO && OooOo00(singleRequest)) {
                z = true;
            }
        }
        return z;
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized boolean OooO0Oo() {
        return OooOO0O();
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized boolean OooO0o() {
        return this.o0ooOO0 == Status.CLEARED;
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized boolean OooO0o0() {
        return this.o0ooOO0 == Status.FAILED;
    }

    @Override // p285z2.C4453v2.OooOO0
    @NonNull
    public AbstractC4527x2 OooO0oO() {
        return this.Ooooo00;
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized boolean OooOO0O() {
        return this.o0ooOO0 == Status.COMPLETE;
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized void clear() {
        OooO0oo();
        this.Ooooo00.OooO0OO();
        Status status = this.o0ooOO0;
        Status status2 = Status.CLEARED;
        if (status == status2) {
            return;
        }
        OooOOO();
        oO0Ooooo<R> oo0ooooo = this.oo000o;
        if (oo0ooooo != null) {
            OooOoo(oo0ooooo);
        }
        if (OooOO0()) {
            this.o00O0O.onLoadCleared(OooOOo0());
        }
        this.o0ooOO0 = status2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // p285z2.InterfaceC4082l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isRunning() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.request.SingleRequest$Status r0 = r2.o0ooOO0     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.RUNNING     // Catch: java.lang.Throwable -> L11
            if (r0 == r1) goto Le
            com.bumptech.glide.request.SingleRequest$Status r1 = com.bumptech.glide.request.SingleRequest.Status.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L11
            if (r0 != r1) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.isRunning():boolean");
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public synchronized void onSizeReady(int i, int i2) throws Throwable {
        try {
            this.Ooooo00.OooO0OO();
            boolean z = o000000O;
            if (z) {
                OooOo0O("Got onSizeReady in " + C4157n2.OooO00o(this.o00oO0O));
            }
            if (this.o0ooOO0 != Status.WAITING_FOR_SIZE) {
                return;
            }
            Status status = Status.RUNNING;
            this.o0ooOO0 = status;
            float fOoooO = this.OoooooO.OoooO();
            this.o0Oo0oo = OooOo0o(i, fOoooO);
            this.o0OO00O = OooOo0o(i2, fOoooO);
            if (z) {
                OooOo0O("finished setup for calling load in " + C4157n2.OooO00o(this.o00oO0O));
            }
            try {
                try {
                    this.o00oO0o = this.o00Ooo.OooO0oO(this.OooooOo, this.Oooooo0, this.OoooooO.OoooO0O(), this.o0Oo0oo, this.o0OO00O, this.OoooooO.OoooO0(), this.Oooooo, this.ooOO, this.OoooooO.Oooo000(), this.OoooooO.o000oOoO(), this.OoooooO.OoooooO(), this.OoooooO.OooooO0(), this.OoooooO.Oooo0o0(), this.OoooooO.Ooooo00(), this.OoooooO.OoooOOo(), this.OoooooO.OoooOOO(), this.OoooooO.Oooo0OO(), this, this.o00ooo);
                    if (this.o0ooOO0 != status) {
                        this.o00oO0o = null;
                    }
                    if (z) {
                        OooOo0O("finished onSizeReady in " + C4157n2.OooO00o(this.o00oO0O));
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    @Override // p285z2.InterfaceC4082l1
    public synchronized void recycle() {
        OooO0oo();
        this.OooooOO = null;
        this.OooooOo = null;
        this.Oooooo0 = null;
        this.Oooooo = null;
        this.OoooooO = null;
        this.Ooooooo = -1;
        this.o0OoOo0 = -1;
        this.o00O0O = null;
        this.o00Oo0 = null;
        this.Ooooo0o = null;
        this.OooooO0 = null;
        this.o00o0O = null;
        this.o00oO0o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.o0OOO0o = null;
        this.o0Oo0oo = -1;
        this.o0OO00O = -1;
        this.oo0o0Oo = null;
        o000000.release(this);
    }
}
