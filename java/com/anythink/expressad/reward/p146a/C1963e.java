package com.anythink.expressad.reward.p146a;

import com.anythink.expressad.p089e.InterfaceC1491b;
import com.anythink.expressad.videocommon.p181e.C2340d;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.anythink.expressad.reward.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1963e implements InterfaceC1491b {

    /* JADX INFO: renamed from: a */
    private static final String f12288a = "RewardUnitCacheManager";

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, C2340d> f12289b;

    /* JADX INFO: renamed from: com.anythink.expressad.reward.a.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private static final C1963e f12290a = new C1963e(0);

        private a() {
        }
    }

    private C1963e() {
        this.f12289b = new ConcurrentHashMap<>();
    }

    public /* synthetic */ C1963e(byte b) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C1963e m10326a() {
        return a.f12290a;
    }

    /* JADX INFO: renamed from: a */
    public final C2340d m10327a(String str, String str2) {
        try {
            try {
                return this.f12289b.remove(str + "_" + str2);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10328a(String str, String str2, C2340d c2340d) {
        try {
            String str3 = str + "_" + str2;
            if (c2340d != null && this.f12289b.containsKey(str3)) {
                this.f12289b.remove(str3);
            }
            this.f12289b.put(str3, c2340d);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
