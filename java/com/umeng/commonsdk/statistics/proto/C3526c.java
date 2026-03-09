package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.AbstractC3434az;
import com.umeng.commonsdk.proguard.AbstractC3445bj;
import com.umeng.commonsdk.proguard.AbstractC3446bk;
import com.umeng.commonsdk.proguard.C3415ag;
import com.umeng.commonsdk.proguard.C3421am;
import com.umeng.commonsdk.proguard.C3422an;
import com.umeng.commonsdk.proguard.C3423ao;
import com.umeng.commonsdk.proguard.C3424ap;
import com.umeng.commonsdk.proguard.C3426ar;
import com.umeng.commonsdk.proguard.C3428at;
import com.umeng.commonsdk.proguard.C3429au;
import com.umeng.commonsdk.proguard.C3430av;
import com.umeng.commonsdk.proguard.C3431aw;
import com.umeng.commonsdk.proguard.C3436ba;
import com.umeng.commonsdk.proguard.C3440be;
import com.umeng.commonsdk.proguard.C3441bf;
import com.umeng.commonsdk.proguard.C3442bg;
import com.umeng.commonsdk.proguard.C3447bl;
import com.umeng.commonsdk.proguard.InterfaceC3409aa;
import com.umeng.commonsdk.proguard.InterfaceC3416ah;
import com.umeng.commonsdk.proguard.InterfaceC3443bh;
import com.umeng.commonsdk.proguard.InterfaceC3444bi;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3526c implements InterfaceC3409aa<C3526c, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map<e, C3421am> f19334d;

    /* JADX INFO: renamed from: e */
    private static final long f19335e = -5764118265293965743L;

    /* JADX INFO: renamed from: f */
    private static final C3440be f19336f = new C3440be("IdTracking");

    /* JADX INFO: renamed from: g */
    private static final C3429au f19337g = new C3429au("snapshots", C3442bg.f18781k, 1);

    /* JADX INFO: renamed from: h */
    private static final C3429au f19338h = new C3429au("journals", C3442bg.f18783m, 2);

    /* JADX INFO: renamed from: i */
    private static final C3429au f19339i = new C3429au("checksum", (byte) 11, 3);

    /* JADX INFO: renamed from: j */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19340j;

    /* JADX INFO: renamed from: a */
    public Map<String, C3525b> f19341a;

    /* JADX INFO: renamed from: b */
    public List<C3524a> f19342b;

    /* JADX INFO: renamed from: c */
    public String f19343c;

    /* JADX INFO: renamed from: k */
    private e[] f19344k;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    public static class a extends AbstractC3445bj<C3526c> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x001e  */
        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15766b(com.umeng.commonsdk.proguard.AbstractC3434az r7, com.umeng.commonsdk.statistics.proto.C3526c r8) throws com.umeng.commonsdk.proguard.C3415ag {
            /*
                r6 = this;
                r7.mo15808j()
            L3:
                com.umeng.commonsdk.proguard.au r0 = r7.mo15810l()
                byte r1 = r0.f18741b
                if (r1 != 0) goto L12
                r7.mo15809k()
                r8.m16545n()
                return
            L12:
                short r0 = r0.f18742c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r0 == r4) goto L5c
                if (r0 == r3) goto L30
                r2 = 3
                if (r0 == r2) goto L22
            L1e:
                com.umeng.commonsdk.proguard.C3438bc.m15856a(r7, r1)
                goto L8d
            L22:
                r0 = 11
                if (r1 != r0) goto L1e
                java.lang.String r0 = r7.mo15824z()
                r8.f19343c = r0
                r8.m16534c(r4)
                goto L8d
            L30:
                r0 = 15
                if (r1 != r0) goto L1e
                com.umeng.commonsdk.proguard.av r0 = r7.mo15814p()
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.f18744b
                r1.<init>(r3)
                r8.f19342b = r1
            L41:
                int r1 = r0.f18744b
                if (r2 >= r1) goto L55
                com.umeng.commonsdk.statistics.proto.a r1 = new com.umeng.commonsdk.statistics.proto.a
                r1.<init>()
                r1.read(r7)
                java.util.List<com.umeng.commonsdk.statistics.proto.a> r3 = r8.f19342b
                r3.add(r1)
                int r2 = r2 + 1
                goto L41
            L55:
                r7.mo15815q()
                r8.m16532b(r4)
                goto L8d
            L5c:
                r0 = 13
                if (r1 != r0) goto L1e
                com.umeng.commonsdk.proguard.aw r0 = r7.mo15812n()
                java.util.HashMap r1 = new java.util.HashMap
                int r5 = r0.f18747c
                int r5 = r5 * 2
                r1.<init>(r5)
                r8.f19341a = r1
            L6f:
                int r1 = r0.f18747c
                if (r2 >= r1) goto L87
                java.lang.String r1 = r7.mo15824z()
                com.umeng.commonsdk.statistics.proto.b r3 = new com.umeng.commonsdk.statistics.proto.b
                r3.<init>()
                r3.read(r7)
                java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r5 = r8.f19341a
                r5.put(r1, r3)
                int r2 = r2 + 1
                goto L6f
            L87:
                r7.mo15813o()
                r8.m16530a(r4)
            L8d:
                r7.mo15811m()
                goto L3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.proto.C3526c.a.mo15766b(com.umeng.commonsdk.proguard.az, com.umeng.commonsdk.statistics.proto.c):void");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15764a(AbstractC3434az abstractC3434az, C3526c c3526c) throws C3415ag {
            c3526c.m16545n();
            abstractC3434az.mo15792a(C3526c.f19336f);
            if (c3526c.f19341a != null) {
                abstractC3434az.mo15787a(C3526c.f19337g);
                abstractC3434az.mo15789a(new C3431aw((byte) 11, (byte) 12, c3526c.f19341a.size()));
                for (Map.Entry<String, C3525b> entry : c3526c.f19341a.entrySet()) {
                    abstractC3434az.mo15793a(entry.getKey());
                    entry.getValue().write(abstractC3434az);
                }
                abstractC3434az.mo15803e();
                abstractC3434az.mo15799c();
            }
            if (c3526c.f19342b != null && c3526c.m16541j()) {
                abstractC3434az.mo15787a(C3526c.f19338h);
                abstractC3434az.mo15788a(new C3430av((byte) 12, c3526c.f19342b.size()));
                Iterator<C3524a> it = c3526c.f19342b.iterator();
                while (it.hasNext()) {
                    it.next().write(abstractC3434az);
                }
                abstractC3434az.mo15804f();
                abstractC3434az.mo15799c();
            }
            if (c3526c.f19343c != null && c3526c.m16544m()) {
                abstractC3434az.mo15787a(C3526c.f19339i);
                abstractC3434az.mo15793a(c3526c.f19343c);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$b */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    public static class c extends AbstractC3446bk<C3526c> {
        private c() {
        }

        public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15764a(AbstractC3434az abstractC3434az, C3526c c3526c) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15785a(c3526c.f19341a.size());
            for (Map.Entry<String, C3525b> entry : c3526c.f19341a.entrySet()) {
                c3441bf.mo15793a(entry.getKey());
                entry.getValue().write(c3441bf);
            }
            BitSet bitSet = new BitSet();
            if (c3526c.m16541j()) {
                bitSet.set(0);
            }
            if (c3526c.m16544m()) {
                bitSet.set(1);
            }
            c3441bf.m15860a(bitSet, 2);
            if (c3526c.m16541j()) {
                c3441bf.mo15785a(c3526c.f19342b.size());
                Iterator<C3524a> it = c3526c.f19342b.iterator();
                while (it.hasNext()) {
                    it.next().write(c3441bf);
                }
            }
            if (c3526c.m16544m()) {
                c3441bf.mo15793a(c3526c.f19343c);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15766b(AbstractC3434az abstractC3434az, C3526c c3526c) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            C3431aw c3431aw = new C3431aw((byte) 11, (byte) 12, c3441bf.mo15821w());
            c3526c.f19341a = new HashMap(c3431aw.f18747c * 2);
            for (int i = 0; i < c3431aw.f18747c; i++) {
                String strMo15824z = c3441bf.mo15824z();
                C3525b c3525b = new C3525b();
                c3525b.read(c3441bf);
                c3526c.f19341a.put(strMo15824z, c3525b);
            }
            c3526c.m16530a(true);
            BitSet bitSetM15861b = c3441bf.m15861b(2);
            if (bitSetM15861b.get(0)) {
                C3430av c3430av = new C3430av((byte) 12, c3441bf.mo15821w());
                c3526c.f19342b = new ArrayList(c3430av.f18744b);
                for (int i2 = 0; i2 < c3430av.f18744b; i2++) {
                    C3524a c3524a = new C3524a();
                    c3524a.read(c3441bf);
                    c3526c.f19342b.add(c3524a);
                }
                c3526c.m16532b(true);
            }
            if (bitSetM15861b.get(1)) {
                c3526c.f19343c = c3441bf.mo15824z();
                c3526c.m16534c(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$d */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    public enum e implements InterfaceC3416ah {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* JADX INFO: renamed from: d */
        private static final Map<String, e> f19348d = new HashMap();

        /* JADX INFO: renamed from: e */
        private final short f19350e;

        /* JADX INFO: renamed from: f */
        private final String f19351f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19348d.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19350e = s;
            this.f19351f = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16552a(int i) {
            if (i == 1) {
                return SNAPSHOTS;
            }
            if (i == 2) {
                return JOURNALS;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* JADX INFO: renamed from: a */
        public static e m16553a(String str) {
            return f19348d.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16554b(int i) {
            e eVarM16552a = m16552a(i);
            if (eVarM16552a != null) {
                return eVarM16552a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19350e;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19351f;
        }
    }

    static {
        HashMap map = new HashMap();
        f19340j = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new C3421am("snapshots", (byte) 1, new C3424ap(C3442bg.f18781k, new C3422an((byte) 11), new C3426ar((byte) 12, C3525b.class))));
        enumMap.put(e.JOURNALS, new C3421am("journals", (byte) 2, new C3423ao(C3442bg.f18783m, new C3426ar((byte) 12, C3524a.class))));
        enumMap.put(e.CHECKSUM, new C3421am("checksum", (byte) 2, new C3422an((byte) 11)));
        Map<e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f19334d = mapUnmodifiableMap;
        C3421am.m15774a(C3526c.class, mapUnmodifiableMap);
    }

    public C3526c() {
        this.f19344k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public C3526c(C3526c c3526c) {
        this.f19344k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (c3526c.m16536e()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, C3525b> entry : c3526c.f19341a.entrySet()) {
                map.put(entry.getKey(), new C3525b(entry.getValue()));
            }
            this.f19341a = map;
        }
        if (c3526c.m16541j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C3524a> it = c3526c.f19342b.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3524a(it.next()));
            }
            this.f19342b = arrayList;
        }
        if (c3526c.m16544m()) {
            this.f19343c = c3526c.f19343c;
        }
    }

    public C3526c(Map<String, C3525b> map) {
        this();
        this.f19341a = map;
    }

    /* JADX INFO: renamed from: a */
    private void m16517a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16518a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public e fieldForId(int i) {
        return e.m16552a(i);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public C3526c deepCopy() {
        return new C3526c(this);
    }

    /* JADX INFO: renamed from: a */
    public C3526c m16525a(String str) {
        this.f19343c = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3526c m16526a(List<C3524a> list) {
        this.f19342b = list;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3526c m16527a(Map<String, C3525b> map) {
        this.f19341a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16528a(C3524a c3524a) {
        if (this.f19342b == null) {
            this.f19342b = new ArrayList();
        }
        this.f19342b.add(c3524a);
    }

    /* JADX INFO: renamed from: a */
    public void m16529a(String str, C3525b c3525b) {
        if (this.f19341a == null) {
            this.f19341a = new HashMap();
        }
        this.f19341a.put(str, c3525b);
    }

    /* JADX INFO: renamed from: a */
    public void m16530a(boolean z) {
        if (z) {
            return;
        }
        this.f19341a = null;
    }

    /* JADX INFO: renamed from: b */
    public int m16531b() {
        Map<String, C3525b> map = this.f19341a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* JADX INFO: renamed from: b */
    public void m16532b(boolean z) {
        if (z) {
            return;
        }
        this.f19342b = null;
    }

    /* JADX INFO: renamed from: c */
    public Map<String, C3525b> m16533c() {
        return this.f19341a;
    }

    /* JADX INFO: renamed from: c */
    public void m16534c(boolean z) {
        if (z) {
            return;
        }
        this.f19343c = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19341a = null;
        this.f19342b = null;
        this.f19343c = null;
    }

    /* JADX INFO: renamed from: d */
    public void m16535d() {
        this.f19341a = null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16536e() {
        return this.f19341a != null;
    }

    /* JADX INFO: renamed from: f */
    public int m16537f() {
        List<C3524a> list = this.f19342b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: g */
    public Iterator<C3524a> m16538g() {
        List<C3524a> list = this.f19342b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* JADX INFO: renamed from: h */
    public List<C3524a> m16539h() {
        return this.f19342b;
    }

    /* JADX INFO: renamed from: i */
    public void m16540i() {
        this.f19342b = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16541j() {
        return this.f19342b != null;
    }

    /* JADX INFO: renamed from: k */
    public String m16542k() {
        return this.f19343c;
    }

    /* JADX INFO: renamed from: l */
    public void m16543l() {
        this.f19343c = null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m16544m() {
        return this.f19343c != null;
    }

    /* JADX INFO: renamed from: n */
    public void m16545n() throws C3415ag {
        if (this.f19341a != null) {
            return;
        }
        throw new C3436ba("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19340j.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, C3525b> map = this.f19341a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (m16541j()) {
            sb.append(", ");
            sb.append("journals:");
            List<C3524a> list = this.f19342b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m16544m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f19343c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19340j.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
