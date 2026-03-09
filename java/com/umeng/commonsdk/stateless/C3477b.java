package com.umeng.commonsdk.stateless;

import com.sun.mail.imap.IMAPStore;
import com.umeng.commonsdk.proguard.AbstractC3434az;
import com.umeng.commonsdk.proguard.AbstractC3445bj;
import com.umeng.commonsdk.proguard.AbstractC3446bk;
import com.umeng.commonsdk.proguard.C3410ab;
import com.umeng.commonsdk.proguard.C3415ag;
import com.umeng.commonsdk.proguard.C3421am;
import com.umeng.commonsdk.proguard.C3422an;
import com.umeng.commonsdk.proguard.C3428at;
import com.umeng.commonsdk.proguard.C3429au;
import com.umeng.commonsdk.proguard.C3436ba;
import com.umeng.commonsdk.proguard.C3438bc;
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
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3477b implements InterfaceC3409aa<C3477b, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: A */
    private static final int f19064A = 2;

    /* JADX INFO: renamed from: B */
    private static final int f19065B = 3;

    /* JADX INFO: renamed from: k */
    public static final Map<e, C3421am> f19066k;

    /* JADX INFO: renamed from: l */
    private static final long f19067l = 420342210744516016L;

    /* JADX INFO: renamed from: m */
    private static final C3440be f19068m = new C3440be("UMSLEnvelope");

    /* JADX INFO: renamed from: n */
    private static final C3429au f19069n = new C3429au("version", (byte) 11, 1);

    /* JADX INFO: renamed from: o */
    private static final C3429au f19070o = new C3429au(IMAPStore.ID_ADDRESS, (byte) 11, 2);

    /* JADX INFO: renamed from: p */
    private static final C3429au f19071p = new C3429au("signature", (byte) 11, 3);

    /* JADX INFO: renamed from: q */
    private static final C3429au f19072q = new C3429au("serial_num", (byte) 8, 4);

    /* JADX INFO: renamed from: r */
    private static final C3429au f19073r = new C3429au("ts_secs", (byte) 8, 5);

    /* JADX INFO: renamed from: s */
    private static final C3429au f19074s = new C3429au("length", (byte) 8, 6);

    /* JADX INFO: renamed from: t */
    private static final C3429au f19075t = new C3429au("entity", (byte) 11, 7);

    /* JADX INFO: renamed from: u */
    private static final C3429au f19076u = new C3429au("guid", (byte) 11, 8);

    /* JADX INFO: renamed from: v */
    private static final C3429au f19077v = new C3429au("checksum", (byte) 11, 9);

    /* JADX INFO: renamed from: w */
    private static final C3429au f19078w = new C3429au("codex", (byte) 8, 10);

    /* JADX INFO: renamed from: x */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19079x;

    /* JADX INFO: renamed from: y */
    private static final int f19080y = 0;

    /* JADX INFO: renamed from: z */
    private static final int f19081z = 1;

    /* JADX INFO: renamed from: C */
    private byte f19082C;

    /* JADX INFO: renamed from: D */
    private e[] f19083D;

    /* JADX INFO: renamed from: a */
    public String f19084a;

    /* JADX INFO: renamed from: b */
    public String f19085b;

    /* JADX INFO: renamed from: c */
    public String f19086c;

    /* JADX INFO: renamed from: d */
    public int f19087d;

    /* JADX INFO: renamed from: e */
    public int f19088e;

    /* JADX INFO: renamed from: f */
    public int f19089f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f19090g;

    /* JADX INFO: renamed from: h */
    public String f19091h;

    /* JADX INFO: renamed from: i */
    public String f19092i;

    /* JADX INFO: renamed from: j */
    public int f19093j;

    /* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b$a */
    public static class a extends AbstractC3445bj<C3477b> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15766b(AbstractC3434az abstractC3434az, C3477b c3477b) throws C3415ag {
            abstractC3434az.mo15808j();
            while (true) {
                C3429au c3429auMo15810l = abstractC3434az.mo15810l();
                byte b = c3429auMo15810l.f18741b;
                if (b == 0) {
                    abstractC3434az.mo15809k();
                    if (!c3477b.m16197m()) {
                        throw new C3436ba("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c3477b.m16200p()) {
                        throw new C3436ba("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (c3477b.m16203s()) {
                        c3477b.m16162G();
                        return;
                    }
                    throw new C3436ba("Required field 'length' was not found in serialized data! Struct: " + toString());
                }
                switch (c3429auMo15810l.f18742c) {
                    case 1:
                        if (b == 11) {
                            c3477b.f19084a = abstractC3434az.mo15824z();
                            c3477b.m16168a(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 2:
                        if (b == 11) {
                            c3477b.f19085b = abstractC3434az.mo15824z();
                            c3477b.m16172b(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 3:
                        if (b == 11) {
                            c3477b.f19086c = abstractC3434az.mo15824z();
                            c3477b.m16176c(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 4:
                        if (b == 8) {
                            c3477b.f19087d = abstractC3434az.mo15821w();
                            c3477b.m16179d(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 5:
                        if (b == 8) {
                            c3477b.f19088e = abstractC3434az.mo15821w();
                            c3477b.m16184e(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 6:
                        if (b == 8) {
                            c3477b.f19089f = abstractC3434az.mo15821w();
                            c3477b.m16186f(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 7:
                        if (b == 11) {
                            c3477b.f19090g = abstractC3434az.mo15781A();
                            c3477b.m16187g(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 8:
                        if (b == 11) {
                            c3477b.f19091h = abstractC3434az.mo15824z();
                            c3477b.m16190h(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 9:
                        if (b == 11) {
                            c3477b.f19092i = abstractC3434az.mo15824z();
                            c3477b.m16192i(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 10:
                        if (b == 8) {
                            c3477b.f19093j = abstractC3434az.mo15821w();
                            c3477b.m16193j(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                }
                C3438bc.m15856a(abstractC3434az, b);
                abstractC3434az.mo15811m();
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15764a(AbstractC3434az abstractC3434az, C3477b c3477b) throws C3415ag {
            c3477b.m16162G();
            abstractC3434az.mo15792a(C3477b.f19068m);
            if (c3477b.f19084a != null) {
                abstractC3434az.mo15787a(C3477b.f19069n);
                abstractC3434az.mo15793a(c3477b.f19084a);
                abstractC3434az.mo15799c();
            }
            if (c3477b.f19085b != null) {
                abstractC3434az.mo15787a(C3477b.f19070o);
                abstractC3434az.mo15793a(c3477b.f19085b);
                abstractC3434az.mo15799c();
            }
            if (c3477b.f19086c != null) {
                abstractC3434az.mo15787a(C3477b.f19071p);
                abstractC3434az.mo15793a(c3477b.f19086c);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15787a(C3477b.f19072q);
            abstractC3434az.mo15785a(c3477b.f19087d);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15787a(C3477b.f19073r);
            abstractC3434az.mo15785a(c3477b.f19088e);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15787a(C3477b.f19074s);
            abstractC3434az.mo15785a(c3477b.f19089f);
            abstractC3434az.mo15799c();
            if (c3477b.f19090g != null) {
                abstractC3434az.mo15787a(C3477b.f19075t);
                abstractC3434az.mo15794a(c3477b.f19090g);
                abstractC3434az.mo15799c();
            }
            if (c3477b.f19091h != null) {
                abstractC3434az.mo15787a(C3477b.f19076u);
                abstractC3434az.mo15793a(c3477b.f19091h);
                abstractC3434az.mo15799c();
            }
            if (c3477b.f19092i != null) {
                abstractC3434az.mo15787a(C3477b.f19077v);
                abstractC3434az.mo15793a(c3477b.f19092i);
                abstractC3434az.mo15799c();
            }
            if (c3477b.m16161F()) {
                abstractC3434az.mo15787a(C3477b.f19078w);
                abstractC3434az.mo15785a(c3477b.f19093j);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b$b */
    public static class b implements InterfaceC3444bi {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a mo15769b() {
            return new a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b$c */
    public static class c extends AbstractC3446bk<C3477b> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15764a(AbstractC3434az abstractC3434az, C3477b c3477b) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15793a(c3477b.f19084a);
            c3441bf.mo15793a(c3477b.f19085b);
            c3441bf.mo15793a(c3477b.f19086c);
            c3441bf.mo15785a(c3477b.f19087d);
            c3441bf.mo15785a(c3477b.f19088e);
            c3441bf.mo15785a(c3477b.f19089f);
            c3441bf.mo15794a(c3477b.f19090g);
            c3441bf.mo15793a(c3477b.f19091h);
            c3441bf.mo15793a(c3477b.f19092i);
            BitSet bitSet = new BitSet();
            if (c3477b.m16161F()) {
                bitSet.set(0);
            }
            c3441bf.m15860a(bitSet, 1);
            if (c3477b.m16161F()) {
                c3441bf.mo15785a(c3477b.f19093j);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15766b(AbstractC3434az abstractC3434az, C3477b c3477b) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3477b.f19084a = c3441bf.mo15824z();
            c3477b.m16168a(true);
            c3477b.f19085b = c3441bf.mo15824z();
            c3477b.m16172b(true);
            c3477b.f19086c = c3441bf.mo15824z();
            c3477b.m16176c(true);
            c3477b.f19087d = c3441bf.mo15821w();
            c3477b.m16179d(true);
            c3477b.f19088e = c3441bf.mo15821w();
            c3477b.m16184e(true);
            c3477b.f19089f = c3441bf.mo15821w();
            c3477b.m16186f(true);
            c3477b.f19090g = c3441bf.mo15781A();
            c3477b.m16187g(true);
            c3477b.f19091h = c3441bf.mo15824z();
            c3477b.m16190h(true);
            c3477b.f19092i = c3441bf.mo15824z();
            c3477b.m16192i(true);
            if (c3441bf.m15861b(1).get(0)) {
                c3477b.f19093j = c3441bf.mo15821w();
                c3477b.m16193j(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b$d */
    public static class d implements InterfaceC3444bi {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c mo15769b() {
            return new c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.stateless.b$e */
    public enum e implements InterfaceC3416ah {
        VERSION(1, "version"),
        ADDRESS(2, IMAPStore.ID_ADDRESS),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* JADX INFO: renamed from: k */
        private static final Map<String, e> f19104k = new HashMap();

        /* JADX INFO: renamed from: l */
        private final short f19106l;

        /* JADX INFO: renamed from: m */
        private final String f19107m;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19104k.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19106l = s;
            this.f19107m = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16217a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static e m16218a(String str) {
            return f19104k.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16219b(int i) {
            e eVarM16217a = m16217a(i);
            if (eVarM16217a != null) {
                return eVarM16217a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19106l;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19107m;
        }
    }

    static {
        HashMap map = new HashMap();
        f19079x = map;
        map.put(AbstractC3445bj.class, new b());
        map.put(AbstractC3446bk.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new C3421am("version", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.ADDRESS, new C3421am(IMAPStore.ID_ADDRESS, (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.SIGNATURE, new C3421am("signature", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new C3421am("serial_num", (byte) 1, new C3422an((byte) 8)));
        enumMap.put(e.TS_SECS, new C3421am("ts_secs", (byte) 1, new C3422an((byte) 8)));
        enumMap.put(e.LENGTH, new C3421am("length", (byte) 1, new C3422an((byte) 8)));
        enumMap.put(e.ENTITY, new C3421am("entity", (byte) 1, new C3422an((byte) 11, true)));
        enumMap.put(e.GUID, new C3421am("guid", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.CHECKSUM, new C3421am("checksum", (byte) 1, new C3422an((byte) 11)));
        enumMap.put(e.CODEX, new C3421am("codex", (byte) 2, new C3422an((byte) 8)));
        Map<e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        f19066k = mapUnmodifiableMap;
        C3421am.m15774a(C3477b.class, mapUnmodifiableMap);
    }

    public C3477b() {
        this.f19082C = (byte) 0;
        this.f19083D = new e[]{e.CODEX};
    }

    public C3477b(C3477b c3477b) {
        this.f19082C = (byte) 0;
        this.f19083D = new e[]{e.CODEX};
        this.f19082C = c3477b.f19082C;
        if (c3477b.m16180d()) {
            this.f19084a = c3477b.f19084a;
        }
        if (c3477b.m16188g()) {
            this.f19085b = c3477b.f19085b;
        }
        if (c3477b.m16194j()) {
            this.f19086c = c3477b.f19086c;
        }
        this.f19087d = c3477b.f19087d;
        this.f19088e = c3477b.f19088e;
        this.f19089f = c3477b.f19089f;
        if (c3477b.m16207w()) {
            this.f19090g = C3410ab.m15719d(c3477b.f19090g);
        }
        if (c3477b.m16210z()) {
            this.f19091h = c3477b.f19091h;
        }
        if (c3477b.m16158C()) {
            this.f19092i = c3477b.f19092i;
        }
        this.f19093j = c3477b.f19093j;
    }

    public C3477b(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f19084a = str;
        this.f19085b = str2;
        this.f19086c = str3;
        this.f19087d = i;
        m16179d(true);
        this.f19088e = i2;
        m16184e(true);
        this.f19089f = i3;
        m16186f(true);
        this.f19090g = byteBuffer;
        this.f19091h = str4;
        this.f19092i = str5;
    }

    /* JADX INFO: renamed from: a */
    private void m16154a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f19082C = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16155a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: A */
    public String m16156A() {
        return this.f19092i;
    }

    /* JADX INFO: renamed from: B */
    public void m16157B() {
        this.f19092i = null;
    }

    /* JADX INFO: renamed from: C */
    public boolean m16158C() {
        return this.f19092i != null;
    }

    /* JADX INFO: renamed from: D */
    public int m16159D() {
        return this.f19093j;
    }

    /* JADX INFO: renamed from: E */
    public void m16160E() {
        this.f19082C = C3473x.m16131b(this.f19082C, 3);
    }

    /* JADX INFO: renamed from: F */
    public boolean m16161F() {
        return C3473x.m16127a(this.f19082C, 3);
    }

    /* JADX INFO: renamed from: G */
    public void m16162G() throws C3415ag {
        if (this.f19084a == null) {
            throw new C3436ba("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f19085b == null) {
            throw new C3436ba("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f19086c == null) {
            throw new C3436ba("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f19090g == null) {
            throw new C3436ba("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f19091h == null) {
            throw new C3436ba("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f19092i != null) {
            return;
        }
        throw new C3436ba("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3477b deepCopy() {
        return new C3477b(this);
    }

    /* JADX INFO: renamed from: a */
    public C3477b m16164a(int i) {
        this.f19087d = i;
        m16179d(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3477b m16165a(String str) {
        this.f19084a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3477b m16166a(ByteBuffer byteBuffer) {
        this.f19090g = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3477b m16167a(byte[] bArr) {
        m16166a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16168a(boolean z) {
        if (z) {
            return;
        }
        this.f19084a = null;
    }

    /* JADX INFO: renamed from: b */
    public C3477b m16169b(int i) {
        this.f19088e = i;
        m16184e(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C3477b m16170b(String str) {
        this.f19085b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m16171b() {
        return this.f19084a;
    }

    /* JADX INFO: renamed from: b */
    public void m16172b(boolean z) {
        if (z) {
            return;
        }
        this.f19085b = null;
    }

    /* JADX INFO: renamed from: c */
    public C3477b m16173c(int i) {
        this.f19089f = i;
        m16186f(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C3477b m16174c(String str) {
        this.f19086c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m16175c() {
        this.f19084a = null;
    }

    /* JADX INFO: renamed from: c */
    public void m16176c(boolean z) {
        if (z) {
            return;
        }
        this.f19086c = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19084a = null;
        this.f19085b = null;
        this.f19086c = null;
        m16179d(false);
        this.f19087d = 0;
        m16184e(false);
        this.f19088e = 0;
        m16186f(false);
        this.f19089f = 0;
        this.f19090g = null;
        this.f19091h = null;
        this.f19092i = null;
        m16193j(false);
        this.f19093j = 0;
    }

    /* JADX INFO: renamed from: d */
    public C3477b m16177d(int i) {
        this.f19093j = i;
        m16193j(true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C3477b m16178d(String str) {
        this.f19091h = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m16179d(boolean z) {
        this.f19082C = C3473x.m16119a(this.f19082C, 0, z);
    }

    /* JADX INFO: renamed from: d */
    public boolean m16180d() {
        return this.f19084a != null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i) {
        return e.m16217a(i);
    }

    /* JADX INFO: renamed from: e */
    public C3477b m16182e(String str) {
        this.f19092i = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public String m16183e() {
        return this.f19085b;
    }

    /* JADX INFO: renamed from: e */
    public void m16184e(boolean z) {
        this.f19082C = C3473x.m16119a(this.f19082C, 1, z);
    }

    /* JADX INFO: renamed from: f */
    public void m16185f() {
        this.f19085b = null;
    }

    /* JADX INFO: renamed from: f */
    public void m16186f(boolean z) {
        this.f19082C = C3473x.m16119a(this.f19082C, 2, z);
    }

    /* JADX INFO: renamed from: g */
    public void m16187g(boolean z) {
        if (z) {
            return;
        }
        this.f19090g = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16188g() {
        return this.f19085b != null;
    }

    /* JADX INFO: renamed from: h */
    public String m16189h() {
        return this.f19086c;
    }

    /* JADX INFO: renamed from: h */
    public void m16190h(boolean z) {
        if (z) {
            return;
        }
        this.f19091h = null;
    }

    /* JADX INFO: renamed from: i */
    public void m16191i() {
        this.f19086c = null;
    }

    /* JADX INFO: renamed from: i */
    public void m16192i(boolean z) {
        if (z) {
            return;
        }
        this.f19092i = null;
    }

    /* JADX INFO: renamed from: j */
    public void m16193j(boolean z) {
        this.f19082C = C3473x.m16119a(this.f19082C, 3, z);
    }

    /* JADX INFO: renamed from: j */
    public boolean m16194j() {
        return this.f19086c != null;
    }

    /* JADX INFO: renamed from: k */
    public int m16195k() {
        return this.f19087d;
    }

    /* JADX INFO: renamed from: l */
    public void m16196l() {
        this.f19082C = C3473x.m16131b(this.f19082C, 0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m16197m() {
        return C3473x.m16127a(this.f19082C, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m16198n() {
        return this.f19088e;
    }

    /* JADX INFO: renamed from: o */
    public void m16199o() {
        this.f19082C = C3473x.m16131b(this.f19082C, 1);
    }

    /* JADX INFO: renamed from: p */
    public boolean m16200p() {
        return C3473x.m16127a(this.f19082C, 1);
    }

    /* JADX INFO: renamed from: q */
    public int m16201q() {
        return this.f19089f;
    }

    /* JADX INFO: renamed from: r */
    public void m16202r() {
        this.f19082C = C3473x.m16131b(this.f19082C, 2);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19079x.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    /* JADX INFO: renamed from: s */
    public boolean m16203s() {
        return C3473x.m16127a(this.f19082C, 2);
    }

    /* JADX INFO: renamed from: t */
    public byte[] m16204t() {
        m16166a(C3410ab.m15718c(this.f19090g));
        ByteBuffer byteBuffer = this.f19090g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMSLEnvelope(");
        sb.append("version:");
        String str = this.f19084a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f19085b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f19086c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f19087d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f19088e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f19089f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f19090g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C3410ab.m15714a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f19091h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f19092i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (m16161F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f19093j);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public ByteBuffer m16205u() {
        return this.f19090g;
    }

    /* JADX INFO: renamed from: v */
    public void m16206v() {
        this.f19090g = null;
    }

    /* JADX INFO: renamed from: w */
    public boolean m16207w() {
        return this.f19090g != null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19079x.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }

    /* JADX INFO: renamed from: x */
    public String m16208x() {
        return this.f19091h;
    }

    /* JADX INFO: renamed from: y */
    public void m16209y() {
        this.f19091h = null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m16210z() {
        return this.f19091h != null;
    }
}
