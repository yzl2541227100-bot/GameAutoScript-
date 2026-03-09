package com.anythink.expressad.video.module.p172a.p173a;

import com.anythink.core.common.p064m.C1315d;
import com.anythink.core.common.p064m.InterfaceC1312a;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.expressad.foundation.p116d.C1781c;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.module.p172a.InterfaceC2174a;
import com.anythink.expressad.videocommon.p178b.C2318c;
import com.anythink.expressad.videocommon.p179c.C2333c;

/* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2187m extends C2189o {

    /* JADX INFO: renamed from: ag */
    public static final long f13871ag = 3000;

    /* JADX INFO: renamed from: ai */
    private AnythinkVideoView f13872ai;

    /* JADX INFO: renamed from: aj */
    private AnythinkContainerView f13873aj;

    /* JADX INFO: renamed from: ak */
    private int f13874ak;

    /* JADX INFO: renamed from: al */
    private final InterfaceC1312a f13875al;

    /* JADX INFO: renamed from: am */
    private boolean f13876am;

    /* JADX INFO: renamed from: an */
    private boolean f13877an;

    /* JADX INFO: renamed from: ao */
    private int f13878ao;

    /* JADX INFO: renamed from: ap */
    private int f13879ap;

    /* JADX INFO: renamed from: aq */
    private final InterfaceRunnableC1313b f13880aq;

    /* JADX INFO: renamed from: com.anythink.expressad.video.module.a.a.m$1 */
    public class AnonymousClass1 implements InterfaceRunnableC1313b {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2187m.this.f13873aj.showVideoClickView(-1);
            C2187m.this.f13872ai.soundOperate(0, 2);
        }
    }

    public C2187m(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, C1781c c1781c, C2333c c2333c, C2318c c2318c, String str, String str2, int i, int i2, InterfaceC2174a interfaceC2174a, int i3, boolean z, int i4) {
        super(c1781c, c2333c, c2318c, str, str2, interfaceC2174a, i3, z);
        this.f13875al = C1315d.m3806a();
        this.f13876am = false;
        this.f13877an = false;
        this.f13878ao = 1;
        this.f13880aq = new InterfaceRunnableC1313b() { // from class: com.anythink.expressad.video.module.a.a.m.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2187m.this.f13873aj.showVideoClickView(-1);
                C2187m.this.f13872ai.soundOperate(0, 2);
            }
        };
        this.f13872ai = anythinkVideoView;
        this.f13873aj = anythinkContainerView;
        this.f13879ap = i;
        this.f13874ak = i2;
        this.f13878ao = i4;
        if (anythinkVideoView != null) {
            this.f13876am = anythinkVideoView.getVideoSkipTime() == 0;
        }
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.f13858W = false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11515a(int i, int i2) {
        C1781c c1781c;
        if (this.f13876am || this.f13872ai == null || (c1781c = this.f13859X) == null) {
            return;
        }
        int i3 = this.f13874ak;
        char c = (i3 < 0 || i < i3) ? (char) 1 : (char) 2;
        if (c != 2 && (c1781c.m8881i() != 0 ? i > this.f13859X.m8881i() : this.f13872ai.mCurrPlayNum > 1)) {
            c = 2;
        }
        if (c != 2 && this.f13872ai.mCurrPlayNum > 1 && i == i2) {
            c = 2;
        }
        if (c == 2) {
            this.f13872ai.closeVideoOperate(0, 2);
            this.f13876am = true;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m11517g() {
        this.f13875al.mo3801b(this.f13880aq);
    }

    /* JADX INFO: renamed from: h */
    private void m11518h() {
        m11517g();
        this.f13875al.mo3799a(this.f13880aq);
    }

    /* JADX INFO: renamed from: i */
    private void m11519i() {
        C1781c c1781c = this.f13859X;
        if (c1781c == null || c1781c.m8887k() != 5) {
            return;
        }
        C1781c c1781c2 = null;
        AnythinkVideoView anythinkVideoView = this.f13872ai;
        if (anythinkVideoView != null && anythinkVideoView.mCampOrderViewData != null) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 < this.f13872ai.mCampOrderViewData.size()) {
                    if (this.f13872ai.mCampOrderViewData.get(i2) != null && this.f13872ai.mCampOrderViewData.get(i2).m10146aZ() == this.f13859X.m10146aZ()) {
                        i = i2 - 1;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i >= 0 && this.f13872ai.mCampOrderViewData.get(i) != null) {
                c1781c2 = this.f13872ai.mCampOrderViewData.get(i);
            }
        }
        if (c1781c2 != null) {
            AnythinkVideoView anythinkVideoView2 = this.f13872ai;
            if (anythinkVideoView2 != null) {
                anythinkVideoView2.setCampaign(c1781c2);
            }
            AnythinkContainerView anythinkContainerView = this.f13873aj;
            if (anythinkContainerView != null) {
                anythinkContainerView.setCampaign(c1781c2);
            }
            m11505a(c1781c2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x021f A[PHI: r0
  0x021f: PHI (r0v33 com.anythink.expressad.video.module.AnythinkVideoView) = 
  (r0v32 com.anythink.expressad.video.module.AnythinkVideoView)
  (r0v36 com.anythink.expressad.video.module.AnythinkVideoView)
 binds: [B:367:0x021d, B:361:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0299  */
    @Override // com.anythink.expressad.video.module.p172a.p173a.C2189o, com.anythink.expressad.video.module.p172a.p173a.C2185k, com.anythink.expressad.video.module.p172a.p173a.C2180f, com.anythink.expressad.video.module.p172a.InterfaceC2174a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10950a(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.p172a.p173a.C2187m.mo10950a(int, java.lang.Object):void");
    }
}
