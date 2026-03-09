package com.anythink.expressad.videocommon.p180d;

import android.text.TextUtils;
import com.anythink.core.common.p050a.C1150b;
import com.anythink.core.common.p065n.C1318a;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.videocommon.d.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2335b implements InterfaceC2334a {

    /* JADX INFO: renamed from: a */
    private final String f14508a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f14509b = false;

    public AbstractC2335b(final Map<String, Object> map, String str) {
        this.f14508a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map != null) {
            map.put(C1150b.b.f2927a, 4);
        }
        C1318a.m3818a().m3820a(str, new C1318a.a() { // from class: com.anythink.expressad.videocommon.d.b.1
            @Override // com.anythink.core.common.p065n.C1318a.a
            /* JADX INFO: renamed from: a */
            public final void mo550a(String str2) {
                if (!AbstractC2335b.this.f14508a.equals(str2) || AbstractC2335b.this.f14509b) {
                    return;
                }
                Map map2 = map;
                if (map2 != null) {
                    map2.put(C1150b.b.f2927a, 3);
                }
                AbstractC2335b.this.mo376a(false, "", 0.0f);
            }
        });
    }

    @Override // com.anythink.expressad.videocommon.p180d.InterfaceC2334a
    /* JADX INFO: renamed from: a */
    public void mo376a(boolean z, String str, float f) {
        if (this.f14509b) {
            return;
        }
        this.f14509b = true;
    }
}
