package com.p188b.p189a.p190a.p191a;

import com.p188b.p189a.C2524aa;
import com.p188b.p189a.C2538ao;
import com.p188b.p189a.C2542as;
import com.p188b.p189a.p190a.p193c.C2450d;
import com.p188b.p189a.p190a.p193c.C2452f;
import java.util.Date;

/* JADX INFO: renamed from: com.b.a.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2432e {

    /* JADX INFO: renamed from: a */
    public final long f15096a;

    /* JADX INFO: renamed from: b */
    public final C2538ao f15097b;

    /* JADX INFO: renamed from: c */
    public final C2542as f15098c;

    /* JADX INFO: renamed from: d */
    private Date f15099d;

    /* JADX INFO: renamed from: e */
    private String f15100e;

    /* JADX INFO: renamed from: f */
    private Date f15101f;

    /* JADX INFO: renamed from: g */
    private String f15102g;

    /* JADX INFO: renamed from: h */
    private Date f15103h;

    /* JADX INFO: renamed from: i */
    private long f15104i;

    /* JADX INFO: renamed from: j */
    private long f15105j;

    /* JADX INFO: renamed from: k */
    private String f15106k;

    /* JADX INFO: renamed from: l */
    private int f15107l;

    public C2432e(long j, C2538ao c2538ao, C2542as c2542as) {
        this.f15107l = -1;
        this.f15096a = j;
        this.f15097b = c2538ao;
        this.f15098c = c2542as;
        if (c2542as != null) {
            this.f15104i = c2542as.m12892h();
            this.f15105j = c2542as.m12893i();
            C2524aa c2524aaM12888d = c2542as.m12888d();
            int iM12787a = c2524aaM12888d.m12787a();
            for (int i = 0; i < iM12787a; i++) {
                String strM12788a = c2524aaM12888d.m12788a(i);
                String strM12791b = c2524aaM12888d.m12791b(i);
                if ("Date".equalsIgnoreCase(strM12788a)) {
                    this.f15099d = C2450d.m12601a(strM12791b);
                    this.f15100e = strM12791b;
                } else if ("Expires".equalsIgnoreCase(strM12788a)) {
                    this.f15103h = C2450d.m12601a(strM12791b);
                } else if ("Last-Modified".equalsIgnoreCase(strM12788a)) {
                    this.f15101f = C2450d.m12601a(strM12791b);
                    this.f15102g = strM12791b;
                } else if ("ETag".equalsIgnoreCase(strM12788a)) {
                    this.f15106k = strM12791b;
                } else if ("Age".equalsIgnoreCase(strM12788a)) {
                    this.f15107l = C2452f.m12608b(strM12791b, -1);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01d5  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v53, types: [com.b.a.ao, com.b.a.as] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.p188b.p189a.p190a.p191a.C2431d m12517a() {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p188b.p189a.p190a.p191a.C2432e.m12517a():com.b.a.a.a.d");
    }
}
