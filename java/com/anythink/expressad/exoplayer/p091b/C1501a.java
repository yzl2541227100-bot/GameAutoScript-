package com.anythink.expressad.exoplayer.p091b;

import com.anythink.expressad.exoplayer.C1753m;
import com.anythink.expressad.exoplayer.p093d.C1536e;
import com.anythink.expressad.exoplayer.p107k.C1732o;
import com.anythink.expressad.exoplayer.p107k.C1735r;
import com.anythink.expressad.exoplayer.p107k.C1736s;
import com.anythink.expressad.foundation.p138h.C1879m;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.cyjh.mobileanjian.ipc.share.proto.UiMessage;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1501a {

    /* JADX INFO: renamed from: a */
    public static final int f7511a = 16;

    /* JADX INFO: renamed from: b */
    public static final int f7512b = 10;

    /* JADX INFO: renamed from: c */
    private static final int f7513c = 256;

    /* JADX INFO: renamed from: d */
    private static final int f7514d = 1536;

    /* JADX INFO: renamed from: e */
    private static final int[] f7515e = {1, 2, 3, 6};

    /* JADX INFO: renamed from: f */
    private static final int[] f7516f = {48000, 44100, 32000};

    /* JADX INFO: renamed from: g */
    private static final int[] f7517g = {24000, 22050, 16000};

    /* JADX INFO: renamed from: h */
    private static final int[] f7518h = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: i */
    private static final int[] f7519i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, C1879m.a.f11569a, 512, 576, 640};

    /* JADX INFO: renamed from: j */
    private static final int[] f7520j = {69, 87, 104, InterfaceC2174a.f13808L, 139, 174, UiMessage.CommandToUi.Command_Type.SET_TAB_VALUE, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final int f7521a = -1;

        /* JADX INFO: renamed from: b */
        public static final int f7522b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f7523c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f7524d = 2;

        /* JADX INFO: renamed from: e */
        public final String f7525e;

        /* JADX INFO: renamed from: f */
        public final int f7526f;

        /* JADX INFO: renamed from: g */
        public final int f7527g;

        /* JADX INFO: renamed from: h */
        public final int f7528h;

        /* JADX INFO: renamed from: i */
        public final int f7529i;

        /* JADX INFO: renamed from: j */
        public final int f7530j;

        /* JADX INFO: renamed from: com.anythink.expressad.exoplayer.b.a$a$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC4673a {
        }

        private a(String str, int i, int i2, int i3, int i4, int i5) {
            this.f7525e = str;
            this.f7526f = i;
            this.f7528h = i2;
            this.f7527g = i3;
            this.f7529i = i4;
            this.f7530j = i5;
        }

        public /* synthetic */ a(String str, int i, int i2, int i3, int i4, int i5, byte b) {
            this(str, i, i2, i3, i4, i5);
        }
    }

    private C1501a() {
    }

    /* JADX INFO: renamed from: a */
    public static int m6398a() {
        return f7514d;
    }

    /* JADX INFO: renamed from: a */
    private static int m6399a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f7516f;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f7520j;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f7519i[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX INFO: renamed from: a */
    public static int m6400a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f7515e[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    /* JADX INFO: renamed from: a */
    public static int m6401a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* JADX INFO: renamed from: a */
    private static int m6402a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return m6399a((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* JADX INFO: renamed from: a */
    private static a m6403a(C1735r c1735r) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM8240c;
        int i6;
        int i7;
        int i8;
        int iM8238b = c1735r.m8238b();
        c1735r.m8239b(40);
        boolean z = c1735r.m8240c(5) == 16;
        c1735r.m8236a(iM8238b);
        int i9 = -1;
        if (z) {
            c1735r.m8239b(16);
            int iM8240c2 = c1735r.m8240c(2);
            if (iM8240c2 == 0) {
                i9 = 0;
            } else if (iM8240c2 == 1) {
                i9 = 1;
            } else if (iM8240c2 == 2) {
                i9 = 2;
            }
            c1735r.m8239b(3);
            int iM8240c3 = (c1735r.m8240c(11) + 1) * 2;
            int iM8240c4 = c1735r.m8240c(2);
            if (iM8240c4 == 3) {
                i7 = f7517g[c1735r.m8240c(2)];
                iM8240c = 3;
                i6 = 6;
            } else {
                iM8240c = c1735r.m8240c(2);
                i6 = f7515e[iM8240c];
                i7 = f7516f[iM8240c4];
            }
            int i10 = i6 * 256;
            int iM8240c5 = c1735r.m8240c(3);
            boolean zM8243d = c1735r.m8243d();
            int i11 = f7518h[iM8240c5] + (zM8243d ? 1 : 0);
            c1735r.m8239b(10);
            if (c1735r.m8243d()) {
                c1735r.m8239b(8);
            }
            if (iM8240c5 == 0) {
                c1735r.m8239b(5);
                if (c1735r.m8243d()) {
                    c1735r.m8239b(8);
                }
            }
            if (i9 == 1 && c1735r.m8243d()) {
                c1735r.m8239b(16);
            }
            if (c1735r.m8243d()) {
                if (iM8240c5 > 2) {
                    c1735r.m8239b(2);
                }
                if ((iM8240c5 & 1) != 0 && iM8240c5 > 2) {
                    c1735r.m8239b(6);
                }
                if ((iM8240c5 & 4) != 0) {
                    c1735r.m8239b(6);
                }
                if (zM8243d && c1735r.m8243d()) {
                    c1735r.m8239b(5);
                }
                if (i9 == 0) {
                    if (c1735r.m8243d()) {
                        c1735r.m8239b(6);
                    }
                    if (iM8240c5 == 0 && c1735r.m8243d()) {
                        c1735r.m8239b(6);
                    }
                    if (c1735r.m8243d()) {
                        c1735r.m8239b(6);
                    }
                    int iM8240c6 = c1735r.m8240c(2);
                    if (iM8240c6 == 1) {
                        c1735r.m8239b(5);
                    } else if (iM8240c6 == 2) {
                        c1735r.m8239b(12);
                    } else if (iM8240c6 == 3) {
                        int iM8240c7 = c1735r.m8240c(5);
                        if (c1735r.m8243d()) {
                            c1735r.m8239b(5);
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(4);
                            }
                            if (c1735r.m8243d()) {
                                if (c1735r.m8243d()) {
                                    c1735r.m8239b(4);
                                }
                                if (c1735r.m8243d()) {
                                    c1735r.m8239b(4);
                                }
                            }
                        }
                        if (c1735r.m8243d()) {
                            c1735r.m8239b(5);
                            if (c1735r.m8243d()) {
                                c1735r.m8239b(7);
                                if (c1735r.m8243d()) {
                                    c1735r.m8239b(8);
                                }
                            }
                        }
                        c1735r.m8239b((iM8240c7 + 2) * 8);
                        c1735r.m8244e();
                    }
                    if (iM8240c5 < 2) {
                        if (c1735r.m8243d()) {
                            c1735r.m8239b(14);
                        }
                        if (iM8240c5 == 0 && c1735r.m8243d()) {
                            c1735r.m8239b(14);
                        }
                    }
                    if (c1735r.m8243d()) {
                        if (iM8240c == 0) {
                            c1735r.m8239b(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (c1735r.m8243d()) {
                                    c1735r.m8239b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c1735r.m8243d()) {
                c1735r.m8239b(5);
                if (iM8240c5 == 2) {
                    c1735r.m8239b(4);
                }
                if (iM8240c5 >= 6) {
                    c1735r.m8239b(2);
                }
                if (c1735r.m8243d()) {
                    c1735r.m8239b(8);
                }
                if (iM8240c5 == 0 && c1735r.m8243d()) {
                    c1735r.m8239b(8);
                }
                i8 = 3;
                if (iM8240c4 < 3) {
                    c1735r.m8241c();
                }
            } else {
                i8 = 3;
            }
            if (i9 == 0 && iM8240c != i8) {
                c1735r.m8241c();
            }
            if (i9 == 2 && (iM8240c == i8 || c1735r.m8243d())) {
                c1735r.m8239b(6);
            }
            str = (c1735r.m8243d() && c1735r.m8240c(6) == 1 && c1735r.m8240c(8) == 1) ? C1732o.f9694B : C1732o.f9693A;
            i4 = i9;
            i = iM8240c3;
            i2 = i7;
            i5 = i10;
            i3 = i11;
        } else {
            c1735r.m8239b(32);
            int iM8240c8 = c1735r.m8240c(2);
            int iM6399a = m6399a(iM8240c8, c1735r.m8240c(6));
            c1735r.m8239b(8);
            int iM8240c9 = c1735r.m8240c(3);
            if ((iM8240c9 & 1) != 0 && iM8240c9 != 1) {
                c1735r.m8239b(2);
            }
            if ((iM8240c9 & 4) != 0) {
                c1735r.m8239b(2);
            }
            if (iM8240c9 == 2) {
                c1735r.m8239b(2);
            }
            int i13 = f7516f[iM8240c8];
            int i14 = f7518h[iM8240c9] + (c1735r.m8243d() ? 1 : 0);
            str = C1732o.f9756z;
            i = iM6399a;
            i2 = i13;
            i3 = i14;
            i4 = -1;
            i5 = f7514d;
        }
        return new a(str, i4, i3, i2, i, i5, (byte) 0);
    }

    /* JADX INFO: renamed from: a */
    public static C1753m m6404a(C1736s c1736s, String str, String str2, C1536e c1536e) {
        int i = f7516f[(c1736s.m8273d() & 192) >> 6];
        int iM8273d = c1736s.m8273d();
        int i2 = f7518h[(iM8273d & 56) >> 3];
        if ((iM8273d & 4) != 0) {
            i2++;
        }
        return C1753m.m8395a(str, C1732o.f9756z, null, -1, i2, i, null, c1536e, str2);
    }

    /* JADX INFO: renamed from: b */
    public static int m6405b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((byteBuffer.getInt(i + 4) & (-16777217)) == -1167101192) {
                return i - iPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    private static int m6406b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static C1753m m6407b(C1736s c1736s, String str, String str2, C1536e c1536e) {
        c1736s.m8274d(2);
        int i = f7516f[(c1736s.m8273d() & 192) >> 6];
        int iM8273d = c1736s.m8273d();
        int i2 = f7518h[(iM8273d & 14) >> 1];
        if ((iM8273d & 1) != 0) {
            i2++;
        }
        if (((c1736s.m8273d() & 30) >> 1) > 0 && (2 & c1736s.m8273d()) != 0) {
            i2 += 2;
        }
        return C1753m.m8395a(str, (c1736s.m8265a() <= 0 || (c1736s.m8273d() & 1) == 0) ? C1732o.f9693A : C1732o.f9694B, null, -1, i2, i, null, c1536e, str2);
    }
}
