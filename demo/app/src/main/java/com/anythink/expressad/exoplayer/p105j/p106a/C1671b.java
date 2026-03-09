package com.anythink.expressad.exoplayer.p105j.p106a;

import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1690g;
import com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1741x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1671b implements InterfaceC1690g {

    /* JADX INFO: renamed from: a */
    public static final int f9274a = 20480;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1670a f9275b;

    /* JADX INFO: renamed from: c */
    private final long f9276c;

    /* JADX INFO: renamed from: d */
    private final int f9277d;

    /* JADX INFO: renamed from: e */
    private final boolean f9278e;

    /* JADX INFO: renamed from: f */
    private C1694k f9279f;

    /* JADX INFO: renamed from: g */
    private File f9280g;

    /* JADX INFO: renamed from: h */
    private OutputStream f9281h;

    /* JADX INFO: renamed from: i */
    private FileOutputStream f9282i;

    /* JADX INFO: renamed from: j */
    private long f9283j;

    /* JADX INFO: renamed from: k */
    private long f9284k;

    /* JADX INFO: renamed from: l */
    private C1741x f9285l;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.b$a */
    public static class a extends InterfaceC1670a.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public C1671b(InterfaceC1670a interfaceC1670a) {
        this(interfaceC1670a, 2097152L, f9274a, true);
    }

    private C1671b(InterfaceC1670a interfaceC1670a, long j, int i) {
        this(interfaceC1670a, j, i, true);
    }

    private C1671b(InterfaceC1670a interfaceC1670a, long j, int i, boolean z) {
        this.f9275b = (InterfaceC1670a) C1711a.m8005a(interfaceC1670a);
        this.f9276c = j;
        this.f9277d = i;
        this.f9278e = z;
    }

    private C1671b(InterfaceC1670a interfaceC1670a, long j, boolean z) {
        this(interfaceC1670a, j, f9274a, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    private void m7723b() {
        long j = this.f9279f.f9399g;
        if (j != -1) {
            Math.min(j - this.f9284k, this.f9276c);
        }
        InterfaceC1670a interfaceC1670a = this.f9275b;
        C1694k c1694k = this.f9279f;
        this.f9280g = interfaceC1670a.mo7718c(c1694k.f9400h, c1694k.f9397e + this.f9284k);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f9280g);
        this.f9282i = fileOutputStream;
        OutputStream outputStream = fileOutputStream;
        if (this.f9277d > 0) {
            C1741x c1741x = this.f9285l;
            if (c1741x == null) {
                this.f9285l = new C1741x(this.f9282i, this.f9277d);
            } else {
                c1741x.m8307a(fileOutputStream);
            }
            outputStream = this.f9285l;
        }
        this.f9281h = outputStream;
        this.f9283j = 0L;
    }

    /* JADX INFO: renamed from: c */
    private void m7724c() {
        OutputStream outputStream = this.f9281h;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            if (this.f9278e) {
                this.f9282i.getFD().sync();
            }
            C1717af.m8075a(this.f9281h);
            this.f9281h = null;
            File file = this.f9280g;
            this.f9280g = null;
            this.f9275b.mo7707a(file);
        } catch (Throwable th) {
            C1717af.m8075a(this.f9281h);
            this.f9281h = null;
            File file2 = this.f9280g;
            this.f9280g = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1690g
    /* JADX INFO: renamed from: a */
    public final void mo7725a() throws a {
        if (this.f9279f == null) {
            return;
        }
        try {
            m7724c();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1690g
    /* JADX INFO: renamed from: a */
    public final void mo7726a(C1694k c1694k) throws a {
        if (c1694k.f9399g == -1 && !c1694k.m7858a(2)) {
            this.f9279f = null;
            return;
        }
        this.f9279f = c1694k;
        this.f9284k = 0L;
        try {
            m7723b();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.anythink.expressad.exoplayer.p105j.InterfaceC1690g
    /* JADX INFO: renamed from: a */
    public final void mo7727a(byte[] bArr, int i, int i2) throws a {
        if (this.f9279f == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f9283j == this.f9276c) {
                    m7724c();
                    m7723b();
                }
                int iMin = (int) Math.min(i2 - i3, this.f9276c - this.f9283j);
                this.f9281h.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j = iMin;
                this.f9283j += j;
                this.f9284k += j;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }
}
