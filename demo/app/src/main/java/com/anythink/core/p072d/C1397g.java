package com.anythink.core.p072d;

import android.util.Log;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p051b.C1169h;
import com.anythink.core.common.p051b.C1175n;
import com.anythink.core.common.p055f.C1220am;
import com.anythink.core.common.p058h.InterfaceC1283k;
import com.anythink.core.common.p064m.InterfaceC1312a;
import com.anythink.core.common.p064m.InterfaceRunnableC1313b;
import com.anythink.core.common.p066o.C1355s;
import com.anythink.core.p072d.C1398h;

/* JADX INFO: renamed from: com.anythink.core.d.g */
/* JADX INFO: loaded from: classes.dex */
public class C1397g implements InterfaceC1283k {

    /* JADX INFO: renamed from: a */
    private static final String f6128a = "g";

    /* JADX INFO: renamed from: b */
    private final C1398h f6129b;

    /* JADX INFO: renamed from: c */
    private final C1220am f6130c;

    /* JADX INFO: renamed from: d */
    private final C1398h.b f6131d;

    /* JADX INFO: renamed from: e */
    private final C1396f f6132e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1312a f6133f;

    /* JADX INFO: renamed from: g */
    private boolean[] f6134g;

    /* JADX INFO: renamed from: h */
    private InterfaceRunnableC1313b f6135h;

    public C1397g(C1398h c1398h, C1220am c1220am, C1398h.b bVar, C1396f c1396f) {
        this.f6129b = c1398h;
        this.f6130c = c1220am;
        this.f6131d = bVar;
        this.f6132e = c1396f;
    }

    public C1397g(C1398h c1398h, C1220am c1220am, C1398h.b bVar, C1396f c1396f, InterfaceC1312a interfaceC1312a, InterfaceRunnableC1313b interfaceRunnableC1313b, boolean[] zArr) {
        this.f6129b = c1398h;
        this.f6130c = c1220am;
        this.f6131d = bVar;
        this.f6133f = interfaceC1312a;
        this.f6134g = zArr;
        this.f6135h = interfaceRunnableC1313b;
        this.f6132e = c1396f;
    }

    /* JADX INFO: renamed from: a */
    private void m5133a() {
        InterfaceRunnableC1313b interfaceRunnableC1313b;
        InterfaceC1312a interfaceC1312a = this.f6133f;
        if (interfaceC1312a == null || (interfaceRunnableC1313b = this.f6135h) == null) {
            return;
        }
        interfaceC1312a.mo3801b(interfaceRunnableC1313b);
    }

    @Override // com.anythink.core.common.p058h.InterfaceC1283k
    public void onLoadCanceled(int i) {
        m5133a();
        C1398h.b bVar = this.f6131d;
        if (bVar == null) {
            return;
        }
        C1396f c1396f = this.f6132e;
        if (c1396f == null) {
            bVar.mo2405a(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
        } else {
            bVar.mo2406a(c1396f);
        }
    }

    @Override // com.anythink.core.common.p058h.InterfaceC1283k
    public void onLoadError(int i, String str, AdError adError) {
        C1398h.b bVar;
        m5133a();
        if (this.f6130c != null && ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
            String str2 = this.f6130c.m2590a() + this.f6130c.m2594c() + this.f6130c.m2593b();
            StringBuilder sb = new StringBuilder("code: ");
            sb.append(adError.getPlatformCode());
            sb.append("msg: ");
            sb.append(adError.getPlatformMSG());
            sb.append(", key -> ");
            sb.append(str2);
            C1355s.m4236a(C1175n.m2059a().m2148f(), C1169h.f3040E, str2, System.currentTimeMillis());
            if (C1175n.m2059a().m2095A()) {
                Log.e("anythink", "Please check these params in your code (AppId: " + this.f6130c.m2590a() + ", AppKey: " + this.f6130c.m2593b() + ", PlacementId: " + this.f6130c.m2594c() + ")");
            }
        }
        C1396f c1396f = this.f6132e;
        if (c1396f == null && (bVar = this.f6131d) != null) {
            bVar.mo2405a(adError);
            return;
        }
        C1398h.b bVar2 = this.f6131d;
        if (bVar2 != null) {
            bVar2.mo2406a(c1396f);
        }
    }

    @Override // com.anythink.core.common.p058h.InterfaceC1283k
    public void onLoadFinish(int i, Object obj) {
        m5133a();
        C1398h c1398h = this.f6129b;
        if (c1398h != null) {
            c1398h.m5144a(obj, this.f6130c, this.f6131d, this.f6134g, this.f6132e);
        }
    }

    @Override // com.anythink.core.common.p058h.InterfaceC1283k
    public void onLoadStart(int i) {
    }
}
