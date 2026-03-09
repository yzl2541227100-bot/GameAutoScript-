package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.AbstractC3434az;
import com.umeng.commonsdk.proguard.AbstractC3445bj;
import com.umeng.commonsdk.proguard.AbstractC3446bk;
import com.umeng.commonsdk.proguard.C3415ag;
import com.umeng.commonsdk.proguard.C3421am;
import com.umeng.commonsdk.proguard.C3422an;
import com.umeng.commonsdk.proguard.C3424ap;
import com.umeng.commonsdk.proguard.C3426ar;
import com.umeng.commonsdk.proguard.C3428at;
import com.umeng.commonsdk.proguard.C3429au;
import com.umeng.commonsdk.proguard.C3431aw;
import com.umeng.commonsdk.proguard.C3436ba;
import com.umeng.commonsdk.proguard.C3440be;
import com.umeng.commonsdk.proguard.C3441bf;
import com.umeng.commonsdk.proguard.C3442bg;
import com.umeng.commonsdk.proguard.C3447bl;
import com.umeng.commonsdk.proguard.C3473x;
import com.umeng.commonsdk.proguard.InterfaceC3409aa;
import com.umeng.commonsdk.proguard.InterfaceC3416ah;
import com.umeng.commonsdk.proguard.InterfaceC3443bh;
import com.umeng.commonsdk.proguard.InterfaceC3444bi;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d */
/* JADX INFO: loaded from: classes2.dex */
public class C3527d implements InterfaceC3409aa<C3527d, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map<e, C3421am> f19352d;

    /* JADX INFO: renamed from: e */
    private static final long f19353e = 2846460275012375038L;

    /* JADX INFO: renamed from: f */
    private static final C3440be f19354f = new C3440be("Imprint");

    /* JADX INFO: renamed from: g */
    private static final C3429au f19355g = new C3429au("property", C3442bg.f18781k, 1);

    /* JADX INFO: renamed from: h */
    private static final C3429au f19356h = new C3429au("version", (byte) 8, 2);

    /* JADX INFO: renamed from: i */
    private static final C3429au f19357i = new C3429au("checksum", (byte) 11, 3);

    /* JADX INFO: renamed from: j */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19358j;

    /* JADX INFO: renamed from: k */
    private static final int f19359k = 0;

    /* JADX INFO: renamed from: a */
    public Map<String, C3528e> f19360a;

    /* JADX INFO: renamed from: b */
    public int f19361b;

    /* JADX INFO: renamed from: c */
    public String f19362c;

    /* JADX INFO: renamed from: l */
    private byte f19363l;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    public static class a extends AbstractC3445bj<C3527d> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x003e  */
        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15766b(com.umeng.commonsdk.proguard.AbstractC3434az r7, com.umeng.commonsdk.statistics.proto.C3527d r8) throws com.umeng.commonsdk.proguard.C3415ag {
            /*
                r6 = this;
                r7.mo15808j()
            L3:
                com.umeng.commonsdk.proguard.au r0 = r7.mo15810l()
                byte r1 = r0.f18741b
                if (r1 != 0) goto L33
                r7.mo15809k()
                boolean r7 = r8.m16576h()
                if (r7 == 0) goto L18
                r8.m16580l()
                return
            L18:
                com.umeng.commonsdk.proguard.ba r7 = new com.umeng.commonsdk.proguard.ba
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Required field 'version' was not found in serialized data! Struct: "
                r8.append(r0)
                java.lang.String r0 = r6.toString()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
            L33:
                short r0 = r0.f18742c
                r2 = 2
                r3 = 1
                if (r0 == r3) goto L5e
                if (r0 == r2) goto L50
                r2 = 3
                if (r0 == r2) goto L42
            L3e:
                com.umeng.commonsdk.proguard.C3438bc.m15856a(r7, r1)
                goto L90
            L42:
                r0 = 11
                if (r1 != r0) goto L3e
                java.lang.String r0 = r7.mo15824z()
                r8.f19362c = r0
                r8.m16571c(r3)
                goto L90
            L50:
                r0 = 8
                if (r1 != r0) goto L3e
                int r0 = r7.mo15821w()
                r8.f19361b = r0
                r8.m16569b(r3)
                goto L90
            L5e:
                r0 = 13
                if (r1 != r0) goto L3e
                com.umeng.commonsdk.proguard.aw r0 = r7.mo15812n()
                java.util.HashMap r1 = new java.util.HashMap
                int r4 = r0.f18747c
                int r4 = r4 * 2
                r1.<init>(r4)
                r8.f19360a = r1
                r1 = 0
            L72:
                int r2 = r0.f18747c
                if (r1 >= r2) goto L8a
                java.lang.String r2 = r7.mo15824z()
                com.umeng.commonsdk.statistics.proto.e r4 = new com.umeng.commonsdk.statistics.proto.e
                r4.<init>()
                r4.read(r7)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.e> r5 = r8.f19360a
                r5.put(r2, r4)
                int r1 = r1 + 1
                goto L72
            L8a:
                r7.mo15813o()
                r8.m16566a(r3)
            L90:
                r7.mo15811m()
                goto L3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.proto.C3527d.a.mo15766b(com.umeng.commonsdk.proguard.az, com.umeng.commonsdk.statistics.proto.d):void");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15764a(AbstractC3434az abstractC3434az, C3527d c3527d) throws C3415ag {
            c3527d.m16580l();
            abstractC3434az.mo15792a(C3527d.f19354f);
            if (c3527d.f19360a != null) {
                abstractC3434az.mo15787a(C3527d.f19355g);
                abstractC3434az.mo15789a(new C3431aw((byte) 11, (byte) 12, c3527d.f19360a.size()));
                for (Map.Entry<String, C3528e> entry : c3527d.f19360a.entrySet()) {
                    abstractC3434az.mo15793a(entry.getKey());
                    entry.getValue().write(abstractC3434az);
                }
                abstractC3434az.mo15803e();
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15787a(C3527d.f19356h);
            abstractC3434az.mo15785a(c3527d.f19361b);
            abstractC3434az.mo15799c();
            if (c3527d.f19362c != null) {
                abstractC3434az.mo15787a(C3527d.f19357i);
                abstractC3434az.mo15793a(c3527d.f19362c);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    public static class b implements InterfaceC3444bi {
        private b() {
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a */
        public a mo15769b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    public static class c extends AbstractC3446bk<C3527d> {
        private c() {
        }

        public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15764a(AbstractC3434az abstractC3434az, C3527d c3527d) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15785a(c3527d.f19360a.size());
            for (Map.Entry<String, C3528e> entry : c3527d.f19360a.entrySet()) {
                c3441bf.mo15793a(entry.getKey());
                entry.getValue().write(c3441bf);
            }
            c3441bf.mo15785a(c3527d.f19361b);
            c3441bf.mo15793a(c3527d.f19362c);
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15766b(AbstractC3434az abstractC3434az, C3527d c3527d) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            C3431aw c3431aw = new C3431aw((byte) 11, (byte) 12, c3441bf.mo15821w());
            c3527d.f19360a = new HashMap(c3431aw.f18747c * 2);
            for (int i = 0; i < c3431aw.f18747c; i++) {
                String strMo15824z = c3441bf.mo15824z();
                C3528e c3528e = new C3528e();
                c3528e.read(c3441bf);
                c3527d.f19360a.put(strMo15824z, c3528e);
            }
            c3527d.m16566a(true);
            c3527d.f19361b = c3441bf.mo15821w();
            c3527d.m16569b(true);
            c3527d.f19362c = c3441bf.mo15824z();
            c3527d.m16571c(true);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$d */
    public static class d implements InterfaceC3444bi {
        private d() {
        }

        public /* synthetic */ d(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a */
        public c mo15769b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    public enum e implements InterfaceC3416ah {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* JADX INFO: renamed from: d */
        private static final Map<String, e> f19367d = new HashMap();

        /* JADX INFO: renamed from: e */
        private final short f19369e;

        /* JADX INFO: renamed from: f */
        private final String f19370f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19367d.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19369e = s;
            this.f19370f = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16587a(int i) {
            if (i == 1) {
                return PROPERTY;
            }
            if (i == 2) {
                return VERSION;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* JADX INFO: renamed from: a */
        public static e m16588a(String str) {
            return f19367d.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16589b(int i) {
            e eVarM16587a = m16587a(i);
            if (eVarM16587a != null) {
                return eVarM16587a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19369e;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19370f;
        }
    }

    static {
        HashMap map = new HashMap();
        f19358j = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new C3421am("property", (byte) 1, new C3424ap(C3442bg.f18781k, new C3422an((byte) 11), new C3426ar((byte) 12, C3528e.class))));
        enumMap.put(e.VERSION, new C3421am("version", (byte) 1, new C3422an((byte) 8)));
        enumMap.put(e.CHECKSUM, new C3421am("checksum", (byte) 1, new C3422an((byte) 11)));
        Map<e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f19352d = mapUnmodifiableMap;
        C3421am.m15774a(C3527d.class, mapUnmodifiableMap);
    }

    public C3527d() {
        this.f19363l = (byte) 0;
    }

    public C3527d(C3527d c3527d) {
        this.f19363l = (byte) 0;
        this.f19363l = c3527d.f19363l;
        if (c3527d.m16573e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, C3528e> entry : c3527d.f19360a.entrySet()) {
                map.put(entry.getKey(), new C3528e(entry.getValue()));
            }
            this.f19360a = map;
        }
        this.f19361b = c3527d.f19361b;
        if (c3527d.m16579k()) {
            this.f19362c = c3527d.f19362c;
        }
    }

    public C3527d(Map<String, C3528e> map, int i, String str) {
        this();
        this.f19360a = map;
        this.f19361b = i;
        m16569b(true);
        this.f19362c = str;
    }

    /* JADX INFO: renamed from: a */
    private void m16555a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f19363l = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16556a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public C3527d deepCopy() {
        return new C3527d(this);
    }

    /* JADX INFO: renamed from: a */
    public C3527d m16562a(int i) {
        this.f19361b = i;
        m16569b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3527d m16563a(String str) {
        this.f19362c = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3527d m16564a(Map<String, C3528e> map) {
        this.f19360a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16565a(String str, C3528e c3528e) {
        if (this.f19360a == null) {
            this.f19360a = new HashMap();
        }
        this.f19360a.put(str, c3528e);
    }

    /* JADX INFO: renamed from: a */
    public void m16566a(boolean z) {
        if (z) {
            return;
        }
        this.f19360a = null;
    }

    /* JADX INFO: renamed from: b */
    public int m16567b() {
        Map<String, C3528e> map = this.f19360a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: b */
    public e fieldForId(int i) {
        return e.m16587a(i);
    }

    /* JADX INFO: renamed from: b */
    public void m16569b(boolean z) {
        this.f19363l = C3473x.m16119a(this.f19363l, 0, z);
    }

    /* JADX INFO: renamed from: c */
    public Map<String, C3528e> m16570c() {
        return this.f19360a;
    }

    /* JADX INFO: renamed from: c */
    public void m16571c(boolean z) {
        if (z) {
            return;
        }
        this.f19362c = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19360a = null;
        m16569b(false);
        this.f19361b = 0;
        this.f19362c = null;
    }

    /* JADX INFO: renamed from: d */
    public void m16572d() {
        this.f19360a = null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16573e() {
        return this.f19360a != null;
    }

    /* JADX INFO: renamed from: f */
    public int m16574f() {
        return this.f19361b;
    }

    /* JADX INFO: renamed from: g */
    public void m16575g() {
        this.f19363l = C3473x.m16131b(this.f19363l, 0);
    }

    /* JADX INFO: renamed from: h */
    public boolean m16576h() {
        return C3473x.m16127a(this.f19363l, 0);
    }

    /* JADX INFO: renamed from: i */
    public String m16577i() {
        return this.f19362c;
    }

    /* JADX INFO: renamed from: j */
    public void m16578j() {
        this.f19362c = null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m16579k() {
        return this.f19362c != null;
    }

    /* JADX INFO: renamed from: l */
    public void m16580l() throws C3415ag {
        if (this.f19360a == null) {
            throw new C3436ba("Required field 'property' was not present! Struct: " + toString());
        }
        if (this.f19362c != null) {
            return;
        }
        throw new C3436ba("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19358j.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, C3528e> map = this.f19360a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f19361b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f19362c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19358j.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
