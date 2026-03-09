package p285z2;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p50 extends aa0 {
    private static final Set<Class<? extends Annotation>> OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(g50.class, c50.class, f50.class, b50.class)));

    private void OooO0Oo(List<Exception> list, Class<?> cls) {
        list.add(new Exception(String.format("@%s can not be combined with @Category", cls.getSimpleName())));
    }

    @Override // p285z2.aa0
    public List<Exception> OooO0OO(q90 q90Var) {
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : q90Var.OooO0O0()) {
            for (Class<? extends Annotation> cls : OooO0O0) {
                if (annotation.annotationType().isAssignableFrom(cls)) {
                    OooO0Oo(arrayList, cls);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
