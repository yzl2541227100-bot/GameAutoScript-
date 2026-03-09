package mobi.oneway.export.p281f;

import cn.haorui.sdk.core.HRConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: mobi.oneway.export.f.f */
/* JADX INFO: loaded from: classes2.dex */
public class C3626f {
    /* JADX INFO: renamed from: a */
    public static String m16890a() {
        HashMap map = new HashMap();
        map.put("2", "com.qq.e.ads.ADActivity");
        map.put("3", "com.baidu.mobads.AppActivity");
        map.put("4", "com.bytedance.sdk.openadsdk.multipro.TTMultiProvider");
        map.put("5", "com.yomob.tgsdklib.TGVideoActivity");
        map.put("6", "com.mintegral.msdk.activity.MTGCommonActivity");
        map.put("7", "com.shenqi.sdk.AdActivity");
        map.put("8", "com.sigmob.sdk.base.common.AdActivity");
        map.put("9", "com.vungle.warren.ui.VungleActivity");
        map.put(HRConfig.GENDER_FEMALE, "com.yomob.yomobads.AdActivity");
        map.put("11", "com.kwad.sdk.api.proxy.app.KsRewardVideoActivity");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            try {
                Class.forName((String) entry.getValue());
                sb.append(((String) entry.getKey()) + ",");
            } catch (ClassNotFoundException unused) {
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
