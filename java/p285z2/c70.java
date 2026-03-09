package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class c70 extends s90 {
    @Override // p285z2.s90
    public z80 OooO0OO(Class<?> cls) throws Throwable {
        if (OooO0oo(cls)) {
            return new q70(cls);
        }
        return null;
    }

    public boolean OooO0oo(Class<?> cls) {
        try {
            cls.getMethod(AbstractC4076kw.OooO0O0, new Class[0]);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }
}
