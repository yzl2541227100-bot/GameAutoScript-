package com.anythink.expressad.atsignalcommon.p082b;

import com.anythink.expressad.atsignalcommon.p082b.C1445b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1446c {

    /* JADX INFO: renamed from: a */
    private static a f6660a;

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean m5594a();
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$b$a */
        public static class a extends Throwable {

            /* JADX INFO: renamed from: d */
            private static final long f6661d = 1;

            /* JADX INFO: renamed from: a */
            private Class<?> f6662a;

            /* JADX INFO: renamed from: b */
            private String f6663b;

            /* JADX INFO: renamed from: c */
            private String f6664c;

            public a(Exception exc) {
                super(exc);
            }

            public a(String str) {
                super(str);
            }

            /* JADX INFO: renamed from: a */
            public final Class<?> m5595a() {
                return this.f6662a;
            }

            /* JADX INFO: renamed from: a */
            public final void m5596a(Class<?> cls) {
                this.f6662a = cls;
            }

            /* JADX INFO: renamed from: a */
            public final void m5597a(String str) {
                this.f6664c = str;
            }

            /* JADX INFO: renamed from: b */
            public final String m5598b() {
                return this.f6664c;
            }

            /* JADX INFO: renamed from: b */
            public final void m5599b(String str) {
                this.f6663b = str;
            }

            /* JADX INFO: renamed from: c */
            public final String m5600c() {
                return this.f6663b;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return a.class.getName() + ": " + getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$c */
    public static class c<C> {

        /* JADX INFO: renamed from: a */
        public Class<C> f6665a;

        public c(Class<C> cls) {
            this.f6665a = cls;
        }

        /* JADX INFO: renamed from: a */
        private d m5601a(Class<?>... clsArr) {
            return new d(this.f6665a, clsArr);
        }

        /* JADX INFO: renamed from: a */
        private e<C, Object> m5602a(String str) {
            return new e<>(this.f6665a, str, 8);
        }

        /* JADX INFO: renamed from: a */
        private Class<C> m5603a() {
            return this.f6665a;
        }

        /* JADX INFO: renamed from: b */
        private e<C, Object> m5604b(String str) {
            return new e<>(this.f6665a, str, 0);
        }

        /* JADX INFO: renamed from: b */
        private f m5605b(String str, Class<?>... clsArr) {
            return new f(this.f6665a, str, clsArr, 8);
        }

        /* JADX INFO: renamed from: a */
        public final f m5606a(String str, Class<?>... clsArr) {
            return new f(this.f6665a, str, clsArr, 0);
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public Constructor<?> f6666a;

        public d(Class<?> cls, Class<?>[] clsArr) throws b.a {
            if (cls == null) {
                return;
            }
            try {
                this.f6666a = cls.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException e) {
                b.a aVar = new b.a(e);
                aVar.m5596a(cls);
                C1446c.m5593b(aVar);
            }
        }

        /* JADX INFO: renamed from: a */
        private Object m5607a(Object... objArr) {
            this.f6666a.setAccessible(true);
            try {
                return this.f6666a.newInstance(objArr);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$e */
    public static class e<C, T> {

        /* JADX INFO: renamed from: a */
        private Object f6667a;

        /* JADX INFO: renamed from: b */
        private final Field f6668b;

        public e(Class<C> cls, String str, int i) {
            Field declaredField = null;
            if (cls == null) {
                return;
            }
            try {
                this.f6667a = null;
                declaredField = cls.getDeclaredField(str);
                if (i > 0 && (declaredField.getModifiers() & i) != i) {
                    C1446c.m5593b(new b.a(declaredField + " does not match modifiers: " + i));
                }
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                b.a aVar = new b.a(e);
                aVar.m5596a((Class<?>) cls);
                aVar.m5599b(str);
                C1446c.m5593b(aVar);
            } finally {
                this.f6668b = declaredField;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        private <T2> e<C, T2> m5608a(Class<?> cls) throws b.a {
            Field field = this.f6668b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                C1446c.m5593b(new b.a(new ClassCastException(this.f6668b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        private e<C, T> m5609a(String str) throws b.a {
            try {
                Class<?> cls = Class.forName(str);
                Field field = this.f6668b;
                if (field != null && !cls.isAssignableFrom(field.getType())) {
                    C1446c.m5593b(new b.a(new ClassCastException(this.f6668b + " is not of type " + cls)));
                }
                return this;
            } catch (ClassNotFoundException e) {
                C1446c.m5593b(new b.a(e));
                return this;
            }
        }

        /* JADX INFO: renamed from: a */
        private T m5610a() {
            try {
                return (T) this.f6668b.get(this.f6667a);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m5611a(C1445b.b<?> bVar) {
            T tM5610a = m5610a();
            if (tM5610a == null) {
                throw new IllegalStateException("Cannot mapping null");
            }
            try {
                this.f6668b.set(this.f6667a, C1445b.m5584a(tM5610a, bVar, tM5610a.getClass().getInterfaces()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: a */
        private void m5612a(Object obj) {
            try {
                this.f6668b.set(this.f6667a, obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        private <T2> e<C, T2> m5613b(Class<T2> cls) throws b.a {
            Field field = this.f6668b;
            if (field != null && !cls.isAssignableFrom(field.getType())) {
                C1446c.m5593b(new b.a(new ClassCastException(this.f6668b + " is not of type " + cls)));
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        private e<C, T> m5614b(C c) {
            this.f6667a = c;
            return this;
        }

        /* JADX INFO: renamed from: b */
        private Field m5615b() {
            return this.f6668b;
        }
    }

    /* JADX INFO: renamed from: com.anythink.expressad.atsignalcommon.b.c$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final Method f6669a;

        public f(Class<?> cls, String str, Class<?>[] clsArr, int i) {
            Method declaredMethod = null;
            if (cls == null) {
                return;
            }
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (i > 0 && (declaredMethod.getModifiers() & i) != i) {
                    C1446c.m5593b(new b.a(declaredMethod + " does not match modifiers: " + i));
                }
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                b.a aVar = new b.a(e);
                aVar.m5596a(cls);
                aVar.m5597a(str);
                C1446c.m5593b(aVar);
            } finally {
                this.f6669a = declaredMethod;
            }
        }

        /* JADX INFO: renamed from: a */
        public final Object m5616a(Object obj, Object... objArr) {
            try {
                return this.f6669a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final Method m5617a() {
            return this.f6669a;
        }
    }

    private C1446c() {
    }

    /* JADX INFO: renamed from: a */
    private static <T> c<T> m5588a(Class<T> cls) {
        return new c<>(cls);
    }

    /* JADX INFO: renamed from: a */
    public static <T> c<T> m5589a(ClassLoader classLoader, String str) throws b.a {
        try {
            return new c<>(classLoader.loadClass(str));
        } catch (Exception e2) {
            m5593b(new b.a(e2));
            return new c<>(null);
        }
    }

    /* JADX INFO: renamed from: a */
    private static <T> c<T> m5590a(String str) throws b.a {
        try {
            return new c<>(Class.forName(str));
        } catch (ClassNotFoundException e2) {
            m5593b(new b.a(e2));
            return new c<>(null);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m5591a(a aVar) {
        f6660a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m5593b(b.a aVar) throws b.a {
        a aVar2 = f6660a;
        if (aVar2 == null || !aVar2.m5594a()) {
            throw aVar;
        }
    }
}
