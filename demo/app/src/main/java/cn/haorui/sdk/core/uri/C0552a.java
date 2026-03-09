package cn.haorui.sdk.core.uri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import cn.haorui.sdk.activity.HRWebviewActivity;
import cn.haorui.sdk.core.AdSdk;
import cn.haorui.sdk.core.p002ad.AdSlot;
import com.anythink.expressad.foundation.p116d.C1781c;

/* JADX INFO: renamed from: cn.haorui.sdk.core.uri.a */
/* JADX INFO: loaded from: classes.dex */
public class C0552a implements InterfaceC0553b {
    @Override // cn.haorui.sdk.core.uri.InterfaceC0553b
    /* JADX INFO: renamed from: a */
    public boolean mo85a(Context context, Uri uri, AdSlot adSlot) {
        if (!uri.getScheme().startsWith("http")) {
            return false;
        }
        Class<? extends Activity> clsWebViewActivity = AdSdk.adConfig().webViewActivity();
        if (clsWebViewActivity == null) {
            clsWebViewActivity = HRWebviewActivity.class;
        }
        Intent intent = new Intent(context, clsWebViewActivity);
        intent.putExtra(HRWebviewActivity.EXTRA_AD_DURL_KEY, new String[]{uri.toString()});
        if (adSlot.getClickUrl() != null) {
            for (String str : adSlot.getClickUrl()) {
                try {
                    Uri uri2 = Uri.parse(str);
                    if (uri2.getHost() != null && "dsp.1rtb.com".equals(uri2.getHost())) {
                        String strSubstring = null;
                        String strSubstring2 = null;
                        for (String str2 : new String(Base64.decode(uri2.getQueryParameter(C1781c.f10273bN), 3)).split(",")) {
                            if (str2.startsWith("amid=")) {
                                strSubstring = str2.substring(5);
                            } else if (str2.startsWith("uuid=")) {
                                strSubstring2 = str2.substring(5);
                            }
                        }
                        if (!TextUtils.isEmpty(strSubstring)) {
                            intent.putExtra(HRWebviewActivity.EXTRA_AD_AMID_KEY, strSubstring);
                            if (!TextUtils.isEmpty(strSubstring2)) {
                                intent.putExtra(HRWebviewActivity.EXTRA_AD_UUID_KEY, strSubstring2);
                                break;
                            }
                            break;
                        }
                        continue;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        return true;
    }
}
