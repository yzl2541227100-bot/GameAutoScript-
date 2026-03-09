package com.anythink.expressad.video.module.p172a.p173a;

import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p179c.C2333c;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C2178d extends C2185k {
    public C2178d(C1781c c1781c, C2318c c2318c, C2333c c2333c, String str, String str2, InterfaceC2174a interfaceC2174a, int i, boolean z) {
        super(c1781c, c2318c, c2333c, str, str2, interfaceC2174a, i, z);
    }

    @Override // com.anythink.expressad.video.module.p172a.p173a.C2185k, com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    public void mo10950a(int i, Object obj) {
        super.mo10950a(i, obj);
        if (this.f13858W) {
            if (i == 122) {
                m11502a();
                return;
            }
            switch (i) {
                case 109:
                    m11509b(2);
                    m11503a(2);
                    break;
                case 110:
                    C1781c c1781c = this.f13859X;
                    if (c1781c != null && c1781c.m8887k() == 5) {
                        m11506a(obj.toString());
                    }
                    m11509b(1);
                    m11503a(1);
                    break;
                case 111:
                    m11503a(1);
                    break;
            }
        }
    }
}
