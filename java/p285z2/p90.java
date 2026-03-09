package p285z2;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import p285z2.p90;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p90<T extends p90<T>> implements n90 {
    public abstract boolean OooO(T t);

    public abstract Class<?> OooO0OO();

    public abstract int OooO0Oo();

    public abstract Class<?> OooO0o();

    public abstract String OooO0o0();

    public boolean OooO0oO() {
        return Modifier.isPublic(OooO0Oo());
    }

    public boolean OooO0oo(List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (OooO(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean OooOO0() {
        return Modifier.isStatic(OooO0Oo());
    }
}
