package com.anythink.core.api;

import com.anythink.core.common.p051b.C1175n;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ATMediationRequestInfo {
    public String adSourceId;
    public String className;
    public int networkFirmId;

    public String getAdSourceId() {
        return this.adSourceId;
    }

    public String getClassName() {
        return this.className;
    }

    public int getNetworkFirmId() {
        return this.networkFirmId;
    }

    public abstract Map<String, Object> getRequestParamMap();

    public void setAdSourceId(String str) {
        this.adSourceId = str;
        C1175n.m2059a();
        C1175n.m2087o(str);
    }

    public abstract void setFormat(String str);
}
