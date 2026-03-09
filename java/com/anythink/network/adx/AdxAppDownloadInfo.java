package com.anythink.network.adx;

import com.anythink.basead.p016d.C0769h;
import com.anythink.core.api.ATAdAppInfo;

/* JADX INFO: loaded from: classes.dex */
public class AdxAppDownloadInfo extends ATAdAppInfo {
    public String appName;
    public String appPrivacyLink;
    public String appVersion;
    public String apppermissionLink;
    public String functionLink;
    public String publisher;

    public AdxAppDownloadInfo(C0769h c0769h) {
        this.publisher = c0769h.m516i();
        this.appVersion = c0769h.m519l();
        this.appPrivacyLink = c0769h.m518k();
        this.apppermissionLink = c0769h.m517j();
        this.appName = c0769h.m515h();
        this.functionLink = c0769h.m520m();
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getAppDownloadCount() {
        return "";
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getAppName() {
        return this.appName;
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getAppPackageName() {
        return "";
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getAppPermissonUrl() {
        return this.apppermissionLink;
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getAppPrivacyUrl() {
        return this.appPrivacyLink;
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public long getAppSize() {
        return 0L;
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getFunctionUrl() {
        return this.functionLink;
    }

    @Override // com.anythink.core.api.ATAdAppInfo
    public String getPublisher() {
        return this.publisher;
    }
}
