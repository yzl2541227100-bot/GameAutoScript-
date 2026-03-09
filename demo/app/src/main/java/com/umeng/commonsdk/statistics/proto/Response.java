package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.AbstractC3434az;
import com.umeng.commonsdk.proguard.AbstractC3445bj;
import com.umeng.commonsdk.proguard.AbstractC3446bk;
import com.umeng.commonsdk.proguard.C3415ag;
import com.umeng.commonsdk.proguard.C3421am;
import com.umeng.commonsdk.proguard.C3422an;
import com.umeng.commonsdk.proguard.C3426ar;
import com.umeng.commonsdk.proguard.C3428at;
import com.umeng.commonsdk.proguard.C3429au;
import com.umeng.commonsdk.proguard.C3440be;
import com.umeng.commonsdk.proguard.C3441bf;
import com.umeng.commonsdk.proguard.C3447bl;
import com.umeng.commonsdk.proguard.C3471v;
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

/* JADX INFO: loaded from: classes2.dex */
public class Response implements InterfaceC3409aa<Response, EnumC3523e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<EnumC3523e, C3421am> metaDataMap;
    private static final Map<Class<? extends InterfaceC3443bh>, InterfaceC3444bi> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public C3527d imprint;
    public String msg;
    private EnumC3523e[] optionals;
    public int resp_code;
    private static final C3440be STRUCT_DESC = new C3440be("Response");
    private static final C3429au RESP_CODE_FIELD_DESC = new C3429au("resp_code", (byte) 8, 1);
    private static final C3429au MSG_FIELD_DESC = new C3429au("msg", (byte) 11, 2);
    private static final C3429au IMPRINT_FIELD_DESC = new C3429au(C3471v.f18936Q, (byte) 12, 3);

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    public static class C3519a extends AbstractC3445bj<Response> {
        private C3519a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo15766b(com.umeng.commonsdk.proguard.AbstractC3434az r5, com.umeng.commonsdk.statistics.proto.Response r6) throws com.umeng.commonsdk.proguard.C3415ag {
            /*
                r4 = this;
                r5.mo15808j()
            L3:
                com.umeng.commonsdk.proguard.au r0 = r5.mo15810l()
                byte r1 = r0.f18741b
                if (r1 != 0) goto L33
                r5.mo15809k()
                boolean r5 = r6.isSetResp_code()
                if (r5 == 0) goto L18
                r6.validate()
                return
            L18:
                com.umeng.commonsdk.proguard.ba r5 = new com.umeng.commonsdk.proguard.ba
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Required field 'resp_code' was not found in serialized data! Struct: "
                r6.append(r0)
                java.lang.String r0 = r4.toString()
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
            L33:
                short r0 = r0.f18742c
                r2 = 1
                if (r0 == r2) goto L62
                r3 = 2
                if (r0 == r3) goto L54
                r3 = 3
                if (r0 == r3) goto L42
            L3e:
                com.umeng.commonsdk.proguard.C3438bc.m15856a(r5, r1)
                goto L6f
            L42:
                r0 = 12
                if (r1 != r0) goto L3e
                com.umeng.commonsdk.statistics.proto.d r0 = new com.umeng.commonsdk.statistics.proto.d
                r0.<init>()
                r6.imprint = r0
                r0.read(r5)
                r6.setImprintIsSet(r2)
                goto L6f
            L54:
                r0 = 11
                if (r1 != r0) goto L3e
                java.lang.String r0 = r5.mo15824z()
                r6.msg = r0
                r6.setMsgIsSet(r2)
                goto L6f
            L62:
                r0 = 8
                if (r1 != r0) goto L3e
                int r0 = r5.mo15821w()
                r6.resp_code = r0
                r6.setResp_codeIsSet(r2)
            L6f:
                r5.mo15811m()
                goto L3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.proto.Response.C3519a.mo15766b(com.umeng.commonsdk.proguard.az, com.umeng.commonsdk.statistics.proto.Response):void");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15764a(AbstractC3434az abstractC3434az, Response response) throws C3415ag {
            response.validate();
            abstractC3434az.mo15792a(Response.STRUCT_DESC);
            abstractC3434az.mo15787a(Response.RESP_CODE_FIELD_DESC);
            abstractC3434az.mo15785a(response.resp_code);
            abstractC3434az.mo15799c();
            if (response.msg != null && response.isSetMsg()) {
                abstractC3434az.mo15787a(Response.MSG_FIELD_DESC);
                abstractC3434az.mo15793a(response.msg);
                abstractC3434az.mo15799c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                abstractC3434az.mo15787a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(abstractC3434az);
                abstractC3434az.mo15799c();
            }
            abstractC3434az.mo15801d();
            abstractC3434az.mo15798b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    public static class C3520b implements InterfaceC3444bi {
        private C3520b() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3519a mo15769b() {
            return new C3519a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    public static class C3521c extends AbstractC3446bk<Response> {
        private C3521c() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo15764a(AbstractC3434az abstractC3434az, Response response) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            c3441bf.mo15785a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            c3441bf.m15860a(bitSet, 2);
            if (response.isSetMsg()) {
                c3441bf.mo15793a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(c3441bf);
            }
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3443bh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo15766b(AbstractC3434az abstractC3434az, Response response) throws C3415ag {
            C3441bf c3441bf = (C3441bf) abstractC3434az;
            response.resp_code = c3441bf.mo15821w();
            response.setResp_codeIsSet(true);
            BitSet bitSetM15861b = c3441bf.m15861b(2);
            if (bitSetM15861b.get(0)) {
                response.msg = c3441bf.mo15824z();
                response.setMsgIsSet(true);
            }
            if (bitSetM15861b.get(1)) {
                C3527d c3527d = new C3527d();
                response.imprint = c3527d;
                c3527d.read(c3441bf);
                response.setImprintIsSet(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    public static class C3522d implements InterfaceC3444bi {
        private C3522d() {
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3444bi
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3521c mo15769b() {
            return new C3521c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum EnumC3523e implements InterfaceC3416ah {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, C3471v.f18936Q);


        /* JADX INFO: renamed from: d */
        private static final Map<String, EnumC3523e> f19287d = new HashMap();

        /* JADX INFO: renamed from: e */
        private final short f19289e;

        /* JADX INFO: renamed from: f */
        private final String f19290f;

        static {
            for (EnumC3523e enumC3523e : EnumSet.allOf(EnumC3523e.class)) {
                f19287d.put(enumC3523e.mo15739b(), enumC3523e);
            }
        }

        EnumC3523e(short s, String str) {
            this.f19289e = s;
            this.f19290f = str;
        }

        /* JADX INFO: renamed from: a */
        public static EnumC3523e m16442a(int i) {
            if (i == 1) {
                return RESP_CODE;
            }
            if (i == 2) {
                return MSG;
            }
            if (i != 3) {
                return null;
            }
            return IMPRINT;
        }

        /* JADX INFO: renamed from: a */
        public static EnumC3523e m16443a(String str) {
            return f19287d.get(str);
        }

        /* JADX INFO: renamed from: b */
        public static EnumC3523e m16444b(int i) {
            EnumC3523e enumC3523eM16442a = m16442a(i);
            if (enumC3523eM16442a != null) {
                return enumC3523eM16442a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: a */
        public short mo15738a() {
            return this.f19289e;
        }

        @Override // com.umeng.commonsdk.proguard.InterfaceC3416ah
        /* JADX INFO: renamed from: b */
        public String mo15739b() {
            return this.f19290f;
        }
    }

    static {
        HashMap map = new HashMap();
        schemes = map;
        map.put(AbstractC3445bj.class, new C3520b());
        map.put(AbstractC3446bk.class, new C3522d());
        EnumMap enumMap = new EnumMap(EnumC3523e.class);
        enumMap.put(EnumC3523e.RESP_CODE, new C3421am("resp_code", (byte) 1, new C3422an((byte) 8)));
        enumMap.put(EnumC3523e.MSG, new C3421am("msg", (byte) 2, new C3422an((byte) 11)));
        enumMap.put(EnumC3523e.IMPRINT, new C3421am(C3471v.f18936Q, (byte) 2, new C3426ar((byte) 12, C3527d.class)));
        Map<EnumC3523e, C3421am> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = mapUnmodifiableMap;
        C3421am.m15774a(Response.class, mapUnmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC3523e[]{EnumC3523e.MSG, EnumC3523e.IMPRINT};
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC3523e[]{EnumC3523e.MSG, EnumC3523e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new C3527d(response.imprint);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new C3428at(new C3447bl(objectInputStream)));
        } catch (C3415ag e) {
            throw new IOException(e.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C3428at(new C3447bl(objectOutputStream)));
        } catch (C3415ag e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public Response deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public EnumC3523e fieldForId(int i) {
        return EnumC3523e.m16442a(i);
    }

    public C3527d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return C3473x.m16127a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void read(AbstractC3434az abstractC3434az) throws C3415ag {
        schemes.get(abstractC3434az.mo15850D()).mo15769b().mo15766b(abstractC3434az, this);
    }

    public Response setImprint(C3527d c3527d) {
        this.imprint = c3527d;
        return this;
    }

    public void setImprintIsSet(boolean z) {
        if (z) {
            return;
        }
        this.imprint = null;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z) {
        if (z) {
            return;
        }
        this.msg = null;
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = C3473x.m16119a(this.__isset_bitfield, 0, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            C3527d c3527d = this.imprint;
            if (c3527d == null) {
                sb.append("null");
            } else {
                sb.append(c3527d);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = C3473x.m16131b(this.__isset_bitfield, 0);
    }

    public void validate() throws C3415ag {
        C3527d c3527d = this.imprint;
        if (c3527d != null) {
            c3527d.m16580l();
        }
    }

    @Override // com.umeng.commonsdk.proguard.InterfaceC3409aa
    public void write(AbstractC3434az abstractC3434az) throws C3415ag {
        schemes.get(abstractC3434az.mo15850D()).mo15769b().mo15764a(abstractC3434az, this);
    }
}
