package com.p188b.p189a.p190a.p195e;

import com.p188b.p189a.p190a.C2446c;
import com.p188b.p199b.C2582i;
import com.p188b.p199b.InterfaceC2581h;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.b.a.a.e.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2505y implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final Logger f15405a = Logger.getLogger(C2487g.class.getName());

    /* JADX INFO: renamed from: b */
    public final C2485e f15406b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2581h f15407c;

    /* JADX INFO: renamed from: d */
    private final C2506z f15408d;

    /* JADX INFO: renamed from: e */
    private final boolean f15409e;

    public C2505y(InterfaceC2581h interfaceC2581h, boolean z) {
        this.f15407c = interfaceC2581h;
        this.f15409e = z;
        C2506z c2506z = new C2506z(interfaceC2581h);
        this.f15408d = c2506z;
        this.f15406b = new C2485e(c2506z);
    }

    /* JADX INFO: renamed from: a */
    private static int m12742a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C2487g.m12720b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public static int m12743a(InterfaceC2581h interfaceC2581h) {
        return (interfaceC2581h.mo13018e() & 255) | ((interfaceC2581h.mo13018e() & 255) << 16) | ((interfaceC2581h.mo13018e() & 255) << 8);
    }

    /* JADX INFO: renamed from: a */
    private List<C2483c> m12744a(int i, short s, byte b, int i2) throws IOException {
        C2506z c2506z = this.f15408d;
        c2506z.f15413d = i;
        c2506z.f15410a = i;
        c2506z.f15414e = s;
        c2506z.f15411b = b;
        c2506z.f15412c = i2;
        this.f15406b.m12709a();
        return this.f15406b.m12710b();
    }

    /* JADX INFO: renamed from: a */
    private void m12745a() {
        this.f15407c.mo13024g();
        this.f15407c.mo13018e();
    }

    /* JADX INFO: renamed from: a */
    public final void m12746a(InterfaceC2469aa interfaceC2469aa) throws IOException {
        if (this.f15409e) {
            if (!m12747a(true, interfaceC2469aa)) {
                throw C2487g.m12720b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        InterfaceC2581h interfaceC2581h = this.f15407c;
        C2582i c2582i = C2487g.f15323a;
        C2582i c2582iMo13014c = interfaceC2581h.mo13014c(c2582i.mo13056g());
        Logger logger = f15405a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C2446c.m12576a("<< CONNECTION %s", c2582iMo13014c.mo13054e()));
        }
        if (!c2582i.equals(c2582iMo13014c)) {
            throw C2487g.m12720b("Expected a connection header but was %s", c2582iMo13014c.mo13047a());
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12747a(boolean z, InterfaceC2469aa interfaceC2469aa) throws IOException {
        InterfaceC2581h interfaceC2581h;
        long j;
        try {
            this.f15407c.mo13004a(9L);
            int iM12743a = m12743a(this.f15407c);
            if (iM12743a < 0 || iM12743a > 16384) {
                throw C2487g.m12720b("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM12743a));
            }
            byte bMo13018e = (byte) (this.f15407c.mo13018e() & 255);
            if (z && bMo13018e != 4) {
                throw C2487g.m12720b("Expected a SETTINGS frame but was %s", Byte.valueOf(bMo13018e));
            }
            byte bMo13018e2 = (byte) (this.f15407c.mo13018e() & 255);
            int iMo13024g = this.f15407c.mo13024g() & Integer.MAX_VALUE;
            Logger logger = f15405a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C2487g.m12719a(true, iMo13024g, iM12743a, bMo13018e, bMo13018e2));
            }
            switch (bMo13018e) {
                case 0:
                    boolean z3 = (bMo13018e2 & 1) != 0;
                    if ((bMo13018e2 & 32) != 0) {
                        throw C2487g.m12720b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    short sMo13018e = (bMo13018e2 & 8) != 0 ? (short) (this.f15407c.mo13018e() & 255) : (short) 0;
                    interfaceC2469aa.mo12640a(z3, iMo13024g, this.f15407c, m12742a(iM12743a, bMo13018e2, sMo13018e));
                    interfaceC2581h = this.f15407c;
                    j = sMo13018e;
                    interfaceC2581h.mo13023f(j);
                    return true;
                case 1:
                    if (iMo13024g == 0) {
                        throw C2487g.m12720b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z4 = (bMo13018e2 & 1) != 0;
                    short sMo13018e2 = (bMo13018e2 & 8) != 0 ? (short) (this.f15407c.mo13018e() & 255) : (short) 0;
                    if ((bMo13018e2 & 32) != 0) {
                        m12745a();
                        iM12743a -= 5;
                    }
                    interfaceC2469aa.mo12641a(z4, iMo13024g, m12744a(m12742a(iM12743a, bMo13018e2, sMo13018e2), sMo13018e2, bMo13018e2, iMo13024g));
                    return true;
                case 2:
                    if (iM12743a != 5) {
                        throw C2487g.m12720b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM12743a));
                    }
                    if (iMo13024g == 0) {
                        throw C2487g.m12720b("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    m12745a();
                    return true;
                case 3:
                    if (iM12743a != 4) {
                        throw C2487g.m12720b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iM12743a));
                    }
                    if (iMo13024g == 0) {
                        throw C2487g.m12720b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iMo13024g2 = this.f15407c.mo13024g();
                    EnumC2482b enumC2482bM12697a = EnumC2482b.m12697a(iMo13024g2);
                    if (enumC2482bM12697a == null) {
                        throw C2487g.m12720b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iMo13024g2));
                    }
                    interfaceC2469aa.mo12635a(iMo13024g, enumC2482bM12697a);
                    return true;
                case 4:
                    if (iMo13024g != 0) {
                        throw C2487g.m12720b("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bMo13018e2 & 1) == 0) {
                        if (iM12743a % 6 != 0) {
                            throw C2487g.m12720b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM12743a));
                        }
                        C2480al c2480al = new C2480al();
                        for (int i = 0; i < iM12743a; i += 6) {
                            short sMo13022f = this.f15407c.mo13022f();
                            int iMo13024g3 = this.f15407c.mo13024g();
                            if (sMo13022f == 2) {
                                if (iMo13024g3 != 0 && iMo13024g3 != 1) {
                                    throw C2487g.m12720b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                            } else if (sMo13022f == 3) {
                                sMo13022f = 4;
                            } else if (sMo13022f == 4) {
                                sMo13022f = 7;
                                if (iMo13024g3 < 0) {
                                    throw C2487g.m12720b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                }
                            } else if (sMo13022f == 5 && (iMo13024g3 < 16384 || iMo13024g3 > 16777215)) {
                                throw C2487g.m12720b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iMo13024g3));
                            }
                            c2480al.m12690a(sMo13022f, iMo13024g3);
                        }
                        interfaceC2469aa.mo12638a(c2480al);
                    } else if (iM12743a != 0) {
                        throw C2487g.m12720b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (iMo13024g == 0) {
                        throw C2487g.m12720b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sMo13018e3 = (bMo13018e2 & 8) != 0 ? (short) (this.f15407c.mo13018e() & 255) : (short) 0;
                    interfaceC2469aa.mo12637a(this.f15407c.mo13024g() & Integer.MAX_VALUE, m12744a(m12742a(iM12743a - 4, bMo13018e2, sMo13018e3), sMo13018e3, bMo13018e2, iMo13024g));
                    return true;
                case 6:
                    if (iM12743a != 8) {
                        throw C2487g.m12720b("TYPE_PING length != 8: %s", Integer.valueOf(iM12743a));
                    }
                    if (iMo13024g != 0) {
                        throw C2487g.m12720b("TYPE_PING streamId != 0", new Object[0]);
                    }
                    interfaceC2469aa.mo12639a((bMo13018e2 & 1) != 0, this.f15407c.mo13024g(), this.f15407c.mo13024g());
                    return true;
                case 7:
                    if (iM12743a < 8) {
                        throw C2487g.m12720b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iM12743a));
                    }
                    if (iMo13024g != 0) {
                        throw C2487g.m12720b("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int iMo13024g4 = this.f15407c.mo13024g();
                    int iMo13024g5 = this.f15407c.mo13024g();
                    int i2 = iM12743a - 8;
                    if (EnumC2482b.m12697a(iMo13024g5) == null) {
                        throw C2487g.m12720b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iMo13024g5));
                    }
                    C2582i c2582iMo13014c = C2582i.f15822b;
                    if (i2 > 0) {
                        c2582iMo13014c = this.f15407c.mo13014c(i2);
                    }
                    interfaceC2469aa.mo12636a(iMo13024g4, c2582iMo13014c);
                    return true;
                case 8:
                    if (iM12743a != 4) {
                        throw C2487g.m12720b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM12743a));
                    }
                    long jMo13024g = ((long) this.f15407c.mo13024g()) & 2147483647L;
                    if (jMo13024g == 0) {
                        throw C2487g.m12720b("windowSizeIncrement was 0", Long.valueOf(jMo13024g));
                    }
                    interfaceC2469aa.mo12634a(iMo13024g, jMo13024g);
                    return true;
                default:
                    interfaceC2581h = this.f15407c;
                    j = iM12743a;
                    interfaceC2581h.mo13023f(j);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15407c.close();
    }
}
