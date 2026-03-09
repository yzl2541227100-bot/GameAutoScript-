package com.umeng.analytics;

import android.content.Context;
import com.umeng.analytics.pro.C3387i;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CoreProtocol implements UMLogDataProtocol {

    /* JADX INFO: renamed from: a */
    private static Context f18276a;

    /* JADX INFO: renamed from: com.umeng.analytics.CoreProtocol$a */
    public static class C3369a {

        /* JADX INFO: renamed from: a */
        private static final CoreProtocol f18277a = new CoreProtocol();

        private C3369a() {
        }
    }

    private CoreProtocol() {
    }

    public static CoreProtocol getInstance(Context context) {
        if (f18276a == null && context != null) {
            f18276a = context.getApplicationContext();
        }
        return C3369a.f18277a;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
        C3387i.m15520a(f18276a).m15545a(obj);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return C3387i.m15520a(f18276a).m15550b(j);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        C3387i.m15520a(f18276a).m15546a(obj, i);
    }
}
