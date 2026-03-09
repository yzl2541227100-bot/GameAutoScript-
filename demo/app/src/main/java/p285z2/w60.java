package p285z2;

import java.lang.reflect.Modifier;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class w60 extends s90 {
    private static final String OooO0OO = "Custom runner class %s should have a public constructor with signature %s(Class testClass)";
    private final s90 OooO0O0;

    public w60(s90 s90Var) {
        this.OooO0O0 = s90Var;
    }

    private Class<?> OooO(Class<?> cls) {
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    @Override // p285z2.s90
    public z80 OooO0OO(Class<?> cls) throws Exception {
        Class<?> clsOooO = cls;
        while (clsOooO != null) {
            y80 y80Var = (y80) clsOooO.getAnnotation(y80.class);
            if (y80Var != null) {
                return OooO0oo(y80Var.value(), cls);
            }
            clsOooO = OooO(clsOooO);
        }
        return null;
    }

    public z80 OooO0oo(Class<? extends z80> cls, Class<?> cls2) throws Exception {
        try {
            return cls.getConstructor(Class.class).newInstance(cls2);
        } catch (NoSuchMethodException unused) {
            try {
                return cls.getConstructor(Class.class, s90.class).newInstance(cls2, this.OooO0O0);
            } catch (NoSuchMethodException unused2) {
                String simpleName = cls.getSimpleName();
                throw new InitializationError(String.format(OooO0OO, simpleName, simpleName));
            }
        }
    }
}
