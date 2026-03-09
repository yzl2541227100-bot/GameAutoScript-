package com.octopus.p222ad.internal;

import android.content.Context;
import android.text.TextUtils;
import com.octopus.p222ad.internal.utilities.HTTPGet;
import com.octopus.p222ad.internal.utilities.HTTPResponse;
import com.octopus.p222ad.internal.utilities.SPUtils;
import com.octopus.p222ad.utils.p258b.C3257h;
import com.octopus.p222ad.utils.p258b.C3261l;
import com.octopus.p222ad.utils.p258b.RunnableC3251b;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: renamed from: com.octopus.ad.internal.j */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC3117j extends HTTPGet {

    /* JADX INFO: renamed from: a */
    private final String f17150a;

    public AsyncTaskC3117j(String str) {
        super(false);
        this.f17150a = str;
    }

    @Override // com.octopus.p222ad.internal.utilities.HTTPGet
    public String getUrl() {
        return this.f17150a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.octopus.p222ad.internal.utilities.HTTPGet, android.os.AsyncTask
    public void onPostExecute(HTTPResponse hTTPResponse) {
        if (hTTPResponse == null || TextUtils.isEmpty(hTTPResponse.getResponseBody())) {
            return;
        }
        try {
            Context contextM14441g = C3120m.m14425a().m14441g();
            if (!MessageFormatter.DELIM_STR.equals(hTTPResponse.getResponseBody())) {
                SPUtils.put(contextM14441g, "responseBody", hTTPResponse.getResponseBody());
                C3257h.m14988b().m14991e().execute(new RunnableC3251b(contextM14441g));
            }
            SPUtils.put(contextM14441g, "lastReqTime", Long.valueOf(C3261l.m15005c()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
