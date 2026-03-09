package p285z2;

import android.app.Activity;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class z10 {
    private final Executor OooO00o;
    private final Constructor<?> OooO0O0;
    private final j10 OooO0OO;
    private final Object OooO0Oo;

    public class OooO00o implements Runnable {
        public final /* synthetic */ OooO0OO OoooOoO;

        public OooO00o(OooO0OO oooO0OO) {
            this.OoooOoO = oooO0OO;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.OoooOoO.run();
            } catch (Exception e) {
                try {
                    Object objNewInstance = z10.this.OooO0O0.newInstance(e);
                    if (objNewInstance instanceof d20) {
                        ((d20) objNewInstance).OooO0O0(z10.this.OooO0Oo);
                    }
                    z10.this.OooO0OO.OooOOOO(objNewInstance);
                } catch (Exception e2) {
                    Log.e(j10.OooOOo0, "Original exception:", e);
                    throw new RuntimeException("Could not create failure event", e2);
                }
            }
        }
    }

    public static class OooO0O0 {
        private Executor OooO00o;
        private Class<?> OooO0O0;
        private j10 OooO0OO;

        private OooO0O0() {
        }

        public /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this();
        }

        public z10 OooO00o() {
            return OooO0OO(null);
        }

        public z10 OooO0O0(Activity activity) {
            return OooO0OO(activity.getClass());
        }

        public z10 OooO0OO(Object obj) {
            if (this.OooO0OO == null) {
                this.OooO0OO = j10.OooO0o();
            }
            if (this.OooO00o == null) {
                this.OooO00o = Executors.newCachedThreadPool();
            }
            if (this.OooO0O0 == null) {
                this.OooO0O0 = e20.class;
            }
            return new z10(this.OooO00o, this.OooO0OO, this.OooO0O0, obj, null);
        }

        public OooO0O0 OooO0Oo(j10 j10Var) {
            this.OooO0OO = j10Var;
            return this;
        }

        public OooO0O0 OooO0o(Executor executor) {
            this.OooO00o = executor;
            return this;
        }

        public OooO0O0 OooO0o0(Class<?> cls) {
            this.OooO0O0 = cls;
            return this;
        }
    }

    public interface OooO0OO {
        void run() throws Exception;
    }

    private z10(Executor executor, j10 j10Var, Class<?> cls, Object obj) {
        this.OooO00o = executor;
        this.OooO0OO = j10Var;
        this.OooO0Oo = obj;
        try {
            this.OooO0O0 = cls.getConstructor(Throwable.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e);
        }
    }

    public /* synthetic */ z10(Executor executor, j10 j10Var, Class cls, Object obj, OooO00o oooO00o) {
        this(executor, j10Var, cls, obj);
    }

    public static OooO0O0 OooO0Oo() {
        return new OooO0O0(null);
    }

    public static z10 OooO0o0() {
        return new OooO0O0(null).OooO00o();
    }

    public void OooO0o(OooO0OO oooO0OO) {
        this.OooO00o.execute(new OooO00o(oooO0OO));
    }
}
