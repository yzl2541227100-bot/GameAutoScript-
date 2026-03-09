package com.p188b.p189a.p190a.p197g;

import com.p188b.p189a.C2532ai;
import com.p188b.p189a.EnumC2535al;
import com.p188b.p189a.p190a.p198h.AbstractC2518b;
import com.p188b.p189a.p190a.p198h.AbstractC2521e;
import com.p188b.p189a.p190a.p198h.C2517a;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.b.a.a.g.h */
/* JADX INFO: loaded from: classes.dex */
public class C2516h {

    /* JADX INFO: renamed from: a */
    private static final C2516h f15441a;

    /* JADX INFO: renamed from: b */
    private static final Logger f15442b;

    static {
        C2516h c2516hM12749a = C2509a.m12749a();
        if (c2516hM12749a == null && (c2516hM12749a = C2512d.m12762a()) == null && (c2516hM12749a = C2513e.m12763a()) == null) {
            c2516hM12749a = new C2516h();
        }
        f15441a = c2516hM12749a;
        f15442b = Logger.getLogger(C2532ai.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m12772a(List<EnumC2535al> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC2535al enumC2535al = list.get(i);
            if (enumC2535al != EnumC2535al.HTTP_1_0) {
                arrayList.add(enumC2535al.toString());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C2516h m12773b() {
        return f15441a;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC2518b mo12750a(X509TrustManager x509TrustManager) {
        return new C2517a(AbstractC2521e.m12785a(x509TrustManager));
    }

    /* JADX INFO: renamed from: a */
    public Object mo12751a(String str) {
        if (f15442b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String mo12752a(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo12753a(int i, String str, Throwable th) {
        f15442b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: a */
    public void mo12754a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo12753a(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: a */
    public void mo12755a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo12756a(SSLSocket sSLSocket, String str, List<EnumC2535al> list) {
    }

    /* JADX INFO: renamed from: b */
    public void mo12764b(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: b */
    public boolean mo12757b(String str) {
        return true;
    }
}
