package p285z2;

/* JADX INFO: loaded from: classes2.dex */
public class z60 extends s90 {
    @Override // p285z2.s90
    public z80 OooO0OO(Class<?> cls) throws Throwable {
        if (OooO0oo(cls)) {
            return new m70(cls);
        }
        return null;
    }

    public boolean OooO0oo(Class<?> cls) {
        return AbstractC3891fw.class.isAssignableFrom(cls);
    }
}
