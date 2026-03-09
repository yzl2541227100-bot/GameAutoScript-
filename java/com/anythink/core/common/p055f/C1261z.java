package com.anythink.core.common.p055f;

import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.anythink.core.common.f.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1261z extends AbstractC1247l<C1209ab> {

    /* JADX INFO: renamed from: a */
    public static final int f4506a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f4507b = 2;

    /* JADX INFO: renamed from: ac */
    private String f4508ac;

    /* JADX INFO: renamed from: ad */
    private String f4509ad;

    /* JADX INFO: renamed from: ae */
    private String f4510ae;

    /* JADX INFO: renamed from: af */
    private String f4511af;

    /* JADX INFO: renamed from: ag */
    private String f4512ag;

    /* JADX INFO: renamed from: ah */
    private String f4513ah;

    /* JADX INFO: renamed from: ai */
    private String f4514ai;

    /* JADX INFO: renamed from: aj */
    private String f4515aj;

    /* JADX INFO: renamed from: ak */
    private String f4516ak;

    /* JADX INFO: renamed from: al */
    private String f4517al;

    /* JADX INFO: renamed from: am */
    private long f4518am;

    /* JADX INFO: renamed from: an */
    private int f4519an;

    /* JADX INFO: renamed from: ao */
    private String f4520ao;

    /* JADX INFO: renamed from: ap */
    private String f4521ap;

    /* JADX INFO: renamed from: aq */
    private String f4522aq;

    /* JADX INFO: renamed from: ar */
    private String f4523ar;

    /* JADX INFO: renamed from: as */
    private String f4524as;

    /* JADX INFO: renamed from: c */
    public int f4525c;

    /* JADX INFO: renamed from: d */
    public long f4526d;

    /* JADX INFO: renamed from: e */
    public String f4527e = "";

    /* JADX INFO: renamed from: aj */
    private String m3476aj() {
        return this.f4524as;
    }

    /* JADX INFO: renamed from: ak */
    private int m3477ak() {
        return this.f4525c;
    }

    /* JADX INFO: renamed from: al */
    private long m3478al() {
        return this.f4526d;
    }

    /* JADX INFO: renamed from: am */
    private long m3479am() {
        return this.f4518am;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.f4311q) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.f4311q) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.f4311q) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        r0.add(r10.f4311q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        r5 = false;
        r6 = false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<java.lang.String> m3480b(com.anythink.core.common.p055f.C1209ab r11) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p055f.C1261z.m3480b(com.anythink.core.common.f.ab):java.util.List");
    }

    /* JADX INFO: renamed from: b */
    private void m3481b(int i) {
        this.f4525c = i;
    }

    /* JADX INFO: renamed from: b */
    private void m3482b(long j) {
        this.f4526d = j;
    }

    /* JADX INFO: renamed from: F */
    public final void m3483F(String str) {
        this.f4521ap = str;
    }

    /* JADX INFO: renamed from: G */
    public final void m3484G(String str) {
        this.f4522aq = str;
    }

    /* JADX INFO: renamed from: H */
    public final void m3485H(String str) {
        this.f4523ar = str;
    }

    /* JADX INFO: renamed from: I */
    public final void m3486I(String str) {
        this.f4508ac = str;
    }

    /* JADX INFO: renamed from: J */
    public final void m3487J(String str) {
        this.f4509ad = str;
    }

    /* JADX INFO: renamed from: K */
    public final void m3488K(String str) {
        this.f4510ae = str;
    }

    /* JADX INFO: renamed from: L */
    public final void m3489L(String str) {
        this.f4511af = str;
    }

    /* JADX INFO: renamed from: M */
    public final void m3490M(String str) {
        this.f4512ag = str;
    }

    /* JADX INFO: renamed from: N */
    public final void m3491N(String str) {
        this.f4513ah = str;
    }

    /* JADX INFO: renamed from: O */
    public final void m3492O(String str) {
        this.f4514ai = str;
    }

    /* JADX INFO: renamed from: P */
    public final void m3493P(String str) {
        this.f4515aj = str;
    }

    /* JADX INFO: renamed from: Q */
    public final void m3494Q(String str) {
        this.f4516ak = str;
    }

    /* JADX INFO: renamed from: R */
    public final void m3495R(String str) {
        this.f4517al = str;
    }

    /* JADX INFO: renamed from: S */
    public final String m3496S(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.f4524as);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    /* JADX INFO: renamed from: Y */
    public final int m3497Y() {
        return this.f4519an;
    }

    /* JADX INFO: renamed from: Z */
    public final String m3498Z() {
        return this.f4508ac;
    }

    /* JADX INFO: renamed from: a */
    public final String m3499a() {
        return this.f4520ao;
    }

    /* JADX INFO: renamed from: a */
    public final void m3500a(int i) {
        this.f4519an = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m3501a(long j) {
        this.f4518am = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m3502a(String str) {
        this.f4524as = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3503a(C1209ab c1209ab) {
        return c1209ab == null || System.currentTimeMillis() - this.f4518am > c1209ab.m3257G();
    }

    /* JADX INFO: renamed from: aa */
    public final String m3504aa() {
        return this.f4509ad;
    }

    /* JADX INFO: renamed from: ab */
    public final String m3505ab() {
        return this.f4510ae;
    }

    /* JADX INFO: renamed from: ac */
    public final String m3506ac() {
        return this.f4511af;
    }

    /* JADX INFO: renamed from: ad */
    public final String m3507ad() {
        return this.f4512ag;
    }

    /* JADX INFO: renamed from: ae */
    public final String m3508ae() {
        return this.f4513ah;
    }

    /* JADX INFO: renamed from: af */
    public final String m3509af() {
        return this.f4514ai;
    }

    /* JADX INFO: renamed from: ag */
    public final String m3510ag() {
        return this.f4515aj;
    }

    /* JADX INFO: renamed from: ah */
    public final String m3511ah() {
        return this.f4516ak;
    }

    /* JADX INFO: renamed from: ai */
    public final String m3512ai() {
        return this.f4517al;
    }

    /* JADX INFO: renamed from: b */
    public final String m3513b() {
        return this.f4521ap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.f4311q) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.f4311q) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (android.text.TextUtils.isEmpty(r10.f4311q) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        r0.add(r10.f4311q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        r5 = false;
        r6 = false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.util.List mo2425b(com.anythink.core.common.p055f.AbstractC1249n r11) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.p055f.C1261z.mo2425b(com.anythink.core.common.f.n):java.util.List");
    }

    /* JADX INFO: renamed from: b */
    public final void m3514b(String str) {
        this.f4520ao = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m3515c() {
        return this.f4522aq;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: d */
    public final int mo2426d() {
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public final String m3516e() {
        return this.f4523ar;
    }

    @Override // com.anythink.core.common.p055f.AbstractC1247l
    /* JADX INFO: renamed from: q */
    public final String mo2427q() {
        return this.f4527e;
    }
}
