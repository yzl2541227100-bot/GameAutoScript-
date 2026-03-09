package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.C3428at;

/* JADX INFO: renamed from: com.umeng.commonsdk.proguard.bc */
/* JADX INFO: loaded from: classes2.dex */
public class C3438bc {

    /* JADX INFO: renamed from: a */
    private static int f18767a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public static InterfaceC3437bb m15854a(byte[] bArr, InterfaceC3437bb interfaceC3437bb) {
        return bArr[0] > 16 ? new C3428at.a() : (bArr.length <= 1 || (bArr[1] & 128) == 0) ? interfaceC3437bb : new C3428at.a();
    }

    /* JADX INFO: renamed from: a */
    public static void m15855a(int i) {
        f18767a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m15856a(AbstractC3434az abstractC3434az, byte b) throws C3415ag {
        m15857a(abstractC3434az, b, f18767a);
    }

    /* JADX INFO: renamed from: a */
    public static void m15857a(AbstractC3434az abstractC3434az, byte b, int i) throws C3415ag {
        if (i <= 0) {
            throw new C3415ag("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                abstractC3434az.mo15818t();
                return;
            case 3:
                abstractC3434az.mo15819u();
                return;
            case 4:
                abstractC3434az.mo15823y();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                abstractC3434az.mo15820v();
                return;
            case 8:
                abstractC3434az.mo15821w();
                return;
            case 10:
                abstractC3434az.mo15822x();
                return;
            case 11:
                abstractC3434az.mo15781A();
                return;
            case 12:
                abstractC3434az.mo15808j();
                while (true) {
                    byte b2 = abstractC3434az.mo15810l().f18741b;
                    if (b2 == 0) {
                        abstractC3434az.mo15809k();
                        return;
                    } else {
                        m15857a(abstractC3434az, b2, i - 1);
                        abstractC3434az.mo15811m();
                    }
                }
                break;
            case 13:
                C3431aw c3431awMo15812n = abstractC3434az.mo15812n();
                while (i2 < c3431awMo15812n.f18747c) {
                    int i3 = i - 1;
                    m15857a(abstractC3434az, c3431awMo15812n.f18745a, i3);
                    m15857a(abstractC3434az, c3431awMo15812n.f18746b, i3);
                    i2++;
                }
                abstractC3434az.mo15813o();
                return;
            case 14:
                C3439bd c3439bdMo15816r = abstractC3434az.mo15816r();
                while (i2 < c3439bdMo15816r.f18769b) {
                    m15857a(abstractC3434az, c3439bdMo15816r.f18768a, i - 1);
                    i2++;
                }
                abstractC3434az.mo15817s();
                return;
            case 15:
                C3430av c3430avMo15814p = abstractC3434az.mo15814p();
                while (i2 < c3430avMo15814p.f18744b) {
                    m15857a(abstractC3434az, c3430avMo15814p.f18743a, i - 1);
                    i2++;
                }
                abstractC3434az.mo15815q();
                return;
        }
    }
}
