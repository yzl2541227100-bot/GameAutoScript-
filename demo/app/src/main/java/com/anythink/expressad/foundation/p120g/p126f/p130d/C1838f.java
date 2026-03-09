package com.anythink.expressad.foundation.p120g.p126f.p130d;

import com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i;
import com.anythink.expressad.foundation.p120g.p126f.C1858k;
import com.anythink.expressad.foundation.p120g.p126f.InterfaceC1840e;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p129c.C1830b;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1851d;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p284io.IOUtils;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.d.f */
/* JADX INFO: loaded from: classes.dex */
public class C1838f extends AbstractC1856i<String> {

    /* JADX INFO: renamed from: c */
    private static final String f11361c = C1838f.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private Map<String, String> f11362d;

    /* JADX INFO: renamed from: e */
    private C1830b[] f11363e;

    /* JADX INFO: renamed from: f */
    private String f11364f;

    private C1838f(int i, String str, Map<String, String> map, C1830b[] c1830bArr, InterfaceC1840e<String> interfaceC1840e) {
        super(i, str, interfaceC1840e);
        this.f11364f = "---------Ij5ei4KM7KM7ae0KM7cH2ae0Ij5Ef1";
        this.f11362d = map;
        this.f11363e = c1830bArr;
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: a */
    public final C1858k<String> mo9519a(C1846c c1846c) {
        try {
            return C1858k.m9635a(new String(c1846c.f11383b, C1851d.m9571a(c1846c.f11385d)), c1846c);
        } catch (UnsupportedEncodingException e) {
            e.getMessage();
            return C1858k.m9634a(new C1824a(8, c1846c));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: a */
    public final void mo9543a(OutputStream outputStream) {
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        try {
            try {
                C1830b[] c1830bArr = this.f11363e;
                if (c1830bArr != null) {
                    for (C1830b c1830b : c1830bArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("--");
                        sb.append(this.f11364f);
                        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                        sb.append("Content-Disposition: form-data;name=\"" + c1830b.m9515f() + "\";filename=\"" + c1830b.m9514e() + "\"\r\n");
                        StringBuilder sb2 = new StringBuilder("Content-Type: ");
                        sb2.append(c1830b.m9516g());
                        sb2.append("\r\n\r\n");
                        sb.append(sb2.toString());
                        dataOutputStream.write(sb.toString().getBytes());
                        if (c1830b.m9512c() != null) {
                            byte[] bArr = new byte[1024];
                            int i = 0;
                            while (true) {
                                int i2 = c1830b.m9512c().read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                dataOutputStream.write(bArr, 0, i2);
                                i += i2;
                                InterfaceC1840e<T> interfaceC1840e = this.f11428b;
                                if (interfaceC1840e != 0) {
                                    interfaceC1840e.mo9464a(c1830b.m9510a(), i);
                                }
                            }
                            c1830b.m9512c().close();
                        } else {
                            dataOutputStream.write(c1830b.m9513d(), 0, c1830b.m9513d().length);
                        }
                        dataOutputStream.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
                    }
                }
                dataOutputStream.writeBytes("--" + this.f11364f + "--\r\n");
                dataOutputStream.flush();
            } catch (IOException e) {
                e.getMessage();
                this.f11428b.mo9465a(new C1824a(2, null));
                try {
                    dataOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: h */
    public final byte[] mo9542h() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f11362d.entrySet()) {
            sb.append("--");
            sb.append(this.f11364f);
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
            sb.append(entry.getValue());
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        return sb.toString().getBytes();
    }

    @Override // com.anythink.expressad.foundation.p120g.p126f.AbstractC1856i
    /* JADX INFO: renamed from: i */
    public final void mo9544i() {
        super.mo9544i();
        HashMap map = new HashMap();
        map.put("Content-Type", "multipart/form-data; boundary=" + this.f11364f);
        m9613a((Map<String, String>) map);
    }
}
