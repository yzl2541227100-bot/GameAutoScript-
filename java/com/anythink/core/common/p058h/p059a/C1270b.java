package com.anythink.core.common.p058h.p059a;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.anythink.core.common.h.a.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1270b extends AbstractC1271c {

    /* JADX INFO: renamed from: a */
    public String f4602a;

    /* JADX INFO: renamed from: c */
    public int f4604c;

    /* JADX INFO: renamed from: k */
    private final String f4605k = C1270b.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public boolean f4603b = true;

    public C1270b(String str, int i) {
        this.f4604c = 1;
        this.f4602a = str;
        if (i == 1000) {
            this.f4604c = 1;
        } else if (i == 1001) {
            this.f4604c = 2;
        }
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: a */
    public final void mo3648a(String str, String str2, String str3, int i) {
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: c */
    public final int mo3650c() {
        return this.f4604c;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: d */
    public final int mo3651d() {
        return 3;
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: e */
    public final byte[] mo3652e() {
        return !TextUtils.isEmpty(this.f4602a) ? AbstractC1271c.m3655a(this.f4602a) : new byte[0];
    }

    @Override // com.anythink.core.common.p058h.p059a.AbstractC1271c
    /* JADX INFO: renamed from: f */
    public final boolean mo3653f() {
        return this.f4603b;
    }
}
