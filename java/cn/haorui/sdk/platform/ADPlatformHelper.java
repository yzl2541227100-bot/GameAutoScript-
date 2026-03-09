package cn.haorui.sdk.platform;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import cn.haorui.sdk.core.C0479a;
import cn.haorui.sdk.core.domain.SdkAdInfo;
import cn.haorui.sdk.core.loader.AbstractC0497b;
import cn.haorui.sdk.core.p002ad.AdType;
import cn.haorui.sdk.core.utils.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ADPlatformHelper {
    private static final String TAG = "ADPlatformHelper";

    private static boolean checkPlatformPermission(Context context, String str) {
        List<String> neededPermissions = C0479a.m18a(str).config().getNeededPermissions();
        if (neededPermissions == null) {
            return true;
        }
        Iterator<String> it = neededPermissions.iterator();
        while (it.hasNext()) {
            if (ContextCompat.checkSelfPermission(context, it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkTypeSupport(AbstractC0497b abstractC0497b, String str) {
        for (AdType adType : C0479a.m18a(str).support()) {
            if (abstractC0497b.getAdType().equals(adType)) {
                return true;
            }
        }
        return false;
    }

    public static SdkAdInfo[] filterValidSdk(Context context, SdkAdInfo[] sdkAdInfoArr, AbstractC0497b abstractC0497b) {
        if (sdkAdInfoArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sdkAdInfoArr.length);
        for (int i = 0; i < sdkAdInfoArr.length; i++) {
            if (isSdkValid(context, sdkAdInfoArr[i], abstractC0497b)) {
                arrayList.add(sdkAdInfoArr[i]);
            }
        }
        return (SdkAdInfo[]) arrayList.toArray(new SdkAdInfo[0]);
    }

    private static boolean isSdkValid(Context context, SdkAdInfo sdkAdInfo, AbstractC0497b abstractC0497b) {
        String str;
        String sdk = sdkAdInfo.getSdk();
        if (TextUtils.isEmpty(sdk)) {
            str = "sdk invalid, platform is empty";
        } else {
            Iterator<String> it = PlatformFactory.ploatforms.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(sdk) && checkPlatformPermission(context, sdk) && checkTypeSupport(abstractC0497b, sdk)) {
                    return true;
                }
            }
            str = "sdk invalid (" + sdk + "), check lib import";
        }
        LogUtil.m87e(TAG, str);
        return false;
    }
}
