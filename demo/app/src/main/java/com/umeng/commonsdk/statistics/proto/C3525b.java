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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3525b implements InterfaceC3409aa<C3525b, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: d */
    public static final Map<e, C3421am> f19314d;

    /* JADX INFO: renamed from: e */
    private static final long f19315e = -6496538196005191531L;

    /* JADX INFO: renamed from: f */
    private static final C3440be f19316f = new C3440be("IdSnapshot");

    /* JADX INFO: renamed from: g */
    private static final C3429au f19317g = new C3429au("identity", (byte) 11, 1);

    /* JADX INFO: renamed from: h */
    private static final C3429au f19318h = new C3429au("ts", (byte) 10, 2);

    /* JADX INFO: renamed from: i */
    private static final C3429au f19319i = new C3429au("version", (byte) 8, 3);

    /* JADX INFO: renamed from: j */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19320j;

    /* JADX INFO: renamed from: k */
    private static final int f19321k = 0;

    /* JADX INFO: renamed from: l */
    private static final int f19322l = 1;

    /* JADX INFO: renamed from: a */
    public String f19323a;

    /* JADX INFO: renamed from: b */
    public long f19324b;

    /* JADX INFO: renamed from: c */
    public int f19325c;

    /* JADX INFO: renamed from: m */
    private byte f19326m;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    public static class a extends AbstractC3445bj<C3525b> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x005f  */
        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15766b(com.umeng.commonsdk.proguard.AbstractC3434az r5, com.umeng.commonsdk.statistics.proto.C3525b r6) throws com.umeng.commonsdk.proguard.C3415ag {
            /*
                r4 = this;
                r5.mo15808j()
            L3:
                com.umeng.commonsdk.proguard.au r0 = r5.mo15810l()
                byte r1 = r0.f18741b
                if (r1 != 0) goto L54
                r5.mo15809k()
                boolean r5 = r6.m16503g()
                if (r5 == 0) goto L39
                boolean r5 = r6.m16506j()
                if (r5 == 0) goto L1e
                r6.m16507k()
                return
            L1e:
                com.umeng.commonsdk.proguard.ba r5 = new com.umeng.commonsdk.proguard.ba
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Required field 'version' was not found in serialized data! Struct: "
                r6.append(r0)
                java.lang.String r0 = r4.toString()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L39:
                com.umeng.commonsdk.proguard.ba r5 = new com.umeng.commonsdk.proguard.ba
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Required field 'ts' was not found in serialized data! Struct: "
                r6.append(r0)
                java.lang.String r0 = r4.toString()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L54:
                short r0 = r0.f18742c
                r2 = 1
                if (r0 == r2) goto L7f
                r3 = 2
                if (r0 == r3) goto L71
                r3 = 3
                if (r0 == r3) goto L63
            L5f:
                com.umeng.commonsdk.proguard.C3438bc.m15856a(r5, r1)
                goto L8c
            L63:
                r0 = 8
                if (r1 != r0) goto L5f
                int r0 = r5.mo15821w()
                r6.f19325c = r0
                r6.m16499c(r2)
                goto L8c
            L71:
                r0 = 10
                if (r1 != r0) goto L5f
                long r0 = r5.mo15822x()
                r6.f19324b = r0
                r6.m16497b(r2)
                goto L8c
            L7f:
                r0 = 11
                if (r1 != r0) goto L5f
                java.lang.String r0 = r5.mo15824z()
                r6.f19323a = r0
                r6.m16494a(r2)
            L8c:
                r5.mo15811m()
                goto L3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.proto.C3525b.a.mo15766b(com.umeng.commonsdk.proguard.az, com.umeng.commonsdk.statistics.proto.b):void");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15764a(AbstractC3434az abstractC3434az, C3525b c3525b) throws C3415ag {
            c3525b.m16507k();
            abstractC3434az.mo15792a(C3525b.f19316f);
            if (c3525b.f19323a != null) {
                abstractC3434az.mo15787a(C3525b.f19317g);
                abstractC3434az.mo15793a(c3525b.f19323a);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15787a(C3525b.f19318h);
            abstractC3434az.mo15786a(c3525b.f19324b);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15787a(C3525b.f19319i);
            abstractC3434az.mo15785a(c3525b.f19325c);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    public static class c extends AbstractC3446bk<C3525b> {
        private c() {
        }

        public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15764a(AbstractC3434az abstractC3434az, C3525b c3525b) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15793a(c3525b.f19323a);
            c3441bf.mo15786a(c3525b.f19324b);
            c3441bf.mo15785a(c3525b.f19325c);
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15766b(AbstractC3434az abstractC3434az, C3525b c3525b) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3525b.f19323a = c3441bf.mo15824z();
            c3525b.m16494a(true);
            c3525b.f19324b = c3441bf.mo15822x();
            c3525b.m16497b(true);
            c3525b.f19325c = c3441bf.mo15821w();
            c3525b.m16499c(true);
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$d */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    public enum e implements InterfaceC3416ah {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");


        /* JADX INFO: renamed from: d */
        private static final Map<String, e> f19330d = new HashMap();

        /* JADX INFO: renamed from: e */
        private final short f19332e;

        /* JADX INFO: renamed from: f */
        private final String f19333f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19330d.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19332e = s;
            this.f19333f = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16514a(int i) {
            if (i == 1) {
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
        }

        /* JADX INFO: renamed from: a */
        public static e m16515a(String str) {
            return f19330d.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16516b(int i) {
            e eVarM16514a = m16514a(i);
            if (eVarM16514a != null) {
                return eVarM16514a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19332e;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19333f;
        }
    }

    static {
        HashMap map = new HashMap();
        f19320j = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new C3421am("identity", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.TS, new C3421am("ts", (byte) 1, new C3422an((byte) 10)));
        enumMap.put(e.VERSION, new C3421am("version", (byte) 1, new C3422an((byte) 8)));
        Map<e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f19314d = mapUnmodifiableMap;
        C3421am.m15774a(C3525b.class, mapUnmodifiableMap);
    }

    public C3525b() {
        this.f19326m = (byte) 0;
    }

    public C3525b(C3525b c3525b) {
        this.f19326m = (byte) 0;
        this.f19326m = c3525b.f19326m;
        if (c3525b.m16500d()) {
            this.f19323a = c3525b.f19323a;
        }
        this.f19324b = c3525b.f19324b;
        this.f19325c = c3525b.f19325c;
    }

    public C3525b(String str, long j, int i) {
        this();
        this.f19323a = str;
        this.f19324b = j;
        m16497b(true);
        this.f19325c = i;
        m16499c(true);
    }

    /* JADX INFO: renamed from: a */
    private void m16484a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f19326m = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16485a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public C3525b deepCopy() {
        return new C3525b(this);
    }

    /* JADX INFO: renamed from: a */
    public C3525b m16491a(int i) {
        this.f19325c = i;
        m16499c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3525b m16492a(long j) {
        this.f19324b = j;
        m16497b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3525b m16493a(String str) {
        this.f19323a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16494a(boolean z) {
        if (z) {
            return;
        }
        this.f19323a = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: b */
    public e fieldForId(int i) {
        return e.m16514a(i);
    }

    /* JADX INFO: renamed from: b */
    public String m16496b() {
        return this.f19323a;
    }

    /* JADX INFO: renamed from: b */
    public void m16497b(boolean z) {
        this.f19326m = C3473x.m16119a(this.f19326m, 0, z);
    }

    /* JADX INFO: renamed from: c */
    public void m16498c() {
        this.f19323a = null;
    }

    /* JADX INFO: renamed from: c */
    public void m16499c(boolean z) {
        this.f19326m = C3473x.m16119a(this.f19326m, 1, z);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19323a = null;
        m16497b(false);
        this.f19324b = 0L;
        m16499c(false);
        this.f19325c = 0;
    }

    /* JADX INFO: renamed from: d */
    public boolean m16500d() {
        return this.f19323a != null;
    }

    /* JADX INFO: renamed from: e */
    public long m16501e() {
        return this.f19324b;
    }

    /* JADX INFO: renamed from: f */
    public void m16502f() {
        this.f19326m = C3473x.m16131b(this.f19326m, 0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m16503g() {
        return C3473x.m16127a(this.f19326m, 0);
    }

    /* JADX INFO: renamed from: h */
    public int m16504h() {
        return this.f19325c;
    }

    /* JADX INFO: renamed from: i */
    public void m16505i() {
        this.f19326m = C3473x.m16131b(this.f19326m, 1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m16506j() {
        return C3473x.m16127a(this.f19326m, 1);
    }

    /* JADX INFO: renamed from: k */
    public void m16507k() throws C3415ag {
        if (this.f19323a != null) {
            return;
        }
        throw new C3436ba("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19320j.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f19323a;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f19324b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f19325c);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19320j.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
