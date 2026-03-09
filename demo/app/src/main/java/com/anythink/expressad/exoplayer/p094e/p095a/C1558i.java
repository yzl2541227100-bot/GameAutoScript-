package com.anythink.expressad.exoplayer.p094e.p095a;

import android.support.v4.media.session.PlaybackStateCompat;
import com.anythink.expressad.exoplayer.p094e.InterfaceC1567f;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1736s;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.e.a.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1558i {

    /* JADX INFO: renamed from: a */
    private static final int f8312a = 4096;

    /* JADX INFO: renamed from: b */
    private static final int[] f8313b = {C1717af.m8116f("isom"), C1717af.m8116f("iso2"), C1717af.m8116f("iso3"), C1717af.m8116f("iso4"), C1717af.m8116f("iso5"), C1717af.m8116f("iso6"), C1717af.m8116f("avc1"), C1717af.m8116f("hvc1"), C1717af.m8116f("hev1"), C1717af.m8116f("mp41"), C1717af.m8116f("mp42"), C1717af.m8116f("3g2a"), C1717af.m8116f("3g2b"), C1717af.m8116f("3gr6"), C1717af.m8116f("3gs6"), C1717af.m8116f("3ge6"), C1717af.m8116f("3gg6"), C1717af.m8116f("M4V "), C1717af.m8116f("M4A "), C1717af.m8116f("f4v "), C1717af.m8116f("kddi"), C1717af.m8116f("M4VP"), C1717af.m8116f("qt  "), C1717af.m8116f("MSNV")};

    private C1558i() {
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6944a(int i) {
        if ((i >>> 8) == C1717af.m8116f("3gp")) {
            return true;
        }
        for (int i2 : f8313b) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6945a(InterfaceC1567f interfaceC1567f) {
        return m6946a(interfaceC1567f, true);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m6946a(InterfaceC1567f interfaceC1567f, boolean z) {
        boolean z3;
        long jMo6975d = interfaceC1567f.mo6975d();
        long j = -1;
        if (jMo6975d == -1 || jMo6975d > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            jMo6975d = 4096;
        }
        int i = (int) jMo6975d;
        C1736s c1736s = new C1736s(64);
        int i2 = 0;
        boolean z4 = false;
        while (i2 < i) {
            c1736s.m8266a(8);
            interfaceC1567f.mo6976d(c1736s.f9792a, 0, 8);
            long jM8279h = c1736s.m8279h();
            int iM8280i = c1736s.m8280i();
            int i3 = 16;
            if (jM8279h == 1) {
                interfaceC1567f.mo6976d(c1736s.f9792a, 8, 8);
                c1736s.m8270b(16);
                jM8279h = c1736s.m8285n();
            } else {
                if (jM8279h == 0) {
                    long jMo6975d2 = interfaceC1567f.mo6975d();
                    if (jMo6975d2 != j) {
                        jM8279h = 8 + (jMo6975d2 - interfaceC1567f.mo6972c());
                    }
                }
                i3 = 8;
            }
            long j2 = i3;
            if (jM8279h >= j2) {
                i2 += i3;
                if (iM8280i != AbstractC1550a.f8043G) {
                    if (iM8280i != AbstractC1550a.f8052P && iM8280i != AbstractC1550a.f8054R) {
                        if ((((long) i2) + jM8279h) - j2 >= i) {
                            break;
                        }
                        int i4 = (int) (jM8279h - j2);
                        i2 += i4;
                        if (iM8280i == AbstractC1550a.f8114f) {
                            if (i4 < 8) {
                                return false;
                            }
                            c1736s.m8266a(i4);
                            interfaceC1567f.mo6976d(c1736s.f9792a, 0, i4);
                            int i5 = i4 / 4;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    break;
                                }
                                if (i6 == 1) {
                                    c1736s.m8274d(4);
                                } else if (m6944a(c1736s.m8280i())) {
                                    z4 = true;
                                    break;
                                }
                                i6++;
                            }
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            interfaceC1567f.mo6978e(i4);
                        }
                        j = -1;
                    } else {
                        z3 = true;
                        break;
                    }
                }
            } else {
                return false;
            }
        }
        z3 = false;
        return z4 && z == z3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6947b(InterfaceC1567f interfaceC1567f) {
        return m6946a(interfaceC1567f, false);
    }
}
