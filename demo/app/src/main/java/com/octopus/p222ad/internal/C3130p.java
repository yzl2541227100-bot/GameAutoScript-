package com.octopus.p222ad.internal;

import com.octopus.p222ad.RewardItem;

/* JADX INFO: renamed from: com.octopus.ad.internal.p */
/* JADX INFO: loaded from: classes2.dex */
public class C3130p implements RewardItem {

    /* JADX INFO: renamed from: a */
    private String f17406a;

    /* JADX INFO: renamed from: b */
    private int f17407b;

    public C3130p(String str, int i) {
        this.f17406a = str;
        this.f17407b = i;
    }

    @Override // com.octopus.p222ad.RewardItem
    public int getAmount() {
        return this.f17407b;
    }

    @Override // com.octopus.p222ad.RewardItem
    public String getType() {
        return this.f17406a;
    }
}
