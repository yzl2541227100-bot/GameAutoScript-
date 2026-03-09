package com.anythink.expressad.exoplayer.p105j.p106a;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.p105j.C1694k;
import com.anythink.expressad.exoplayer.p105j.InterfaceC1691h;
import com.anythink.expressad.exoplayer.p105j.p106a.InterfaceC1670a;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import com.anythink.expressad.exoplayer.p107k.C1739v;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1675f {

    /* JADX INFO: renamed from: a */
    public static final int f9321a = 131072;

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public volatile long f9322a;

        /* JADX INFO: renamed from: b */
        public volatile long f9323b;

        /* JADX INFO: renamed from: c */
        public volatile long f9324c = -1;

        /* JADX INFO: renamed from: a */
        private long m7759a() {
            return this.f9322a + this.f9323b;
        }
    }

    private C1675f() {
    }

    /* JADX INFO: renamed from: a */
    private static long m7752a(C1694k c1694k, long j, long j2, InterfaceC1691h interfaceC1691h, byte[] bArr, C1739v c1739v, a aVar) {
        C1694k c1694k2 = c1694k;
        while (true) {
            if (c1739v != null) {
                c1739v.m8303b();
            }
            try {
                try {
                    if (Thread.interrupted()) {
                        throw new InterruptedException();
                    }
                    C1694k c1694k3 = new C1694k(c1694k2.f9395c, c1694k2.f9396d, j, (c1694k2.f9398f + j) - c1694k2.f9397e, -1L, c1694k2.f9400h, c1694k2.f9401i | 2);
                    try {
                        long jMo7742a = interfaceC1691h.mo7742a(c1694k3);
                        if (aVar.f9324c == -1 && jMo7742a != -1) {
                            aVar.f9324c = c1694k3.f9397e + jMo7742a;
                        }
                        long j3 = 0;
                        while (true) {
                            if (j3 == j2) {
                                break;
                            }
                            if (Thread.interrupted()) {
                                throw new InterruptedException();
                            }
                            int iMo7741a = interfaceC1691h.mo7741a(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
                            if (iMo7741a != -1) {
                                long j4 = iMo7741a;
                                j3 += j4;
                                aVar.f9323b += j4;
                            } else if (aVar.f9324c == -1) {
                                aVar.f9324c = c1694k3.f9397e + j3;
                            }
                        }
                        return j3;
                    } catch (C1739v.a unused) {
                        c1694k2 = c1694k3;
                    }
                } finally {
                    C1717af.m8074a(interfaceC1691h);
                }
            } catch (C1739v.a unused2) {
            }
            C1717af.m8074a(interfaceC1691h);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m7753a(Uri uri) {
        return uri.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m7754a(C1694k c1694k) {
        String str = c1694k.f9400h;
        return str != null ? str : c1694k.f9395c.toString();
    }

    /* JADX INFO: renamed from: a */
    private static void m7755a(InterfaceC1670a interfaceC1670a, String str) {
        Iterator<C1674e> it = interfaceC1670a.mo7703a(str).iterator();
        while (it.hasNext()) {
            try {
                interfaceC1670a.mo7714b(it.next());
            } catch (InterfaceC1670a.a unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7756a(C1694k c1694k, InterfaceC1670a interfaceC1670a, C1672c c1672c, byte[] bArr, C1739v c1739v, @Nullable a aVar, @Nullable AtomicBoolean atomicBoolean) throws InterruptedException {
        a aVar2;
        String str;
        long j;
        long j2;
        C1711a.m8005a(c1672c);
        C1711a.m8005a(bArr);
        long j3 = 0;
        if (aVar != null) {
            String strM7754a = m7754a(c1694k);
            long j4 = c1694k.f9397e;
            long jMo7710b = c1694k.f9399g;
            if (jMo7710b == -1) {
                jMo7710b = interfaceC1670a.mo7710b(strM7754a);
            }
            aVar.f9324c = jMo7710b;
            aVar.f9322a = 0L;
            aVar.f9323b = 0L;
            long j5 = j4;
            long j6 = jMo7710b;
            while (j6 != 0) {
                long jMo7711b = interfaceC1670a.mo7711b(strM7754a, j5, j6 != -1 ? j6 : Long.MAX_VALUE);
                if (jMo7711b <= 0) {
                    jMo7711b = -jMo7711b;
                    if (jMo7711b == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar.f9322a += jMo7711b;
                }
                j5 += jMo7711b;
                if (j6 == -1) {
                    jMo7711b = 0;
                }
                j6 -= jMo7711b;
            }
            aVar2 = aVar;
        } else {
            aVar2 = new a();
        }
        String strM7754a2 = m7754a(c1694k);
        long j7 = c1694k.f9397e;
        long jMo7710b2 = c1694k.f9399g;
        if (jMo7710b2 == -1) {
            jMo7710b2 = interfaceC1670a.mo7710b(strM7754a2);
        }
        long j8 = j7;
        long j9 = jMo7710b2;
        while (j9 != j3) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long jMo7711b2 = interfaceC1670a.mo7711b(strM7754a2, j8, j9 != -1 ? j9 : Long.MAX_VALUE);
            if (jMo7711b2 <= j3) {
                long j10 = -jMo7711b2;
                str = strM7754a2;
                j = j3;
                if (m7752a(c1694k, j8, j10, c1672c, bArr, c1739v, aVar2) < j10) {
                    return;
                } else {
                    j2 = j10;
                }
            } else {
                str = strM7754a2;
                j = j3;
                j2 = jMo7711b2;
            }
            j8 += j2;
            if (j9 == -1) {
                j2 = j;
            }
            j9 -= j2;
            strM7754a2 = str;
            j3 = j;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7757a(C1694k c1694k, InterfaceC1670a interfaceC1670a, a aVar) {
        String strM7754a = m7754a(c1694k);
        long j = c1694k.f9397e;
        long jMo7710b = c1694k.f9399g;
        if (jMo7710b == -1) {
            jMo7710b = interfaceC1670a.mo7710b(strM7754a);
        }
        aVar.f9324c = jMo7710b;
        aVar.f9322a = 0L;
        aVar.f9323b = 0L;
        long j2 = j;
        long j3 = jMo7710b;
        while (j3 != 0) {
            long jMo7711b = interfaceC1670a.mo7711b(strM7754a, j2, j3 != -1 ? j3 : Long.MAX_VALUE);
            if (jMo7711b > 0) {
                aVar.f9322a += jMo7711b;
            } else {
                jMo7711b = -jMo7711b;
                if (jMo7711b == Long.MAX_VALUE) {
                    return;
                }
            }
            j2 += jMo7711b;
            if (j3 == -1) {
                jMo7711b = 0;
            }
            j3 -= jMo7711b;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m7758a(C1694k c1694k, InterfaceC1670a interfaceC1670a, InterfaceC1691h interfaceC1691h, @Nullable a aVar, @Nullable AtomicBoolean atomicBoolean) throws InterruptedException {
        a aVar2;
        String str;
        long j;
        long j2;
        C1672c c1672c = new C1672c(interfaceC1670a, interfaceC1691h);
        byte[] bArr = new byte[131072];
        C1711a.m8005a(c1672c);
        C1711a.m8005a(bArr);
        long j3 = 0;
        if (aVar != null) {
            String strM7754a = m7754a(c1694k);
            long j4 = c1694k.f9397e;
            long jMo7710b = c1694k.f9399g;
            if (jMo7710b == -1) {
                jMo7710b = interfaceC1670a.mo7710b(strM7754a);
            }
            aVar.f9324c = jMo7710b;
            aVar.f9322a = 0L;
            aVar.f9323b = 0L;
            long j5 = j4;
            long j6 = jMo7710b;
            while (j6 != 0) {
                String str2 = strM7754a;
                long jMo7711b = interfaceC1670a.mo7711b(strM7754a, j5, j6 != -1 ? j6 : Long.MAX_VALUE);
                if (jMo7711b <= 0) {
                    jMo7711b = -jMo7711b;
                    if (jMo7711b == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar.f9322a += jMo7711b;
                }
                j5 += jMo7711b;
                if (j6 == -1) {
                    jMo7711b = 0;
                }
                j6 -= jMo7711b;
                strM7754a = str2;
            }
            aVar2 = aVar;
        } else {
            aVar2 = new a();
        }
        String strM7754a2 = m7754a(c1694k);
        long j7 = c1694k.f9397e;
        long jMo7710b2 = c1694k.f9399g;
        if (jMo7710b2 == -1) {
            jMo7710b2 = interfaceC1670a.mo7710b(strM7754a2);
        }
        long j8 = j7;
        long j9 = jMo7710b2;
        while (j9 != j3) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long jMo7711b2 = interfaceC1670a.mo7711b(strM7754a2, j8, j9 != -1 ? j9 : Long.MAX_VALUE);
            if (jMo7711b2 <= j3) {
                long j10 = -jMo7711b2;
                str = strM7754a2;
                j = j3;
                if (m7752a(c1694k, j8, j10, c1672c, bArr, (C1739v) null, aVar2) < j10) {
                    return;
                } else {
                    j2 = j10;
                }
            } else {
                str = strM7754a2;
                j = j3;
                j2 = jMo7711b2;
            }
            j8 += j2;
            if (j9 == -1) {
                j2 = j;
            }
            j9 -= j2;
            strM7754a2 = str;
            j3 = j;
        }
    }
}
