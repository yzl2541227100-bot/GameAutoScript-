package com.p188b.p199b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.b.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2587n {

    /* JADX INFO: renamed from: a */
    public static final Logger f15837a = Logger.getLogger(C2587n.class.getName());

    private C2587n() {
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2580g m13071a(InterfaceC2596w interfaceC2596w) {
        return new C2591r(interfaceC2596w);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2581h m13072a(InterfaceC2597x interfaceC2597x) {
        return new C2592s(interfaceC2597x);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2596w m13073a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        C2573a c2573aM13076c = m13076c(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new C2575b(c2573aM13076c, new C2588o(c2573aM13076c, outputStream));
        }
        throw new IllegalArgumentException("out == null");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13074a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2597x m13075b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        C2573a c2573aM13076c = m13076c(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream != null) {
            return new C2576c(c2573aM13076c, new C2589p(c2573aM13076c, inputStream));
        }
        throw new IllegalArgumentException("in == null");
    }

    /* JADX INFO: renamed from: c */
    private static C2573a m13076c(Socket socket) {
        return new C2590q(socket);
    }
}
