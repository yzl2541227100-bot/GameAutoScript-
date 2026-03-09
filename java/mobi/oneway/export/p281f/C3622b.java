package mobi.oneway.export.p281f;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: mobi.oneway.export.f.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3622b {

    /* JADX INFO: renamed from: a */
    private static Map<String, Long> f19749a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static long m16853a(int i, String str, String str2) {
        Long l = f19749a.get(i + "-" + str + str2);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX INFO: renamed from: a */
    public static void m16854a(int i, String str, String str2, long j) {
        f19749a.put(i + "-" + str + str2, Long.valueOf(j));
    }
}
