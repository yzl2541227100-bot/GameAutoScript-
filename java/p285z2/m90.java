package p285z2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes2.dex */
public class m90 extends l90<z80> {
    private final List<z80> OooO0o;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface OooO00o {
        Class<?>[] value();
    }

    public m90(Class<?> cls, List<z80> list) throws InitializationError {
        super(cls);
        this.OooO0o = Collections.unmodifiableList(list);
    }

    public m90(Class<?> cls, s90 s90Var) throws InitializationError {
        this(s90Var, cls, Oooo00o(cls));
    }

    public m90(Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(new v60(true), cls, clsArr);
    }

    public m90(s90 s90Var, Class<?> cls, Class<?>[] clsArr) throws InitializationError {
        this(cls, s90Var.OooO0o0(cls, clsArr));
    }

    public m90(s90 s90Var, Class<?>[] clsArr) throws InitializationError {
        this((Class<?>) null, s90Var.OooO0o0(null, clsArr));
    }

    public static z80 Oooo00O() {
        try {
            return new m90((Class<?>) null, (Class<?>[]) new Class[0]);
        } catch (InitializationError unused) {
            throw new RuntimeException("This shouldn't be possible");
        }
    }

    private static Class<?>[] Oooo00o(Class<?> cls) throws InitializationError {
        OooO00o oooO00o = (OooO00o) cls.getAnnotation(OooO00o.class);
        if (oooO00o != null) {
            return oooO00o.value();
        }
        throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", cls.getName()));
    }

    @Override // p285z2.l90
    public List<z80> OooOOOO() {
        return this.OooO0o;
    }

    @Override // p285z2.l90
    /* JADX INFO: renamed from: Oooo0, reason: merged with bridge method [inline-methods] */
    public void OooOo0(z80 z80Var, f90 f90Var) {
        z80Var.OooO00o(f90Var);
    }

    @Override // p285z2.l90
    /* JADX INFO: renamed from: Oooo000, reason: merged with bridge method [inline-methods] */
    public Description OooOOO(z80 z80Var) {
        return z80Var.getDescription();
    }
}
