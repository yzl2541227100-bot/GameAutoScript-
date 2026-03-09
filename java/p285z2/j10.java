package p285z2;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class j10 {
    public static volatile j10 OooOOo = null;
    public static String OooOOo0 = "EventBus";
    private static final k10 OooOOoo = new k10();
    private static final Map<Class<?>, List<Class<?>>> OooOo00 = new HashMap();
    private final ExecutorService OooO;
    private final Map<Class<?>, CopyOnWriteArrayList<t10>> OooO00o;
    private final Map<Object, List<Class<?>>> OooO0O0;
    private final Map<Class<?>, Object> OooO0OO;
    private final ThreadLocal<OooO0o> OooO0Oo;
    private final i10 OooO0o;
    private final l10 OooO0o0;
    private final h10 OooO0oO;
    private final s10 OooO0oo;
    private final boolean OooOO0;
    private final boolean OooOO0O;
    private final boolean OooOO0o;
    private final boolean OooOOO;
    private final boolean OooOOO0;
    private final boolean OooOOOO;
    private final int OooOOOo;

    public class OooO00o extends ThreadLocal<OooO0o> {
        public OooO00o() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public OooO0o initialValue() {
            return new OooO0o();
        }
    }

    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            OooO00o = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface OooO0OO {
        void OooO00o(List<q10> list);
    }

    public static final class OooO0o {
        public final List<Object> OooO00o = new ArrayList();
        public boolean OooO0O0;
        public boolean OooO0OO;
        public t10 OooO0Oo;
        public boolean OooO0o;
        public Object OooO0o0;
    }

    public j10() {
        this(OooOOoo);
    }

    public j10(k10 k10Var) {
        this.OooO0Oo = new OooO00o();
        this.OooO00o = new HashMap();
        this.OooO0O0 = new HashMap();
        this.OooO0OO = new ConcurrentHashMap();
        this.OooO0o0 = new l10(this, Looper.getMainLooper(), 10);
        this.OooO0o = new i10(this);
        this.OooO0oO = new h10(this);
        List<x10> list = k10Var.OooOO0O;
        this.OooOOOo = list != null ? list.size() : 0;
        this.OooO0oo = new s10(k10Var.OooOO0O, k10Var.OooO0oo, k10Var.OooO0oO);
        this.OooOO0O = k10Var.OooO00o;
        this.OooOO0o = k10Var.OooO0O0;
        this.OooOOO0 = k10Var.OooO0OO;
        this.OooOOO = k10Var.OooO0Oo;
        this.OooOO0 = k10Var.OooO0o0;
        this.OooOOOO = k10Var.OooO0o;
        this.OooO = k10Var.OooO;
    }

    private void OooO(t10 t10Var, Object obj, Throwable th) {
        if (!(obj instanceof q10)) {
            if (this.OooOO0) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.OooOO0O) {
                Log.e(OooOOo0, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + t10Var.OooO00o.getClass(), th);
            }
            if (this.OooOOO0) {
                OooOOOO(new q10(this, th, obj, t10Var.OooO00o));
                return;
            }
            return;
        }
        if (this.OooOO0O) {
            Log.e(OooOOo0, "SubscriberExceptionEvent subscriber " + t10Var.OooO00o.getClass() + " threw an exception", th);
            q10 q10Var = (q10) obj;
            Log.e(OooOOo0, "Initial event " + q10Var.OooO0OO + " caused exception in " + q10Var.OooO0Oo, q10Var.OooO0O0);
        }
    }

    public static void OooO00o(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                OooO00o(list, cls.getInterfaces());
            }
        }
    }

    public static k10 OooO0O0() {
        return new k10();
    }

    private void OooO0Oo(t10 t10Var, Object obj) {
        if (obj != null) {
            OooOOoo(t10Var, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    public static j10 OooO0o() {
        if (OooOOo == null) {
            synchronized (j10.class) {
                if (OooOOo == null) {
                    OooOOo = new j10();
                }
            }
        }
        return OooOOo;
    }

    public static void OooO0o0() {
        s10.OooO00o();
        OooOo00.clear();
    }

    private static List<Class<?>> OooOOO(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = OooOo00;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    OooO00o(arrayList, superclass.getInterfaces());
                }
                OooOo00.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    private void OooOOOo(Object obj, OooO0o oooO0o) throws Error {
        boolean zOooOOo0;
        Class<?> cls = obj.getClass();
        if (this.OooOOOO) {
            List<Class<?>> listOooOOO = OooOOO(cls);
            int size = listOooOOO.size();
            zOooOOo0 = false;
            for (int i = 0; i < size; i++) {
                zOooOOo0 |= OooOOo0(obj, oooO0o, listOooOOO.get(i));
            }
        } else {
            zOooOOo0 = OooOOo0(obj, oooO0o, cls);
        }
        if (zOooOOo0) {
            return;
        }
        if (this.OooOO0o) {
            Log.d(OooOOo0, "No subscribers registered for event " + cls);
        }
        if (!this.OooOOO || cls == m10.class || cls == q10.class) {
            return;
        }
        OooOOOO(new m10(this, obj));
    }

    private boolean OooOOo0(Object obj, OooO0o oooO0o, Class<?> cls) {
        CopyOnWriteArrayList<t10> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.OooO00o.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (t10 t10Var : copyOnWriteArrayList) {
            oooO0o.OooO0o0 = obj;
            oooO0o.OooO0Oo = t10Var;
            try {
                OooOOoo(t10Var, obj, oooO0o.OooO0OO);
                if (oooO0o.OooO0o) {
                    return true;
                }
            } finally {
                oooO0o.OooO0o0 = null;
                oooO0o.OooO0Oo = null;
                oooO0o.OooO0o = false;
            }
        }
        return true;
    }

    private void OooOOoo(t10 t10Var, Object obj, boolean z) {
        int i = OooO0O0.OooO00o[t10Var.OooO0O0.OooO0O0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.OooO0oO.OooO00o(t10Var, obj);
                        return;
                    }
                    throw new IllegalStateException("Unknown thread mode: " + t10Var.OooO0O0.OooO0O0);
                }
                if (z) {
                    this.OooO0o.OooO00o(t10Var, obj);
                    return;
                }
            } else if (!z) {
                this.OooO0o0.OooO00o(t10Var, obj);
                return;
            }
        }
        OooOO0o(t10Var, obj);
    }

    private void OooOo(Object obj, r10 r10Var) {
        Class<?> cls = r10Var.OooO0OO;
        t10 t10Var = new t10(obj, r10Var);
        CopyOnWriteArrayList<t10> copyOnWriteArrayList = this.OooO00o.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.OooO00o.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(t10Var)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i = 0; i <= size; i++) {
            if (i == size || r10Var.OooO0Oo > copyOnWriteArrayList.get(i).OooO0O0.OooO0Oo) {
                copyOnWriteArrayList.add(i, t10Var);
                break;
            }
        }
        List<Class<?>> arrayList = this.OooO0O0.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.OooO0O0.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (r10Var.OooO0o0) {
            if (!this.OooOOOO) {
                OooO0Oo(t10Var, this.OooO0OO.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.OooO0OO.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    OooO0Oo(t10Var, entry.getValue());
                }
            }
        }
    }

    private void OooOoO(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<t10> copyOnWriteArrayList = this.OooO00o.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                t10 t10Var = copyOnWriteArrayList.get(i);
                if (t10Var.OooO00o == obj) {
                    t10Var.OooO0OO = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public void OooO0OO(Object obj) {
        OooO0o oooO0o = this.OooO0Oo.get();
        if (!oooO0o.OooO0O0) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        }
        if (obj == null) {
            throw new EventBusException("Event may not be null");
        }
        if (oooO0o.OooO0o0 != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        }
        if (oooO0o.OooO0Oo.OooO0O0.OooO0O0 != ThreadMode.POSTING) {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
        oooO0o.OooO0o = true;
    }

    public ExecutorService OooO0oO() {
        return this.OooO;
    }

    public <T> T OooO0oo(Class<T> cls) {
        T tCast;
        synchronized (this.OooO0OO) {
            tCast = cls.cast(this.OooO0OO.get(cls));
        }
        return tCast;
    }

    public boolean OooOO0(Class<?> cls) {
        CopyOnWriteArrayList<t10> copyOnWriteArrayList;
        List<Class<?>> listOooOOO = OooOOO(cls);
        if (listOooOOO != null) {
            int size = listOooOOO.size();
            for (int i = 0; i < size; i++) {
                Class<?> cls2 = listOooOOO.get(i);
                synchronized (this) {
                    copyOnWriteArrayList = this.OooO00o.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void OooOO0O(n10 n10Var) {
        Object obj = n10Var.OooO00o;
        t10 t10Var = n10Var.OooO0O0;
        n10.OooO0O0(n10Var);
        if (t10Var.OooO0OO) {
            OooOO0o(t10Var, obj);
        }
    }

    public void OooOO0o(t10 t10Var, Object obj) {
        try {
            t10Var.OooO0O0.OooO00o.invoke(t10Var.OooO00o, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            OooO(t10Var, obj, e2.getCause());
        }
    }

    public synchronized boolean OooOOO0(Object obj) {
        return this.OooO0O0.containsKey(obj);
    }

    public void OooOOOO(Object obj) {
        OooO0o oooO0o = this.OooO0Oo.get();
        List<Object> list = oooO0o.OooO00o;
        list.add(obj);
        if (oooO0o.OooO0O0) {
            return;
        }
        oooO0o.OooO0OO = Looper.getMainLooper() == Looper.myLooper();
        oooO0o.OooO0O0 = true;
        if (oooO0o.OooO0o) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                OooOOOo(list.remove(0), oooO0o);
            } finally {
                oooO0o.OooO0O0 = false;
                oooO0o.OooO0OO = false;
            }
        }
    }

    public void OooOOo(Object obj) {
        synchronized (this.OooO0OO) {
            this.OooO0OO.put(obj.getClass(), obj);
        }
        OooOOOO(obj);
    }

    public void OooOo0() {
        synchronized (this.OooO0OO) {
            this.OooO0OO.clear();
        }
    }

    public void OooOo00(Object obj) {
        List<r10> listOooO0O0 = this.OooO0oo.OooO0O0(obj.getClass());
        synchronized (this) {
            Iterator<r10> it = listOooO0O0.iterator();
            while (it.hasNext()) {
                OooOo(obj, it.next());
            }
        }
    }

    public <T> T OooOo0O(Class<T> cls) {
        T tCast;
        synchronized (this.OooO0OO) {
            tCast = cls.cast(this.OooO0OO.remove(cls));
        }
        return tCast;
    }

    public boolean OooOo0o(Object obj) {
        synchronized (this.OooO0OO) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.OooO0OO.get(cls))) {
                return false;
            }
            this.OooO0OO.remove(cls);
            return true;
        }
    }

    public synchronized void OooOoO0(Object obj) {
        List<Class<?>> list = this.OooO0O0.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                OooOoO(obj, it.next());
            }
            this.OooO0O0.remove(obj);
        } else {
            Log.w(OooOOo0, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.OooOOOo + ", eventInheritance=" + this.OooOOOO + "]";
    }
}
