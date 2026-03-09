package p285z2;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class w50 extends m90 {
    public w50(Class<?> cls, s90 s90Var) throws Throwable {
        super(s90Var, cls, Oooo0O0(cls.getClasses()));
    }

    private static Class<?>[] Oooo0O0(Class<?>[] clsArr) {
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class<?> cls : clsArr) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add(cls);
            }
        }
        return (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }
}
