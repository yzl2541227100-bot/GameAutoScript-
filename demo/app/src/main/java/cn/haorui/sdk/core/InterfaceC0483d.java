package cn.haorui.sdk.core;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: cn.haorui.sdk.core.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0483d {
    String getAppId();

    List<String> getNeededPermissions();

    void init(Context context, String str, String str2);
}
