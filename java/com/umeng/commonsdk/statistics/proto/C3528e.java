package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.AbstractC3434az;
import com.umeng.commonsdk.proguard.AbstractC3445bj;
import com.umeng.commonsdk.proguard.AbstractC3446bk;
import com.umeng.commonsdk.proguard.C3415ag;
import com.umeng.commonsdk.proguard.C3421am;
import com.umeng.commonsdk.proguard.C3422an;
import com.umeng.commonsdk.proguard.C3428at;
import com.umeng.commonsdk.proguard.C3429au;
import com.umeng.commonsdk.proguard.C3436ba;
import com.umeng.commonsdk.proguard.C3440be;
import com.umeng.commonsdk.proguard.C3441bf;
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
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e */
/* JADX INFO: loaded from: classes2.dex */
public class C3528e implements InterfaceC3409aa<C3528e, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map<e, C3421am> f19371d;

    /* JADX INFO: renamed from: e */
    private static final long f19372e = 7501688097813630241L;

    /* JADX INFO: renamed from: f */
    private static final C3440be f19373f = new C3440be("ImprintValue");

    /* JADX INFO: renamed from: g */
    private static final C3429au f19374g = new C3429au("value", (byte) 11, 1);

    /* JADX INFO: renamed from: h */
    private static final C3429au f19375h = new C3429au("ts", (byte) 10, 2);

    /* JADX INFO: renamed from: i */
    private static final C3429au f19376i = new C3429au("guid", (byte) 11, 3);

    /* JADX INFO: renamed from: j */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19377j;

    /* JADX INFO: renamed from: k */
    private static final int f19378k = 0;

    /* JADX INFO: renamed from: a */
    public String f19379a;

    /* JADX INFO: renamed from: b */
    public long f19380b;

    /* JADX INFO: renamed from: c */
    public String f19381c;

    /* JADX INFO: renamed from: l */
    private byte f19382l;

    /* JADX INFO: renamed from: m */
    private e[] f19383m;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    public static class a extends AbstractC3445bj<C3528e> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15766b(com.umeng.commonsdk.proguard.AbstractC3434az r6, com.umeng.commonsdk.statistics.proto.C3528e r7) throws com.umeng.commonsdk.proguard.C3415ag {
            /*
                r5 = this;
                r6.mo15808j()
            L3:
                com.umeng.commonsdk.proguard.au r0 = r6.mo15810l()
                byte r1 = r0.f18741b
                if (r1 != 0) goto L33
                r6.mo15809k()
                boolean r6 = r7.m16609g()
                if (r6 == 0) goto L18
                r7.m16613k()
                return
            L18:
                com.umeng.commonsdk.proguard.ba r6 = new com.umeng.commonsdk.proguard.ba
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Required field 'ts' was not found in serialized data! Struct: "
                r7.append(r0)
                java.lang.String r0 = r5.toString()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L33:
                short r0 = r0.f18742c
                r2 = 11
                r3 = 1
                if (r0 == r3) goto L5e
                r4 = 2
                if (r0 == r4) goto L50
                r4 = 3
                if (r0 == r4) goto L44
            L40:
                com.umeng.commonsdk.proguard.C3438bc.m15856a(r6, r1)
                goto L69
            L44:
                if (r1 != r2) goto L40
                java.lang.String r0 = r6.mo15824z()
                r7.f19381c = r0
                r7.m16605c(r3)
                goto L69
            L50:
                r0 = 10
                if (r1 != r0) goto L40
                long r0 = r6.mo15822x()
                r7.f19380b = r0
                r7.m16603b(r3)
                goto L69
            L5e:
                if (r1 != r2) goto L40
                java.lang.String r0 = r6.mo15824z()
                r7.f19379a = r0
                r7.m16600a(r3)
            L69:
                r6.mo15811m()
                goto L3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.proto.C3528e.a.mo15766b(com.umeng.commonsdk.proguard.az, com.umeng.commonsdk.statistics.proto.e):void");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15764a(AbstractC3434az abstractC3434az, C3528e c3528e) throws C3415ag {
            c3528e.m16613k();
            abstractC3434az.mo15792a(C3528e.f19373f);
            if (c3528e.f19379a != null && c3528e.m16606d()) {
                abstractC3434az.mo15787a(C3528e.f19374g);
                abstractC3434az.mo15793a(c3528e.f19379a);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15787a(C3528e.f19375h);
            abstractC3434az.mo15786a(c3528e.f19380b);
            abstractC3434az.mo15799c();
            if (c3528e.f19381c != null) {
                abstractC3434az.mo15787a(C3528e.f19376i);
                abstractC3434az.mo15793a(c3528e.f19381c);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$b */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    public static class c extends AbstractC3446bk<C3528e> {
        private c() {
        }

        public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15764a(AbstractC3434az abstractC3434az, C3528e c3528e) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15786a(c3528e.f19380b);
            c3441bf.mo15793a(c3528e.f19381c);
            BitSet bitSet = new BitSet();
            if (c3528e.m16606d()) {
                bitSet.set(0);
            }
            c3441bf.m15860a(bitSet, 1);
            if (c3528e.m16606d()) {
                c3441bf.mo15793a(c3528e.f19379a);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15766b(AbstractC3434az abstractC3434az, C3528e c3528e) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3528e.f19380b = c3441bf.mo15822x();
            c3528e.m16603b(true);
            c3528e.f19381c = c3441bf.mo15824z();
            c3528e.m16605c(true);
            if (c3441bf.m15861b(1).get(0)) {
                c3528e.f19379a = c3441bf.mo15824z();
                c3528e.m16600a(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$d */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    public enum e implements InterfaceC3416ah {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");


        /* JADX INFO: renamed from: d */
        private static final Map<String, e> f19387d = new HashMap();

        /* JADX INFO: renamed from: e */
        private final short f19389e;

        /* JADX INFO: renamed from: f */
        private final String f19390f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19387d.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19389e = s;
            this.f19390f = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16620a(int i) {
            if (i == 1) {
                return VALUE;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return GUID;
        }

        /* JADX INFO: renamed from: a */
        public static e m16621a(String str) {
            return f19387d.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16622b(int i) {
            e eVarM16620a = m16620a(i);
            if (eVarM16620a != null) {
                return eVarM16620a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19389e;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19390f;
        }
    }

    static {
        HashMap map = new HashMap();
        f19377j = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VALUE, new C3421am("value", (byte) 2, new C3422an((byte) 11)));
        enumMap.put(e.TS, new C3421am("ts", (byte) 1, new C3422an((byte) 10)));
        enumMap.put(e.GUID, new C3421am("guid", (byte) 1, new C3422an((byte) 11)));
        Map<e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f19371d = mapUnmodifiableMap;
        C3421am.m15774a(C3528e.class, mapUnmodifiableMap);
    }

    public C3528e() {
        this.f19382l = (byte) 0;
        this.f19383m = new e[]{e.VALUE};
    }

    public C3528e(long j, String str) {
        this();
        this.f19380b = j;
        m16603b(true);
        this.f19381c = str;
    }

    public C3528e(C3528e c3528e) {
        this.f19382l = (byte) 0;
        this.f19383m = new e[]{e.VALUE};
        this.f19382l = c3528e.f19382l;
        if (c3528e.m16606d()) {
            this.f19379a = c3528e.f19379a;
        }
        this.f19380b = c3528e.f19380b;
        if (c3528e.m16612j()) {
            this.f19381c = c3528e.f19381c;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16590a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f19382l = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16591a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public e fieldForId(int i) {
        return e.m16620a(i);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public C3528e deepCopy() {
        return new C3528e(this);
    }

    /* JADX INFO: renamed from: a */
    public C3528e m16598a(long j) {
        this.f19380b = j;
        m16603b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3528e m16599a(String str) {
        this.f19379a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16600a(boolean z) {
        if (z) {
            return;
        }
        this.f19379a = null;
    }

    /* JADX INFO: renamed from: b */
    public C3528e m16601b(String str) {
        this.f19381c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m16602b() {
        return this.f19379a;
    }

    /* JADX INFO: renamed from: b */
    public void m16603b(boolean z) {
        this.f19382l = C3473x.m16119a(this.f19382l, 0, z);
    }

    /* JADX INFO: renamed from: c */
    public void m16604c() {
        this.f19379a = null;
    }

    /* JADX INFO: renamed from: c */
    public void m16605c(boolean z) {
        if (z) {
            return;
        }
        this.f19381c = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19379a = null;
        m16603b(false);
        this.f19380b = 0L;
        this.f19381c = null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m16606d() {
        return this.f19379a != null;
    }

    /* JADX INFO: renamed from: e */
    public long m16607e() {
        return this.f19380b;
    }

    /* JADX INFO: renamed from: f */
    public void m16608f() {
        this.f19382l = C3473x.m16131b(this.f19382l, 0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m16609g() {
        return C3473x.m16127a(this.f19382l, 0);
    }

    /* JADX INFO: renamed from: h */
    public String m16610h() {
        return this.f19381c;
    }

    /* JADX INFO: renamed from: i */
    public void m16611i() {
        this.f19381c = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16612j() {
        return this.f19381c != null;
    }

    /* JADX INFO: renamed from: k */
    public void m16613k() throws C3415ag {
        if (this.f19381c != null) {
            return;
        }
        throw new C3436ba("Required field 'guid' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19377j.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (m16606d()) {
            sb.append("value:");
            String str = this.f19379a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f19380b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f19381c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19377j.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
