package com.octopus.p222ad.internal.utilities;

import android.text.TextUtils;
import com.octopus.p222ad.internal.AsyncTaskC3115h;
import com.octopus.p222ad.utils.p258b.C3255f;
import com.octopus.p222ad.utils.p258b.C3257h;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ReportEventUtil {
    private static final String TAG = "ReportEventUtil";

    public static void report(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            C3255f.m14981a(TAG, "ReportEventUtil:" + str);
            if (!TextUtils.isEmpty(str)) {
                new AsyncTaskC3115h(UrlUtil.replaceToTouchEventUrl(str, "", "", "", "", "", "", "")).executeOnExecutor(C3257h.m14988b().m14990d(), new Void[0]);
            }
        }
    }
}
