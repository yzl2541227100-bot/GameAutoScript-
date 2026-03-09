package com.anythink.expressad.foundation.p120g.p126f;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.foundation.p120g.p126f.p127a.C1824a;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1845b;
import com.anythink.expressad.foundation.p120g.p126f.p132f.C1846c;
import com.anythink.expressad.foundation.p120g.p126f.p133g.C1851d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import p285z2.C4196o4;

/* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1856i<T> implements Comparable<AbstractC1856i<T>> {

    /* JADX INFO: renamed from: c */
    private static final String f11426c = AbstractC1856i.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, String> f11427a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1840e<T> f11428b;

    /* JADX INFO: renamed from: d */
    private final int f11429d;

    /* JADX INFO: renamed from: e */
    private final String f11430e;

    /* JADX INFO: renamed from: f */
    private Integer f11431f;

    /* JADX INFO: renamed from: g */
    private C1857j f11432g;

    /* JADX INFO: renamed from: h */
    private boolean f11433h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1859l f11434i;

    /* JADX INFO: renamed from: j */
    private Object f11435j;

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.i$a */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final int f11436a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f11437b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f11438c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f11439d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f11440e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f11441f = 5;

        /* JADX INFO: renamed from: g */
        public static final int f11442g = 6;

        /* JADX INFO: renamed from: h */
        public static final int f11443h = 7;
    }

    /* JADX INFO: renamed from: com.anythink.expressad.foundation.g.f.i$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public static final int f11444a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f11445b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f11446c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f11447d = 4;

        private b() {
        }
    }

    public AbstractC1856i(int i, String str, InterfaceC1840e<T> interfaceC1840e) {
        this.f11427a = new ConcurrentHashMap<>();
        this.f11428b = null;
        this.f11433h = false;
        this.f11430e = str;
        this.f11429d = i;
        this.f11428b = interfaceC1840e;
        this.f11434i = new C1825b();
    }

    public AbstractC1856i(String str) {
        this.f11427a = new ConcurrentHashMap<>();
        this.f11428b = null;
        this.f11433h = false;
        this.f11430e = str;
        this.f11429d = 0;
        this.f11434i = new C1825b();
    }

    /* JADX INFO: renamed from: a */
    private int m9597a(AbstractC1856i<T> abstractC1856i) {
        int iMo9521j = mo9521j();
        int iMo9521j2 = abstractC1856i.mo9521j();
        return iMo9521j == iMo9521j2 ? this.f11431f.intValue() - abstractC1856i.f11431f.intValue() : iMo9521j2 - iMo9521j;
    }

    /* JADX INFO: renamed from: a */
    public static C1824a m9598a(C1824a c1824a) {
        return c1824a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private AbstractC1856i<?> m9599a(Object obj) {
        this.f11435j = obj;
        return this;
    }

    /* JADX INFO: renamed from: a */
    private void m9600a(String str) {
        this.f11427a.remove(str);
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m9601a(C1845b c1845b) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream inputStreamM9568c = c1845b.m9568c();
            try {
                if (C1851d.m9575b(c1845b.m9567b()) && !(inputStreamM9568c instanceof GZIPInputStream)) {
                    inputStreamM9568c = new GZIPInputStream(inputStreamM9568c);
                }
                if (inputStreamM9568c == null) {
                    throw new C1824a(7, null);
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamM9568c.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, i);
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (inputStreamM9568c != null) {
                        try {
                            inputStreamM9568c.close();
                        } catch (IOException e) {
                            e.getMessage();
                        }
                    }
                    byteArrayOutputStream2.close();
                    return byteArray;
                } catch (Throwable th) {
                    inputStream = inputStreamM9568c;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e2) {
                            e2.getMessage();
                            throw th;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamM9568c;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private int m9602p() {
        Integer num = this.f11431f;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    /* JADX INFO: renamed from: q */
    private static void m9603q() {
    }

    /* JADX INFO: renamed from: r */
    private static void m9604r() {
    }

    /* JADX INFO: renamed from: a */
    public final int m9605a() {
        return this.f11429d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final AbstractC1856i<?> m9606a(int i) {
        this.f11431f = Integer.valueOf(i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final AbstractC1856i<?> m9607a(C1857j c1857j) {
        this.f11432g = c1857j;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final AbstractC1856i<?> m9608a(InterfaceC1859l interfaceC1859l) {
        this.f11434i = interfaceC1859l;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract C1858k<T> mo9519a(C1846c c1846c);

    /* JADX INFO: renamed from: a */
    public final void m9609a(long j, long j2) {
        InterfaceC1840e<T> interfaceC1840e = this.f11428b;
        if (interfaceC1840e != null) {
            interfaceC1840e.mo9464a(j, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9610a(InterfaceC1840e<T> interfaceC1840e) {
        this.f11428b = interfaceC1840e;
    }

    /* JADX INFO: renamed from: a */
    public final void m9611a(C1858k<T> c1858k) {
        InterfaceC1840e<T> interfaceC1840e = this.f11428b;
        if (interfaceC1840e != null) {
            interfaceC1840e.mo9466a(c1858k);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo9543a(OutputStream outputStream) {
    }

    /* JADX INFO: renamed from: a */
    public final void m9612a(String str, String str2) {
        this.f11427a.remove(str);
        this.f11427a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m9613a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            m9612a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] mo9520a(C1845b c1845b, InterfaceC1828c interfaceC1828c) {
        return c1845b.m9568c() != null ? m9601a(c1845b) : new byte[0];
    }

    /* JADX INFO: renamed from: b */
    public final Object m9614b() {
        return this.f11435j;
    }

    /* JADX INFO: renamed from: b */
    public final void m9615b(C1824a c1824a) {
        InterfaceC1840e<T> interfaceC1840e = this.f11428b;
        if (interfaceC1840e != null) {
            interfaceC1840e.mo9465a(c1824a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9616c() {
        C1857j c1857j = this.f11432g;
        if (c1857j != null) {
            c1857j.m9632b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        AbstractC1856i abstractC1856i = (AbstractC1856i) obj;
        int iMo9521j = mo9521j();
        int iMo9521j2 = abstractC1856i.mo9521j();
        return iMo9521j == iMo9521j2 ? this.f11431f.intValue() - abstractC1856i.f11431f.intValue() : iMo9521j2 - iMo9521j;
    }

    /* JADX INFO: renamed from: d */
    public final String m9617d() {
        return this.f11430e;
    }

    /* JADX INFO: renamed from: e */
    public final void m9618e() {
        this.f11433h = true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9619f() {
        return this.f11433h;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, String> m9620g() {
        return this.f11427a;
    }

    /* JADX INFO: renamed from: h */
    public byte[] mo9542h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void mo9544i() {
        m9612a("Connection", C1781c.f10318cf);
        m9612a("Charset", "UTF-8");
    }

    /* JADX INFO: renamed from: j */
    public int mo9521j() {
        return 2;
    }

    /* JADX INFO: renamed from: k */
    public final int m9621k() {
        return this.f11434i.mo9491b();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC1859l m9622l() {
        return this.f11434i;
    }

    /* JADX INFO: renamed from: m */
    public final void m9623m() {
        InterfaceC1840e<T> interfaceC1840e = this.f11428b;
        if (interfaceC1840e != null) {
            interfaceC1840e.mo9541c();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m9624n() {
        InterfaceC1840e<T> interfaceC1840e = this.f11428b;
        if (interfaceC1840e != null) {
            interfaceC1840e.mo9540b();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m9625o() {
        InterfaceC1840e<T> interfaceC1840e = this.f11428b;
        if (interfaceC1840e != null) {
            interfaceC1840e.mo9463a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11433h ? "[X] " : "[ ] ");
        sb.append(this.f11430e);
        sb.append(C4196o4.OooO00o.OooO0Oo);
        sb.append(mo9521j());
        sb.append(C4196o4.OooO00o.OooO0Oo);
        sb.append(this.f11431f);
        return sb.toString();
    }
}
