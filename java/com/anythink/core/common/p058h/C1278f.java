package com.anythink.core.common.p058h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.p055f.C1237bc;
import com.anythink.core.common.p065n.C1322e;
import java.util.Map;

/* JADX INFO: renamed from: com.anythink.core.common.h.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1278f extends AbstractC1268a {

    /* JADX INFO: renamed from: c */
    public static final int f4744c = 1;

    /* JADX INFO: renamed from: a */
    public String f4745a;

    /* JADX INFO: renamed from: b */
    public int f4746b;

    /* JADX INFO: renamed from: d */
    private C1237bc f4747d;

    private C1278f(String str) {
        this.f4746b = 0;
        this.f4745a = str;
    }

    private C1278f(String str, C1237bc c1237bc) {
        this(str);
        this.f4746b = 1;
        this.f4747d = c1237bc;
    }

    /* JADX INFO: renamed from: a */
    public static C1278f m3685a(String str) {
        return new C1278f(str);
    }

    /* JADX INFO: renamed from: a */
    public static C1278f m3686a(String str, C1237bc c1237bc) {
        return new C1278f(str, c1237bc);
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final int mo621a() {
        return 2;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final Object mo622a(Object obj) {
        C1237bc c1237bc;
        if (1 != this.f4746b || (c1237bc = this.f4747d) == null) {
            return null;
        }
        c1237bc.m2938a("200");
        C1322e.m3876a(this.f4747d);
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final void mo624a(AdError adError) {
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: a */
    public final boolean mo625a(int i) {
        return false;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final String mo626b() {
        return this.f4745a;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: b */
    public final void mo627b(AdError adError) {
        C1237bc c1237bc;
        if (1 == this.f4746b && ErrorCode.httpStatuException.equals(adError.getCode()) && (c1237bc = this.f4747d) != null) {
            c1237bc.m2938a(adError.getPlatformCode());
            this.f4747d.m2942b(adError.getPlatformMSG());
            C1322e.m3876a(this.f4747d);
        }
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo628c() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: d */
    public final byte[] mo629d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: g */
    public final String mo632g() {
        return "";
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: h */
    public final String mo633h() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: i */
    public final Context mo634i() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: j */
    public final String mo635j() {
        return null;
    }

    @Override // com.anythink.core.common.p058h.AbstractC1268a
    /* JADX INFO: renamed from: k */
    public final Map<String, Object> mo636k() {
        return null;
    }
}
