package cn.haorui.sdk.core.utils;

import cn.haorui.sdk.core.domain.HttpResponse;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpGetWithNoHandlerCallback implements HttpGetWithStringCallback {
    private static final String TAG = "DefaultHttpGetWithNoHandlerCallback";

    @Override // cn.haorui.sdk.core.utils.HttpGetWithStringCallback
    public void onFailure(@NotNull IOException iOException) {
        LogUtil.m88e(TAG, "onFailure: ", iOException);
    }

    @Override // cn.haorui.sdk.core.utils.HttpGetWithStringCallback
    public void onResponse(HttpResponse<String> httpResponse) {
        LogUtil.m86d(TAG, "onResponse: " + httpResponse.getErrorCode());
    }
}
