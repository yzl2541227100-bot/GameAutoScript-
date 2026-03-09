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

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3524a implements InterfaceC3409aa<C3524a, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Map<e, C3421am> f19291e;

    /* JADX INFO: renamed from: f */
    private static final long f19292f = 9132678615281394583L;

    /* JADX INFO: renamed from: g */
    private static final C3440be f19293g = new C3440be("IdJournal");

    /* JADX INFO: renamed from: h */
    private static final C3429au f19294h = new C3429au("domain", (byte) 11, 1);

    /* JADX INFO: renamed from: i */
    private static final C3429au f19295i = new C3429au("old_id", (byte) 11, 2);

    /* JADX INFO: renamed from: j */
    private static final C3429au f19296j = new C3429au("new_id", (byte) 11, 3);

    /* JADX INFO: renamed from: k */
    private static final C3429au f19297k = new C3429au("ts", (byte) 10, 4);

    /* JADX INFO: renamed from: l */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19298l;

    /* JADX INFO: renamed from: m */
    private static final int f19299m = 0;

    /* JADX INFO: renamed from: a */
    public String f19300a;

    /* JADX INFO: renamed from: b */
    public String f19301b;

    /* JADX INFO: renamed from: c */
    public String f19302c;

    /* JADX INFO: renamed from: d */
    public long f19303d;

    /* JADX INFO: renamed from: n */
    private byte f19304n;

    /* JADX INFO: renamed from: o */
    private e[] f19305o;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    public static class a extends AbstractC3445bj<C3524a> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0043  */
        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15766b(com.umeng.commonsdk.proguard.AbstractC3434az r6, com.umeng.commonsdk.statistics.proto.C3524a r7) throws com.umeng.commonsdk.proguard.C3415ag {
            /*
                r5 = this;
                r6.mo15808j()
            L3:
                com.umeng.commonsdk.proguard.au r0 = r6.mo15810l()
                byte r1 = r0.f18741b
                if (r1 != 0) goto L33
                r6.mo15809k()
                boolean r6 = r7.m16473m()
                if (r6 == 0) goto L18
                r7.m16474n()
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
                if (r0 == r3) goto L6d
                r4 = 2
                if (r0 == r4) goto L61
                r4 = 3
                if (r0 == r4) goto L55
                r2 = 4
                if (r0 == r2) goto L47
            L43:
                com.umeng.commonsdk.proguard.C3438bc.m15856a(r6, r1)
                goto L78
            L47:
                r0 = 10
                if (r1 != r0) goto L43
                long r0 = r6.mo15822x()
                r7.f19303d = r0
                r7.m16463d(r3)
                goto L78
            L55:
                if (r1 != r2) goto L43
                java.lang.String r0 = r6.mo15824z()
                r7.f19302c = r0
                r7.m16462c(r3)
                goto L78
            L61:
                if (r1 != r2) goto L43
                java.lang.String r0 = r6.mo15824z()
                r7.f19301b = r0
                r7.m16459b(r3)
                goto L78
            L6d:
                if (r1 != r2) goto L43
                java.lang.String r0 = r6.mo15824z()
                r7.f19300a = r0
                r7.m16456a(r3)
            L78:
                r6.mo15811m()
                goto L3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.proto.C3524a.a.mo15766b(com.umeng.commonsdk.proguard.az, com.umeng.commonsdk.statistics.proto.a):void");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15764a(AbstractC3434az abstractC3434az, C3524a c3524a) throws C3415ag {
            c3524a.m16474n();
            abstractC3434az.mo15792a(C3524a.f19293g);
            if (c3524a.f19300a != null) {
                abstractC3434az.mo15787a(C3524a.f19294h);
                abstractC3434az.mo15793a(c3524a.f19300a);
                abstractC3434az.mo15799c();
            }
            if (c3524a.f19301b != null && c3524a.m16467g()) {
                abstractC3434az.mo15787a(C3524a.f19295i);
                abstractC3434az.mo15793a(c3524a.f19301b);
                abstractC3434az.mo15799c();
            }
            if (c3524a.f19302c != null) {
                abstractC3434az.mo15787a(C3524a.f19296j);
                abstractC3434az.mo15793a(c3524a.f19302c);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15787a(C3524a.f19297k);
            abstractC3434az.mo15786a(c3524a.f19303d);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$b */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    public static class c extends AbstractC3446bk<C3524a> {
        private c() {
        }

        public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15764a(AbstractC3434az abstractC3434az, C3524a c3524a) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15793a(c3524a.f19300a);
            c3441bf.mo15793a(c3524a.f19302c);
            c3441bf.mo15786a(c3524a.f19303d);
            BitSet bitSet = new BitSet();
            if (c3524a.m16467g()) {
                bitSet.set(0);
            }
            c3441bf.m15860a(bitSet, 1);
            if (c3524a.m16467g()) {
                c3441bf.mo15793a(c3524a.f19301b);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15766b(AbstractC3434az abstractC3434az, C3524a c3524a) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3524a.f19300a = c3441bf.mo15824z();
            c3524a.m16456a(true);
            c3524a.f19302c = c3441bf.mo15824z();
            c3524a.m16462c(true);
            c3524a.f19303d = c3441bf.mo15822x();
            c3524a.m16463d(true);
            if (c3441bf.m15861b(1).get(0)) {
                c3524a.f19301b = c3441bf.mo15824z();
                c3524a.m16459b(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$d */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    public enum e implements InterfaceC3416ah {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* JADX INFO: renamed from: e */
        private static final Map<String, e> f19310e = new HashMap();

        /* JADX INFO: renamed from: f */
        private final short f19312f;

        /* JADX INFO: renamed from: g */
        private final String f19313g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19310e.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19312f = s;
            this.f19313g = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16481a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        /* JADX INFO: renamed from: a */
        public static e m16482a(String str) {
            return f19310e.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16483b(int i) {
            e eVarM16481a = m16481a(i);
            if (eVarM16481a != null) {
                return eVarM16481a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19312f;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19313g;
        }
    }

    static {
        HashMap map = new HashMap();
        f19298l = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new C3421am("domain", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.OLD_ID, new C3421am("old_id", (byte) 2, new C3422an((byte) 11)));
        enumMap.put(e.NEW_ID, new C3421am("new_id", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.TS, new C3421am("ts", (byte) 1, new C3422an((byte) 10)));
        Map<e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f19291e = mapUnmodifiableMap;
        C3421am.m15774a(C3524a.class, mapUnmodifiableMap);
    }

    public C3524a() {
        this.f19304n = (byte) 0;
        this.f19305o = new e[]{e.OLD_ID};
    }

    public C3524a(C3524a c3524a) {
        this.f19304n = (byte) 0;
        this.f19305o = new e[]{e.OLD_ID};
        this.f19304n = c3524a.f19304n;
        if (c3524a.m16464d()) {
            this.f19300a = c3524a.f19300a;
        }
        if (c3524a.m16467g()) {
            this.f19301b = c3524a.f19301b;
        }
        if (c3524a.m16470j()) {
            this.f19302c = c3524a.f19302c;
        }
        this.f19303d = c3524a.f19303d;
    }

    public C3524a(String str, String str2, long j) {
        this();
        this.f19300a = str;
        this.f19302c = str2;
        this.f19303d = j;
        m16463d(true);
    }

    /* JADX INFO: renamed from: a */
    private void m16445a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f19304n = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16446a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public e fieldForId(int i) {
        return e.m16481a(i);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public C3524a deepCopy() {
        return new C3524a(this);
    }

    /* JADX INFO: renamed from: a */
    public C3524a m16454a(long j) {
        this.f19303d = j;
        m16463d(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3524a m16455a(String str) {
        this.f19300a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16456a(boolean z) {
        if (z) {
            return;
        }
        this.f19300a = null;
    }

    /* JADX INFO: renamed from: b */
    public C3524a m16457b(String str) {
        this.f19301b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m16458b() {
        return this.f19300a;
    }

    /* JADX INFO: renamed from: b */
    public void m16459b(boolean z) {
        if (z) {
            return;
        }
        this.f19301b = null;
    }

    /* JADX INFO: renamed from: c */
    public C3524a m16460c(String str) {
        this.f19302c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m16461c() {
        this.f19300a = null;
    }

    /* JADX INFO: renamed from: c */
    public void m16462c(boolean z) {
        if (z) {
            return;
        }
        this.f19302c = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19300a = null;
        this.f19301b = null;
        this.f19302c = null;
        m16463d(false);
        this.f19303d = 0L;
    }

    /* JADX INFO: renamed from: d */
    public void m16463d(boolean z) {
        this.f19304n = C3473x.m16119a(this.f19304n, 0, z);
    }

    /* JADX INFO: renamed from: d */
    public boolean m16464d() {
        return this.f19300a != null;
    }

    /* JADX INFO: renamed from: e */
    public String m16465e() {
        return this.f19301b;
    }

    /* JADX INFO: renamed from: f */
    public void m16466f() {
        this.f19301b = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16467g() {
        return this.f19301b != null;
    }

    /* JADX INFO: renamed from: h */
    public String m16468h() {
        return this.f19302c;
    }

    /* JADX INFO: renamed from: i */
    public void m16469i() {
        this.f19302c = null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16470j() {
        return this.f19302c != null;
    }

    /* JADX INFO: renamed from: k */
    public long m16471k() {
        return this.f19303d;
    }

    /* JADX INFO: renamed from: l */
    public void m16472l() {
        this.f19304n = C3473x.m16131b(this.f19304n, 0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m16473m() {
        return C3473x.m16127a(this.f19304n, 0);
    }

    /* JADX INFO: renamed from: n */
    public void m16474n() throws C3415ag {
        if (this.f19300a == null) {
            throw new C3436ba("Required field 'domain' was not present! Struct: " + toString());
        }
        if (this.f19302c != null) {
            return;
        }
        throw new C3436ba("Required field 'new_id' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19298l.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f19300a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m16467g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f19301b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f19302c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f19303d);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19298l.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
