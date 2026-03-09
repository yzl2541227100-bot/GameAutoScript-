package com.p188b.p189a;

import com.p188b.p189a.p190a.C2446c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.b.a.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2562p {

    /* JADX INFO: renamed from: a */
    public static final C2562p f15762a;

    /* JADX INFO: renamed from: b */
    public static final C2562p f15763b;

    /* JADX INFO: renamed from: c */
    public static final C2562p f15764c;

    /* JADX INFO: renamed from: h */
    private static final C2558l[] f15765h;

    /* JADX INFO: renamed from: d */
    public final boolean f15766d;

    /* JADX INFO: renamed from: e */
    public final boolean f15767e;

    /* JADX INFO: renamed from: f */
    public final String[] f15768f;

    /* JADX INFO: renamed from: g */
    public final String[] f15769g;

    static {
        C2558l[] c2558lArr = {C2558l.f15688aW, C2558l.f15719ba, C2558l.f15689aX, C2558l.f15720bb, C2558l.f15726bh, C2558l.f15725bg, C2558l.f15715ax, C2558l.f15673aH, C2558l.f15716ay, C2558l.f15674aI, C2558l.f15697af, C2558l.f15698ag, C2558l.f15642D, C2558l.f15646H, C2558l.f15733h};
        f15765h = c2558lArr;
        C2563q c2563q = new C2563q(true);
        if (!c2563q.f15770a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[c2558lArr.length];
        for (int i = 0; i < c2558lArr.length; i++) {
            strArr[i] = c2558lArr[i].f15752bi;
        }
        C2563q c2563qM12947a = c2563q.m12947a(strArr);
        EnumC2547ax enumC2547ax = EnumC2547ax.TLS_1_0;
        C2562p c2562pM12948b = c2563qM12947a.m12946a(EnumC2547ax.TLS_1_3, EnumC2547ax.TLS_1_2, EnumC2547ax.TLS_1_1, enumC2547ax).m12945a().m12948b();
        f15762a = c2562pM12948b;
        f15763b = new C2563q(c2562pM12948b).m12946a(enumC2547ax).m12945a().m12948b();
        f15764c = new C2563q(false).m12948b();
    }

    public C2562p(C2563q c2563q) {
        this.f15766d = c2563q.f15770a;
        this.f15768f = c2563q.f15771b;
        this.f15769g = c2563q.f15772c;
        this.f15767e = c2563q.f15773d;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m12941a(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                if (C2446c.m12573a(strArr2, str) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private List<EnumC2547ax> m12942b() {
        if (this.f15769g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f15769g.length);
        for (String str : this.f15769g) {
            arrayList.add(EnumC2547ax.m12915a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12943a() {
        return this.f15767e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12944a(SSLSocket sSLSocket) {
        if (!this.f15766d) {
            return false;
        }
        String[] strArr = this.f15769g;
        if (strArr != null && !m12941a(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f15768f;
        return strArr2 == null || m12941a(strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2562p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2562p c2562p = (C2562p) obj;
        boolean z = this.f15766d;
        if (z != c2562p.f15766d) {
            return false;
        }
        return !z || (Arrays.equals(this.f15768f, c2562p.f15768f) && Arrays.equals(this.f15769g, c2562p.f15769g) && this.f15767e == c2562p.f15767e);
    }

    public final int hashCode() {
        if (this.f15766d) {
            return ((((Arrays.hashCode(this.f15768f) + 527) * 31) + Arrays.hashCode(this.f15769g)) * 31) + (!this.f15767e ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String string;
        List listUnmodifiableList;
        if (!this.f15766d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f15768f;
        if (strArr != null) {
            if (strArr == null) {
                listUnmodifiableList = null;
            } else {
                ArrayList arrayList = new ArrayList(this.f15768f.length);
                for (String str : this.f15768f) {
                    arrayList.add(C2558l.m12935a(str));
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            }
            string = listUnmodifiableList.toString();
        } else {
            string = "[all enabled]";
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + (this.f15769g != null ? m12942b().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f15767e + ")";
    }
}
