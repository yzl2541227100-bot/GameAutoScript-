package com.anythink.expressad.exoplayer.p105j.p106a;

import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.C1500b;
import com.anythink.expressad.exoplayer.p107k.C1711a;
import com.anythink.expressad.exoplayer.p107k.C1717af;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.anythink.expressad.exoplayer.j.a.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1683n extends C1674e {

    /* JADX INFO: renamed from: g */
    private static final String f9364g = ".v3.exo";

    /* JADX INFO: renamed from: h */
    private static final Pattern f9365h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i */
    private static final Pattern f9366i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: j */
    private static final Pattern f9367j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private C1683n(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.anythink.expressad.exoplayer.p105j.p106a.C1683n m7833a(java.io.File r16, com.anythink.expressad.exoplayer.p105j.p106a.C1677h r17) {
        /*
            r0 = r17
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L6e
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.p105j.p106a.C1683n.f9366i
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L2d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = com.anythink.expressad.exoplayer.p107k.C1717af.m8120h(r1)
            if (r1 != 0) goto L3f
            goto L39
        L2d:
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.p105j.p106a.C1683n.f9365h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L3b
        L39:
            r1 = r6
            goto L64
        L3b:
            java.lang.String r1 = r2.group(r5)
        L3f:
            java.io.File r7 = r16.getParentFile()
            int r8 = r0.m7786c(r1)
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m7836a(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L64
            goto L39
        L64:
            if (r1 != 0) goto L67
            return r6
        L67:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L71
        L6e:
            r2 = r16
            r15 = r2
        L71:
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.p105j.p106a.C1683n.f9367j
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L7e
            return r6
        L7e:
            long r11 = r15.length()
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = r0.m7781a(r2)
            if (r8 != 0) goto L91
            return r6
        L91:
            com.anythink.expressad.exoplayer.j.a.n r0 = new com.anythink.expressad.exoplayer.j.a.n
            java.lang.String r2 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r2)
            java.lang.String r1 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r1)
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.p105j.p106a.C1683n.m7833a(java.io.File, com.anythink.expressad.exoplayer.j.a.h):com.anythink.expressad.exoplayer.j.a.n");
    }

    /* JADX INFO: renamed from: a */
    public static C1683n m7834a(String str, long j) {
        return new C1683n(str, j, -1L, C1500b.f7455b, null);
    }

    /* JADX INFO: renamed from: a */
    public static C1683n m7835a(String str, long j, long j2) {
        return new C1683n(str, j, j2, C1500b.f7455b, null);
    }

    /* JADX INFO: renamed from: a */
    public static File m7836a(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + f9364g);
    }

    /* JADX INFO: renamed from: b */
    public static C1683n m7837b(String str, long j) {
        return new C1683n(str, j, -1L, C1500b.f7455b, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    private static File m7838b(File file, C1677h c1677h) {
        String strGroup;
        String name = file.getName();
        Matcher matcher = f9366i.matcher(name);
        if (matcher.matches()) {
            strGroup = C1717af.m8120h(matcher.group(1));
            if (strGroup == null) {
                return null;
            }
        } else {
            matcher = f9365h.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            strGroup = matcher.group(1);
        }
        File fileM7836a = m7836a(file.getParentFile(), c1677h.m7786c(strGroup), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(fileM7836a)) {
            return fileM7836a;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C1683n m7839a(int i) {
        C1711a.m8012b(this.f9318d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new C1683n(this.f9315a, this.f9316b, this.f9317c, jCurrentTimeMillis, m7836a(this.f9319e.getParentFile(), i, this.f9316b, jCurrentTimeMillis));
    }
}
