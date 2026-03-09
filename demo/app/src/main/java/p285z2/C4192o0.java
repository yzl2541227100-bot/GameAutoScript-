package p285z2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p285z2.InterfaceC3970i0;

/* JADX INFO: renamed from: z2.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C4192o0 implements InterfaceC4229p0, o0oOOo<o0O0o<Drawable>> {
    public final o00Oo00 OoooOoO;
    public final Context OoooOoo;
    public final InterfaceC4155n0 Ooooo00;

    @GuardedBy("this")
    private final C4377t0 Ooooo0o;

    @GuardedBy("this")
    private final InterfaceC4340s0 OooooO0;

    @GuardedBy("this")
    private final C4451v0 OooooOO;
    private final Runnable OooooOo;
    private final InterfaceC3970i0 Oooooo;
    private final Handler Oooooo0;
    private final CopyOnWriteArrayList<InterfaceC4193o1<Object>> OoooooO;

    @GuardedBy("this")
    private C4230p1 Ooooooo;
    private static final C4230p1 o0OoOo0 = C4230p1.o0000OO0(Bitmap.class).ooOO();
    private static final C4230p1 ooOO = C4230p1.o0000OO0(C4302r.class).ooOO();
    private static final C4230p1 o00O0O = C4230p1.o0000OO(o0oo0000.OooO0OO).o0OO00O(Priority.LOW).o00000O0(true);

    /* JADX INFO: renamed from: z2.o0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4192o0 c4192o0 = C4192o0.this;
            c4192o0.Ooooo00.OooO00o(c4192o0);
        }
    }

    /* JADX INFO: renamed from: z2.o0$OooO0O0 */
    public static class OooO0O0 extends ViewTarget<View, Object> {
        public OooO0O0(@NonNull View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@NonNull Object obj, @Nullable InterfaceC4526x1<? super Object> interfaceC4526x1) {
        }
    }

    /* JADX INFO: renamed from: z2.o0$OooO0OO */
    public class OooO0OO implements InterfaceC3970i0.OooO00o {

        @GuardedBy("RequestManager.this")
        private final C4377t0 OooO00o;

        public OooO0OO(@NonNull C4377t0 c4377t0) {
            this.OooO00o = c4377t0;
        }

        @Override // p285z2.InterfaceC3970i0.OooO00o
        public void OooO00o(boolean z) {
            if (z) {
                synchronized (C4192o0.this) {
                    this.OooO00o.OooO0oo();
                }
            }
        }
    }

    public C4192o0(@NonNull o00Oo00 o00oo00, @NonNull InterfaceC4155n0 interfaceC4155n0, @NonNull InterfaceC4340s0 interfaceC4340s0, @NonNull Context context) {
        this(o00oo00, interfaceC4155n0, interfaceC4340s0, new C4377t0(), o00oo00.OooO0oo(), context);
    }

    public C4192o0(o00Oo00 o00oo00, InterfaceC4155n0 interfaceC4155n0, InterfaceC4340s0 interfaceC4340s0, C4377t0 c4377t0, InterfaceC4007j0 interfaceC4007j0, Context context) {
        this.OooooOO = new C4451v0();
        OooO00o oooO00o = new OooO00o();
        this.OooooOo = oooO00o;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Oooooo0 = handler;
        this.OoooOoO = o00oo00;
        this.Ooooo00 = interfaceC4155n0;
        this.OooooO0 = interfaceC4340s0;
        this.Ooooo0o = c4377t0;
        this.OoooOoo = context;
        InterfaceC3970i0 interfaceC3970i0OooO00o = interfaceC4007j0.OooO00o(context.getApplicationContext(), new OooO0OO(c4377t0));
        this.Oooooo = interfaceC3970i0OooO00o;
        if (C4379t2.OooOOoo()) {
            handler.post(oooO00o);
        } else {
            interfaceC4155n0.OooO00o(this);
        }
        interfaceC4155n0.OooO00o(interfaceC3970i0OooO00o);
        this.OoooooO = new CopyOnWriteArrayList<>(o00oo00.OooOO0().OooO0OO());
        Oooo0oO(o00oo00.OooOO0().OooO0Oo());
        o00oo00.OooOo0(this);
    }

    private synchronized void OoooO0(@NonNull C4230p1 c4230p1) {
        this.Ooooooo = this.Ooooooo.OooOO0O(c4230p1);
    }

    private void OoooO00(@NonNull Target<?> target) {
        if (Oooo(target) || this.OoooOoO.OooOo0O(target) || target.getRequest() == null) {
            return;
        }
        InterfaceC4082l1 request = target.getRequest();
        target.setRequest(null);
        request.clear();
    }

    public C4192o0 OooOO0(InterfaceC4193o1<Object> interfaceC4193o1) {
        this.OoooooO.add(interfaceC4193o1);
        return this;
    }

    @NonNull
    public synchronized C4192o0 OooOO0O(@NonNull C4230p1 c4230p1) {
        OoooO0(c4230p1);
        return this;
    }

    @NonNull
    @CheckResult
    public <ResourceType> o0O0o<ResourceType> OooOO0o(@NonNull Class<ResourceType> cls) {
        return new o0O0o<>(this.OoooOoO, this, cls, this.OoooOoo);
    }

    @NonNull
    @CheckResult
    public o0O0o<Drawable> OooOOO() {
        return OooOO0o(Drawable.class);
    }

    @NonNull
    @CheckResult
    public o0O0o<Bitmap> OooOOO0() {
        return OooOO0o(Bitmap.class).OooOO0O(o0OoOo0);
    }

    @NonNull
    @CheckResult
    public o0O0o<File> OooOOOO() {
        return OooOO0o(File.class).OooOO0O(C4230p1.o000Ooo(true));
    }

    @NonNull
    @CheckResult
    public o0O0o<C4302r> OooOOOo() {
        return OooOO0o(C4302r.class).OooOO0O(ooOO);
    }

    public synchronized void OooOOo(@Nullable Target<?> target) {
        if (target == null) {
            return;
        }
        OoooO00(target);
    }

    public void OooOOo0(@NonNull View view) {
        OooOOo(new OooO0O0(view));
    }

    @NonNull
    @CheckResult
    public o0O0o<File> OooOOoo(@Nullable Object obj) {
        return OooOo00().OooO0oO(obj);
    }

    public synchronized boolean OooOo() {
        return this.Ooooo0o.OooO0o0();
    }

    public List<InterfaceC4193o1<Object>> OooOo0() {
        return this.OoooooO;
    }

    @NonNull
    @CheckResult
    public o0O0o<File> OooOo00() {
        return OooOO0o(File.class).OooOO0O(o00O0O);
    }

    public synchronized C4230p1 OooOo0O() {
        return this.Ooooooo;
    }

    @NonNull
    public <T> o0O00000<?, T> OooOo0o(Class<T> cls) {
        return this.OoooOoO.OooOO0().OooO0o0(cls);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOoO */
    public o0O0o<Drawable> OooO0o0(@Nullable Drawable drawable) {
        return OooOOO().OooO0o0(drawable);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOoO0 */
    public o0O0o<Drawable> OooO0o(@Nullable Bitmap bitmap) {
        return OooOOO().OooO0o(bitmap);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOoOO */
    public o0O0o<Drawable> OooO0O0(@Nullable Uri uri) {
        return OooOOO().OooO0O0(uri);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOoo */
    public o0O0o<Drawable> OooO0oo(@Nullable @DrawableRes @RawRes Integer num) {
        return OooOOO().OooO0oo(num);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOoo0 */
    public o0O0o<Drawable> OooO0Oo(@Nullable File file) {
        return OooOOO().OooO0Oo(file);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOooO */
    public o0O0o<Drawable> OooO0oO(@Nullable Object obj) {
        return OooOOO().OooO0oO(obj);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: OooOooo */
    public o0O0o<Drawable> OooO(@Nullable String str) {
        return OooOOO().OooO(str);
    }

    public synchronized boolean Oooo(@NonNull Target<?> target) {
        InterfaceC4082l1 request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.Ooooo0o.OooO0OO(request)) {
            return false;
        }
        this.OooooOO.OooO0Oo(target);
        target.setRequest(null);
        return true;
    }

    public synchronized void Oooo0() {
        this.Ooooo0o.OooO0oO();
    }

    @Override // p285z2.o0oOOo
    @CheckResult
    @Deprecated
    /* JADX INFO: renamed from: Oooo000 */
    public o0O0o<Drawable> OooO00o(@Nullable URL url) {
        return OooOOO().OooO00o(url);
    }

    @Override // p285z2.o0oOOo
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: Oooo00O */
    public o0O0o<Drawable> OooO0OO(@Nullable byte[] bArr) {
        return OooOOO().OooO0OO(bArr);
    }

    public synchronized void Oooo00o() {
        this.Ooooo0o.OooO0o();
    }

    public synchronized void Oooo0O0() {
        Oooo0();
        Iterator<C4192o0> it = this.OooooO0.OooO00o().iterator();
        while (it.hasNext()) {
            it.next().Oooo0();
        }
    }

    public synchronized void Oooo0OO() {
        this.Ooooo0o.OooO();
    }

    @NonNull
    public synchronized C4192o0 Oooo0o(@NonNull C4230p1 c4230p1) {
        Oooo0oO(c4230p1);
        return this;
    }

    public synchronized void Oooo0o0() {
        C4379t2.OooO0O0();
        Oooo0OO();
        Iterator<C4192o0> it = this.OooooO0.OooO00o().iterator();
        while (it.hasNext()) {
            it.next().Oooo0OO();
        }
    }

    public synchronized void Oooo0oO(@NonNull C4230p1 c4230p1) {
        this.Ooooooo = c4230p1.clone().OooOO0o();
    }

    public synchronized void Oooo0oo(@NonNull Target<?> target, @NonNull InterfaceC4082l1 interfaceC4082l1) {
        this.OooooOO.OooO0OO(target);
        this.Ooooo0o.OooOO0(interfaceC4082l1);
    }

    @Override // p285z2.InterfaceC4229p0
    public synchronized void onDestroy() {
        this.OooooOO.onDestroy();
        Iterator<Target<?>> it = this.OooooOO.OooO0O0().iterator();
        while (it.hasNext()) {
            OooOOo(it.next());
        }
        this.OooooOO.OooO00o();
        this.Ooooo0o.OooO0Oo();
        this.Ooooo00.OooO0O0(this);
        this.Ooooo00.OooO0O0(this.Oooooo);
        this.Oooooo0.removeCallbacks(this.OooooOo);
        this.OoooOoO.OooOoOO(this);
    }

    @Override // p285z2.InterfaceC4229p0
    public synchronized void onStart() {
        Oooo0OO();
        this.OooooOO.onStart();
    }

    @Override // p285z2.InterfaceC4229p0
    public synchronized void onStop() {
        Oooo0();
        this.OooooOO.onStop();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.Ooooo0o + ", treeNode=" + this.OooooO0 + "}";
    }
}
