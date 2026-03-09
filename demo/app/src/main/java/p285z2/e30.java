package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class e30 extends m20<Object> {
    private final Class<?> OoooOoO;
    private final Class<?> OoooOoo;

    public e30(Class<?> cls) {
        this.OoooOoO = cls;
        this.OoooOoo = OooO0oO(cls);
    }

    @n20
    public static <T> p20<T> OooO0o(Class<?> cls) {
        return new e30(cls);
    }

    @n20
    public static <T> p20<T> OooO0o0(Class<T> cls) {
        return new e30(cls);
    }

    private static Class<?> OooO0oO(Class<?> cls) {
        return Boolean.TYPE.equals(cls) ? Boolean.class : Byte.TYPE.equals(cls) ? Byte.class : Character.TYPE.equals(cls) ? Character.class : Double.TYPE.equals(cls) ? Double.class : Float.TYPE.equals(cls) ? Float.class : Integer.TYPE.equals(cls) ? Integer.class : Long.TYPE.equals(cls) ? Long.class : Short.TYPE.equals(cls) ? Short.class : cls;
    }

    @Override // p285z2.m20
    public boolean OooO0Oo(Object obj, l20 l20Var) {
        String str;
        if (obj == null) {
            str = "null";
        } else {
            if (this.OoooOoo.isInstance(obj)) {
                return true;
            }
            l20Var = l20Var.OooO0o0(obj);
            str = " is a " + obj.getClass().getName();
        }
        l20Var.OooO0Oo(str);
        return false;
    }

    @Override // p285z2.r20
    public void describeTo(l20 l20Var) {
        l20Var.OooO0Oo("an instance of ").OooO0Oo(this.OoooOoO.getName());
    }
}
