package com.anythink.expressad.exoplayer.p093d;

import android.util.Pair;
import com.anythink.expressad.exoplayer.C1500b;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.d.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1547p {

    /* JADX INFO: renamed from: a */
    public static final String f8025a = "LicenseDurationRemaining";

    /* JADX INFO: renamed from: b */
    public static final String f8026b = "PlaybackDurationRemaining";

    private C1547p() {
    }

    /* JADX INFO: renamed from: a */
    private static long m6808a(Map<String, String> map, String str) {
        if (map == null) {
            return C1500b.f7455b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : C1500b.f7455b;
        } catch (NumberFormatException unused) {
            return C1500b.f7455b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Pair<Long, Long> m6809a(InterfaceC1537f<?> interfaceC1537f) {
        Map<String, String> mapMo6730h = interfaceC1537f.mo6730h();
        if (mapMo6730h == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m6808a(mapMo6730h, f8025a)), Long.valueOf(m6808a(mapMo6730h, f8026b)));
    }
}
