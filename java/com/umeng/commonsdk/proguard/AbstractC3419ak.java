package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.AbstractC3419ak;
import com.umeng.commonsdk.proguard.InterfaceC3416ah;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ak */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3419ak<T extends AbstractC3419ak<?, ?>, F extends InterfaceC3416ah> implements InterfaceC3409aa<T, F> {

    /* JADX INFO: renamed from: c */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f18675c;

    /* JADX INFO: renamed from: a */
    public Object f18676a;

    /* JADX INFO: renamed from: b */
    public F f18677b;

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ak$a */
    public static class a extends AbstractC3445bj<AbstractC3419ak> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15766b(AbstractC3434az abstractC3434az, AbstractC3419ak abstractC3419ak) throws C3415ag {
            abstractC3419ak.f18677b = null;
            abstractC3419ak.f18676a = null;
            abstractC3434az.mo15808j();
            C3429au c3429auMo15810l = abstractC3434az.mo15810l();
            Object objM15751a = abstractC3419ak.m15751a(abstractC3434az, c3429auMo15810l);
            abstractC3419ak.f18676a = objM15751a;
            if (objM15751a != null) {
                abstractC3419ak.f18677b = (F) abstractC3419ak.m15748a(c3429auMo15810l.f18742c);
            }
            abstractC3434az.mo15811m();
            abstractC3434az.mo15810l();
            abstractC3434az.mo15809k();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15764a(AbstractC3434az abstractC3434az, AbstractC3419ak abstractC3419ak) throws C3415ag {
            if (abstractC3419ak.m15747a() == null || abstractC3419ak.m15756b() == null) {
                throw new C3436ba("Cannot write a TUnion with no set value!");
            }
            abstractC3434az.mo15792a(abstractC3419ak.m15763d());
            abstractC3434az.mo15787a(abstractC3419ak.m15761c(abstractC3419ak.f18677b));
            abstractC3419ak.m15755a(abstractC3434az);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ak$b */
    public static class b implements InterfaceC3444bi {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo15769b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ak$c */
    public static class c extends AbstractC3446bk<AbstractC3419ak> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15766b(AbstractC3434az abstractC3434az, AbstractC3419ak abstractC3419ak) throws C3415ag {
            abstractC3419ak.f18677b = null;
            abstractC3419ak.f18676a = null;
            short sMo15820v = abstractC3434az.mo15820v();
            Object objM15752a = abstractC3419ak.m15752a(abstractC3434az, sMo15820v);
            abstractC3419ak.f18676a = objM15752a;
            if (objM15752a != null) {
                abstractC3419ak.f18677b = (F) abstractC3419ak.m15748a(sMo15820v);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15764a(AbstractC3434az abstractC3434az, AbstractC3419ak abstractC3419ak) throws C3415ag {
            if (abstractC3419ak.m15747a() == null || abstractC3419ak.m15756b() == null) {
                throw new C3436ba("Cannot write a TUnion with no set value!");
            }
            abstractC3434az.mo15795a(abstractC3419ak.f18677b.mo15738a());
            abstractC3419ak.m15758b(abstractC3434az);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.ak$d */
    public static class d implements InterfaceC3444bi {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo15769b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        f18675c = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
    }

    public AbstractC3419ak() {
        this.f18677b = null;
        this.f18676a = null;
    }

    public AbstractC3419ak(F f, Object obj) {
        m15754a(f, obj);
    }

    public AbstractC3419ak(AbstractC3419ak<T, F> abstractC3419ak) {
        if (!abstractC3419ak.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.f18677b = abstractC3419ak.f18677b;
        this.f18676a = m15743a(abstractC3419ak.f18676a);
    }

    /* JADX INFO: renamed from: a */
    private static Object m15743a(Object obj) {
        return obj instanceof InterfaceC3409aa ? ((InterfaceC3409aa) obj).deepCopy() : obj instanceof ByteBuffer ? C3410ab.m15719d((ByteBuffer) obj) : obj instanceof List ? m15744a((List) obj) : obj instanceof Set ? m15746a((Set) obj) : obj instanceof Map ? m15745a((Map<Object, Object>) obj) : obj;
    }

    /* JADX INFO: renamed from: a */
    private static List m15744a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m15743a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private static Map m15745a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(m15743a(entry.getKey()), m15743a(entry.getValue()));
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private static Set m15746a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m15743a(it.next()));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public F m15747a() {
        return this.f18677b;
    }

    /* JADX INFO: renamed from: a */
    public abstract F m15748a(short s);

    /* JADX INFO: renamed from: a */
    public Object m15749a(int i) {
        return m15750a(m15748a((short) i));
    }

    /* JADX INFO: renamed from: a */
    public Object m15750a(F f) {
        if (f == this.f18677b) {
            return m15756b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.f18677b);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object m15751a(AbstractC3434az abstractC3434az, C3429au c3429au) throws C3415ag;

    /* JADX INFO: renamed from: a */
    public abstract Object m15752a(AbstractC3434az abstractC3434az, short s) throws C3415ag;

    /* JADX INFO: renamed from: a */
    public void m15753a(int i, Object obj) {
        m15754a(m15748a((short) i), obj);
    }

    /* JADX INFO: renamed from: a */
    public void m15754a(F f, Object obj) {
        m15757b(f, obj);
        this.f18677b = f;
        this.f18676a = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract void m15755a(AbstractC3434az abstractC3434az) throws C3415ag;

    /* JADX INFO: renamed from: b */
    public Object m15756b() {
        return this.f18676a;
    }

    /* JADX INFO: renamed from: b */
    public abstract void m15757b(F f, Object obj) throws ClassCastException;

    /* JADX INFO: renamed from: b */
    public abstract void m15758b(AbstractC3434az abstractC3434az) throws C3415ag;

    /* JADX INFO: renamed from: b */
    public boolean m15759b(int i) {
        return m15760b(m15748a((short) i));
    }

    /* JADX INFO: renamed from: b */
    public boolean m15760b(F f) {
        return this.f18677b == f;
    }

    /* JADX INFO: renamed from: c */
    public abstract C3429au m15761c(F f);

    /* JADX INFO: renamed from: c */
    public boolean m15762c() {
        return this.f18677b != null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public final void clear() {
        this.f18677b = null;
        this.f18676a = null;
    }

    /* JADX INFO: renamed from: d */
    public abstract C3440be m15763d();

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f18675c.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(C4196o4.OooO00o.OooO0Oo);
        if (m15747a() != null) {
            Object objM15756b = m15756b();
            sb.append(m15761c(m15747a()).f18740a);
            sb.append(":");
            if (objM15756b instanceof ByteBuffer) {
                C3410ab.m15714a((ByteBuffer) objM15756b, sb);
            } else {
                sb.append(objM15756b.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f18675c.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
