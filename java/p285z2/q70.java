package p285z2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public class q70 extends m70 {
    public q70(Class<?> cls) throws Throwable {
        super(OooOO0O(cls));
    }

    public static InterfaceC3854ew OooOO0O(Class<?> cls) throws Exception {
        try {
            Method method = cls.getMethod(AbstractC4076kw.OooO0O0, new Class[0]);
            if (Modifier.isStatic(method.getModifiers())) {
                return (InterfaceC3854ew) method.invoke(null, new Object[0]);
            }
            throw new Exception(cls.getName() + ".suite() must be static");
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
