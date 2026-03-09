package com.octopus.p222ad.internal;

import com.octopus.p222ad.internal.utilities.HaoboLog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.octopus.ad.internal.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3129o implements InterfaceC3112e {

    /* JADX INFO: renamed from: a */
    private long f17404a = -1;

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f17405b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public abstract void mo14400c();

    /* JADX INFO: renamed from: e */
    public void m14591e() {
        this.f17404a = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public void m14592f() {
        if (this.f17405b.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Mediation Classes: \n");
        for (int size = this.f17405b.size(); size > 0; size--) {
            sb.append(String.format("%d: %s\n", Integer.valueOf(size), this.f17405b.get(size - 1)));
        }
        HaoboLog.m14611i(HaoboLog.mediationLogTag, sb.toString());
        this.f17405b.clear();
    }
}
