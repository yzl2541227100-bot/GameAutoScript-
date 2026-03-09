package p285z2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class o90 extends p90<o90> {
    private final Field OooO00o;

    public o90(Field field) {
        Objects.requireNonNull(field, "FrameworkField cannot be created without an underlying field.");
        this.OooO00o = field;
    }

    @Override // p285z2.n90
    public <T extends Annotation> T OooO00o(Class<T> cls) {
        return (T) this.OooO00o.getAnnotation(cls);
    }

    @Override // p285z2.n90
    public Annotation[] OooO0O0() {
        return this.OooO00o.getAnnotations();
    }

    @Override // p285z2.p90
    public Class<?> OooO0OO() {
        return this.OooO00o.getDeclaringClass();
    }

    @Override // p285z2.p90
    public int OooO0Oo() {
        return this.OooO00o.getModifiers();
    }

    @Override // p285z2.p90
    public Class<?> OooO0o() {
        return this.OooO00o.getType();
    }

    @Override // p285z2.p90
    public String OooO0o0() {
        return OooOO0o().getName();
    }

    public Object OooOO0O(Object obj) throws IllegalAccessException, IllegalArgumentException {
        return this.OooO00o.get(obj);
    }

    public Field OooOO0o() {
        return this.OooO00o;
    }

    @Override // p285z2.p90
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public boolean OooO(o90 o90Var) {
        return o90Var.OooO0o0().equals(OooO0o0());
    }

    public String toString() {
        return this.OooO00o.toString();
    }
}
