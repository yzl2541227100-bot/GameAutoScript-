package p285z2;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;
import p285z2.C3819dy;
import p285z2.C3966hx;
import p285z2.C4225ox;
import p285z2.C4299qx;

/* JADX INFO: renamed from: z2.pw */
/* JADX INFO: loaded from: classes2.dex */
public final class C4261pw implements Closeable, Flushable {
    private static final int Oooooo = 0;
    private static final int Oooooo0 = 201105;
    private static final int OoooooO = 1;
    private static final int Ooooooo = 2;
    public final InterfaceC3893fy OoooOoO;
    public final C3819dy OoooOoo;
    public int Ooooo00;
    public int Ooooo0o;
    private int OooooO0;
    private int OooooOO;
    private int OooooOo;

    /* JADX INFO: renamed from: z2.pw$OooO */
    public static final class OooO {
        private static final String OooOO0O = C4375sz.OooOO0O().OooOO0o() + "-Sent-Millis";
        private static final String OooOO0o = C4375sz.OooOO0O().OooOO0o() + "-Received-Millis";
        private final long OooO;
        private final String OooO00o;
        private final C3966hx OooO0O0;
        private final String OooO0OO;
        private final Protocol OooO0Oo;
        private final String OooO0o;
        private final int OooO0o0;
        private final C3966hx OooO0oO;

        @Nullable
        private final C3929gx OooO0oo;
        private final long OooOO0;

        public OooO(c10 c10Var) throws IOException {
            try {
                j00 j00VarOooO0Oo = u00.OooO0Oo(c10Var);
                this.OooO00o = j00VarOooO0Oo.Oooo0OO();
                this.OooO0OO = j00VarOooO0Oo.Oooo0OO();
                C3966hx.OooO00o oooO00o = new C3966hx.OooO00o();
                int iO00ooo = C4261pw.o00ooo(j00VarOooO0Oo);
                for (int i = 0; i < iO00ooo; i++) {
                    oooO00o.OooO0o0(j00VarOooO0Oo.Oooo0OO());
                }
                this.OooO0O0 = oooO00o.OooO0oo();
                C4596yy c4596yyOooO0O0 = C4596yy.OooO0O0(j00VarOooO0Oo.Oooo0OO());
                this.OooO0Oo = c4596yyOooO0O0.OooO00o;
                this.OooO0o0 = c4596yyOooO0O0.OooO0O0;
                this.OooO0o = c4596yyOooO0O0.OooO0OO;
                C3966hx.OooO00o oooO00o2 = new C3966hx.OooO00o();
                int iO00ooo2 = C4261pw.o00ooo(j00VarOooO0Oo);
                for (int i2 = 0; i2 < iO00ooo2; i2++) {
                    oooO00o2.OooO0o0(j00VarOooO0Oo.Oooo0OO());
                }
                String str = OooOO0O;
                String strOooO = oooO00o2.OooO(str);
                String str2 = OooOO0o;
                String strOooO2 = oooO00o2.OooO(str2);
                oooO00o2.OooOO0(str);
                oooO00o2.OooOO0(str2);
                this.OooO = strOooO != null ? Long.parseLong(strOooO) : 0L;
                this.OooOO0 = strOooO2 != null ? Long.parseLong(strOooO2) : 0L;
                this.OooO0oO = oooO00o2.OooO0oo();
                if (OooO00o()) {
                    String strOooo0OO = j00VarOooO0Oo.Oooo0OO();
                    if (strOooo0OO.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strOooo0OO + "\"");
                    }
                    this.OooO0oo = C3929gx.OooO0OO(!j00VarOooO0Oo.OooOOO() ? TlsVersion.forJavaName(j00VarOooO0Oo.Oooo0OO()) : TlsVersion.SSL_3_0, C4483vw.OooO00o(j00VarOooO0Oo.Oooo0OO()), OooO0OO(j00VarOooO0Oo), OooO0OO(j00VarOooO0Oo));
                } else {
                    this.OooO0oo = null;
                }
            } finally {
                c10Var.close();
            }
        }

        public OooO(C4299qx c4299qx) {
            this.OooO00o = c4299qx.o0OOO0o().OooOO0O().toString();
            this.OooO0O0 = C4374sy.OooOo0(c4299qx);
            this.OooO0OO = c4299qx.o0OOO0o().OooO0oO();
            this.OooO0Oo = c4299qx.o0ooOOo();
            this.OooO0o0 = c4299qx.OoooooO();
            this.OooO0o = c4299qx.o00ooo();
            this.OooO0oO = c4299qx.o00Oo0();
            this.OooO0oo = c4299qx.Ooooooo();
            this.OooO = c4299qx.o0Oo0oo();
            this.OooOO0 = c4299qx.o0ooOoO();
        }

        private boolean OooO00o() {
            return this.OooO00o.startsWith("https://");
        }

        private List<Certificate> OooO0OO(j00 j00Var) throws IOException {
            int iO00ooo = C4261pw.o00ooo(j00Var);
            if (iO00ooo == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iO00ooo);
                for (int i = 0; i < iO00ooo; i++) {
                    String strOooo0OO = j00Var.Oooo0OO();
                    h00 h00Var = new h00();
                    h00Var.OoooO0(ByteString.decodeBase64(strOooo0OO));
                    arrayList.add(certificateFactory.generateCertificate(h00Var.OooooO0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void OooO0o0(i00 i00Var, List<Certificate> list) throws IOException {
            try {
                i00Var.OoooOoO(list.size()).OooOOOO(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    i00Var.OooOoO0(ByteString.m17043of(list.get(i).getEncoded()).base64()).OooOOOO(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean OooO0O0(C4225ox c4225ox, C4299qx c4299qx) {
            return this.OooO00o.equals(c4225ox.OooOO0O().toString()) && this.OooO0OO.equals(c4225ox.OooO0oO()) && C4374sy.OooOo0O(c4299qx, this.OooO0O0, c4225ox);
        }

        public C4299qx OooO0Oo(C3819dy.OooOO0 oooOO0) {
            String strOooO0Oo = this.OooO0oO.OooO0Oo("Content-Type");
            String strOooO0Oo2 = this.OooO0oO.OooO0Oo("Content-Length");
            return new C4299qx.OooO00o().OooOOo0(new C4225ox.OooO00o().OooOOo0(this.OooO00o).OooOO0(this.OooO0OO, null).OooO(this.OooO0O0).OooO0O0()).OooOOO(this.OooO0Oo).OooO0oO(this.OooO0o0).OooOO0O(this.OooO0o).OooOO0(this.OooO0oO).OooO0O0(new OooO0o(oooOO0, strOooO0Oo, strOooO0Oo2)).OooO0oo(this.OooO0oo).OooOOo(this.OooO).OooOOOO(this.OooOO0).OooO0OO();
        }

        public void OooO0o(C3819dy.OooO0o oooO0o) throws IOException {
            i00 i00VarOooO0OO = u00.OooO0OO(oooO0o.OooO0o0(0));
            i00VarOooO0OO.OooOoO0(this.OooO00o).OooOOOO(10);
            i00VarOooO0OO.OooOoO0(this.OooO0OO).OooOOOO(10);
            i00VarOooO0OO.OoooOoO(this.OooO0O0.OooOO0o()).OooOOOO(10);
            int iOooOO0o = this.OooO0O0.OooOO0o();
            for (int i = 0; i < iOooOO0o; i++) {
                i00VarOooO0OO.OooOoO0(this.OooO0O0.OooO0oO(i)).OooOoO0(": ").OooOoO0(this.OooO0O0.OooOOO(i)).OooOOOO(10);
            }
            i00VarOooO0OO.OooOoO0(new C4596yy(this.OooO0Oo, this.OooO0o0, this.OooO0o).toString()).OooOOOO(10);
            i00VarOooO0OO.OoooOoO(this.OooO0oO.OooOO0o() + 2).OooOOOO(10);
            int iOooOO0o2 = this.OooO0oO.OooOO0o();
            for (int i2 = 0; i2 < iOooOO0o2; i2++) {
                i00VarOooO0OO.OooOoO0(this.OooO0oO.OooO0oO(i2)).OooOoO0(": ").OooOoO0(this.OooO0oO.OooOOO(i2)).OooOOOO(10);
            }
            i00VarOooO0OO.OooOoO0(OooOO0O).OooOoO0(": ").OoooOoO(this.OooO).OooOOOO(10);
            i00VarOooO0OO.OooOoO0(OooOO0o).OooOoO0(": ").OoooOoO(this.OooOO0).OooOOOO(10);
            if (OooO00o()) {
                i00VarOooO0OO.OooOOOO(10);
                i00VarOooO0OO.OooOoO0(this.OooO0oo.OooO00o().OooO0Oo()).OooOOOO(10);
                OooO0o0(i00VarOooO0OO, this.OooO0oo.OooO0o());
                OooO0o0(i00VarOooO0OO, this.OooO0oo.OooO0Oo());
                i00VarOooO0OO.OooOoO0(this.OooO0oo.OooO0oo().javaName()).OooOOOO(10);
            }
            i00VarOooO0OO.close();
        }
    }

    /* JADX INFO: renamed from: z2.pw$OooO00o */
    public class OooO00o implements InterfaceC3893fy {
        public OooO00o() {
        }

        @Override // p285z2.InterfaceC3893fy
        public void OooO00o() {
            C4261pw.this.o0ooOO0();
        }

        @Override // p285z2.InterfaceC3893fy
        public void OooO0O0(C3782cy c3782cy) {
            C4261pw.this.o0ooOOo(c3782cy);
        }

        @Override // p285z2.InterfaceC3893fy
        public void OooO0OO(C4225ox c4225ox) throws IOException {
            C4261pw.this.oo000o(c4225ox);
        }

        @Override // p285z2.InterfaceC3893fy
        public InterfaceC3745by OooO0Oo(C4299qx c4299qx) throws IOException {
            return C4261pw.this.o00o0O(c4299qx);
        }

        @Override // p285z2.InterfaceC3893fy
        public void OooO0o(C4299qx c4299qx, C4299qx c4299qx2) {
            C4261pw.this.o0ooOoO(c4299qx, c4299qx2);
        }

        @Override // p285z2.InterfaceC3893fy
        public C4299qx OooO0o0(C4225ox c4225ox) throws IOException {
            return C4261pw.this.OoooooO(c4225ox);
        }
    }

    /* JADX INFO: renamed from: z2.pw$OooO0O0 */
    public class OooO0O0 implements Iterator<String> {
        public final Iterator<C3819dy.OooOO0> OoooOoO;

        @Nullable
        public String OoooOoo;
        public boolean Ooooo00;

        public OooO0O0() throws IOException {
            this.OoooOoO = C4261pw.this.OoooOoo.oo0o0Oo();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: OooO00o */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.OoooOoo;
            this.OoooOoo = null;
            this.Ooooo00 = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.OoooOoo != null) {
                return true;
            }
            this.Ooooo00 = false;
            while (this.OoooOoO.hasNext()) {
                C3819dy.OooOO0 next = this.OoooOoO.next();
                try {
                    this.OoooOoo = u00.OooO0Oo(next.Oooooo(0)).Oooo0OO();
                    return true;
                } catch (IOException unused) {
                } finally {
                    next.close();
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.Ooooo00) {
                throw new IllegalStateException("remove() before next()");
            }
            this.OoooOoO.remove();
        }
    }

    /* JADX INFO: renamed from: z2.pw$OooO0OO */
    public final class OooO0OO implements InterfaceC3745by {
        private final C3819dy.OooO0o OooO00o;
        private b10 OooO0O0;
        private b10 OooO0OO;
        public boolean OooO0Oo;

        /* JADX INFO: renamed from: z2.pw$OooO0OO$OooO00o */
        public class OooO00o extends l00 {
            public final /* synthetic */ C4261pw OoooOoo;
            public final /* synthetic */ C3819dy.OooO0o Ooooo00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(b10 b10Var, C4261pw c4261pw, C3819dy.OooO0o oooO0o) {
                super(b10Var);
                this.OoooOoo = c4261pw;
                this.Ooooo00 = oooO0o;
            }

            @Override // p285z2.l00, p285z2.b10, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (C4261pw.this) {
                    OooO0OO oooO0OO = OooO0OO.this;
                    if (oooO0OO.OooO0Oo) {
                        return;
                    }
                    oooO0OO.OooO0Oo = true;
                    C4261pw.this.Ooooo00++;
                    super.close();
                    this.Ooooo00.OooO0OO();
                }
            }
        }

        public OooO0OO(C3819dy.OooO0o oooO0o) {
            this.OooO00o = oooO0o;
            b10 b10VarOooO0o0 = oooO0o.OooO0o0(1);
            this.OooO0O0 = b10VarOooO0o0;
            this.OooO0OO = new OooO00o(b10VarOooO0o0, C4261pw.this, oooO0o);
        }

        @Override // p285z2.InterfaceC3745by
        public b10 OooO00o() {
            return this.OooO0OO;
        }

        @Override // p285z2.InterfaceC3745by
        public void abort() {
            synchronized (C4261pw.this) {
                if (this.OooO0Oo) {
                    return;
                }
                this.OooO0Oo = true;
                C4261pw.this.Ooooo0o++;
                C4558xx.OooO0oO(this.OooO0O0);
                try {
                    this.OooO00o.OooO00o();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2.pw$OooO0o */
    public static class OooO0o extends AbstractC4336rx {
        public final C3819dy.OooOO0 OoooOoO;
        private final j00 OoooOoo;

        @Nullable
        private final String Ooooo00;

        @Nullable
        private final String Ooooo0o;

        /* JADX INFO: renamed from: z2.pw$OooO0o$OooO00o */
        public class OooO00o extends m00 {
            public final /* synthetic */ C3819dy.OooOO0 OoooOoO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(c10 c10Var, C3819dy.OooOO0 oooOO0) {
                super(c10Var);
                this.OoooOoO = oooOO0;
            }

            @Override // p285z2.m00, p285z2.c10, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.OoooOoO.close();
                super.close();
            }
        }

        public OooO0o(C3819dy.OooOO0 oooOO0, String str, String str2) {
            this.OoooOoO = oooOO0;
            this.Ooooo00 = str;
            this.Ooooo0o = str2;
            this.OoooOoo = u00.OooO0Oo(new OooO00o(oooOO0.Oooooo(1), oooOO0));
        }

        @Override // p285z2.AbstractC4336rx
        public long contentLength() {
            try {
                String str = this.Ooooo0o;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // p285z2.AbstractC4336rx
        public C4077kx contentType() {
            String str = this.Ooooo00;
            if (str != null) {
                return C4077kx.OooO0Oo(str);
            }
            return null;
        }

        @Override // p285z2.AbstractC4336rx
        public j00 source() {
            return this.OoooOoo;
        }
    }

    public C4261pw(File file, long j) {
        this(file, j, InterfaceC4153mz.OooO00o);
    }

    public C4261pw(File file, long j, InterfaceC4153mz interfaceC4153mz) {
        this.OoooOoO = new OooO00o();
        this.OoooOoo = C3819dy.Oooooo0(interfaceC4153mz, file, Oooooo0, 2, j);
    }

    private void OooOO0(@Nullable C3819dy.OooO0o oooO0o) {
        if (oooO0o != null) {
            try {
                oooO0o.OooO00o();
            } catch (IOException unused) {
            }
        }
    }

    public static String o00O0O(C4003ix c4003ix) {
        return ByteString.encodeUtf8(c4003ix.toString()).md5().hex();
    }

    public static int o00ooo(j00 j00Var) throws IOException {
        try {
            long jOooOo0O = j00Var.OooOo0O();
            String strOooo0OO = j00Var.Oooo0OO();
            if (jOooOo0O >= 0 && jOooOo0O <= 2147483647L && strOooo0OO.isEmpty()) {
                return (int) jOooOo0O;
            }
            throw new IOException("expected an int but was \"" + jOooOo0O + strOooo0OO + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void OooooOo() throws IOException {
        this.OoooOoo.Oooooo();
    }

    public void Oooooo() throws IOException {
        this.OoooOoo.o0OoOo0();
    }

    public File Oooooo0() {
        return this.OoooOoo.o00O0O();
    }

    @Nullable
    public C4299qx OoooooO(C4225ox c4225ox) {
        try {
            C3819dy.OooOO0 oooOO0OoOO = this.OoooOoo.ooOO(o00O0O(c4225ox.OooOO0O()));
            if (oooOO0OoOO == null) {
                return null;
            }
            try {
                OooO oooO = new OooO(oooOO0OoOO.Oooooo(0));
                C4299qx c4299qxOooO0Oo = oooO.OooO0Oo(oooOO0OoOO);
                if (oooO.OooO0O0(c4225ox, c4299qxOooO0Oo)) {
                    return c4299qxOooO0Oo;
                }
                C4558xx.OooO0oO(c4299qxOooO0Oo.OooOO0());
                return null;
            } catch (IOException unused) {
                C4558xx.OooO0oO(oooOO0OoOO);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public synchronized int Ooooooo() {
        return this.OooooOO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.OoooOoo.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.OoooOoo.flush();
    }

    public long o00Oo0() {
        return this.OoooOoo.o00Oo0();
    }

    public synchronized int o00Ooo() {
        return this.OooooO0;
    }

    @Nullable
    public InterfaceC3745by o00o0O(C4299qx c4299qx) {
        C3819dy.OooO0o oooO0oOoooooO;
        String strOooO0oO = c4299qx.o0OOO0o().OooO0oO();
        if (C4411ty.OooO00o(c4299qx.o0OOO0o().OooO0oO())) {
            try {
                oo000o(c4299qx.o0OOO0o());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strOooO0oO.equals("GET") || C4374sy.OooO0o0(c4299qx)) {
            return null;
        }
        OooO oooO = new OooO(c4299qx);
        try {
            oooO0oOoooooO = this.OoooOoo.OoooooO(o00O0O(c4299qx.o0OOO0o().OooOO0O()));
            if (oooO0oOoooooO == null) {
                return null;
            }
            try {
                oooO.OooO0o(oooO0oOoooooO);
                return new OooO0OO(oooO0oOoooooO);
            } catch (IOException unused2) {
                OooOO0(oooO0oOoooooO);
                return null;
            }
        } catch (IOException unused3) {
            oooO0oOoooooO = null;
        }
    }

    public long o00oO0O() throws IOException {
        return this.OoooOoo.o0OO00O();
    }

    public synchronized int o00oO0o() {
        return this.OooooOo;
    }

    public synchronized int o0OO00O() {
        return this.Ooooo00;
    }

    public Iterator<String> o0OOO0o() throws IOException {
        return new OooO0O0();
    }

    public synchronized int o0Oo0oo() {
        return this.Ooooo0o;
    }

    public void o0OoOo0() throws IOException {
        this.OoooOoo.o00Ooo();
    }

    public synchronized void o0ooOO0() {
        this.OooooOO++;
    }

    public synchronized void o0ooOOo(C3782cy c3782cy) {
        this.OooooOo++;
        if (c3782cy.OooO00o != null) {
            this.OooooO0++;
        } else if (c3782cy.OooO0O0 != null) {
            this.OooooOO++;
        }
    }

    public void o0ooOoO(C4299qx c4299qx, C4299qx c4299qx2) {
        C3819dy.OooO0o oooO0oOooooOo;
        OooO oooO = new OooO(c4299qx2);
        try {
            oooO0oOooooOo = ((OooO0o) c4299qx.OooOO0()).OoooOoO.OooooOo();
            if (oooO0oOooooOo != null) {
                try {
                    oooO.OooO0o(oooO0oOooooOo);
                    oooO0oOooooOo.OooO0OO();
                } catch (IOException unused) {
                    OooOO0(oooO0oOooooOo);
                }
            }
        } catch (IOException unused2) {
            oooO0oOooooOo = null;
        }
    }

    public void oo000o(C4225ox c4225ox) throws IOException {
        this.OoooOoo.o0ooOoO(o00O0O(c4225ox.OooOO0O()));
    }

    public boolean ooOO() {
        return this.OoooOoo.o00o0O();
    }
}
