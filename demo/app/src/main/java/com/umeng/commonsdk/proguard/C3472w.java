package com.umeng.commonsdk.proguard;

import com.sun.mail.imap.IMAPStore;
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

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.w */
/* JADX INFO: loaded from: classes2.dex */
public class C3472w implements InterfaceC3409aa<C3472w, e>, Serializable, Cloneable {

    /* JADX INFO: renamed from: A */
    private static final int f18994A = 2;

    /* JADX INFO: renamed from: B */
    private static final int f18995B = 3;

    /* JADX INFO: renamed from: k */
    public static final Map<e, C3421am> f18996k;

    /* JADX INFO: renamed from: l */
    private static final long f18997l = 420342210744516016L;

    /* JADX INFO: renamed from: m */
    private static final C3440be f18998m = new C3440be("UMEnvelope");

    /* JADX INFO: renamed from: n */
    private static final C3429au f18999n = new C3429au("version", (byte) 11, 1);

    /* JADX INFO: renamed from: o */
    private static final C3429au f19000o = new C3429au(IMAPStore.ID_ADDRESS, (byte) 11, 2);

    /* JADX INFO: renamed from: p */
    private static final C3429au f19001p = new C3429au("signature", (byte) 11, 3);

    /* JADX INFO: renamed from: q */
    private static final C3429au f19002q = new C3429au("serial_num", (byte) 8, 4);

    /* JADX INFO: renamed from: r */
    private static final C3429au f19003r = new C3429au("ts_secs", (byte) 8, 5);

    /* JADX INFO: renamed from: s */
    private static final C3429au f19004s = new C3429au("length", (byte) 8, 6);

    /* JADX INFO: renamed from: t */
    private static final C3429au f19005t = new C3429au("entity", (byte) 11, 7);

    /* JADX INFO: renamed from: u */
    private static final C3429au f19006u = new C3429au("guid", (byte) 11, 8);

    /* JADX INFO: renamed from: v */
    private static final C3429au f19007v = new C3429au("checksum", (byte) 11, 9);

    /* JADX INFO: renamed from: w */
    private static final C3429au f19008w = new C3429au("codex", (byte) 8, 10);

    /* JADX INFO: renamed from: x */
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> f19009x;

    /* JADX INFO: renamed from: y */
    private static final int f19010y = 0;

    /* JADX INFO: renamed from: z */
    private static final int f19011z = 1;

    /* JADX INFO: renamed from: C */
    private byte f19012C;

    /* JADX INFO: renamed from: D */
    private e[] f19013D;

    /* JADX INFO: renamed from: a */
    public String f19014a;

    /* JADX INFO: renamed from: b */
    public String f19015b;

    /* JADX INFO: renamed from: c */
    public String f19016c;

    /* JADX INFO: renamed from: d */
    public int f19017d;

    /* JADX INFO: renamed from: e */
    public int f19018e;

    /* JADX INFO: renamed from: f */
    public int f19019f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f19020g;

    /* JADX INFO: renamed from: h */
    public String f19021h;

    /* JADX INFO: renamed from: i */
    public String f19022i;

    /* JADX INFO: renamed from: j */
    public int f19023j;

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.w$a */
    public static class a extends AbstractC3445bj<C3472w> {
        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15766b(AbstractC3434az abstractC3434az, C3472w c3472w) throws C3415ag {
            abstractC3434az.mo15808j();
            while (true) {
                C3429au c3429auMo15810l = abstractC3434az.mo15810l();
                byte b = c3429auMo15810l.f18741b;
                if (b == 0) {
                    abstractC3434az.mo15809k();
                    if (!c3472w.m16096m()) {
                        throw new C3436ba("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    }
                    if (!c3472w.m16099p()) {
                        throw new C3436ba("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    if (c3472w.m16102s()) {
                        c3472w.m16061G();
                        return;
                    }
                    throw new C3436ba("Required field 'length' was not found in serialized data! Struct: " + toString());
                }
                switch (c3429auMo15810l.f18742c) {
                    case 1:
                        if (b == 11) {
                            c3472w.f19014a = abstractC3434az.mo15824z();
                            c3472w.m16067a(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 2:
                        if (b == 11) {
                            c3472w.f19015b = abstractC3434az.mo15824z();
                            c3472w.m16071b(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 3:
                        if (b == 11) {
                            c3472w.f19016c = abstractC3434az.mo15824z();
                            c3472w.m16075c(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 4:
                        if (b == 8) {
                            c3472w.f19017d = abstractC3434az.mo15821w();
                            c3472w.m16078d(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 5:
                        if (b == 8) {
                            c3472w.f19018e = abstractC3434az.mo15821w();
                            c3472w.m16083e(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 6:
                        if (b == 8) {
                            c3472w.f19019f = abstractC3434az.mo15821w();
                            c3472w.m16085f(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 7:
                        if (b == 11) {
                            c3472w.f19020g = abstractC3434az.mo15781A();
                            c3472w.m16086g(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 8:
                        if (b == 11) {
                            c3472w.f19021h = abstractC3434az.mo15824z();
                            c3472w.m16089h(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 9:
                        if (b == 11) {
                            c3472w.f19022i = abstractC3434az.mo15824z();
                            c3472w.m16091i(true);
                            continue;
                        }
                        abstractC3434az.mo15811m();
                        break;
                    case 10:
                        if (b == 8) {
                            c3472w.f19023j = abstractC3434az.mo15821w();
                            c3472w.m16092j(true);
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
        /* JADX INFO: renamed from: b */
        public void mo15764a(AbstractC3434az abstractC3434az, C3472w c3472w) throws C3415ag {
            c3472w.m16061G();
            abstractC3434az.mo15792a(C3472w.f18998m);
            if (c3472w.f19014a != null) {
                abstractC3434az.mo15787a(C3472w.f18999n);
                abstractC3434az.mo15793a(c3472w.f19014a);
                abstractC3434az.mo15799c();
            }
            if (c3472w.f19015b != null) {
                abstractC3434az.mo15787a(C3472w.f19000o);
                abstractC3434az.mo15793a(c3472w.f19015b);
                abstractC3434az.mo15799c();
            }
            if (c3472w.f19016c != null) {
                abstractC3434az.mo15787a(C3472w.f19001p);
                abstractC3434az.mo15793a(c3472w.f19016c);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15787a(C3472w.f19002q);
            abstractC3434az.mo15785a(c3472w.f19017d);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15787a(C3472w.f19003r);
            abstractC3434az.mo15785a(c3472w.f19018e);
            abstractC3434az.mo15799c();
            abstractC3434az.mo15787a(C3472w.f19004s);
            abstractC3434az.mo15785a(c3472w.f19019f);
            abstractC3434az.mo15799c();
            if (c3472w.f19020g != null) {
                abstractC3434az.mo15787a(C3472w.f19005t);
                abstractC3434az.mo15794a(c3472w.f19020g);
                abstractC3434az.mo15799c();
            }
            if (c3472w.f19021h != null) {
                abstractC3434az.mo15787a(C3472w.f19006u);
                abstractC3434az.mo15793a(c3472w.f19021h);
                abstractC3434az.mo15799c();
            }
            if (c3472w.f19022i != null) {
                abstractC3434az.mo15787a(C3472w.f19007v);
                abstractC3434az.mo15793a(c3472w.f19022i);
                abstractC3434az.mo15799c();
            }
            if (c3472w.m16060F()) {
                abstractC3434az.mo15787a(C3472w.f19008w);
                abstractC3434az.mo15785a(c3472w.f19023j);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.w$b */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.w$c */
    public static class c extends AbstractC3446bk<C3472w> {
        private c() {
        }

        public /* synthetic */ c(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a */
        public void mo15764a(AbstractC3434az abstractC3434az, C3472w c3472w) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15793a(c3472w.f19014a);
            c3441bf.mo15793a(c3472w.f19015b);
            c3441bf.mo15793a(c3472w.f19016c);
            c3441bf.mo15785a(c3472w.f19017d);
            c3441bf.mo15785a(c3472w.f19018e);
            c3441bf.mo15785a(c3472w.f19019f);
            c3441bf.mo15794a(c3472w.f19020g);
            c3441bf.mo15793a(c3472w.f19021h);
            c3441bf.mo15793a(c3472w.f19022i);
            BitSet bitSet = new BitSet();
            if (c3472w.m16060F()) {
                bitSet.set(0);
            }
            c3441bf.m15860a(bitSet, 1);
            if (c3472w.m16060F()) {
                c3441bf.mo15785a(c3472w.f19023j);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b */
        public void mo15766b(AbstractC3434az abstractC3434az, C3472w c3472w) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3472w.f19014a = c3441bf.mo15824z();
            c3472w.m16067a(true);
            c3472w.f19015b = c3441bf.mo15824z();
            c3472w.m16071b(true);
            c3472w.f19016c = c3441bf.mo15824z();
            c3472w.m16075c(true);
            c3472w.f19017d = c3441bf.mo15821w();
            c3472w.m16078d(true);
            c3472w.f19018e = c3441bf.mo15821w();
            c3472w.m16083e(true);
            c3472w.f19019f = c3441bf.mo15821w();
            c3472w.m16085f(true);
            c3472w.f19020g = c3441bf.mo15781A();
            c3472w.m16086g(true);
            c3472w.f19021h = c3441bf.mo15824z();
            c3472w.m16089h(true);
            c3472w.f19022i = c3441bf.mo15824z();
            c3472w.m16091i(true);
            if (c3441bf.m15861b(1).get(0)) {
                c3472w.f19023j = c3441bf.mo15821w();
                c3472w.m16092j(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.w$d */
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.proguard.w$e */
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
        private static final Map<String, e> f19034k = new HashMap();

        /* JADX INFO: renamed from: l */
        private final short f19036l;

        /* JADX INFO: renamed from: m */
        private final String f19037m;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                f19034k.put(eVar.mo15739b(), eVar);
            }
        }

        e(short s, String str) {
            this.f19036l = s;
            this.f19037m = str;
        }

        /* JADX INFO: renamed from: a */
        public static e m16116a(int i) {
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
        public static e m16117a(String str) {
            return f19034k.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static e m16118b(int i) {
            e eVarM16116a = m16116a(i);
            if (eVarM16116a != null) {
                return eVarM16116a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19036l;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19037m;
        }
    }

    static {
        HashMap map = new HashMap();
        f19009x = map;
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
        f18996k = mapUnmodifiableMap;
        C3421am.m15774a(C3472w.class, mapUnmodifiableMap);
    }

    public C3472w() {
        this.f19012C = (byte) 0;
        this.f19013D = new e[]{e.CODEX};
    }

    public C3472w(C3472w c3472w) {
        this.f19012C = (byte) 0;
        this.f19013D = new e[]{e.CODEX};
        this.f19012C = c3472w.f19012C;
        if (c3472w.m16079d()) {
            this.f19014a = c3472w.f19014a;
        }
        if (c3472w.m16087g()) {
            this.f19015b = c3472w.f19015b;
        }
        if (c3472w.m16093j()) {
            this.f19016c = c3472w.f19016c;
        }
        this.f19017d = c3472w.f19017d;
        this.f19018e = c3472w.f19018e;
        this.f19019f = c3472w.f19019f;
        if (c3472w.m16106w()) {
            this.f19020g = C3410ab.m15719d(c3472w.f19020g);
        }
        if (c3472w.m16109z()) {
            this.f19021h = c3472w.f19021h;
        }
        if (c3472w.m16057C()) {
            this.f19022i = c3472w.f19022i;
        }
        this.f19023j = c3472w.f19023j;
    }

    public C3472w(String str, String str2, String str3, int i, int i2, int i3, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f19014a = str;
        this.f19015b = str2;
        this.f19016c = str3;
        this.f19017d = i;
        m16078d(true);
        this.f19018e = i2;
        m16083e(true);
        this.f19019f = i3;
        m16085f(true);
        this.f19020g = byteBuffer;
        this.f19021h = str4;
        this.f19022i = str5;
    }

    /* JADX INFO: renamed from: a */
    private void m16053a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f19012C = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m16054a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e2) {
            throw new IOException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: A */
    public String m16055A() {
        return this.f19022i;
    }

    /* JADX INFO: renamed from: B */
    public void m16056B() {
        this.f19022i = null;
    }

    /* JADX INFO: renamed from: C */
    public boolean m16057C() {
        return this.f19022i != null;
    }

    /* JADX INFO: renamed from: D */
    public int m16058D() {
        return this.f19023j;
    }

    /* JADX INFO: renamed from: E */
    public void m16059E() {
        this.f19012C = C3473x.m16131b(this.f19012C, 3);
    }

    /* JADX INFO: renamed from: F */
    public boolean m16060F() {
        return C3473x.m16127a(this.f19012C, 3);
    }

    /* JADX INFO: renamed from: G */
    public void m16061G() throws C3415ag {
        if (this.f19014a == null) {
            throw new C3436ba("Required field 'version' was not present! Struct: " + toString());
        }
        if (this.f19015b == null) {
            throw new C3436ba("Required field 'address' was not present! Struct: " + toString());
        }
        if (this.f19016c == null) {
            throw new C3436ba("Required field 'signature' was not present! Struct: " + toString());
        }
        if (this.f19020g == null) {
            throw new C3436ba("Required field 'entity' was not present! Struct: " + toString());
        }
        if (this.f19021h == null) {
            throw new C3436ba("Required field 'guid' was not present! Struct: " + toString());
        }
        if (this.f19022i != null) {
            return;
        }
        throw new C3436ba("Required field 'checksum' was not present! Struct: " + toString());
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: a */
    public C3472w deepCopy() {
        return new C3472w(this);
    }

    /* JADX INFO: renamed from: a */
    public C3472w m16063a(int i) {
        this.f19017d = i;
        m16078d(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3472w m16064a(String str) {
        this.f19014a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3472w m16065a(ByteBuffer byteBuffer) {
        this.f19020g = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C3472w m16066a(byte[] bArr) {
        m16065a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m16067a(boolean z) {
        if (z) {
            return;
        }
        this.f19014a = null;
    }

    /* JADX INFO: renamed from: b */
    public C3472w m16068b(int i) {
        this.f19018e = i;
        m16083e(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C3472w m16069b(String str) {
        this.f19015b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public String m16070b() {
        return this.f19014a;
    }

    /* JADX INFO: renamed from: b */
    public void m16071b(boolean z) {
        if (z) {
            return;
        }
        this.f19015b = null;
    }

    /* JADX INFO: renamed from: c */
    public C3472w m16072c(int i) {
        this.f19019f = i;
        m16085f(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C3472w m16073c(String str) {
        this.f19016c = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m16074c() {
        this.f19014a = null;
    }

    /* JADX INFO: renamed from: c */
    public void m16075c(boolean z) {
        if (z) {
            return;
        }
        this.f19016c = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        this.f19014a = null;
        this.f19015b = null;
        this.f19016c = null;
        m16078d(false);
        this.f19017d = 0;
        m16083e(false);
        this.f19018e = 0;
        m16085f(false);
        this.f19019f = 0;
        this.f19020g = null;
        this.f19021h = null;
        this.f19022i = null;
        m16092j(false);
        this.f19023j = 0;
    }

    /* JADX INFO: renamed from: d */
    public C3472w m16076d(int i) {
        this.f19023j = i;
        m16092j(true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C3472w m16077d(String str) {
        this.f19021h = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m16078d(boolean z) {
        this.f19012C = C3473x.m16119a(this.f19012C, 0, z);
    }

    /* JADX INFO: renamed from: d */
    public boolean m16079d() {
        return this.f19014a != null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    /* JADX INFO: renamed from: e */
    public e fieldForId(int i) {
        return e.m16116a(i);
    }

    /* JADX INFO: renamed from: e */
    public C3472w m16081e(String str) {
        this.f19022i = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public String m16082e() {
        return this.f19015b;
    }

    /* JADX INFO: renamed from: e */
    public void m16083e(boolean z) {
        this.f19012C = C3473x.m16119a(this.f19012C, 1, z);
    }

    /* JADX INFO: renamed from: f */
    public void m16084f() {
        this.f19015b = null;
    }

    /* JADX INFO: renamed from: f */
    public void m16085f(boolean z) {
        this.f19012C = C3473x.m16119a(this.f19012C, 2, z);
    }

    /* JADX INFO: renamed from: g */
    public void m16086g(boolean z) {
        if (z) {
            return;
        }
        this.f19020g = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16087g() {
        return this.f19015b != null;
    }

    /* JADX INFO: renamed from: h */
    public String m16088h() {
        return this.f19016c;
    }

    /* JADX INFO: renamed from: h */
    public void m16089h(boolean z) {
        if (z) {
            return;
        }
        this.f19021h = null;
    }

    /* JADX INFO: renamed from: i */
    public void m16090i() {
        this.f19016c = null;
    }

    /* JADX INFO: renamed from: i */
    public void m16091i(boolean z) {
        if (z) {
            return;
        }
        this.f19022i = null;
    }

    /* JADX INFO: renamed from: j */
    public void m16092j(boolean z) {
        this.f19012C = C3473x.m16119a(this.f19012C, 3, z);
    }

    /* JADX INFO: renamed from: j */
    public boolean m16093j() {
        return this.f19016c != null;
    }

    /* JADX INFO: renamed from: k */
    public int m16094k() {
        return this.f19017d;
    }

    /* JADX INFO: renamed from: l */
    public void m16095l() {
        this.f19012C = C3473x.m16131b(this.f19012C, 0);
    }

    /* JADX INFO: renamed from: m */
    public boolean m16096m() {
        return C3473x.m16127a(this.f19012C, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m16097n() {
        return this.f19018e;
    }

    /* JADX INFO: renamed from: o */
    public void m16098o() {
        this.f19012C = C3473x.m16131b(this.f19012C, 1);
    }

    /* JADX INFO: renamed from: p */
    public boolean m16099p() {
        return C3473x.m16127a(this.f19012C, 1);
    }

    /* JADX INFO: renamed from: q */
    public int m16100q() {
        return this.f19019f;
    }

    /* JADX INFO: renamed from: r */
    public void m16101r() {
        this.f19012C = C3473x.m16131b(this.f19012C, 2);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        f19009x.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    /* JADX INFO: renamed from: s */
    public boolean m16102s() {
        return C3473x.m16127a(this.f19012C, 2);
    }

    /* JADX INFO: renamed from: t */
    public byte[] m16103t() {
        m16065a(C3410ab.m15718c(this.f19020g));
        ByteBuffer byteBuffer = this.f19020g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f19014a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f19015b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f19016c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f19017d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f19018e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f19019f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f19020g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            C3410ab.m15714a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f19021h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f19022i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (m16060F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f19023j);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public ByteBuffer m16104u() {
        return this.f19020g;
    }

    /* JADX INFO: renamed from: v */
    public void m16105v() {
        this.f19020g = null;
    }

    /* JADX INFO: renamed from: w */
    public boolean m16106w() {
        return this.f19020g != null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        f19009x.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }

    /* JADX INFO: renamed from: x */
    public String m16107x() {
        return this.f19021h;
    }

    /* JADX INFO: renamed from: y */
    public void m16108y() {
        this.f19021h = null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m16109z() {
        return this.f19021h != null;
    }
}
