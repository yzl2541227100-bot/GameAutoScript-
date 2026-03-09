package com.anythink.expressad.video.module.p172a.p173a;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p179c.C2333c;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2182h extends C2185k {
    public C2182h(C1781c c1781c, C2318c c2318c, C2333c c2333c, String str, String str2, InterfaceC2174a interfaceC2174a, int i, boolean z) {
        super(c1781c, c2318c, c2333c, str, str2, interfaceC2174a, i, z);
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2185k, com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    public final void mo10950a(int i, Object obj) {
        int i2;
        if (i == 100) {
            m11512e();
            m11511d();
            m11510c();
            m11503a(2);
        } else if (i == 109) {
            m11509b(2);
        } else if (i == 122) {
            m11502a();
        } else if (i != 129) {
            String str = "";
            if (i == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                i2 = 3;
            } else if (i == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                i2 = 4;
            }
            m11504a(i2, str);
        } else {
            C1781c c1781c = this.f13859X;
            if (c1781c != null && c1781c.m8802J() == 2) {
                m11512e();
                m11511d();
                m11510c();
                m11503a(1);
            }
        }
        super.mo10950a(i, obj);
    }
}
