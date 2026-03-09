package p285z2;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ba0 {
    private static final ConcurrentHashMap<fa0, aa0> OooO00o = new ConcurrentHashMap<>();

    public aa0 OooO00o(fa0 fa0Var) {
        ConcurrentHashMap<fa0, aa0> concurrentHashMap = OooO00o;
        aa0 aa0Var = concurrentHashMap.get(fa0Var);
        if (aa0Var != null) {
            return aa0Var;
        }
        Class<? extends aa0> clsValue = fa0Var.value();
        if (clsValue == null) {
            throw new IllegalArgumentException("Can't create validator, value is null in annotation " + fa0Var.getClass().getName());
        }
        try {
            concurrentHashMap.putIfAbsent(fa0Var, clsValue.newInstance());
            return concurrentHashMap.get(fa0Var);
        } catch (Exception e) {
            throw new RuntimeException("Exception received when creating AnnotationValidator class " + clsValue.getName(), e);
        }
    }
}
