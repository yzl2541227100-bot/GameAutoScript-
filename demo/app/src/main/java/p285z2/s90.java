package p285z2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s90 {
    private final Set<Class<?>> OooO00o = new HashSet();

    private List<z80> OooO0o(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : clsArr) {
            z80 z80VarOooO0oO = OooO0oO(cls);
            if (z80VarOooO0oO != null) {
                arrayList.add(z80VarOooO0oO);
            }
        }
        return arrayList;
    }

    public Class<?> OooO00o(Class<?> cls) throws InitializationError {
        if (this.OooO00o.add(cls)) {
            return cls;
        }
        throw new InitializationError(String.format("class '%s' (possibly indirectly) contains itself as a SuiteClass", cls.getName()));
    }

    public void OooO0O0(Class<?> cls) {
        this.OooO00o.remove(cls);
    }

    public abstract z80 OooO0OO(Class<?> cls) throws Throwable;

    public List<z80> OooO0Oo(Class<?> cls, List<Class<?>> list) throws InitializationError {
        return OooO0o0(cls, (Class[]) list.toArray(new Class[0]));
    }

    public List<z80> OooO0o0(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        OooO00o(cls);
        try {
            return OooO0o(clsArr);
        } finally {
            OooO0O0(cls);
        }
    }

    public z80 OooO0oO(Class<?> cls) {
        try {
            return OooO0OO(cls);
        } catch (Throwable th) {
            return new l70(cls, th);
        }
    }
}
