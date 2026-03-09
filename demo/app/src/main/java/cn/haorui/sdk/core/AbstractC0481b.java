package cn.haorui.sdk.core;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: cn.haorui.sdk.core.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0481b implements InterfaceC0483d {
    public String appId;

    @Override // cn.haorui.sdk.core.InterfaceC0483d
    public String getAppId() {
        return this.appId;
    }

    @Override // cn.haorui.sdk.core.InterfaceC0483d
    public List<String> getNeededPermissions() {
        return null;
    }

    @Override // cn.haorui.sdk.core.InterfaceC0483d
    public void init(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(this.appId) || context == null) {
            return;
        }
        this.appId = str;
        onInit(context, str, str2);
    }

    public void onInit(Context context, String str, String str2) {
    }
}
